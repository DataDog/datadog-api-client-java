/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JSON;
import com.datadog.api.v2.client.JSON;
import com.datadog.api.v2.client.model.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.swagger.annotations.ApiModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = LogsGroupByTotal.LogsGroupByTotalDeserializer.class)
@JsonSerialize(using = LogsGroupByTotal.LogsGroupByTotalSerializer.class)
public class LogsGroupByTotal extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(LogsGroupByTotal.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class LogsGroupByTotalSerializer extends StdSerializer<LogsGroupByTotal> {

        public LogsGroupByTotalSerializer(Class<LogsGroupByTotal> t) {
            super(t);
        }

        public LogsGroupByTotalSerializer() {
            this(null);
        }

        @Override
        public void serialize(LogsGroupByTotal value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class LogsGroupByTotalDeserializer extends StdDeserializer<LogsGroupByTotal> {

        public LogsGroupByTotalDeserializer() {
            this(LogsGroupByTotal.class);
        }

        public LogsGroupByTotalDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public LogsGroupByTotal deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Boolean
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    Boolean.class.equals(Integer.class) ||
                    Boolean.class.equals(Long.class) ||
                    Boolean.class.equals(Float.class) ||
                    Boolean.class.equals(Double.class) ||
                    Boolean.class.equals(Boolean.class) ||
                    Boolean.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            (
                                (Boolean.class.equals(Integer.class) || Boolean.class.equals(Long.class)) &&
                                token == JsonToken.VALUE_NUMBER_INT
                            );
                        attemptParsing |=
                            (
                                (Boolean.class.equals(Float.class) || Boolean.class.equals(Double.class)) &&
                                (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT)
                            );
                        attemptParsing |=
                            (Boolean.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Boolean.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(Boolean.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    deserialized = tmp;
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Boolean'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Boolean'", e);
            }

            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    String.class.equals(Integer.class) ||
                    String.class.equals(Long.class) ||
                    String.class.equals(Float.class) ||
                    String.class.equals(Double.class) ||
                    String.class.equals(Boolean.class) ||
                    String.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            (
                                (String.class.equals(Integer.class) || String.class.equals(Long.class)) &&
                                token == JsonToken.VALUE_NUMBER_INT
                            );
                        attemptParsing |=
                            (
                                (String.class.equals(Float.class) || String.class.equals(Double.class)) &&
                                (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT)
                            );
                        attemptParsing |=
                            (String.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
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
                if (
                    Double.class.equals(Integer.class) ||
                    Double.class.equals(Long.class) ||
                    Double.class.equals(Float.class) ||
                    Double.class.equals(Double.class) ||
                    Double.class.equals(Boolean.class) ||
                    Double.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            (
                                (Double.class.equals(Integer.class) || Double.class.equals(Long.class)) &&
                                token == JsonToken.VALUE_NUMBER_INT
                            );
                        attemptParsing |=
                            (
                                (Double.class.equals(Float.class) || Double.class.equals(Double.class)) &&
                                (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT)
                            );
                        attemptParsing |=
                            (Double.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
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

            LogsGroupByTotal ret = new LogsGroupByTotal();
            if (match == 1) {
                ret.setActualInstance(deserialized);
            } else {
                Map<String, Object> res = new ObjectMapper()
                    .readValue(tree.traverse(jp.getCodec()).readValueAsTree().toString(), HashMap.class);
                ret.setActualInstance(new UnparsedObject(res));
            }
            return ret;
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public LogsGroupByTotal getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "LogsGroupByTotal cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public LogsGroupByTotal() {
        super("oneOf", Boolean.FALSE);
    }

    public LogsGroupByTotal(Boolean o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LogsGroupByTotal(Double o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LogsGroupByTotal(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Boolean", new GenericType<Boolean>() {});
        schemas.put("Double", new GenericType<Double>() {});
        schemas.put("String", new GenericType<String>() {});
        JSON.registerDescendants(LogsGroupByTotal.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return LogsGroupByTotal.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Boolean, Double, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Boolean.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Double.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be Boolean, Double, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * Boolean, Double, String
     *
     * @return The actual instance (Boolean, Double, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean) super.getActualInstance();
    }

    /**
     * Get the actual instance of `Double`. If the actual instance is not `Double`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Double`
     * @throws ClassCastException if the instance is not `Double`
     */
    public Double getDouble() throws ClassCastException {
        return (Double) super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String) super.getActualInstance();
    }
}
