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
    using = TextFormattingRule20270101Replace.TextFormattingRule20270101ReplaceDeserializer.class)
@JsonSerialize(
    using = TextFormattingRule20270101Replace.TextFormattingRule20270101ReplaceSerializer.class)
public class TextFormattingRule20270101Replace extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(TextFormattingRule20270101Replace.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TextFormattingRule20270101ReplaceSerializer
      extends StdSerializer<TextFormattingRule20270101Replace> {
    public TextFormattingRule20270101ReplaceSerializer(Class<TextFormattingRule20270101Replace> t) {
      super(t);
    }

    public TextFormattingRule20270101ReplaceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TextFormattingRule20270101Replace value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TextFormattingRule20270101ReplaceDeserializer
      extends StdDeserializer<TextFormattingRule20270101Replace> {
    public TextFormattingRule20270101ReplaceDeserializer() {
      this(TextFormattingRule20270101Replace.class);
    }

    public TextFormattingRule20270101ReplaceDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TextFormattingRule20270101Replace deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TextFormattingRule20270101ReplaceOneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextFormattingRule20270101ReplaceOneOf.class.equals(Integer.class)
            || TextFormattingRule20270101ReplaceOneOf.class.equals(Long.class)
            || TextFormattingRule20270101ReplaceOneOf.class.equals(Float.class)
            || TextFormattingRule20270101ReplaceOneOf.class.equals(Double.class)
            || TextFormattingRule20270101ReplaceOneOf.class.equals(Boolean.class)
            || TextFormattingRule20270101ReplaceOneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextFormattingRule20270101ReplaceOneOf.class.equals(Integer.class)
                        || TextFormattingRule20270101ReplaceOneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextFormattingRule20270101ReplaceOneOf.class.equals(Float.class)
                        || TextFormattingRule20270101ReplaceOneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextFormattingRule20270101ReplaceOneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextFormattingRule20270101ReplaceOneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TextFormattingRule20270101ReplaceOneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextFormattingRule20270101ReplaceOneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'TextFormattingRule20270101ReplaceOneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TextFormattingRule20270101ReplaceOneOf'",
            e);
      }

      // deserialize TextFormattingRule20270101ReplaceOneOf4462863328
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Integer.class)
            || TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Long.class)
            || TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Float.class)
            || TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Double.class)
            || TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Boolean.class)
            || TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Integer.class)
                        || TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Float.class)
                        || TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TextFormattingRule20270101ReplaceOneOf4462863328.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TextFormattingRule20270101ReplaceOneOf4462863328.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TextFormattingRule20270101ReplaceOneOf4462863328) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TextFormattingRule20270101ReplaceOneOf4462863328'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TextFormattingRule20270101ReplaceOneOf4462863328'",
            e);
      }

      TextFormattingRule20270101Replace ret = new TextFormattingRule20270101Replace();
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
    public TextFormattingRule20270101Replace getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TextFormattingRule20270101Replace cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TextFormattingRule20270101Replace() {
    super("oneOf", Boolean.FALSE);
  }

  public TextFormattingRule20270101Replace(TextFormattingRule20270101ReplaceOneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TextFormattingRule20270101Replace(TextFormattingRule20270101ReplaceOneOf4462863328 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TextFormattingRule20270101ReplaceOneOf",
        new GenericType<TextFormattingRule20270101ReplaceOneOf>() {});
    schemas.put(
        "TextFormattingRule20270101ReplaceOneOf4462863328",
        new GenericType<TextFormattingRule20270101ReplaceOneOf4462863328>() {});
    JSON.registerDescendants(
        TextFormattingRule20270101Replace.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TextFormattingRule20270101Replace.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TextFormattingRule20270101ReplaceOneOf,
   * TextFormattingRule20270101ReplaceOneOf4462863328
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TextFormattingRule20270101ReplaceOneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TextFormattingRule20270101ReplaceOneOf4462863328.class,
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
        "Invalid instance type. Must be TextFormattingRule20270101ReplaceOneOf,"
            + " TextFormattingRule20270101ReplaceOneOf4462863328");
  }

  /**
   * Get the actual instance, which can be the following: TextFormattingRule20270101ReplaceOneOf,
   * TextFormattingRule20270101ReplaceOneOf4462863328
   *
   * @return The actual instance (TextFormattingRule20270101ReplaceOneOf,
   *     TextFormattingRule20270101ReplaceOneOf4462863328)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextFormattingRule20270101ReplaceOneOf`. If the actual instance is
   * not `TextFormattingRule20270101ReplaceOneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TextFormattingRule20270101ReplaceOneOf`
   * @throws ClassCastException if the instance is not `TextFormattingRule20270101ReplaceOneOf`
   */
  public TextFormattingRule20270101ReplaceOneOf getTextFormattingRule20270101ReplaceOneOf()
      throws ClassCastException {
    return (TextFormattingRule20270101ReplaceOneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TextFormattingRule20270101ReplaceOneOf4462863328`. If the actual
   * instance is not `TextFormattingRule20270101ReplaceOneOf4462863328`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `TextFormattingRule20270101ReplaceOneOf4462863328`
   * @throws ClassCastException if the instance is not
   *     `TextFormattingRule20270101ReplaceOneOf4462863328`
   */
  public TextFormattingRule20270101ReplaceOneOf4462863328
      getTextFormattingRule20270101ReplaceOneOf4462863328() throws ClassCastException {
    return (TextFormattingRule20270101ReplaceOneOf4462863328) super.getActualInstance();
  }
}
