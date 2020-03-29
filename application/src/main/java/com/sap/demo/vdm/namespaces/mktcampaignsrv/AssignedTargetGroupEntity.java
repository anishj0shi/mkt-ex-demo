/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.AssignedTargetGroupEntityField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.AssignedTargetGroupEntitySelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>AssignedTargetGroupEntityType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AssignedTargetGroupEntity
    extends VdmEntity<AssignedTargetGroupEntity>
{

    /**
     * Selector for all available fields of AssignedTargetGroupEntity.
     * 
     */
    public final static AssignedTargetGroupEntitySelectable ALL_FIELDS = new AssignedTargetGroupEntitySelectable() {


        @Nonnull
        @Override
        public String getFieldName() {
            return "*";
        }

        @Nonnull
        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TargetGroup</b></p>
     * 
     * @return
     *     The targetGroup contained in this entity.
     */
    @SerializedName("TargetGroup")
    @JsonProperty("TargetGroup")
    @Nullable
    @ODataField(odataName = "TargetGroup")
    private String targetGroup;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroup</b> field to query operations.
     * 
     */
    public final static AssignedTargetGroupEntityField<String> TARGET_GROUP = new AssignedTargetGroupEntityField<String>("TargetGroup");
    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupUUID</b></p>
     * 
     * @return
     *     NodeID
     */
    @Key
    @SerializedName("TargetGroupUUID")
    @JsonProperty("TargetGroupUUID")
    @Nullable
    @ODataField(odataName = "TargetGroupUUID")
    private UUID targetGroupUUID;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupUUID</b> field to query operations.
     * 
     */
    public final static AssignedTargetGroupEntityField<UUID> TARGET_GROUP_UUID = new AssignedTargetGroupEntityField<UUID>("TargetGroupUUID");
    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @return
     *     NodeID
     */
    @Key
    @SerializedName("CampaignUUID")
    @JsonProperty("CampaignUUID")
    @Nullable
    @ODataField(odataName = "CampaignUUID")
    private UUID campaignUUID;
    /**
     * Use with available fluent helpers to apply the <b>CampaignUUID</b> field to query operations.
     * 
     */
    public final static AssignedTargetGroupEntityField<UUID> CAMPAIGN_UUID = new AssignedTargetGroupEntityField<UUID>("CampaignUUID");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<AssignedTargetGroupEntity> getType() {
        return AssignedTargetGroupEntity.class;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TargetGroup</b></p>
     * 
     * @param targetGroup
     *     The targetGroup to set.
     */
    public void setTargetGroup(
        @Nullable
        final String targetGroup) {
        rememberChangedField("TargetGroup", this.targetGroup);
        this.targetGroup = targetGroup;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupUUID</b></p>
     * 
     * @param targetGroupUUID
     *     NodeID
     */
    public void setTargetGroupUUID(
        @Nullable
        final UUID targetGroupUUID) {
        rememberChangedField("TargetGroupUUID", this.targetGroupUUID);
        this.targetGroupUUID = targetGroupUUID;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @param campaignUUID
     *     NodeID
     */
    public void setCampaignUUID(
        @Nullable
        final UUID campaignUUID) {
        rememberChangedField("CampaignUUID", this.campaignUUID);
        this.campaignUUID = campaignUUID;
    }

    @Override
    protected String getEntityCollection() {
        return "AssignedTargetGroups";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("TargetGroupUUID", getTargetGroupUUID());
        result.put("CampaignUUID", getCampaignUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("TargetGroup", getTargetGroup());
        values.put("TargetGroupUUID", getTargetGroupUUID());
        values.put("CampaignUUID", getCampaignUUID());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("TargetGroup")) {
                final Object value = values.remove("TargetGroup");
                if ((value == null)||(!value.equals(getTargetGroup()))) {
                    setTargetGroup(((String) value));
                }
            }
            if (values.containsKey("TargetGroupUUID")) {
                final Object value = values.remove("TargetGroupUUID");
                if ((value == null)||(!value.equals(getTargetGroupUUID()))) {
                    setTargetGroupUUID(((UUID) value));
                }
            }
            if (values.containsKey("CampaignUUID")) {
                final Object value = values.remove("CampaignUUID");
                if ((value == null)||(!value.equals(getCampaignUUID()))) {
                    setCampaignUUID(((UUID) value));
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

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >AssignedTargetGroupEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AssignedTargetGroupEntityField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >AssignedTargetGroupEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AssignedTargetGroupEntityField<T>(fieldName, typeConverter);
    }

    @Override
    @Nullable
    public ErpConfigContext getErpConfigContext() {
        return super.getErpConfigContext();
    }

    /**
     * 
     * @deprecated
     *     Use {@link #attachToService(String, ErpConfigContext)} instead.
     */
    @Override
    @Deprecated
    public void setErpConfigContext(
        @Nullable
        final ErpConfigContext erpConfigContext) {
        super.setErpConfigContext(erpConfigContext);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Override
    public void attachToService(
        @Nullable
        final String servicePath,
        @Nullable
        final ErpConfigContext configContext) {
        super.attachToService(servicePath, configContext);
    }

    @Override
    protected String getDefaultServicePath() {
        return APIMKTCAMPAIGNSRVService.DEFAULT_SERVICE_PATH;
    }

}
