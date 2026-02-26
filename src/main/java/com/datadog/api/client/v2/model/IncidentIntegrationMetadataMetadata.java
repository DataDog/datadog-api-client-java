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
@JsonDeserialize(using = IncidentIntegrationMetadataMetadata.IncidentIntegrationMetadataMetadataDeserializer.class)
@JsonSerialize(using = IncidentIntegrationMetadataMetadata.IncidentIntegrationMetadataMetadataSerializer.class)
public class IncidentIntegrationMetadataMetadata extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(IncidentIntegrationMetadataMetadata.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class IncidentIntegrationMetadataMetadataSerializer extends StdSerializer<IncidentIntegrationMetadataMetadata> {
        public IncidentIntegrationMetadataMetadataSerializer(Class<IncidentIntegrationMetadataMetadata> t) {
            super(t);
        }

        public IncidentIntegrationMetadataMetadataSerializer() {
            this(null);
        }

        @Override
        public void serialize(IncidentIntegrationMetadataMetadata value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class IncidentIntegrationMetadataMetadataDeserializer extends StdDeserializer<IncidentIntegrationMetadataMetadata> {
        public IncidentIntegrationMetadataMetadataDeserializer() {
            this(IncidentIntegrationMetadataMetadata.class);
        }

        public IncidentIntegrationMetadataMetadataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public IncidentIntegrationMetadataMetadata deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize SlackIntegrationMetadata
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SlackIntegrationMetadata.class.equals(Integer.class) || SlackIntegrationMetadata.class.equals(Long.class) || SlackIntegrationMetadata.class.equals(Float.class) || SlackIntegrationMetadata.class.equals(Double.class) || SlackIntegrationMetadata.class.equals(Boolean.class) || SlackIntegrationMetadata.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SlackIntegrationMetadata.class.equals(Integer.class) || SlackIntegrationMetadata.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SlackIntegrationMetadata.class.equals(Float.class) || SlackIntegrationMetadata.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SlackIntegrationMetadata.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SlackIntegrationMetadata.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SlackIntegrationMetadata.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SlackIntegrationMetadata)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SlackIntegrationMetadata'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SlackIntegrationMetadata'", e);
            }
            
            // deserialize JiraIntegrationMetadata
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (JiraIntegrationMetadata.class.equals(Integer.class) || JiraIntegrationMetadata.class.equals(Long.class) || JiraIntegrationMetadata.class.equals(Float.class) || JiraIntegrationMetadata.class.equals(Double.class) || JiraIntegrationMetadata.class.equals(Boolean.class) || JiraIntegrationMetadata.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((JiraIntegrationMetadata.class.equals(Integer.class) || JiraIntegrationMetadata.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((JiraIntegrationMetadata.class.equals(Float.class) || JiraIntegrationMetadata.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (JiraIntegrationMetadata.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (JiraIntegrationMetadata.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(JiraIntegrationMetadata.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((JiraIntegrationMetadata)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'JiraIntegrationMetadata'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'JiraIntegrationMetadata'", e);
            }
            
            // deserialize MSTeamsIntegrationMetadata
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MSTeamsIntegrationMetadata.class.equals(Integer.class) || MSTeamsIntegrationMetadata.class.equals(Long.class) || MSTeamsIntegrationMetadata.class.equals(Float.class) || MSTeamsIntegrationMetadata.class.equals(Double.class) || MSTeamsIntegrationMetadata.class.equals(Boolean.class) || MSTeamsIntegrationMetadata.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MSTeamsIntegrationMetadata.class.equals(Integer.class) || MSTeamsIntegrationMetadata.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MSTeamsIntegrationMetadata.class.equals(Float.class) || MSTeamsIntegrationMetadata.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MSTeamsIntegrationMetadata.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MSTeamsIntegrationMetadata.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MSTeamsIntegrationMetadata.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MSTeamsIntegrationMetadata)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MSTeamsIntegrationMetadata'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MSTeamsIntegrationMetadata'", e);
            }
            
            IncidentIntegrationMetadataMetadata ret = new IncidentIntegrationMetadataMetadata();
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
        public IncidentIntegrationMetadataMetadata getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "IncidentIntegrationMetadataMetadata cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public IncidentIntegrationMetadataMetadata() {
        super("oneOf", Boolean.FALSE);
    }
    public IncidentIntegrationMetadataMetadata(SlackIntegrationMetadata o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public IncidentIntegrationMetadataMetadata(JiraIntegrationMetadata o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public IncidentIntegrationMetadataMetadata(MSTeamsIntegrationMetadata o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SlackIntegrationMetadata", new GenericType<SlackIntegrationMetadata>() {
        });
        schemas.put("JiraIntegrationMetadata", new GenericType<JiraIntegrationMetadata>() {
        });
        schemas.put("MSTeamsIntegrationMetadata", new GenericType<MSTeamsIntegrationMetadata>() {
        });
        JSON.registerDescendants(IncidentIntegrationMetadataMetadata.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return IncidentIntegrationMetadataMetadata.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SlackIntegrationMetadata, JiraIntegrationMetadata, MSTeamsIntegrationMetadata
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(SlackIntegrationMetadata.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(JiraIntegrationMetadata.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(MSTeamsIntegrationMetadata.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be SlackIntegrationMetadata, JiraIntegrationMetadata, MSTeamsIntegrationMetadata");
    }

    /**
     * Get the actual instance, which can be the following:
     * SlackIntegrationMetadata, JiraIntegrationMetadata, MSTeamsIntegrationMetadata
     *
     * @return The actual instance (SlackIntegrationMetadata, JiraIntegrationMetadata, MSTeamsIntegrationMetadata)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SlackIntegrationMetadata`. If the actual instance is not `SlackIntegrationMetadata`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SlackIntegrationMetadata`
     * @throws ClassCastException if the instance is not `SlackIntegrationMetadata`
     */
    public SlackIntegrationMetadata getSlackIntegrationMetadata() throws ClassCastException {
        return (SlackIntegrationMetadata)super.getActualInstance();
    }

    /**
     * Get the actual instance of `JiraIntegrationMetadata`. If the actual instance is not `JiraIntegrationMetadata`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `JiraIntegrationMetadata`
     * @throws ClassCastException if the instance is not `JiraIntegrationMetadata`
     */
    public JiraIntegrationMetadata getJiraIntegrationMetadata() throws ClassCastException {
        return (JiraIntegrationMetadata)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MSTeamsIntegrationMetadata`. If the actual instance is not `MSTeamsIntegrationMetadata`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MSTeamsIntegrationMetadata`
     * @throws ClassCastException if the instance is not `MSTeamsIntegrationMetadata`
     */
    public MSTeamsIntegrationMetadata getMSTeamsIntegrationMetadata() throws ClassCastException {
        return (MSTeamsIntegrationMetadata)super.getActualInstance();
    }
}
