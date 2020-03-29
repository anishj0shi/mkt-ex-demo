/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity}. This interface is used by {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.field.TargetGroupEntityField TargetGroupEntityField} and {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.link.TargetGroupEntityLink TargetGroupEntityLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_UUID TARGET_GROUP_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP TARGET_GROUP}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_NAME TARGET_GROUP_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_DESCRIPTION TARGET_GROUP_DESCRIPTION}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_LIFE_CYCLE_STATUS TARGET_GROUP_LIFE_CYCLE_STATUS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_MEMBER_COUNT TARGET_GROUP_MEMBER_COUNT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#CHANGED_ON_DATE_TIME CHANGED_ON_DATE_TIME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#LAST_CHANGED_BY_USER LAST_CHANGED_BY_USER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#CREATION_DATE_TIME CREATION_DATE_TIME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#CREATED_BY_USER CREATED_BY_USER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_MAIN_RESPONSIBLE TARGET_GROUP_MAIN_RESPONSIBLE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_MEMBER_TYPE TARGET_GROUP_MEMBER_TYPE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_MEMBER_TYPE_NAME TARGET_GROUP_MEMBER_TYPE_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_ORIGIN TARGET_GROUP_ORIGIN}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_ORIGIN_NAME TARGET_GROUP_ORIGIN_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#IS_TARGET_GROUP_VERSIONING_ACTIVE IS_TARGET_GROUP_VERSIONING_ACTIVE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_VERSION TARGET_GROUP_VERSION}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_LAST_REBUILD_DATE_TIME TARGET_GROUP_LAST_REBUILD_DATE_TIME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_CATEGORY TARGET_GROUP_CATEGORY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_CATEGORY_NAME TARGET_GROUP_CATEGORY_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_IS_CONTROL_GROUP TARGET_GROUP_IS_CONTROL_GROUP}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_CONTROL_GROUP TARGET_GROUP_CONTROL_GROUP}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#MARKETING_AREA MARKETING_AREA}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#MARKETING_AREA_NAME MARKETING_AREA_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#SEGMENTATION_OBJECT SEGMENTATION_OBJECT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#SEGMENTATION_OBJECT_NAME SEGMENTATION_OBJECT_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_TYPE TARGET_GROUP_TYPE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TARGET_GROUP_TYPE_NAME TARGET_GROUP_TYPE_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity#TO_TARGET_GROUP_INTERACTION_CONTACTS TO_TARGET_GROUP_INTERACTION_CONTACTS}</li>
 * </ul>
 * 
 */
public interface TargetGroupEntitySelectable
    extends EntitySelectable<TargetGroupEntity>
{


}
