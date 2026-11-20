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
@JsonDeserialize(using = AdvancedQueryDataset.AdvancedQueryDatasetDeserializer.class)
@JsonSerialize(using = AdvancedQueryDataset.AdvancedQueryDatasetSerializer.class)
public class AdvancedQueryDataset extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AdvancedQueryDataset.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AdvancedQueryDatasetSerializer extends StdSerializer<AdvancedQueryDataset> {
    public AdvancedQueryDatasetSerializer(Class<AdvancedQueryDataset> t) {
      super(t);
    }

    public AdvancedQueryDatasetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AdvancedQueryDataset value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AdvancedQueryDatasetDeserializer
      extends StdDeserializer<AdvancedQueryDataset> {
    public AdvancedQueryDatasetDeserializer() {
      this(AdvancedQueryDataset.class);
    }

    public AdvancedQueryDatasetDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AdvancedQueryDataset deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize EventPlatformDatasetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventPlatformDatasetDefinition.class.equals(Integer.class)
            || EventPlatformDatasetDefinition.class.equals(Long.class)
            || EventPlatformDatasetDefinition.class.equals(Float.class)
            || EventPlatformDatasetDefinition.class.equals(Double.class)
            || EventPlatformDatasetDefinition.class.equals(Boolean.class)
            || EventPlatformDatasetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventPlatformDatasetDefinition.class.equals(Integer.class)
                        || EventPlatformDatasetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventPlatformDatasetDefinition.class.equals(Float.class)
                        || EventPlatformDatasetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventPlatformDatasetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventPlatformDatasetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventPlatformDatasetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventPlatformDatasetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventPlatformDatasetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'EventPlatformDatasetDefinition'", e);
      }

