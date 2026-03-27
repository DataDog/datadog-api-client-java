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
@JsonDeserialize(using = ObservabilityPipelineAmazonS3GenericEncoding.ObservabilityPipelineAmazonS3GenericEncodingDeserializer.class)
@JsonSerialize(using = ObservabilityPipelineAmazonS3GenericEncoding.ObservabilityPipelineAmazonS3GenericEncodingSerializer.class)
public class ObservabilityPipelineAmazonS3GenericEncoding extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ObservabilityPipelineAmazonS3GenericEncoding.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ObservabilityPipelineAmazonS3GenericEncodingSerializer extends StdSerializer<ObservabilityPipelineAmazonS3GenericEncoding> {
        public ObservabilityPipelineAmazonS3GenericEncodingSerializer(Class<ObservabilityPipelineAmazonS3GenericEncoding> t) {
            super(t);
        }

        public ObservabilityPipelineAmazonS3GenericEncodingSerializer() {
            this(null);
        }

        @Override
        public void serialize(ObservabilityPipelineAmazonS3GenericEncoding value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ObservabilityPipelineAmazonS3GenericEncodingDeserializer extends StdDeserializer<ObservabilityPipelineAmazonS3GenericEncoding> {
        public ObservabilityPipelineAmazonS3GenericEncodingDeserializer() {
            this(ObservabilityPipelineAmazonS3GenericEncoding.class);
        }

        public ObservabilityPipelineAmazonS3GenericEncodingDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ObservabilityPipelineAmazonS3GenericEncoding deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ObservabilityPipelineAmazonS3GenericEncodingJson
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Long.class) || ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Double.class) || ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Boolean.class) || ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericEncodingJson.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAmazonS3GenericEncodingJson.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineAmazonS3GenericEncodingJson)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3GenericEncodingJson'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineAmazonS3GenericEncodingJson'", e);
            }
            
            // deserialize ObservabilityPipelineAmazonS3GenericEncodingParquet
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Long.class) || ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Double.class) || ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Boolean.class) || ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Integer.class) || ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Float.class) || ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ObservabilityPipelineAmazonS3GenericEncodingParquet.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAmazonS3GenericEncodingParquet.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ObservabilityPipelineAmazonS3GenericEncodingParquet)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3GenericEncodingParquet'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ObservabilityPipelineAmazonS3GenericEncodingParquet'", e);
            }
            
            ObservabilityPipelineAmazonS3GenericEncoding ret = new ObservabilityPipelineAmazonS3GenericEncoding();
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
        public ObservabilityPipelineAmazonS3GenericEncoding getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ObservabilityPipelineAmazonS3GenericEncoding cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ObservabilityPipelineAmazonS3GenericEncoding() {
        super("oneOf", Boolean.FALSE);
    }
    public ObservabilityPipelineAmazonS3GenericEncoding(ObservabilityPipelineAmazonS3GenericEncodingJson o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ObservabilityPipelineAmazonS3GenericEncoding(ObservabilityPipelineAmazonS3GenericEncodingParquet o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ObservabilityPipelineAmazonS3GenericEncodingJson", new GenericType<ObservabilityPipelineAmazonS3GenericEncodingJson>() {
        });
        schemas.put("ObservabilityPipelineAmazonS3GenericEncodingParquet", new GenericType<ObservabilityPipelineAmazonS3GenericEncodingParquet>() {
        });
        JSON.registerDescendants(ObservabilityPipelineAmazonS3GenericEncoding.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ObservabilityPipelineAmazonS3GenericEncoding.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ObservabilityPipelineAmazonS3GenericEncodingJson, ObservabilityPipelineAmazonS3GenericEncodingParquet
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ObservabilityPipelineAmazonS3GenericEncodingJson.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ObservabilityPipelineAmazonS3GenericEncodingParquet.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ObservabilityPipelineAmazonS3GenericEncodingJson, ObservabilityPipelineAmazonS3GenericEncodingParquet");
    }

    /**
     * Get the actual instance, which can be the following:
     * ObservabilityPipelineAmazonS3GenericEncodingJson, ObservabilityPipelineAmazonS3GenericEncodingParquet
     *
     * @return The actual instance (ObservabilityPipelineAmazonS3GenericEncodingJson, ObservabilityPipelineAmazonS3GenericEncodingParquet)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineAmazonS3GenericEncodingJson`. If the actual instance is not `ObservabilityPipelineAmazonS3GenericEncodingJson`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineAmazonS3GenericEncodingJson`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3GenericEncodingJson`
     */
    public ObservabilityPipelineAmazonS3GenericEncodingJson getObservabilityPipelineAmazonS3GenericEncodingJson() throws ClassCastException {
        return (ObservabilityPipelineAmazonS3GenericEncodingJson)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ObservabilityPipelineAmazonS3GenericEncodingParquet`. If the actual instance is not `ObservabilityPipelineAmazonS3GenericEncodingParquet`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ObservabilityPipelineAmazonS3GenericEncodingParquet`
     * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3GenericEncodingParquet`
     */
    public ObservabilityPipelineAmazonS3GenericEncodingParquet getObservabilityPipelineAmazonS3GenericEncodingParquet() throws ClassCastException {
        return (ObservabilityPipelineAmazonS3GenericEncodingParquet)super.getActualInstance();
    }
}
