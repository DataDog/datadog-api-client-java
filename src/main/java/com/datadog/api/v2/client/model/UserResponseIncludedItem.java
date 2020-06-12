/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.Organization;
import com.datadog.api.v2.client.model.Permission;
import com.datadog.api.v2.client.model.Role;
import com.datadog.api.v2.client.model.RoleAttributes;
import com.datadog.api.v2.client.model.RoleResponseRelationships;
import com.datadog.api.v2.client.model.RolesType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.datadog.api.v2.client.JSON;


@JsonDeserialize(using = UserResponseIncludedItem.UserResponseIncludedItemDeserializer.class)
@JsonSerialize(using = UserResponseIncludedItem.UserResponseIncludedItemSerializer.class)
public class UserResponseIncludedItem extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UserResponseIncludedItem.class.getName());

    public static class UserResponseIncludedItemSerializer extends StdSerializer<UserResponseIncludedItem> {
        public UserResponseIncludedItemSerializer(Class<UserResponseIncludedItem> t) {
            super(t);
        }

        public UserResponseIncludedItemSerializer() {
            this(null);
        }

        @Override
        public void serialize(UserResponseIncludedItem value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class UserResponseIncludedItemDeserializer extends StdDeserializer<UserResponseIncludedItem> {
        public UserResponseIncludedItemDeserializer() {
            this(UserResponseIncludedItem.class);
        }

        public UserResponseIncludedItemDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public UserResponseIncludedItem deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            int match = 0;
            // deserialize Organization
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Organization.class);
                // TODO: there is no validation against JSON schema constraints
                // (min, max, enum, pattern...), this does not perform a strict JSON
                // validation, which means the 'match' count may be higher than it should be.
                match++;
                log.log(Level.FINER, "Input data matches schema 'Organization'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Organization'", e);
            }

            // deserialize Permission
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Permission.class);
                // TODO: there is no validation against JSON schema constraints
                // (min, max, enum, pattern...), this does not perform a strict JSON
                // validation, which means the 'match' count may be higher than it should be.
                match++;
                log.log(Level.FINER, "Input data matches schema 'Permission'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Permission'", e);
            }

            // deserialize Role
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Role.class);
                // TODO: there is no validation against JSON schema constraints
                // (min, max, enum, pattern...), this does not perform a strict JSON
                // validation, which means the 'match' count may be higher than it should be.
                match++;
                log.log(Level.FINER, "Input data matches schema 'Role'");
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Role'", e);
            }

            if (match == 1) {
                UserResponseIncludedItem ret = new UserResponseIncludedItem();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for UserResponseIncludedItem: %d classes match result, expected 1", match));
        }


        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public UserResponseIncludedItem getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "UserResponseIncludedItem cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public final static Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UserResponseIncludedItem() {
        super("oneOf", Boolean.FALSE);
    }

    public UserResponseIncludedItem(Organization o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserResponseIncludedItem(Permission o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserResponseIncludedItem(Role o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Organization", new GenericType<Organization>() {
        });
        schemas.put("Permission", new GenericType<Permission>() {
        });
        schemas.put("Role", new GenericType<Role>() {
        });
        JSON.registerDescendants(UserResponseIncludedItem.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UserResponseIncludedItem.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas.
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Organization.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Permission.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Role.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Organization, Permission, Role");
    }



}

