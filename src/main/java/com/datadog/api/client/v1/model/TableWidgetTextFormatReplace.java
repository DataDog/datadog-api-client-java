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
@JsonDeserialize(using = TableWidgetTextFormatReplace.TableWidgetTextFormatReplaceDeserializer.class)
@JsonSerialize(using = TableWidgetTextFormatReplace.TableWidgetTextFormatReplaceSerializer.class)
public class TableWidgetTextFormatReplace extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TableWidgetTextFormatReplace.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class TableWidgetTextFormatReplaceSerializer extends StdSerializer<TableWidgetTextFormatReplace> {
        public TableWidgetTextFormatReplaceSerializer(Class<TableWidgetTextFormatReplace> t) {
            super(t);
        }

        public TableWidgetTextFormatReplaceSerializer() {
            this(null);
        }

        @Override
        public void serialize(TableWidgetTextFormatReplace value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class TableWidgetTextFormatReplaceDeserializer extends StdDeserializer<TableWidgetTextFormatReplace> {
        public TableWidgetTextFormatReplaceDeserializer() {
            this(TableWidgetTextFormatReplace.class);
        }

        public TableWidgetTextFormatReplaceDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public TableWidgetTextFormatReplace deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize TableWidgetTextFormatReplaceAll
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TableWidgetTextFormatReplaceAll.class.equals(Integer.class) || TableWidgetTextFormatReplaceAll.class.equals(Long.class) || TableWidgetTextFormatReplaceAll.class.equals(Float.class) || TableWidgetTextFormatReplaceAll.class.equals(Double.class) || TableWidgetTextFormatReplaceAll.class.equals(Boolean.class) || TableWidgetTextFormatReplaceAll.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TableWidgetTextFormatReplaceAll.class.equals(Integer.class) || TableWidgetTextFormatReplaceAll.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TableWidgetTextFormatReplaceAll.class.equals(Float.class) || TableWidgetTextFormatReplaceAll.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TableWidgetTextFormatReplaceAll.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TableWidgetTextFormatReplaceAll.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TableWidgetTextFormatReplaceAll.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TableWidgetTextFormatReplaceAll)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TableWidgetTextFormatReplaceAll'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TableWidgetTextFormatReplaceAll'", e);
            }
            
            // deserialize TableWidgetTextFormatReplaceSubstring
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TableWidgetTextFormatReplaceSubstring.class.equals(Integer.class) || TableWidgetTextFormatReplaceSubstring.class.equals(Long.class) || TableWidgetTextFormatReplaceSubstring.class.equals(Float.class) || TableWidgetTextFormatReplaceSubstring.class.equals(Double.class) || TableWidgetTextFormatReplaceSubstring.class.equals(Boolean.class) || TableWidgetTextFormatReplaceSubstring.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TableWidgetTextFormatReplaceSubstring.class.equals(Integer.class) || TableWidgetTextFormatReplaceSubstring.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TableWidgetTextFormatReplaceSubstring.class.equals(Float.class) || TableWidgetTextFormatReplaceSubstring.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TableWidgetTextFormatReplaceSubstring.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TableWidgetTextFormatReplaceSubstring.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TableWidgetTextFormatReplaceSubstring.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TableWidgetTextFormatReplaceSubstring)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TableWidgetTextFormatReplaceSubstring'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TableWidgetTextFormatReplaceSubstring'", e);
            }
            
            TableWidgetTextFormatReplace ret = new TableWidgetTextFormatReplace();
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
        public TableWidgetTextFormatReplace getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "TableWidgetTextFormatReplace cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public TableWidgetTextFormatReplace() {
        super("oneOf", Boolean.FALSE);
    }
    public TableWidgetTextFormatReplace(TableWidgetTextFormatReplaceAll o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public TableWidgetTextFormatReplace(TableWidgetTextFormatReplaceSubstring o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TableWidgetTextFormatReplaceAll", new GenericType<TableWidgetTextFormatReplaceAll>() {
        });
        schemas.put("TableWidgetTextFormatReplaceSubstring", new GenericType<TableWidgetTextFormatReplaceSubstring>() {
        });
        JSON.registerDescendants(TableWidgetTextFormatReplace.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return TableWidgetTextFormatReplace.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TableWidgetTextFormatReplaceAll, TableWidgetTextFormatReplaceSubstring
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(TableWidgetTextFormatReplaceAll.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(TableWidgetTextFormatReplaceSubstring.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be TableWidgetTextFormatReplaceAll, TableWidgetTextFormatReplaceSubstring");
    }

    /**
     * Get the actual instance, which can be the following:
     * TableWidgetTextFormatReplaceAll, TableWidgetTextFormatReplaceSubstring
     *
     * @return The actual instance (TableWidgetTextFormatReplaceAll, TableWidgetTextFormatReplaceSubstring)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TableWidgetTextFormatReplaceAll`. If the actual instance is not `TableWidgetTextFormatReplaceAll`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TableWidgetTextFormatReplaceAll`
     * @throws ClassCastException if the instance is not `TableWidgetTextFormatReplaceAll`
     */
    public TableWidgetTextFormatReplaceAll getTableWidgetTextFormatReplaceAll() throws ClassCastException {
        return (TableWidgetTextFormatReplaceAll)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TableWidgetTextFormatReplaceSubstring`. If the actual instance is not `TableWidgetTextFormatReplaceSubstring`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TableWidgetTextFormatReplaceSubstring`
     * @throws ClassCastException if the instance is not `TableWidgetTextFormatReplaceSubstring`
     */
    public TableWidgetTextFormatReplaceSubstring getTableWidgetTextFormatReplaceSubstring() throws ClassCastException {
        return (TableWidgetTextFormatReplaceSubstring)super.getActualInstance();
    }
}
