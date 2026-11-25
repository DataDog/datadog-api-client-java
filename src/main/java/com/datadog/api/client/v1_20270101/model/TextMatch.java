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
@JsonDeserialize(using = TextMatch.TextMatchDeserializer.class)
@JsonSerialize(using = TextMatch.TextMatchSerializer.class)
public class TextMatch extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TextMatch.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TextMatchSerializer extends StdSerializer<TextMatch> {
    public TextMatchSerializer(Class<TextMatch> t) {
      super(t);
    }

    public TextMatchSerializer() {
      this(null);
    }

    @Override
    public void serialize(TextMatch value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TextMatchDeserializer extends StdDeserializer<TextMatch> {
    public TextMatchDeserializer() {
      this(TextMatch.class);
    }

    public TextMatchDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TextMatch deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TextMatch20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextMatch20270101OneOf.class.equals(Integer.class)
            || TextMatch20270101OneOf.class.equals(Long.class)
            || TextMatch20270101OneOf.class.equals(Float.class)
            || TextMatch20270101OneOf.class.equals(Double.class)
            || TextMatch20270101OneOf.class.equals(Boolean.class)
            || TextMatch20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextMatch20270101OneOf.class.equals(Integer.class)
                        || TextMatch20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextMatch20270101OneOf.class.equals(Float.class)
                        || TextMatch20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextMatch20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextMatch20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TextMatch20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextMatch20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TextMatch20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TextMatch20270101OneOf'", e);
      }

      // deserialize TextMatch20270101OneOf4462865408
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextMatch20270101OneOf4462865408.class.equals(Integer.class)
            || TextMatch20270101OneOf4462865408.class.equals(Long.class)
            || TextMatch20270101OneOf4462865408.class.equals(Float.class)
            || TextMatch20270101OneOf4462865408.class.equals(Double.class)
            || TextMatch20270101OneOf4462865408.class.equals(Boolean.class)
            || TextMatch20270101OneOf4462865408.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextMatch20270101OneOf4462865408.class.equals(Integer.class)
                        || TextMatch20270101OneOf4462865408.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextMatch20270101OneOf4462865408.class.equals(Float.class)
                        || TextMatch20270101OneOf4462865408.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextMatch20270101OneOf4462865408.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextMatch20270101OneOf4462865408.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TextMatch20270101OneOf4462865408.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextMatch20270101OneOf4462865408) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TextMatch20270101OneOf4462865408'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TextMatch20270101OneOf4462865408'", e);
      }

      // deserialize TextMatch20270101OneOf4462866048
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextMatch20270101OneOf4462866048.class.equals(Integer.class)
            || TextMatch20270101OneOf4462866048.class.equals(Long.class)
            || TextMatch20270101OneOf4462866048.class.equals(Float.class)
            || TextMatch20270101OneOf4462866048.class.equals(Double.class)
            || TextMatch20270101OneOf4462866048.class.equals(Boolean.class)
            || TextMatch20270101OneOf4462866048.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextMatch20270101OneOf4462866048.class.equals(Integer.class)
                        || TextMatch20270101OneOf4462866048.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextMatch20270101OneOf4462866048.class.equals(Float.class)
                        || TextMatch20270101OneOf4462866048.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextMatch20270101OneOf4462866048.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextMatch20270101OneOf4462866048.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TextMatch20270101OneOf4462866048.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextMatch20270101OneOf4462866048) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TextMatch20270101OneOf4462866048'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TextMatch20270101OneOf4462866048'", e);
      }

      // deserialize TextMatch20270101OneOf4462866688
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextMatch20270101OneOf4462866688.class.equals(Integer.class)
            || TextMatch20270101OneOf4462866688.class.equals(Long.class)
            || TextMatch20270101OneOf4462866688.class.equals(Float.class)
            || TextMatch20270101OneOf4462866688.class.equals(Double.class)
            || TextMatch20270101OneOf4462866688.class.equals(Boolean.class)
            || TextMatch20270101OneOf4462866688.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextMatch20270101OneOf4462866688.class.equals(Integer.class)
                        || TextMatch20270101OneOf4462866688.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextMatch20270101OneOf4462866688.class.equals(Float.class)
                        || TextMatch20270101OneOf4462866688.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextMatch20270101OneOf4462866688.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextMatch20270101OneOf4462866688.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TextMatch20270101OneOf4462866688.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextMatch20270101OneOf4462866688) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TextMatch20270101OneOf4462866688'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TextMatch20270101OneOf4462866688'", e);
      }

      // deserialize TextMatch20270101OneOf4462867328
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextMatch20270101OneOf4462867328.class.equals(Integer.class)
            || TextMatch20270101OneOf4462867328.class.equals(Long.class)
            || TextMatch20270101OneOf4462867328.class.equals(Float.class)
            || TextMatch20270101OneOf4462867328.class.equals(Double.class)
            || TextMatch20270101OneOf4462867328.class.equals(Boolean.class)
            || TextMatch20270101OneOf4462867328.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextMatch20270101OneOf4462867328.class.equals(Integer.class)
                        || TextMatch20270101OneOf4462867328.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextMatch20270101OneOf4462867328.class.equals(Float.class)
                        || TextMatch20270101OneOf4462867328.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextMatch20270101OneOf4462867328.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextMatch20270101OneOf4462867328.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TextMatch20270101OneOf4462867328.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextMatch20270101OneOf4462867328) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TextMatch20270101OneOf4462867328'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TextMatch20270101OneOf4462867328'", e);
      }

      // deserialize TextMatch20270101OneOf4462867968
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextMatch20270101OneOf4462867968.class.equals(Integer.class)
            || TextMatch20270101OneOf4462867968.class.equals(Long.class)
            || TextMatch20270101OneOf4462867968.class.equals(Float.class)
            || TextMatch20270101OneOf4462867968.class.equals(Double.class)
            || TextMatch20270101OneOf4462867968.class.equals(Boolean.class)
            || TextMatch20270101OneOf4462867968.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextMatch20270101OneOf4462867968.class.equals(Integer.class)
                        || TextMatch20270101OneOf4462867968.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextMatch20270101OneOf4462867968.class.equals(Float.class)
                        || TextMatch20270101OneOf4462867968.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextMatch20270101OneOf4462867968.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextMatch20270101OneOf4462867968.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TextMatch20270101OneOf4462867968.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextMatch20270101OneOf4462867968) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TextMatch20270101OneOf4462867968'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TextMatch20270101OneOf4462867968'", e);
      }

      TextMatch ret = new TextMatch();
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
    public TextMatch getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TextMatch cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TextMatch() {
    super("oneOf", Boolean.FALSE);
  }

  public TextMatch(TextMatch20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TextMatch(TextMatch20270101OneOf4462865408 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TextMatch(TextMatch20270101OneOf4462866048 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TextMatch(TextMatch20270101OneOf4462866688 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TextMatch(TextMatch20270101OneOf4462867328 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TextMatch(TextMatch20270101OneOf4462867968 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TextMatch20270101OneOf", new GenericType<TextMatch20270101OneOf>() {});
    schemas.put(
        "TextMatch20270101OneOf4462865408", new GenericType<TextMatch20270101OneOf4462865408>() {});
    schemas.put(
        "TextMatch20270101OneOf4462866048", new GenericType<TextMatch20270101OneOf4462866048>() {});
    schemas.put(
        "TextMatch20270101OneOf4462866688", new GenericType<TextMatch20270101OneOf4462866688>() {});
    schemas.put(
        "TextMatch20270101OneOf4462867328", new GenericType<TextMatch20270101OneOf4462867328>() {});
    schemas.put(
        "TextMatch20270101OneOf4462867968", new GenericType<TextMatch20270101OneOf4462867968>() {});
    JSON.registerDescendants(TextMatch.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TextMatch.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TextMatch20270101OneOf, TextMatch20270101OneOf4462865408,
   * TextMatch20270101OneOf4462866048, TextMatch20270101OneOf4462866688,
   * TextMatch20270101OneOf4462867328, TextMatch20270101OneOf4462867968
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TextMatch20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TextMatch20270101OneOf4462865408.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TextMatch20270101OneOf4462866048.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TextMatch20270101OneOf4462866688.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TextMatch20270101OneOf4462867328.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TextMatch20270101OneOf4462867968.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TextMatch20270101OneOf, TextMatch20270101OneOf4462865408,"
            + " TextMatch20270101OneOf4462866048, TextMatch20270101OneOf4462866688,"
            + " TextMatch20270101OneOf4462867328, TextMatch20270101OneOf4462867968");
  }

  /**
   * Get the actual instance, which can be the following: TextMatch20270101OneOf,
   * TextMatch20270101OneOf4462865408, TextMatch20270101OneOf4462866048,
   * TextMatch20270101OneOf4462866688, TextMatch20270101OneOf4462867328,
   * TextMatch20270101OneOf4462867968
   *
   * @return The actual instance (TextMatch20270101OneOf, TextMatch20270101OneOf4462865408,
   *     TextMatch20270101OneOf4462866048, TextMatch20270101OneOf4462866688,
   *     TextMatch20270101OneOf4462867328, TextMatch20270101OneOf4462867968)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextMatch20270101OneOf`. If the actual instance is not
   * `TextMatch20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TextMatch20270101OneOf`
   * @throws ClassCastException if the instance is not `TextMatch20270101OneOf`
   */
  public TextMatch20270101OneOf getTextMatch20270101OneOf() throws ClassCastException {
    return (TextMatch20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextMatch20270101OneOf4462865408`. If the actual instance is not
   * `TextMatch20270101OneOf4462865408`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TextMatch20270101OneOf4462865408`
   * @throws ClassCastException if the instance is not `TextMatch20270101OneOf4462865408`
   */
  public TextMatch20270101OneOf4462865408 getTextMatch20270101OneOf4462865408()
      throws ClassCastException {
    return (TextMatch20270101OneOf4462865408) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextMatch20270101OneOf4462866048`. If the actual instance is not
   * `TextMatch20270101OneOf4462866048`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TextMatch20270101OneOf4462866048`
   * @throws ClassCastException if the instance is not `TextMatch20270101OneOf4462866048`
   */
  public TextMatch20270101OneOf4462866048 getTextMatch20270101OneOf4462866048()
      throws ClassCastException {
    return (TextMatch20270101OneOf4462866048) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextMatch20270101OneOf4462866688`. If the actual instance is not
   * `TextMatch20270101OneOf4462866688`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TextMatch20270101OneOf4462866688`
   * @throws ClassCastException if the instance is not `TextMatch20270101OneOf4462866688`
   */
  public TextMatch20270101OneOf4462866688 getTextMatch20270101OneOf4462866688()
      throws ClassCastException {
    return (TextMatch20270101OneOf4462866688) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextMatch20270101OneOf4462867328`. If the actual instance is not
   * `TextMatch20270101OneOf4462867328`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TextMatch20270101OneOf4462867328`
   * @throws ClassCastException if the instance is not `TextMatch20270101OneOf4462867328`
   */
  public TextMatch20270101OneOf4462867328 getTextMatch20270101OneOf4462867328()
      throws ClassCastException {
    return (TextMatch20270101OneOf4462867328) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextMatch20270101OneOf4462867968`. If the actual instance is not
   * `TextMatch20270101OneOf4462867968`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TextMatch20270101OneOf4462867968`
   * @throws ClassCastException if the instance is not `TextMatch20270101OneOf4462867968`
   */
  public TextMatch20270101OneOf4462867968 getTextMatch20270101OneOf4462867968()
      throws ClassCastException {
    return (TextMatch20270101OneOf4462867968) super.getActualInstance();
  }
}
