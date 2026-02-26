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
@JsonDeserialize(using = NotebookCellTime.NotebookCellTimeDeserializer.class)
@JsonSerialize(using = NotebookCellTime.NotebookCellTimeSerializer.class)
public class NotebookCellTime extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NotebookCellTime.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class NotebookCellTimeSerializer extends StdSerializer<NotebookCellTime> {
        public NotebookCellTimeSerializer(Class<NotebookCellTime> t) {
            super(t);
        }

        public NotebookCellTimeSerializer() {
            this(null);
        }

        @Override
        public void serialize(NotebookCellTime value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class NotebookCellTimeDeserializer extends StdDeserializer<NotebookCellTime> {
        public NotebookCellTimeDeserializer() {
            this(NotebookCellTime.class);
        }

        public NotebookCellTimeDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public NotebookCellTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize NotebookRelativeTime
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotebookRelativeTime.class.equals(Integer.class) || NotebookRelativeTime.class.equals(Long.class) || NotebookRelativeTime.class.equals(Float.class) || NotebookRelativeTime.class.equals(Double.class) || NotebookRelativeTime.class.equals(Boolean.class) || NotebookRelativeTime.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotebookRelativeTime.class.equals(Integer.class) || NotebookRelativeTime.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotebookRelativeTime.class.equals(Float.class) || NotebookRelativeTime.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (NotebookRelativeTime.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotebookRelativeTime.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                        attemptParsing |= (token == JsonToken.VALUE_NULL);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookRelativeTime.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((NotebookRelativeTime)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'NotebookRelativeTime'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotebookRelativeTime'", e);
            }
            
            // deserialize NotebookAbsoluteTime
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotebookAbsoluteTime.class.equals(Integer.class) || NotebookAbsoluteTime.class.equals(Long.class) || NotebookAbsoluteTime.class.equals(Float.class) || NotebookAbsoluteTime.class.equals(Double.class) || NotebookAbsoluteTime.class.equals(Boolean.class) || NotebookAbsoluteTime.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotebookAbsoluteTime.class.equals(Integer.class) || NotebookAbsoluteTime.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotebookAbsoluteTime.class.equals(Float.class) || NotebookAbsoluteTime.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (NotebookAbsoluteTime.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotebookAbsoluteTime.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookAbsoluteTime.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((NotebookAbsoluteTime)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'NotebookAbsoluteTime'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotebookAbsoluteTime'", e);
            }
            
            NotebookCellTime ret = new NotebookCellTime();
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
        public NotebookCellTime getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            return null;
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public NotebookCellTime() {
        super("oneOf", Boolean.TRUE);
    }
    public NotebookCellTime(NotebookRelativeTime o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }
    public NotebookCellTime(NotebookAbsoluteTime o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }

    static {
        schemas.put("NotebookRelativeTime", new GenericType<NotebookRelativeTime>() {
        });
        schemas.put("NotebookAbsoluteTime", new GenericType<NotebookAbsoluteTime>() {
        });
        JSON.registerDescendants(NotebookCellTime.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return NotebookCellTime.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * NotebookRelativeTime, NotebookAbsoluteTime
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance == null) {
           super.setActualInstance(instance);
           return;
        }

        
        if (JSON.isInstanceOf(NotebookRelativeTime.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(NotebookAbsoluteTime.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be NotebookRelativeTime, NotebookAbsoluteTime");
    }

    /**
     * Get the actual instance, which can be the following:
     * NotebookRelativeTime, NotebookAbsoluteTime
     *
     * @return The actual instance (NotebookRelativeTime, NotebookAbsoluteTime)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotebookRelativeTime`. If the actual instance is not `NotebookRelativeTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotebookRelativeTime`
     * @throws ClassCastException if the instance is not `NotebookRelativeTime`
     */
    public NotebookRelativeTime getNotebookRelativeTime() throws ClassCastException {
        return (NotebookRelativeTime)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotebookAbsoluteTime`. If the actual instance is not `NotebookAbsoluteTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotebookAbsoluteTime`
     * @throws ClassCastException if the instance is not `NotebookAbsoluteTime`
     */
    public NotebookAbsoluteTime getNotebookAbsoluteTime() throws ClassCastException {
        return (NotebookAbsoluteTime)super.getActualInstance();
    }
}
