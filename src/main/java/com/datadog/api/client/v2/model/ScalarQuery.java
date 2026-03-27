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
@JsonDeserialize(using = ScalarQuery.ScalarQueryDeserializer.class)
@JsonSerialize(using = ScalarQuery.ScalarQuerySerializer.class)
public class ScalarQuery extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ScalarQuery.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ScalarQuerySerializer extends StdSerializer<ScalarQuery> {
        public ScalarQuerySerializer(Class<ScalarQuery> t) {
            super(t);
        }

        public ScalarQuerySerializer() {
            this(null);
        }

        @Override
        public void serialize(ScalarQuery value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ScalarQueryDeserializer extends StdDeserializer<ScalarQuery> {
        public ScalarQueryDeserializer() {
            this(ScalarQuery.class);
        }

        public ScalarQueryDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ScalarQuery deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize MetricsScalarQuery
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MetricsScalarQuery.class.equals(Integer.class) || MetricsScalarQuery.class.equals(Long.class) || MetricsScalarQuery.class.equals(Float.class) || MetricsScalarQuery.class.equals(Double.class) || MetricsScalarQuery.class.equals(Boolean.class) || MetricsScalarQuery.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MetricsScalarQuery.class.equals(Integer.class) || MetricsScalarQuery.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MetricsScalarQuery.class.equals(Float.class) || MetricsScalarQuery.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MetricsScalarQuery.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MetricsScalarQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MetricsScalarQuery.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MetricsScalarQuery)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MetricsScalarQuery'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MetricsScalarQuery'", e);
            }
            
            // deserialize EventsScalarQuery
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EventsScalarQuery.class.equals(Integer.class) || EventsScalarQuery.class.equals(Long.class) || EventsScalarQuery.class.equals(Float.class) || EventsScalarQuery.class.equals(Double.class) || EventsScalarQuery.class.equals(Boolean.class) || EventsScalarQuery.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EventsScalarQuery.class.equals(Integer.class) || EventsScalarQuery.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EventsScalarQuery.class.equals(Float.class) || EventsScalarQuery.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (EventsScalarQuery.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EventsScalarQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(EventsScalarQuery.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((EventsScalarQuery)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'EventsScalarQuery'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EventsScalarQuery'", e);
            }
            
            ScalarQuery ret = new ScalarQuery();
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
        public ScalarQuery getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ScalarQuery cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ScalarQuery() {
        super("oneOf", Boolean.FALSE);
    }
    public ScalarQuery(MetricsScalarQuery o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ScalarQuery(EventsScalarQuery o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MetricsScalarQuery", new GenericType<MetricsScalarQuery>() {
        });
        schemas.put("EventsScalarQuery", new GenericType<EventsScalarQuery>() {
        });
        JSON.registerDescendants(ScalarQuery.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ScalarQuery.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MetricsScalarQuery, EventsScalarQuery
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(MetricsScalarQuery.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(EventsScalarQuery.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be MetricsScalarQuery, EventsScalarQuery");
    }

    /**
     * Get the actual instance, which can be the following:
     * MetricsScalarQuery, EventsScalarQuery
     *
     * @return The actual instance (MetricsScalarQuery, EventsScalarQuery)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetricsScalarQuery`. If the actual instance is not `MetricsScalarQuery`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetricsScalarQuery`
     * @throws ClassCastException if the instance is not `MetricsScalarQuery`
     */
    public MetricsScalarQuery getMetricsScalarQuery() throws ClassCastException {
        return (MetricsScalarQuery)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EventsScalarQuery`. If the actual instance is not `EventsScalarQuery`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EventsScalarQuery`
     * @throws ClassCastException if the instance is not `EventsScalarQuery`
     */
    public EventsScalarQuery getEventsScalarQuery() throws ClassCastException {
        return (EventsScalarQuery)super.getActualInstance();
    }
}
