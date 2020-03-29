/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.ActualSpendSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ActualSpendByKeyFluentHelper
    extends FluentHelperByKey<ActualSpendByKeyFluentHelper, ActualSpend, ActualSpendSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param campaignUUID
     *     Campaign UUID for API-service<p>Constraints: Not nullable</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code ActualSpend}
     */
    public ActualSpendByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID campaignUUID) {
        super(servicePath);
        this.key.put("CampaignUUID", campaignUUID);
    }

    @Override
    @Nonnull
    protected Class<ActualSpend> getEntityClass() {
        return ActualSpend.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
