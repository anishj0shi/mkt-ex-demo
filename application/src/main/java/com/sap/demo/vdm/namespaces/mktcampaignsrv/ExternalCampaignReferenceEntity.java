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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.ExternalCampaignReferenceEntityField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.ExternalCampaignReferenceEntitySelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>ExternalCampaignReferenceEntityType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class ExternalCampaignReferenceEntity
    extends VdmEntity<ExternalCampaignReferenceEntity>
{

    /**
     * Selector for all available fields of ExternalCampaignReferenceEntity.
     * 
     */
    public final static ExternalCampaignReferenceEntitySelectable ALL_FIELDS = new ExternalCampaignReferenceEntitySelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>ExternalCampaignUUID</b></p>
     * 
     * @return
     *     NodeID
     */
    @Key
    @SerializedName("ExternalCampaignUUID")
    @JsonProperty("ExternalCampaignUUID")
    @Nullable
    @ODataField(odataName = "ExternalCampaignUUID")
    private UUID externalCampaignUUID;
    /**
     * Use with available fluent helpers to apply the <b>ExternalCampaignUUID</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<UUID> EXTERNAL_CAMPAIGN_UUID = new ExternalCampaignReferenceEntityField<UUID>("ExternalCampaignUUID");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>ExternalCampaignID</b></p>
     * 
     * @return
     *     External Campaign ID
     */
    @SerializedName("ExternalCampaignID")
    @JsonProperty("ExternalCampaignID")
    @Nullable
    @ODataField(odataName = "ExternalCampaignID")
    private String externalCampaignID;
    /**
     * Use with available fluent helpers to apply the <b>ExternalCampaignID</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<String> EXTERNAL_CAMPAIGN_ID = new ExternalCampaignReferenceEntityField<String>("ExternalCampaignID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @return
     *     NodeID
     */
    @SerializedName("CampaignUUID")
    @JsonProperty("CampaignUUID")
    @Nullable
    @ODataField(odataName = "CampaignUUID")
    private UUID campaignUUID;
    /**
     * Use with available fluent helpers to apply the <b>CampaignUUID</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<UUID> CAMPAIGN_UUID = new ExternalCampaignReferenceEntityField<UUID>("CampaignUUID");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ExternalCampaignName</b></p>
     * 
     * @return
     *     External Campaign Name
     */
    @SerializedName("ExternalCampaignName")
    @JsonProperty("ExternalCampaignName")
    @Nullable
    @ODataField(odataName = "ExternalCampaignName")
    private String externalCampaignName;
    /**
     * Use with available fluent helpers to apply the <b>ExternalCampaignName</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<String> EXTERNAL_CAMPAIGN_NAME = new ExternalCampaignReferenceEntityField<String>("ExternalCampaignName");
    /**
     * Constraints: Not nullable, Maximum length: 1000 <p>Original property name from the Odata EDM: <b>ExternalCampaignURL</b></p>
     * 
     * @return
     *     URL of External Campaign
     */
    @SerializedName("ExternalCampaignURL")
    @JsonProperty("ExternalCampaignURL")
    @Nullable
    @ODataField(odataName = "ExternalCampaignURL")
    private String externalCampaignURL;
    /**
     * Use with available fluent helpers to apply the <b>ExternalCampaignURL</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<String> EXTERNAL_CAMPAIGN_URL = new ExternalCampaignReferenceEntityField<String>("ExternalCampaignURL");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>Advertiser</b></p>
     * 
     * @return
     *     The Identifier of an Advertiser
     */
    @SerializedName("Advertiser")
    @JsonProperty("Advertiser")
    @Nullable
    @ODataField(odataName = "Advertiser")
    private String advertiser;
    /**
     * Use with available fluent helpers to apply the <b>Advertiser</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<String> ADVERTISER = new ExternalCampaignReferenceEntityField<String>("Advertiser");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>AdvertiserName</b></p>
     * 
     * @return
     *     Advertiser Name
     */
    @SerializedName("AdvertiserName")
    @JsonProperty("AdvertiserName")
    @Nullable
    @ODataField(odataName = "AdvertiserName")
    private String advertiserName;
    /**
     * Use with available fluent helpers to apply the <b>AdvertiserName</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<String> ADVERTISER_NAME = new ExternalCampaignReferenceEntityField<String>("AdvertiserName");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>ExternalCmpgnManagingParty</b></p>
     * 
     * @return
     *     External Campaign Managing Party
     */
    @SerializedName("ExternalCmpgnManagingParty")
    @JsonProperty("ExternalCmpgnManagingParty")
    @Nullable
    @ODataField(odataName = "ExternalCmpgnManagingParty")
    private String externalCmpgnManagingParty;
    /**
     * Use with available fluent helpers to apply the <b>ExternalCmpgnManagingParty</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<String> EXTERNAL_CMPGN_MANAGING_PARTY = new ExternalCampaignReferenceEntityField<String>("ExternalCmpgnManagingParty");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ExternalCmpgnManagingPartyName</b></p>
     * 
     * @return
     *     External Campaign Managing Party Name
     */
    @SerializedName("ExternalCmpgnManagingPartyName")
    @JsonProperty("ExternalCmpgnManagingPartyName")
    @Nullable
    @ODataField(odataName = "ExternalCmpgnManagingPartyName")
    private String externalCmpgnManagingPartyName;
    /**
     * Use with available fluent helpers to apply the <b>ExternalCmpgnManagingPartyName</b> field to query operations.
     * 
     */
    public final static ExternalCampaignReferenceEntityField<String> EXTERNAL_CMPGN_MANAGING_PARTY_NAME = new ExternalCampaignReferenceEntityField<String>("ExternalCmpgnManagingPartyName");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<ExternalCampaignReferenceEntity> getType() {
        return ExternalCampaignReferenceEntity.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>ExternalCampaignUUID</b></p>
     * 
     * @param externalCampaignUUID
     *     NodeID
     */
    public void setExternalCampaignUUID(
        @Nullable
        final UUID externalCampaignUUID) {
        rememberChangedField("ExternalCampaignUUID", this.externalCampaignUUID);
        this.externalCampaignUUID = externalCampaignUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>ExternalCampaignID</b></p>
     * 
     * @param externalCampaignID
     *     External Campaign ID
     */
    public void setExternalCampaignID(
        @Nullable
        final String externalCampaignID) {
        rememberChangedField("ExternalCampaignID", this.externalCampaignID);
        this.externalCampaignID = externalCampaignID;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
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
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ExternalCampaignName</b></p>
     * 
     * @param externalCampaignName
     *     External Campaign Name
     */
    public void setExternalCampaignName(
        @Nullable
        final String externalCampaignName) {
        rememberChangedField("ExternalCampaignName", this.externalCampaignName);
        this.externalCampaignName = externalCampaignName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1000 <p>Original property name from the Odata EDM: <b>ExternalCampaignURL</b></p>
     * 
     * @param externalCampaignURL
     *     URL of External Campaign
     */
    public void setExternalCampaignURL(
        @Nullable
        final String externalCampaignURL) {
        rememberChangedField("ExternalCampaignURL", this.externalCampaignURL);
        this.externalCampaignURL = externalCampaignURL;
    }

    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>Advertiser</b></p>
     * 
     * @param advertiser
     *     The Identifier of an Advertiser
     */
    public void setAdvertiser(
        @Nullable
        final String advertiser) {
        rememberChangedField("Advertiser", this.advertiser);
        this.advertiser = advertiser;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>AdvertiserName</b></p>
     * 
     * @param advertiserName
     *     Advertiser Name
     */
    public void setAdvertiserName(
        @Nullable
        final String advertiserName) {
        rememberChangedField("AdvertiserName", this.advertiserName);
        this.advertiserName = advertiserName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>ExternalCmpgnManagingParty</b></p>
     * 
     * @param externalCmpgnManagingParty
     *     External Campaign Managing Party
     */
    public void setExternalCmpgnManagingParty(
        @Nullable
        final String externalCmpgnManagingParty) {
        rememberChangedField("ExternalCmpgnManagingParty", this.externalCmpgnManagingParty);
        this.externalCmpgnManagingParty = externalCmpgnManagingParty;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ExternalCmpgnManagingPartyName</b></p>
     * 
     * @param externalCmpgnManagingPartyName
     *     External Campaign Managing Party Name
     */
    public void setExternalCmpgnManagingPartyName(
        @Nullable
        final String externalCmpgnManagingPartyName) {
        rememberChangedField("ExternalCmpgnManagingPartyName", this.externalCmpgnManagingPartyName);
        this.externalCmpgnManagingPartyName = externalCmpgnManagingPartyName;
    }

    @Override
    protected String getEntityCollection() {
        return "ExternalCampaignReferences";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("ExternalCampaignUUID", getExternalCampaignUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("ExternalCampaignUUID", getExternalCampaignUUID());
        values.put("ExternalCampaignID", getExternalCampaignID());
        values.put("CampaignUUID", getCampaignUUID());
        values.put("ExternalCampaignName", getExternalCampaignName());
        values.put("ExternalCampaignURL", getExternalCampaignURL());
        values.put("Advertiser", getAdvertiser());
        values.put("AdvertiserName", getAdvertiserName());
        values.put("ExternalCmpgnManagingParty", getExternalCmpgnManagingParty());
        values.put("ExternalCmpgnManagingPartyName", getExternalCmpgnManagingPartyName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("ExternalCampaignUUID")) {
                final Object value = values.remove("ExternalCampaignUUID");
                if ((value == null)||(!value.equals(getExternalCampaignUUID()))) {
                    setExternalCampaignUUID(((UUID) value));
                }
            }
            if (values.containsKey("ExternalCampaignID")) {
                final Object value = values.remove("ExternalCampaignID");
                if ((value == null)||(!value.equals(getExternalCampaignID()))) {
                    setExternalCampaignID(((String) value));
                }
            }
            if (values.containsKey("CampaignUUID")) {
                final Object value = values.remove("CampaignUUID");
                if ((value == null)||(!value.equals(getCampaignUUID()))) {
                    setCampaignUUID(((UUID) value));
                }
            }
            if (values.containsKey("ExternalCampaignName")) {
                final Object value = values.remove("ExternalCampaignName");
                if ((value == null)||(!value.equals(getExternalCampaignName()))) {
                    setExternalCampaignName(((String) value));
                }
            }
            if (values.containsKey("ExternalCampaignURL")) {
                final Object value = values.remove("ExternalCampaignURL");
                if ((value == null)||(!value.equals(getExternalCampaignURL()))) {
                    setExternalCampaignURL(((String) value));
                }
            }
            if (values.containsKey("Advertiser")) {
                final Object value = values.remove("Advertiser");
                if ((value == null)||(!value.equals(getAdvertiser()))) {
                    setAdvertiser(((String) value));
                }
            }
            if (values.containsKey("AdvertiserName")) {
                final Object value = values.remove("AdvertiserName");
                if ((value == null)||(!value.equals(getAdvertiserName()))) {
                    setAdvertiserName(((String) value));
                }
            }
            if (values.containsKey("ExternalCmpgnManagingParty")) {
                final Object value = values.remove("ExternalCmpgnManagingParty");
                if ((value == null)||(!value.equals(getExternalCmpgnManagingParty()))) {
                    setExternalCmpgnManagingParty(((String) value));
                }
            }
            if (values.containsKey("ExternalCmpgnManagingPartyName")) {
                final Object value = values.remove("ExternalCmpgnManagingPartyName");
                if ((value == null)||(!value.equals(getExternalCmpgnManagingPartyName()))) {
                    setExternalCmpgnManagingPartyName(((String) value));
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
    public static<T >ExternalCampaignReferenceEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new ExternalCampaignReferenceEntityField<T>(fieldName);
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
    public static<T,DomainT >ExternalCampaignReferenceEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new ExternalCampaignReferenceEntityField<T>(fieldName, typeConverter);
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
