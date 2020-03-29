/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.demo.vdm.namespaces.mkttargetgroupsrv;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.field.TargetGroupInteractionContactEntityField;
import com.sap.demo.vdm.namespaces.mkttargetgroupsrv.selectable.TargetGroupInteractionContactEntitySelectable;
import com.sap.demo.vdm.services.APIMKTTARGETGROUPSRVService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original entity name from the Odata EDM: <b>TargetGroupInteractionContactEntityType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class TargetGroupInteractionContactEntity
    extends VdmEntity<TargetGroupInteractionContactEntity>
{

    /**
     * Selector for all available fields of TargetGroupInteractionContactEntity.
     * 
     */
    public final static TargetGroupInteractionContactEntitySelectable ALL_FIELDS = new TargetGroupInteractionContactEntitySelectable() {


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
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupMemberUUID</b></p><p>The UUID is used to identify an entity type instance in the system. This must be provided when updating or deleting entity type instances.</p>
     * 
     * @return
     *     The API UUID indentifies a specific entity type instance.
     */
    @Key
    @SerializedName("TargetGroupMemberUUID")
    @JsonProperty("TargetGroupMemberUUID")
    @Nullable
    @ODataField(odataName = "TargetGroupMemberUUID")
    private UUID targetGroupMemberUUID;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupMemberUUID</b> field to query operations.
     * 
     */
    public final static TargetGroupInteractionContactEntityField<UUID> TARGET_GROUP_MEMBER_UUID = new TargetGroupInteractionContactEntityField<UUID>("TargetGroupMemberUUID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionContactUUID</b></p><p>Any valid 32-character GUUID like 00000000-0000-0000-0000-000000000000.</p>
     * 
     * @return
     *     Indicates the interaction contact UUID. It can be any valid GUUID.
     */
    @SerializedName("InteractionContactUUID")
    @JsonProperty("InteractionContactUUID")
    @Nullable
    @ODataField(odataName = "InteractionContactUUID")
    private UUID interactionContactUUID;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContactUUID</b> field to query operations.
     * 
     */
    public final static TargetGroupInteractionContactEntityField<UUID> INTERACTION_CONTACT_UUID = new TargetGroupInteractionContactEntityField<UUID>("InteractionContactUUID");
    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupUUID</b></p><p>To hold the value of target group UUID.32-bit unique key. For example: 1c98ec17-ac45-1ed7-a7c0-1c8c7b9199ad.</p>
     * 
     * @return
     *     Indicates the technical key of a Target Group.
     */
    @SerializedName("TargetGroupUUID")
    @JsonProperty("TargetGroupUUID")
    @Nullable
    @ODataField(odataName = "TargetGroupUUID")
    private UUID targetGroupUUID;
    /**
     * Use with available fluent helpers to apply the <b>TargetGroupUUID</b> field to query operations.
     * 
     */
    public final static TargetGroupInteractionContactEntityField<UUID> TARGET_GROUP_UUID = new TargetGroupInteractionContactEntityField<UUID>("TargetGroupUUID");
    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>InteractionContactId</b></p><p>This is the main ID of a contact or corporate account in an external system or origin.Examples of external IDs are a SAP CRM ID, a Facebook ID, or the contact's ID in a Web Shop.</p>
     * 
     * @return
     *     This is the external ID of an interaction contact.
     */
    @SerializedName("InteractionContactId")
    @JsonProperty("InteractionContactId")
    @Nullable
    @ODataField(odataName = "InteractionContactId")
    private String interactionContactId;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContactId</b> field to query operations.
     * 
     */
    public final static TargetGroupInteractionContactEntityField<String> INTERACTION_CONTACT_ID = new TargetGroupInteractionContactEntityField<String>("InteractionContactId");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionContactOrigin</b></p><p>The origin could be the source system from which an ID derived, such as SAP CRM, or it can indicate the type of ID in question, such as email or mobile phone.You can set up the origins you want to use in the configuration app Origin of Contact IDs or in the Customizing activity Define Origins of Contact IDs.</p>
     * 
     * @return
     *     The origin of an interaction contact ID indicates the source of an ID, in other words, where it originated.
     */
    @SerializedName("InteractionContactOrigin")
    @JsonProperty("InteractionContactOrigin")
    @Nullable
    @ODataField(odataName = "InteractionContactOrigin")
    private String interactionContactOrigin;
    /**
     * Use with available fluent helpers to apply the <b>InteractionContactOrigin</b> field to query operations.
     * 
     */
    public final static TargetGroupInteractionContactEntityField<String> INTERACTION_CONTACT_ORIGIN = new TargetGroupInteractionContactEntityField<String>("InteractionContactOrigin");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<TargetGroupInteractionContactEntity> getType() {
        return TargetGroupInteractionContactEntity.class;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupMemberUUID</b></p><p>The UUID is used to identify an entity type instance in the system. This must be provided when updating or deleting entity type instances.</p>
     * 
     * @param targetGroupMemberUUID
     *     The API UUID indentifies a specific entity type instance.
     */
    public void setTargetGroupMemberUUID(
        @Nullable
        final UUID targetGroupMemberUUID) {
        rememberChangedField("TargetGroupMemberUUID", this.targetGroupMemberUUID);
        this.targetGroupMemberUUID = targetGroupMemberUUID;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>InteractionContactUUID</b></p><p>Any valid 32-character GUUID like 00000000-0000-0000-0000-000000000000.</p>
     * 
     * @param interactionContactUUID
     *     Indicates the interaction contact UUID. It can be any valid GUUID.
     */
    public void setInteractionContactUUID(
        @Nullable
        final UUID interactionContactUUID) {
        rememberChangedField("InteractionContactUUID", this.interactionContactUUID);
        this.interactionContactUUID = interactionContactUUID;
    }

    /**
     * Constraints: Not nullable<p>Original property name from the Odata EDM: <b>TargetGroupUUID</b></p><p>To hold the value of target group UUID.32-bit unique key. For example: 1c98ec17-ac45-1ed7-a7c0-1c8c7b9199ad.</p>
     * 
     * @param targetGroupUUID
     *     Indicates the technical key of a Target Group.
     */
    public void setTargetGroupUUID(
        @Nullable
        final UUID targetGroupUUID) {
        rememberChangedField("TargetGroupUUID", this.targetGroupUUID);
        this.targetGroupUUID = targetGroupUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 255 <p>Original property name from the Odata EDM: <b>InteractionContactId</b></p><p>This is the main ID of a contact or corporate account in an external system or origin.Examples of external IDs are a SAP CRM ID, a Facebook ID, or the contact's ID in a Web Shop.</p>
     * 
     * @param interactionContactId
     *     This is the external ID of an interaction contact.
     */
    public void setInteractionContactId(
        @Nullable
        final String interactionContactId) {
        rememberChangedField("InteractionContactId", this.interactionContactId);
        this.interactionContactId = interactionContactId;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>InteractionContactOrigin</b></p><p>The origin could be the source system from which an ID derived, such as SAP CRM, or it can indicate the type of ID in question, such as email or mobile phone.You can set up the origins you want to use in the configuration app Origin of Contact IDs or in the Customizing activity Define Origins of Contact IDs.</p>
     * 
     * @param interactionContactOrigin
     *     The origin of an interaction contact ID indicates the source of an ID, in other words, where it originated.
     */
    public void setInteractionContactOrigin(
        @Nullable
        final String interactionContactOrigin) {
        rememberChangedField("InteractionContactOrigin", this.interactionContactOrigin);
        this.interactionContactOrigin = interactionContactOrigin;
    }

    @Override
    protected String getEntityCollection() {
        return "TargetGroupInteractionContacts";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("TargetGroupMemberUUID", getTargetGroupMemberUUID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("TargetGroupMemberUUID", getTargetGroupMemberUUID());
        values.put("InteractionContactUUID", getInteractionContactUUID());
        values.put("TargetGroupUUID", getTargetGroupUUID());
        values.put("InteractionContactId", getInteractionContactId());
        values.put("InteractionContactOrigin", getInteractionContactOrigin());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("TargetGroupMemberUUID")) {
                final Object value = values.remove("TargetGroupMemberUUID");
                if ((value == null)||(!value.equals(getTargetGroupMemberUUID()))) {
                    setTargetGroupMemberUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionContactUUID")) {
                final Object value = values.remove("InteractionContactUUID");
                if ((value == null)||(!value.equals(getInteractionContactUUID()))) {
                    setInteractionContactUUID(((UUID) value));
                }
            }
            if (values.containsKey("TargetGroupUUID")) {
                final Object value = values.remove("TargetGroupUUID");
                if ((value == null)||(!value.equals(getTargetGroupUUID()))) {
                    setTargetGroupUUID(((UUID) value));
                }
            }
            if (values.containsKey("InteractionContactId")) {
                final Object value = values.remove("InteractionContactId");
                if ((value == null)||(!value.equals(getInteractionContactId()))) {
                    setInteractionContactId(((String) value));
                }
            }
            if (values.containsKey("InteractionContactOrigin")) {
                final Object value = values.remove("InteractionContactOrigin");
                if ((value == null)||(!value.equals(getInteractionContactOrigin()))) {
                    setInteractionContactOrigin(((String) value));
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
    public static<T >TargetGroupInteractionContactEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new TargetGroupInteractionContactEntityField<T>(fieldName);
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
    public static<T,DomainT >TargetGroupInteractionContactEntityField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new TargetGroupInteractionContactEntityField<T>(fieldName, typeConverter);
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

}