      // deserialize ReferentialDatasetReferenceTable
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ReferentialDatasetReferenceTable.class.equals(Integer.class)
            || ReferentialDatasetReferenceTable.class.equals(Long.class)
            || ReferentialDatasetReferenceTable.class.equals(Float.class)
            || ReferentialDatasetReferenceTable.class.equals(Double.class)
            || ReferentialDatasetReferenceTable.class.equals(Boolean.class)
            || ReferentialDatasetReferenceTable.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ReferentialDatasetReferenceTable.class.equals(Integer.class)
                        || ReferentialDatasetReferenceTable.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ReferentialDatasetReferenceTable.class.equals(Float.class)
                        || ReferentialDatasetReferenceTable.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ReferentialDatasetReferenceTable.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ReferentialDatasetReferenceTable.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ReferentialDatasetReferenceTable.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ReferentialDatasetReferenceTable) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ReferentialDatasetReferenceTable'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ReferentialDatasetReferenceTable'", e);
      }

      // deserialize ReferentialDatasetManagedResource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ReferentialDatasetManagedResource.class.equals(Integer.class)
            || ReferentialDatasetManagedResource.class.equals(Long.class)
            || ReferentialDatasetManagedResource.class.equals(Float.class)
            || ReferentialDatasetManagedResource.class.equals(Double.class)
            || ReferentialDatasetManagedResource.class.equals(Boolean.class)
            || ReferentialDatasetManagedResource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ReferentialDatasetManagedResource.class.equals(Integer.class)
                        || ReferentialDatasetManagedResource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ReferentialDatasetManagedResource.class.equals(Float.class)
                        || ReferentialDatasetManagedResource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ReferentialDatasetManagedResource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ReferentialDatasetManagedResource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ReferentialDatasetManagedResource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ReferentialDatasetManagedResource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ReferentialDatasetManagedResource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ReferentialDatasetManagedResource'", e);
      }

      // deserialize ActionsDatastoreDataset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ActionsDatastoreDataset.class.equals(Integer.class)
            || ActionsDatastoreDataset.class.equals(Long.class)
            || ActionsDatastoreDataset.class.equals(Float.class)
            || ActionsDatastoreDataset.class.equals(Double.class)
            || ActionsDatastoreDataset.class.equals(Boolean.class)
            || ActionsDatastoreDataset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ActionsDatastoreDataset.class.equals(Integer.class)
                        || ActionsDatastoreDataset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ActionsDatastoreDataset.class.equals(Float.class)
                        || ActionsDatastoreDataset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ActionsDatastoreDataset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ActionsDatastoreDataset.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ActionsDatastoreDataset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ActionsDatastoreDataset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ActionsDatastoreDataset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ActionsDatastoreDataset'", e);
      }

      // deserialize MetricDatasetCloudCostScalar
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricDatasetCloudCostScalar.class.equals(Integer.class)
            || MetricDatasetCloudCostScalar.class.equals(Long.class)
            || MetricDatasetCloudCostScalar.class.equals(Float.class)
            || MetricDatasetCloudCostScalar.class.equals(Double.class)
            || MetricDatasetCloudCostScalar.class.equals(Boolean.class)
            || MetricDatasetCloudCostScalar.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricDatasetCloudCostScalar.class.equals(Integer.class)
                        || MetricDatasetCloudCostScalar.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricDatasetCloudCostScalar.class.equals(Float.class)
                        || MetricDatasetCloudCostScalar.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricDatasetCloudCostScalar.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricDatasetCloudCostScalar.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricDatasetCloudCostScalar.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricDatasetCloudCostScalar) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricDatasetCloudCostScalar'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricDatasetCloudCostScalar'", e);
      }

      // deserialize MetricDatasetMetricScalar
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricDatasetMetricScalar.class.equals(Integer.class)
            || MetricDatasetMetricScalar.class.equals(Long.class)
            || MetricDatasetMetricScalar.class.equals(Float.class)
            || MetricDatasetMetricScalar.class.equals(Double.class)
            || MetricDatasetMetricScalar.class.equals(Boolean.class)
            || MetricDatasetMetricScalar.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricDatasetMetricScalar.class.equals(Integer.class)
                        || MetricDatasetMetricScalar.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricDatasetMetricScalar.class.equals(Float.class)
                        || MetricDatasetMetricScalar.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricDatasetMetricScalar.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricDatasetMetricScalar.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricDatasetMetricScalar.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricDatasetMetricScalar) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricDatasetMetricScalar'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricDatasetMetricScalar'", e);
      }

      // deserialize FormulaDataset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaDataset.class.equals(Integer.class)
            || FormulaDataset.class.equals(Long.class)
            || FormulaDataset.class.equals(Float.class)
            || FormulaDataset.class.equals(Double.class)
            || FormulaDataset.class.equals(Boolean.class)
            || FormulaDataset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaDataset.class.equals(Integer.class)
                        || FormulaDataset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaDataset.class.equals(Float.class)
                        || FormulaDataset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaDataset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaDataset.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaDataset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaDataset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaDataset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaDataset'", e);
      }

      // deserialize AnalysisDataset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AnalysisDataset.class.equals(Integer.class)
            || AnalysisDataset.class.equals(Long.class)
            || AnalysisDataset.class.equals(Float.class)
            || AnalysisDataset.class.equals(Double.class)
            || AnalysisDataset.class.equals(Boolean.class)
            || AnalysisDataset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AnalysisDataset.class.equals(Integer.class)
                        || AnalysisDataset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AnalysisDataset.class.equals(Float.class)
                        || AnalysisDataset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AnalysisDataset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AnalysisDataset.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AnalysisDataset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AnalysisDataset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AnalysisDataset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AnalysisDataset'", e);
      }

      // deserialize PublishedAnalysis
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PublishedAnalysis.class.equals(Integer.class)
            || PublishedAnalysis.class.equals(Long.class)
            || PublishedAnalysis.class.equals(Float.class)
            || PublishedAnalysis.class.equals(Double.class)
            || PublishedAnalysis.class.equals(Boolean.class)
            || PublishedAnalysis.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PublishedAnalysis.class.equals(Integer.class)
                        || PublishedAnalysis.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PublishedAnalysis.class.equals(Float.class)
                        || PublishedAnalysis.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PublishedAnalysis.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PublishedAnalysis.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PublishedAnalysis.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PublishedAnalysis) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PublishedAnalysis'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PublishedAnalysis'", e);
      }

      // deserialize SnowflakeQueryDataset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SnowflakeQueryDataset.class.equals(Integer.class)
            || SnowflakeQueryDataset.class.equals(Long.class)
            || SnowflakeQueryDataset.class.equals(Float.class)
            || SnowflakeQueryDataset.class.equals(Double.class)
            || SnowflakeQueryDataset.class.equals(Boolean.class)
            || SnowflakeQueryDataset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SnowflakeQueryDataset.class.equals(Integer.class)
                        || SnowflakeQueryDataset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SnowflakeQueryDataset.class.equals(Float.class)
                        || SnowflakeQueryDataset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SnowflakeQueryDataset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SnowflakeQueryDataset.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SnowflakeQueryDataset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SnowflakeQueryDataset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SnowflakeQueryDataset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SnowflakeQueryDataset'", e);
      }

      // deserialize BigQueryDataset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BigQueryDataset.class.equals(Integer.class)
            || BigQueryDataset.class.equals(Long.class)
            || BigQueryDataset.class.equals(Float.class)
            || BigQueryDataset.class.equals(Double.class)
            || BigQueryDataset.class.equals(Boolean.class)
            || BigQueryDataset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BigQueryDataset.class.equals(Integer.class)
                        || BigQueryDataset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BigQueryDataset.class.equals(Float.class)
                        || BigQueryDataset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BigQueryDataset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BigQueryDataset.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(BigQueryDataset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BigQueryDataset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'BigQueryDataset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'BigQueryDataset'", e);
      }

      // deserialize ProductAnalyticsJourneyDataset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ProductAnalyticsJourneyDataset.class.equals(Integer.class)
            || ProductAnalyticsJourneyDataset.class.equals(Long.class)
            || ProductAnalyticsJourneyDataset.class.equals(Float.class)
            || ProductAnalyticsJourneyDataset.class.equals(Double.class)
            || ProductAnalyticsJourneyDataset.class.equals(Boolean.class)
            || ProductAnalyticsJourneyDataset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ProductAnalyticsJourneyDataset.class.equals(Integer.class)
                        || ProductAnalyticsJourneyDataset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ProductAnalyticsJourneyDataset.class.equals(Float.class)
                        || ProductAnalyticsJourneyDataset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ProductAnalyticsJourneyDataset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ProductAnalyticsJourneyDataset.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ProductAnalyticsJourneyDataset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ProductAnalyticsJourneyDataset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ProductAnalyticsJourneyDataset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ProductAnalyticsJourneyDataset'", e);
      }

      // deserialize HistoricalDiscoveredProcessesDataset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HistoricalDiscoveredProcessesDataset.class.equals(Integer.class)
            || HistoricalDiscoveredProcessesDataset.class.equals(Long.class)
            || HistoricalDiscoveredProcessesDataset.class.equals(Float.class)
            || HistoricalDiscoveredProcessesDataset.class.equals(Double.class)
            || HistoricalDiscoveredProcessesDataset.class.equals(Boolean.class)
            || HistoricalDiscoveredProcessesDataset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HistoricalDiscoveredProcessesDataset.class.equals(Integer.class)
                        || HistoricalDiscoveredProcessesDataset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HistoricalDiscoveredProcessesDataset.class.equals(Float.class)
                        || HistoricalDiscoveredProcessesDataset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HistoricalDiscoveredProcessesDataset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HistoricalDiscoveredProcessesDataset.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(HistoricalDiscoveredProcessesDataset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HistoricalDiscoveredProcessesDataset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HistoricalDiscoveredProcessesDataset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HistoricalDiscoveredProcessesDataset'",
            e);
      }

      AdvancedQueryDataset ret = new AdvancedQueryDataset();
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
    public AdvancedQueryDataset getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "AdvancedQueryDataset cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AdvancedQueryDataset() {
    super("oneOf", Boolean.FALSE);
  }

  public AdvancedQueryDataset(EventPlatformDatasetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(ReferentialDatasetReferenceTable o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(ReferentialDatasetManagedResource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(ActionsDatastoreDataset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(MetricDatasetCloudCostScalar o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(MetricDatasetMetricScalar o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(FormulaDataset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(AnalysisDataset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(PublishedAnalysis o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(SnowflakeQueryDataset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(BigQueryDataset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(ProductAnalyticsJourneyDataset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AdvancedQueryDataset(HistoricalDiscoveredProcessesDataset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "EventPlatformDatasetDefinition", new GenericType<EventPlatformDatasetDefinition>() {});
    schemas.put(
        "ReferentialDatasetReferenceTable", new GenericType<ReferentialDatasetReferenceTable>() {});
    schemas.put(
        "ReferentialDatasetManagedResource",
        new GenericType<ReferentialDatasetManagedResource>() {});
    schemas.put("ActionsDatastoreDataset", new GenericType<ActionsDatastoreDataset>() {});
    schemas.put("MetricDatasetCloudCostScalar", new GenericType<MetricDatasetCloudCostScalar>() {});
    schemas.put("MetricDatasetMetricScalar", new GenericType<MetricDatasetMetricScalar>() {});
    schemas.put("FormulaDataset", new GenericType<FormulaDataset>() {});
    schemas.put("AnalysisDataset", new GenericType<AnalysisDataset>() {});
    schemas.put("PublishedAnalysis", new GenericType<PublishedAnalysis>() {});
    schemas.put("SnowflakeQueryDataset", new GenericType<SnowflakeQueryDataset>() {});
    schemas.put("BigQueryDataset", new GenericType<BigQueryDataset>() {});
    schemas.put(
        "ProductAnalyticsJourneyDataset", new GenericType<ProductAnalyticsJourneyDataset>() {});
    schemas.put(
        "HistoricalDiscoveredProcessesDataset",
        new GenericType<HistoricalDiscoveredProcessesDataset>() {});
    JSON.registerDescendants(AdvancedQueryDataset.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AdvancedQueryDataset.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: EventPlatformDatasetDefinition,
   * ReferentialDatasetReferenceTable, ReferentialDatasetManagedResource, ActionsDatastoreDataset,
   * MetricDatasetCloudCostScalar, MetricDatasetMetricScalar, FormulaDataset, AnalysisDataset,
   * PublishedAnalysis, SnowflakeQueryDataset, BigQueryDataset, ProductAnalyticsJourneyDataset,
   * HistoricalDiscoveredProcessesDataset
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        EventPlatformDatasetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ReferentialDatasetReferenceTable.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ReferentialDatasetManagedResource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ActionsDatastoreDataset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MetricDatasetCloudCostScalar.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MetricDatasetMetricScalar.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaDataset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AnalysisDataset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PublishedAnalysis.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SnowflakeQueryDataset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(BigQueryDataset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ProductAnalyticsJourneyDataset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HistoricalDiscoveredProcessesDataset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be EventPlatformDatasetDefinition,"
            + " ReferentialDatasetReferenceTable, ReferentialDatasetManagedResource,"
            + " ActionsDatastoreDataset, MetricDatasetCloudCostScalar, MetricDatasetMetricScalar,"
            + " FormulaDataset, AnalysisDataset, PublishedAnalysis, SnowflakeQueryDataset,"
            + " BigQueryDataset, ProductAnalyticsJourneyDataset,"
            + " HistoricalDiscoveredProcessesDataset");
  }

  /**
   * Get the actual instance, which can be the following: EventPlatformDatasetDefinition,
   * ReferentialDatasetReferenceTable, ReferentialDatasetManagedResource, ActionsDatastoreDataset,
   * MetricDatasetCloudCostScalar, MetricDatasetMetricScalar, FormulaDataset, AnalysisDataset,
   * PublishedAnalysis, SnowflakeQueryDataset, BigQueryDataset, ProductAnalyticsJourneyDataset,
   * HistoricalDiscoveredProcessesDataset
   *
   * @return The actual instance (EventPlatformDatasetDefinition, ReferentialDatasetReferenceTable,
   *     ReferentialDatasetManagedResource, ActionsDatastoreDataset, MetricDatasetCloudCostScalar,
   *     MetricDatasetMetricScalar, FormulaDataset, AnalysisDataset, PublishedAnalysis,
   *     SnowflakeQueryDataset, BigQueryDataset, ProductAnalyticsJourneyDataset,
   *     HistoricalDiscoveredProcessesDataset)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventPlatformDatasetDefinition`. If the actual instance is not
   * `EventPlatformDatasetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventPlatformDatasetDefinition`
   * @throws ClassCastException if the instance is not `EventPlatformDatasetDefinition`
   */
  public EventPlatformDatasetDefinition getEventPlatformDatasetDefinition()
      throws ClassCastException {
    return (EventPlatformDatasetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ReferentialDatasetReferenceTable`. If the actual instance is not
   * `ReferentialDatasetReferenceTable`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ReferentialDatasetReferenceTable`
   * @throws ClassCastException if the instance is not `ReferentialDatasetReferenceTable`
   */
  public ReferentialDatasetReferenceTable getReferentialDatasetReferenceTable()
      throws ClassCastException {
    return (ReferentialDatasetReferenceTable) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ReferentialDatasetManagedResource`. If the actual instance is not
   * `ReferentialDatasetManagedResource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ReferentialDatasetManagedResource`
   * @throws ClassCastException if the instance is not `ReferentialDatasetManagedResource`
   */
  public ReferentialDatasetManagedResource getReferentialDatasetManagedResource()
      throws ClassCastException {
    return (ReferentialDatasetManagedResource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ActionsDatastoreDataset`. If the actual instance is not
   * `ActionsDatastoreDataset`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ActionsDatastoreDataset`
   * @throws ClassCastException if the instance is not `ActionsDatastoreDataset`
   */
  public ActionsDatastoreDataset getActionsDatastoreDataset() throws ClassCastException {
    return (ActionsDatastoreDataset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricDatasetCloudCostScalar`. If the actual instance is not
   * `MetricDatasetCloudCostScalar`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricDatasetCloudCostScalar`
   * @throws ClassCastException if the instance is not `MetricDatasetCloudCostScalar`
   */
  public MetricDatasetCloudCostScalar getMetricDatasetCloudCostScalar() throws ClassCastException {
    return (MetricDatasetCloudCostScalar) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricDatasetMetricScalar`. If the actual instance is not
   * `MetricDatasetMetricScalar`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricDatasetMetricScalar`
   * @throws ClassCastException if the instance is not `MetricDatasetMetricScalar`
   */
  public MetricDatasetMetricScalar getMetricDatasetMetricScalar() throws ClassCastException {
    return (MetricDatasetMetricScalar) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaDataset`. If the actual instance is not `FormulaDataset`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaDataset`
   * @throws ClassCastException if the instance is not `FormulaDataset`
   */
  public FormulaDataset getFormulaDataset() throws ClassCastException {
    return (FormulaDataset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AnalysisDataset`. If the actual instance is not `AnalysisDataset`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `AnalysisDataset`
   * @throws ClassCastException if the instance is not `AnalysisDataset`
   */
  public AnalysisDataset getAnalysisDataset() throws ClassCastException {
    return (AnalysisDataset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PublishedAnalysis`. If the actual instance is not
   * `PublishedAnalysis`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PublishedAnalysis`
   * @throws ClassCastException if the instance is not `PublishedAnalysis`
   */
  public PublishedAnalysis getPublishedAnalysis() throws ClassCastException {
    return (PublishedAnalysis) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SnowflakeQueryDataset`. If the actual instance is not
   * `SnowflakeQueryDataset`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SnowflakeQueryDataset`
   * @throws ClassCastException if the instance is not `SnowflakeQueryDataset`
   */
  public SnowflakeQueryDataset getSnowflakeQueryDataset() throws ClassCastException {
    return (SnowflakeQueryDataset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `BigQueryDataset`. If the actual instance is not `BigQueryDataset`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `BigQueryDataset`
   * @throws ClassCastException if the instance is not `BigQueryDataset`
   */
  public BigQueryDataset getBigQueryDataset() throws ClassCastException {
    return (BigQueryDataset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ProductAnalyticsJourneyDataset`. If the actual instance is not
   * `ProductAnalyticsJourneyDataset`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ProductAnalyticsJourneyDataset`
   * @throws ClassCastException if the instance is not `ProductAnalyticsJourneyDataset`
   */
  public ProductAnalyticsJourneyDataset getProductAnalyticsJourneyDataset()
      throws ClassCastException {
    return (ProductAnalyticsJourneyDataset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HistoricalDiscoveredProcessesDataset`. If the actual instance is
   * not `HistoricalDiscoveredProcessesDataset`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HistoricalDiscoveredProcessesDataset`
   * @throws ClassCastException if the instance is not `HistoricalDiscoveredProcessesDataset`
   */
  public HistoricalDiscoveredProcessesDataset getHistoricalDiscoveredProcessesDataset()
      throws ClassCastException {
    return (HistoricalDiscoveredProcessesDataset) super.getActualInstance();
  }
}
