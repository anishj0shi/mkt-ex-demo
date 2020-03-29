/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendHeaderField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.link.SpendHeaderLink;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.SpendHeaderSelectable;
import com.sap.demo.vdm.services.APIMKTCAMPAIGNSRVService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * <p>Original entity name from the Odata EDM: <b>SpendHeader</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SpendHeader
    extends VdmEntity<SpendHeader>
{

    /**
     * Selector for all available fields of SpendHeader.
     * 
     */
    public final static SpendHeaderSelectable ALL_FIELDS = new SpendHeaderSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendHeaderUUID</b></p>
     * 
     * @return
     *     Key of Marketing Spend Header
     */
    @Key
    @SerializedName("MarketingSpendHeaderUUID")
    @JsonProperty("MarketingSpendHeaderUUID")
    @Nullable
    @ODataField(odataName = "MarketingSpendHeaderUUID")
    private UUID marketingSpendHeaderUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendHeaderUUID</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<UUID> MARKETING_SPEND_HEADER_UUID = new SpendHeaderField<UUID>("MarketingSpendHeaderUUID");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendStatus</b></p>
     * 
     * @return
     *     Marketing Spend Status
     */
    @SerializedName("MarketingSpendStatus")
    @JsonProperty("MarketingSpendStatus")
    @Nullable
    @ODataField(odataName = "MarketingSpendStatus")
    private String marketingSpendStatus;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendStatus</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<String> MARKETING_SPEND_STATUS = new SpendHeaderField<String>("MarketingSpendStatus");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @return
     *     Campaign UUID for API-service
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
    public final static SpendHeaderField<UUID> CAMPAIGN_UUID = new SpendHeaderField<UUID>("CampaignUUID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>PlannedMktgSpendIsDetailed</b></p>
     * 
     * @return
     *     Planned Marketing Spend Is Detailed
     */
    @SerializedName("PlannedMktgSpendIsDetailed")
    @JsonProperty("PlannedMktgSpendIsDetailed")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PlannedMktgSpendIsDetailed")
    private Boolean plannedMktgSpendIsDetailed;
    /**
     * Use with available fluent helpers to apply the <b>PlannedMktgSpendIsDetailed</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<Boolean> PLANNED_MKTG_SPEND_IS_DETAILED = new SpendHeaderField<Boolean>("PlannedMktgSpendIsDetailed");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodStartYear</b></p>
     * 
     * @return
     *     Start Year of Spend Period
     */
    @SerializedName("MarketingSpendPeriodStartYear")
    @JsonProperty("MarketingSpendPeriodStartYear")
    @Nullable
    @ODataField(odataName = "MarketingSpendPeriodStartYear")
    private String marketingSpendPeriodStartYear;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendPeriodStartYear</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<String> MARKETING_SPEND_PERIOD_START_YEAR = new SpendHeaderField<String>("MarketingSpendPeriodStartYear");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodStartMonth</b></p>
     * 
     * @return
     *     Start Month of Spend Period
     */
    @SerializedName("MarketingSpendPeriodStartMonth")
    @JsonProperty("MarketingSpendPeriodStartMonth")
    @Nullable
    @ODataField(odataName = "MarketingSpendPeriodStartMonth")
    private String marketingSpendPeriodStartMonth;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendPeriodStartMonth</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<String> MARKETING_SPEND_PERIOD_START_MONTH = new SpendHeaderField<String>("MarketingSpendPeriodStartMonth");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MktgSpendPeriodStartMonthName</b></p>
     * 
     * @return
     *     Calendar Month Name
     */
    @SerializedName("MktgSpendPeriodStartMonthName")
    @JsonProperty("MktgSpendPeriodStartMonthName")
    @Nullable
    @ODataField(odataName = "MktgSpendPeriodStartMonthName")
    private String mktgSpendPeriodStartMonthName;
    /**
     * Use with available fluent helpers to apply the <b>MktgSpendPeriodStartMonthName</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<String> MKTG_SPEND_PERIOD_START_MONTH_NAME = new SpendHeaderField<String>("MktgSpendPeriodStartMonthName");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodEndYear</b></p>
     * 
     * @return
     *     End Year of Spend Period
     */
    @SerializedName("MarketingSpendPeriodEndYear")
    @JsonProperty("MarketingSpendPeriodEndYear")
    @Nullable
    @ODataField(odataName = "MarketingSpendPeriodEndYear")
    private String marketingSpendPeriodEndYear;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendPeriodEndYear</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<String> MARKETING_SPEND_PERIOD_END_YEAR = new SpendHeaderField<String>("MarketingSpendPeriodEndYear");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodEndMonth</b></p>
     * 
     * @return
     *     End Month of Spend Period
     */
    @SerializedName("MarketingSpendPeriodEndMonth")
    @JsonProperty("MarketingSpendPeriodEndMonth")
    @Nullable
    @ODataField(odataName = "MarketingSpendPeriodEndMonth")
    private String marketingSpendPeriodEndMonth;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendPeriodEndMonth</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<String> MARKETING_SPEND_PERIOD_END_MONTH = new SpendHeaderField<String>("MarketingSpendPeriodEndMonth");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MktgSpendPeriodEndMonthName</b></p>
     * 
     * @return
     *     Calendar Month Name
     */
    @SerializedName("MktgSpendPeriodEndMonthName")
    @JsonProperty("MktgSpendPeriodEndMonthName")
    @Nullable
    @ODataField(odataName = "MktgSpendPeriodEndMonthName")
    private String mktgSpendPeriodEndMonthName;
    /**
     * Use with available fluent helpers to apply the <b>MktgSpendPeriodEndMonthName</b> field to query operations.
     * 
     */
    public final static SpendHeaderField<String> MKTG_SPEND_PERIOD_END_MONTH_NAME = new SpendHeaderField<String>("MktgSpendPeriodEndMonthName");
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
    public final static SpendHeaderField<BigDecimal> PLANNED_MKTG_SPEND_HEADER_AMT = new SpendHeaderField<BigDecimal>("PlannedMktgSpendHeaderAmt");
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
    public final static SpendHeaderField<String> PLANNED_MKTG_SPEND_HEADER_CRCY = new SpendHeaderField<String>("PlannedMktgSpendHeaderCrcy");
    /**
     * Navigation property <b>Item</b> for <b>SpendHeader</b> to multiple <b>SpendItem</b>.
     * 
     */
    @SerializedName("Item")
    @JsonProperty("Item")
    @ODataField(odataName = "Item")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SpendItem> toItem;
    /**
     * Navigation property <b>HeaderTimeSplit</b> for <b>SpendHeader</b> to multiple <b>SpendHeaderTimeSplit</b>.
     * 
     */
    @SerializedName("HeaderTimeSplit")
    @JsonProperty("HeaderTimeSplit")
    @ODataField(odataName = "HeaderTimeSplit")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SpendHeaderTimeSplit> toHeaderTimeSplit;
    /**
     * Use with available fluent helpers to apply the <b>Item</b> navigation property to query operations.
     * 
     */
    public final static SpendHeaderLink<SpendItem> TO_ITEM = new SpendHeaderLink<SpendItem>("Item");
    /**
     * Use with available fluent helpers to apply the <b>HeaderTimeSplit</b> navigation property to query operations.
     * 
     */
    public final static SpendHeaderLink<SpendHeaderTimeSplit> TO_HEADER_TIME_SPLIT = new SpendHeaderLink<SpendHeaderTimeSplit>("HeaderTimeSplit");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<SpendHeader> getType() {
        return SpendHeader.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendHeaderUUID</b></p>
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
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendStatus</b></p>
     * 
     * @param marketingSpendStatus
     *     Marketing Spend Status
     */
    public void setMarketingSpendStatus(
        @Nullable
        final String marketingSpendStatus) {
        rememberChangedField("MarketingSpendStatus", this.marketingSpendStatus);
        this.marketingSpendStatus = marketingSpendStatus;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
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
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>PlannedMktgSpendIsDetailed</b></p>
     * 
     * @param plannedMktgSpendIsDetailed
     *     Planned Marketing Spend Is Detailed
     */
    public void setPlannedMktgSpendIsDetailed(
        @Nullable
        final Boolean plannedMktgSpendIsDetailed) {
        rememberChangedField("PlannedMktgSpendIsDetailed", this.plannedMktgSpendIsDetailed);
        this.plannedMktgSpendIsDetailed = plannedMktgSpendIsDetailed;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodStartYear</b></p>
     * 
     * @param marketingSpendPeriodStartYear
     *     Start Year of Spend Period
     */
    public void setMarketingSpendPeriodStartYear(
        @Nullable
        final String marketingSpendPeriodStartYear) {
        rememberChangedField("MarketingSpendPeriodStartYear", this.marketingSpendPeriodStartYear);
        this.marketingSpendPeriodStartYear = marketingSpendPeriodStartYear;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodStartMonth</b></p>
     * 
     * @param marketingSpendPeriodStartMonth
     *     Start Month of Spend Period
     */
    public void setMarketingSpendPeriodStartMonth(
        @Nullable
        final String marketingSpendPeriodStartMonth) {
        rememberChangedField("MarketingSpendPeriodStartMonth", this.marketingSpendPeriodStartMonth);
        this.marketingSpendPeriodStartMonth = marketingSpendPeriodStartMonth;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MktgSpendPeriodStartMonthName</b></p>
     * 
     * @param mktgSpendPeriodStartMonthName
     *     Calendar Month Name
     */
    public void setMktgSpendPeriodStartMonthName(
        @Nullable
        final String mktgSpendPeriodStartMonthName) {
        rememberChangedField("MktgSpendPeriodStartMonthName", this.mktgSpendPeriodStartMonthName);
        this.mktgSpendPeriodStartMonthName = mktgSpendPeriodStartMonthName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodEndYear</b></p>
     * 
     * @param marketingSpendPeriodEndYear
     *     End Year of Spend Period
     */
    public void setMarketingSpendPeriodEndYear(
        @Nullable
        final String marketingSpendPeriodEndYear) {
        rememberChangedField("MarketingSpendPeriodEndYear", this.marketingSpendPeriodEndYear);
        this.marketingSpendPeriodEndYear = marketingSpendPeriodEndYear;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>MarketingSpendPeriodEndMonth</b></p>
     * 
     * @param marketingSpendPeriodEndMonth
     *     End Month of Spend Period
     */
    public void setMarketingSpendPeriodEndMonth(
        @Nullable
        final String marketingSpendPeriodEndMonth) {
        rememberChangedField("MarketingSpendPeriodEndMonth", this.marketingSpendPeriodEndMonth);
        this.marketingSpendPeriodEndMonth = marketingSpendPeriodEndMonth;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MktgSpendPeriodEndMonthName</b></p>
     * 
     * @param mktgSpendPeriodEndMonthName
     *     Calendar Month Name
     */
    public void setMktgSpendPeriodEndMonthName(
        @Nullable
        final String mktgSpendPeriodEndMonthName) {
        rememberChangedField("MktgSpendPeriodEndMonthName", this.mktgSpendPeriodEndMonthName);
        this.mktgSpendPeriodEndMonthName = mktgSpendPeriodEndMonthName;
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
        return "SpendHeaders";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("MarketingSpendHeaderUUID", getMarketingSpendHeaderUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("MarketingSpendHeaderUUID", getMarketingSpendHeaderUUID());
        values.put("MarketingSpendStatus", getMarketingSpendStatus());
        values.put("CampaignUUID", getCampaignUUID());
        values.put("PlannedMktgSpendIsDetailed", getPlannedMktgSpendIsDetailed());
        values.put("MarketingSpendPeriodStartYear", getMarketingSpendPeriodStartYear());
        values.put("MarketingSpendPeriodStartMonth", getMarketingSpendPeriodStartMonth());
        values.put("MktgSpendPeriodStartMonthName", getMktgSpendPeriodStartMonthName());
        values.put("MarketingSpendPeriodEndYear", getMarketingSpendPeriodEndYear());
        values.put("MarketingSpendPeriodEndMonth", getMarketingSpendPeriodEndMonth());
        values.put("MktgSpendPeriodEndMonthName", getMktgSpendPeriodEndMonthName());
        values.put("PlannedMktgSpendHeaderAmt", getPlannedMktgSpendHeaderAmt());
        values.put("PlannedMktgSpendHeaderCrcy", getPlannedMktgSpendHeaderCrcy());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("MarketingSpendHeaderUUID")) {
                final Object value = values.remove("MarketingSpendHeaderUUID");
                if ((value == null)||(!value.equals(getMarketingSpendHeaderUUID()))) {
                    setMarketingSpendHeaderUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingSpendStatus")) {
                final Object value = values.remove("MarketingSpendStatus");
                if ((value == null)||(!value.equals(getMarketingSpendStatus()))) {
                    setMarketingSpendStatus(((String) value));
                }
            }
            if (values.containsKey("CampaignUUID")) {
                final Object value = values.remove("CampaignUUID");
                if ((value == null)||(!value.equals(getCampaignUUID()))) {
                    setCampaignUUID(((UUID) value));
                }
            }
            if (values.containsKey("PlannedMktgSpendIsDetailed")) {
                final Object value = values.remove("PlannedMktgSpendIsDetailed");
                if ((value == null)||(!value.equals(getPlannedMktgSpendIsDetailed()))) {
                    setPlannedMktgSpendIsDetailed(((Boolean) value));
                }
            }
            if (values.containsKey("MarketingSpendPeriodStartYear")) {
                final Object value = values.remove("MarketingSpendPeriodStartYear");
                if ((value == null)||(!value.equals(getMarketingSpendPeriodStartYear()))) {
                    setMarketingSpendPeriodStartYear(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendPeriodStartMonth")) {
                final Object value = values.remove("MarketingSpendPeriodStartMonth");
                if ((value == null)||(!value.equals(getMarketingSpendPeriodStartMonth()))) {
                    setMarketingSpendPeriodStartMonth(((String) value));
                }
            }
            if (values.containsKey("MktgSpendPeriodStartMonthName")) {
                final Object value = values.remove("MktgSpendPeriodStartMonthName");
                if ((value == null)||(!value.equals(getMktgSpendPeriodStartMonthName()))) {
                    setMktgSpendPeriodStartMonthName(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendPeriodEndYear")) {
                final Object value = values.remove("MarketingSpendPeriodEndYear");
                if ((value == null)||(!value.equals(getMarketingSpendPeriodEndYear()))) {
                    setMarketingSpendPeriodEndYear(((String) value));
                }
            }
            if (values.containsKey("MarketingSpendPeriodEndMonth")) {
                final Object value = values.remove("MarketingSpendPeriodEndMonth");
                if ((value == null)||(!value.equals(getMarketingSpendPeriodEndMonth()))) {
                    setMarketingSpendPeriodEndMonth(((String) value));
                }
            }
            if (values.containsKey("MktgSpendPeriodEndMonthName")) {
                final Object value = values.remove("MktgSpendPeriodEndMonthName");
                if ((value == null)||(!value.equals(getMktgSpendPeriodEndMonthName()))) {
                    setMktgSpendPeriodEndMonthName(((String) value));
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
            if ((values).containsKey("Item")) {
                final Object value = (values).remove("Item");
                if (value instanceof Iterable) {
                    if (toItem == null) {
                        toItem = Lists.newArrayList();
                    } else {
                        toItem = Lists.newArrayList(toItem);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SpendItem entity;
                        if (toItem.size()>i) {
                            entity = toItem.get(i);
                        } else {
                            entity = new SpendItem();
                            toItem.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("HeaderTimeSplit")) {
                final Object value = (values).remove("HeaderTimeSplit");
                if (value instanceof Iterable) {
                    if (toHeaderTimeSplit == null) {
                        toHeaderTimeSplit = Lists.newArrayList();
                    } else {
                        toHeaderTimeSplit = Lists.newArrayList(toHeaderTimeSplit);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SpendHeaderTimeSplit entity;
                        if (toHeaderTimeSplit.size()>i) {
                            entity = toHeaderTimeSplit.get(i);
                        } else {
                            entity = new SpendHeaderTimeSplit();
                            toHeaderTimeSplit.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
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
    public static<T >SpendHeaderField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SpendHeaderField<T>(fieldName);
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
    public static<T,DomainT >SpendHeaderField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SpendHeaderField<T>(fieldName, typeConverter);
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

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toItem!= null) {
            (values).put("Item", toItem);
        }
        if (toHeaderTimeSplit!= null) {
            (values).put("HeaderTimeSplit", toHeaderTimeSplit);
        }
        return values;
    }

    /**
     * Fetches the <b>SpendItem</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>Item</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SpendItem</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendItem> fetchItem()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SpendItem.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("MarketingSpendHeaderUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(marketingSpendHeaderUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("Item");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SpendItem> entityList = result.asList(SpendItem.class);
        for (SpendItem entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SpendItem</b> entities (one to many). This corresponds to the OData navigation property <b>Item</b>.
     * <p>
     * If the navigation property <b>Item</b> of a queried <b>SpendHeader</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SpendItem</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendItem> getItemOrFetch()
        throws ODataException
    {
        if (toItem == null) {
            toItem = fetchItem();
        }
        return toItem;
    }

    /**
     * Retrieval of associated <b>SpendItem</b> entities (one to many). This corresponds to the OData navigation property <b>Item</b>.
     * <p>
     * If the navigation property for an entity <b>SpendHeader</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>Item</b> is already loaded, the result will contain the <b>SpendItem</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SpendItem>> getItemIfPresent() {
        return Optional.ofNullable(toItem);
    }

    /**
     * Overwrites the list of associated <b>SpendItem</b> entities for the loaded navigation property <b>Item</b>.
     * <p>
     * If the navigation property <b>Item</b> of a queried <b>SpendHeader</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SpendItem</b> entities.
     */
    public void setItem(
        @Nonnull
        final List<SpendItem> value) {
        if (toItem == null) {
            toItem = Lists.newArrayList();
        }
        toItem.clear();
        toItem.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SpendItem</b> entities. This corresponds to the OData navigation property <b>Item</b>.
     * <p>
     * If the navigation property <b>Item</b> of a queried <b>SpendHeader</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SpendItem</b> entities.
     */
    public void addItem(SpendItem... entity) {
        if (toItem == null) {
            toItem = Lists.newArrayList();
        }
        toItem.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SpendHeaderTimeSplit</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>HeaderTimeSplit</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SpendHeaderTimeSplit</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendHeaderTimeSplit> fetchHeaderTimeSplit()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SpendHeaderTimeSplit.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("MarketingSpendHeaderUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(marketingSpendHeaderUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("HeaderTimeSplit");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SpendHeaderTimeSplit> entityList = result.asList(SpendHeaderTimeSplit.class);
        for (SpendHeaderTimeSplit entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SpendHeaderTimeSplit</b> entities (one to many). This corresponds to the OData navigation property <b>HeaderTimeSplit</b>.
     * <p>
     * If the navigation property <b>HeaderTimeSplit</b> of a queried <b>SpendHeader</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SpendHeaderTimeSplit</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendHeaderTimeSplit> getHeaderTimeSplitOrFetch()
        throws ODataException
    {
        if (toHeaderTimeSplit == null) {
            toHeaderTimeSplit = fetchHeaderTimeSplit();
        }
        return toHeaderTimeSplit;
    }

    /**
     * Retrieval of associated <b>SpendHeaderTimeSplit</b> entities (one to many). This corresponds to the OData navigation property <b>HeaderTimeSplit</b>.
     * <p>
     * If the navigation property for an entity <b>SpendHeader</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>HeaderTimeSplit</b> is already loaded, the result will contain the <b>SpendHeaderTimeSplit</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SpendHeaderTimeSplit>> getHeaderTimeSplitIfPresent() {
        return Optional.ofNullable(toHeaderTimeSplit);
    }

    /**
     * Overwrites the list of associated <b>SpendHeaderTimeSplit</b> entities for the loaded navigation property <b>HeaderTimeSplit</b>.
     * <p>
     * If the navigation property <b>HeaderTimeSplit</b> of a queried <b>SpendHeader</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SpendHeaderTimeSplit</b> entities.
     */
    public void setHeaderTimeSplit(
        @Nonnull
        final List<SpendHeaderTimeSplit> value) {
        if (toHeaderTimeSplit == null) {
            toHeaderTimeSplit = Lists.newArrayList();
        }
        toHeaderTimeSplit.clear();
        toHeaderTimeSplit.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SpendHeaderTimeSplit</b> entities. This corresponds to the OData navigation property <b>HeaderTimeSplit</b>.
     * <p>
     * If the navigation property <b>HeaderTimeSplit</b> of a queried <b>SpendHeader</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SpendHeaderTimeSplit</b> entities.
     */
    public void addHeaderTimeSplit(SpendHeaderTimeSplit... entity) {
        if (toHeaderTimeSplit == null) {
            toHeaderTimeSplit = Lists.newArrayList();
        }
        toHeaderTimeSplit.addAll(Lists.newArrayList(entity));
    }


    /**
     * Helper class to allow for fluent creation of SpendHeader instances.
     * 
     */
    public final static class SpendHeaderBuilder {

        private List<SpendItem> toItem = Lists.newArrayList();
        private List<SpendHeaderTimeSplit> toHeaderTimeSplit = Lists.newArrayList();

        private SpendHeader.SpendHeaderBuilder toItem(final List<SpendItem> value) {
            toItem.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>Item</b> for <b>SpendHeader</b> to multiple <b>SpendItem</b>.
         * 
         * @param value
         *     The SpendItems to build this SpendHeader with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public SpendHeader.SpendHeaderBuilder item(SpendItem... value) {
            return toItem(Lists.newArrayList(value));
        }

        private SpendHeader.SpendHeaderBuilder toHeaderTimeSplit(final List<SpendHeaderTimeSplit> value) {
            toHeaderTimeSplit.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>HeaderTimeSplit</b> for <b>SpendHeader</b> to multiple <b>SpendHeaderTimeSplit</b>.
         * 
         * @param value
         *     The SpendHeaderTimeSplits to build this SpendHeader with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public SpendHeader.SpendHeaderBuilder headerTimeSplit(SpendHeaderTimeSplit... value) {
            return toHeaderTimeSplit(Lists.newArrayList(value));
        }

    }

}
