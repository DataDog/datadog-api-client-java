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
        ObservabilityPipelineConfigProcessorItem
            .ObservabilityPipelineConfigProcessorItemDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineConfigProcessorItem.ObservabilityPipelineConfigProcessorItemSerializer
            .class)
public class ObservabilityPipelineConfigProcessorItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineConfigProcessorItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineConfigProcessorItemSerializer
      extends StdSerializer<ObservabilityPipelineConfigProcessorItem> {
    public ObservabilityPipelineConfigProcessorItemSerializer(
        Class<ObservabilityPipelineConfigProcessorItem> t) {
      super(t);
    }

    public ObservabilityPipelineConfigProcessorItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineConfigProcessorItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineConfigProcessorItemDeserializer
      extends StdDeserializer<ObservabilityPipelineConfigProcessorItem> {
    public ObservabilityPipelineConfigProcessorItemDeserializer() {
      this(ObservabilityPipelineConfigProcessorItem.class);
    }

    public ObservabilityPipelineConfigProcessorItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineConfigProcessorItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineFilterProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineFilterProcessor.class.equals(Integer.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Long.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Float.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Double.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineFilterProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineFilterProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineFilterProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineFilterProcessor.class.equals(Float.class)
                        || ObservabilityPipelineFilterProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineFilterProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineFilterProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineFilterProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineFilterProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineFilterProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineFilterProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineAddEnvVarsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAddEnvVarsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineAddEnvVarsProcessor.class.equals(Long.class)
            || ObservabilityPipelineAddEnvVarsProcessor.class.equals(Float.class)
            || ObservabilityPipelineAddEnvVarsProcessor.class.equals(Double.class)
            || ObservabilityPipelineAddEnvVarsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineAddEnvVarsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAddEnvVarsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineAddEnvVarsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAddEnvVarsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineAddEnvVarsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAddEnvVarsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAddEnvVarsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAddEnvVarsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAddEnvVarsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineAddEnvVarsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAddEnvVarsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineAddFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAddFieldsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Long.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Float.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Double.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAddFieldsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineAddFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAddFieldsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineAddFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAddFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAddFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAddFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAddFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineAddFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAddFieldsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineAddHostnameProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAddHostnameProcessor.class.equals(Integer.class)
            || ObservabilityPipelineAddHostnameProcessor.class.equals(Long.class)
            || ObservabilityPipelineAddHostnameProcessor.class.equals(Float.class)
            || ObservabilityPipelineAddHostnameProcessor.class.equals(Double.class)
            || ObservabilityPipelineAddHostnameProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineAddHostnameProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAddHostnameProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineAddHostnameProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAddHostnameProcessor.class.equals(Float.class)
                        || ObservabilityPipelineAddHostnameProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAddHostnameProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAddHostnameProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAddHostnameProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAddHostnameProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineAddHostnameProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAddHostnameProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineCustomProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineCustomProcessor.class.equals(Integer.class)
            || ObservabilityPipelineCustomProcessor.class.equals(Long.class)
            || ObservabilityPipelineCustomProcessor.class.equals(Float.class)
            || ObservabilityPipelineCustomProcessor.class.equals(Double.class)
            || ObservabilityPipelineCustomProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineCustomProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineCustomProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineCustomProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineCustomProcessor.class.equals(Float.class)
                        || ObservabilityPipelineCustomProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineCustomProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineCustomProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineCustomProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineCustomProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineCustomProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineCustomProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineDatadogTagsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineDatadogTagsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineDatadogTagsProcessor.class.equals(Long.class)
            || ObservabilityPipelineDatadogTagsProcessor.class.equals(Float.class)
            || ObservabilityPipelineDatadogTagsProcessor.class.equals(Double.class)
            || ObservabilityPipelineDatadogTagsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineDatadogTagsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineDatadogTagsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineDatadogTagsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineDatadogTagsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineDatadogTagsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineDatadogTagsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineDatadogTagsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineDatadogTagsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineDatadogTagsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineDatadogTagsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineDatadogTagsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineDedupeProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineDedupeProcessor.class.equals(Integer.class)
            || ObservabilityPipelineDedupeProcessor.class.equals(Long.class)
            || ObservabilityPipelineDedupeProcessor.class.equals(Float.class)
            || ObservabilityPipelineDedupeProcessor.class.equals(Double.class)
            || ObservabilityPipelineDedupeProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineDedupeProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineDedupeProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineDedupeProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineDedupeProcessor.class.equals(Float.class)
                        || ObservabilityPipelineDedupeProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineDedupeProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineDedupeProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineDedupeProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineDedupeProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineDedupeProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineDedupeProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineEnrichmentTableProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineEnrichmentTableProcessor.class.equals(Integer.class)
            || ObservabilityPipelineEnrichmentTableProcessor.class.equals(Long.class)
            || ObservabilityPipelineEnrichmentTableProcessor.class.equals(Float.class)
            || ObservabilityPipelineEnrichmentTableProcessor.class.equals(Double.class)
            || ObservabilityPipelineEnrichmentTableProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineEnrichmentTableProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineEnrichmentTableProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineEnrichmentTableProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineEnrichmentTableProcessor.class.equals(Float.class)
                        || ObservabilityPipelineEnrichmentTableProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineEnrichmentTableProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineEnrichmentTableProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineEnrichmentTableProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineEnrichmentTableProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineEnrichmentTableProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineEnrichmentTableProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineGenerateMetricsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGenerateMetricsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineGenerateMetricsProcessor.class.equals(Long.class)
            || ObservabilityPipelineGenerateMetricsProcessor.class.equals(Float.class)
            || ObservabilityPipelineGenerateMetricsProcessor.class.equals(Double.class)
            || ObservabilityPipelineGenerateMetricsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineGenerateMetricsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGenerateMetricsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineGenerateMetricsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGenerateMetricsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineGenerateMetricsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGenerateMetricsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGenerateMetricsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGenerateMetricsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGenerateMetricsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineGenerateMetricsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineGenerateMetricsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineOcsfMapperProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineOcsfMapperProcessor.class.equals(Integer.class)
            || ObservabilityPipelineOcsfMapperProcessor.class.equals(Long.class)
            || ObservabilityPipelineOcsfMapperProcessor.class.equals(Float.class)
            || ObservabilityPipelineOcsfMapperProcessor.class.equals(Double.class)
            || ObservabilityPipelineOcsfMapperProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineOcsfMapperProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineOcsfMapperProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineOcsfMapperProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineOcsfMapperProcessor.class.equals(Float.class)
                        || ObservabilityPipelineOcsfMapperProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineOcsfMapperProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineOcsfMapperProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineOcsfMapperProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineOcsfMapperProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineOcsfMapperProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineOcsfMapperProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineParseGrokProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineParseGrokProcessor.class.equals(Integer.class)
            || ObservabilityPipelineParseGrokProcessor.class.equals(Long.class)
            || ObservabilityPipelineParseGrokProcessor.class.equals(Float.class)
            || ObservabilityPipelineParseGrokProcessor.class.equals(Double.class)
            || ObservabilityPipelineParseGrokProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineParseGrokProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineParseGrokProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineParseGrokProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineParseGrokProcessor.class.equals(Float.class)
                        || ObservabilityPipelineParseGrokProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineParseGrokProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineParseGrokProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineParseGrokProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineParseGrokProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineParseGrokProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineParseGrokProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineParseJSONProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineParseJSONProcessor.class.equals(Integer.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Long.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Float.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Double.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineParseJSONProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineParseJSONProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineParseJSONProcessor.class.equals(Float.class)
                        || ObservabilityPipelineParseJSONProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineParseJSONProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineParseJSONProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineParseJSONProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineParseJSONProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineParseJSONProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineParseJSONProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineParseXMLProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineParseXMLProcessor.class.equals(Integer.class)
            || ObservabilityPipelineParseXMLProcessor.class.equals(Long.class)
            || ObservabilityPipelineParseXMLProcessor.class.equals(Float.class)
            || ObservabilityPipelineParseXMLProcessor.class.equals(Double.class)
            || ObservabilityPipelineParseXMLProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineParseXMLProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineParseXMLProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineParseXMLProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineParseXMLProcessor.class.equals(Float.class)
                        || ObservabilityPipelineParseXMLProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineParseXMLProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineParseXMLProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineParseXMLProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineParseXMLProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineParseXMLProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineParseXMLProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineQuotaProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineQuotaProcessor.class.equals(Integer.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Long.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Float.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Double.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineQuotaProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineQuotaProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineQuotaProcessor.class.equals(Float.class)
                        || ObservabilityPipelineQuotaProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineQuotaProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineQuotaProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineQuotaProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineQuotaProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineQuotaProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineQuotaProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineReduceProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineReduceProcessor.class.equals(Integer.class)
            || ObservabilityPipelineReduceProcessor.class.equals(Long.class)
            || ObservabilityPipelineReduceProcessor.class.equals(Float.class)
            || ObservabilityPipelineReduceProcessor.class.equals(Double.class)
            || ObservabilityPipelineReduceProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineReduceProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineReduceProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineReduceProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineReduceProcessor.class.equals(Float.class)
                        || ObservabilityPipelineReduceProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineReduceProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineReduceProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineReduceProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineReduceProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineReduceProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineReduceProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineRemoveFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineRemoveFieldsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Long.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Float.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Double.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineRemoveFieldsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineRemoveFieldsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineRemoveFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineRemoveFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineRemoveFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineRemoveFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineRemoveFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineRemoveFieldsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineRenameFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineRenameFieldsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Long.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Float.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Double.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineRenameFieldsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineRenameFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineRenameFieldsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineRenameFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineRenameFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineRenameFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineRenameFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineRenameFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineRenameFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineRenameFieldsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineSampleProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSampleProcessor.class.equals(Integer.class)
            || ObservabilityPipelineSampleProcessor.class.equals(Long.class)
            || ObservabilityPipelineSampleProcessor.class.equals(Float.class)
            || ObservabilityPipelineSampleProcessor.class.equals(Double.class)
            || ObservabilityPipelineSampleProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineSampleProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSampleProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineSampleProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSampleProcessor.class.equals(Float.class)
                        || ObservabilityPipelineSampleProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSampleProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSampleProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSampleProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSampleProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSampleProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSampleProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineSensitiveDataScannerProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSensitiveDataScannerProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineSensitiveDataScannerProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSensitiveDataScannerProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineSplitArrayProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSplitArrayProcessor.class.equals(Integer.class)
            || ObservabilityPipelineSplitArrayProcessor.class.equals(Long.class)
            || ObservabilityPipelineSplitArrayProcessor.class.equals(Float.class)
            || ObservabilityPipelineSplitArrayProcessor.class.equals(Double.class)
            || ObservabilityPipelineSplitArrayProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineSplitArrayProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSplitArrayProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineSplitArrayProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSplitArrayProcessor.class.equals(Float.class)
                        || ObservabilityPipelineSplitArrayProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSplitArrayProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSplitArrayProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSplitArrayProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSplitArrayProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineSplitArrayProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSplitArrayProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineThrottleProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineThrottleProcessor.class.equals(Integer.class)
            || ObservabilityPipelineThrottleProcessor.class.equals(Long.class)
            || ObservabilityPipelineThrottleProcessor.class.equals(Float.class)
            || ObservabilityPipelineThrottleProcessor.class.equals(Double.class)
            || ObservabilityPipelineThrottleProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineThrottleProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineThrottleProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineThrottleProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineThrottleProcessor.class.equals(Float.class)
                        || ObservabilityPipelineThrottleProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineThrottleProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineThrottleProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineThrottleProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineThrottleProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineThrottleProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineThrottleProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineMetricTagsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineMetricTagsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineMetricTagsProcessor.class.equals(Long.class)
            || ObservabilityPipelineMetricTagsProcessor.class.equals(Float.class)
            || ObservabilityPipelineMetricTagsProcessor.class.equals(Double.class)
            || ObservabilityPipelineMetricTagsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineMetricTagsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineMetricTagsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineMetricTagsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineMetricTagsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineMetricTagsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineMetricTagsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineMetricTagsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineMetricTagsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineMetricTagsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineMetricTagsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineMetricTagsProcessor'",
            e);
      }

      ObservabilityPipelineConfigProcessorItem ret = new ObservabilityPipelineConfigProcessorItem();
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
    public ObservabilityPipelineConfigProcessorItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineConfigProcessorItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineConfigProcessorItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineFilterProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineAddEnvVarsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineAddFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineAddHostnameProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineCustomProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineDatadogTagsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineDedupeProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineEnrichmentTableProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineGenerateMetricsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineOcsfMapperProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineParseGrokProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineParseJSONProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineParseXMLProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineQuotaProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineReduceProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineRemoveFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineRenameFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineSampleProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(
      ObservabilityPipelineSensitiveDataScannerProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineSplitArrayProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineThrottleProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineMetricTagsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineFilterProcessor",
        new GenericType<ObservabilityPipelineFilterProcessor>() {});
    schemas.put(
        "ObservabilityPipelineAddEnvVarsProcessor",
        new GenericType<ObservabilityPipelineAddEnvVarsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineAddFieldsProcessor",
        new GenericType<ObservabilityPipelineAddFieldsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineAddHostnameProcessor",
        new GenericType<ObservabilityPipelineAddHostnameProcessor>() {});
    schemas.put(
        "ObservabilityPipelineCustomProcessor",
        new GenericType<ObservabilityPipelineCustomProcessor>() {});
    schemas.put(
        "ObservabilityPipelineDatadogTagsProcessor",
        new GenericType<ObservabilityPipelineDatadogTagsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineDedupeProcessor",
        new GenericType<ObservabilityPipelineDedupeProcessor>() {});
    schemas.put(
        "ObservabilityPipelineEnrichmentTableProcessor",
        new GenericType<ObservabilityPipelineEnrichmentTableProcessor>() {});
    schemas.put(
        "ObservabilityPipelineGenerateMetricsProcessor",
        new GenericType<ObservabilityPipelineGenerateMetricsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineOcsfMapperProcessor",
        new GenericType<ObservabilityPipelineOcsfMapperProcessor>() {});
    schemas.put(
        "ObservabilityPipelineParseGrokProcessor",
        new GenericType<ObservabilityPipelineParseGrokProcessor>() {});
    schemas.put(
        "ObservabilityPipelineParseJSONProcessor",
        new GenericType<ObservabilityPipelineParseJSONProcessor>() {});
    schemas.put(
        "ObservabilityPipelineParseXMLProcessor",
        new GenericType<ObservabilityPipelineParseXMLProcessor>() {});
    schemas.put(
        "ObservabilityPipelineQuotaProcessor",
        new GenericType<ObservabilityPipelineQuotaProcessor>() {});
    schemas.put(
        "ObservabilityPipelineReduceProcessor",
        new GenericType<ObservabilityPipelineReduceProcessor>() {});
    schemas.put(
        "ObservabilityPipelineRemoveFieldsProcessor",
        new GenericType<ObservabilityPipelineRemoveFieldsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineRenameFieldsProcessor",
        new GenericType<ObservabilityPipelineRenameFieldsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineSampleProcessor",
        new GenericType<ObservabilityPipelineSampleProcessor>() {});
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessor",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessor>() {});
    schemas.put(
        "ObservabilityPipelineSplitArrayProcessor",
        new GenericType<ObservabilityPipelineSplitArrayProcessor>() {});
    schemas.put(
        "ObservabilityPipelineThrottleProcessor",
        new GenericType<ObservabilityPipelineThrottleProcessor>() {});
    schemas.put(
        "ObservabilityPipelineMetricTagsProcessor",
        new GenericType<ObservabilityPipelineMetricTagsProcessor>() {});
    JSON.registerDescendants(
        ObservabilityPipelineConfigProcessorItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineConfigProcessorItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineFilterProcessor,
   * ObservabilityPipelineAddEnvVarsProcessor, ObservabilityPipelineAddFieldsProcessor,
   * ObservabilityPipelineAddHostnameProcessor, ObservabilityPipelineCustomProcessor,
   * ObservabilityPipelineDatadogTagsProcessor, ObservabilityPipelineDedupeProcessor,
   * ObservabilityPipelineEnrichmentTableProcessor, ObservabilityPipelineGenerateMetricsProcessor,
   * ObservabilityPipelineOcsfMapperProcessor, ObservabilityPipelineParseGrokProcessor,
   * ObservabilityPipelineParseJSONProcessor, ObservabilityPipelineParseXMLProcessor,
   * ObservabilityPipelineQuotaProcessor, ObservabilityPipelineReduceProcessor,
   * ObservabilityPipelineRemoveFieldsProcessor, ObservabilityPipelineRenameFieldsProcessor,
   * ObservabilityPipelineSampleProcessor, ObservabilityPipelineSensitiveDataScannerProcessor,
   * ObservabilityPipelineSplitArrayProcessor, ObservabilityPipelineThrottleProcessor,
   * ObservabilityPipelineMetricTagsProcessor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineFilterProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAddEnvVarsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAddFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAddHostnameProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineCustomProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineDatadogTagsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineDedupeProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineEnrichmentTableProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineGenerateMetricsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineOcsfMapperProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineParseGrokProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineParseJSONProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineParseXMLProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineQuotaProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineReduceProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRemoveFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRenameFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSampleProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessor.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSplitArrayProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineThrottleProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineMetricTagsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineFilterProcessor,"
            + " ObservabilityPipelineAddEnvVarsProcessor, ObservabilityPipelineAddFieldsProcessor,"
            + " ObservabilityPipelineAddHostnameProcessor, ObservabilityPipelineCustomProcessor,"
            + " ObservabilityPipelineDatadogTagsProcessor, ObservabilityPipelineDedupeProcessor,"
            + " ObservabilityPipelineEnrichmentTableProcessor,"
            + " ObservabilityPipelineGenerateMetricsProcessor,"
            + " ObservabilityPipelineOcsfMapperProcessor, ObservabilityPipelineParseGrokProcessor,"
            + " ObservabilityPipelineParseJSONProcessor, ObservabilityPipelineParseXMLProcessor,"
            + " ObservabilityPipelineQuotaProcessor, ObservabilityPipelineReduceProcessor,"
            + " ObservabilityPipelineRemoveFieldsProcessor,"
            + " ObservabilityPipelineRenameFieldsProcessor, ObservabilityPipelineSampleProcessor,"
            + " ObservabilityPipelineSensitiveDataScannerProcessor,"
            + " ObservabilityPipelineSplitArrayProcessor, ObservabilityPipelineThrottleProcessor,"
            + " ObservabilityPipelineMetricTagsProcessor");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineFilterProcessor,
   * ObservabilityPipelineAddEnvVarsProcessor, ObservabilityPipelineAddFieldsProcessor,
   * ObservabilityPipelineAddHostnameProcessor, ObservabilityPipelineCustomProcessor,
   * ObservabilityPipelineDatadogTagsProcessor, ObservabilityPipelineDedupeProcessor,
   * ObservabilityPipelineEnrichmentTableProcessor, ObservabilityPipelineGenerateMetricsProcessor,
   * ObservabilityPipelineOcsfMapperProcessor, ObservabilityPipelineParseGrokProcessor,
   * ObservabilityPipelineParseJSONProcessor, ObservabilityPipelineParseXMLProcessor,
   * ObservabilityPipelineQuotaProcessor, ObservabilityPipelineReduceProcessor,
   * ObservabilityPipelineRemoveFieldsProcessor, ObservabilityPipelineRenameFieldsProcessor,
   * ObservabilityPipelineSampleProcessor, ObservabilityPipelineSensitiveDataScannerProcessor,
   * ObservabilityPipelineSplitArrayProcessor, ObservabilityPipelineThrottleProcessor,
   * ObservabilityPipelineMetricTagsProcessor
   *
   * @return The actual instance (ObservabilityPipelineFilterProcessor,
   *     ObservabilityPipelineAddEnvVarsProcessor, ObservabilityPipelineAddFieldsProcessor,
   *     ObservabilityPipelineAddHostnameProcessor, ObservabilityPipelineCustomProcessor,
   *     ObservabilityPipelineDatadogTagsProcessor, ObservabilityPipelineDedupeProcessor,
   *     ObservabilityPipelineEnrichmentTableProcessor,
   *     ObservabilityPipelineGenerateMetricsProcessor, ObservabilityPipelineOcsfMapperProcessor,
   *     ObservabilityPipelineParseGrokProcessor, ObservabilityPipelineParseJSONProcessor,
   *     ObservabilityPipelineParseXMLProcessor, ObservabilityPipelineQuotaProcessor,
   *     ObservabilityPipelineReduceProcessor, ObservabilityPipelineRemoveFieldsProcessor,
   *     ObservabilityPipelineRenameFieldsProcessor, ObservabilityPipelineSampleProcessor,
   *     ObservabilityPipelineSensitiveDataScannerProcessor,
   *     ObservabilityPipelineSplitArrayProcessor, ObservabilityPipelineThrottleProcessor,
   *     ObservabilityPipelineMetricTagsProcessor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineFilterProcessor`. If the actual instance is
   * not `ObservabilityPipelineFilterProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineFilterProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineFilterProcessor`
   */
  public ObservabilityPipelineFilterProcessor getObservabilityPipelineFilterProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineFilterProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAddEnvVarsProcessor`. If the actual instance
   * is not `ObservabilityPipelineAddEnvVarsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAddEnvVarsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineAddEnvVarsProcessor`
   */
  public ObservabilityPipelineAddEnvVarsProcessor getObservabilityPipelineAddEnvVarsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineAddEnvVarsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAddFieldsProcessor`. If the actual instance is
   * not `ObservabilityPipelineAddFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAddFieldsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineAddFieldsProcessor`
   */
  public ObservabilityPipelineAddFieldsProcessor getObservabilityPipelineAddFieldsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineAddFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAddHostnameProcessor`. If the actual instance
   * is not `ObservabilityPipelineAddHostnameProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAddHostnameProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineAddHostnameProcessor`
   */
  public ObservabilityPipelineAddHostnameProcessor getObservabilityPipelineAddHostnameProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineAddHostnameProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineCustomProcessor`. If the actual instance is
   * not `ObservabilityPipelineCustomProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineCustomProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineCustomProcessor`
   */
  public ObservabilityPipelineCustomProcessor getObservabilityPipelineCustomProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineCustomProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineDatadogTagsProcessor`. If the actual instance
   * is not `ObservabilityPipelineDatadogTagsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineDatadogTagsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineDatadogTagsProcessor`
   */
  public ObservabilityPipelineDatadogTagsProcessor getObservabilityPipelineDatadogTagsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineDatadogTagsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineDedupeProcessor`. If the actual instance is
   * not `ObservabilityPipelineDedupeProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineDedupeProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineDedupeProcessor`
   */
  public ObservabilityPipelineDedupeProcessor getObservabilityPipelineDedupeProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineDedupeProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineEnrichmentTableProcessor`. If the actual
   * instance is not `ObservabilityPipelineEnrichmentTableProcessor`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineEnrichmentTableProcessor`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineEnrichmentTableProcessor`
   */
  public ObservabilityPipelineEnrichmentTableProcessor
      getObservabilityPipelineEnrichmentTableProcessor() throws ClassCastException {
    return (ObservabilityPipelineEnrichmentTableProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGenerateMetricsProcessor`. If the actual
   * instance is not `ObservabilityPipelineGenerateMetricsProcessor`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGenerateMetricsProcessor`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineGenerateMetricsProcessor`
   */
  public ObservabilityPipelineGenerateMetricsProcessor
      getObservabilityPipelineGenerateMetricsProcessor() throws ClassCastException {
    return (ObservabilityPipelineGenerateMetricsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineOcsfMapperProcessor`. If the actual instance
   * is not `ObservabilityPipelineOcsfMapperProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineOcsfMapperProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineOcsfMapperProcessor`
   */
  public ObservabilityPipelineOcsfMapperProcessor getObservabilityPipelineOcsfMapperProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineOcsfMapperProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineParseGrokProcessor`. If the actual instance is
   * not `ObservabilityPipelineParseGrokProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineParseGrokProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineParseGrokProcessor`
   */
  public ObservabilityPipelineParseGrokProcessor getObservabilityPipelineParseGrokProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineParseGrokProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineParseJSONProcessor`. If the actual instance is
   * not `ObservabilityPipelineParseJSONProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineParseJSONProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineParseJSONProcessor`
   */
  public ObservabilityPipelineParseJSONProcessor getObservabilityPipelineParseJSONProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineParseJSONProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineParseXMLProcessor`. If the actual instance is
   * not `ObservabilityPipelineParseXMLProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineParseXMLProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineParseXMLProcessor`
   */
  public ObservabilityPipelineParseXMLProcessor getObservabilityPipelineParseXMLProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineParseXMLProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineQuotaProcessor`. If the actual instance is not
   * `ObservabilityPipelineQuotaProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineQuotaProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineQuotaProcessor`
   */
  public ObservabilityPipelineQuotaProcessor getObservabilityPipelineQuotaProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineQuotaProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineReduceProcessor`. If the actual instance is
   * not `ObservabilityPipelineReduceProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineReduceProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineReduceProcessor`
   */
  public ObservabilityPipelineReduceProcessor getObservabilityPipelineReduceProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineReduceProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineRemoveFieldsProcessor`. If the actual instance
   * is not `ObservabilityPipelineRemoveFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineRemoveFieldsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineRemoveFieldsProcessor`
   */
  public ObservabilityPipelineRemoveFieldsProcessor getObservabilityPipelineRemoveFieldsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineRemoveFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineRenameFieldsProcessor`. If the actual instance
   * is not `ObservabilityPipelineRenameFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineRenameFieldsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineRenameFieldsProcessor`
   */
  public ObservabilityPipelineRenameFieldsProcessor getObservabilityPipelineRenameFieldsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineRenameFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSampleProcessor`. If the actual instance is
   * not `ObservabilityPipelineSampleProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSampleProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSampleProcessor`
   */
  public ObservabilityPipelineSampleProcessor getObservabilityPipelineSampleProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineSampleProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessor`. If the actual
   * instance is not `ObservabilityPipelineSensitiveDataScannerProcessor`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSensitiveDataScannerProcessor`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessor`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessor
      getObservabilityPipelineSensitiveDataScannerProcessor() throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSplitArrayProcessor`. If the actual instance
   * is not `ObservabilityPipelineSplitArrayProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSplitArrayProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSplitArrayProcessor`
   */
  public ObservabilityPipelineSplitArrayProcessor getObservabilityPipelineSplitArrayProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineSplitArrayProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineThrottleProcessor`. If the actual instance is
   * not `ObservabilityPipelineThrottleProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineThrottleProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineThrottleProcessor`
   */
  public ObservabilityPipelineThrottleProcessor getObservabilityPipelineThrottleProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineThrottleProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineMetricTagsProcessor`. If the actual instance
   * is not `ObservabilityPipelineMetricTagsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineMetricTagsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineMetricTagsProcessor`
   */
  public ObservabilityPipelineMetricTagsProcessor getObservabilityPipelineMetricTagsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineMetricTagsProcessor) super.getActualInstance();
  }
}
