/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class AssignedTargetGroupEntityDeleteFluentHelper
    extends FluentHelperDelete<AssignedTargetGroupEntityDeleteFluentHelper, AssignedTargetGroupEntity>
{

    /**
     * {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final AssignedTargetGroupEntity entity;

    /**
     * Creates a fluent helper object that will delete a {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The AssignedTargetGroupEntity to delete from the endpoint.
     */
    public AssignedTargetGroupEntityDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final AssignedTargetGroupEntity entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected AssignedTargetGroupEntity getEntity() {
        return entity;
    }

}
