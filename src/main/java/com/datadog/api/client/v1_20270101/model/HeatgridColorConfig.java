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
      // deserialize HeatgridGradientConfig
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridGradientConfig.class.equals(Integer.class)
            || HeatgridGradientConfig.class.equals(Long.class)
            || HeatgridGradientConfig.class.equals(Float.class)
            || HeatgridGradientConfig.class.equals(Double.class)
            || HeatgridGradientConfig.class.equals(Boolean.class)
            || HeatgridGradientConfig.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridGradientConfig.class.equals(Integer.class)
                        || HeatgridGradientConfig.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridGradientConfig.class.equals(Float.class)
                        || HeatgridGradientConfig.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridGradientConfig.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridGradientConfig.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridGradientConfig.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridGradientConfig) tmp).unparsed
              && !(((HeatgridGradientConfig) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridGradientConfig'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridGradientConfig'", e);
      }

      // deserialize HeatgridDiscreteConfig
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridDiscreteConfig.class.equals(Integer.class)
            || HeatgridDiscreteConfig.class.equals(Long.class)
            || HeatgridDiscreteConfig.class.equals(Float.class)
            || HeatgridDiscreteConfig.class.equals(Double.class)
            || HeatgridDiscreteConfig.class.equals(Boolean.class)
            || HeatgridDiscreteConfig.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridDiscreteConfig.class.equals(Integer.class)
                        || HeatgridDiscreteConfig.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridDiscreteConfig.class.equals(Float.class)
                        || HeatgridDiscreteConfig.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridDiscreteConfig.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridDiscreteConfig.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridDiscreteConfig.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridDiscreteConfig) tmp).unparsed
              && !(((HeatgridDiscreteConfig) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridDiscreteConfig'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridDiscreteConfig'", e);
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

  public HeatgridColorConfig(HeatgridGradientConfig o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatgridColorConfig(HeatgridDiscreteConfig o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("HeatgridGradientConfig", new GenericType<HeatgridGradientConfig>() {});
    schemas.put("HeatgridDiscreteConfig", new GenericType<HeatgridDiscreteConfig>() {});
    JSON.registerDescendants(HeatgridColorConfig.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HeatgridColorConfig.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HeatgridGradientConfig, HeatgridDiscreteConfig
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(HeatgridGradientConfig.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatgridDiscreteConfig.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HeatgridGradientConfig, HeatgridDiscreteConfig");
  }

  /**
   * Get the actual instance, which can be the following: HeatgridGradientConfig,
   * HeatgridDiscreteConfig
   *
   * @return The actual instance (HeatgridGradientConfig, HeatgridDiscreteConfig)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridGradientConfig`. If the actual instance is not
   * `HeatgridGradientConfig`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridGradientConfig`
   * @throws ClassCastException if the instance is not `HeatgridGradientConfig`
   */
  public HeatgridGradientConfig getHeatgridGradientConfig() throws ClassCastException {
    return (HeatgridGradientConfig) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridDiscreteConfig`. If the actual instance is not
   * `HeatgridDiscreteConfig`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridDiscreteConfig`
   * @throws ClassCastException if the instance is not `HeatgridDiscreteConfig`
   */
  public HeatgridDiscreteConfig getHeatgridDiscreteConfig() throws ClassCastException {
    return (HeatgridDiscreteConfig) super.getActualInstance();
  }
}
