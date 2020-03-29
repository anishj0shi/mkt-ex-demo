/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CampaignUpdateFluentHelper
    extends FluentHelperUpdate<CampaignUpdateFluentHelper, Campaign>
{

    /**
     * {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final Campaign entity;

    /**
     * Creates a fluent helper object that will update a {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The Campaign to take the updated values from.
     */
    public CampaignUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final Campaign entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected Campaign getEntity() {
        return entity;
    }

}
