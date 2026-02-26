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
@JsonDeserialize(using = MonitorFormulaAndFunctionQueryDefinition.MonitorFormulaAndFunctionQueryDefinitionDeserializer.class)
@JsonSerialize(using = MonitorFormulaAndFunctionQueryDefinition.MonitorFormulaAndFunctionQueryDefinitionSerializer.class)
public class MonitorFormulaAndFunctionQueryDefinition extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MonitorFormulaAndFunctionQueryDefinition.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class MonitorFormulaAndFunctionQueryDefinitionSerializer extends StdSerializer<MonitorFormulaAndFunctionQueryDefinition> {
        public MonitorFormulaAndFunctionQueryDefinitionSerializer(Class<MonitorFormulaAndFunctionQueryDefinition> t) {
            super(t);
        }

        public MonitorFormulaAndFunctionQueryDefinitionSerializer() {
            this(null);
        }

        @Override
        public void serialize(MonitorFormulaAndFunctionQueryDefinition value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class MonitorFormulaAndFunctionQueryDefinitionDeserializer extends StdDeserializer<MonitorFormulaAndFunctionQueryDefinition> {
        public MonitorFormulaAndFunctionQueryDefinitionDeserializer() {
            this(MonitorFormulaAndFunctionQueryDefinition.class);
        }

        public MonitorFormulaAndFunctionQueryDefinitionDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public MonitorFormulaAndFunctionQueryDefinition deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize MonitorFormulaAndFunctionEventQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Integer.class) || MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Long.class) || MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Float.class) || MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Double.class) || MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class) || MonitorFormulaAndFunctionEventQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Integer.class) || MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Float.class) || MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MonitorFormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MonitorFormulaAndFunctionEventQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MonitorFormulaAndFunctionEventQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MonitorFormulaAndFunctionEventQueryDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MonitorFormulaAndFunctionEventQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MonitorFormulaAndFunctionEventQueryDefinition'", e);
            }
            
            // deserialize MonitorFormulaAndFunctionCostQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Integer.class) || MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Long.class) || MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Float.class) || MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Double.class) || MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Boolean.class) || MonitorFormulaAndFunctionCostQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Integer.class) || MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Float.class) || MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MonitorFormulaAndFunctionCostQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MonitorFormulaAndFunctionCostQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MonitorFormulaAndFunctionCostQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MonitorFormulaAndFunctionCostQueryDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MonitorFormulaAndFunctionCostQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MonitorFormulaAndFunctionCostQueryDefinition'", e);
            }
            
            // deserialize MonitorFormulaAndFunctionDataQualityQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Integer.class) || MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Long.class) || MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Float.class) || MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Double.class) || MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Boolean.class) || MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Integer.class) || MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Float.class) || MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MonitorFormulaAndFunctionDataQualityQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MonitorFormulaAndFunctionDataQualityQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MonitorFormulaAndFunctionDataQualityQueryDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MonitorFormulaAndFunctionDataQualityQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MonitorFormulaAndFunctionDataQualityQueryDefinition'", e);
            }
            
            MonitorFormulaAndFunctionQueryDefinition ret = new MonitorFormulaAndFunctionQueryDefinition();
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
        public MonitorFormulaAndFunctionQueryDefinition getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "MonitorFormulaAndFunctionQueryDefinition cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public MonitorFormulaAndFunctionQueryDefinition() {
        super("oneOf", Boolean.FALSE);
    }
    public MonitorFormulaAndFunctionQueryDefinition(MonitorFormulaAndFunctionEventQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MonitorFormulaAndFunctionQueryDefinition(MonitorFormulaAndFunctionCostQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MonitorFormulaAndFunctionQueryDefinition(MonitorFormulaAndFunctionDataQualityQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MonitorFormulaAndFunctionEventQueryDefinition", new GenericType<MonitorFormulaAndFunctionEventQueryDefinition>() {
        });
        schemas.put("MonitorFormulaAndFunctionCostQueryDefinition", new GenericType<MonitorFormulaAndFunctionCostQueryDefinition>() {
        });
        schemas.put("MonitorFormulaAndFunctionDataQualityQueryDefinition", new GenericType<MonitorFormulaAndFunctionDataQualityQueryDefinition>() {
        });
        JSON.registerDescendants(MonitorFormulaAndFunctionQueryDefinition.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return MonitorFormulaAndFunctionQueryDefinition.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MonitorFormulaAndFunctionEventQueryDefinition, MonitorFormulaAndFunctionCostQueryDefinition, MonitorFormulaAndFunctionDataQualityQueryDefinition
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(MonitorFormulaAndFunctionEventQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(MonitorFormulaAndFunctionCostQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(MonitorFormulaAndFunctionDataQualityQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be MonitorFormulaAndFunctionEventQueryDefinition, MonitorFormulaAndFunctionCostQueryDefinition, MonitorFormulaAndFunctionDataQualityQueryDefinition");
    }

    /**
     * Get the actual instance, which can be the following:
     * MonitorFormulaAndFunctionEventQueryDefinition, MonitorFormulaAndFunctionCostQueryDefinition, MonitorFormulaAndFunctionDataQualityQueryDefinition
     *
     * @return The actual instance (MonitorFormulaAndFunctionEventQueryDefinition, MonitorFormulaAndFunctionCostQueryDefinition, MonitorFormulaAndFunctionDataQualityQueryDefinition)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MonitorFormulaAndFunctionEventQueryDefinition`. If the actual instance is not `MonitorFormulaAndFunctionEventQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MonitorFormulaAndFunctionEventQueryDefinition`
     * @throws ClassCastException if the instance is not `MonitorFormulaAndFunctionEventQueryDefinition`
     */
    public MonitorFormulaAndFunctionEventQueryDefinition getMonitorFormulaAndFunctionEventQueryDefinition() throws ClassCastException {
        return (MonitorFormulaAndFunctionEventQueryDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MonitorFormulaAndFunctionCostQueryDefinition`. If the actual instance is not `MonitorFormulaAndFunctionCostQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MonitorFormulaAndFunctionCostQueryDefinition`
     * @throws ClassCastException if the instance is not `MonitorFormulaAndFunctionCostQueryDefinition`
     */
    public MonitorFormulaAndFunctionCostQueryDefinition getMonitorFormulaAndFunctionCostQueryDefinition() throws ClassCastException {
        return (MonitorFormulaAndFunctionCostQueryDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MonitorFormulaAndFunctionDataQualityQueryDefinition`. If the actual instance is not `MonitorFormulaAndFunctionDataQualityQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MonitorFormulaAndFunctionDataQualityQueryDefinition`
     * @throws ClassCastException if the instance is not `MonitorFormulaAndFunctionDataQualityQueryDefinition`
     */
    public MonitorFormulaAndFunctionDataQualityQueryDefinition getMonitorFormulaAndFunctionDataQualityQueryDefinition() throws ClassCastException {
        return (MonitorFormulaAndFunctionDataQualityQueryDefinition)super.getActualInstance();
    }
}
