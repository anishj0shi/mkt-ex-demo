/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable.TargetGroupInteractionContactEntitySelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupInteractionContactEntity TargetGroupInteractionContactEntity} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class TargetGroupInteractionContactEntityLink<ObjectT extends VdmObject<?> >
    extends EntityLink<TargetGroupInteractionContactEntityLink<ObjectT> , TargetGroupInteractionContactEntity, ObjectT>
    implements TargetGroupInteractionContactEntitySelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public TargetGroupInteractionContactEntityLink(final String fieldName) {
        super(fieldName);
    }

    private TargetGroupInteractionContactEntityLink(final EntityLink<TargetGroupInteractionContactEntityLink<ObjectT> , TargetGroupInteractionContactEntity, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected TargetGroupInteractionContactEntityLink<ObjectT> translateLinkType(final EntityLink<TargetGroupInteractionContactEntityLink<ObjectT> , TargetGroupInteractionContactEntity, ObjectT> link) {
        return new TargetGroupInteractionContactEntityLink<ObjectT>(link);
    }

}
