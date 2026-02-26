/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
@JsonDeserialize(using = LogsSchemaMapper.LogsSchemaMapperDeserializer.class)
@JsonSerialize(using = LogsSchemaMapper.LogsSchemaMapperSerializer.class)
public class LogsSchemaMapper extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LogsSchemaMapper.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class LogsSchemaMapperSerializer extends StdSerializer<LogsSchemaMapper> {
        public LogsSchemaMapperSerializer(Class<LogsSchemaMapper> t) {
            super(t);
        }

        public LogsSchemaMapperSerializer() {
            this(null);
        }

        @Override
        public void serialize(LogsSchemaMapper value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class LogsSchemaMapperDeserializer extends StdDeserializer<LogsSchemaMapper> {
        public LogsSchemaMapperDeserializer() {
            this(LogsSchemaMapper.class);
        }

        public LogsSchemaMapperDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public LogsSchemaMapper deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize LogsSchemaRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsSchemaRemapper.class.equals(Integer.class) || LogsSchemaRemapper.class.equals(Long.class) || LogsSchemaRemapper.class.equals(Float.class) || LogsSchemaRemapper.class.equals(Double.class) || LogsSchemaRemapper.class.equals(Boolean.class) || LogsSchemaRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsSchemaRemapper.class.equals(Integer.class) || LogsSchemaRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsSchemaRemapper.class.equals(Float.class) || LogsSchemaRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsSchemaRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsSchemaRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsSchemaRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsSchemaRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsSchemaRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsSchemaRemapper'", e);
            }
            
            // deserialize LogsSchemaCategoryMapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsSchemaCategoryMapper.class.equals(Integer.class) || LogsSchemaCategoryMapper.class.equals(Long.class) || LogsSchemaCategoryMapper.class.equals(Float.class) || LogsSchemaCategoryMapper.class.equals(Double.class) || LogsSchemaCategoryMapper.class.equals(Boolean.class) || LogsSchemaCategoryMapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsSchemaCategoryMapper.class.equals(Integer.class) || LogsSchemaCategoryMapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsSchemaCategoryMapper.class.equals(Float.class) || LogsSchemaCategoryMapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsSchemaCategoryMapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsSchemaCategoryMapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsSchemaCategoryMapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsSchemaCategoryMapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsSchemaCategoryMapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsSchemaCategoryMapper'", e);
            }
            
            LogsSchemaMapper ret = new LogsSchemaMapper();
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
        public LogsSchemaMapper getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "LogsSchemaMapper cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public LogsSchemaMapper() {
        super("oneOf", Boolean.FALSE);
    }
    public LogsSchemaMapper(LogsSchemaRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsSchemaMapper(LogsSchemaCategoryMapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LogsSchemaRemapper", new GenericType<LogsSchemaRemapper>() {
        });
        schemas.put("LogsSchemaCategoryMapper", new GenericType<LogsSchemaCategoryMapper>() {
        });
        JSON.registerDescendants(LogsSchemaMapper.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return LogsSchemaMapper.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LogsSchemaRemapper, LogsSchemaCategoryMapper
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(LogsSchemaRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsSchemaCategoryMapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be LogsSchemaRemapper, LogsSchemaCategoryMapper");
    }

    /**
     * Get the actual instance, which can be the following:
     * LogsSchemaRemapper, LogsSchemaCategoryMapper
     *
     * @return The actual instance (LogsSchemaRemapper, LogsSchemaCategoryMapper)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsSchemaRemapper`. If the actual instance is not `LogsSchemaRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsSchemaRemapper`
     * @throws ClassCastException if the instance is not `LogsSchemaRemapper`
     */
    public LogsSchemaRemapper getLogsSchemaRemapper() throws ClassCastException {
        return (LogsSchemaRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsSchemaCategoryMapper`. If the actual instance is not `LogsSchemaCategoryMapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsSchemaCategoryMapper`
     * @throws ClassCastException if the instance is not `LogsSchemaCategoryMapper`
     */
    public LogsSchemaCategoryMapper getLogsSchemaCategoryMapper() throws ClassCastException {
        return (LogsSchemaCategoryMapper)super.getActualInstance();
    }
}
