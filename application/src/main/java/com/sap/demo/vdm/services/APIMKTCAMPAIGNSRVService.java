/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpendByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpendFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityDeleteFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignUpdateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.CreateCampaignFromTemplateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntityByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntityFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityDeleteFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntityByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntityFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplitByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplitFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderUpdateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemDeleteFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitDeleteFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitUpdateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemUpdateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityByKeyFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityCreateFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityDeleteFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityFluentHelper;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityUpdateFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_MKT_CAMPAIGN_SRV</td></tr></table>
 * 
 */
public interface APIMKTCAMPAIGNSRVService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "/sap/opu/odata/sap/API_MKT_CAMPAIGN_SRV;v=0002";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    APIMKTCAMPAIGNSRVService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CampaignFluentHelper getAllCampaign();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity using key fields.
     * 
     * @param campaignUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CampaignByKeyFluentHelper getCampaignByKey(final UUID campaignUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity and save it to the S/4HANA system.
     * 
     * @param campaign
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CampaignCreateFluentHelper createCampaign(
        @Nonnull
        final Campaign campaign);

    /**
     * Update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity and save it to the S/4HANA system.
     * 
     * @param campaign
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.Campaign Campaign} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.CampaignUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CampaignUpdateFluentHelper updateCampaign(
        @Nonnull
        final Campaign campaign);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AssignedTargetGroupEntityFluentHelper getAllAssignedTargetGroupEntity();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity using key fields.
     * 
     * @param campaignUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @param targetGroupUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AssignedTargetGroupEntityByKeyFluentHelper getAssignedTargetGroupEntityByKey(final UUID targetGroupUUID, final UUID campaignUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity and save it to the S/4HANA system.
     * 
     * @param assignedTargetGroupEntity
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AssignedTargetGroupEntityCreateFluentHelper createAssignedTargetGroupEntity(
        @Nonnull
        final AssignedTargetGroupEntity assignedTargetGroupEntity);

    /**
     * Deletes an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity in the S/4HANA system.
     * 
     * @param assignedTargetGroupEntity
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntity AssignedTargetGroupEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.AssignedTargetGroupEntityDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AssignedTargetGroupEntityDeleteFluentHelper deleteAssignedTargetGroupEntity(
        @Nonnull
        final AssignedTargetGroupEntity assignedTargetGroupEntity);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit SpendHeaderTimeSplit} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit SpendHeaderTimeSplit} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplitFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendHeaderTimeSplitFluentHelper getAllSpendHeaderTimeSplit();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit SpendHeaderTimeSplit} entity using key fields.
     * 
     * @param marketingSpendHdrTimeSplitUUID
     *     Key of Time Split of Marketing Spend Header<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplit SpendHeaderTimeSplit} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderTimeSplitByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendHeaderTimeSplitByKeyFluentHelper getSpendHeaderTimeSplitByKey(final UUID marketingSpendHdrTimeSplitUUID);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemTimeSplitFluentHelper getAllSpendItemTimeSplit();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity using key fields.
     * 
     * @param marketingSpendItmTimeSplitUUID
     *     Key of Time Split of Marketing Spend Item<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemTimeSplitByKeyFluentHelper getSpendItemTimeSplitByKey(final UUID marketingSpendItmTimeSplitUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity and save it to the S/4HANA system.
     * 
     * @param spendItemTimeSplit
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemTimeSplitCreateFluentHelper createSpendItemTimeSplit(
        @Nonnull
        final SpendItemTimeSplit spendItemTimeSplit);

    /**
     * Update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity and save it to the S/4HANA system.
     * 
     * @param spendItemTimeSplit
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemTimeSplitUpdateFluentHelper updateSpendItemTimeSplit(
        @Nonnull
        final SpendItemTimeSplit spendItemTimeSplit);

    /**
     * Deletes an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity in the S/4HANA system.
     * 
     * @param spendItemTimeSplit
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplit SpendItemTimeSplit} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemTimeSplitDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemTimeSplitDeleteFluentHelper deleteSpendItemTimeSplit(
        @Nonnull
        final SpendItemTimeSplit spendItemTimeSplit);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpendFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ActualSpendFluentHelper getAllActualSpend();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend} entity using key fields.
     * 
     * @param campaignUUID
     *     Campaign UUID for API-service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpendByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ActualSpendByKeyFluentHelper getActualSpendByKey(final UUID campaignUUID);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemFluentHelper getAllSpendItem();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity using key fields.
     * 
     * @param marketingSpendItemUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemByKeyFluentHelper getSpendItemByKey(final UUID marketingSpendItemUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity and save it to the S/4HANA system.
     * 
     * @param spendItem
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemCreateFluentHelper createSpendItem(
        @Nonnull
        final SpendItem spendItem);

    /**
     * Update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity and save it to the S/4HANA system.
     * 
     * @param spendItem
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemUpdateFluentHelper updateSpendItem(
        @Nonnull
        final SpendItem spendItem);

    /**
     * Deletes an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity in the S/4HANA system.
     * 
     * @param spendItem
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItem SpendItem} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendItemDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendItemDeleteFluentHelper deleteSpendItem(
        @Nonnull
        final SpendItem spendItem);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendHeaderFluentHelper getAllSpendHeader();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity using key fields.
     * 
     * @param marketingSpendHeaderUUID
     *     Key of Marketing Spend Header<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendHeaderByKeyFluentHelper getSpendHeaderByKey(final UUID marketingSpendHeaderUUID);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity and save it to the S/4HANA system.
     * 
     * @param spendHeader
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendHeaderCreateFluentHelper createSpendHeader(
        @Nonnull
        final SpendHeader spendHeader);

    /**
     * Update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity and save it to the S/4HANA system.
     * 
     * @param spendHeader
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeaderUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SpendHeaderUpdateFluentHelper updateSpendHeader(
        @Nonnull
        final SpendHeader spendHeader);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity MarketingAgencyEntity} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity MarketingAgencyEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntityFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    MarketingAgencyEntityFluentHelper getAllMarketingAgencyEntity();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity MarketingAgencyEntity} entity using key fields.
     * 
     * @param campaignUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @param marketingAgencyUUID
     *     UUID for API-Service<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntity MarketingAgencyEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.MarketingAgencyEntityByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    MarketingAgencyEntityByKeyFluentHelper getMarketingAgencyEntityByKey(final UUID campaignUUID, final UUID marketingAgencyUUID);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TeamMemberEntityFluentHelper getAllTeamMemberEntity();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity using key fields.
     * 
     * @param campaignUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @param teamMemberName
     *     User Name in User Master Record<p>Constraints: Not nullable, Maximum length: 12</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TeamMemberEntityByKeyFluentHelper getTeamMemberEntityByKey(final UUID campaignUUID, final String teamMemberName);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity and save it to the S/4HANA system.
     * 
     * @param teamMemberEntity
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TeamMemberEntityCreateFluentHelper createTeamMemberEntity(
        @Nonnull
        final TeamMemberEntity teamMemberEntity);

    /**
     * Update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity and save it to the S/4HANA system.
     * 
     * @param teamMemberEntity
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TeamMemberEntityUpdateFluentHelper updateTeamMemberEntity(
        @Nonnull
        final TeamMemberEntity teamMemberEntity);

    /**
     * Deletes an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity in the S/4HANA system.
     * 
     * @param teamMemberEntity
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntityDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    TeamMemberEntityDeleteFluentHelper deleteTeamMemberEntity(
        @Nonnull
        final TeamMemberEntity teamMemberEntity);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity ExternalCampaignReferenceEntity} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity ExternalCampaignReferenceEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntityFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ExternalCampaignReferenceEntityFluentHelper getAllExternalCampaignReferenceEntity();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity ExternalCampaignReferenceEntity} entity using key fields.
     * 
     * @param externalCampaignUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntity ExternalCampaignReferenceEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ExternalCampaignReferenceEntityByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    ExternalCampaignReferenceEntityByKeyFluentHelper getExternalCampaignReferenceEntityByKey(final UUID externalCampaignUUID);

    /**
     * Fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    InterestEntityFluentHelper getAllInterestEntity();

    /**
     * Fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity using key fields.
     * 
     * @param campaignUUID
     *     NodeID<p>Constraints: Not nullable</p>
     * @param interestItem
     *     Item of Interest<p>Constraints: Not nullable, Maximum length: 40</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    InterestEntityByKeyFluentHelper getInterestEntityByKey(final UUID campaignUUID, final String interestItem);

    /**
     * Create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity and save it to the S/4HANA system.
     * 
     * @param interestEntity
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    InterestEntityCreateFluentHelper createInterestEntity(
        @Nonnull
        final InterestEntity interestEntity);

    /**
     * Deletes an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity in the S/4HANA system.
     * 
     * @param interestEntity
     *     {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntity InterestEntity} entity. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.InterestEntityDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    InterestEntityDeleteFluentHelper deleteInterestEntity(
        @Nonnull
        final InterestEntity interestEntity);

    /**
     * <p>Creates a fluent helper for the <b>CreateCampaignFromTemplate</b> OData function import.</p>
     * 
     * @param templateID
     *     Constraints: Not nullable, Maximum length: 10<p>Original parameter name from the Odata EDM: <b>TemplateID</b></p>
     * @param campaignName
     *     Constraints: Not nullable, Maximum length: 40<p>Original parameter name from the Odata EDM: <b>CampaignName</b></p>
     * @return
     *     A fluent helper object that will execute the <b>CreateCampaignFromTemplate</b> OData function import with the provided parameters. To perform execution, call the {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.CreateCampaignFromTemplateFluentHelper#execute execute} method on the fluent helper object.
     */
    @Nonnull
    CreateCampaignFromTemplateFluentHelper createCampaignFromTemplate(final String templateID, final String campaignName);

}
