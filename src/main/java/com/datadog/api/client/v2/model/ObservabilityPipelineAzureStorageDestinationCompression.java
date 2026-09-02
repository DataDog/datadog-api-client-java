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
@JsonDeserialize(using = ObservabilityPipelineAzureStorageDestinationCompression.ObservabilityPipelineAzureStorageDestinationCompressionDeserializer.class)
@JsonSerialize(using = ObservabilityPipelineAzureStorageDestinationCompression.ObservabilityPipelineAzureStorageDestinationCompressionSerializer.class)
public class ObservabilityPipelineAzureStorageDestinationCompression extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ObservabilityPipelineAzureStorageDestinationCompression.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ObservabilityPipelineAzureStorageDestinationCompressionSerializer extends StdSerializer<ObservabilityPipelineAzureStorageDestinationCompression> {
        public ObservabilityPipelineAzureStorageDestinationCompressionSerializer(Class<ObservabilityPipelineAzureStorageDestinationCompression> t) {
            super(t);
        }

        public ObservabilityPipelineAzureStorageDestinationCompressionSerializer() {
            this(null);
        }

        @Override
        public void serialize(ObservabilityPipelineAzureStorageDestinationCompression value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ObservabilityPipelineAzureStorageDestinationCompressionDeserializer extends StdDeserializer<ObservabilityPipelineAzureStorageDestinationCompression> {
        public ObservabilityPipelineAzureStorageDestinationCompressionDeserializer() {
            this(ObservabilityPipelineAzureStorageDestinationCompression.class);
        }

        public ObservabilityPipelineAzureStorageDestinationCompressionDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ObservabilityPipelineAzureStorageDestinationCompression deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ObservabilityPipelineAzureStorageDestinationCompressionZstd
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Integer.class) || ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Long.class) || ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Float.class) || ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Double.class) || ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Boolean.class) || ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Integer.class) || ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Float.class) || ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineAzureStorageDestinationCompressionZstd.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAzureStorageDestinationCompressionZstd.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineAzureStorageDestinationCompressionZstd)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAzureStorageDestinationCompressionZstd'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineAzureStorageDestinationCompressionZstd'", e);
            }
            
            // deserialize ObservabilityPipelineAzureStorageDestinationCompressionGzip
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Integer.class) || ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Long.class) || ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Float.class) || ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Double.class) || ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Boolean.class) || ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Integer.class) || ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Float.class) || ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineAzureStorageDestinationCompressionGzip.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAzureStorageDestinationCompressionGzip.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineAzureStorageDestinationCompressionGzip)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAzureStorageDestinationCompressionGzip'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineAzureStorageDestinationCompressionGzip'", e);
            }
            
            ObservabilityPipelineAzureStorageDestinationCompression ret = new ObservabilityPipelineAzureStorageDestinationCompression();
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
        public ObservabilityPipelineAzureStorageDestinationCompression getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ObservabilityPipelineAzureStorageDestinationCompression cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ObservabilityPipelineAzureStorageDestinationCompression() {
        super("oneOf", Boolean.FALSE);
    }
    public ObservabilityPipelineAzureStorageDestinationCompression(ObservabilityPipelineAzureStorageDestinationCompressionZstd o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ObservabilityPipelineAzureStorageDestinationCompression(ObservabilityPipelineAzureStorageDestinationCompressionGzip o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ObservabilityPipelineAzureStorageDestinationCompressionZstd", new GenericType<ObservabilityPipelineAzureStorageDestinationCompressionZstd>() {
        });
        schemas.put("ObservabilityPipelineAzureStorageDestinationCompressionGzip", new GenericType<ObservabilityPipelineAzureStorageDestinationCompressionGzip>() {
        });
        JSON.registerDescendants(ObservabilityPipelineAzureStorageDestinationCompression.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ObservabilityPipelineAzureStorageDestinationCompression.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ObservabilityPipelineAzureStorageDestinationCompressionZstd, ObservabilityPipelineAzureStorageDestinationCompressionGzip
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ObservabilityPipelineAzureStorageDestinationCompressionZstd.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ObservabilityPipelineAzureStorageDestinationCompressionGzip.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ObservabilityPipelineAzureStorageDestinationCompressionZstd, ObservabilityPipelineAzureStorageDestinationCompressionGzip");
    }

    /**
     * Get the actual instance, which can be the following:
     * ObservabilityPipelineAzureStorageDestinationCompressionZstd, ObservabilityPipelineAzureStorageDestinationCompressionGzip
     *
     * @return The actual instance (ObservabilityPipelineAzureStorageDestinationCompressionZstd, ObservabilityPipelineAzureStorageDestinationCompressionGzip)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineAzureStorageDestinationCompressionZstd`. If the actual instance is not `ObservabilityPipelineAzureStorageDestinationCompressionZstd`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineAzureStorageDestinationCompressionZstd`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineAzureStorageDestinationCompressionZstd`
     */
    public ObservabilityPipelineAzureStorageDestinationCompressionZstd getObservabilityPipelineAzureStorageDestinationCompressionZstd() throws ClassCastException {
        return (ObservabilityPipelineAzureStorageDestinationCompressionZstd)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineAzureStorageDestinationCompressionGzip`. If the actual instance is not `ObservabilityPipelineAzureStorageDestinationCompressionGzip`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineAzureStorageDestinationCompressionGzip`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineAzureStorageDestinationCompressionGzip`
     */
    public ObservabilityPipelineAzureStorageDestinationCompressionGzip getObservabilityPipelineAzureStorageDestinationCompressionGzip() throws ClassCastException {
        return (ObservabilityPipelineAzureStorageDestinationCompressionGzip)super.getActualInstance();
    }
}
