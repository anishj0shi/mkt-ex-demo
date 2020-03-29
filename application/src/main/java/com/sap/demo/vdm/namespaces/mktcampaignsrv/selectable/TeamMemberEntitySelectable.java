/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity;


/**
 * Interface to enable OData entity selectors for {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity TeamMemberEntity}. This interface is used by {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.field.TeamMemberEntityField TeamMemberEntityField} and {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.link.TeamMemberEntityLink TeamMemberEntityLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity#CAMPAIGN_UUID CAMPAIGN_UUID}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity#TEAM_MEMBER_NAME TEAM_MEMBER_NAME}</li>
 * <li>{@link com.sap.demo.vdm.namespaces.mktcampaignsrv.TeamMemberEntity#IS_OWNER IS_OWNER}</li>
 * </ul>
 * 
 */
public interface TeamMemberEntitySelectable
    extends EntitySelectable<TeamMemberEntity>
{


}
