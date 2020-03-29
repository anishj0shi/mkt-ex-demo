package com.sap.demo;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

import org.apache.http.client.HttpClient;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import com.sap.demo.models.TikTokTokenResponse;
import com.sap.demo.token.TiktokTokens;

@Component
public class DemoListener implements ApplicationListener<ContextRefreshedEvent> {

	final static Logger log = CloudLoggerFactory.getLogger(DemoListener.class);

	final String APPID = "1661926856283141";
	final String SECRET = "023849da331e7cb9ab73ce552a85aeee00d83984";
	final String GRANT_TYPE = "auth_code";

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("==============Application Started==============");

		log.info("==============AUTH CODE==============");
		String authCode = System.getenv("AUTH_CODE");
		log.info(authCode);
		log.info("==============AUTH CODE==============");

		getTikTokToken(authCode);

		log.info("================================");
		log.info("Initial Token : " + TiktokTokens.getInstance().getAccessToken());
		log.info("================================");
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

		scheduler.scheduleAtFixedRate(() -> {
			log.info("================================");
			log.info("Refresh Token in ENV: " + TiktokTokens.getInstance().getRefreshToken());
			log.info("================================");

			refreshTikTokToken(TiktokTokens.getInstance().getRefreshToken());

		}, 10, 45000, TimeUnit.SECONDS);

	}

	public void getTikTokToken(String authCode) {
		HttpClient client;
		try {
			client = HttpClientBuilder.create().build();

			URI uri = new URIBuilder("https://ads.tiktok.com/open_api/oauth2/access_token/")
					.addParameters(getParamsForGetToken(authCode)).build();

			HttpPost post = new HttpPost(uri);

			HttpResponse response = client.execute(post);

			String res = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8);
			log.info("================================");
			log.info("REceived Get Token REsponse Body: " + res);
			log.info("================================");

			if (response.getStatusLine().getStatusCode() == 200) {
				TikTokTokenResponse resp = new ObjectMapper().readValue(res, TikTokTokenResponse.class);
				log.info("================================");
				log.info("REceived Refresh Token Message: " + resp.message);
				log.info("================================");
				TiktokTokens.getInstance().setAccessToken(resp.data.accessToken);
				TiktokTokens.getInstance().setRefreshToken(resp.data.refreshToken);
			} else {
				throw new RuntimeException("Error received from TikTok in Token Retrieval");
			}

		} catch (Exception e) {
			log.error("Unable to Create TiktokClient");
			e.printStackTrace();
		}

	}

	public void refreshTikTokToken(String token) {
		HttpClient client;
		try {
			client = HttpClientBuilder.create().build();

			URI uri = new URIBuilder("https://ads.tiktok.com/open_api/oauth2/refresh_token/")
					.addParameters(getParamsForRefreshToken(token)).build();

			HttpPost post = new HttpPost(uri);

			HttpResponse response = client.execute(post);

			String res = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8);
			log.info("================================");
			log.info("REceived Refresh Token REsponse Body: " + res);
			log.info("================================");

			if (response.getStatusLine().getStatusCode() == 200) {
				TikTokTokenResponse resp = new ObjectMapper().readValue(res, TikTokTokenResponse.class);
				log.info("================================");
				log.info("REceived Refresh Token Message: " + resp.message);
				log.info("================================");
				TiktokTokens.getInstance().setAccessToken(resp.data.accessToken);
				TiktokTokens.getInstance().setRefreshToken(resp.data.refreshToken);
			} else {
				throw new RuntimeException("Error received from TikTok in Token Retrieval");
			}

		} catch (Exception e) {
			log.error("Unable to Create TiktokClient");
			e.printStackTrace();

		}

	}

	private List<NameValuePair> getParamsForGetToken(String authCode) {
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("app_id", APPID));
		list.add(new BasicNameValuePair("secret", SECRET));
		list.add(new BasicNameValuePair("grant_type", GRANT_TYPE));
		list.add(new BasicNameValuePair("auth_code", authCode));

		return list;
	}

	private List<NameValuePair> getParamsForRefreshToken(String token) {
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("app_id", APPID));
		list.add(new BasicNameValuePair("secret", SECRET));
		list.add(new BasicNameValuePair("grant_type", "refresh_token"));
		list.add(new BasicNameValuePair("refresh_token", token));

		return list;
	}

}
