/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mktcampaignsrv.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend;
import com.sap.demo.vdm.namespaces.mktcampaignsrv.selectable.ActualSpendSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.demo.vdm.namespaces.mktcampaignsrv.ActualSpend ActualSpend} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class ActualSpendLink<ObjectT extends VdmObject<?> >
    extends EntityLink<ActualSpendLink<ObjectT> , ActualSpend, ObjectT>
    implements ActualSpendSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public ActualSpendLink(final String fieldName) {
        super(fieldName);
    }

    private ActualSpendLink(final EntityLink<ActualSpendLink<ObjectT> , ActualSpend, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected ActualSpendLink<ObjectT> translateLinkType(final EntityLink<ActualSpendLink<ObjectT> , ActualSpend, ObjectT> link) {
        return new ActualSpendLink<ObjectT>(link);
    }

}
