/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.SpendHeaderSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.SpendHeader SpendHeader} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class SpendHeaderLink<ObjectT extends VdmObject<?> >
    extends EntityLink<SpendHeaderLink<ObjectT> , SpendHeader, ObjectT>
    implements SpendHeaderSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public SpendHeaderLink(final String fieldName) {
        super(fieldName);
    }

    private SpendHeaderLink(final EntityLink<SpendHeaderLink<ObjectT> , SpendHeader, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected SpendHeaderLink<ObjectT> translateLinkType(final EntityLink<SpendHeaderLink<ObjectT> , SpendHeader, ObjectT> link) {
        return new SpendHeaderLink<ObjectT>(link);
    }

}
