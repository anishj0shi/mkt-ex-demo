package com.sap.demo.process;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CampaignProcess {
	
	private String mktCampaignId;
	private String tiktokCampaignId;
	private boolean isSuccessDataUploaded;

}
