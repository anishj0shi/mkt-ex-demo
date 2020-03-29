/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
import javax.inject.Named;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.RebuildTargetGroupFluentHelper;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntityByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntityCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntityFluentHelper;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntityByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntityCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntityFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_MKT_TARGET_GROUP_SRV</td></tr></table>
 * 
 */
@Named("com.sap.demo.vdm.services.DefaultAPIMKTTARGETGROUPSRVService")
public class DefaultAPIMKTTARGETGROUPSRVService
    implements APIMKTTARGETGROUPSRVService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link APIMKTTARGETGROUPSRVService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultAPIMKTTARGETGROUPSRVService() {
        servicePath = APIMKTTARGETGROUPSRVService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultAPIMKTTARGETGROUPSRVService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultAPIMKTTARGETGROUPSRVService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultAPIMKTTARGETGROUPSRVService(servicePath);
    }

    @Override
    @Nonnull
    public TargetGroupEntityFluentHelper getAllTargetGroupEntity() {
        return new TargetGroupEntityFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public TargetGroupEntityByKeyFluentHelper getTargetGroupEntityByKey(final UUID targetGroupUUID) {
        return new TargetGroupEntityByKeyFluentHelper(servicePath, targetGroupUUID);
    }

    @Override
    @Nonnull
    public TargetGroupEntityCreateFluentHelper createTargetGroupEntity(
        @Nonnull
        final TargetGroupEntity targetGroupEntity) {
        return new TargetGroupEntityCreateFluentHelper(servicePath, targetGroupEntity);
    }

    @Override
    @Nonnull
    public TargetGroupInteractionContactEntityFluentHelper getAllTargetGroupInteractionContactEntity() {
        return new TargetGroupInteractionContactEntityFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public TargetGroupInteractionContactEntityByKeyFluentHelper getTargetGroupInteractionContactEntityByKey(final UUID targetGroupMemberUUID) {
        return new TargetGroupInteractionContactEntityByKeyFluentHelper(servicePath, targetGroupMemberUUID);
    }

    @Override
    @Nonnull
    public TargetGroupInteractionContactEntityCreateFluentHelper createTargetGroupInteractionContactEntity(
        @Nonnull
        final TargetGroupInteractionContactEntity targetGroupInteractionContactEntity) {
        return new TargetGroupInteractionContactEntityCreateFluentHelper(servicePath, targetGroupInteractionContactEntity);
    }

    @Override
    @Nonnull
    public RebuildTargetGroupFluentHelper rebuildTargetGroup(final UUID targetGroupUUID) {
        return new RebuildTargetGroupFluentHelper(servicePath, targetGroupUUID);
    }

}
