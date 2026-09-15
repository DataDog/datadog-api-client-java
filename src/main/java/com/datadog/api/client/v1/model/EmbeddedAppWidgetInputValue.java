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
@JsonDeserialize(using = EmbeddedAppWidgetInputValue.EmbeddedAppWidgetInputValueDeserializer.class)
@JsonSerialize(using = EmbeddedAppWidgetInputValue.EmbeddedAppWidgetInputValueSerializer.class)
public class EmbeddedAppWidgetInputValue extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(EmbeddedAppWidgetInputValue.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class EmbeddedAppWidgetInputValueSerializer
      extends StdSerializer<EmbeddedAppWidgetInputValue> {
    public EmbeddedAppWidgetInputValueSerializer(Class<EmbeddedAppWidgetInputValue> t) {
      super(t);
    }

    public EmbeddedAppWidgetInputValueSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EmbeddedAppWidgetInputValue value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class EmbeddedAppWidgetInputValueDeserializer
      extends StdDeserializer<EmbeddedAppWidgetInputValue> {
    public EmbeddedAppWidgetInputValueDeserializer() {
      this(EmbeddedAppWidgetInputValue.class);
    }

    public EmbeddedAppWidgetInputValueDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public EmbeddedAppWidgetInputValue deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize String
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (String.class.equals(Integer.class)
            || String.class.equals(Long.class)
            || String.class.equals(Float.class)
            || String.class.equals(Double.class)
            || String.class.equals(Boolean.class)
            || String.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((String.class.equals(Integer.class) || String.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((String.class.equals(Float.class) || String.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (String.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (String.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(String.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'String'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'String'", e);
      }

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

      // deserialize Boolean
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Boolean.class.equals(Integer.class)
            || Boolean.class.equals(Long.class)
            || Boolean.class.equals(Float.class)
            || Boolean.class.equals(Double.class)
            || Boolean.class.equals(Boolean.class)
            || Boolean.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Boolean.class.equals(Integer.class) || Boolean.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Boolean.class.equals(Float.class) || Boolean.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Boolean.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (Boolean.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Boolean.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'Boolean'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Boolean'", e);
      }

      // deserialize Map<String, Object>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Map.class.equals(Integer.class)
            || Map.class.equals(Long.class)
            || Map.class.equals(Float.class)
            || Map.class.equals(Double.class)
            || Map.class.equals(Boolean.class)
            || Map.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Map.class.equals(Integer.class) || Map.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Map.class.equals(Float.class) || Map.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Map.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (Map.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'Map<String, Object>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Map<String, Object>'", e);
      }

      // deserialize EmbeddedAppWidgetInputValueStringArray
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EmbeddedAppWidgetInputValueStringArray.class.equals(Integer.class)
            || EmbeddedAppWidgetInputValueStringArray.class.equals(Long.class)
            || EmbeddedAppWidgetInputValueStringArray.class.equals(Float.class)
            || EmbeddedAppWidgetInputValueStringArray.class.equals(Double.class)
            || EmbeddedAppWidgetInputValueStringArray.class.equals(Boolean.class)
            || EmbeddedAppWidgetInputValueStringArray.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueStringArray.class.equals(Integer.class)
                        || EmbeddedAppWidgetInputValueStringArray.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueStringArray.class.equals(Float.class)
                        || EmbeddedAppWidgetInputValueStringArray.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueStringArray.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueStringArray.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(EmbeddedAppWidgetInputValueStringArray.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EmbeddedAppWidgetInputValueStringArray) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'EmbeddedAppWidgetInputValueStringArray'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'EmbeddedAppWidgetInputValueStringArray'",
            e);
      }

      // deserialize EmbeddedAppWidgetInputValueNumberArray
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EmbeddedAppWidgetInputValueNumberArray.class.equals(Integer.class)
            || EmbeddedAppWidgetInputValueNumberArray.class.equals(Long.class)
            || EmbeddedAppWidgetInputValueNumberArray.class.equals(Float.class)
            || EmbeddedAppWidgetInputValueNumberArray.class.equals(Double.class)
            || EmbeddedAppWidgetInputValueNumberArray.class.equals(Boolean.class)
            || EmbeddedAppWidgetInputValueNumberArray.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueNumberArray.class.equals(Integer.class)
                        || EmbeddedAppWidgetInputValueNumberArray.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueNumberArray.class.equals(Float.class)
                        || EmbeddedAppWidgetInputValueNumberArray.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueNumberArray.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueNumberArray.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(EmbeddedAppWidgetInputValueNumberArray.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EmbeddedAppWidgetInputValueNumberArray) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'EmbeddedAppWidgetInputValueNumberArray'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'EmbeddedAppWidgetInputValueNumberArray'",
            e);
      }

      // deserialize EmbeddedAppWidgetInputValueBooleanArray
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EmbeddedAppWidgetInputValueBooleanArray.class.equals(Integer.class)
            || EmbeddedAppWidgetInputValueBooleanArray.class.equals(Long.class)
            || EmbeddedAppWidgetInputValueBooleanArray.class.equals(Float.class)
            || EmbeddedAppWidgetInputValueBooleanArray.class.equals(Double.class)
            || EmbeddedAppWidgetInputValueBooleanArray.class.equals(Boolean.class)
            || EmbeddedAppWidgetInputValueBooleanArray.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueBooleanArray.class.equals(Integer.class)
                        || EmbeddedAppWidgetInputValueBooleanArray.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueBooleanArray.class.equals(Float.class)
                        || EmbeddedAppWidgetInputValueBooleanArray.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueBooleanArray.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueBooleanArray.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(EmbeddedAppWidgetInputValueBooleanArray.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EmbeddedAppWidgetInputValueBooleanArray) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'EmbeddedAppWidgetInputValueBooleanArray'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'EmbeddedAppWidgetInputValueBooleanArray'",
            e);
      }

      // deserialize EmbeddedAppWidgetInputValueObjectArray
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EmbeddedAppWidgetInputValueObjectArray.class.equals(Integer.class)
            || EmbeddedAppWidgetInputValueObjectArray.class.equals(Long.class)
            || EmbeddedAppWidgetInputValueObjectArray.class.equals(Float.class)
            || EmbeddedAppWidgetInputValueObjectArray.class.equals(Double.class)
            || EmbeddedAppWidgetInputValueObjectArray.class.equals(Boolean.class)
            || EmbeddedAppWidgetInputValueObjectArray.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueObjectArray.class.equals(Integer.class)
                        || EmbeddedAppWidgetInputValueObjectArray.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EmbeddedAppWidgetInputValueObjectArray.class.equals(Float.class)
                        || EmbeddedAppWidgetInputValueObjectArray.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueObjectArray.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EmbeddedAppWidgetInputValueObjectArray.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(EmbeddedAppWidgetInputValueObjectArray.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EmbeddedAppWidgetInputValueObjectArray) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'EmbeddedAppWidgetInputValueObjectArray'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'EmbeddedAppWidgetInputValueObjectArray'",
            e);
      }

      EmbeddedAppWidgetInputValue ret = new EmbeddedAppWidgetInputValue();
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
    public EmbeddedAppWidgetInputValue getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "EmbeddedAppWidgetInputValue cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public EmbeddedAppWidgetInputValue() {
    super("oneOf", Boolean.FALSE);
  }

  public EmbeddedAppWidgetInputValue(String o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EmbeddedAppWidgetInputValue(Double o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EmbeddedAppWidgetInputValue(Boolean o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EmbeddedAppWidgetInputValue(Map<String, Object> o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EmbeddedAppWidgetInputValue(EmbeddedAppWidgetInputValueStringArray o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EmbeddedAppWidgetInputValue(EmbeddedAppWidgetInputValueNumberArray o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EmbeddedAppWidgetInputValue(EmbeddedAppWidgetInputValueBooleanArray o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EmbeddedAppWidgetInputValue(EmbeddedAppWidgetInputValueObjectArray o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("String", new GenericType<String>() {});
    schemas.put("Double", new GenericType<Double>() {});
    schemas.put("Boolean", new GenericType<Boolean>() {});
    schemas.put("Map<String, Object>", new GenericType<Map<String, Object>>() {});
    schemas.put(
        "EmbeddedAppWidgetInputValueStringArray",
        new GenericType<EmbeddedAppWidgetInputValueStringArray>() {});
    schemas.put(
        "EmbeddedAppWidgetInputValueNumberArray",
        new GenericType<EmbeddedAppWidgetInputValueNumberArray>() {});
    schemas.put(
        "EmbeddedAppWidgetInputValueBooleanArray",
        new GenericType<EmbeddedAppWidgetInputValueBooleanArray>() {});
    schemas.put(
        "EmbeddedAppWidgetInputValueObjectArray",
        new GenericType<EmbeddedAppWidgetInputValueObjectArray>() {});
    JSON.registerDescendants(
        EmbeddedAppWidgetInputValue.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return EmbeddedAppWidgetInputValue.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: String, Double, Boolean, Map&lt;String, Object&gt;,
   * EmbeddedAppWidgetInputValueStringArray, EmbeddedAppWidgetInputValueNumberArray,
   * EmbeddedAppWidgetInputValueBooleanArray, EmbeddedAppWidgetInputValueObjectArray
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Double.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Boolean.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Map.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EmbeddedAppWidgetInputValueStringArray.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EmbeddedAppWidgetInputValueNumberArray.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EmbeddedAppWidgetInputValueBooleanArray.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EmbeddedAppWidgetInputValueObjectArray.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be String, Double, Boolean, Map<String, Object>,"
            + " EmbeddedAppWidgetInputValueStringArray, EmbeddedAppWidgetInputValueNumberArray,"
            + " EmbeddedAppWidgetInputValueBooleanArray, EmbeddedAppWidgetInputValueObjectArray");
  }

  /**
   * Get the actual instance, which can be the following: String, Double, Boolean, Map&lt;String,
   * Object&gt;, EmbeddedAppWidgetInputValueStringArray, EmbeddedAppWidgetInputValueNumberArray,
   * EmbeddedAppWidgetInputValueBooleanArray, EmbeddedAppWidgetInputValueObjectArray
   *
   * @return The actual instance (String, Double, Boolean, Map&lt;String, Object&gt;,
   *     EmbeddedAppWidgetInputValueStringArray, EmbeddedAppWidgetInputValueNumberArray,
   *     EmbeddedAppWidgetInputValueBooleanArray, EmbeddedAppWidgetInputValueObjectArray)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `String`. If the actual instance is not `String`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `String`
   * @throws ClassCastException if the instance is not `String`
   */
  public String getString() throws ClassCastException {
    return (String) super.getActualInstance();
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
   * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Boolean`
   * @throws ClassCastException if the instance is not `Boolean`
   */
  public Boolean getBoolean() throws ClassCastException {
    return (Boolean) super.getActualInstance();
  }

  /**
   * Get the actual instance of `Map&lt;String, Object&gt;`. If the actual instance is not
   * `Map&lt;String, Object&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `Map&lt;String, Object&gt;`
   * @throws ClassCastException if the instance is not `Map&lt;String, Object&gt;`
   */
  public Map<String, Object> getMap() throws ClassCastException {
    return (Map<String, Object>) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EmbeddedAppWidgetInputValueStringArray`. If the actual instance is
   * not `EmbeddedAppWidgetInputValueStringArray`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EmbeddedAppWidgetInputValueStringArray`
   * @throws ClassCastException if the instance is not `EmbeddedAppWidgetInputValueStringArray`
   */
  public EmbeddedAppWidgetInputValueStringArray getEmbeddedAppWidgetInputValueStringArray()
      throws ClassCastException {
    return (EmbeddedAppWidgetInputValueStringArray) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EmbeddedAppWidgetInputValueNumberArray`. If the actual instance is
   * not `EmbeddedAppWidgetInputValueNumberArray`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EmbeddedAppWidgetInputValueNumberArray`
   * @throws ClassCastException if the instance is not `EmbeddedAppWidgetInputValueNumberArray`
   */
  public EmbeddedAppWidgetInputValueNumberArray getEmbeddedAppWidgetInputValueNumberArray()
      throws ClassCastException {
    return (EmbeddedAppWidgetInputValueNumberArray) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EmbeddedAppWidgetInputValueBooleanArray`. If the actual instance is
   * not `EmbeddedAppWidgetInputValueBooleanArray`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EmbeddedAppWidgetInputValueBooleanArray`
   * @throws ClassCastException if the instance is not `EmbeddedAppWidgetInputValueBooleanArray`
   */
  public EmbeddedAppWidgetInputValueBooleanArray getEmbeddedAppWidgetInputValueBooleanArray()
      throws ClassCastException {
    return (EmbeddedAppWidgetInputValueBooleanArray) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EmbeddedAppWidgetInputValueObjectArray`. If the actual instance is
   * not `EmbeddedAppWidgetInputValueObjectArray`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EmbeddedAppWidgetInputValueObjectArray`
   * @throws ClassCastException if the instance is not `EmbeddedAppWidgetInputValueObjectArray`
   */
  public EmbeddedAppWidgetInputValueObjectArray getEmbeddedAppWidgetInputValueObjectArray()
      throws ClassCastException {
    return (EmbeddedAppWidgetInputValueObjectArray) super.getActualInstance();
  }
}
