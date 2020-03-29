/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendItemField SpendItemField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.SpendItemLink SpendItemLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_ITEM_UUID MARKETING_SPEND_ITEM_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_HEADER_UUID MARKETING_SPEND_HEADER_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_ITEM MARKETING_SPEND_ITEM}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_ITEM_NAME MARKETING_SPEND_ITEM_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_TYPE MARKETING_SPEND_TYPE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_TYPE_NAME MARKETING_SPEND_TYPE_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_PERIOD_START_YEAR MARKETING_SPEND_PERIOD_START_YEAR}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_PERIOD_START_MONTH MARKETING_SPEND_PERIOD_START_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MKTG_SPEND_PERIOD_START_MONTH_NAME MKTG_SPEND_PERIOD_START_MONTH_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_PERIOD_END_YEAR MARKETING_SPEND_PERIOD_END_YEAR}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MARKETING_SPEND_PERIOD_END_MONTH MARKETING_SPEND_PERIOD_END_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#MKTG_SPEND_PERIOD_END_MONTH_NAME MKTG_SPEND_PERIOD_END_MONTH_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem#TO_ITEM_TIME_SPLIT TO_ITEM_TIME_SPLIT}</li>
 * </ul>
 * 
 */
public interface SpendItemSelectable
    extends EntitySelectable<SpendItem>
{


}
