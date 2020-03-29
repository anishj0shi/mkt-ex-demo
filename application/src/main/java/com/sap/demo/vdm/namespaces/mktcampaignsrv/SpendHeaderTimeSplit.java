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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendHeaderTimeSplitField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.SpendHeaderTimeSplitSelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>SpendHeaderTimeSplit</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SpendHeaderTimeSplit
    extends VdmEntity<SpendHeaderTimeSplit>
{

    /**
     * Selector for all available fields of SpendHeaderTimeSplit.
     * 
     */
    public final static SpendHeaderTimeSplitSelectable ALL_FIELDS = new SpendHeaderTimeSplitSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendHdrTimeSplitUUID</b></p>
     * 
     * @return
     *     Key of Time Split of Marketing Spend Header
     */
    @Key
    @SerializedName("MarketingSpendHdrTimeSplitUUID")
    @JsonProperty("MarketingSpendHdrTimeSplitUUID")
    @Nullable
    @ODataField(odataName = "MarketingSpendHdrTimeSplitUUID")
    private UUID marketingSpendHdrTimeSplitUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendHdrTimeSplitUUID</b> field to query operations.
     * 
     */
    public final static SpendHeaderTimeSplitField<UUID> MARKETING_SPEND_HDR_TIME_SPLIT_UUID = new SpendHeaderTimeSplitField<UUID>("MarketingSpendHdrTimeSplitUUID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendHeaderUUID</b></p>
     * 
     * @return
     *     Key of Marketing Spend Header
     */
    @SerializedName("MarketingSpendHeaderUUID")
    @JsonProperty("MarketingSpendHeaderUUID")
    @Nullable
    @ODataField(odataName = "MarketingSpendHeaderUUID")
    private UUID marketingSpendHeaderUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendHeaderUUID</b> field to query operations.
     * 
     */
    public final static SpendHeaderTimeSplitField<UUID> MARKETING_SPEND_HEADER_UUID = new SpendHeaderTimeSplitField<UUID>("MarketingSpendHeaderUUID");
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
    public final static SpendHeaderTimeSplitField<String> MARKETING_SPEND_CALENDAR_YEAR = new SpendHeaderTimeSplitField<String>("MarketingSpendCalendarYear");
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
    public final static SpendHeaderTimeSplitField<String> MARKETING_SPEND_CALENDAR_QUARTER = new SpendHeaderTimeSplitField<String>("MarketingSpendCalendarQuarter");
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
    public final static SpendHeaderTimeSplitField<String> MARKETING_SPEND_CALENDAR_MONTH = new SpendHeaderTimeSplitField<String>("MarketingSpendCalendarMonth");
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
    public final static SpendHeaderTimeSplitField<String> MKTG_SPEND_CALENDAR_MONTH_NAME = new SpendHeaderTimeSplitField<String>("MktgSpendCalendarMonthName");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendHeaderAmt</b></p>
     * 
     * @return
     *     Amount of Planned Marketing Spend Header
     */
    @SerializedName("PlannedMktgSpendHeaderAmt")
    @JsonProperty("PlannedMktgSpendHeaderAmt")
    @Nullable
    @ODataField(odataName = "PlannedMktgSpendHeaderAmt")
    private BigDecimal plannedMktgSpendHeaderAmt;
    /**
     * Use with available fluent helpers to apply the <b>PlannedMktgSpendHeaderAmt</b> field to query operations.
     * 
     */
    public final static SpendHeaderTimeSplitField<BigDecimal> PLANNED_MKTG_SPEND_HEADER_AMT = new SpendHeaderTimeSplitField<BigDecimal>("PlannedMktgSpendHeaderAmt");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendHeaderCrcy</b></p>
     * 
     * @return
     *     Currency of Planned Marketing Spend Header
     */
    @SerializedName("PlannedMktgSpendHeaderCrcy")
    @JsonProperty("PlannedMktgSpendHeaderCrcy")
    @Nullable
    @ODataField(odataName = "PlannedMktgSpendHeaderCrcy")
    private String plannedMktgSpendHeaderCrcy;
    /**
     * Use with available fluent helpers to apply the <b>PlannedMktgSpendHeaderCrcy</b> field to query operations.
     * 
     */
    public final static SpendHeaderTimeSplitField<String> PLANNED_MKTG_SPEND_HEADER_CRCY = new SpendHeaderTimeSplitField<String>("PlannedMktgSpendHeaderCrcy");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<SpendHeaderTimeSplit> getType() {
        return SpendHeaderTimeSplit.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendHdrTimeSplitUUID</b></p>
     * 
     * @param marketingSpendHdrTimeSplitUUID
     *     Key of Time Split of Marketing Spend Header
     */
    public void setMarketingSpendHdrTimeSplitUUID(
        @Nullable
        final UUID marketingSpendHdrTimeSplitUUID) {
        rememberChangedField("MarketingSpendHdrTimeSplitUUID", this.marketingSpendHdrTimeSplitUUID);
        this.marketingSpendHdrTimeSplitUUID = marketingSpendHdrTimeSplitUUID;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendHeaderUUID</b></p>
     * 
     * @param marketingSpendHeaderUUID
     *     Key of Marketing Spend Header
     */
    public void setMarketingSpendHeaderUUID(
        @Nullable
        final UUID marketingSpendHeaderUUID) {
        rememberChangedField("MarketingSpendHeaderUUID", this.marketingSpendHeaderUUID);
        this.marketingSpendHeaderUUID = marketingSpendHeaderUUID;
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
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendHeaderAmt</b></p>
     * 
     * @param plannedMktgSpendHeaderAmt
     *     Amount of Planned Marketing Spend Header
     */
    public void setPlannedMktgSpendHeaderAmt(
        @Nullable
        final BigDecimal plannedMktgSpendHeaderAmt) {
        rememberChangedField("PlannedMktgSpendHeaderAmt", this.plannedMktgSpendHeaderAmt);
        this.plannedMktgSpendHeaderAmt = plannedMktgSpendHeaderAmt;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendHeaderCrcy</b></p>
     * 
     * @param plannedMktgSpendHeaderCrcy
     *     Currency of Planned Marketing Spend Header
     */
    public void setPlannedMktgSpendHeaderCrcy(
        @Nullable
        final String plannedMktgSpendHeaderCrcy) {
        rememberChangedField("PlannedMktgSpendHeaderCrcy", this.plannedMktgSpendHeaderCrcy);
        this.plannedMktgSpendHeaderCrcy = plannedMktgSpendHeaderCrcy;
    }

    @Override
    protected String getEntityCollection() {
        return "SpendHeaderTimeSplits";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("MarketingSpendHdrTimeSplitUUID", getMarketingSpendHdrTimeSplitUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("MarketingSpendHdrTimeSplitUUID", getMarketingSpendHdrTimeSplitUUID());
        values.put("MarketingSpendHeaderUUID", getMarketingSpendHeaderUUID());
        values.put("MarketingSpendCalendarYear", getMarketingSpendCalendarYear());
        values.put("MarketingSpendCalendarQuarter", getMarketingSpendCalendarQuarter());
        values.put("MarketingSpendCalendarMonth", getMarketingSpendCalendarMonth());
        values.put("MktgSpendCalendarMonthName", getMktgSpendCalendarMonthName());
        values.put("PlannedMktgSpendHeaderAmt", getPlannedMktgSpendHeaderAmt());
        values.put("PlannedMktgSpendHeaderCrcy", getPlannedMktgSpendHeaderCrcy());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("MarketingSpendHdrTimeSplitUUID")) {
                final Object value = values.remove("MarketingSpendHdrTimeSplitUUID");
                if ((value == null)||(!value.equals(getMarketingSpendHdrTimeSplitUUID()))) {
                    setMarketingSpendHdrTimeSplitUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingSpendHeaderUUID")) {
                final Object value = values.remove("MarketingSpendHeaderUUID");
                if ((value == null)||(!value.equals(getMarketingSpendHeaderUUID()))) {
                    setMarketingSpendHeaderUUID(((UUID) value));
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
            if (values.containsKey("PlannedMktgSpendHeaderAmt")) {
                final Object value = values.remove("PlannedMktgSpendHeaderAmt");
                if ((value == null)||(!value.equals(getPlannedMktgSpendHeaderAmt()))) {
                    setPlannedMktgSpendHeaderAmt(((BigDecimal) value));
                }
            }
            if (values.containsKey("PlannedMktgSpendHeaderCrcy")) {
                final Object value = values.remove("PlannedMktgSpendHeaderCrcy");
                if ((value == null)||(!value.equals(getPlannedMktgSpendHeaderCrcy()))) {
                    setPlannedMktgSpendHeaderCrcy(((String) value));
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
    public static<T >SpendHeaderTimeSplitField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SpendHeaderTimeSplitField<T>(fieldName);
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
    public static<T,DomainT >SpendHeaderTimeSplitField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SpendHeaderTimeSplitField<T>(fieldName, typeConverter);
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
