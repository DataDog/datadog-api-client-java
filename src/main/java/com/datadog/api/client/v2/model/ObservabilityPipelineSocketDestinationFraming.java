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
@JsonDeserialize(using = ObservabilityPipelineSocketDestinationFraming.ObservabilityPipelineSocketDestinationFramingDeserializer.class)
@JsonSerialize(using = ObservabilityPipelineSocketDestinationFraming.ObservabilityPipelineSocketDestinationFramingSerializer.class)
public class ObservabilityPipelineSocketDestinationFraming extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ObservabilityPipelineSocketDestinationFraming.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ObservabilityPipelineSocketDestinationFramingSerializer extends StdSerializer<ObservabilityPipelineSocketDestinationFraming> {
        public ObservabilityPipelineSocketDestinationFramingSerializer(Class<ObservabilityPipelineSocketDestinationFraming> t) {
            super(t);
        }

        public ObservabilityPipelineSocketDestinationFramingSerializer() {
            this(null);
        }

        @Override
        public void serialize(ObservabilityPipelineSocketDestinationFraming value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ObservabilityPipelineSocketDestinationFramingDeserializer extends StdDeserializer<ObservabilityPipelineSocketDestinationFraming> {
        public ObservabilityPipelineSocketDestinationFramingDeserializer() {
            this(ObservabilityPipelineSocketDestinationFraming.class);
        }

        public ObservabilityPipelineSocketDestinationFramingDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ObservabilityPipelineSocketDestinationFraming deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ObservabilityPipelineSocketDestinationFramingNewlineDelimited
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Integer.class) || ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Long.class) || ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Float.class) || ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Double.class) || ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Boolean.class) || ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Integer.class) || ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Float.class) || ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineSocketDestinationFramingNewlineDelimited)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSocketDestinationFramingNewlineDelimited'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineSocketDestinationFramingNewlineDelimited'", e);
            }
            
            // deserialize ObservabilityPipelineSocketDestinationFramingBytes
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Integer.class) || ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Long.class) || ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Float.class) || ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Double.class) || ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Boolean.class) || ObservabilityPipelineSocketDestinationFramingBytes.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Integer.class) || ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Float.class) || ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineSocketDestinationFramingBytes.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineSocketDestinationFramingBytes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSocketDestinationFramingBytes.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineSocketDestinationFramingBytes)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSocketDestinationFramingBytes'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineSocketDestinationFramingBytes'", e);
            }
            
            // deserialize ObservabilityPipelineSocketDestinationFramingCharacterDelimited
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Integer.class) || ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Long.class) || ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Float.class) || ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Double.class) || ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Boolean.class) || ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Integer.class) || ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Float.class) || ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineSocketDestinationFramingCharacterDelimited)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSocketDestinationFramingCharacterDelimited'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineSocketDestinationFramingCharacterDelimited'", e);
            }
            
            ObservabilityPipelineSocketDestinationFraming ret = new ObservabilityPipelineSocketDestinationFraming();
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
        public ObservabilityPipelineSocketDestinationFraming getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ObservabilityPipelineSocketDestinationFraming cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ObservabilityPipelineSocketDestinationFraming() {
        super("oneOf", Boolean.FALSE);
    }
    public ObservabilityPipelineSocketDestinationFraming(ObservabilityPipelineSocketDestinationFramingNewlineDelimited o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ObservabilityPipelineSocketDestinationFraming(ObservabilityPipelineSocketDestinationFramingBytes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ObservabilityPipelineSocketDestinationFraming(ObservabilityPipelineSocketDestinationFramingCharacterDelimited o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ObservabilityPipelineSocketDestinationFramingNewlineDelimited", new GenericType<ObservabilityPipelineSocketDestinationFramingNewlineDelimited>() {
        });
        schemas.put("ObservabilityPipelineSocketDestinationFramingBytes", new GenericType<ObservabilityPipelineSocketDestinationFramingBytes>() {
        });
        schemas.put("ObservabilityPipelineSocketDestinationFramingCharacterDelimited", new GenericType<ObservabilityPipelineSocketDestinationFramingCharacterDelimited>() {
        });
        JSON.registerDescendants(ObservabilityPipelineSocketDestinationFraming.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ObservabilityPipelineSocketDestinationFraming.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ObservabilityPipelineSocketDestinationFramingNewlineDelimited, ObservabilityPipelineSocketDestinationFramingBytes, ObservabilityPipelineSocketDestinationFramingCharacterDelimited
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ObservabilityPipelineSocketDestinationFramingNewlineDelimited.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ObservabilityPipelineSocketDestinationFramingBytes.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ObservabilityPipelineSocketDestinationFramingCharacterDelimited.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ObservabilityPipelineSocketDestinationFramingNewlineDelimited, ObservabilityPipelineSocketDestinationFramingBytes, ObservabilityPipelineSocketDestinationFramingCharacterDelimited");
    }

    /**
     * Get the actual instance, which can be the following:
     * ObservabilityPipelineSocketDestinationFramingNewlineDelimited, ObservabilityPipelineSocketDestinationFramingBytes, ObservabilityPipelineSocketDestinationFramingCharacterDelimited
     *
     * @return The actual instance (ObservabilityPipelineSocketDestinationFramingNewlineDelimited, ObservabilityPipelineSocketDestinationFramingBytes, ObservabilityPipelineSocketDestinationFramingCharacterDelimited)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineSocketDestinationFramingNewlineDelimited`. If the actual instance is not `ObservabilityPipelineSocketDestinationFramingNewlineDelimited`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineSocketDestinationFramingNewlineDelimited`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineSocketDestinationFramingNewlineDelimited`
     */
    public ObservabilityPipelineSocketDestinationFramingNewlineDelimited getObservabilityPipelineSocketDestinationFramingNewlineDelimited() throws ClassCastException {
        return (ObservabilityPipelineSocketDestinationFramingNewlineDelimited)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineSocketDestinationFramingBytes`. If the actual instance is not `ObservabilityPipelineSocketDestinationFramingBytes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineSocketDestinationFramingBytes`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineSocketDestinationFramingBytes`
     */
    public ObservabilityPipelineSocketDestinationFramingBytes getObservabilityPipelineSocketDestinationFramingBytes() throws ClassCastException {
        return (ObservabilityPipelineSocketDestinationFramingBytes)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineSocketDestinationFramingCharacterDelimited`. If the actual instance is not `ObservabilityPipelineSocketDestinationFramingCharacterDelimited`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineSocketDestinationFramingCharacterDelimited`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineSocketDestinationFramingCharacterDelimited`
     */
    public ObservabilityPipelineSocketDestinationFramingCharacterDelimited getObservabilityPipelineSocketDestinationFramingCharacterDelimited() throws ClassCastException {
        return (ObservabilityPipelineSocketDestinationFramingCharacterDelimited)super.getActualInstance();
    }
}
