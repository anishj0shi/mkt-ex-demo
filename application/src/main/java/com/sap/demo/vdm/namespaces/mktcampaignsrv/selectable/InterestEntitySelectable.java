/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.InterestEntityField InterestEntityField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.InterestEntityLink InterestEntityLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity#INTEREST_ITEM INTEREST_ITEM}</li>
 * </ul>
 * 
 */
public interface InterestEntitySelectable
    extends EntitySelectable<InterestEntity>
{


}
