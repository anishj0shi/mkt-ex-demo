/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class InterestEntityDeleteFluentHelper
    extends FluentHelperDelete<InterestEntityDeleteFluentHelper, InterestEntity>
{

    /**
     * {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final InterestEntity entity;

    /**
     * Creates a fluent helper object that will delete a {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The InterestEntity to delete from the endpoint.
     */
    public InterestEntityDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final InterestEntity entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected InterestEntity getEntity() {
        return entity;
    }

}
