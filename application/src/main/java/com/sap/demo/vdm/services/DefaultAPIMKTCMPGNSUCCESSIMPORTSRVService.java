/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
import javax.inject.Named;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.SuccessByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.SuccessCreateFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_MKT_CMPGN_SUCCESS_IMPORT_SRV</td></tr></table>
 * 
 */
@Named("com.sap.demo.vdm.services.DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService")
public class DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService
    implements APIMKTCMPGNSUCCESSIMPORTSRVService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link APIMKTCMPGNSUCCESSIMPORTSRVService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService() {
        servicePath = APIMKTCMPGNSUCCESSIMPORTSRVService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultAPIMKTCMPGNSUCCESSIMPORTSRVService(servicePath);
    }

    @Override
    @Nonnull
    public SuccessByKeyFluentHelper getSuccessByKey(final UUID campaignSuccessUUID) {
        return new SuccessByKeyFluentHelper(servicePath, campaignSuccessUUID);
    }

    @Override
    @Nonnull
    public SuccessCreateFluentHelper createSuccess(
        @Nonnull
        final Success success) {
        return new SuccessCreateFluentHelper(servicePath, success);
    }

}
