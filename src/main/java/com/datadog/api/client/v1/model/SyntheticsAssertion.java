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
@JsonDeserialize(using = SyntheticsAssertion.SyntheticsAssertionDeserializer.class)
@JsonSerialize(using = SyntheticsAssertion.SyntheticsAssertionSerializer.class)
public class SyntheticsAssertion extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SyntheticsAssertion.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class SyntheticsAssertionSerializer extends StdSerializer<SyntheticsAssertion> {
        public SyntheticsAssertionSerializer(Class<SyntheticsAssertion> t) {
            super(t);
        }

        public SyntheticsAssertionSerializer() {
            this(null);
        }

        @Override
        public void serialize(SyntheticsAssertion value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SyntheticsAssertionDeserializer extends StdDeserializer<SyntheticsAssertion> {
        public SyntheticsAssertionDeserializer() {
            this(SyntheticsAssertion.class);
        }

        public SyntheticsAssertionDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SyntheticsAssertion deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize SyntheticsAssertionTarget
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SyntheticsAssertionTarget.class.equals(Integer.class) || SyntheticsAssertionTarget.class.equals(Long.class) || SyntheticsAssertionTarget.class.equals(Float.class) || SyntheticsAssertionTarget.class.equals(Double.class) || SyntheticsAssertionTarget.class.equals(Boolean.class) || SyntheticsAssertionTarget.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SyntheticsAssertionTarget.class.equals(Integer.class) || SyntheticsAssertionTarget.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SyntheticsAssertionTarget.class.equals(Float.class) || SyntheticsAssertionTarget.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SyntheticsAssertionTarget.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SyntheticsAssertionTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAssertionTarget.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SyntheticsAssertionTarget)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SyntheticsAssertionTarget'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SyntheticsAssertionTarget'", e);
            }
            
