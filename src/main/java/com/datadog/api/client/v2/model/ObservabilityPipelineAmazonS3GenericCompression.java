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
@JsonDeserialize(using = ObservabilityPipelineAmazonS3GenericCompression.ObservabilityPipelineAmazonS3GenericCompressionDeserializer.class)
@JsonSerialize(using = ObservabilityPipelineAmazonS3GenericCompression.ObservabilityPipelineAmazonS3GenericCompressionSerializer.class)
public class ObservabilityPipelineAmazonS3GenericCompression extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ObservabilityPipelineAmazonS3GenericCompression.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ObservabilityPipelineAmazonS3GenericCompressionSerializer extends StdSerializer<ObservabilityPipelineAmazonS3GenericCompression> {
        public ObservabilityPipelineAmazonS3GenericCompressionSerializer(Class<ObservabilityPipelineAmazonS3GenericCompression> t) {
            super(t);
        }

        public ObservabilityPipelineAmazonS3GenericCompressionSerializer() {
            this(null);
        }

        @Override
        public void serialize(ObservabilityPipelineAmazonS3GenericCompression value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ObservabilityPipelineAmazonS3GenericCompressionDeserializer extends StdDeserializer<ObservabilityPipelineAmazonS3GenericCompression> {
        public ObservabilityPipelineAmazonS3GenericCompressionDeserializer() {
            this(ObservabilityPipelineAmazonS3GenericCompression.class);
        }

        public ObservabilityPipelineAmazonS3GenericCompressionDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ObservabilityPipelineAmazonS3GenericCompression deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ObservabilityPipelineAmazonS3GenericCompressionZstd
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Long.class) || ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Double.class) || ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Boolean.class) || ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericCompressionZstd.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAmazonS3GenericCompressionZstd.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineAmazonS3GenericCompressionZstd)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3GenericCompressionZstd'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineAmazonS3GenericCompressionZstd'", e);
            }
            
            // deserialize ObservabilityPipelineAmazonS3GenericCompressionGzip
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Long.class) || ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Double.class) || ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Boolean.class) || ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericCompressionGzip.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAmazonS3GenericCompressionGzip.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineAmazonS3GenericCompressionGzip)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3GenericCompressionGzip'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineAmazonS3GenericCompressionGzip'", e);
            }
            
            // deserialize ObservabilityPipelineAmazonS3GenericCompressionSnappy
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Long.class) || ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Double.class) || ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Boolean.class) || ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericCompressionSnappy.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAmazonS3GenericCompressionSnappy.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineAmazonS3GenericCompressionSnappy)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3GenericCompressionSnappy'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineAmazonS3GenericCompressionSnappy'", e);
            }
            
            ObservabilityPipelineAmazonS3GenericCompression ret = new ObservabilityPipelineAmazonS3GenericCompression();
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
        public ObservabilityPipelineAmazonS3GenericCompression getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ObservabilityPipelineAmazonS3GenericCompression cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ObservabilityPipelineAmazonS3GenericCompression() {
        super("oneOf", Boolean.FALSE);
    }
    public ObservabilityPipelineAmazonS3GenericCompression(ObservabilityPipelineAmazonS3GenericCompressionZstd o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ObservabilityPipelineAmazonS3GenericCompression(ObservabilityPipelineAmazonS3GenericCompressionGzip o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ObservabilityPipelineAmazonS3GenericCompression(ObservabilityPipelineAmazonS3GenericCompressionSnappy o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ObservabilityPipelineAmazonS3GenericCompressionZstd", new GenericType<ObservabilityPipelineAmazonS3GenericCompressionZstd>() {
        });
        schemas.put("ObservabilityPipelineAmazonS3GenericCompressionGzip", new GenericType<ObservabilityPipelineAmazonS3GenericCompressionGzip>() {
        });
        schemas.put("ObservabilityPipelineAmazonS3GenericCompressionSnappy", new GenericType<ObservabilityPipelineAmazonS3GenericCompressionSnappy>() {
        });
        JSON.registerDescendants(ObservabilityPipelineAmazonS3GenericCompression.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ObservabilityPipelineAmazonS3GenericCompression.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ObservabilityPipelineAmazonS3GenericCompressionZstd, ObservabilityPipelineAmazonS3GenericCompressionGzip, ObservabilityPipelineAmazonS3GenericCompressionSnappy
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ObservabilityPipelineAmazonS3GenericCompressionZstd.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ObservabilityPipelineAmazonS3GenericCompressionGzip.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ObservabilityPipelineAmazonS3GenericCompressionSnappy.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ObservabilityPipelineAmazonS3GenericCompressionZstd, ObservabilityPipelineAmazonS3GenericCompressionGzip, ObservabilityPipelineAmazonS3GenericCompressionSnappy");
    }

    /**
     * Get the actual instance, which can be the following:
     * ObservabilityPipelineAmazonS3GenericCompressionZstd, ObservabilityPipelineAmazonS3GenericCompressionGzip, ObservabilityPipelineAmazonS3GenericCompressionSnappy
     *
     * @return The actual instance (ObservabilityPipelineAmazonS3GenericCompressionZstd, ObservabilityPipelineAmazonS3GenericCompressionGzip, ObservabilityPipelineAmazonS3GenericCompressionSnappy)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineAmazonS3GenericCompressionZstd`. If the actual instance is not `ObservabilityPipelineAmazonS3GenericCompressionZstd`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineAmazonS3GenericCompressionZstd`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3GenericCompressionZstd`
     */
    public ObservabilityPipelineAmazonS3GenericCompressionZstd getObservabilityPipelineAmazonS3GenericCompressionZstd() throws ClassCastException {
        return (ObservabilityPipelineAmazonS3GenericCompressionZstd)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineAmazonS3GenericCompressionGzip`. If the actual instance is not `ObservabilityPipelineAmazonS3GenericCompressionGzip`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineAmazonS3GenericCompressionGzip`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3GenericCompressionGzip`
     */
    public ObservabilityPipelineAmazonS3GenericCompressionGzip getObservabilityPipelineAmazonS3GenericCompressionGzip() throws ClassCastException {
        return (ObservabilityPipelineAmazonS3GenericCompressionGzip)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineAmazonS3GenericCompressionSnappy`. If the actual instance is not `ObservabilityPipelineAmazonS3GenericCompressionSnappy`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineAmazonS3GenericCompressionSnappy`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3GenericCompressionSnappy`
     */
    public ObservabilityPipelineAmazonS3GenericCompressionSnappy getObservabilityPipelineAmazonS3GenericCompressionSnappy() throws ClassCastException {
        return (ObservabilityPipelineAmazonS3GenericCompressionSnappy)super.getActualInstance();
    }
}
