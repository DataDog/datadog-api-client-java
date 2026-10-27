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
        ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold
            .ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold
            .ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdSerializer.class)
public class ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(
          ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdSerializer
      extends StdSerializer<ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold> {
    public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdSerializer(
        Class<ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold> t) {
      super(t);
    }

    public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdDeserializer
      extends StdDeserializer<ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold> {
    public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdDeserializer() {
      this(ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold.class);
    }

    public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                Integer.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                Long.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                Float.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                Double.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                Boolean.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                            Float.class)
                        || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes'",
            e);
      }

      // deserialize ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class.equals(
                Integer.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class.equals(
                Long.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class.equals(
                Float.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class.equals(
                Double.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class.equals(
                Boolean.class)
            || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class
                            .equals(Integer.class)
                        || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class
                            .equals(Float.class)
                        || ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class
                        .equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class
                        .equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep
                          .class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep'",
            e);
      }

      ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold ret =
          new ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold();
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
    public ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold(
      ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold(
      ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes",
        new GenericType<ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes>() {});
    schemas.put(
        "ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep",
        new GenericType<
            ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep>() {});
    JSON.registerDescendants(
        ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes,
   * ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be"
            + " ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes,"
            + " ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes,
   * ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep
   *
   * @return The actual instance
   *     (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes,
   *     ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes`. If the actual instance is
   * not `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes`
   */
  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes
      getObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes()
          throws ClassCastException {
    return (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdBytes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep`. If the actual
   * instance is not `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep`
   */
  public ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep
      getObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep()
          throws ClassCastException {
    return (ObservabilityPipelineSpikeProtectionProcessorMinimalThresholdAlwaysKeep)
        super.getActualInstance();
  }
}
