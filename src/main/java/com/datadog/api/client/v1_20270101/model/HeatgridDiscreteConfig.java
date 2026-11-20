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
@JsonDeserialize(using = HeatgridDiscreteConfig.HeatgridDiscreteConfigDeserializer.class)
@JsonSerialize(using = HeatgridDiscreteConfig.HeatgridDiscreteConfigSerializer.class)
public class HeatgridDiscreteConfig extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(HeatgridDiscreteConfig.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HeatgridDiscreteConfigSerializer
      extends StdSerializer<HeatgridDiscreteConfig> {
    public HeatgridDiscreteConfigSerializer(Class<HeatgridDiscreteConfig> t) {
      super(t);
    }

    public HeatgridDiscreteConfigSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridDiscreteConfig value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HeatgridDiscreteConfigDeserializer
      extends StdDeserializer<HeatgridDiscreteConfig> {
    public HeatgridDiscreteConfigDeserializer() {
      this(HeatgridDiscreteConfig.class);
    }

    public HeatgridDiscreteConfigDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HeatgridDiscreteConfig deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize HeatgridDiscreteConfig20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridDiscreteConfig20270101OneOf.class.equals(Integer.class)
            || HeatgridDiscreteConfig20270101OneOf.class.equals(Long.class)
            || HeatgridDiscreteConfig20270101OneOf.class.equals(Float.class)
            || HeatgridDiscreteConfig20270101OneOf.class.equals(Double.class)
            || HeatgridDiscreteConfig20270101OneOf.class.equals(Boolean.class)
            || HeatgridDiscreteConfig20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridDiscreteConfig20270101OneOf.class.equals(Integer.class)
                        || HeatgridDiscreteConfig20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridDiscreteConfig20270101OneOf.class.equals(Float.class)
                        || HeatgridDiscreteConfig20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridDiscreteConfig20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridDiscreteConfig20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridDiscreteConfig20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridDiscreteConfig20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridDiscreteConfig20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HeatgridDiscreteConfig20270101OneOf'",
            e);
      }

      // deserialize HeatgridDiscreteConfig20270101OneOf4457881312
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Integer.class)
            || HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Long.class)
            || HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Float.class)
            || HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Double.class)
            || HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Boolean.class)
            || HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Integer.class)
                        || HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Float.class)
                        || HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridDiscreteConfig20270101OneOf4457881312.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(HeatgridDiscreteConfig20270101OneOf4457881312.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridDiscreteConfig20270101OneOf4457881312) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'HeatgridDiscreteConfig20270101OneOf4457881312'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HeatgridDiscreteConfig20270101OneOf4457881312'",
            e);
      }

      HeatgridDiscreteConfig ret = new HeatgridDiscreteConfig();
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
    public HeatgridDiscreteConfig getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "HeatgridDiscreteConfig cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HeatgridDiscreteConfig() {
    super("oneOf", Boolean.FALSE);
  }

  public HeatgridDiscreteConfig(HeatgridDiscreteConfig20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatgridDiscreteConfig(HeatgridDiscreteConfig20270101OneOf4457881312 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "HeatgridDiscreteConfig20270101OneOf",
        new GenericType<HeatgridDiscreteConfig20270101OneOf>() {});
    schemas.put(
        "HeatgridDiscreteConfig20270101OneOf4457881312",
        new GenericType<HeatgridDiscreteConfig20270101OneOf4457881312>() {});
    JSON.registerDescendants(HeatgridDiscreteConfig.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HeatgridDiscreteConfig.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HeatgridDiscreteConfig20270101OneOf,
   * HeatgridDiscreteConfig20270101OneOf4457881312
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        HeatgridDiscreteConfig20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HeatgridDiscreteConfig20270101OneOf4457881312.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HeatgridDiscreteConfig20270101OneOf,"
            + " HeatgridDiscreteConfig20270101OneOf4457881312");
  }

  /**
   * Get the actual instance, which can be the following: HeatgridDiscreteConfig20270101OneOf,
   * HeatgridDiscreteConfig20270101OneOf4457881312
   *
   * @return The actual instance (HeatgridDiscreteConfig20270101OneOf,
   *     HeatgridDiscreteConfig20270101OneOf4457881312)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridDiscreteConfig20270101OneOf`. If the actual instance is not
   * `HeatgridDiscreteConfig20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridDiscreteConfig20270101OneOf`
   * @throws ClassCastException if the instance is not `HeatgridDiscreteConfig20270101OneOf`
   */
  public HeatgridDiscreteConfig20270101OneOf getHeatgridDiscreteConfig20270101OneOf()
      throws ClassCastException {
    return (HeatgridDiscreteConfig20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridDiscreteConfig20270101OneOf4457881312`. If the actual
   * instance is not `HeatgridDiscreteConfig20270101OneOf4457881312`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `HeatgridDiscreteConfig20270101OneOf4457881312`
   * @throws ClassCastException if the instance is not
   *     `HeatgridDiscreteConfig20270101OneOf4457881312`
   */
  public HeatgridDiscreteConfig20270101OneOf4457881312
      getHeatgridDiscreteConfig20270101OneOf4457881312() throws ClassCastException {
    return (HeatgridDiscreteConfig20270101OneOf4457881312) super.getActualInstance();
  }
}
