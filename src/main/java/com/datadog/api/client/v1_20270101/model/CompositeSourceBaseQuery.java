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
@JsonDeserialize(using = CompositeSourceBaseQuery.CompositeSourceBaseQueryDeserializer.class)
@JsonSerialize(using = CompositeSourceBaseQuery.CompositeSourceBaseQuerySerializer.class)
public class CompositeSourceBaseQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CompositeSourceBaseQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CompositeSourceBaseQuerySerializer
      extends StdSerializer<CompositeSourceBaseQuery> {
    public CompositeSourceBaseQuerySerializer(Class<CompositeSourceBaseQuery> t) {
      super(t);
    }

    public CompositeSourceBaseQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CompositeSourceBaseQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CompositeSourceBaseQueryDeserializer
      extends StdDeserializer<CompositeSourceBaseQuery> {
    public CompositeSourceBaseQueryDeserializer() {
      this(CompositeSourceBaseQuery.class);
    }

    public CompositeSourceBaseQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CompositeSourceBaseQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FormulaMetricsQueryMetrics
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaMetricsQueryMetrics.class.equals(Integer.class)
            || FormulaMetricsQueryMetrics.class.equals(Long.class)
            || FormulaMetricsQueryMetrics.class.equals(Float.class)
            || FormulaMetricsQueryMetrics.class.equals(Double.class)
            || FormulaMetricsQueryMetrics.class.equals(Boolean.class)
            || FormulaMetricsQueryMetrics.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaMetricsQueryMetrics.class.equals(Integer.class)
                        || FormulaMetricsQueryMetrics.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaMetricsQueryMetrics.class.equals(Float.class)
                        || FormulaMetricsQueryMetrics.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaMetricsQueryMetrics.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaMetricsQueryMetrics.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaMetricsQueryMetrics.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaMetricsQueryMetrics) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaMetricsQueryMetrics'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaMetricsQueryMetrics'", e);
      }

      // deserialize FormulaMetricsQueryCloudCost
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaMetricsQueryCloudCost.class.equals(Integer.class)
            || FormulaMetricsQueryCloudCost.class.equals(Long.class)
            || FormulaMetricsQueryCloudCost.class.equals(Float.class)
            || FormulaMetricsQueryCloudCost.class.equals(Double.class)
            || FormulaMetricsQueryCloudCost.class.equals(Boolean.class)
            || FormulaMetricsQueryCloudCost.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaMetricsQueryCloudCost.class.equals(Integer.class)
                        || FormulaMetricsQueryCloudCost.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaMetricsQueryCloudCost.class.equals(Float.class)
                        || FormulaMetricsQueryCloudCost.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaMetricsQueryCloudCost.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaMetricsQueryCloudCost.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaMetricsQueryCloudCost.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaMetricsQueryCloudCost) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaMetricsQueryCloudCost'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaMetricsQueryCloudCost'", e);
      }

      // deserialize FormulaMetricsQueryDatadogUsage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaMetricsQueryDatadogUsage.class.equals(Integer.class)
            || FormulaMetricsQueryDatadogUsage.class.equals(Long.class)
            || FormulaMetricsQueryDatadogUsage.class.equals(Float.class)
            || FormulaMetricsQueryDatadogUsage.class.equals(Double.class)
            || FormulaMetricsQueryDatadogUsage.class.equals(Boolean.class)
            || FormulaMetricsQueryDatadogUsage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaMetricsQueryDatadogUsage.class.equals(Integer.class)
                        || FormulaMetricsQueryDatadogUsage.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaMetricsQueryDatadogUsage.class.equals(Float.class)
                        || FormulaMetricsQueryDatadogUsage.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaMetricsQueryDatadogUsage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaMetricsQueryDatadogUsage.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaMetricsQueryDatadogUsage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaMetricsQueryDatadogUsage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaMetricsQueryDatadogUsage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'FormulaMetricsQueryDatadogUsage'", e);
      }

      // deserialize CompositeEventsPlatformQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CompositeEventsPlatformQueryDefinition.class.equals(Integer.class)
            || CompositeEventsPlatformQueryDefinition.class.equals(Long.class)
            || CompositeEventsPlatformQueryDefinition.class.equals(Float.class)
            || CompositeEventsPlatformQueryDefinition.class.equals(Double.class)
            || CompositeEventsPlatformQueryDefinition.class.equals(Boolean.class)
            || CompositeEventsPlatformQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CompositeEventsPlatformQueryDefinition.class.equals(Integer.class)
                        || CompositeEventsPlatformQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CompositeEventsPlatformQueryDefinition.class.equals(Float.class)
                        || CompositeEventsPlatformQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CompositeEventsPlatformQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CompositeEventsPlatformQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CompositeEventsPlatformQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CompositeEventsPlatformQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'CompositeEventsPlatformQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CompositeEventsPlatformQueryDefinition'",
            e);
      }

      CompositeSourceBaseQuery ret = new CompositeSourceBaseQuery();
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
    public CompositeSourceBaseQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CompositeSourceBaseQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CompositeSourceBaseQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public CompositeSourceBaseQuery(FormulaMetricsQueryMetrics o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CompositeSourceBaseQuery(FormulaMetricsQueryCloudCost o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CompositeSourceBaseQuery(FormulaMetricsQueryDatadogUsage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CompositeSourceBaseQuery(CompositeEventsPlatformQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FormulaMetricsQueryMetrics", new GenericType<FormulaMetricsQueryMetrics>() {});
    schemas.put("FormulaMetricsQueryCloudCost", new GenericType<FormulaMetricsQueryCloudCost>() {});
    schemas.put(
        "FormulaMetricsQueryDatadogUsage", new GenericType<FormulaMetricsQueryDatadogUsage>() {});
    schemas.put(
        "CompositeEventsPlatformQueryDefinition",
        new GenericType<CompositeEventsPlatformQueryDefinition>() {});
    JSON.registerDescendants(CompositeSourceBaseQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CompositeSourceBaseQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FormulaMetricsQueryMetrics, FormulaMetricsQueryCloudCost,
   * FormulaMetricsQueryDatadogUsage, CompositeEventsPlatformQueryDefinition
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(FormulaMetricsQueryMetrics.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaMetricsQueryCloudCost.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaMetricsQueryDatadogUsage.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CompositeEventsPlatformQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FormulaMetricsQueryMetrics, FormulaMetricsQueryCloudCost,"
            + " FormulaMetricsQueryDatadogUsage, CompositeEventsPlatformQueryDefinition");
  }

  /**
   * Get the actual instance, which can be the following: FormulaMetricsQueryMetrics,
   * FormulaMetricsQueryCloudCost, FormulaMetricsQueryDatadogUsage,
   * CompositeEventsPlatformQueryDefinition
   *
   * @return The actual instance (FormulaMetricsQueryMetrics, FormulaMetricsQueryCloudCost,
   *     FormulaMetricsQueryDatadogUsage, CompositeEventsPlatformQueryDefinition)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaMetricsQueryMetrics`. If the actual instance is not
   * `FormulaMetricsQueryMetrics`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaMetricsQueryMetrics`
   * @throws ClassCastException if the instance is not `FormulaMetricsQueryMetrics`
   */
  public FormulaMetricsQueryMetrics getFormulaMetricsQueryMetrics() throws ClassCastException {
    return (FormulaMetricsQueryMetrics) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaMetricsQueryCloudCost`. If the actual instance is not
   * `FormulaMetricsQueryCloudCost`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaMetricsQueryCloudCost`
   * @throws ClassCastException if the instance is not `FormulaMetricsQueryCloudCost`
   */
  public FormulaMetricsQueryCloudCost getFormulaMetricsQueryCloudCost() throws ClassCastException {
    return (FormulaMetricsQueryCloudCost) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaMetricsQueryDatadogUsage`. If the actual instance is not
   * `FormulaMetricsQueryDatadogUsage`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaMetricsQueryDatadogUsage`
   * @throws ClassCastException if the instance is not `FormulaMetricsQueryDatadogUsage`
   */
  public FormulaMetricsQueryDatadogUsage getFormulaMetricsQueryDatadogUsage()
      throws ClassCastException {
    return (FormulaMetricsQueryDatadogUsage) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CompositeEventsPlatformQueryDefinition`. If the actual instance is
   * not `CompositeEventsPlatformQueryDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CompositeEventsPlatformQueryDefinition`
   * @throws ClassCastException if the instance is not `CompositeEventsPlatformQueryDefinition`
   */
  public CompositeEventsPlatformQueryDefinition getCompositeEventsPlatformQueryDefinition()
      throws ClassCastException {
    return (CompositeEventsPlatformQueryDefinition) super.getActualInstance();
  }
}
