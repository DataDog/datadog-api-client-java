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
@JsonDeserialize(using = ProductAnalyticsRetentionTimeInterval.ProductAnalyticsRetentionTimeIntervalDeserializer.class)
@JsonSerialize(using = ProductAnalyticsRetentionTimeInterval.ProductAnalyticsRetentionTimeIntervalSerializer.class)
public class ProductAnalyticsRetentionTimeInterval extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ProductAnalyticsRetentionTimeInterval.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ProductAnalyticsRetentionTimeIntervalSerializer extends StdSerializer<ProductAnalyticsRetentionTimeInterval> {
        public ProductAnalyticsRetentionTimeIntervalSerializer(Class<ProductAnalyticsRetentionTimeInterval> t) {
            super(t);
        }

        public ProductAnalyticsRetentionTimeIntervalSerializer() {
            this(null);
        }

        @Override
        public void serialize(ProductAnalyticsRetentionTimeInterval value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ProductAnalyticsRetentionTimeIntervalDeserializer extends StdDeserializer<ProductAnalyticsRetentionTimeInterval> {
        public ProductAnalyticsRetentionTimeIntervalDeserializer() {
            this(ProductAnalyticsRetentionTimeInterval.class);
        }

        public ProductAnalyticsRetentionTimeIntervalDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ProductAnalyticsRetentionTimeInterval deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ProductAnalyticsRetentionCalendarTimeInterval
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Integer.class) || ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Long.class) || ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Float.class) || ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Double.class) || ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Boolean.class) || ProductAnalyticsRetentionCalendarTimeInterval.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Integer.class) || ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Float.class) || ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ProductAnalyticsRetentionCalendarTimeInterval.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ProductAnalyticsRetentionCalendarTimeInterval.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ProductAnalyticsRetentionCalendarTimeInterval.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ProductAnalyticsRetentionCalendarTimeInterval)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ProductAnalyticsRetentionCalendarTimeInterval'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ProductAnalyticsRetentionCalendarTimeInterval'", e);
            }
            
            // deserialize ProductAnalyticsRetentionFixedTimeInterval
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ProductAnalyticsRetentionFixedTimeInterval.class.equals(Integer.class) || ProductAnalyticsRetentionFixedTimeInterval.class.equals(Long.class) || ProductAnalyticsRetentionFixedTimeInterval.class.equals(Float.class) || ProductAnalyticsRetentionFixedTimeInterval.class.equals(Double.class) || ProductAnalyticsRetentionFixedTimeInterval.class.equals(Boolean.class) || ProductAnalyticsRetentionFixedTimeInterval.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ProductAnalyticsRetentionFixedTimeInterval.class.equals(Integer.class) || ProductAnalyticsRetentionFixedTimeInterval.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ProductAnalyticsRetentionFixedTimeInterval.class.equals(Float.class) || ProductAnalyticsRetentionFixedTimeInterval.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ProductAnalyticsRetentionFixedTimeInterval.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ProductAnalyticsRetentionFixedTimeInterval.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ProductAnalyticsRetentionFixedTimeInterval.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ProductAnalyticsRetentionFixedTimeInterval)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ProductAnalyticsRetentionFixedTimeInterval'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ProductAnalyticsRetentionFixedTimeInterval'", e);
            }
            
            ProductAnalyticsRetentionTimeInterval ret = new ProductAnalyticsRetentionTimeInterval();
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
        public ProductAnalyticsRetentionTimeInterval getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ProductAnalyticsRetentionTimeInterval cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ProductAnalyticsRetentionTimeInterval() {
        super("oneOf", Boolean.FALSE);
    }
    public ProductAnalyticsRetentionTimeInterval(ProductAnalyticsRetentionCalendarTimeInterval o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ProductAnalyticsRetentionTimeInterval(ProductAnalyticsRetentionFixedTimeInterval o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ProductAnalyticsRetentionCalendarTimeInterval", new GenericType<ProductAnalyticsRetentionCalendarTimeInterval>() {
        });
        schemas.put("ProductAnalyticsRetentionFixedTimeInterval", new GenericType<ProductAnalyticsRetentionFixedTimeInterval>() {
        });
        JSON.registerDescendants(ProductAnalyticsRetentionTimeInterval.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ProductAnalyticsRetentionTimeInterval.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ProductAnalyticsRetentionCalendarTimeInterval, ProductAnalyticsRetentionFixedTimeInterval
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ProductAnalyticsRetentionCalendarTimeInterval.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ProductAnalyticsRetentionFixedTimeInterval.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ProductAnalyticsRetentionCalendarTimeInterval, ProductAnalyticsRetentionFixedTimeInterval");
    }

    /**
     * Get the actual instance, which can be the following:
     * ProductAnalyticsRetentionCalendarTimeInterval, ProductAnalyticsRetentionFixedTimeInterval
     *
     * @return The actual instance (ProductAnalyticsRetentionCalendarTimeInterval, ProductAnalyticsRetentionFixedTimeInterval)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProductAnalyticsRetentionCalendarTimeInterval`. If the actual instance is not `ProductAnalyticsRetentionCalendarTimeInterval`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProductAnalyticsRetentionCalendarTimeInterval`
     * @throws ClassCastException if the instance is not `ProductAnalyticsRetentionCalendarTimeInterval`
     */
    public ProductAnalyticsRetentionCalendarTimeInterval getProductAnalyticsRetentionCalendarTimeInterval() throws ClassCastException {
        return (ProductAnalyticsRetentionCalendarTimeInterval)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProductAnalyticsRetentionFixedTimeInterval`. If the actual instance is not `ProductAnalyticsRetentionFixedTimeInterval`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProductAnalyticsRetentionFixedTimeInterval`
     * @throws ClassCastException if the instance is not `ProductAnalyticsRetentionFixedTimeInterval`
     */
    public ProductAnalyticsRetentionFixedTimeInterval getProductAnalyticsRetentionFixedTimeInterval() throws ClassCastException {
        return (ProductAnalyticsRetentionFixedTimeInterval)super.getActualInstance();
    }
}
