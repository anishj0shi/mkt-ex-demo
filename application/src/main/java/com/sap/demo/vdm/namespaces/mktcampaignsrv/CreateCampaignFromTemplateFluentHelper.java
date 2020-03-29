/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.net.URI;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperFunction;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * Fluent helper for the <b>CreateCampaignFromTemplate</b> OData function import.
 * 
 */
public class CreateCampaignFromTemplateFluentHelper
    extends FluentHelperFunction<CreateCampaignFromTemplateFluentHelper, Campaign, Campaign>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>CreateCampaignFromTemplate</b> OData function import with the provided parameters. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param templateID
     *     Constraints: Not nullable, Maximum length: 10<p>Original parameter name from the Odata EDM: <b>TemplateID</b></p>
     * @param campaignName
     *     Constraints: Not nullable, Maximum length: 40<p>Original parameter name from the Odata EDM: <b>CampaignName</b></p>
     */
    public CreateCampaignFromTemplateFluentHelper(
        @Nonnull
        final String servicePath, final String templateID, final String campaignName) {
        super(servicePath);
        values.put("TemplateID", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(templateID));
        values.put("CampaignName", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(campaignName));
    }

    @Override
    @Nonnull
    protected Class<Campaign> getEntityClass() {
        return Campaign.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "CreateCampaignFromTemplate";
    }

    @Override
    @Nonnull
    protected Map<String, Object> getParameters() {
        return values;
    }

    @Override
    @Nonnull
    protected HttpUriRequest createRequest(
        @Nonnull
        final URI uri) {
        return new HttpPost(uri);
    }

    @Override
    @Nullable
    public Campaign execute(
        @Nonnull
        final ErpConfigContext configContext)
        throws ODataException
    {
        return super.executeSingle(configContext);
    }

}
