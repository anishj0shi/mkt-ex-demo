/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.InterestEntitySelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class InterestEntityByKeyFluentHelper
    extends FluentHelperByKey<InterestEntityByKeyFluentHelper, InterestEntity, InterestEntitySelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param campaignUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code InterestEntity}
     * @param interestItem
     *     Item of Interest<p>Constraints: Not nullable, Maximum length: 40</p>
     */
    public InterestEntityByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID campaignUUID, final String interestItem) {
        super(servicePath);
        this.key.put("CampaignUUID", campaignUUID);
        this.key.put("InterestItem", interestItem);
    }

    @Override
    @Nonnull
    protected Class<InterestEntity> getEntityClass() {
        return InterestEntity.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
