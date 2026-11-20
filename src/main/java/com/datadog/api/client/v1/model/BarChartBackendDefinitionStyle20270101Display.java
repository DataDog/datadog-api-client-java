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
@JsonDeserialize(
    using =
        BarChartBackendDefinitionStyle20270101Display
            .BarChartBackendDefinitionStyle20270101DisplayDeserializer.class)
@JsonSerialize(
    using =
        BarChartBackendDefinitionStyle20270101Display
            .BarChartBackendDefinitionStyle20270101DisplaySerializer.class)
public class BarChartBackendDefinitionStyle20270101Display extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(BarChartBackendDefinitionStyle20270101Display.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class BarChartBackendDefinitionStyle20270101DisplaySerializer
      extends StdSerializer<BarChartBackendDefinitionStyle20270101Display> {
    public BarChartBackendDefinitionStyle20270101DisplaySerializer(
        Class<BarChartBackendDefinitionStyle20270101Display> t) {
      super(t);
    }

    public BarChartBackendDefinitionStyle20270101DisplaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartBackendDefinitionStyle20270101Display value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class BarChartBackendDefinitionStyle20270101DisplayDeserializer
      extends StdDeserializer<BarChartBackendDefinitionStyle20270101Display> {
    public BarChartBackendDefinitionStyle20270101DisplayDeserializer() {
      this(BarChartBackendDefinitionStyle20270101Display.class);
    }

    public BarChartBackendDefinitionStyle20270101DisplayDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public BarChartBackendDefinitionStyle20270101Display deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize BarChartBackendDefinitionStyle20270101DisplayOneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Integer.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Long.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Float.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Double.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Boolean.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Integer.class)
                        || BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Float.class)
                        || BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendDefinitionStyle20270101DisplayOneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(BarChartBackendDefinitionStyle20270101DisplayOneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendDefinitionStyle20270101DisplayOneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'BarChartBackendDefinitionStyle20270101DisplayOneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'BarChartBackendDefinitionStyle20270101DisplayOneOf'",
            e);
      }

      // deserialize BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(Integer.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(Long.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                Float.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                Double.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                Boolean.class)
            || BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                            Integer.class)
                        || BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                            Float.class)
                        || BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856'",
            e);
      }

      BarChartBackendDefinitionStyle20270101Display ret =
          new BarChartBackendDefinitionStyle20270101Display();
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
    public BarChartBackendDefinitionStyle20270101Display getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "BarChartBackendDefinitionStyle20270101Display cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public BarChartBackendDefinitionStyle20270101Display() {
    super("oneOf", Boolean.FALSE);
  }

  public BarChartBackendDefinitionStyle20270101Display(
      BarChartBackendDefinitionStyle20270101DisplayOneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public BarChartBackendDefinitionStyle20270101Display(
      BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "BarChartBackendDefinitionStyle20270101DisplayOneOf",
        new GenericType<BarChartBackendDefinitionStyle20270101DisplayOneOf>() {});
    schemas.put(
        "BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856",
        new GenericType<BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856>() {});
    JSON.registerDescendants(
        BarChartBackendDefinitionStyle20270101Display.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return BarChartBackendDefinitionStyle20270101Display.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: BarChartBackendDefinitionStyle20270101DisplayOneOf,
   * BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        BarChartBackendDefinitionStyle20270101DisplayOneOf.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856.class,
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
        "Invalid instance type. Must be BarChartBackendDefinitionStyle20270101DisplayOneOf,"
            + " BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856");
  }

  /**
   * Get the actual instance, which can be the following:
   * BarChartBackendDefinitionStyle20270101DisplayOneOf,
   * BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856
   *
   * @return The actual instance (BarChartBackendDefinitionStyle20270101DisplayOneOf,
   *     BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendDefinitionStyle20270101DisplayOneOf`. If the actual
   * instance is not `BarChartBackendDefinitionStyle20270101DisplayOneOf`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `BarChartBackendDefinitionStyle20270101DisplayOneOf`
   * @throws ClassCastException if the instance is not
   *     `BarChartBackendDefinitionStyle20270101DisplayOneOf`
   */
  public BarChartBackendDefinitionStyle20270101DisplayOneOf
      getBarChartBackendDefinitionStyle20270101DisplayOneOf() throws ClassCastException {
    return (BarChartBackendDefinitionStyle20270101DisplayOneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856`. If
   * the actual instance is not `BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856`
   * @throws ClassCastException if the instance is not
   *     `BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856`
   */
  public BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856
      getBarChartBackendDefinitionStyle20270101DisplayOneOf4453561856() throws ClassCastException {
    return (BarChartBackendDefinitionStyle20270101DisplayOneOf4453561856) super.getActualInstance();
  }
}
