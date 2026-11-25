/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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
@JsonDeserialize(using = ThresholdPaletteWithCustom.ThresholdPaletteWithCustomDeserializer.class)
@JsonSerialize(using = ThresholdPaletteWithCustom.ThresholdPaletteWithCustomSerializer.class)
public class ThresholdPaletteWithCustom extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ThresholdPaletteWithCustom.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ThresholdPaletteWithCustomSerializer
      extends StdSerializer<ThresholdPaletteWithCustom> {
    public ThresholdPaletteWithCustomSerializer(Class<ThresholdPaletteWithCustom> t) {
      super(t);
    }

    public ThresholdPaletteWithCustomSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ThresholdPaletteWithCustom value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ThresholdPaletteWithCustomDeserializer
      extends StdDeserializer<ThresholdPaletteWithCustom> {
    public ThresholdPaletteWithCustomDeserializer() {
      this(ThresholdPaletteWithCustom.class);
    }

    public ThresholdPaletteWithCustomDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ThresholdPaletteWithCustom deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ThresholdPalette
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ThresholdPalette.class.equals(Integer.class)
            || ThresholdPalette.class.equals(Long.class)
            || ThresholdPalette.class.equals(Float.class)
            || ThresholdPalette.class.equals(Double.class)
            || ThresholdPalette.class.equals(Boolean.class)
            || ThresholdPalette.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ThresholdPalette.class.equals(Integer.class)
                        || ThresholdPalette.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ThresholdPalette.class.equals(Float.class)
                        || ThresholdPalette.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ThresholdPalette.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ThresholdPalette.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ThresholdPalette.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'ThresholdPalette'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ThresholdPalette'", e);
      }

      // deserialize DashboardInlineSchema49
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardInlineSchema49.class.equals(Integer.class)
            || DashboardInlineSchema49.class.equals(Long.class)
            || DashboardInlineSchema49.class.equals(Float.class)
            || DashboardInlineSchema49.class.equals(Double.class)
            || DashboardInlineSchema49.class.equals(Boolean.class)
            || DashboardInlineSchema49.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardInlineSchema49.class.equals(Integer.class)
                        || DashboardInlineSchema49.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardInlineSchema49.class.equals(Float.class)
                        || DashboardInlineSchema49.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardInlineSchema49.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardInlineSchema49.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardInlineSchema49.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'DashboardInlineSchema49'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardInlineSchema49'", e);
      }

      ThresholdPaletteWithCustom ret = new ThresholdPaletteWithCustom();
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
    public ThresholdPaletteWithCustom getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ThresholdPaletteWithCustom cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ThresholdPaletteWithCustom() {
    super("oneOf", Boolean.FALSE);
  }

  public ThresholdPaletteWithCustom(ThresholdPalette o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ThresholdPaletteWithCustom(DashboardInlineSchema49 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ThresholdPalette", new GenericType<ThresholdPalette>() {});
    schemas.put("DashboardInlineSchema49", new GenericType<DashboardInlineSchema49>() {});
    JSON.registerDescendants(
        ThresholdPaletteWithCustom.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ThresholdPaletteWithCustom.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ThresholdPalette, DashboardInlineSchema49
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ThresholdPalette.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DashboardInlineSchema49.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ThresholdPalette, DashboardInlineSchema49");
  }

  /**
   * Get the actual instance, which can be the following: ThresholdPalette, DashboardInlineSchema49
   *
   * @return The actual instance (ThresholdPalette, DashboardInlineSchema49)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ThresholdPalette`. If the actual instance is not
   * `ThresholdPalette`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ThresholdPalette`
   * @throws ClassCastException if the instance is not `ThresholdPalette`
   */
  public ThresholdPalette getThresholdPalette() throws ClassCastException {
    return (ThresholdPalette) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardInlineSchema49`. If the actual instance is not
   * `DashboardInlineSchema49`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardInlineSchema49`
   * @throws ClassCastException if the instance is not `DashboardInlineSchema49`
   */
  public DashboardInlineSchema49 getDashboardInlineSchema49() throws ClassCastException {
    return (DashboardInlineSchema49) super.getActualInstance();
  }
}
