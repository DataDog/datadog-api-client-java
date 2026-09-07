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
@JsonDeserialize(using = AWSNamespaceFilters.AWSNamespaceFiltersDeserializer.class)
@JsonSerialize(using = AWSNamespaceFilters.AWSNamespaceFiltersSerializer.class)
public class AWSNamespaceFilters extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AWSNamespaceFilters.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class AWSNamespaceFiltersSerializer extends StdSerializer<AWSNamespaceFilters> {
        public AWSNamespaceFiltersSerializer(Class<AWSNamespaceFilters> t) {
            super(t);
        }

        public AWSNamespaceFiltersSerializer() {
            this(null);
        }

        @Override
        public void serialize(AWSNamespaceFilters value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AWSNamespaceFiltersDeserializer extends StdDeserializer<AWSNamespaceFilters> {
        public AWSNamespaceFiltersDeserializer() {
            this(AWSNamespaceFilters.class);
        }

        public AWSNamespaceFiltersDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AWSNamespaceFilters deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AWSNamespaceFiltersExcludeOnly
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AWSNamespaceFiltersExcludeOnly.class.equals(Integer.class) || AWSNamespaceFiltersExcludeOnly.class.equals(Long.class) || AWSNamespaceFiltersExcludeOnly.class.equals(Float.class) || AWSNamespaceFiltersExcludeOnly.class.equals(Double.class) || AWSNamespaceFiltersExcludeOnly.class.equals(Boolean.class) || AWSNamespaceFiltersExcludeOnly.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AWSNamespaceFiltersExcludeOnly.class.equals(Integer.class) || AWSNamespaceFiltersExcludeOnly.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AWSNamespaceFiltersExcludeOnly.class.equals(Float.class) || AWSNamespaceFiltersExcludeOnly.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AWSNamespaceFiltersExcludeOnly.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AWSNamespaceFiltersExcludeOnly.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AWSNamespaceFiltersExcludeOnly.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AWSNamespaceFiltersExcludeOnly)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AWSNamespaceFiltersExcludeOnly'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AWSNamespaceFiltersExcludeOnly'", e);
            }
            
            // deserialize AWSNamespaceFiltersIncludeOnly
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AWSNamespaceFiltersIncludeOnly.class.equals(Integer.class) || AWSNamespaceFiltersIncludeOnly.class.equals(Long.class) || AWSNamespaceFiltersIncludeOnly.class.equals(Float.class) || AWSNamespaceFiltersIncludeOnly.class.equals(Double.class) || AWSNamespaceFiltersIncludeOnly.class.equals(Boolean.class) || AWSNamespaceFiltersIncludeOnly.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AWSNamespaceFiltersIncludeOnly.class.equals(Integer.class) || AWSNamespaceFiltersIncludeOnly.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AWSNamespaceFiltersIncludeOnly.class.equals(Float.class) || AWSNamespaceFiltersIncludeOnly.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AWSNamespaceFiltersIncludeOnly.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AWSNamespaceFiltersIncludeOnly.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AWSNamespaceFiltersIncludeOnly.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AWSNamespaceFiltersIncludeOnly)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AWSNamespaceFiltersIncludeOnly'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AWSNamespaceFiltersIncludeOnly'", e);
            }
            
            AWSNamespaceFilters ret = new AWSNamespaceFilters();
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
        public AWSNamespaceFilters getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AWSNamespaceFilters cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AWSNamespaceFilters() {
        super("oneOf", Boolean.FALSE);
    }
    public AWSNamespaceFilters(AWSNamespaceFiltersExcludeOnly o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public AWSNamespaceFilters(AWSNamespaceFiltersIncludeOnly o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AWSNamespaceFiltersExcludeOnly", new GenericType<AWSNamespaceFiltersExcludeOnly>() {
        });
        schemas.put("AWSNamespaceFiltersIncludeOnly", new GenericType<AWSNamespaceFiltersIncludeOnly>() {
        });
        JSON.registerDescendants(AWSNamespaceFilters.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AWSNamespaceFilters.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AWSNamespaceFiltersExcludeOnly, AWSNamespaceFiltersIncludeOnly
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AWSNamespaceFiltersExcludeOnly.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AWSNamespaceFiltersIncludeOnly.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be AWSNamespaceFiltersExcludeOnly, AWSNamespaceFiltersIncludeOnly");
    }

    /**
     * Get the actual instance, which can be the following:
     * AWSNamespaceFiltersExcludeOnly, AWSNamespaceFiltersIncludeOnly
     *
     * @return The actual instance (AWSNamespaceFiltersExcludeOnly, AWSNamespaceFiltersIncludeOnly)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AWSNamespaceFiltersExcludeOnly`. If the actual instance is not `AWSNamespaceFiltersExcludeOnly`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AWSNamespaceFiltersExcludeOnly`
     * @throws ClassCastException if the instance is not `AWSNamespaceFiltersExcludeOnly`
     */
    public AWSNamespaceFiltersExcludeOnly getAWSNamespaceFiltersExcludeOnly() throws ClassCastException {
        return (AWSNamespaceFiltersExcludeOnly)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AWSNamespaceFiltersIncludeOnly`. If the actual instance is not `AWSNamespaceFiltersIncludeOnly`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AWSNamespaceFiltersIncludeOnly`
     * @throws ClassCastException if the instance is not `AWSNamespaceFiltersIncludeOnly`
     */
    public AWSNamespaceFiltersIncludeOnly getAWSNamespaceFiltersIncludeOnly() throws ClassCastException {
        return (AWSNamespaceFiltersIncludeOnly)super.getActualInstance();
    }
}
