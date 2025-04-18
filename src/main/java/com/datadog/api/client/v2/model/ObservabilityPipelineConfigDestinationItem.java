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

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineAmazonS3Destination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineGoogleCloudStorageDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSplunkHecDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineDatadogLogsDestination",
        new GenericType<ObservabilityPipelineDatadogLogsDestination>() {});
    schemas.put(
        "ObservabilityPipelineAmazonS3Destination",
        new GenericType<ObservabilityPipelineAmazonS3Destination>() {});
    schemas.put(
        "ObservabilityPipelineGoogleCloudStorageDestination",
        new GenericType<ObservabilityPipelineGoogleCloudStorageDestination>() {});
    schemas.put(
        "ObservabilityPipelineSplunkHecDestination",
        new GenericType<ObservabilityPipelineSplunkHecDestination>() {});
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
   * ObservabilityPipelineAmazonS3Destination, ObservabilityPipelineGoogleCloudStorageDestination,
   * ObservabilityPipelineSplunkHecDestination
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
        ObservabilityPipelineAmazonS3Destination.class, instance, new HashSet<Class<?>>())) {
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
        ObservabilityPipelineSplunkHecDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineDatadogLogsDestination,"
            + " ObservabilityPipelineAmazonS3Destination,"
            + " ObservabilityPipelineGoogleCloudStorageDestination,"
            + " ObservabilityPipelineSplunkHecDestination");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineDatadogLogsDestination, ObservabilityPipelineAmazonS3Destination,
   * ObservabilityPipelineGoogleCloudStorageDestination, ObservabilityPipelineSplunkHecDestination
   *
   * @return The actual instance (ObservabilityPipelineDatadogLogsDestination,
   *     ObservabilityPipelineAmazonS3Destination,
   *     ObservabilityPipelineGoogleCloudStorageDestination,
   *     ObservabilityPipelineSplunkHecDestination)
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
}
