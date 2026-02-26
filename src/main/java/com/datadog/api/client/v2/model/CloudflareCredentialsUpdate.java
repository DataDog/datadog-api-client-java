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
@JsonDeserialize(using = CloudflareCredentialsUpdate.CloudflareCredentialsUpdateDeserializer.class)
@JsonSerialize(using = CloudflareCredentialsUpdate.CloudflareCredentialsUpdateSerializer.class)
public class CloudflareCredentialsUpdate extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CloudflareCredentialsUpdate.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class CloudflareCredentialsUpdateSerializer extends StdSerializer<CloudflareCredentialsUpdate> {
        public CloudflareCredentialsUpdateSerializer(Class<CloudflareCredentialsUpdate> t) {
            super(t);
        }

        public CloudflareCredentialsUpdateSerializer() {
            this(null);
        }

        @Override
        public void serialize(CloudflareCredentialsUpdate value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CloudflareCredentialsUpdateDeserializer extends StdDeserializer<CloudflareCredentialsUpdate> {
        public CloudflareCredentialsUpdateDeserializer() {
            this(CloudflareCredentialsUpdate.class);
        }

        public CloudflareCredentialsUpdateDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CloudflareCredentialsUpdate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CloudflareAPITokenUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CloudflareAPITokenUpdate.class.equals(Integer.class) || CloudflareAPITokenUpdate.class.equals(Long.class) || CloudflareAPITokenUpdate.class.equals(Float.class) || CloudflareAPITokenUpdate.class.equals(Double.class) || CloudflareAPITokenUpdate.class.equals(Boolean.class) || CloudflareAPITokenUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CloudflareAPITokenUpdate.class.equals(Integer.class) || CloudflareAPITokenUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CloudflareAPITokenUpdate.class.equals(Float.class) || CloudflareAPITokenUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CloudflareAPITokenUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CloudflareAPITokenUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CloudflareAPITokenUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CloudflareAPITokenUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CloudflareAPITokenUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CloudflareAPITokenUpdate'", e);
            }
            
            // deserialize CloudflareGlobalAPITokenUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CloudflareGlobalAPITokenUpdate.class.equals(Integer.class) || CloudflareGlobalAPITokenUpdate.class.equals(Long.class) || CloudflareGlobalAPITokenUpdate.class.equals(Float.class) || CloudflareGlobalAPITokenUpdate.class.equals(Double.class) || CloudflareGlobalAPITokenUpdate.class.equals(Boolean.class) || CloudflareGlobalAPITokenUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CloudflareGlobalAPITokenUpdate.class.equals(Integer.class) || CloudflareGlobalAPITokenUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CloudflareGlobalAPITokenUpdate.class.equals(Float.class) || CloudflareGlobalAPITokenUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CloudflareGlobalAPITokenUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CloudflareGlobalAPITokenUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CloudflareGlobalAPITokenUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CloudflareGlobalAPITokenUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CloudflareGlobalAPITokenUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CloudflareGlobalAPITokenUpdate'", e);
            }
            
            CloudflareCredentialsUpdate ret = new CloudflareCredentialsUpdate();
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
        public CloudflareCredentialsUpdate getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CloudflareCredentialsUpdate cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CloudflareCredentialsUpdate() {
        super("oneOf", Boolean.FALSE);
    }
    public CloudflareCredentialsUpdate(CloudflareAPITokenUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public CloudflareCredentialsUpdate(CloudflareGlobalAPITokenUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CloudflareAPITokenUpdate", new GenericType<CloudflareAPITokenUpdate>() {
        });
        schemas.put("CloudflareGlobalAPITokenUpdate", new GenericType<CloudflareGlobalAPITokenUpdate>() {
        });
        JSON.registerDescendants(CloudflareCredentialsUpdate.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CloudflareCredentialsUpdate.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CloudflareAPITokenUpdate, CloudflareGlobalAPITokenUpdate
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CloudflareAPITokenUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CloudflareGlobalAPITokenUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be CloudflareAPITokenUpdate, CloudflareGlobalAPITokenUpdate");
    }

    /**
     * Get the actual instance, which can be the following:
     * CloudflareAPITokenUpdate, CloudflareGlobalAPITokenUpdate
     *
     * @return The actual instance (CloudflareAPITokenUpdate, CloudflareGlobalAPITokenUpdate)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CloudflareAPITokenUpdate`. If the actual instance is not `CloudflareAPITokenUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CloudflareAPITokenUpdate`
     * @throws ClassCastException if the instance is not `CloudflareAPITokenUpdate`
     */
    public CloudflareAPITokenUpdate getCloudflareAPITokenUpdate() throws ClassCastException {
        return (CloudflareAPITokenUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CloudflareGlobalAPITokenUpdate`. If the actual instance is not `CloudflareGlobalAPITokenUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CloudflareGlobalAPITokenUpdate`
     * @throws ClassCastException if the instance is not `CloudflareGlobalAPITokenUpdate`
     */
    public CloudflareGlobalAPITokenUpdate getCloudflareGlobalAPITokenUpdate() throws ClassCastException {
        return (CloudflareGlobalAPITokenUpdate)super.getActualInstance();
    }
}
