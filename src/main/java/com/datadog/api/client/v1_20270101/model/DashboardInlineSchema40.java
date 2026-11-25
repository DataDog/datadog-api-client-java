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
@JsonDeserialize(using = DashboardInlineSchema40.DashboardInlineSchema40Deserializer.class)
@JsonSerialize(using = DashboardInlineSchema40.DashboardInlineSchema40Serializer.class)
public class DashboardInlineSchema40 extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(DashboardInlineSchema40.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DashboardInlineSchema40Serializer
      extends StdSerializer<DashboardInlineSchema40> {
    public DashboardInlineSchema40Serializer(Class<DashboardInlineSchema40> t) {
      super(t);
    }

    public DashboardInlineSchema40Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema40 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DashboardInlineSchema40Deserializer
      extends StdDeserializer<DashboardInlineSchema40> {
    public DashboardInlineSchema40Deserializer() {
      this(DashboardInlineSchema40.class);
    }

    public DashboardInlineSchema40Deserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DashboardInlineSchema40 deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FormulaDatasetMetricQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaDatasetMetricQuery.class.equals(Integer.class)
            || FormulaDatasetMetricQuery.class.equals(Long.class)
            || FormulaDatasetMetricQuery.class.equals(Float.class)
            || FormulaDatasetMetricQuery.class.equals(Double.class)
            || FormulaDatasetMetricQuery.class.equals(Boolean.class)
            || FormulaDatasetMetricQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaDatasetMetricQuery.class.equals(Integer.class)
                        || FormulaDatasetMetricQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaDatasetMetricQuery.class.equals(Float.class)
                        || FormulaDatasetMetricQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaDatasetMetricQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaDatasetMetricQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaDatasetMetricQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaDatasetMetricQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaDatasetMetricQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaDatasetMetricQuery'", e);
      }

      // deserialize FormulaDatasetApmMetricsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaDatasetApmMetricsQuery.class.equals(Integer.class)
            || FormulaDatasetApmMetricsQuery.class.equals(Long.class)
            || FormulaDatasetApmMetricsQuery.class.equals(Float.class)
            || FormulaDatasetApmMetricsQuery.class.equals(Double.class)
            || FormulaDatasetApmMetricsQuery.class.equals(Boolean.class)
            || FormulaDatasetApmMetricsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaDatasetApmMetricsQuery.class.equals(Integer.class)
                        || FormulaDatasetApmMetricsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaDatasetApmMetricsQuery.class.equals(Float.class)
                        || FormulaDatasetApmMetricsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaDatasetApmMetricsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaDatasetApmMetricsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaDatasetApmMetricsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaDatasetApmMetricsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaDatasetApmMetricsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaDatasetApmMetricsQuery'", e);
      }

      DashboardInlineSchema40 ret = new DashboardInlineSchema40();
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
    public DashboardInlineSchema40 getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "DashboardInlineSchema40 cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DashboardInlineSchema40() {
    super("oneOf", Boolean.FALSE);
  }

  public DashboardInlineSchema40(FormulaDatasetMetricQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardInlineSchema40(FormulaDatasetApmMetricsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FormulaDatasetMetricQuery", new GenericType<FormulaDatasetMetricQuery>() {});
    schemas.put(
        "FormulaDatasetApmMetricsQuery", new GenericType<FormulaDatasetApmMetricsQuery>() {});
    JSON.registerDescendants(DashboardInlineSchema40.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DashboardInlineSchema40.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FormulaDatasetMetricQuery, FormulaDatasetApmMetricsQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(FormulaDatasetMetricQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaDatasetApmMetricsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FormulaDatasetMetricQuery, FormulaDatasetApmMetricsQuery");
  }

  /**
   * Get the actual instance, which can be the following: FormulaDatasetMetricQuery,
   * FormulaDatasetApmMetricsQuery
   *
   * @return The actual instance (FormulaDatasetMetricQuery, FormulaDatasetApmMetricsQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaDatasetMetricQuery`. If the actual instance is not
   * `FormulaDatasetMetricQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaDatasetMetricQuery`
   * @throws ClassCastException if the instance is not `FormulaDatasetMetricQuery`
   */
  public FormulaDatasetMetricQuery getFormulaDatasetMetricQuery() throws ClassCastException {
    return (FormulaDatasetMetricQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaDatasetApmMetricsQuery`. If the actual instance is not
   * `FormulaDatasetApmMetricsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaDatasetApmMetricsQuery`
   * @throws ClassCastException if the instance is not `FormulaDatasetApmMetricsQuery`
   */
  public FormulaDatasetApmMetricsQuery getFormulaDatasetApmMetricsQuery()
      throws ClassCastException {
    return (FormulaDatasetApmMetricsQuery) super.getActualInstance();
  }
}
