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
@JsonDeserialize(using = SecurityMonitoringRuleResponse.SecurityMonitoringRuleResponseDeserializer.class)
@JsonSerialize(using = SecurityMonitoringRuleResponse.SecurityMonitoringRuleResponseSerializer.class)
public class SecurityMonitoringRuleResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SecurityMonitoringRuleResponse.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class SecurityMonitoringRuleResponseSerializer extends StdSerializer<SecurityMonitoringRuleResponse> {
        public SecurityMonitoringRuleResponseSerializer(Class<SecurityMonitoringRuleResponse> t) {
            super(t);
        }

        public SecurityMonitoringRuleResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(SecurityMonitoringRuleResponse value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SecurityMonitoringRuleResponseDeserializer extends StdDeserializer<SecurityMonitoringRuleResponse> {
        public SecurityMonitoringRuleResponseDeserializer() {
            this(SecurityMonitoringRuleResponse.class);
        }

        public SecurityMonitoringRuleResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SecurityMonitoringRuleResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize SecurityMonitoringStandardRuleResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SecurityMonitoringStandardRuleResponse.class.equals(Integer.class) || SecurityMonitoringStandardRuleResponse.class.equals(Long.class) || SecurityMonitoringStandardRuleResponse.class.equals(Float.class) || SecurityMonitoringStandardRuleResponse.class.equals(Double.class) || SecurityMonitoringStandardRuleResponse.class.equals(Boolean.class) || SecurityMonitoringStandardRuleResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SecurityMonitoringStandardRuleResponse.class.equals(Integer.class) || SecurityMonitoringStandardRuleResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SecurityMonitoringStandardRuleResponse.class.equals(Float.class) || SecurityMonitoringStandardRuleResponse.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SecurityMonitoringStandardRuleResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SecurityMonitoringStandardRuleResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityMonitoringStandardRuleResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SecurityMonitoringStandardRuleResponse)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SecurityMonitoringStandardRuleResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SecurityMonitoringStandardRuleResponse'", e);
            }
            
            // deserialize SecurityMonitoringSignalRuleResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SecurityMonitoringSignalRuleResponse.class.equals(Integer.class) || SecurityMonitoringSignalRuleResponse.class.equals(Long.class) || SecurityMonitoringSignalRuleResponse.class.equals(Float.class) || SecurityMonitoringSignalRuleResponse.class.equals(Double.class) || SecurityMonitoringSignalRuleResponse.class.equals(Boolean.class) || SecurityMonitoringSignalRuleResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SecurityMonitoringSignalRuleResponse.class.equals(Integer.class) || SecurityMonitoringSignalRuleResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SecurityMonitoringSignalRuleResponse.class.equals(Float.class) || SecurityMonitoringSignalRuleResponse.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SecurityMonitoringSignalRuleResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SecurityMonitoringSignalRuleResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityMonitoringSignalRuleResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SecurityMonitoringSignalRuleResponse)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SecurityMonitoringSignalRuleResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SecurityMonitoringSignalRuleResponse'", e);
            }
            
            SecurityMonitoringRuleResponse ret = new SecurityMonitoringRuleResponse();
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
        public SecurityMonitoringRuleResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SecurityMonitoringRuleResponse cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SecurityMonitoringRuleResponse() {
        super("oneOf", Boolean.FALSE);
    }
    public SecurityMonitoringRuleResponse(SecurityMonitoringStandardRuleResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SecurityMonitoringRuleResponse(SecurityMonitoringSignalRuleResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SecurityMonitoringStandardRuleResponse", new GenericType<SecurityMonitoringStandardRuleResponse>() {
        });
        schemas.put("SecurityMonitoringSignalRuleResponse", new GenericType<SecurityMonitoringSignalRuleResponse>() {
        });
        JSON.registerDescendants(SecurityMonitoringRuleResponse.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SecurityMonitoringRuleResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SecurityMonitoringStandardRuleResponse, SecurityMonitoringSignalRuleResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(SecurityMonitoringStandardRuleResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SecurityMonitoringSignalRuleResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be SecurityMonitoringStandardRuleResponse, SecurityMonitoringSignalRuleResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * SecurityMonitoringStandardRuleResponse, SecurityMonitoringSignalRuleResponse
     *
     * @return The actual instance (SecurityMonitoringStandardRuleResponse, SecurityMonitoringSignalRuleResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SecurityMonitoringStandardRuleResponse`. If the actual instance is not `SecurityMonitoringStandardRuleResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SecurityMonitoringStandardRuleResponse`
     * @throws ClassCastException if the instance is not `SecurityMonitoringStandardRuleResponse`
     */
    public SecurityMonitoringStandardRuleResponse getSecurityMonitoringStandardRuleResponse() throws ClassCastException {
        return (SecurityMonitoringStandardRuleResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SecurityMonitoringSignalRuleResponse`. If the actual instance is not `SecurityMonitoringSignalRuleResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SecurityMonitoringSignalRuleResponse`
     * @throws ClassCastException if the instance is not `SecurityMonitoringSignalRuleResponse`
     */
    public SecurityMonitoringSignalRuleResponse getSecurityMonitoringSignalRuleResponse() throws ClassCastException {
        return (SecurityMonitoringSignalRuleResponse)super.getActualInstance();
    }
}
