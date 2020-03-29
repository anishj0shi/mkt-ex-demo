package com.sap.demo.token;

public class TiktokTokens {

	protected volatile String accessToken;

	protected volatile String refreshToken;

	private static TiktokTokens instance = new TiktokTokens();

	private TiktokTokens() {
		this.accessToken = "";
		this.refreshToken = "";
	}

	public static TiktokTokens getInstance() {
		return instance;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public synchronized void setAccessToken(String token) {
		this.accessToken = token;
	}

	public synchronized void setRefreshToken(String token) {
		this.refreshToken = token;
	}

}
