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
@JsonDeserialize(using = EventPayloadAttributes.EventPayloadAttributesDeserializer.class)
@JsonSerialize(using = EventPayloadAttributes.EventPayloadAttributesSerializer.class)
public class EventPayloadAttributes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EventPayloadAttributes.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class EventPayloadAttributesSerializer extends StdSerializer<EventPayloadAttributes> {
        public EventPayloadAttributesSerializer(Class<EventPayloadAttributes> t) {
            super(t);
        }

        public EventPayloadAttributesSerializer() {
            this(null);
        }

        @Override
        public void serialize(EventPayloadAttributes value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class EventPayloadAttributesDeserializer extends StdDeserializer<EventPayloadAttributes> {
        public EventPayloadAttributesDeserializer() {
            this(EventPayloadAttributes.class);
        }

        public EventPayloadAttributesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public EventPayloadAttributes deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ChangeEventCustomAttributes
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ChangeEventCustomAttributes.class.equals(Integer.class) || ChangeEventCustomAttributes.class.equals(Long.class) || ChangeEventCustomAttributes.class.equals(Float.class) || ChangeEventCustomAttributes.class.equals(Double.class) || ChangeEventCustomAttributes.class.equals(Boolean.class) || ChangeEventCustomAttributes.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ChangeEventCustomAttributes.class.equals(Integer.class) || ChangeEventCustomAttributes.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ChangeEventCustomAttributes.class.equals(Float.class) || ChangeEventCustomAttributes.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ChangeEventCustomAttributes.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ChangeEventCustomAttributes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeEventCustomAttributes.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ChangeEventCustomAttributes)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ChangeEventCustomAttributes'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ChangeEventCustomAttributes'", e);
            }
            
            // deserialize AlertEventCustomAttributes
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AlertEventCustomAttributes.class.equals(Integer.class) || AlertEventCustomAttributes.class.equals(Long.class) || AlertEventCustomAttributes.class.equals(Float.class) || AlertEventCustomAttributes.class.equals(Double.class) || AlertEventCustomAttributes.class.equals(Boolean.class) || AlertEventCustomAttributes.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AlertEventCustomAttributes.class.equals(Integer.class) || AlertEventCustomAttributes.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AlertEventCustomAttributes.class.equals(Float.class) || AlertEventCustomAttributes.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AlertEventCustomAttributes.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AlertEventCustomAttributes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AlertEventCustomAttributes.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AlertEventCustomAttributes)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AlertEventCustomAttributes'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AlertEventCustomAttributes'", e);
            }
            
            EventPayloadAttributes ret = new EventPayloadAttributes();
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
        public EventPayloadAttributes getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "EventPayloadAttributes cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public EventPayloadAttributes() {
        super("oneOf", Boolean.FALSE);
    }
    public EventPayloadAttributes(ChangeEventCustomAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public EventPayloadAttributes(AlertEventCustomAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ChangeEventCustomAttributes", new GenericType<ChangeEventCustomAttributes>() {
        });
        schemas.put("AlertEventCustomAttributes", new GenericType<AlertEventCustomAttributes>() {
        });
        JSON.registerDescendants(EventPayloadAttributes.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return EventPayloadAttributes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ChangeEventCustomAttributes, AlertEventCustomAttributes
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ChangeEventCustomAttributes.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AlertEventCustomAttributes.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ChangeEventCustomAttributes, AlertEventCustomAttributes");
    }

    /**
     * Get the actual instance, which can be the following:
     * ChangeEventCustomAttributes, AlertEventCustomAttributes
     *
     * @return The actual instance (ChangeEventCustomAttributes, AlertEventCustomAttributes)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ChangeEventCustomAttributes`. If the actual instance is not `ChangeEventCustomAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChangeEventCustomAttributes`
     * @throws ClassCastException if the instance is not `ChangeEventCustomAttributes`
     */
    public ChangeEventCustomAttributes getChangeEventCustomAttributes() throws ClassCastException {
        return (ChangeEventCustomAttributes)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlertEventCustomAttributes`. If the actual instance is not `AlertEventCustomAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlertEventCustomAttributes`
     * @throws ClassCastException if the instance is not `AlertEventCustomAttributes`
     */
    public AlertEventCustomAttributes getAlertEventCustomAttributes() throws ClassCastException {
        return (AlertEventCustomAttributes)super.getActualInstance();
    }
}
