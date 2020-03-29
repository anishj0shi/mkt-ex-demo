/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable.TargetGroupEntitySelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class TargetGroupEntityByKeyFluentHelper
    extends FluentHelperByKey<TargetGroupEntityByKeyFluentHelper, TargetGroupEntity, TargetGroupEntitySelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code TargetGroupEntity}
     * @param targetGroupUUID
     *     The API UUID indentifies a specific entity type instance.<p>Constraints: Not nullable</p>
     */
    public TargetGroupEntityByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID targetGroupUUID) {
        super(servicePath);
        this.key.put("TargetGroupUUID", targetGroupUUID);
    }

    @Override
    @Nonnull
    protected Class<TargetGroupEntity> getEntityClass() {
        return TargetGroupEntity.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
