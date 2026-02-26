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
@JsonDeserialize(using = WidgetDefinition.WidgetDefinitionDeserializer.class)
@JsonSerialize(using = WidgetDefinition.WidgetDefinitionSerializer.class)
public class WidgetDefinition extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WidgetDefinition.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class WidgetDefinitionSerializer extends StdSerializer<WidgetDefinition> {
        public WidgetDefinitionSerializer(Class<WidgetDefinition> t) {
            super(t);
        }

        public WidgetDefinitionSerializer() {
            this(null);
        }

        @Override
        public void serialize(WidgetDefinition value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class WidgetDefinitionDeserializer extends StdDeserializer<WidgetDefinition> {
        public WidgetDefinitionDeserializer() {
            this(WidgetDefinition.class);
        }

        public WidgetDefinitionDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public WidgetDefinition deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AlertGraphWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AlertGraphWidgetDefinition.class.equals(Integer.class) || AlertGraphWidgetDefinition.class.equals(Long.class) || AlertGraphWidgetDefinition.class.equals(Float.class) || AlertGraphWidgetDefinition.class.equals(Double.class) || AlertGraphWidgetDefinition.class.equals(Boolean.class) || AlertGraphWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AlertGraphWidgetDefinition.class.equals(Integer.class) || AlertGraphWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AlertGraphWidgetDefinition.class.equals(Float.class) || AlertGraphWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AlertGraphWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AlertGraphWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AlertGraphWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AlertGraphWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AlertGraphWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AlertGraphWidgetDefinition'", e);
            }
            
            // deserialize AlertValueWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AlertValueWidgetDefinition.class.equals(Integer.class) || AlertValueWidgetDefinition.class.equals(Long.class) || AlertValueWidgetDefinition.class.equals(Float.class) || AlertValueWidgetDefinition.class.equals(Double.class) || AlertValueWidgetDefinition.class.equals(Boolean.class) || AlertValueWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AlertValueWidgetDefinition.class.equals(Integer.class) || AlertValueWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AlertValueWidgetDefinition.class.equals(Float.class) || AlertValueWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (AlertValueWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AlertValueWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(AlertValueWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((AlertValueWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'AlertValueWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AlertValueWidgetDefinition'", e);
            }
            
