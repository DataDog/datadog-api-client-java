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
@JsonDeserialize(using = SharedDashboardInvitesData.SharedDashboardInvitesDataDeserializer.class)
@JsonSerialize(using = SharedDashboardInvitesData.SharedDashboardInvitesDataSerializer.class)
public class SharedDashboardInvitesData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SharedDashboardInvitesData.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class SharedDashboardInvitesDataSerializer extends StdSerializer<SharedDashboardInvitesData> {
        public SharedDashboardInvitesDataSerializer(Class<SharedDashboardInvitesData> t) {
            super(t);
        }

        public SharedDashboardInvitesDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(SharedDashboardInvitesData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SharedDashboardInvitesDataDeserializer extends StdDeserializer<SharedDashboardInvitesData> {
        public SharedDashboardInvitesDataDeserializer() {
            this(SharedDashboardInvitesData.class);
        }

        public SharedDashboardInvitesDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SharedDashboardInvitesData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize SharedDashboardInvitesDataObject
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SharedDashboardInvitesDataObject.class.equals(Integer.class) || SharedDashboardInvitesDataObject.class.equals(Long.class) || SharedDashboardInvitesDataObject.class.equals(Float.class) || SharedDashboardInvitesDataObject.class.equals(Double.class) || SharedDashboardInvitesDataObject.class.equals(Boolean.class) || SharedDashboardInvitesDataObject.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SharedDashboardInvitesDataObject.class.equals(Integer.class) || SharedDashboardInvitesDataObject.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SharedDashboardInvitesDataObject.class.equals(Float.class) || SharedDashboardInvitesDataObject.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SharedDashboardInvitesDataObject.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SharedDashboardInvitesDataObject.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SharedDashboardInvitesDataObject.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SharedDashboardInvitesDataObject)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SharedDashboardInvitesDataObject'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SharedDashboardInvitesDataObject'", e);
            }
            
            // deserialize List<SharedDashboardInvitesDataObject>
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (List.class.equals(Integer.class) || List.class.equals(Long.class) || List.class.equals(Float.class) || List.class.equals(Double.class) || List.class.equals(Boolean.class) || List.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((List.class.equals(Integer.class) || List.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((List.class.equals(Float.class) || List.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (List.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<List<SharedDashboardInvitesDataObject>>() {});
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    deserialized = tmp;
                    match++;
                    
                    log.log(Level.FINER, "Input data matches schema 'List<SharedDashboardInvitesDataObject>'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'List<SharedDashboardInvitesDataObject>'", e);
            }
            
            SharedDashboardInvitesData ret = new SharedDashboardInvitesData();
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
        public SharedDashboardInvitesData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SharedDashboardInvitesData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SharedDashboardInvitesData() {
        super("oneOf", Boolean.FALSE);
    }
    public SharedDashboardInvitesData(SharedDashboardInvitesDataObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public SharedDashboardInvitesData(List<SharedDashboardInvitesDataObject> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SharedDashboardInvitesDataObject", new GenericType<SharedDashboardInvitesDataObject>() {
        });
        schemas.put("List<SharedDashboardInvitesDataObject>", new GenericType<List<SharedDashboardInvitesDataObject>>() {
        });
        JSON.registerDescendants(SharedDashboardInvitesData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SharedDashboardInvitesData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SharedDashboardInvitesDataObject, List&lt;SharedDashboardInvitesDataObject&gt;
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(SharedDashboardInvitesDataObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be SharedDashboardInvitesDataObject, List<SharedDashboardInvitesDataObject>");
    }

    /**
     * Get the actual instance, which can be the following:
     * SharedDashboardInvitesDataObject, List&lt;SharedDashboardInvitesDataObject&gt;
     *
     * @return The actual instance (SharedDashboardInvitesDataObject, List&lt;SharedDashboardInvitesDataObject&gt;)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SharedDashboardInvitesDataObject`. If the actual instance is not `SharedDashboardInvitesDataObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SharedDashboardInvitesDataObject`
     * @throws ClassCastException if the instance is not `SharedDashboardInvitesDataObject`
     */
    public SharedDashboardInvitesDataObject getSharedDashboardInvitesDataObject() throws ClassCastException {
        return (SharedDashboardInvitesDataObject)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List&lt;SharedDashboardInvitesDataObject&gt;`. If the actual instance is not `List&lt;SharedDashboardInvitesDataObject&gt;`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List&lt;SharedDashboardInvitesDataObject&gt;`
     * @throws ClassCastException if the instance is not `List&lt;SharedDashboardInvitesDataObject&gt;`
     */
    public List<SharedDashboardInvitesDataObject> getList() throws ClassCastException {
        return (List<SharedDashboardInvitesDataObject>)super.getActualInstance();
    }
}
