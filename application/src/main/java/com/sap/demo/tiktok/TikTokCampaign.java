package com.sap.demo.tiktok;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import com.sap.demo.models.CreateTikTokCampaign;
import com.sap.demo.token.TiktokTokens;

@Component
public class TikTokCampaign {

	public static final String ADVERTISER_ID = "6807494309407883270";
	
	final static Logger log = CloudLoggerFactory.getLogger(TikTokCampaign.class);

	public CreateTikTokCampaign createTikTokCampaign(String campaignName) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		String token = TiktokTokens.getInstance().getAccessToken();

		URI uri = new URIBuilder("https://ads.tiktok.com/open_api/2/campaign/create/")
				.addParameters(getParamsForCreateCampaign(campaignName)).build();
		
		HttpPost request = new HttpPost(uri);
		request.setHeader("Access-Token", token);
		
		HttpResponse response = client.execute(request);
		String res = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8);
		log.info("================================");
		log.info("REceivedCreate Campaign REsponse Body: " + res);
		log.info("================================");

		if (response.getStatusLine().getStatusCode() == 200) {
			CreateTikTokCampaign resp = new ObjectMapper().readValue(res, CreateTikTokCampaign.class);
			return resp;

		} else {
			throw new RuntimeException("Unable to Create Tiktok Campaign");
		}

	}

	private List<NameValuePair> getParamsForCreateCampaign(String campaignName) {
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("advertiser_id", ADVERTISER_ID));
		list.add(new BasicNameValuePair("campaign_name", campaignName));
		list.add(new BasicNameValuePair("objective_type", "TRAFFIC"));
		list.add(new BasicNameValuePair("budget_mode", "BUDGET_MODE_DAY"));
		list.add(new BasicNameValuePair("budget", "5000"));
		
		return list;
	}
	

}
