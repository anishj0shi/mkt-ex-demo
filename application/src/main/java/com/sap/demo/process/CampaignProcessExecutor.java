package com.sap.demo.process;

import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;

import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import com.sap.demo.vdm.services.APIMKTCMPGNSUCCESSIMPORTSRVService;
import com.sap.demo.vdm.services.DefaultAPIMKTCAMPAIGNSRVService;
import com.sap.demo.vdm.services.DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService;

public class CampaignProcessExecutor {
	final static Logger log = CloudLoggerFactory.getLogger(CampaignProcessExecutor.class);

	private ConcurrentHashMap<String, CampaignProcess> map = new ConcurrentHashMap<>();
	private APIMKTCAMPAIGNSRVService cpgService = new DefaultAPIMKTCAMPAIGNSRVService();
	private APIMKTCMPGNSUCCESSIMPORTSRVService successService = new DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService();

	private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	private static CampaignProcessExecutor instance = new CampaignProcessExecutor();

	private CampaignProcessExecutor() {
	}

	public static CampaignProcessExecutor getInstance() {
		return instance;
	}

	public void addProcess(CampaignProcess process) {
		this.map.put(process.getMktCampaignId(), process);
		log.info("=================================");
		log.info("Campaign Process Added, Size of Map: " + this.map.size());
		log.info("=================================");
	}

	public CampaignProcess getProcess(String campaignId) {
		return this.map.get(campaignId);
	}

	public void removeProcess(String campaignId) {
		this.map.remove(campaignId);
		log.info("=================================");
		log.info("Campaign Process Removed, Size of Map: " + this.map.size());
		log.info("=================================");
	}

	public Enumeration<String> getAllKeys() {
		return this.map.keys();
	}

	public void executeAsync() {
		scheduler.scheduleAtFixedRate(() -> {
			log.info("Polling Success Metrics...");
			if(!this.map.isEmpty()) {
				log.info("Entries Found for Execution, Processing Campaign..");
				this.map.forEachKey(1, (campaignId) -> {
					try {
						this.execute(campaignId);
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				log.info("Processing Finished....");
			}
			log.info("Iteration of polling Finished.");
		}, 1, 10, TimeUnit.SECONDS);

	}

	public void execute(String campaignId) throws Exception {
		Campaign campaign = getCampaignDetails(campaignId);
		uploadSuccessForCampaign(campaign);
		log.info("=================================");
		log.info("Campaign Process Executed Successfully... Removing Process From Executor");
		removeProcess(campaignId);

	}

	public Campaign getCampaignDetails(String campaignId) throws Exception {
		List<Campaign> campaignData = this.cpgService.getAllCampaign().filter(Campaign.CAMPAIGN_ID.eq(campaignId))
				.select(Campaign.CAMPAIGN_ID, Campaign.CAMPAIGN_UUID, Campaign.TO_CAMPAIGN_ASSIGNED_TARGET_GROUPS)
				.top(1).execute();

		log.info("=================================");
		log.info("Campaign Data Received: " + campaignData.get(0));
		log.info("=================================");

		return campaignData.get(0);
	}

	public void uploadSuccessForCampaign(Campaign campaign) throws Exception {
		Success success = Success.builder().campaignID(campaign.getCampaignID())
				.campaignUUID(campaign.getCampaignUUID()).numberOfImpressions(getRandomNumber(12))
				.numberOfClicks(getRandomNumber(4)).build();
		this.successService.createSuccess(success).execute();

	}
	
	private Long getRandomNumber(int max) {
		Random rnd = new Random();
		return Long.valueOf(rnd.nextInt(max) + 1);
	}

}
