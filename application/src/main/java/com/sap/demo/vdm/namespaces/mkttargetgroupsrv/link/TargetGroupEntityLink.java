/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable.TargetGroupEntitySelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.demo.vdm.namespaces.mkttargetgroupsrv.TargetGroupEntity TargetGroupEntity} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class TargetGroupEntityLink<ObjectT extends VdmObject<?> >
    extends EntityLink<TargetGroupEntityLink<ObjectT> , TargetGroupEntity, ObjectT>
    implements TargetGroupEntitySelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public TargetGroupEntityLink(final String fieldName) {
        super(fieldName);
    }

    private TargetGroupEntityLink(final EntityLink<TargetGroupEntityLink<ObjectT> , TargetGroupEntity, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected TargetGroupEntityLink<ObjectT> translateLinkType(final EntityLink<TargetGroupEntityLink<ObjectT> , TargetGroupEntity, ObjectT> link) {
        return new TargetGroupEntityLink<ObjectT>(link);
    }

}
