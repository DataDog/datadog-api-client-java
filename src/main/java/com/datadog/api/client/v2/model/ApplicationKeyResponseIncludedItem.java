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
@JsonDeserialize(using = ApplicationKeyResponseIncludedItem.ApplicationKeyResponseIncludedItemDeserializer.class)
@JsonSerialize(using = ApplicationKeyResponseIncludedItem.ApplicationKeyResponseIncludedItemSerializer.class)
public class ApplicationKeyResponseIncludedItem extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ApplicationKeyResponseIncludedItem.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ApplicationKeyResponseIncludedItemSerializer extends StdSerializer<ApplicationKeyResponseIncludedItem> {
        public ApplicationKeyResponseIncludedItemSerializer(Class<ApplicationKeyResponseIncludedItem> t) {
            super(t);
        }

        public ApplicationKeyResponseIncludedItemSerializer() {
            this(null);
        }

        @Override
        public void serialize(ApplicationKeyResponseIncludedItem value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ApplicationKeyResponseIncludedItemDeserializer extends StdDeserializer<ApplicationKeyResponseIncludedItem> {
        public ApplicationKeyResponseIncludedItemDeserializer() {
            this(ApplicationKeyResponseIncludedItem.class);
        }

        public ApplicationKeyResponseIncludedItemDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ApplicationKeyResponseIncludedItem deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize User
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (User.class.equals(Integer.class) || User.class.equals(Long.class) || User.class.equals(Float.class) || User.class.equals(Double.class) || User.class.equals(Boolean.class) || User.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((User.class.equals(Integer.class) || User.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((User.class.equals(Float.class) || User.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (User.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (User.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(User.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((User)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'User'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'User'", e);
            }
            
            // deserialize Role
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Role.class.equals(Integer.class) || Role.class.equals(Long.class) || Role.class.equals(Float.class) || Role.class.equals(Double.class) || Role.class.equals(Boolean.class) || Role.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Role.class.equals(Integer.class) || Role.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Role.class.equals(Float.class) || Role.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (Role.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Role.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(Role.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((Role)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'Role'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Role'", e);
            }
            
            // deserialize LeakedKey
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LeakedKey.class.equals(Integer.class) || LeakedKey.class.equals(Long.class) || LeakedKey.class.equals(Float.class) || LeakedKey.class.equals(Double.class) || LeakedKey.class.equals(Boolean.class) || LeakedKey.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LeakedKey.class.equals(Integer.class) || LeakedKey.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LeakedKey.class.equals(Float.class) || LeakedKey.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LeakedKey.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LeakedKey.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LeakedKey.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LeakedKey)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LeakedKey'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LeakedKey'", e);
            }
            
            ApplicationKeyResponseIncludedItem ret = new ApplicationKeyResponseIncludedItem();
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
        public ApplicationKeyResponseIncludedItem getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ApplicationKeyResponseIncludedItem cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ApplicationKeyResponseIncludedItem() {
        super("oneOf", Boolean.FALSE);
    }
    public ApplicationKeyResponseIncludedItem(User o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ApplicationKeyResponseIncludedItem(Role o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ApplicationKeyResponseIncludedItem(LeakedKey o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("User", new GenericType<User>() {
        });
        schemas.put("Role", new GenericType<Role>() {
        });
        schemas.put("LeakedKey", new GenericType<LeakedKey>() {
        });
        JSON.registerDescendants(ApplicationKeyResponseIncludedItem.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ApplicationKeyResponseIncludedItem.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * User, Role, LeakedKey
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(User.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(Role.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LeakedKey.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be User, Role, LeakedKey");
    }

    /**
     * Get the actual instance, which can be the following:
     * User, Role, LeakedKey
     *
     * @return The actual instance (User, Role, LeakedKey)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `User`. If the actual instance is not `User`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `User`
     * @throws ClassCastException if the instance is not `User`
     */
    public User getUser() throws ClassCastException {
        return (User)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Role`. If the actual instance is not `Role`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Role`
     * @throws ClassCastException if the instance is not `Role`
     */
    public Role getRole() throws ClassCastException {
        return (Role)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LeakedKey`. If the actual instance is not `LeakedKey`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LeakedKey`
     * @throws ClassCastException if the instance is not `LeakedKey`
     */
    public LeakedKey getLeakedKey() throws ClassCastException {
        return (LeakedKey)super.getActualInstance();
    }
}
