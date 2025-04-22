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

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineDatadogLogsDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSumoLogicDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineElasticsearchDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineRsyslogDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSyslogNgDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(AzureStorageDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(MicrosoftSentinelDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineDatadogLogsDestination",
        new GenericType<ObservabilityPipelineDatadogLogsDestination>() {});
    schemas.put(
        "ObservabilityPipelineSumoLogicDestination",
        new GenericType<ObservabilityPipelineSumoLogicDestination>() {});
    schemas.put(
        "ObservabilityPipelineElasticsearchDestination",
        new GenericType<ObservabilityPipelineElasticsearchDestination>() {});
    schemas.put(
        "ObservabilityPipelineRsyslogDestination",
        new GenericType<ObservabilityPipelineRsyslogDestination>() {});
    schemas.put(
        "ObservabilityPipelineSyslogNgDestination",
        new GenericType<ObservabilityPipelineSyslogNgDestination>() {});
    schemas.put("AzureStorageDestination", new GenericType<AzureStorageDestination>() {});
    schemas.put("MicrosoftSentinelDestination", new GenericType<MicrosoftSentinelDestination>() {});
    JSON.registerDescendants(
        ObservabilityPipelineConfigDestinationItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineConfigDestinationItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineDatadogLogsDestination,
   * ObservabilityPipelineSumoLogicDestination, ObservabilityPipelineElasticsearchDestination,
   * ObservabilityPipelineRsyslogDestination, ObservabilityPipelineSyslogNgDestination,
   * AzureStorageDestination, MicrosoftSentinelDestination
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineDatadogLogsDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSumoLogicDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineElasticsearchDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRsyslogDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSyslogNgDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AzureStorageDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MicrosoftSentinelDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineDatadogLogsDestination,"
            + " ObservabilityPipelineSumoLogicDestination,"
            + " ObservabilityPipelineElasticsearchDestination,"
            + " ObservabilityPipelineRsyslogDestination, ObservabilityPipelineSyslogNgDestination,"
            + " AzureStorageDestination, MicrosoftSentinelDestination");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineDatadogLogsDestination, ObservabilityPipelineSumoLogicDestination,
   * ObservabilityPipelineElasticsearchDestination, ObservabilityPipelineRsyslogDestination,
   * ObservabilityPipelineSyslogNgDestination, AzureStorageDestination, MicrosoftSentinelDestination
   *
   * @return The actual instance (ObservabilityPipelineDatadogLogsDestination,
   *     ObservabilityPipelineSumoLogicDestination, ObservabilityPipelineElasticsearchDestination,
   *     ObservabilityPipelineRsyslogDestination, ObservabilityPipelineSyslogNgDestination,
   *     AzureStorageDestination, MicrosoftSentinelDestination)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
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
   * Get the actual instance of `MicrosoftSentinelDestination`. If the actual instance is not
   * `MicrosoftSentinelDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MicrosoftSentinelDestination`
   * @throws ClassCastException if the instance is not `MicrosoftSentinelDestination`
   */
  public MicrosoftSentinelDestination getMicrosoftSentinelDestination() throws ClassCastException {
    return (MicrosoftSentinelDestination) super.getActualInstance();
  }
}
