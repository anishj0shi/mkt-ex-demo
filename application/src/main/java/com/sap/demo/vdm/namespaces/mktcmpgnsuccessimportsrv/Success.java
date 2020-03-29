/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.field.SuccessField;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.selectable.SuccessSelectable;
import com.sap.demo.vdm.services.APIMKTCMPGNSUCCESSIMPORTSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>Success</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Success
    extends VdmEntity<Success>
{

    /**
     * Selector for all available fields of Success.
     * 
     */
    public final static SuccessSelectable ALL_FIELDS = new SuccessSelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignSuccessUUID</b></p><p>Each time you import success data through the Campaign Success Data API (API_MKT_CMPGN_SUCCESS_IMPORT), the system automatically generates a UUID and fills in this field.</p>
     * 
     * @return
     *     A unique key for campaign success data.
     */
    @Key
    @SerializedName("CampaignSuccessUUID")
    @JsonProperty("CampaignSuccessUUID")
    @Nullable
    @ODataField(odataName = "CampaignSuccessUUID")
    private UUID campaignSuccessUUID;
    /**
     * Use with available fluent helpers to apply the <b>CampaignSuccessUUID</b> field to query operations.
     * 
     */
    public final static SuccessField<UUID> CAMPAIGN_SUCCESS_UUID = new SuccessField<UUID>("CampaignSuccessUUID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @return
     *     A unique key for a SAP Marketing Cloud campaign.
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
    public final static SuccessField<UUID> CAMPAIGN_UUID = new SuccessField<UUID>("CampaignUUID");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CampaignID</b></p>
     * 
     * @return
     *     An ID of a campaign.
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
    public final static SuccessField<String> CAMPAIGN_ID = new SuccessField<String>("CampaignID");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CampaignCategoryID</b></p><p>The campaign category represents a group of campaigns that have similar attributes and can perform the same actions.  SAP Marketing Cloud delivers some standard campaign category IDs such as “A1” (Automated Campaign), “A3”(Trigger-Based Campaign), and more.  You can also add your own campaign category through customization.</p>
     * 
     * @return
     *     The category identifier of a campaign.  The value of the campaign category ID is pre-defined by customization.
     */
    @SerializedName("CampaignCategoryID")
    @JsonProperty("CampaignCategoryID")
    @Nullable
    @ODataField(odataName = "CampaignCategoryID")
    private String campaignCategoryID;
    /**
     * Use with available fluent helpers to apply the <b>CampaignCategoryID</b> field to query operations.
     * 
     */
    public final static SuccessField<String> CAMPAIGN_CATEGORY_ID = new SuccessField<String>("CampaignCategoryID");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>ExternalCampaignID</b></p>
     * 
     * @return
     *     The ID of a campaign executed on an external platform assigned to the SAP Marketing Cloud campaign, not supported for campaign targets.
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
    public final static SuccessField<String> EXTERNAL_CAMPAIGN_ID = new SuccessField<String>("ExternalCampaignID");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ExternalCampaignName</b></p>
     * 
     * @return
     *     Name of the external campaign, not supported for campaign targets.
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
    public final static SuccessField<String> EXTERNAL_CAMPAIGN_NAME = new SuccessField<String>("ExternalCampaignName");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>Advertiser</b></p>
     * 
     * @return
     *     Advertiser ID of the external campaign. The advertiser ID is part of the semantical key of the external campaign, not supported for campaign targets.
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
    public final static SuccessField<String> ADVERTISER = new SuccessField<String>("Advertiser");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>AdvertiserName</b></p>
     * 
     * @return
     *     Advertiser name of the external campaign, not supported for campaign targets.
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
    public final static SuccessField<String> ADVERTISER_NAME = new SuccessField<String>("AdvertiserName");
    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>ExternalCmpgnManagingParty</b></p>
     * 
     * @return
     *     ID of the party managing the external campaign. The party ID is part of the semantical key of the external campaign, not supported for campaign targets.
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
    public final static SuccessField<String> EXTERNAL_CMPGN_MANAGING_PARTY = new SuccessField<String>("ExternalCmpgnManagingParty");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ExternalCmpgnManagingPartyName</b></p>
     * 
     * @return
     *     Indicates the external campaign managing party name.
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
    public final static SuccessField<String> EXTERNAL_CMPGN_MANAGING_PARTY_NAME = new SuccessField<String>("ExternalCmpgnManagingPartyName");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>CommunicationMedium</b></p><p>Examples of communication media can be EMAIL, PHONE, WEB, and specific social media channels (to be changed!).You can configure communication media in the configuration activity Manage Interaction Content.</p>
     * 
     * @return
     *     This is a path or channel used for communication or through which an interaction happened.
     */
    @SerializedName("CommunicationMedium")
    @JsonProperty("CommunicationMedium")
    @Nullable
    @ODataField(odataName = "CommunicationMedium")
    private String communicationMedium;
    /**
     * Use with available fluent helpers to apply the <b>CommunicationMedium</b> field to query operations.
     * 
     */
    public final static SuccessField<String> COMMUNICATION_MEDIUM = new SuccessField<String>("CommunicationMedium");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>SuccessDataDate</b></p><p>Example: 2017-08-03T00:00:00</p>
     * 
     * @return
     *     Date the campaign performance measures refer to.
     */
    @SerializedName("SuccessDataDate")
    @JsonProperty("SuccessDataDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "SuccessDataDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime successDataDate;
    /**
     * Use with available fluent helpers to apply the <b>SuccessDataDate</b> field to query operations.
     * 
     */
    public final static SuccessField<LocalDateTime> SUCCESS_DATA_DATE = new SuccessField<LocalDateTime>("SuccessDataDate");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>SuccessDataDateTimeZone</b></p><p>Valid values can be found in the SAP time zone table. The time zone information is customizable through customizing activities.</p>
     * 
     * @return
     *     Time zone of success data date.
     */
    @SerializedName("SuccessDataDateTimeZone")
    @JsonProperty("SuccessDataDateTimeZone")
    @Nullable
    @ODataField(odataName = "SuccessDataDateTimeZone")
    private String successDataDateTimeZone;
    /**
     * Use with available fluent helpers to apply the <b>SuccessDataDateTimeZone</b> field to query operations.
     * 
     */
    public final static SuccessField<String> SUCCESS_DATA_DATE_TIME_ZONE = new SuccessField<String>("SuccessDataDateTimeZone");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>YearWeek</b></p><p>Example:  199102  (the second week of year 1991)</p>
     * 
     * @return
     *     Year and week the campaign performance measures refer to.
     */
    @SerializedName("YearWeek")
    @JsonProperty("YearWeek")
    @Nullable
    @ODataField(odataName = "YearWeek")
    private String yearWeek;
    /**
     * Use with available fluent helpers to apply the <b>YearWeek</b> field to query operations.
     * 
     */
    public final static SuccessField<String> YEAR_WEEK = new SuccessField<String>("YearWeek");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>YearMonth</b></p><p>Example:  201702  (the second month of year 2017)</p>
     * 
     * @return
     *     Year and month the campaign performance measures refer to.
     */
    @SerializedName("YearMonth")
    @JsonProperty("YearMonth")
    @Nullable
    @ODataField(odataName = "YearMonth")
    private String yearMonth;
    /**
     * Use with available fluent helpers to apply the <b>YearMonth</b> field to query operations.
     * 
     */
    public final static SuccessField<String> YEAR_MONTH = new SuccessField<String>("YearMonth");
    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>AdServingSpendAmount</b></p>
     * 
     * @return
     *     Amount spent for ad serving, summed up when aggregated.
     */
    @SerializedName("AdServingSpendAmount")
    @JsonProperty("AdServingSpendAmount")
    @Nullable
    @ODataField(odataName = "AdServingSpendAmount")
    private BigDecimal adServingSpendAmount;
    /**
     * Use with available fluent helpers to apply the <b>AdServingSpendAmount</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> AD_SERVING_SPEND_AMOUNT = new SuccessField<BigDecimal>("AdServingSpendAmount");
    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>SuggestedAdServingSpendAmount</b></p>
     * 
     * @return
     *     Suggested ad serving spend amount for an optimized campaign, typically used with SAP Customer Attribution integration, summed up when aggregated.
     */
    @SerializedName("SuggestedAdServingSpendAmount")
    @JsonProperty("SuggestedAdServingSpendAmount")
    @Nullable
    @ODataField(odataName = "SuggestedAdServingSpendAmount")
    private BigDecimal suggestedAdServingSpendAmount;
    /**
     * Use with available fluent helpers to apply the <b>SuggestedAdServingSpendAmount</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> SUGGESTED_AD_SERVING_SPEND_AMOUNT = new SuccessField<BigDecimal>("SuggestedAdServingSpendAmount");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>AdServingSpendAmtCrcyISOCode</b></p><p>The currency ISO code list is customizable and the input value should come from the value list.</p>
     * 
     * @return
     *     Amount spent for ad serving, summed up when aggregated.
     */
    @SerializedName("AdServingSpendAmtCrcyISOCode")
    @JsonProperty("AdServingSpendAmtCrcyISOCode")
    @Nullable
    @ODataField(odataName = "AdServingSpendAmtCrcyISOCode")
    private String adServingSpendAmtCrcyISOCode;
    /**
     * Use with available fluent helpers to apply the <b>AdServingSpendAmtCrcyISOCode</b> field to query operations.
     * 
     */
    public final static SuccessField<String> AD_SERVING_SPEND_AMT_CRCY_ISO_CODE = new SuccessField<String>("AdServingSpendAmtCrcyISOCode");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>AgeRangeLowerLimit</b></p><p>If the related campaign is targeting people in a certain age group, enter the lower limit of the age range.</p>
     * 
     * @return
     *     The age range that the campaign performance measures refer to.
     */
    @SerializedName("AgeRangeLowerLimit")
    @JsonProperty("AgeRangeLowerLimit")
    @Nullable
    @ODataField(odataName = "AgeRangeLowerLimit")
    private Short ageRangeLowerLimit;
    /**
     * Use with available fluent helpers to apply the <b>AgeRangeLowerLimit</b> field to query operations.
     * 
     */
    public final static SuccessField<Short> AGE_RANGE_LOWER_LIMIT = new SuccessField<Short>("AgeRangeLowerLimit");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>AgeRangeUpperLimit</b></p><p>If the related campaign is targeting people in a certain age group, enter the higher limit of the age range.</p>
     * 
     * @return
     *     The age range that the campaign performance measures refer to.
     */
    @SerializedName("AgeRangeUpperLimit")
    @JsonProperty("AgeRangeUpperLimit")
    @Nullable
    @ODataField(odataName = "AgeRangeUpperLimit")
    private Short ageRangeUpperLimit;
    /**
     * Use with available fluent helpers to apply the <b>AgeRangeUpperLimit</b> field to query operations.
     * 
     */
    public final static SuccessField<Short> AGE_RANGE_UPPER_LIMIT = new SuccessField<Short>("AgeRangeUpperLimit");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>GenderFreeText</b></p><p>This field contains user-definable gender names.User-defined entries must be mapped to SAP internal keys in the Map Free Texts app.</p>
     * 
     * @return
     *     A free text field that specifies the gender of a contact.
     */
    @SerializedName("GenderFreeText")
    @JsonProperty("GenderFreeText")
    @Nullable
    @ODataField(odataName = "GenderFreeText")
    private String genderFreeText;
    /**
     * Use with available fluent helpers to apply the <b>GenderFreeText</b> field to query operations.
     * 
     */
    public final static SuccessField<String> GENDER_FREE_TEXT = new SuccessField<String>("GenderFreeText");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CountryFreeText</b></p><p>The mapping of external values to internal codes is maintained with the Map Free Texts app.</p>
     * 
     * @return
     *     Country code of the campaign performance measures.
     */
    @SerializedName("CountryFreeText")
    @JsonProperty("CountryFreeText")
    @Nullable
    @ODataField(odataName = "CountryFreeText")
    private String countryFreeText;
    /**
     * Use with available fluent helpers to apply the <b>CountryFreeText</b> field to query operations.
     * 
     */
    public final static SuccessField<String> COUNTRY_FREE_TEXT = new SuccessField<String>("CountryFreeText");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>RegionFreeText</b></p><p>The mapping of external values to internal codes is maintained with the Map Free Texts app.</p>
     * 
     * @return
     *     Region code of the campaign performance measures.
     */
    @SerializedName("RegionFreeText")
    @JsonProperty("RegionFreeText")
    @Nullable
    @ODataField(odataName = "RegionFreeText")
    private String regionFreeText;
    /**
     * Use with available fluent helpers to apply the <b>RegionFreeText</b> field to query operations.
     * 
     */
    public final static SuccessField<String> REGION_FREE_TEXT = new SuccessField<String>("RegionFreeText");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionStatus</b></p><p>Mainly used for measures related to business documents such as leads or sales orders to provide a status of the business document.Possible values are: 01 In Process, 02 Released, 03 Completed, 04 Cancelled, 05 Converted, 06 Successful, 07 Unsuccessful, 00 New.</p>
     * 
     * @return
     *     Status code of the interaction the campaign performance measures refer to, not supported for campaign targets.
     */
    @SerializedName("InteractionStatus")
    @JsonProperty("InteractionStatus")
    @Nullable
    @ODataField(odataName = "InteractionStatus")
    private String interactionStatus;
    /**
     * Use with available fluent helpers to apply the <b>InteractionStatus</b> field to query operations.
     * 
     */
    public final static SuccessField<String> INTERACTION_STATUS = new SuccessField<String>("InteractionStatus");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionReason</b></p><p>Mainly provides failure reasons for SAP Marketing Cloud internally executed campaigns such as a failed marketing permission check. Possible values can be looked up and maintained with the Manage Your Solution app.If the interaction type is Appointment, the interaction reason could be Customer_Required, Meeting, and more.</p>
     * 
     * @return
     *     The interaction reason code that the campaign performance measures refer to, not supported for campaign targets.
     */
    @SerializedName("InteractionReason")
    @JsonProperty("InteractionReason")
    @Nullable
    @ODataField(odataName = "InteractionReason")
    private String interactionReason;
    /**
     * Use with available fluent helpers to apply the <b>InteractionReason</b> field to query operations.
     * 
     */
    public final static SuccessField<String> INTERACTION_REASON = new SuccessField<String>("InteractionReason");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionType</b></p><p>Interactions have a direction, inbound or outbound (from contact to system or from system to contact). Additionally, they can have a reason, for example Mailbox is full for the interaction type Soft Bounce.Example: APPOINTMENT_CANCELLDExamples of types of interaction can be website visits, social media posts, likes, web downloads, abandoned shopping carts, or survey responses.</p>
     * 
     * @return
     *     Interaction types define how contacts interact with your company.
     */
    @SerializedName("InteractionType")
    @JsonProperty("InteractionType")
    @Nullable
    @ODataField(odataName = "InteractionType")
    private String interactionType;
    /**
     * Use with available fluent helpers to apply the <b>InteractionType</b> field to query operations.
     * 
     */
    public final static SuccessField<String> INTERACTION_TYPE = new SuccessField<String>("InteractionType");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignContent</b></p>
     * 
     * @return
     *     ID of the related campaign.
     */
    @SerializedName("CampaignContent")
    @JsonProperty("CampaignContent")
    @Nullable
    @ODataField(odataName = "CampaignContent")
    private Integer campaignContent;
    /**
     * Use with available fluent helpers to apply the <b>CampaignContent</b> field to query operations.
     * 
     */
    public final static SuccessField<Integer> CAMPAIGN_CONTENT = new SuccessField<Integer>("CampaignContent");
    /**
     * Constraints: Not nullable, Maximum length: 100 <p>Original property name from the Odata EDM: <b>CampaignContentName</b></p>
     * 
     * @return
     *     Name of the campaign content that the campaign performance measures refer to.
     */
    @SerializedName("CampaignContentName")
    @JsonProperty("CampaignContentName")
    @Nullable
    @ODataField(odataName = "CampaignContentName")
    private String campaignContentName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignContentName</b> field to query operations.
     * 
     */
    public final static SuccessField<String> CAMPAIGN_CONTENT_NAME = new SuccessField<String>("CampaignContentName");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>CampaignContentLinkName</b></p>
     * 
     * @return
     *     Name of the link in the campaign content that the campaign performance measures refer to.
     */
    @SerializedName("CampaignContentLinkName")
    @JsonProperty("CampaignContentLinkName")
    @Nullable
    @ODataField(odataName = "CampaignContentLinkName")
    private String campaignContentLinkName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignContentLinkName</b> field to query operations.
     * 
     */
    public final static SuccessField<String> CAMPAIGN_CONTENT_LINK_NAME = new SuccessField<String>("CampaignContentLinkName");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>CampaignContentLinkAliasName</b></p>
     * 
     * @return
     *     Alias name of the link in the campaign content that the campaign performance measures refer to.
     */
    @SerializedName("CampaignContentLinkAliasName")
    @JsonProperty("CampaignContentLinkAliasName")
    @Nullable
    @ODataField(odataName = "CampaignContentLinkAliasName")
    private String campaignContentLinkAliasName;
    /**
     * Use with available fluent helpers to apply the <b>CampaignContentLinkAliasName</b> field to query operations.
     * 
     */
    public final static SuccessField<String> CAMPAIGN_CONTENT_LINK_ALIAS_NAME = new SuccessField<String>("CampaignContentLinkAliasName");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>DeviceFreeText</b></p>
     * 
     * @return
     *     This field contains the name of the device used in this interaction.
     */
    @SerializedName("DeviceFreeText")
    @JsonProperty("DeviceFreeText")
    @Nullable
    @ODataField(odataName = "DeviceFreeText")
    private String deviceFreeText;
    /**
     * Use with available fluent helpers to apply the <b>DeviceFreeText</b> field to query operations.
     * 
     */
    public final static SuccessField<String> DEVICE_FREE_TEXT = new SuccessField<String>("DeviceFreeText");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>AdNetworkFreeText</b></p><p>The mapping of external values to internal codes is maintained with the Map Free Texts app.</p>
     * 
     * @return
     *     Ad network code of the campaign performance measures.
     */
    @SerializedName("AdNetworkFreeText")
    @JsonProperty("AdNetworkFreeText")
    @Nullable
    @ODataField(odataName = "AdNetworkFreeText")
    private String adNetworkFreeText;
    /**
     * Use with available fluent helpers to apply the <b>AdNetworkFreeText</b> field to query operations.
     * 
     */
    public final static SuccessField<String> AD_NETWORK_FREE_TEXT = new SuccessField<String>("AdNetworkFreeText");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>PaidSearchKeywordText</b></p>
     * 
     * @return
     *     The keyword of a paid search campaign that the campaign performance measures refer to. In standard processes, it is only used for Baidu campaigns.
     */
    @SerializedName("PaidSearchKeywordText")
    @JsonProperty("PaidSearchKeywordText")
    @Nullable
    @ODataField(odataName = "PaidSearchKeywordText")
    private String paidSearchKeywordText;
    /**
     * Use with available fluent helpers to apply the <b>PaidSearchKeywordText</b> field to query operations.
     * 
     */
    public final static SuccessField<String> PAID_SEARCH_KEYWORD_TEXT = new SuccessField<String>("PaidSearchKeywordText");
    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>PaidSearchSearchTermText</b></p>
     * 
     * @return
     *     The search term of a paid search campaign that the campaign performance measures refer to. In standard processes, it is only used for Baidu campaigns.
     */
    @SerializedName("PaidSearchSearchTermText")
    @JsonProperty("PaidSearchSearchTermText")
    @Nullable
    @ODataField(odataName = "PaidSearchSearchTermText")
    private String paidSearchSearchTermText;
    /**
     * Use with available fluent helpers to apply the <b>PaidSearchSearchTermText</b> field to query operations.
     * 
     */
    public final static SuccessField<String> PAID_SEARCH_SEARCH_TERM_TEXT = new SuccessField<String>("PaidSearchSearchTermText");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignReach</b></p><p>Reach is a people centric measure. It is summed up when aggregated. Be careful to combine it with non-person related dimensions, such as time, when importing data as this leads to wrong aggregated values. A combination of people related dimensions, such as gender, is accepted.</p>
     * 
     * @return
     *     The number of unique users who saw the ad.
     */
    @SerializedName("CampaignReach")
    @JsonProperty("CampaignReach")
    @Nullable
    @ODataField(odataName = "CampaignReach")
    private Long campaignReach;
    /**
     * Use with available fluent helpers to apply the <b>CampaignReach</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> CAMPAIGN_REACH = new SuccessField<Long>("CampaignReach");
    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>CampaignReachInPercent</b></p><p>Reach as a percentage is a people centric measure. It is summed up when aggregated. Be careful to combine it with non-person related dimensions, such as time, when importing data as this leads to wrong aggregated values. A combination of people related dimensions, such as gender, is accepted.</p>
     * 
     * @return
     *     The percentage of unique users who saw the ad.
     */
    @SerializedName("CampaignReachInPercent")
    @JsonProperty("CampaignReachInPercent")
    @Nullable
    @ODataField(odataName = "CampaignReachInPercent")
    private BigDecimal campaignReachInPercent;
    /**
     * Use with available fluent helpers to apply the <b>CampaignReachInPercent</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> CAMPAIGN_REACH_IN_PERCENT = new SuccessField<BigDecimal>("CampaignReachInPercent");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfImpressions</b></p>
     * 
     * @return
     *     Number of impressions, summed up when aggregated.
     */
    @SerializedName("NumberOfImpressions")
    @JsonProperty("NumberOfImpressions")
    @Nullable
    @ODataField(odataName = "NumberOfImpressions")
    private Long numberOfImpressions;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfImpressions</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_IMPRESSIONS = new SuccessField<Long>("NumberOfImpressions");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfClicks</b></p>
     * 
     * @return
     *     Number of clicks, summed up when aggregated.
     */
    @SerializedName("NumberOfClicks")
    @JsonProperty("NumberOfClicks")
    @Nullable
    @ODataField(odataName = "NumberOfClicks")
    private Long numberOfClicks;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfClicks</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_CLICKS = new SuccessField<Long>("NumberOfClicks");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfUniqueClicks</b></p><p>For campaigns executed in SAP Marketing Cloud, the number of unique clicks is per content (and not per link in the content or per campaign). It is summed up when aggregated and it is a people centric measure. Be careful to combine it with non-person related dimensions, such as time, when importing data as this leads to wrong aggregated values. A combination of people related dimensions, such as gender, is accepted.</p>
     * 
     * @return
     *     Number of unique clicks, the number of different people that clicked an ad.
     */
    @SerializedName("NumberOfUniqueClicks")
    @JsonProperty("NumberOfUniqueClicks")
    @Nullable
    @ODataField(odataName = "NumberOfUniqueClicks")
    private Long numberOfUniqueClicks;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfUniqueClicks</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_UNIQUE_CLICKS = new SuccessField<Long>("NumberOfUniqueClicks");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfPageLikes</b></p>
     * 
     * @return
     *     Number of page likes as a result of the campaign, typically used for Facebook campaigns, summed up when aggregated.
     */
    @SerializedName("NumberOfPageLikes")
    @JsonProperty("NumberOfPageLikes")
    @Nullable
    @ODataField(odataName = "NumberOfPageLikes")
    private Long numberOfPageLikes;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfPageLikes</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_PAGE_LIKES = new SuccessField<Long>("NumberOfPageLikes");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfPostEngagements</b></p>
     * 
     * @return
     *     Number of engagements with a page post, typically used with Facebook campaigns, summed up when aggregated.
     */
    @SerializedName("NumberOfPostEngagements")
    @JsonProperty("NumberOfPostEngagements")
    @Nullable
    @ODataField(odataName = "NumberOfPostEngagements")
    private Long numberOfPostEngagements;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfPostEngagements</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_POST_ENGAGEMENTS = new SuccessField<Long>("NumberOfPostEngagements");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOfferClaims</b></p>
     * 
     * @return
     *     Number of claims on offers.
     */
    @SerializedName("NumberOfOfferClaims")
    @JsonProperty("NumberOfOfferClaims")
    @Nullable
    @ODataField(odataName = "NumberOfOfferClaims")
    private Long numberOfOfferClaims;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfOfferClaims</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_OFFER_CLAIMS = new SuccessField<Long>("NumberOfOfferClaims");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfVideoViews</b></p>
     * 
     * @return
     *     Number of video views, summed up when aggregated.
     */
    @SerializedName("NumberOfVideoViews")
    @JsonProperty("NumberOfVideoViews")
    @Nullable
    @ODataField(odataName = "NumberOfVideoViews")
    private Long numberOfVideoViews;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfVideoViews</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_VIDEO_VIEWS = new SuccessField<Long>("NumberOfVideoViews");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfWebsiteConversions</b></p>
     * 
     * @return
     *     Number of website conversions attributed to the campaign, typically used for Facebook campaigns, which are summed up when aggregated. For other scenarios there are dedicated measures for the different types of conversions such as number of orders or number of registrations.
     */
    @SerializedName("NumberOfWebsiteConversions")
    @JsonProperty("NumberOfWebsiteConversions")
    @Nullable
    @ODataField(odataName = "NumberOfWebsiteConversions")
    private Long numberOfWebsiteConversions;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfWebsiteConversions</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_WEBSITE_CONVERSIONS = new SuccessField<Long>("NumberOfWebsiteConversions");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfAppInstalls</b></p>
     * 
     * @return
     *     Number of app installs attributed to the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfAppInstalls")
    @JsonProperty("NumberOfAppInstalls")
    @Nullable
    @ODataField(odataName = "NumberOfAppInstalls")
    private Long numberOfAppInstalls;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfAppInstalls</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_APP_INSTALLS = new SuccessField<Long>("NumberOfAppInstalls");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfAppEngagements</b></p>
     * 
     * @return
     *     Number of engagements with a page post, typically used with Facebook campaigns, summed up when aggregated.
     */
    @SerializedName("NumberOfAppEngagements")
    @JsonProperty("NumberOfAppEngagements")
    @Nullable
    @ODataField(odataName = "NumberOfAppEngagements")
    private Long numberOfAppEngagements;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfAppEngagements</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_APP_ENGAGEMENTS = new SuccessField<Long>("NumberOfAppEngagements");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfEventResponses</b></p>
     * 
     * @return
     *     Number of event responses, typically used with Facebook campaigns, which are summed up when aggregated.
     */
    @SerializedName("NumberOfEventResponses")
    @JsonProperty("NumberOfEventResponses")
    @Nullable
    @ODataField(odataName = "NumberOfEventResponses")
    private Long numberOfEventResponses;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfEventResponses</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_EVENT_RESPONSES = new SuccessField<Long>("NumberOfEventResponses");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfRejectedMessages</b></p><p>For campaigns executed in SAP Marketing Cloud, this is the number of messages that have been sent successfully to an external platform, but that have been rejected for any reason by this platform without being counted as hard or soft bounces.</p>
     * 
     * @return
     *     Number of rejected messages, which are summed up when aggregated.
     */
    @SerializedName("NumberOfRejectedMessages")
    @JsonProperty("NumberOfRejectedMessages")
    @Nullable
    @ODataField(odataName = "NumberOfRejectedMessages")
    private Long numberOfRejectedMessages;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfRejectedMessages</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_REJECTED_MESSAGES = new SuccessField<Long>("NumberOfRejectedMessages");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfSentMessages</b></p><p>The type of message, such as email or SMS, is usually given by the communication medium.</p>
     * 
     * @return
     *     Number of messages sent by the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfSentMessages")
    @JsonProperty("NumberOfSentMessages")
    @Nullable
    @ODataField(odataName = "NumberOfSentMessages")
    private Long numberOfSentMessages;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfSentMessages</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_SENT_MESSAGES = new SuccessField<Long>("NumberOfSentMessages");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfDeliveredMessages</b></p><p>For campaigns executed in SAP Marketing Cloud, delivered messages = sent messages - hard and soft bounces - rejected messages.</p>
     * 
     * @return
     *     Number of messages successfully delivered by the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfDeliveredMessages")
    @JsonProperty("NumberOfDeliveredMessages")
    @Nullable
    @ODataField(odataName = "NumberOfDeliveredMessages")
    private Long numberOfDeliveredMessages;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfDeliveredMessages</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_DELIVERED_MESSAGES = new SuccessField<Long>("NumberOfDeliveredMessages");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOpenedMessages</b></p>
     * 
     * @return
     *     Number of opened messages, which are summed up when aggregated.
     */
    @SerializedName("NumberOfOpenedMessages")
    @JsonProperty("NumberOfOpenedMessages")
    @Nullable
    @ODataField(odataName = "NumberOfOpenedMessages")
    private Long numberOfOpenedMessages;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfOpenedMessages</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_OPENED_MESSAGES = new SuccessField<Long>("NumberOfOpenedMessages");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfHardBounces</b></p>
     * 
     * @return
     *     Number of hard bounces for sent messages, which are summed up when aggregated.
     */
    @SerializedName("NumberOfHardBounces")
    @JsonProperty("NumberOfHardBounces")
    @Nullable
    @ODataField(odataName = "NumberOfHardBounces")
    private Long numberOfHardBounces;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfHardBounces</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_HARD_BOUNCES = new SuccessField<Long>("NumberOfHardBounces");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfSoftBounces</b></p>
     * 
     * @return
     *     Number of soft bounces for sent messages, which are summed up when aggregated.
     */
    @SerializedName("NumberOfSoftBounces")
    @JsonProperty("NumberOfSoftBounces")
    @Nullable
    @ODataField(odataName = "NumberOfSoftBounces")
    private Long numberOfSoftBounces;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfSoftBounces</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_SOFT_BOUNCES = new SuccessField<Long>("NumberOfSoftBounces");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOrders</b></p>
     * 
     * @return
     *     Number of orders attributed to the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfOrders")
    @JsonProperty("NumberOfOrders")
    @Nullable
    @ODataField(odataName = "NumberOfOrders")
    private Long numberOfOrders;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfOrders</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_ORDERS = new SuccessField<Long>("NumberOfOrders");
    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>OrderAmount</b></p>
     * 
     * @return
     *     Order amount attributed to the campaign, which is summed up when aggregated.
     */
    @SerializedName("OrderAmount")
    @JsonProperty("OrderAmount")
    @Nullable
    @ODataField(odataName = "OrderAmount")
    private BigDecimal orderAmount;
    /**
     * Use with available fluent helpers to apply the <b>OrderAmount</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> ORDER_AMOUNT = new SuccessField<BigDecimal>("OrderAmount");
    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>MultiTouchAttributedOrderAmt</b></p>
     * 
     * @return
     *     Order amount attributed to the campaign using multi touch attribution, which is summed up when aggregated. This is typically used with the SAP Customer Attribution integration.
     */
    @SerializedName("MultiTouchAttributedOrderAmt")
    @JsonProperty("MultiTouchAttributedOrderAmt")
    @Nullable
    @ODataField(odataName = "MultiTouchAttributedOrderAmt")
    private BigDecimal multiTouchAttributedOrderAmt;
    /**
     * Use with available fluent helpers to apply the <b>MultiTouchAttributedOrderAmt</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> MULTI_TOUCH_ATTRIBUTED_ORDER_AMT = new SuccessField<BigDecimal>("MultiTouchAttributedOrderAmt");
    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>ProjectedOrderAmount</b></p>
     * 
     * @return
     *     Projected order amount that could have been achieved with an optimized campaign, which is summed up when aggregated. This is typically used with SAP Customer Attribution integration.
     */
    @SerializedName("ProjectedOrderAmount")
    @JsonProperty("ProjectedOrderAmount")
    @Nullable
    @ODataField(odataName = "ProjectedOrderAmount")
    private BigDecimal projectedOrderAmount;
    /**
     * Use with available fluent helpers to apply the <b>ProjectedOrderAmount</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> PROJECTED_ORDER_AMOUNT = new SuccessField<BigDecimal>("ProjectedOrderAmount");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrderAmountCurrencyISOCode</b></p><p>The currency ISO code list is customizable and the input value should come from the value list.</p>
     * 
     * @return
     *     Amount spent for ad serving, summed up when aggregated.
     */
    @SerializedName("OrderAmountCurrencyISOCode")
    @JsonProperty("OrderAmountCurrencyISOCode")
    @Nullable
    @ODataField(odataName = "OrderAmountCurrencyISOCode")
    private String orderAmountCurrencyISOCode;
    /**
     * Use with available fluent helpers to apply the <b>OrderAmountCurrencyISOCode</b> field to query operations.
     * 
     */
    public final static SuccessField<String> ORDER_AMOUNT_CURRENCY_ISO_CODE = new SuccessField<String>("OrderAmountCurrencyISOCode");
    /**
     * Constraints: Not nullable, Precision: 19, Scale: 9 <p>Original property name from the Odata EDM: <b>NrOfMultiTchAttrCnvrsns</b></p>
     * 
     * @return
     *     Number of conversions attributed to the campaign using multi touch attribution,which are summed up when aggregated. This is typically used with the SAP Customer Attribution integration.
     */
    @SerializedName("NrOfMultiTchAttrCnvrsns")
    @JsonProperty("NrOfMultiTchAttrCnvrsns")
    @Nullable
    @ODataField(odataName = "NrOfMultiTchAttrCnvrsns")
    private BigDecimal nrOfMultiTchAttrCnvrsns;
    /**
     * Use with available fluent helpers to apply the <b>NrOfMultiTchAttrCnvrsns</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> NR_OF_MULTI_TCH_ATTR_CNVRSNS = new SuccessField<BigDecimal>("NrOfMultiTchAttrCnvrsns");
    /**
     * Constraints: Not nullable, Precision: 19, Scale: 9 <p>Original property name from the Odata EDM: <b>ProjectedNumberOfConversions</b></p>
     * 
     * @return
     *     Projected number of conversions that could have been achieved with an optimized campaign, which is summed up when aggregated. This is typically used with SAP Customer Attribution integration.
     */
    @SerializedName("ProjectedNumberOfConversions")
    @JsonProperty("ProjectedNumberOfConversions")
    @Nullable
    @ODataField(odataName = "ProjectedNumberOfConversions")
    private BigDecimal projectedNumberOfConversions;
    /**
     * Use with available fluent helpers to apply the <b>ProjectedNumberOfConversions</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> PROJECTED_NUMBER_OF_CONVERSIONS = new SuccessField<BigDecimal>("ProjectedNumberOfConversions");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfRegistrations</b></p>
     * 
     * @return
     *     Number of registrations attributed to the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfRegistrations")
    @JsonProperty("NumberOfRegistrations")
    @Nullable
    @ODataField(odataName = "NumberOfRegistrations")
    private Long numberOfRegistrations;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfRegistrations</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_REGISTRATIONS = new SuccessField<Long>("NumberOfRegistrations");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfDownloads</b></p>
     * 
     * @return
     *     Number of downloads attributed to the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfDownloads")
    @JsonProperty("NumberOfDownloads")
    @Nullable
    @ODataField(odataName = "NumberOfDownloads")
    private Long numberOfDownloads;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfDownloads</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_DOWNLOADS = new SuccessField<Long>("NumberOfDownloads");
    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>VideoViewedAverageInPercent</b></p>
     * 
     * @return
     *     Average percentage of video views, which are aggregated as the average and weighted by the number of video views.
     */
    @SerializedName("VideoViewedAverageInPercent")
    @JsonProperty("VideoViewedAverageInPercent")
    @Nullable
    @ODataField(odataName = "VideoViewedAverageInPercent")
    private BigDecimal videoViewedAverageInPercent;
    /**
     * Use with available fluent helpers to apply the <b>VideoViewedAverageInPercent</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> VIDEO_VIEWED_AVERAGE_IN_PERCENT = new SuccessField<BigDecimal>("VideoViewedAverageInPercent");
    /**
     * Constraints: Not nullable, Precision: 15, Scale: 2 <p>Original property name from the Odata EDM: <b>GrossRatingPoints</b></p><p>Be aware that an aggregation of gross rating points with a different gross rating point base doesn't make sense but technically is not prevented.</p>
     * 
     * @return
     *     Gross rating points, which are summed up when aggregated.
     */
    @SerializedName("GrossRatingPoints")
    @JsonProperty("GrossRatingPoints")
    @Nullable
    @ODataField(odataName = "GrossRatingPoints")
    private BigDecimal grossRatingPoints;
    /**
     * Use with available fluent helpers to apply the <b>GrossRatingPoints</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> GROSS_RATING_POINTS = new SuccessField<BigDecimal>("GrossRatingPoints");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>GrossRatingPointBase</b></p>
     * 
     * @return
     *     Base that the gross rating points measure refers to. It typically contains a custom string that describes the audience the gross rating points are related to. It is not supported for campaign targets.
     */
    @SerializedName("GrossRatingPointBase")
    @JsonProperty("GrossRatingPointBase")
    @Nullable
    @ODataField(odataName = "GrossRatingPointBase")
    private String grossRatingPointBase;
    /**
     * Use with available fluent helpers to apply the <b>GrossRatingPointBase</b> field to query operations.
     * 
     */
    public final static SuccessField<String> GROSS_RATING_POINT_BASE = new SuccessField<String>("GrossRatingPointBase");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfLeads</b></p>
     * 
     * @return
     *     Number of leads created as a result of the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfLeads")
    @JsonProperty("NumberOfLeads")
    @Nullable
    @ODataField(odataName = "NumberOfLeads")
    private Long numberOfLeads;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfLeads</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_LEADS = new SuccessField<Long>("NumberOfLeads");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOpportunities</b></p>
     * 
     * @return
     *     Number of opportunities created as a result of the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfOpportunities")
    @JsonProperty("NumberOfOpportunities")
    @Nullable
    @ODataField(odataName = "NumberOfOpportunities")
    private Long numberOfOpportunities;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfOpportunities</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_OPPORTUNITIES = new SuccessField<Long>("NumberOfOpportunities");
    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>OpportunityAmount</b></p>
     * 
     * @return
     *     Opportunity amount attributed to the campaign, which is summed up when aggregated.
     */
    @SerializedName("OpportunityAmount")
    @JsonProperty("OpportunityAmount")
    @Nullable
    @ODataField(odataName = "OpportunityAmount")
    private BigDecimal opportunityAmount;
    /**
     * Use with available fluent helpers to apply the <b>OpportunityAmount</b> field to query operations.
     * 
     */
    public final static SuccessField<BigDecimal> OPPORTUNITY_AMOUNT = new SuccessField<BigDecimal>("OpportunityAmount");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OpportunityAmountCrcyISOCode</b></p><p>The currency ISO code list is customizable and the input value should come from the value list.</p>
     * 
     * @return
     *     Amount spent for ad serving, summed up when aggregated.
     */
    @SerializedName("OpportunityAmountCrcyISOCode")
    @JsonProperty("OpportunityAmountCrcyISOCode")
    @Nullable
    @ODataField(odataName = "OpportunityAmountCrcyISOCode")
    private String opportunityAmountCrcyISOCode;
    /**
     * Use with available fluent helpers to apply the <b>OpportunityAmountCrcyISOCode</b> field to query operations.
     * 
     */
    public final static SuccessField<String> OPPORTUNITY_AMOUNT_CRCY_ISO_CODE = new SuccessField<String>("OpportunityAmountCrcyISOCode");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfPhoneCalls</b></p>
     * 
     * @return
     *     Number of phone calls triggered as a result of the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfPhoneCalls")
    @JsonProperty("NumberOfPhoneCalls")
    @Nullable
    @ODataField(odataName = "NumberOfPhoneCalls")
    private Long numberOfPhoneCalls;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfPhoneCalls</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_PHONE_CALLS = new SuccessField<Long>("NumberOfPhoneCalls");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfAppointments</b></p>
     * 
     * @return
     *     Number of Appointments
     */
    @SerializedName("NumberOfAppointments")
    @JsonProperty("NumberOfAppointments")
    @Nullable
    @ODataField(odataName = "NumberOfAppointments")
    private Long numberOfAppointments;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfAppointments</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_APPOINTMENTS = new SuccessField<Long>("NumberOfAppointments");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfFailedInteractions</b></p><p>For campaigns executed in SAP Marketing Cloud, this is the number of interactions that have been triggered but could not be executed for various reasons such as missing marketing permissions.</p>
     * 
     * @return
     *     Number of failed interactions, which are summed up when aggregated.
     */
    @SerializedName("NumberOfFailedInteractions")
    @JsonProperty("NumberOfFailedInteractions")
    @Nullable
    @ODataField(odataName = "NumberOfFailedInteractions")
    private Long numberOfFailedInteractions;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfFailedInteractions</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_FAILED_INTERACTIONS = new SuccessField<Long>("NumberOfFailedInteractions");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfMarketingOfferViews</b></p>
     * 
     * @return
     *     Number of offer views as a result of the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfMarketingOfferViews")
    @JsonProperty("NumberOfMarketingOfferViews")
    @Nullable
    @ODataField(odataName = "NumberOfMarketingOfferViews")
    private Long numberOfMarketingOfferViews;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfMarketingOfferViews</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_MARKETING_OFFER_VIEWS = new SuccessField<Long>("NumberOfMarketingOfferViews");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfEmailComplaints</b></p>
     * 
     * @return
     *     Number of email complaints and the number of times a mail sent by the campaign was marked as spam, which are summed up when aggregated.
     */
    @SerializedName("NumberOfEmailComplaints")
    @JsonProperty("NumberOfEmailComplaints")
    @Nullable
    @ODataField(odataName = "NumberOfEmailComplaints")
    private Long numberOfEmailComplaints;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfEmailComplaints</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_EMAIL_COMPLAINTS = new SuccessField<Long>("NumberOfEmailComplaints");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NmbrOfOpenChannelInteractions</b></p><p>They are used for campaigns executed in SAP Marketing Cloud that include custom actions that were implemented using the open channel.</p>
     * 
     * @return
     *     Number of open channel interactions, which are summed up when aggregated.
     */
    @SerializedName("NmbrOfOpenChannelInteractions")
    @JsonProperty("NmbrOfOpenChannelInteractions")
    @Nullable
    @ODataField(odataName = "NmbrOfOpenChannelInteractions")
    private Long nmbrOfOpenChannelInteractions;
    /**
     * Use with available fluent helpers to apply the <b>NmbrOfOpenChannelInteractions</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NMBR_OF_OPEN_CHANNEL_INTERACTIONS = new SuccessField<Long>("NmbrOfOpenChannelInteractions");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfExecutedInteractions</b></p>
     * 
     * @return
     *     Number of interactions executed by the SAP Marketing Cloud campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfExecutedInteractions")
    @JsonProperty("NumberOfExecutedInteractions")
    @Nullable
    @ODataField(odataName = "NumberOfExecutedInteractions")
    private Long numberOfExecutedInteractions;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfExecutedInteractions</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_EXECUTED_INTERACTIONS = new SuccessField<Long>("NumberOfExecutedInteractions");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfTasks</b></p><p>Tasks are usually created in a connected CRM system.</p>
     * 
     * @return
     *     Number of tasks triggered as a result of the campaign, which are summed up when aggregated.
     */
    @SerializedName("NumberOfTasks")
    @JsonProperty("NumberOfTasks")
    @Nullable
    @ODataField(odataName = "NumberOfTasks")
    private Long numberOfTasks;
    /**
     * Use with available fluent helpers to apply the <b>NumberOfTasks</b> field to query operations.
     * 
     */
    public final static SuccessField<Long> NUMBER_OF_TASKS = new SuccessField<Long>("NumberOfTasks");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Success> getType() {
        return Success.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignSuccessUUID</b></p><p>Each time you import success data through the Campaign Success Data API (API_MKT_CMPGN_SUCCESS_IMPORT), the system automatically generates a UUID and fills in this field.</p>
     * 
     * @param campaignSuccessUUID
     *     A unique key for campaign success data.
     */
    public void setCampaignSuccessUUID(
        @Nullable
        final UUID campaignSuccessUUID) {
        rememberChangedField("CampaignSuccessUUID", this.campaignSuccessUUID);
        this.campaignSuccessUUID = campaignSuccessUUID;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignUUID</b></p>
     * 
     * @param campaignUUID
     *     A unique key for a SAP Marketing Cloud campaign.
     */
    public void setCampaignUUID(
        @Nullable
        final UUID campaignUUID) {
        rememberChangedField("CampaignUUID", this.campaignUUID);
        this.campaignUUID = campaignUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CampaignID</b></p>
     * 
     * @param campaignID
     *     An ID of a campaign.
     */
    public void setCampaignID(
        @Nullable
        final String campaignID) {
        rememberChangedField("CampaignID", this.campaignID);
        this.campaignID = campaignID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>CampaignCategoryID</b></p><p>The campaign category represents a group of campaigns that have similar attributes and can perform the same actions.  SAP Marketing Cloud delivers some standard campaign category IDs such as “A1” (Automated Campaign), “A3”(Trigger-Based Campaign), and more.  You can also add your own campaign category through customization.</p>
     * 
     * @param campaignCategoryID
     *     The category identifier of a campaign.  The value of the campaign category ID is pre-defined by customization.
     */
    public void setCampaignCategoryID(
        @Nullable
        final String campaignCategoryID) {
        rememberChangedField("CampaignCategoryID", this.campaignCategoryID);
        this.campaignCategoryID = campaignCategoryID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>ExternalCampaignID</b></p>
     * 
     * @param externalCampaignID
     *     The ID of a campaign executed on an external platform assigned to the SAP Marketing Cloud campaign, not supported for campaign targets.
     */
    public void setExternalCampaignID(
        @Nullable
        final String externalCampaignID) {
        rememberChangedField("ExternalCampaignID", this.externalCampaignID);
        this.externalCampaignID = externalCampaignID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>ExternalCampaignName</b></p>
     * 
     * @param externalCampaignName
     *     Name of the external campaign, not supported for campaign targets.
     */
    public void setExternalCampaignName(
        @Nullable
        final String externalCampaignName) {
        rememberChangedField("ExternalCampaignName", this.externalCampaignName);
        this.externalCampaignName = externalCampaignName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 32 <p>Original property name from the Odata EDM: <b>Advertiser</b></p>
     * 
     * @param advertiser
     *     Advertiser ID of the external campaign. The advertiser ID is part of the semantical key of the external campaign, not supported for campaign targets.
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
     *     Advertiser name of the external campaign, not supported for campaign targets.
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
     *     ID of the party managing the external campaign. The party ID is part of the semantical key of the external campaign, not supported for campaign targets.
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
     *     Indicates the external campaign managing party name.
     */
    public void setExternalCmpgnManagingPartyName(
        @Nullable
        final String externalCmpgnManagingPartyName) {
        rememberChangedField("ExternalCmpgnManagingPartyName", this.externalCmpgnManagingPartyName);
        this.externalCmpgnManagingPartyName = externalCmpgnManagingPartyName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>CommunicationMedium</b></p><p>Examples of communication media can be EMAIL, PHONE, WEB, and specific social media channels (to be changed!).You can configure communication media in the configuration activity Manage Interaction Content.</p>
     * 
     * @param communicationMedium
     *     This is a path or channel used for communication or through which an interaction happened.
     */
    public void setCommunicationMedium(
        @Nullable
        final String communicationMedium) {
        rememberChangedField("CommunicationMedium", this.communicationMedium);
        this.communicationMedium = communicationMedium;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>SuccessDataDate</b></p><p>Example: 2017-08-03T00:00:00</p>
     * 
     * @param successDataDate
     *     Date the campaign performance measures refer to.
     */
    public void setSuccessDataDate(
        @Nullable
        final LocalDateTime successDataDate) {
        rememberChangedField("SuccessDataDate", this.successDataDate);
        this.successDataDate = successDataDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>SuccessDataDateTimeZone</b></p><p>Valid values can be found in the SAP time zone table. The time zone information is customizable through customizing activities.</p>
     * 
     * @param successDataDateTimeZone
     *     Time zone of success data date.
     */
    public void setSuccessDataDateTimeZone(
        @Nullable
        final String successDataDateTimeZone) {
        rememberChangedField("SuccessDataDateTimeZone", this.successDataDateTimeZone);
        this.successDataDateTimeZone = successDataDateTimeZone;
    }

    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>YearWeek</b></p><p>Example:  199102  (the second week of year 1991)</p>
     * 
     * @param yearWeek
     *     Year and week the campaign performance measures refer to.
     */
    public void setYearWeek(
        @Nullable
        final String yearWeek) {
        rememberChangedField("YearWeek", this.yearWeek);
        this.yearWeek = yearWeek;
    }

    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>YearMonth</b></p><p>Example:  201702  (the second month of year 2017)</p>
     * 
     * @param yearMonth
     *     Year and month the campaign performance measures refer to.
     */
    public void setYearMonth(
        @Nullable
        final String yearMonth) {
        rememberChangedField("YearMonth", this.yearMonth);
        this.yearMonth = yearMonth;
    }

    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>AdServingSpendAmount</b></p>
     * 
     * @param adServingSpendAmount
     *     Amount spent for ad serving, summed up when aggregated.
     */
    public void setAdServingSpendAmount(
        @Nullable
        final BigDecimal adServingSpendAmount) {
        rememberChangedField("AdServingSpendAmount", this.adServingSpendAmount);
        this.adServingSpendAmount = adServingSpendAmount;
    }

    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>SuggestedAdServingSpendAmount</b></p>
     * 
     * @param suggestedAdServingSpendAmount
     *     Suggested ad serving spend amount for an optimized campaign, typically used with SAP Customer Attribution integration, summed up when aggregated.
     */
    public void setSuggestedAdServingSpendAmount(
        @Nullable
        final BigDecimal suggestedAdServingSpendAmount) {
        rememberChangedField("SuggestedAdServingSpendAmount", this.suggestedAdServingSpendAmount);
        this.suggestedAdServingSpendAmount = suggestedAdServingSpendAmount;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>AdServingSpendAmtCrcyISOCode</b></p><p>The currency ISO code list is customizable and the input value should come from the value list.</p>
     * 
     * @param adServingSpendAmtCrcyISOCode
     *     Amount spent for ad serving, summed up when aggregated.
     */
    public void setAdServingSpendAmtCrcyISOCode(
        @Nullable
        final String adServingSpendAmtCrcyISOCode) {
        rememberChangedField("AdServingSpendAmtCrcyISOCode", this.adServingSpendAmtCrcyISOCode);
        this.adServingSpendAmtCrcyISOCode = adServingSpendAmtCrcyISOCode;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>AgeRangeLowerLimit</b></p><p>If the related campaign is targeting people in a certain age group, enter the lower limit of the age range.</p>
     * 
     * @param ageRangeLowerLimit
     *     The age range that the campaign performance measures refer to.
     */
    public void setAgeRangeLowerLimit(
        @Nullable
        final Short ageRangeLowerLimit) {
        rememberChangedField("AgeRangeLowerLimit", this.ageRangeLowerLimit);
        this.ageRangeLowerLimit = ageRangeLowerLimit;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>AgeRangeUpperLimit</b></p><p>If the related campaign is targeting people in a certain age group, enter the higher limit of the age range.</p>
     * 
     * @param ageRangeUpperLimit
     *     The age range that the campaign performance measures refer to.
     */
    public void setAgeRangeUpperLimit(
        @Nullable
        final Short ageRangeUpperLimit) {
        rememberChangedField("AgeRangeUpperLimit", this.ageRangeUpperLimit);
        this.ageRangeUpperLimit = ageRangeUpperLimit;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>GenderFreeText</b></p><p>This field contains user-definable gender names.User-defined entries must be mapped to SAP internal keys in the Map Free Texts app.</p>
     * 
     * @param genderFreeText
     *     A free text field that specifies the gender of a contact.
     */
    public void setGenderFreeText(
        @Nullable
        final String genderFreeText) {
        rememberChangedField("GenderFreeText", this.genderFreeText);
        this.genderFreeText = genderFreeText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CountryFreeText</b></p><p>The mapping of external values to internal codes is maintained with the Map Free Texts app.</p>
     * 
     * @param countryFreeText
     *     Country code of the campaign performance measures.
     */
    public void setCountryFreeText(
        @Nullable
        final String countryFreeText) {
        rememberChangedField("CountryFreeText", this.countryFreeText);
        this.countryFreeText = countryFreeText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>RegionFreeText</b></p><p>The mapping of external values to internal codes is maintained with the Map Free Texts app.</p>
     * 
     * @param regionFreeText
     *     Region code of the campaign performance measures.
     */
    public void setRegionFreeText(
        @Nullable
        final String regionFreeText) {
        rememberChangedField("RegionFreeText", this.regionFreeText);
        this.regionFreeText = regionFreeText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InteractionStatus</b></p><p>Mainly used for measures related to business documents such as leads or sales orders to provide a status of the business document.Possible values are: 01 In Process, 02 Released, 03 Completed, 04 Cancelled, 05 Converted, 06 Successful, 07 Unsuccessful, 00 New.</p>
     * 
     * @param interactionStatus
     *     Status code of the interaction the campaign performance measures refer to, not supported for campaign targets.
     */
    public void setInteractionStatus(
        @Nullable
        final String interactionStatus) {
        rememberChangedField("InteractionStatus", this.interactionStatus);
        this.interactionStatus = interactionStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionReason</b></p><p>Mainly provides failure reasons for SAP Marketing Cloud internally executed campaigns such as a failed marketing permission check. Possible values can be looked up and maintained with the Manage Your Solution app.If the interaction type is Appointment, the interaction reason could be Customer_Required, Meeting, and more.</p>
     * 
     * @param interactionReason
     *     The interaction reason code that the campaign performance measures refer to, not supported for campaign targets.
     */
    public void setInteractionReason(
        @Nullable
        final String interactionReason) {
        rememberChangedField("InteractionReason", this.interactionReason);
        this.interactionReason = interactionReason;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionType</b></p><p>Interactions have a direction, inbound or outbound (from contact to system or from system to contact). Additionally, they can have a reason, for example Mailbox is full for the interaction type Soft Bounce.Example: APPOINTMENT_CANCELLDExamples of types of interaction can be website visits, social media posts, likes, web downloads, abandoned shopping carts, or survey responses.</p>
     * 
     * @param interactionType
     *     Interaction types define how contacts interact with your company.
     */
    public void setInteractionType(
        @Nullable
        final String interactionType) {
        rememberChangedField("InteractionType", this.interactionType);
        this.interactionType = interactionType;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignContent</b></p>
     * 
     * @param campaignContent
     *     ID of the related campaign.
     */
    public void setCampaignContent(
        @Nullable
        final Integer campaignContent) {
        rememberChangedField("CampaignContent", this.campaignContent);
        this.campaignContent = campaignContent;
    }

    /**
     * Constraints: Not nullable, Maximum length: 100 <p>Original property name from the Odata EDM: <b>CampaignContentName</b></p>
     * 
     * @param campaignContentName
     *     Name of the campaign content that the campaign performance measures refer to.
     */
    public void setCampaignContentName(
        @Nullable
        final String campaignContentName) {
        rememberChangedField("CampaignContentName", this.campaignContentName);
        this.campaignContentName = campaignContentName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>CampaignContentLinkName</b></p>
     * 
     * @param campaignContentLinkName
     *     Name of the link in the campaign content that the campaign performance measures refer to.
     */
    public void setCampaignContentLinkName(
        @Nullable
        final String campaignContentLinkName) {
        rememberChangedField("CampaignContentLinkName", this.campaignContentLinkName);
        this.campaignContentLinkName = campaignContentLinkName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>CampaignContentLinkAliasName</b></p>
     * 
     * @param campaignContentLinkAliasName
     *     Alias name of the link in the campaign content that the campaign performance measures refer to.
     */
    public void setCampaignContentLinkAliasName(
        @Nullable
        final String campaignContentLinkAliasName) {
        rememberChangedField("CampaignContentLinkAliasName", this.campaignContentLinkAliasName);
        this.campaignContentLinkAliasName = campaignContentLinkAliasName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>DeviceFreeText</b></p>
     * 
     * @param deviceFreeText
     *     This field contains the name of the device used in this interaction.
     */
    public void setDeviceFreeText(
        @Nullable
        final String deviceFreeText) {
        rememberChangedField("DeviceFreeText", this.deviceFreeText);
        this.deviceFreeText = deviceFreeText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>AdNetworkFreeText</b></p><p>The mapping of external values to internal codes is maintained with the Map Free Texts app.</p>
     * 
     * @param adNetworkFreeText
     *     Ad network code of the campaign performance measures.
     */
    public void setAdNetworkFreeText(
        @Nullable
        final String adNetworkFreeText) {
        rememberChangedField("AdNetworkFreeText", this.adNetworkFreeText);
        this.adNetworkFreeText = adNetworkFreeText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>PaidSearchKeywordText</b></p>
     * 
     * @param paidSearchKeywordText
     *     The keyword of a paid search campaign that the campaign performance measures refer to. In standard processes, it is only used for Baidu campaigns.
     */
    public void setPaidSearchKeywordText(
        @Nullable
        final String paidSearchKeywordText) {
        rememberChangedField("PaidSearchKeywordText", this.paidSearchKeywordText);
        this.paidSearchKeywordText = paidSearchKeywordText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 120 <p>Original property name from the Odata EDM: <b>PaidSearchSearchTermText</b></p>
     * 
     * @param paidSearchSearchTermText
     *     The search term of a paid search campaign that the campaign performance measures refer to. In standard processes, it is only used for Baidu campaigns.
     */
    public void setPaidSearchSearchTermText(
        @Nullable
        final String paidSearchSearchTermText) {
        rememberChangedField("PaidSearchSearchTermText", this.paidSearchSearchTermText);
        this.paidSearchSearchTermText = paidSearchSearchTermText;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>CampaignReach</b></p><p>Reach is a people centric measure. It is summed up when aggregated. Be careful to combine it with non-person related dimensions, such as time, when importing data as this leads to wrong aggregated values. A combination of people related dimensions, such as gender, is accepted.</p>
     * 
     * @param campaignReach
     *     The number of unique users who saw the ad.
     */
    public void setCampaignReach(
        @Nullable
        final Long campaignReach) {
        rememberChangedField("CampaignReach", this.campaignReach);
        this.campaignReach = campaignReach;
    }

    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>CampaignReachInPercent</b></p><p>Reach as a percentage is a people centric measure. It is summed up when aggregated. Be careful to combine it with non-person related dimensions, such as time, when importing data as this leads to wrong aggregated values. A combination of people related dimensions, such as gender, is accepted.</p>
     * 
     * @param campaignReachInPercent
     *     The percentage of unique users who saw the ad.
     */
    public void setCampaignReachInPercent(
        @Nullable
        final BigDecimal campaignReachInPercent) {
        rememberChangedField("CampaignReachInPercent", this.campaignReachInPercent);
        this.campaignReachInPercent = campaignReachInPercent;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfImpressions</b></p>
     * 
     * @param numberOfImpressions
     *     Number of impressions, summed up when aggregated.
     */
    public void setNumberOfImpressions(
        @Nullable
        final Long numberOfImpressions) {
        rememberChangedField("NumberOfImpressions", this.numberOfImpressions);
        this.numberOfImpressions = numberOfImpressions;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfClicks</b></p>
     * 
     * @param numberOfClicks
     *     Number of clicks, summed up when aggregated.
     */
    public void setNumberOfClicks(
        @Nullable
        final Long numberOfClicks) {
        rememberChangedField("NumberOfClicks", this.numberOfClicks);
        this.numberOfClicks = numberOfClicks;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfUniqueClicks</b></p><p>For campaigns executed in SAP Marketing Cloud, the number of unique clicks is per content (and not per link in the content or per campaign). It is summed up when aggregated and it is a people centric measure. Be careful to combine it with non-person related dimensions, such as time, when importing data as this leads to wrong aggregated values. A combination of people related dimensions, such as gender, is accepted.</p>
     * 
     * @param numberOfUniqueClicks
     *     Number of unique clicks, the number of different people that clicked an ad.
     */
    public void setNumberOfUniqueClicks(
        @Nullable
        final Long numberOfUniqueClicks) {
        rememberChangedField("NumberOfUniqueClicks", this.numberOfUniqueClicks);
        this.numberOfUniqueClicks = numberOfUniqueClicks;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfPageLikes</b></p>
     * 
     * @param numberOfPageLikes
     *     Number of page likes as a result of the campaign, typically used for Facebook campaigns, summed up when aggregated.
     */
    public void setNumberOfPageLikes(
        @Nullable
        final Long numberOfPageLikes) {
        rememberChangedField("NumberOfPageLikes", this.numberOfPageLikes);
        this.numberOfPageLikes = numberOfPageLikes;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfPostEngagements</b></p>
     * 
     * @param numberOfPostEngagements
     *     Number of engagements with a page post, typically used with Facebook campaigns, summed up when aggregated.
     */
    public void setNumberOfPostEngagements(
        @Nullable
        final Long numberOfPostEngagements) {
        rememberChangedField("NumberOfPostEngagements", this.numberOfPostEngagements);
        this.numberOfPostEngagements = numberOfPostEngagements;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOfferClaims</b></p>
     * 
     * @param numberOfOfferClaims
     *     Number of claims on offers.
     */
    public void setNumberOfOfferClaims(
        @Nullable
        final Long numberOfOfferClaims) {
        rememberChangedField("NumberOfOfferClaims", this.numberOfOfferClaims);
        this.numberOfOfferClaims = numberOfOfferClaims;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfVideoViews</b></p>
     * 
     * @param numberOfVideoViews
     *     Number of video views, summed up when aggregated.
     */
    public void setNumberOfVideoViews(
        @Nullable
        final Long numberOfVideoViews) {
        rememberChangedField("NumberOfVideoViews", this.numberOfVideoViews);
        this.numberOfVideoViews = numberOfVideoViews;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfWebsiteConversions</b></p>
     * 
     * @param numberOfWebsiteConversions
     *     Number of website conversions attributed to the campaign, typically used for Facebook campaigns, which are summed up when aggregated. For other scenarios there are dedicated measures for the different types of conversions such as number of orders or number of registrations.
     */
    public void setNumberOfWebsiteConversions(
        @Nullable
        final Long numberOfWebsiteConversions) {
        rememberChangedField("NumberOfWebsiteConversions", this.numberOfWebsiteConversions);
        this.numberOfWebsiteConversions = numberOfWebsiteConversions;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfAppInstalls</b></p>
     * 
     * @param numberOfAppInstalls
     *     Number of app installs attributed to the campaign, which are summed up when aggregated.
     */
    public void setNumberOfAppInstalls(
        @Nullable
        final Long numberOfAppInstalls) {
        rememberChangedField("NumberOfAppInstalls", this.numberOfAppInstalls);
        this.numberOfAppInstalls = numberOfAppInstalls;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfAppEngagements</b></p>
     * 
     * @param numberOfAppEngagements
     *     Number of engagements with a page post, typically used with Facebook campaigns, summed up when aggregated.
     */
    public void setNumberOfAppEngagements(
        @Nullable
        final Long numberOfAppEngagements) {
        rememberChangedField("NumberOfAppEngagements", this.numberOfAppEngagements);
        this.numberOfAppEngagements = numberOfAppEngagements;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfEventResponses</b></p>
     * 
     * @param numberOfEventResponses
     *     Number of event responses, typically used with Facebook campaigns, which are summed up when aggregated.
     */
    public void setNumberOfEventResponses(
        @Nullable
        final Long numberOfEventResponses) {
        rememberChangedField("NumberOfEventResponses", this.numberOfEventResponses);
        this.numberOfEventResponses = numberOfEventResponses;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfRejectedMessages</b></p><p>For campaigns executed in SAP Marketing Cloud, this is the number of messages that have been sent successfully to an external platform, but that have been rejected for any reason by this platform without being counted as hard or soft bounces.</p>
     * 
     * @param numberOfRejectedMessages
     *     Number of rejected messages, which are summed up when aggregated.
     */
    public void setNumberOfRejectedMessages(
        @Nullable
        final Long numberOfRejectedMessages) {
        rememberChangedField("NumberOfRejectedMessages", this.numberOfRejectedMessages);
        this.numberOfRejectedMessages = numberOfRejectedMessages;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfSentMessages</b></p><p>The type of message, such as email or SMS, is usually given by the communication medium.</p>
     * 
     * @param numberOfSentMessages
     *     Number of messages sent by the campaign, which are summed up when aggregated.
     */
    public void setNumberOfSentMessages(
        @Nullable
        final Long numberOfSentMessages) {
        rememberChangedField("NumberOfSentMessages", this.numberOfSentMessages);
        this.numberOfSentMessages = numberOfSentMessages;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfDeliveredMessages</b></p><p>For campaigns executed in SAP Marketing Cloud, delivered messages = sent messages - hard and soft bounces - rejected messages.</p>
     * 
     * @param numberOfDeliveredMessages
     *     Number of messages successfully delivered by the campaign, which are summed up when aggregated.
     */
    public void setNumberOfDeliveredMessages(
        @Nullable
        final Long numberOfDeliveredMessages) {
        rememberChangedField("NumberOfDeliveredMessages", this.numberOfDeliveredMessages);
        this.numberOfDeliveredMessages = numberOfDeliveredMessages;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOpenedMessages</b></p>
     * 
     * @param numberOfOpenedMessages
     *     Number of opened messages, which are summed up when aggregated.
     */
    public void setNumberOfOpenedMessages(
        @Nullable
        final Long numberOfOpenedMessages) {
        rememberChangedField("NumberOfOpenedMessages", this.numberOfOpenedMessages);
        this.numberOfOpenedMessages = numberOfOpenedMessages;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfHardBounces</b></p>
     * 
     * @param numberOfHardBounces
     *     Number of hard bounces for sent messages, which are summed up when aggregated.
     */
    public void setNumberOfHardBounces(
        @Nullable
        final Long numberOfHardBounces) {
        rememberChangedField("NumberOfHardBounces", this.numberOfHardBounces);
        this.numberOfHardBounces = numberOfHardBounces;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfSoftBounces</b></p>
     * 
     * @param numberOfSoftBounces
     *     Number of soft bounces for sent messages, which are summed up when aggregated.
     */
    public void setNumberOfSoftBounces(
        @Nullable
        final Long numberOfSoftBounces) {
        rememberChangedField("NumberOfSoftBounces", this.numberOfSoftBounces);
        this.numberOfSoftBounces = numberOfSoftBounces;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOrders</b></p>
     * 
     * @param numberOfOrders
     *     Number of orders attributed to the campaign, which are summed up when aggregated.
     */
    public void setNumberOfOrders(
        @Nullable
        final Long numberOfOrders) {
        rememberChangedField("NumberOfOrders", this.numberOfOrders);
        this.numberOfOrders = numberOfOrders;
    }

    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>OrderAmount</b></p>
     * 
     * @param orderAmount
     *     Order amount attributed to the campaign, which is summed up when aggregated.
     */
    public void setOrderAmount(
        @Nullable
        final BigDecimal orderAmount) {
        rememberChangedField("OrderAmount", this.orderAmount);
        this.orderAmount = orderAmount;
    }

    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>MultiTouchAttributedOrderAmt</b></p>
     * 
     * @param multiTouchAttributedOrderAmt
     *     Order amount attributed to the campaign using multi touch attribution, which is summed up when aggregated. This is typically used with the SAP Customer Attribution integration.
     */
    public void setMultiTouchAttributedOrderAmt(
        @Nullable
        final BigDecimal multiTouchAttributedOrderAmt) {
        rememberChangedField("MultiTouchAttributedOrderAmt", this.multiTouchAttributedOrderAmt);
        this.multiTouchAttributedOrderAmt = multiTouchAttributedOrderAmt;
    }

    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>ProjectedOrderAmount</b></p>
     * 
     * @param projectedOrderAmount
     *     Projected order amount that could have been achieved with an optimized campaign, which is summed up when aggregated. This is typically used with SAP Customer Attribution integration.
     */
    public void setProjectedOrderAmount(
        @Nullable
        final BigDecimal projectedOrderAmount) {
        rememberChangedField("ProjectedOrderAmount", this.projectedOrderAmount);
        this.projectedOrderAmount = projectedOrderAmount;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrderAmountCurrencyISOCode</b></p><p>The currency ISO code list is customizable and the input value should come from the value list.</p>
     * 
     * @param orderAmountCurrencyISOCode
     *     Amount spent for ad serving, summed up when aggregated.
     */
    public void setOrderAmountCurrencyISOCode(
        @Nullable
        final String orderAmountCurrencyISOCode) {
        rememberChangedField("OrderAmountCurrencyISOCode", this.orderAmountCurrencyISOCode);
        this.orderAmountCurrencyISOCode = orderAmountCurrencyISOCode;
    }

    /**
     * Constraints: Not nullable, Precision: 19, Scale: 9 <p>Original property name from the Odata EDM: <b>NrOfMultiTchAttrCnvrsns</b></p>
     * 
     * @param nrOfMultiTchAttrCnvrsns
     *     Number of conversions attributed to the campaign using multi touch attribution,which are summed up when aggregated. This is typically used with the SAP Customer Attribution integration.
     */
    public void setNrOfMultiTchAttrCnvrsns(
        @Nullable
        final BigDecimal nrOfMultiTchAttrCnvrsns) {
        rememberChangedField("NrOfMultiTchAttrCnvrsns", this.nrOfMultiTchAttrCnvrsns);
        this.nrOfMultiTchAttrCnvrsns = nrOfMultiTchAttrCnvrsns;
    }

    /**
     * Constraints: Not nullable, Precision: 19, Scale: 9 <p>Original property name from the Odata EDM: <b>ProjectedNumberOfConversions</b></p>
     * 
     * @param projectedNumberOfConversions
     *     Projected number of conversions that could have been achieved with an optimized campaign, which is summed up when aggregated. This is typically used with SAP Customer Attribution integration.
     */
    public void setProjectedNumberOfConversions(
        @Nullable
        final BigDecimal projectedNumberOfConversions) {
        rememberChangedField("ProjectedNumberOfConversions", this.projectedNumberOfConversions);
        this.projectedNumberOfConversions = projectedNumberOfConversions;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfRegistrations</b></p>
     * 
     * @param numberOfRegistrations
     *     Number of registrations attributed to the campaign, which are summed up when aggregated.
     */
    public void setNumberOfRegistrations(
        @Nullable
        final Long numberOfRegistrations) {
        rememberChangedField("NumberOfRegistrations", this.numberOfRegistrations);
        this.numberOfRegistrations = numberOfRegistrations;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfDownloads</b></p>
     * 
     * @param numberOfDownloads
     *     Number of downloads attributed to the campaign, which are summed up when aggregated.
     */
    public void setNumberOfDownloads(
        @Nullable
        final Long numberOfDownloads) {
        rememberChangedField("NumberOfDownloads", this.numberOfDownloads);
        this.numberOfDownloads = numberOfDownloads;
    }

    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>VideoViewedAverageInPercent</b></p>
     * 
     * @param videoViewedAverageInPercent
     *     Average percentage of video views, which are aggregated as the average and weighted by the number of video views.
     */
    public void setVideoViewedAverageInPercent(
        @Nullable
        final BigDecimal videoViewedAverageInPercent) {
        rememberChangedField("VideoViewedAverageInPercent", this.videoViewedAverageInPercent);
        this.videoViewedAverageInPercent = videoViewedAverageInPercent;
    }

    /**
     * Constraints: Not nullable, Precision: 15, Scale: 2 <p>Original property name from the Odata EDM: <b>GrossRatingPoints</b></p><p>Be aware that an aggregation of gross rating points with a different gross rating point base doesn't make sense but technically is not prevented.</p>
     * 
     * @param grossRatingPoints
     *     Gross rating points, which are summed up when aggregated.
     */
    public void setGrossRatingPoints(
        @Nullable
        final BigDecimal grossRatingPoints) {
        rememberChangedField("GrossRatingPoints", this.grossRatingPoints);
        this.grossRatingPoints = grossRatingPoints;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>GrossRatingPointBase</b></p>
     * 
     * @param grossRatingPointBase
     *     Base that the gross rating points measure refers to. It typically contains a custom string that describes the audience the gross rating points are related to. It is not supported for campaign targets.
     */
    public void setGrossRatingPointBase(
        @Nullable
        final String grossRatingPointBase) {
        rememberChangedField("GrossRatingPointBase", this.grossRatingPointBase);
        this.grossRatingPointBase = grossRatingPointBase;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfLeads</b></p>
     * 
     * @param numberOfLeads
     *     Number of leads created as a result of the campaign, which are summed up when aggregated.
     */
    public void setNumberOfLeads(
        @Nullable
        final Long numberOfLeads) {
        rememberChangedField("NumberOfLeads", this.numberOfLeads);
        this.numberOfLeads = numberOfLeads;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfOpportunities</b></p>
     * 
     * @param numberOfOpportunities
     *     Number of opportunities created as a result of the campaign, which are summed up when aggregated.
     */
    public void setNumberOfOpportunities(
        @Nullable
        final Long numberOfOpportunities) {
        rememberChangedField("NumberOfOpportunities", this.numberOfOpportunities);
        this.numberOfOpportunities = numberOfOpportunities;
    }

    /**
     * Constraints: Not nullable, Precision: 32, Scale: 3 <p>Original property name from the Odata EDM: <b>OpportunityAmount</b></p>
     * 
     * @param opportunityAmount
     *     Opportunity amount attributed to the campaign, which is summed up when aggregated.
     */
    public void setOpportunityAmount(
        @Nullable
        final BigDecimal opportunityAmount) {
        rememberChangedField("OpportunityAmount", this.opportunityAmount);
        this.opportunityAmount = opportunityAmount;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OpportunityAmountCrcyISOCode</b></p><p>The currency ISO code list is customizable and the input value should come from the value list.</p>
     * 
     * @param opportunityAmountCrcyISOCode
     *     Amount spent for ad serving, summed up when aggregated.
     */
    public void setOpportunityAmountCrcyISOCode(
        @Nullable
        final String opportunityAmountCrcyISOCode) {
        rememberChangedField("OpportunityAmountCrcyISOCode", this.opportunityAmountCrcyISOCode);
        this.opportunityAmountCrcyISOCode = opportunityAmountCrcyISOCode;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfPhoneCalls</b></p>
     * 
     * @param numberOfPhoneCalls
     *     Number of phone calls triggered as a result of the campaign, which are summed up when aggregated.
     */
    public void setNumberOfPhoneCalls(
        @Nullable
        final Long numberOfPhoneCalls) {
        rememberChangedField("NumberOfPhoneCalls", this.numberOfPhoneCalls);
        this.numberOfPhoneCalls = numberOfPhoneCalls;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfAppointments</b></p>
     * 
     * @param numberOfAppointments
     *     Number of Appointments
     */
    public void setNumberOfAppointments(
        @Nullable
        final Long numberOfAppointments) {
        rememberChangedField("NumberOfAppointments", this.numberOfAppointments);
        this.numberOfAppointments = numberOfAppointments;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfFailedInteractions</b></p><p>For campaigns executed in SAP Marketing Cloud, this is the number of interactions that have been triggered but could not be executed for various reasons such as missing marketing permissions.</p>
     * 
     * @param numberOfFailedInteractions
     *     Number of failed interactions, which are summed up when aggregated.
     */
    public void setNumberOfFailedInteractions(
        @Nullable
        final Long numberOfFailedInteractions) {
        rememberChangedField("NumberOfFailedInteractions", this.numberOfFailedInteractions);
        this.numberOfFailedInteractions = numberOfFailedInteractions;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfMarketingOfferViews</b></p>
     * 
     * @param numberOfMarketingOfferViews
     *     Number of offer views as a result of the campaign, which are summed up when aggregated.
     */
    public void setNumberOfMarketingOfferViews(
        @Nullable
        final Long numberOfMarketingOfferViews) {
        rememberChangedField("NumberOfMarketingOfferViews", this.numberOfMarketingOfferViews);
        this.numberOfMarketingOfferViews = numberOfMarketingOfferViews;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfEmailComplaints</b></p>
     * 
     * @param numberOfEmailComplaints
     *     Number of email complaints and the number of times a mail sent by the campaign was marked as spam, which are summed up when aggregated.
     */
    public void setNumberOfEmailComplaints(
        @Nullable
        final Long numberOfEmailComplaints) {
        rememberChangedField("NumberOfEmailComplaints", this.numberOfEmailComplaints);
        this.numberOfEmailComplaints = numberOfEmailComplaints;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NmbrOfOpenChannelInteractions</b></p><p>They are used for campaigns executed in SAP Marketing Cloud that include custom actions that were implemented using the open channel.</p>
     * 
     * @param nmbrOfOpenChannelInteractions
     *     Number of open channel interactions, which are summed up when aggregated.
     */
    public void setNmbrOfOpenChannelInteractions(
        @Nullable
        final Long nmbrOfOpenChannelInteractions) {
        rememberChangedField("NmbrOfOpenChannelInteractions", this.nmbrOfOpenChannelInteractions);
        this.nmbrOfOpenChannelInteractions = nmbrOfOpenChannelInteractions;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfExecutedInteractions</b></p>
     * 
     * @param numberOfExecutedInteractions
     *     Number of interactions executed by the SAP Marketing Cloud campaign, which are summed up when aggregated.
     */
    public void setNumberOfExecutedInteractions(
        @Nullable
        final Long numberOfExecutedInteractions) {
        rememberChangedField("NumberOfExecutedInteractions", this.numberOfExecutedInteractions);
        this.numberOfExecutedInteractions = numberOfExecutedInteractions;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>NumberOfTasks</b></p><p>Tasks are usually created in a connected CRM system.</p>
     * 
     * @param numberOfTasks
     *     Number of tasks triggered as a result of the campaign, which are summed up when aggregated.
     */
    public void setNumberOfTasks(
        @Nullable
        final Long numberOfTasks) {
        rememberChangedField("NumberOfTasks", this.numberOfTasks);
        this.numberOfTasks = numberOfTasks;
    }

    @Override
    protected String getEntityCollection() {
        return "Successes";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("CampaignSuccessUUID", getCampaignSuccessUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("CampaignSuccessUUID", getCampaignSuccessUUID());
        values.put("CampaignUUID", getCampaignUUID());
        values.put("CampaignID", getCampaignID());
        values.put("CampaignCategoryID", getCampaignCategoryID());
        values.put("ExternalCampaignID", getExternalCampaignID());
        values.put("ExternalCampaignName", getExternalCampaignName());
        values.put("Advertiser", getAdvertiser());
        values.put("AdvertiserName", getAdvertiserName());
        values.put("ExternalCmpgnManagingParty", getExternalCmpgnManagingParty());
        values.put("ExternalCmpgnManagingPartyName", getExternalCmpgnManagingPartyName());
        values.put("CommunicationMedium", getCommunicationMedium());
        values.put("SuccessDataDate", getSuccessDataDate());
        values.put("SuccessDataDateTimeZone", getSuccessDataDateTimeZone());
        values.put("YearWeek", getYearWeek());
        values.put("YearMonth", getYearMonth());
        values.put("AdServingSpendAmount", getAdServingSpendAmount());
        values.put("SuggestedAdServingSpendAmount", getSuggestedAdServingSpendAmount());
        values.put("AdServingSpendAmtCrcyISOCode", getAdServingSpendAmtCrcyISOCode());
        values.put("AgeRangeLowerLimit", getAgeRangeLowerLimit());
        values.put("AgeRangeUpperLimit", getAgeRangeUpperLimit());
        values.put("GenderFreeText", getGenderFreeText());
        values.put("CountryFreeText", getCountryFreeText());
        values.put("RegionFreeText", getRegionFreeText());
        values.put("InteractionStatus", getInteractionStatus());
        values.put("InteractionReason", getInteractionReason());
        values.put("InteractionType", getInteractionType());
        values.put("CampaignContent", getCampaignContent());
        values.put("CampaignContentName", getCampaignContentName());
        values.put("CampaignContentLinkName", getCampaignContentLinkName());
        values.put("CampaignContentLinkAliasName", getCampaignContentLinkAliasName());
        values.put("DeviceFreeText", getDeviceFreeText());
        values.put("AdNetworkFreeText", getAdNetworkFreeText());
        values.put("PaidSearchKeywordText", getPaidSearchKeywordText());
        values.put("PaidSearchSearchTermText", getPaidSearchSearchTermText());
        values.put("CampaignReach", getCampaignReach());
        values.put("CampaignReachInPercent", getCampaignReachInPercent());
        values.put("NumberOfImpressions", getNumberOfImpressions());
        values.put("NumberOfClicks", getNumberOfClicks());
        values.put("NumberOfUniqueClicks", getNumberOfUniqueClicks());
        values.put("NumberOfPageLikes", getNumberOfPageLikes());
        values.put("NumberOfPostEngagements", getNumberOfPostEngagements());
        values.put("NumberOfOfferClaims", getNumberOfOfferClaims());
        values.put("NumberOfVideoViews", getNumberOfVideoViews());
        values.put("NumberOfWebsiteConversions", getNumberOfWebsiteConversions());
        values.put("NumberOfAppInstalls", getNumberOfAppInstalls());
        values.put("NumberOfAppEngagements", getNumberOfAppEngagements());
        values.put("NumberOfEventResponses", getNumberOfEventResponses());
        values.put("NumberOfRejectedMessages", getNumberOfRejectedMessages());
        values.put("NumberOfSentMessages", getNumberOfSentMessages());
        values.put("NumberOfDeliveredMessages", getNumberOfDeliveredMessages());
        values.put("NumberOfOpenedMessages", getNumberOfOpenedMessages());
        values.put("NumberOfHardBounces", getNumberOfHardBounces());
        values.put("NumberOfSoftBounces", getNumberOfSoftBounces());
        values.put("NumberOfOrders", getNumberOfOrders());
        values.put("OrderAmount", getOrderAmount());
        values.put("MultiTouchAttributedOrderAmt", getMultiTouchAttributedOrderAmt());
        values.put("ProjectedOrderAmount", getProjectedOrderAmount());
        values.put("OrderAmountCurrencyISOCode", getOrderAmountCurrencyISOCode());
        values.put("NrOfMultiTchAttrCnvrsns", getNrOfMultiTchAttrCnvrsns());
        values.put("ProjectedNumberOfConversions", getProjectedNumberOfConversions());
        values.put("NumberOfRegistrations", getNumberOfRegistrations());
        values.put("NumberOfDownloads", getNumberOfDownloads());
        values.put("VideoViewedAverageInPercent", getVideoViewedAverageInPercent());
        values.put("GrossRatingPoints", getGrossRatingPoints());
        values.put("GrossRatingPointBase", getGrossRatingPointBase());
        values.put("NumberOfLeads", getNumberOfLeads());
        values.put("NumberOfOpportunities", getNumberOfOpportunities());
        values.put("OpportunityAmount", getOpportunityAmount());
        values.put("OpportunityAmountCrcyISOCode", getOpportunityAmountCrcyISOCode());
        values.put("NumberOfPhoneCalls", getNumberOfPhoneCalls());
        values.put("NumberOfAppointments", getNumberOfAppointments());
        values.put("NumberOfFailedInteractions", getNumberOfFailedInteractions());
        values.put("NumberOfMarketingOfferViews", getNumberOfMarketingOfferViews());
        values.put("NumberOfEmailComplaints", getNumberOfEmailComplaints());
        values.put("NmbrOfOpenChannelInteractions", getNmbrOfOpenChannelInteractions());
        values.put("NumberOfExecutedInteractions", getNumberOfExecutedInteractions());
        values.put("NumberOfTasks", getNumberOfTasks());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("CampaignSuccessUUID")) {
                final Object value = values.remove("CampaignSuccessUUID");
                if ((value == null)||(!value.equals(getCampaignSuccessUUID()))) {
                    setCampaignSuccessUUID(((UUID) value));
                }
            }
            if (values.containsKey("CampaignUUID")) {
                final Object value = values.remove("CampaignUUID");
                if ((value == null)||(!value.equals(getCampaignUUID()))) {
                    setCampaignUUID(((UUID) value));
                }
            }
            if (values.containsKey("CampaignID")) {
                final Object value = values.remove("CampaignID");
                if ((value == null)||(!value.equals(getCampaignID()))) {
                    setCampaignID(((String) value));
                }
            }
            if (values.containsKey("CampaignCategoryID")) {
                final Object value = values.remove("CampaignCategoryID");
                if ((value == null)||(!value.equals(getCampaignCategoryID()))) {
                    setCampaignCategoryID(((String) value));
                }
            }
            if (values.containsKey("ExternalCampaignID")) {
                final Object value = values.remove("ExternalCampaignID");
                if ((value == null)||(!value.equals(getExternalCampaignID()))) {
                    setExternalCampaignID(((String) value));
                }
            }
            if (values.containsKey("ExternalCampaignName")) {
                final Object value = values.remove("ExternalCampaignName");
                if ((value == null)||(!value.equals(getExternalCampaignName()))) {
                    setExternalCampaignName(((String) value));
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
            if (values.containsKey("CommunicationMedium")) {
                final Object value = values.remove("CommunicationMedium");
                if ((value == null)||(!value.equals(getCommunicationMedium()))) {
                    setCommunicationMedium(((String) value));
                }
            }
            if (values.containsKey("SuccessDataDate")) {
                final Object value = values.remove("SuccessDataDate");
                if ((value == null)||(!value.equals(getSuccessDataDate()))) {
                    setSuccessDataDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("SuccessDataDateTimeZone")) {
                final Object value = values.remove("SuccessDataDateTimeZone");
                if ((value == null)||(!value.equals(getSuccessDataDateTimeZone()))) {
                    setSuccessDataDateTimeZone(((String) value));
                }
            }
            if (values.containsKey("YearWeek")) {
                final Object value = values.remove("YearWeek");
                if ((value == null)||(!value.equals(getYearWeek()))) {
                    setYearWeek(((String) value));
                }
            }
            if (values.containsKey("YearMonth")) {
                final Object value = values.remove("YearMonth");
                if ((value == null)||(!value.equals(getYearMonth()))) {
                    setYearMonth(((String) value));
                }
            }
            if (values.containsKey("AdServingSpendAmount")) {
                final Object value = values.remove("AdServingSpendAmount");
                if ((value == null)||(!value.equals(getAdServingSpendAmount()))) {
                    setAdServingSpendAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("SuggestedAdServingSpendAmount")) {
                final Object value = values.remove("SuggestedAdServingSpendAmount");
                if ((value == null)||(!value.equals(getSuggestedAdServingSpendAmount()))) {
                    setSuggestedAdServingSpendAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("AdServingSpendAmtCrcyISOCode")) {
                final Object value = values.remove("AdServingSpendAmtCrcyISOCode");
                if ((value == null)||(!value.equals(getAdServingSpendAmtCrcyISOCode()))) {
                    setAdServingSpendAmtCrcyISOCode(((String) value));
                }
            }
            if (values.containsKey("AgeRangeLowerLimit")) {
                final Object value = values.remove("AgeRangeLowerLimit");
                if ((value == null)||(!value.equals(getAgeRangeLowerLimit()))) {
                    setAgeRangeLowerLimit(((Short) value));
                }
            }
            if (values.containsKey("AgeRangeUpperLimit")) {
                final Object value = values.remove("AgeRangeUpperLimit");
                if ((value == null)||(!value.equals(getAgeRangeUpperLimit()))) {
                    setAgeRangeUpperLimit(((Short) value));
                }
            }
            if (values.containsKey("GenderFreeText")) {
                final Object value = values.remove("GenderFreeText");
                if ((value == null)||(!value.equals(getGenderFreeText()))) {
                    setGenderFreeText(((String) value));
                }
            }
            if (values.containsKey("CountryFreeText")) {
                final Object value = values.remove("CountryFreeText");
                if ((value == null)||(!value.equals(getCountryFreeText()))) {
                    setCountryFreeText(((String) value));
                }
            }
            if (values.containsKey("RegionFreeText")) {
                final Object value = values.remove("RegionFreeText");
                if ((value == null)||(!value.equals(getRegionFreeText()))) {
                    setRegionFreeText(((String) value));
                }
            }
            if (values.containsKey("InteractionStatus")) {
                final Object value = values.remove("InteractionStatus");
                if ((value == null)||(!value.equals(getInteractionStatus()))) {
                    setInteractionStatus(((String) value));
                }
            }
            if (values.containsKey("InteractionReason")) {
                final Object value = values.remove("InteractionReason");
                if ((value == null)||(!value.equals(getInteractionReason()))) {
                    setInteractionReason(((String) value));
                }
            }
            if (values.containsKey("InteractionType")) {
                final Object value = values.remove("InteractionType");
                if ((value == null)||(!value.equals(getInteractionType()))) {
                    setInteractionType(((String) value));
                }
            }
            if (values.containsKey("CampaignContent")) {
                final Object value = values.remove("CampaignContent");
                if ((value == null)||(!value.equals(getCampaignContent()))) {
                    setCampaignContent(((Integer) value));
                }
            }
            if (values.containsKey("CampaignContentName")) {
                final Object value = values.remove("CampaignContentName");
                if ((value == null)||(!value.equals(getCampaignContentName()))) {
                    setCampaignContentName(((String) value));
                }
            }
            if (values.containsKey("CampaignContentLinkName")) {
                final Object value = values.remove("CampaignContentLinkName");
                if ((value == null)||(!value.equals(getCampaignContentLinkName()))) {
                    setCampaignContentLinkName(((String) value));
                }
            }
            if (values.containsKey("CampaignContentLinkAliasName")) {
                final Object value = values.remove("CampaignContentLinkAliasName");
                if ((value == null)||(!value.equals(getCampaignContentLinkAliasName()))) {
                    setCampaignContentLinkAliasName(((String) value));
                }
            }
            if (values.containsKey("DeviceFreeText")) {
                final Object value = values.remove("DeviceFreeText");
                if ((value == null)||(!value.equals(getDeviceFreeText()))) {
                    setDeviceFreeText(((String) value));
                }
            }
            if (values.containsKey("AdNetworkFreeText")) {
                final Object value = values.remove("AdNetworkFreeText");
                if ((value == null)||(!value.equals(getAdNetworkFreeText()))) {
                    setAdNetworkFreeText(((String) value));
                }
            }
            if (values.containsKey("PaidSearchKeywordText")) {
                final Object value = values.remove("PaidSearchKeywordText");
                if ((value == null)||(!value.equals(getPaidSearchKeywordText()))) {
                    setPaidSearchKeywordText(((String) value));
                }
            }
            if (values.containsKey("PaidSearchSearchTermText")) {
                final Object value = values.remove("PaidSearchSearchTermText");
                if ((value == null)||(!value.equals(getPaidSearchSearchTermText()))) {
                    setPaidSearchSearchTermText(((String) value));
                }
            }
            if (values.containsKey("CampaignReach")) {
                final Object value = values.remove("CampaignReach");
                if ((value == null)||(!value.equals(getCampaignReach()))) {
                    setCampaignReach(((Long) value));
                }
            }
            if (values.containsKey("CampaignReachInPercent")) {
                final Object value = values.remove("CampaignReachInPercent");
                if ((value == null)||(!value.equals(getCampaignReachInPercent()))) {
                    setCampaignReachInPercent(((BigDecimal) value));
                }
            }
            if (values.containsKey("NumberOfImpressions")) {
                final Object value = values.remove("NumberOfImpressions");
                if ((value == null)||(!value.equals(getNumberOfImpressions()))) {
                    setNumberOfImpressions(((Long) value));
                }
            }
            if (values.containsKey("NumberOfClicks")) {
                final Object value = values.remove("NumberOfClicks");
                if ((value == null)||(!value.equals(getNumberOfClicks()))) {
                    setNumberOfClicks(((Long) value));
                }
            }
            if (values.containsKey("NumberOfUniqueClicks")) {
                final Object value = values.remove("NumberOfUniqueClicks");
                if ((value == null)||(!value.equals(getNumberOfUniqueClicks()))) {
                    setNumberOfUniqueClicks(((Long) value));
                }
            }
            if (values.containsKey("NumberOfPageLikes")) {
                final Object value = values.remove("NumberOfPageLikes");
                if ((value == null)||(!value.equals(getNumberOfPageLikes()))) {
                    setNumberOfPageLikes(((Long) value));
                }
            }
            if (values.containsKey("NumberOfPostEngagements")) {
                final Object value = values.remove("NumberOfPostEngagements");
                if ((value == null)||(!value.equals(getNumberOfPostEngagements()))) {
                    setNumberOfPostEngagements(((Long) value));
                }
            }
            if (values.containsKey("NumberOfOfferClaims")) {
                final Object value = values.remove("NumberOfOfferClaims");
                if ((value == null)||(!value.equals(getNumberOfOfferClaims()))) {
                    setNumberOfOfferClaims(((Long) value));
                }
            }
            if (values.containsKey("NumberOfVideoViews")) {
                final Object value = values.remove("NumberOfVideoViews");
                if ((value == null)||(!value.equals(getNumberOfVideoViews()))) {
                    setNumberOfVideoViews(((Long) value));
                }
            }
            if (values.containsKey("NumberOfWebsiteConversions")) {
                final Object value = values.remove("NumberOfWebsiteConversions");
                if ((value == null)||(!value.equals(getNumberOfWebsiteConversions()))) {
                    setNumberOfWebsiteConversions(((Long) value));
                }
            }
            if (values.containsKey("NumberOfAppInstalls")) {
                final Object value = values.remove("NumberOfAppInstalls");
                if ((value == null)||(!value.equals(getNumberOfAppInstalls()))) {
                    setNumberOfAppInstalls(((Long) value));
                }
            }
            if (values.containsKey("NumberOfAppEngagements")) {
                final Object value = values.remove("NumberOfAppEngagements");
                if ((value == null)||(!value.equals(getNumberOfAppEngagements()))) {
                    setNumberOfAppEngagements(((Long) value));
                }
            }
            if (values.containsKey("NumberOfEventResponses")) {
                final Object value = values.remove("NumberOfEventResponses");
                if ((value == null)||(!value.equals(getNumberOfEventResponses()))) {
                    setNumberOfEventResponses(((Long) value));
                }
            }
            if (values.containsKey("NumberOfRejectedMessages")) {
                final Object value = values.remove("NumberOfRejectedMessages");
                if ((value == null)||(!value.equals(getNumberOfRejectedMessages()))) {
                    setNumberOfRejectedMessages(((Long) value));
                }
            }
            if (values.containsKey("NumberOfSentMessages")) {
                final Object value = values.remove("NumberOfSentMessages");
                if ((value == null)||(!value.equals(getNumberOfSentMessages()))) {
                    setNumberOfSentMessages(((Long) value));
                }
            }
            if (values.containsKey("NumberOfDeliveredMessages")) {
                final Object value = values.remove("NumberOfDeliveredMessages");
                if ((value == null)||(!value.equals(getNumberOfDeliveredMessages()))) {
                    setNumberOfDeliveredMessages(((Long) value));
                }
            }
            if (values.containsKey("NumberOfOpenedMessages")) {
                final Object value = values.remove("NumberOfOpenedMessages");
                if ((value == null)||(!value.equals(getNumberOfOpenedMessages()))) {
                    setNumberOfOpenedMessages(((Long) value));
                }
            }
            if (values.containsKey("NumberOfHardBounces")) {
                final Object value = values.remove("NumberOfHardBounces");
                if ((value == null)||(!value.equals(getNumberOfHardBounces()))) {
                    setNumberOfHardBounces(((Long) value));
                }
            }
            if (values.containsKey("NumberOfSoftBounces")) {
                final Object value = values.remove("NumberOfSoftBounces");
                if ((value == null)||(!value.equals(getNumberOfSoftBounces()))) {
                    setNumberOfSoftBounces(((Long) value));
                }
            }
            if (values.containsKey("NumberOfOrders")) {
                final Object value = values.remove("NumberOfOrders");
                if ((value == null)||(!value.equals(getNumberOfOrders()))) {
                    setNumberOfOrders(((Long) value));
                }
            }
            if (values.containsKey("OrderAmount")) {
                final Object value = values.remove("OrderAmount");
                if ((value == null)||(!value.equals(getOrderAmount()))) {
                    setOrderAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("MultiTouchAttributedOrderAmt")) {
                final Object value = values.remove("MultiTouchAttributedOrderAmt");
                if ((value == null)||(!value.equals(getMultiTouchAttributedOrderAmt()))) {
                    setMultiTouchAttributedOrderAmt(((BigDecimal) value));
                }
            }
            if (values.containsKey("ProjectedOrderAmount")) {
                final Object value = values.remove("ProjectedOrderAmount");
                if ((value == null)||(!value.equals(getProjectedOrderAmount()))) {
                    setProjectedOrderAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("OrderAmountCurrencyISOCode")) {
                final Object value = values.remove("OrderAmountCurrencyISOCode");
                if ((value == null)||(!value.equals(getOrderAmountCurrencyISOCode()))) {
                    setOrderAmountCurrencyISOCode(((String) value));
                }
            }
            if (values.containsKey("NrOfMultiTchAttrCnvrsns")) {
                final Object value = values.remove("NrOfMultiTchAttrCnvrsns");
                if ((value == null)||(!value.equals(getNrOfMultiTchAttrCnvrsns()))) {
                    setNrOfMultiTchAttrCnvrsns(((BigDecimal) value));
                }
            }
            if (values.containsKey("ProjectedNumberOfConversions")) {
                final Object value = values.remove("ProjectedNumberOfConversions");
                if ((value == null)||(!value.equals(getProjectedNumberOfConversions()))) {
                    setProjectedNumberOfConversions(((BigDecimal) value));
                }
            }
            if (values.containsKey("NumberOfRegistrations")) {
                final Object value = values.remove("NumberOfRegistrations");
                if ((value == null)||(!value.equals(getNumberOfRegistrations()))) {
                    setNumberOfRegistrations(((Long) value));
                }
            }
            if (values.containsKey("NumberOfDownloads")) {
                final Object value = values.remove("NumberOfDownloads");
                if ((value == null)||(!value.equals(getNumberOfDownloads()))) {
                    setNumberOfDownloads(((Long) value));
                }
            }
            if (values.containsKey("VideoViewedAverageInPercent")) {
                final Object value = values.remove("VideoViewedAverageInPercent");
                if ((value == null)||(!value.equals(getVideoViewedAverageInPercent()))) {
                    setVideoViewedAverageInPercent(((BigDecimal) value));
                }
            }
            if (values.containsKey("GrossRatingPoints")) {
                final Object value = values.remove("GrossRatingPoints");
                if ((value == null)||(!value.equals(getGrossRatingPoints()))) {
                    setGrossRatingPoints(((BigDecimal) value));
                }
            }
            if (values.containsKey("GrossRatingPointBase")) {
                final Object value = values.remove("GrossRatingPointBase");
                if ((value == null)||(!value.equals(getGrossRatingPointBase()))) {
                    setGrossRatingPointBase(((String) value));
                }
            }
            if (values.containsKey("NumberOfLeads")) {
                final Object value = values.remove("NumberOfLeads");
                if ((value == null)||(!value.equals(getNumberOfLeads()))) {
                    setNumberOfLeads(((Long) value));
                }
            }
            if (values.containsKey("NumberOfOpportunities")) {
                final Object value = values.remove("NumberOfOpportunities");
                if ((value == null)||(!value.equals(getNumberOfOpportunities()))) {
                    setNumberOfOpportunities(((Long) value));
                }
            }
            if (values.containsKey("OpportunityAmount")) {
                final Object value = values.remove("OpportunityAmount");
                if ((value == null)||(!value.equals(getOpportunityAmount()))) {
                    setOpportunityAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("OpportunityAmountCrcyISOCode")) {
                final Object value = values.remove("OpportunityAmountCrcyISOCode");
                if ((value == null)||(!value.equals(getOpportunityAmountCrcyISOCode()))) {
                    setOpportunityAmountCrcyISOCode(((String) value));
                }
            }
            if (values.containsKey("NumberOfPhoneCalls")) {
                final Object value = values.remove("NumberOfPhoneCalls");
                if ((value == null)||(!value.equals(getNumberOfPhoneCalls()))) {
                    setNumberOfPhoneCalls(((Long) value));
                }
            }
            if (values.containsKey("NumberOfAppointments")) {
                final Object value = values.remove("NumberOfAppointments");
                if ((value == null)||(!value.equals(getNumberOfAppointments()))) {
                    setNumberOfAppointments(((Long) value));
                }
            }
            if (values.containsKey("NumberOfFailedInteractions")) {
                final Object value = values.remove("NumberOfFailedInteractions");
                if ((value == null)||(!value.equals(getNumberOfFailedInteractions()))) {
                    setNumberOfFailedInteractions(((Long) value));
                }
            }
            if (values.containsKey("NumberOfMarketingOfferViews")) {
                final Object value = values.remove("NumberOfMarketingOfferViews");
                if ((value == null)||(!value.equals(getNumberOfMarketingOfferViews()))) {
                    setNumberOfMarketingOfferViews(((Long) value));
                }
            }
            if (values.containsKey("NumberOfEmailComplaints")) {
                final Object value = values.remove("NumberOfEmailComplaints");
                if ((value == null)||(!value.equals(getNumberOfEmailComplaints()))) {
                    setNumberOfEmailComplaints(((Long) value));
                }
            }
            if (values.containsKey("NmbrOfOpenChannelInteractions")) {
                final Object value = values.remove("NmbrOfOpenChannelInteractions");
                if ((value == null)||(!value.equals(getNmbrOfOpenChannelInteractions()))) {
                    setNmbrOfOpenChannelInteractions(((Long) value));
                }
            }
            if (values.containsKey("NumberOfExecutedInteractions")) {
                final Object value = values.remove("NumberOfExecutedInteractions");
                if ((value == null)||(!value.equals(getNumberOfExecutedInteractions()))) {
                    setNumberOfExecutedInteractions(((Long) value));
                }
            }
            if (values.containsKey("NumberOfTasks")) {
                final Object value = values.remove("NumberOfTasks");
                if ((value == null)||(!value.equals(getNumberOfTasks()))) {
                    setNumberOfTasks(((Long) value));
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
    public static<T >SuccessField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SuccessField<T>(fieldName);
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
    public static<T,DomainT >SuccessField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SuccessField<T>(fieldName, typeConverter);
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
        return APIMKTCMPGNSUCCESSIMPORTSRVService.DEFAULT_SERVICE_PATH;
    }

}
