package com.sap.demo.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "message", "code", "data", "request_id" })
public class TikTokTokenResponse {

	@JsonProperty("message")
	public String message;
	@JsonProperty("code")
	public Integer code;
	@JsonProperty("data")
	public Data data;
	@JsonProperty("request_id")
	public String requestId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({ "advertiser_id", "advertiser_name", "access_token", "refresh_token_expires_in",
			"advertiser_ids", "expires_in", "refresh_token" })
	public static class Data {

		@JsonProperty("advertiser_id")
		public Integer advertiserId;
		@JsonProperty("advertiser_name")
		public String advertiserName;
		@JsonProperty("access_token")
		public String accessToken;
		@JsonProperty("refresh_token_expires_in")
		public Integer refreshTokenExpiresIn;
		@JsonProperty("advertiser_ids")
		public List<Object> advertiserIds = null;
		@JsonProperty("expires_in")
		public Integer expiresIn;
		@JsonProperty("refresh_token")
		public String refreshToken;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonAnyGetter
		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		@JsonAnySetter
		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

	}

}