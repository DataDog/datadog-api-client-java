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
@JsonDeserialize(using = EscalationPolicyIncluded.EscalationPolicyIncludedDeserializer.class)
@JsonSerialize(using = EscalationPolicyIncluded.EscalationPolicyIncludedSerializer.class)
public class EscalationPolicyIncluded extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EscalationPolicyIncluded.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class EscalationPolicyIncludedSerializer extends StdSerializer<EscalationPolicyIncluded> {
        public EscalationPolicyIncludedSerializer(Class<EscalationPolicyIncluded> t) {
            super(t);
        }

        public EscalationPolicyIncludedSerializer() {
            this(null);
        }

        @Override
        public void serialize(EscalationPolicyIncluded value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class EscalationPolicyIncludedDeserializer extends StdDeserializer<EscalationPolicyIncluded> {
        public EscalationPolicyIncludedDeserializer() {
            this(EscalationPolicyIncluded.class);
        }

        public EscalationPolicyIncludedDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public EscalationPolicyIncluded deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize EscalationPolicyStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EscalationPolicyStep.class.equals(Integer.class) || EscalationPolicyStep.class.equals(Long.class) || EscalationPolicyStep.class.equals(Float.class) || EscalationPolicyStep.class.equals(Double.class) || EscalationPolicyStep.class.equals(Boolean.class) || EscalationPolicyStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EscalationPolicyStep.class.equals(Integer.class) || EscalationPolicyStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EscalationPolicyStep.class.equals(Float.class) || EscalationPolicyStep.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (EscalationPolicyStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EscalationPolicyStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(EscalationPolicyStep.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((EscalationPolicyStep)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'EscalationPolicyStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EscalationPolicyStep'", e);
            }
            
            // deserialize EscalationPolicyUser
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EscalationPolicyUser.class.equals(Integer.class) || EscalationPolicyUser.class.equals(Long.class) || EscalationPolicyUser.class.equals(Float.class) || EscalationPolicyUser.class.equals(Double.class) || EscalationPolicyUser.class.equals(Boolean.class) || EscalationPolicyUser.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EscalationPolicyUser.class.equals(Integer.class) || EscalationPolicyUser.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EscalationPolicyUser.class.equals(Float.class) || EscalationPolicyUser.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (EscalationPolicyUser.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EscalationPolicyUser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(EscalationPolicyUser.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((EscalationPolicyUser)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'EscalationPolicyUser'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EscalationPolicyUser'", e);
            }
            
            // deserialize ScheduleData
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ScheduleData.class.equals(Integer.class) || ScheduleData.class.equals(Long.class) || ScheduleData.class.equals(Float.class) || ScheduleData.class.equals(Double.class) || ScheduleData.class.equals(Boolean.class) || ScheduleData.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ScheduleData.class.equals(Integer.class) || ScheduleData.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ScheduleData.class.equals(Float.class) || ScheduleData.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ScheduleData.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ScheduleData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ScheduleData.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ScheduleData)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ScheduleData'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ScheduleData'", e);
            }
            
            // deserialize ConfiguredSchedule
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConfiguredSchedule.class.equals(Integer.class) || ConfiguredSchedule.class.equals(Long.class) || ConfiguredSchedule.class.equals(Float.class) || ConfiguredSchedule.class.equals(Double.class) || ConfiguredSchedule.class.equals(Boolean.class) || ConfiguredSchedule.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConfiguredSchedule.class.equals(Integer.class) || ConfiguredSchedule.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConfiguredSchedule.class.equals(Float.class) || ConfiguredSchedule.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ConfiguredSchedule.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConfiguredSchedule.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ConfiguredSchedule.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ConfiguredSchedule)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ConfiguredSchedule'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConfiguredSchedule'", e);
            }
            
            // deserialize TeamReference
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TeamReference.class.equals(Integer.class) || TeamReference.class.equals(Long.class) || TeamReference.class.equals(Float.class) || TeamReference.class.equals(Double.class) || TeamReference.class.equals(Boolean.class) || TeamReference.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TeamReference.class.equals(Integer.class) || TeamReference.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TeamReference.class.equals(Float.class) || TeamReference.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TeamReference.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TeamReference.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TeamReference.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TeamReference)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TeamReference'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TeamReference'", e);
            }
            
            EscalationPolicyIncluded ret = new EscalationPolicyIncluded();
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
        public EscalationPolicyIncluded getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "EscalationPolicyIncluded cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public EscalationPolicyIncluded() {
        super("oneOf", Boolean.FALSE);
    }
    public EscalationPolicyIncluded(EscalationPolicyStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public EscalationPolicyIncluded(EscalationPolicyUser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public EscalationPolicyIncluded(ScheduleData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public EscalationPolicyIncluded(ConfiguredSchedule o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public EscalationPolicyIncluded(TeamReference o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EscalationPolicyStep", new GenericType<EscalationPolicyStep>() {
        });
        schemas.put("EscalationPolicyUser", new GenericType<EscalationPolicyUser>() {
        });
        schemas.put("ScheduleData", new GenericType<ScheduleData>() {
        });
        schemas.put("ConfiguredSchedule", new GenericType<ConfiguredSchedule>() {
        });
        schemas.put("TeamReference", new GenericType<TeamReference>() {
        });
        JSON.registerDescendants(EscalationPolicyIncluded.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return EscalationPolicyIncluded.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EscalationPolicyStep, EscalationPolicyUser, ScheduleData, ConfiguredSchedule, TeamReference
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(EscalationPolicyStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(EscalationPolicyUser.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ScheduleData.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ConfiguredSchedule.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(TeamReference.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be EscalationPolicyStep, EscalationPolicyUser, ScheduleData, ConfiguredSchedule, TeamReference");
    }

    /**
     * Get the actual instance, which can be the following:
     * EscalationPolicyStep, EscalationPolicyUser, ScheduleData, ConfiguredSchedule, TeamReference
     *
     * @return The actual instance (EscalationPolicyStep, EscalationPolicyUser, ScheduleData, ConfiguredSchedule, TeamReference)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EscalationPolicyStep`. If the actual instance is not `EscalationPolicyStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EscalationPolicyStep`
     * @throws ClassCastException if the instance is not `EscalationPolicyStep`
     */
    public EscalationPolicyStep getEscalationPolicyStep() throws ClassCastException {
        return (EscalationPolicyStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EscalationPolicyUser`. If the actual instance is not `EscalationPolicyUser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EscalationPolicyUser`
     * @throws ClassCastException if the instance is not `EscalationPolicyUser`
     */
    public EscalationPolicyUser getEscalationPolicyUser() throws ClassCastException {
        return (EscalationPolicyUser)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScheduleData`. If the actual instance is not `ScheduleData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScheduleData`
     * @throws ClassCastException if the instance is not `ScheduleData`
     */
    public ScheduleData getScheduleData() throws ClassCastException {
        return (ScheduleData)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConfiguredSchedule`. If the actual instance is not `ConfiguredSchedule`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConfiguredSchedule`
     * @throws ClassCastException if the instance is not `ConfiguredSchedule`
     */
    public ConfiguredSchedule getConfiguredSchedule() throws ClassCastException {
        return (ConfiguredSchedule)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TeamReference`. If the actual instance is not `TeamReference`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TeamReference`
     * @throws ClassCastException if the instance is not `TeamReference`
     */
    public TeamReference getTeamReference() throws ClassCastException {
        return (TeamReference)super.getActualInstance();
    }
}
