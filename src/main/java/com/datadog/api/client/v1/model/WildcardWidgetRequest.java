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
@JsonDeserialize(using = WildcardWidgetRequest.WildcardWidgetRequestDeserializer.class)
@JsonSerialize(using = WildcardWidgetRequest.WildcardWidgetRequestSerializer.class)
public class WildcardWidgetRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WildcardWidgetRequest.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class WildcardWidgetRequestSerializer extends StdSerializer<WildcardWidgetRequest> {
        public WildcardWidgetRequestSerializer(Class<WildcardWidgetRequest> t) {
            super(t);
        }

        public WildcardWidgetRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(WildcardWidgetRequest value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class WildcardWidgetRequestDeserializer extends StdDeserializer<WildcardWidgetRequest> {
        public WildcardWidgetRequestDeserializer() {
            this(WildcardWidgetRequest.class);
        }

        public WildcardWidgetRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public WildcardWidgetRequest deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize TreeMapWidgetRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TreeMapWidgetRequest.class.equals(Integer.class) || TreeMapWidgetRequest.class.equals(Long.class) || TreeMapWidgetRequest.class.equals(Float.class) || TreeMapWidgetRequest.class.equals(Double.class) || TreeMapWidgetRequest.class.equals(Boolean.class) || TreeMapWidgetRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TreeMapWidgetRequest.class.equals(Integer.class) || TreeMapWidgetRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TreeMapWidgetRequest.class.equals(Float.class) || TreeMapWidgetRequest.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TreeMapWidgetRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TreeMapWidgetRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TreeMapWidgetRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TreeMapWidgetRequest)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TreeMapWidgetRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TreeMapWidgetRequest'", e);
            }
            
            // deserialize TimeseriesWidgetRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeseriesWidgetRequest.class.equals(Integer.class) || TimeseriesWidgetRequest.class.equals(Long.class) || TimeseriesWidgetRequest.class.equals(Float.class) || TimeseriesWidgetRequest.class.equals(Double.class) || TimeseriesWidgetRequest.class.equals(Boolean.class) || TimeseriesWidgetRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeseriesWidgetRequest.class.equals(Integer.class) || TimeseriesWidgetRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeseriesWidgetRequest.class.equals(Float.class) || TimeseriesWidgetRequest.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TimeseriesWidgetRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeseriesWidgetRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TimeseriesWidgetRequest)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetRequest'", e);
            }
            
            // deserialize ListStreamWidgetRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ListStreamWidgetRequest.class.equals(Integer.class) || ListStreamWidgetRequest.class.equals(Long.class) || ListStreamWidgetRequest.class.equals(Float.class) || ListStreamWidgetRequest.class.equals(Double.class) || ListStreamWidgetRequest.class.equals(Boolean.class) || ListStreamWidgetRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ListStreamWidgetRequest.class.equals(Integer.class) || ListStreamWidgetRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ListStreamWidgetRequest.class.equals(Float.class) || ListStreamWidgetRequest.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ListStreamWidgetRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ListStreamWidgetRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ListStreamWidgetRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ListStreamWidgetRequest)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ListStreamWidgetRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ListStreamWidgetRequest'", e);
            }
            
            // deserialize DistributionWidgetRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DistributionWidgetRequest.class.equals(Integer.class) || DistributionWidgetRequest.class.equals(Long.class) || DistributionWidgetRequest.class.equals(Float.class) || DistributionWidgetRequest.class.equals(Double.class) || DistributionWidgetRequest.class.equals(Boolean.class) || DistributionWidgetRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DistributionWidgetRequest.class.equals(Integer.class) || DistributionWidgetRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DistributionWidgetRequest.class.equals(Float.class) || DistributionWidgetRequest.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (DistributionWidgetRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DistributionWidgetRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(DistributionWidgetRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((DistributionWidgetRequest)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'DistributionWidgetRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DistributionWidgetRequest'", e);
            }
            
            WildcardWidgetRequest ret = new WildcardWidgetRequest();
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
        public WildcardWidgetRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "WildcardWidgetRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public WildcardWidgetRequest() {
        super("oneOf", Boolean.FALSE);
    }
    public WildcardWidgetRequest(TreeMapWidgetRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WildcardWidgetRequest(TimeseriesWidgetRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WildcardWidgetRequest(ListStreamWidgetRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WildcardWidgetRequest(DistributionWidgetRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TreeMapWidgetRequest", new GenericType<TreeMapWidgetRequest>() {
        });
        schemas.put("TimeseriesWidgetRequest", new GenericType<TimeseriesWidgetRequest>() {
        });
        schemas.put("ListStreamWidgetRequest", new GenericType<ListStreamWidgetRequest>() {
        });
        schemas.put("DistributionWidgetRequest", new GenericType<DistributionWidgetRequest>() {
        });
        JSON.registerDescendants(WildcardWidgetRequest.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return WildcardWidgetRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TreeMapWidgetRequest, TimeseriesWidgetRequest, ListStreamWidgetRequest, DistributionWidgetRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(TreeMapWidgetRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(TimeseriesWidgetRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ListStreamWidgetRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(DistributionWidgetRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be TreeMapWidgetRequest, TimeseriesWidgetRequest, ListStreamWidgetRequest, DistributionWidgetRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * TreeMapWidgetRequest, TimeseriesWidgetRequest, ListStreamWidgetRequest, DistributionWidgetRequest
     *
     * @return The actual instance (TreeMapWidgetRequest, TimeseriesWidgetRequest, ListStreamWidgetRequest, DistributionWidgetRequest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TreeMapWidgetRequest`. If the actual instance is not `TreeMapWidgetRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TreeMapWidgetRequest`
     * @throws ClassCastException if the instance is not `TreeMapWidgetRequest`
     */
    public TreeMapWidgetRequest getTreeMapWidgetRequest() throws ClassCastException {
        return (TreeMapWidgetRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeseriesWidgetRequest`. If the actual instance is not `TimeseriesWidgetRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeseriesWidgetRequest`
     * @throws ClassCastException if the instance is not `TimeseriesWidgetRequest`
     */
    public TimeseriesWidgetRequest getTimeseriesWidgetRequest() throws ClassCastException {
        return (TimeseriesWidgetRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListStreamWidgetRequest`. If the actual instance is not `ListStreamWidgetRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListStreamWidgetRequest`
     * @throws ClassCastException if the instance is not `ListStreamWidgetRequest`
     */
    public ListStreamWidgetRequest getListStreamWidgetRequest() throws ClassCastException {
        return (ListStreamWidgetRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DistributionWidgetRequest`. If the actual instance is not `DistributionWidgetRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DistributionWidgetRequest`
     * @throws ClassCastException if the instance is not `DistributionWidgetRequest`
     */
    public DistributionWidgetRequest getDistributionWidgetRequest() throws ClassCastException {
        return (DistributionWidgetRequest)super.getActualInstance();
    }
}
