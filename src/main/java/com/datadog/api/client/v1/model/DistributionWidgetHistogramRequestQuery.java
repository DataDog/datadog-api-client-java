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
@JsonDeserialize(using = DistributionWidgetHistogramRequestQuery.DistributionWidgetHistogramRequestQueryDeserializer.class)
@JsonSerialize(using = DistributionWidgetHistogramRequestQuery.DistributionWidgetHistogramRequestQuerySerializer.class)
public class DistributionWidgetHistogramRequestQuery extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DistributionWidgetHistogramRequestQuery.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class DistributionWidgetHistogramRequestQuerySerializer extends StdSerializer<DistributionWidgetHistogramRequestQuery> {
        public DistributionWidgetHistogramRequestQuerySerializer(Class<DistributionWidgetHistogramRequestQuery> t) {
            super(t);
        }

        public DistributionWidgetHistogramRequestQuerySerializer() {
            this(null);
        }

        @Override
        public void serialize(DistributionWidgetHistogramRequestQuery value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class DistributionWidgetHistogramRequestQueryDeserializer extends StdDeserializer<DistributionWidgetHistogramRequestQuery> {
        public DistributionWidgetHistogramRequestQueryDeserializer() {
            this(DistributionWidgetHistogramRequestQuery.class);
        }

        public DistributionWidgetHistogramRequestQueryDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public DistributionWidgetHistogramRequestQuery deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize FormulaAndFunctionMetricQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FormulaAndFunctionMetricQueryDefinition.class.equals(Integer.class) || FormulaAndFunctionMetricQueryDefinition.class.equals(Long.class) || FormulaAndFunctionMetricQueryDefinition.class.equals(Float.class) || FormulaAndFunctionMetricQueryDefinition.class.equals(Double.class) || FormulaAndFunctionMetricQueryDefinition.class.equals(Boolean.class) || FormulaAndFunctionMetricQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FormulaAndFunctionMetricQueryDefinition.class.equals(Integer.class) || FormulaAndFunctionMetricQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FormulaAndFunctionMetricQueryDefinition.class.equals(Float.class) || FormulaAndFunctionMetricQueryDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FormulaAndFunctionMetricQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FormulaAndFunctionMetricQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaAndFunctionMetricQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FormulaAndFunctionMetricQueryDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FormulaAndFunctionMetricQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FormulaAndFunctionMetricQueryDefinition'", e);
            }
            
            // deserialize FormulaAndFunctionEventQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FormulaAndFunctionEventQueryDefinition.class.equals(Integer.class) || FormulaAndFunctionEventQueryDefinition.class.equals(Long.class) || FormulaAndFunctionEventQueryDefinition.class.equals(Float.class) || FormulaAndFunctionEventQueryDefinition.class.equals(Double.class) || FormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class) || FormulaAndFunctionEventQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FormulaAndFunctionEventQueryDefinition.class.equals(Integer.class) || FormulaAndFunctionEventQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FormulaAndFunctionEventQueryDefinition.class.equals(Float.class) || FormulaAndFunctionEventQueryDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FormulaAndFunctionEventQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaAndFunctionEventQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FormulaAndFunctionEventQueryDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FormulaAndFunctionEventQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FormulaAndFunctionEventQueryDefinition'", e);
            }
            
            // deserialize FormulaAndFunctionApmResourceStatsQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Integer.class) || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Long.class) || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Float.class) || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Double.class) || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Boolean.class) || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Integer.class) || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Float.class) || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaAndFunctionApmResourceStatsQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FormulaAndFunctionApmResourceStatsQueryDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FormulaAndFunctionApmResourceStatsQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FormulaAndFunctionApmResourceStatsQueryDefinition'", e);
            }
            
            DistributionWidgetHistogramRequestQuery ret = new DistributionWidgetHistogramRequestQuery();
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
        public DistributionWidgetHistogramRequestQuery getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "DistributionWidgetHistogramRequestQuery cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DistributionWidgetHistogramRequestQuery() {
        super("oneOf", Boolean.FALSE);
    }
    public DistributionWidgetHistogramRequestQuery(FormulaAndFunctionMetricQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public DistributionWidgetHistogramRequestQuery(FormulaAndFunctionEventQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public DistributionWidgetHistogramRequestQuery(FormulaAndFunctionApmResourceStatsQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FormulaAndFunctionMetricQueryDefinition", new GenericType<FormulaAndFunctionMetricQueryDefinition>() {
        });
        schemas.put("FormulaAndFunctionEventQueryDefinition", new GenericType<FormulaAndFunctionEventQueryDefinition>() {
        });
        schemas.put("FormulaAndFunctionApmResourceStatsQueryDefinition", new GenericType<FormulaAndFunctionApmResourceStatsQueryDefinition>() {
        });
        JSON.registerDescendants(DistributionWidgetHistogramRequestQuery.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DistributionWidgetHistogramRequestQuery.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FormulaAndFunctionMetricQueryDefinition, FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionApmResourceStatsQueryDefinition
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(FormulaAndFunctionMetricQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FormulaAndFunctionEventQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FormulaAndFunctionApmResourceStatsQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be FormulaAndFunctionMetricQueryDefinition, FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionApmResourceStatsQueryDefinition");
    }

    /**
     * Get the actual instance, which can be the following:
     * FormulaAndFunctionMetricQueryDefinition, FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionApmResourceStatsQueryDefinition
     *
     * @return The actual instance (FormulaAndFunctionMetricQueryDefinition, FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionApmResourceStatsQueryDefinition)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FormulaAndFunctionMetricQueryDefinition`. If the actual instance is not `FormulaAndFunctionMetricQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FormulaAndFunctionMetricQueryDefinition`
     * @throws ClassCastException if the instance is not `FormulaAndFunctionMetricQueryDefinition`
     */
    public FormulaAndFunctionMetricQueryDefinition getFormulaAndFunctionMetricQueryDefinition() throws ClassCastException {
        return (FormulaAndFunctionMetricQueryDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FormulaAndFunctionEventQueryDefinition`. If the actual instance is not `FormulaAndFunctionEventQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FormulaAndFunctionEventQueryDefinition`
     * @throws ClassCastException if the instance is not `FormulaAndFunctionEventQueryDefinition`
     */
    public FormulaAndFunctionEventQueryDefinition getFormulaAndFunctionEventQueryDefinition() throws ClassCastException {
        return (FormulaAndFunctionEventQueryDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FormulaAndFunctionApmResourceStatsQueryDefinition`. If the actual instance is not `FormulaAndFunctionApmResourceStatsQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FormulaAndFunctionApmResourceStatsQueryDefinition`
     * @throws ClassCastException if the instance is not `FormulaAndFunctionApmResourceStatsQueryDefinition`
     */
    public FormulaAndFunctionApmResourceStatsQueryDefinition getFormulaAndFunctionApmResourceStatsQueryDefinition() throws ClassCastException {
        return (FormulaAndFunctionApmResourceStatsQueryDefinition)super.getActualInstance();
    }
}
