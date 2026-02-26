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
@JsonDeserialize(using = ActionConnectionIntegration.ActionConnectionIntegrationDeserializer.class)
@JsonSerialize(using = ActionConnectionIntegration.ActionConnectionIntegrationSerializer.class)
public class ActionConnectionIntegration extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ActionConnectionIntegration.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class ActionConnectionIntegrationSerializer extends StdSerializer<ActionConnectionIntegration> {
        public ActionConnectionIntegrationSerializer(Class<ActionConnectionIntegration> t) {
            super(t);
        }

        public ActionConnectionIntegrationSerializer() {
            this(null);
        }

        @Override
        public void serialize(ActionConnectionIntegration value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ActionConnectionIntegrationDeserializer extends StdDeserializer<ActionConnectionIntegration> {
        public ActionConnectionIntegrationDeserializer() {
            this(ActionConnectionIntegration.class);
        }

        public ActionConnectionIntegrationDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ActionConnectionIntegration deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AWSIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AWSIntegration.class.equals(Integer.class) || AWSIntegration.class.equals(Long.class) || AWSIntegration.class.equals(Float.class) || AWSIntegration.class.equals(Double.class) || AWSIntegration.class.equals(Boolean.class) || AWSIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AWSIntegration.class.equals(Integer.class) || AWSIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AWSIntegration.class.equals(Float.class) || AWSIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AWSIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AWSIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AWSIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AWSIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AWSIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AWSIntegration'", e);
            }
            
            // deserialize AnthropicIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AnthropicIntegration.class.equals(Integer.class) || AnthropicIntegration.class.equals(Long.class) || AnthropicIntegration.class.equals(Float.class) || AnthropicIntegration.class.equals(Double.class) || AnthropicIntegration.class.equals(Boolean.class) || AnthropicIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AnthropicIntegration.class.equals(Integer.class) || AnthropicIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AnthropicIntegration.class.equals(Float.class) || AnthropicIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AnthropicIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AnthropicIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AnthropicIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AnthropicIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AnthropicIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AnthropicIntegration'", e);
            }
            
