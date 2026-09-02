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
@JsonDeserialize(using = WorkflowRunAs.WorkflowRunAsDeserializer.class)
@JsonSerialize(using = WorkflowRunAs.WorkflowRunAsSerializer.class)
public class WorkflowRunAs extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WorkflowRunAs.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class WorkflowRunAsSerializer extends StdSerializer<WorkflowRunAs> {
        public WorkflowRunAsSerializer(Class<WorkflowRunAs> t) {
            super(t);
        }

        public WorkflowRunAsSerializer() {
            this(null);
        }

        @Override
        public void serialize(WorkflowRunAs value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class WorkflowRunAsDeserializer extends StdDeserializer<WorkflowRunAs> {
        public WorkflowRunAsDeserializer() {
            this(WorkflowRunAs.class);
        }

        public WorkflowRunAsDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public WorkflowRunAs deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize WorkflowRunAsOwner
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WorkflowRunAsOwner.class.equals(Integer.class) || WorkflowRunAsOwner.class.equals(Long.class) || WorkflowRunAsOwner.class.equals(Float.class) || WorkflowRunAsOwner.class.equals(Double.class) || WorkflowRunAsOwner.class.equals(Boolean.class) || WorkflowRunAsOwner.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WorkflowRunAsOwner.class.equals(Integer.class) || WorkflowRunAsOwner.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WorkflowRunAsOwner.class.equals(Float.class) || WorkflowRunAsOwner.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (WorkflowRunAsOwner.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WorkflowRunAsOwner.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(WorkflowRunAsOwner.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((WorkflowRunAsOwner)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'WorkflowRunAsOwner'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WorkflowRunAsOwner'", e);
            }
            
            // deserialize WorkflowRunAsServiceAccount
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WorkflowRunAsServiceAccount.class.equals(Integer.class) || WorkflowRunAsServiceAccount.class.equals(Long.class) || WorkflowRunAsServiceAccount.class.equals(Float.class) || WorkflowRunAsServiceAccount.class.equals(Double.class) || WorkflowRunAsServiceAccount.class.equals(Boolean.class) || WorkflowRunAsServiceAccount.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WorkflowRunAsServiceAccount.class.equals(Integer.class) || WorkflowRunAsServiceAccount.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WorkflowRunAsServiceAccount.class.equals(Float.class) || WorkflowRunAsServiceAccount.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (WorkflowRunAsServiceAccount.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WorkflowRunAsServiceAccount.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(WorkflowRunAsServiceAccount.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((WorkflowRunAsServiceAccount)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'WorkflowRunAsServiceAccount'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WorkflowRunAsServiceAccount'", e);
            }
            
            // deserialize WorkflowRunAsInitiator
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WorkflowRunAsInitiator.class.equals(Integer.class) || WorkflowRunAsInitiator.class.equals(Long.class) || WorkflowRunAsInitiator.class.equals(Float.class) || WorkflowRunAsInitiator.class.equals(Double.class) || WorkflowRunAsInitiator.class.equals(Boolean.class) || WorkflowRunAsInitiator.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WorkflowRunAsInitiator.class.equals(Integer.class) || WorkflowRunAsInitiator.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WorkflowRunAsInitiator.class.equals(Float.class) || WorkflowRunAsInitiator.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (WorkflowRunAsInitiator.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WorkflowRunAsInitiator.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(WorkflowRunAsInitiator.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((WorkflowRunAsInitiator)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'WorkflowRunAsInitiator'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WorkflowRunAsInitiator'", e);
            }
            
            WorkflowRunAs ret = new WorkflowRunAs();
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
        public WorkflowRunAs getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "WorkflowRunAs cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public WorkflowRunAs() {
        super("oneOf", Boolean.FALSE);
    }
    public WorkflowRunAs(WorkflowRunAsOwner o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WorkflowRunAs(WorkflowRunAsServiceAccount o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WorkflowRunAs(WorkflowRunAsInitiator o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("WorkflowRunAsOwner", new GenericType<WorkflowRunAsOwner>() {
        });
        schemas.put("WorkflowRunAsServiceAccount", new GenericType<WorkflowRunAsServiceAccount>() {
        });
        schemas.put("WorkflowRunAsInitiator", new GenericType<WorkflowRunAsInitiator>() {
        });
        JSON.registerDescendants(WorkflowRunAs.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return WorkflowRunAs.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * WorkflowRunAsOwner, WorkflowRunAsServiceAccount, WorkflowRunAsInitiator
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(WorkflowRunAsOwner.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(WorkflowRunAsServiceAccount.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(WorkflowRunAsInitiator.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be WorkflowRunAsOwner, WorkflowRunAsServiceAccount, WorkflowRunAsInitiator");
    }

    /**
     * Get the actual instance, which can be the following:
     * WorkflowRunAsOwner, WorkflowRunAsServiceAccount, WorkflowRunAsInitiator
     *
     * @return The actual instance (WorkflowRunAsOwner, WorkflowRunAsServiceAccount, WorkflowRunAsInitiator)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkflowRunAsOwner`. If the actual instance is not `WorkflowRunAsOwner`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkflowRunAsOwner`
     * @throws ClassCastException if the instance is not `WorkflowRunAsOwner`
     */
    public WorkflowRunAsOwner getWorkflowRunAsOwner() throws ClassCastException {
        return (WorkflowRunAsOwner)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkflowRunAsServiceAccount`. If the actual instance is not `WorkflowRunAsServiceAccount`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkflowRunAsServiceAccount`
     * @throws ClassCastException if the instance is not `WorkflowRunAsServiceAccount`
     */
    public WorkflowRunAsServiceAccount getWorkflowRunAsServiceAccount() throws ClassCastException {
        return (WorkflowRunAsServiceAccount)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkflowRunAsInitiator`. If the actual instance is not `WorkflowRunAsInitiator`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkflowRunAsInitiator`
     * @throws ClassCastException if the instance is not `WorkflowRunAsInitiator`
     */
    public WorkflowRunAsInitiator getWorkflowRunAsInitiator() throws ClassCastException {
        return (WorkflowRunAsInitiator)super.getActualInstance();
    }
}
