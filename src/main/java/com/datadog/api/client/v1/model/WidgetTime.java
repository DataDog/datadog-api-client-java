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
@JsonDeserialize(using = WidgetTime.WidgetTimeDeserializer.class)
@JsonSerialize(using = WidgetTime.WidgetTimeSerializer.class)
public class WidgetTime extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(WidgetTime.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class WidgetTimeSerializer extends StdSerializer<WidgetTime> {
    public WidgetTimeSerializer(Class<WidgetTime> t) {
      super(t);
    }

    public WidgetTimeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetTime value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class WidgetTimeDeserializer extends StdDeserializer<WidgetTime> {
    public WidgetTimeDeserializer() {
      this(WidgetTime.class);
    }

    public WidgetTimeDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public WidgetTime deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize WidgetNewLiveSpan
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetNewLiveSpan.class.equals(Integer.class)
            || WidgetNewLiveSpan.class.equals(Long.class)
            || WidgetNewLiveSpan.class.equals(Float.class)
            || WidgetNewLiveSpan.class.equals(Double.class)
            || WidgetNewLiveSpan.class.equals(Boolean.class)
            || WidgetNewLiveSpan.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetNewLiveSpan.class.equals(Integer.class)
                        || WidgetNewLiveSpan.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetNewLiveSpan.class.equals(Float.class)
                        || WidgetNewLiveSpan.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetNewLiveSpan.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetNewLiveSpan.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetNewLiveSpan.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetNewLiveSpan) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetNewLiveSpan'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WidgetNewLiveSpan'", e);
      }

      // deserialize WidgetNewFixedSpan
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetNewFixedSpan.class.equals(Integer.class)
            || WidgetNewFixedSpan.class.equals(Long.class)
            || WidgetNewFixedSpan.class.equals(Float.class)
            || WidgetNewFixedSpan.class.equals(Double.class)
            || WidgetNewFixedSpan.class.equals(Boolean.class)
            || WidgetNewFixedSpan.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetNewFixedSpan.class.equals(Integer.class)
                        || WidgetNewFixedSpan.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetNewFixedSpan.class.equals(Float.class)
                        || WidgetNewFixedSpan.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetNewFixedSpan.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetNewFixedSpan.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetNewFixedSpan.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetNewFixedSpan) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetNewFixedSpan'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WidgetNewFixedSpan'", e);
      }

      // deserialize WidgetLegacyLiveSpan
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetLegacyLiveSpan.class.equals(Integer.class)
            || WidgetLegacyLiveSpan.class.equals(Long.class)
            || WidgetLegacyLiveSpan.class.equals(Float.class)
            || WidgetLegacyLiveSpan.class.equals(Double.class)
            || WidgetLegacyLiveSpan.class.equals(Boolean.class)
            || WidgetLegacyLiveSpan.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetLegacyLiveSpan.class.equals(Integer.class)
                        || WidgetLegacyLiveSpan.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetLegacyLiveSpan.class.equals(Float.class)
                        || WidgetLegacyLiveSpan.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetLegacyLiveSpan.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetLegacyLiveSpan.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetLegacyLiveSpan.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetLegacyLiveSpan) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetLegacyLiveSpan'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WidgetLegacyLiveSpan'", e);
      }

      WidgetTime ret = new WidgetTime();
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
    public WidgetTime getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "WidgetTime cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public WidgetTime() {
    super("oneOf", Boolean.FALSE);
  }

  public WidgetTime(WidgetNewLiveSpan o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetTime(WidgetNewFixedSpan o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetTime(WidgetLegacyLiveSpan o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("WidgetNewLiveSpan", new GenericType<WidgetNewLiveSpan>() {});
    schemas.put("WidgetNewFixedSpan", new GenericType<WidgetNewFixedSpan>() {});
    schemas.put("WidgetLegacyLiveSpan", new GenericType<WidgetLegacyLiveSpan>() {});
    JSON.registerDescendants(WidgetTime.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return WidgetTime.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: WidgetNewLiveSpan, WidgetNewFixedSpan, WidgetLegacyLiveSpan
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(WidgetNewLiveSpan.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(WidgetNewFixedSpan.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(WidgetLegacyLiveSpan.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be WidgetNewLiveSpan, WidgetNewFixedSpan,"
            + " WidgetLegacyLiveSpan");
  }

  /**
   * Get the actual instance, which can be the following: WidgetNewLiveSpan, WidgetNewFixedSpan,
   * WidgetLegacyLiveSpan
   *
   * @return The actual instance (WidgetNewLiveSpan, WidgetNewFixedSpan, WidgetLegacyLiveSpan)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetNewLiveSpan`. If the actual instance is not
   * `WidgetNewLiveSpan`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetNewLiveSpan`
   * @throws ClassCastException if the instance is not `WidgetNewLiveSpan`
   */
  public WidgetNewLiveSpan getWidgetNewLiveSpan() throws ClassCastException {
    return (WidgetNewLiveSpan) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetNewFixedSpan`. If the actual instance is not
   * `WidgetNewFixedSpan`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetNewFixedSpan`
   * @throws ClassCastException if the instance is not `WidgetNewFixedSpan`
   */
  public WidgetNewFixedSpan getWidgetNewFixedSpan() throws ClassCastException {
    return (WidgetNewFixedSpan) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetLegacyLiveSpan`. If the actual instance is not
   * `WidgetLegacyLiveSpan`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetLegacyLiveSpan`
   * @throws ClassCastException if the instance is not `WidgetLegacyLiveSpan`
   */
  public WidgetLegacyLiveSpan getWidgetLegacyLiveSpan() throws ClassCastException {
    return (WidgetLegacyLiveSpan) super.getActualInstance();
  }
}
