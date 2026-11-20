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
@JsonDeserialize(using = SunburstBackendRequest.SunburstBackendRequestDeserializer.class)
@JsonSerialize(using = SunburstBackendRequest.SunburstBackendRequestSerializer.class)
public class SunburstBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SunburstBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SunburstBackendRequestSerializer
      extends StdSerializer<SunburstBackendRequest> {
    public SunburstBackendRequestSerializer(Class<SunburstBackendRequest> t) {
      super(t);
    }

    public SunburstBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SunburstBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SunburstBackendRequestDeserializer
      extends StdDeserializer<SunburstBackendRequest> {
    public SunburstBackendRequestDeserializer() {
      this(SunburstBackendRequest.class);
    }

    public SunburstBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SunburstBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SunburstBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstBackendRequest20270101OneOf.class.equals(Integer.class)
            || SunburstBackendRequest20270101OneOf.class.equals(Long.class)
            || SunburstBackendRequest20270101OneOf.class.equals(Float.class)
            || SunburstBackendRequest20270101OneOf.class.equals(Double.class)
            || SunburstBackendRequest20270101OneOf.class.equals(Boolean.class)
            || SunburstBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf.class.equals(Integer.class)
                        || SunburstBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf.class.equals(Float.class)
                        || SunburstBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SunburstBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SunburstBackendRequest20270101OneOf'",
            e);
      }

      // deserialize SunburstBackendRequest20270101OneOf4462422560
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstBackendRequest20270101OneOf4462422560.class.equals(Integer.class)
            || SunburstBackendRequest20270101OneOf4462422560.class.equals(Long.class)
            || SunburstBackendRequest20270101OneOf4462422560.class.equals(Float.class)
            || SunburstBackendRequest20270101OneOf4462422560.class.equals(Double.class)
            || SunburstBackendRequest20270101OneOf4462422560.class.equals(Boolean.class)
            || SunburstBackendRequest20270101OneOf4462422560.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf4462422560.class.equals(Integer.class)
                        || SunburstBackendRequest20270101OneOf4462422560.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf4462422560.class.equals(Float.class)
                        || SunburstBackendRequest20270101OneOf4462422560.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf4462422560.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf4462422560.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SunburstBackendRequest20270101OneOf4462422560.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstBackendRequest20270101OneOf4462422560) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SunburstBackendRequest20270101OneOf4462422560'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SunburstBackendRequest20270101OneOf4462422560'",
            e);
      }

      // deserialize SunburstBackendRequest20270101OneOf4462423840
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstBackendRequest20270101OneOf4462423840.class.equals(Integer.class)
            || SunburstBackendRequest20270101OneOf4462423840.class.equals(Long.class)
            || SunburstBackendRequest20270101OneOf4462423840.class.equals(Float.class)
            || SunburstBackendRequest20270101OneOf4462423840.class.equals(Double.class)
            || SunburstBackendRequest20270101OneOf4462423840.class.equals(Boolean.class)
            || SunburstBackendRequest20270101OneOf4462423840.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf4462423840.class.equals(Integer.class)
                        || SunburstBackendRequest20270101OneOf4462423840.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf4462423840.class.equals(Float.class)
                        || SunburstBackendRequest20270101OneOf4462423840.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf4462423840.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf4462423840.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SunburstBackendRequest20270101OneOf4462423840.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstBackendRequest20270101OneOf4462423840) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SunburstBackendRequest20270101OneOf4462423840'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SunburstBackendRequest20270101OneOf4462423840'",
            e);
      }

      // deserialize SunburstBackendRequest20270101OneOf4462424800
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstBackendRequest20270101OneOf4462424800.class.equals(Integer.class)
            || SunburstBackendRequest20270101OneOf4462424800.class.equals(Long.class)
            || SunburstBackendRequest20270101OneOf4462424800.class.equals(Float.class)
            || SunburstBackendRequest20270101OneOf4462424800.class.equals(Double.class)
            || SunburstBackendRequest20270101OneOf4462424800.class.equals(Boolean.class)
            || SunburstBackendRequest20270101OneOf4462424800.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf4462424800.class.equals(Integer.class)
                        || SunburstBackendRequest20270101OneOf4462424800.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstBackendRequest20270101OneOf4462424800.class.equals(Float.class)
                        || SunburstBackendRequest20270101OneOf4462424800.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf4462424800.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstBackendRequest20270101OneOf4462424800.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SunburstBackendRequest20270101OneOf4462424800.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstBackendRequest20270101OneOf4462424800) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SunburstBackendRequest20270101OneOf4462424800'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SunburstBackendRequest20270101OneOf4462424800'",
            e);
      }

      SunburstBackendRequest ret = new SunburstBackendRequest();
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
    public SunburstBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SunburstBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SunburstBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public SunburstBackendRequest(SunburstBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SunburstBackendRequest(SunburstBackendRequest20270101OneOf4462422560 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SunburstBackendRequest(SunburstBackendRequest20270101OneOf4462423840 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SunburstBackendRequest(SunburstBackendRequest20270101OneOf4462424800 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SunburstBackendRequest20270101OneOf",
        new GenericType<SunburstBackendRequest20270101OneOf>() {});
    schemas.put(
        "SunburstBackendRequest20270101OneOf4462422560",
        new GenericType<SunburstBackendRequest20270101OneOf4462422560>() {});
    schemas.put(
        "SunburstBackendRequest20270101OneOf4462423840",
        new GenericType<SunburstBackendRequest20270101OneOf4462423840>() {});
    schemas.put(
        "SunburstBackendRequest20270101OneOf4462424800",
        new GenericType<SunburstBackendRequest20270101OneOf4462424800>() {});
    JSON.registerDescendants(SunburstBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SunburstBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SunburstBackendRequest20270101OneOf,
   * SunburstBackendRequest20270101OneOf4462422560, SunburstBackendRequest20270101OneOf4462423840,
   * SunburstBackendRequest20270101OneOf4462424800
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SunburstBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SunburstBackendRequest20270101OneOf4462422560.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SunburstBackendRequest20270101OneOf4462423840.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SunburstBackendRequest20270101OneOf4462424800.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SunburstBackendRequest20270101OneOf,"
            + " SunburstBackendRequest20270101OneOf4462422560,"
            + " SunburstBackendRequest20270101OneOf4462423840,"
            + " SunburstBackendRequest20270101OneOf4462424800");
  }

  /**
   * Get the actual instance, which can be the following: SunburstBackendRequest20270101OneOf,
   * SunburstBackendRequest20270101OneOf4462422560, SunburstBackendRequest20270101OneOf4462423840,
   * SunburstBackendRequest20270101OneOf4462424800
   *
   * @return The actual instance (SunburstBackendRequest20270101OneOf,
   *     SunburstBackendRequest20270101OneOf4462422560,
   *     SunburstBackendRequest20270101OneOf4462423840,
   *     SunburstBackendRequest20270101OneOf4462424800)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstBackendRequest20270101OneOf`. If the actual instance is not
   * `SunburstBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SunburstBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `SunburstBackendRequest20270101OneOf`
   */
  public SunburstBackendRequest20270101OneOf getSunburstBackendRequest20270101OneOf()
      throws ClassCastException {
    return (SunburstBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstBackendRequest20270101OneOf4462422560`. If the actual
   * instance is not `SunburstBackendRequest20270101OneOf4462422560`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `SunburstBackendRequest20270101OneOf4462422560`
   * @throws ClassCastException if the instance is not
   *     `SunburstBackendRequest20270101OneOf4462422560`
   */
  public SunburstBackendRequest20270101OneOf4462422560
      getSunburstBackendRequest20270101OneOf4462422560() throws ClassCastException {
    return (SunburstBackendRequest20270101OneOf4462422560) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstBackendRequest20270101OneOf4462423840`. If the actual
   * instance is not `SunburstBackendRequest20270101OneOf4462423840`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `SunburstBackendRequest20270101OneOf4462423840`
   * @throws ClassCastException if the instance is not
   *     `SunburstBackendRequest20270101OneOf4462423840`
   */
  public SunburstBackendRequest20270101OneOf4462423840
      getSunburstBackendRequest20270101OneOf4462423840() throws ClassCastException {
    return (SunburstBackendRequest20270101OneOf4462423840) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstBackendRequest20270101OneOf4462424800`. If the actual
   * instance is not `SunburstBackendRequest20270101OneOf4462424800`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `SunburstBackendRequest20270101OneOf4462424800`
   * @throws ClassCastException if the instance is not
   *     `SunburstBackendRequest20270101OneOf4462424800`
   */
  public SunburstBackendRequest20270101OneOf4462424800
      getSunburstBackendRequest20270101OneOf4462424800() throws ClassCastException {
    return (SunburstBackendRequest20270101OneOf4462424800) super.getActualInstance();
  }
}
