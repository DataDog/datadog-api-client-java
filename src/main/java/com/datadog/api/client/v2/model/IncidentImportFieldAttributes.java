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
@JsonDeserialize(using = IncidentImportFieldAttributes.IncidentImportFieldAttributesDeserializer.class)
@JsonSerialize(using = IncidentImportFieldAttributes.IncidentImportFieldAttributesSerializer.class)
public class IncidentImportFieldAttributes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(IncidentImportFieldAttributes.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class IncidentImportFieldAttributesSerializer extends StdSerializer<IncidentImportFieldAttributes> {
        public IncidentImportFieldAttributesSerializer(Class<IncidentImportFieldAttributes> t) {
            super(t);
        }

        public IncidentImportFieldAttributesSerializer() {
            this(null);
        }

        @Override
        public void serialize(IncidentImportFieldAttributes value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class IncidentImportFieldAttributesDeserializer extends StdDeserializer<IncidentImportFieldAttributes> {
        public IncidentImportFieldAttributesDeserializer() {
            this(IncidentImportFieldAttributes.class);
        }

        public IncidentImportFieldAttributesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public IncidentImportFieldAttributes deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize IncidentImportFieldAttributesSingleValue
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IncidentImportFieldAttributesSingleValue.class.equals(Integer.class) || IncidentImportFieldAttributesSingleValue.class.equals(Long.class) || IncidentImportFieldAttributesSingleValue.class.equals(Float.class) || IncidentImportFieldAttributesSingleValue.class.equals(Double.class) || IncidentImportFieldAttributesSingleValue.class.equals(Boolean.class) || IncidentImportFieldAttributesSingleValue.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IncidentImportFieldAttributesSingleValue.class.equals(Integer.class) || IncidentImportFieldAttributesSingleValue.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IncidentImportFieldAttributesSingleValue.class.equals(Float.class) || IncidentImportFieldAttributesSingleValue.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (IncidentImportFieldAttributesSingleValue.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IncidentImportFieldAttributesSingleValue.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentImportFieldAttributesSingleValue.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((IncidentImportFieldAttributesSingleValue)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'IncidentImportFieldAttributesSingleValue'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IncidentImportFieldAttributesSingleValue'", e);
            }
            
            // deserialize IncidentImportFieldAttributesMultipleValue
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IncidentImportFieldAttributesMultipleValue.class.equals(Integer.class) || IncidentImportFieldAttributesMultipleValue.class.equals(Long.class) || IncidentImportFieldAttributesMultipleValue.class.equals(Float.class) || IncidentImportFieldAttributesMultipleValue.class.equals(Double.class) || IncidentImportFieldAttributesMultipleValue.class.equals(Boolean.class) || IncidentImportFieldAttributesMultipleValue.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IncidentImportFieldAttributesMultipleValue.class.equals(Integer.class) || IncidentImportFieldAttributesMultipleValue.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IncidentImportFieldAttributesMultipleValue.class.equals(Float.class) || IncidentImportFieldAttributesMultipleValue.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (IncidentImportFieldAttributesMultipleValue.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IncidentImportFieldAttributesMultipleValue.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentImportFieldAttributesMultipleValue.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((IncidentImportFieldAttributesMultipleValue)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'IncidentImportFieldAttributesMultipleValue'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IncidentImportFieldAttributesMultipleValue'", e);
            }
            
            IncidentImportFieldAttributes ret = new IncidentImportFieldAttributes();
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
        public IncidentImportFieldAttributes getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "IncidentImportFieldAttributes cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public IncidentImportFieldAttributes() {
        super("oneOf", Boolean.FALSE);
    }
    public IncidentImportFieldAttributes(IncidentImportFieldAttributesSingleValue o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public IncidentImportFieldAttributes(IncidentImportFieldAttributesMultipleValue o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("IncidentImportFieldAttributesSingleValue", new GenericType<IncidentImportFieldAttributesSingleValue>() {
        });
        schemas.put("IncidentImportFieldAttributesMultipleValue", new GenericType<IncidentImportFieldAttributesMultipleValue>() {
        });
        JSON.registerDescendants(IncidentImportFieldAttributes.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return IncidentImportFieldAttributes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IncidentImportFieldAttributesSingleValue, IncidentImportFieldAttributesMultipleValue
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(IncidentImportFieldAttributesSingleValue.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(IncidentImportFieldAttributesMultipleValue.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be IncidentImportFieldAttributesSingleValue, IncidentImportFieldAttributesMultipleValue");
    }

    /**
     * Get the actual instance, which can be the following:
     * IncidentImportFieldAttributesSingleValue, IncidentImportFieldAttributesMultipleValue
     *
     * @return The actual instance (IncidentImportFieldAttributesSingleValue, IncidentImportFieldAttributesMultipleValue)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `IncidentImportFieldAttributesSingleValue`. If the actual instance is not `IncidentImportFieldAttributesSingleValue`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IncidentImportFieldAttributesSingleValue`
     * @throws ClassCastException if the instance is not `IncidentImportFieldAttributesSingleValue`
     */
    public IncidentImportFieldAttributesSingleValue getIncidentImportFieldAttributesSingleValue() throws ClassCastException {
        return (IncidentImportFieldAttributesSingleValue)super.getActualInstance();
    }

    /**
     * Get the actual instance of `IncidentImportFieldAttributesMultipleValue`. If the actual instance is not `IncidentImportFieldAttributesMultipleValue`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IncidentImportFieldAttributesMultipleValue`
     * @throws ClassCastException if the instance is not `IncidentImportFieldAttributesMultipleValue`
     */
    public IncidentImportFieldAttributesMultipleValue getIncidentImportFieldAttributesMultipleValue() throws ClassCastException {
        return (IncidentImportFieldAttributesMultipleValue)super.getActualInstance();
    }
}
