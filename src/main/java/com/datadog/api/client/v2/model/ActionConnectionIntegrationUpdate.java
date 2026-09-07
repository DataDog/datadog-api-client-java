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
@JsonDeserialize(using = ActionConnectionIntegrationUpdate.ActionConnectionIntegrationUpdateDeserializer.class)
@JsonSerialize(using = ActionConnectionIntegrationUpdate.ActionConnectionIntegrationUpdateSerializer.class)
public class ActionConnectionIntegrationUpdate extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ActionConnectionIntegrationUpdate.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ActionConnectionIntegrationUpdateSerializer extends StdSerializer<ActionConnectionIntegrationUpdate> {
        public ActionConnectionIntegrationUpdateSerializer(Class<ActionConnectionIntegrationUpdate> t) {
            super(t);
        }

        public ActionConnectionIntegrationUpdateSerializer() {
            this(null);
        }

        @Override
        public void serialize(ActionConnectionIntegrationUpdate value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ActionConnectionIntegrationUpdateDeserializer extends StdDeserializer<ActionConnectionIntegrationUpdate> {
        public ActionConnectionIntegrationUpdateDeserializer() {
            this(ActionConnectionIntegrationUpdate.class);
        }

        public ActionConnectionIntegrationUpdateDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ActionConnectionIntegrationUpdate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AWSIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AWSIntegrationUpdate.class.equals(Integer.class) || AWSIntegrationUpdate.class.equals(Long.class) || AWSIntegrationUpdate.class.equals(Float.class) || AWSIntegrationUpdate.class.equals(Double.class) || AWSIntegrationUpdate.class.equals(Boolean.class) || AWSIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AWSIntegrationUpdate.class.equals(Integer.class) || AWSIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AWSIntegrationUpdate.class.equals(Float.class) || AWSIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AWSIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AWSIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AWSIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AWSIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AWSIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AWSIntegrationUpdate'", e);
            }
            
            // deserialize AnthropicIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AnthropicIntegrationUpdate.class.equals(Integer.class) || AnthropicIntegrationUpdate.class.equals(Long.class) || AnthropicIntegrationUpdate.class.equals(Float.class) || AnthropicIntegrationUpdate.class.equals(Double.class) || AnthropicIntegrationUpdate.class.equals(Boolean.class) || AnthropicIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AnthropicIntegrationUpdate.class.equals(Integer.class) || AnthropicIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AnthropicIntegrationUpdate.class.equals(Float.class) || AnthropicIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AnthropicIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AnthropicIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AnthropicIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AnthropicIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AnthropicIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AnthropicIntegrationUpdate'", e);
            }
            
