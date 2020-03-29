package com.sap.demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Builder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "d" })
@Data
@Builder
public class CreateExCampaign {

	@JsonProperty("d")
	public D d;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({ "ServerCampaignId", "ServerCampaignUrl", "MainKPI", "SuccessDataEndDate" })
	@Data
	@Builder
	public static class D {

		@JsonProperty("ServerCampaignId")
		public String serverCampaignId;
		@JsonProperty("ServerCampaignUrl")
		public String serverCampaignUrl;
		@JsonProperty("MainKPI")
		public String mainKPI;
		@JsonProperty("SuccessDataEndDate")
		public String successDataEndDate;

	}

}