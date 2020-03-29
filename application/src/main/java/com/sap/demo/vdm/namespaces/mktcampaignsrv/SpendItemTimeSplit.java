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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendItemTimeSplitField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.SpendItemTimeSplitSelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>SpendItemTimeSplit</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SpendItemTimeSplit
    extends VdmEntity<SpendItemTimeSplit>
{

    /**
     * Selector for all available fields of SpendItemTimeSplit.
     * 
     */
    public final static SpendItemTimeSplitSelectable ALL_FIELDS = new SpendItemTimeSplitSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendItmTimeSplitUUID</b></p>
     * 
     * @return
     *     Key of Time Split of Marketing Spend Item
     */
    @Key
    @SerializedName("MarketingSpendItmTimeSplitUUID")
    @JsonProperty("MarketingSpendItmTimeSplitUUID")
    @Nullable
    @ODataField(odataName = "MarketingSpendItmTimeSplitUUID")
    private UUID marketingSpendItmTimeSplitUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendItmTimeSplitUUID</b> field to query operations.
     * 
     */
    public final static SpendItemTimeSplitField<UUID> MARKETING_SPEND_ITM_TIME_SPLIT_UUID = new SpendItemTimeSplitField<UUID>("MarketingSpendItmTimeSplitUUID");
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
    public final static SpendItemTimeSplitField<UUID> MARKETING_SPEND_ITEM_UUID = new SpendItemTimeSplitField<UUID>("MarketingSpendItemUUID");
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
    public final static SpendItemTimeSplitField<String> MARKETING_SPEND_CALENDAR_YEAR = new SpendItemTimeSplitField<String>("MarketingSpendCalendarYear");
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
    public final static SpendItemTimeSplitField<String> MARKETING_SPEND_CALENDAR_QUARTER = new SpendItemTimeSplitField<String>("MarketingSpendCalendarQuarter");
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
    public final static SpendItemTimeSplitField<String> MARKETING_SPEND_CALENDAR_MONTH = new SpendItemTimeSplitField<String>("MarketingSpendCalendarMonth");
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
    public final static SpendItemTimeSplitField<String> MKTG_SPEND_CALENDAR_MONTH_NAME = new SpendItemTimeSplitField<String>("MktgSpendCalendarMonthName");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendAmt</b></p>
     * 
     * @return
     *     Planned Marketing Spend
     */
    @SerializedName("PlannedMktgSpendAmt")
    @JsonProperty("PlannedMktgSpendAmt")
    @Nullable
    @ODataField(odataName = "PlannedMktgSpendAmt")
    private BigDecimal plannedMktgSpendAmt;
    /**
     * Use with available fluent helpers to apply the <b>PlannedMktgSpendAmt</b> field to query operations.
     * 
     */
    public final static SpendItemTimeSplitField<BigDecimal> PLANNED_MKTG_SPEND_AMT = new SpendItemTimeSplitField<BigDecimal>("PlannedMktgSpendAmt");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendCrcy</b></p>
     * 
     * @return
     *     Currency of Planned Marketing Spend
     */
    @SerializedName("PlannedMktgSpendCrcy")
    @JsonProperty("PlannedMktgSpendCrcy")
    @Nullable
    @ODataField(odataName = "PlannedMktgSpendCrcy")
    private String plannedMktgSpendCrcy;
    /**
     * Use with available fluent helpers to apply the <b>PlannedMktgSpendCrcy</b> field to query operations.
     * 
     */
    public final static SpendItemTimeSplitField<String> PLANNED_MKTG_SPEND_CRCY = new SpendItemTimeSplitField<String>("PlannedMktgSpendCrcy");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<SpendItemTimeSplit> getType() {
        return SpendItemTimeSplit.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendItmTimeSplitUUID</b></p>
     * 
     * @param marketingSpendItmTimeSplitUUID
     *     Key of Time Split of Marketing Spend Item
     */
    public void setMarketingSpendItmTimeSplitUUID(
        @Nullable
        final UUID marketingSpendItmTimeSplitUUID) {
        rememberChangedField("MarketingSpendItmTimeSplitUUID", this.marketingSpendItmTimeSplitUUID);
        this.marketingSpendItmTimeSplitUUID = marketingSpendItmTimeSplitUUID;
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
     * Constraints: Not nullable, Precision: 16, Scale: 3 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendAmt</b></p>
     * 
     * @param plannedMktgSpendAmt
     *     Planned Marketing Spend
     */
    public void setPlannedMktgSpendAmt(
        @Nullable
        final BigDecimal plannedMktgSpendAmt) {
        rememberChangedField("PlannedMktgSpendAmt", this.plannedMktgSpendAmt);
        this.plannedMktgSpendAmt = plannedMktgSpendAmt;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PlannedMktgSpendCrcy</b></p>
     * 
     * @param plannedMktgSpendCrcy
     *     Currency of Planned Marketing Spend
     */
    public void setPlannedMktgSpendCrcy(
        @Nullable
        final String plannedMktgSpendCrcy) {
        rememberChangedField("PlannedMktgSpendCrcy", this.plannedMktgSpendCrcy);
        this.plannedMktgSpendCrcy = plannedMktgSpendCrcy;
    }

    @Override
    protected String getEntityCollection() {
        return "SpendItemTimeSplits";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("MarketingSpendItmTimeSplitUUID", getMarketingSpendItmTimeSplitUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("MarketingSpendItmTimeSplitUUID", getMarketingSpendItmTimeSplitUUID());
        values.put("MarketingSpendItemUUID", getMarketingSpendItemUUID());
        values.put("MarketingSpendCalendarYear", getMarketingSpendCalendarYear());
        values.put("MarketingSpendCalendarQuarter", getMarketingSpendCalendarQuarter());
        values.put("MarketingSpendCalendarMonth", getMarketingSpendCalendarMonth());
        values.put("MktgSpendCalendarMonthName", getMktgSpendCalendarMonthName());
        values.put("PlannedMktgSpendAmt", getPlannedMktgSpendAmt());
        values.put("PlannedMktgSpendCrcy", getPlannedMktgSpendCrcy());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("MarketingSpendItmTimeSplitUUID")) {
                final Object value = values.remove("MarketingSpendItmTimeSplitUUID");
                if ((value == null)||(!value.equals(getMarketingSpendItmTimeSplitUUID()))) {
                    setMarketingSpendItmTimeSplitUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingSpendItemUUID")) {
                final Object value = values.remove("MarketingSpendItemUUID");
                if ((value == null)||(!value.equals(getMarketingSpendItemUUID()))) {
                    setMarketingSpendItemUUID(((UUID) value));
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
            if (values.containsKey("PlannedMktgSpendAmt")) {
                final Object value = values.remove("PlannedMktgSpendAmt");
                if ((value == null)||(!value.equals(getPlannedMktgSpendAmt()))) {
                    setPlannedMktgSpendAmt(((BigDecimal) value));
                }
            }
            if (values.containsKey("PlannedMktgSpendCrcy")) {
                final Object value = values.remove("PlannedMktgSpendCrcy");
                if ((value == null)||(!value.equals(getPlannedMktgSpendCrcy()))) {
                    setPlannedMktgSpendCrcy(((String) value));
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
    public static<T >SpendItemTimeSplitField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SpendItemTimeSplitField<T>(fieldName);
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
    public static<T,DomainT >SpendItemTimeSplitField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SpendItemTimeSplitField<T>(fieldName, typeConverter);
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
