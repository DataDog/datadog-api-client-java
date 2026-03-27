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
@JsonDeserialize(using = RUMAggregateBucketValue.RUMAggregateBucketValueDeserializer.class)
@JsonSerialize(using = RUMAggregateBucketValue.RUMAggregateBucketValueSerializer.class)
public class RUMAggregateBucketValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RUMAggregateBucketValue.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class RUMAggregateBucketValueSerializer extends StdSerializer<RUMAggregateBucketValue> {
        public RUMAggregateBucketValueSerializer(Class<RUMAggregateBucketValue> t) {
            super(t);
        }

        public RUMAggregateBucketValueSerializer() {
            this(null);
        }

        @Override
        public void serialize(RUMAggregateBucketValue value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class RUMAggregateBucketValueDeserializer extends StdDeserializer<RUMAggregateBucketValue> {
        public RUMAggregateBucketValueDeserializer() {
            this(RUMAggregateBucketValue.class);
        }

        public RUMAggregateBucketValueDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public RUMAggregateBucketValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (String.class.equals(Integer.class) || String.class.equals(Long.class) || String.class.equals(Float.class) || String.class.equals(Double.class) || String.class.equals(Boolean.class) || String.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((String.class.equals(Integer.class) || String.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((String.class.equals(Float.class) || String.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (String.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(String.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    deserialized = tmp;
                    match++;
                    
                    log.log(Level.FINER, "Input data matches schema 'String'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'String'", e);
            }
            
            // deserialize Double
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Double.class.equals(Integer.class) || Double.class.equals(Long.class) || Double.class.equals(Float.class) || Double.class.equals(Double.class) || Double.class.equals(Boolean.class) || Double.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Double.class.equals(Integer.class) || Double.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Double.class.equals(Float.class) || Double.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (Double.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Double.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(Double.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    deserialized = tmp;
                    match++;
                    
                    log.log(Level.FINER, "Input data matches schema 'Double'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Double'", e);
            }
            
            // deserialize RUMAggregateBucketValueTimeseries
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RUMAggregateBucketValueTimeseries.class.equals(Integer.class) || RUMAggregateBucketValueTimeseries.class.equals(Long.class) || RUMAggregateBucketValueTimeseries.class.equals(Float.class) || RUMAggregateBucketValueTimeseries.class.equals(Double.class) || RUMAggregateBucketValueTimeseries.class.equals(Boolean.class) || RUMAggregateBucketValueTimeseries.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RUMAggregateBucketValueTimeseries.class.equals(Integer.class) || RUMAggregateBucketValueTimeseries.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RUMAggregateBucketValueTimeseries.class.equals(Float.class) || RUMAggregateBucketValueTimeseries.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (RUMAggregateBucketValueTimeseries.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RUMAggregateBucketValueTimeseries.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(RUMAggregateBucketValueTimeseries.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((RUMAggregateBucketValueTimeseries)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'RUMAggregateBucketValueTimeseries'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RUMAggregateBucketValueTimeseries'", e);
            }
            
            RUMAggregateBucketValue ret = new RUMAggregateBucketValue();
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
        public RUMAggregateBucketValue getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "RUMAggregateBucketValue cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RUMAggregateBucketValue() {
        super("oneOf", Boolean.FALSE);
    }
    public RUMAggregateBucketValue(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public RUMAggregateBucketValue(Double o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public RUMAggregateBucketValue(RUMAggregateBucketValueTimeseries o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("String", new GenericType<String>() {
        });
        schemas.put("Double", new GenericType<Double>() {
        });
        schemas.put("RUMAggregateBucketValueTimeseries", new GenericType<RUMAggregateBucketValueTimeseries>() {
        });
        JSON.registerDescendants(RUMAggregateBucketValue.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RUMAggregateBucketValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * String, Double, RUMAggregateBucketValueTimeseries
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(Double.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(RUMAggregateBucketValueTimeseries.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be String, Double, RUMAggregateBucketValueTimeseries");
    }

    /**
     * Get the actual instance, which can be the following:
     * String, Double, RUMAggregateBucketValueTimeseries
     *
     * @return The actual instance (String, Double, RUMAggregateBucketValueTimeseries)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Double`. If the actual instance is not `Double`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Double`
     * @throws ClassCastException if the instance is not `Double`
     */
    public Double getDouble() throws ClassCastException {
        return (Double)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RUMAggregateBucketValueTimeseries`. If the actual instance is not `RUMAggregateBucketValueTimeseries`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RUMAggregateBucketValueTimeseries`
     * @throws ClassCastException if the instance is not `RUMAggregateBucketValueTimeseries`
     */
    public RUMAggregateBucketValueTimeseries getRUMAggregateBucketValueTimeseries() throws ClassCastException {
        return (RUMAggregateBucketValueTimeseries)super.getActualInstance();
    }
}
