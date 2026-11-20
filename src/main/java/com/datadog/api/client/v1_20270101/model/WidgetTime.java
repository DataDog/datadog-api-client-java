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
      // deserialize WidgetTime20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetTime20270101OneOf.class.equals(Integer.class)
            || WidgetTime20270101OneOf.class.equals(Long.class)
            || WidgetTime20270101OneOf.class.equals(Float.class)
            || WidgetTime20270101OneOf.class.equals(Double.class)
            || WidgetTime20270101OneOf.class.equals(Boolean.class)
            || WidgetTime20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetTime20270101OneOf.class.equals(Integer.class)
                        || WidgetTime20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetTime20270101OneOf.class.equals(Float.class)
                        || WidgetTime20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetTime20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetTime20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetTime20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetTime20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetTime20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WidgetTime20270101OneOf'", e);
      }

      // deserialize WidgetTime20270101OneOf4464103552
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetTime20270101OneOf4464103552.class.equals(Integer.class)
            || WidgetTime20270101OneOf4464103552.class.equals(Long.class)
            || WidgetTime20270101OneOf4464103552.class.equals(Float.class)
            || WidgetTime20270101OneOf4464103552.class.equals(Double.class)
            || WidgetTime20270101OneOf4464103552.class.equals(Boolean.class)
            || WidgetTime20270101OneOf4464103552.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetTime20270101OneOf4464103552.class.equals(Integer.class)
                        || WidgetTime20270101OneOf4464103552.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetTime20270101OneOf4464103552.class.equals(Float.class)
                        || WidgetTime20270101OneOf4464103552.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetTime20270101OneOf4464103552.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetTime20270101OneOf4464103552.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetTime20270101OneOf4464103552.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetTime20270101OneOf4464103552) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetTime20270101OneOf4464103552'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'WidgetTime20270101OneOf4464103552'", e);
      }

      // deserialize WidgetTime20270101OneOf4464104512
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetTime20270101OneOf4464104512.class.equals(Integer.class)
            || WidgetTime20270101OneOf4464104512.class.equals(Long.class)
            || WidgetTime20270101OneOf4464104512.class.equals(Float.class)
            || WidgetTime20270101OneOf4464104512.class.equals(Double.class)
            || WidgetTime20270101OneOf4464104512.class.equals(Boolean.class)
            || WidgetTime20270101OneOf4464104512.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetTime20270101OneOf4464104512.class.equals(Integer.class)
                        || WidgetTime20270101OneOf4464104512.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetTime20270101OneOf4464104512.class.equals(Float.class)
                        || WidgetTime20270101OneOf4464104512.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetTime20270101OneOf4464104512.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetTime20270101OneOf4464104512.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetTime20270101OneOf4464104512.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetTime20270101OneOf4464104512) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetTime20270101OneOf4464104512'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'WidgetTime20270101OneOf4464104512'", e);
      }

      // deserialize WidgetTime20270101OneOf4464105312
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetTime20270101OneOf4464105312.class.equals(Integer.class)
            || WidgetTime20270101OneOf4464105312.class.equals(Long.class)
            || WidgetTime20270101OneOf4464105312.class.equals(Float.class)
            || WidgetTime20270101OneOf4464105312.class.equals(Double.class)
            || WidgetTime20270101OneOf4464105312.class.equals(Boolean.class)
            || WidgetTime20270101OneOf4464105312.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetTime20270101OneOf4464105312.class.equals(Integer.class)
                        || WidgetTime20270101OneOf4464105312.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetTime20270101OneOf4464105312.class.equals(Float.class)
                        || WidgetTime20270101OneOf4464105312.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetTime20270101OneOf4464105312.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetTime20270101OneOf4464105312.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetTime20270101OneOf4464105312.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetTime20270101OneOf4464105312) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetTime20270101OneOf4464105312'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'WidgetTime20270101OneOf4464105312'", e);
      }

      // deserialize com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                Integer.class)
            || com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                Long.class)
            || com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                Float.class)
            || com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                Double.class)
            || com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                Boolean.class)
            || com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                            Integer.class)
                        || com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                            Float.class)
                        || com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952'",
            e);
      }

      // deserialize com.datadog.api.client.v1.model.EmptyObject_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Integer.class)
            || com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Long.class)
            || com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Float.class)
            || com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Double.class)
            || com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Boolean.class)
            || com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Integer.class)
                        || com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Float.class)
                        || com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (com.datadog.api.client.v1.model.EmptyObject_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(com.datadog.api.client.v1.model.EmptyObject_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((com.datadog.api.client.v1.model.EmptyObject_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'com.datadog.api.client.v1.model.EmptyObject_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'com.datadog.api.client.v1.model.EmptyObject_20270101'",
            e);
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

  public WidgetTime(WidgetTime20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetTime(WidgetTime20270101OneOf4464103552 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetTime(WidgetTime20270101OneOf4464104512 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetTime(WidgetTime20270101OneOf4464105312 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetTime(com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetTime(com.datadog.api.client.v1.model.EmptyObject_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("WidgetTime20270101OneOf", new GenericType<WidgetTime20270101OneOf>() {});
    schemas.put(
        "WidgetTime20270101OneOf4464103552",
        new GenericType<WidgetTime20270101OneOf4464103552>() {});
    schemas.put(
        "WidgetTime20270101OneOf4464104512",
        new GenericType<WidgetTime20270101OneOf4464104512>() {});
    schemas.put(
        "WidgetTime20270101OneOf4464105312",
        new GenericType<WidgetTime20270101OneOf4464105312>() {});
    schemas.put(
        "com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952",
        new GenericType<com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952>() {});
    schemas.put(
        "com.datadog.api.client.v1.model.EmptyObject_20270101",
        new GenericType<com.datadog.api.client.v1.model.EmptyObject_20270101>() {});
    JSON.registerDescendants(WidgetTime.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return WidgetTime.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: WidgetTime20270101OneOf, WidgetTime20270101OneOf4464103552,
   * WidgetTime20270101OneOf4464104512, WidgetTime20270101OneOf4464105312,
   * com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952,
   * com.datadog.api.client.v1.model.EmptyObject_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(WidgetTime20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        WidgetTime20270101OneOf4464103552.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        WidgetTime20270101OneOf4464104512.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        WidgetTime20270101OneOf4464105312.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        com.datadog.api.client.v1.model.EmptyObject_20270101.class,
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
        "Invalid instance type. Must be WidgetTime20270101OneOf, WidgetTime20270101OneOf4464103552,"
            + " WidgetTime20270101OneOf4464104512, WidgetTime20270101OneOf4464105312,"
            + " com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952,"
            + " com.datadog.api.client.v1.model.EmptyObject_20270101");
  }

  /**
   * Get the actual instance, which can be the following: WidgetTime20270101OneOf,
   * WidgetTime20270101OneOf4464103552, WidgetTime20270101OneOf4464104512,
   * WidgetTime20270101OneOf4464105312,
   * com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952,
   * com.datadog.api.client.v1.model.EmptyObject_20270101
   *
   * @return The actual instance (WidgetTime20270101OneOf, WidgetTime20270101OneOf4464103552,
   *     WidgetTime20270101OneOf4464104512, WidgetTime20270101OneOf4464105312,
   *     com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952,
   *     com.datadog.api.client.v1.model.EmptyObject_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetTime20270101OneOf`. If the actual instance is not
   * `WidgetTime20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetTime20270101OneOf`
   * @throws ClassCastException if the instance is not `WidgetTime20270101OneOf`
   */
  public WidgetTime20270101OneOf getWidgetTime20270101OneOf() throws ClassCastException {
    return (WidgetTime20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetTime20270101OneOf4464103552`. If the actual instance is not
   * `WidgetTime20270101OneOf4464103552`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetTime20270101OneOf4464103552`
   * @throws ClassCastException if the instance is not `WidgetTime20270101OneOf4464103552`
   */
  public WidgetTime20270101OneOf4464103552 getWidgetTime20270101OneOf4464103552()
      throws ClassCastException {
    return (WidgetTime20270101OneOf4464103552) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetTime20270101OneOf4464104512`. If the actual instance is not
   * `WidgetTime20270101OneOf4464104512`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetTime20270101OneOf4464104512`
   * @throws ClassCastException if the instance is not `WidgetTime20270101OneOf4464104512`
   */
  public WidgetTime20270101OneOf4464104512 getWidgetTime20270101OneOf4464104512()
      throws ClassCastException {
    return (WidgetTime20270101OneOf4464104512) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetTime20270101OneOf4464105312`. If the actual instance is not
   * `WidgetTime20270101OneOf4464105312`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetTime20270101OneOf4464105312`
   * @throws ClassCastException if the instance is not `WidgetTime20270101OneOf4464105312`
   */
  public WidgetTime20270101OneOf4464105312 getWidgetTime20270101OneOf4464105312()
      throws ClassCastException {
    return (WidgetTime20270101OneOf4464105312) super.getActualInstance();
  }

  /**
   * Get the actual instance of `com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952`.
   * If the actual instance is not
   * `com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of
   *     `com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952`
   * @throws ClassCastException if the instance is not
   *     `com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952`
   */
  public com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952
      getWidgetTime20270101OneOf4464105952() throws ClassCastException {
    return (com.datadog.api.client.v1.model.WidgetTime20270101OneOf4464105952)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `com.datadog.api.client.v1.model.EmptyObject_20270101`. If the
   * actual instance is not `com.datadog.api.client.v1.model.EmptyObject_20270101`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `com.datadog.api.client.v1.model.EmptyObject_20270101`
   * @throws ClassCastException if the instance is not
   *     `com.datadog.api.client.v1.model.EmptyObject_20270101`
   */
  public com.datadog.api.client.v1.model.EmptyObject_20270101 getEmptyObject_20270101()
      throws ClassCastException {
    return (com.datadog.api.client.v1.model.EmptyObject_20270101) super.getActualInstance();
  }
}
