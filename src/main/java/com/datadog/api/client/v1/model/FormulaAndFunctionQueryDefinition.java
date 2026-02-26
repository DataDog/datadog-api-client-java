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
    using = FormulaAndFunctionQueryDefinition.FormulaAndFunctionQueryDefinitionDeserializer.class)
@JsonSerialize(
    using = FormulaAndFunctionQueryDefinition.FormulaAndFunctionQueryDefinitionSerializer.class)
public class FormulaAndFunctionQueryDefinition extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(FormulaAndFunctionQueryDefinition.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class FormulaAndFunctionQueryDefinitionSerializer
      extends StdSerializer<FormulaAndFunctionQueryDefinition> {
    public FormulaAndFunctionQueryDefinitionSerializer(Class<FormulaAndFunctionQueryDefinition> t) {
      super(t);
    }

    public FormulaAndFunctionQueryDefinitionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionQueryDefinition value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class FormulaAndFunctionQueryDefinitionDeserializer
      extends StdDeserializer<FormulaAndFunctionQueryDefinition> {
    public FormulaAndFunctionQueryDefinitionDeserializer() {
      this(FormulaAndFunctionQueryDefinition.class);
    }

    public FormulaAndFunctionQueryDefinitionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public FormulaAndFunctionQueryDefinition deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FormulaAndFunctionMetricQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionMetricQueryDefinition.class.equals(Integer.class)
            || FormulaAndFunctionMetricQueryDefinition.class.equals(Long.class)
            || FormulaAndFunctionMetricQueryDefinition.class.equals(Float.class)
            || FormulaAndFunctionMetricQueryDefinition.class.equals(Double.class)
            || FormulaAndFunctionMetricQueryDefinition.class.equals(Boolean.class)
            || FormulaAndFunctionMetricQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionMetricQueryDefinition.class.equals(Integer.class)
                        || FormulaAndFunctionMetricQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionMetricQueryDefinition.class.equals(Float.class)
                        || FormulaAndFunctionMetricQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionMetricQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionMetricQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(FormulaAndFunctionMetricQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionMetricQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'FormulaAndFunctionMetricQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaAndFunctionMetricQueryDefinition'",
            e);
      }

      // deserialize FormulaAndFunctionEventQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionEventQueryDefinition.class.equals(Integer.class)
            || FormulaAndFunctionEventQueryDefinition.class.equals(Long.class)
            || FormulaAndFunctionEventQueryDefinition.class.equals(Float.class)
            || FormulaAndFunctionEventQueryDefinition.class.equals(Double.class)
            || FormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class)
            || FormulaAndFunctionEventQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionEventQueryDefinition.class.equals(Integer.class)
                        || FormulaAndFunctionEventQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionEventQueryDefinition.class.equals(Float.class)
                        || FormulaAndFunctionEventQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionEventQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(FormulaAndFunctionEventQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionEventQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'FormulaAndFunctionEventQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaAndFunctionEventQueryDefinition'",
            e);
      }

      // deserialize FormulaAndFunctionProcessQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionProcessQueryDefinition.class.equals(Integer.class)
            || FormulaAndFunctionProcessQueryDefinition.class.equals(Long.class)
            || FormulaAndFunctionProcessQueryDefinition.class.equals(Float.class)
            || FormulaAndFunctionProcessQueryDefinition.class.equals(Double.class)
            || FormulaAndFunctionProcessQueryDefinition.class.equals(Boolean.class)
            || FormulaAndFunctionProcessQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionProcessQueryDefinition.class.equals(Integer.class)
                        || FormulaAndFunctionProcessQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionProcessQueryDefinition.class.equals(Float.class)
                        || FormulaAndFunctionProcessQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionProcessQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionProcessQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(FormulaAndFunctionProcessQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionProcessQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'FormulaAndFunctionProcessQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaAndFunctionProcessQueryDefinition'",
            e);
      }

      // deserialize FormulaAndFunctionApmDependencyStatsQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Integer.class)
            || FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Long.class)
            || FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Float.class)
            || FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Double.class)
            || FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Boolean.class)
            || FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Integer.class)
                        || FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Float.class)
                        || FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionApmDependencyStatsQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(FormulaAndFunctionApmDependencyStatsQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionApmDependencyStatsQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'FormulaAndFunctionApmDependencyStatsQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'FormulaAndFunctionApmDependencyStatsQueryDefinition'",
            e);
      }

      // deserialize FormulaAndFunctionApmResourceStatsQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Integer.class)
            || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Long.class)
            || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Float.class)
            || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Double.class)
            || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Boolean.class)
            || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Integer.class)
                        || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Float.class)
                        || FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionApmResourceStatsQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(FormulaAndFunctionApmResourceStatsQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionApmResourceStatsQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'FormulaAndFunctionApmResourceStatsQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaAndFunctionApmResourceStatsQueryDefinition'",
            e);
      }

      // deserialize FormulaAndFunctionSLOQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionSLOQueryDefinition.class.equals(Integer.class)
            || FormulaAndFunctionSLOQueryDefinition.class.equals(Long.class)
            || FormulaAndFunctionSLOQueryDefinition.class.equals(Float.class)
            || FormulaAndFunctionSLOQueryDefinition.class.equals(Double.class)
            || FormulaAndFunctionSLOQueryDefinition.class.equals(Boolean.class)
            || FormulaAndFunctionSLOQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionSLOQueryDefinition.class.equals(Integer.class)
                        || FormulaAndFunctionSLOQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionSLOQueryDefinition.class.equals(Float.class)
                        || FormulaAndFunctionSLOQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionSLOQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionSLOQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(FormulaAndFunctionSLOQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionSLOQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaAndFunctionSLOQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaAndFunctionSLOQueryDefinition'",
            e);
      }

      // deserialize FormulaAndFunctionCloudCostQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionCloudCostQueryDefinition.class.equals(Integer.class)
            || FormulaAndFunctionCloudCostQueryDefinition.class.equals(Long.class)
            || FormulaAndFunctionCloudCostQueryDefinition.class.equals(Float.class)
            || FormulaAndFunctionCloudCostQueryDefinition.class.equals(Double.class)
            || FormulaAndFunctionCloudCostQueryDefinition.class.equals(Boolean.class)
            || FormulaAndFunctionCloudCostQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionCloudCostQueryDefinition.class.equals(Integer.class)
                        || FormulaAndFunctionCloudCostQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionCloudCostQueryDefinition.class.equals(Float.class)
                        || FormulaAndFunctionCloudCostQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionCloudCostQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionCloudCostQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(FormulaAndFunctionCloudCostQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionCloudCostQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'FormulaAndFunctionCloudCostQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaAndFunctionCloudCostQueryDefinition'",
            e);
      }

      FormulaAndFunctionQueryDefinition ret = new FormulaAndFunctionQueryDefinition();
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
    public FormulaAndFunctionQueryDefinition getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "FormulaAndFunctionQueryDefinition cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public FormulaAndFunctionQueryDefinition() {
    super("oneOf", Boolean.FALSE);
  }

  public FormulaAndFunctionQueryDefinition(FormulaAndFunctionMetricQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaAndFunctionEventQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaAndFunctionProcessQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaAndFunctionApmDependencyStatsQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaAndFunctionApmResourceStatsQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaAndFunctionSLOQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaAndFunctionCloudCostQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "FormulaAndFunctionMetricQueryDefinition",
        new GenericType<FormulaAndFunctionMetricQueryDefinition>() {});
    schemas.put(
        "FormulaAndFunctionEventQueryDefinition",
        new GenericType<FormulaAndFunctionEventQueryDefinition>() {});
    schemas.put(
        "FormulaAndFunctionProcessQueryDefinition",
        new GenericType<FormulaAndFunctionProcessQueryDefinition>() {});
    schemas.put(
        "FormulaAndFunctionApmDependencyStatsQueryDefinition",
        new GenericType<FormulaAndFunctionApmDependencyStatsQueryDefinition>() {});
    schemas.put(
        "FormulaAndFunctionApmResourceStatsQueryDefinition",
        new GenericType<FormulaAndFunctionApmResourceStatsQueryDefinition>() {});
    schemas.put(
        "FormulaAndFunctionSLOQueryDefinition",
        new GenericType<FormulaAndFunctionSLOQueryDefinition>() {});
    schemas.put(
        "FormulaAndFunctionCloudCostQueryDefinition",
        new GenericType<FormulaAndFunctionCloudCostQueryDefinition>() {});
    JSON.registerDescendants(
        FormulaAndFunctionQueryDefinition.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return FormulaAndFunctionQueryDefinition.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FormulaAndFunctionMetricQueryDefinition,
   * FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionProcessQueryDefinition,
   * FormulaAndFunctionApmDependencyStatsQueryDefinition,
   * FormulaAndFunctionApmResourceStatsQueryDefinition, FormulaAndFunctionSLOQueryDefinition,
   * FormulaAndFunctionCloudCostQueryDefinition
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        FormulaAndFunctionMetricQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaAndFunctionEventQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaAndFunctionProcessQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaAndFunctionApmDependencyStatsQueryDefinition.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaAndFunctionApmResourceStatsQueryDefinition.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaAndFunctionSLOQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaAndFunctionCloudCostQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FormulaAndFunctionMetricQueryDefinition,"
            + " FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionProcessQueryDefinition,"
            + " FormulaAndFunctionApmDependencyStatsQueryDefinition,"
            + " FormulaAndFunctionApmResourceStatsQueryDefinition,"
            + " FormulaAndFunctionSLOQueryDefinition, FormulaAndFunctionCloudCostQueryDefinition");
  }

  /**
   * Get the actual instance, which can be the following: FormulaAndFunctionMetricQueryDefinition,
   * FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionProcessQueryDefinition,
   * FormulaAndFunctionApmDependencyStatsQueryDefinition,
   * FormulaAndFunctionApmResourceStatsQueryDefinition, FormulaAndFunctionSLOQueryDefinition,
   * FormulaAndFunctionCloudCostQueryDefinition
   *
   * @return The actual instance (FormulaAndFunctionMetricQueryDefinition,
   *     FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionProcessQueryDefinition,
   *     FormulaAndFunctionApmDependencyStatsQueryDefinition,
   *     FormulaAndFunctionApmResourceStatsQueryDefinition, FormulaAndFunctionSLOQueryDefinition,
   *     FormulaAndFunctionCloudCostQueryDefinition)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionMetricQueryDefinition`. If the actual instance is
   * not `FormulaAndFunctionMetricQueryDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionMetricQueryDefinition`
   * @throws ClassCastException if the instance is not `FormulaAndFunctionMetricQueryDefinition`
   */
  public FormulaAndFunctionMetricQueryDefinition getFormulaAndFunctionMetricQueryDefinition()
      throws ClassCastException {
    return (FormulaAndFunctionMetricQueryDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionEventQueryDefinition`. If the actual instance is
   * not `FormulaAndFunctionEventQueryDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionEventQueryDefinition`
   * @throws ClassCastException if the instance is not `FormulaAndFunctionEventQueryDefinition`
   */
  public FormulaAndFunctionEventQueryDefinition getFormulaAndFunctionEventQueryDefinition()
      throws ClassCastException {
    return (FormulaAndFunctionEventQueryDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionProcessQueryDefinition`. If the actual instance
   * is not `FormulaAndFunctionProcessQueryDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionProcessQueryDefinition`
   * @throws ClassCastException if the instance is not `FormulaAndFunctionProcessQueryDefinition`
   */
  public FormulaAndFunctionProcessQueryDefinition getFormulaAndFunctionProcessQueryDefinition()
      throws ClassCastException {
    return (FormulaAndFunctionProcessQueryDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionApmDependencyStatsQueryDefinition`. If the actual
   * instance is not `FormulaAndFunctionApmDependencyStatsQueryDefinition`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionApmDependencyStatsQueryDefinition`
   * @throws ClassCastException if the instance is not
   *     `FormulaAndFunctionApmDependencyStatsQueryDefinition`
   */
  public FormulaAndFunctionApmDependencyStatsQueryDefinition
      getFormulaAndFunctionApmDependencyStatsQueryDefinition() throws ClassCastException {
    return (FormulaAndFunctionApmDependencyStatsQueryDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionApmResourceStatsQueryDefinition`. If the actual
   * instance is not `FormulaAndFunctionApmResourceStatsQueryDefinition`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionApmResourceStatsQueryDefinition`
   * @throws ClassCastException if the instance is not
   *     `FormulaAndFunctionApmResourceStatsQueryDefinition`
   */
  public FormulaAndFunctionApmResourceStatsQueryDefinition
      getFormulaAndFunctionApmResourceStatsQueryDefinition() throws ClassCastException {
    return (FormulaAndFunctionApmResourceStatsQueryDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionSLOQueryDefinition`. If the actual instance is
   * not `FormulaAndFunctionSLOQueryDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionSLOQueryDefinition`
   * @throws ClassCastException if the instance is not `FormulaAndFunctionSLOQueryDefinition`
   */
  public FormulaAndFunctionSLOQueryDefinition getFormulaAndFunctionSLOQueryDefinition()
      throws ClassCastException {
    return (FormulaAndFunctionSLOQueryDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionCloudCostQueryDefinition`. If the actual instance
   * is not `FormulaAndFunctionCloudCostQueryDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionCloudCostQueryDefinition`
   * @throws ClassCastException if the instance is not `FormulaAndFunctionCloudCostQueryDefinition`
   */
  public FormulaAndFunctionCloudCostQueryDefinition getFormulaAndFunctionCloudCostQueryDefinition()
      throws ClassCastException {
    return (FormulaAndFunctionCloudCostQueryDefinition) super.getActualInstance();
  }
}
