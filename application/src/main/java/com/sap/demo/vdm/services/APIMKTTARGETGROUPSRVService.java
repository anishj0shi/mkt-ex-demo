/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
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
public interface APIMKTTARGETGROUPSRVService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "/sap/opu/odata/sap/API_MKT_TARGET_GROUP_SRV";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    APIMKTTARGETGROUPSRVService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntityFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TargetGroupEntityFluentHelper getAllTargetGroupEntity();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entity using key fields.
     * 
     * @param targetGroupUUID
     *     The API UUID indentifies a specific entity type instance.<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntityByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TargetGroupEntityByKeyFluentHelper getTargetGroupEntityByKey(final UUID targetGroupUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entity and save it to the S/4HANA system.
     * 
     * @param targetGroupEntity
     *     {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntityCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TargetGroupEntityCreateFluentHelper createTargetGroupEntity(
        @Nonnull
        final TargetGroupEntity targetGroupEntity);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntityFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TargetGroupInteractionContactEntityFluentHelper getAllTargetGroupInteractionContactEntity();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity using key fields.
     * 
     * @param targetGroupMemberUUID
     *     The API UUID indentifies a specific entity type instance.<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntityByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TargetGroupInteractionContactEntityByKeyFluentHelper getTargetGroupInteractionContactEntityByKey(final UUID targetGroupMemberUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity and save it to the S/4HANA system.
     * 
     * @param targetGroupInteractionContactEntity
     *     {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntityCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TargetGroupInteractionContactEntityCreateFluentHelper createTargetGroupInteractionContactEntity(
        @Nonnull
        final TargetGroupInteractionContactEntity targetGroupInteractionContactEntity);

    /**
     * <p>Creates a fluent helper for the <b>RebuildTargetGroup</b> OData function import.</p>
     * 
     * @param targetGroupUUID
     *     UUID<p></p><p>Constraints: none</p><p>Original parameter name from the Odata EDM: <b>TargetGroupUUID</b></p>
     * @return
     *     A fluent helper object that will execute the <b>RebuildTargetGroup</b> OData function import with the provided parameters. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.RebuildTargetGroupFluentHelper#execute execute} method on the fluent helper object.
     */
    @Nonnull
    RebuildTargetGroupFluentHelper rebuildTargetGroup(final UUID targetGroupUUID);

}
