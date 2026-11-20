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
@JsonDeserialize(using = FormulaApmStatsQuery.FormulaApmStatsQueryDeserializer.class)
@JsonSerialize(using = FormulaApmStatsQuery.FormulaApmStatsQuerySerializer.class)
public class FormulaApmStatsQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(FormulaApmStatsQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class FormulaApmStatsQuerySerializer extends StdSerializer<FormulaApmStatsQuery> {
    public FormulaApmStatsQuerySerializer(Class<FormulaApmStatsQuery> t) {
      super(t);
    }

    public FormulaApmStatsQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaApmStatsQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class FormulaApmStatsQueryDeserializer
      extends StdDeserializer<FormulaApmStatsQuery> {
    public FormulaApmStatsQueryDeserializer() {
      this(FormulaApmStatsQuery.class);
    }

    public FormulaApmStatsQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public FormulaApmStatsQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FormulaApmDependencyStatsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaApmDependencyStatsQuery.class.equals(Integer.class)
            || FormulaApmDependencyStatsQuery.class.equals(Long.class)
            || FormulaApmDependencyStatsQuery.class.equals(Float.class)
            || FormulaApmDependencyStatsQuery.class.equals(Double.class)
            || FormulaApmDependencyStatsQuery.class.equals(Boolean.class)
            || FormulaApmDependencyStatsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaApmDependencyStatsQuery.class.equals(Integer.class)
                        || FormulaApmDependencyStatsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaApmDependencyStatsQuery.class.equals(Float.class)
                        || FormulaApmDependencyStatsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaApmDependencyStatsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaApmDependencyStatsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaApmDependencyStatsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaApmDependencyStatsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaApmDependencyStatsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'FormulaApmDependencyStatsQuery'", e);
      }

      // deserialize FormulaApmResourceStatsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaApmResourceStatsQuery.class.equals(Integer.class)
            || FormulaApmResourceStatsQuery.class.equals(Long.class)
            || FormulaApmResourceStatsQuery.class.equals(Float.class)
            || FormulaApmResourceStatsQuery.class.equals(Double.class)
            || FormulaApmResourceStatsQuery.class.equals(Boolean.class)
            || FormulaApmResourceStatsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaApmResourceStatsQuery.class.equals(Integer.class)
                        || FormulaApmResourceStatsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaApmResourceStatsQuery.class.equals(Float.class)
                        || FormulaApmResourceStatsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaApmResourceStatsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaApmResourceStatsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaApmResourceStatsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaApmResourceStatsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaApmResourceStatsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaApmResourceStatsQuery'", e);
      }

      FormulaApmStatsQuery ret = new FormulaApmStatsQuery();
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
    public FormulaApmStatsQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "FormulaApmStatsQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public FormulaApmStatsQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public FormulaApmStatsQuery(FormulaApmDependencyStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaApmStatsQuery(FormulaApmResourceStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "FormulaApmDependencyStatsQuery", new GenericType<FormulaApmDependencyStatsQuery>() {});
    schemas.put("FormulaApmResourceStatsQuery", new GenericType<FormulaApmResourceStatsQuery>() {});
    JSON.registerDescendants(FormulaApmStatsQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return FormulaApmStatsQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FormulaApmDependencyStatsQuery, FormulaApmResourceStatsQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        FormulaApmDependencyStatsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaApmResourceStatsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FormulaApmDependencyStatsQuery,"
            + " FormulaApmResourceStatsQuery");
  }

  /**
   * Get the actual instance, which can be the following: FormulaApmDependencyStatsQuery,
   * FormulaApmResourceStatsQuery
   *
   * @return The actual instance (FormulaApmDependencyStatsQuery, FormulaApmResourceStatsQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaApmDependencyStatsQuery`. If the actual instance is not
   * `FormulaApmDependencyStatsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaApmDependencyStatsQuery`
   * @throws ClassCastException if the instance is not `FormulaApmDependencyStatsQuery`
   */
  public FormulaApmDependencyStatsQuery getFormulaApmDependencyStatsQuery()
      throws ClassCastException {
    return (FormulaApmDependencyStatsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaApmResourceStatsQuery`. If the actual instance is not
   * `FormulaApmResourceStatsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaApmResourceStatsQuery`
   * @throws ClassCastException if the instance is not `FormulaApmResourceStatsQuery`
   */
  public FormulaApmResourceStatsQuery getFormulaApmResourceStatsQuery() throws ClassCastException {
    return (FormulaApmResourceStatsQuery) super.getActualInstance();
  }
}
