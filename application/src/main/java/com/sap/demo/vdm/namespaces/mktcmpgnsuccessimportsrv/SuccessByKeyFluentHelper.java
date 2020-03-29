/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.selectable.SuccessSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SuccessByKeyFluentHelper
    extends FluentHelperByKey<SuccessByKeyFluentHelper, Success, SuccessSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code Success}
     * @param campaignSuccessUUID
     *     A unique key for campaign success data.<p>Constraints: Not nullable</p>
     */
    public SuccessByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID campaignSuccessUUID) {
        super(servicePath);
        this.key.put("CampaignSuccessUUID", campaignSuccessUUID);
    }

    @Override
    @Nonnull
    protected Class<Success> getEntityClass() {
        return Success.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
