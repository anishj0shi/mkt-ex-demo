/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.math.BigDecimal;
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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.ActualSpendField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.ActualSpendSelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>ActualSpend</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class ActualSpend
    extends VdmEntity<ActualSpend>
{

    /**
     * Selector for all available fields of ActualSpend.
     * 
     */
    public final static ActualSpendSelectable ALL_FIELDS = new ActualSpendSelectable() {


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
     *     Campaign UUID for API-service
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
    public final static ActualSpendField<UUID> CAMPAIGN_UUID = new ActualSpendField<UUID>("CampaignUUID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingProgramUUID</b></p>
     * 
     * @return
     *     Program Key
     */
    @SerializedName("MarketingProgramUUID")
    @JsonProperty("MarketingProgramUUID")
    @Nullable
    @ODataField(odataName = "MarketingProgramUUID")
    private UUID marketingProgramUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingProgramUUID</b> field to query operations.
     * 
     */
    public final static ActualSpendField<UUID> MARKETING_PROGRAM_UUID = new ActualSpendField<UUID>("MarketingProgramUUID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendItemUUID</b></p>
     * 
     * @return
     *     Spend Item UUID
     */
    @SerializedName("MarketingSpendItemUUID")
    @JsonProperty("MarketingSpendItemUUID")
    @Nullable
    @ODataField(odataName = "MarketingSpendItemUUID")
    private UUID marketingSpendItemUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendItemUUID</b> field to query operations.
     * 
     */
    public final static ActualSpendField<UUID> MARKETING_SPEND_ITEM_UUID = new ActualSpendField<UUID>("MarketingSpendItemUUID");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>MarketingSpendItem</b></p>
     * 
     * @return
     *     Marketing Spend Item
     */
    @SerializedName("MarketingSpendItem")
    @JsonProperty("MarketingSpendItem")
    @Nullable
    @ODataField(odataName = "MarketingSpendItem")
    private String marketingSpendItem;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendItem</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> MARKETING_SPEND_ITEM = new ActualSpendField<String>("MarketingSpendItem");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>MarketingSpendItemName</b></p>
     * 
     * @return
     *     Name of Marketing Spend Item
     */
    @SerializedName("MarketingSpendItemName")
    @JsonProperty("MarketingSpendItemName")
    @Nullable
    @ODataField(odataName = "MarketingSpendItemName")
    private String marketingSpendItemName;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendItemName</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> MARKETING_SPEND_ITEM_NAME = new ActualSpendField<String>("MarketingSpendItemName");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>MarketingSpendType</b></p>
     * 
     * @return
     *     Marketing Spend Type
     */
    @SerializedName("MarketingSpendType")
    @JsonProperty("MarketingSpendType")
    @Nullable
    @ODataField(odataName = "MarketingSpendType")
    private String marketingSpendType;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendType</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> MARKETING_SPEND_TYPE = new ActualSpendField<String>("MarketingSpendType");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>MarketingSpendCalendarYear</b></p>
     * 
     * @return
     *     Calendar Year
     */
    @SerializedName("MarketingSpendCalendarYear")
    @JsonProperty("MarketingSpendCalendarYear")
    @Nullable
    @ODataField(odataName = "MarketingSpendCalendarYear")
    private String marketingSpendCalendarYear;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendCalendarYear</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> MARKETING_SPEND_CALENDAR_YEAR = new ActualSpendField<String>("MarketingSpendCalendarYear");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>MarketingSpendCalendarQuarter</b></p>
     * 
     * @return
     *     Calendar Quarter
     */
    @SerializedName("MarketingSpendCalendarQuarter")
    @JsonProperty("MarketingSpendCalendarQuarter")
    @Nullable
    @ODataField(odataName = "MarketingSpendCalendarQuarter")
    private String marketingSpendCalendarQuarter;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendCalendarQuarter</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> MARKETING_SPEND_CALENDAR_QUARTER = new ActualSpendField<String>("MarketingSpendCalendarQuarter");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendCalendarMonth</b></p>
     * 
     * @return
     *     Calendar Month
     */
    @SerializedName("MarketingSpendCalendarMonth")
    @JsonProperty("MarketingSpendCalendarMonth")
    @Nullable
    @ODataField(odataName = "MarketingSpendCalendarMonth")
    private String marketingSpendCalendarMonth;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendCalendarMonth</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> MARKETING_SPEND_CALENDAR_MONTH = new ActualSpendField<String>("MarketingSpendCalendarMonth");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MktgSpendCalendarMonthName</b></p>
     * 
     * @return
     *     Calendar Month Name
     */
    @SerializedName("MktgSpendCalendarMonthName")
    @JsonProperty("MktgSpendCalendarMonthName")
    @Nullable
    @ODataField(odataName = "MktgSpendCalendarMonthName")
    private String mktgSpendCalendarMonthName;
    /**
     * Use with available fluent helpers to apply the <b>MktgSpendCalendarMonthName</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> MKTG_SPEND_CALENDAR_MONTH_NAME = new ActualSpendField<String>("MktgSpendCalendarMonthName");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>ActualMktgSpendCrcy</b></p>
     * 
     * @return
     *     Actual Marketing Spend Currency
     */
    @SerializedName("ActualMktgSpendCrcy")
    @JsonProperty("ActualMktgSpendCrcy")
    @Nullable
    @ODataField(odataName = "ActualMktgSpendCrcy")
    private String actualMktgSpendCrcy;
    /**
     * Use with available fluent helpers to apply the <b>ActualMktgSpendCrcy</b> field to query operations.
     * 
     */
    public final static ActualSpendField<String> ACTUAL_MKTG_SPEND_CRCY = new ActualSpendField<String>("ActualMktgSpendCrcy");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>ActualMktgSpendAmt</b></p>
     * 
     * @return
     *     The actualMktgSpendAmt contained in this entity.
     */
    @SerializedName("ActualMktgSpendAmt")
    @JsonProperty("ActualMktgSpendAmt")
    @Nullable
    @ODataField(odataName = "ActualMktgSpendAmt")
    private BigDecimal actualMktgSpendAmt;
    /**
     * Use with available fluent helpers to apply the <b>ActualMktgSpendAmt</b> field to query operations.
     * 
     */
    public final static ActualSpendField<BigDecimal> ACTUAL_MKTG_SPEND_AMT = new ActualSpendField<BigDecimal>("ActualMktgSpendAmt");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>MktgCommitmentAmt</b></p>
     * 
     * @return
     *     The mktgCommitmentAmt contained in this entity.
     */
    @SerializedName("MktgCommitmentAmt")
    @JsonProperty("MktgCommitmentAmt")
    @Nullable
    @ODataField(odataName = "MktgCommitmentAmt")
    private BigDecimal mktgCommitmentAmt;
    /**
     * Use with available fluent helpers to apply the <b>MktgCommitmentAmt</b> field to query operations.
     * 
     */
    public final static ActualSpendField<BigDecimal> MKTG_COMMITMENT_AMT = new ActualSpendField<BigDecimal>("MktgCommitmentAmt");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<ActualSpend> getType() {
        return ActualSpend.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @param campaignUUID
     *     Campaign UUID for API-service
     */
    public void setCampaignUUID(
        @Nullable
        final UUID campaignUUID) {
        rememberChangedField("CampaignUUID", this.campaignUUID);
        this.campaignUUID = campaignUUID;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingProgramUUID</b></p>
     * 
     * @param marketingProgramUUID
     *     Program Key
     */
    public void setMarketingProgramUUID(
        @Nullable
        final UUID marketingProgramUUID) {
        rememberChangedField("MarketingProgramUUID", this.marketingProgramUUID);
        this.marketingProgramUUID = marketingProgramUUID;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendItemUUID</b></p>
     * 
     * @param marketingSpendItemUUID
     *     Spend Item UUID
     */
    public void setMarketingSpendItemUUID(
        @Nullable
        final UUID marketingSpendItemUUID) {
        rememberChangedField("MarketingSpendItemUUID", this.marketingSpendItemUUID);
        this.marketingSpendItemUUID = marketingSpendItemUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>MarketingSpendItem</b></p>
     * 
     * @param marketingSpendItem
     *     Marketing Spend Item
     */
    public void setMarketingSpendItem(
        @Nullable
        final String marketingSpendItem) {
        rememberChangedField("MarketingSpendItem", this.marketingSpendItem);
        this.marketingSpendItem = marketingSpendItem;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>MarketingSpendItemName</b></p>
     * 
     * @param marketingSpendItemName
     *     Name of Marketing Spend Item
     */
    public void setMarketingSpendItemName(
        @Nullable
        final String marketingSpendItemName) {
        rememberChangedField("MarketingSpendItemName", this.marketingSpendItemName);
        this.marketingSpendItemName = marketingSpendItemName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>MarketingSpendType</b></p>
     * 
     * @param marketingSpendType
     *     Marketing Spend Type
     */
    public void setMarketingSpendType(
        @Nullable
        final String marketingSpendType) {
        rememberChangedField("MarketingSpendType", this.marketingSpendType);
        this.marketingSpendType = marketingSpendType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>MarketingSpendCalendarYear</b></p>
     * 
     * @param marketingSpendCalendarYear
     *     Calendar Year
     */
    public void setMarketingSpendCalendarYear(
        @Nullable
        final String marketingSpendCalendarYear) {
        rememberChangedField("MarketingSpendCalendarYear", this.marketingSpendCalendarYear);
        this.marketingSpendCalendarYear = marketingSpendCalendarYear;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>MarketingSpendCalendarQuarter</b></p>
     * 
     * @param marketingSpendCalendarQuarter
     *     Calendar Quarter
     */
    public void setMarketingSpendCalendarQuarter(
        @Nullable
        final String marketingSpendCalendarQuarter) {
        rememberChangedField("MarketingSpendCalendarQuarter", this.marketingSpendCalendarQuarter);
        this.marketingSpendCalendarQuarter = marketingSpendCalendarQuarter;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendCalendarMonth</b></p>
     * 
     * @param marketingSpendCalendarMonth
     *     Calendar Month
     */
    public void setMarketingSpendCalendarMonth(
        @Nullable
        final String marketingSpendCalendarMonth) {
        rememberChangedField("MarketingSpendCalendarMonth", this.marketingSpendCalendarMonth);
        this.marketingSpendCalendarMonth = marketingSpendCalendarMonth;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MktgSpendCalendarMonthName</b></p>
     * 
     * @param mktgSpendCalendarMonthName
     *     Calendar Month Name
     */
    public void setMktgSpendCalendarMonthName(
        @Nullable
        final String mktgSpendCalendarMonthName) {
        rememberChangedField("MktgSpendCalendarMonthName", this.mktgSpendCalendarMonthName);
        this.mktgSpendCalendarMonthName = mktgSpendCalendarMonthName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>ActualMktgSpendCrcy</b></p>
     * 
     * @param actualMktgSpendCrcy
     *     Actual Marketing Spend Currency
     */
    public void setActualMktgSpendCrcy(
        @Nullable
        final String actualMktgSpendCrcy) {
        rememberChangedField("ActualMktgSpendCrcy", this.actualMktgSpendCrcy);
        this.actualMktgSpendCrcy = actualMktgSpendCrcy;
    }

    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>ActualMktgSpendAmt</b></p>
     * 
     * @param actualMktgSpendAmt
     *     The actualMktgSpendAmt to set.
     */
    public void setActualMktgSpendAmt(
        @Nullable
        final BigDecimal actualMktgSpendAmt) {
        rememberChangedField("ActualMktgSpendAmt", this.actualMktgSpendAmt);
        this.actualMktgSpendAmt = actualMktgSpendAmt;
    }

    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>MktgCommitmentAmt</b></p>
     * 
     * @param mktgCommitmentAmt
     *     The mktgCommitmentAmt to set.
     */
    public void setMktgCommitmentAmt(
        @Nullable
        final BigDecimal mktgCommitmentAmt) {
        rememberChangedField("MktgCommitmentAmt", this.mktgCommitmentAmt);
        this.mktgCommitmentAmt = mktgCommitmentAmt;
    }

    @Override
    protected String getEntityCollection() {
        return "ActualSpends";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CampaignUUID", getCampaignUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CampaignUUID", getCampaignUUID());
        values.put("MarketingProgramUUID", getMarketingProgramUUID());
        values.put("MarketingSpendItemUUID", getMarketingSpendItemUUID());
        values.put("MarketingSpendItem", getMarketingSpendItem());
        values.put("MarketingSpendItemName", getMarketingSpendItemName());
        values.put("MarketingSpendType", getMarketingSpendType());
        values.put("MarketingSpendCalendarYear", getMarketingSpendCalendarYear());
        values.put("MarketingSpendCalendarQuarter", getMarketingSpendCalendarQuarter());
        values.put("MarketingSpendCalendarMonth", getMarketingSpendCalendarMonth());
        values.put("MktgSpendCalendarMonthName", getMktgSpendCalendarMonthName());
        values.put("ActualMktgSpendCrcy", getActualMktgSpendCrcy());
        values.put("ActualMktgSpendAmt", getActualMktgSpendAmt());
        values.put("MktgCommitmentAmt", getMktgCommitmentAmt());
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
            if (values.containsKey("MarketingProgramUUID")) {
                final Object value = values.remove("MarketingProgramUUID");
                if ((value == null)||(!value.equals(getMarketingProgramUUID()))) {
                    setMarketingProgramUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingSpendItemUUID")) {
                final Object value = values.remove("MarketingSpendItemUUID");
                if ((value == null)||(!value.equals(getMarketingSpendItemUUID()))) {
                    setMarketingSpendItemUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingSpendItem")) {
                final Object value = values.remove("MarketingSpendItem");
                if ((value == null)||(!value.equals(getMarketingSpendItem()))) {
                    setMarketingSpendItem(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendItemName")) {
                final Object value = values.remove("MarketingSpendItemName");
                if ((value == null)||(!value.equals(getMarketingSpendItemName()))) {
                    setMarketingSpendItemName(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendType")) {
                final Object value = values.remove("MarketingSpendType");
                if ((value == null)||(!value.equals(getMarketingSpendType()))) {
                    setMarketingSpendType(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendCalendarYear")) {
                final Object value = values.remove("MarketingSpendCalendarYear");
                if ((value == null)||(!value.equals(getMarketingSpendCalendarYear()))) {
                    setMarketingSpendCalendarYear(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendCalendarQuarter")) {
                final Object value = values.remove("MarketingSpendCalendarQuarter");
                if ((value == null)||(!value.equals(getMarketingSpendCalendarQuarter()))) {
                    setMarketingSpendCalendarQuarter(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendCalendarMonth")) {
                final Object value = values.remove("MarketingSpendCalendarMonth");
                if ((value == null)||(!value.equals(getMarketingSpendCalendarMonth()))) {
                    setMarketingSpendCalendarMonth(((String) value));
                }
            }
            if (values.containsKey("MktgSpendCalendarMonthName")) {
                final Object value = values.remove("MktgSpendCalendarMonthName");
                if ((value == null)||(!value.equals(getMktgSpendCalendarMonthName()))) {
                    setMktgSpendCalendarMonthName(((String) value));
                }
            }
            if (values.containsKey("ActualMktgSpendCrcy")) {
                final Object value = values.remove("ActualMktgSpendCrcy");
                if ((value == null)||(!value.equals(getActualMktgSpendCrcy()))) {
                    setActualMktgSpendCrcy(((String) value));
                }
            }
            if (values.containsKey("ActualMktgSpendAmt")) {
                final Object value = values.remove("ActualMktgSpendAmt");
                if ((value == null)||(!value.equals(getActualMktgSpendAmt()))) {
                    setActualMktgSpendAmt(((BigDecimal) value));
                }
            }
            if (values.containsKey("MktgCommitmentAmt")) {
                final Object value = values.remove("MktgCommitmentAmt");
                if ((value == null)||(!value.equals(getMktgCommitmentAmt()))) {
                    setMktgCommitmentAmt(((BigDecimal) value));
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
    public static<T >ActualSpendField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new ActualSpendField<T>(fieldName);
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
    public static<T,DomainT >ActualSpendField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new ActualSpendField<T>(fieldName, typeConverter);
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
