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
@JsonDeserialize(using = EntityV3APISpecInterface.EntityV3APISpecInterfaceDeserializer.class)
@JsonSerialize(using = EntityV3APISpecInterface.EntityV3APISpecInterfaceSerializer.class)
public class EntityV3APISpecInterface extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EntityV3APISpecInterface.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class EntityV3APISpecInterfaceSerializer extends StdSerializer<EntityV3APISpecInterface> {
        public EntityV3APISpecInterfaceSerializer(Class<EntityV3APISpecInterface> t) {
            super(t);
        }

        public EntityV3APISpecInterfaceSerializer() {
            this(null);
        }

        @Override
        public void serialize(EntityV3APISpecInterface value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class EntityV3APISpecInterfaceDeserializer extends StdDeserializer<EntityV3APISpecInterface> {
        public EntityV3APISpecInterfaceDeserializer() {
            this(EntityV3APISpecInterface.class);
        }

        public EntityV3APISpecInterfaceDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public EntityV3APISpecInterface deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize EntityV3APISpecInterfaceFileRef
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EntityV3APISpecInterfaceFileRef.class.equals(Integer.class) || EntityV3APISpecInterfaceFileRef.class.equals(Long.class) || EntityV3APISpecInterfaceFileRef.class.equals(Float.class) || EntityV3APISpecInterfaceFileRef.class.equals(Double.class) || EntityV3APISpecInterfaceFileRef.class.equals(Boolean.class) || EntityV3APISpecInterfaceFileRef.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EntityV3APISpecInterfaceFileRef.class.equals(Integer.class) || EntityV3APISpecInterfaceFileRef.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EntityV3APISpecInterfaceFileRef.class.equals(Float.class) || EntityV3APISpecInterfaceFileRef.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (EntityV3APISpecInterfaceFileRef.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EntityV3APISpecInterfaceFileRef.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(EntityV3APISpecInterfaceFileRef.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((EntityV3APISpecInterfaceFileRef)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'EntityV3APISpecInterfaceFileRef'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EntityV3APISpecInterfaceFileRef'", e);
            }
            
            // deserialize EntityV3APISpecInterfaceDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EntityV3APISpecInterfaceDefinition.class.equals(Integer.class) || EntityV3APISpecInterfaceDefinition.class.equals(Long.class) || EntityV3APISpecInterfaceDefinition.class.equals(Float.class) || EntityV3APISpecInterfaceDefinition.class.equals(Double.class) || EntityV3APISpecInterfaceDefinition.class.equals(Boolean.class) || EntityV3APISpecInterfaceDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EntityV3APISpecInterfaceDefinition.class.equals(Integer.class) || EntityV3APISpecInterfaceDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EntityV3APISpecInterfaceDefinition.class.equals(Float.class) || EntityV3APISpecInterfaceDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (EntityV3APISpecInterfaceDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EntityV3APISpecInterfaceDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(EntityV3APISpecInterfaceDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((EntityV3APISpecInterfaceDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'EntityV3APISpecInterfaceDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EntityV3APISpecInterfaceDefinition'", e);
            }
            
            EntityV3APISpecInterface ret = new EntityV3APISpecInterface();
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
        public EntityV3APISpecInterface getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "EntityV3APISpecInterface cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public EntityV3APISpecInterface() {
        super("oneOf", Boolean.FALSE);
    }
    public EntityV3APISpecInterface(EntityV3APISpecInterfaceFileRef o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public EntityV3APISpecInterface(EntityV3APISpecInterfaceDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EntityV3APISpecInterfaceFileRef", new GenericType<EntityV3APISpecInterfaceFileRef>() {
        });
        schemas.put("EntityV3APISpecInterfaceDefinition", new GenericType<EntityV3APISpecInterfaceDefinition>() {
        });
        JSON.registerDescendants(EntityV3APISpecInterface.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return EntityV3APISpecInterface.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EntityV3APISpecInterfaceFileRef, EntityV3APISpecInterfaceDefinition
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(EntityV3APISpecInterfaceFileRef.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(EntityV3APISpecInterfaceDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be EntityV3APISpecInterfaceFileRef, EntityV3APISpecInterfaceDefinition");
    }

    /**
     * Get the actual instance, which can be the following:
     * EntityV3APISpecInterfaceFileRef, EntityV3APISpecInterfaceDefinition
     *
     * @return The actual instance (EntityV3APISpecInterfaceFileRef, EntityV3APISpecInterfaceDefinition)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EntityV3APISpecInterfaceFileRef`. If the actual instance is not `EntityV3APISpecInterfaceFileRef`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EntityV3APISpecInterfaceFileRef`
     * @throws ClassCastException if the instance is not `EntityV3APISpecInterfaceFileRef`
     */
    public EntityV3APISpecInterfaceFileRef getEntityV3APISpecInterfaceFileRef() throws ClassCastException {
        return (EntityV3APISpecInterfaceFileRef)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EntityV3APISpecInterfaceDefinition`. If the actual instance is not `EntityV3APISpecInterfaceDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EntityV3APISpecInterfaceDefinition`
     * @throws ClassCastException if the instance is not `EntityV3APISpecInterfaceDefinition`
     */
    public EntityV3APISpecInterfaceDefinition getEntityV3APISpecInterfaceDefinition() throws ClassCastException {
        return (EntityV3APISpecInterfaceDefinition)super.getActualInstance();
    }
}
