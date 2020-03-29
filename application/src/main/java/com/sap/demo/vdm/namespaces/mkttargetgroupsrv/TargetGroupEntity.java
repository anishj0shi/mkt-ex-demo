/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv;

import java.time.LocalDateTime;
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
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.field.TargetGroupEntityField;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.link.TargetGroupEntityLink;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable.TargetGroupEntitySelectable;
import com.sap.demo.vdm.services.APIMKTTARGETGROUPSRVService;
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
 * <p>Original entity name from the Odata EDM: <b>TargetGroupEntityType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class TargetGroupEntity
    extends VdmEntity<TargetGroupEntity>
{

    /**
     * Selector for all available fields of TargetGroupEntity.
     * 
     */
    public final static TargetGroupEntitySelectable ALL_FIELDS = new TargetGroupEntitySelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupUUID</b></p><p>The UUID is used to identify an entity type instance in the system. This must be provided when updating or deleting entity type instances.</p>
     * 
     * @return
     *     The API UUID indentifies a specific entity type instance.
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
    public final static TargetGroupEntityField<UUID> TARGET_GROUP_UUID = new TargetGroupEntityField<UUID>("TargetGroupUUID");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TargetGroup</b></p><p>To hold the value of target Group ID.</p>
     * 
     * @return
     *     Indicates the Target Group ID. The taget group ID is 10-digit in length.
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
    public final static TargetGroupEntityField<String> TARGET_GROUP = new TargetGroupEntityField<String>("TargetGroup");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>TargetGroupName</b></p><p>For example: Test_target_group.</p>
     * 
     * @return
     *     Indicates the Target Group name. It can be any valid set of characters.
     */
    @SerializedName("TargetGroupName")
    @JsonProperty("TargetGroupName")
    @Nullable
    @ODataField(odataName = "TargetGroupName")
    private String targetGroupName;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupName</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_NAME = new TargetGroupEntityField<String>("TargetGroupName");
    /**
     * Constraints: Not nullable, Maximum length: 1000 <p>Original property name from the Odata EDM: <b>TargetGroupDescription</b></p><p>For example: Test_target_group_description.</p>
     * 
     * @return
     *     Indicates the Target Group description. It can be any valid set of characters.
     */
    @SerializedName("TargetGroupDescription")
    @JsonProperty("TargetGroupDescription")
    @Nullable
    @ODataField(odataName = "TargetGroupDescription")
    private String targetGroupDescription;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupDescription</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_DESCRIPTION = new TargetGroupEntityField<String>("TargetGroupDescription");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>TargetGroupLifeCycleStatus</b></p><p>For example: Target Group Life Cycle Status.</p>
     * 
     * @return
     *     Indicates the Target Group LifeCycle status. It can be any valid lifecycle status that is defined in the marketing system.
     */
    @SerializedName("TargetGroupLifeCycleStatus")
    @JsonProperty("TargetGroupLifeCycleStatus")
    @Nullable
    @ODataField(odataName = "TargetGroupLifeCycleStatus")
    private String targetGroupLifeCycleStatus;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupLifeCycleStatus</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_LIFE_CYCLE_STATUS = new TargetGroupEntityField<String>("TargetGroupLifeCycleStatus");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupMemberCount</b></p>
     * 
     * @return
     *     Indicates the Target Group member count. It must be an integer.
     */
    @SerializedName("TargetGroupMemberCount")
    @JsonProperty("TargetGroupMemberCount")
    @Nullable
    @ODataField(odataName = "TargetGroupMemberCount")
    private Integer targetGroupMemberCount;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupMemberCount</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<Integer> TARGET_GROUP_MEMBER_COUNT = new TargetGroupEntityField<Integer>("TargetGroupMemberCount");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>ChangedOnDateTime</b></p><p>This field contains the timestamp indicating when object data was last changed.</p>
     * 
     * @return
     *     This is the date on which the object data was last changed.
     */
    @SerializedName("ChangedOnDateTime")
    @JsonProperty("ChangedOnDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ChangedOnDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime changedOnDateTime;
    /**
     * Use with available fluent helpers to apply the <b>ChangedOnDateTime</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<LocalDateTime> CHANGED_ON_DATE_TIME = new TargetGroupEntityField<LocalDateTime>("ChangedOnDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @return
     *     This is the name of the user who last changed the contact data.
     */
    @SerializedName("LastChangedByUser")
    @JsonProperty("LastChangedByUser")
    @Nullable
    @ODataField(odataName = "LastChangedByUser")
    private String lastChangedByUser;
    /**
     * Use with available fluent helpers to apply the <b>LastChangedByUser</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> LAST_CHANGED_BY_USER = new TargetGroupEntityField<String>("LastChangedByUser");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p>
     * 
     * @return
     *     This is the timestamp indicating when the contact was created.
     */
    @SerializedName("CreationDateTime")
    @JsonProperty("CreationDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CreationDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime creationDateTime;
    /**
     * Use with available fluent helpers to apply the <b>CreationDateTime</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<LocalDateTime> CREATION_DATE_TIME = new TargetGroupEntityField<LocalDateTime>("CreationDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p><p>To hold the value of the created by user's ID of a campaign.User ID of the user.</p>
     * 
     * @return
     *     Indicates the User ID of the API service creator.
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
    public final static TargetGroupEntityField<String> CREATED_BY_USER = new TargetGroupEntityField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>TargetGroupMainResponsible</b></p>
     * 
     * @return
     *     Indicates the Target Group owner. It can be any valid set of characters.
     */
    @SerializedName("TargetGroupMainResponsible")
    @JsonProperty("TargetGroupMainResponsible")
    @Nullable
    @ODataField(odataName = "TargetGroupMainResponsible")
    private String targetGroupMainResponsible;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupMainResponsible</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_MAIN_RESPONSIBLE = new TargetGroupEntityField<String>("TargetGroupMainResponsible");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TargetGroupMemberType</b></p><p>It can be any valid member type defined in the marketing system.</p>
     * 
     * @return
     *     Indicates the Target Group Member type.
     */
    @SerializedName("TargetGroupMemberType")
    @JsonProperty("TargetGroupMemberType")
    @Nullable
    @ODataField(odataName = "TargetGroupMemberType")
    private String targetGroupMemberType;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupMemberType</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_MEMBER_TYPE = new TargetGroupEntityField<String>("TargetGroupMemberType");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupMemberTypeName</b></p><p>Any valid member type name, defined in the marketing system.</p>
     * 
     * @return
     *     Indicates the name of the Target Group member type.
     */
    @SerializedName("TargetGroupMemberTypeName")
    @JsonProperty("TargetGroupMemberTypeName")
    @Nullable
    @ODataField(odataName = "TargetGroupMemberTypeName")
    private String targetGroupMemberTypeName;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupMemberTypeName</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_MEMBER_TYPE_NAME = new TargetGroupEntityField<String>("TargetGroupMemberTypeName");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TargetGroupOrigin</b></p>
     * 
     * @return
     *     Indicates the origin of a Target Group. It can be any valid origin defined in the marketing system.
     */
    @SerializedName("TargetGroupOrigin")
    @JsonProperty("TargetGroupOrigin")
    @Nullable
    @ODataField(odataName = "TargetGroupOrigin")
    private String targetGroupOrigin;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupOrigin</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_ORIGIN = new TargetGroupEntityField<String>("TargetGroupOrigin");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupOriginName</b></p><p>Any valid origin name defined in the marketing system.</p>
     * 
     * @return
     *     Indicates the Target Group origin name.
     */
    @SerializedName("TargetGroupOriginName")
    @JsonProperty("TargetGroupOriginName")
    @Nullable
    @ODataField(odataName = "TargetGroupOriginName")
    private String targetGroupOriginName;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupOriginName</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_ORIGIN_NAME = new TargetGroupEntityField<String>("TargetGroupOriginName");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsTargetGroupVersioningActive</b></p><p>Note that if you deselect this indicator, you can still enable versioning for target groups by choosing the appropriate icon on the user interface.This setting does not control the appearance of the button 'Rebuild' within the target group details.If versioning is active, upon rebuilding, the system versionizes the joining and leaving target group members.If versioning is inactive, the current target group members are discarded and re-determined from scratch.</p>
     * 
     * @return
     *     With the standard delivery, versioning is automatically enabled for target groups created in Segmentation. If you do not want to use versioning, deselect this indicator.
     */
    @SerializedName("IsTargetGroupVersioningActive")
    @JsonProperty("IsTargetGroupVersioningActive")
    @Nullable
    @ODataField(odataName = "IsTargetGroupVersioningActive")
    private String isTargetGroupVersioningActive;
    /**
     * Use with available fluent helpers to apply the <b>IsTargetGroupVersioningActive</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> IS_TARGET_GROUP_VERSIONING_ACTIVE = new TargetGroupEntityField<String>("IsTargetGroupVersioningActive");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupVersion</b></p><p>Any valid version defined in the marketing system.</p>
     * 
     * @return
     *     Indicates the version of the Target Group.
     */
    @SerializedName("TargetGroupVersion")
    @JsonProperty("TargetGroupVersion")
    @Nullable
    @ODataField(odataName = "TargetGroupVersion")
    private Integer targetGroupVersion;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupVersion</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<Integer> TARGET_GROUP_VERSION = new TargetGroupEntityField<Integer>("TargetGroupVersion");
    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>TargetGroupLastRebuildDateTime</b></p><p>Indicates the rebuild time stamp of a Target Group.</p>
     * 
     * @return
     *     Indicates the Target Group's last rebuild date and time stamp.
     */
    @SerializedName("TargetGroupLastRebuildDateTime")
    @JsonProperty("TargetGroupLastRebuildDateTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "TargetGroupLastRebuildDateTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime targetGroupLastRebuildDateTime;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupLastRebuildDateTime</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<LocalDateTime> TARGET_GROUP_LAST_REBUILD_DATE_TIME = new TargetGroupEntityField<LocalDateTime>("TargetGroupLastRebuildDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>TargetGroupCategory</b></p><p>Note that if you deselect this indicator, you can still set target groups created in Segmentation to dynamic directly on the user interface, by choosing the appropriate icon.</p>
     * 
     * @return
     *     With the standard delivery, target groups are automatically dynamic when created in Segmentation. If you do not want to use dynamic target groups, deselect this indicator.
     */
    @SerializedName("TargetGroupCategory")
    @JsonProperty("TargetGroupCategory")
    @Nullable
    @ODataField(odataName = "TargetGroupCategory")
    private String targetGroupCategory;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupCategory</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_CATEGORY = new TargetGroupEntityField<String>("TargetGroupCategory");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupCategoryName</b></p><p>Any valid category name defined in the marketing system.</p>
     * 
     * @return
     *     Indicates the name of the Target Group category.
     */
    @SerializedName("TargetGroupCategoryName")
    @JsonProperty("TargetGroupCategoryName")
    @Nullable
    @ODataField(odataName = "TargetGroupCategoryName")
    private String targetGroupCategoryName;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupCategoryName</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_CATEGORY_NAME = new TargetGroupEntityField<String>("TargetGroupCategoryName");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupIsControlGroup</b></p>
     * 
     * @return
     *     A ControlGroup can have multiple target groups assigned to it. A Target Group can be assigned to one Control Group only.
     */
    @SerializedName("TargetGroupIsControlGroup")
    @JsonProperty("TargetGroupIsControlGroup")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "TargetGroupIsControlGroup")
    private Boolean targetGroupIsControlGroup;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupIsControlGroup</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<Boolean> TARGET_GROUP_IS_CONTROL_GROUP = new TargetGroupEntityField<Boolean>("TargetGroupIsControlGroup");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TargetGroupControlGroup</b></p>
     * 
     * @return
     *     Control Group ID of the Target Group
     */
    @SerializedName("TargetGroupControlGroup")
    @JsonProperty("TargetGroupControlGroup")
    @Nullable
    @ODataField(odataName = "TargetGroupControlGroup")
    private String targetGroupControlGroup;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupControlGroup</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_CONTROL_GROUP = new TargetGroupEntityField<String>("TargetGroupControlGroup");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p><p>The marketing area represents an authorization concept in which data access can optionally be controlled based on the responsibilities of the user. Marketing areas can be used to restrict access to instances of an object, such as campaigns, email messages, email  templates, or target groups.Examples of marketing areas are organizational units, product lines, brands, geographical regions, or any other organizational entity.</p>
     * 
     * @return
     *     This field contains the ID of a marketing area.
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
    public final static TargetGroupEntityField<String> MARKETING_AREA = new TargetGroupEntityField<String>("MarketingArea");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>MarketingAreaName</b></p>
     * 
     * @return
     *     The name of the marketing area. For example, Global Marketing Area.
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
    public final static TargetGroupEntityField<String> MARKETING_AREA_NAME = new TargetGroupEntityField<String>("MarketingAreaName");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>SegmentationObject</b></p><p>The segmentation object collects the data sources that define the attribute universe of the segmentation application and follow-up objects, for example, the export definition, or the campaign content in SAP Marketing.In addition, the segmentation object keys are defined in the segmentation object. Follow-up objects, such as the target group in SAP Marketing, can use the segmentation object as process object.</p>
     * 
     * @return
     *     Comprises setup information for segmentation and follow-up actions
     */
    @SerializedName("SegmentationObject")
    @JsonProperty("SegmentationObject")
    @Nullable
    @ODataField(odataName = "SegmentationObject")
    private String segmentationObject;
    /**
     * Use with available fluent helpers to apply the <b>SegmentationObject</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> SEGMENTATION_OBJECT = new TargetGroupEntityField<String>("SegmentationObject");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>SegmentationObjectName</b></p><p>Any valid segmentation object name.</p>
     * 
     * @return
     *     Indicates the segmentation object name.
     */
    @SerializedName("SegmentationObjectName")
    @JsonProperty("SegmentationObjectName")
    @Nullable
    @ODataField(odataName = "SegmentationObjectName")
    private String segmentationObjectName;
    /**
     * Use with available fluent helpers to apply the <b>SegmentationObjectName</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> SEGMENTATION_OBJECT_NAME = new TargetGroupEntityField<String>("SegmentationObjectName");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TargetGroupType</b></p><p>Any valid target group type defined in the marketing system.</p>
     * 
     * @return
     *     Indicates the Target Group type.
     */
    @SerializedName("TargetGroupType")
    @JsonProperty("TargetGroupType")
    @Nullable
    @ODataField(odataName = "TargetGroupType")
    private String targetGroupType;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupType</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_TYPE = new TargetGroupEntityField<String>("TargetGroupType");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupTypeName</b></p><p>Any valid target group type name defined in the marketing system.</p>
     * 
     * @return
     *     Indicates the name of the target group type.
     */
    @SerializedName("TargetGroupTypeName")
    @JsonProperty("TargetGroupTypeName")
    @Nullable
    @ODataField(odataName = "TargetGroupTypeName")
    private String targetGroupTypeName;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupTypeName</b> field to query operations.
     * 
     */
    public final static TargetGroupEntityField<String> TARGET_GROUP_TYPE_NAME = new TargetGroupEntityField<String>("TargetGroupTypeName");
    /**
     * Navigation property <b>TargetGroupInteractionContacts</b> for <b>TargetGroupEntity</b> to multiple <b>TargetGroupInteractionContactEntity</b>.
     * 
     */
    @SerializedName("TargetGroupInteractionContacts")
    @JsonProperty("TargetGroupInteractionContacts")
    @ODataField(odataName = "TargetGroupInteractionContacts")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<TargetGroupInteractionContactEntity> toTargetGroupInteractionContacts;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupInteractionContacts</b> navigation property to query operations.
     * 
     */
    public final static TargetGroupEntityLink<TargetGroupInteractionContactEntity> TO_TARGET_GROUP_INTERACTION_CONTACTS = new TargetGroupEntityLink<TargetGroupInteractionContactEntity>("TargetGroupInteractionContacts");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<TargetGroupEntity> getType() {
        return TargetGroupEntity.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupUUID</b></p><p>The UUID is used to identify an entity type instance in the system. This must be provided when updating or deleting entity type instances.</p>
     * 
     * @param targetGroupUUID
     *     The API UUID indentifies a specific entity type instance.
     */
    public void setTargetGroupUUID(
        @Nullable
        final UUID targetGroupUUID) {
        rememberChangedField("TargetGroupUUID", this.targetGroupUUID);
        this.targetGroupUUID = targetGroupUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TargetGroup</b></p><p>To hold the value of target Group ID.</p>
     * 
     * @param targetGroup
     *     Indicates the Target Group ID. The taget group ID is 10-digit in length.
     */
    public void setTargetGroup(
        @Nullable
        final String targetGroup) {
        rememberChangedField("TargetGroup", this.targetGroup);
        this.targetGroup = targetGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>TargetGroupName</b></p><p>For example: Test_target_group.</p>
     * 
     * @param targetGroupName
     *     Indicates the Target Group name. It can be any valid set of characters.
     */
    public void setTargetGroupName(
        @Nullable
        final String targetGroupName) {
        rememberChangedField("TargetGroupName", this.targetGroupName);
        this.targetGroupName = targetGroupName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1000 <p>Original property name from the Odata EDM: <b>TargetGroupDescription</b></p><p>For example: Test_target_group_description.</p>
     * 
     * @param targetGroupDescription
     *     Indicates the Target Group description. It can be any valid set of characters.
     */
    public void setTargetGroupDescription(
        @Nullable
        final String targetGroupDescription) {
        rememberChangedField("TargetGroupDescription", this.targetGroupDescription);
        this.targetGroupDescription = targetGroupDescription;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>TargetGroupLifeCycleStatus</b></p><p>For example: Target Group Life Cycle Status.</p>
     * 
     * @param targetGroupLifeCycleStatus
     *     Indicates the Target Group LifeCycle status. It can be any valid lifecycle status that is defined in the marketing system.
     */
    public void setTargetGroupLifeCycleStatus(
        @Nullable
        final String targetGroupLifeCycleStatus) {
        rememberChangedField("TargetGroupLifeCycleStatus", this.targetGroupLifeCycleStatus);
        this.targetGroupLifeCycleStatus = targetGroupLifeCycleStatus;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupMemberCount</b></p>
     * 
     * @param targetGroupMemberCount
     *     Indicates the Target Group member count. It must be an integer.
     */
    public void setTargetGroupMemberCount(
        @Nullable
        final Integer targetGroupMemberCount) {
        rememberChangedField("TargetGroupMemberCount", this.targetGroupMemberCount);
        this.targetGroupMemberCount = targetGroupMemberCount;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>ChangedOnDateTime</b></p><p>This field contains the timestamp indicating when object data was last changed.</p>
     * 
     * @param changedOnDateTime
     *     This is the date on which the object data was last changed.
     */
    public void setChangedOnDateTime(
        @Nullable
        final LocalDateTime changedOnDateTime) {
        rememberChangedField("ChangedOnDateTime", this.changedOnDateTime);
        this.changedOnDateTime = changedOnDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @param lastChangedByUser
     *     This is the name of the user who last changed the contact data.
     */
    public void setLastChangedByUser(
        @Nullable
        final String lastChangedByUser) {
        rememberChangedField("LastChangedByUser", this.lastChangedByUser);
        this.lastChangedByUser = lastChangedByUser;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>CreationDateTime</b></p>
     * 
     * @param creationDateTime
     *     This is the timestamp indicating when the contact was created.
     */
    public void setCreationDateTime(
        @Nullable
        final LocalDateTime creationDateTime) {
        rememberChangedField("CreationDateTime", this.creationDateTime);
        this.creationDateTime = creationDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p><p>To hold the value of the created by user's ID of a campaign.User ID of the user.</p>
     * 
     * @param createdByUser
     *     Indicates the User ID of the API service creator.
     */
    public void setCreatedByUser(
        @Nullable
        final String createdByUser) {
        rememberChangedField("CreatedByUser", this.createdByUser);
        this.createdByUser = createdByUser;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>TargetGroupMainResponsible</b></p>
     * 
     * @param targetGroupMainResponsible
     *     Indicates the Target Group owner. It can be any valid set of characters.
     */
    public void setTargetGroupMainResponsible(
        @Nullable
        final String targetGroupMainResponsible) {
        rememberChangedField("TargetGroupMainResponsible", this.targetGroupMainResponsible);
        this.targetGroupMainResponsible = targetGroupMainResponsible;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TargetGroupMemberType</b></p><p>It can be any valid member type defined in the marketing system.</p>
     * 
     * @param targetGroupMemberType
     *     Indicates the Target Group Member type.
     */
    public void setTargetGroupMemberType(
        @Nullable
        final String targetGroupMemberType) {
        rememberChangedField("TargetGroupMemberType", this.targetGroupMemberType);
        this.targetGroupMemberType = targetGroupMemberType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupMemberTypeName</b></p><p>Any valid member type name, defined in the marketing system.</p>
     * 
     * @param targetGroupMemberTypeName
     *     Indicates the name of the Target Group member type.
     */
    public void setTargetGroupMemberTypeName(
        @Nullable
        final String targetGroupMemberTypeName) {
        rememberChangedField("TargetGroupMemberTypeName", this.targetGroupMemberTypeName);
        this.targetGroupMemberTypeName = targetGroupMemberTypeName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TargetGroupOrigin</b></p>
     * 
     * @param targetGroupOrigin
     *     Indicates the origin of a Target Group. It can be any valid origin defined in the marketing system.
     */
    public void setTargetGroupOrigin(
        @Nullable
        final String targetGroupOrigin) {
        rememberChangedField("TargetGroupOrigin", this.targetGroupOrigin);
        this.targetGroupOrigin = targetGroupOrigin;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupOriginName</b></p><p>Any valid origin name defined in the marketing system.</p>
     * 
     * @param targetGroupOriginName
     *     Indicates the Target Group origin name.
     */
    public void setTargetGroupOriginName(
        @Nullable
        final String targetGroupOriginName) {
        rememberChangedField("TargetGroupOriginName", this.targetGroupOriginName);
        this.targetGroupOriginName = targetGroupOriginName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsTargetGroupVersioningActive</b></p><p>Note that if you deselect this indicator, you can still enable versioning for target groups by choosing the appropriate icon on the user interface.This setting does not control the appearance of the button 'Rebuild' within the target group details.If versioning is active, upon rebuilding, the system versionizes the joining and leaving target group members.If versioning is inactive, the current target group members are discarded and re-determined from scratch.</p>
     * 
     * @param isTargetGroupVersioningActive
     *     With the standard delivery, versioning is automatically enabled for target groups created in Segmentation. If you do not want to use versioning, deselect this indicator.
     */
    public void setIsTargetGroupVersioningActive(
        @Nullable
        final String isTargetGroupVersioningActive) {
        rememberChangedField("IsTargetGroupVersioningActive", this.isTargetGroupVersioningActive);
        this.isTargetGroupVersioningActive = isTargetGroupVersioningActive;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupVersion</b></p><p>Any valid version defined in the marketing system.</p>
     * 
     * @param targetGroupVersion
     *     Indicates the version of the Target Group.
     */
    public void setTargetGroupVersion(
        @Nullable
        final Integer targetGroupVersion) {
        rememberChangedField("TargetGroupVersion", this.targetGroupVersion);
        this.targetGroupVersion = targetGroupVersion;
    }

    /**
     * Constraints: Not nullable, Precision: 7 <p>Original property name from the Odata EDM: <b>TargetGroupLastRebuildDateTime</b></p><p>Indicates the rebuild time stamp of a Target Group.</p>
     * 
     * @param targetGroupLastRebuildDateTime
     *     Indicates the Target Group's last rebuild date and time stamp.
     */
    public void setTargetGroupLastRebuildDateTime(
        @Nullable
        final LocalDateTime targetGroupLastRebuildDateTime) {
        rememberChangedField("TargetGroupLastRebuildDateTime", this.targetGroupLastRebuildDateTime);
        this.targetGroupLastRebuildDateTime = targetGroupLastRebuildDateTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>TargetGroupCategory</b></p><p>Note that if you deselect this indicator, you can still set target groups created in Segmentation to dynamic directly on the user interface, by choosing the appropriate icon.</p>
     * 
     * @param targetGroupCategory
     *     With the standard delivery, target groups are automatically dynamic when created in Segmentation. If you do not want to use dynamic target groups, deselect this indicator.
     */
    public void setTargetGroupCategory(
        @Nullable
        final String targetGroupCategory) {
        rememberChangedField("TargetGroupCategory", this.targetGroupCategory);
        this.targetGroupCategory = targetGroupCategory;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupCategoryName</b></p><p>Any valid category name defined in the marketing system.</p>
     * 
     * @param targetGroupCategoryName
     *     Indicates the name of the Target Group category.
     */
    public void setTargetGroupCategoryName(
        @Nullable
        final String targetGroupCategoryName) {
        rememberChangedField("TargetGroupCategoryName", this.targetGroupCategoryName);
        this.targetGroupCategoryName = targetGroupCategoryName;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupIsControlGroup</b></p>
     * 
     * @param targetGroupIsControlGroup
     *     A ControlGroup can have multiple target groups assigned to it. A Target Group can be assigned to one Control Group only.
     */
    public void setTargetGroupIsControlGroup(
        @Nullable
        final Boolean targetGroupIsControlGroup) {
        rememberChangedField("TargetGroupIsControlGroup", this.targetGroupIsControlGroup);
        this.targetGroupIsControlGroup = targetGroupIsControlGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TargetGroupControlGroup</b></p>
     * 
     * @param targetGroupControlGroup
     *     Control Group ID of the Target Group
     */
    public void setTargetGroupControlGroup(
        @Nullable
        final String targetGroupControlGroup) {
        rememberChangedField("TargetGroupControlGroup", this.targetGroupControlGroup);
        this.targetGroupControlGroup = targetGroupControlGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MarketingArea</b></p><p>The marketing area represents an authorization concept in which data access can optionally be controlled based on the responsibilities of the user. Marketing areas can be used to restrict access to instances of an object, such as campaigns, email messages, email  templates, or target groups.Examples of marketing areas are organizational units, product lines, brands, geographical regions, or any other organizational entity.</p>
     * 
     * @param marketingArea
     *     This field contains the ID of a marketing area.
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
     *     The name of the marketing area. For example, Global Marketing Area.
     */
    public void setMarketingAreaName(
        @Nullable
        final String marketingAreaName) {
        rememberChangedField("MarketingAreaName", this.marketingAreaName);
        this.marketingAreaName = marketingAreaName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>SegmentationObject</b></p><p>The segmentation object collects the data sources that define the attribute universe of the segmentation application and follow-up objects, for example, the export definition, or the campaign content in SAP Marketing.In addition, the segmentation object keys are defined in the segmentation object. Follow-up objects, such as the target group in SAP Marketing, can use the segmentation object as process object.</p>
     * 
     * @param segmentationObject
     *     Comprises setup information for segmentation and follow-up actions
     */
    public void setSegmentationObject(
        @Nullable
        final String segmentationObject) {
        rememberChangedField("SegmentationObject", this.segmentationObject);
        this.segmentationObject = segmentationObject;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>SegmentationObjectName</b></p><p>Any valid segmentation object name.</p>
     * 
     * @param segmentationObjectName
     *     Indicates the segmentation object name.
     */
    public void setSegmentationObjectName(
        @Nullable
        final String segmentationObjectName) {
        rememberChangedField("SegmentationObjectName", this.segmentationObjectName);
        this.segmentationObjectName = segmentationObjectName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TargetGroupType</b></p><p>Any valid target group type defined in the marketing system.</p>
     * 
     * @param targetGroupType
     *     Indicates the Target Group type.
     */
    public void setTargetGroupType(
        @Nullable
        final String targetGroupType) {
        rememberChangedField("TargetGroupType", this.targetGroupType);
        this.targetGroupType = targetGroupType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TargetGroupTypeName</b></p><p>Any valid target group type name defined in the marketing system.</p>
     * 
     * @param targetGroupTypeName
     *     Indicates the name of the target group type.
     */
    public void setTargetGroupTypeName(
        @Nullable
        final String targetGroupTypeName) {
        rememberChangedField("TargetGroupTypeName", this.targetGroupTypeName);
        this.targetGroupTypeName = targetGroupTypeName;
    }

    @Override
    protected String getEntityCollection() {
        return "TargetGroups";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("TargetGroupUUID", getTargetGroupUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("TargetGroupUUID", getTargetGroupUUID());
        values.put("TargetGroup", getTargetGroup());
        values.put("TargetGroupName", getTargetGroupName());
        values.put("TargetGroupDescription", getTargetGroupDescription());
        values.put("TargetGroupLifeCycleStatus", getTargetGroupLifeCycleStatus());
        values.put("TargetGroupMemberCount", getTargetGroupMemberCount());
        values.put("ChangedOnDateTime", getChangedOnDateTime());
        values.put("LastChangedByUser", getLastChangedByUser());
        values.put("CreationDateTime", getCreationDateTime());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("TargetGroupMainResponsible", getTargetGroupMainResponsible());
        values.put("TargetGroupMemberType", getTargetGroupMemberType());
        values.put("TargetGroupMemberTypeName", getTargetGroupMemberTypeName());
        values.put("TargetGroupOrigin", getTargetGroupOrigin());
        values.put("TargetGroupOriginName", getTargetGroupOriginName());
        values.put("IsTargetGroupVersioningActive", getIsTargetGroupVersioningActive());
        values.put("TargetGroupVersion", getTargetGroupVersion());
        values.put("TargetGroupLastRebuildDateTime", getTargetGroupLastRebuildDateTime());
        values.put("TargetGroupCategory", getTargetGroupCategory());
        values.put("TargetGroupCategoryName", getTargetGroupCategoryName());
        values.put("TargetGroupIsControlGroup", getTargetGroupIsControlGroup());
        values.put("TargetGroupControlGroup", getTargetGroupControlGroup());
        values.put("MarketingArea", getMarketingArea());
        values.put("MarketingAreaName", getMarketingAreaName());
        values.put("SegmentationObject", getSegmentationObject());
        values.put("SegmentationObjectName", getSegmentationObjectName());
        values.put("TargetGroupType", getTargetGroupType());
        values.put("TargetGroupTypeName", getTargetGroupTypeName());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("TargetGroupUUID")) {
                final Object value = values.remove("TargetGroupUUID");
                if ((value == null)||(!value.equals(getTargetGroupUUID()))) {
                    setTargetGroupUUID(((UUID) value));
                }
            }
            if (values.containsKey("TargetGroup")) {
                final Object value = values.remove("TargetGroup");
                if ((value == null)||(!value.equals(getTargetGroup()))) {
                    setTargetGroup(((String) value));
                }
            }
            if (values.containsKey("TargetGroupName")) {
                final Object value = values.remove("TargetGroupName");
                if ((value == null)||(!value.equals(getTargetGroupName()))) {
                    setTargetGroupName(((String) value));
                }
            }
            if (values.containsKey("TargetGroupDescription")) {
                final Object value = values.remove("TargetGroupDescription");
                if ((value == null)||(!value.equals(getTargetGroupDescription()))) {
                    setTargetGroupDescription(((String) value));
                }
            }
            if (values.containsKey("TargetGroupLifeCycleStatus")) {
                final Object value = values.remove("TargetGroupLifeCycleStatus");
                if ((value == null)||(!value.equals(getTargetGroupLifeCycleStatus()))) {
                    setTargetGroupLifeCycleStatus(((String) value));
                }
            }
            if (values.containsKey("TargetGroupMemberCount")) {
                final Object value = values.remove("TargetGroupMemberCount");
                if ((value == null)||(!value.equals(getTargetGroupMemberCount()))) {
                    setTargetGroupMemberCount(((Integer) value));
                }
            }
            if (values.containsKey("ChangedOnDateTime")) {
                final Object value = values.remove("ChangedOnDateTime");
                if ((value == null)||(!value.equals(getChangedOnDateTime()))) {
                    setChangedOnDateTime(((LocalDateTime) value));
                }
            }
            if (values.containsKey("LastChangedByUser")) {
                final Object value = values.remove("LastChangedByUser");
                if ((value == null)||(!value.equals(getLastChangedByUser()))) {
                    setLastChangedByUser(((String) value));
                }
            }
            if (values.containsKey("CreationDateTime")) {
                final Object value = values.remove("CreationDateTime");
                if ((value == null)||(!value.equals(getCreationDateTime()))) {
                    setCreationDateTime(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("TargetGroupMainResponsible")) {
                final Object value = values.remove("TargetGroupMainResponsible");
                if ((value == null)||(!value.equals(getTargetGroupMainResponsible()))) {
                    setTargetGroupMainResponsible(((String) value));
                }
            }
            if (values.containsKey("TargetGroupMemberType")) {
                final Object value = values.remove("TargetGroupMemberType");
                if ((value == null)||(!value.equals(getTargetGroupMemberType()))) {
                    setTargetGroupMemberType(((String) value));
                }
            }
            if (values.containsKey("TargetGroupMemberTypeName")) {
                final Object value = values.remove("TargetGroupMemberTypeName");
                if ((value == null)||(!value.equals(getTargetGroupMemberTypeName()))) {
                    setTargetGroupMemberTypeName(((String) value));
                }
            }
            if (values.containsKey("TargetGroupOrigin")) {
                final Object value = values.remove("TargetGroupOrigin");
                if ((value == null)||(!value.equals(getTargetGroupOrigin()))) {
                    setTargetGroupOrigin(((String) value));
                }
            }
            if (values.containsKey("TargetGroupOriginName")) {
                final Object value = values.remove("TargetGroupOriginName");
                if ((value == null)||(!value.equals(getTargetGroupOriginName()))) {
                    setTargetGroupOriginName(((String) value));
                }
            }
            if (values.containsKey("IsTargetGroupVersioningActive")) {
                final Object value = values.remove("IsTargetGroupVersioningActive");
                if ((value == null)||(!value.equals(getIsTargetGroupVersioningActive()))) {
                    setIsTargetGroupVersioningActive(((String) value));
                }
            }
            if (values.containsKey("TargetGroupVersion")) {
                final Object value = values.remove("TargetGroupVersion");
                if ((value == null)||(!value.equals(getTargetGroupVersion()))) {
                    setTargetGroupVersion(((Integer) value));
                }
            }
            if (values.containsKey("TargetGroupLastRebuildDateTime")) {
                final Object value = values.remove("TargetGroupLastRebuildDateTime");
                if ((value == null)||(!value.equals(getTargetGroupLastRebuildDateTime()))) {
                    setTargetGroupLastRebuildDateTime(((LocalDateTime) value));
                }
            }
            if (values.containsKey("TargetGroupCategory")) {
                final Object value = values.remove("TargetGroupCategory");
                if ((value == null)||(!value.equals(getTargetGroupCategory()))) {
                    setTargetGroupCategory(((String) value));
                }
            }
            if (values.containsKey("TargetGroupCategoryName")) {
                final Object value = values.remove("TargetGroupCategoryName");
                if ((value == null)||(!value.equals(getTargetGroupCategoryName()))) {
                    setTargetGroupCategoryName(((String) value));
                }
            }
            if (values.containsKey("TargetGroupIsControlGroup")) {
                final Object value = values.remove("TargetGroupIsControlGroup");
                if ((value == null)||(!value.equals(getTargetGroupIsControlGroup()))) {
                    setTargetGroupIsControlGroup(((Boolean) value));
                }
            }
            if (values.containsKey("TargetGroupControlGroup")) {
                final Object value = values.remove("TargetGroupControlGroup");
                if ((value == null)||(!value.equals(getTargetGroupControlGroup()))) {
                    setTargetGroupControlGroup(((String) value));
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
            if (values.containsKey("SegmentationObject")) {
                final Object value = values.remove("SegmentationObject");
                if ((value == null)||(!value.equals(getSegmentationObject()))) {
                    setSegmentationObject(((String) value));
                }
            }
            if (values.containsKey("SegmentationObjectName")) {
                final Object value = values.remove("SegmentationObjectName");
                if ((value == null)||(!value.equals(getSegmentationObjectName()))) {
                    setSegmentationObjectName(((String) value));
                }
            }
            if (values.containsKey("TargetGroupType")) {
                final Object value = values.remove("TargetGroupType");
                if ((value == null)||(!value.equals(getTargetGroupType()))) {
                    setTargetGroupType(((String) value));
                }
            }
            if (values.containsKey("TargetGroupTypeName")) {
                final Object value = values.remove("TargetGroupTypeName");
                if ((value == null)||(!value.equals(getTargetGroupTypeName()))) {
                    setTargetGroupTypeName(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("TargetGroupInteractionContacts")) {
                final Object value = (values).remove("TargetGroupInteractionContacts");
                if (value instanceof Iterable) {
                    if (toTargetGroupInteractionContacts == null) {
                        toTargetGroupInteractionContacts = Lists.newArrayList();
                    } else {
                        toTargetGroupInteractionContacts = Lists.newArrayList(toTargetGroupInteractionContacts);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        TargetGroupInteractionContactEntity entity;
                        if (toTargetGroupInteractionContacts.size()>i) {
                            entity = toTargetGroupInteractionContacts.get(i);
                        } else {
                            entity = new TargetGroupInteractionContactEntity();
                            toTargetGroupInteractionContacts.add(entity);
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
    public static<T >TargetGroupEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new TargetGroupEntityField<T>(fieldName);
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
    public static<T,DomainT >TargetGroupEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new TargetGroupEntityField<T>(fieldName, typeConverter);
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
        return APIMKTTARGETGROUPSRVService.DEFAULT_SERVICE_PATH;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toTargetGroupInteractionContacts!= null) {
            (values).put("TargetGroupInteractionContacts", toTargetGroupInteractionContacts);
        }
        return values;
    }

    /**
     * Fetches the <b>TargetGroupInteractionContactEntity</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>TargetGroupInteractionContacts</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>TargetGroupInteractionContactEntity</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<TargetGroupInteractionContactEntity> fetchTargetGroupInteractionContacts()
        throws ODataException
    {
        final ErpConfigContext erpConfigContext = getErpConfigContext();
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type TargetGroupInteractionContactEntity.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("TargetGroupUUID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.Guid).toUri(targetGroupUUID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("TargetGroupInteractionContacts");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<TargetGroupInteractionContactEntity> entityList = result.asList(TargetGroupInteractionContactEntity.class);
        for (TargetGroupInteractionContactEntity entity: entityList) {
            entity.attachToService(getServicePathForFetch(), erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>TargetGroupInteractionContactEntity</b> entities (one to many). This corresponds to the OData navigation property <b>TargetGroupInteractionContacts</b>.
     * <p>
     * If the navigation property <b>TargetGroupInteractionContacts</b> of a queried <b>TargetGroupEntity</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>TargetGroupInteractionContactEntity</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<TargetGroupInteractionContactEntity> getTargetGroupInteractionContactsOrFetch()
        throws ODataException
    {
        if (toTargetGroupInteractionContacts == null) {
            toTargetGroupInteractionContacts = fetchTargetGroupInteractionContacts();
        }
        return toTargetGroupInteractionContacts;
    }

    /**
     * Retrieval of associated <b>TargetGroupInteractionContactEntity</b> entities (one to many). This corresponds to the OData navigation property <b>TargetGroupInteractionContacts</b>.
     * <p>
     * If the navigation property for an entity <b>TargetGroupEntity</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>TargetGroupInteractionContacts</b> is already loaded, the result will contain the <b>TargetGroupInteractionContactEntity</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<TargetGroupInteractionContactEntity>> getTargetGroupInteractionContactsIfPresent() {
        return Optional.ofNullable(toTargetGroupInteractionContacts);
    }

    /**
     * Overwrites the list of associated <b>TargetGroupInteractionContactEntity</b> entities for the loaded navigation property <b>TargetGroupInteractionContacts</b>.
     * <p>
     * If the navigation property <b>TargetGroupInteractionContacts</b> of a queried <b>TargetGroupEntity</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>TargetGroupInteractionContactEntity</b> entities.
     */
    public void setTargetGroupInteractionContacts(
        @Nonnull
        final List<TargetGroupInteractionContactEntity> value) {
        if (toTargetGroupInteractionContacts == null) {
            toTargetGroupInteractionContacts = Lists.newArrayList();
        }
        toTargetGroupInteractionContacts.clear();
        toTargetGroupInteractionContacts.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>TargetGroupInteractionContactEntity</b> entities. This corresponds to the OData navigation property <b>TargetGroupInteractionContacts</b>.
     * <p>
     * If the navigation property <b>TargetGroupInteractionContacts</b> of a queried <b>TargetGroupEntity</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>TargetGroupInteractionContactEntity</b> entities.
     */
    public void addTargetGroupInteractionContacts(TargetGroupInteractionContactEntity... entity) {
        if (toTargetGroupInteractionContacts == null) {
            toTargetGroupInteractionContacts = Lists.newArrayList();
        }
        toTargetGroupInteractionContacts.addAll(Lists.newArrayList(entity));
    }


    /**
     * Helper class to allow for fluent creation of TargetGroupEntity instances.
     * 
     */
    public final static class TargetGroupEntityBuilder {

        private List<TargetGroupInteractionContactEntity> toTargetGroupInteractionContacts = Lists.newArrayList();

        private TargetGroupEntity.TargetGroupEntityBuilder toTargetGroupInteractionContacts(final List<TargetGroupInteractionContactEntity> value) {
            toTargetGroupInteractionContacts.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>TargetGroupInteractionContacts</b> for <b>TargetGroupEntity</b> to multiple <b>TargetGroupInteractionContactEntity</b>.
         * 
         * @param value
         *     The TargetGroupInteractionContactEntitys to build this TargetGroupEntity with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public TargetGroupEntity.TargetGroupEntityBuilder targetGroupInteractionContacts(TargetGroupInteractionContactEntity... value) {
            return toTargetGroupInteractionContacts(Lists.newArrayList(value));
        }

    }

}
