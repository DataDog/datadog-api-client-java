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

  public ObservabilityPipelineConfigDestinationItem(
      ObservabilityPipelineGoogleChronicleDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineNewRelicDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigDestinationItem(ObservabilityPipelineSentinelOneDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineDatadogLogsDestination",
        new GenericType<ObservabilityPipelineDatadogLogsDestination>() {});
    schemas.put(
        "ObservabilityPipelineGoogleChronicleDestination",
        new GenericType<ObservabilityPipelineGoogleChronicleDestination>() {});
    schemas.put(
        "ObservabilityPipelineNewRelicDestination",
        new GenericType<ObservabilityPipelineNewRelicDestination>() {});
    schemas.put(
        "ObservabilityPipelineSentinelOneDestination",
        new GenericType<ObservabilityPipelineSentinelOneDestination>() {});
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
   * ObservabilityPipelineGoogleChronicleDestination, ObservabilityPipelineNewRelicDestination,
   * ObservabilityPipelineSentinelOneDestination
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
        ObservabilityPipelineGoogleChronicleDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineNewRelicDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSentinelOneDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineDatadogLogsDestination,"
            + " ObservabilityPipelineGoogleChronicleDestination,"
            + " ObservabilityPipelineNewRelicDestination,"
            + " ObservabilityPipelineSentinelOneDestination");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineDatadogLogsDestination, ObservabilityPipelineGoogleChronicleDestination,
   * ObservabilityPipelineNewRelicDestination, ObservabilityPipelineSentinelOneDestination
   *
   * @return The actual instance (ObservabilityPipelineDatadogLogsDestination,
   *     ObservabilityPipelineGoogleChronicleDestination, ObservabilityPipelineNewRelicDestination,
   *     ObservabilityPipelineSentinelOneDestination)
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
}
