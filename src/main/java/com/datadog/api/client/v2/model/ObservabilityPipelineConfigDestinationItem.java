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
        ObservabilityPipelineConfigDestinationItem
            .ObservabilityPipelineConfigDestinationItemDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineConfigDestinationItem
            .ObservabilityPipelineConfigDestinationItemSerializer.class)
public class ObservabilityPipelineConfigDestinationItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineConfigDestinationItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineConfigDestinationItemSerializer
      extends StdSerializer<ObservabilityPipelineConfigDestinationItem> {
    public ObservabilityPipelineConfigDestinationItemSerializer(
        Class<ObservabilityPipelineConfigDestinationItem> t) {
      super(t);
    }

    public ObservabilityPipelineConfigDestinationItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineConfigDestinationItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineConfigDestinationItemDeserializer
      extends StdDeserializer<ObservabilityPipelineConfigDestinationItem> {
    public ObservabilityPipelineConfigDestinationItemDeserializer() {
      this(ObservabilityPipelineConfigDestinationItem.class);
    }

    public ObservabilityPipelineConfigDestinationItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineConfigDestinationItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineHttpClientDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineHttpClientDestination.class.equals(Integer.class)
            || ObservabilityPipelineHttpClientDestination.class.equals(Long.class)
            || ObservabilityPipelineHttpClientDestination.class.equals(Float.class)
            || ObservabilityPipelineHttpClientDestination.class.equals(Double.class)
            || ObservabilityPipelineHttpClientDestination.class.equals(Boolean.class)
            || ObservabilityPipelineHttpClientDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineHttpClientDestination.class.equals(Integer.class)
                        || ObservabilityPipelineHttpClientDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineHttpClientDestination.class.equals(Float.class)
                        || ObservabilityPipelineHttpClientDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineHttpClientDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineHttpClientDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineHttpClientDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineHttpClientDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineHttpClientDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineHttpClientDestination'",
            e);
      }

      // deserialize ObservabilityPipelineAmazonOpenSearchDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Integer.class)
            || ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Long.class)
            || ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Float.class)
            || ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Double.class)
            || ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonOpenSearchDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Integer.class)
                        || ObservabilityPipelineAmazonOpenSearchDestination.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Float.class)
                        || ObservabilityPipelineAmazonOpenSearchDestination.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonOpenSearchDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonOpenSearchDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAmazonOpenSearchDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonOpenSearchDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineAmazonOpenSearchDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAmazonOpenSearchDestination'",
            e);
      }

      // deserialize ObservabilityPipelineAmazonS3Destination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonS3Destination.class.equals(Integer.class)
            || ObservabilityPipelineAmazonS3Destination.class.equals(Long.class)
            || ObservabilityPipelineAmazonS3Destination.class.equals(Float.class)
            || ObservabilityPipelineAmazonS3Destination.class.equals(Double.class)
            || ObservabilityPipelineAmazonS3Destination.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonS3Destination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3Destination.class.equals(Integer.class)
                        || ObservabilityPipelineAmazonS3Destination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3Destination.class.equals(Float.class)
                        || ObservabilityPipelineAmazonS3Destination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3Destination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3Destination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAmazonS3Destination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonS3Destination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3Destination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAmazonS3Destination'",
            e);
      }

      // deserialize ObservabilityPipelineAmazonSecurityLakeDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Integer.class)
            || ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Long.class)
            || ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Float.class)
            || ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Double.class)
            || ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Integer.class)
                        || ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Float.class)
                        || ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonSecurityLakeDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAmazonSecurityLakeDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonSecurityLakeDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineAmazonSecurityLakeDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAmazonSecurityLakeDestination'",
            e);
      }

      // deserialize AzureStorageDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AzureStorageDestination.class.equals(Integer.class)
            || AzureStorageDestination.class.equals(Long.class)
            || AzureStorageDestination.class.equals(Float.class)
            || AzureStorageDestination.class.equals(Double.class)
            || AzureStorageDestination.class.equals(Boolean.class)
            || AzureStorageDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AzureStorageDestination.class.equals(Integer.class)
                        || AzureStorageDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AzureStorageDestination.class.equals(Float.class)
                        || AzureStorageDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AzureStorageDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AzureStorageDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AzureStorageDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AzureStorageDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AzureStorageDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AzureStorageDestination'", e);
      }

      // deserialize ObservabilityPipelineCloudPremDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineCloudPremDestination.class.equals(Integer.class)
            || ObservabilityPipelineCloudPremDestination.class.equals(Long.class)
            || ObservabilityPipelineCloudPremDestination.class.equals(Float.class)
            || ObservabilityPipelineCloudPremDestination.class.equals(Double.class)
            || ObservabilityPipelineCloudPremDestination.class.equals(Boolean.class)
            || ObservabilityPipelineCloudPremDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineCloudPremDestination.class.equals(Integer.class)
                        || ObservabilityPipelineCloudPremDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineCloudPremDestination.class.equals(Float.class)
                        || ObservabilityPipelineCloudPremDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineCloudPremDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineCloudPremDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineCloudPremDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineCloudPremDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineCloudPremDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineCloudPremDestination'",
            e);
      }

      // deserialize ObservabilityPipelineCrowdStrikeNextGenSiemDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Integer.class)
            || ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Long.class)
            || ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Float.class)
            || ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Double.class)
            || ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Boolean.class)
            || ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Integer.class)
                        || ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Float.class)
                        || ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineCrowdStrikeNextGenSiemDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineCrowdStrikeNextGenSiemDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineCrowdStrikeNextGenSiemDestination'",
            e);
      }

      // deserialize ObservabilityPipelineDatadogLogsDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineDatadogLogsDestination.class.equals(Integer.class)
            || ObservabilityPipelineDatadogLogsDestination.class.equals(Long.class)
            || ObservabilityPipelineDatadogLogsDestination.class.equals(Float.class)
            || ObservabilityPipelineDatadogLogsDestination.class.equals(Double.class)
            || ObservabilityPipelineDatadogLogsDestination.class.equals(Boolean.class)
            || ObservabilityPipelineDatadogLogsDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineDatadogLogsDestination.class.equals(Integer.class)
                        || ObservabilityPipelineDatadogLogsDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineDatadogLogsDestination.class.equals(Float.class)
                        || ObservabilityPipelineDatadogLogsDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineDatadogLogsDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineDatadogLogsDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineDatadogLogsDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineDatadogLogsDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineDatadogLogsDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineDatadogLogsDestination'",
            e);
      }

      // deserialize ObservabilityPipelineElasticsearchDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineElasticsearchDestination.class.equals(Integer.class)
            || ObservabilityPipelineElasticsearchDestination.class.equals(Long.class)
            || ObservabilityPipelineElasticsearchDestination.class.equals(Float.class)
            || ObservabilityPipelineElasticsearchDestination.class.equals(Double.class)
            || ObservabilityPipelineElasticsearchDestination.class.equals(Boolean.class)
            || ObservabilityPipelineElasticsearchDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineElasticsearchDestination.class.equals(Integer.class)
                        || ObservabilityPipelineElasticsearchDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineElasticsearchDestination.class.equals(Float.class)
                        || ObservabilityPipelineElasticsearchDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineElasticsearchDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineElasticsearchDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineElasticsearchDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineElasticsearchDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineElasticsearchDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineElasticsearchDestination'",
            e);
      }

      // deserialize ObservabilityPipelineGoogleChronicleDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGoogleChronicleDestination.class.equals(Integer.class)
            || ObservabilityPipelineGoogleChronicleDestination.class.equals(Long.class)
            || ObservabilityPipelineGoogleChronicleDestination.class.equals(Float.class)
            || ObservabilityPipelineGoogleChronicleDestination.class.equals(Double.class)
            || ObservabilityPipelineGoogleChronicleDestination.class.equals(Boolean.class)
            || ObservabilityPipelineGoogleChronicleDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGoogleChronicleDestination.class.equals(Integer.class)
                        || ObservabilityPipelineGoogleChronicleDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGoogleChronicleDestination.class.equals(Float.class)
                        || ObservabilityPipelineGoogleChronicleDestination.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGoogleChronicleDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGoogleChronicleDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGoogleChronicleDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGoogleChronicleDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineGoogleChronicleDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineGoogleChronicleDestination'",
            e);
      }

      // deserialize ObservabilityPipelineGoogleCloudStorageDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Integer.class)
            || ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Long.class)
            || ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Float.class)
            || ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Double.class)
            || ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Boolean.class)
            || ObservabilityPipelineGoogleCloudStorageDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Integer.class)
                        || ObservabilityPipelineGoogleCloudStorageDestination.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Float.class)
                        || ObservabilityPipelineGoogleCloudStorageDestination.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGoogleCloudStorageDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGoogleCloudStorageDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGoogleCloudStorageDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGoogleCloudStorageDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineGoogleCloudStorageDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineGoogleCloudStorageDestination'",
            e);
      }

      // deserialize ObservabilityPipelineGooglePubSubDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGooglePubSubDestination.class.equals(Integer.class)
            || ObservabilityPipelineGooglePubSubDestination.class.equals(Long.class)
            || ObservabilityPipelineGooglePubSubDestination.class.equals(Float.class)
            || ObservabilityPipelineGooglePubSubDestination.class.equals(Double.class)
            || ObservabilityPipelineGooglePubSubDestination.class.equals(Boolean.class)
            || ObservabilityPipelineGooglePubSubDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGooglePubSubDestination.class.equals(Integer.class)
                        || ObservabilityPipelineGooglePubSubDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGooglePubSubDestination.class.equals(Float.class)
                        || ObservabilityPipelineGooglePubSubDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGooglePubSubDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGooglePubSubDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGooglePubSubDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGooglePubSubDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineGooglePubSubDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineGooglePubSubDestination'",
            e);
      }

      // deserialize ObservabilityPipelineKafkaDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineKafkaDestination.class.equals(Integer.class)
            || ObservabilityPipelineKafkaDestination.class.equals(Long.class)
            || ObservabilityPipelineKafkaDestination.class.equals(Float.class)
            || ObservabilityPipelineKafkaDestination.class.equals(Double.class)
            || ObservabilityPipelineKafkaDestination.class.equals(Boolean.class)
            || ObservabilityPipelineKafkaDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineKafkaDestination.class.equals(Integer.class)
                        || ObservabilityPipelineKafkaDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineKafkaDestination.class.equals(Float.class)
                        || ObservabilityPipelineKafkaDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineKafkaDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineKafkaDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineKafkaDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineKafkaDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineKafkaDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineKafkaDestination'",
            e);
      }

      // deserialize MicrosoftSentinelDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MicrosoftSentinelDestination.class.equals(Integer.class)
            || MicrosoftSentinelDestination.class.equals(Long.class)
            || MicrosoftSentinelDestination.class.equals(Float.class)
            || MicrosoftSentinelDestination.class.equals(Double.class)
            || MicrosoftSentinelDestination.class.equals(Boolean.class)
            || MicrosoftSentinelDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MicrosoftSentinelDestination.class.equals(Integer.class)
                        || MicrosoftSentinelDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MicrosoftSentinelDestination.class.equals(Float.class)
                        || MicrosoftSentinelDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MicrosoftSentinelDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MicrosoftSentinelDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MicrosoftSentinelDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MicrosoftSentinelDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MicrosoftSentinelDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MicrosoftSentinelDestination'", e);
      }

      // deserialize ObservabilityPipelineNewRelicDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineNewRelicDestination.class.equals(Integer.class)
            || ObservabilityPipelineNewRelicDestination.class.equals(Long.class)
            || ObservabilityPipelineNewRelicDestination.class.equals(Float.class)
            || ObservabilityPipelineNewRelicDestination.class.equals(Double.class)
            || ObservabilityPipelineNewRelicDestination.class.equals(Boolean.class)
            || ObservabilityPipelineNewRelicDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineNewRelicDestination.class.equals(Integer.class)
                        || ObservabilityPipelineNewRelicDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineNewRelicDestination.class.equals(Float.class)
                        || ObservabilityPipelineNewRelicDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineNewRelicDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineNewRelicDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineNewRelicDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineNewRelicDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineNewRelicDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineNewRelicDestination'",
            e);
      }

      // deserialize ObservabilityPipelineOpenSearchDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineOpenSearchDestination.class.equals(Integer.class)
            || ObservabilityPipelineOpenSearchDestination.class.equals(Long.class)
            || ObservabilityPipelineOpenSearchDestination.class.equals(Float.class)
            || ObservabilityPipelineOpenSearchDestination.class.equals(Double.class)
            || ObservabilityPipelineOpenSearchDestination.class.equals(Boolean.class)
            || ObservabilityPipelineOpenSearchDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineOpenSearchDestination.class.equals(Integer.class)
                        || ObservabilityPipelineOpenSearchDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineOpenSearchDestination.class.equals(Float.class)
                        || ObservabilityPipelineOpenSearchDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineOpenSearchDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineOpenSearchDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineOpenSearchDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineOpenSearchDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineOpenSearchDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineOpenSearchDestination'",
            e);
      }

      // deserialize ObservabilityPipelineRsyslogDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineRsyslogDestination.class.equals(Integer.class)
            || ObservabilityPipelineRsyslogDestination.class.equals(Long.class)
            || ObservabilityPipelineRsyslogDestination.class.equals(Float.class)
            || ObservabilityPipelineRsyslogDestination.class.equals(Double.class)
            || ObservabilityPipelineRsyslogDestination.class.equals(Boolean.class)
            || ObservabilityPipelineRsyslogDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineRsyslogDestination.class.equals(Integer.class)
                        || ObservabilityPipelineRsyslogDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineRsyslogDestination.class.equals(Float.class)
                        || ObservabilityPipelineRsyslogDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineRsyslogDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineRsyslogDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineRsyslogDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineRsyslogDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineRsyslogDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineRsyslogDestination'",
            e);
      }

      // deserialize ObservabilityPipelineSentinelOneDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSentinelOneDestination.class.equals(Integer.class)
            || ObservabilityPipelineSentinelOneDestination.class.equals(Long.class)
            || ObservabilityPipelineSentinelOneDestination.class.equals(Float.class)
            || ObservabilityPipelineSentinelOneDestination.class.equals(Double.class)
            || ObservabilityPipelineSentinelOneDestination.class.equals(Boolean.class)
            || ObservabilityPipelineSentinelOneDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSentinelOneDestination.class.equals(Integer.class)
                        || ObservabilityPipelineSentinelOneDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSentinelOneDestination.class.equals(Float.class)
                        || ObservabilityPipelineSentinelOneDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSentinelOneDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSentinelOneDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSentinelOneDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSentinelOneDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineSentinelOneDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSentinelOneDestination'",
            e);
      }

      // deserialize ObservabilityPipelineSocketDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSocketDestination.class.equals(Integer.class)
            || ObservabilityPipelineSocketDestination.class.equals(Long.class)
            || ObservabilityPipelineSocketDestination.class.equals(Float.class)
            || ObservabilityPipelineSocketDestination.class.equals(Double.class)
            || ObservabilityPipelineSocketDestination.class.equals(Boolean.class)
            || ObservabilityPipelineSocketDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSocketDestination.class.equals(Integer.class)
                        || ObservabilityPipelineSocketDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSocketDestination.class.equals(Float.class)
                        || ObservabilityPipelineSocketDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSocketDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSocketDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSocketDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSocketDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineSocketDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSocketDestination'",
            e);
      }

      // deserialize ObservabilityPipelineSplunkHecDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSplunkHecDestination.class.equals(Integer.class)
            || ObservabilityPipelineSplunkHecDestination.class.equals(Long.class)
            || ObservabilityPipelineSplunkHecDestination.class.equals(Float.class)
            || ObservabilityPipelineSplunkHecDestination.class.equals(Double.class)
            || ObservabilityPipelineSplunkHecDestination.class.equals(Boolean.class)
            || ObservabilityPipelineSplunkHecDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSplunkHecDestination.class.equals(Integer.class)
                        || ObservabilityPipelineSplunkHecDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSplunkHecDestination.class.equals(Float.class)
                        || ObservabilityPipelineSplunkHecDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSplunkHecDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSplunkHecDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSplunkHecDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSplunkHecDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineSplunkHecDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSplunkHecDestination'",
            e);
      }

      // deserialize ObservabilityPipelineSumoLogicDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSumoLogicDestination.class.equals(Integer.class)
            || ObservabilityPipelineSumoLogicDestination.class.equals(Long.class)
            || ObservabilityPipelineSumoLogicDestination.class.equals(Float.class)
            || ObservabilityPipelineSumoLogicDestination.class.equals(Double.class)
            || ObservabilityPipelineSumoLogicDestination.class.equals(Boolean.class)
            || ObservabilityPipelineSumoLogicDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSumoLogicDestination.class.equals(Integer.class)
                        || ObservabilityPipelineSumoLogicDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSumoLogicDestination.class.equals(Float.class)
                        || ObservabilityPipelineSumoLogicDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSumoLogicDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSumoLogicDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSumoLogicDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSumoLogicDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineSumoLogicDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSumoLogicDestination'",
            e);
      }

      // deserialize ObservabilityPipelineSyslogNgDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSyslogNgDestination.class.equals(Integer.class)
            || ObservabilityPipelineSyslogNgDestination.class.equals(Long.class)
            || ObservabilityPipelineSyslogNgDestination.class.equals(Float.class)
            || ObservabilityPipelineSyslogNgDestination.class.equals(Double.class)
            || ObservabilityPipelineSyslogNgDestination.class.equals(Boolean.class)
            || ObservabilityPipelineSyslogNgDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSyslogNgDestination.class.equals(Integer.class)
                        || ObservabilityPipelineSyslogNgDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSyslogNgDestination.class.equals(Float.class)
                        || ObservabilityPipelineSyslogNgDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSyslogNgDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSyslogNgDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSyslogNgDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSyslogNgDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineSyslogNgDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSyslogNgDestination'",
            e);
      }

      // deserialize ObservabilityPipelineDatadogMetricsDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineDatadogMetricsDestination.class.equals(Integer.class)
            || ObservabilityPipelineDatadogMetricsDestination.class.equals(Long.class)
            || ObservabilityPipelineDatadogMetricsDestination.class.equals(Float.class)
            || ObservabilityPipelineDatadogMetricsDestination.class.equals(Double.class)
            || ObservabilityPipelineDatadogMetricsDestination.class.equals(Boolean.class)
            || ObservabilityPipelineDatadogMetricsDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineDatadogMetricsDestination.class.equals(Integer.class)
                        || ObservabilityPipelineDatadogMetricsDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineDatadogMetricsDestination.class.equals(Float.class)
                        || ObservabilityPipelineDatadogMetricsDestination.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineDatadogMetricsDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineDatadogMetricsDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineDatadogMetricsDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineDatadogMetricsDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineDatadogMetricsDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineDatadogMetricsDestination'",
            e);
      }

      ObservabilityPipelineConfigDestinationItem ret =
          new ObservabilityPipelineConfigDestinationItem();
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
    public ObservabilityPipelineConfigDestinationItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineConfigDestinationItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineConfigDestinationItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineHttpClientDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineAmazonOpenSearchDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineAmazonS3Destination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineAmazonSecurityLakeDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(AzureStorageDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineCloudPremDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineCrowdStrikeNextGenSiemDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineDatadogLogsDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineElasticsearchDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineGoogleChronicleDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineGoogleCloudStorageDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineGooglePubSubDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineKafkaDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(MicrosoftSentinelDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineNewRelicDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineOpenSearchDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineRsyslogDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSentinelOneDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSocketDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSplunkHecDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSumoLogicDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSyslogNgDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineDatadogMetricsDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineHttpClientDestination",
        new GenericType<ObservabilityPipelineHttpClientDestination>() {});
    schemas.put(
        "ObservabilityPipelineAmazonOpenSearchDestination",
        new GenericType<ObservabilityPipelineAmazonOpenSearchDestination>() {});
    schemas.put(
        "ObservabilityPipelineAmazonS3Destination",
        new GenericType<ObservabilityPipelineAmazonS3Destination>() {});
    schemas.put(
        "ObservabilityPipelineAmazonSecurityLakeDestination",
        new GenericType<ObservabilityPipelineAmazonSecurityLakeDestination>() {});
    schemas.put("AzureStorageDestination", new GenericType<AzureStorageDestination>() {});
    schemas.put(
        "ObservabilityPipelineCloudPremDestination",
        new GenericType<ObservabilityPipelineCloudPremDestination>() {});
    schemas.put(
        "ObservabilityPipelineCrowdStrikeNextGenSiemDestination",
        new GenericType<ObservabilityPipelineCrowdStrikeNextGenSiemDestination>() {});
    schemas.put(
        "ObservabilityPipelineDatadogLogsDestination",
        new GenericType<ObservabilityPipelineDatadogLogsDestination>() {});
    schemas.put(
        "ObservabilityPipelineElasticsearchDestination",
        new GenericType<ObservabilityPipelineElasticsearchDestination>() {});
    schemas.put(
        "ObservabilityPipelineGoogleChronicleDestination",
        new GenericType<ObservabilityPipelineGoogleChronicleDestination>() {});
    schemas.put(
        "ObservabilityPipelineGoogleCloudStorageDestination",
        new GenericType<ObservabilityPipelineGoogleCloudStorageDestination>() {});
    schemas.put(
        "ObservabilityPipelineGooglePubSubDestination",
        new GenericType<ObservabilityPipelineGooglePubSubDestination>() {});
    schemas.put(
        "ObservabilityPipelineKafkaDestination",
        new GenericType<ObservabilityPipelineKafkaDestination>() {});
    schemas.put("MicrosoftSentinelDestination", new GenericType<MicrosoftSentinelDestination>() {});
    schemas.put(
        "ObservabilityPipelineNewRelicDestination",
        new GenericType<ObservabilityPipelineNewRelicDestination>() {});
    schemas.put(
        "ObservabilityPipelineOpenSearchDestination",
        new GenericType<ObservabilityPipelineOpenSearchDestination>() {});
    schemas.put(
        "ObservabilityPipelineRsyslogDestination",
        new GenericType<ObservabilityPipelineRsyslogDestination>() {});
    schemas.put(
        "ObservabilityPipelineSentinelOneDestination",
        new GenericType<ObservabilityPipelineSentinelOneDestination>() {});
    schemas.put(
        "ObservabilityPipelineSocketDestination",
        new GenericType<ObservabilityPipelineSocketDestination>() {});
    schemas.put(
        "ObservabilityPipelineSplunkHecDestination",
        new GenericType<ObservabilityPipelineSplunkHecDestination>() {});
    schemas.put(
        "ObservabilityPipelineSumoLogicDestination",
        new GenericType<ObservabilityPipelineSumoLogicDestination>() {});
    schemas.put(
        "ObservabilityPipelineSyslogNgDestination",
        new GenericType<ObservabilityPipelineSyslogNgDestination>() {});
    schemas.put(
        "ObservabilityPipelineDatadogMetricsDestination",
        new GenericType<ObservabilityPipelineDatadogMetricsDestination>() {});
    JSON.registerDescendants(
        ObservabilityPipelineConfigDestinationItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineConfigDestinationItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineHttpClientDestination,
   * ObservabilityPipelineAmazonOpenSearchDestination, ObservabilityPipelineAmazonS3Destination,
   * ObservabilityPipelineAmazonSecurityLakeDestination, AzureStorageDestination,
   * ObservabilityPipelineCloudPremDestination,
   * ObservabilityPipelineCrowdStrikeNextGenSiemDestination,
   * ObservabilityPipelineDatadogLogsDestination, ObservabilityPipelineElasticsearchDestination,
   * ObservabilityPipelineGoogleChronicleDestination,
   * ObservabilityPipelineGoogleCloudStorageDestination,
   * ObservabilityPipelineGooglePubSubDestination, ObservabilityPipelineKafkaDestination,
   * MicrosoftSentinelDestination, ObservabilityPipelineNewRelicDestination,
   * ObservabilityPipelineOpenSearchDestination, ObservabilityPipelineRsyslogDestination,
   * ObservabilityPipelineSentinelOneDestination, ObservabilityPipelineSocketDestination,
   * ObservabilityPipelineSplunkHecDestination, ObservabilityPipelineSumoLogicDestination,
   * ObservabilityPipelineSyslogNgDestination, ObservabilityPipelineDatadogMetricsDestination
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineHttpClientDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonOpenSearchDestination.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonS3Destination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonSecurityLakeDestination.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AzureStorageDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineCloudPremDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineCrowdStrikeNextGenSiemDestination.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineDatadogLogsDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineElasticsearchDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineGoogleChronicleDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineGoogleCloudStorageDestination.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineGooglePubSubDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineKafkaDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MicrosoftSentinelDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineNewRelicDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineOpenSearchDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRsyslogDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSentinelOneDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSocketDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSplunkHecDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSumoLogicDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSyslogNgDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineDatadogMetricsDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineHttpClientDestination,"
            + " ObservabilityPipelineAmazonOpenSearchDestination,"
            + " ObservabilityPipelineAmazonS3Destination,"
            + " ObservabilityPipelineAmazonSecurityLakeDestination, AzureStorageDestination,"
            + " ObservabilityPipelineCloudPremDestination,"
            + " ObservabilityPipelineCrowdStrikeNextGenSiemDestination,"
            + " ObservabilityPipelineDatadogLogsDestination,"
            + " ObservabilityPipelineElasticsearchDestination,"
            + " ObservabilityPipelineGoogleChronicleDestination,"
            + " ObservabilityPipelineGoogleCloudStorageDestination,"
            + " ObservabilityPipelineGooglePubSubDestination,"
            + " ObservabilityPipelineKafkaDestination, MicrosoftSentinelDestination,"
            + " ObservabilityPipelineNewRelicDestination,"
            + " ObservabilityPipelineOpenSearchDestination,"
            + " ObservabilityPipelineRsyslogDestination,"
            + " ObservabilityPipelineSentinelOneDestination,"
            + " ObservabilityPipelineSocketDestination, ObservabilityPipelineSplunkHecDestination,"
            + " ObservabilityPipelineSumoLogicDestination,"
            + " ObservabilityPipelineSyslogNgDestination,"
            + " ObservabilityPipelineDatadogMetricsDestination");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineHttpClientDestination, ObservabilityPipelineAmazonOpenSearchDestination,
   * ObservabilityPipelineAmazonS3Destination, ObservabilityPipelineAmazonSecurityLakeDestination,
   * AzureStorageDestination, ObservabilityPipelineCloudPremDestination,
   * ObservabilityPipelineCrowdStrikeNextGenSiemDestination,
   * ObservabilityPipelineDatadogLogsDestination, ObservabilityPipelineElasticsearchDestination,
   * ObservabilityPipelineGoogleChronicleDestination,
   * ObservabilityPipelineGoogleCloudStorageDestination,
   * ObservabilityPipelineGooglePubSubDestination, ObservabilityPipelineKafkaDestination,
   * MicrosoftSentinelDestination, ObservabilityPipelineNewRelicDestination,
   * ObservabilityPipelineOpenSearchDestination, ObservabilityPipelineRsyslogDestination,
   * ObservabilityPipelineSentinelOneDestination, ObservabilityPipelineSocketDestination,
   * ObservabilityPipelineSplunkHecDestination, ObservabilityPipelineSumoLogicDestination,
   * ObservabilityPipelineSyslogNgDestination, ObservabilityPipelineDatadogMetricsDestination
   *
   * @return The actual instance (ObservabilityPipelineHttpClientDestination,
   *     ObservabilityPipelineAmazonOpenSearchDestination, ObservabilityPipelineAmazonS3Destination,
   *     ObservabilityPipelineAmazonSecurityLakeDestination, AzureStorageDestination,
   *     ObservabilityPipelineCloudPremDestination,
   *     ObservabilityPipelineCrowdStrikeNextGenSiemDestination,
   *     ObservabilityPipelineDatadogLogsDestination, ObservabilityPipelineElasticsearchDestination,
   *     ObservabilityPipelineGoogleChronicleDestination,
   *     ObservabilityPipelineGoogleCloudStorageDestination,
   *     ObservabilityPipelineGooglePubSubDestination, ObservabilityPipelineKafkaDestination,
   *     MicrosoftSentinelDestination, ObservabilityPipelineNewRelicDestination,
   *     ObservabilityPipelineOpenSearchDestination, ObservabilityPipelineRsyslogDestination,
   *     ObservabilityPipelineSentinelOneDestination, ObservabilityPipelineSocketDestination,
   *     ObservabilityPipelineSplunkHecDestination, ObservabilityPipelineSumoLogicDestination,
   *     ObservabilityPipelineSyslogNgDestination, ObservabilityPipelineDatadogMetricsDestination)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineHttpClientDestination`. If the actual instance
   * is not `ObservabilityPipelineHttpClientDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineHttpClientDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineHttpClientDestination`
   */
  public ObservabilityPipelineHttpClientDestination getObservabilityPipelineHttpClientDestination()
      throws ClassCastException {
    return (ObservabilityPipelineHttpClientDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonOpenSearchDestination`. If the actual
   * instance is not `ObservabilityPipelineAmazonOpenSearchDestination`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonOpenSearchDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAmazonOpenSearchDestination`
   */
  public ObservabilityPipelineAmazonOpenSearchDestination
      getObservabilityPipelineAmazonOpenSearchDestination() throws ClassCastException {
    return (ObservabilityPipelineAmazonOpenSearchDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonS3Destination`. If the actual instance
   * is not `ObservabilityPipelineAmazonS3Destination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonS3Destination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3Destination`
   */
  public ObservabilityPipelineAmazonS3Destination getObservabilityPipelineAmazonS3Destination()
      throws ClassCastException {
    return (ObservabilityPipelineAmazonS3Destination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonSecurityLakeDestination`. If the actual
   * instance is not `ObservabilityPipelineAmazonSecurityLakeDestination`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonSecurityLakeDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAmazonSecurityLakeDestination`
   */
  public ObservabilityPipelineAmazonSecurityLakeDestination
      getObservabilityPipelineAmazonSecurityLakeDestination() throws ClassCastException {
    return (ObservabilityPipelineAmazonSecurityLakeDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AzureStorageDestination`. If the actual instance is not
   * `AzureStorageDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AzureStorageDestination`
   * @throws ClassCastException if the instance is not `AzureStorageDestination`
   */
  public AzureStorageDestination getAzureStorageDestination() throws ClassCastException {
    return (AzureStorageDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineCloudPremDestination`. If the actual instance
   * is not `ObservabilityPipelineCloudPremDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineCloudPremDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineCloudPremDestination`
   */
  public ObservabilityPipelineCloudPremDestination getObservabilityPipelineCloudPremDestination()
      throws ClassCastException {
    return (ObservabilityPipelineCloudPremDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineCrowdStrikeNextGenSiemDestination`. If the
   * actual instance is not `ObservabilityPipelineCrowdStrikeNextGenSiemDestination`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineCrowdStrikeNextGenSiemDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineCrowdStrikeNextGenSiemDestination`
   */
  public ObservabilityPipelineCrowdStrikeNextGenSiemDestination
      getObservabilityPipelineCrowdStrikeNextGenSiemDestination() throws ClassCastException {
    return (ObservabilityPipelineCrowdStrikeNextGenSiemDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineDatadogLogsDestination`. If the actual
   * instance is not `ObservabilityPipelineDatadogLogsDestination`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineDatadogLogsDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineDatadogLogsDestination`
   */
  public ObservabilityPipelineDatadogLogsDestination
      getObservabilityPipelineDatadogLogsDestination() throws ClassCastException {
    return (ObservabilityPipelineDatadogLogsDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineElasticsearchDestination`. If the actual
   * instance is not `ObservabilityPipelineElasticsearchDestination`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineElasticsearchDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineElasticsearchDestination`
   */
  public ObservabilityPipelineElasticsearchDestination
      getObservabilityPipelineElasticsearchDestination() throws ClassCastException {
    return (ObservabilityPipelineElasticsearchDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGoogleChronicleDestination`. If the actual
   * instance is not `ObservabilityPipelineGoogleChronicleDestination`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGoogleChronicleDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineGoogleChronicleDestination`
   */
  public ObservabilityPipelineGoogleChronicleDestination
      getObservabilityPipelineGoogleChronicleDestination() throws ClassCastException {
    return (ObservabilityPipelineGoogleChronicleDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGoogleCloudStorageDestination`. If the actual
   * instance is not `ObservabilityPipelineGoogleCloudStorageDestination`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGoogleCloudStorageDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineGoogleCloudStorageDestination`
   */
  public ObservabilityPipelineGoogleCloudStorageDestination
      getObservabilityPipelineGoogleCloudStorageDestination() throws ClassCastException {
    return (ObservabilityPipelineGoogleCloudStorageDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGooglePubSubDestination`. If the actual
   * instance is not `ObservabilityPipelineGooglePubSubDestination`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGooglePubSubDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineGooglePubSubDestination`
   */
  public ObservabilityPipelineGooglePubSubDestination
      getObservabilityPipelineGooglePubSubDestination() throws ClassCastException {
    return (ObservabilityPipelineGooglePubSubDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineKafkaDestination`. If the actual instance is
   * not `ObservabilityPipelineKafkaDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineKafkaDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineKafkaDestination`
   */
  public ObservabilityPipelineKafkaDestination getObservabilityPipelineKafkaDestination()
      throws ClassCastException {
    return (ObservabilityPipelineKafkaDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MicrosoftSentinelDestination`. If the actual instance is not
   * `MicrosoftSentinelDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MicrosoftSentinelDestination`
   * @throws ClassCastException if the instance is not `MicrosoftSentinelDestination`
   */
  public MicrosoftSentinelDestination getMicrosoftSentinelDestination() throws ClassCastException {
    return (MicrosoftSentinelDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineNewRelicDestination`. If the actual instance
   * is not `ObservabilityPipelineNewRelicDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineNewRelicDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineNewRelicDestination`
   */
  public ObservabilityPipelineNewRelicDestination getObservabilityPipelineNewRelicDestination()
      throws ClassCastException {
    return (ObservabilityPipelineNewRelicDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineOpenSearchDestination`. If the actual instance
   * is not `ObservabilityPipelineOpenSearchDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineOpenSearchDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineOpenSearchDestination`
   */
  public ObservabilityPipelineOpenSearchDestination getObservabilityPipelineOpenSearchDestination()
      throws ClassCastException {
    return (ObservabilityPipelineOpenSearchDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineRsyslogDestination`. If the actual instance is
   * not `ObservabilityPipelineRsyslogDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineRsyslogDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineRsyslogDestination`
   */
  public ObservabilityPipelineRsyslogDestination getObservabilityPipelineRsyslogDestination()
      throws ClassCastException {
    return (ObservabilityPipelineRsyslogDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSentinelOneDestination`. If the actual
   * instance is not `ObservabilityPipelineSentinelOneDestination`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSentinelOneDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSentinelOneDestination`
   */
  public ObservabilityPipelineSentinelOneDestination
      getObservabilityPipelineSentinelOneDestination() throws ClassCastException {
    return (ObservabilityPipelineSentinelOneDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSocketDestination`. If the actual instance is
   * not `ObservabilityPipelineSocketDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSocketDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSocketDestination`
   */
  public ObservabilityPipelineSocketDestination getObservabilityPipelineSocketDestination()
      throws ClassCastException {
    return (ObservabilityPipelineSocketDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSplunkHecDestination`. If the actual instance
   * is not `ObservabilityPipelineSplunkHecDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSplunkHecDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSplunkHecDestination`
   */
  public ObservabilityPipelineSplunkHecDestination getObservabilityPipelineSplunkHecDestination()
      throws ClassCastException {
    return (ObservabilityPipelineSplunkHecDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSumoLogicDestination`. If the actual instance
   * is not `ObservabilityPipelineSumoLogicDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSumoLogicDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSumoLogicDestination`
   */
  public ObservabilityPipelineSumoLogicDestination getObservabilityPipelineSumoLogicDestination()
      throws ClassCastException {
    return (ObservabilityPipelineSumoLogicDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSyslogNgDestination`. If the actual instance
   * is not `ObservabilityPipelineSyslogNgDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSyslogNgDestination`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSyslogNgDestination`
   */
  public ObservabilityPipelineSyslogNgDestination getObservabilityPipelineSyslogNgDestination()
      throws ClassCastException {
    return (ObservabilityPipelineSyslogNgDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineDatadogMetricsDestination`. If the actual
   * instance is not `ObservabilityPipelineDatadogMetricsDestination`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineDatadogMetricsDestination`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineDatadogMetricsDestination`
   */
  public ObservabilityPipelineDatadogMetricsDestination
      getObservabilityPipelineDatadogMetricsDestination() throws ClassCastException {
    return (ObservabilityPipelineDatadogMetricsDestination) super.getActualInstance();
  }
}
