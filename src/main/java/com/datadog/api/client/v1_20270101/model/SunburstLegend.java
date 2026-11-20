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
@JsonDeserialize(using = SunburstLegend.SunburstLegendDeserializer.class)
@JsonSerialize(using = SunburstLegend.SunburstLegendSerializer.class)
public class SunburstLegend extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SunburstLegend.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SunburstLegendSerializer extends StdSerializer<SunburstLegend> {
    public SunburstLegendSerializer(Class<SunburstLegend> t) {
      super(t);
    }

    public SunburstLegendSerializer() {
      this(null);
    }

    @Override
    public void serialize(SunburstLegend value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SunburstLegendDeserializer extends StdDeserializer<SunburstLegend> {
    public SunburstLegendDeserializer() {
      this(SunburstLegend.class);
    }

    public SunburstLegendDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SunburstLegend deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SunburstLegend20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstLegend20270101OneOf.class.equals(Integer.class)
            || SunburstLegend20270101OneOf.class.equals(Long.class)
            || SunburstLegend20270101OneOf.class.equals(Float.class)
            || SunburstLegend20270101OneOf.class.equals(Double.class)
            || SunburstLegend20270101OneOf.class.equals(Boolean.class)
            || SunburstLegend20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstLegend20270101OneOf.class.equals(Integer.class)
                        || SunburstLegend20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstLegend20270101OneOf.class.equals(Float.class)
                        || SunburstLegend20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstLegend20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstLegend20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstLegend20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstLegend20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SunburstLegend20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SunburstLegend20270101OneOf'", e);
      }

      // deserialize SunburstKnownLegend
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstKnownLegend.class.equals(Integer.class)
            || SunburstKnownLegend.class.equals(Long.class)
            || SunburstKnownLegend.class.equals(Float.class)
            || SunburstKnownLegend.class.equals(Double.class)
            || SunburstKnownLegend.class.equals(Boolean.class)
            || SunburstKnownLegend.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstKnownLegend.class.equals(Integer.class)
                        || SunburstKnownLegend.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstKnownLegend.class.equals(Float.class)
                        || SunburstKnownLegend.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstKnownLegend.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstKnownLegend.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstKnownLegend.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstKnownLegend) tmp).unparsed
              && !(((SunburstKnownLegend) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SunburstKnownLegend'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SunburstKnownLegend'", e);
      }

      SunburstLegend ret = new SunburstLegend();
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
    public SunburstLegend getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SunburstLegend cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SunburstLegend() {
    super("oneOf", Boolean.FALSE);
  }

  public SunburstLegend(SunburstLegend20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SunburstLegend(SunburstKnownLegend o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("SunburstLegend20270101OneOf", new GenericType<SunburstLegend20270101OneOf>() {});
    schemas.put("SunburstKnownLegend", new GenericType<SunburstKnownLegend>() {});
    JSON.registerDescendants(SunburstLegend.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SunburstLegend.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SunburstLegend20270101OneOf, SunburstKnownLegend
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(SunburstLegend20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SunburstKnownLegend.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SunburstLegend20270101OneOf, SunburstKnownLegend");
  }

  /**
   * Get the actual instance, which can be the following: SunburstLegend20270101OneOf,
   * SunburstKnownLegend
   *
   * @return The actual instance (SunburstLegend20270101OneOf, SunburstKnownLegend)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstLegend20270101OneOf`. If the actual instance is not
   * `SunburstLegend20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SunburstLegend20270101OneOf`
   * @throws ClassCastException if the instance is not `SunburstLegend20270101OneOf`
   */
  public SunburstLegend20270101OneOf getSunburstLegend20270101OneOf() throws ClassCastException {
    return (SunburstLegend20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstKnownLegend`. If the actual instance is not
   * `SunburstKnownLegend`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SunburstKnownLegend`
   * @throws ClassCastException if the instance is not `SunburstKnownLegend`
   */
  public SunburstKnownLegend getSunburstKnownLegend() throws ClassCastException {
    return (SunburstKnownLegend) super.getActualInstance();
  }
}
