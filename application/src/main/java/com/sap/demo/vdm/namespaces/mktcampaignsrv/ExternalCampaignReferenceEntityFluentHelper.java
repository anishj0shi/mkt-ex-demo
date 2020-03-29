/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.ExternalCampaignReferenceEntitySelectable;


/**
 * Fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity ExternalCampaignReferenceEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ExternalCampaignReferenceEntityFluentHelper
    extends FluentHelperRead<ExternalCampaignReferenceEntityFluentHelper, ExternalCampaignReferenceEntity, ExternalCampaignReferenceEntitySelectable>
{


    /**
     * Creates a fluent helper using the specified service path to send the read requests.
     * 
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public ExternalCampaignReferenceEntityFluentHelper(
        @Nonnull
        final String servicePath) {
        super(servicePath);
    }

    @Override
    @Nonnull
    protected Class<ExternalCampaignReferenceEntity> getEntityClass() {
        return ExternalCampaignReferenceEntity.class;
    }

}
