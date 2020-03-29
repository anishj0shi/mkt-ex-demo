/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.CampaignField CampaignField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.CampaignLink CampaignLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_ID CAMPAIGN_ID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_NAME CAMPAIGN_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_DESCRIPTION CAMPAIGN_DESCRIPTION}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_SCHEDULE_DATE_TIME CAMPAIGN_SCHEDULE_DATE_TIME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_EXECUTION_FRQCY_INTERVAL CAMPAIGN_EXECUTION_FRQCY_INTERVAL}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_EXECUTION_FRQCY_UNIT CAMPAIGN_EXECUTION_FRQCY_UNIT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#MEDIA_TYPE MEDIA_TYPE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#MEDIA_TYPE_NAME MEDIA_TYPE_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_LIFECYCLE_STATUS CAMPAIGN_LIFECYCLE_STATUS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_LIFECYCLE_STATUS_NAME CAMPAIGN_LIFECYCLE_STATUS_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#COMMUNICATION_CATEGORY_UUID COMMUNICATION_CATEGORY_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#COMMUNICATION_CATEGORY_NAME COMMUNICATION_CATEGORY_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#MARKETING_PROGRAM_UUID MARKETING_PROGRAM_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#MARKETING_PROGRAM_NAME MARKETING_PROGRAM_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_PRIORITY CAMPAIGN_PRIORITY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_PRIORITY_NAME CAMPAIGN_PRIORITY_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#MARKETING_AREA MARKETING_AREA}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#MARKETING_AREA_NAME MARKETING_AREA_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_CATEGORY CAMPAIGN_CATEGORY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_CATEGORY_NAME CAMPAIGN_CATEGORY_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_START_DATE CAMPAIGN_START_DATE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_END_DATE CAMPAIGN_END_DATE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CREATION_DATE_TIME CREATION_DATE_TIME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#LAST_CHANGE_DATE_TIME LAST_CHANGE_DATE_TIME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_OWNER CAMPAIGN_OWNER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CAMPAIGN_OWNER_NAME CAMPAIGN_OWNER_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CREATED_BY_USER CREATED_BY_USER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#CREATED_BY_USER_NAME CREATED_BY_USER_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#LAST_CHANGE_BY_USER LAST_CHANGE_BY_USER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#LAST_CHANGE_BY_USER_NAME LAST_CHANGE_BY_USER_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#TO_CAMPAIGN_ASSIGNED_TARGET_GROUPS TO_CAMPAIGN_ASSIGNED_TARGET_GROUPS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#TO_CAMPAIGN_ASSIGNED_TEAM_MEMBERS TO_CAMPAIGN_ASSIGNED_TEAM_MEMBERS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#TO_CAMPAIGN_ACTUAL_SPEND TO_CAMPAIGN_ACTUAL_SPEND}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#TO_CAMPAIGN_SPEND_HEADER TO_CAMPAIGN_SPEND_HEADER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#TO_ASSIGNED_MARKETING_AGENCIES TO_ASSIGNED_MARKETING_AGENCIES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#TO_EXTERNAL_CAMPAIGN_REFERENCES TO_EXTERNAL_CAMPAIGN_REFERENCES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign#TO_CAMPAIGN_ASSIGNED_INTERESTS TO_CAMPAIGN_ASSIGNED_INTERESTS}</li>
 * </ul>
 * 
 */
public interface CampaignSelectable
    extends EntitySelectable<Campaign>
{


}
