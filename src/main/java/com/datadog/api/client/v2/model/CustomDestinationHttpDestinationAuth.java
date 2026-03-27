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
@JsonDeserialize(using = CustomDestinationHttpDestinationAuth.CustomDestinationHttpDestinationAuthDeserializer.class)
@JsonSerialize(using = CustomDestinationHttpDestinationAuth.CustomDestinationHttpDestinationAuthSerializer.class)
public class CustomDestinationHttpDestinationAuth extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CustomDestinationHttpDestinationAuth.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class CustomDestinationHttpDestinationAuthSerializer extends StdSerializer<CustomDestinationHttpDestinationAuth> {
        public CustomDestinationHttpDestinationAuthSerializer(Class<CustomDestinationHttpDestinationAuth> t) {
            super(t);
        }

        public CustomDestinationHttpDestinationAuthSerializer() {
            this(null);
        }

        @Override
        public void serialize(CustomDestinationHttpDestinationAuth value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CustomDestinationHttpDestinationAuthDeserializer extends StdDeserializer<CustomDestinationHttpDestinationAuth> {
        public CustomDestinationHttpDestinationAuthDeserializer() {
            this(CustomDestinationHttpDestinationAuth.class);
        }

        public CustomDestinationHttpDestinationAuthDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CustomDestinationHttpDestinationAuth deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CustomDestinationHttpDestinationAuthBasic
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomDestinationHttpDestinationAuthBasic.class.equals(Integer.class) || CustomDestinationHttpDestinationAuthBasic.class.equals(Long.class) || CustomDestinationHttpDestinationAuthBasic.class.equals(Float.class) || CustomDestinationHttpDestinationAuthBasic.class.equals(Double.class) || CustomDestinationHttpDestinationAuthBasic.class.equals(Boolean.class) || CustomDestinationHttpDestinationAuthBasic.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomDestinationHttpDestinationAuthBasic.class.equals(Integer.class) || CustomDestinationHttpDestinationAuthBasic.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomDestinationHttpDestinationAuthBasic.class.equals(Float.class) || CustomDestinationHttpDestinationAuthBasic.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CustomDestinationHttpDestinationAuthBasic.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomDestinationHttpDestinationAuthBasic.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CustomDestinationHttpDestinationAuthBasic.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CustomDestinationHttpDestinationAuthBasic)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CustomDestinationHttpDestinationAuthBasic'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomDestinationHttpDestinationAuthBasic'", e);
            }
            
            // deserialize CustomDestinationHttpDestinationAuthCustomHeader
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Integer.class) || CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Long.class) || CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Float.class) || CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Double.class) || CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Boolean.class) || CustomDestinationHttpDestinationAuthCustomHeader.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Integer.class) || CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Float.class) || CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CustomDestinationHttpDestinationAuthCustomHeader.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomDestinationHttpDestinationAuthCustomHeader.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CustomDestinationHttpDestinationAuthCustomHeader.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CustomDestinationHttpDestinationAuthCustomHeader)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CustomDestinationHttpDestinationAuthCustomHeader'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomDestinationHttpDestinationAuthCustomHeader'", e);
            }
            
            CustomDestinationHttpDestinationAuth ret = new CustomDestinationHttpDestinationAuth();
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
        public CustomDestinationHttpDestinationAuth getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CustomDestinationHttpDestinationAuth cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CustomDestinationHttpDestinationAuth() {
        super("oneOf", Boolean.FALSE);
    }
    public CustomDestinationHttpDestinationAuth(CustomDestinationHttpDestinationAuthBasic o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public CustomDestinationHttpDestinationAuth(CustomDestinationHttpDestinationAuthCustomHeader o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomDestinationHttpDestinationAuthBasic", new GenericType<CustomDestinationHttpDestinationAuthBasic>() {
        });
        schemas.put("CustomDestinationHttpDestinationAuthCustomHeader", new GenericType<CustomDestinationHttpDestinationAuthCustomHeader>() {
        });
        JSON.registerDescendants(CustomDestinationHttpDestinationAuth.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CustomDestinationHttpDestinationAuth.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomDestinationHttpDestinationAuthBasic, CustomDestinationHttpDestinationAuthCustomHeader
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CustomDestinationHttpDestinationAuthBasic.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CustomDestinationHttpDestinationAuthCustomHeader.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be CustomDestinationHttpDestinationAuthBasic, CustomDestinationHttpDestinationAuthCustomHeader");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomDestinationHttpDestinationAuthBasic, CustomDestinationHttpDestinationAuthCustomHeader
     *
     * @return The actual instance (CustomDestinationHttpDestinationAuthBasic, CustomDestinationHttpDestinationAuthCustomHeader)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomDestinationHttpDestinationAuthBasic`. If the actual instance is not `CustomDestinationHttpDestinationAuthBasic`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomDestinationHttpDestinationAuthBasic`
     * @throws ClassCastException if the instance is not `CustomDestinationHttpDestinationAuthBasic`
     */
    public CustomDestinationHttpDestinationAuthBasic getCustomDestinationHttpDestinationAuthBasic() throws ClassCastException {
        return (CustomDestinationHttpDestinationAuthBasic)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomDestinationHttpDestinationAuthCustomHeader`. If the actual instance is not `CustomDestinationHttpDestinationAuthCustomHeader`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomDestinationHttpDestinationAuthCustomHeader`
     * @throws ClassCastException if the instance is not `CustomDestinationHttpDestinationAuthCustomHeader`
     */
    public CustomDestinationHttpDestinationAuthCustomHeader getCustomDestinationHttpDestinationAuthCustomHeader() throws ClassCastException {
        return (CustomDestinationHttpDestinationAuthCustomHeader)super.getActualInstance();
    }
}
