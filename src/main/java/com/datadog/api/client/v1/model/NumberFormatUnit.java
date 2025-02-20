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
@JsonDeserialize(using = NumberFormatUnit.NumberFormatUnitDeserializer.class)
@JsonSerialize(using = NumberFormatUnit.NumberFormatUnitSerializer.class)
public class NumberFormatUnit extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(NumberFormatUnit.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class NumberFormatUnitSerializer extends StdSerializer<NumberFormatUnit> {
    public NumberFormatUnitSerializer(Class<NumberFormatUnit> t) {
      super(t);
    }

    public NumberFormatUnitSerializer() {
      this(null);
    }

    @Override
    public void serialize(NumberFormatUnit value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class NumberFormatUnitDeserializer extends StdDeserializer<NumberFormatUnit> {
    public NumberFormatUnitDeserializer() {
      this(NumberFormatUnit.class);
    }

    public NumberFormatUnitDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public NumberFormatUnit deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize NumberFormatUnitCanonical
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NumberFormatUnitCanonical.class.equals(Integer.class)
            || NumberFormatUnitCanonical.class.equals(Long.class)
            || NumberFormatUnitCanonical.class.equals(Float.class)
            || NumberFormatUnitCanonical.class.equals(Double.class)
            || NumberFormatUnitCanonical.class.equals(Boolean.class)
            || NumberFormatUnitCanonical.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NumberFormatUnitCanonical.class.equals(Integer.class)
                        || NumberFormatUnitCanonical.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NumberFormatUnitCanonical.class.equals(Float.class)
                        || NumberFormatUnitCanonical.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NumberFormatUnitCanonical.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NumberFormatUnitCanonical.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NumberFormatUnitCanonical.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NumberFormatUnitCanonical) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NumberFormatUnitCanonical'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NumberFormatUnitCanonical'", e);
      }

      // deserialize NumberFormatUnitCustom
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NumberFormatUnitCustom.class.equals(Integer.class)
            || NumberFormatUnitCustom.class.equals(Long.class)
            || NumberFormatUnitCustom.class.equals(Float.class)
            || NumberFormatUnitCustom.class.equals(Double.class)
            || NumberFormatUnitCustom.class.equals(Boolean.class)
            || NumberFormatUnitCustom.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NumberFormatUnitCustom.class.equals(Integer.class)
                        || NumberFormatUnitCustom.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NumberFormatUnitCustom.class.equals(Float.class)
                        || NumberFormatUnitCustom.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NumberFormatUnitCustom.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NumberFormatUnitCustom.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NumberFormatUnitCustom.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NumberFormatUnitCustom) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NumberFormatUnitCustom'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NumberFormatUnitCustom'", e);
      }

      NumberFormatUnit ret = new NumberFormatUnit();
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
    public NumberFormatUnit getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "NumberFormatUnit cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public NumberFormatUnit() {
    super("oneOf", Boolean.FALSE);
  }

  public NumberFormatUnit(NumberFormatUnitCanonical o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NumberFormatUnit(NumberFormatUnitCustom o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("NumberFormatUnitCanonical", new GenericType<NumberFormatUnitCanonical>() {});
    schemas.put("NumberFormatUnitCustom", new GenericType<NumberFormatUnitCustom>() {});
    JSON.registerDescendants(NumberFormatUnit.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return NumberFormatUnit.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: NumberFormatUnitCanonical, NumberFormatUnitCustom
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(NumberFormatUnitCanonical.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NumberFormatUnitCustom.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be NumberFormatUnitCanonical, NumberFormatUnitCustom");
  }

  /**
   * Get the actual instance, which can be the following: NumberFormatUnitCanonical,
   * NumberFormatUnitCustom
   *
   * @return The actual instance (NumberFormatUnitCanonical, NumberFormatUnitCustom)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `NumberFormatUnitCanonical`. If the actual instance is not
   * `NumberFormatUnitCanonical`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NumberFormatUnitCanonical`
   * @throws ClassCastException if the instance is not `NumberFormatUnitCanonical`
   */
  public NumberFormatUnitCanonical getNumberFormatUnitCanonical() throws ClassCastException {
    return (NumberFormatUnitCanonical) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NumberFormatUnitCustom`. If the actual instance is not
   * `NumberFormatUnitCustom`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NumberFormatUnitCustom`
   * @throws ClassCastException if the instance is not `NumberFormatUnitCustom`
   */
  public NumberFormatUnitCustom getNumberFormatUnitCustom() throws ClassCastException {
    return (NumberFormatUnitCustom) super.getActualInstance();
  }
}
