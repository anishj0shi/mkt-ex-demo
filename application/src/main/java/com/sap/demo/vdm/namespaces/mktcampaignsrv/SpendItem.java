/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.SpendItemField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.link.SpendItemLink;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.SpendItemSelectable;
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
 * <p>Original entity name from the Odata EDM: <b>SpendItem</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SpendItem
    extends VdmEntity<SpendItem>
{

    /**
     * Selector for all available fields of SpendItem.
     * 
     */
    public final static SpendItemSelectable ALL_FIELDS = new SpendItemSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendItemUUID</b></p>
     * 
     * @return
     *     NodeID
     */
    @Key
    @SerializedName("MarketingSpendItemUUID")
    @JsonProperty("MarketingSpendItemUUID")
    @Nullable
    @ODataField(odataName = "MarketingSpendItemUUID")
    private UUID marketingSpendItemUUID;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendItemUUID</b> field to query operations.
     * 
     */
    public final static SpendItemField<UUID> MARKETING_SPEND_ITEM_UUID = new SpendItemField<UUID>("MarketingSpendItemUUID");
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
    public final static SpendItemField<UUID> MARKETING_SPEND_HEADER_UUID = new SpendItemField<UUID>("MarketingSpendHeaderUUID");
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
    public final static SpendItemField<String> MARKETING_SPEND_ITEM = new SpendItemField<String>("MarketingSpendItem");
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
    public final static SpendItemField<String> MARKETING_SPEND_ITEM_NAME = new SpendItemField<String>("MarketingSpendItemName");
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
    public final static SpendItemField<String> MARKETING_SPEND_TYPE = new SpendItemField<String>("MarketingSpendType");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MarketingSpendTypeName</b></p>
     * 
     * @return
     *     Name of Marketing Spend Type
     */
    @SerializedName("MarketingSpendTypeName")
    @JsonProperty("MarketingSpendTypeName")
    @Nullable
    @ODataField(odataName = "MarketingSpendTypeName")
    private String marketingSpendTypeName;
    /**
     * Use with available fluent helpers to apply the <b>MarketingSpendTypeName</b> field to query operations.
     * 
     */
    public final static SpendItemField<String> MARKETING_SPEND_TYPE_NAME = new SpendItemField<String>("MarketingSpendTypeName");
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
    public final static SpendItemField<String> MARKETING_SPEND_PERIOD_START_YEAR = new SpendItemField<String>("MarketingSpendPeriodStartYear");
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
    public final static SpendItemField<String> MARKETING_SPEND_PERIOD_START_MONTH = new SpendItemField<String>("MarketingSpendPeriodStartMonth");
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
    public final static SpendItemField<String> MKTG_SPEND_PERIOD_START_MONTH_NAME = new SpendItemField<String>("MktgSpendPeriodStartMonthName");
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
    public final static SpendItemField<String> MARKETING_SPEND_PERIOD_END_YEAR = new SpendItemField<String>("MarketingSpendPeriodEndYear");
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
    public final static SpendItemField<String> MARKETING_SPEND_PERIOD_END_MONTH = new SpendItemField<String>("MarketingSpendPeriodEndMonth");
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
    public final static SpendItemField<String> MKTG_SPEND_PERIOD_END_MONTH_NAME = new SpendItemField<String>("MktgSpendPeriodEndMonthName");
    /**
     * Navigation property <b>ItemTimeSplit</b> for <b>SpendItem</b> to multiple <b>SpendItemTimeSplit</b>.
     * 
     */
    @SerializedName("ItemTimeSplit")
    @JsonProperty("ItemTimeSplit")
    @ODataField(odataName = "ItemTimeSplit")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SpendItemTimeSplit> toItemTimeSplit;
    /**
     * Use with available fluent helpers to apply the <b>ItemTimeSplit</b> navigation property to query operations.
     * 
     */
    public final static SpendItemLink<SpendItemTimeSplit> TO_ITEM_TIME_SPLIT = new SpendItemLink<SpendItemTimeSplit>("ItemTimeSplit");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<SpendItem> getType() {
        return SpendItem.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>MarketingSpendItemUUID</b></p>
     * 
     * @param marketingSpendItemUUID
     *     NodeID
     */
    public void setMarketingSpendItemUUID(
        @Nullable
        final UUID marketingSpendItemUUID) {
        rememberChangedField("MarketingSpendItemUUID", this.marketingSpendItemUUID);
        this.marketingSpendItemUUID = marketingSpendItemUUID;
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
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MarketingSpendTypeName</b></p>
     * 
     * @param marketingSpendTypeName
     *     Name of Marketing Spend Type
     */
    public void setMarketingSpendTypeName(
        @Nullable
        final String marketingSpendTypeName) {
        rememberChangedField("MarketingSpendTypeName", this.marketingSpendTypeName);
        this.marketingSpendTypeName = marketingSpendTypeName;
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

    @Override
    protected String getEntityCollection() {
        return "SpendItems";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("MarketingSpendItemUUID", getMarketingSpendItemUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("MarketingSpendItemUUID", getMarketingSpendItemUUID());
        values.put("MarketingSpendHeaderUUID", getMarketingSpendHeaderUUID());
        values.put("MarketingSpendItem", getMarketingSpendItem());
        values.put("MarketingSpendItemName", getMarketingSpendItemName());
        values.put("MarketingSpendType", getMarketingSpendType());
        values.put("MarketingSpendTypeName", getMarketingSpendTypeName());
        values.put("MarketingSpendPeriodStartYear", getMarketingSpendPeriodStartYear());
        values.put("MarketingSpendPeriodStartMonth", getMarketingSpendPeriodStartMonth());
        values.put("MktgSpendPeriodStartMonthName", getMktgSpendPeriodStartMonthName());
        values.put("MarketingSpendPeriodEndYear", getMarketingSpendPeriodEndYear());
        values.put("MarketingSpendPeriodEndMonth", getMarketingSpendPeriodEndMonth());
        values.put("MktgSpendPeriodEndMonthName", getMktgSpendPeriodEndMonthName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("MarketingSpendItemUUID")) {
                final Object value = values.remove("MarketingSpendItemUUID");
                if ((value == null)||(!value.equals(getMarketingSpendItemUUID()))) {
                    setMarketingSpendItemUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingSpendHeaderUUID")) {
                final Object value = values.remove("MarketingSpendHeaderUUID");
                if ((value == null)||(!value.equals(getMarketingSpendHeaderUUID()))) {
                    setMarketingSpendHeaderUUID(((UUID) value));
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
            if (values.containsKey("MarketingSpendTypeName")) {
                final Object value = values.remove("MarketingSpendTypeName");
                if ((value == null)||(!value.equals(getMarketingSpendTypeName()))) {
                    setMarketingSpendTypeName(((String) value));
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
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("ItemTimeSplit")) {
                final Object value = (values).remove("ItemTimeSplit");
                if (value instanceof Iterable) {
                    if (toItemTimeSplit == null) {
                        toItemTimeSplit = Lists.newArrayList();
                    } else {
                        toItemTimeSplit = Lists.newArrayList(toItemTimeSplit);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SpendItemTimeSplit entity;
                        if (toItemTimeSplit.size()>i) {
                            entity = toItemTimeSplit.get(i);
                        } else {
                            entity = new SpendItemTimeSplit();
                            toItemTimeSplit.add(entity);
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
    public static<T >SpendItemField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SpendItemField<T>(fieldName);
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
    public static<T,DomainT >SpendItemField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SpendItemField<T>(fieldName, typeConverter);
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
        if (toItemTimeSplit!= null) {
            (values).put("ItemTimeSplit", toItemTimeSplit);
        }
        return values;
    }

    /**
     * Fetches the <b>SpendItemTimeSplit</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>ItemTimeSplit</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SpendItemTimeSplit</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendItemTimeSplit> fetchItemTimeSplit()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SpendItemTimeSplit.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("MarketingSpendItemUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(marketingSpendItemUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("ItemTimeSplit");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SpendItemTimeSplit> entityList = result.asList(SpendItemTimeSplit.class);
        for (SpendItemTimeSplit entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SpendItemTimeSplit</b> entities (one to many). This corresponds to the OData navigation property <b>ItemTimeSplit</b>.
     * <p>
     * If the navigation property <b>ItemTimeSplit</b> of a queried <b>SpendItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SpendItemTimeSplit</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendItemTimeSplit> getItemTimeSplitOrFetch()
        throws ODataException
    {
        if (toItemTimeSplit == null) {
            toItemTimeSplit = fetchItemTimeSplit();
        }
        return toItemTimeSplit;
    }

    /**
     * Retrieval of associated <b>SpendItemTimeSplit</b> entities (one to many). This corresponds to the OData navigation property <b>ItemTimeSplit</b>.
     * <p>
     * If the navigation property for an entity <b>SpendItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>ItemTimeSplit</b> is already loaded, the result will contain the <b>SpendItemTimeSplit</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SpendItemTimeSplit>> getItemTimeSplitIfPresent() {
        return Optional.ofNullable(toItemTimeSplit);
    }

    /**
     * Overwrites the list of associated <b>SpendItemTimeSplit</b> entities for the loaded navigation property <b>ItemTimeSplit</b>.
     * <p>
     * If the navigation property <b>ItemTimeSplit</b> of a queried <b>SpendItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SpendItemTimeSplit</b> entities.
     */
    public void setItemTimeSplit(
        @Nonnull
        final List<SpendItemTimeSplit> value) {
        if (toItemTimeSplit == null) {
            toItemTimeSplit = Lists.newArrayList();
        }
        toItemTimeSplit.clear();
        toItemTimeSplit.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SpendItemTimeSplit</b> entities. This corresponds to the OData navigation property <b>ItemTimeSplit</b>.
     * <p>
     * If the navigation property <b>ItemTimeSplit</b> of a queried <b>SpendItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SpendItemTimeSplit</b> entities.
     */
    public void addItemTimeSplit(SpendItemTimeSplit... entity) {
        if (toItemTimeSplit == null) {
            toItemTimeSplit = Lists.newArrayList();
        }
        toItemTimeSplit.addAll(Lists.newArrayList(entity));
    }


    /**
     * Helper class to allow for fluent creation of SpendItem instances.
     * 
     */
    public final static class SpendItemBuilder {

        private List<SpendItemTimeSplit> toItemTimeSplit = Lists.newArrayList();

        private SpendItem.SpendItemBuilder toItemTimeSplit(final List<SpendItemTimeSplit> value) {
            toItemTimeSplit.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>ItemTimeSplit</b> for <b>SpendItem</b> to multiple <b>SpendItemTimeSplit</b>.
         * 
         * @param value
         *     The SpendItemTimeSplits to build this SpendItem with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public SpendItem.SpendItemBuilder itemTimeSplit(SpendItemTimeSplit... value) {
            return toItemTimeSplit(Lists.newArrayList(value));
        }

    }

}
