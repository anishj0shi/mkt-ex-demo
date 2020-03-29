/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity ExternalCampaignReferenceEntity}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.ExternalCampaignReferenceEntityField ExternalCampaignReferenceEntityField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.ExternalCampaignReferenceEntityLink ExternalCampaignReferenceEntityLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#EXTERNAL_CAMPAIGN_UUID EXTERNAL_CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#EXTERNAL_CAMPAIGN_ID EXTERNAL_CAMPAIGN_ID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#EXTERNAL_CAMPAIGN_NAME EXTERNAL_CAMPAIGN_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#EXTERNAL_CAMPAIGN_URL EXTERNAL_CAMPAIGN_URL}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#ADVERTISER ADVERTISER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#ADVERTISER_NAME ADVERTISER_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#EXTERNAL_CMPGN_MANAGING_PARTY EXTERNAL_CMPGN_MANAGING_PARTY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity#EXTERNAL_CMPGN_MANAGING_PARTY_NAME EXTERNAL_CMPGN_MANAGING_PARTY_NAME}</li>
 * </ul>
 * 
 */
public interface ExternalCampaignReferenceEntitySelectable
    extends EntitySelectable<ExternalCampaignReferenceEntity>
{


}
