package com.sap.demo.controllers;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import com.sap.demo.models.CreateExCampaign;
import com.sap.demo.models.CreateExCampaign.D;
import com.sap.demo.models.CreateTikTokCampaign;
import com.sap.demo.process.CampaignProcess;
import com.sap.demo.process.CampaignProcessExecutor;
import com.sap.demo.tiktok.TikTokCampaign;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

	@Autowired
	TikTokCampaign tiktokCampaign;

	private static final Logger logger = CloudLoggerFactory.getLogger(CampaignController.class);

	@RequestMapping(path = "/createCampaign", method = RequestMethod.POST)
	public ResponseEntity<CreateExCampaign> createCampaign(HttpServletRequest request) throws Exception {

		InputStream istream = request.getInputStream();

		String reqBody = IOUtils.toString(istream, StandardCharsets.UTF_8);
		logger.info("====================Received Request======================");
		logger.info(reqBody);
		logger.info("====================Received Request======================");

		Map<String, Object> map = new ObjectMapper().readValue(reqBody, new TypeReference<HashMap<String, Object>>() {
		});

		CreateTikTokCampaign tiktokCpg = tiktokCampaign.createTikTokCampaign((String) map.get("CampaignName"));

		CampaignProcess cpgProcess = CampaignProcess.builder().mktCampaignId((String) map.get("ClientCampaignId"))
				.tiktokCampaignId(String.valueOf(tiktokCpg.data.campaignId)).isSuccessDataUploaded(false).build();

		CampaignProcessExecutor.getInstance().addProcess(cpgProcess);

		return ResponseEntity.ok(CreateExCampaign.builder()
				.d(D.builder().mainKPI("CLICKS").serverCampaignId(String.valueOf(tiktokCpg.data.campaignId))
						.serverCampaignUrl("https://ads.tiktok.com/i18n/perf/campaign?aadvid=6807494309407883270")
						.successDataEndDate((String) map.get("EndDate")).build())
				.build());

	}

	@RequestMapping(path = "/execute", method = RequestMethod.GET)
	public ResponseEntity<?> executeCampaign(@RequestParam(name = "campaignId", required = true) String campaignId)
			throws Exception {
		CampaignProcessExecutor.getInstance().execute(campaignId);

		return ResponseEntity.ok().body("Uploaded Success Data.. ");
	}

}
