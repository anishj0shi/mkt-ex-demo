/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv;

import java.net.URI;
import java.util.Map;
import java.util.UUID;
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
 * Fluent helper for the <b>RebuildTargetGroup</b> OData function import.
 * 
 */
public class RebuildTargetGroupFluentHelper
    extends FluentHelperFunction<RebuildTargetGroupFluentHelper, TextCT, TextCT>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>RebuildTargetGroup</b> OData function import with the provided parameters. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param targetGroupUUID
     *     UUID<p></p><p>Constraints: none</p><p>Original parameter name from the Odata EDM: <b>TargetGroupUUID</b></p>
     */
    public RebuildTargetGroupFluentHelper(
        @Nonnull
        final String servicePath, final UUID targetGroupUUID) {
        super(servicePath);
        values.put("TargetGroupUUID", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(targetGroupUUID));
    }

    @Override
    @Nonnull
    protected Class<TextCT> getEntityClass() {
        return TextCT.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "RebuildTargetGroup";
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
    public TextCT execute(
        @Nonnull
        final ErpConfigContext configContext)
        throws ODataException
    {
        return super.executeSingle(configContext);
    }

}
