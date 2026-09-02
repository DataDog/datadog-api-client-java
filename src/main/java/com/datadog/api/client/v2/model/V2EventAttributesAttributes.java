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
@JsonDeserialize(using = V2EventAttributesAttributes.V2EventAttributesAttributesDeserializer.class)
@JsonSerialize(using = V2EventAttributesAttributes.V2EventAttributesAttributesSerializer.class)
public class V2EventAttributesAttributes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(V2EventAttributesAttributes.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class V2EventAttributesAttributesSerializer extends StdSerializer<V2EventAttributesAttributes> {
        public V2EventAttributesAttributesSerializer(Class<V2EventAttributesAttributes> t) {
            super(t);
        }

        public V2EventAttributesAttributesSerializer() {
            this(null);
        }

        @Override
        public void serialize(V2EventAttributesAttributes value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class V2EventAttributesAttributesDeserializer extends StdDeserializer<V2EventAttributesAttributes> {
        public V2EventAttributesAttributesDeserializer() {
            this(V2EventAttributesAttributes.class);
        }

        public V2EventAttributesAttributesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public V2EventAttributesAttributes deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ChangeEventAttributes
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ChangeEventAttributes.class.equals(Integer.class) || ChangeEventAttributes.class.equals(Long.class) || ChangeEventAttributes.class.equals(Float.class) || ChangeEventAttributes.class.equals(Double.class) || ChangeEventAttributes.class.equals(Boolean.class) || ChangeEventAttributes.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ChangeEventAttributes.class.equals(Integer.class) || ChangeEventAttributes.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ChangeEventAttributes.class.equals(Float.class) || ChangeEventAttributes.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ChangeEventAttributes.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ChangeEventAttributes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeEventAttributes.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ChangeEventAttributes)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ChangeEventAttributes'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ChangeEventAttributes'", e);
            }
            
            // deserialize AlertEventAttributes
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AlertEventAttributes.class.equals(Integer.class) || AlertEventAttributes.class.equals(Long.class) || AlertEventAttributes.class.equals(Float.class) || AlertEventAttributes.class.equals(Double.class) || AlertEventAttributes.class.equals(Boolean.class) || AlertEventAttributes.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AlertEventAttributes.class.equals(Integer.class) || AlertEventAttributes.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AlertEventAttributes.class.equals(Float.class) || AlertEventAttributes.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AlertEventAttributes.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AlertEventAttributes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AlertEventAttributes.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AlertEventAttributes)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AlertEventAttributes'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AlertEventAttributes'", e);
            }
            
            V2EventAttributesAttributes ret = new V2EventAttributesAttributes();
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
        public V2EventAttributesAttributes getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "V2EventAttributesAttributes cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public V2EventAttributesAttributes() {
        super("oneOf", Boolean.FALSE);
    }
    public V2EventAttributesAttributes(ChangeEventAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public V2EventAttributesAttributes(AlertEventAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ChangeEventAttributes", new GenericType<ChangeEventAttributes>() {
        });
        schemas.put("AlertEventAttributes", new GenericType<AlertEventAttributes>() {
        });
        JSON.registerDescendants(V2EventAttributesAttributes.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return V2EventAttributesAttributes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ChangeEventAttributes, AlertEventAttributes
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ChangeEventAttributes.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AlertEventAttributes.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ChangeEventAttributes, AlertEventAttributes");
    }

    /**
     * Get the actual instance, which can be the following:
     * ChangeEventAttributes, AlertEventAttributes
     *
     * @return The actual instance (ChangeEventAttributes, AlertEventAttributes)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ChangeEventAttributes`. If the actual instance is not `ChangeEventAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChangeEventAttributes`
     * @throws ClassCastException if the instance is not `ChangeEventAttributes`
     */
    public ChangeEventAttributes getChangeEventAttributes() throws ClassCastException {
        return (ChangeEventAttributes)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlertEventAttributes`. If the actual instance is not `AlertEventAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlertEventAttributes`
     * @throws ClassCastException if the instance is not `AlertEventAttributes`
     */
    public AlertEventAttributes getAlertEventAttributes() throws ClassCastException {
        return (AlertEventAttributes)super.getActualInstance();
    }
}
