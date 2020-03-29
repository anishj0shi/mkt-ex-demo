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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.TeamMemberEntityField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.TeamMemberEntitySelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>TeamMemberEntityType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class TeamMemberEntity
    extends VdmEntity<TeamMemberEntity>
{

    /**
     * Selector for all available fields of TeamMemberEntity.
     * 
     */
    public final static TeamMemberEntitySelectable ALL_FIELDS = new TeamMemberEntitySelectable() {


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
    public final static TeamMemberEntityField<UUID> CAMPAIGN_UUID = new TeamMemberEntityField<UUID>("CampaignUUID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>TeamMemberName</b></p>
     * 
     * @return
     *     User Name in User Master Record
     */
    @Key
    @SerializedName("TeamMemberName")
    @JsonProperty("TeamMemberName")
    @Nullable
    @ODataField(odataName = "TeamMemberName")
    private String teamMemberName;
    /**
     * Use with available fluent helpers to apply the <b>TeamMemberName</b> field to query operations.
     * 
     */
    public final static TeamMemberEntityField<String> TEAM_MEMBER_NAME = new TeamMemberEntityField<String>("TeamMemberName");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsOwner</b></p>
     * 
     * @return
     *     Data element for domain BOOLE: TRUE (='X') and FALSE (=' ')
     */
    @SerializedName("IsOwner")
    @JsonProperty("IsOwner")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsOwner")
    private Boolean isOwner;
    /**
     * Use with available fluent helpers to apply the <b>IsOwner</b> field to query operations.
     * 
     */
    public final static TeamMemberEntityField<Boolean> IS_OWNER = new TeamMemberEntityField<Boolean>("IsOwner");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<TeamMemberEntity> getType() {
        return TeamMemberEntity.class;
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

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>TeamMemberName</b></p>
     * 
     * @param teamMemberName
     *     User Name in User Master Record
     */
    public void setTeamMemberName(
        @Nullable
        final String teamMemberName) {
        rememberChangedField("TeamMemberName", this.teamMemberName);
        this.teamMemberName = teamMemberName;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsOwner</b></p>
     * 
     * @param isOwner
     *     Data element for domain BOOLE: TRUE (='X') and FALSE (=' ')
     */
    public void setIsOwner(
        @Nullable
        final Boolean isOwner) {
        rememberChangedField("IsOwner", this.isOwner);
        this.isOwner = isOwner;
    }

    @Override
    protected String getEntityCollection() {
        return "TeamMembers";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CampaignUUID", getCampaignUUID());
        result.put("TeamMemberName", getTeamMemberName());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CampaignUUID", getCampaignUUID());
        values.put("TeamMemberName", getTeamMemberName());
        values.put("IsOwner", getIsOwner());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("CampaignUUID")) {
                final Object value = values.remove("CampaignUUID");
                if ((value == null)||(!value.equals(getCampaignUUID()))) {
                    setCampaignUUID(((UUID) value));
                }
            }
            if (values.containsKey("TeamMemberName")) {
                final Object value = values.remove("TeamMemberName");
                if ((value == null)||(!value.equals(getTeamMemberName()))) {
                    setTeamMemberName(((String) value));
                }
            }
            if (values.containsKey("IsOwner")) {
                final Object value = values.remove("IsOwner");
                if ((value == null)||(!value.equals(getIsOwner()))) {
                    setIsOwner(((Boolean) value));
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
    public static<T >TeamMemberEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new TeamMemberEntityField<T>(fieldName);
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
    public static<T,DomainT >TeamMemberEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new TeamMemberEntityField<T>(fieldName, typeConverter);
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
