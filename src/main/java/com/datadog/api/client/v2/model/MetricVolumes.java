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
@JsonDeserialize(using = MetricVolumes.MetricVolumesDeserializer.class)
@JsonSerialize(using = MetricVolumes.MetricVolumesSerializer.class)
public class MetricVolumes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MetricVolumes.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class MetricVolumesSerializer extends StdSerializer<MetricVolumes> {
        public MetricVolumesSerializer(Class<MetricVolumes> t) {
            super(t);
        }

        public MetricVolumesSerializer() {
            this(null);
        }

        @Override
        public void serialize(MetricVolumes value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class MetricVolumesDeserializer extends StdDeserializer<MetricVolumes> {
        public MetricVolumesDeserializer() {
            this(MetricVolumes.class);
        }

        public MetricVolumesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public MetricVolumes deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize MetricDistinctVolume
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MetricDistinctVolume.class.equals(Integer.class) || MetricDistinctVolume.class.equals(Long.class) || MetricDistinctVolume.class.equals(Float.class) || MetricDistinctVolume.class.equals(Double.class) || MetricDistinctVolume.class.equals(Boolean.class) || MetricDistinctVolume.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MetricDistinctVolume.class.equals(Integer.class) || MetricDistinctVolume.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MetricDistinctVolume.class.equals(Float.class) || MetricDistinctVolume.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MetricDistinctVolume.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MetricDistinctVolume.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MetricDistinctVolume.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MetricDistinctVolume)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MetricDistinctVolume'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MetricDistinctVolume'", e);
            }
            
            // deserialize MetricIngestedIndexedVolume
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MetricIngestedIndexedVolume.class.equals(Integer.class) || MetricIngestedIndexedVolume.class.equals(Long.class) || MetricIngestedIndexedVolume.class.equals(Float.class) || MetricIngestedIndexedVolume.class.equals(Double.class) || MetricIngestedIndexedVolume.class.equals(Boolean.class) || MetricIngestedIndexedVolume.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MetricIngestedIndexedVolume.class.equals(Integer.class) || MetricIngestedIndexedVolume.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MetricIngestedIndexedVolume.class.equals(Float.class) || MetricIngestedIndexedVolume.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MetricIngestedIndexedVolume.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MetricIngestedIndexedVolume.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MetricIngestedIndexedVolume.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MetricIngestedIndexedVolume)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MetricIngestedIndexedVolume'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MetricIngestedIndexedVolume'", e);
            }
            
            MetricVolumes ret = new MetricVolumes();
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
        public MetricVolumes getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "MetricVolumes cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public MetricVolumes() {
        super("oneOf", Boolean.FALSE);
    }
    public MetricVolumes(MetricDistinctVolume o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetricVolumes(MetricIngestedIndexedVolume o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MetricDistinctVolume", new GenericType<MetricDistinctVolume>() {
        });
        schemas.put("MetricIngestedIndexedVolume", new GenericType<MetricIngestedIndexedVolume>() {
        });
        JSON.registerDescendants(MetricVolumes.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return MetricVolumes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MetricDistinctVolume, MetricIngestedIndexedVolume
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(MetricDistinctVolume.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(MetricIngestedIndexedVolume.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be MetricDistinctVolume, MetricIngestedIndexedVolume");
    }

    /**
     * Get the actual instance, which can be the following:
     * MetricDistinctVolume, MetricIngestedIndexedVolume
     *
     * @return The actual instance (MetricDistinctVolume, MetricIngestedIndexedVolume)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetricDistinctVolume`. If the actual instance is not `MetricDistinctVolume`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetricDistinctVolume`
     * @throws ClassCastException if the instance is not `MetricDistinctVolume`
     */
    public MetricDistinctVolume getMetricDistinctVolume() throws ClassCastException {
        return (MetricDistinctVolume)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetricIngestedIndexedVolume`. If the actual instance is not `MetricIngestedIndexedVolume`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetricIngestedIndexedVolume`
     * @throws ClassCastException if the instance is not `MetricIngestedIndexedVolume`
     */
    public MetricIngestedIndexedVolume getMetricIngestedIndexedVolume() throws ClassCastException {
        return (MetricIngestedIndexedVolume)super.getActualInstance();
    }
}
