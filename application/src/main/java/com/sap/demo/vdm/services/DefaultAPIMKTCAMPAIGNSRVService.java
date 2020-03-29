/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.services;

import java.util.UUID;
import javax.annotation.Nonnull;
import javax.inject.Named;
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
@Named("com.sap.demo.vdm.services.DefaultAPIMKTCAMPAIGNSRVService")
public class DefaultAPIMKTCAMPAIGNSRVService
    implements APIMKTCAMPAIGNSRVService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link APIMKTCAMPAIGNSRVService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultAPIMKTCAMPAIGNSRVService() {
        servicePath = APIMKTCAMPAIGNSRVService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultAPIMKTCAMPAIGNSRVService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultAPIMKTCAMPAIGNSRVService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultAPIMKTCAMPAIGNSRVService(servicePath);
    }

    @Override
    @Nonnull
    public CampaignFluentHelper getAllCampaign() {
        return new CampaignFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CampaignByKeyFluentHelper getCampaignByKey(final UUID campaignUUID) {
        return new CampaignByKeyFluentHelper(servicePath, campaignUUID);
    }

    @Override
    @Nonnull
    public CampaignCreateFluentHelper createCampaign(
        @Nonnull
        final Campaign campaign) {
        return new CampaignCreateFluentHelper(servicePath, campaign);
    }

    @Override
    @Nonnull
    public CampaignUpdateFluentHelper updateCampaign(
        @Nonnull
        final Campaign campaign) {
        return new CampaignUpdateFluentHelper(servicePath, campaign);
    }

    @Override
    @Nonnull
    public AssignedTargetGroupEntityFluentHelper getAllAssignedTargetGroupEntity() {
        return new AssignedTargetGroupEntityFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public AssignedTargetGroupEntityByKeyFluentHelper getAssignedTargetGroupEntityByKey(final UUID targetGroupUUID, final UUID campaignUUID) {
        return new AssignedTargetGroupEntityByKeyFluentHelper(servicePath, targetGroupUUID, campaignUUID);
    }

    @Override
    @Nonnull
    public AssignedTargetGroupEntityCreateFluentHelper createAssignedTargetGroupEntity(
        @Nonnull
        final AssignedTargetGroupEntity assignedTargetGroupEntity) {
        return new AssignedTargetGroupEntityCreateFluentHelper(servicePath, assignedTargetGroupEntity);
    }

    @Override
    @Nonnull
    public AssignedTargetGroupEntityDeleteFluentHelper deleteAssignedTargetGroupEntity(
        @Nonnull
        final AssignedTargetGroupEntity assignedTargetGroupEntity) {
        return new AssignedTargetGroupEntityDeleteFluentHelper(servicePath, assignedTargetGroupEntity);
    }

    @Override
    @Nonnull
    public SpendHeaderTimeSplitFluentHelper getAllSpendHeaderTimeSplit() {
        return new SpendHeaderTimeSplitFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SpendHeaderTimeSplitByKeyFluentHelper getSpendHeaderTimeSplitByKey(final UUID marketingSpendHdrTimeSplitUUID) {
        return new SpendHeaderTimeSplitByKeyFluentHelper(servicePath, marketingSpendHdrTimeSplitUUID);
    }

    @Override
    @Nonnull
    public SpendItemTimeSplitFluentHelper getAllSpendItemTimeSplit() {
        return new SpendItemTimeSplitFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SpendItemTimeSplitByKeyFluentHelper getSpendItemTimeSplitByKey(final UUID marketingSpendItmTimeSplitUUID) {
        return new SpendItemTimeSplitByKeyFluentHelper(servicePath, marketingSpendItmTimeSplitUUID);
    }

    @Override
    @Nonnull
    public SpendItemTimeSplitCreateFluentHelper createSpendItemTimeSplit(
        @Nonnull
        final SpendItemTimeSplit spendItemTimeSplit) {
        return new SpendItemTimeSplitCreateFluentHelper(servicePath, spendItemTimeSplit);
    }

    @Override
    @Nonnull
    public SpendItemTimeSplitUpdateFluentHelper updateSpendItemTimeSplit(
        @Nonnull
        final SpendItemTimeSplit spendItemTimeSplit) {
        return new SpendItemTimeSplitUpdateFluentHelper(servicePath, spendItemTimeSplit);
    }

    @Override
    @Nonnull
    public SpendItemTimeSplitDeleteFluentHelper deleteSpendItemTimeSplit(
        @Nonnull
        final SpendItemTimeSplit spendItemTimeSplit) {
        return new SpendItemTimeSplitDeleteFluentHelper(servicePath, spendItemTimeSplit);
    }

    @Override
    @Nonnull
    public ActualSpendFluentHelper getAllActualSpend() {
        return new ActualSpendFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ActualSpendByKeyFluentHelper getActualSpendByKey(final UUID campaignUUID) {
        return new ActualSpendByKeyFluentHelper(servicePath, campaignUUID);
    }

    @Override
    @Nonnull
    public SpendItemFluentHelper getAllSpendItem() {
        return new SpendItemFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SpendItemByKeyFluentHelper getSpendItemByKey(final UUID marketingSpendItemUUID) {
        return new SpendItemByKeyFluentHelper(servicePath, marketingSpendItemUUID);
    }

    @Override
    @Nonnull
    public SpendItemCreateFluentHelper createSpendItem(
        @Nonnull
        final SpendItem spendItem) {
        return new SpendItemCreateFluentHelper(servicePath, spendItem);
    }

    @Override
    @Nonnull
    public SpendItemUpdateFluentHelper updateSpendItem(
        @Nonnull
        final SpendItem spendItem) {
        return new SpendItemUpdateFluentHelper(servicePath, spendItem);
    }

    @Override
    @Nonnull
    public SpendItemDeleteFluentHelper deleteSpendItem(
        @Nonnull
        final SpendItem spendItem) {
        return new SpendItemDeleteFluentHelper(servicePath, spendItem);
    }

    @Override
    @Nonnull
    public SpendHeaderFluentHelper getAllSpendHeader() {
        return new SpendHeaderFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SpendHeaderByKeyFluentHelper getSpendHeaderByKey(final UUID marketingSpendHeaderUUID) {
        return new SpendHeaderByKeyFluentHelper(servicePath, marketingSpendHeaderUUID);
    }

    @Override
    @Nonnull
    public SpendHeaderCreateFluentHelper createSpendHeader(
        @Nonnull
        final SpendHeader spendHeader) {
        return new SpendHeaderCreateFluentHelper(servicePath, spendHeader);
    }

    @Override
    @Nonnull
    public SpendHeaderUpdateFluentHelper updateSpendHeader(
        @Nonnull
        final SpendHeader spendHeader) {
        return new SpendHeaderUpdateFluentHelper(servicePath, spendHeader);
    }

    @Override
    @Nonnull
    public MarketingAgencyEntityFluentHelper getAllMarketingAgencyEntity() {
        return new MarketingAgencyEntityFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public MarketingAgencyEntityByKeyFluentHelper getMarketingAgencyEntityByKey(final UUID campaignUUID, final UUID marketingAgencyUUID) {
        return new MarketingAgencyEntityByKeyFluentHelper(servicePath, campaignUUID, marketingAgencyUUID);
    }

    @Override
    @Nonnull
    public TeamMemberEntityFluentHelper getAllTeamMemberEntity() {
        return new TeamMemberEntityFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public TeamMemberEntityByKeyFluentHelper getTeamMemberEntityByKey(final UUID campaignUUID, final String teamMemberName) {
        return new TeamMemberEntityByKeyFluentHelper(servicePath, campaignUUID, teamMemberName);
    }

    @Override
    @Nonnull
    public TeamMemberEntityCreateFluentHelper createTeamMemberEntity(
        @Nonnull
        final TeamMemberEntity teamMemberEntity) {
        return new TeamMemberEntityCreateFluentHelper(servicePath, teamMemberEntity);
    }

    @Override
    @Nonnull
    public TeamMemberEntityUpdateFluentHelper updateTeamMemberEntity(
        @Nonnull
        final TeamMemberEntity teamMemberEntity) {
        return new TeamMemberEntityUpdateFluentHelper(servicePath, teamMemberEntity);
    }

    @Override
    @Nonnull
    public TeamMemberEntityDeleteFluentHelper deleteTeamMemberEntity(
        @Nonnull
        final TeamMemberEntity teamMemberEntity) {
        return new TeamMemberEntityDeleteFluentHelper(servicePath, teamMemberEntity);
    }

    @Override
    @Nonnull
    public ExternalCampaignReferenceEntityFluentHelper getAllExternalCampaignReferenceEntity() {
        return new ExternalCampaignReferenceEntityFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public ExternalCampaignReferenceEntityByKeyFluentHelper getExternalCampaignReferenceEntityByKey(final UUID externalCampaignUUID) {
        return new ExternalCampaignReferenceEntityByKeyFluentHelper(servicePath, externalCampaignUUID);
    }

    @Override
    @Nonnull
    public InterestEntityFluentHelper getAllInterestEntity() {
        return new InterestEntityFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public InterestEntityByKeyFluentHelper getInterestEntityByKey(final UUID campaignUUID, final String interestItem) {
        return new InterestEntityByKeyFluentHelper(servicePath, campaignUUID, interestItem);
    }

    @Override
    @Nonnull
    public InterestEntityCreateFluentHelper createInterestEntity(
        @Nonnull
        final InterestEntity interestEntity) {
        return new InterestEntityCreateFluentHelper(servicePath, interestEntity);
    }

    @Override
    @Nonnull
    public InterestEntityDeleteFluentHelper deleteInterestEntity(
        @Nonnull
        final InterestEntity interestEntity) {
        return new InterestEntityDeleteFluentHelper(servicePath, interestEntity);
    }

    @Override
    @Nonnull
    public CreateCampaignFromTemplateFluentHelper createCampaignFromTemplate(final String templateID, final String campaignName) {
        return new CreateCampaignFromTemplateFluentHelper(servicePath, templateID, campaignName);
    }

}
