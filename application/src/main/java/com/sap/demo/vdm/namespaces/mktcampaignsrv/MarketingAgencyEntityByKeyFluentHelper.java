/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.MarketingAgencyEntitySelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity MarketingAgencyEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class MarketingAgencyEntityByKeyFluentHelper
    extends FluentHelperByKey<MarketingAgencyEntityByKeyFluentHelper, MarketingAgencyEntity, MarketingAgencyEntitySelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity MarketingAgencyEntity} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param campaignUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code MarketingAgencyEntity}
     * @param marketingAgencyUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     */
    public MarketingAgencyEntityByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID campaignUUID, final UUID marketingAgencyUUID) {
        super(servicePath);
        this.key.put("CampaignUUID", campaignUUID);
        this.key.put("MarketingAgencyUUID", marketingAgencyUUID);
    }

    @Override
    @Nonnull
    protected Class<MarketingAgencyEntity> getEntityClass() {
        return MarketingAgencyEntity.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
