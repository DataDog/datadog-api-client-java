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
@JsonDeserialize(using = LogsProcessor.LogsProcessorDeserializer.class)
@JsonSerialize(using = LogsProcessor.LogsProcessorSerializer.class)
public class LogsProcessor extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LogsProcessor.class.getName());

    @JsonIgnore
    public boolean unparsed = false;

    public static class LogsProcessorSerializer extends StdSerializer<LogsProcessor> {
        public LogsProcessorSerializer(Class<LogsProcessor> t) {
            super(t);
        }

        public LogsProcessorSerializer() {
            this(null);
        }

        @Override
        public void serialize(LogsProcessor value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class LogsProcessorDeserializer extends StdDeserializer<LogsProcessor> {
        public LogsProcessorDeserializer() {
            this(LogsProcessor.class);
        }

        public LogsProcessorDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public LogsProcessor deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Object tmp = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize LogsGrokParser
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsGrokParser.class.equals(Integer.class) || LogsGrokParser.class.equals(Long.class) || LogsGrokParser.class.equals(Float.class) || LogsGrokParser.class.equals(Double.class) || LogsGrokParser.class.equals(Boolean.class) || LogsGrokParser.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsGrokParser.class.equals(Integer.class) || LogsGrokParser.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsGrokParser.class.equals(Float.class) || LogsGrokParser.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsGrokParser.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsGrokParser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsGrokParser.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsGrokParser)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsGrokParser'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsGrokParser'", e);
            }
            
            // deserialize LogsDateRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsDateRemapper.class.equals(Integer.class) || LogsDateRemapper.class.equals(Long.class) || LogsDateRemapper.class.equals(Float.class) || LogsDateRemapper.class.equals(Double.class) || LogsDateRemapper.class.equals(Boolean.class) || LogsDateRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsDateRemapper.class.equals(Integer.class) || LogsDateRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsDateRemapper.class.equals(Float.class) || LogsDateRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsDateRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsDateRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsDateRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsDateRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsDateRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsDateRemapper'", e);
            }
            
            // deserialize LogsStatusRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsStatusRemapper.class.equals(Integer.class) || LogsStatusRemapper.class.equals(Long.class) || LogsStatusRemapper.class.equals(Float.class) || LogsStatusRemapper.class.equals(Double.class) || LogsStatusRemapper.class.equals(Boolean.class) || LogsStatusRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsStatusRemapper.class.equals(Integer.class) || LogsStatusRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsStatusRemapper.class.equals(Float.class) || LogsStatusRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsStatusRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsStatusRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsStatusRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsStatusRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsStatusRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsStatusRemapper'", e);
            }
            
            // deserialize LogsServiceRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsServiceRemapper.class.equals(Integer.class) || LogsServiceRemapper.class.equals(Long.class) || LogsServiceRemapper.class.equals(Float.class) || LogsServiceRemapper.class.equals(Double.class) || LogsServiceRemapper.class.equals(Boolean.class) || LogsServiceRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsServiceRemapper.class.equals(Integer.class) || LogsServiceRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsServiceRemapper.class.equals(Float.class) || LogsServiceRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsServiceRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsServiceRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsServiceRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsServiceRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsServiceRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsServiceRemapper'", e);
            }
            
            // deserialize LogsMessageRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsMessageRemapper.class.equals(Integer.class) || LogsMessageRemapper.class.equals(Long.class) || LogsMessageRemapper.class.equals(Float.class) || LogsMessageRemapper.class.equals(Double.class) || LogsMessageRemapper.class.equals(Boolean.class) || LogsMessageRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsMessageRemapper.class.equals(Integer.class) || LogsMessageRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsMessageRemapper.class.equals(Float.class) || LogsMessageRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsMessageRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsMessageRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsMessageRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsMessageRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsMessageRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsMessageRemapper'", e);
            }
            
            // deserialize LogsAttributeRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsAttributeRemapper.class.equals(Integer.class) || LogsAttributeRemapper.class.equals(Long.class) || LogsAttributeRemapper.class.equals(Float.class) || LogsAttributeRemapper.class.equals(Double.class) || LogsAttributeRemapper.class.equals(Boolean.class) || LogsAttributeRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsAttributeRemapper.class.equals(Integer.class) || LogsAttributeRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsAttributeRemapper.class.equals(Float.class) || LogsAttributeRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsAttributeRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsAttributeRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsAttributeRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsAttributeRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsAttributeRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsAttributeRemapper'", e);
            }
            
            // deserialize LogsURLParser
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsURLParser.class.equals(Integer.class) || LogsURLParser.class.equals(Long.class) || LogsURLParser.class.equals(Float.class) || LogsURLParser.class.equals(Double.class) || LogsURLParser.class.equals(Boolean.class) || LogsURLParser.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsURLParser.class.equals(Integer.class) || LogsURLParser.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsURLParser.class.equals(Float.class) || LogsURLParser.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsURLParser.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsURLParser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsURLParser.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsURLParser)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsURLParser'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsURLParser'", e);
            }
            
            // deserialize LogsUserAgentParser
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsUserAgentParser.class.equals(Integer.class) || LogsUserAgentParser.class.equals(Long.class) || LogsUserAgentParser.class.equals(Float.class) || LogsUserAgentParser.class.equals(Double.class) || LogsUserAgentParser.class.equals(Boolean.class) || LogsUserAgentParser.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsUserAgentParser.class.equals(Integer.class) || LogsUserAgentParser.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsUserAgentParser.class.equals(Float.class) || LogsUserAgentParser.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsUserAgentParser.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsUserAgentParser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsUserAgentParser.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsUserAgentParser)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsUserAgentParser'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsUserAgentParser'", e);
            }
            
            // deserialize LogsCategoryProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsCategoryProcessor.class.equals(Integer.class) || LogsCategoryProcessor.class.equals(Long.class) || LogsCategoryProcessor.class.equals(Float.class) || LogsCategoryProcessor.class.equals(Double.class) || LogsCategoryProcessor.class.equals(Boolean.class) || LogsCategoryProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsCategoryProcessor.class.equals(Integer.class) || LogsCategoryProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsCategoryProcessor.class.equals(Float.class) || LogsCategoryProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsCategoryProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsCategoryProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsCategoryProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsCategoryProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsCategoryProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsCategoryProcessor'", e);
            }
            
            // deserialize LogsArithmeticProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsArithmeticProcessor.class.equals(Integer.class) || LogsArithmeticProcessor.class.equals(Long.class) || LogsArithmeticProcessor.class.equals(Float.class) || LogsArithmeticProcessor.class.equals(Double.class) || LogsArithmeticProcessor.class.equals(Boolean.class) || LogsArithmeticProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsArithmeticProcessor.class.equals(Integer.class) || LogsArithmeticProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsArithmeticProcessor.class.equals(Float.class) || LogsArithmeticProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsArithmeticProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsArithmeticProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArithmeticProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsArithmeticProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsArithmeticProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsArithmeticProcessor'", e);
            }
            
            // deserialize LogsStringBuilderProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsStringBuilderProcessor.class.equals(Integer.class) || LogsStringBuilderProcessor.class.equals(Long.class) || LogsStringBuilderProcessor.class.equals(Float.class) || LogsStringBuilderProcessor.class.equals(Double.class) || LogsStringBuilderProcessor.class.equals(Boolean.class) || LogsStringBuilderProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsStringBuilderProcessor.class.equals(Integer.class) || LogsStringBuilderProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsStringBuilderProcessor.class.equals(Float.class) || LogsStringBuilderProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsStringBuilderProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsStringBuilderProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsStringBuilderProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsStringBuilderProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsStringBuilderProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsStringBuilderProcessor'", e);
            }
            
            // deserialize LogsPipelineProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsPipelineProcessor.class.equals(Integer.class) || LogsPipelineProcessor.class.equals(Long.class) || LogsPipelineProcessor.class.equals(Float.class) || LogsPipelineProcessor.class.equals(Double.class) || LogsPipelineProcessor.class.equals(Boolean.class) || LogsPipelineProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsPipelineProcessor.class.equals(Integer.class) || LogsPipelineProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsPipelineProcessor.class.equals(Float.class) || LogsPipelineProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsPipelineProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsPipelineProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsPipelineProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsPipelineProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsPipelineProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsPipelineProcessor'", e);
            }
            
            // deserialize LogsGeoIPParser
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsGeoIPParser.class.equals(Integer.class) || LogsGeoIPParser.class.equals(Long.class) || LogsGeoIPParser.class.equals(Float.class) || LogsGeoIPParser.class.equals(Double.class) || LogsGeoIPParser.class.equals(Boolean.class) || LogsGeoIPParser.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsGeoIPParser.class.equals(Integer.class) || LogsGeoIPParser.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsGeoIPParser.class.equals(Float.class) || LogsGeoIPParser.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsGeoIPParser.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsGeoIPParser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsGeoIPParser.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsGeoIPParser)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsGeoIPParser'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsGeoIPParser'", e);
            }
            
            // deserialize LogsLookupProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsLookupProcessor.class.equals(Integer.class) || LogsLookupProcessor.class.equals(Long.class) || LogsLookupProcessor.class.equals(Float.class) || LogsLookupProcessor.class.equals(Double.class) || LogsLookupProcessor.class.equals(Boolean.class) || LogsLookupProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsLookupProcessor.class.equals(Integer.class) || LogsLookupProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsLookupProcessor.class.equals(Float.class) || LogsLookupProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsLookupProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsLookupProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsLookupProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsLookupProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsLookupProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsLookupProcessor'", e);
            }
            
            // deserialize ReferenceTableLogsLookupProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ReferenceTableLogsLookupProcessor.class.equals(Integer.class) || ReferenceTableLogsLookupProcessor.class.equals(Long.class) || ReferenceTableLogsLookupProcessor.class.equals(Float.class) || ReferenceTableLogsLookupProcessor.class.equals(Double.class) || ReferenceTableLogsLookupProcessor.class.equals(Boolean.class) || ReferenceTableLogsLookupProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ReferenceTableLogsLookupProcessor.class.equals(Integer.class) || ReferenceTableLogsLookupProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ReferenceTableLogsLookupProcessor.class.equals(Float.class) || ReferenceTableLogsLookupProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (ReferenceTableLogsLookupProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ReferenceTableLogsLookupProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(ReferenceTableLogsLookupProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((ReferenceTableLogsLookupProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'ReferenceTableLogsLookupProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ReferenceTableLogsLookupProcessor'", e);
            }
            
            // deserialize LogsTraceRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsTraceRemapper.class.equals(Integer.class) || LogsTraceRemapper.class.equals(Long.class) || LogsTraceRemapper.class.equals(Float.class) || LogsTraceRemapper.class.equals(Double.class) || LogsTraceRemapper.class.equals(Boolean.class) || LogsTraceRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsTraceRemapper.class.equals(Integer.class) || LogsTraceRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsTraceRemapper.class.equals(Float.class) || LogsTraceRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsTraceRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsTraceRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsTraceRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsTraceRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsTraceRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsTraceRemapper'", e);
            }
            
            // deserialize LogsSpanRemapper
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsSpanRemapper.class.equals(Integer.class) || LogsSpanRemapper.class.equals(Long.class) || LogsSpanRemapper.class.equals(Float.class) || LogsSpanRemapper.class.equals(Double.class) || LogsSpanRemapper.class.equals(Boolean.class) || LogsSpanRemapper.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsSpanRemapper.class.equals(Integer.class) || LogsSpanRemapper.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsSpanRemapper.class.equals(Float.class) || LogsSpanRemapper.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsSpanRemapper.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsSpanRemapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsSpanRemapper.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsSpanRemapper)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsSpanRemapper'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsSpanRemapper'", e);
            }
            
            // deserialize LogsArrayProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsArrayProcessor.class.equals(Integer.class) || LogsArrayProcessor.class.equals(Long.class) || LogsArrayProcessor.class.equals(Float.class) || LogsArrayProcessor.class.equals(Double.class) || LogsArrayProcessor.class.equals(Boolean.class) || LogsArrayProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsArrayProcessor.class.equals(Integer.class) || LogsArrayProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsArrayProcessor.class.equals(Float.class) || LogsArrayProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsArrayProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsArrayProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArrayProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsArrayProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsArrayProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsArrayProcessor'", e);
            }
            
            // deserialize LogsDecoderProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsDecoderProcessor.class.equals(Integer.class) || LogsDecoderProcessor.class.equals(Long.class) || LogsDecoderProcessor.class.equals(Float.class) || LogsDecoderProcessor.class.equals(Double.class) || LogsDecoderProcessor.class.equals(Boolean.class) || LogsDecoderProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsDecoderProcessor.class.equals(Integer.class) || LogsDecoderProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsDecoderProcessor.class.equals(Float.class) || LogsDecoderProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsDecoderProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsDecoderProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsDecoderProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsDecoderProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsDecoderProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsDecoderProcessor'", e);
            }
            
            // deserialize LogsSchemaProcessor
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (LogsSchemaProcessor.class.equals(Integer.class) || LogsSchemaProcessor.class.equals(Long.class) || LogsSchemaProcessor.class.equals(Float.class) || LogsSchemaProcessor.class.equals(Double.class) || LogsSchemaProcessor.class.equals(Boolean.class) || LogsSchemaProcessor.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((LogsSchemaProcessor.class.equals(Integer.class) || LogsSchemaProcessor.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((LogsSchemaProcessor.class.equals(Float.class) || LogsSchemaProcessor.class.equals(Double.class)) && (token == JsonToken.VALUE_NUMBER_FLOAT || token == JsonToken.VALUE_NUMBER_INT));
                        attemptParsing |= (LogsSchemaProcessor.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (LogsSchemaProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    tmp = tree.traverse(jp.getCodec()).readValueAs(LogsSchemaProcessor.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    if (!((LogsSchemaProcessor)tmp).unparsed) {
                        deserialized = tmp;
                        match++;
                    }
                    log.log(Level.FINER, "Input data matches schema 'LogsSchemaProcessor'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'LogsSchemaProcessor'", e);
            }
            
            LogsProcessor ret = new LogsProcessor();
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
        public LogsProcessor getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "LogsProcessor cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public LogsProcessor() {
        super("oneOf", Boolean.FALSE);
    }
    public LogsProcessor(LogsGrokParser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsDateRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsStatusRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsServiceRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsMessageRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsAttributeRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsURLParser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsUserAgentParser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsCategoryProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsArithmeticProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsStringBuilderProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsPipelineProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsGeoIPParser o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsLookupProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(ReferenceTableLogsLookupProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsTraceRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsSpanRemapper o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsArrayProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsDecoderProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public LogsProcessor(LogsSchemaProcessor o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LogsGrokParser", new GenericType<LogsGrokParser>() {
        });
        schemas.put("LogsDateRemapper", new GenericType<LogsDateRemapper>() {
        });
        schemas.put("LogsStatusRemapper", new GenericType<LogsStatusRemapper>() {
        });
        schemas.put("LogsServiceRemapper", new GenericType<LogsServiceRemapper>() {
        });
        schemas.put("LogsMessageRemapper", new GenericType<LogsMessageRemapper>() {
        });
        schemas.put("LogsAttributeRemapper", new GenericType<LogsAttributeRemapper>() {
        });
        schemas.put("LogsURLParser", new GenericType<LogsURLParser>() {
        });
        schemas.put("LogsUserAgentParser", new GenericType<LogsUserAgentParser>() {
        });
        schemas.put("LogsCategoryProcessor", new GenericType<LogsCategoryProcessor>() {
        });
        schemas.put("LogsArithmeticProcessor", new GenericType<LogsArithmeticProcessor>() {
        });
        schemas.put("LogsStringBuilderProcessor", new GenericType<LogsStringBuilderProcessor>() {
        });
        schemas.put("LogsPipelineProcessor", new GenericType<LogsPipelineProcessor>() {
        });
        schemas.put("LogsGeoIPParser", new GenericType<LogsGeoIPParser>() {
        });
        schemas.put("LogsLookupProcessor", new GenericType<LogsLookupProcessor>() {
        });
        schemas.put("ReferenceTableLogsLookupProcessor", new GenericType<ReferenceTableLogsLookupProcessor>() {
        });
        schemas.put("LogsTraceRemapper", new GenericType<LogsTraceRemapper>() {
        });
        schemas.put("LogsSpanRemapper", new GenericType<LogsSpanRemapper>() {
        });
        schemas.put("LogsArrayProcessor", new GenericType<LogsArrayProcessor>() {
        });
        schemas.put("LogsDecoderProcessor", new GenericType<LogsDecoderProcessor>() {
        });
        schemas.put("LogsSchemaProcessor", new GenericType<LogsSchemaProcessor>() {
        });
        JSON.registerDescendants(LogsProcessor.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return LogsProcessor.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LogsGrokParser, LogsDateRemapper, LogsStatusRemapper, LogsServiceRemapper, LogsMessageRemapper, LogsAttributeRemapper, LogsURLParser, LogsUserAgentParser, LogsCategoryProcessor, LogsArithmeticProcessor, LogsStringBuilderProcessor, LogsPipelineProcessor, LogsGeoIPParser, LogsLookupProcessor, ReferenceTableLogsLookupProcessor, LogsTraceRemapper, LogsSpanRemapper, LogsArrayProcessor, LogsDecoderProcessor, LogsSchemaProcessor
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(LogsGrokParser.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsDateRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsStatusRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsServiceRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsMessageRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsAttributeRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsURLParser.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsUserAgentParser.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsCategoryProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsArithmeticProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsStringBuilderProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsPipelineProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsGeoIPParser.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsLookupProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(ReferenceTableLogsLookupProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsTraceRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsSpanRemapper.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsArrayProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsDecoderProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        if (JSON.isInstanceOf(LogsSchemaProcessor.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException("Invalid instance type. Must be LogsGrokParser, LogsDateRemapper, LogsStatusRemapper, LogsServiceRemapper, LogsMessageRemapper, LogsAttributeRemapper, LogsURLParser, LogsUserAgentParser, LogsCategoryProcessor, LogsArithmeticProcessor, LogsStringBuilderProcessor, LogsPipelineProcessor, LogsGeoIPParser, LogsLookupProcessor, ReferenceTableLogsLookupProcessor, LogsTraceRemapper, LogsSpanRemapper, LogsArrayProcessor, LogsDecoderProcessor, LogsSchemaProcessor");
    }

    /**
     * Get the actual instance, which can be the following:
     * LogsGrokParser, LogsDateRemapper, LogsStatusRemapper, LogsServiceRemapper, LogsMessageRemapper, LogsAttributeRemapper, LogsURLParser, LogsUserAgentParser, LogsCategoryProcessor, LogsArithmeticProcessor, LogsStringBuilderProcessor, LogsPipelineProcessor, LogsGeoIPParser, LogsLookupProcessor, ReferenceTableLogsLookupProcessor, LogsTraceRemapper, LogsSpanRemapper, LogsArrayProcessor, LogsDecoderProcessor, LogsSchemaProcessor
     *
     * @return The actual instance (LogsGrokParser, LogsDateRemapper, LogsStatusRemapper, LogsServiceRemapper, LogsMessageRemapper, LogsAttributeRemapper, LogsURLParser, LogsUserAgentParser, LogsCategoryProcessor, LogsArithmeticProcessor, LogsStringBuilderProcessor, LogsPipelineProcessor, LogsGeoIPParser, LogsLookupProcessor, ReferenceTableLogsLookupProcessor, LogsTraceRemapper, LogsSpanRemapper, LogsArrayProcessor, LogsDecoderProcessor, LogsSchemaProcessor)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsGrokParser`. If the actual instance is not `LogsGrokParser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsGrokParser`
     * @throws ClassCastException if the instance is not `LogsGrokParser`
     */
    public LogsGrokParser getLogsGrokParser() throws ClassCastException {
        return (LogsGrokParser)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsDateRemapper`. If the actual instance is not `LogsDateRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsDateRemapper`
     * @throws ClassCastException if the instance is not `LogsDateRemapper`
     */
    public LogsDateRemapper getLogsDateRemapper() throws ClassCastException {
        return (LogsDateRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsStatusRemapper`. If the actual instance is not `LogsStatusRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsStatusRemapper`
     * @throws ClassCastException if the instance is not `LogsStatusRemapper`
     */
    public LogsStatusRemapper getLogsStatusRemapper() throws ClassCastException {
        return (LogsStatusRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsServiceRemapper`. If the actual instance is not `LogsServiceRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsServiceRemapper`
     * @throws ClassCastException if the instance is not `LogsServiceRemapper`
     */
    public LogsServiceRemapper getLogsServiceRemapper() throws ClassCastException {
        return (LogsServiceRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsMessageRemapper`. If the actual instance is not `LogsMessageRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsMessageRemapper`
     * @throws ClassCastException if the instance is not `LogsMessageRemapper`
     */
    public LogsMessageRemapper getLogsMessageRemapper() throws ClassCastException {
        return (LogsMessageRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsAttributeRemapper`. If the actual instance is not `LogsAttributeRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsAttributeRemapper`
     * @throws ClassCastException if the instance is not `LogsAttributeRemapper`
     */
    public LogsAttributeRemapper getLogsAttributeRemapper() throws ClassCastException {
        return (LogsAttributeRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsURLParser`. If the actual instance is not `LogsURLParser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsURLParser`
     * @throws ClassCastException if the instance is not `LogsURLParser`
     */
    public LogsURLParser getLogsURLParser() throws ClassCastException {
        return (LogsURLParser)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsUserAgentParser`. If the actual instance is not `LogsUserAgentParser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsUserAgentParser`
     * @throws ClassCastException if the instance is not `LogsUserAgentParser`
     */
    public LogsUserAgentParser getLogsUserAgentParser() throws ClassCastException {
        return (LogsUserAgentParser)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsCategoryProcessor`. If the actual instance is not `LogsCategoryProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsCategoryProcessor`
     * @throws ClassCastException if the instance is not `LogsCategoryProcessor`
     */
    public LogsCategoryProcessor getLogsCategoryProcessor() throws ClassCastException {
        return (LogsCategoryProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsArithmeticProcessor`. If the actual instance is not `LogsArithmeticProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsArithmeticProcessor`
     * @throws ClassCastException if the instance is not `LogsArithmeticProcessor`
     */
    public LogsArithmeticProcessor getLogsArithmeticProcessor() throws ClassCastException {
        return (LogsArithmeticProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsStringBuilderProcessor`. If the actual instance is not `LogsStringBuilderProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsStringBuilderProcessor`
     * @throws ClassCastException if the instance is not `LogsStringBuilderProcessor`
     */
    public LogsStringBuilderProcessor getLogsStringBuilderProcessor() throws ClassCastException {
        return (LogsStringBuilderProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsPipelineProcessor`. If the actual instance is not `LogsPipelineProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsPipelineProcessor`
     * @throws ClassCastException if the instance is not `LogsPipelineProcessor`
     */
    public LogsPipelineProcessor getLogsPipelineProcessor() throws ClassCastException {
        return (LogsPipelineProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsGeoIPParser`. If the actual instance is not `LogsGeoIPParser`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsGeoIPParser`
     * @throws ClassCastException if the instance is not `LogsGeoIPParser`
     */
    public LogsGeoIPParser getLogsGeoIPParser() throws ClassCastException {
        return (LogsGeoIPParser)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsLookupProcessor`. If the actual instance is not `LogsLookupProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsLookupProcessor`
     * @throws ClassCastException if the instance is not `LogsLookupProcessor`
     */
    public LogsLookupProcessor getLogsLookupProcessor() throws ClassCastException {
        return (LogsLookupProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReferenceTableLogsLookupProcessor`. If the actual instance is not `ReferenceTableLogsLookupProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReferenceTableLogsLookupProcessor`
     * @throws ClassCastException if the instance is not `ReferenceTableLogsLookupProcessor`
     */
    public ReferenceTableLogsLookupProcessor getReferenceTableLogsLookupProcessor() throws ClassCastException {
        return (ReferenceTableLogsLookupProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsTraceRemapper`. If the actual instance is not `LogsTraceRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsTraceRemapper`
     * @throws ClassCastException if the instance is not `LogsTraceRemapper`
     */
    public LogsTraceRemapper getLogsTraceRemapper() throws ClassCastException {
        return (LogsTraceRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsSpanRemapper`. If the actual instance is not `LogsSpanRemapper`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsSpanRemapper`
     * @throws ClassCastException if the instance is not `LogsSpanRemapper`
     */
    public LogsSpanRemapper getLogsSpanRemapper() throws ClassCastException {
        return (LogsSpanRemapper)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsArrayProcessor`. If the actual instance is not `LogsArrayProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsArrayProcessor`
     * @throws ClassCastException if the instance is not `LogsArrayProcessor`
     */
    public LogsArrayProcessor getLogsArrayProcessor() throws ClassCastException {
        return (LogsArrayProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsDecoderProcessor`. If the actual instance is not `LogsDecoderProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsDecoderProcessor`
     * @throws ClassCastException if the instance is not `LogsDecoderProcessor`
     */
    public LogsDecoderProcessor getLogsDecoderProcessor() throws ClassCastException {
        return (LogsDecoderProcessor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogsSchemaProcessor`. If the actual instance is not `LogsSchemaProcessor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogsSchemaProcessor`
     * @throws ClassCastException if the instance is not `LogsSchemaProcessor`
     */
    public LogsSchemaProcessor getLogsSchemaProcessor() throws ClassCastException {
        return (LogsSchemaProcessor)super.getActualInstance();
    }
}
