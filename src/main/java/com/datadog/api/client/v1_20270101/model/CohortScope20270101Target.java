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
@JsonDeserialize(using = CohortScope20270101Target.CohortScope20270101TargetDeserializer.class)
@JsonSerialize(using = CohortScope20270101Target.CohortScope20270101TargetSerializer.class)
public class CohortScope20270101Target extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CohortScope20270101Target.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CohortScope20270101TargetSerializer
      extends StdSerializer<CohortScope20270101Target> {
    public CohortScope20270101TargetSerializer(Class<CohortScope20270101Target> t) {
      super(t);
    }

    public CohortScope20270101TargetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CohortScope20270101Target value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CohortScope20270101TargetDeserializer
      extends StdDeserializer<CohortScope20270101Target> {
    public CohortScope20270101TargetDeserializer() {
      this(CohortScope20270101Target.class);
    }

    public CohortScope20270101TargetDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CohortScope20270101Target deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CohortScope20270101TargetOneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CohortScope20270101TargetOneOf.class.equals(Integer.class)
            || CohortScope20270101TargetOneOf.class.equals(Long.class)
            || CohortScope20270101TargetOneOf.class.equals(Float.class)
            || CohortScope20270101TargetOneOf.class.equals(Double.class)
            || CohortScope20270101TargetOneOf.class.equals(Boolean.class)
            || CohortScope20270101TargetOneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CohortScope20270101TargetOneOf.class.equals(Integer.class)
                        || CohortScope20270101TargetOneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CohortScope20270101TargetOneOf.class.equals(Float.class)
                        || CohortScope20270101TargetOneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CohortScope20270101TargetOneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CohortScope20270101TargetOneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CohortScope20270101TargetOneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CohortScope20270101TargetOneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CohortScope20270101TargetOneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'CohortScope20270101TargetOneOf'", e);
      }

      // deserialize CohortScope20270101TargetOneOf4454865216
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CohortScope20270101TargetOneOf4454865216.class.equals(Integer.class)
            || CohortScope20270101TargetOneOf4454865216.class.equals(Long.class)
            || CohortScope20270101TargetOneOf4454865216.class.equals(Float.class)
            || CohortScope20270101TargetOneOf4454865216.class.equals(Double.class)
            || CohortScope20270101TargetOneOf4454865216.class.equals(Boolean.class)
            || CohortScope20270101TargetOneOf4454865216.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CohortScope20270101TargetOneOf4454865216.class.equals(Integer.class)
                        || CohortScope20270101TargetOneOf4454865216.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CohortScope20270101TargetOneOf4454865216.class.equals(Float.class)
                        || CohortScope20270101TargetOneOf4454865216.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CohortScope20270101TargetOneOf4454865216.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CohortScope20270101TargetOneOf4454865216.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CohortScope20270101TargetOneOf4454865216.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CohortScope20270101TargetOneOf4454865216) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'CohortScope20270101TargetOneOf4454865216'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CohortScope20270101TargetOneOf4454865216'",
            e);
      }

      CohortScope20270101Target ret = new CohortScope20270101Target();
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
    public CohortScope20270101Target getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CohortScope20270101Target cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CohortScope20270101Target() {
    super("oneOf", Boolean.FALSE);
  }

  public CohortScope20270101Target(CohortScope20270101TargetOneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CohortScope20270101Target(CohortScope20270101TargetOneOf4454865216 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CohortScope20270101TargetOneOf", new GenericType<CohortScope20270101TargetOneOf>() {});
    schemas.put(
        "CohortScope20270101TargetOneOf4454865216",
        new GenericType<CohortScope20270101TargetOneOf4454865216>() {});
    JSON.registerDescendants(CohortScope20270101Target.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CohortScope20270101Target.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CohortScope20270101TargetOneOf,
   * CohortScope20270101TargetOneOf4454865216
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CohortScope20270101TargetOneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CohortScope20270101TargetOneOf4454865216.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CohortScope20270101TargetOneOf,"
            + " CohortScope20270101TargetOneOf4454865216");
  }

  /**
   * Get the actual instance, which can be the following: CohortScope20270101TargetOneOf,
   * CohortScope20270101TargetOneOf4454865216
   *
   * @return The actual instance (CohortScope20270101TargetOneOf,
   *     CohortScope20270101TargetOneOf4454865216)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CohortScope20270101TargetOneOf`. If the actual instance is not
   * `CohortScope20270101TargetOneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CohortScope20270101TargetOneOf`
   * @throws ClassCastException if the instance is not `CohortScope20270101TargetOneOf`
   */
  public CohortScope20270101TargetOneOf getCohortScope20270101TargetOneOf()
      throws ClassCastException {
    return (CohortScope20270101TargetOneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CohortScope20270101TargetOneOf4454865216`. If the actual instance
   * is not `CohortScope20270101TargetOneOf4454865216`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CohortScope20270101TargetOneOf4454865216`
   * @throws ClassCastException if the instance is not `CohortScope20270101TargetOneOf4454865216`
   */
  public CohortScope20270101TargetOneOf4454865216 getCohortScope20270101TargetOneOf4454865216()
      throws ClassCastException {
    return (CohortScope20270101TargetOneOf4454865216) super.getActualInstance();
  }
}
