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
@JsonDeserialize(using = SloMeasure.SloMeasureDeserializer.class)
@JsonSerialize(using = SloMeasure.SloMeasureSerializer.class)
public class SloMeasure extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SloMeasure.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SloMeasureSerializer extends StdSerializer<SloMeasure> {
    public SloMeasureSerializer(Class<SloMeasure> t) {
      super(t);
    }

    public SloMeasureSerializer() {
      this(null);
    }

    @Override
    public void serialize(SloMeasure value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SloMeasureDeserializer extends StdDeserializer<SloMeasure> {
    public SloMeasureDeserializer() {
      this(SloMeasure.class);
    }

    public SloMeasureDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SloMeasure deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DashboardInlineSchema46
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardInlineSchema46.class.equals(Integer.class)
            || DashboardInlineSchema46.class.equals(Long.class)
            || DashboardInlineSchema46.class.equals(Float.class)
            || DashboardInlineSchema46.class.equals(Double.class)
            || DashboardInlineSchema46.class.equals(Boolean.class)
            || DashboardInlineSchema46.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardInlineSchema46.class.equals(Integer.class)
                        || DashboardInlineSchema46.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardInlineSchema46.class.equals(Float.class)
                        || DashboardInlineSchema46.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardInlineSchema46.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardInlineSchema46.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardInlineSchema46.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'DashboardInlineSchema46'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardInlineSchema46'", e);
      }

      // deserialize SloMeasureEvents
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SloMeasureEvents.class.equals(Integer.class)
            || SloMeasureEvents.class.equals(Long.class)
            || SloMeasureEvents.class.equals(Float.class)
            || SloMeasureEvents.class.equals(Double.class)
            || SloMeasureEvents.class.equals(Boolean.class)
            || SloMeasureEvents.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SloMeasureEvents.class.equals(Integer.class)
                        || SloMeasureEvents.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SloMeasureEvents.class.equals(Float.class)
                        || SloMeasureEvents.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SloMeasureEvents.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SloMeasureEvents.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SloMeasureEvents.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'SloMeasureEvents'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SloMeasureEvents'", e);
      }

      // deserialize SloMeasureMinutes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SloMeasureMinutes.class.equals(Integer.class)
            || SloMeasureMinutes.class.equals(Long.class)
            || SloMeasureMinutes.class.equals(Float.class)
            || SloMeasureMinutes.class.equals(Double.class)
            || SloMeasureMinutes.class.equals(Boolean.class)
            || SloMeasureMinutes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SloMeasureMinutes.class.equals(Integer.class)
                        || SloMeasureMinutes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SloMeasureMinutes.class.equals(Float.class)
                        || SloMeasureMinutes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SloMeasureMinutes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SloMeasureMinutes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SloMeasureMinutes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'SloMeasureMinutes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SloMeasureMinutes'", e);
      }

      SloMeasure ret = new SloMeasure();
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
    public SloMeasure getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SloMeasure cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SloMeasure() {
    super("oneOf", Boolean.FALSE);
  }

  public SloMeasure(DashboardInlineSchema46 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SloMeasure(SloMeasureEvents o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SloMeasure(SloMeasureMinutes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("DashboardInlineSchema46", new GenericType<DashboardInlineSchema46>() {});
    schemas.put("SloMeasureEvents", new GenericType<SloMeasureEvents>() {});
    schemas.put("SloMeasureMinutes", new GenericType<SloMeasureMinutes>() {});
    JSON.registerDescendants(SloMeasure.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SloMeasure.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DashboardInlineSchema46, SloMeasureEvents, SloMeasureMinutes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(DashboardInlineSchema46.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SloMeasureEvents.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SloMeasureMinutes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DashboardInlineSchema46, SloMeasureEvents,"
            + " SloMeasureMinutes");
  }

  /**
   * Get the actual instance, which can be the following: DashboardInlineSchema46, SloMeasureEvents,
   * SloMeasureMinutes
   *
   * @return The actual instance (DashboardInlineSchema46, SloMeasureEvents, SloMeasureMinutes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardInlineSchema46`. If the actual instance is not
   * `DashboardInlineSchema46`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardInlineSchema46`
   * @throws ClassCastException if the instance is not `DashboardInlineSchema46`
   */
  public DashboardInlineSchema46 getDashboardInlineSchema46() throws ClassCastException {
    return (DashboardInlineSchema46) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SloMeasureEvents`. If the actual instance is not
   * `SloMeasureEvents`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SloMeasureEvents`
   * @throws ClassCastException if the instance is not `SloMeasureEvents`
   */
  public SloMeasureEvents getSloMeasureEvents() throws ClassCastException {
    return (SloMeasureEvents) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SloMeasureMinutes`. If the actual instance is not
   * `SloMeasureMinutes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SloMeasureMinutes`
   * @throws ClassCastException if the instance is not `SloMeasureMinutes`
   */
  public SloMeasureMinutes getSloMeasureMinutes() throws ClassCastException {
    return (SloMeasureMinutes) super.getActualInstance();
  }
}
