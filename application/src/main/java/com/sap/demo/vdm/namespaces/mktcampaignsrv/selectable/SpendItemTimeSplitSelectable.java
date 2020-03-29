/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendItemTimeSplitField SpendItemTimeSplitField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.SpendItemTimeSplitLink SpendItemTimeSplitLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#MARKETING_SPEND_ITM_TIME_SPLIT_UUID MARKETING_SPEND_ITM_TIME_SPLIT_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#MARKETING_SPEND_ITEM_UUID MARKETING_SPEND_ITEM_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#MARKETING_SPEND_CALENDAR_YEAR MARKETING_SPEND_CALENDAR_YEAR}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#MARKETING_SPEND_CALENDAR_QUARTER MARKETING_SPEND_CALENDAR_QUARTER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#MARKETING_SPEND_CALENDAR_MONTH MARKETING_SPEND_CALENDAR_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#MKTG_SPEND_CALENDAR_MONTH_NAME MKTG_SPEND_CALENDAR_MONTH_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#PLANNED_MKTG_SPEND_AMT PLANNED_MKTG_SPEND_AMT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit#PLANNED_MKTG_SPEND_CRCY PLANNED_MKTG_SPEND_CRCY}</li>
 * </ul>
 * 
 */
public interface SpendItemTimeSplitSelectable
    extends EntitySelectable<SpendItemTimeSplit>
{


}
