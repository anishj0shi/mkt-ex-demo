/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success Success}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.field.SuccessField SuccessField} and {@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.link.SuccessLink SuccessLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_SUCCESS_UUID CAMPAIGN_SUCCESS_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_ID CAMPAIGN_ID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_CATEGORY_ID CAMPAIGN_CATEGORY_ID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#EXTERNAL_CAMPAIGN_ID EXTERNAL_CAMPAIGN_ID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#EXTERNAL_CAMPAIGN_NAME EXTERNAL_CAMPAIGN_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#ADVERTISER ADVERTISER}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#ADVERTISER_NAME ADVERTISER_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#EXTERNAL_CMPGN_MANAGING_PARTY EXTERNAL_CMPGN_MANAGING_PARTY}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#EXTERNAL_CMPGN_MANAGING_PARTY_NAME EXTERNAL_CMPGN_MANAGING_PARTY_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#COMMUNICATION_MEDIUM COMMUNICATION_MEDIUM}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#SUCCESS_DATA_DATE SUCCESS_DATA_DATE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#SUCCESS_DATA_DATE_TIME_ZONE SUCCESS_DATA_DATE_TIME_ZONE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#YEAR_WEEK YEAR_WEEK}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#YEAR_MONTH YEAR_MONTH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#AD_SERVING_SPEND_AMOUNT AD_SERVING_SPEND_AMOUNT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#SUGGESTED_AD_SERVING_SPEND_AMOUNT SUGGESTED_AD_SERVING_SPEND_AMOUNT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#AD_SERVING_SPEND_AMT_CRCY_ISO_CODE AD_SERVING_SPEND_AMT_CRCY_ISO_CODE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#AGE_RANGE_LOWER_LIMIT AGE_RANGE_LOWER_LIMIT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#AGE_RANGE_UPPER_LIMIT AGE_RANGE_UPPER_LIMIT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#GENDER_FREE_TEXT GENDER_FREE_TEXT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#COUNTRY_FREE_TEXT COUNTRY_FREE_TEXT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#REGION_FREE_TEXT REGION_FREE_TEXT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#INTERACTION_STATUS INTERACTION_STATUS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#INTERACTION_REASON INTERACTION_REASON}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#INTERACTION_TYPE INTERACTION_TYPE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_CONTENT CAMPAIGN_CONTENT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_CONTENT_NAME CAMPAIGN_CONTENT_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_CONTENT_LINK_NAME CAMPAIGN_CONTENT_LINK_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_CONTENT_LINK_ALIAS_NAME CAMPAIGN_CONTENT_LINK_ALIAS_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#DEVICE_FREE_TEXT DEVICE_FREE_TEXT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#AD_NETWORK_FREE_TEXT AD_NETWORK_FREE_TEXT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#PAID_SEARCH_KEYWORD_TEXT PAID_SEARCH_KEYWORD_TEXT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#PAID_SEARCH_SEARCH_TERM_TEXT PAID_SEARCH_SEARCH_TERM_TEXT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_REACH CAMPAIGN_REACH}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#CAMPAIGN_REACH_IN_PERCENT CAMPAIGN_REACH_IN_PERCENT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_IMPRESSIONS NUMBER_OF_IMPRESSIONS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_CLICKS NUMBER_OF_CLICKS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_UNIQUE_CLICKS NUMBER_OF_UNIQUE_CLICKS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_PAGE_LIKES NUMBER_OF_PAGE_LIKES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_POST_ENGAGEMENTS NUMBER_OF_POST_ENGAGEMENTS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_OFFER_CLAIMS NUMBER_OF_OFFER_CLAIMS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_VIDEO_VIEWS NUMBER_OF_VIDEO_VIEWS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_WEBSITE_CONVERSIONS NUMBER_OF_WEBSITE_CONVERSIONS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_APP_INSTALLS NUMBER_OF_APP_INSTALLS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_APP_ENGAGEMENTS NUMBER_OF_APP_ENGAGEMENTS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_EVENT_RESPONSES NUMBER_OF_EVENT_RESPONSES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_REJECTED_MESSAGES NUMBER_OF_REJECTED_MESSAGES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_SENT_MESSAGES NUMBER_OF_SENT_MESSAGES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_DELIVERED_MESSAGES NUMBER_OF_DELIVERED_MESSAGES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_OPENED_MESSAGES NUMBER_OF_OPENED_MESSAGES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_HARD_BOUNCES NUMBER_OF_HARD_BOUNCES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_SOFT_BOUNCES NUMBER_OF_SOFT_BOUNCES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_ORDERS NUMBER_OF_ORDERS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#ORDER_AMOUNT ORDER_AMOUNT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#MULTI_TOUCH_ATTRIBUTED_ORDER_AMT MULTI_TOUCH_ATTRIBUTED_ORDER_AMT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#PROJECTED_ORDER_AMOUNT PROJECTED_ORDER_AMOUNT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#ORDER_AMOUNT_CURRENCY_ISO_CODE ORDER_AMOUNT_CURRENCY_ISO_CODE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NR_OF_MULTI_TCH_ATTR_CNVRSNS NR_OF_MULTI_TCH_ATTR_CNVRSNS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#PROJECTED_NUMBER_OF_CONVERSIONS PROJECTED_NUMBER_OF_CONVERSIONS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_REGISTRATIONS NUMBER_OF_REGISTRATIONS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_DOWNLOADS NUMBER_OF_DOWNLOADS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#VIDEO_VIEWED_AVERAGE_IN_PERCENT VIDEO_VIEWED_AVERAGE_IN_PERCENT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#GROSS_RATING_POINTS GROSS_RATING_POINTS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#GROSS_RATING_POINT_BASE GROSS_RATING_POINT_BASE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_LEADS NUMBER_OF_LEADS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_OPPORTUNITIES NUMBER_OF_OPPORTUNITIES}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#OPPORTUNITY_AMOUNT OPPORTUNITY_AMOUNT}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#OPPORTUNITY_AMOUNT_CRCY_ISO_CODE OPPORTUNITY_AMOUNT_CRCY_ISO_CODE}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_PHONE_CALLS NUMBER_OF_PHONE_CALLS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_APPOINTMENTS NUMBER_OF_APPOINTMENTS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_FAILED_INTERACTIONS NUMBER_OF_FAILED_INTERACTIONS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_MARKETING_OFFER_VIEWS NUMBER_OF_MARKETING_OFFER_VIEWS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_EMAIL_COMPLAINTS NUMBER_OF_EMAIL_COMPLAINTS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NMBR_OF_OPEN_CHANNEL_INTERACTIONS NMBR_OF_OPEN_CHANNEL_INTERACTIONS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_EXECUTED_INTERACTIONS NUMBER_OF_EXECUTED_INTERACTIONS}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcmpgnsuccessimportsrv.Success#NUMBER_OF_TASKS NUMBER_OF_TASKS}</li>
 * </ul>
 * 
 */
public interface SuccessSelectable
    extends EntitySelectable<Success>
{


}
