/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using =
        ObservabilityPipelineConfigSourceItem.ObservabilityPipelineConfigSourceItemDeserializer
            .class)
@JsonSerialize(
    using =
        ObservabilityPipelineConfigSourceItem.ObservabilityPipelineConfigSourceItemSerializer.class)
public class ObservabilityPipelineConfigSourceItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineConfigSourceItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineConfigSourceItemSerializer
      extends StdSerializer<ObservabilityPipelineConfigSourceItem> {
    public ObservabilityPipelineConfigSourceItemSerializer(
        Class<ObservabilityPipelineConfigSourceItem> t) {
      super(t);
    }

    public ObservabilityPipelineConfigSourceItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineConfigSourceItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineConfigSourceItemDeserializer
      extends StdDeserializer<ObservabilityPipelineConfigSourceItem> {
    public ObservabilityPipelineConfigSourceItemDeserializer() {
      this(ObservabilityPipelineConfigSourceItem.class);
    }

    public ObservabilityPipelineConfigSourceItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineConfigSourceItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineKafkaSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineKafkaSource.class.equals(Integer.class)
            || ObservabilityPipelineKafkaSource.class.equals(Long.class)
            || ObservabilityPipelineKafkaSource.class.equals(Float.class)
            || ObservabilityPipelineKafkaSource.class.equals(Double.class)
            || ObservabilityPipelineKafkaSource.class.equals(Boolean.class)
            || ObservabilityPipelineKafkaSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineKafkaSource.class.equals(Integer.class)
                        || ObservabilityPipelineKafkaSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineKafkaSource.class.equals(Float.class)
                        || ObservabilityPipelineKafkaSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineKafkaSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineKafkaSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineKafkaSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineKafkaSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineKafkaSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ObservabilityPipelineKafkaSource'", e);
      }

      // deserialize ObservabilityPipelineDatadogAgentSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineDatadogAgentSource.class.equals(Integer.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Long.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Float.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Double.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Boolean.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineDatadogAgentSource.class.equals(Integer.class)
                        || ObservabilityPipelineDatadogAgentSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineDatadogAgentSource.class.equals(Float.class)
                        || ObservabilityPipelineDatadogAgentSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineDatadogAgentSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineDatadogAgentSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineDatadogAgentSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineDatadogAgentSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineDatadogAgentSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineDatadogAgentSource'",
            e);
      }

      // deserialize ObservabilityPipelineSplunkTcpSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSplunkTcpSource.class.equals(Integer.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Long.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Float.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Double.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Boolean.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSplunkTcpSource.class.equals(Integer.class)
                        || ObservabilityPipelineSplunkTcpSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSplunkTcpSource.class.equals(Float.class)
                        || ObservabilityPipelineSplunkTcpSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSplunkTcpSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSplunkTcpSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSplunkTcpSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSplunkTcpSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSplunkTcpSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSplunkTcpSource'",
            e);
      }

      // deserialize ObservabilityPipelineSplunkHecSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSplunkHecSource.class.equals(Integer.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Long.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Float.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Double.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Boolean.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSplunkHecSource.class.equals(Integer.class)
                        || ObservabilityPipelineSplunkHecSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSplunkHecSource.class.equals(Float.class)
                        || ObservabilityPipelineSplunkHecSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSplunkHecSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSplunkHecSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSplunkHecSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSplunkHecSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSplunkHecSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSplunkHecSource'",
            e);
      }

      // deserialize ObservabilityPipelineAmazonS3Source
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonS3Source.class.equals(Integer.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Long.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Float.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Double.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3Source.class.equals(Integer.class)
                        || ObservabilityPipelineAmazonS3Source.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3Source.class.equals(Float.class)
                        || ObservabilityPipelineAmazonS3Source.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3Source.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3Source.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAmazonS3Source.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonS3Source) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3Source'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAmazonS3Source'",
            e);
      }

      // deserialize ObservabilityPipelineFluentdSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineFluentdSource.class.equals(Integer.class)
            || ObservabilityPipelineFluentdSource.class.equals(Long.class)
            || ObservabilityPipelineFluentdSource.class.equals(Float.class)
            || ObservabilityPipelineFluentdSource.class.equals(Double.class)
            || ObservabilityPipelineFluentdSource.class.equals(Boolean.class)
            || ObservabilityPipelineFluentdSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineFluentdSource.class.equals(Integer.class)
                        || ObservabilityPipelineFluentdSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineFluentdSource.class.equals(Float.class)
                        || ObservabilityPipelineFluentdSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineFluentdSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineFluentdSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineFluentdSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineFluentdSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineFluentdSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineFluentdSource'",
            e);
      }

      // deserialize ObservabilityPipelineFluentBitSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineFluentBitSource.class.equals(Integer.class)
            || ObservabilityPipelineFluentBitSource.class.equals(Long.class)
            || ObservabilityPipelineFluentBitSource.class.equals(Float.class)
            || ObservabilityPipelineFluentBitSource.class.equals(Double.class)
            || ObservabilityPipelineFluentBitSource.class.equals(Boolean.class)
            || ObservabilityPipelineFluentBitSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineFluentBitSource.class.equals(Integer.class)
                        || ObservabilityPipelineFluentBitSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineFluentBitSource.class.equals(Float.class)
                        || ObservabilityPipelineFluentBitSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineFluentBitSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineFluentBitSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineFluentBitSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineFluentBitSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineFluentBitSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineFluentBitSource'",
            e);
      }

      // deserialize ObservabilityPipelineHttpServerSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineHttpServerSource.class.equals(Integer.class)
            || ObservabilityPipelineHttpServerSource.class.equals(Long.class)
            || ObservabilityPipelineHttpServerSource.class.equals(Float.class)
            || ObservabilityPipelineHttpServerSource.class.equals(Double.class)
            || ObservabilityPipelineHttpServerSource.class.equals(Boolean.class)
            || ObservabilityPipelineHttpServerSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineHttpServerSource.class.equals(Integer.class)
                        || ObservabilityPipelineHttpServerSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineHttpServerSource.class.equals(Float.class)
                        || ObservabilityPipelineHttpServerSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineHttpServerSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineHttpServerSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineHttpServerSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineHttpServerSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineHttpServerSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineHttpServerSource'",
            e);
      }

      // deserialize ObservabilityPipelineSumoLogicSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSumoLogicSource.class.equals(Integer.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Long.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Float.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Double.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Boolean.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSumoLogicSource.class.equals(Integer.class)
                        || ObservabilityPipelineSumoLogicSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSumoLogicSource.class.equals(Float.class)
                        || ObservabilityPipelineSumoLogicSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSumoLogicSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSumoLogicSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSumoLogicSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSumoLogicSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSumoLogicSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSumoLogicSource'",
            e);
      }

      // deserialize ObservabilityPipelineRsyslogSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineRsyslogSource.class.equals(Integer.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Long.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Float.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Double.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Boolean.class)
            || ObservabilityPipelineRsyslogSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineRsyslogSource.class.equals(Integer.class)
                        || ObservabilityPipelineRsyslogSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineRsyslogSource.class.equals(Float.class)
                        || ObservabilityPipelineRsyslogSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineRsyslogSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineRsyslogSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineRsyslogSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineRsyslogSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineRsyslogSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineRsyslogSource'",
            e);
      }

      // deserialize ObservabilityPipelineSyslogNgSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSyslogNgSource.class.equals(Integer.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Long.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Float.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Double.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Boolean.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSyslogNgSource.class.equals(Integer.class)
                        || ObservabilityPipelineSyslogNgSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSyslogNgSource.class.equals(Float.class)
                        || ObservabilityPipelineSyslogNgSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSyslogNgSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSyslogNgSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSyslogNgSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSyslogNgSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSyslogNgSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSyslogNgSource'",
            e);
      }

      // deserialize ObservabilityPipelineAmazonDataFirehoseSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Integer.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Long.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Float.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Double.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Integer.class)
                        || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Float.class)
                        || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonDataFirehoseSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAmazonDataFirehoseSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonDataFirehoseSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineAmazonDataFirehoseSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAmazonDataFirehoseSource'",
            e);
      }

      // deserialize ObservabilityPipelineGooglePubSubSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGooglePubSubSource.class.equals(Integer.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Long.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Float.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Double.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Boolean.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGooglePubSubSource.class.equals(Integer.class)
                        || ObservabilityPipelineGooglePubSubSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGooglePubSubSource.class.equals(Float.class)
                        || ObservabilityPipelineGooglePubSubSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGooglePubSubSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGooglePubSubSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGooglePubSubSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGooglePubSubSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineGooglePubSubSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineGooglePubSubSource'",
            e);
      }

      // deserialize ObservabilityPipelineHttpClientSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineHttpClientSource.class.equals(Integer.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Long.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Float.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Double.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Boolean.class)
            || ObservabilityPipelineHttpClientSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineHttpClientSource.class.equals(Integer.class)
                        || ObservabilityPipelineHttpClientSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineHttpClientSource.class.equals(Float.class)
                        || ObservabilityPipelineHttpClientSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineHttpClientSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineHttpClientSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineHttpClientSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineHttpClientSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineHttpClientSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineHttpClientSource'",
            e);
      }

      // deserialize ObservabilityPipelineLogstashSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineLogstashSource.class.equals(Integer.class)
            || ObservabilityPipelineLogstashSource.class.equals(Long.class)
            || ObservabilityPipelineLogstashSource.class.equals(Float.class)
            || ObservabilityPipelineLogstashSource.class.equals(Double.class)
            || ObservabilityPipelineLogstashSource.class.equals(Boolean.class)
            || ObservabilityPipelineLogstashSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineLogstashSource.class.equals(Integer.class)
                        || ObservabilityPipelineLogstashSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineLogstashSource.class.equals(Float.class)
                        || ObservabilityPipelineLogstashSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineLogstashSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineLogstashSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineLogstashSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineLogstashSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineLogstashSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineLogstashSource'",
            e);
      }

      // deserialize ObservabilityPipelineSocketSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSocketSource.class.equals(Integer.class)
            || ObservabilityPipelineSocketSource.class.equals(Long.class)
            || ObservabilityPipelineSocketSource.class.equals(Float.class)
            || ObservabilityPipelineSocketSource.class.equals(Double.class)
            || ObservabilityPipelineSocketSource.class.equals(Boolean.class)
            || ObservabilityPipelineSocketSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSocketSource.class.equals(Integer.class)
                        || ObservabilityPipelineSocketSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSocketSource.class.equals(Float.class)
                        || ObservabilityPipelineSocketSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSocketSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSocketSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSocketSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSocketSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSocketSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ObservabilityPipelineSocketSource'", e);
      }

      // deserialize ObservabilityPipelineOpentelemetrySource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineOpentelemetrySource.class.equals(Integer.class)
            || ObservabilityPipelineOpentelemetrySource.class.equals(Long.class)
            || ObservabilityPipelineOpentelemetrySource.class.equals(Float.class)
            || ObservabilityPipelineOpentelemetrySource.class.equals(Double.class)
            || ObservabilityPipelineOpentelemetrySource.class.equals(Boolean.class)
            || ObservabilityPipelineOpentelemetrySource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineOpentelemetrySource.class.equals(Integer.class)
                        || ObservabilityPipelineOpentelemetrySource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineOpentelemetrySource.class.equals(Float.class)
                        || ObservabilityPipelineOpentelemetrySource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineOpentelemetrySource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineOpentelemetrySource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineOpentelemetrySource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineOpentelemetrySource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineOpentelemetrySource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineOpentelemetrySource'",
            e);
      }

      ObservabilityPipelineConfigSourceItem ret = new ObservabilityPipelineConfigSourceItem();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public ObservabilityPipelineConfigSourceItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineConfigSourceItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineConfigSourceItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineKafkaSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineDatadogAgentSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSplunkTcpSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSplunkHecSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineAmazonS3Source o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineFluentdSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineFluentBitSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineHttpServerSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSumoLogicSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineRsyslogSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSyslogNgSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineAmazonDataFirehoseSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineGooglePubSubSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineHttpClientSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineLogstashSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSocketSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineOpentelemetrySource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineKafkaSource", new GenericType<ObservabilityPipelineKafkaSource>() {});
    schemas.put(
        "ObservabilityPipelineDatadogAgentSource",
        new GenericType<ObservabilityPipelineDatadogAgentSource>() {});
    schemas.put(
        "ObservabilityPipelineSplunkTcpSource",
        new GenericType<ObservabilityPipelineSplunkTcpSource>() {});
    schemas.put(
        "ObservabilityPipelineSplunkHecSource",
        new GenericType<ObservabilityPipelineSplunkHecSource>() {});
    schemas.put(
        "ObservabilityPipelineAmazonS3Source",
        new GenericType<ObservabilityPipelineAmazonS3Source>() {});
    schemas.put(
        "ObservabilityPipelineFluentdSource",
        new GenericType<ObservabilityPipelineFluentdSource>() {});
    schemas.put(
        "ObservabilityPipelineFluentBitSource",
        new GenericType<ObservabilityPipelineFluentBitSource>() {});
    schemas.put(
        "ObservabilityPipelineHttpServerSource",
        new GenericType<ObservabilityPipelineHttpServerSource>() {});
    schemas.put(
        "ObservabilityPipelineSumoLogicSource",
        new GenericType<ObservabilityPipelineSumoLogicSource>() {});
    schemas.put(
        "ObservabilityPipelineRsyslogSource",
        new GenericType<ObservabilityPipelineRsyslogSource>() {});
    schemas.put(
        "ObservabilityPipelineSyslogNgSource",
        new GenericType<ObservabilityPipelineSyslogNgSource>() {});
    schemas.put(
        "ObservabilityPipelineAmazonDataFirehoseSource",
        new GenericType<ObservabilityPipelineAmazonDataFirehoseSource>() {});
    schemas.put(
        "ObservabilityPipelineGooglePubSubSource",
        new GenericType<ObservabilityPipelineGooglePubSubSource>() {});
    schemas.put(
        "ObservabilityPipelineHttpClientSource",
        new GenericType<ObservabilityPipelineHttpClientSource>() {});
    schemas.put(
        "ObservabilityPipelineLogstashSource",
        new GenericType<ObservabilityPipelineLogstashSource>() {});
    schemas.put(
        "ObservabilityPipelineSocketSource",
        new GenericType<ObservabilityPipelineSocketSource>() {});
    schemas.put(
        "ObservabilityPipelineOpentelemetrySource",
        new GenericType<ObservabilityPipelineOpentelemetrySource>() {});
    JSON.registerDescendants(
        ObservabilityPipelineConfigSourceItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineConfigSourceItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineKafkaSource,
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,
   * ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source,
   * ObservabilityPipelineFluentdSource, ObservabilityPipelineFluentBitSource,
   * ObservabilityPipelineHttpServerSource, ObservabilityPipelineSumoLogicSource,
   * ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource,
   * ObservabilityPipelineAmazonDataFirehoseSource, ObservabilityPipelineGooglePubSubSource,
   * ObservabilityPipelineHttpClientSource, ObservabilityPipelineLogstashSource,
   * ObservabilityPipelineSocketSource, ObservabilityPipelineOpentelemetrySource
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineKafkaSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineDatadogAgentSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSplunkTcpSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSplunkHecSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonS3Source.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineFluentdSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineFluentBitSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineHttpServerSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSumoLogicSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRsyslogSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSyslogNgSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonDataFirehoseSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineGooglePubSubSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineHttpClientSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineLogstashSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSocketSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineOpentelemetrySource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineKafkaSource,"
            + " ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,"
            + " ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source,"
            + " ObservabilityPipelineFluentdSource, ObservabilityPipelineFluentBitSource,"
            + " ObservabilityPipelineHttpServerSource, ObservabilityPipelineSumoLogicSource,"
            + " ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource,"
            + " ObservabilityPipelineAmazonDataFirehoseSource,"
            + " ObservabilityPipelineGooglePubSubSource, ObservabilityPipelineHttpClientSource,"
            + " ObservabilityPipelineLogstashSource, ObservabilityPipelineSocketSource,"
            + " ObservabilityPipelineOpentelemetrySource");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineKafkaSource,
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,
   * ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source,
   * ObservabilityPipelineFluentdSource, ObservabilityPipelineFluentBitSource,
   * ObservabilityPipelineHttpServerSource, ObservabilityPipelineSumoLogicSource,
   * ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource,
   * ObservabilityPipelineAmazonDataFirehoseSource, ObservabilityPipelineGooglePubSubSource,
   * ObservabilityPipelineHttpClientSource, ObservabilityPipelineLogstashSource,
   * ObservabilityPipelineSocketSource, ObservabilityPipelineOpentelemetrySource
   *
   * @return The actual instance (ObservabilityPipelineKafkaSource,
   *     ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,
   *     ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source,
   *     ObservabilityPipelineFluentdSource, ObservabilityPipelineFluentBitSource,
   *     ObservabilityPipelineHttpServerSource, ObservabilityPipelineSumoLogicSource,
   *     ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource,
   *     ObservabilityPipelineAmazonDataFirehoseSource, ObservabilityPipelineGooglePubSubSource,
   *     ObservabilityPipelineHttpClientSource, ObservabilityPipelineLogstashSource,
   *     ObservabilityPipelineSocketSource, ObservabilityPipelineOpentelemetrySource)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineKafkaSource`. If the actual instance is not
   * `ObservabilityPipelineKafkaSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineKafkaSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineKafkaSource`
   */
  public ObservabilityPipelineKafkaSource getObservabilityPipelineKafkaSource()
      throws ClassCastException {
    return (ObservabilityPipelineKafkaSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineDatadogAgentSource`. If the actual instance is
   * not `ObservabilityPipelineDatadogAgentSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineDatadogAgentSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineDatadogAgentSource`
   */
  public ObservabilityPipelineDatadogAgentSource getObservabilityPipelineDatadogAgentSource()
      throws ClassCastException {
    return (ObservabilityPipelineDatadogAgentSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSplunkTcpSource`. If the actual instance is
   * not `ObservabilityPipelineSplunkTcpSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSplunkTcpSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSplunkTcpSource`
   */
  public ObservabilityPipelineSplunkTcpSource getObservabilityPipelineSplunkTcpSource()
      throws ClassCastException {
    return (ObservabilityPipelineSplunkTcpSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSplunkHecSource`. If the actual instance is
   * not `ObservabilityPipelineSplunkHecSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSplunkHecSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSplunkHecSource`
   */
  public ObservabilityPipelineSplunkHecSource getObservabilityPipelineSplunkHecSource()
      throws ClassCastException {
    return (ObservabilityPipelineSplunkHecSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonS3Source`. If the actual instance is not
   * `ObservabilityPipelineAmazonS3Source`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonS3Source`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3Source`
   */
  public ObservabilityPipelineAmazonS3Source getObservabilityPipelineAmazonS3Source()
      throws ClassCastException {
    return (ObservabilityPipelineAmazonS3Source) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineFluentdSource`. If the actual instance is not
   * `ObservabilityPipelineFluentdSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineFluentdSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineFluentdSource`
   */
  public ObservabilityPipelineFluentdSource getObservabilityPipelineFluentdSource()
      throws ClassCastException {
    return (ObservabilityPipelineFluentdSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineFluentBitSource`. If the actual instance is
   * not `ObservabilityPipelineFluentBitSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineFluentBitSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineFluentBitSource`
   */
  public ObservabilityPipelineFluentBitSource getObservabilityPipelineFluentBitSource()
      throws ClassCastException {
    return (ObservabilityPipelineFluentBitSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineHttpServerSource`. If the actual instance is
   * not `ObservabilityPipelineHttpServerSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineHttpServerSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineHttpServerSource`
   */
  public ObservabilityPipelineHttpServerSource getObservabilityPipelineHttpServerSource()
      throws ClassCastException {
    return (ObservabilityPipelineHttpServerSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSumoLogicSource`. If the actual instance is
   * not `ObservabilityPipelineSumoLogicSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSumoLogicSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSumoLogicSource`
   */
  public ObservabilityPipelineSumoLogicSource getObservabilityPipelineSumoLogicSource()
      throws ClassCastException {
    return (ObservabilityPipelineSumoLogicSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineRsyslogSource`. If the actual instance is not
   * `ObservabilityPipelineRsyslogSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineRsyslogSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineRsyslogSource`
   */
  public ObservabilityPipelineRsyslogSource getObservabilityPipelineRsyslogSource()
      throws ClassCastException {
    return (ObservabilityPipelineRsyslogSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSyslogNgSource`. If the actual instance is not
   * `ObservabilityPipelineSyslogNgSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSyslogNgSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSyslogNgSource`
   */
  public ObservabilityPipelineSyslogNgSource getObservabilityPipelineSyslogNgSource()
      throws ClassCastException {
    return (ObservabilityPipelineSyslogNgSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonDataFirehoseSource`. If the actual
   * instance is not `ObservabilityPipelineAmazonDataFirehoseSource`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonDataFirehoseSource`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAmazonDataFirehoseSource`
   */
  public ObservabilityPipelineAmazonDataFirehoseSource
      getObservabilityPipelineAmazonDataFirehoseSource() throws ClassCastException {
    return (ObservabilityPipelineAmazonDataFirehoseSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGooglePubSubSource`. If the actual instance is
   * not `ObservabilityPipelineGooglePubSubSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGooglePubSubSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineGooglePubSubSource`
   */
  public ObservabilityPipelineGooglePubSubSource getObservabilityPipelineGooglePubSubSource()
      throws ClassCastException {
    return (ObservabilityPipelineGooglePubSubSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineHttpClientSource`. If the actual instance is
   * not `ObservabilityPipelineHttpClientSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineHttpClientSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineHttpClientSource`
   */
  public ObservabilityPipelineHttpClientSource getObservabilityPipelineHttpClientSource()
      throws ClassCastException {
    return (ObservabilityPipelineHttpClientSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineLogstashSource`. If the actual instance is not
   * `ObservabilityPipelineLogstashSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineLogstashSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineLogstashSource`
   */
  public ObservabilityPipelineLogstashSource getObservabilityPipelineLogstashSource()
      throws ClassCastException {
    return (ObservabilityPipelineLogstashSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSocketSource`. If the actual instance is not
   * `ObservabilityPipelineSocketSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSocketSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSocketSource`
   */
  public ObservabilityPipelineSocketSource getObservabilityPipelineSocketSource()
      throws ClassCastException {
    return (ObservabilityPipelineSocketSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineOpentelemetrySource`. If the actual instance
   * is not `ObservabilityPipelineOpentelemetrySource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineOpentelemetrySource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineOpentelemetrySource`
   */
  public ObservabilityPipelineOpentelemetrySource getObservabilityPipelineOpentelemetrySource()
      throws ClassCastException {
    return (ObservabilityPipelineOpentelemetrySource) super.getActualInstance();
  }
}
