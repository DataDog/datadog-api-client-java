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
@JsonDeserialize(using = CustomDestinationForwardDestination.CustomDestinationForwardDestinationDeserializer.class)
@JsonSerialize(using = CustomDestinationForwardDestination.CustomDestinationForwardDestinationSerializer.class)
public class CustomDestinationForwardDestination extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CustomDestinationForwardDestination.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class CustomDestinationForwardDestinationSerializer extends StdSerializer<CustomDestinationForwardDestination> {
        public CustomDestinationForwardDestinationSerializer(Class<CustomDestinationForwardDestination> t) {
            super(t);
        }

        public CustomDestinationForwardDestinationSerializer() {
            this(null);
        }

        @Override
        public void serialize(CustomDestinationForwardDestination value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CustomDestinationForwardDestinationDeserializer extends StdDeserializer<CustomDestinationForwardDestination> {
        public CustomDestinationForwardDestinationDeserializer() {
            this(CustomDestinationForwardDestination.class);
        }

        public CustomDestinationForwardDestinationDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CustomDestinationForwardDestination deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CustomDestinationForwardDestinationHttp
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomDestinationForwardDestinationHttp.class.equals(Integer.class) || CustomDestinationForwardDestinationHttp.class.equals(Long.class) || CustomDestinationForwardDestinationHttp.class.equals(Float.class) || CustomDestinationForwardDestinationHttp.class.equals(Double.class) || CustomDestinationForwardDestinationHttp.class.equals(Boolean.class) || CustomDestinationForwardDestinationHttp.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomDestinationForwardDestinationHttp.class.equals(Integer.class) || CustomDestinationForwardDestinationHttp.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomDestinationForwardDestinationHttp.class.equals(Float.class) || CustomDestinationForwardDestinationHttp.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CustomDestinationForwardDestinationHttp.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomDestinationForwardDestinationHttp.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CustomDestinationForwardDestinationHttp.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CustomDestinationForwardDestinationHttp)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CustomDestinationForwardDestinationHttp'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomDestinationForwardDestinationHttp'", e);
            }
            
