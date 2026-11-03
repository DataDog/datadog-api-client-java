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
@JsonDeserialize(using = HeatgridTextFormatReplace.HeatgridTextFormatReplaceDeserializer.class)
@JsonSerialize(using = HeatgridTextFormatReplace.HeatgridTextFormatReplaceSerializer.class)
public class HeatgridTextFormatReplace extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(HeatgridTextFormatReplace.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HeatgridTextFormatReplaceSerializer
      extends StdSerializer<HeatgridTextFormatReplace> {
    public HeatgridTextFormatReplaceSerializer(Class<HeatgridTextFormatReplace> t) {
      super(t);
    }

    public HeatgridTextFormatReplaceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridTextFormatReplace value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HeatgridTextFormatReplaceDeserializer
      extends StdDeserializer<HeatgridTextFormatReplace> {
    public HeatgridTextFormatReplaceDeserializer() {
      this(HeatgridTextFormatReplace.class);
    }

    public HeatgridTextFormatReplaceDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HeatgridTextFormatReplace deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize HeatgridTextFormatReplaceAll
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridTextFormatReplaceAll.class.equals(Integer.class)
            || HeatgridTextFormatReplaceAll.class.equals(Long.class)
            || HeatgridTextFormatReplaceAll.class.equals(Float.class)
            || HeatgridTextFormatReplaceAll.class.equals(Double.class)
            || HeatgridTextFormatReplaceAll.class.equals(Boolean.class)
            || HeatgridTextFormatReplaceAll.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridTextFormatReplaceAll.class.equals(Integer.class)
                        || HeatgridTextFormatReplaceAll.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridTextFormatReplaceAll.class.equals(Float.class)
                        || HeatgridTextFormatReplaceAll.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridTextFormatReplaceAll.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridTextFormatReplaceAll.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridTextFormatReplaceAll.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridTextFormatReplaceAll) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridTextFormatReplaceAll'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridTextFormatReplaceAll'", e);
      }

      // deserialize HeatgridTextFormatReplaceSubstring
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridTextFormatReplaceSubstring.class.equals(Integer.class)
            || HeatgridTextFormatReplaceSubstring.class.equals(Long.class)
            || HeatgridTextFormatReplaceSubstring.class.equals(Float.class)
            || HeatgridTextFormatReplaceSubstring.class.equals(Double.class)
            || HeatgridTextFormatReplaceSubstring.class.equals(Boolean.class)
            || HeatgridTextFormatReplaceSubstring.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridTextFormatReplaceSubstring.class.equals(Integer.class)
                        || HeatgridTextFormatReplaceSubstring.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridTextFormatReplaceSubstring.class.equals(Float.class)
                        || HeatgridTextFormatReplaceSubstring.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridTextFormatReplaceSubstring.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridTextFormatReplaceSubstring.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridTextFormatReplaceSubstring.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridTextFormatReplaceSubstring) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridTextFormatReplaceSubstring'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HeatgridTextFormatReplaceSubstring'",
            e);
      }

      HeatgridTextFormatReplace ret = new HeatgridTextFormatReplace();
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
    public HeatgridTextFormatReplace getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "HeatgridTextFormatReplace cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HeatgridTextFormatReplace() {
    super("oneOf", Boolean.FALSE);
  }

  public HeatgridTextFormatReplace(HeatgridTextFormatReplaceAll o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatgridTextFormatReplace(HeatgridTextFormatReplaceSubstring o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("HeatgridTextFormatReplaceAll", new GenericType<HeatgridTextFormatReplaceAll>() {});
    schemas.put(
        "HeatgridTextFormatReplaceSubstring",
        new GenericType<HeatgridTextFormatReplaceSubstring>() {});
    JSON.registerDescendants(HeatgridTextFormatReplace.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HeatgridTextFormatReplace.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HeatgridTextFormatReplaceAll,
   * HeatgridTextFormatReplaceSubstring
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(HeatgridTextFormatReplaceAll.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HeatgridTextFormatReplaceSubstring.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HeatgridTextFormatReplaceAll,"
            + " HeatgridTextFormatReplaceSubstring");
  }

  /**
   * Get the actual instance, which can be the following: HeatgridTextFormatReplaceAll,
   * HeatgridTextFormatReplaceSubstring
   *
   * @return The actual instance (HeatgridTextFormatReplaceAll, HeatgridTextFormatReplaceSubstring)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridTextFormatReplaceAll`. If the actual instance is not
   * `HeatgridTextFormatReplaceAll`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridTextFormatReplaceAll`
   * @throws ClassCastException if the instance is not `HeatgridTextFormatReplaceAll`
   */
  public HeatgridTextFormatReplaceAll getHeatgridTextFormatReplaceAll() throws ClassCastException {
    return (HeatgridTextFormatReplaceAll) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridTextFormatReplaceSubstring`. If the actual instance is not
   * `HeatgridTextFormatReplaceSubstring`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridTextFormatReplaceSubstring`
   * @throws ClassCastException if the instance is not `HeatgridTextFormatReplaceSubstring`
   */
  public HeatgridTextFormatReplaceSubstring getHeatgridTextFormatReplaceSubstring()
      throws ClassCastException {
    return (HeatgridTextFormatReplaceSubstring) super.getActualInstance();
  }
}
