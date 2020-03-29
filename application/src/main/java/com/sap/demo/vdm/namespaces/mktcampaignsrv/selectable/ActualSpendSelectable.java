/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.ActualSpendField ActualSpendField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.ActualSpendLink ActualSpendLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_PROGRAM_UUID MARKETING_PROGRAM_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_SPEND_ITEM_UUID MARKETING_SPEND_ITEM_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_SPEND_ITEM MARKETING_SPEND_ITEM}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_SPEND_ITEM_NAME MARKETING_SPEND_ITEM_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_SPEND_TYPE MARKETING_SPEND_TYPE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_SPEND_CALENDAR_YEAR MARKETING_SPEND_CALENDAR_YEAR}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_SPEND_CALENDAR_QUARTER MARKETING_SPEND_CALENDAR_QUARTER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MARKETING_SPEND_CALENDAR_MONTH MARKETING_SPEND_CALENDAR_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MKTG_SPEND_CALENDAR_MONTH_NAME MKTG_SPEND_CALENDAR_MONTH_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#ACTUAL_MKTG_SPEND_CRCY ACTUAL_MKTG_SPEND_CRCY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#ACTUAL_MKTG_SPEND_AMT ACTUAL_MKTG_SPEND_AMT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend#MKTG_COMMITMENT_AMT MKTG_COMMITMENT_AMT}</li>
 * </ul>
 * 
 */
public interface ActualSpendSelectable
    extends EntitySelectable<ActualSpend>
{


}
