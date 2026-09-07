/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.client.JSON;
import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.UnparsedObject;

@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = ScheduleDataIncludedItem.ScheduleDataIncludedItemDeserializer.class)
@JsonSerialize(using = ScheduleDataIncludedItem.ScheduleDataIncludedItemSerializer.class)
public class ScheduleDataIncludedItem extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ScheduleDataIncludedItem.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ScheduleDataIncludedItemSerializer extends StdSerializer<ScheduleDataIncludedItem> {
        public ScheduleDataIncludedItemSerializer(Class<ScheduleDataIncludedItem> t) {
            super(t);
        }

        public ScheduleDataIncludedItemSerializer() {
            this(null);
        }

        @Override
        public void serialize(ScheduleDataIncludedItem value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ScheduleDataIncludedItemDeserializer extends StdDeserializer<ScheduleDataIncludedItem> {
        public ScheduleDataIncludedItemDeserializer() {
            this(ScheduleDataIncludedItem.class);
        }

        public ScheduleDataIncludedItemDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ScheduleDataIncludedItem deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize TeamReference
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TeamReference.class.equals(Integer.class) || TeamReference.class.equals(Long.class) || TeamReference.class.equals(Float.class) || TeamReference.class.equals(Double.class) || TeamReference.class.equals(Boolean.class) || TeamReference.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TeamReference.class.equals(Integer.class) || TeamReference.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TeamReference.class.equals(Float.class) || TeamReference.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TeamReference.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TeamReference.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TeamReference.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TeamReference)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TeamReference'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TeamReference'", e);
            }
            
            // deserialize Layer
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Layer.class.equals(Integer.class) || Layer.class.equals(Long.class) || Layer.class.equals(Float.class) || Layer.class.equals(Double.class) || Layer.class.equals(Boolean.class) || Layer.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Layer.class.equals(Integer.class) || Layer.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Layer.class.equals(Float.class) || Layer.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (Layer.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Layer.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(Layer.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((Layer)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'Layer'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Layer'", e);
            }
            
            // deserialize ScheduleMember
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ScheduleMember.class.equals(Integer.class) || ScheduleMember.class.equals(Long.class) || ScheduleMember.class.equals(Float.class) || ScheduleMember.class.equals(Double.class) || ScheduleMember.class.equals(Boolean.class) || ScheduleMember.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ScheduleMember.class.equals(Integer.class) || ScheduleMember.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ScheduleMember.class.equals(Float.class) || ScheduleMember.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ScheduleMember.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ScheduleMember.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ScheduleMember.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ScheduleMember)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ScheduleMember'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ScheduleMember'", e);
            }
            
            // deserialize ScheduleUser
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ScheduleUser.class.equals(Integer.class) || ScheduleUser.class.equals(Long.class) || ScheduleUser.class.equals(Float.class) || ScheduleUser.class.equals(Double.class) || ScheduleUser.class.equals(Boolean.class) || ScheduleUser.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ScheduleUser.class.equals(Integer.class) || ScheduleUser.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ScheduleUser.class.equals(Float.class) || ScheduleUser.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ScheduleUser.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ScheduleUser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ScheduleUser.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ScheduleUser)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ScheduleUser'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ScheduleUser'", e);
            }
            
            ScheduleDataIncludedItem ret = new ScheduleDataIncludedItem();
            if (match == 1) {
                ret.setActualInstance(deserialized);
            } else {
                Map<String, Object> res = new ObjectMapper().readValue(tree.traverse(jp.getCodec()).readValueAsTree().toString(), new TypeReference<Map<String, Object>>() {});
                ret.setActualInstance(new UnparsedObject(res));
            }
            return ret;
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ScheduleDataIncludedItem getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ScheduleDataIncludedItem cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ScheduleDataIncludedItem() {
        super("oneOf", Boolean.FALSE);
    }
    public ScheduleDataIncludedItem(TeamReference o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ScheduleDataIncludedItem(Layer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ScheduleDataIncludedItem(ScheduleMember o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ScheduleDataIncludedItem(ScheduleUser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TeamReference", new GenericType<TeamReference>() {
        });
        schemas.put("Layer", new GenericType<Layer>() {
        });
        schemas.put("ScheduleMember", new GenericType<ScheduleMember>() {
        });
        schemas.put("ScheduleUser", new GenericType<ScheduleUser>() {
        });
        JSON.registerDescendants(ScheduleDataIncludedItem.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ScheduleDataIncludedItem.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TeamReference, Layer, ScheduleMember, ScheduleUser
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(TeamReference.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(Layer.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ScheduleMember.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ScheduleUser.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be TeamReference, Layer, ScheduleMember, ScheduleUser");
    }

    /**
     * Get the actual instance, which can be the following:
     * TeamReference, Layer, ScheduleMember, ScheduleUser
     *
     * @return The actual instance (TeamReference, Layer, ScheduleMember, ScheduleUser)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TeamReference`. If the actual instance is not `TeamReference`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamReference`
     * @throws ClassCastException if the instance is not `TeamReference`
     */
    public TeamReference getTeamReference() throws ClassCastException {
        return (TeamReference)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Layer`. If the actual instance is not `Layer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Layer`
     * @throws ClassCastException if the instance is not `Layer`
     */
    public Layer getLayer() throws ClassCastException {
        return (Layer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScheduleMember`. If the actual instance is not `ScheduleMember`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScheduleMember`
     * @throws ClassCastException if the instance is not `ScheduleMember`
     */
    public ScheduleMember getScheduleMember() throws ClassCastException {
        return (ScheduleMember)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScheduleUser`. If the actual instance is not `ScheduleUser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScheduleUser`
     * @throws ClassCastException if the instance is not `ScheduleUser`
     */
    public ScheduleUser getScheduleUser() throws ClassCastException {
        return (ScheduleUser)super.getActualInstance();
    }
}
