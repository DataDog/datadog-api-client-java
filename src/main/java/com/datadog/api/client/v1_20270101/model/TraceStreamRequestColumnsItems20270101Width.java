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
@JsonDeserialize(
    using =
        TraceStreamRequestColumnsItems20270101Width
            .TraceStreamRequestColumnsItems20270101WidthDeserializer.class)
@JsonSerialize(
    using =
        TraceStreamRequestColumnsItems20270101Width
            .TraceStreamRequestColumnsItems20270101WidthSerializer.class)
public class TraceStreamRequestColumnsItems20270101Width extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(TraceStreamRequestColumnsItems20270101Width.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TraceStreamRequestColumnsItems20270101WidthSerializer
      extends StdSerializer<TraceStreamRequestColumnsItems20270101Width> {
    public TraceStreamRequestColumnsItems20270101WidthSerializer(
        Class<TraceStreamRequestColumnsItems20270101Width> t) {
      super(t);
    }

    public TraceStreamRequestColumnsItems20270101WidthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TraceStreamRequestColumnsItems20270101Width value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TraceStreamRequestColumnsItems20270101WidthDeserializer
      extends StdDeserializer<TraceStreamRequestColumnsItems20270101Width> {
    public TraceStreamRequestColumnsItems20270101WidthDeserializer() {
      this(TraceStreamRequestColumnsItems20270101Width.class);
    }

    public TraceStreamRequestColumnsItems20270101WidthDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TraceStreamRequestColumnsItems20270101Width deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize Double
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Double.class.equals(Integer.class)
            || Double.class.equals(Long.class)
            || Double.class.equals(Float.class)
            || Double.class.equals(Double.class)
            || Double.class.equals(Boolean.class)
            || Double.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Double.class.equals(Integer.class) || Double.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Double.class.equals(Float.class) || Double.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Double.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (Double.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Double.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'Double'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Double'", e);
      }

      // deserialize DashboardInlineSchema35
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardInlineSchema35.class.equals(Integer.class)
            || DashboardInlineSchema35.class.equals(Long.class)
            || DashboardInlineSchema35.class.equals(Float.class)
            || DashboardInlineSchema35.class.equals(Double.class)
            || DashboardInlineSchema35.class.equals(Boolean.class)
            || DashboardInlineSchema35.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardInlineSchema35.class.equals(Integer.class)
                        || DashboardInlineSchema35.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardInlineSchema35.class.equals(Float.class)
                        || DashboardInlineSchema35.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardInlineSchema35.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardInlineSchema35.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardInlineSchema35.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'DashboardInlineSchema35'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardInlineSchema35'", e);
      }

      TraceStreamRequestColumnsItems20270101Width ret =
          new TraceStreamRequestColumnsItems20270101Width();
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
    public TraceStreamRequestColumnsItems20270101Width getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TraceStreamRequestColumnsItems20270101Width cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TraceStreamRequestColumnsItems20270101Width() {
    super("oneOf", Boolean.FALSE);
  }

  public TraceStreamRequestColumnsItems20270101Width(Double o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TraceStreamRequestColumnsItems20270101Width(DashboardInlineSchema35 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("Double", new GenericType<Double>() {});
    schemas.put("DashboardInlineSchema35", new GenericType<DashboardInlineSchema35>() {});
    JSON.registerDescendants(
        TraceStreamRequestColumnsItems20270101Width.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TraceStreamRequestColumnsItems20270101Width.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: Double, DashboardInlineSchema35
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(Double.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DashboardInlineSchema35.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be Double, DashboardInlineSchema35");
  }

  /**
   * Get the actual instance, which can be the following: Double, DashboardInlineSchema35
   *
   * @return The actual instance (Double, DashboardInlineSchema35)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `Double`. If the actual instance is not `Double`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Double`
   * @throws ClassCastException if the instance is not `Double`
   */
  public Double getDouble() throws ClassCastException {
    return (Double) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardInlineSchema35`. If the actual instance is not
   * `DashboardInlineSchema35`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardInlineSchema35`
   * @throws ClassCastException if the instance is not `DashboardInlineSchema35`
   */
  public DashboardInlineSchema35 getDashboardInlineSchema35() throws ClassCastException {
    return (DashboardInlineSchema35) super.getActualInstance();
  }
}
