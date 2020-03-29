/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity MarketingAgencyEntity}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.MarketingAgencyEntityField MarketingAgencyEntityField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.MarketingAgencyEntityLink MarketingAgencyEntityLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity#MARKETING_AGENCY_UUID MARKETING_AGENCY_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity#MARKETING_AGENCY MARKETING_AGENCY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity#MARKETING_AGENCY_NAME MARKETING_AGENCY_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity#EMAIL_ADDRESS EMAIL_ADDRESS}</li>
 * </ul>
 * 
 */
public interface MarketingAgencyEntitySelectable
    extends EntitySelectable<MarketingAgencyEntity>
{


}