            // deserialize SyntheticsAssertionBodyHashTarget
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SyntheticsAssertionBodyHashTarget.class.equals(Integer.class) || SyntheticsAssertionBodyHashTarget.class.equals(Long.class) || SyntheticsAssertionBodyHashTarget.class.equals(Float.class) || SyntheticsAssertionBodyHashTarget.class.equals(Double.class) || SyntheticsAssertionBodyHashTarget.class.equals(Boolean.class) || SyntheticsAssertionBodyHashTarget.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SyntheticsAssertionBodyHashTarget.class.equals(Integer.class) || SyntheticsAssertionBodyHashTarget.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SyntheticsAssertionBodyHashTarget.class.equals(Float.class) || SyntheticsAssertionBodyHashTarget.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SyntheticsAssertionBodyHashTarget.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SyntheticsAssertionBodyHashTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAssertionBodyHashTarget.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SyntheticsAssertionBodyHashTarget)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SyntheticsAssertionBodyHashTarget'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SyntheticsAssertionBodyHashTarget'", e);
            }
            
            // deserialize SyntheticsAssertionJSONPathTarget
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SyntheticsAssertionJSONPathTarget.class.equals(Integer.class) || SyntheticsAssertionJSONPathTarget.class.equals(Long.class) || SyntheticsAssertionJSONPathTarget.class.equals(Float.class) || SyntheticsAssertionJSONPathTarget.class.equals(Double.class) || SyntheticsAssertionJSONPathTarget.class.equals(Boolean.class) || SyntheticsAssertionJSONPathTarget.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SyntheticsAssertionJSONPathTarget.class.equals(Integer.class) || SyntheticsAssertionJSONPathTarget.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SyntheticsAssertionJSONPathTarget.class.equals(Float.class) || SyntheticsAssertionJSONPathTarget.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SyntheticsAssertionJSONPathTarget.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SyntheticsAssertionJSONPathTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAssertionJSONPathTarget.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SyntheticsAssertionJSONPathTarget)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SyntheticsAssertionJSONPathTarget'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SyntheticsAssertionJSONPathTarget'", e);
            }
            
            // deserialize SyntheticsAssertionJSONSchemaTarget
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SyntheticsAssertionJSONSchemaTarget.class.equals(Integer.class) || SyntheticsAssertionJSONSchemaTarget.class.equals(Long.class) || SyntheticsAssertionJSONSchemaTarget.class.equals(Float.class) || SyntheticsAssertionJSONSchemaTarget.class.equals(Double.class) || SyntheticsAssertionJSONSchemaTarget.class.equals(Boolean.class) || SyntheticsAssertionJSONSchemaTarget.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SyntheticsAssertionJSONSchemaTarget.class.equals(Integer.class) || SyntheticsAssertionJSONSchemaTarget.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SyntheticsAssertionJSONSchemaTarget.class.equals(Float.class) || SyntheticsAssertionJSONSchemaTarget.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SyntheticsAssertionJSONSchemaTarget.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SyntheticsAssertionJSONSchemaTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAssertionJSONSchemaTarget.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SyntheticsAssertionJSONSchemaTarget)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SyntheticsAssertionJSONSchemaTarget'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SyntheticsAssertionJSONSchemaTarget'", e);
            }
            
            // deserialize SyntheticsAssertionXPathTarget
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SyntheticsAssertionXPathTarget.class.equals(Integer.class) || SyntheticsAssertionXPathTarget.class.equals(Long.class) || SyntheticsAssertionXPathTarget.class.equals(Float.class) || SyntheticsAssertionXPathTarget.class.equals(Double.class) || SyntheticsAssertionXPathTarget.class.equals(Boolean.class) || SyntheticsAssertionXPathTarget.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SyntheticsAssertionXPathTarget.class.equals(Integer.class) || SyntheticsAssertionXPathTarget.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SyntheticsAssertionXPathTarget.class.equals(Float.class) || SyntheticsAssertionXPathTarget.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SyntheticsAssertionXPathTarget.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SyntheticsAssertionXPathTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAssertionXPathTarget.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SyntheticsAssertionXPathTarget)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SyntheticsAssertionXPathTarget'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SyntheticsAssertionXPathTarget'", e);
            }
            
            // deserialize SyntheticsAssertionJavascript
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SyntheticsAssertionJavascript.class.equals(Integer.class) || SyntheticsAssertionJavascript.class.equals(Long.class) || SyntheticsAssertionJavascript.class.equals(Float.class) || SyntheticsAssertionJavascript.class.equals(Double.class) || SyntheticsAssertionJavascript.class.equals(Boolean.class) || SyntheticsAssertionJavascript.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SyntheticsAssertionJavascript.class.equals(Integer.class) || SyntheticsAssertionJavascript.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SyntheticsAssertionJavascript.class.equals(Float.class) || SyntheticsAssertionJavascript.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SyntheticsAssertionJavascript.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SyntheticsAssertionJavascript.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAssertionJavascript.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SyntheticsAssertionJavascript)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SyntheticsAssertionJavascript'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SyntheticsAssertionJavascript'", e);
            }
            
            SyntheticsAssertion ret = new SyntheticsAssertion();
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
        public SyntheticsAssertion getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SyntheticsAssertion cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SyntheticsAssertion() {
        super("oneOf", Boolean.FALSE);
    }
    public SyntheticsAssertion(SyntheticsAssertionTarget o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SyntheticsAssertion(SyntheticsAssertionBodyHashTarget o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SyntheticsAssertion(SyntheticsAssertionJSONPathTarget o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SyntheticsAssertion(SyntheticsAssertionJSONSchemaTarget o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SyntheticsAssertion(SyntheticsAssertionXPathTarget o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SyntheticsAssertion(SyntheticsAssertionJavascript o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SyntheticsAssertionTarget", new GenericType<SyntheticsAssertionTarget>() {
        });
        schemas.put("SyntheticsAssertionBodyHashTarget", new GenericType<SyntheticsAssertionBodyHashTarget>() {
        });
        schemas.put("SyntheticsAssertionJSONPathTarget", new GenericType<SyntheticsAssertionJSONPathTarget>() {
        });
        schemas.put("SyntheticsAssertionJSONSchemaTarget", new GenericType<SyntheticsAssertionJSONSchemaTarget>() {
        });
        schemas.put("SyntheticsAssertionXPathTarget", new GenericType<SyntheticsAssertionXPathTarget>() {
        });
        schemas.put("SyntheticsAssertionJavascript", new GenericType<SyntheticsAssertionJavascript>() {
        });
        JSON.registerDescendants(SyntheticsAssertion.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SyntheticsAssertion.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SyntheticsAssertionTarget, SyntheticsAssertionBodyHashTarget, SyntheticsAssertionJSONPathTarget, SyntheticsAssertionJSONSchemaTarget, SyntheticsAssertionXPathTarget, SyntheticsAssertionJavascript
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(SyntheticsAssertionTarget.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SyntheticsAssertionBodyHashTarget.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SyntheticsAssertionJSONPathTarget.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SyntheticsAssertionJSONSchemaTarget.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SyntheticsAssertionXPathTarget.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SyntheticsAssertionJavascript.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be SyntheticsAssertionTarget, SyntheticsAssertionBodyHashTarget, SyntheticsAssertionJSONPathTarget, SyntheticsAssertionJSONSchemaTarget, SyntheticsAssertionXPathTarget, SyntheticsAssertionJavascript");
    }

    /**
     * Get the actual instance, which can be the following:
     * SyntheticsAssertionTarget, SyntheticsAssertionBodyHashTarget, SyntheticsAssertionJSONPathTarget, SyntheticsAssertionJSONSchemaTarget, SyntheticsAssertionXPathTarget, SyntheticsAssertionJavascript
     *
     * @return The actual instance (SyntheticsAssertionTarget, SyntheticsAssertionBodyHashTarget, SyntheticsAssertionJSONPathTarget, SyntheticsAssertionJSONSchemaTarget, SyntheticsAssertionXPathTarget, SyntheticsAssertionJavascript)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SyntheticsAssertionTarget`. If the actual instance is not `SyntheticsAssertionTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SyntheticsAssertionTarget`
     * @throws ClassCastException if the instance is not `SyntheticsAssertionTarget`
     */
    public SyntheticsAssertionTarget getSyntheticsAssertionTarget() throws ClassCastException {
        return (SyntheticsAssertionTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SyntheticsAssertionBodyHashTarget`. If the actual instance is not `SyntheticsAssertionBodyHashTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SyntheticsAssertionBodyHashTarget`
     * @throws ClassCastException if the instance is not `SyntheticsAssertionBodyHashTarget`
     */
    public SyntheticsAssertionBodyHashTarget getSyntheticsAssertionBodyHashTarget() throws ClassCastException {
        return (SyntheticsAssertionBodyHashTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SyntheticsAssertionJSONPathTarget`. If the actual instance is not `SyntheticsAssertionJSONPathTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SyntheticsAssertionJSONPathTarget`
     * @throws ClassCastException if the instance is not `SyntheticsAssertionJSONPathTarget`
     */
    public SyntheticsAssertionJSONPathTarget getSyntheticsAssertionJSONPathTarget() throws ClassCastException {
        return (SyntheticsAssertionJSONPathTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SyntheticsAssertionJSONSchemaTarget`. If the actual instance is not `SyntheticsAssertionJSONSchemaTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SyntheticsAssertionJSONSchemaTarget`
     * @throws ClassCastException if the instance is not `SyntheticsAssertionJSONSchemaTarget`
     */
    public SyntheticsAssertionJSONSchemaTarget getSyntheticsAssertionJSONSchemaTarget() throws ClassCastException {
        return (SyntheticsAssertionJSONSchemaTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SyntheticsAssertionXPathTarget`. If the actual instance is not `SyntheticsAssertionXPathTarget`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SyntheticsAssertionXPathTarget`
     * @throws ClassCastException if the instance is not `SyntheticsAssertionXPathTarget`
     */
    public SyntheticsAssertionXPathTarget getSyntheticsAssertionXPathTarget() throws ClassCastException {
        return (SyntheticsAssertionXPathTarget)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SyntheticsAssertionJavascript`. If the actual instance is not `SyntheticsAssertionJavascript`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SyntheticsAssertionJavascript`
     * @throws ClassCastException if the instance is not `SyntheticsAssertionJavascript`
     */
    public SyntheticsAssertionJavascript getSyntheticsAssertionJavascript() throws ClassCastException {
        return (SyntheticsAssertionJavascript)super.getActualInstance();
    }
}
