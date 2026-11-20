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
    using = CellScope20270101CohortTarget.CellScope20270101CohortTargetDeserializer.class)
@JsonSerialize(using = CellScope20270101CohortTarget.CellScope20270101CohortTargetSerializer.class)
public class CellScope20270101CohortTarget extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CellScope20270101CohortTarget.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CellScope20270101CohortTargetSerializer
      extends StdSerializer<CellScope20270101CohortTarget> {
    public CellScope20270101CohortTargetSerializer(Class<CellScope20270101CohortTarget> t) {
      super(t);
    }

    public CellScope20270101CohortTargetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CellScope20270101CohortTarget value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CellScope20270101CohortTargetDeserializer
      extends StdDeserializer<CellScope20270101CohortTarget> {
    public CellScope20270101CohortTargetDeserializer() {
      this(CellScope20270101CohortTarget.class);
    }

    public CellScope20270101CohortTargetDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CellScope20270101CohortTarget deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CellScope20270101CohortTargetOneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CellScope20270101CohortTargetOneOf.class.equals(Integer.class)
            || CellScope20270101CohortTargetOneOf.class.equals(Long.class)
            || CellScope20270101CohortTargetOneOf.class.equals(Float.class)
            || CellScope20270101CohortTargetOneOf.class.equals(Double.class)
            || CellScope20270101CohortTargetOneOf.class.equals(Boolean.class)
            || CellScope20270101CohortTargetOneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CellScope20270101CohortTargetOneOf.class.equals(Integer.class)
                        || CellScope20270101CohortTargetOneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CellScope20270101CohortTargetOneOf.class.equals(Float.class)
                        || CellScope20270101CohortTargetOneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CellScope20270101CohortTargetOneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CellScope20270101CohortTargetOneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CellScope20270101CohortTargetOneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CellScope20270101CohortTargetOneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CellScope20270101CohortTargetOneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CellScope20270101CohortTargetOneOf'",
            e);
      }

      // deserialize CellScope20270101CohortTargetOneOf4454617856
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CellScope20270101CohortTargetOneOf4454617856.class.equals(Integer.class)
            || CellScope20270101CohortTargetOneOf4454617856.class.equals(Long.class)
            || CellScope20270101CohortTargetOneOf4454617856.class.equals(Float.class)
            || CellScope20270101CohortTargetOneOf4454617856.class.equals(Double.class)
            || CellScope20270101CohortTargetOneOf4454617856.class.equals(Boolean.class)
            || CellScope20270101CohortTargetOneOf4454617856.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CellScope20270101CohortTargetOneOf4454617856.class.equals(Integer.class)
                        || CellScope20270101CohortTargetOneOf4454617856.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CellScope20270101CohortTargetOneOf4454617856.class.equals(Float.class)
                        || CellScope20270101CohortTargetOneOf4454617856.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CellScope20270101CohortTargetOneOf4454617856.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CellScope20270101CohortTargetOneOf4454617856.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CellScope20270101CohortTargetOneOf4454617856.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CellScope20270101CohortTargetOneOf4454617856) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'CellScope20270101CohortTargetOneOf4454617856'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CellScope20270101CohortTargetOneOf4454617856'",
            e);
      }

      CellScope20270101CohortTarget ret = new CellScope20270101CohortTarget();
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
    public CellScope20270101CohortTarget getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CellScope20270101CohortTarget cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CellScope20270101CohortTarget() {
    super("oneOf", Boolean.FALSE);
  }

  public CellScope20270101CohortTarget(CellScope20270101CohortTargetOneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CellScope20270101CohortTarget(CellScope20270101CohortTargetOneOf4454617856 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CellScope20270101CohortTargetOneOf",
        new GenericType<CellScope20270101CohortTargetOneOf>() {});
    schemas.put(
        "CellScope20270101CohortTargetOneOf4454617856",
        new GenericType<CellScope20270101CohortTargetOneOf4454617856>() {});
    JSON.registerDescendants(
        CellScope20270101CohortTarget.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CellScope20270101CohortTarget.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CellScope20270101CohortTargetOneOf,
   * CellScope20270101CohortTargetOneOf4454617856
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CellScope20270101CohortTargetOneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CellScope20270101CohortTargetOneOf4454617856.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CellScope20270101CohortTargetOneOf,"
            + " CellScope20270101CohortTargetOneOf4454617856");
  }

  /**
   * Get the actual instance, which can be the following: CellScope20270101CohortTargetOneOf,
   * CellScope20270101CohortTargetOneOf4454617856
   *
   * @return The actual instance (CellScope20270101CohortTargetOneOf,
   *     CellScope20270101CohortTargetOneOf4454617856)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CellScope20270101CohortTargetOneOf`. If the actual instance is not
   * `CellScope20270101CohortTargetOneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CellScope20270101CohortTargetOneOf`
   * @throws ClassCastException if the instance is not `CellScope20270101CohortTargetOneOf`
   */
  public CellScope20270101CohortTargetOneOf getCellScope20270101CohortTargetOneOf()
      throws ClassCastException {
    return (CellScope20270101CohortTargetOneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CellScope20270101CohortTargetOneOf4454617856`. If the actual
   * instance is not `CellScope20270101CohortTargetOneOf4454617856`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `CellScope20270101CohortTargetOneOf4454617856`
   * @throws ClassCastException if the instance is not
   *     `CellScope20270101CohortTargetOneOf4454617856`
   */
  public CellScope20270101CohortTargetOneOf4454617856
      getCellScope20270101CohortTargetOneOf4454617856() throws ClassCastException {
    return (CellScope20270101CohortTargetOneOf4454617856) super.getActualInstance();
  }
}
