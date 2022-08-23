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
@JsonDeserialize(using = LogsArchiveCreateRequestDestination.LogsArchiveCreateRequestDestinationDeserializer.class)
@JsonSerialize(using = LogsArchiveCreateRequestDestination.LogsArchiveCreateRequestDestinationSerializer.class)
public class LogsArchiveCreateRequestDestination extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LogsArchiveCreateRequestDestination.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class LogsArchiveCreateRequestDestinationSerializer extends StdSerializer<LogsArchiveCreateRequestDestination> {
        public LogsArchiveCreateRequestDestinationSerializer(Class<LogsArchiveCreateRequestDestination> t) {
            super(t);
        }

        public LogsArchiveCreateRequestDestinationSerializer() {
            this(null);
        }

        @Override
        public void serialize(LogsArchiveCreateRequestDestination value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class LogsArchiveCreateRequestDestinationDeserializer extends StdDeserializer<LogsArchiveCreateRequestDestination> {
        public LogsArchiveCreateRequestDestinationDeserializer() {
            this(LogsArchiveCreateRequestDestination.class);
        }

        public LogsArchiveCreateRequestDestinationDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public LogsArchiveCreateRequestDestination deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize LogsArchiveDestinationAzure
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsArchiveDestinationAzure.class.equals(Integer.class) || LogsArchiveDestinationAzure.class.equals(Long.class) || LogsArchiveDestinationAzure.class.equals(Float.class) || LogsArchiveDestinationAzure.class.equals(Double.class) || LogsArchiveDestinationAzure.class.equals(Boolean.class) || LogsArchiveDestinationAzure.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsArchiveDestinationAzure.class.equals(Integer.class) || LogsArchiveDestinationAzure.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsArchiveDestinationAzure.class.equals(Float.class) || LogsArchiveDestinationAzure.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsArchiveDestinationAzure.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsArchiveDestinationAzure.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArchiveDestinationAzure.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsArchiveDestinationAzure)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsArchiveDestinationAzure'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsArchiveDestinationAzure'", e);
            }
            
            // deserialize LogsArchiveDestinationGCS
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsArchiveDestinationGCS.class.equals(Integer.class) || LogsArchiveDestinationGCS.class.equals(Long.class) || LogsArchiveDestinationGCS.class.equals(Float.class) || LogsArchiveDestinationGCS.class.equals(Double.class) || LogsArchiveDestinationGCS.class.equals(Boolean.class) || LogsArchiveDestinationGCS.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsArchiveDestinationGCS.class.equals(Integer.class) || LogsArchiveDestinationGCS.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsArchiveDestinationGCS.class.equals(Float.class) || LogsArchiveDestinationGCS.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsArchiveDestinationGCS.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsArchiveDestinationGCS.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArchiveDestinationGCS.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsArchiveDestinationGCS)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsArchiveDestinationGCS'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsArchiveDestinationGCS'", e);
            }
            
            // deserialize LogsArchiveDestinationS3
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsArchiveDestinationS3.class.equals(Integer.class) || LogsArchiveDestinationS3.class.equals(Long.class) || LogsArchiveDestinationS3.class.equals(Float.class) || LogsArchiveDestinationS3.class.equals(Double.class) || LogsArchiveDestinationS3.class.equals(Boolean.class) || LogsArchiveDestinationS3.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsArchiveDestinationS3.class.equals(Integer.class) || LogsArchiveDestinationS3.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsArchiveDestinationS3.class.equals(Float.class) || LogsArchiveDestinationS3.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsArchiveDestinationS3.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsArchiveDestinationS3.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArchiveDestinationS3.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsArchiveDestinationS3)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsArchiveDestinationS3'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsArchiveDestinationS3'", e);
            }
            
            LogsArchiveCreateRequestDestination ret = new LogsArchiveCreateRequestDestination();
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
        public LogsArchiveCreateRequestDestination getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "LogsArchiveCreateRequestDestination cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public LogsArchiveCreateRequestDestination() {
        super("oneOf", Boolean.FALSE);
    }
    public LogsArchiveCreateRequestDestination(LogsArchiveDestinationAzure o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsArchiveCreateRequestDestination(LogsArchiveDestinationGCS o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsArchiveCreateRequestDestination(LogsArchiveDestinationS3 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LogsArchiveDestinationAzure", new GenericType<LogsArchiveDestinationAzure>() {
        });
        schemas.put("LogsArchiveDestinationGCS", new GenericType<LogsArchiveDestinationGCS>() {
        });
        schemas.put("LogsArchiveDestinationS3", new GenericType<LogsArchiveDestinationS3>() {
        });
        JSON.registerDescendants(LogsArchiveCreateRequestDestination.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return LogsArchiveCreateRequestDestination.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LogsArchiveDestinationAzure, LogsArchiveDestinationGCS, LogsArchiveDestinationS3
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(LogsArchiveDestinationAzure.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsArchiveDestinationGCS.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsArchiveDestinationS3.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be LogsArchiveDestinationAzure, LogsArchiveDestinationGCS, LogsArchiveDestinationS3");
    }

    /**
     * Get the actual instance, which can be the following:
     * LogsArchiveDestinationAzure, LogsArchiveDestinationGCS, LogsArchiveDestinationS3
     *
     * @return The actual instance (LogsArchiveDestinationAzure, LogsArchiveDestinationGCS, LogsArchiveDestinationS3)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsArchiveDestinationAzure`. If the actual instance is not `LogsArchiveDestinationAzure`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsArchiveDestinationAzure`
     * @throws ClassCastException if the instance is not `LogsArchiveDestinationAzure`
     */
    public LogsArchiveDestinationAzure getLogsArchiveDestinationAzure() throws ClassCastException {
        return (LogsArchiveDestinationAzure)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsArchiveDestinationGCS`. If the actual instance is not `LogsArchiveDestinationGCS`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsArchiveDestinationGCS`
     * @throws ClassCastException if the instance is not `LogsArchiveDestinationGCS`
     */
    public LogsArchiveDestinationGCS getLogsArchiveDestinationGCS() throws ClassCastException {
        return (LogsArchiveDestinationGCS)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsArchiveDestinationS3`. If the actual instance is not `LogsArchiveDestinationS3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsArchiveDestinationS3`
     * @throws ClassCastException if the instance is not `LogsArchiveDestinationS3`
     */
    public LogsArchiveDestinationS3 getLogsArchiveDestinationS3() throws ClassCastException {
        return (LogsArchiveDestinationS3)super.getActualInstance();
    }
}
