/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
@JsonDeserialize(using = SunburstWidgetLegend.SunburstWidgetLegendDeserializer.class)
@JsonSerialize(using = SunburstWidgetLegend.SunburstWidgetLegendSerializer.class)
public class SunburstWidgetLegend extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SunburstWidgetLegend.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class SunburstWidgetLegendSerializer extends StdSerializer<SunburstWidgetLegend> {
        public SunburstWidgetLegendSerializer(Class<SunburstWidgetLegend> t) {
            super(t);
        }

        public SunburstWidgetLegendSerializer() {
            this(null);
        }

        @Override
        public void serialize(SunburstWidgetLegend value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SunburstWidgetLegendDeserializer extends StdDeserializer<SunburstWidgetLegend> {
        public SunburstWidgetLegendDeserializer() {
            this(SunburstWidgetLegend.class);
        }

        public SunburstWidgetLegendDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SunburstWidgetLegend deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize SunburstWidgetLegendTable
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SunburstWidgetLegendTable.class.equals(Integer.class) || SunburstWidgetLegendTable.class.equals(Long.class) || SunburstWidgetLegendTable.class.equals(Float.class) || SunburstWidgetLegendTable.class.equals(Double.class) || SunburstWidgetLegendTable.class.equals(Boolean.class) || SunburstWidgetLegendTable.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SunburstWidgetLegendTable.class.equals(Integer.class) || SunburstWidgetLegendTable.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SunburstWidgetLegendTable.class.equals(Float.class) || SunburstWidgetLegendTable.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SunburstWidgetLegendTable.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SunburstWidgetLegendTable.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstWidgetLegendTable.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SunburstWidgetLegendTable)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SunburstWidgetLegendTable'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SunburstWidgetLegendTable'", e);
            }
            
            // deserialize SunburstWidgetLegendInlineAutomatic
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SunburstWidgetLegendInlineAutomatic.class.equals(Integer.class) || SunburstWidgetLegendInlineAutomatic.class.equals(Long.class) || SunburstWidgetLegendInlineAutomatic.class.equals(Float.class) || SunburstWidgetLegendInlineAutomatic.class.equals(Double.class) || SunburstWidgetLegendInlineAutomatic.class.equals(Boolean.class) || SunburstWidgetLegendInlineAutomatic.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SunburstWidgetLegendInlineAutomatic.class.equals(Integer.class) || SunburstWidgetLegendInlineAutomatic.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SunburstWidgetLegendInlineAutomatic.class.equals(Float.class) || SunburstWidgetLegendInlineAutomatic.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SunburstWidgetLegendInlineAutomatic.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SunburstWidgetLegendInlineAutomatic.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstWidgetLegendInlineAutomatic.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SunburstWidgetLegendInlineAutomatic)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SunburstWidgetLegendInlineAutomatic'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SunburstWidgetLegendInlineAutomatic'", e);
            }
            
            SunburstWidgetLegend ret = new SunburstWidgetLegend();
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
        public SunburstWidgetLegend getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SunburstWidgetLegend cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SunburstWidgetLegend() {
        super("oneOf", Boolean.FALSE);
    }
    public SunburstWidgetLegend(SunburstWidgetLegendTable o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SunburstWidgetLegend(SunburstWidgetLegendInlineAutomatic o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SunburstWidgetLegendTable", new GenericType<SunburstWidgetLegendTable>() {
        });
        schemas.put("SunburstWidgetLegendInlineAutomatic", new GenericType<SunburstWidgetLegendInlineAutomatic>() {
        });
        JSON.registerDescendants(SunburstWidgetLegend.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SunburstWidgetLegend.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SunburstWidgetLegendTable, SunburstWidgetLegendInlineAutomatic
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(SunburstWidgetLegendTable.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SunburstWidgetLegendInlineAutomatic.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be SunburstWidgetLegendTable, SunburstWidgetLegendInlineAutomatic");
    }

    /**
     * Get the actual instance, which can be the following:
     * SunburstWidgetLegendTable, SunburstWidgetLegendInlineAutomatic
     *
     * @return The actual instance (SunburstWidgetLegendTable, SunburstWidgetLegendInlineAutomatic)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SunburstWidgetLegendTable`. If the actual instance is not `SunburstWidgetLegendTable`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SunburstWidgetLegendTable`
     * @throws ClassCastException if the instance is not `SunburstWidgetLegendTable`
     */
    public SunburstWidgetLegendTable getSunburstWidgetLegendTable() throws ClassCastException {
        return (SunburstWidgetLegendTable)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SunburstWidgetLegendInlineAutomatic`. If the actual instance is not `SunburstWidgetLegendInlineAutomatic`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SunburstWidgetLegendInlineAutomatic`
     * @throws ClassCastException if the instance is not `SunburstWidgetLegendInlineAutomatic`
     */
    public SunburstWidgetLegendInlineAutomatic getSunburstWidgetLegendInlineAutomatic() throws ClassCastException {
        return (SunburstWidgetLegendInlineAutomatic)super.getActualInstance();
    }
}
