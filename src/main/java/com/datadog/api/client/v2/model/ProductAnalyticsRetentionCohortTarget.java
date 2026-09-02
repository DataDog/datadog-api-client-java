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
@JsonDeserialize(using = ProductAnalyticsRetentionCohortTarget.ProductAnalyticsRetentionCohortTargetDeserializer.class)
@JsonSerialize(using = ProductAnalyticsRetentionCohortTarget.ProductAnalyticsRetentionCohortTargetSerializer.class)
public class ProductAnalyticsRetentionCohortTarget extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ProductAnalyticsRetentionCohortTarget.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ProductAnalyticsRetentionCohortTargetSerializer extends StdSerializer<ProductAnalyticsRetentionCohortTarget> {
        public ProductAnalyticsRetentionCohortTargetSerializer(Class<ProductAnalyticsRetentionCohortTarget> t) {
            super(t);
        }

        public ProductAnalyticsRetentionCohortTargetSerializer() {
            this(null);
        }

        @Override
        public void serialize(ProductAnalyticsRetentionCohortTarget value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ProductAnalyticsRetentionCohortTargetDeserializer extends StdDeserializer<ProductAnalyticsRetentionCohortTarget> {
        public ProductAnalyticsRetentionCohortTargetDeserializer() {
            this(ProductAnalyticsRetentionCohortTarget.class);
        }

        public ProductAnalyticsRetentionCohortTargetDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ProductAnalyticsRetentionCohortTarget deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ProductAnalyticsRetentionIndexTarget
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ProductAnalyticsRetentionIndexTarget.class.equals(Integer.class) || ProductAnalyticsRetentionIndexTarget.class.equals(Long.class) || ProductAnalyticsRetentionIndexTarget.class.equals(Float.class) || ProductAnalyticsRetentionIndexTarget.class.equals(Double.class) || ProductAnalyticsRetentionIndexTarget.class.equals(Boolean.class) || ProductAnalyticsRetentionIndexTarget.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ProductAnalyticsRetentionIndexTarget.class.equals(Integer.class) || ProductAnalyticsRetentionIndexTarget.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ProductAnalyticsRetentionIndexTarget.class.equals(Float.class) || ProductAnalyticsRetentionIndexTarget.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ProductAnalyticsRetentionIndexTarget.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ProductAnalyticsRetentionIndexTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ProductAnalyticsRetentionIndexTarget.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ProductAnalyticsRetentionIndexTarget)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ProductAnalyticsRetentionIndexTarget'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ProductAnalyticsRetentionIndexTarget'", e);
            }
            
            // deserialize ProductAnalyticsRetentionAggregationTarget
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ProductAnalyticsRetentionAggregationTarget.class.equals(Integer.class) || ProductAnalyticsRetentionAggregationTarget.class.equals(Long.class) || ProductAnalyticsRetentionAggregationTarget.class.equals(Float.class) || ProductAnalyticsRetentionAggregationTarget.class.equals(Double.class) || ProductAnalyticsRetentionAggregationTarget.class.equals(Boolean.class) || ProductAnalyticsRetentionAggregationTarget.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ProductAnalyticsRetentionAggregationTarget.class.equals(Integer.class) || ProductAnalyticsRetentionAggregationTarget.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ProductAnalyticsRetentionAggregationTarget.class.equals(Float.class) || ProductAnalyticsRetentionAggregationTarget.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ProductAnalyticsRetentionAggregationTarget.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ProductAnalyticsRetentionAggregationTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ProductAnalyticsRetentionAggregationTarget.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ProductAnalyticsRetentionAggregationTarget)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ProductAnalyticsRetentionAggregationTarget'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ProductAnalyticsRetentionAggregationTarget'", e);
            }
            
            ProductAnalyticsRetentionCohortTarget ret = new ProductAnalyticsRetentionCohortTarget();
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
        public ProductAnalyticsRetentionCohortTarget getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ProductAnalyticsRetentionCohortTarget cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ProductAnalyticsRetentionCohortTarget() {
        super("oneOf", Boolean.FALSE);
    }
    public ProductAnalyticsRetentionCohortTarget(ProductAnalyticsRetentionIndexTarget o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ProductAnalyticsRetentionCohortTarget(ProductAnalyticsRetentionAggregationTarget o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ProductAnalyticsRetentionIndexTarget", new GenericType<ProductAnalyticsRetentionIndexTarget>() {
        });
        schemas.put("ProductAnalyticsRetentionAggregationTarget", new GenericType<ProductAnalyticsRetentionAggregationTarget>() {
        });
        JSON.registerDescendants(ProductAnalyticsRetentionCohortTarget.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ProductAnalyticsRetentionCohortTarget.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ProductAnalyticsRetentionIndexTarget, ProductAnalyticsRetentionAggregationTarget
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ProductAnalyticsRetentionIndexTarget.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ProductAnalyticsRetentionAggregationTarget.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ProductAnalyticsRetentionIndexTarget, ProductAnalyticsRetentionAggregationTarget");
    }

    /**
     * Get the actual instance, which can be the following:
     * ProductAnalyticsRetentionIndexTarget, ProductAnalyticsRetentionAggregationTarget
     *
     * @return The actual instance (ProductAnalyticsRetentionIndexTarget, ProductAnalyticsRetentionAggregationTarget)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProductAnalyticsRetentionIndexTarget`. If the actual instance is not `ProductAnalyticsRetentionIndexTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProductAnalyticsRetentionIndexTarget`
     * @throws ClassCastException if the instance is not `ProductAnalyticsRetentionIndexTarget`
     */
    public ProductAnalyticsRetentionIndexTarget getProductAnalyticsRetentionIndexTarget() throws ClassCastException {
        return (ProductAnalyticsRetentionIndexTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProductAnalyticsRetentionAggregationTarget`. If the actual instance is not `ProductAnalyticsRetentionAggregationTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProductAnalyticsRetentionAggregationTarget`
     * @throws ClassCastException if the instance is not `ProductAnalyticsRetentionAggregationTarget`
     */
    public ProductAnalyticsRetentionAggregationTarget getProductAnalyticsRetentionAggregationTarget() throws ClassCastException {
        return (ProductAnalyticsRetentionAggregationTarget)super.getActualInstance();
    }
}
