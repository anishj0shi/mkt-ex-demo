/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class SpendItemUpdateFluentHelper
    extends FluentHelperUpdate<SpendItemUpdateFluentHelper, SpendItem>
{

    /**
     * {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final SpendItem entity;

    /**
     * Creates a fluent helper object that will update a {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The SpendItem to take the updated values from.
     */
    public SpendItemUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final SpendItem entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected SpendItem getEntity() {
        return entity;
    }

}
