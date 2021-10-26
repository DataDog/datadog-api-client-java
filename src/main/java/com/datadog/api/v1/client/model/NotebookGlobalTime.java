/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.datadog.api.v1.client.JSON;
import com.datadog.api.v1.client.model.NotebookAbsoluteTime;
import com.datadog.api.v1.client.model.NotebookRelativeTime;
import com.datadog.api.v1.client.model.UnparsedObject;
import com.datadog.api.v1.client.model.WidgetLiveSpan;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = NotebookGlobalTime.NotebookGlobalTimeDeserializer.class)
@JsonSerialize(using = NotebookGlobalTime.NotebookGlobalTimeSerializer.class)
public class NotebookGlobalTime extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(NotebookGlobalTime.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class NotebookGlobalTimeSerializer extends StdSerializer<NotebookGlobalTime> {

        public NotebookGlobalTimeSerializer(Class<NotebookGlobalTime> t) {
            super(t);
        }

        public NotebookGlobalTimeSerializer() {
            this(null);
        }

        @Override
        public void serialize(NotebookGlobalTime value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class NotebookGlobalTimeDeserializer extends StdDeserializer<NotebookGlobalTime> {

        public NotebookGlobalTimeDeserializer() {
            this(NotebookGlobalTime.class);
        }

        public NotebookGlobalTimeDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public NotebookGlobalTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize NotebookRelativeTime
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    NotebookRelativeTime.class.equals(Integer.class) ||
                    NotebookRelativeTime.class.equals(Long.class) ||
                    NotebookRelativeTime.class.equals(Float.class) ||
                    NotebookRelativeTime.class.equals(Double.class) ||
                    NotebookRelativeTime.class.equals(Boolean.class) ||
                    NotebookRelativeTime.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            (
                                (NotebookRelativeTime.class.equals(Integer.class) || NotebookRelativeTime.class.equals(Long.class)) &&
                                token == JsonToken.VALUE_NUMBER_INT
                            );
                        attemptParsing |=
                            (
                                (NotebookRelativeTime.class.equals(Float.class) || NotebookRelativeTime.class.equals(Double.class)) &&
                                (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT)
                            );
                        attemptParsing |=
                            (
                                NotebookRelativeTime.class.equals(Boolean.class) &&
                                (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE)
                            );
                        attemptParsing |= (NotebookRelativeTime.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                        attemptParsing |= (token == JsonToken.VALUE_NULL);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookRelativeTime.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((NotebookRelativeTime) tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'NotebookRelativeTime'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotebookRelativeTime'", e);
            }

            // deserialize NotebookAbsoluteTime
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    NotebookAbsoluteTime.class.equals(Integer.class) ||
                    NotebookAbsoluteTime.class.equals(Long.class) ||
                    NotebookAbsoluteTime.class.equals(Float.class) ||
                    NotebookAbsoluteTime.class.equals(Double.class) ||
                    NotebookAbsoluteTime.class.equals(Boolean.class) ||
                    NotebookAbsoluteTime.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            (
                                (NotebookAbsoluteTime.class.equals(Integer.class) || NotebookAbsoluteTime.class.equals(Long.class)) &&
                                token == JsonToken.VALUE_NUMBER_INT
                            );
                        attemptParsing |=
                            (
                                (NotebookAbsoluteTime.class.equals(Float.class) || NotebookAbsoluteTime.class.equals(Double.class)) &&
                                (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT)
                            );
                        attemptParsing |=
                            (
                                NotebookAbsoluteTime.class.equals(Boolean.class) &&
                                (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE)
                            );
                        attemptParsing |= (NotebookAbsoluteTime.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookAbsoluteTime.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((NotebookAbsoluteTime) tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'NotebookAbsoluteTime'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotebookAbsoluteTime'", e);
            }

            NotebookGlobalTime ret = new NotebookGlobalTime();
            if (match == 1) {
                ret.setActualInstance(deserialized);
            } else {
                Map<String, Object> res = new ObjectMapper()
                    .readValue(tree.traverse(jp.getCodec()).readValueAsTree().toString(), HashMap.class);
                ret.setActualInstance(new UnparsedObject(res));
            }
            return ret;
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public NotebookGlobalTime getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "NotebookGlobalTime cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public NotebookGlobalTime() {
        super("oneOf", Boolean.FALSE);
    }

    public NotebookGlobalTime(NotebookAbsoluteTime o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NotebookGlobalTime(NotebookRelativeTime o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("NotebookAbsoluteTime", new GenericType<NotebookAbsoluteTime>() {});
        schemas.put("NotebookRelativeTime", new GenericType<NotebookRelativeTime>() {});
        JSON.registerDescendants(NotebookGlobalTime.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return NotebookGlobalTime.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * NotebookAbsoluteTime, NotebookRelativeTime
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(NotebookAbsoluteTime.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NotebookRelativeTime.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be NotebookAbsoluteTime, NotebookRelativeTime");
    }

    /**
     * Get the actual instance, which can be the following:
     * NotebookAbsoluteTime, NotebookRelativeTime
     *
     * @return The actual instance (NotebookAbsoluteTime, NotebookRelativeTime)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotebookAbsoluteTime`. If the actual instance is not `NotebookAbsoluteTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotebookAbsoluteTime`
     * @throws ClassCastException if the instance is not `NotebookAbsoluteTime`
     */
    public NotebookAbsoluteTime getNotebookAbsoluteTime() throws ClassCastException {
        return (NotebookAbsoluteTime) super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotebookRelativeTime`. If the actual instance is not `NotebookRelativeTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotebookRelativeTime`
     * @throws ClassCastException if the instance is not `NotebookRelativeTime`
     */
    public NotebookRelativeTime getNotebookRelativeTime() throws ClassCastException {
        return (NotebookRelativeTime) super.getActualInstance();
    }
}
