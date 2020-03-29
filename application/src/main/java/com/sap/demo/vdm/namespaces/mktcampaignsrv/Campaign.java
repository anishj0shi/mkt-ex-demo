/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
import com.sap.demo.vdm.namespaces.mktcampaignsrv.field.CampaignField;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.link.CampaignLink;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.CampaignSelectable;
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
 * <p>Original entity name from the Odata EDM: <b>Campaign</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Campaign
    extends VdmEntity<Campaign>
{

    /**
     * Selector for all available fields of Campaign.
     * 
     */
    public final static CampaignSelectable ALL_FIELDS = new CampaignSelectable() {


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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CampaignID</b></p>
     * 
     * @return
     *     Campaign ID
     */
    @SerializedName("CampaignID")
    @JsonProperty("CampaignID")
    @Nullable
    @ODataField(odataName = "CampaignID")
    private String campaignID;
    /**
     * Use with available fluent helpers to apply the <b>CampaignID</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_ID = new CampaignField<String>("CampaignID");
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
    public final static CampaignField<UUID> CAMPAIGN_UUID = new CampaignField<UUID>("CampaignUUID");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CampaignName</b></p>
     * 
     * @return
     *     Campaign Name
     */
    @SerializedName("CampaignName")
    @JsonProperty("CampaignName")
    @Nullable
    @ODataField(odataName = "CampaignName")
    private String campaignName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_NAME = new CampaignField<String>("CampaignName");
    /**
     * Constraints: Not nullable, Maximum length: 1000 <p>Original property name from the Odata EDM: <b>CampaignDescription</b></p>
     * 
     * @return
     *     Description
     */
    @SerializedName("CampaignDescription")
    @JsonProperty("CampaignDescription")
    @Nullable
    @ODataField(odataName = "CampaignDescription")
    private String campaignDescription;
    /**
     * Use with available fluent helpers to apply the <b>CampaignDescription</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_DESCRIPTION = new CampaignField<String>("CampaignDescription");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CampaignScheduleDateTime</b></p>
     * 
     * @return
     *     Start Date of Execution Interval as Timestamp
     */
    @SerializedName("CampaignScheduleDateTime")
    @JsonProperty("CampaignScheduleDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "CampaignScheduleDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime campaignScheduleDateTime;
    /**
     * Use with available fluent helpers to apply the <b>CampaignScheduleDateTime</b> field to query operations.
     * 
     */
    public final static CampaignField<ZonedDateTime> CAMPAIGN_SCHEDULE_DATE_TIME = new CampaignField<ZonedDateTime>("CampaignScheduleDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CampaignExecutionFrqcyInterval</b></p>
     * 
     * @return
     *     Value for Execution Interval
     */
    @SerializedName("CampaignExecutionFrqcyInterval")
    @JsonProperty("CampaignExecutionFrqcyInterval")
    @Nullable
    @ODataField(odataName = "CampaignExecutionFrqcyInterval")
    private String campaignExecutionFrqcyInterval;
    /**
     * Use with available fluent helpers to apply the <b>CampaignExecutionFrqcyInterval</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_EXECUTION_FRQCY_INTERVAL = new CampaignField<String>("CampaignExecutionFrqcyInterval");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CampaignExecutionFrqcyUnit</b></p>
     * 
     * @return
     *     Unit for Execution Interval
     */
    @SerializedName("CampaignExecutionFrqcyUnit")
    @JsonProperty("CampaignExecutionFrqcyUnit")
    @Nullable
    @ODataField(odataName = "CampaignExecutionFrqcyUnit")
    private String campaignExecutionFrqcyUnit;
    /**
     * Use with available fluent helpers to apply the <b>CampaignExecutionFrqcyUnit</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_EXECUTION_FRQCY_UNIT = new CampaignField<String>("CampaignExecutionFrqcyUnit");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MediaType</b></p>
     * 
     * @return
     *     Media Type Identifier
     */
    @SerializedName("MediaType")
    @JsonProperty("MediaType")
    @Nullable
    @ODataField(odataName = "MediaType")
    private String mediaType;
    /**
     * Use with available fluent helpers to apply the <b>MediaType</b> field to query operations.
     * 
     */
    public final static CampaignField<String> MEDIA_TYPE = new CampaignField<String>("MediaType");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MediaTypeName</b></p>
     * 
     * @return
     *     Media Type
     */
    @SerializedName("MediaTypeName")
    @JsonProperty("MediaTypeName")
    @Nullable
    @ODataField(odataName = "MediaTypeName")
    private String mediaTypeName;
    /**
     * Use with available fluent helpers to apply the <b>MediaTypeName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> MEDIA_TYPE_NAME = new CampaignField<String>("MediaTypeName");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CampaignLifecycleStatus</b></p>
     * 
     * @return
     *     Life Cycle Status Code
     */
    @SerializedName("CampaignLifecycleStatus")
    @JsonProperty("CampaignLifecycleStatus")
    @Nullable
    @ODataField(odataName = "CampaignLifecycleStatus")
    private String campaignLifecycleStatus;
    /**
     * Use with available fluent helpers to apply the <b>CampaignLifecycleStatus</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_LIFECYCLE_STATUS = new CampaignField<String>("CampaignLifecycleStatus");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CampaignLifecycleStatusName</b></p><p>SeeTask-Oriented InstructionsReference Documentation for Semantic Properties of Domains</p>
     * 
     * @return
     *     This text appears when fixed values are displayed in the F4 help. It explains the possible input values.
     */
    @SerializedName("CampaignLifecycleStatusName")
    @JsonProperty("CampaignLifecycleStatusName")
    @Nullable
    @ODataField(odataName = "CampaignLifecycleStatusName")
    private String campaignLifecycleStatusName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignLifecycleStatusName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_LIFECYCLE_STATUS_NAME = new CampaignField<String>("CampaignLifecycleStatusName");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CommunicationCategoryUUID</b></p>
     * 
     * @return
     *     NodeID
     */
    @SerializedName("CommunicationCategoryUUID")
    @JsonProperty("CommunicationCategoryUUID")
    @Nullable
    @ODataField(odataName = "CommunicationCategoryUUID")
    private UUID communicationCategoryUUID;
    /**
     * Use with available fluent helpers to apply the <b>CommunicationCategoryUUID</b> field to query operations.
     * 
     */
    public final static CampaignField<UUID> COMMUNICATION_CATEGORY_UUID = new CampaignField<UUID>("CommunicationCategoryUUID");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CommunicationCategoryName</b></p>
     * 
     * @return
     *     Communication Category Name
     */
    @SerializedName("CommunicationCategoryName")
    @JsonProperty("CommunicationCategoryName")
    @Nullable
    @ODataField(odataName = "CommunicationCategoryName")
    private String communicationCategoryName;
    /**
     * Use with available fluent helpers to apply the <b>CommunicationCategoryName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> COMMUNICATION_CATEGORY_NAME = new CampaignField<String>("CommunicationCategoryName");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>MarketingProgramUUID</b></p>
     * 
     * @return
     *     Marketing Planning: Program Identifier (GUID)
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
    public final static CampaignField<UUID> MARKETING_PROGRAM_UUID = new CampaignField<UUID>("MarketingProgramUUID");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MarketingProgramName</b></p>
     * 
     * @return
     *     Marketing Program Name
     */
    @SerializedName("MarketingProgramName")
    @JsonProperty("MarketingProgramName")
    @Nullable
    @ODataField(odataName = "MarketingProgramName")
    private String marketingProgramName;
    /**
     * Use with available fluent helpers to apply the <b>MarketingProgramName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> MARKETING_PROGRAM_NAME = new CampaignField<String>("MarketingProgramName");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CampaignPriority</b></p>
     * 
     * @return
     *     Priority
     */
    @SerializedName("CampaignPriority")
    @JsonProperty("CampaignPriority")
    @Nullable
    @ODataField(odataName = "CampaignPriority")
    private String campaignPriority;
    /**
     * Use with available fluent helpers to apply the <b>CampaignPriority</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_PRIORITY = new CampaignField<String>("CampaignPriority");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CampaignPriorityName</b></p><p>SeeTask-Oriented InstructionsReference Documentation for Semantic Properties of Domains</p>
     * 
     * @return
     *     This text appears when fixed values are displayed in the F4 help. It explains the possible input values.
     */
    @SerializedName("CampaignPriorityName")
    @JsonProperty("CampaignPriorityName")
    @Nullable
    @ODataField(odataName = "CampaignPriorityName")
    private String campaignPriorityName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignPriorityName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_PRIORITY_NAME = new CampaignField<String>("CampaignPriorityName");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p>
     * 
     * @return
     *     Marketing Area
     */
    @SerializedName("MarketingArea")
    @JsonProperty("MarketingArea")
    @Nullable
    @ODataField(odataName = "MarketingArea")
    private String marketingArea;
    /**
     * Use with available fluent helpers to apply the <b>MarketingArea</b> field to query operations.
     * 
     */
    public final static CampaignField<String> MARKETING_AREA = new CampaignField<String>("MarketingArea");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MarketingAreaName</b></p>
     * 
     * @return
     *     Description for Marketing Area
     */
    @SerializedName("MarketingAreaName")
    @JsonProperty("MarketingAreaName")
    @Nullable
    @ODataField(odataName = "MarketingAreaName")
    private String marketingAreaName;
    /**
     * Use with available fluent helpers to apply the <b>MarketingAreaName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> MARKETING_AREA_NAME = new CampaignField<String>("MarketingAreaName");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CampaignCategory</b></p>
     * 
     * @return
     *     Campaign Category
     */
    @SerializedName("CampaignCategory")
    @JsonProperty("CampaignCategory")
    @Nullable
    @ODataField(odataName = "CampaignCategory")
    private String campaignCategory;
    /**
     * Use with available fluent helpers to apply the <b>CampaignCategory</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_CATEGORY = new CampaignField<String>("CampaignCategory");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CampaignCategoryName</b></p>
     * 
     * @return
     *     Name of Campaign Category
     */
    @SerializedName("CampaignCategoryName")
    @JsonProperty("CampaignCategoryName")
    @Nullable
    @ODataField(odataName = "CampaignCategoryName")
    private String campaignCategoryName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignCategoryName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_CATEGORY_NAME = new CampaignField<String>("CampaignCategoryName");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CampaignStartDate</b></p>
     * 
     * @return
     *     Campaign Start Date
     */
    @SerializedName("CampaignStartDate")
    @JsonProperty("CampaignStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CampaignStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime campaignStartDate;
    /**
     * Use with available fluent helpers to apply the <b>CampaignStartDate</b> field to query operations.
     * 
     */
    public final static CampaignField<LocalDateTime> CAMPAIGN_START_DATE = new CampaignField<LocalDateTime>("CampaignStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CampaignEndDate</b></p>
     * 
     * @return
     *     Campaign End Date
     */
    @SerializedName("CampaignEndDate")
    @JsonProperty("CampaignEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CampaignEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime campaignEndDate;
    /**
     * Use with available fluent helpers to apply the <b>CampaignEndDate</b> field to query operations.
     * 
     */
    public final static CampaignField<LocalDateTime> CAMPAIGN_END_DATE = new CampaignField<LocalDateTime>("CampaignEndDate");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p><p>In order to convert local time into a UTC time stamp, which makes it easier to compare times, the local time must be converted according to your time zone. The ABAP command convert is available for this purpose.Even if the time zone that the conversion is based on can be redetermined from Customizing or master data, we still recommend that you save the time zone.The internal structure of the high-resolution UTC time stamp is logically organized in date and time sections in a packed decimal format (YYYYMMDDhhmmssmmmuuun), which depicts the year, month, day, hour,second, millisecond, microsecond and the first decimal of the nanoseconds. Please note that the hardware that is normally used does not fully support a resolution of 100 nanoseconds, which is available in the structure.See also GET TIME STAMPA UTC time stamp in short form is also available.</p>
     * 
     * @return
     *     The UTC timestamp displays date and time according to UTC (Universal Coordinated Time).
     */
    @SerializedName("CreationDateTime")
    @JsonProperty("CreationDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "CreationDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime creationDateTime;
    /**
     * Use with available fluent helpers to apply the <b>CreationDateTime</b> field to query operations.
     * 
     */
    public final static CampaignField<ZonedDateTime> CREATION_DATE_TIME = new CampaignField<ZonedDateTime>("CreationDateTime");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>LastChangeDateTime</b></p><p>In order to convert local time into a UTC time stamp, which makes it easier to compare times, the local time must be converted according to your time zone. The ABAP command convert is available for this purpose.Even if the time zone that the conversion is based on can be redetermined from Customizing or master data, we still recommend that you save the time zone.The internal structure of the high-resolution UTC time stamp is logically organized in date and time sections in a packed decimal format (YYYYMMDDhhmmssmmmuuun), which depicts the year, month, day, hour,second, millisecond, microsecond and the first decimal of the nanoseconds. Please note that the hardware that is normally used does not fully support a resolution of 100 nanoseconds, which is available in the structure.See also GET TIME STAMPA UTC time stamp in short form is also available.</p>
     * 
     * @return
     *     The UTC timestamp displays date and time according to UTC (Universal Coordinated Time).
     */
    @SerializedName("LastChangeDateTime")
    @JsonProperty("LastChangeDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "LastChangeDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime lastChangeDateTime;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeDateTime</b> field to query operations.
     * 
     */
    public final static CampaignField<ZonedDateTime> LAST_CHANGE_DATE_TIME = new CampaignField<ZonedDateTime>("LastChangeDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CampaignOwner</b></p>
     * 
     * @return
     *     Campaign Owner
     */
    @SerializedName("CampaignOwner")
    @JsonProperty("CampaignOwner")
    @Nullable
    @ODataField(odataName = "CampaignOwner")
    private String campaignOwner;
    /**
     * Use with available fluent helpers to apply the <b>CampaignOwner</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_OWNER = new CampaignField<String>("CampaignOwner");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CampaignOwnerName</b></p>
     * 
     * @return
     *     This field contains the complete personal name. It is usually generated from the various name components (without title).
     */
    @SerializedName("CampaignOwnerName")
    @JsonProperty("CampaignOwnerName")
    @Nullable
    @ODataField(odataName = "CampaignOwnerName")
    private String campaignOwnerName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignOwnerName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CAMPAIGN_OWNER_NAME = new CampaignField<String>("CampaignOwnerName");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @return
     *     User Name
     */
    @SerializedName("CreatedByUser")
    @JsonProperty("CreatedByUser")
    @Nullable
    @ODataField(odataName = "CreatedByUser")
    private String createdByUser;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUser</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CREATED_BY_USER = new CampaignField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CreatedByUserName</b></p>
     * 
     * @return
     *     This field contains the complete personal name. It is usually generated from the various name components (without title).
     */
    @SerializedName("CreatedByUserName")
    @JsonProperty("CreatedByUserName")
    @Nullable
    @ODataField(odataName = "CreatedByUserName")
    private String createdByUserName;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUserName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> CREATED_BY_USER_NAME = new CampaignField<String>("CreatedByUserName");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangeByUser</b></p>
     * 
     * @return
     *     User Name
     */
    @SerializedName("LastChangeByUser")
    @JsonProperty("LastChangeByUser")
    @Nullable
    @ODataField(odataName = "LastChangeByUser")
    private String lastChangeByUser;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeByUser</b> field to query operations.
     * 
     */
    public final static CampaignField<String> LAST_CHANGE_BY_USER = new CampaignField<String>("LastChangeByUser");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>LastChangeByUserName</b></p>
     * 
     * @return
     *     This field contains the complete personal name. It is usually generated from the various name components (without title).
     */
    @SerializedName("LastChangeByUserName")
    @JsonProperty("LastChangeByUserName")
    @Nullable
    @ODataField(odataName = "LastChangeByUserName")
    private String lastChangeByUserName;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeByUserName</b> field to query operations.
     * 
     */
    public final static CampaignField<String> LAST_CHANGE_BY_USER_NAME = new CampaignField<String>("LastChangeByUserName");
    /**
     * Navigation property <b>CampaignAssignedTargetGroups</b> for <b>Campaign</b> to multiple <b>AssignedTargetGroupEntity</b>.
     * 
     */
    @SerializedName("CampaignAssignedTargetGroups")
    @JsonProperty("CampaignAssignedTargetGroups")
    @ODataField(odataName = "CampaignAssignedTargetGroups")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<AssignedTargetGroupEntity> toCampaignAssignedTargetGroups;
    /**
     * Navigation property <b>CampaignAssignedTeamMembers</b> for <b>Campaign</b> to multiple <b>TeamMemberEntity</b>.
     * 
     */
    @SerializedName("CampaignAssignedTeamMembers")
    @JsonProperty("CampaignAssignedTeamMembers")
    @ODataField(odataName = "CampaignAssignedTeamMembers")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<TeamMemberEntity> toCampaignAssignedTeamMembers;
    /**
     * Navigation property <b>CampaignActualSpend</b> for <b>Campaign</b> to multiple <b>ActualSpend</b>.
     * 
     */
    @SerializedName("CampaignActualSpend")
    @JsonProperty("CampaignActualSpend")
    @ODataField(odataName = "CampaignActualSpend")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<ActualSpend> toCampaignActualSpend;
    /**
     * Navigation property <b>CampaignSpendHeader</b> for <b>Campaign</b> to multiple <b>SpendHeader</b>.
     * 
     */
    @SerializedName("CampaignSpendHeader")
    @JsonProperty("CampaignSpendHeader")
    @ODataField(odataName = "CampaignSpendHeader")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SpendHeader> toCampaignSpendHeader;
    /**
     * Navigation property <b>AssignedMarketingAgencies</b> for <b>Campaign</b> to multiple <b>MarketingAgencyEntity</b>.
     * 
     */
    @SerializedName("AssignedMarketingAgencies")
    @JsonProperty("AssignedMarketingAgencies")
    @ODataField(odataName = "AssignedMarketingAgencies")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<MarketingAgencyEntity> toAssignedMarketingAgencies;
    /**
     * Navigation property <b>ExternalCampaignReferences</b> for <b>Campaign</b> to multiple <b>ExternalCampaignReferenceEntity</b>.
     * 
     */
    @SerializedName("ExternalCampaignReferences")
    @JsonProperty("ExternalCampaignReferences")
    @ODataField(odataName = "ExternalCampaignReferences")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<ExternalCampaignReferenceEntity> toExternalCampaignReferences;
    /**
     * Navigation property <b>CampaignAssignedInterests</b> for <b>Campaign</b> to multiple <b>InterestEntity</b>.
     * 
     */
    @SerializedName("CampaignAssignedInterests")
    @JsonProperty("CampaignAssignedInterests")
    @ODataField(odataName = "CampaignAssignedInterests")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<InterestEntity> toCampaignAssignedInterests;
    /**
     * Use with available fluent helpers to apply the <b>CampaignAssignedTargetGroups</b> navigation property to query operations.
     * 
     */
    public final static CampaignLink<AssignedTargetGroupEntity> TO_CAMPAIGN_ASSIGNED_TARGET_GROUPS = new CampaignLink<AssignedTargetGroupEntity>("CampaignAssignedTargetGroups");
    /**
     * Use with available fluent helpers to apply the <b>CampaignAssignedTeamMembers</b> navigation property to query operations.
     * 
     */
    public final static CampaignLink<TeamMemberEntity> TO_CAMPAIGN_ASSIGNED_TEAM_MEMBERS = new CampaignLink<TeamMemberEntity>("CampaignAssignedTeamMembers");
    /**
     * Use with available fluent helpers to apply the <b>CampaignActualSpend</b> navigation property to query operations.
     * 
     */
    public final static CampaignLink<ActualSpend> TO_CAMPAIGN_ACTUAL_SPEND = new CampaignLink<ActualSpend>("CampaignActualSpend");
    /**
     * Use with available fluent helpers to apply the <b>CampaignSpendHeader</b> navigation property to query operations.
     * 
     */
    public final static CampaignLink<SpendHeader> TO_CAMPAIGN_SPEND_HEADER = new CampaignLink<SpendHeader>("CampaignSpendHeader");
    /**
     * Use with available fluent helpers to apply the <b>AssignedMarketingAgencies</b> navigation property to query operations.
     * 
     */
    public final static CampaignLink<MarketingAgencyEntity> TO_ASSIGNED_MARKETING_AGENCIES = new CampaignLink<MarketingAgencyEntity>("AssignedMarketingAgencies");
    /**
     * Use with available fluent helpers to apply the <b>ExternalCampaignReferences</b> navigation property to query operations.
     * 
     */
    public final static CampaignLink<ExternalCampaignReferenceEntity> TO_EXTERNAL_CAMPAIGN_REFERENCES = new CampaignLink<ExternalCampaignReferenceEntity>("ExternalCampaignReferences");
    /**
     * Use with available fluent helpers to apply the <b>CampaignAssignedInterests</b> navigation property to query operations.
     * 
     */
    public final static CampaignLink<InterestEntity> TO_CAMPAIGN_ASSIGNED_INTERESTS = new CampaignLink<InterestEntity>("CampaignAssignedInterests");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Campaign> getType() {
        return Campaign.class;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CampaignID</b></p>
     * 
     * @param campaignID
     *     Campaign ID
     */
    public void setCampaignID(
        @Nullable
        final String campaignID) {
        rememberChangedField("CampaignID", this.campaignID);
        this.campaignID = campaignID;
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
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CampaignName</b></p>
     * 
     * @param campaignName
     *     Campaign Name
     */
    public void setCampaignName(
        @Nullable
        final String campaignName) {
        rememberChangedField("CampaignName", this.campaignName);
        this.campaignName = campaignName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1000 <p>Original property name from the Odata EDM: <b>CampaignDescription</b></p>
     * 
     * @param campaignDescription
     *     Description
     */
    public void setCampaignDescription(
        @Nullable
        final String campaignDescription) {
        rememberChangedField("CampaignDescription", this.campaignDescription);
        this.campaignDescription = campaignDescription;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CampaignScheduleDateTime</b></p>
     * 
     * @param campaignScheduleDateTime
     *     Start Date of Execution Interval as Timestamp
     */
    public void setCampaignScheduleDateTime(
        @Nullable
        final ZonedDateTime campaignScheduleDateTime) {
        rememberChangedField("CampaignScheduleDateTime", this.campaignScheduleDateTime);
        this.campaignScheduleDateTime = campaignScheduleDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CampaignExecutionFrqcyInterval</b></p>
     * 
     * @param campaignExecutionFrqcyInterval
     *     Value for Execution Interval
     */
    public void setCampaignExecutionFrqcyInterval(
        @Nullable
        final String campaignExecutionFrqcyInterval) {
        rememberChangedField("CampaignExecutionFrqcyInterval", this.campaignExecutionFrqcyInterval);
        this.campaignExecutionFrqcyInterval = campaignExecutionFrqcyInterval;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CampaignExecutionFrqcyUnit</b></p>
     * 
     * @param campaignExecutionFrqcyUnit
     *     Unit for Execution Interval
     */
    public void setCampaignExecutionFrqcyUnit(
        @Nullable
        final String campaignExecutionFrqcyUnit) {
        rememberChangedField("CampaignExecutionFrqcyUnit", this.campaignExecutionFrqcyUnit);
        this.campaignExecutionFrqcyUnit = campaignExecutionFrqcyUnit;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MediaType</b></p>
     * 
     * @param mediaType
     *     Media Type Identifier
     */
    public void setMediaType(
        @Nullable
        final String mediaType) {
        rememberChangedField("MediaType", this.mediaType);
        this.mediaType = mediaType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MediaTypeName</b></p>
     * 
     * @param mediaTypeName
     *     Media Type
     */
    public void setMediaTypeName(
        @Nullable
        final String mediaTypeName) {
        rememberChangedField("MediaTypeName", this.mediaTypeName);
        this.mediaTypeName = mediaTypeName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CampaignLifecycleStatus</b></p>
     * 
     * @param campaignLifecycleStatus
     *     Life Cycle Status Code
     */
    public void setCampaignLifecycleStatus(
        @Nullable
        final String campaignLifecycleStatus) {
        rememberChangedField("CampaignLifecycleStatus", this.campaignLifecycleStatus);
        this.campaignLifecycleStatus = campaignLifecycleStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CampaignLifecycleStatusName</b></p><p>SeeTask-Oriented InstructionsReference Documentation for Semantic Properties of Domains</p>
     * 
     * @param campaignLifecycleStatusName
     *     This text appears when fixed values are displayed in the F4 help. It explains the possible input values.
     */
    public void setCampaignLifecycleStatusName(
        @Nullable
        final String campaignLifecycleStatusName) {
        rememberChangedField("CampaignLifecycleStatusName", this.campaignLifecycleStatusName);
        this.campaignLifecycleStatusName = campaignLifecycleStatusName;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CommunicationCategoryUUID</b></p>
     * 
     * @param communicationCategoryUUID
     *     NodeID
     */
    public void setCommunicationCategoryUUID(
        @Nullable
        final UUID communicationCategoryUUID) {
        rememberChangedField("CommunicationCategoryUUID", this.communicationCategoryUUID);
        this.communicationCategoryUUID = communicationCategoryUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CommunicationCategoryName</b></p>
     * 
     * @param communicationCategoryName
     *     Communication Category Name
     */
    public void setCommunicationCategoryName(
        @Nullable
        final String communicationCategoryName) {
        rememberChangedField("CommunicationCategoryName", this.communicationCategoryName);
        this.communicationCategoryName = communicationCategoryName;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>MarketingProgramUUID</b></p>
     * 
     * @param marketingProgramUUID
     *     Marketing Planning: Program Identifier (GUID)
     */
    public void setMarketingProgramUUID(
        @Nullable
        final UUID marketingProgramUUID) {
        rememberChangedField("MarketingProgramUUID", this.marketingProgramUUID);
        this.marketingProgramUUID = marketingProgramUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>MarketingProgramName</b></p>
     * 
     * @param marketingProgramName
     *     Marketing Program Name
     */
    public void setMarketingProgramName(
        @Nullable
        final String marketingProgramName) {
        rememberChangedField("MarketingProgramName", this.marketingProgramName);
        this.marketingProgramName = marketingProgramName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CampaignPriority</b></p>
     * 
     * @param campaignPriority
     *     Priority
     */
    public void setCampaignPriority(
        @Nullable
        final String campaignPriority) {
        rememberChangedField("CampaignPriority", this.campaignPriority);
        this.campaignPriority = campaignPriority;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>CampaignPriorityName</b></p><p>SeeTask-Oriented InstructionsReference Documentation for Semantic Properties of Domains</p>
     * 
     * @param campaignPriorityName
     *     This text appears when fixed values are displayed in the F4 help. It explains the possible input values.
     */
    public void setCampaignPriorityName(
        @Nullable
        final String campaignPriorityName) {
        rememberChangedField("CampaignPriorityName", this.campaignPriorityName);
        this.campaignPriorityName = campaignPriorityName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p>
     * 
     * @param marketingArea
     *     Marketing Area
     */
    public void setMarketingArea(
        @Nullable
        final String marketingArea) {
        rememberChangedField("MarketingArea", this.marketingArea);
        this.marketingArea = marketingArea;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MarketingAreaName</b></p>
     * 
     * @param marketingAreaName
     *     Description for Marketing Area
     */
    public void setMarketingAreaName(
        @Nullable
        final String marketingAreaName) {
        rememberChangedField("MarketingAreaName", this.marketingAreaName);
        this.marketingAreaName = marketingAreaName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CampaignCategory</b></p>
     * 
     * @param campaignCategory
     *     Campaign Category
     */
    public void setCampaignCategory(
        @Nullable
        final String campaignCategory) {
        rememberChangedField("CampaignCategory", this.campaignCategory);
        this.campaignCategory = campaignCategory;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CampaignCategoryName</b></p>
     * 
     * @param campaignCategoryName
     *     Name of Campaign Category
     */
    public void setCampaignCategoryName(
        @Nullable
        final String campaignCategoryName) {
        rememberChangedField("CampaignCategoryName", this.campaignCategoryName);
        this.campaignCategoryName = campaignCategoryName;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CampaignStartDate</b></p>
     * 
     * @param campaignStartDate
     *     Campaign Start Date
     */
    public void setCampaignStartDate(
        @Nullable
        final LocalDateTime campaignStartDate) {
        rememberChangedField("CampaignStartDate", this.campaignStartDate);
        this.campaignStartDate = campaignStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CampaignEndDate</b></p>
     * 
     * @param campaignEndDate
     *     Campaign End Date
     */
    public void setCampaignEndDate(
        @Nullable
        final LocalDateTime campaignEndDate) {
        rememberChangedField("CampaignEndDate", this.campaignEndDate);
        this.campaignEndDate = campaignEndDate;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p><p>In order to convert local time into a UTC time stamp, which makes it easier to compare times, the local time must be converted according to your time zone. The ABAP command convert is available for this purpose.Even if the time zone that the conversion is based on can be redetermined from Customizing or master data, we still recommend that you save the time zone.The internal structure of the high-resolution UTC time stamp is logically organized in date and time sections in a packed decimal format (YYYYMMDDhhmmssmmmuuun), which depicts the year, month, day, hour,second, millisecond, microsecond and the first decimal of the nanoseconds. Please note that the hardware that is normally used does not fully support a resolution of 100 nanoseconds, which is available in the structure.See also GET TIME STAMPA UTC time stamp in short form is also available.</p>
     * 
     * @param creationDateTime
     *     The UTC timestamp displays date and time according to UTC (Universal Coordinated Time).
     */
    public void setCreationDateTime(
        @Nullable
        final ZonedDateTime creationDateTime) {
        rememberChangedField("CreationDateTime", this.creationDateTime);
        this.creationDateTime = creationDateTime;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>LastChangeDateTime</b></p><p>In order to convert local time into a UTC time stamp, which makes it easier to compare times, the local time must be converted according to your time zone. The ABAP command convert is available for this purpose.Even if the time zone that the conversion is based on can be redetermined from Customizing or master data, we still recommend that you save the time zone.The internal structure of the high-resolution UTC time stamp is logically organized in date and time sections in a packed decimal format (YYYYMMDDhhmmssmmmuuun), which depicts the year, month, day, hour,second, millisecond, microsecond and the first decimal of the nanoseconds. Please note that the hardware that is normally used does not fully support a resolution of 100 nanoseconds, which is available in the structure.See also GET TIME STAMPA UTC time stamp in short form is also available.</p>
     * 
     * @param lastChangeDateTime
     *     The UTC timestamp displays date and time according to UTC (Universal Coordinated Time).
     */
    public void setLastChangeDateTime(
        @Nullable
        final ZonedDateTime lastChangeDateTime) {
        rememberChangedField("LastChangeDateTime", this.lastChangeDateTime);
        this.lastChangeDateTime = lastChangeDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CampaignOwner</b></p>
     * 
     * @param campaignOwner
     *     Campaign Owner
     */
    public void setCampaignOwner(
        @Nullable
        final String campaignOwner) {
        rememberChangedField("CampaignOwner", this.campaignOwner);
        this.campaignOwner = campaignOwner;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CampaignOwnerName</b></p>
     * 
     * @param campaignOwnerName
     *     This field contains the complete personal name. It is usually generated from the various name components (without title).
     */
    public void setCampaignOwnerName(
        @Nullable
        final String campaignOwnerName) {
        rememberChangedField("CampaignOwnerName", this.campaignOwnerName);
        this.campaignOwnerName = campaignOwnerName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     User Name
     */
    public void setCreatedByUser(
        @Nullable
        final String createdByUser) {
        rememberChangedField("CreatedByUser", this.createdByUser);
        this.createdByUser = createdByUser;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CreatedByUserName</b></p>
     * 
     * @param createdByUserName
     *     This field contains the complete personal name. It is usually generated from the various name components (without title).
     */
    public void setCreatedByUserName(
        @Nullable
        final String createdByUserName) {
        rememberChangedField("CreatedByUserName", this.createdByUserName);
        this.createdByUserName = createdByUserName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangeByUser</b></p>
     * 
     * @param lastChangeByUser
     *     User Name
     */
    public void setLastChangeByUser(
        @Nullable
        final String lastChangeByUser) {
        rememberChangedField("LastChangeByUser", this.lastChangeByUser);
        this.lastChangeByUser = lastChangeByUser;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>LastChangeByUserName</b></p>
     * 
     * @param lastChangeByUserName
     *     This field contains the complete personal name. It is usually generated from the various name components (without title).
     */
    public void setLastChangeByUserName(
        @Nullable
        final String lastChangeByUserName) {
        rememberChangedField("LastChangeByUserName", this.lastChangeByUserName);
        this.lastChangeByUserName = lastChangeByUserName;
    }

    @Override
    protected String getEntityCollection() {
        return "Campaigns";
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
        values.put("CampaignID", getCampaignID());
        values.put("CampaignUUID", getCampaignUUID());
        values.put("CampaignName", getCampaignName());
        values.put("CampaignDescription", getCampaignDescription());
        values.put("CampaignScheduleDateTime", getCampaignScheduleDateTime());
        values.put("CampaignExecutionFrqcyInterval", getCampaignExecutionFrqcyInterval());
        values.put("CampaignExecutionFrqcyUnit", getCampaignExecutionFrqcyUnit());
        values.put("MediaType", getMediaType());
        values.put("MediaTypeName", getMediaTypeName());
        values.put("CampaignLifecycleStatus", getCampaignLifecycleStatus());
        values.put("CampaignLifecycleStatusName", getCampaignLifecycleStatusName());
        values.put("CommunicationCategoryUUID", getCommunicationCategoryUUID());
        values.put("CommunicationCategoryName", getCommunicationCategoryName());
        values.put("MarketingProgramUUID", getMarketingProgramUUID());
        values.put("MarketingProgramName", getMarketingProgramName());
        values.put("CampaignPriority", getCampaignPriority());
        values.put("CampaignPriorityName", getCampaignPriorityName());
        values.put("MarketingArea", getMarketingArea());
        values.put("MarketingAreaName", getMarketingAreaName());
        values.put("CampaignCategory", getCampaignCategory());
        values.put("CampaignCategoryName", getCampaignCategoryName());
        values.put("CampaignStartDate", getCampaignStartDate());
        values.put("CampaignEndDate", getCampaignEndDate());
        values.put("CreationDateTime", getCreationDateTime());
        values.put("LastChangeDateTime", getLastChangeDateTime());
        values.put("CampaignOwner", getCampaignOwner());
        values.put("CampaignOwnerName", getCampaignOwnerName());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("CreatedByUserName", getCreatedByUserName());
        values.put("LastChangeByUser", getLastChangeByUser());
        values.put("LastChangeByUserName", getLastChangeByUserName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("CampaignID")) {
                final Object value = values.remove("CampaignID");
                if ((value == null)||(!value.equals(getCampaignID()))) {
                    setCampaignID(((String) value));
                }
            }
            if (values.containsKey("CampaignUUID")) {
                final Object value = values.remove("CampaignUUID");
                if ((value == null)||(!value.equals(getCampaignUUID()))) {
                    setCampaignUUID(((UUID) value));
                }
            }
            if (values.containsKey("CampaignName")) {
                final Object value = values.remove("CampaignName");
                if ((value == null)||(!value.equals(getCampaignName()))) {
                    setCampaignName(((String) value));
                }
            }
            if (values.containsKey("CampaignDescription")) {
                final Object value = values.remove("CampaignDescription");
                if ((value == null)||(!value.equals(getCampaignDescription()))) {
                    setCampaignDescription(((String) value));
                }
            }
            if (values.containsKey("CampaignScheduleDateTime")) {
                final Object value = values.remove("CampaignScheduleDateTime");
                if ((value == null)||(!value.equals(getCampaignScheduleDateTime()))) {
                    setCampaignScheduleDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("CampaignExecutionFrqcyInterval")) {
                final Object value = values.remove("CampaignExecutionFrqcyInterval");
                if ((value == null)||(!value.equals(getCampaignExecutionFrqcyInterval()))) {
                    setCampaignExecutionFrqcyInterval(((String) value));
                }
            }
            if (values.containsKey("CampaignExecutionFrqcyUnit")) {
                final Object value = values.remove("CampaignExecutionFrqcyUnit");
                if ((value == null)||(!value.equals(getCampaignExecutionFrqcyUnit()))) {
                    setCampaignExecutionFrqcyUnit(((String) value));
                }
            }
            if (values.containsKey("MediaType")) {
                final Object value = values.remove("MediaType");
                if ((value == null)||(!value.equals(getMediaType()))) {
                    setMediaType(((String) value));
                }
            }
            if (values.containsKey("MediaTypeName")) {
                final Object value = values.remove("MediaTypeName");
                if ((value == null)||(!value.equals(getMediaTypeName()))) {
                    setMediaTypeName(((String) value));
                }
            }
            if (values.containsKey("CampaignLifecycleStatus")) {
                final Object value = values.remove("CampaignLifecycleStatus");
                if ((value == null)||(!value.equals(getCampaignLifecycleStatus()))) {
                    setCampaignLifecycleStatus(((String) value));
                }
            }
            if (values.containsKey("CampaignLifecycleStatusName")) {
                final Object value = values.remove("CampaignLifecycleStatusName");
                if ((value == null)||(!value.equals(getCampaignLifecycleStatusName()))) {
                    setCampaignLifecycleStatusName(((String) value));
                }
            }
            if (values.containsKey("CommunicationCategoryUUID")) {
                final Object value = values.remove("CommunicationCategoryUUID");
                if ((value == null)||(!value.equals(getCommunicationCategoryUUID()))) {
                    setCommunicationCategoryUUID(((UUID) value));
                }
            }
            if (values.containsKey("CommunicationCategoryName")) {
                final Object value = values.remove("CommunicationCategoryName");
                if ((value == null)||(!value.equals(getCommunicationCategoryName()))) {
                    setCommunicationCategoryName(((String) value));
                }
            }
            if (values.containsKey("MarketingProgramUUID")) {
                final Object value = values.remove("MarketingProgramUUID");
                if ((value == null)||(!value.equals(getMarketingProgramUUID()))) {
                    setMarketingProgramUUID(((UUID) value));
                }
            }
            if (values.containsKey("MarketingProgramName")) {
                final Object value = values.remove("MarketingProgramName");
                if ((value == null)||(!value.equals(getMarketingProgramName()))) {
                    setMarketingProgramName(((String) value));
                }
            }
            if (values.containsKey("CampaignPriority")) {
                final Object value = values.remove("CampaignPriority");
                if ((value == null)||(!value.equals(getCampaignPriority()))) {
                    setCampaignPriority(((String) value));
                }
            }
            if (values.containsKey("CampaignPriorityName")) {
                final Object value = values.remove("CampaignPriorityName");
                if ((value == null)||(!value.equals(getCampaignPriorityName()))) {
                    setCampaignPriorityName(((String) value));
                }
            }
            if (values.containsKey("MarketingArea")) {
                final Object value = values.remove("MarketingArea");
                if ((value == null)||(!value.equals(getMarketingArea()))) {
                    setMarketingArea(((String) value));
                }
            }
            if (values.containsKey("MarketingAreaName")) {
                final Object value = values.remove("MarketingAreaName");
                if ((value == null)||(!value.equals(getMarketingAreaName()))) {
                    setMarketingAreaName(((String) value));
                }
            }
            if (values.containsKey("CampaignCategory")) {
                final Object value = values.remove("CampaignCategory");
                if ((value == null)||(!value.equals(getCampaignCategory()))) {
                    setCampaignCategory(((String) value));
                }
            }
            if (values.containsKey("CampaignCategoryName")) {
                final Object value = values.remove("CampaignCategoryName");
                if ((value == null)||(!value.equals(getCampaignCategoryName()))) {
                    setCampaignCategoryName(((String) value));
                }
            }
            if (values.containsKey("CampaignStartDate")) {
                final Object value = values.remove("CampaignStartDate");
                if ((value == null)||(!value.equals(getCampaignStartDate()))) {
                    setCampaignStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CampaignEndDate")) {
                final Object value = values.remove("CampaignEndDate");
                if ((value == null)||(!value.equals(getCampaignEndDate()))) {
                    setCampaignEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CreationDateTime")) {
                final Object value = values.remove("CreationDateTime");
                if ((value == null)||(!value.equals(getCreationDateTime()))) {
                    setCreationDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("LastChangeDateTime")) {
                final Object value = values.remove("LastChangeDateTime");
                if ((value == null)||(!value.equals(getLastChangeDateTime()))) {
                    setLastChangeDateTime(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("CampaignOwner")) {
                final Object value = values.remove("CampaignOwner");
                if ((value == null)||(!value.equals(getCampaignOwner()))) {
                    setCampaignOwner(((String) value));
                }
            }
            if (values.containsKey("CampaignOwnerName")) {
                final Object value = values.remove("CampaignOwnerName");
                if ((value == null)||(!value.equals(getCampaignOwnerName()))) {
                    setCampaignOwnerName(((String) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("CreatedByUserName")) {
                final Object value = values.remove("CreatedByUserName");
                if ((value == null)||(!value.equals(getCreatedByUserName()))) {
                    setCreatedByUserName(((String) value));
                }
            }
            if (values.containsKey("LastChangeByUser")) {
                final Object value = values.remove("LastChangeByUser");
                if ((value == null)||(!value.equals(getLastChangeByUser()))) {
                    setLastChangeByUser(((String) value));
                }
            }
            if (values.containsKey("LastChangeByUserName")) {
                final Object value = values.remove("LastChangeByUserName");
                if ((value == null)||(!value.equals(getLastChangeByUserName()))) {
                    setLastChangeByUserName(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("CampaignAssignedTargetGroups")) {
                final Object value = (values).remove("CampaignAssignedTargetGroups");
                if (value instanceof Iterable) {
                    if (toCampaignAssignedTargetGroups == null) {
                        toCampaignAssignedTargetGroups = Lists.newArrayList();
                    } else {
                        toCampaignAssignedTargetGroups = Lists.newArrayList(toCampaignAssignedTargetGroups);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        AssignedTargetGroupEntity entity;
                        if (toCampaignAssignedTargetGroups.size()>i) {
                            entity = toCampaignAssignedTargetGroups.get(i);
                        } else {
                            entity = new AssignedTargetGroupEntity();
                            toCampaignAssignedTargetGroups.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("CampaignAssignedTeamMembers")) {
                final Object value = (values).remove("CampaignAssignedTeamMembers");
                if (value instanceof Iterable) {
                    if (toCampaignAssignedTeamMembers == null) {
                        toCampaignAssignedTeamMembers = Lists.newArrayList();
                    } else {
                        toCampaignAssignedTeamMembers = Lists.newArrayList(toCampaignAssignedTeamMembers);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        TeamMemberEntity entity;
                        if (toCampaignAssignedTeamMembers.size()>i) {
                            entity = toCampaignAssignedTeamMembers.get(i);
                        } else {
                            entity = new TeamMemberEntity();
                            toCampaignAssignedTeamMembers.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("CampaignActualSpend")) {
                final Object value = (values).remove("CampaignActualSpend");
                if (value instanceof Iterable) {
                    if (toCampaignActualSpend == null) {
                        toCampaignActualSpend = Lists.newArrayList();
                    } else {
                        toCampaignActualSpend = Lists.newArrayList(toCampaignActualSpend);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        ActualSpend entity;
                        if (toCampaignActualSpend.size()>i) {
                            entity = toCampaignActualSpend.get(i);
                        } else {
                            entity = new ActualSpend();
                            toCampaignActualSpend.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("CampaignSpendHeader")) {
                final Object value = (values).remove("CampaignSpendHeader");
                if (value instanceof Iterable) {
                    if (toCampaignSpendHeader == null) {
                        toCampaignSpendHeader = Lists.newArrayList();
                    } else {
                        toCampaignSpendHeader = Lists.newArrayList(toCampaignSpendHeader);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SpendHeader entity;
                        if (toCampaignSpendHeader.size()>i) {
                            entity = toCampaignSpendHeader.get(i);
                        } else {
                            entity = new SpendHeader();
                            toCampaignSpendHeader.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("AssignedMarketingAgencies")) {
                final Object value = (values).remove("AssignedMarketingAgencies");
                if (value instanceof Iterable) {
                    if (toAssignedMarketingAgencies == null) {
                        toAssignedMarketingAgencies = Lists.newArrayList();
                    } else {
                        toAssignedMarketingAgencies = Lists.newArrayList(toAssignedMarketingAgencies);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        MarketingAgencyEntity entity;
                        if (toAssignedMarketingAgencies.size()>i) {
                            entity = toAssignedMarketingAgencies.get(i);
                        } else {
                            entity = new MarketingAgencyEntity();
                            toAssignedMarketingAgencies.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("ExternalCampaignReferences")) {
                final Object value = (values).remove("ExternalCampaignReferences");
                if (value instanceof Iterable) {
                    if (toExternalCampaignReferences == null) {
                        toExternalCampaignReferences = Lists.newArrayList();
                    } else {
                        toExternalCampaignReferences = Lists.newArrayList(toExternalCampaignReferences);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        ExternalCampaignReferenceEntity entity;
                        if (toExternalCampaignReferences.size()>i) {
                            entity = toExternalCampaignReferences.get(i);
                        } else {
                            entity = new ExternalCampaignReferenceEntity();
                            toExternalCampaignReferences.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("CampaignAssignedInterests")) {
                final Object value = (values).remove("CampaignAssignedInterests");
                if (value instanceof Iterable) {
                    if (toCampaignAssignedInterests == null) {
                        toCampaignAssignedInterests = Lists.newArrayList();
                    } else {
                        toCampaignAssignedInterests = Lists.newArrayList(toCampaignAssignedInterests);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        InterestEntity entity;
                        if (toCampaignAssignedInterests.size()>i) {
                            entity = toCampaignAssignedInterests.get(i);
                        } else {
                            entity = new InterestEntity();
                            toCampaignAssignedInterests.add(entity);
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
    public static<T >CampaignField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CampaignField<T>(fieldName);
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
    public static<T,DomainT >CampaignField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CampaignField<T>(fieldName, typeConverter);
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
        if (toCampaignAssignedTargetGroups!= null) {
            (values).put("CampaignAssignedTargetGroups", toCampaignAssignedTargetGroups);
        }
        if (toCampaignAssignedTeamMembers!= null) {
            (values).put("CampaignAssignedTeamMembers", toCampaignAssignedTeamMembers);
        }
        if (toCampaignActualSpend!= null) {
            (values).put("CampaignActualSpend", toCampaignActualSpend);
        }
        if (toCampaignSpendHeader!= null) {
            (values).put("CampaignSpendHeader", toCampaignSpendHeader);
        }
        if (toAssignedMarketingAgencies!= null) {
            (values).put("AssignedMarketingAgencies", toAssignedMarketingAgencies);
        }
        if (toExternalCampaignReferences!= null) {
            (values).put("ExternalCampaignReferences", toExternalCampaignReferences);
        }
        if (toCampaignAssignedInterests!= null) {
            (values).put("CampaignAssignedInterests", toCampaignAssignedInterests);
        }
        return values;
    }

    /**
     * Fetches the <b>AssignedTargetGroupEntity</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>CampaignAssignedTargetGroups</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>AssignedTargetGroupEntity</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AssignedTargetGroupEntity> fetchCampaignAssignedTargetGroups()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type AssignedTargetGroupEntity.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CampaignUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(campaignUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("CampaignAssignedTargetGroups");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<AssignedTargetGroupEntity> entityList = result.asList(AssignedTargetGroupEntity.class);
        for (AssignedTargetGroupEntity entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>AssignedTargetGroupEntity</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignAssignedTargetGroups</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedTargetGroups</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>AssignedTargetGroupEntity</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AssignedTargetGroupEntity> getCampaignAssignedTargetGroupsOrFetch()
        throws ODataException
    {
        if (toCampaignAssignedTargetGroups == null) {
            toCampaignAssignedTargetGroups = fetchCampaignAssignedTargetGroups();
        }
        return toCampaignAssignedTargetGroups;
    }

    /**
     * Retrieval of associated <b>AssignedTargetGroupEntity</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignAssignedTargetGroups</b>.
     * <p>
     * If the navigation property for an entity <b>Campaign</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>CampaignAssignedTargetGroups</b> is already loaded, the result will contain the <b>AssignedTargetGroupEntity</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<AssignedTargetGroupEntity>> getCampaignAssignedTargetGroupsIfPresent() {
        return Optional.ofNullable(toCampaignAssignedTargetGroups);
    }

    /**
     * Overwrites the list of associated <b>AssignedTargetGroupEntity</b> entities for the loaded navigation property <b>CampaignAssignedTargetGroups</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedTargetGroups</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>AssignedTargetGroupEntity</b> entities.
     */
    public void setCampaignAssignedTargetGroups(
        @Nonnull
        final List<AssignedTargetGroupEntity> value) {
        if (toCampaignAssignedTargetGroups == null) {
            toCampaignAssignedTargetGroups = Lists.newArrayList();
        }
        toCampaignAssignedTargetGroups.clear();
        toCampaignAssignedTargetGroups.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>AssignedTargetGroupEntity</b> entities. This corresponds to the OData navigation property <b>CampaignAssignedTargetGroups</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedTargetGroups</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>AssignedTargetGroupEntity</b> entities.
     */
    public void addCampaignAssignedTargetGroups(AssignedTargetGroupEntity... entity) {
        if (toCampaignAssignedTargetGroups == null) {
            toCampaignAssignedTargetGroups = Lists.newArrayList();
        }
        toCampaignAssignedTargetGroups.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>TeamMemberEntity</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>CampaignAssignedTeamMembers</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>TeamMemberEntity</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<TeamMemberEntity> fetchCampaignAssignedTeamMembers()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type TeamMemberEntity.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CampaignUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(campaignUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("CampaignAssignedTeamMembers");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<TeamMemberEntity> entityList = result.asList(TeamMemberEntity.class);
        for (TeamMemberEntity entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>TeamMemberEntity</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignAssignedTeamMembers</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedTeamMembers</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>TeamMemberEntity</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<TeamMemberEntity> getCampaignAssignedTeamMembersOrFetch()
        throws ODataException
    {
        if (toCampaignAssignedTeamMembers == null) {
            toCampaignAssignedTeamMembers = fetchCampaignAssignedTeamMembers();
        }
        return toCampaignAssignedTeamMembers;
    }

    /**
     * Retrieval of associated <b>TeamMemberEntity</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignAssignedTeamMembers</b>.
     * <p>
     * If the navigation property for an entity <b>Campaign</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>CampaignAssignedTeamMembers</b> is already loaded, the result will contain the <b>TeamMemberEntity</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<TeamMemberEntity>> getCampaignAssignedTeamMembersIfPresent() {
        return Optional.ofNullable(toCampaignAssignedTeamMembers);
    }

    /**
     * Overwrites the list of associated <b>TeamMemberEntity</b> entities for the loaded navigation property <b>CampaignAssignedTeamMembers</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedTeamMembers</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>TeamMemberEntity</b> entities.
     */
    public void setCampaignAssignedTeamMembers(
        @Nonnull
        final List<TeamMemberEntity> value) {
        if (toCampaignAssignedTeamMembers == null) {
            toCampaignAssignedTeamMembers = Lists.newArrayList();
        }
        toCampaignAssignedTeamMembers.clear();
        toCampaignAssignedTeamMembers.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>TeamMemberEntity</b> entities. This corresponds to the OData navigation property <b>CampaignAssignedTeamMembers</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedTeamMembers</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>TeamMemberEntity</b> entities.
     */
    public void addCampaignAssignedTeamMembers(TeamMemberEntity... entity) {
        if (toCampaignAssignedTeamMembers == null) {
            toCampaignAssignedTeamMembers = Lists.newArrayList();
        }
        toCampaignAssignedTeamMembers.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>ActualSpend</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>CampaignActualSpend</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>ActualSpend</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<ActualSpend> fetchCampaignActualSpend()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type ActualSpend.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CampaignUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(campaignUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("CampaignActualSpend");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<ActualSpend> entityList = result.asList(ActualSpend.class);
        for (ActualSpend entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>ActualSpend</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignActualSpend</b>.
     * <p>
     * If the navigation property <b>CampaignActualSpend</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>ActualSpend</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<ActualSpend> getCampaignActualSpendOrFetch()
        throws ODataException
    {
        if (toCampaignActualSpend == null) {
            toCampaignActualSpend = fetchCampaignActualSpend();
        }
        return toCampaignActualSpend;
    }

    /**
     * Retrieval of associated <b>ActualSpend</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignActualSpend</b>.
     * <p>
     * If the navigation property for an entity <b>Campaign</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>CampaignActualSpend</b> is already loaded, the result will contain the <b>ActualSpend</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<ActualSpend>> getCampaignActualSpendIfPresent() {
        return Optional.ofNullable(toCampaignActualSpend);
    }

    /**
     * Overwrites the list of associated <b>ActualSpend</b> entities for the loaded navigation property <b>CampaignActualSpend</b>.
     * <p>
     * If the navigation property <b>CampaignActualSpend</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>ActualSpend</b> entities.
     */
    public void setCampaignActualSpend(
        @Nonnull
        final List<ActualSpend> value) {
        if (toCampaignActualSpend == null) {
            toCampaignActualSpend = Lists.newArrayList();
        }
        toCampaignActualSpend.clear();
        toCampaignActualSpend.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>ActualSpend</b> entities. This corresponds to the OData navigation property <b>CampaignActualSpend</b>.
     * <p>
     * If the navigation property <b>CampaignActualSpend</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>ActualSpend</b> entities.
     */
    public void addCampaignActualSpend(ActualSpend... entity) {
        if (toCampaignActualSpend == null) {
            toCampaignActualSpend = Lists.newArrayList();
        }
        toCampaignActualSpend.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SpendHeader</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>CampaignSpendHeader</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SpendHeader</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendHeader> fetchCampaignSpendHeader()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SpendHeader.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CampaignUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(campaignUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("CampaignSpendHeader");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SpendHeader> entityList = result.asList(SpendHeader.class);
        for (SpendHeader entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SpendHeader</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignSpendHeader</b>.
     * <p>
     * If the navigation property <b>CampaignSpendHeader</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SpendHeader</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SpendHeader> getCampaignSpendHeaderOrFetch()
        throws ODataException
    {
        if (toCampaignSpendHeader == null) {
            toCampaignSpendHeader = fetchCampaignSpendHeader();
        }
        return toCampaignSpendHeader;
    }

    /**
     * Retrieval of associated <b>SpendHeader</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignSpendHeader</b>.
     * <p>
     * If the navigation property for an entity <b>Campaign</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>CampaignSpendHeader</b> is already loaded, the result will contain the <b>SpendHeader</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SpendHeader>> getCampaignSpendHeaderIfPresent() {
        return Optional.ofNullable(toCampaignSpendHeader);
    }

    /**
     * Overwrites the list of associated <b>SpendHeader</b> entities for the loaded navigation property <b>CampaignSpendHeader</b>.
     * <p>
     * If the navigation property <b>CampaignSpendHeader</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SpendHeader</b> entities.
     */
    public void setCampaignSpendHeader(
        @Nonnull
        final List<SpendHeader> value) {
        if (toCampaignSpendHeader == null) {
            toCampaignSpendHeader = Lists.newArrayList();
        }
        toCampaignSpendHeader.clear();
        toCampaignSpendHeader.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SpendHeader</b> entities. This corresponds to the OData navigation property <b>CampaignSpendHeader</b>.
     * <p>
     * If the navigation property <b>CampaignSpendHeader</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SpendHeader</b> entities.
     */
    public void addCampaignSpendHeader(SpendHeader... entity) {
        if (toCampaignSpendHeader == null) {
            toCampaignSpendHeader = Lists.newArrayList();
        }
        toCampaignSpendHeader.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>MarketingAgencyEntity</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>AssignedMarketingAgencies</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>MarketingAgencyEntity</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<MarketingAgencyEntity> fetchAssignedMarketingAgencies()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type MarketingAgencyEntity.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CampaignUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(campaignUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("AssignedMarketingAgencies");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<MarketingAgencyEntity> entityList = result.asList(MarketingAgencyEntity.class);
        for (MarketingAgencyEntity entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>MarketingAgencyEntity</b> entities (one to many). This corresponds to the OData navigation property <b>AssignedMarketingAgencies</b>.
     * <p>
     * If the navigation property <b>AssignedMarketingAgencies</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>MarketingAgencyEntity</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<MarketingAgencyEntity> getAssignedMarketingAgenciesOrFetch()
        throws ODataException
    {
        if (toAssignedMarketingAgencies == null) {
            toAssignedMarketingAgencies = fetchAssignedMarketingAgencies();
        }
        return toAssignedMarketingAgencies;
    }

    /**
     * Retrieval of associated <b>MarketingAgencyEntity</b> entities (one to many). This corresponds to the OData navigation property <b>AssignedMarketingAgencies</b>.
     * <p>
     * If the navigation property for an entity <b>Campaign</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>AssignedMarketingAgencies</b> is already loaded, the result will contain the <b>MarketingAgencyEntity</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<MarketingAgencyEntity>> getAssignedMarketingAgenciesIfPresent() {
        return Optional.ofNullable(toAssignedMarketingAgencies);
    }

    /**
     * Overwrites the list of associated <b>MarketingAgencyEntity</b> entities for the loaded navigation property <b>AssignedMarketingAgencies</b>.
     * <p>
     * If the navigation property <b>AssignedMarketingAgencies</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>MarketingAgencyEntity</b> entities.
     */
    public void setAssignedMarketingAgencies(
        @Nonnull
        final List<MarketingAgencyEntity> value) {
        if (toAssignedMarketingAgencies == null) {
            toAssignedMarketingAgencies = Lists.newArrayList();
        }
        toAssignedMarketingAgencies.clear();
        toAssignedMarketingAgencies.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>MarketingAgencyEntity</b> entities. This corresponds to the OData navigation property <b>AssignedMarketingAgencies</b>.
     * <p>
     * If the navigation property <b>AssignedMarketingAgencies</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>MarketingAgencyEntity</b> entities.
     */
    public void addAssignedMarketingAgencies(MarketingAgencyEntity... entity) {
        if (toAssignedMarketingAgencies == null) {
            toAssignedMarketingAgencies = Lists.newArrayList();
        }
        toAssignedMarketingAgencies.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>ExternalCampaignReferenceEntity</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>ExternalCampaignReferences</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>ExternalCampaignReferenceEntity</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<ExternalCampaignReferenceEntity> fetchExternalCampaignReferences()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type ExternalCampaignReferenceEntity.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CampaignUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(campaignUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("ExternalCampaignReferences");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<ExternalCampaignReferenceEntity> entityList = result.asList(ExternalCampaignReferenceEntity.class);
        for (ExternalCampaignReferenceEntity entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>ExternalCampaignReferenceEntity</b> entities (one to many). This corresponds to the OData navigation property <b>ExternalCampaignReferences</b>.
     * <p>
     * If the navigation property <b>ExternalCampaignReferences</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>ExternalCampaignReferenceEntity</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<ExternalCampaignReferenceEntity> getExternalCampaignReferencesOrFetch()
        throws ODataException
    {
        if (toExternalCampaignReferences == null) {
            toExternalCampaignReferences = fetchExternalCampaignReferences();
        }
        return toExternalCampaignReferences;
    }

    /**
     * Retrieval of associated <b>ExternalCampaignReferenceEntity</b> entities (one to many). This corresponds to the OData navigation property <b>ExternalCampaignReferences</b>.
     * <p>
     * If the navigation property for an entity <b>Campaign</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>ExternalCampaignReferences</b> is already loaded, the result will contain the <b>ExternalCampaignReferenceEntity</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<ExternalCampaignReferenceEntity>> getExternalCampaignReferencesIfPresent() {
        return Optional.ofNullable(toExternalCampaignReferences);
    }

    /**
     * Overwrites the list of associated <b>ExternalCampaignReferenceEntity</b> entities for the loaded navigation property <b>ExternalCampaignReferences</b>.
     * <p>
     * If the navigation property <b>ExternalCampaignReferences</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>ExternalCampaignReferenceEntity</b> entities.
     */
    public void setExternalCampaignReferences(
        @Nonnull
        final List<ExternalCampaignReferenceEntity> value) {
        if (toExternalCampaignReferences == null) {
            toExternalCampaignReferences = Lists.newArrayList();
        }
        toExternalCampaignReferences.clear();
        toExternalCampaignReferences.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>ExternalCampaignReferenceEntity</b> entities. This corresponds to the OData navigation property <b>ExternalCampaignReferences</b>.
     * <p>
     * If the navigation property <b>ExternalCampaignReferences</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>ExternalCampaignReferenceEntity</b> entities.
     */
    public void addExternalCampaignReferences(ExternalCampaignReferenceEntity... entity) {
        if (toExternalCampaignReferences == null) {
            toExternalCampaignReferences = Lists.newArrayList();
        }
        toExternalCampaignReferences.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>InterestEntity</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>CampaignAssignedInterests</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>InterestEntity</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<InterestEntity> fetchCampaignAssignedInterests()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type InterestEntity.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("CampaignUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(campaignUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("CampaignAssignedInterests");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<InterestEntity> entityList = result.asList(InterestEntity.class);
        for (InterestEntity entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>InterestEntity</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignAssignedInterests</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedInterests</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>InterestEntity</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<InterestEntity> getCampaignAssignedInterestsOrFetch()
        throws ODataException
    {
        if (toCampaignAssignedInterests == null) {
            toCampaignAssignedInterests = fetchCampaignAssignedInterests();
        }
        return toCampaignAssignedInterests;
    }

    /**
     * Retrieval of associated <b>InterestEntity</b> entities (one to many). This corresponds to the OData navigation property <b>CampaignAssignedInterests</b>.
     * <p>
     * If the navigation property for an entity <b>Campaign</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>CampaignAssignedInterests</b> is already loaded, the result will contain the <b>InterestEntity</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<InterestEntity>> getCampaignAssignedInterestsIfPresent() {
        return Optional.ofNullable(toCampaignAssignedInterests);
    }

    /**
     * Overwrites the list of associated <b>InterestEntity</b> entities for the loaded navigation property <b>CampaignAssignedInterests</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedInterests</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>InterestEntity</b> entities.
     */
    public void setCampaignAssignedInterests(
        @Nonnull
        final List<InterestEntity> value) {
        if (toCampaignAssignedInterests == null) {
            toCampaignAssignedInterests = Lists.newArrayList();
        }
        toCampaignAssignedInterests.clear();
        toCampaignAssignedInterests.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>InterestEntity</b> entities. This corresponds to the OData navigation property <b>CampaignAssignedInterests</b>.
     * <p>
     * If the navigation property <b>CampaignAssignedInterests</b> of a queried <b>Campaign</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>InterestEntity</b> entities.
     */
    public void addCampaignAssignedInterests(InterestEntity... entity) {
        if (toCampaignAssignedInterests == null) {
            toCampaignAssignedInterests = Lists.newArrayList();
        }
        toCampaignAssignedInterests.addAll(Lists.newArrayList(entity));
    }


    /**
     * Helper class to allow for fluent creation of Campaign instances.
     * 
     */
    public final static class CampaignBuilder {

        private List<AssignedTargetGroupEntity> toCampaignAssignedTargetGroups = Lists.newArrayList();
        private List<TeamMemberEntity> toCampaignAssignedTeamMembers = Lists.newArrayList();
        private List<ActualSpend> toCampaignActualSpend = Lists.newArrayList();
        private List<SpendHeader> toCampaignSpendHeader = Lists.newArrayList();
        private List<MarketingAgencyEntity> toAssignedMarketingAgencies = Lists.newArrayList();
        private List<ExternalCampaignReferenceEntity> toExternalCampaignReferences = Lists.newArrayList();
        private List<InterestEntity> toCampaignAssignedInterests = Lists.newArrayList();

        private Campaign.CampaignBuilder toCampaignAssignedTargetGroups(final List<AssignedTargetGroupEntity> value) {
            toCampaignAssignedTargetGroups.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>CampaignAssignedTargetGroups</b> for <b>Campaign</b> to multiple <b>AssignedTargetGroupEntity</b>.
         * 
         * @param value
         *     The AssignedTargetGroupEntitys to build this Campaign with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Campaign.CampaignBuilder campaignAssignedTargetGroups(AssignedTargetGroupEntity... value) {
            return toCampaignAssignedTargetGroups(Lists.newArrayList(value));
        }

        private Campaign.CampaignBuilder toCampaignAssignedTeamMembers(final List<TeamMemberEntity> value) {
            toCampaignAssignedTeamMembers.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>CampaignAssignedTeamMembers</b> for <b>Campaign</b> to multiple <b>TeamMemberEntity</b>.
         * 
         * @param value
         *     The TeamMemberEntitys to build this Campaign with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Campaign.CampaignBuilder campaignAssignedTeamMembers(TeamMemberEntity... value) {
            return toCampaignAssignedTeamMembers(Lists.newArrayList(value));
        }

        private Campaign.CampaignBuilder toCampaignActualSpend(final List<ActualSpend> value) {
            toCampaignActualSpend.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>CampaignActualSpend</b> for <b>Campaign</b> to multiple <b>ActualSpend</b>.
         * 
         * @param value
         *     The ActualSpends to build this Campaign with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Campaign.CampaignBuilder campaignActualSpend(ActualSpend... value) {
            return toCampaignActualSpend(Lists.newArrayList(value));
        }

        private Campaign.CampaignBuilder toCampaignSpendHeader(final List<SpendHeader> value) {
            toCampaignSpendHeader.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>CampaignSpendHeader</b> for <b>Campaign</b> to multiple <b>SpendHeader</b>.
         * 
         * @param value
         *     The SpendHeaders to build this Campaign with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Campaign.CampaignBuilder campaignSpendHeader(SpendHeader... value) {
            return toCampaignSpendHeader(Lists.newArrayList(value));
        }

        private Campaign.CampaignBuilder toAssignedMarketingAgencies(final List<MarketingAgencyEntity> value) {
            toAssignedMarketingAgencies.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>AssignedMarketingAgencies</b> for <b>Campaign</b> to multiple <b>MarketingAgencyEntity</b>.
         * 
         * @param value
         *     The MarketingAgencyEntitys to build this Campaign with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Campaign.CampaignBuilder assignedMarketingAgencies(MarketingAgencyEntity... value) {
            return toAssignedMarketingAgencies(Lists.newArrayList(value));
        }

        private Campaign.CampaignBuilder toExternalCampaignReferences(final List<ExternalCampaignReferenceEntity> value) {
            toExternalCampaignReferences.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>ExternalCampaignReferences</b> for <b>Campaign</b> to multiple <b>ExternalCampaignReferenceEntity</b>.
         * 
         * @param value
         *     The ExternalCampaignReferenceEntitys to build this Campaign with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Campaign.CampaignBuilder externalCampaignReferences(ExternalCampaignReferenceEntity... value) {
            return toExternalCampaignReferences(Lists.newArrayList(value));
        }

        private Campaign.CampaignBuilder toCampaignAssignedInterests(final List<InterestEntity> value) {
            toCampaignAssignedInterests.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>CampaignAssignedInterests</b> for <b>Campaign</b> to multiple <b>InterestEntity</b>.
         * 
         * @param value
         *     The InterestEntitys to build this Campaign with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public Campaign.CampaignBuilder campaignAssignedInterests(InterestEntity... value) {
            return toCampaignAssignedInterests(Lists.newArrayList(value));
        }

    }

}
