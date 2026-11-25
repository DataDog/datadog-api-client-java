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

      // deserialize FormulaApmMetricsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaApmMetricsQuery.class.equals(Integer.class)
            || FormulaApmMetricsQuery.class.equals(Long.class)
            || FormulaApmMetricsQuery.class.equals(Float.class)
            || FormulaApmMetricsQuery.class.equals(Double.class)
            || FormulaApmMetricsQuery.class.equals(Boolean.class)
            || FormulaApmMetricsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaApmMetricsQuery.class.equals(Integer.class)
                        || FormulaApmMetricsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaApmMetricsQuery.class.equals(Float.class)
                        || FormulaApmMetricsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaApmMetricsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaApmMetricsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaApmMetricsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaApmMetricsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaApmMetricsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaApmMetricsQuery'", e);
      }

      // deserialize FormulaIncidentsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaIncidentsQuery.class.equals(Integer.class)
            || FormulaIncidentsQuery.class.equals(Long.class)
            || FormulaIncidentsQuery.class.equals(Float.class)
            || FormulaIncidentsQuery.class.equals(Double.class)
            || FormulaIncidentsQuery.class.equals(Boolean.class)
            || FormulaIncidentsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaIncidentsQuery.class.equals(Integer.class)
                        || FormulaIncidentsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaIncidentsQuery.class.equals(Float.class)
                        || FormulaIncidentsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaIncidentsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaIncidentsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaIncidentsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaIncidentsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaIncidentsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaIncidentsQuery'", e);
      }

      // deserialize FormulaSloQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaSloQuery.class.equals(Integer.class)
            || FormulaSloQuery.class.equals(Long.class)
            || FormulaSloQuery.class.equals(Float.class)
            || FormulaSloQuery.class.equals(Double.class)
            || FormulaSloQuery.class.equals(Boolean.class)
            || FormulaSloQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaSloQuery.class.equals(Integer.class)
                        || FormulaSloQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaSloQuery.class.equals(Float.class)
                        || FormulaSloQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaSloQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaSloQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaSloQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaSloQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaSloQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaSloQuery'", e);
      }

      // deserialize FormulaCaseQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaCaseQuery.class.equals(Integer.class)
            || FormulaCaseQuery.class.equals(Long.class)
            || FormulaCaseQuery.class.equals(Float.class)
            || FormulaCaseQuery.class.equals(Double.class)
            || FormulaCaseQuery.class.equals(Boolean.class)
            || FormulaCaseQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaCaseQuery.class.equals(Integer.class)
                        || FormulaCaseQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaCaseQuery.class.equals(Float.class)
                        || FormulaCaseQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaCaseQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaCaseQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaCaseQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaCaseQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaCaseQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaCaseQuery'", e);
      }

      // deserialize FormulaGraphQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaGraphQuery.class.equals(Integer.class)
            || FormulaGraphQuery.class.equals(Long.class)
            || FormulaGraphQuery.class.equals(Float.class)
            || FormulaGraphQuery.class.equals(Double.class)
            || FormulaGraphQuery.class.equals(Boolean.class)
            || FormulaGraphQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaGraphQuery.class.equals(Integer.class)
                        || FormulaGraphQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaGraphQuery.class.equals(Float.class)
                        || FormulaGraphQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaGraphQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaGraphQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaGraphQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaGraphQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaGraphQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaGraphQuery'", e);
      }

      // deserialize FormulaUserJourneyQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaUserJourneyQuery.class.equals(Integer.class)
            || FormulaUserJourneyQuery.class.equals(Long.class)
            || FormulaUserJourneyQuery.class.equals(Float.class)
            || FormulaUserJourneyQuery.class.equals(Double.class)
            || FormulaUserJourneyQuery.class.equals(Boolean.class)
            || FormulaUserJourneyQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaUserJourneyQuery.class.equals(Integer.class)
                        || FormulaUserJourneyQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaUserJourneyQuery.class.equals(Float.class)
                        || FormulaUserJourneyQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaUserJourneyQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaUserJourneyQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaUserJourneyQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaUserJourneyQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaUserJourneyQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaUserJourneyQuery'", e);
      }

      // deserialize FormulaDoraQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaDoraQuery.class.equals(Integer.class)
            || FormulaDoraQuery.class.equals(Long.class)
            || FormulaDoraQuery.class.equals(Float.class)
            || FormulaDoraQuery.class.equals(Double.class)
            || FormulaDoraQuery.class.equals(Boolean.class)
            || FormulaDoraQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaDoraQuery.class.equals(Integer.class)
                        || FormulaDoraQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaDoraQuery.class.equals(Float.class)
                        || FormulaDoraQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaDoraQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaDoraQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaDoraQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaDoraQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaDoraQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaDoraQuery'", e);
      }

      // deserialize FormulaChangeTrackingQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaChangeTrackingQuery.class.equals(Integer.class)
            || FormulaChangeTrackingQuery.class.equals(Long.class)
            || FormulaChangeTrackingQuery.class.equals(Float.class)
            || FormulaChangeTrackingQuery.class.equals(Double.class)
            || FormulaChangeTrackingQuery.class.equals(Boolean.class)
            || FormulaChangeTrackingQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaChangeTrackingQuery.class.equals(Integer.class)
                        || FormulaChangeTrackingQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaChangeTrackingQuery.class.equals(Float.class)
                        || FormulaChangeTrackingQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaChangeTrackingQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaChangeTrackingQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaChangeTrackingQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaChangeTrackingQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaChangeTrackingQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaChangeTrackingQuery'", e);
      }

      // deserialize FormulaDetectionRulesQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaDetectionRulesQuery.class.equals(Integer.class)
            || FormulaDetectionRulesQuery.class.equals(Long.class)
            || FormulaDetectionRulesQuery.class.equals(Float.class)
            || FormulaDetectionRulesQuery.class.equals(Double.class)
            || FormulaDetectionRulesQuery.class.equals(Boolean.class)
            || FormulaDetectionRulesQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaDetectionRulesQuery.class.equals(Integer.class)
                        || FormulaDetectionRulesQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaDetectionRulesQuery.class.equals(Float.class)
                        || FormulaDetectionRulesQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaDetectionRulesQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaDetectionRulesQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaDetectionRulesQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaDetectionRulesQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaDetectionRulesQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaDetectionRulesQuery'", e);
      }

      // deserialize AggregateFilteredQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AggregateFilteredQuery.class.equals(Integer.class)
            || AggregateFilteredQuery.class.equals(Long.class)
            || AggregateFilteredQuery.class.equals(Float.class)
            || AggregateFilteredQuery.class.equals(Double.class)
            || AggregateFilteredQuery.class.equals(Boolean.class)
            || AggregateFilteredQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AggregateFilteredQuery.class.equals(Integer.class)
                        || AggregateFilteredQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AggregateFilteredQuery.class.equals(Float.class)
                        || AggregateFilteredQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AggregateFilteredQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AggregateFilteredQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AggregateFilteredQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AggregateFilteredQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AggregateFilteredQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AggregateFilteredQuery'", e);
      }

      // deserialize AggregateAugmentedQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AggregateAugmentedQuery.class.equals(Integer.class)
            || AggregateAugmentedQuery.class.equals(Long.class)
            || AggregateAugmentedQuery.class.equals(Float.class)
            || AggregateAugmentedQuery.class.equals(Double.class)
            || AggregateAugmentedQuery.class.equals(Boolean.class)
            || AggregateAugmentedQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AggregateAugmentedQuery.class.equals(Integer.class)
                        || AggregateAugmentedQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AggregateAugmentedQuery.class.equals(Float.class)
                        || AggregateAugmentedQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AggregateAugmentedQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AggregateAugmentedQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AggregateAugmentedQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AggregateAugmentedQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AggregateAugmentedQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AggregateAugmentedQuery'", e);
      }

      // deserialize AggregateSegmentQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AggregateSegmentQuery.class.equals(Integer.class)
            || AggregateSegmentQuery.class.equals(Long.class)
            || AggregateSegmentQuery.class.equals(Float.class)
            || AggregateSegmentQuery.class.equals(Double.class)
            || AggregateSegmentQuery.class.equals(Boolean.class)
            || AggregateSegmentQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AggregateSegmentQuery.class.equals(Integer.class)
                        || AggregateSegmentQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AggregateSegmentQuery.class.equals(Float.class)
                        || AggregateSegmentQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AggregateSegmentQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AggregateSegmentQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AggregateSegmentQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AggregateSegmentQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AggregateSegmentQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AggregateSegmentQuery'", e);
      }

      // deserialize FormulaDatasetQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaDatasetQuery.class.equals(Integer.class)
            || FormulaDatasetQuery.class.equals(Long.class)
            || FormulaDatasetQuery.class.equals(Float.class)
            || FormulaDatasetQuery.class.equals(Double.class)
            || FormulaDatasetQuery.class.equals(Boolean.class)
            || FormulaDatasetQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaDatasetQuery.class.equals(Integer.class)
                        || FormulaDatasetQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaDatasetQuery.class.equals(Float.class)
                        || FormulaDatasetQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaDatasetQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaDatasetQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaDatasetQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaDatasetQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaDatasetQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaDatasetQuery'", e);
      }

      // deserialize FormulaManagedResourceQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaManagedResourceQuery.class.equals(Integer.class)
            || FormulaManagedResourceQuery.class.equals(Long.class)
            || FormulaManagedResourceQuery.class.equals(Float.class)
            || FormulaManagedResourceQuery.class.equals(Double.class)
            || FormulaManagedResourceQuery.class.equals(Boolean.class)
            || FormulaManagedResourceQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaManagedResourceQuery.class.equals(Integer.class)
                        || FormulaManagedResourceQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaManagedResourceQuery.class.equals(Float.class)
                        || FormulaManagedResourceQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaManagedResourceQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaManagedResourceQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaManagedResourceQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaManagedResourceQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaManagedResourceQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaManagedResourceQuery'", e);
      }

      // deserialize FormulaReferenceTableQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaReferenceTableQuery.class.equals(Integer.class)
            || FormulaReferenceTableQuery.class.equals(Long.class)
            || FormulaReferenceTableQuery.class.equals(Float.class)
            || FormulaReferenceTableQuery.class.equals(Double.class)
            || FormulaReferenceTableQuery.class.equals(Boolean.class)
            || FormulaReferenceTableQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaReferenceTableQuery.class.equals(Integer.class)
                        || FormulaReferenceTableQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaReferenceTableQuery.class.equals(Float.class)
                        || FormulaReferenceTableQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaReferenceTableQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaReferenceTableQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaReferenceTableQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaReferenceTableQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaReferenceTableQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaReferenceTableQuery'", e);
      }

      // deserialize FormulaRetentionQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaRetentionQuery.class.equals(Integer.class)
            || FormulaRetentionQuery.class.equals(Long.class)
            || FormulaRetentionQuery.class.equals(Float.class)
            || FormulaRetentionQuery.class.equals(Double.class)
            || FormulaRetentionQuery.class.equals(Boolean.class)
            || FormulaRetentionQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaRetentionQuery.class.equals(Integer.class)
                        || FormulaRetentionQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaRetentionQuery.class.equals(Float.class)
                        || FormulaRetentionQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaRetentionQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaRetentionQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaRetentionQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaRetentionQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaRetentionQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaRetentionQuery'", e);
      }

      // deserialize FormulaDataQualityMetricsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaDataQualityMetricsQuery.class.equals(Integer.class)
            || FormulaDataQualityMetricsQuery.class.equals(Long.class)
            || FormulaDataQualityMetricsQuery.class.equals(Float.class)
            || FormulaDataQualityMetricsQuery.class.equals(Double.class)
            || FormulaDataQualityMetricsQuery.class.equals(Boolean.class)
            || FormulaDataQualityMetricsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaDataQualityMetricsQuery.class.equals(Integer.class)
                        || FormulaDataQualityMetricsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaDataQualityMetricsQuery.class.equals(Float.class)
                        || FormulaDataQualityMetricsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaDataQualityMetricsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaDataQualityMetricsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaDataQualityMetricsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaDataQualityMetricsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaDataQualityMetricsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'FormulaDataQualityMetricsQuery'", e);
      }

      // deserialize FormulaProductAnalyticsExtendedQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaProductAnalyticsExtendedQuery.class.equals(Integer.class)
            || FormulaProductAnalyticsExtendedQuery.class.equals(Long.class)
            || FormulaProductAnalyticsExtendedQuery.class.equals(Float.class)
            || FormulaProductAnalyticsExtendedQuery.class.equals(Double.class)
            || FormulaProductAnalyticsExtendedQuery.class.equals(Boolean.class)
            || FormulaProductAnalyticsExtendedQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaProductAnalyticsExtendedQuery.class.equals(Integer.class)
                        || FormulaProductAnalyticsExtendedQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaProductAnalyticsExtendedQuery.class.equals(Float.class)
                        || FormulaProductAnalyticsExtendedQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaProductAnalyticsExtendedQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaProductAnalyticsExtendedQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(FormulaProductAnalyticsExtendedQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaProductAnalyticsExtendedQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaProductAnalyticsExtendedQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaProductAnalyticsExtendedQuery'",
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

  public FormulaAndFunctionQueryDefinition(FormulaMetricsQueryMetrics o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaMetricsQueryCloudCost o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaMetricsQueryDatadogUsage o) {
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

  public FormulaAndFunctionQueryDefinition(FormulaApmDependencyStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaApmResourceStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaApmMetricsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaIncidentsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaSloQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaCaseQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaGraphQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaUserJourneyQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaDoraQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaChangeTrackingQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaDetectionRulesQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(AggregateFilteredQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(AggregateAugmentedQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(AggregateSegmentQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaDatasetQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaManagedResourceQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaReferenceTableQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaRetentionQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaDataQualityMetricsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaAndFunctionQueryDefinition(FormulaProductAnalyticsExtendedQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FormulaMetricsQueryMetrics", new GenericType<FormulaMetricsQueryMetrics>() {});
    schemas.put("FormulaMetricsQueryCloudCost", new GenericType<FormulaMetricsQueryCloudCost>() {});
    schemas.put(
        "FormulaMetricsQueryDatadogUsage", new GenericType<FormulaMetricsQueryDatadogUsage>() {});
    schemas.put(
        "FormulaAndFunctionEventQueryDefinition",
        new GenericType<FormulaAndFunctionEventQueryDefinition>() {});
    schemas.put(
        "FormulaAndFunctionProcessQueryDefinition",
        new GenericType<FormulaAndFunctionProcessQueryDefinition>() {});
    schemas.put(
        "FormulaApmDependencyStatsQuery", new GenericType<FormulaApmDependencyStatsQuery>() {});
    schemas.put("FormulaApmResourceStatsQuery", new GenericType<FormulaApmResourceStatsQuery>() {});
    schemas.put("FormulaApmMetricsQuery", new GenericType<FormulaApmMetricsQuery>() {});
    schemas.put("FormulaIncidentsQuery", new GenericType<FormulaIncidentsQuery>() {});
    schemas.put("FormulaSloQuery", new GenericType<FormulaSloQuery>() {});
    schemas.put("FormulaCaseQuery", new GenericType<FormulaCaseQuery>() {});
    schemas.put("FormulaGraphQuery", new GenericType<FormulaGraphQuery>() {});
    schemas.put("FormulaUserJourneyQuery", new GenericType<FormulaUserJourneyQuery>() {});
    schemas.put("FormulaDoraQuery", new GenericType<FormulaDoraQuery>() {});
    schemas.put("FormulaChangeTrackingQuery", new GenericType<FormulaChangeTrackingQuery>() {});
    schemas.put("FormulaDetectionRulesQuery", new GenericType<FormulaDetectionRulesQuery>() {});
    schemas.put("AggregateFilteredQuery", new GenericType<AggregateFilteredQuery>() {});
    schemas.put("AggregateAugmentedQuery", new GenericType<AggregateAugmentedQuery>() {});
    schemas.put("AggregateSegmentQuery", new GenericType<AggregateSegmentQuery>() {});
    schemas.put("FormulaDatasetQuery", new GenericType<FormulaDatasetQuery>() {});
    schemas.put("FormulaManagedResourceQuery", new GenericType<FormulaManagedResourceQuery>() {});
    schemas.put("FormulaReferenceTableQuery", new GenericType<FormulaReferenceTableQuery>() {});
    schemas.put("FormulaRetentionQuery", new GenericType<FormulaRetentionQuery>() {});
    schemas.put(
        "FormulaDataQualityMetricsQuery", new GenericType<FormulaDataQualityMetricsQuery>() {});
    schemas.put(
        "FormulaProductAnalyticsExtendedQuery",
        new GenericType<FormulaProductAnalyticsExtendedQuery>() {});
    JSON.registerDescendants(
        FormulaAndFunctionQueryDefinition.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return FormulaAndFunctionQueryDefinition.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FormulaMetricsQueryMetrics, FormulaMetricsQueryCloudCost,
   * FormulaMetricsQueryDatadogUsage, FormulaAndFunctionEventQueryDefinition,
   * FormulaAndFunctionProcessQueryDefinition, FormulaApmDependencyStatsQuery,
   * FormulaApmResourceStatsQuery, FormulaApmMetricsQuery, FormulaIncidentsQuery, FormulaSloQuery,
   * FormulaCaseQuery, FormulaGraphQuery, FormulaUserJourneyQuery, FormulaDoraQuery,
   * FormulaChangeTrackingQuery, FormulaDetectionRulesQuery, AggregateFilteredQuery,
   * AggregateAugmentedQuery, AggregateSegmentQuery, FormulaDatasetQuery,
   * FormulaManagedResourceQuery, FormulaReferenceTableQuery, FormulaRetentionQuery,
   * FormulaDataQualityMetricsQuery, FormulaProductAnalyticsExtendedQuery
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
        FormulaApmDependencyStatsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaApmResourceStatsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaApmMetricsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaIncidentsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaSloQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaCaseQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaGraphQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaUserJourneyQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaDoraQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaChangeTrackingQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaDetectionRulesQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AggregateFilteredQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AggregateAugmentedQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AggregateSegmentQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaDatasetQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaManagedResourceQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaReferenceTableQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaRetentionQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaDataQualityMetricsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaProductAnalyticsExtendedQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FormulaMetricsQueryMetrics, FormulaMetricsQueryCloudCost,"
            + " FormulaMetricsQueryDatadogUsage, FormulaAndFunctionEventQueryDefinition,"
            + " FormulaAndFunctionProcessQueryDefinition, FormulaApmDependencyStatsQuery,"
            + " FormulaApmResourceStatsQuery, FormulaApmMetricsQuery, FormulaIncidentsQuery,"
            + " FormulaSloQuery, FormulaCaseQuery, FormulaGraphQuery, FormulaUserJourneyQuery,"
            + " FormulaDoraQuery, FormulaChangeTrackingQuery, FormulaDetectionRulesQuery,"
            + " AggregateFilteredQuery, AggregateAugmentedQuery, AggregateSegmentQuery,"
            + " FormulaDatasetQuery, FormulaManagedResourceQuery, FormulaReferenceTableQuery,"
            + " FormulaRetentionQuery, FormulaDataQualityMetricsQuery,"
            + " FormulaProductAnalyticsExtendedQuery");
  }

  /**
   * Get the actual instance, which can be the following: FormulaMetricsQueryMetrics,
   * FormulaMetricsQueryCloudCost, FormulaMetricsQueryDatadogUsage,
   * FormulaAndFunctionEventQueryDefinition, FormulaAndFunctionProcessQueryDefinition,
   * FormulaApmDependencyStatsQuery, FormulaApmResourceStatsQuery, FormulaApmMetricsQuery,
   * FormulaIncidentsQuery, FormulaSloQuery, FormulaCaseQuery, FormulaGraphQuery,
   * FormulaUserJourneyQuery, FormulaDoraQuery, FormulaChangeTrackingQuery,
   * FormulaDetectionRulesQuery, AggregateFilteredQuery, AggregateAugmentedQuery,
   * AggregateSegmentQuery, FormulaDatasetQuery, FormulaManagedResourceQuery,
   * FormulaReferenceTableQuery, FormulaRetentionQuery, FormulaDataQualityMetricsQuery,
   * FormulaProductAnalyticsExtendedQuery
   *
   * @return The actual instance (FormulaMetricsQueryMetrics, FormulaMetricsQueryCloudCost,
   *     FormulaMetricsQueryDatadogUsage, FormulaAndFunctionEventQueryDefinition,
   *     FormulaAndFunctionProcessQueryDefinition, FormulaApmDependencyStatsQuery,
   *     FormulaApmResourceStatsQuery, FormulaApmMetricsQuery, FormulaIncidentsQuery,
   *     FormulaSloQuery, FormulaCaseQuery, FormulaGraphQuery, FormulaUserJourneyQuery,
   *     FormulaDoraQuery, FormulaChangeTrackingQuery, FormulaDetectionRulesQuery,
   *     AggregateFilteredQuery, AggregateAugmentedQuery, AggregateSegmentQuery,
   *     FormulaDatasetQuery, FormulaManagedResourceQuery, FormulaReferenceTableQuery,
   *     FormulaRetentionQuery, FormulaDataQualityMetricsQuery,
   *     FormulaProductAnalyticsExtendedQuery)
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

  /**
   * Get the actual instance of `FormulaApmMetricsQuery`. If the actual instance is not
   * `FormulaApmMetricsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaApmMetricsQuery`
   * @throws ClassCastException if the instance is not `FormulaApmMetricsQuery`
   */
  public FormulaApmMetricsQuery getFormulaApmMetricsQuery() throws ClassCastException {
    return (FormulaApmMetricsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaIncidentsQuery`. If the actual instance is not
   * `FormulaIncidentsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaIncidentsQuery`
   * @throws ClassCastException if the instance is not `FormulaIncidentsQuery`
   */
  public FormulaIncidentsQuery getFormulaIncidentsQuery() throws ClassCastException {
    return (FormulaIncidentsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaSloQuery`. If the actual instance is not `FormulaSloQuery`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaSloQuery`
   * @throws ClassCastException if the instance is not `FormulaSloQuery`
   */
  public FormulaSloQuery getFormulaSloQuery() throws ClassCastException {
    return (FormulaSloQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaCaseQuery`. If the actual instance is not
   * `FormulaCaseQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaCaseQuery`
   * @throws ClassCastException if the instance is not `FormulaCaseQuery`
   */
  public FormulaCaseQuery getFormulaCaseQuery() throws ClassCastException {
    return (FormulaCaseQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaGraphQuery`. If the actual instance is not
   * `FormulaGraphQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaGraphQuery`
   * @throws ClassCastException if the instance is not `FormulaGraphQuery`
   */
  public FormulaGraphQuery getFormulaGraphQuery() throws ClassCastException {
    return (FormulaGraphQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaUserJourneyQuery`. If the actual instance is not
   * `FormulaUserJourneyQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaUserJourneyQuery`
   * @throws ClassCastException if the instance is not `FormulaUserJourneyQuery`
   */
  public FormulaUserJourneyQuery getFormulaUserJourneyQuery() throws ClassCastException {
    return (FormulaUserJourneyQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaDoraQuery`. If the actual instance is not
   * `FormulaDoraQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaDoraQuery`
   * @throws ClassCastException if the instance is not `FormulaDoraQuery`
   */
  public FormulaDoraQuery getFormulaDoraQuery() throws ClassCastException {
    return (FormulaDoraQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaChangeTrackingQuery`. If the actual instance is not
   * `FormulaChangeTrackingQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaChangeTrackingQuery`
   * @throws ClassCastException if the instance is not `FormulaChangeTrackingQuery`
   */
  public FormulaChangeTrackingQuery getFormulaChangeTrackingQuery() throws ClassCastException {
    return (FormulaChangeTrackingQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaDetectionRulesQuery`. If the actual instance is not
   * `FormulaDetectionRulesQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaDetectionRulesQuery`
   * @throws ClassCastException if the instance is not `FormulaDetectionRulesQuery`
   */
  public FormulaDetectionRulesQuery getFormulaDetectionRulesQuery() throws ClassCastException {
    return (FormulaDetectionRulesQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AggregateFilteredQuery`. If the actual instance is not
   * `AggregateFilteredQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AggregateFilteredQuery`
   * @throws ClassCastException if the instance is not `AggregateFilteredQuery`
   */
  public AggregateFilteredQuery getAggregateFilteredQuery() throws ClassCastException {
    return (AggregateFilteredQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AggregateAugmentedQuery`. If the actual instance is not
   * `AggregateAugmentedQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AggregateAugmentedQuery`
   * @throws ClassCastException if the instance is not `AggregateAugmentedQuery`
   */
  public AggregateAugmentedQuery getAggregateAugmentedQuery() throws ClassCastException {
    return (AggregateAugmentedQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AggregateSegmentQuery`. If the actual instance is not
   * `AggregateSegmentQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AggregateSegmentQuery`
   * @throws ClassCastException if the instance is not `AggregateSegmentQuery`
   */
  public AggregateSegmentQuery getAggregateSegmentQuery() throws ClassCastException {
    return (AggregateSegmentQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaDatasetQuery`. If the actual instance is not
   * `FormulaDatasetQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaDatasetQuery`
   * @throws ClassCastException if the instance is not `FormulaDatasetQuery`
   */
  public FormulaDatasetQuery getFormulaDatasetQuery() throws ClassCastException {
    return (FormulaDatasetQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaManagedResourceQuery`. If the actual instance is not
   * `FormulaManagedResourceQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaManagedResourceQuery`
   * @throws ClassCastException if the instance is not `FormulaManagedResourceQuery`
   */
  public FormulaManagedResourceQuery getFormulaManagedResourceQuery() throws ClassCastException {
    return (FormulaManagedResourceQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaReferenceTableQuery`. If the actual instance is not
   * `FormulaReferenceTableQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaReferenceTableQuery`
   * @throws ClassCastException if the instance is not `FormulaReferenceTableQuery`
   */
  public FormulaReferenceTableQuery getFormulaReferenceTableQuery() throws ClassCastException {
    return (FormulaReferenceTableQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaRetentionQuery`. If the actual instance is not
   * `FormulaRetentionQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaRetentionQuery`
   * @throws ClassCastException if the instance is not `FormulaRetentionQuery`
   */
  public FormulaRetentionQuery getFormulaRetentionQuery() throws ClassCastException {
    return (FormulaRetentionQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaDataQualityMetricsQuery`. If the actual instance is not
   * `FormulaDataQualityMetricsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaDataQualityMetricsQuery`
   * @throws ClassCastException if the instance is not `FormulaDataQualityMetricsQuery`
   */
  public FormulaDataQualityMetricsQuery getFormulaDataQualityMetricsQuery()
      throws ClassCastException {
    return (FormulaDataQualityMetricsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaProductAnalyticsExtendedQuery`. If the actual instance is
   * not `FormulaProductAnalyticsExtendedQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaProductAnalyticsExtendedQuery`
   * @throws ClassCastException if the instance is not `FormulaProductAnalyticsExtendedQuery`
   */
  public FormulaProductAnalyticsExtendedQuery getFormulaProductAnalyticsExtendedQuery()
      throws ClassCastException {
    return (FormulaProductAnalyticsExtendedQuery) super.getActualInstance();
  }
}
