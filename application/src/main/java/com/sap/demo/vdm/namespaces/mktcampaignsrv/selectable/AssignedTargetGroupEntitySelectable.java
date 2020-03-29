/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.AssignedTargetGroupEntityField AssignedTargetGroupEntityField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.AssignedTargetGroupEntityLink AssignedTargetGroupEntityLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity#TARGET_GROUP TARGET_GROUP}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity#TARGET_GROUP_UUID TARGET_GROUP_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * </ul>
 * 
 */
public interface AssignedTargetGroupEntitySelectable
    extends EntitySelectable<AssignedTargetGroupEntity>
{


}
