/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity}. This interface is used by {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.field.TargetGroupInteractionContactEntityField TargetGroupInteractionContactEntityField} and {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.link.TargetGroupInteractionContactEntityLink TargetGroupInteractionContactEntityLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity#TARGET_GROUP_MEMBER_UUID TARGET_GROUP_MEMBER_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity#INTERACTION_CONTACT_UUID INTERACTION_CONTACT_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity#TARGET_GROUP_UUID TARGET_GROUP_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity#INTERACTION_CONTACT_ID INTERACTION_CONTACT_ID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity#INTERACTION_CONTACT_ORIGIN INTERACTION_CONTACT_ORIGIN}</li>
 * </ul>
 * 
 */
public interface TargetGroupInteractionContactEntitySelectable
    extends EntitySelectable<TargetGroupInteractionContactEntity>
{


}
