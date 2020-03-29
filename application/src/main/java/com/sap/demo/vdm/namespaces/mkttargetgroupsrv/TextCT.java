/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmComplex;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original complex type name from the Odata EDM: <b>TextCT</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class TextCT
    extends VdmComplex<TextCT>
{

    /**
     * Constraints: Not nullable<p>Original property from the Odata EDM: <b>LatestVersion</b></p>
     * 
     * @param latestVersion
     *     
     * @return
     *     Latest Version
     */
    @SerializedName("LatestVersion")
    @JsonProperty("LatestVersion")
    @Nullable
    @ODataField(odataName = "LatestVersion")
    private Integer latestVersion;
    /**
     * Constraints: Not nullable<p>Original property from the Odata EDM: <b>Text</b></p>
     * 
     * @param text
     *     
     * @return
     *     Text
     */
    @SerializedName("Text")
    @JsonProperty("Text")
    @Nullable
    @ODataField(odataName = "Text")
    private String text;

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<TextCT> getType() {
        return TextCT.class;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("LatestVersion", getLatestVersion());
        values.put("Text", getText());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("LatestVersion")) {
                final Object value = values.remove("LatestVersion");
                if ((value == null)||(!value.equals(getLatestVersion()))) {
                    setLatestVersion(((Integer) value));
                }
            }
            if (values.containsKey("Text")) {
                final Object value = values.remove("Text");
                if ((value == null)||(!value.equals(getText()))) {
                    setText(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        return result;
    }

}
