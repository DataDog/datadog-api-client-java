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
        ObservabilityPipelineSocketSourceFraming
            .ObservabilityPipelineSocketSourceFramingDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineSocketSourceFraming.ObservabilityPipelineSocketSourceFramingSerializer
            .class)
public class ObservabilityPipelineSocketSourceFraming extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineSocketSourceFraming.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineSocketSourceFramingSerializer
      extends StdSerializer<ObservabilityPipelineSocketSourceFraming> {
    public ObservabilityPipelineSocketSourceFramingSerializer(
        Class<ObservabilityPipelineSocketSourceFraming> t) {
      super(t);
    }

    public ObservabilityPipelineSocketSourceFramingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSocketSourceFraming value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineSocketSourceFramingDeserializer
      extends StdDeserializer<ObservabilityPipelineSocketSourceFraming> {
    public ObservabilityPipelineSocketSourceFramingDeserializer() {
      this(ObservabilityPipelineSocketSourceFraming.class);
    }

    public ObservabilityPipelineSocketSourceFramingDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineSocketSourceFraming deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineSocketSourceFramingNewlineDelimited
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(Integer.class)
            || ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(Long.class)
            || ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(Float.class)
            || ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(Double.class)
            || ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(Boolean.class)
            || ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(Float.class)
                        || ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingNewlineDelimited.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSocketSourceFramingNewlineDelimited.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSocketSourceFramingNewlineDelimited) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSocketSourceFramingNewlineDelimited'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSocketSourceFramingNewlineDelimited'",
            e);
      }

      // deserialize ObservabilityPipelineSocketSourceFramingBytes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSocketSourceFramingBytes.class.equals(Integer.class)
            || ObservabilityPipelineSocketSourceFramingBytes.class.equals(Long.class)
            || ObservabilityPipelineSocketSourceFramingBytes.class.equals(Float.class)
            || ObservabilityPipelineSocketSourceFramingBytes.class.equals(Double.class)
            || ObservabilityPipelineSocketSourceFramingBytes.class.equals(Boolean.class)
            || ObservabilityPipelineSocketSourceFramingBytes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingBytes.class.equals(Integer.class)
                        || ObservabilityPipelineSocketSourceFramingBytes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingBytes.class.equals(Float.class)
                        || ObservabilityPipelineSocketSourceFramingBytes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingBytes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingBytes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSocketSourceFramingBytes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSocketSourceFramingBytes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineSocketSourceFramingBytes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSocketSourceFramingBytes'",
            e);
      }

      // deserialize ObservabilityPipelineSocketSourceFramingCharacterDelimited
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(Integer.class)
            || ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(Long.class)
            || ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(Float.class)
            || ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(Double.class)
            || ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                Boolean.class)
            || ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                            Float.class)
                        || ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingCharacterDelimited.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSocketSourceFramingCharacterDelimited.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSocketSourceFramingCharacterDelimited) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSocketSourceFramingCharacterDelimited'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSocketSourceFramingCharacterDelimited'",
            e);
      }

      // deserialize ObservabilityPipelineSocketSourceFramingOctetCounting
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Integer.class)
            || ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Long.class)
            || ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Float.class)
            || ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Double.class)
            || ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Boolean.class)
            || ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Integer.class)
                        || ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Float.class)
                        || ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingOctetCounting.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSocketSourceFramingOctetCounting.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSocketSourceFramingOctetCounting) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineSocketSourceFramingOctetCounting'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSocketSourceFramingOctetCounting'",
            e);
      }

      // deserialize ObservabilityPipelineSocketSourceFramingChunkedGelf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Integer.class)
            || ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Long.class)
            || ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Float.class)
            || ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Double.class)
            || ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Boolean.class)
            || ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Integer.class)
                        || ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Float.class)
                        || ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSocketSourceFramingChunkedGelf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSocketSourceFramingChunkedGelf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSocketSourceFramingChunkedGelf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineSocketSourceFramingChunkedGelf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSocketSourceFramingChunkedGelf'",
            e);
      }

      ObservabilityPipelineSocketSourceFraming ret = new ObservabilityPipelineSocketSourceFraming();
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
    public ObservabilityPipelineSocketSourceFraming getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineSocketSourceFraming cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineSocketSourceFraming() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineSocketSourceFraming(
      ObservabilityPipelineSocketSourceFramingNewlineDelimited o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSocketSourceFraming(ObservabilityPipelineSocketSourceFramingBytes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSocketSourceFraming(
      ObservabilityPipelineSocketSourceFramingCharacterDelimited o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSocketSourceFraming(
      ObservabilityPipelineSocketSourceFramingOctetCounting o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSocketSourceFraming(
      ObservabilityPipelineSocketSourceFramingChunkedGelf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineSocketSourceFramingNewlineDelimited",
        new GenericType<ObservabilityPipelineSocketSourceFramingNewlineDelimited>() {});
    schemas.put(
        "ObservabilityPipelineSocketSourceFramingBytes",
        new GenericType<ObservabilityPipelineSocketSourceFramingBytes>() {});
    schemas.put(
        "ObservabilityPipelineSocketSourceFramingCharacterDelimited",
        new GenericType<ObservabilityPipelineSocketSourceFramingCharacterDelimited>() {});
    schemas.put(
        "ObservabilityPipelineSocketSourceFramingOctetCounting",
        new GenericType<ObservabilityPipelineSocketSourceFramingOctetCounting>() {});
    schemas.put(
        "ObservabilityPipelineSocketSourceFramingChunkedGelf",
        new GenericType<ObservabilityPipelineSocketSourceFramingChunkedGelf>() {});
    JSON.registerDescendants(
        ObservabilityPipelineSocketSourceFraming.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineSocketSourceFraming.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineSocketSourceFramingNewlineDelimited,
   * ObservabilityPipelineSocketSourceFramingBytes,
   * ObservabilityPipelineSocketSourceFramingCharacterDelimited,
   * ObservabilityPipelineSocketSourceFramingOctetCounting,
   * ObservabilityPipelineSocketSourceFramingChunkedGelf
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineSocketSourceFramingNewlineDelimited.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSocketSourceFramingBytes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSocketSourceFramingCharacterDelimited.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSocketSourceFramingOctetCounting.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSocketSourceFramingChunkedGelf.class,
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
        "Invalid instance type. Must be ObservabilityPipelineSocketSourceFramingNewlineDelimited,"
            + " ObservabilityPipelineSocketSourceFramingBytes,"
            + " ObservabilityPipelineSocketSourceFramingCharacterDelimited,"
            + " ObservabilityPipelineSocketSourceFramingOctetCounting,"
            + " ObservabilityPipelineSocketSourceFramingChunkedGelf");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineSocketSourceFramingNewlineDelimited,
   * ObservabilityPipelineSocketSourceFramingBytes,
   * ObservabilityPipelineSocketSourceFramingCharacterDelimited,
   * ObservabilityPipelineSocketSourceFramingOctetCounting,
   * ObservabilityPipelineSocketSourceFramingChunkedGelf
   *
   * @return The actual instance (ObservabilityPipelineSocketSourceFramingNewlineDelimited,
   *     ObservabilityPipelineSocketSourceFramingBytes,
   *     ObservabilityPipelineSocketSourceFramingCharacterDelimited,
   *     ObservabilityPipelineSocketSourceFramingOctetCounting,
   *     ObservabilityPipelineSocketSourceFramingChunkedGelf)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSocketSourceFramingNewlineDelimited`. If the
   * actual instance is not `ObservabilityPipelineSocketSourceFramingNewlineDelimited`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSocketSourceFramingNewlineDelimited`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSocketSourceFramingNewlineDelimited`
   */
  public ObservabilityPipelineSocketSourceFramingNewlineDelimited
      getObservabilityPipelineSocketSourceFramingNewlineDelimited() throws ClassCastException {
    return (ObservabilityPipelineSocketSourceFramingNewlineDelimited) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSocketSourceFramingBytes`. If the actual
   * instance is not `ObservabilityPipelineSocketSourceFramingBytes`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSocketSourceFramingBytes`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSocketSourceFramingBytes`
   */
  public ObservabilityPipelineSocketSourceFramingBytes
      getObservabilityPipelineSocketSourceFramingBytes() throws ClassCastException {
    return (ObservabilityPipelineSocketSourceFramingBytes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSocketSourceFramingCharacterDelimited`. If the
   * actual instance is not `ObservabilityPipelineSocketSourceFramingCharacterDelimited`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSocketSourceFramingCharacterDelimited`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSocketSourceFramingCharacterDelimited`
   */
  public ObservabilityPipelineSocketSourceFramingCharacterDelimited
      getObservabilityPipelineSocketSourceFramingCharacterDelimited() throws ClassCastException {
    return (ObservabilityPipelineSocketSourceFramingCharacterDelimited) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSocketSourceFramingOctetCounting`. If the
   * actual instance is not `ObservabilityPipelineSocketSourceFramingOctetCounting`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSocketSourceFramingOctetCounting`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSocketSourceFramingOctetCounting`
   */
  public ObservabilityPipelineSocketSourceFramingOctetCounting
      getObservabilityPipelineSocketSourceFramingOctetCounting() throws ClassCastException {
    return (ObservabilityPipelineSocketSourceFramingOctetCounting) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSocketSourceFramingChunkedGelf`. If the actual
   * instance is not `ObservabilityPipelineSocketSourceFramingChunkedGelf`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSocketSourceFramingChunkedGelf`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSocketSourceFramingChunkedGelf`
   */
  public ObservabilityPipelineSocketSourceFramingChunkedGelf
      getObservabilityPipelineSocketSourceFramingChunkedGelf() throws ClassCastException {
    return (ObservabilityPipelineSocketSourceFramingChunkedGelf) super.getActualInstance();
  }
}
