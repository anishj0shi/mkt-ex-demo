/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendHeaderField SpendHeaderField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.SpendHeaderLink SpendHeaderLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MARKETING_SPEND_HEADER_UUID MARKETING_SPEND_HEADER_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MARKETING_SPEND_STATUS MARKETING_SPEND_STATUS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#PLANNED_MKTG_SPEND_IS_DETAILED PLANNED_MKTG_SPEND_IS_DETAILED}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MARKETING_SPEND_PERIOD_START_YEAR MARKETING_SPEND_PERIOD_START_YEAR}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MARKETING_SPEND_PERIOD_START_MONTH MARKETING_SPEND_PERIOD_START_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MKTG_SPEND_PERIOD_START_MONTH_NAME MKTG_SPEND_PERIOD_START_MONTH_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MARKETING_SPEND_PERIOD_END_YEAR MARKETING_SPEND_PERIOD_END_YEAR}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MARKETING_SPEND_PERIOD_END_MONTH MARKETING_SPEND_PERIOD_END_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#MKTG_SPEND_PERIOD_END_MONTH_NAME MKTG_SPEND_PERIOD_END_MONTH_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#PLANNED_MKTG_SPEND_HEADER_AMT PLANNED_MKTG_SPEND_HEADER_AMT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#PLANNED_MKTG_SPEND_HEADER_CRCY PLANNED_MKTG_SPEND_HEADER_CRCY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#TO_ITEM TO_ITEM}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader#TO_HEADER_TIME_SPLIT TO_HEADER_TIME_SPLIT}</li>
 * </ul>
 * 
 */
public interface SpendHeaderSelectable
    extends EntitySelectable<SpendHeader>
{


}
