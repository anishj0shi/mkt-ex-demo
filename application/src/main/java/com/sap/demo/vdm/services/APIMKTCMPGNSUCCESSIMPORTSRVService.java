/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.SuccessByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.SuccessCreateFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_MKT_CMPGN_SUCCESS_IMPORT_SRV</td></tr></table>
 * 
 */
public interface APIMKTCMPGNSUCCESSIMPORTSRVService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "/sap/opu/odata/sap/API_MKT_CMPGN_SUCCESS_IMPORT_SRV";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    APIMKTCMPGNSUCCESSIMPORTSRVService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success} entity using key fields.
     * 
     * @param campaignSuccessUUID
     *     A unique key for campaign success data.<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.SuccessByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SuccessByKeyFluentHelper getSuccessByKey(final UUID campaignSuccessUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success} entity and save it to the S/4HANA system.
     * 
     * @param success
     *     {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.SuccessCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SuccessCreateFluentHelper createSuccess(
        @Nonnull
        final Success success);

}