            // deserialize AsanaIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AsanaIntegrationUpdate.class.equals(Integer.class) || AsanaIntegrationUpdate.class.equals(Long.class) || AsanaIntegrationUpdate.class.equals(Float.class) || AsanaIntegrationUpdate.class.equals(Double.class) || AsanaIntegrationUpdate.class.equals(Boolean.class) || AsanaIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AsanaIntegrationUpdate.class.equals(Integer.class) || AsanaIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AsanaIntegrationUpdate.class.equals(Float.class) || AsanaIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AsanaIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AsanaIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AsanaIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AsanaIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AsanaIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AsanaIntegrationUpdate'", e);
            }
            
            // deserialize AzureIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AzureIntegrationUpdate.class.equals(Integer.class) || AzureIntegrationUpdate.class.equals(Long.class) || AzureIntegrationUpdate.class.equals(Float.class) || AzureIntegrationUpdate.class.equals(Double.class) || AzureIntegrationUpdate.class.equals(Boolean.class) || AzureIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AzureIntegrationUpdate.class.equals(Integer.class) || AzureIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AzureIntegrationUpdate.class.equals(Float.class) || AzureIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AzureIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AzureIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AzureIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AzureIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AzureIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AzureIntegrationUpdate'", e);
            }
            
            // deserialize CircleCIIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CircleCIIntegrationUpdate.class.equals(Integer.class) || CircleCIIntegrationUpdate.class.equals(Long.class) || CircleCIIntegrationUpdate.class.equals(Float.class) || CircleCIIntegrationUpdate.class.equals(Double.class) || CircleCIIntegrationUpdate.class.equals(Boolean.class) || CircleCIIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CircleCIIntegrationUpdate.class.equals(Integer.class) || CircleCIIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CircleCIIntegrationUpdate.class.equals(Float.class) || CircleCIIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CircleCIIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CircleCIIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CircleCIIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CircleCIIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CircleCIIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CircleCIIntegrationUpdate'", e);
            }
            
            // deserialize ClickupIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ClickupIntegrationUpdate.class.equals(Integer.class) || ClickupIntegrationUpdate.class.equals(Long.class) || ClickupIntegrationUpdate.class.equals(Float.class) || ClickupIntegrationUpdate.class.equals(Double.class) || ClickupIntegrationUpdate.class.equals(Boolean.class) || ClickupIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ClickupIntegrationUpdate.class.equals(Integer.class) || ClickupIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ClickupIntegrationUpdate.class.equals(Float.class) || ClickupIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ClickupIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ClickupIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ClickupIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ClickupIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ClickupIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ClickupIntegrationUpdate'", e);
            }
            
            // deserialize CloudflareIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CloudflareIntegrationUpdate.class.equals(Integer.class) || CloudflareIntegrationUpdate.class.equals(Long.class) || CloudflareIntegrationUpdate.class.equals(Float.class) || CloudflareIntegrationUpdate.class.equals(Double.class) || CloudflareIntegrationUpdate.class.equals(Boolean.class) || CloudflareIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CloudflareIntegrationUpdate.class.equals(Integer.class) || CloudflareIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CloudflareIntegrationUpdate.class.equals(Float.class) || CloudflareIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CloudflareIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CloudflareIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CloudflareIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CloudflareIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CloudflareIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CloudflareIntegrationUpdate'", e);
            }
            
            // deserialize ConfigCatIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConfigCatIntegrationUpdate.class.equals(Integer.class) || ConfigCatIntegrationUpdate.class.equals(Long.class) || ConfigCatIntegrationUpdate.class.equals(Float.class) || ConfigCatIntegrationUpdate.class.equals(Double.class) || ConfigCatIntegrationUpdate.class.equals(Boolean.class) || ConfigCatIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConfigCatIntegrationUpdate.class.equals(Integer.class) || ConfigCatIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConfigCatIntegrationUpdate.class.equals(Float.class) || ConfigCatIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ConfigCatIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConfigCatIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ConfigCatIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ConfigCatIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ConfigCatIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConfigCatIntegrationUpdate'", e);
            }
            
            // deserialize DatadogIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DatadogIntegrationUpdate.class.equals(Integer.class) || DatadogIntegrationUpdate.class.equals(Long.class) || DatadogIntegrationUpdate.class.equals(Float.class) || DatadogIntegrationUpdate.class.equals(Double.class) || DatadogIntegrationUpdate.class.equals(Boolean.class) || DatadogIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DatadogIntegrationUpdate.class.equals(Integer.class) || DatadogIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DatadogIntegrationUpdate.class.equals(Float.class) || DatadogIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (DatadogIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DatadogIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(DatadogIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((DatadogIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'DatadogIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DatadogIntegrationUpdate'", e);
            }
            
            // deserialize FastlyIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FastlyIntegrationUpdate.class.equals(Integer.class) || FastlyIntegrationUpdate.class.equals(Long.class) || FastlyIntegrationUpdate.class.equals(Float.class) || FastlyIntegrationUpdate.class.equals(Double.class) || FastlyIntegrationUpdate.class.equals(Boolean.class) || FastlyIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FastlyIntegrationUpdate.class.equals(Integer.class) || FastlyIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FastlyIntegrationUpdate.class.equals(Float.class) || FastlyIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FastlyIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FastlyIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FastlyIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FastlyIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FastlyIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FastlyIntegrationUpdate'", e);
            }
            
            // deserialize FreshserviceIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FreshserviceIntegrationUpdate.class.equals(Integer.class) || FreshserviceIntegrationUpdate.class.equals(Long.class) || FreshserviceIntegrationUpdate.class.equals(Float.class) || FreshserviceIntegrationUpdate.class.equals(Double.class) || FreshserviceIntegrationUpdate.class.equals(Boolean.class) || FreshserviceIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FreshserviceIntegrationUpdate.class.equals(Integer.class) || FreshserviceIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FreshserviceIntegrationUpdate.class.equals(Float.class) || FreshserviceIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FreshserviceIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FreshserviceIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FreshserviceIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FreshserviceIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FreshserviceIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FreshserviceIntegrationUpdate'", e);
            }
            
            // deserialize GCPIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GCPIntegrationUpdate.class.equals(Integer.class) || GCPIntegrationUpdate.class.equals(Long.class) || GCPIntegrationUpdate.class.equals(Float.class) || GCPIntegrationUpdate.class.equals(Double.class) || GCPIntegrationUpdate.class.equals(Boolean.class) || GCPIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GCPIntegrationUpdate.class.equals(Integer.class) || GCPIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GCPIntegrationUpdate.class.equals(Float.class) || GCPIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GCPIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GCPIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GCPIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GCPIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GCPIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GCPIntegrationUpdate'", e);
            }
            
            // deserialize GeminiIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GeminiIntegrationUpdate.class.equals(Integer.class) || GeminiIntegrationUpdate.class.equals(Long.class) || GeminiIntegrationUpdate.class.equals(Float.class) || GeminiIntegrationUpdate.class.equals(Double.class) || GeminiIntegrationUpdate.class.equals(Boolean.class) || GeminiIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GeminiIntegrationUpdate.class.equals(Integer.class) || GeminiIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GeminiIntegrationUpdate.class.equals(Float.class) || GeminiIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GeminiIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GeminiIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GeminiIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GeminiIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GeminiIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GeminiIntegrationUpdate'", e);
            }
            
            // deserialize GitlabIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GitlabIntegrationUpdate.class.equals(Integer.class) || GitlabIntegrationUpdate.class.equals(Long.class) || GitlabIntegrationUpdate.class.equals(Float.class) || GitlabIntegrationUpdate.class.equals(Double.class) || GitlabIntegrationUpdate.class.equals(Boolean.class) || GitlabIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GitlabIntegrationUpdate.class.equals(Integer.class) || GitlabIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GitlabIntegrationUpdate.class.equals(Float.class) || GitlabIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GitlabIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GitlabIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GitlabIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GitlabIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GitlabIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GitlabIntegrationUpdate'", e);
            }
            
            // deserialize GreyNoiseIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GreyNoiseIntegrationUpdate.class.equals(Integer.class) || GreyNoiseIntegrationUpdate.class.equals(Long.class) || GreyNoiseIntegrationUpdate.class.equals(Float.class) || GreyNoiseIntegrationUpdate.class.equals(Double.class) || GreyNoiseIntegrationUpdate.class.equals(Boolean.class) || GreyNoiseIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GreyNoiseIntegrationUpdate.class.equals(Integer.class) || GreyNoiseIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GreyNoiseIntegrationUpdate.class.equals(Float.class) || GreyNoiseIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GreyNoiseIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GreyNoiseIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GreyNoiseIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GreyNoiseIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GreyNoiseIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GreyNoiseIntegrationUpdate'", e);
            }
            
            // deserialize HTTPIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (HTTPIntegrationUpdate.class.equals(Integer.class) || HTTPIntegrationUpdate.class.equals(Long.class) || HTTPIntegrationUpdate.class.equals(Float.class) || HTTPIntegrationUpdate.class.equals(Double.class) || HTTPIntegrationUpdate.class.equals(Boolean.class) || HTTPIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((HTTPIntegrationUpdate.class.equals(Integer.class) || HTTPIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((HTTPIntegrationUpdate.class.equals(Float.class) || HTTPIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (HTTPIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (HTTPIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(HTTPIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((HTTPIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'HTTPIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'HTTPIntegrationUpdate'", e);
            }
            
            // deserialize LaunchDarklyIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LaunchDarklyIntegrationUpdate.class.equals(Integer.class) || LaunchDarklyIntegrationUpdate.class.equals(Long.class) || LaunchDarklyIntegrationUpdate.class.equals(Float.class) || LaunchDarklyIntegrationUpdate.class.equals(Double.class) || LaunchDarklyIntegrationUpdate.class.equals(Boolean.class) || LaunchDarklyIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LaunchDarklyIntegrationUpdate.class.equals(Integer.class) || LaunchDarklyIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LaunchDarklyIntegrationUpdate.class.equals(Float.class) || LaunchDarklyIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LaunchDarklyIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LaunchDarklyIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LaunchDarklyIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LaunchDarklyIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LaunchDarklyIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LaunchDarklyIntegrationUpdate'", e);
            }
            
            // deserialize NotionIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotionIntegrationUpdate.class.equals(Integer.class) || NotionIntegrationUpdate.class.equals(Long.class) || NotionIntegrationUpdate.class.equals(Float.class) || NotionIntegrationUpdate.class.equals(Double.class) || NotionIntegrationUpdate.class.equals(Boolean.class) || NotionIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotionIntegrationUpdate.class.equals(Integer.class) || NotionIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotionIntegrationUpdate.class.equals(Float.class) || NotionIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (NotionIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotionIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(NotionIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((NotionIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'NotionIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotionIntegrationUpdate'", e);
            }
            
            // deserialize OktaIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (OktaIntegrationUpdate.class.equals(Integer.class) || OktaIntegrationUpdate.class.equals(Long.class) || OktaIntegrationUpdate.class.equals(Float.class) || OktaIntegrationUpdate.class.equals(Double.class) || OktaIntegrationUpdate.class.equals(Boolean.class) || OktaIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((OktaIntegrationUpdate.class.equals(Integer.class) || OktaIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((OktaIntegrationUpdate.class.equals(Float.class) || OktaIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (OktaIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (OktaIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(OktaIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((OktaIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'OktaIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'OktaIntegrationUpdate'", e);
            }
            
            // deserialize OpenAIIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (OpenAIIntegrationUpdate.class.equals(Integer.class) || OpenAIIntegrationUpdate.class.equals(Long.class) || OpenAIIntegrationUpdate.class.equals(Float.class) || OpenAIIntegrationUpdate.class.equals(Double.class) || OpenAIIntegrationUpdate.class.equals(Boolean.class) || OpenAIIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((OpenAIIntegrationUpdate.class.equals(Integer.class) || OpenAIIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((OpenAIIntegrationUpdate.class.equals(Float.class) || OpenAIIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (OpenAIIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (OpenAIIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(OpenAIIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((OpenAIIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'OpenAIIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'OpenAIIntegrationUpdate'", e);
            }
            
            // deserialize ServiceNowIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ServiceNowIntegrationUpdate.class.equals(Integer.class) || ServiceNowIntegrationUpdate.class.equals(Long.class) || ServiceNowIntegrationUpdate.class.equals(Float.class) || ServiceNowIntegrationUpdate.class.equals(Double.class) || ServiceNowIntegrationUpdate.class.equals(Boolean.class) || ServiceNowIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ServiceNowIntegrationUpdate.class.equals(Integer.class) || ServiceNowIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ServiceNowIntegrationUpdate.class.equals(Float.class) || ServiceNowIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ServiceNowIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ServiceNowIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceNowIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ServiceNowIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ServiceNowIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ServiceNowIntegrationUpdate'", e);
            }
            
            // deserialize SplitIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SplitIntegrationUpdate.class.equals(Integer.class) || SplitIntegrationUpdate.class.equals(Long.class) || SplitIntegrationUpdate.class.equals(Float.class) || SplitIntegrationUpdate.class.equals(Double.class) || SplitIntegrationUpdate.class.equals(Boolean.class) || SplitIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SplitIntegrationUpdate.class.equals(Integer.class) || SplitIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SplitIntegrationUpdate.class.equals(Float.class) || SplitIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SplitIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SplitIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SplitIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SplitIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SplitIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SplitIntegrationUpdate'", e);
            }
            
            // deserialize StatsigIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (StatsigIntegrationUpdate.class.equals(Integer.class) || StatsigIntegrationUpdate.class.equals(Long.class) || StatsigIntegrationUpdate.class.equals(Float.class) || StatsigIntegrationUpdate.class.equals(Double.class) || StatsigIntegrationUpdate.class.equals(Boolean.class) || StatsigIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((StatsigIntegrationUpdate.class.equals(Integer.class) || StatsigIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((StatsigIntegrationUpdate.class.equals(Float.class) || StatsigIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (StatsigIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (StatsigIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(StatsigIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((StatsigIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'StatsigIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'StatsigIntegrationUpdate'", e);
            }
            
            // deserialize VirusTotalIntegrationUpdate
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (VirusTotalIntegrationUpdate.class.equals(Integer.class) || VirusTotalIntegrationUpdate.class.equals(Long.class) || VirusTotalIntegrationUpdate.class.equals(Float.class) || VirusTotalIntegrationUpdate.class.equals(Double.class) || VirusTotalIntegrationUpdate.class.equals(Boolean.class) || VirusTotalIntegrationUpdate.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((VirusTotalIntegrationUpdate.class.equals(Integer.class) || VirusTotalIntegrationUpdate.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((VirusTotalIntegrationUpdate.class.equals(Float.class) || VirusTotalIntegrationUpdate.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (VirusTotalIntegrationUpdate.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (VirusTotalIntegrationUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(VirusTotalIntegrationUpdate.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((VirusTotalIntegrationUpdate)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'VirusTotalIntegrationUpdate'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'VirusTotalIntegrationUpdate'", e);
            }
            
            ActionConnectionIntegrationUpdate ret = new ActionConnectionIntegrationUpdate();
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
        public ActionConnectionIntegrationUpdate getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ActionConnectionIntegrationUpdate cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ActionConnectionIntegrationUpdate() {
        super("oneOf", Boolean.FALSE);
    }
    public ActionConnectionIntegrationUpdate(AWSIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(AnthropicIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(AsanaIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(AzureIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(CircleCIIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(ClickupIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(CloudflareIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(ConfigCatIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(DatadogIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(FastlyIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(FreshserviceIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(GCPIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(GeminiIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(GitlabIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(GreyNoiseIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(HTTPIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(LaunchDarklyIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(NotionIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(OktaIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(OpenAIIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(ServiceNowIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(SplitIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(StatsigIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegrationUpdate(VirusTotalIntegrationUpdate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AWSIntegrationUpdate", new GenericType<AWSIntegrationUpdate>() {
        });
        schemas.put("AnthropicIntegrationUpdate", new GenericType<AnthropicIntegrationUpdate>() {
        });
        schemas.put("AsanaIntegrationUpdate", new GenericType<AsanaIntegrationUpdate>() {
        });
        schemas.put("AzureIntegrationUpdate", new GenericType<AzureIntegrationUpdate>() {
        });
        schemas.put("CircleCIIntegrationUpdate", new GenericType<CircleCIIntegrationUpdate>() {
        });
        schemas.put("ClickupIntegrationUpdate", new GenericType<ClickupIntegrationUpdate>() {
        });
        schemas.put("CloudflareIntegrationUpdate", new GenericType<CloudflareIntegrationUpdate>() {
        });
        schemas.put("ConfigCatIntegrationUpdate", new GenericType<ConfigCatIntegrationUpdate>() {
        });
        schemas.put("DatadogIntegrationUpdate", new GenericType<DatadogIntegrationUpdate>() {
        });
        schemas.put("FastlyIntegrationUpdate", new GenericType<FastlyIntegrationUpdate>() {
        });
        schemas.put("FreshserviceIntegrationUpdate", new GenericType<FreshserviceIntegrationUpdate>() {
        });
        schemas.put("GCPIntegrationUpdate", new GenericType<GCPIntegrationUpdate>() {
        });
        schemas.put("GeminiIntegrationUpdate", new GenericType<GeminiIntegrationUpdate>() {
        });
        schemas.put("GitlabIntegrationUpdate", new GenericType<GitlabIntegrationUpdate>() {
        });
        schemas.put("GreyNoiseIntegrationUpdate", new GenericType<GreyNoiseIntegrationUpdate>() {
        });
        schemas.put("HTTPIntegrationUpdate", new GenericType<HTTPIntegrationUpdate>() {
        });
        schemas.put("LaunchDarklyIntegrationUpdate", new GenericType<LaunchDarklyIntegrationUpdate>() {
        });
        schemas.put("NotionIntegrationUpdate", new GenericType<NotionIntegrationUpdate>() {
        });
        schemas.put("OktaIntegrationUpdate", new GenericType<OktaIntegrationUpdate>() {
        });
        schemas.put("OpenAIIntegrationUpdate", new GenericType<OpenAIIntegrationUpdate>() {
        });
        schemas.put("ServiceNowIntegrationUpdate", new GenericType<ServiceNowIntegrationUpdate>() {
        });
        schemas.put("SplitIntegrationUpdate", new GenericType<SplitIntegrationUpdate>() {
        });
        schemas.put("StatsigIntegrationUpdate", new GenericType<StatsigIntegrationUpdate>() {
        });
        schemas.put("VirusTotalIntegrationUpdate", new GenericType<VirusTotalIntegrationUpdate>() {
        });
        JSON.registerDescendants(ActionConnectionIntegrationUpdate.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ActionConnectionIntegrationUpdate.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AWSIntegrationUpdate, AnthropicIntegrationUpdate, AsanaIntegrationUpdate, AzureIntegrationUpdate, CircleCIIntegrationUpdate, ClickupIntegrationUpdate, CloudflareIntegrationUpdate, ConfigCatIntegrationUpdate, DatadogIntegrationUpdate, FastlyIntegrationUpdate, FreshserviceIntegrationUpdate, GCPIntegrationUpdate, GeminiIntegrationUpdate, GitlabIntegrationUpdate, GreyNoiseIntegrationUpdate, HTTPIntegrationUpdate, LaunchDarklyIntegrationUpdate, NotionIntegrationUpdate, OktaIntegrationUpdate, OpenAIIntegrationUpdate, ServiceNowIntegrationUpdate, SplitIntegrationUpdate, StatsigIntegrationUpdate, VirusTotalIntegrationUpdate
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AWSIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AnthropicIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AsanaIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AzureIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CircleCIIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ClickupIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CloudflareIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ConfigCatIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(DatadogIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FastlyIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FreshserviceIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GCPIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GeminiIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GitlabIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GreyNoiseIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(HTTPIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LaunchDarklyIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(NotionIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(OktaIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(OpenAIIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ServiceNowIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SplitIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(StatsigIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(VirusTotalIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be AWSIntegrationUpdate, AnthropicIntegrationUpdate, AsanaIntegrationUpdate, AzureIntegrationUpdate, CircleCIIntegrationUpdate, ClickupIntegrationUpdate, CloudflareIntegrationUpdate, ConfigCatIntegrationUpdate, DatadogIntegrationUpdate, FastlyIntegrationUpdate, FreshserviceIntegrationUpdate, GCPIntegrationUpdate, GeminiIntegrationUpdate, GitlabIntegrationUpdate, GreyNoiseIntegrationUpdate, HTTPIntegrationUpdate, LaunchDarklyIntegrationUpdate, NotionIntegrationUpdate, OktaIntegrationUpdate, OpenAIIntegrationUpdate, ServiceNowIntegrationUpdate, SplitIntegrationUpdate, StatsigIntegrationUpdate, VirusTotalIntegrationUpdate");
    }

    /**
     * Get the actual instance, which can be the following:
     * AWSIntegrationUpdate, AnthropicIntegrationUpdate, AsanaIntegrationUpdate, AzureIntegrationUpdate, CircleCIIntegrationUpdate, ClickupIntegrationUpdate, CloudflareIntegrationUpdate, ConfigCatIntegrationUpdate, DatadogIntegrationUpdate, FastlyIntegrationUpdate, FreshserviceIntegrationUpdate, GCPIntegrationUpdate, GeminiIntegrationUpdate, GitlabIntegrationUpdate, GreyNoiseIntegrationUpdate, HTTPIntegrationUpdate, LaunchDarklyIntegrationUpdate, NotionIntegrationUpdate, OktaIntegrationUpdate, OpenAIIntegrationUpdate, ServiceNowIntegrationUpdate, SplitIntegrationUpdate, StatsigIntegrationUpdate, VirusTotalIntegrationUpdate
     *
     * @return The actual instance (AWSIntegrationUpdate, AnthropicIntegrationUpdate, AsanaIntegrationUpdate, AzureIntegrationUpdate, CircleCIIntegrationUpdate, ClickupIntegrationUpdate, CloudflareIntegrationUpdate, ConfigCatIntegrationUpdate, DatadogIntegrationUpdate, FastlyIntegrationUpdate, FreshserviceIntegrationUpdate, GCPIntegrationUpdate, GeminiIntegrationUpdate, GitlabIntegrationUpdate, GreyNoiseIntegrationUpdate, HTTPIntegrationUpdate, LaunchDarklyIntegrationUpdate, NotionIntegrationUpdate, OktaIntegrationUpdate, OpenAIIntegrationUpdate, ServiceNowIntegrationUpdate, SplitIntegrationUpdate, StatsigIntegrationUpdate, VirusTotalIntegrationUpdate)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AWSIntegrationUpdate`. If the actual instance is not `AWSIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AWSIntegrationUpdate`
     * @throws ClassCastException if the instance is not `AWSIntegrationUpdate`
     */
    public AWSIntegrationUpdate getAWSIntegrationUpdate() throws ClassCastException {
        return (AWSIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AnthropicIntegrationUpdate`. If the actual instance is not `AnthropicIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AnthropicIntegrationUpdate`
     * @throws ClassCastException if the instance is not `AnthropicIntegrationUpdate`
     */
    public AnthropicIntegrationUpdate getAnthropicIntegrationUpdate() throws ClassCastException {
        return (AnthropicIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AsanaIntegrationUpdate`. If the actual instance is not `AsanaIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AsanaIntegrationUpdate`
     * @throws ClassCastException if the instance is not `AsanaIntegrationUpdate`
     */
    public AsanaIntegrationUpdate getAsanaIntegrationUpdate() throws ClassCastException {
        return (AsanaIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AzureIntegrationUpdate`. If the actual instance is not `AzureIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AzureIntegrationUpdate`
     * @throws ClassCastException if the instance is not `AzureIntegrationUpdate`
     */
    public AzureIntegrationUpdate getAzureIntegrationUpdate() throws ClassCastException {
        return (AzureIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CircleCIIntegrationUpdate`. If the actual instance is not `CircleCIIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CircleCIIntegrationUpdate`
     * @throws ClassCastException if the instance is not `CircleCIIntegrationUpdate`
     */
    public CircleCIIntegrationUpdate getCircleCIIntegrationUpdate() throws ClassCastException {
        return (CircleCIIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ClickupIntegrationUpdate`. If the actual instance is not `ClickupIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ClickupIntegrationUpdate`
     * @throws ClassCastException if the instance is not `ClickupIntegrationUpdate`
     */
    public ClickupIntegrationUpdate getClickupIntegrationUpdate() throws ClassCastException {
        return (ClickupIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CloudflareIntegrationUpdate`. If the actual instance is not `CloudflareIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CloudflareIntegrationUpdate`
     * @throws ClassCastException if the instance is not `CloudflareIntegrationUpdate`
     */
    public CloudflareIntegrationUpdate getCloudflareIntegrationUpdate() throws ClassCastException {
        return (CloudflareIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConfigCatIntegrationUpdate`. If the actual instance is not `ConfigCatIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConfigCatIntegrationUpdate`
     * @throws ClassCastException if the instance is not `ConfigCatIntegrationUpdate`
     */
    public ConfigCatIntegrationUpdate getConfigCatIntegrationUpdate() throws ClassCastException {
        return (ConfigCatIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DatadogIntegrationUpdate`. If the actual instance is not `DatadogIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DatadogIntegrationUpdate`
     * @throws ClassCastException if the instance is not `DatadogIntegrationUpdate`
     */
    public DatadogIntegrationUpdate getDatadogIntegrationUpdate() throws ClassCastException {
        return (DatadogIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FastlyIntegrationUpdate`. If the actual instance is not `FastlyIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FastlyIntegrationUpdate`
     * @throws ClassCastException if the instance is not `FastlyIntegrationUpdate`
     */
    public FastlyIntegrationUpdate getFastlyIntegrationUpdate() throws ClassCastException {
        return (FastlyIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FreshserviceIntegrationUpdate`. If the actual instance is not `FreshserviceIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FreshserviceIntegrationUpdate`
     * @throws ClassCastException if the instance is not `FreshserviceIntegrationUpdate`
     */
    public FreshserviceIntegrationUpdate getFreshserviceIntegrationUpdate() throws ClassCastException {
        return (FreshserviceIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GCPIntegrationUpdate`. If the actual instance is not `GCPIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GCPIntegrationUpdate`
     * @throws ClassCastException if the instance is not `GCPIntegrationUpdate`
     */
    public GCPIntegrationUpdate getGCPIntegrationUpdate() throws ClassCastException {
        return (GCPIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GeminiIntegrationUpdate`. If the actual instance is not `GeminiIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GeminiIntegrationUpdate`
     * @throws ClassCastException if the instance is not `GeminiIntegrationUpdate`
     */
    public GeminiIntegrationUpdate getGeminiIntegrationUpdate() throws ClassCastException {
        return (GeminiIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GitlabIntegrationUpdate`. If the actual instance is not `GitlabIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GitlabIntegrationUpdate`
     * @throws ClassCastException if the instance is not `GitlabIntegrationUpdate`
     */
    public GitlabIntegrationUpdate getGitlabIntegrationUpdate() throws ClassCastException {
        return (GitlabIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GreyNoiseIntegrationUpdate`. If the actual instance is not `GreyNoiseIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GreyNoiseIntegrationUpdate`
     * @throws ClassCastException if the instance is not `GreyNoiseIntegrationUpdate`
     */
    public GreyNoiseIntegrationUpdate getGreyNoiseIntegrationUpdate() throws ClassCastException {
        return (GreyNoiseIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HTTPIntegrationUpdate`. If the actual instance is not `HTTPIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HTTPIntegrationUpdate`
     * @throws ClassCastException if the instance is not `HTTPIntegrationUpdate`
     */
    public HTTPIntegrationUpdate getHTTPIntegrationUpdate() throws ClassCastException {
        return (HTTPIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LaunchDarklyIntegrationUpdate`. If the actual instance is not `LaunchDarklyIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LaunchDarklyIntegrationUpdate`
     * @throws ClassCastException if the instance is not `LaunchDarklyIntegrationUpdate`
     */
    public LaunchDarklyIntegrationUpdate getLaunchDarklyIntegrationUpdate() throws ClassCastException {
        return (LaunchDarklyIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotionIntegrationUpdate`. If the actual instance is not `NotionIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotionIntegrationUpdate`
     * @throws ClassCastException if the instance is not `NotionIntegrationUpdate`
     */
    public NotionIntegrationUpdate getNotionIntegrationUpdate() throws ClassCastException {
        return (NotionIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OktaIntegrationUpdate`. If the actual instance is not `OktaIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OktaIntegrationUpdate`
     * @throws ClassCastException if the instance is not `OktaIntegrationUpdate`
     */
    public OktaIntegrationUpdate getOktaIntegrationUpdate() throws ClassCastException {
        return (OktaIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OpenAIIntegrationUpdate`. If the actual instance is not `OpenAIIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OpenAIIntegrationUpdate`
     * @throws ClassCastException if the instance is not `OpenAIIntegrationUpdate`
     */
    public OpenAIIntegrationUpdate getOpenAIIntegrationUpdate() throws ClassCastException {
        return (OpenAIIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceNowIntegrationUpdate`. If the actual instance is not `ServiceNowIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceNowIntegrationUpdate`
     * @throws ClassCastException if the instance is not `ServiceNowIntegrationUpdate`
     */
    public ServiceNowIntegrationUpdate getServiceNowIntegrationUpdate() throws ClassCastException {
        return (ServiceNowIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SplitIntegrationUpdate`. If the actual instance is not `SplitIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SplitIntegrationUpdate`
     * @throws ClassCastException if the instance is not `SplitIntegrationUpdate`
     */
    public SplitIntegrationUpdate getSplitIntegrationUpdate() throws ClassCastException {
        return (SplitIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `StatsigIntegrationUpdate`. If the actual instance is not `StatsigIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StatsigIntegrationUpdate`
     * @throws ClassCastException if the instance is not `StatsigIntegrationUpdate`
     */
    public StatsigIntegrationUpdate getStatsigIntegrationUpdate() throws ClassCastException {
        return (StatsigIntegrationUpdate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VirusTotalIntegrationUpdate`. If the actual instance is not `VirusTotalIntegrationUpdate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VirusTotalIntegrationUpdate`
     * @throws ClassCastException if the instance is not `VirusTotalIntegrationUpdate`
     */
    public VirusTotalIntegrationUpdate getVirusTotalIntegrationUpdate() throws ClassCastException {
        return (VirusTotalIntegrationUpdate)super.getActualInstance();
    }
}