            // deserialize CustomDestinationForwardDestinationSplunk
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomDestinationForwardDestinationSplunk.class.equals(Integer.class) || CustomDestinationForwardDestinationSplunk.class.equals(Long.class) || CustomDestinationForwardDestinationSplunk.class.equals(Float.class) || CustomDestinationForwardDestinationSplunk.class.equals(Double.class) || CustomDestinationForwardDestinationSplunk.class.equals(Boolean.class) || CustomDestinationForwardDestinationSplunk.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomDestinationForwardDestinationSplunk.class.equals(Integer.class) || CustomDestinationForwardDestinationSplunk.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomDestinationForwardDestinationSplunk.class.equals(Float.class) || CustomDestinationForwardDestinationSplunk.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CustomDestinationForwardDestinationSplunk.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomDestinationForwardDestinationSplunk.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CustomDestinationForwardDestinationSplunk.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CustomDestinationForwardDestinationSplunk)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CustomDestinationForwardDestinationSplunk'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomDestinationForwardDestinationSplunk'", e);
            }
            
            // deserialize CustomDestinationForwardDestinationElasticsearch
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomDestinationForwardDestinationElasticsearch.class.equals(Integer.class) || CustomDestinationForwardDestinationElasticsearch.class.equals(Long.class) || CustomDestinationForwardDestinationElasticsearch.class.equals(Float.class) || CustomDestinationForwardDestinationElasticsearch.class.equals(Double.class) || CustomDestinationForwardDestinationElasticsearch.class.equals(Boolean.class) || CustomDestinationForwardDestinationElasticsearch.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomDestinationForwardDestinationElasticsearch.class.equals(Integer.class) || CustomDestinationForwardDestinationElasticsearch.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomDestinationForwardDestinationElasticsearch.class.equals(Float.class) || CustomDestinationForwardDestinationElasticsearch.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CustomDestinationForwardDestinationElasticsearch.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomDestinationForwardDestinationElasticsearch.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CustomDestinationForwardDestinationElasticsearch.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CustomDestinationForwardDestinationElasticsearch)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CustomDestinationForwardDestinationElasticsearch'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomDestinationForwardDestinationElasticsearch'", e);
            }
            
            // deserialize CustomDestinationForwardDestinationMicrosoftSentinel
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Integer.class) || CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Long.class) || CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Float.class) || CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Double.class) || CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Boolean.class) || CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Integer.class) || CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Float.class) || CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomDestinationForwardDestinationMicrosoftSentinel.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CustomDestinationForwardDestinationMicrosoftSentinel.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CustomDestinationForwardDestinationMicrosoftSentinel)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CustomDestinationForwardDestinationMicrosoftSentinel'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomDestinationForwardDestinationMicrosoftSentinel'", e);
            }
            
            CustomDestinationForwardDestination ret = new CustomDestinationForwardDestination();
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
        public CustomDestinationForwardDestination getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CustomDestinationForwardDestination cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CustomDestinationForwardDestination() {
        super("oneOf", Boolean.FALSE);
    }
    public CustomDestinationForwardDestination(CustomDestinationForwardDestinationHttp o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public CustomDestinationForwardDestination(CustomDestinationForwardDestinationSplunk o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public CustomDestinationForwardDestination(CustomDestinationForwardDestinationElasticsearch o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public CustomDestinationForwardDestination(CustomDestinationForwardDestinationMicrosoftSentinel o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomDestinationForwardDestinationHttp", new GenericType<CustomDestinationForwardDestinationHttp>() {
        });
        schemas.put("CustomDestinationForwardDestinationSplunk", new GenericType<CustomDestinationForwardDestinationSplunk>() {
        });
        schemas.put("CustomDestinationForwardDestinationElasticsearch", new GenericType<CustomDestinationForwardDestinationElasticsearch>() {
        });
        schemas.put("CustomDestinationForwardDestinationMicrosoftSentinel", new GenericType<CustomDestinationForwardDestinationMicrosoftSentinel>() {
        });
        JSON.registerDescendants(CustomDestinationForwardDestination.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CustomDestinationForwardDestination.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomDestinationForwardDestinationHttp, CustomDestinationForwardDestinationSplunk, CustomDestinationForwardDestinationElasticsearch, CustomDestinationForwardDestinationMicrosoftSentinel
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CustomDestinationForwardDestinationHttp.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CustomDestinationForwardDestinationSplunk.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CustomDestinationForwardDestinationElasticsearch.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CustomDestinationForwardDestinationMicrosoftSentinel.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be CustomDestinationForwardDestinationHttp, CustomDestinationForwardDestinationSplunk, CustomDestinationForwardDestinationElasticsearch, CustomDestinationForwardDestinationMicrosoftSentinel");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomDestinationForwardDestinationHttp, CustomDestinationForwardDestinationSplunk, CustomDestinationForwardDestinationElasticsearch, CustomDestinationForwardDestinationMicrosoftSentinel
     *
     * @return The actual instance (CustomDestinationForwardDestinationHttp, CustomDestinationForwardDestinationSplunk, CustomDestinationForwardDestinationElasticsearch, CustomDestinationForwardDestinationMicrosoftSentinel)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomDestinationForwardDestinationHttp`. If the actual instance is not `CustomDestinationForwardDestinationHttp`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomDestinationForwardDestinationHttp`
     * @throws ClassCastException if the instance is not `CustomDestinationForwardDestinationHttp`
     */
    public CustomDestinationForwardDestinationHttp getCustomDestinationForwardDestinationHttp() throws ClassCastException {
        return (CustomDestinationForwardDestinationHttp)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomDestinationForwardDestinationSplunk`. If the actual instance is not `CustomDestinationForwardDestinationSplunk`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomDestinationForwardDestinationSplunk`
     * @throws ClassCastException if the instance is not `CustomDestinationForwardDestinationSplunk`
     */
    public CustomDestinationForwardDestinationSplunk getCustomDestinationForwardDestinationSplunk() throws ClassCastException {
        return (CustomDestinationForwardDestinationSplunk)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomDestinationForwardDestinationElasticsearch`. If the actual instance is not `CustomDestinationForwardDestinationElasticsearch`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomDestinationForwardDestinationElasticsearch`
     * @throws ClassCastException if the instance is not `CustomDestinationForwardDestinationElasticsearch`
     */
    public CustomDestinationForwardDestinationElasticsearch getCustomDestinationForwardDestinationElasticsearch() throws ClassCastException {
        return (CustomDestinationForwardDestinationElasticsearch)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomDestinationForwardDestinationMicrosoftSentinel`. If the actual instance is not `CustomDestinationForwardDestinationMicrosoftSentinel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomDestinationForwardDestinationMicrosoftSentinel`
     * @throws ClassCastException if the instance is not `CustomDestinationForwardDestinationMicrosoftSentinel`
     */
    public CustomDestinationForwardDestinationMicrosoftSentinel getCustomDestinationForwardDestinationMicrosoftSentinel() throws ClassCastException {
        return (CustomDestinationForwardDestinationMicrosoftSentinel)super.getActualInstance();
    }
}
