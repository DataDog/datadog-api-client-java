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
@JsonDeserialize(using = DowntimeScheduleResponse.DowntimeScheduleResponseDeserializer.class)
@JsonSerialize(using = DowntimeScheduleResponse.DowntimeScheduleResponseSerializer.class)
public class DowntimeScheduleResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DowntimeScheduleResponse.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class DowntimeScheduleResponseSerializer extends StdSerializer<DowntimeScheduleResponse> {
        public DowntimeScheduleResponseSerializer(Class<DowntimeScheduleResponse> t) {
            super(t);
        }

        public DowntimeScheduleResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(DowntimeScheduleResponse value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class DowntimeScheduleResponseDeserializer extends StdDeserializer<DowntimeScheduleResponse> {
        public DowntimeScheduleResponseDeserializer() {
            this(DowntimeScheduleResponse.class);
        }

        public DowntimeScheduleResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public DowntimeScheduleResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize DowntimeScheduleRecurrencesResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DowntimeScheduleRecurrencesResponse.class.equals(Integer.class) || DowntimeScheduleRecurrencesResponse.class.equals(Long.class) || DowntimeScheduleRecurrencesResponse.class.equals(Float.class) || DowntimeScheduleRecurrencesResponse.class.equals(Double.class) || DowntimeScheduleRecurrencesResponse.class.equals(Boolean.class) || DowntimeScheduleRecurrencesResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DowntimeScheduleRecurrencesResponse.class.equals(Integer.class) || DowntimeScheduleRecurrencesResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DowntimeScheduleRecurrencesResponse.class.equals(Float.class) || DowntimeScheduleRecurrencesResponse.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (DowntimeScheduleRecurrencesResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DowntimeScheduleRecurrencesResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(DowntimeScheduleRecurrencesResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((DowntimeScheduleRecurrencesResponse)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'DowntimeScheduleRecurrencesResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DowntimeScheduleRecurrencesResponse'", e);
            }
            
            // deserialize DowntimeScheduleOneTimeResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DowntimeScheduleOneTimeResponse.class.equals(Integer.class) || DowntimeScheduleOneTimeResponse.class.equals(Long.class) || DowntimeScheduleOneTimeResponse.class.equals(Float.class) || DowntimeScheduleOneTimeResponse.class.equals(Double.class) || DowntimeScheduleOneTimeResponse.class.equals(Boolean.class) || DowntimeScheduleOneTimeResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DowntimeScheduleOneTimeResponse.class.equals(Integer.class) || DowntimeScheduleOneTimeResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DowntimeScheduleOneTimeResponse.class.equals(Float.class) || DowntimeScheduleOneTimeResponse.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (DowntimeScheduleOneTimeResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DowntimeScheduleOneTimeResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(DowntimeScheduleOneTimeResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((DowntimeScheduleOneTimeResponse)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'DowntimeScheduleOneTimeResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DowntimeScheduleOneTimeResponse'", e);
            }
            
            DowntimeScheduleResponse ret = new DowntimeScheduleResponse();
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
        public DowntimeScheduleResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "DowntimeScheduleResponse cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DowntimeScheduleResponse() {
        super("oneOf", Boolean.FALSE);
    }
    public DowntimeScheduleResponse(DowntimeScheduleRecurrencesResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public DowntimeScheduleResponse(DowntimeScheduleOneTimeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DowntimeScheduleRecurrencesResponse", new GenericType<DowntimeScheduleRecurrencesResponse>() {
        });
        schemas.put("DowntimeScheduleOneTimeResponse", new GenericType<DowntimeScheduleOneTimeResponse>() {
        });
        JSON.registerDescendants(DowntimeScheduleResponse.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DowntimeScheduleResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DowntimeScheduleRecurrencesResponse, DowntimeScheduleOneTimeResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(DowntimeScheduleRecurrencesResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(DowntimeScheduleOneTimeResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be DowntimeScheduleRecurrencesResponse, DowntimeScheduleOneTimeResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * DowntimeScheduleRecurrencesResponse, DowntimeScheduleOneTimeResponse
     *
     * @return The actual instance (DowntimeScheduleRecurrencesResponse, DowntimeScheduleOneTimeResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DowntimeScheduleRecurrencesResponse`. If the actual instance is not `DowntimeScheduleRecurrencesResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DowntimeScheduleRecurrencesResponse`
     * @throws ClassCastException if the instance is not `DowntimeScheduleRecurrencesResponse`
     */
    public DowntimeScheduleRecurrencesResponse getDowntimeScheduleRecurrencesResponse() throws ClassCastException {
        return (DowntimeScheduleRecurrencesResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DowntimeScheduleOneTimeResponse`. If the actual instance is not `DowntimeScheduleOneTimeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DowntimeScheduleOneTimeResponse`
     * @throws ClassCastException if the instance is not `DowntimeScheduleOneTimeResponse`
     */
    public DowntimeScheduleOneTimeResponse getDowntimeScheduleOneTimeResponse() throws ClassCastException {
        return (DowntimeScheduleOneTimeResponse)super.getActualInstance();
    }
}
