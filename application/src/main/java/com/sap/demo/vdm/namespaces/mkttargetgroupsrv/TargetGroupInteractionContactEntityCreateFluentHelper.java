/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class TargetGroupInteractionContactEntityCreateFluentHelper
    extends FluentHelperCreate<TargetGroupInteractionContactEntityCreateFluentHelper, TargetGroupInteractionContactEntity>
{

    /**
     * {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity object that will be created in the S/4HANA system.
     * 
     */
    private final TargetGroupInteractionContactEntity entity;

    /**
     * Creates a fluent helper object that will create a {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The TargetGroupInteractionContactEntity to create.
     */
    public TargetGroupInteractionContactEntityCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final TargetGroupInteractionContactEntity entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected TargetGroupInteractionContactEntity getEntity() {
        return entity;
    }

}
