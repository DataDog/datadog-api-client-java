/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
@JsonDeserialize(using = HeatgridColorConfig.HeatgridColorConfigDeserializer.class)
@JsonSerialize(using = HeatgridColorConfig.HeatgridColorConfigSerializer.class)
public class HeatgridColorConfig extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(HeatgridColorConfig.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HeatgridColorConfigSerializer extends StdSerializer<HeatgridColorConfig> {
    public HeatgridColorConfigSerializer(Class<HeatgridColorConfig> t) {
      super(t);
    }

    public HeatgridColorConfigSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridColorConfig value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HeatgridColorConfigDeserializer extends StdDeserializer<HeatgridColorConfig> {
    public HeatgridColorConfigDeserializer() {
      this(HeatgridColorConfig.class);
    }

    public HeatgridColorConfigDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HeatgridColorConfig deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize HeatgridGradientCustomColor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridGradientCustomColor.class.equals(Integer.class)
            || HeatgridGradientCustomColor.class.equals(Long.class)
            || HeatgridGradientCustomColor.class.equals(Float.class)
            || HeatgridGradientCustomColor.class.equals(Double.class)
            || HeatgridGradientCustomColor.class.equals(Boolean.class)
            || HeatgridGradientCustomColor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridGradientCustomColor.class.equals(Integer.class)
                        || HeatgridGradientCustomColor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridGradientCustomColor.class.equals(Float.class)
                        || HeatgridGradientCustomColor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridGradientCustomColor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridGradientCustomColor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridGradientCustomColor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridGradientCustomColor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridGradientCustomColor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridGradientCustomColor'", e);
      }

      // deserialize HeatgridGradientPresetColor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridGradientPresetColor.class.equals(Integer.class)
            || HeatgridGradientPresetColor.class.equals(Long.class)
            || HeatgridGradientPresetColor.class.equals(Float.class)
            || HeatgridGradientPresetColor.class.equals(Double.class)
            || HeatgridGradientPresetColor.class.equals(Boolean.class)
            || HeatgridGradientPresetColor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridGradientPresetColor.class.equals(Integer.class)
                        || HeatgridGradientPresetColor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridGradientPresetColor.class.equals(Float.class)
                        || HeatgridGradientPresetColor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridGradientPresetColor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridGradientPresetColor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridGradientPresetColor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridGradientPresetColor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridGradientPresetColor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridGradientPresetColor'", e);
      }

      // deserialize HeatgridDiscreteCustomColor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridDiscreteCustomColor.class.equals(Integer.class)
            || HeatgridDiscreteCustomColor.class.equals(Long.class)
            || HeatgridDiscreteCustomColor.class.equals(Float.class)
            || HeatgridDiscreteCustomColor.class.equals(Double.class)
            || HeatgridDiscreteCustomColor.class.equals(Boolean.class)
            || HeatgridDiscreteCustomColor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridDiscreteCustomColor.class.equals(Integer.class)
                        || HeatgridDiscreteCustomColor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridDiscreteCustomColor.class.equals(Float.class)
                        || HeatgridDiscreteCustomColor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridDiscreteCustomColor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridDiscreteCustomColor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridDiscreteCustomColor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridDiscreteCustomColor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridDiscreteCustomColor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridDiscreteCustomColor'", e);
      }

      // deserialize HeatgridDiscretePresetColor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridDiscretePresetColor.class.equals(Integer.class)
            || HeatgridDiscretePresetColor.class.equals(Long.class)
            || HeatgridDiscretePresetColor.class.equals(Float.class)
            || HeatgridDiscretePresetColor.class.equals(Double.class)
            || HeatgridDiscretePresetColor.class.equals(Boolean.class)
            || HeatgridDiscretePresetColor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridDiscretePresetColor.class.equals(Integer.class)
                        || HeatgridDiscretePresetColor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridDiscretePresetColor.class.equals(Float.class)
                        || HeatgridDiscretePresetColor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridDiscretePresetColor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridDiscretePresetColor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridDiscretePresetColor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridDiscretePresetColor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridDiscretePresetColor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridDiscretePresetColor'", e);
      }

      HeatgridColorConfig ret = new HeatgridColorConfig();
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
    public HeatgridColorConfig getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "HeatgridColorConfig cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HeatgridColorConfig() {
    super("oneOf", Boolean.FALSE);
  }

  public HeatgridColorConfig(HeatgridGradientCustomColor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatgridColorConfig(HeatgridGradientPresetColor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatgridColorConfig(HeatgridDiscreteCustomColor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatgridColorConfig(HeatgridDiscretePresetColor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("HeatgridGradientCustomColor", new GenericType<HeatgridGradientCustomColor>() {});
    schemas.put("HeatgridGradientPresetColor", new GenericType<HeatgridGradientPresetColor>() {});
    schemas.put("HeatgridDiscreteCustomColor", new GenericType<HeatgridDiscreteCustomColor>() {});
    schemas.put("HeatgridDiscretePresetColor", new GenericType<HeatgridDiscretePresetColor>() {});
    JSON.registerDescendants(HeatgridColorConfig.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HeatgridColorConfig.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HeatgridGradientCustomColor, HeatgridGradientPresetColor,
   * HeatgridDiscreteCustomColor, HeatgridDiscretePresetColor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(HeatgridGradientCustomColor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatgridGradientPresetColor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatgridDiscreteCustomColor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatgridDiscretePresetColor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HeatgridGradientCustomColor, HeatgridGradientPresetColor,"
            + " HeatgridDiscreteCustomColor, HeatgridDiscretePresetColor");
  }

  /**
   * Get the actual instance, which can be the following: HeatgridGradientCustomColor,
   * HeatgridGradientPresetColor, HeatgridDiscreteCustomColor, HeatgridDiscretePresetColor
   *
   * @return The actual instance (HeatgridGradientCustomColor, HeatgridGradientPresetColor,
   *     HeatgridDiscreteCustomColor, HeatgridDiscretePresetColor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridGradientCustomColor`. If the actual instance is not
   * `HeatgridGradientCustomColor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridGradientCustomColor`
   * @throws ClassCastException if the instance is not `HeatgridGradientCustomColor`
   */
  public HeatgridGradientCustomColor getHeatgridGradientCustomColor() throws ClassCastException {
    return (HeatgridGradientCustomColor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridGradientPresetColor`. If the actual instance is not
   * `HeatgridGradientPresetColor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridGradientPresetColor`
   * @throws ClassCastException if the instance is not `HeatgridGradientPresetColor`
   */
  public HeatgridGradientPresetColor getHeatgridGradientPresetColor() throws ClassCastException {
    return (HeatgridGradientPresetColor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridDiscreteCustomColor`. If the actual instance is not
   * `HeatgridDiscreteCustomColor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridDiscreteCustomColor`
   * @throws ClassCastException if the instance is not `HeatgridDiscreteCustomColor`
   */
  public HeatgridDiscreteCustomColor getHeatgridDiscreteCustomColor() throws ClassCastException {
    return (HeatgridDiscreteCustomColor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridDiscretePresetColor`. If the actual instance is not
   * `HeatgridDiscretePresetColor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridDiscretePresetColor`
   * @throws ClassCastException if the instance is not `HeatgridDiscretePresetColor`
   */
  public HeatgridDiscretePresetColor getHeatgridDiscretePresetColor() throws ClassCastException {
    return (HeatgridDiscretePresetColor) super.getActualInstance();
  }
}