            // deserialize AsanaIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AsanaIntegration.class.equals(Integer.class) || AsanaIntegration.class.equals(Long.class) || AsanaIntegration.class.equals(Float.class) || AsanaIntegration.class.equals(Double.class) || AsanaIntegration.class.equals(Boolean.class) || AsanaIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AsanaIntegration.class.equals(Integer.class) || AsanaIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AsanaIntegration.class.equals(Float.class) || AsanaIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AsanaIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AsanaIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AsanaIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AsanaIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AsanaIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AsanaIntegration'", e);
            }
            
            // deserialize AzureIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AzureIntegration.class.equals(Integer.class) || AzureIntegration.class.equals(Long.class) || AzureIntegration.class.equals(Float.class) || AzureIntegration.class.equals(Double.class) || AzureIntegration.class.equals(Boolean.class) || AzureIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AzureIntegration.class.equals(Integer.class) || AzureIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AzureIntegration.class.equals(Float.class) || AzureIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AzureIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AzureIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AzureIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AzureIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AzureIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AzureIntegration'", e);
            }
            
            // deserialize CircleCIIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CircleCIIntegration.class.equals(Integer.class) || CircleCIIntegration.class.equals(Long.class) || CircleCIIntegration.class.equals(Float.class) || CircleCIIntegration.class.equals(Double.class) || CircleCIIntegration.class.equals(Boolean.class) || CircleCIIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CircleCIIntegration.class.equals(Integer.class) || CircleCIIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CircleCIIntegration.class.equals(Float.class) || CircleCIIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CircleCIIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CircleCIIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CircleCIIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CircleCIIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CircleCIIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CircleCIIntegration'", e);
            }
            
            // deserialize ClickupIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ClickupIntegration.class.equals(Integer.class) || ClickupIntegration.class.equals(Long.class) || ClickupIntegration.class.equals(Float.class) || ClickupIntegration.class.equals(Double.class) || ClickupIntegration.class.equals(Boolean.class) || ClickupIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ClickupIntegration.class.equals(Integer.class) || ClickupIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ClickupIntegration.class.equals(Float.class) || ClickupIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ClickupIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ClickupIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ClickupIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ClickupIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ClickupIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ClickupIntegration'", e);
            }
            
            // deserialize CloudflareIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CloudflareIntegration.class.equals(Integer.class) || CloudflareIntegration.class.equals(Long.class) || CloudflareIntegration.class.equals(Float.class) || CloudflareIntegration.class.equals(Double.class) || CloudflareIntegration.class.equals(Boolean.class) || CloudflareIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CloudflareIntegration.class.equals(Integer.class) || CloudflareIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CloudflareIntegration.class.equals(Float.class) || CloudflareIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CloudflareIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CloudflareIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CloudflareIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CloudflareIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CloudflareIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CloudflareIntegration'", e);
            }
            
            // deserialize ConfigCatIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConfigCatIntegration.class.equals(Integer.class) || ConfigCatIntegration.class.equals(Long.class) || ConfigCatIntegration.class.equals(Float.class) || ConfigCatIntegration.class.equals(Double.class) || ConfigCatIntegration.class.equals(Boolean.class) || ConfigCatIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConfigCatIntegration.class.equals(Integer.class) || ConfigCatIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConfigCatIntegration.class.equals(Float.class) || ConfigCatIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ConfigCatIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConfigCatIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ConfigCatIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ConfigCatIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ConfigCatIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConfigCatIntegration'", e);
            }
            
            // deserialize DatadogIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DatadogIntegration.class.equals(Integer.class) || DatadogIntegration.class.equals(Long.class) || DatadogIntegration.class.equals(Float.class) || DatadogIntegration.class.equals(Double.class) || DatadogIntegration.class.equals(Boolean.class) || DatadogIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DatadogIntegration.class.equals(Integer.class) || DatadogIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DatadogIntegration.class.equals(Float.class) || DatadogIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (DatadogIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DatadogIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(DatadogIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((DatadogIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'DatadogIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DatadogIntegration'", e);
            }
            
            // deserialize FastlyIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FastlyIntegration.class.equals(Integer.class) || FastlyIntegration.class.equals(Long.class) || FastlyIntegration.class.equals(Float.class) || FastlyIntegration.class.equals(Double.class) || FastlyIntegration.class.equals(Boolean.class) || FastlyIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FastlyIntegration.class.equals(Integer.class) || FastlyIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FastlyIntegration.class.equals(Float.class) || FastlyIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FastlyIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FastlyIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FastlyIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FastlyIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FastlyIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FastlyIntegration'", e);
            }
            
            // deserialize FreshserviceIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FreshserviceIntegration.class.equals(Integer.class) || FreshserviceIntegration.class.equals(Long.class) || FreshserviceIntegration.class.equals(Float.class) || FreshserviceIntegration.class.equals(Double.class) || FreshserviceIntegration.class.equals(Boolean.class) || FreshserviceIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FreshserviceIntegration.class.equals(Integer.class) || FreshserviceIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FreshserviceIntegration.class.equals(Float.class) || FreshserviceIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FreshserviceIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FreshserviceIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FreshserviceIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FreshserviceIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FreshserviceIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FreshserviceIntegration'", e);
            }
            
            // deserialize GCPIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GCPIntegration.class.equals(Integer.class) || GCPIntegration.class.equals(Long.class) || GCPIntegration.class.equals(Float.class) || GCPIntegration.class.equals(Double.class) || GCPIntegration.class.equals(Boolean.class) || GCPIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GCPIntegration.class.equals(Integer.class) || GCPIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GCPIntegration.class.equals(Float.class) || GCPIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GCPIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GCPIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GCPIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GCPIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GCPIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GCPIntegration'", e);
            }
            
            // deserialize GeminiIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GeminiIntegration.class.equals(Integer.class) || GeminiIntegration.class.equals(Long.class) || GeminiIntegration.class.equals(Float.class) || GeminiIntegration.class.equals(Double.class) || GeminiIntegration.class.equals(Boolean.class) || GeminiIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GeminiIntegration.class.equals(Integer.class) || GeminiIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GeminiIntegration.class.equals(Float.class) || GeminiIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GeminiIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GeminiIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GeminiIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GeminiIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GeminiIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GeminiIntegration'", e);
            }
            
            // deserialize GitlabIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GitlabIntegration.class.equals(Integer.class) || GitlabIntegration.class.equals(Long.class) || GitlabIntegration.class.equals(Float.class) || GitlabIntegration.class.equals(Double.class) || GitlabIntegration.class.equals(Boolean.class) || GitlabIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GitlabIntegration.class.equals(Integer.class) || GitlabIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GitlabIntegration.class.equals(Float.class) || GitlabIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GitlabIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GitlabIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GitlabIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GitlabIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GitlabIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GitlabIntegration'", e);
            }
            
            // deserialize GreyNoiseIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GreyNoiseIntegration.class.equals(Integer.class) || GreyNoiseIntegration.class.equals(Long.class) || GreyNoiseIntegration.class.equals(Float.class) || GreyNoiseIntegration.class.equals(Double.class) || GreyNoiseIntegration.class.equals(Boolean.class) || GreyNoiseIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GreyNoiseIntegration.class.equals(Integer.class) || GreyNoiseIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GreyNoiseIntegration.class.equals(Float.class) || GreyNoiseIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GreyNoiseIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GreyNoiseIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GreyNoiseIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GreyNoiseIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GreyNoiseIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GreyNoiseIntegration'", e);
            }
            
            // deserialize HTTPIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (HTTPIntegration.class.equals(Integer.class) || HTTPIntegration.class.equals(Long.class) || HTTPIntegration.class.equals(Float.class) || HTTPIntegration.class.equals(Double.class) || HTTPIntegration.class.equals(Boolean.class) || HTTPIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((HTTPIntegration.class.equals(Integer.class) || HTTPIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((HTTPIntegration.class.equals(Float.class) || HTTPIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (HTTPIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (HTTPIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(HTTPIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((HTTPIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'HTTPIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'HTTPIntegration'", e);
            }
            
            // deserialize LaunchDarklyIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LaunchDarklyIntegration.class.equals(Integer.class) || LaunchDarklyIntegration.class.equals(Long.class) || LaunchDarklyIntegration.class.equals(Float.class) || LaunchDarklyIntegration.class.equals(Double.class) || LaunchDarklyIntegration.class.equals(Boolean.class) || LaunchDarklyIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LaunchDarklyIntegration.class.equals(Integer.class) || LaunchDarklyIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LaunchDarklyIntegration.class.equals(Float.class) || LaunchDarklyIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LaunchDarklyIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LaunchDarklyIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LaunchDarklyIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LaunchDarklyIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LaunchDarklyIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LaunchDarklyIntegration'", e);
            }
            
            // deserialize NotionIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NotionIntegration.class.equals(Integer.class) || NotionIntegration.class.equals(Long.class) || NotionIntegration.class.equals(Float.class) || NotionIntegration.class.equals(Double.class) || NotionIntegration.class.equals(Boolean.class) || NotionIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NotionIntegration.class.equals(Integer.class) || NotionIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NotionIntegration.class.equals(Float.class) || NotionIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (NotionIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NotionIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(NotionIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((NotionIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'NotionIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NotionIntegration'", e);
            }
            
            // deserialize OktaIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (OktaIntegration.class.equals(Integer.class) || OktaIntegration.class.equals(Long.class) || OktaIntegration.class.equals(Float.class) || OktaIntegration.class.equals(Double.class) || OktaIntegration.class.equals(Boolean.class) || OktaIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((OktaIntegration.class.equals(Integer.class) || OktaIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((OktaIntegration.class.equals(Float.class) || OktaIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (OktaIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (OktaIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(OktaIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((OktaIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'OktaIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'OktaIntegration'", e);
            }
            
            // deserialize OpenAIIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (OpenAIIntegration.class.equals(Integer.class) || OpenAIIntegration.class.equals(Long.class) || OpenAIIntegration.class.equals(Float.class) || OpenAIIntegration.class.equals(Double.class) || OpenAIIntegration.class.equals(Boolean.class) || OpenAIIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((OpenAIIntegration.class.equals(Integer.class) || OpenAIIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((OpenAIIntegration.class.equals(Float.class) || OpenAIIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (OpenAIIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (OpenAIIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(OpenAIIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((OpenAIIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'OpenAIIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'OpenAIIntegration'", e);
            }
            
            // deserialize ServiceNowIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ServiceNowIntegration.class.equals(Integer.class) || ServiceNowIntegration.class.equals(Long.class) || ServiceNowIntegration.class.equals(Float.class) || ServiceNowIntegration.class.equals(Double.class) || ServiceNowIntegration.class.equals(Boolean.class) || ServiceNowIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ServiceNowIntegration.class.equals(Integer.class) || ServiceNowIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ServiceNowIntegration.class.equals(Float.class) || ServiceNowIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ServiceNowIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ServiceNowIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceNowIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ServiceNowIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ServiceNowIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ServiceNowIntegration'", e);
            }
            
            // deserialize SplitIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SplitIntegration.class.equals(Integer.class) || SplitIntegration.class.equals(Long.class) || SplitIntegration.class.equals(Float.class) || SplitIntegration.class.equals(Double.class) || SplitIntegration.class.equals(Boolean.class) || SplitIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SplitIntegration.class.equals(Integer.class) || SplitIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SplitIntegration.class.equals(Float.class) || SplitIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SplitIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SplitIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SplitIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SplitIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SplitIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SplitIntegration'", e);
            }
            
            // deserialize StatsigIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (StatsigIntegration.class.equals(Integer.class) || StatsigIntegration.class.equals(Long.class) || StatsigIntegration.class.equals(Float.class) || StatsigIntegration.class.equals(Double.class) || StatsigIntegration.class.equals(Boolean.class) || StatsigIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((StatsigIntegration.class.equals(Integer.class) || StatsigIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((StatsigIntegration.class.equals(Float.class) || StatsigIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (StatsigIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (StatsigIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(StatsigIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((StatsigIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'StatsigIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'StatsigIntegration'", e);
            }
            
            // deserialize VirusTotalIntegration
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (VirusTotalIntegration.class.equals(Integer.class) || VirusTotalIntegration.class.equals(Long.class) || VirusTotalIntegration.class.equals(Float.class) || VirusTotalIntegration.class.equals(Double.class) || VirusTotalIntegration.class.equals(Boolean.class) || VirusTotalIntegration.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((VirusTotalIntegration.class.equals(Integer.class) || VirusTotalIntegration.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((VirusTotalIntegration.class.equals(Float.class) || VirusTotalIntegration.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (VirusTotalIntegration.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (VirusTotalIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(VirusTotalIntegration.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((VirusTotalIntegration)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'VirusTotalIntegration'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'VirusTotalIntegration'", e);
            }
            
            ActionConnectionIntegration ret = new ActionConnectionIntegration();
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
        public ActionConnectionIntegration getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ActionConnectionIntegration cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ActionConnectionIntegration() {
        super("oneOf", Boolean.FALSE);
    }
    public ActionConnectionIntegration(AWSIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(AnthropicIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(AsanaIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(AzureIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(CircleCIIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(ClickupIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(CloudflareIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(ConfigCatIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(DatadogIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(FastlyIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(FreshserviceIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(GCPIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(GeminiIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(GitlabIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(GreyNoiseIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(HTTPIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(LaunchDarklyIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(NotionIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(OktaIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(OpenAIIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(ServiceNowIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(SplitIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(StatsigIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public ActionConnectionIntegration(VirusTotalIntegration o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AWSIntegration", new GenericType<AWSIntegration>() {
        });
        schemas.put("AnthropicIntegration", new GenericType<AnthropicIntegration>() {
        });
        schemas.put("AsanaIntegration", new GenericType<AsanaIntegration>() {
        });
        schemas.put("AzureIntegration", new GenericType<AzureIntegration>() {
        });
        schemas.put("CircleCIIntegration", new GenericType<CircleCIIntegration>() {
        });
        schemas.put("ClickupIntegration", new GenericType<ClickupIntegration>() {
        });
        schemas.put("CloudflareIntegration", new GenericType<CloudflareIntegration>() {
        });
        schemas.put("ConfigCatIntegration", new GenericType<ConfigCatIntegration>() {
        });
        schemas.put("DatadogIntegration", new GenericType<DatadogIntegration>() {
        });
        schemas.put("FastlyIntegration", new GenericType<FastlyIntegration>() {
        });
        schemas.put("FreshserviceIntegration", new GenericType<FreshserviceIntegration>() {
        });
        schemas.put("GCPIntegration", new GenericType<GCPIntegration>() {
        });
        schemas.put("GeminiIntegration", new GenericType<GeminiIntegration>() {
        });
        schemas.put("GitlabIntegration", new GenericType<GitlabIntegration>() {
        });
        schemas.put("GreyNoiseIntegration", new GenericType<GreyNoiseIntegration>() {
        });
        schemas.put("HTTPIntegration", new GenericType<HTTPIntegration>() {
        });
        schemas.put("LaunchDarklyIntegration", new GenericType<LaunchDarklyIntegration>() {
        });
        schemas.put("NotionIntegration", new GenericType<NotionIntegration>() {
        });
        schemas.put("OktaIntegration", new GenericType<OktaIntegration>() {
        });
        schemas.put("OpenAIIntegration", new GenericType<OpenAIIntegration>() {
        });
        schemas.put("ServiceNowIntegration", new GenericType<ServiceNowIntegration>() {
        });
        schemas.put("SplitIntegration", new GenericType<SplitIntegration>() {
        });
        schemas.put("StatsigIntegration", new GenericType<StatsigIntegration>() {
        });
        schemas.put("VirusTotalIntegration", new GenericType<VirusTotalIntegration>() {
        });
        JSON.registerDescendants(ActionConnectionIntegration.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ActionConnectionIntegration.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AWSIntegration, AnthropicIntegration, AsanaIntegration, AzureIntegration, CircleCIIntegration, ClickupIntegration, CloudflareIntegration, ConfigCatIntegration, DatadogIntegration, FastlyIntegration, FreshserviceIntegration, GCPIntegration, GeminiIntegration, GitlabIntegration, GreyNoiseIntegration, HTTPIntegration, LaunchDarklyIntegration, NotionIntegration, OktaIntegration, OpenAIIntegration, ServiceNowIntegration, SplitIntegration, StatsigIntegration, VirusTotalIntegration
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AWSIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AnthropicIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AsanaIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AzureIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CircleCIIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ClickupIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CloudflareIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ConfigCatIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(DatadogIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FastlyIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FreshserviceIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GCPIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GeminiIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GitlabIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GreyNoiseIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(HTTPIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LaunchDarklyIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(NotionIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(OktaIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(OpenAIIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ServiceNowIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SplitIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(StatsigIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(VirusTotalIntegration.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be AWSIntegration, AnthropicIntegration, AsanaIntegration, AzureIntegration, CircleCIIntegration, ClickupIntegration, CloudflareIntegration, ConfigCatIntegration, DatadogIntegration, FastlyIntegration, FreshserviceIntegration, GCPIntegration, GeminiIntegration, GitlabIntegration, GreyNoiseIntegration, HTTPIntegration, LaunchDarklyIntegration, NotionIntegration, OktaIntegration, OpenAIIntegration, ServiceNowIntegration, SplitIntegration, StatsigIntegration, VirusTotalIntegration");
    }

    /**
     * Get the actual instance, which can be the following:
     * AWSIntegration, AnthropicIntegration, AsanaIntegration, AzureIntegration, CircleCIIntegration, ClickupIntegration, CloudflareIntegration, ConfigCatIntegration, DatadogIntegration, FastlyIntegration, FreshserviceIntegration, GCPIntegration, GeminiIntegration, GitlabIntegration, GreyNoiseIntegration, HTTPIntegration, LaunchDarklyIntegration, NotionIntegration, OktaIntegration, OpenAIIntegration, ServiceNowIntegration, SplitIntegration, StatsigIntegration, VirusTotalIntegration
     *
     * @return The actual instance (AWSIntegration, AnthropicIntegration, AsanaIntegration, AzureIntegration, CircleCIIntegration, ClickupIntegration, CloudflareIntegration, ConfigCatIntegration, DatadogIntegration, FastlyIntegration, FreshserviceIntegration, GCPIntegration, GeminiIntegration, GitlabIntegration, GreyNoiseIntegration, HTTPIntegration, LaunchDarklyIntegration, NotionIntegration, OktaIntegration, OpenAIIntegration, ServiceNowIntegration, SplitIntegration, StatsigIntegration, VirusTotalIntegration)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AWSIntegration`. If the actual instance is not `AWSIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AWSIntegration`
     * @throws ClassCastException if the instance is not `AWSIntegration`
     */
    public AWSIntegration getAWSIntegration() throws ClassCastException {
        return (AWSIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AnthropicIntegration`. If the actual instance is not `AnthropicIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AnthropicIntegration`
     * @throws ClassCastException if the instance is not `AnthropicIntegration`
     */
    public AnthropicIntegration getAnthropicIntegration() throws ClassCastException {
        return (AnthropicIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AsanaIntegration`. If the actual instance is not `AsanaIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AsanaIntegration`
     * @throws ClassCastException if the instance is not `AsanaIntegration`
     */
    public AsanaIntegration getAsanaIntegration() throws ClassCastException {
        return (AsanaIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AzureIntegration`. If the actual instance is not `AzureIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AzureIntegration`
     * @throws ClassCastException if the instance is not `AzureIntegration`
     */
    public AzureIntegration getAzureIntegration() throws ClassCastException {
        return (AzureIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CircleCIIntegration`. If the actual instance is not `CircleCIIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CircleCIIntegration`
     * @throws ClassCastException if the instance is not `CircleCIIntegration`
     */
    public CircleCIIntegration getCircleCIIntegration() throws ClassCastException {
        return (CircleCIIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ClickupIntegration`. If the actual instance is not `ClickupIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ClickupIntegration`
     * @throws ClassCastException if the instance is not `ClickupIntegration`
     */
    public ClickupIntegration getClickupIntegration() throws ClassCastException {
        return (ClickupIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CloudflareIntegration`. If the actual instance is not `CloudflareIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CloudflareIntegration`
     * @throws ClassCastException if the instance is not `CloudflareIntegration`
     */
    public CloudflareIntegration getCloudflareIntegration() throws ClassCastException {
        return (CloudflareIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConfigCatIntegration`. If the actual instance is not `ConfigCatIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConfigCatIntegration`
     * @throws ClassCastException if the instance is not `ConfigCatIntegration`
     */
    public ConfigCatIntegration getConfigCatIntegration() throws ClassCastException {
        return (ConfigCatIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DatadogIntegration`. If the actual instance is not `DatadogIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DatadogIntegration`
     * @throws ClassCastException if the instance is not `DatadogIntegration`
     */
    public DatadogIntegration getDatadogIntegration() throws ClassCastException {
        return (DatadogIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FastlyIntegration`. If the actual instance is not `FastlyIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FastlyIntegration`
     * @throws ClassCastException if the instance is not `FastlyIntegration`
     */
    public FastlyIntegration getFastlyIntegration() throws ClassCastException {
        return (FastlyIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FreshserviceIntegration`. If the actual instance is not `FreshserviceIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FreshserviceIntegration`
     * @throws ClassCastException if the instance is not `FreshserviceIntegration`
     */
    public FreshserviceIntegration getFreshserviceIntegration() throws ClassCastException {
        return (FreshserviceIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GCPIntegration`. If the actual instance is not `GCPIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GCPIntegration`
     * @throws ClassCastException if the instance is not `GCPIntegration`
     */
    public GCPIntegration getGCPIntegration() throws ClassCastException {
        return (GCPIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GeminiIntegration`. If the actual instance is not `GeminiIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GeminiIntegration`
     * @throws ClassCastException if the instance is not `GeminiIntegration`
     */
    public GeminiIntegration getGeminiIntegration() throws ClassCastException {
        return (GeminiIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GitlabIntegration`. If the actual instance is not `GitlabIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GitlabIntegration`
     * @throws ClassCastException if the instance is not `GitlabIntegration`
     */
    public GitlabIntegration getGitlabIntegration() throws ClassCastException {
        return (GitlabIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GreyNoiseIntegration`. If the actual instance is not `GreyNoiseIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GreyNoiseIntegration`
     * @throws ClassCastException if the instance is not `GreyNoiseIntegration`
     */
    public GreyNoiseIntegration getGreyNoiseIntegration() throws ClassCastException {
        return (GreyNoiseIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HTTPIntegration`. If the actual instance is not `HTTPIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HTTPIntegration`
     * @throws ClassCastException if the instance is not `HTTPIntegration`
     */
    public HTTPIntegration getHTTPIntegration() throws ClassCastException {
        return (HTTPIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LaunchDarklyIntegration`. If the actual instance is not `LaunchDarklyIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LaunchDarklyIntegration`
     * @throws ClassCastException if the instance is not `LaunchDarklyIntegration`
     */
    public LaunchDarklyIntegration getLaunchDarklyIntegration() throws ClassCastException {
        return (LaunchDarklyIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NotionIntegration`. If the actual instance is not `NotionIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NotionIntegration`
     * @throws ClassCastException if the instance is not `NotionIntegration`
     */
    public NotionIntegration getNotionIntegration() throws ClassCastException {
        return (NotionIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OktaIntegration`. If the actual instance is not `OktaIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OktaIntegration`
     * @throws ClassCastException if the instance is not `OktaIntegration`
     */
    public OktaIntegration getOktaIntegration() throws ClassCastException {
        return (OktaIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OpenAIIntegration`. If the actual instance is not `OpenAIIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OpenAIIntegration`
     * @throws ClassCastException if the instance is not `OpenAIIntegration`
     */
    public OpenAIIntegration getOpenAIIntegration() throws ClassCastException {
        return (OpenAIIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceNowIntegration`. If the actual instance is not `ServiceNowIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceNowIntegration`
     * @throws ClassCastException if the instance is not `ServiceNowIntegration`
     */
    public ServiceNowIntegration getServiceNowIntegration() throws ClassCastException {
        return (ServiceNowIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SplitIntegration`. If the actual instance is not `SplitIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SplitIntegration`
     * @throws ClassCastException if the instance is not `SplitIntegration`
     */
    public SplitIntegration getSplitIntegration() throws ClassCastException {
        return (SplitIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `StatsigIntegration`. If the actual instance is not `StatsigIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StatsigIntegration`
     * @throws ClassCastException if the instance is not `StatsigIntegration`
     */
    public StatsigIntegration getStatsigIntegration() throws ClassCastException {
        return (StatsigIntegration)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VirusTotalIntegration`. If the actual instance is not `VirusTotalIntegration`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VirusTotalIntegration`
     * @throws ClassCastException if the instance is not `VirusTotalIntegration`
     */
    public VirusTotalIntegration getVirusTotalIntegration() throws ClassCastException {
        return (VirusTotalIntegration)super.getActualInstance();
    }
}
