/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit SpendHeaderTimeSplit}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendHeaderTimeSplitField SpendHeaderTimeSplitField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.SpendHeaderTimeSplitLink SpendHeaderTimeSplitLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#MARKETING_SPEND_HDR_TIME_SPLIT_UUID MARKETING_SPEND_HDR_TIME_SPLIT_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#MARKETING_SPEND_HEADER_UUID MARKETING_SPEND_HEADER_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#MARKETING_SPEND_CALENDAR_YEAR MARKETING_SPEND_CALENDAR_YEAR}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#MARKETING_SPEND_CALENDAR_QUARTER MARKETING_SPEND_CALENDAR_QUARTER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#MARKETING_SPEND_CALENDAR_MONTH MARKETING_SPEND_CALENDAR_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#MKTG_SPEND_CALENDAR_MONTH_NAME MKTG_SPEND_CALENDAR_MONTH_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#PLANNED_MKTG_SPEND_HEADER_AMT PLANNED_MKTG_SPEND_HEADER_AMT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit#PLANNED_MKTG_SPEND_HEADER_CRCY PLANNED_MKTG_SPEND_HEADER_CRCY}</li>
 * </ul>
 * 
 */
public interface SpendHeaderTimeSplitSelectable
    extends EntitySelectable<SpendHeaderTimeSplit>
{


}
