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
@JsonDeserialize(using = TimeseriesWidgetRequest.TimeseriesWidgetRequestDeserializer.class)
@JsonSerialize(using = TimeseriesWidgetRequest.TimeseriesWidgetRequestSerializer.class)
public class TimeseriesWidgetRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TimeseriesWidgetRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TimeseriesWidgetRequestSerializer
      extends StdSerializer<TimeseriesWidgetRequest> {
    public TimeseriesWidgetRequestSerializer(Class<TimeseriesWidgetRequest> t) {
      super(t);
    }

    public TimeseriesWidgetRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesWidgetRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TimeseriesWidgetRequestDeserializer
      extends StdDeserializer<TimeseriesWidgetRequest> {
    public TimeseriesWidgetRequestDeserializer() {
      this(TimeseriesWidgetRequest.class);
    }

    public TimeseriesWidgetRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TimeseriesWidgetRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TimeseriesWidgetFormulaRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetFormulaRequest.class.equals(Integer.class)
            || TimeseriesWidgetFormulaRequest.class.equals(Long.class)
            || TimeseriesWidgetFormulaRequest.class.equals(Float.class)
            || TimeseriesWidgetFormulaRequest.class.equals(Double.class)
            || TimeseriesWidgetFormulaRequest.class.equals(Boolean.class)
            || TimeseriesWidgetFormulaRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetFormulaRequest.class.equals(Integer.class)
                        || TimeseriesWidgetFormulaRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetFormulaRequest.class.equals(Float.class)
                        || TimeseriesWidgetFormulaRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetFormulaRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetFormulaRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetFormulaRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetFormulaRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetFormulaRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TimeseriesWidgetFormulaRequest'", e);
      }

      // deserialize TimeseriesWidgetMetricRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetMetricRequest.class.equals(Integer.class)
            || TimeseriesWidgetMetricRequest.class.equals(Long.class)
            || TimeseriesWidgetMetricRequest.class.equals(Float.class)
            || TimeseriesWidgetMetricRequest.class.equals(Double.class)
            || TimeseriesWidgetMetricRequest.class.equals(Boolean.class)
            || TimeseriesWidgetMetricRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetMetricRequest.class.equals(Integer.class)
                        || TimeseriesWidgetMetricRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetMetricRequest.class.equals(Float.class)
                        || TimeseriesWidgetMetricRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetMetricRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetMetricRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetMetricRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetMetricRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetMetricRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetMetricRequest'", e);
      }

      // deserialize TimeseriesWidgetLogRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetLogRequest.class.equals(Integer.class)
            || TimeseriesWidgetLogRequest.class.equals(Long.class)
            || TimeseriesWidgetLogRequest.class.equals(Float.class)
            || TimeseriesWidgetLogRequest.class.equals(Double.class)
            || TimeseriesWidgetLogRequest.class.equals(Boolean.class)
            || TimeseriesWidgetLogRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetLogRequest.class.equals(Integer.class)
                        || TimeseriesWidgetLogRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetLogRequest.class.equals(Float.class)
                        || TimeseriesWidgetLogRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetLogRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetLogRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetLogRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetLogRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetLogRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetLogRequest'", e);
      }

      // deserialize TimeseriesWidgetApmRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetApmRequest.class.equals(Integer.class)
            || TimeseriesWidgetApmRequest.class.equals(Long.class)
            || TimeseriesWidgetApmRequest.class.equals(Float.class)
            || TimeseriesWidgetApmRequest.class.equals(Double.class)
            || TimeseriesWidgetApmRequest.class.equals(Boolean.class)
            || TimeseriesWidgetApmRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetApmRequest.class.equals(Integer.class)
                        || TimeseriesWidgetApmRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetApmRequest.class.equals(Float.class)
                        || TimeseriesWidgetApmRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetApmRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetApmRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetApmRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetApmRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetApmRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetApmRequest'", e);
      }

      // deserialize TimeseriesWidgetNetworkRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetNetworkRequest.class.equals(Integer.class)
            || TimeseriesWidgetNetworkRequest.class.equals(Long.class)
            || TimeseriesWidgetNetworkRequest.class.equals(Float.class)
            || TimeseriesWidgetNetworkRequest.class.equals(Double.class)
            || TimeseriesWidgetNetworkRequest.class.equals(Boolean.class)
            || TimeseriesWidgetNetworkRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetNetworkRequest.class.equals(Integer.class)
                        || TimeseriesWidgetNetworkRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetNetworkRequest.class.equals(Float.class)
                        || TimeseriesWidgetNetworkRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetNetworkRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetNetworkRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetNetworkRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetNetworkRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetNetworkRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TimeseriesWidgetNetworkRequest'", e);
      }

      // deserialize TimeseriesWidgetRumRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetRumRequest.class.equals(Integer.class)
            || TimeseriesWidgetRumRequest.class.equals(Long.class)
            || TimeseriesWidgetRumRequest.class.equals(Float.class)
            || TimeseriesWidgetRumRequest.class.equals(Double.class)
            || TimeseriesWidgetRumRequest.class.equals(Boolean.class)
            || TimeseriesWidgetRumRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetRumRequest.class.equals(Integer.class)
                        || TimeseriesWidgetRumRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetRumRequest.class.equals(Float.class)
                        || TimeseriesWidgetRumRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetRumRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetRumRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetRumRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetRumRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetRumRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetRumRequest'", e);
      }

      // deserialize TimeseriesWidgetSecurityRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetSecurityRequest.class.equals(Integer.class)
            || TimeseriesWidgetSecurityRequest.class.equals(Long.class)
            || TimeseriesWidgetSecurityRequest.class.equals(Float.class)
            || TimeseriesWidgetSecurityRequest.class.equals(Double.class)
            || TimeseriesWidgetSecurityRequest.class.equals(Boolean.class)
            || TimeseriesWidgetSecurityRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetSecurityRequest.class.equals(Integer.class)
                        || TimeseriesWidgetSecurityRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetSecurityRequest.class.equals(Float.class)
                        || TimeseriesWidgetSecurityRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetSecurityRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetSecurityRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetSecurityRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetSecurityRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetSecurityRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TimeseriesWidgetSecurityRequest'", e);
      }

      // deserialize TimeseriesWidgetComplianceFindingsRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetComplianceFindingsRequest.class.equals(Integer.class)
            || TimeseriesWidgetComplianceFindingsRequest.class.equals(Long.class)
            || TimeseriesWidgetComplianceFindingsRequest.class.equals(Float.class)
            || TimeseriesWidgetComplianceFindingsRequest.class.equals(Double.class)
            || TimeseriesWidgetComplianceFindingsRequest.class.equals(Boolean.class)
            || TimeseriesWidgetComplianceFindingsRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetComplianceFindingsRequest.class.equals(Integer.class)
                        || TimeseriesWidgetComplianceFindingsRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetComplianceFindingsRequest.class.equals(Float.class)
                        || TimeseriesWidgetComplianceFindingsRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetComplianceFindingsRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetComplianceFindingsRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TimeseriesWidgetComplianceFindingsRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetComplianceFindingsRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'TimeseriesWidgetComplianceFindingsRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetComplianceFindingsRequest'",
            e);
      }

      // deserialize TimeseriesWidgetEventRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetEventRequest.class.equals(Integer.class)
            || TimeseriesWidgetEventRequest.class.equals(Long.class)
            || TimeseriesWidgetEventRequest.class.equals(Float.class)
            || TimeseriesWidgetEventRequest.class.equals(Double.class)
            || TimeseriesWidgetEventRequest.class.equals(Boolean.class)
            || TimeseriesWidgetEventRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetEventRequest.class.equals(Integer.class)
                        || TimeseriesWidgetEventRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetEventRequest.class.equals(Float.class)
                        || TimeseriesWidgetEventRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetEventRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetEventRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetEventRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetEventRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetEventRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetEventRequest'", e);
      }

      // deserialize TimeseriesWidgetProfilingMetricsRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetProfilingMetricsRequest.class.equals(Integer.class)
            || TimeseriesWidgetProfilingMetricsRequest.class.equals(Long.class)
            || TimeseriesWidgetProfilingMetricsRequest.class.equals(Float.class)
            || TimeseriesWidgetProfilingMetricsRequest.class.equals(Double.class)
            || TimeseriesWidgetProfilingMetricsRequest.class.equals(Boolean.class)
            || TimeseriesWidgetProfilingMetricsRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetProfilingMetricsRequest.class.equals(Integer.class)
                        || TimeseriesWidgetProfilingMetricsRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetProfilingMetricsRequest.class.equals(Float.class)
                        || TimeseriesWidgetProfilingMetricsRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetProfilingMetricsRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetProfilingMetricsRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TimeseriesWidgetProfilingMetricsRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetProfilingMetricsRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'TimeseriesWidgetProfilingMetricsRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetProfilingMetricsRequest'",
            e);
      }

      // deserialize TimeseriesWidgetCiPipelineRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetCiPipelineRequest.class.equals(Integer.class)
            || TimeseriesWidgetCiPipelineRequest.class.equals(Long.class)
            || TimeseriesWidgetCiPipelineRequest.class.equals(Float.class)
            || TimeseriesWidgetCiPipelineRequest.class.equals(Double.class)
            || TimeseriesWidgetCiPipelineRequest.class.equals(Boolean.class)
            || TimeseriesWidgetCiPipelineRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetCiPipelineRequest.class.equals(Integer.class)
                        || TimeseriesWidgetCiPipelineRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetCiPipelineRequest.class.equals(Float.class)
                        || TimeseriesWidgetCiPipelineRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetCiPipelineRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetCiPipelineRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetCiPipelineRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetCiPipelineRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetCiPipelineRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TimeseriesWidgetCiPipelineRequest'", e);
      }

      // deserialize TimeseriesWidgetCiTestRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetCiTestRequest.class.equals(Integer.class)
            || TimeseriesWidgetCiTestRequest.class.equals(Long.class)
            || TimeseriesWidgetCiTestRequest.class.equals(Float.class)
            || TimeseriesWidgetCiTestRequest.class.equals(Double.class)
            || TimeseriesWidgetCiTestRequest.class.equals(Boolean.class)
            || TimeseriesWidgetCiTestRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetCiTestRequest.class.equals(Integer.class)
                        || TimeseriesWidgetCiTestRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetCiTestRequest.class.equals(Float.class)
                        || TimeseriesWidgetCiTestRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetCiTestRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetCiTestRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetCiTestRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetCiTestRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetCiTestRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetCiTestRequest'", e);
      }

      // deserialize TimeseriesWidgetAuditRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetAuditRequest.class.equals(Integer.class)
            || TimeseriesWidgetAuditRequest.class.equals(Long.class)
            || TimeseriesWidgetAuditRequest.class.equals(Float.class)
            || TimeseriesWidgetAuditRequest.class.equals(Double.class)
            || TimeseriesWidgetAuditRequest.class.equals(Boolean.class)
            || TimeseriesWidgetAuditRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetAuditRequest.class.equals(Integer.class)
                        || TimeseriesWidgetAuditRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetAuditRequest.class.equals(Float.class)
                        || TimeseriesWidgetAuditRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetAuditRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetAuditRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetAuditRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetAuditRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetAuditRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetAuditRequest'", e);
      }

      // deserialize TimeseriesWidgetAppsecSpanRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetAppsecSpanRequest.class.equals(Integer.class)
            || TimeseriesWidgetAppsecSpanRequest.class.equals(Long.class)
            || TimeseriesWidgetAppsecSpanRequest.class.equals(Float.class)
            || TimeseriesWidgetAppsecSpanRequest.class.equals(Double.class)
            || TimeseriesWidgetAppsecSpanRequest.class.equals(Boolean.class)
            || TimeseriesWidgetAppsecSpanRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetAppsecSpanRequest.class.equals(Integer.class)
                        || TimeseriesWidgetAppsecSpanRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetAppsecSpanRequest.class.equals(Float.class)
                        || TimeseriesWidgetAppsecSpanRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetAppsecSpanRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetAppsecSpanRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetAppsecSpanRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetAppsecSpanRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetAppsecSpanRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TimeseriesWidgetAppsecSpanRequest'", e);
      }

      // deserialize TimeseriesWidgetSyntheticsBatchesRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Integer.class)
            || TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Long.class)
            || TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Float.class)
            || TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Double.class)
            || TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Boolean.class)
            || TimeseriesWidgetSyntheticsBatchesRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Integer.class)
                        || TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Float.class)
                        || TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetSyntheticsBatchesRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetSyntheticsBatchesRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TimeseriesWidgetSyntheticsBatchesRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetSyntheticsBatchesRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'TimeseriesWidgetSyntheticsBatchesRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetSyntheticsBatchesRequest'",
            e);
      }

      // deserialize TimeseriesWidgetSyntheticsTestRunsRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Integer.class)
            || TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Long.class)
            || TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Float.class)
            || TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Double.class)
            || TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Boolean.class)
            || TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Integer.class)
                        || TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Float.class)
                        || TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetSyntheticsTestRunsRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TimeseriesWidgetSyntheticsTestRunsRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetSyntheticsTestRunsRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'TimeseriesWidgetSyntheticsTestRunsRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetSyntheticsTestRunsRequest'",
            e);
      }

      // deserialize TimeseriesWidgetProcessRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetProcessRequest.class.equals(Integer.class)
            || TimeseriesWidgetProcessRequest.class.equals(Long.class)
            || TimeseriesWidgetProcessRequest.class.equals(Float.class)
            || TimeseriesWidgetProcessRequest.class.equals(Double.class)
            || TimeseriesWidgetProcessRequest.class.equals(Boolean.class)
            || TimeseriesWidgetProcessRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetProcessRequest.class.equals(Integer.class)
                        || TimeseriesWidgetProcessRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetProcessRequest.class.equals(Float.class)
                        || TimeseriesWidgetProcessRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetProcessRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetProcessRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetProcessRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetProcessRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetProcessRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TimeseriesWidgetProcessRequest'", e);
      }

      // deserialize TimeseriesWidgetLegacyProfileMetricsRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Integer.class)
            || TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Long.class)
            || TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Float.class)
            || TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Double.class)
            || TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Boolean.class)
            || TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Integer.class)
                        || TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Float.class)
                        || TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetLegacyProfileMetricsRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TimeseriesWidgetLegacyProfileMetricsRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetLegacyProfileMetricsRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TimeseriesWidgetLegacyProfileMetricsRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetLegacyProfileMetricsRequest'",
            e);
      }

      // deserialize TimeseriesWidgetLegacyEventRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetLegacyEventRequest.class.equals(Integer.class)
            || TimeseriesWidgetLegacyEventRequest.class.equals(Long.class)
            || TimeseriesWidgetLegacyEventRequest.class.equals(Float.class)
            || TimeseriesWidgetLegacyEventRequest.class.equals(Double.class)
            || TimeseriesWidgetLegacyEventRequest.class.equals(Boolean.class)
            || TimeseriesWidgetLegacyEventRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetLegacyEventRequest.class.equals(Integer.class)
                        || TimeseriesWidgetLegacyEventRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetLegacyEventRequest.class.equals(Float.class)
                        || TimeseriesWidgetLegacyEventRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetLegacyEventRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetLegacyEventRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetLegacyEventRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetLegacyEventRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetLegacyEventRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetLegacyEventRequest'",
            e);
      }

      // deserialize TimeseriesWidgetDdsqlRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetDdsqlRequest.class.equals(Integer.class)
            || TimeseriesWidgetDdsqlRequest.class.equals(Long.class)
            || TimeseriesWidgetDdsqlRequest.class.equals(Float.class)
            || TimeseriesWidgetDdsqlRequest.class.equals(Double.class)
            || TimeseriesWidgetDdsqlRequest.class.equals(Boolean.class)
            || TimeseriesWidgetDdsqlRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetDdsqlRequest.class.equals(Integer.class)
                        || TimeseriesWidgetDdsqlRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetDdsqlRequest.class.equals(Float.class)
                        || TimeseriesWidgetDdsqlRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetDdsqlRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetDdsqlRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetDdsqlRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetDdsqlRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetDdsqlRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetDdsqlRequest'", e);
      }

      // deserialize TimeseriesWidgetAdvancedQueryRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetAdvancedQueryRequest.class.equals(Integer.class)
            || TimeseriesWidgetAdvancedQueryRequest.class.equals(Long.class)
            || TimeseriesWidgetAdvancedQueryRequest.class.equals(Float.class)
            || TimeseriesWidgetAdvancedQueryRequest.class.equals(Double.class)
            || TimeseriesWidgetAdvancedQueryRequest.class.equals(Boolean.class)
            || TimeseriesWidgetAdvancedQueryRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetAdvancedQueryRequest.class.equals(Integer.class)
                        || TimeseriesWidgetAdvancedQueryRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetAdvancedQueryRequest.class.equals(Float.class)
                        || TimeseriesWidgetAdvancedQueryRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetAdvancedQueryRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetAdvancedQueryRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetAdvancedQueryRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetAdvancedQueryRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetAdvancedQueryRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetAdvancedQueryRequest'",
            e);
      }

      // deserialize TimeseriesWidgetLocalDatasetRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetLocalDatasetRequest.class.equals(Integer.class)
            || TimeseriesWidgetLocalDatasetRequest.class.equals(Long.class)
            || TimeseriesWidgetLocalDatasetRequest.class.equals(Float.class)
            || TimeseriesWidgetLocalDatasetRequest.class.equals(Double.class)
            || TimeseriesWidgetLocalDatasetRequest.class.equals(Boolean.class)
            || TimeseriesWidgetLocalDatasetRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetLocalDatasetRequest.class.equals(Integer.class)
                        || TimeseriesWidgetLocalDatasetRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetLocalDatasetRequest.class.equals(Float.class)
                        || TimeseriesWidgetLocalDatasetRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetLocalDatasetRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetLocalDatasetRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetLocalDatasetRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetLocalDatasetRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetLocalDatasetRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetLocalDatasetRequest'",
            e);
      }

      TimeseriesWidgetRequest ret = new TimeseriesWidgetRequest();
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
    public TimeseriesWidgetRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TimeseriesWidgetRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TimeseriesWidgetRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetFormulaRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetMetricRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetLogRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetApmRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetNetworkRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetRumRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetSecurityRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetComplianceFindingsRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetEventRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetProfilingMetricsRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetCiPipelineRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetCiTestRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetAuditRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetAppsecSpanRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetSyntheticsBatchesRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetSyntheticsTestRunsRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetProcessRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetLegacyProfileMetricsRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetLegacyEventRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetDdsqlRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetAdvancedQueryRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesWidgetRequest(TimeseriesWidgetLocalDatasetRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TimeseriesWidgetFormulaRequest", new GenericType<TimeseriesWidgetFormulaRequest>() {});
    schemas.put(
        "TimeseriesWidgetMetricRequest", new GenericType<TimeseriesWidgetMetricRequest>() {});
    schemas.put("TimeseriesWidgetLogRequest", new GenericType<TimeseriesWidgetLogRequest>() {});
    schemas.put("TimeseriesWidgetApmRequest", new GenericType<TimeseriesWidgetApmRequest>() {});
    schemas.put(
        "TimeseriesWidgetNetworkRequest", new GenericType<TimeseriesWidgetNetworkRequest>() {});
    schemas.put("TimeseriesWidgetRumRequest", new GenericType<TimeseriesWidgetRumRequest>() {});
    schemas.put(
        "TimeseriesWidgetSecurityRequest", new GenericType<TimeseriesWidgetSecurityRequest>() {});
    schemas.put(
        "TimeseriesWidgetComplianceFindingsRequest",
        new GenericType<TimeseriesWidgetComplianceFindingsRequest>() {});
    schemas.put("TimeseriesWidgetEventRequest", new GenericType<TimeseriesWidgetEventRequest>() {});
    schemas.put(
        "TimeseriesWidgetProfilingMetricsRequest",
        new GenericType<TimeseriesWidgetProfilingMetricsRequest>() {});
    schemas.put(
        "TimeseriesWidgetCiPipelineRequest",
        new GenericType<TimeseriesWidgetCiPipelineRequest>() {});
    schemas.put(
        "TimeseriesWidgetCiTestRequest", new GenericType<TimeseriesWidgetCiTestRequest>() {});
    schemas.put("TimeseriesWidgetAuditRequest", new GenericType<TimeseriesWidgetAuditRequest>() {});
    schemas.put(
        "TimeseriesWidgetAppsecSpanRequest",
        new GenericType<TimeseriesWidgetAppsecSpanRequest>() {});
    schemas.put(
        "TimeseriesWidgetSyntheticsBatchesRequest",
        new GenericType<TimeseriesWidgetSyntheticsBatchesRequest>() {});
    schemas.put(
        "TimeseriesWidgetSyntheticsTestRunsRequest",
        new GenericType<TimeseriesWidgetSyntheticsTestRunsRequest>() {});
    schemas.put(
        "TimeseriesWidgetProcessRequest", new GenericType<TimeseriesWidgetProcessRequest>() {});
    schemas.put(
        "TimeseriesWidgetLegacyProfileMetricsRequest",
        new GenericType<TimeseriesWidgetLegacyProfileMetricsRequest>() {});
    schemas.put(
        "TimeseriesWidgetLegacyEventRequest",
        new GenericType<TimeseriesWidgetLegacyEventRequest>() {});
    schemas.put("TimeseriesWidgetDdsqlRequest", new GenericType<TimeseriesWidgetDdsqlRequest>() {});
    schemas.put(
        "TimeseriesWidgetAdvancedQueryRequest",
        new GenericType<TimeseriesWidgetAdvancedQueryRequest>() {});
    schemas.put(
        "TimeseriesWidgetLocalDatasetRequest",
        new GenericType<TimeseriesWidgetLocalDatasetRequest>() {});
    JSON.registerDescendants(TimeseriesWidgetRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TimeseriesWidgetRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TimeseriesWidgetFormulaRequest, TimeseriesWidgetMetricRequest,
   * TimeseriesWidgetLogRequest, TimeseriesWidgetApmRequest, TimeseriesWidgetNetworkRequest,
   * TimeseriesWidgetRumRequest, TimeseriesWidgetSecurityRequest,
   * TimeseriesWidgetComplianceFindingsRequest, TimeseriesWidgetEventRequest,
   * TimeseriesWidgetProfilingMetricsRequest, TimeseriesWidgetCiPipelineRequest,
   * TimeseriesWidgetCiTestRequest, TimeseriesWidgetAuditRequest, TimeseriesWidgetAppsecSpanRequest,
   * TimeseriesWidgetSyntheticsBatchesRequest, TimeseriesWidgetSyntheticsTestRunsRequest,
   * TimeseriesWidgetProcessRequest, TimeseriesWidgetLegacyProfileMetricsRequest,
   * TimeseriesWidgetLegacyEventRequest, TimeseriesWidgetDdsqlRequest,
   * TimeseriesWidgetAdvancedQueryRequest, TimeseriesWidgetLocalDatasetRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TimeseriesWidgetFormulaRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetMetricRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetLogRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetApmRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetNetworkRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetRumRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetSecurityRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetComplianceFindingsRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetEventRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetProfilingMetricsRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetCiPipelineRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetCiTestRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetAuditRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetAppsecSpanRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetSyntheticsBatchesRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetSyntheticsTestRunsRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetProcessRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetLegacyProfileMetricsRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetLegacyEventRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetDdsqlRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetAdvancedQueryRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetLocalDatasetRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TimeseriesWidgetFormulaRequest,"
            + " TimeseriesWidgetMetricRequest, TimeseriesWidgetLogRequest,"
            + " TimeseriesWidgetApmRequest, TimeseriesWidgetNetworkRequest,"
            + " TimeseriesWidgetRumRequest, TimeseriesWidgetSecurityRequest,"
            + " TimeseriesWidgetComplianceFindingsRequest, TimeseriesWidgetEventRequest,"
            + " TimeseriesWidgetProfilingMetricsRequest, TimeseriesWidgetCiPipelineRequest,"
            + " TimeseriesWidgetCiTestRequest, TimeseriesWidgetAuditRequest,"
            + " TimeseriesWidgetAppsecSpanRequest, TimeseriesWidgetSyntheticsBatchesRequest,"
            + " TimeseriesWidgetSyntheticsTestRunsRequest, TimeseriesWidgetProcessRequest,"
            + " TimeseriesWidgetLegacyProfileMetricsRequest, TimeseriesWidgetLegacyEventRequest,"
            + " TimeseriesWidgetDdsqlRequest, TimeseriesWidgetAdvancedQueryRequest,"
            + " TimeseriesWidgetLocalDatasetRequest");
  }

  /**
   * Get the actual instance, which can be the following: TimeseriesWidgetFormulaRequest,
   * TimeseriesWidgetMetricRequest, TimeseriesWidgetLogRequest, TimeseriesWidgetApmRequest,
   * TimeseriesWidgetNetworkRequest, TimeseriesWidgetRumRequest, TimeseriesWidgetSecurityRequest,
   * TimeseriesWidgetComplianceFindingsRequest, TimeseriesWidgetEventRequest,
   * TimeseriesWidgetProfilingMetricsRequest, TimeseriesWidgetCiPipelineRequest,
   * TimeseriesWidgetCiTestRequest, TimeseriesWidgetAuditRequest, TimeseriesWidgetAppsecSpanRequest,
   * TimeseriesWidgetSyntheticsBatchesRequest, TimeseriesWidgetSyntheticsTestRunsRequest,
   * TimeseriesWidgetProcessRequest, TimeseriesWidgetLegacyProfileMetricsRequest,
   * TimeseriesWidgetLegacyEventRequest, TimeseriesWidgetDdsqlRequest,
   * TimeseriesWidgetAdvancedQueryRequest, TimeseriesWidgetLocalDatasetRequest
   *
   * @return The actual instance (TimeseriesWidgetFormulaRequest, TimeseriesWidgetMetricRequest,
   *     TimeseriesWidgetLogRequest, TimeseriesWidgetApmRequest, TimeseriesWidgetNetworkRequest,
   *     TimeseriesWidgetRumRequest, TimeseriesWidgetSecurityRequest,
   *     TimeseriesWidgetComplianceFindingsRequest, TimeseriesWidgetEventRequest,
   *     TimeseriesWidgetProfilingMetricsRequest, TimeseriesWidgetCiPipelineRequest,
   *     TimeseriesWidgetCiTestRequest, TimeseriesWidgetAuditRequest,
   *     TimeseriesWidgetAppsecSpanRequest, TimeseriesWidgetSyntheticsBatchesRequest,
   *     TimeseriesWidgetSyntheticsTestRunsRequest, TimeseriesWidgetProcessRequest,
   *     TimeseriesWidgetLegacyProfileMetricsRequest, TimeseriesWidgetLegacyEventRequest,
   *     TimeseriesWidgetDdsqlRequest, TimeseriesWidgetAdvancedQueryRequest,
   *     TimeseriesWidgetLocalDatasetRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetFormulaRequest`. If the actual instance is not
   * `TimeseriesWidgetFormulaRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetFormulaRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetFormulaRequest`
   */
  public TimeseriesWidgetFormulaRequest getTimeseriesWidgetFormulaRequest()
      throws ClassCastException {
    return (TimeseriesWidgetFormulaRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetMetricRequest`. If the actual instance is not
   * `TimeseriesWidgetMetricRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetMetricRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetMetricRequest`
   */
  public TimeseriesWidgetMetricRequest getTimeseriesWidgetMetricRequest()
      throws ClassCastException {
    return (TimeseriesWidgetMetricRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetLogRequest`. If the actual instance is not
   * `TimeseriesWidgetLogRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetLogRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetLogRequest`
   */
  public TimeseriesWidgetLogRequest getTimeseriesWidgetLogRequest() throws ClassCastException {
    return (TimeseriesWidgetLogRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetApmRequest`. If the actual instance is not
   * `TimeseriesWidgetApmRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetApmRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetApmRequest`
   */
  public TimeseriesWidgetApmRequest getTimeseriesWidgetApmRequest() throws ClassCastException {
    return (TimeseriesWidgetApmRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetNetworkRequest`. If the actual instance is not
   * `TimeseriesWidgetNetworkRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetNetworkRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetNetworkRequest`
   */
  public TimeseriesWidgetNetworkRequest getTimeseriesWidgetNetworkRequest()
      throws ClassCastException {
    return (TimeseriesWidgetNetworkRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetRumRequest`. If the actual instance is not
   * `TimeseriesWidgetRumRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetRumRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetRumRequest`
   */
  public TimeseriesWidgetRumRequest getTimeseriesWidgetRumRequest() throws ClassCastException {
    return (TimeseriesWidgetRumRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetSecurityRequest`. If the actual instance is not
   * `TimeseriesWidgetSecurityRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetSecurityRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetSecurityRequest`
   */
  public TimeseriesWidgetSecurityRequest getTimeseriesWidgetSecurityRequest()
      throws ClassCastException {
    return (TimeseriesWidgetSecurityRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetComplianceFindingsRequest`. If the actual instance
   * is not `TimeseriesWidgetComplianceFindingsRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetComplianceFindingsRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetComplianceFindingsRequest`
   */
  public TimeseriesWidgetComplianceFindingsRequest getTimeseriesWidgetComplianceFindingsRequest()
      throws ClassCastException {
    return (TimeseriesWidgetComplianceFindingsRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetEventRequest`. If the actual instance is not
   * `TimeseriesWidgetEventRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetEventRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetEventRequest`
   */
  public TimeseriesWidgetEventRequest getTimeseriesWidgetEventRequest() throws ClassCastException {
    return (TimeseriesWidgetEventRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetProfilingMetricsRequest`. If the actual instance is
   * not `TimeseriesWidgetProfilingMetricsRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetProfilingMetricsRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetProfilingMetricsRequest`
   */
  public TimeseriesWidgetProfilingMetricsRequest getTimeseriesWidgetProfilingMetricsRequest()
      throws ClassCastException {
    return (TimeseriesWidgetProfilingMetricsRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetCiPipelineRequest`. If the actual instance is not
   * `TimeseriesWidgetCiPipelineRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetCiPipelineRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetCiPipelineRequest`
   */
  public TimeseriesWidgetCiPipelineRequest getTimeseriesWidgetCiPipelineRequest()
      throws ClassCastException {
    return (TimeseriesWidgetCiPipelineRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetCiTestRequest`. If the actual instance is not
   * `TimeseriesWidgetCiTestRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetCiTestRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetCiTestRequest`
   */
  public TimeseriesWidgetCiTestRequest getTimeseriesWidgetCiTestRequest()
      throws ClassCastException {
    return (TimeseriesWidgetCiTestRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetAuditRequest`. If the actual instance is not
   * `TimeseriesWidgetAuditRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetAuditRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetAuditRequest`
   */
  public TimeseriesWidgetAuditRequest getTimeseriesWidgetAuditRequest() throws ClassCastException {
    return (TimeseriesWidgetAuditRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetAppsecSpanRequest`. If the actual instance is not
   * `TimeseriesWidgetAppsecSpanRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetAppsecSpanRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetAppsecSpanRequest`
   */
  public TimeseriesWidgetAppsecSpanRequest getTimeseriesWidgetAppsecSpanRequest()
      throws ClassCastException {
    return (TimeseriesWidgetAppsecSpanRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetSyntheticsBatchesRequest`. If the actual instance
   * is not `TimeseriesWidgetSyntheticsBatchesRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetSyntheticsBatchesRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetSyntheticsBatchesRequest`
   */
  public TimeseriesWidgetSyntheticsBatchesRequest getTimeseriesWidgetSyntheticsBatchesRequest()
      throws ClassCastException {
    return (TimeseriesWidgetSyntheticsBatchesRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetSyntheticsTestRunsRequest`. If the actual instance
   * is not `TimeseriesWidgetSyntheticsTestRunsRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetSyntheticsTestRunsRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetSyntheticsTestRunsRequest`
   */
  public TimeseriesWidgetSyntheticsTestRunsRequest getTimeseriesWidgetSyntheticsTestRunsRequest()
      throws ClassCastException {
    return (TimeseriesWidgetSyntheticsTestRunsRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetProcessRequest`. If the actual instance is not
   * `TimeseriesWidgetProcessRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetProcessRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetProcessRequest`
   */
  public TimeseriesWidgetProcessRequest getTimeseriesWidgetProcessRequest()
      throws ClassCastException {
    return (TimeseriesWidgetProcessRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetLegacyProfileMetricsRequest`. If the actual
   * instance is not `TimeseriesWidgetLegacyProfileMetricsRequest`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TimeseriesWidgetLegacyProfileMetricsRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetLegacyProfileMetricsRequest`
   */
  public TimeseriesWidgetLegacyProfileMetricsRequest
      getTimeseriesWidgetLegacyProfileMetricsRequest() throws ClassCastException {
    return (TimeseriesWidgetLegacyProfileMetricsRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetLegacyEventRequest`. If the actual instance is not
   * `TimeseriesWidgetLegacyEventRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetLegacyEventRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetLegacyEventRequest`
   */
  public TimeseriesWidgetLegacyEventRequest getTimeseriesWidgetLegacyEventRequest()
      throws ClassCastException {
    return (TimeseriesWidgetLegacyEventRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetDdsqlRequest`. If the actual instance is not
   * `TimeseriesWidgetDdsqlRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetDdsqlRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetDdsqlRequest`
   */
  public TimeseriesWidgetDdsqlRequest getTimeseriesWidgetDdsqlRequest() throws ClassCastException {
    return (TimeseriesWidgetDdsqlRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetAdvancedQueryRequest`. If the actual instance is
   * not `TimeseriesWidgetAdvancedQueryRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetAdvancedQueryRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetAdvancedQueryRequest`
   */
  public TimeseriesWidgetAdvancedQueryRequest getTimeseriesWidgetAdvancedQueryRequest()
      throws ClassCastException {
    return (TimeseriesWidgetAdvancedQueryRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetLocalDatasetRequest`. If the actual instance is not
   * `TimeseriesWidgetLocalDatasetRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetLocalDatasetRequest`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetLocalDatasetRequest`
   */
  public TimeseriesWidgetLocalDatasetRequest getTimeseriesWidgetLocalDatasetRequest()
      throws ClassCastException {
    return (TimeseriesWidgetLocalDatasetRequest) super.getActualInstance();
  }
}
