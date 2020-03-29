/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable.TargetGroupInteractionContactEntitySelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class TargetGroupInteractionContactEntityByKeyFluentHelper
    extends FluentHelperByKey<TargetGroupInteractionContactEntityByKeyFluentHelper, TargetGroupInteractionContactEntity, TargetGroupInteractionContactEntitySelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code TargetGroupInteractionContactEntity}
     * @param targetGroupMemberUUID
     *     The API UUID indentifies a specific entity type instance.<p>Constraints: Not nullable</p>
     */
    public TargetGroupInteractionContactEntityByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID targetGroupMemberUUID) {
        super(servicePath);
        this.key.put("TargetGroupMemberUUID", targetGroupMemberUUID);
    }

    @Override
    @Nonnull
    protected Class<TargetGroupInteractionContactEntity> getEntityClass() {
        return TargetGroupInteractionContactEntity.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
