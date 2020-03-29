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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.MarketingAgencyEntityField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.MarketingAgencyEntitySelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>MarketingAgencyEntityType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class MarketingAgencyEntity
    extends VdmEntity<MarketingAgencyEntity>
{

    /**
     * Selector for all available fields of MarketingAgencyEntity.
     * 
     */
    public final static MarketingAgencyEntitySelectable ALL_FIELDS = new MarketingAgencyEntitySelectable() {


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
     *     UUID for API-Service
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
    public final static MarketingAgencyEntityField<UUID> CAMPAIGN_UUID = new MarketingAgencyEntityField<UUID>("CampaignUUID");
    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingAgencyUUID</b></p>
     * 
     * @return
     *     UUID for API-Service
     */
    @Key
    @SerializedName("MarketingAgencyUUID")
    @JsonProperty("MarketingAgencyUUID")
    @Nullable
    @ODataField(odataName = "MarketingAgencyUUID")
    private UUID marketingAgencyUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingAgencyUUID</b> field to query operations.
     * 
     */
    public final static MarketingAgencyEntityField<UUID> MARKETING_AGENCY_UUID = new MarketingAgencyEntityField<UUID>("MarketingAgencyUUID");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>MarketingAgency</b></p>
     * 
     * @return
     *     Marketing Agency Identifier
     */
    @SerializedName("MarketingAgency")
    @JsonProperty("MarketingAgency")
    @Nullable
    @ODataField(odataName = "MarketingAgency")
    private String marketingAgency;
    /**
     * Use with available fluent helpers to apply the <b>MarketingAgency</b> field to query operations.
     * 
     */
    public final static MarketingAgencyEntityField<String> MARKETING_AGENCY = new MarketingAgencyEntityField<String>("MarketingAgency");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MarketingAgencyName</b></p>
     * 
     * @return
     *     Marketing Agency Name
     */
    @SerializedName("MarketingAgencyName")
    @JsonProperty("MarketingAgencyName")
    @Nullable
    @ODataField(odataName = "MarketingAgencyName")
    private String marketingAgencyName;
    /**
     * Use with available fluent helpers to apply the <b>MarketingAgencyName</b> field to query operations.
     * 
     */
    public final static MarketingAgencyEntityField<String> MARKETING_AGENCY_NAME = new MarketingAgencyEntityField<String>("MarketingAgencyName");
    /**
     * Constraints: Not nullable, Maximum length: 241 <p>Original property name from the Odata EDM: <b>EmailAddress</b></p><p>Example: user.name@company.comThe Internet mail address is used to send mail via the Internet world-wide; the protocol used is SMTP (Simple Mail Transfer Protocol).The Internet mail address format is specified in various RFCs (Internet Request for Comment), including RFCs 821 and 822.This is not an IP address (192.56.30.6).</p>
     * 
     * @return
     *     Internet mail address, also called e-mail address.
     */
    @SerializedName("EmailAddress")
    @JsonProperty("EmailAddress")
    @Nullable
    @ODataField(odataName = "EmailAddress")
    private String emailAddress;
    /**
     * Use with available fluent helpers to apply the <b>EmailAddress</b> field to query operations.
     * 
     */
    public final static MarketingAgencyEntityField<String> EMAIL_ADDRESS = new MarketingAgencyEntityField<String>("EmailAddress");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<MarketingAgencyEntity> getType() {
        return MarketingAgencyEntity.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @param campaignUUID
     *     UUID for API-Service
     */
    public void setCampaignUUID(
        @Nullable
        final UUID campaignUUID) {
        rememberChangedField("CampaignUUID", this.campaignUUID);
        this.campaignUUID = campaignUUID;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingAgencyUUID</b></p>
     * 
     * @param marketingAgencyUUID
     *     UUID for API-Service
     */
    public void setMarketingAgencyUUID(
        @Nullable
        final UUID marketingAgencyUUID) {
        rememberChangedField("MarketingAgencyUUID", this.marketingAgencyUUID);
        this.marketingAgencyUUID = marketingAgencyUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>MarketingAgency</b></p>
     * 
     * @param marketingAgency
     *     Marketing Agency Identifier
     */
    public void setMarketingAgency(
        @Nullable
        final String marketingAgency) {
        rememberChangedField("MarketingAgency", this.marketingAgency);
        this.marketingAgency = marketingAgency;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MarketingAgencyName</b></p>
     * 
     * @param marketingAgencyName
     *     Marketing Agency Name
     */
    public void setMarketingAgencyName(
        @Nullable
        final String marketingAgencyName) {
        rememberChangedField("MarketingAgencyName", this.marketingAgencyName);
        this.marketingAgencyName = marketingAgencyName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 241 <p>Original property name from the Odata EDM: <b>EmailAddress</b></p><p>Example: user.name@company.comThe Internet mail address is used to send mail via the Internet world-wide; the protocol used is SMTP (Simple Mail Transfer Protocol).The Internet mail address format is specified in various RFCs (Internet Request for Comment), including RFCs 821 and 822.This is not an IP address (192.56.30.6).</p>
     * 
     * @param emailAddress
     *     Internet mail address, also called e-mail address.
     */
    public void setEmailAddress(
        @Nullable
        final String emailAddress) {
        rememberChangedField("EmailAddress", this.emailAddress);
        this.emailAddress = emailAddress;
    }

    @Override
    protected String getEntityCollection() {
        return "MarketingAgencies";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CampaignUUID", getCampaignUUID());
        result.put("MarketingAgencyUUID", getMarketingAgencyUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CampaignUUID", getCampaignUUID());
        values.put("MarketingAgencyUUID", getMarketingAgencyUUID());
        values.put("MarketingAgency", getMarketingAgency());
        values.put("MarketingAgencyName", getMarketingAgencyName());
        values.put("EmailAddress", getEmailAddress());
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
            if (values.containsKey("MarketingAgencyUUID")) {
                final Object value = values.remove("MarketingAgencyUUID");
                if ((value == null)||(!value.equals(getMarketingAgencyUUID()))) {
                    setMarketingAgencyUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingAgency")) {
                final Object value = values.remove("MarketingAgency");
                if ((value == null)||(!value.equals(getMarketingAgency()))) {
                    setMarketingAgency(((String) value));
                }
            }
            if (values.containsKey("MarketingAgencyName")) {
                final Object value = values.remove("MarketingAgencyName");
                if ((value == null)||(!value.equals(getMarketingAgencyName()))) {
                    setMarketingAgencyName(((String) value));
                }
            }
            if (values.containsKey("EmailAddress")) {
                final Object value = values.remove("EmailAddress");
                if ((value == null)||(!value.equals(getEmailAddress()))) {
                    setEmailAddress(((String) value));
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
    public static<T >MarketingAgencyEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new MarketingAgencyEntityField<T>(fieldName);
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
    public static<T,DomainT >MarketingAgencyEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new MarketingAgencyEntityField<T>(fieldName, typeConverter);
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
