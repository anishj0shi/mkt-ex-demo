/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.TeamMemberEntitySelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class TeamMemberEntityByKeyFluentHelper
    extends FluentHelperByKey<TeamMemberEntityByKeyFluentHelper, TeamMemberEntity, TeamMemberEntitySelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param campaignUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code TeamMemberEntity}
     * @param teamMemberName
     *     User Name in User Master Record<p>Constraints: Not nullable, Maximum length: 12</p>
     */
    public TeamMemberEntityByKeyFluentHelper(
        @Nonnull
        final String servicePath, final UUID campaignUUID, final String teamMemberName) {
        super(servicePath);
        this.key.put("CampaignUUID", campaignUUID);
        this.key.put("TeamMemberName", teamMemberName);
    }

    @Override
    @Nonnull
    protected Class<TeamMemberEntity> getEntityClass() {
        return TeamMemberEntity.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
