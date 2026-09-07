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
@JsonDeserialize(using = ServiceDefinitionV2Dot1Contact.ServiceDefinitionV2Dot1ContactDeserializer.class)
@JsonSerialize(using = ServiceDefinitionV2Dot1Contact.ServiceDefinitionV2Dot1ContactSerializer.class)
public class ServiceDefinitionV2Dot1Contact extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ServiceDefinitionV2Dot1Contact.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ServiceDefinitionV2Dot1ContactSerializer extends StdSerializer<ServiceDefinitionV2Dot1Contact> {
        public ServiceDefinitionV2Dot1ContactSerializer(Class<ServiceDefinitionV2Dot1Contact> t) {
            super(t);
        }

        public ServiceDefinitionV2Dot1ContactSerializer() {
            this(null);
        }

        @Override
        public void serialize(ServiceDefinitionV2Dot1Contact value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ServiceDefinitionV2Dot1ContactDeserializer extends StdDeserializer<ServiceDefinitionV2Dot1Contact> {
        public ServiceDefinitionV2Dot1ContactDeserializer() {
            this(ServiceDefinitionV2Dot1Contact.class);
        }

        public ServiceDefinitionV2Dot1ContactDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ServiceDefinitionV2Dot1Contact deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ServiceDefinitionV2Dot1Email
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ServiceDefinitionV2Dot1Email.class.equals(Integer.class) || ServiceDefinitionV2Dot1Email.class.equals(Long.class) || ServiceDefinitionV2Dot1Email.class.equals(Float.class) || ServiceDefinitionV2Dot1Email.class.equals(Double.class) || ServiceDefinitionV2Dot1Email.class.equals(Boolean.class) || ServiceDefinitionV2Dot1Email.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ServiceDefinitionV2Dot1Email.class.equals(Integer.class) || ServiceDefinitionV2Dot1Email.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ServiceDefinitionV2Dot1Email.class.equals(Float.class) || ServiceDefinitionV2Dot1Email.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ServiceDefinitionV2Dot1Email.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ServiceDefinitionV2Dot1Email.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2Dot1Email.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ServiceDefinitionV2Dot1Email)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2Dot1Email'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2Dot1Email'", e);
            }
            
            // deserialize ServiceDefinitionV2Dot1Slack
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ServiceDefinitionV2Dot1Slack.class.equals(Integer.class) || ServiceDefinitionV2Dot1Slack.class.equals(Long.class) || ServiceDefinitionV2Dot1Slack.class.equals(Float.class) || ServiceDefinitionV2Dot1Slack.class.equals(Double.class) || ServiceDefinitionV2Dot1Slack.class.equals(Boolean.class) || ServiceDefinitionV2Dot1Slack.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ServiceDefinitionV2Dot1Slack.class.equals(Integer.class) || ServiceDefinitionV2Dot1Slack.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ServiceDefinitionV2Dot1Slack.class.equals(Float.class) || ServiceDefinitionV2Dot1Slack.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ServiceDefinitionV2Dot1Slack.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ServiceDefinitionV2Dot1Slack.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2Dot1Slack.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ServiceDefinitionV2Dot1Slack)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2Dot1Slack'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2Dot1Slack'", e);
            }
            
            // deserialize ServiceDefinitionV2Dot1MSTeams
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ServiceDefinitionV2Dot1MSTeams.class.equals(Integer.class) || ServiceDefinitionV2Dot1MSTeams.class.equals(Long.class) || ServiceDefinitionV2Dot1MSTeams.class.equals(Float.class) || ServiceDefinitionV2Dot1MSTeams.class.equals(Double.class) || ServiceDefinitionV2Dot1MSTeams.class.equals(Boolean.class) || ServiceDefinitionV2Dot1MSTeams.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ServiceDefinitionV2Dot1MSTeams.class.equals(Integer.class) || ServiceDefinitionV2Dot1MSTeams.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ServiceDefinitionV2Dot1MSTeams.class.equals(Float.class) || ServiceDefinitionV2Dot1MSTeams.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ServiceDefinitionV2Dot1MSTeams.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ServiceDefinitionV2Dot1MSTeams.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2Dot1MSTeams.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ServiceDefinitionV2Dot1MSTeams)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2Dot1MSTeams'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2Dot1MSTeams'", e);
            }
            
            ServiceDefinitionV2Dot1Contact ret = new ServiceDefinitionV2Dot1Contact();
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
        public ServiceDefinitionV2Dot1Contact getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ServiceDefinitionV2Dot1Contact cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ServiceDefinitionV2Dot1Contact() {
        super("oneOf", Boolean.FALSE);
    }
    public ServiceDefinitionV2Dot1Contact(ServiceDefinitionV2Dot1Email o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ServiceDefinitionV2Dot1Contact(ServiceDefinitionV2Dot1Slack o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ServiceDefinitionV2Dot1Contact(ServiceDefinitionV2Dot1MSTeams o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ServiceDefinitionV2Dot1Email", new GenericType<ServiceDefinitionV2Dot1Email>() {
        });
        schemas.put("ServiceDefinitionV2Dot1Slack", new GenericType<ServiceDefinitionV2Dot1Slack>() {
        });
        schemas.put("ServiceDefinitionV2Dot1MSTeams", new GenericType<ServiceDefinitionV2Dot1MSTeams>() {
        });
        JSON.registerDescendants(ServiceDefinitionV2Dot1Contact.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ServiceDefinitionV2Dot1Contact.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ServiceDefinitionV2Dot1Email, ServiceDefinitionV2Dot1Slack, ServiceDefinitionV2Dot1MSTeams
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ServiceDefinitionV2Dot1Email.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ServiceDefinitionV2Dot1Slack.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ServiceDefinitionV2Dot1MSTeams.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be ServiceDefinitionV2Dot1Email, ServiceDefinitionV2Dot1Slack, ServiceDefinitionV2Dot1MSTeams");
    }

    /**
     * Get the actual instance, which can be the following:
     * ServiceDefinitionV2Dot1Email, ServiceDefinitionV2Dot1Slack, ServiceDefinitionV2Dot1MSTeams
     *
     * @return The actual instance (ServiceDefinitionV2Dot1Email, ServiceDefinitionV2Dot1Slack, ServiceDefinitionV2Dot1MSTeams)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceDefinitionV2Dot1Email`. If the actual instance is not `ServiceDefinitionV2Dot1Email`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceDefinitionV2Dot1Email`
     * @throws ClassCastException if the instance is not `ServiceDefinitionV2Dot1Email`
     */
    public ServiceDefinitionV2Dot1Email getServiceDefinitionV2Dot1Email() throws ClassCastException {
        return (ServiceDefinitionV2Dot1Email)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceDefinitionV2Dot1Slack`. If the actual instance is not `ServiceDefinitionV2Dot1Slack`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceDefinitionV2Dot1Slack`
     * @throws ClassCastException if the instance is not `ServiceDefinitionV2Dot1Slack`
     */
    public ServiceDefinitionV2Dot1Slack getServiceDefinitionV2Dot1Slack() throws ClassCastException {
        return (ServiceDefinitionV2Dot1Slack)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceDefinitionV2Dot1MSTeams`. If the actual instance is not `ServiceDefinitionV2Dot1MSTeams`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceDefinitionV2Dot1MSTeams`
     * @throws ClassCastException if the instance is not `ServiceDefinitionV2Dot1MSTeams`
     */
    public ServiceDefinitionV2Dot1MSTeams getServiceDefinitionV2Dot1MSTeams() throws ClassCastException {
        return (ServiceDefinitionV2Dot1MSTeams)super.getActualInstance();
    }
}