            // deserialize BarChartWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BarChartWidgetDefinition.class.equals(Integer.class) || BarChartWidgetDefinition.class.equals(Long.class) || BarChartWidgetDefinition.class.equals(Float.class) || BarChartWidgetDefinition.class.equals(Double.class) || BarChartWidgetDefinition.class.equals(Boolean.class) || BarChartWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BarChartWidgetDefinition.class.equals(Integer.class) || BarChartWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BarChartWidgetDefinition.class.equals(Float.class) || BarChartWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (BarChartWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BarChartWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(BarChartWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((BarChartWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'BarChartWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BarChartWidgetDefinition'", e);
            }
            
            // deserialize ChangeWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ChangeWidgetDefinition.class.equals(Integer.class) || ChangeWidgetDefinition.class.equals(Long.class) || ChangeWidgetDefinition.class.equals(Float.class) || ChangeWidgetDefinition.class.equals(Double.class) || ChangeWidgetDefinition.class.equals(Boolean.class) || ChangeWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ChangeWidgetDefinition.class.equals(Integer.class) || ChangeWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ChangeWidgetDefinition.class.equals(Float.class) || ChangeWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ChangeWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ChangeWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ChangeWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ChangeWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ChangeWidgetDefinition'", e);
            }
            
            // deserialize CheckStatusWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CheckStatusWidgetDefinition.class.equals(Integer.class) || CheckStatusWidgetDefinition.class.equals(Long.class) || CheckStatusWidgetDefinition.class.equals(Float.class) || CheckStatusWidgetDefinition.class.equals(Double.class) || CheckStatusWidgetDefinition.class.equals(Boolean.class) || CheckStatusWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CheckStatusWidgetDefinition.class.equals(Integer.class) || CheckStatusWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CheckStatusWidgetDefinition.class.equals(Float.class) || CheckStatusWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (CheckStatusWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CheckStatusWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(CheckStatusWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((CheckStatusWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'CheckStatusWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CheckStatusWidgetDefinition'", e);
            }
            
            // deserialize DistributionWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DistributionWidgetDefinition.class.equals(Integer.class) || DistributionWidgetDefinition.class.equals(Long.class) || DistributionWidgetDefinition.class.equals(Float.class) || DistributionWidgetDefinition.class.equals(Double.class) || DistributionWidgetDefinition.class.equals(Boolean.class) || DistributionWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DistributionWidgetDefinition.class.equals(Integer.class) || DistributionWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DistributionWidgetDefinition.class.equals(Float.class) || DistributionWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (DistributionWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DistributionWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(DistributionWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((DistributionWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'DistributionWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DistributionWidgetDefinition'", e);
            }
            
            // deserialize EventStreamWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EventStreamWidgetDefinition.class.equals(Integer.class) || EventStreamWidgetDefinition.class.equals(Long.class) || EventStreamWidgetDefinition.class.equals(Float.class) || EventStreamWidgetDefinition.class.equals(Double.class) || EventStreamWidgetDefinition.class.equals(Boolean.class) || EventStreamWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EventStreamWidgetDefinition.class.equals(Integer.class) || EventStreamWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EventStreamWidgetDefinition.class.equals(Float.class) || EventStreamWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (EventStreamWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EventStreamWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(EventStreamWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((EventStreamWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'EventStreamWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EventStreamWidgetDefinition'", e);
            }
            
            // deserialize EventTimelineWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EventTimelineWidgetDefinition.class.equals(Integer.class) || EventTimelineWidgetDefinition.class.equals(Long.class) || EventTimelineWidgetDefinition.class.equals(Float.class) || EventTimelineWidgetDefinition.class.equals(Double.class) || EventTimelineWidgetDefinition.class.equals(Boolean.class) || EventTimelineWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EventTimelineWidgetDefinition.class.equals(Integer.class) || EventTimelineWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EventTimelineWidgetDefinition.class.equals(Float.class) || EventTimelineWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (EventTimelineWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EventTimelineWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(EventTimelineWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((EventTimelineWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'EventTimelineWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EventTimelineWidgetDefinition'", e);
            }
            
            // deserialize FreeTextWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FreeTextWidgetDefinition.class.equals(Integer.class) || FreeTextWidgetDefinition.class.equals(Long.class) || FreeTextWidgetDefinition.class.equals(Float.class) || FreeTextWidgetDefinition.class.equals(Double.class) || FreeTextWidgetDefinition.class.equals(Boolean.class) || FreeTextWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FreeTextWidgetDefinition.class.equals(Integer.class) || FreeTextWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FreeTextWidgetDefinition.class.equals(Float.class) || FreeTextWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FreeTextWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FreeTextWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FreeTextWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FreeTextWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FreeTextWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FreeTextWidgetDefinition'", e);
            }
            
            // deserialize FunnelWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (FunnelWidgetDefinition.class.equals(Integer.class) || FunnelWidgetDefinition.class.equals(Long.class) || FunnelWidgetDefinition.class.equals(Float.class) || FunnelWidgetDefinition.class.equals(Double.class) || FunnelWidgetDefinition.class.equals(Boolean.class) || FunnelWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((FunnelWidgetDefinition.class.equals(Integer.class) || FunnelWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((FunnelWidgetDefinition.class.equals(Float.class) || FunnelWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (FunnelWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (FunnelWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(FunnelWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((FunnelWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'FunnelWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'FunnelWidgetDefinition'", e);
            }
            
            // deserialize GeomapWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GeomapWidgetDefinition.class.equals(Integer.class) || GeomapWidgetDefinition.class.equals(Long.class) || GeomapWidgetDefinition.class.equals(Float.class) || GeomapWidgetDefinition.class.equals(Double.class) || GeomapWidgetDefinition.class.equals(Boolean.class) || GeomapWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GeomapWidgetDefinition.class.equals(Integer.class) || GeomapWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GeomapWidgetDefinition.class.equals(Float.class) || GeomapWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GeomapWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GeomapWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GeomapWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GeomapWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GeomapWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GeomapWidgetDefinition'", e);
            }
            
            // deserialize GroupWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (GroupWidgetDefinition.class.equals(Integer.class) || GroupWidgetDefinition.class.equals(Long.class) || GroupWidgetDefinition.class.equals(Float.class) || GroupWidgetDefinition.class.equals(Double.class) || GroupWidgetDefinition.class.equals(Boolean.class) || GroupWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((GroupWidgetDefinition.class.equals(Integer.class) || GroupWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((GroupWidgetDefinition.class.equals(Float.class) || GroupWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (GroupWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (GroupWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(GroupWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((GroupWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'GroupWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GroupWidgetDefinition'", e);
            }
            
            // deserialize HeatMapWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (HeatMapWidgetDefinition.class.equals(Integer.class) || HeatMapWidgetDefinition.class.equals(Long.class) || HeatMapWidgetDefinition.class.equals(Float.class) || HeatMapWidgetDefinition.class.equals(Double.class) || HeatMapWidgetDefinition.class.equals(Boolean.class) || HeatMapWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((HeatMapWidgetDefinition.class.equals(Integer.class) || HeatMapWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((HeatMapWidgetDefinition.class.equals(Float.class) || HeatMapWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (HeatMapWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (HeatMapWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(HeatMapWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((HeatMapWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'HeatMapWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'HeatMapWidgetDefinition'", e);
            }
            
            // deserialize HostMapWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (HostMapWidgetDefinition.class.equals(Integer.class) || HostMapWidgetDefinition.class.equals(Long.class) || HostMapWidgetDefinition.class.equals(Float.class) || HostMapWidgetDefinition.class.equals(Double.class) || HostMapWidgetDefinition.class.equals(Boolean.class) || HostMapWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((HostMapWidgetDefinition.class.equals(Integer.class) || HostMapWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((HostMapWidgetDefinition.class.equals(Float.class) || HostMapWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (HostMapWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (HostMapWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(HostMapWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((HostMapWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'HostMapWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'HostMapWidgetDefinition'", e);
            }
            
            // deserialize IFrameWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IFrameWidgetDefinition.class.equals(Integer.class) || IFrameWidgetDefinition.class.equals(Long.class) || IFrameWidgetDefinition.class.equals(Float.class) || IFrameWidgetDefinition.class.equals(Double.class) || IFrameWidgetDefinition.class.equals(Boolean.class) || IFrameWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IFrameWidgetDefinition.class.equals(Integer.class) || IFrameWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IFrameWidgetDefinition.class.equals(Float.class) || IFrameWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (IFrameWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IFrameWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(IFrameWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((IFrameWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'IFrameWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IFrameWidgetDefinition'", e);
            }
            
            // deserialize ImageWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ImageWidgetDefinition.class.equals(Integer.class) || ImageWidgetDefinition.class.equals(Long.class) || ImageWidgetDefinition.class.equals(Float.class) || ImageWidgetDefinition.class.equals(Double.class) || ImageWidgetDefinition.class.equals(Boolean.class) || ImageWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ImageWidgetDefinition.class.equals(Integer.class) || ImageWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ImageWidgetDefinition.class.equals(Float.class) || ImageWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ImageWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ImageWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ImageWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ImageWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ImageWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ImageWidgetDefinition'", e);
            }
            
            // deserialize ListStreamWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ListStreamWidgetDefinition.class.equals(Integer.class) || ListStreamWidgetDefinition.class.equals(Long.class) || ListStreamWidgetDefinition.class.equals(Float.class) || ListStreamWidgetDefinition.class.equals(Double.class) || ListStreamWidgetDefinition.class.equals(Boolean.class) || ListStreamWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ListStreamWidgetDefinition.class.equals(Integer.class) || ListStreamWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ListStreamWidgetDefinition.class.equals(Float.class) || ListStreamWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ListStreamWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ListStreamWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ListStreamWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ListStreamWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ListStreamWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ListStreamWidgetDefinition'", e);
            }
            
            // deserialize LogStreamWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogStreamWidgetDefinition.class.equals(Integer.class) || LogStreamWidgetDefinition.class.equals(Long.class) || LogStreamWidgetDefinition.class.equals(Float.class) || LogStreamWidgetDefinition.class.equals(Double.class) || LogStreamWidgetDefinition.class.equals(Boolean.class) || LogStreamWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogStreamWidgetDefinition.class.equals(Integer.class) || LogStreamWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogStreamWidgetDefinition.class.equals(Float.class) || LogStreamWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogStreamWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogStreamWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogStreamWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogStreamWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogStreamWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogStreamWidgetDefinition'", e);
            }
            
            // deserialize MonitorSummaryWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MonitorSummaryWidgetDefinition.class.equals(Integer.class) || MonitorSummaryWidgetDefinition.class.equals(Long.class) || MonitorSummaryWidgetDefinition.class.equals(Float.class) || MonitorSummaryWidgetDefinition.class.equals(Double.class) || MonitorSummaryWidgetDefinition.class.equals(Boolean.class) || MonitorSummaryWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MonitorSummaryWidgetDefinition.class.equals(Integer.class) || MonitorSummaryWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MonitorSummaryWidgetDefinition.class.equals(Float.class) || MonitorSummaryWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (MonitorSummaryWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MonitorSummaryWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(MonitorSummaryWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((MonitorSummaryWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'MonitorSummaryWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MonitorSummaryWidgetDefinition'", e);
            }
            
            // deserialize NoteWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NoteWidgetDefinition.class.equals(Integer.class) || NoteWidgetDefinition.class.equals(Long.class) || NoteWidgetDefinition.class.equals(Float.class) || NoteWidgetDefinition.class.equals(Double.class) || NoteWidgetDefinition.class.equals(Boolean.class) || NoteWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NoteWidgetDefinition.class.equals(Integer.class) || NoteWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NoteWidgetDefinition.class.equals(Float.class) || NoteWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (NoteWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NoteWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(NoteWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((NoteWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'NoteWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NoteWidgetDefinition'", e);
            }
            
            // deserialize PowerpackWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PowerpackWidgetDefinition.class.equals(Integer.class) || PowerpackWidgetDefinition.class.equals(Long.class) || PowerpackWidgetDefinition.class.equals(Float.class) || PowerpackWidgetDefinition.class.equals(Double.class) || PowerpackWidgetDefinition.class.equals(Boolean.class) || PowerpackWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PowerpackWidgetDefinition.class.equals(Integer.class) || PowerpackWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PowerpackWidgetDefinition.class.equals(Float.class) || PowerpackWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (PowerpackWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PowerpackWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(PowerpackWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((PowerpackWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'PowerpackWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PowerpackWidgetDefinition'", e);
            }
            
            // deserialize QueryValueWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (QueryValueWidgetDefinition.class.equals(Integer.class) || QueryValueWidgetDefinition.class.equals(Long.class) || QueryValueWidgetDefinition.class.equals(Float.class) || QueryValueWidgetDefinition.class.equals(Double.class) || QueryValueWidgetDefinition.class.equals(Boolean.class) || QueryValueWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((QueryValueWidgetDefinition.class.equals(Integer.class) || QueryValueWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((QueryValueWidgetDefinition.class.equals(Float.class) || QueryValueWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (QueryValueWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (QueryValueWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(QueryValueWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((QueryValueWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'QueryValueWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'QueryValueWidgetDefinition'", e);
            }
            
            // deserialize RunWorkflowWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RunWorkflowWidgetDefinition.class.equals(Integer.class) || RunWorkflowWidgetDefinition.class.equals(Long.class) || RunWorkflowWidgetDefinition.class.equals(Float.class) || RunWorkflowWidgetDefinition.class.equals(Double.class) || RunWorkflowWidgetDefinition.class.equals(Boolean.class) || RunWorkflowWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RunWorkflowWidgetDefinition.class.equals(Integer.class) || RunWorkflowWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RunWorkflowWidgetDefinition.class.equals(Float.class) || RunWorkflowWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (RunWorkflowWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RunWorkflowWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(RunWorkflowWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((RunWorkflowWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'RunWorkflowWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RunWorkflowWidgetDefinition'", e);
            }
            
            // deserialize SLOListWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SLOListWidgetDefinition.class.equals(Integer.class) || SLOListWidgetDefinition.class.equals(Long.class) || SLOListWidgetDefinition.class.equals(Float.class) || SLOListWidgetDefinition.class.equals(Double.class) || SLOListWidgetDefinition.class.equals(Boolean.class) || SLOListWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SLOListWidgetDefinition.class.equals(Integer.class) || SLOListWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SLOListWidgetDefinition.class.equals(Float.class) || SLOListWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SLOListWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SLOListWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SLOListWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SLOListWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SLOListWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SLOListWidgetDefinition'", e);
            }
            
            // deserialize SLOWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SLOWidgetDefinition.class.equals(Integer.class) || SLOWidgetDefinition.class.equals(Long.class) || SLOWidgetDefinition.class.equals(Float.class) || SLOWidgetDefinition.class.equals(Double.class) || SLOWidgetDefinition.class.equals(Boolean.class) || SLOWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SLOWidgetDefinition.class.equals(Integer.class) || SLOWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SLOWidgetDefinition.class.equals(Float.class) || SLOWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SLOWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SLOWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SLOWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SLOWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SLOWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SLOWidgetDefinition'", e);
            }
            
            // deserialize ScatterPlotWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ScatterPlotWidgetDefinition.class.equals(Integer.class) || ScatterPlotWidgetDefinition.class.equals(Long.class) || ScatterPlotWidgetDefinition.class.equals(Float.class) || ScatterPlotWidgetDefinition.class.equals(Double.class) || ScatterPlotWidgetDefinition.class.equals(Boolean.class) || ScatterPlotWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ScatterPlotWidgetDefinition.class.equals(Integer.class) || ScatterPlotWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ScatterPlotWidgetDefinition.class.equals(Float.class) || ScatterPlotWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ScatterPlotWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ScatterPlotWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ScatterPlotWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ScatterPlotWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ScatterPlotWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ScatterPlotWidgetDefinition'", e);
            }
            
            // deserialize ServiceMapWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ServiceMapWidgetDefinition.class.equals(Integer.class) || ServiceMapWidgetDefinition.class.equals(Long.class) || ServiceMapWidgetDefinition.class.equals(Float.class) || ServiceMapWidgetDefinition.class.equals(Double.class) || ServiceMapWidgetDefinition.class.equals(Boolean.class) || ServiceMapWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ServiceMapWidgetDefinition.class.equals(Integer.class) || ServiceMapWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ServiceMapWidgetDefinition.class.equals(Float.class) || ServiceMapWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ServiceMapWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ServiceMapWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceMapWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ServiceMapWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ServiceMapWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ServiceMapWidgetDefinition'", e);
            }
            
            // deserialize ServiceSummaryWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ServiceSummaryWidgetDefinition.class.equals(Integer.class) || ServiceSummaryWidgetDefinition.class.equals(Long.class) || ServiceSummaryWidgetDefinition.class.equals(Float.class) || ServiceSummaryWidgetDefinition.class.equals(Double.class) || ServiceSummaryWidgetDefinition.class.equals(Boolean.class) || ServiceSummaryWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ServiceSummaryWidgetDefinition.class.equals(Integer.class) || ServiceSummaryWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ServiceSummaryWidgetDefinition.class.equals(Float.class) || ServiceSummaryWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ServiceSummaryWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ServiceSummaryWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceSummaryWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ServiceSummaryWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ServiceSummaryWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ServiceSummaryWidgetDefinition'", e);
            }
            
            // deserialize SplitGraphWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SplitGraphWidgetDefinition.class.equals(Integer.class) || SplitGraphWidgetDefinition.class.equals(Long.class) || SplitGraphWidgetDefinition.class.equals(Float.class) || SplitGraphWidgetDefinition.class.equals(Double.class) || SplitGraphWidgetDefinition.class.equals(Boolean.class) || SplitGraphWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SplitGraphWidgetDefinition.class.equals(Integer.class) || SplitGraphWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SplitGraphWidgetDefinition.class.equals(Float.class) || SplitGraphWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SplitGraphWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SplitGraphWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SplitGraphWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SplitGraphWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SplitGraphWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SplitGraphWidgetDefinition'", e);
            }
            
            // deserialize SunburstWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SunburstWidgetDefinition.class.equals(Integer.class) || SunburstWidgetDefinition.class.equals(Long.class) || SunburstWidgetDefinition.class.equals(Float.class) || SunburstWidgetDefinition.class.equals(Double.class) || SunburstWidgetDefinition.class.equals(Boolean.class) || SunburstWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SunburstWidgetDefinition.class.equals(Integer.class) || SunburstWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SunburstWidgetDefinition.class.equals(Float.class) || SunburstWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (SunburstWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SunburstWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((SunburstWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'SunburstWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SunburstWidgetDefinition'", e);
            }
            
            // deserialize TableWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TableWidgetDefinition.class.equals(Integer.class) || TableWidgetDefinition.class.equals(Long.class) || TableWidgetDefinition.class.equals(Float.class) || TableWidgetDefinition.class.equals(Double.class) || TableWidgetDefinition.class.equals(Boolean.class) || TableWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TableWidgetDefinition.class.equals(Integer.class) || TableWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TableWidgetDefinition.class.equals(Float.class) || TableWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TableWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TableWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TableWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TableWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TableWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TableWidgetDefinition'", e);
            }
            
            // deserialize TimeseriesWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeseriesWidgetDefinition.class.equals(Integer.class) || TimeseriesWidgetDefinition.class.equals(Long.class) || TimeseriesWidgetDefinition.class.equals(Float.class) || TimeseriesWidgetDefinition.class.equals(Double.class) || TimeseriesWidgetDefinition.class.equals(Boolean.class) || TimeseriesWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeseriesWidgetDefinition.class.equals(Integer.class) || TimeseriesWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeseriesWidgetDefinition.class.equals(Float.class) || TimeseriesWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TimeseriesWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeseriesWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TimeseriesWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetDefinition'", e);
            }
            
            // deserialize ToplistWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ToplistWidgetDefinition.class.equals(Integer.class) || ToplistWidgetDefinition.class.equals(Long.class) || ToplistWidgetDefinition.class.equals(Float.class) || ToplistWidgetDefinition.class.equals(Double.class) || ToplistWidgetDefinition.class.equals(Boolean.class) || ToplistWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ToplistWidgetDefinition.class.equals(Integer.class) || ToplistWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ToplistWidgetDefinition.class.equals(Float.class) || ToplistWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ToplistWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ToplistWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ToplistWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ToplistWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ToplistWidgetDefinition'", e);
            }
            
            // deserialize TopologyMapWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TopologyMapWidgetDefinition.class.equals(Integer.class) || TopologyMapWidgetDefinition.class.equals(Long.class) || TopologyMapWidgetDefinition.class.equals(Float.class) || TopologyMapWidgetDefinition.class.equals(Double.class) || TopologyMapWidgetDefinition.class.equals(Boolean.class) || TopologyMapWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TopologyMapWidgetDefinition.class.equals(Integer.class) || TopologyMapWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TopologyMapWidgetDefinition.class.equals(Float.class) || TopologyMapWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TopologyMapWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TopologyMapWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TopologyMapWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TopologyMapWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TopologyMapWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TopologyMapWidgetDefinition'", e);
            }
            
            // deserialize TreeMapWidgetDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TreeMapWidgetDefinition.class.equals(Integer.class) || TreeMapWidgetDefinition.class.equals(Long.class) || TreeMapWidgetDefinition.class.equals(Float.class) || TreeMapWidgetDefinition.class.equals(Double.class) || TreeMapWidgetDefinition.class.equals(Boolean.class) || TreeMapWidgetDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TreeMapWidgetDefinition.class.equals(Integer.class) || TreeMapWidgetDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TreeMapWidgetDefinition.class.equals(Float.class) || TreeMapWidgetDefinition.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (TreeMapWidgetDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TreeMapWidgetDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(TreeMapWidgetDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((TreeMapWidgetDefinition)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'TreeMapWidgetDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TreeMapWidgetDefinition'", e);
            }
            
            WidgetDefinition ret = new WidgetDefinition();
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
        public WidgetDefinition getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "WidgetDefinition cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public WidgetDefinition() {
        super("oneOf", Boolean.FALSE);
    }
    public WidgetDefinition(AlertGraphWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(AlertValueWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(BarChartWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(ChangeWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(CheckStatusWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(DistributionWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(EventStreamWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(EventTimelineWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(FreeTextWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(FunnelWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(GeomapWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(GroupWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(HeatMapWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(HostMapWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(IFrameWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(ImageWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(ListStreamWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(LogStreamWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(MonitorSummaryWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(NoteWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(PowerpackWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(QueryValueWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(RunWorkflowWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(SLOListWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(SLOWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(ScatterPlotWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(ServiceMapWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(ServiceSummaryWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(SplitGraphWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(SunburstWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(TableWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(TimeseriesWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(ToplistWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(TopologyMapWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public WidgetDefinition(TreeMapWidgetDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AlertGraphWidgetDefinition", new GenericType<AlertGraphWidgetDefinition>() {
        });
        schemas.put("AlertValueWidgetDefinition", new GenericType<AlertValueWidgetDefinition>() {
        });
        schemas.put("BarChartWidgetDefinition", new GenericType<BarChartWidgetDefinition>() {
        });
        schemas.put("ChangeWidgetDefinition", new GenericType<ChangeWidgetDefinition>() {
        });
        schemas.put("CheckStatusWidgetDefinition", new GenericType<CheckStatusWidgetDefinition>() {
        });
        schemas.put("DistributionWidgetDefinition", new GenericType<DistributionWidgetDefinition>() {
        });
        schemas.put("EventStreamWidgetDefinition", new GenericType<EventStreamWidgetDefinition>() {
        });
        schemas.put("EventTimelineWidgetDefinition", new GenericType<EventTimelineWidgetDefinition>() {
        });
        schemas.put("FreeTextWidgetDefinition", new GenericType<FreeTextWidgetDefinition>() {
        });
        schemas.put("FunnelWidgetDefinition", new GenericType<FunnelWidgetDefinition>() {
        });
        schemas.put("GeomapWidgetDefinition", new GenericType<GeomapWidgetDefinition>() {
        });
        schemas.put("GroupWidgetDefinition", new GenericType<GroupWidgetDefinition>() {
        });
        schemas.put("HeatMapWidgetDefinition", new GenericType<HeatMapWidgetDefinition>() {
        });
        schemas.put("HostMapWidgetDefinition", new GenericType<HostMapWidgetDefinition>() {
        });
        schemas.put("IFrameWidgetDefinition", new GenericType<IFrameWidgetDefinition>() {
        });
        schemas.put("ImageWidgetDefinition", new GenericType<ImageWidgetDefinition>() {
        });
        schemas.put("ListStreamWidgetDefinition", new GenericType<ListStreamWidgetDefinition>() {
        });
        schemas.put("LogStreamWidgetDefinition", new GenericType<LogStreamWidgetDefinition>() {
        });
        schemas.put("MonitorSummaryWidgetDefinition", new GenericType<MonitorSummaryWidgetDefinition>() {
        });
        schemas.put("NoteWidgetDefinition", new GenericType<NoteWidgetDefinition>() {
        });
        schemas.put("PowerpackWidgetDefinition", new GenericType<PowerpackWidgetDefinition>() {
        });
        schemas.put("QueryValueWidgetDefinition", new GenericType<QueryValueWidgetDefinition>() {
        });
        schemas.put("RunWorkflowWidgetDefinition", new GenericType<RunWorkflowWidgetDefinition>() {
        });
        schemas.put("SLOListWidgetDefinition", new GenericType<SLOListWidgetDefinition>() {
        });
        schemas.put("SLOWidgetDefinition", new GenericType<SLOWidgetDefinition>() {
        });
        schemas.put("ScatterPlotWidgetDefinition", new GenericType<ScatterPlotWidgetDefinition>() {
        });
        schemas.put("ServiceMapWidgetDefinition", new GenericType<ServiceMapWidgetDefinition>() {
        });
        schemas.put("ServiceSummaryWidgetDefinition", new GenericType<ServiceSummaryWidgetDefinition>() {
        });
        schemas.put("SplitGraphWidgetDefinition", new GenericType<SplitGraphWidgetDefinition>() {
        });
        schemas.put("SunburstWidgetDefinition", new GenericType<SunburstWidgetDefinition>() {
        });
        schemas.put("TableWidgetDefinition", new GenericType<TableWidgetDefinition>() {
        });
        schemas.put("TimeseriesWidgetDefinition", new GenericType<TimeseriesWidgetDefinition>() {
        });
        schemas.put("ToplistWidgetDefinition", new GenericType<ToplistWidgetDefinition>() {
        });
        schemas.put("TopologyMapWidgetDefinition", new GenericType<TopologyMapWidgetDefinition>() {
        });
        schemas.put("TreeMapWidgetDefinition", new GenericType<TreeMapWidgetDefinition>() {
        });
        JSON.registerDescendants(WidgetDefinition.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return WidgetDefinition.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AlertGraphWidgetDefinition, AlertValueWidgetDefinition, BarChartWidgetDefinition, ChangeWidgetDefinition, CheckStatusWidgetDefinition, DistributionWidgetDefinition, EventStreamWidgetDefinition, EventTimelineWidgetDefinition, FreeTextWidgetDefinition, FunnelWidgetDefinition, GeomapWidgetDefinition, GroupWidgetDefinition, HeatMapWidgetDefinition, HostMapWidgetDefinition, IFrameWidgetDefinition, ImageWidgetDefinition, ListStreamWidgetDefinition, LogStreamWidgetDefinition, MonitorSummaryWidgetDefinition, NoteWidgetDefinition, PowerpackWidgetDefinition, QueryValueWidgetDefinition, RunWorkflowWidgetDefinition, SLOListWidgetDefinition, SLOWidgetDefinition, ScatterPlotWidgetDefinition, ServiceMapWidgetDefinition, ServiceSummaryWidgetDefinition, SplitGraphWidgetDefinition, SunburstWidgetDefinition, TableWidgetDefinition, TimeseriesWidgetDefinition, ToplistWidgetDefinition, TopologyMapWidgetDefinition, TreeMapWidgetDefinition
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AlertGraphWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(AlertValueWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(BarChartWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ChangeWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(CheckStatusWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(DistributionWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(EventStreamWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(EventTimelineWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FreeTextWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(FunnelWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GeomapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(GroupWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(HeatMapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(HostMapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(IFrameWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ImageWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ListStreamWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogStreamWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(MonitorSummaryWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(NoteWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(PowerpackWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(QueryValueWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(RunWorkflowWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SLOListWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SLOWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ScatterPlotWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ServiceMapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ServiceSummaryWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SplitGraphWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(SunburstWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(TableWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(TimeseriesWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ToplistWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(TopologyMapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(TreeMapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be AlertGraphWidgetDefinition, AlertValueWidgetDefinition, BarChartWidgetDefinition, ChangeWidgetDefinition, CheckStatusWidgetDefinition, DistributionWidgetDefinition, EventStreamWidgetDefinition, EventTimelineWidgetDefinition, FreeTextWidgetDefinition, FunnelWidgetDefinition, GeomapWidgetDefinition, GroupWidgetDefinition, HeatMapWidgetDefinition, HostMapWidgetDefinition, IFrameWidgetDefinition, ImageWidgetDefinition, ListStreamWidgetDefinition, LogStreamWidgetDefinition, MonitorSummaryWidgetDefinition, NoteWidgetDefinition, PowerpackWidgetDefinition, QueryValueWidgetDefinition, RunWorkflowWidgetDefinition, SLOListWidgetDefinition, SLOWidgetDefinition, ScatterPlotWidgetDefinition, ServiceMapWidgetDefinition, ServiceSummaryWidgetDefinition, SplitGraphWidgetDefinition, SunburstWidgetDefinition, TableWidgetDefinition, TimeseriesWidgetDefinition, ToplistWidgetDefinition, TopologyMapWidgetDefinition, TreeMapWidgetDefinition");
    }

    /**
     * Get the actual instance, which can be the following:
     * AlertGraphWidgetDefinition, AlertValueWidgetDefinition, BarChartWidgetDefinition, ChangeWidgetDefinition, CheckStatusWidgetDefinition, DistributionWidgetDefinition, EventStreamWidgetDefinition, EventTimelineWidgetDefinition, FreeTextWidgetDefinition, FunnelWidgetDefinition, GeomapWidgetDefinition, GroupWidgetDefinition, HeatMapWidgetDefinition, HostMapWidgetDefinition, IFrameWidgetDefinition, ImageWidgetDefinition, ListStreamWidgetDefinition, LogStreamWidgetDefinition, MonitorSummaryWidgetDefinition, NoteWidgetDefinition, PowerpackWidgetDefinition, QueryValueWidgetDefinition, RunWorkflowWidgetDefinition, SLOListWidgetDefinition, SLOWidgetDefinition, ScatterPlotWidgetDefinition, ServiceMapWidgetDefinition, ServiceSummaryWidgetDefinition, SplitGraphWidgetDefinition, SunburstWidgetDefinition, TableWidgetDefinition, TimeseriesWidgetDefinition, ToplistWidgetDefinition, TopologyMapWidgetDefinition, TreeMapWidgetDefinition
     *
     * @return The actual instance (AlertGraphWidgetDefinition, AlertValueWidgetDefinition, BarChartWidgetDefinition, ChangeWidgetDefinition, CheckStatusWidgetDefinition, DistributionWidgetDefinition, EventStreamWidgetDefinition, EventTimelineWidgetDefinition, FreeTextWidgetDefinition, FunnelWidgetDefinition, GeomapWidgetDefinition, GroupWidgetDefinition, HeatMapWidgetDefinition, HostMapWidgetDefinition, IFrameWidgetDefinition, ImageWidgetDefinition, ListStreamWidgetDefinition, LogStreamWidgetDefinition, MonitorSummaryWidgetDefinition, NoteWidgetDefinition, PowerpackWidgetDefinition, QueryValueWidgetDefinition, RunWorkflowWidgetDefinition, SLOListWidgetDefinition, SLOWidgetDefinition, ScatterPlotWidgetDefinition, ServiceMapWidgetDefinition, ServiceSummaryWidgetDefinition, SplitGraphWidgetDefinition, SunburstWidgetDefinition, TableWidgetDefinition, TimeseriesWidgetDefinition, ToplistWidgetDefinition, TopologyMapWidgetDefinition, TreeMapWidgetDefinition)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlertGraphWidgetDefinition`. If the actual instance is not `AlertGraphWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlertGraphWidgetDefinition`
     * @throws ClassCastException if the instance is not `AlertGraphWidgetDefinition`
     */
    public AlertGraphWidgetDefinition getAlertGraphWidgetDefinition() throws ClassCastException {
        return (AlertGraphWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlertValueWidgetDefinition`. If the actual instance is not `AlertValueWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlertValueWidgetDefinition`
     * @throws ClassCastException if the instance is not `AlertValueWidgetDefinition`
     */
    public AlertValueWidgetDefinition getAlertValueWidgetDefinition() throws ClassCastException {
        return (AlertValueWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BarChartWidgetDefinition`. If the actual instance is not `BarChartWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BarChartWidgetDefinition`
     * @throws ClassCastException if the instance is not `BarChartWidgetDefinition`
     */
    public BarChartWidgetDefinition getBarChartWidgetDefinition() throws ClassCastException {
        return (BarChartWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ChangeWidgetDefinition`. If the actual instance is not `ChangeWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChangeWidgetDefinition`
     * @throws ClassCastException if the instance is not `ChangeWidgetDefinition`
     */
    public ChangeWidgetDefinition getChangeWidgetDefinition() throws ClassCastException {
        return (ChangeWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckStatusWidgetDefinition`. If the actual instance is not `CheckStatusWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckStatusWidgetDefinition`
     * @throws ClassCastException if the instance is not `CheckStatusWidgetDefinition`
     */
    public CheckStatusWidgetDefinition getCheckStatusWidgetDefinition() throws ClassCastException {
        return (CheckStatusWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DistributionWidgetDefinition`. If the actual instance is not `DistributionWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DistributionWidgetDefinition`
     * @throws ClassCastException if the instance is not `DistributionWidgetDefinition`
     */
    public DistributionWidgetDefinition getDistributionWidgetDefinition() throws ClassCastException {
        return (DistributionWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EventStreamWidgetDefinition`. If the actual instance is not `EventStreamWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EventStreamWidgetDefinition`
     * @throws ClassCastException if the instance is not `EventStreamWidgetDefinition`
     */
    public EventStreamWidgetDefinition getEventStreamWidgetDefinition() throws ClassCastException {
        return (EventStreamWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EventTimelineWidgetDefinition`. If the actual instance is not `EventTimelineWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EventTimelineWidgetDefinition`
     * @throws ClassCastException if the instance is not `EventTimelineWidgetDefinition`
     */
    public EventTimelineWidgetDefinition getEventTimelineWidgetDefinition() throws ClassCastException {
        return (EventTimelineWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FreeTextWidgetDefinition`. If the actual instance is not `FreeTextWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FreeTextWidgetDefinition`
     * @throws ClassCastException if the instance is not `FreeTextWidgetDefinition`
     */
    public FreeTextWidgetDefinition getFreeTextWidgetDefinition() throws ClassCastException {
        return (FreeTextWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FunnelWidgetDefinition`. If the actual instance is not `FunnelWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FunnelWidgetDefinition`
     * @throws ClassCastException if the instance is not `FunnelWidgetDefinition`
     */
    public FunnelWidgetDefinition getFunnelWidgetDefinition() throws ClassCastException {
        return (FunnelWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GeomapWidgetDefinition`. If the actual instance is not `GeomapWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GeomapWidgetDefinition`
     * @throws ClassCastException if the instance is not `GeomapWidgetDefinition`
     */
    public GeomapWidgetDefinition getGeomapWidgetDefinition() throws ClassCastException {
        return (GeomapWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GroupWidgetDefinition`. If the actual instance is not `GroupWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GroupWidgetDefinition`
     * @throws ClassCastException if the instance is not `GroupWidgetDefinition`
     */
    public GroupWidgetDefinition getGroupWidgetDefinition() throws ClassCastException {
        return (GroupWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HeatMapWidgetDefinition`. If the actual instance is not `HeatMapWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HeatMapWidgetDefinition`
     * @throws ClassCastException if the instance is not `HeatMapWidgetDefinition`
     */
    public HeatMapWidgetDefinition getHeatMapWidgetDefinition() throws ClassCastException {
        return (HeatMapWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HostMapWidgetDefinition`. If the actual instance is not `HostMapWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HostMapWidgetDefinition`
     * @throws ClassCastException if the instance is not `HostMapWidgetDefinition`
     */
    public HostMapWidgetDefinition getHostMapWidgetDefinition() throws ClassCastException {
        return (HostMapWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `IFrameWidgetDefinition`. If the actual instance is not `IFrameWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IFrameWidgetDefinition`
     * @throws ClassCastException if the instance is not `IFrameWidgetDefinition`
     */
    public IFrameWidgetDefinition getIFrameWidgetDefinition() throws ClassCastException {
        return (IFrameWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ImageWidgetDefinition`. If the actual instance is not `ImageWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ImageWidgetDefinition`
     * @throws ClassCastException if the instance is not `ImageWidgetDefinition`
     */
    public ImageWidgetDefinition getImageWidgetDefinition() throws ClassCastException {
        return (ImageWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListStreamWidgetDefinition`. If the actual instance is not `ListStreamWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListStreamWidgetDefinition`
     * @throws ClassCastException if the instance is not `ListStreamWidgetDefinition`
     */
    public ListStreamWidgetDefinition getListStreamWidgetDefinition() throws ClassCastException {
        return (ListStreamWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogStreamWidgetDefinition`. If the actual instance is not `LogStreamWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogStreamWidgetDefinition`
     * @throws ClassCastException if the instance is not `LogStreamWidgetDefinition`
     */
    public LogStreamWidgetDefinition getLogStreamWidgetDefinition() throws ClassCastException {
        return (LogStreamWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MonitorSummaryWidgetDefinition`. If the actual instance is not `MonitorSummaryWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MonitorSummaryWidgetDefinition`
     * @throws ClassCastException if the instance is not `MonitorSummaryWidgetDefinition`
     */
    public MonitorSummaryWidgetDefinition getMonitorSummaryWidgetDefinition() throws ClassCastException {
        return (MonitorSummaryWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NoteWidgetDefinition`. If the actual instance is not `NoteWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NoteWidgetDefinition`
     * @throws ClassCastException if the instance is not `NoteWidgetDefinition`
     */
    public NoteWidgetDefinition getNoteWidgetDefinition() throws ClassCastException {
        return (NoteWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PowerpackWidgetDefinition`. If the actual instance is not `PowerpackWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PowerpackWidgetDefinition`
     * @throws ClassCastException if the instance is not `PowerpackWidgetDefinition`
     */
    public PowerpackWidgetDefinition getPowerpackWidgetDefinition() throws ClassCastException {
        return (PowerpackWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QueryValueWidgetDefinition`. If the actual instance is not `QueryValueWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QueryValueWidgetDefinition`
     * @throws ClassCastException if the instance is not `QueryValueWidgetDefinition`
     */
    public QueryValueWidgetDefinition getQueryValueWidgetDefinition() throws ClassCastException {
        return (QueryValueWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunWorkflowWidgetDefinition`. If the actual instance is not `RunWorkflowWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunWorkflowWidgetDefinition`
     * @throws ClassCastException if the instance is not `RunWorkflowWidgetDefinition`
     */
    public RunWorkflowWidgetDefinition getRunWorkflowWidgetDefinition() throws ClassCastException {
        return (RunWorkflowWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SLOListWidgetDefinition`. If the actual instance is not `SLOListWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SLOListWidgetDefinition`
     * @throws ClassCastException if the instance is not `SLOListWidgetDefinition`
     */
    public SLOListWidgetDefinition getSLOListWidgetDefinition() throws ClassCastException {
        return (SLOListWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SLOWidgetDefinition`. If the actual instance is not `SLOWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SLOWidgetDefinition`
     * @throws ClassCastException if the instance is not `SLOWidgetDefinition`
     */
    public SLOWidgetDefinition getSLOWidgetDefinition() throws ClassCastException {
        return (SLOWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScatterPlotWidgetDefinition`. If the actual instance is not `ScatterPlotWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScatterPlotWidgetDefinition`
     * @throws ClassCastException if the instance is not `ScatterPlotWidgetDefinition`
     */
    public ScatterPlotWidgetDefinition getScatterPlotWidgetDefinition() throws ClassCastException {
        return (ScatterPlotWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceMapWidgetDefinition`. If the actual instance is not `ServiceMapWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceMapWidgetDefinition`
     * @throws ClassCastException if the instance is not `ServiceMapWidgetDefinition`
     */
    public ServiceMapWidgetDefinition getServiceMapWidgetDefinition() throws ClassCastException {
        return (ServiceMapWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceSummaryWidgetDefinition`. If the actual instance is not `ServiceSummaryWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceSummaryWidgetDefinition`
     * @throws ClassCastException if the instance is not `ServiceSummaryWidgetDefinition`
     */
    public ServiceSummaryWidgetDefinition getServiceSummaryWidgetDefinition() throws ClassCastException {
        return (ServiceSummaryWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SplitGraphWidgetDefinition`. If the actual instance is not `SplitGraphWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SplitGraphWidgetDefinition`
     * @throws ClassCastException if the instance is not `SplitGraphWidgetDefinition`
     */
    public SplitGraphWidgetDefinition getSplitGraphWidgetDefinition() throws ClassCastException {
        return (SplitGraphWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SunburstWidgetDefinition`. If the actual instance is not `SunburstWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SunburstWidgetDefinition`
     * @throws ClassCastException if the instance is not `SunburstWidgetDefinition`
     */
    public SunburstWidgetDefinition getSunburstWidgetDefinition() throws ClassCastException {
        return (SunburstWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TableWidgetDefinition`. If the actual instance is not `TableWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TableWidgetDefinition`
     * @throws ClassCastException if the instance is not `TableWidgetDefinition`
     */
    public TableWidgetDefinition getTableWidgetDefinition() throws ClassCastException {
        return (TableWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeseriesWidgetDefinition`. If the actual instance is not `TimeseriesWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeseriesWidgetDefinition`
     * @throws ClassCastException if the instance is not `TimeseriesWidgetDefinition`
     */
    public TimeseriesWidgetDefinition getTimeseriesWidgetDefinition() throws ClassCastException {
        return (TimeseriesWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ToplistWidgetDefinition`. If the actual instance is not `ToplistWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ToplistWidgetDefinition`
     * @throws ClassCastException if the instance is not `ToplistWidgetDefinition`
     */
    public ToplistWidgetDefinition getToplistWidgetDefinition() throws ClassCastException {
        return (ToplistWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TopologyMapWidgetDefinition`. If the actual instance is not `TopologyMapWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TopologyMapWidgetDefinition`
     * @throws ClassCastException if the instance is not `TopologyMapWidgetDefinition`
     */
    public TopologyMapWidgetDefinition getTopologyMapWidgetDefinition() throws ClassCastException {
        return (TopologyMapWidgetDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TreeMapWidgetDefinition`. If the actual instance is not `TreeMapWidgetDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TreeMapWidgetDefinition`
     * @throws ClassCastException if the instance is not `TreeMapWidgetDefinition`
     */
    public TreeMapWidgetDefinition getTreeMapWidgetDefinition() throws ClassCastException {
        return (TreeMapWidgetDefinition)super.getActualInstance();
    }
}
