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
@JsonDeserialize(using = DashboardBackendWidget.DashboardBackendWidgetDeserializer.class)
@JsonSerialize(using = DashboardBackendWidget.DashboardBackendWidgetSerializer.class)
public class DashboardBackendWidget extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(DashboardBackendWidget.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DashboardBackendWidgetSerializer
      extends StdSerializer<DashboardBackendWidget> {
    public DashboardBackendWidgetSerializer(Class<DashboardBackendWidget> t) {
      super(t);
    }

    public DashboardBackendWidgetSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardBackendWidget value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DashboardBackendWidgetDeserializer
      extends StdDeserializer<DashboardBackendWidget> {
    public DashboardBackendWidgetDeserializer() {
      this(DashboardBackendWidget.class);
    }

    public DashboardBackendWidgetDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DashboardBackendWidget deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AlertGraphBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AlertGraphBackendWidget.class.equals(Integer.class)
            || AlertGraphBackendWidget.class.equals(Long.class)
            || AlertGraphBackendWidget.class.equals(Float.class)
            || AlertGraphBackendWidget.class.equals(Double.class)
            || AlertGraphBackendWidget.class.equals(Boolean.class)
            || AlertGraphBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AlertGraphBackendWidget.class.equals(Integer.class)
                        || AlertGraphBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AlertGraphBackendWidget.class.equals(Float.class)
                        || AlertGraphBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AlertGraphBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AlertGraphBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AlertGraphBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AlertGraphBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AlertGraphBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AlertGraphBackendWidget'", e);
      }

      // deserialize AlertValueBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AlertValueBackendWidget.class.equals(Integer.class)
            || AlertValueBackendWidget.class.equals(Long.class)
            || AlertValueBackendWidget.class.equals(Float.class)
            || AlertValueBackendWidget.class.equals(Double.class)
            || AlertValueBackendWidget.class.equals(Boolean.class)
            || AlertValueBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AlertValueBackendWidget.class.equals(Integer.class)
                        || AlertValueBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AlertValueBackendWidget.class.equals(Float.class)
                        || AlertValueBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AlertValueBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AlertValueBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AlertValueBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AlertValueBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AlertValueBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AlertValueBackendWidget'", e);
      }

      // deserialize BarChartBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendWidget.class.equals(Integer.class)
            || BarChartBackendWidget.class.equals(Long.class)
            || BarChartBackendWidget.class.equals(Float.class)
            || BarChartBackendWidget.class.equals(Double.class)
            || BarChartBackendWidget.class.equals(Boolean.class)
            || BarChartBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendWidget.class.equals(Integer.class)
                        || BarChartBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendWidget.class.equals(Float.class)
                        || BarChartBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(BarChartBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'BarChartBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'BarChartBackendWidget'", e);
      }

      // deserialize ChangeBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeBackendWidget.class.equals(Integer.class)
            || ChangeBackendWidget.class.equals(Long.class)
            || ChangeBackendWidget.class.equals(Float.class)
            || ChangeBackendWidget.class.equals(Double.class)
            || ChangeBackendWidget.class.equals(Boolean.class)
            || ChangeBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeBackendWidget.class.equals(Integer.class)
                        || ChangeBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeBackendWidget.class.equals(Float.class)
                        || ChangeBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ChangeBackendWidget'", e);
      }

      // deserialize CheckStatusBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CheckStatusBackendWidget.class.equals(Integer.class)
            || CheckStatusBackendWidget.class.equals(Long.class)
            || CheckStatusBackendWidget.class.equals(Float.class)
            || CheckStatusBackendWidget.class.equals(Double.class)
            || CheckStatusBackendWidget.class.equals(Boolean.class)
            || CheckStatusBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CheckStatusBackendWidget.class.equals(Integer.class)
                        || CheckStatusBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CheckStatusBackendWidget.class.equals(Float.class)
                        || CheckStatusBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CheckStatusBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CheckStatusBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CheckStatusBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CheckStatusBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CheckStatusBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CheckStatusBackendWidget'", e);
      }

      // deserialize CohortBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CohortBackendWidget.class.equals(Integer.class)
            || CohortBackendWidget.class.equals(Long.class)
            || CohortBackendWidget.class.equals(Float.class)
            || CohortBackendWidget.class.equals(Double.class)
            || CohortBackendWidget.class.equals(Boolean.class)
            || CohortBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CohortBackendWidget.class.equals(Integer.class)
                        || CohortBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CohortBackendWidget.class.equals(Float.class)
                        || CohortBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CohortBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CohortBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CohortBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CohortBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CohortBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CohortBackendWidget'", e);
      }

      // deserialize DistributionBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendWidget.class.equals(Integer.class)
            || DistributionBackendWidget.class.equals(Long.class)
            || DistributionBackendWidget.class.equals(Float.class)
            || DistributionBackendWidget.class.equals(Double.class)
            || DistributionBackendWidget.class.equals(Boolean.class)
            || DistributionBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendWidget.class.equals(Integer.class)
                        || DistributionBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendWidget.class.equals(Float.class)
                        || DistributionBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DistributionBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DistributionBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DistributionBackendWidget'", e);
      }

      // deserialize EmbeddedAppBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EmbeddedAppBackendWidget.class.equals(Integer.class)
            || EmbeddedAppBackendWidget.class.equals(Long.class)
            || EmbeddedAppBackendWidget.class.equals(Float.class)
            || EmbeddedAppBackendWidget.class.equals(Double.class)
            || EmbeddedAppBackendWidget.class.equals(Boolean.class)
            || EmbeddedAppBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EmbeddedAppBackendWidget.class.equals(Integer.class)
                        || EmbeddedAppBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EmbeddedAppBackendWidget.class.equals(Float.class)
                        || EmbeddedAppBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EmbeddedAppBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EmbeddedAppBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EmbeddedAppBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EmbeddedAppBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EmbeddedAppBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EmbeddedAppBackendWidget'", e);
      }

      // deserialize EventStream
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventStream.class.equals(Integer.class)
            || EventStream.class.equals(Long.class)
            || EventStream.class.equals(Float.class)
            || EventStream.class.equals(Double.class)
            || EventStream.class.equals(Boolean.class)
            || EventStream.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventStream.class.equals(Integer.class) || EventStream.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventStream.class.equals(Float.class) || EventStream.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventStream.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventStream.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventStream.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventStream) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventStream'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventStream'", e);
      }

      // deserialize EventTimelineBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventTimelineBackendWidget.class.equals(Integer.class)
            || EventTimelineBackendWidget.class.equals(Long.class)
            || EventTimelineBackendWidget.class.equals(Float.class)
            || EventTimelineBackendWidget.class.equals(Double.class)
            || EventTimelineBackendWidget.class.equals(Boolean.class)
            || EventTimelineBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventTimelineBackendWidget.class.equals(Integer.class)
                        || EventTimelineBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventTimelineBackendWidget.class.equals(Float.class)
                        || EventTimelineBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventTimelineBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventTimelineBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventTimelineBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventTimelineBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventTimelineBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventTimelineBackendWidget'", e);
      }

      // deserialize FreeTextBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FreeTextBackendWidget.class.equals(Integer.class)
            || FreeTextBackendWidget.class.equals(Long.class)
            || FreeTextBackendWidget.class.equals(Float.class)
            || FreeTextBackendWidget.class.equals(Double.class)
            || FreeTextBackendWidget.class.equals(Boolean.class)
            || FreeTextBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FreeTextBackendWidget.class.equals(Integer.class)
                        || FreeTextBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FreeTextBackendWidget.class.equals(Float.class)
                        || FreeTextBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FreeTextBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FreeTextBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FreeTextBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FreeTextBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FreeTextBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FreeTextBackendWidget'", e);
      }

      // deserialize FunnelBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FunnelBackendWidget.class.equals(Integer.class)
            || FunnelBackendWidget.class.equals(Long.class)
            || FunnelBackendWidget.class.equals(Float.class)
            || FunnelBackendWidget.class.equals(Double.class)
            || FunnelBackendWidget.class.equals(Boolean.class)
            || FunnelBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FunnelBackendWidget.class.equals(Integer.class)
                        || FunnelBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FunnelBackendWidget.class.equals(Float.class)
                        || FunnelBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FunnelBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FunnelBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FunnelBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FunnelBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FunnelBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FunnelBackendWidget'", e);
      }

      // deserialize GeomapBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendWidget.class.equals(Integer.class)
            || GeomapBackendWidget.class.equals(Long.class)
            || GeomapBackendWidget.class.equals(Float.class)
            || GeomapBackendWidget.class.equals(Double.class)
            || GeomapBackendWidget.class.equals(Boolean.class)
            || GeomapBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendWidget.class.equals(Integer.class)
                        || GeomapBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendWidget.class.equals(Float.class)
                        || GeomapBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GeomapBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GeomapBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GeomapBackendWidget'", e);
      }

      // deserialize GroupBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GroupBackendWidget.class.equals(Integer.class)
            || GroupBackendWidget.class.equals(Long.class)
            || GroupBackendWidget.class.equals(Float.class)
            || GroupBackendWidget.class.equals(Double.class)
            || GroupBackendWidget.class.equals(Boolean.class)
            || GroupBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GroupBackendWidget.class.equals(Integer.class)
                        || GroupBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GroupBackendWidget.class.equals(Float.class)
                        || GroupBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GroupBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GroupBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GroupBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GroupBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GroupBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GroupBackendWidget'", e);
      }

      // deserialize HeatgridBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridBackendWidget.class.equals(Integer.class)
            || HeatgridBackendWidget.class.equals(Long.class)
            || HeatgridBackendWidget.class.equals(Float.class)
            || HeatgridBackendWidget.class.equals(Double.class)
            || HeatgridBackendWidget.class.equals(Boolean.class)
            || HeatgridBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridBackendWidget.class.equals(Integer.class)
                        || HeatgridBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridBackendWidget.class.equals(Float.class)
                        || HeatgridBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridBackendWidget'", e);
      }

      // deserialize HeatmapBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatmapBackendWidget.class.equals(Integer.class)
            || HeatmapBackendWidget.class.equals(Long.class)
            || HeatmapBackendWidget.class.equals(Float.class)
            || HeatmapBackendWidget.class.equals(Double.class)
            || HeatmapBackendWidget.class.equals(Boolean.class)
            || HeatmapBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatmapBackendWidget.class.equals(Integer.class)
                        || HeatmapBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatmapBackendWidget.class.equals(Float.class)
                        || HeatmapBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatmapBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatmapBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatmapBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatmapBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatmapBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatmapBackendWidget'", e);
      }

      // deserialize HostmapBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HostmapBackendWidget.class.equals(Integer.class)
            || HostmapBackendWidget.class.equals(Long.class)
            || HostmapBackendWidget.class.equals(Float.class)
            || HostmapBackendWidget.class.equals(Double.class)
            || HostmapBackendWidget.class.equals(Boolean.class)
            || HostmapBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HostmapBackendWidget.class.equals(Integer.class)
                        || HostmapBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HostmapBackendWidget.class.equals(Float.class)
                        || HostmapBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HostmapBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HostmapBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HostmapBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HostmapBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HostmapBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HostmapBackendWidget'", e);
      }

      // deserialize IframeBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IframeBackendWidget.class.equals(Integer.class)
            || IframeBackendWidget.class.equals(Long.class)
            || IframeBackendWidget.class.equals(Float.class)
            || IframeBackendWidget.class.equals(Double.class)
            || IframeBackendWidget.class.equals(Boolean.class)
            || IframeBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IframeBackendWidget.class.equals(Integer.class)
                        || IframeBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IframeBackendWidget.class.equals(Float.class)
                        || IframeBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IframeBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IframeBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IframeBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IframeBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IframeBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IframeBackendWidget'", e);
      }

      // deserialize ImageBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ImageBackendWidget.class.equals(Integer.class)
            || ImageBackendWidget.class.equals(Long.class)
            || ImageBackendWidget.class.equals(Float.class)
            || ImageBackendWidget.class.equals(Double.class)
            || ImageBackendWidget.class.equals(Boolean.class)
            || ImageBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ImageBackendWidget.class.equals(Integer.class)
                        || ImageBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ImageBackendWidget.class.equals(Float.class)
                        || ImageBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ImageBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ImageBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ImageBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ImageBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ImageBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ImageBackendWidget'", e);
      }

      // deserialize JourneyMapBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (JourneyMapBackendWidget.class.equals(Integer.class)
            || JourneyMapBackendWidget.class.equals(Long.class)
            || JourneyMapBackendWidget.class.equals(Float.class)
            || JourneyMapBackendWidget.class.equals(Double.class)
            || JourneyMapBackendWidget.class.equals(Boolean.class)
            || JourneyMapBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((JourneyMapBackendWidget.class.equals(Integer.class)
                        || JourneyMapBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((JourneyMapBackendWidget.class.equals(Float.class)
                        || JourneyMapBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (JourneyMapBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (JourneyMapBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(JourneyMapBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((JourneyMapBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'JourneyMapBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'JourneyMapBackendWidget'", e);
      }

      // deserialize ListStreamBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ListStreamBackendWidget.class.equals(Integer.class)
            || ListStreamBackendWidget.class.equals(Long.class)
            || ListStreamBackendWidget.class.equals(Float.class)
            || ListStreamBackendWidget.class.equals(Double.class)
            || ListStreamBackendWidget.class.equals(Boolean.class)
            || ListStreamBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ListStreamBackendWidget.class.equals(Integer.class)
                        || ListStreamBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ListStreamBackendWidget.class.equals(Float.class)
                        || ListStreamBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ListStreamBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ListStreamBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ListStreamBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ListStreamBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ListStreamBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ListStreamBackendWidget'", e);
      }

      // deserialize LogStream
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogStream.class.equals(Integer.class)
            || LogStream.class.equals(Long.class)
            || LogStream.class.equals(Float.class)
            || LogStream.class.equals(Double.class)
            || LogStream.class.equals(Boolean.class)
            || LogStream.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogStream.class.equals(Integer.class) || LogStream.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogStream.class.equals(Float.class) || LogStream.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogStream.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogStream.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogStream.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogStream) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogStream'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogStream'", e);
      }

      // deserialize ManageStatusBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ManageStatusBackendWidget.class.equals(Integer.class)
            || ManageStatusBackendWidget.class.equals(Long.class)
            || ManageStatusBackendWidget.class.equals(Float.class)
            || ManageStatusBackendWidget.class.equals(Double.class)
            || ManageStatusBackendWidget.class.equals(Boolean.class)
            || ManageStatusBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ManageStatusBackendWidget.class.equals(Integer.class)
                        || ManageStatusBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ManageStatusBackendWidget.class.equals(Float.class)
                        || ManageStatusBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ManageStatusBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ManageStatusBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ManageStatusBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ManageStatusBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ManageStatusBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ManageStatusBackendWidget'", e);
      }

      // deserialize NoteBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NoteBackendWidget.class.equals(Integer.class)
            || NoteBackendWidget.class.equals(Long.class)
            || NoteBackendWidget.class.equals(Float.class)
            || NoteBackendWidget.class.equals(Double.class)
            || NoteBackendWidget.class.equals(Boolean.class)
            || NoteBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NoteBackendWidget.class.equals(Integer.class)
                        || NoteBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NoteBackendWidget.class.equals(Float.class)
                        || NoteBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NoteBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NoteBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NoteBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NoteBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NoteBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NoteBackendWidget'", e);
      }

      // deserialize PointPlotBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PointPlotBackendWidget.class.equals(Integer.class)
            || PointPlotBackendWidget.class.equals(Long.class)
            || PointPlotBackendWidget.class.equals(Float.class)
            || PointPlotBackendWidget.class.equals(Double.class)
            || PointPlotBackendWidget.class.equals(Boolean.class)
            || PointPlotBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PointPlotBackendWidget.class.equals(Integer.class)
                        || PointPlotBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PointPlotBackendWidget.class.equals(Float.class)
                        || PointPlotBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PointPlotBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PointPlotBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PointPlotBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PointPlotBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PointPlotBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PointPlotBackendWidget'", e);
      }

      // deserialize PowerpackBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PowerpackBackendWidget.class.equals(Integer.class)
            || PowerpackBackendWidget.class.equals(Long.class)
            || PowerpackBackendWidget.class.equals(Float.class)
            || PowerpackBackendWidget.class.equals(Double.class)
            || PowerpackBackendWidget.class.equals(Boolean.class)
            || PowerpackBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PowerpackBackendWidget.class.equals(Integer.class)
                        || PowerpackBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PowerpackBackendWidget.class.equals(Float.class)
                        || PowerpackBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PowerpackBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PowerpackBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PowerpackBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PowerpackBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PowerpackBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PowerpackBackendWidget'", e);
      }

      // deserialize QueryTableBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendWidget.class.equals(Integer.class)
            || QueryTableBackendWidget.class.equals(Long.class)
            || QueryTableBackendWidget.class.equals(Float.class)
            || QueryTableBackendWidget.class.equals(Double.class)
            || QueryTableBackendWidget.class.equals(Boolean.class)
            || QueryTableBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendWidget.class.equals(Integer.class)
                        || QueryTableBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendWidget.class.equals(Float.class)
                        || QueryTableBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryTableBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryTableBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryTableBackendWidget'", e);
      }

      // deserialize QueryValueBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendWidget.class.equals(Integer.class)
            || QueryValueBackendWidget.class.equals(Long.class)
            || QueryValueBackendWidget.class.equals(Float.class)
            || QueryValueBackendWidget.class.equals(Double.class)
            || QueryValueBackendWidget.class.equals(Boolean.class)
            || QueryValueBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendWidget.class.equals(Integer.class)
                        || QueryValueBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendWidget.class.equals(Float.class)
                        || QueryValueBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryValueBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryValueBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryValueBackendWidget'", e);
      }

      // deserialize RetentionCurveBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RetentionCurveBackendWidget.class.equals(Integer.class)
            || RetentionCurveBackendWidget.class.equals(Long.class)
            || RetentionCurveBackendWidget.class.equals(Float.class)
            || RetentionCurveBackendWidget.class.equals(Double.class)
            || RetentionCurveBackendWidget.class.equals(Boolean.class)
            || RetentionCurveBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RetentionCurveBackendWidget.class.equals(Integer.class)
                        || RetentionCurveBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RetentionCurveBackendWidget.class.equals(Float.class)
                        || RetentionCurveBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RetentionCurveBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RetentionCurveBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RetentionCurveBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RetentionCurveBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RetentionCurveBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RetentionCurveBackendWidget'", e);
      }

      // deserialize RunWorkflowBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RunWorkflowBackendWidget.class.equals(Integer.class)
            || RunWorkflowBackendWidget.class.equals(Long.class)
            || RunWorkflowBackendWidget.class.equals(Float.class)
            || RunWorkflowBackendWidget.class.equals(Double.class)
            || RunWorkflowBackendWidget.class.equals(Boolean.class)
            || RunWorkflowBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RunWorkflowBackendWidget.class.equals(Integer.class)
                        || RunWorkflowBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RunWorkflowBackendWidget.class.equals(Float.class)
                        || RunWorkflowBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RunWorkflowBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RunWorkflowBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RunWorkflowBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RunWorkflowBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RunWorkflowBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RunWorkflowBackendWidget'", e);
      }

      // deserialize SankeyBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SankeyBackendWidget.class.equals(Integer.class)
            || SankeyBackendWidget.class.equals(Long.class)
            || SankeyBackendWidget.class.equals(Float.class)
            || SankeyBackendWidget.class.equals(Double.class)
            || SankeyBackendWidget.class.equals(Boolean.class)
            || SankeyBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SankeyBackendWidget.class.equals(Integer.class)
                        || SankeyBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SankeyBackendWidget.class.equals(Float.class)
                        || SankeyBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SankeyBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SankeyBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SankeyBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SankeyBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SankeyBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SankeyBackendWidget'", e);
      }

      // deserialize ScatterplotBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendWidget.class.equals(Integer.class)
            || ScatterplotBackendWidget.class.equals(Long.class)
            || ScatterplotBackendWidget.class.equals(Float.class)
            || ScatterplotBackendWidget.class.equals(Double.class)
            || ScatterplotBackendWidget.class.equals(Boolean.class)
            || ScatterplotBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendWidget.class.equals(Integer.class)
                        || ScatterplotBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendWidget.class.equals(Float.class)
                        || ScatterplotBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScatterplotBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScatterplotBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScatterplotBackendWidget'", e);
      }

      // deserialize ServiceMapBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceMapBackendWidget.class.equals(Integer.class)
            || ServiceMapBackendWidget.class.equals(Long.class)
            || ServiceMapBackendWidget.class.equals(Float.class)
            || ServiceMapBackendWidget.class.equals(Double.class)
            || ServiceMapBackendWidget.class.equals(Boolean.class)
            || ServiceMapBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceMapBackendWidget.class.equals(Integer.class)
                        || ServiceMapBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceMapBackendWidget.class.equals(Float.class)
                        || ServiceMapBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceMapBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceMapBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceMapBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceMapBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceMapBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceMapBackendWidget'", e);
      }

      // deserialize SloBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SloBackendWidget.class.equals(Integer.class)
            || SloBackendWidget.class.equals(Long.class)
            || SloBackendWidget.class.equals(Float.class)
            || SloBackendWidget.class.equals(Double.class)
            || SloBackendWidget.class.equals(Boolean.class)
            || SloBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SloBackendWidget.class.equals(Integer.class)
                        || SloBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SloBackendWidget.class.equals(Float.class)
                        || SloBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SloBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SloBackendWidget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SloBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SloBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SloBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SloBackendWidget'", e);
      }

      // deserialize SloListBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SloListBackendWidget.class.equals(Integer.class)
            || SloListBackendWidget.class.equals(Long.class)
            || SloListBackendWidget.class.equals(Float.class)
            || SloListBackendWidget.class.equals(Double.class)
            || SloListBackendWidget.class.equals(Boolean.class)
            || SloListBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SloListBackendWidget.class.equals(Integer.class)
                        || SloListBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SloListBackendWidget.class.equals(Float.class)
                        || SloListBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SloListBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SloListBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SloListBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SloListBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SloListBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SloListBackendWidget'", e);
      }

      // deserialize SplitGroupBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SplitGroupBackendWidget.class.equals(Integer.class)
            || SplitGroupBackendWidget.class.equals(Long.class)
            || SplitGroupBackendWidget.class.equals(Float.class)
            || SplitGroupBackendWidget.class.equals(Double.class)
            || SplitGroupBackendWidget.class.equals(Boolean.class)
            || SplitGroupBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SplitGroupBackendWidget.class.equals(Integer.class)
                        || SplitGroupBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SplitGroupBackendWidget.class.equals(Float.class)
                        || SplitGroupBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SplitGroupBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SplitGroupBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SplitGroupBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SplitGroupBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SplitGroupBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SplitGroupBackendWidget'", e);
      }

      // deserialize SunburstBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstBackendWidget.class.equals(Integer.class)
            || SunburstBackendWidget.class.equals(Long.class)
            || SunburstBackendWidget.class.equals(Float.class)
            || SunburstBackendWidget.class.equals(Double.class)
            || SunburstBackendWidget.class.equals(Boolean.class)
            || SunburstBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstBackendWidget.class.equals(Integer.class)
                        || SunburstBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstBackendWidget.class.equals(Float.class)
                        || SunburstBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SunburstBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SunburstBackendWidget'", e);
      }

      // deserialize TimeseriesBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesBackendWidget.class.equals(Integer.class)
            || TimeseriesBackendWidget.class.equals(Long.class)
            || TimeseriesBackendWidget.class.equals(Float.class)
            || TimeseriesBackendWidget.class.equals(Double.class)
            || TimeseriesBackendWidget.class.equals(Boolean.class)
            || TimeseriesBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesBackendWidget.class.equals(Integer.class)
                        || TimeseriesBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesBackendWidget.class.equals(Float.class)
                        || TimeseriesBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesBackendWidget'", e);
      }

      // deserialize ToplistBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendWidget.class.equals(Integer.class)
            || ToplistBackendWidget.class.equals(Long.class)
            || ToplistBackendWidget.class.equals(Float.class)
            || ToplistBackendWidget.class.equals(Double.class)
            || ToplistBackendWidget.class.equals(Boolean.class)
            || ToplistBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendWidget.class.equals(Integer.class)
                        || ToplistBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendWidget.class.equals(Float.class)
                        || ToplistBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ToplistBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ToplistBackendWidget'", e);
      }

      // deserialize TopologyMapBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TopologyMapBackendWidget.class.equals(Integer.class)
            || TopologyMapBackendWidget.class.equals(Long.class)
            || TopologyMapBackendWidget.class.equals(Float.class)
            || TopologyMapBackendWidget.class.equals(Double.class)
            || TopologyMapBackendWidget.class.equals(Boolean.class)
            || TopologyMapBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TopologyMapBackendWidget.class.equals(Integer.class)
                        || TopologyMapBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TopologyMapBackendWidget.class.equals(Float.class)
                        || TopologyMapBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TopologyMapBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TopologyMapBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TopologyMapBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TopologyMapBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TopologyMapBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TopologyMapBackendWidget'", e);
      }

      // deserialize ServiceSummaryBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceSummaryBackendWidget.class.equals(Integer.class)
            || ServiceSummaryBackendWidget.class.equals(Long.class)
            || ServiceSummaryBackendWidget.class.equals(Float.class)
            || ServiceSummaryBackendWidget.class.equals(Double.class)
            || ServiceSummaryBackendWidget.class.equals(Boolean.class)
            || ServiceSummaryBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceSummaryBackendWidget.class.equals(Integer.class)
                        || ServiceSummaryBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceSummaryBackendWidget.class.equals(Float.class)
                        || ServiceSummaryBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceSummaryBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceSummaryBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceSummaryBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceSummaryBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceSummaryBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceSummaryBackendWidget'", e);
      }

      // deserialize TreemapBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendWidget.class.equals(Integer.class)
            || TreemapBackendWidget.class.equals(Long.class)
            || TreemapBackendWidget.class.equals(Float.class)
            || TreemapBackendWidget.class.equals(Double.class)
            || TreemapBackendWidget.class.equals(Boolean.class)
            || TreemapBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendWidget.class.equals(Integer.class)
                        || TreemapBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendWidget.class.equals(Float.class)
                        || TreemapBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreemapBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreemapBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TreemapBackendWidget'", e);
      }

      // deserialize WildcardBackendWidget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WildcardBackendWidget.class.equals(Integer.class)
            || WildcardBackendWidget.class.equals(Long.class)
            || WildcardBackendWidget.class.equals(Float.class)
            || WildcardBackendWidget.class.equals(Double.class)
            || WildcardBackendWidget.class.equals(Boolean.class)
            || WildcardBackendWidget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WildcardBackendWidget.class.equals(Integer.class)
                        || WildcardBackendWidget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WildcardBackendWidget.class.equals(Float.class)
                        || WildcardBackendWidget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WildcardBackendWidget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WildcardBackendWidget.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WildcardBackendWidget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WildcardBackendWidget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WildcardBackendWidget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WildcardBackendWidget'", e);
      }

      DashboardBackendWidget ret = new DashboardBackendWidget();
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
    public DashboardBackendWidget getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "DashboardBackendWidget cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DashboardBackendWidget() {
    super("oneOf", Boolean.FALSE);
  }

  public DashboardBackendWidget(AlertGraphBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(AlertValueBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(BarChartBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ChangeBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(CheckStatusBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(CohortBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(DistributionBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(EmbeddedAppBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(EventStream o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(EventTimelineBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(FreeTextBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(FunnelBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(GeomapBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(GroupBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(HeatgridBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(HeatmapBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(HostmapBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(IframeBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ImageBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(JourneyMapBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ListStreamBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(LogStream o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ManageStatusBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(NoteBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(PointPlotBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(PowerpackBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(QueryTableBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(QueryValueBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(RetentionCurveBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(RunWorkflowBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(SankeyBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ScatterplotBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ServiceMapBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(SloBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(SloListBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(SplitGroupBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(SunburstBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(TimeseriesBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ToplistBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(TopologyMapBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(ServiceSummaryBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(TreemapBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardBackendWidget(WildcardBackendWidget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AlertGraphBackendWidget", new GenericType<AlertGraphBackendWidget>() {});
    schemas.put("AlertValueBackendWidget", new GenericType<AlertValueBackendWidget>() {});
    schemas.put("BarChartBackendWidget", new GenericType<BarChartBackendWidget>() {});
    schemas.put("ChangeBackendWidget", new GenericType<ChangeBackendWidget>() {});
    schemas.put("CheckStatusBackendWidget", new GenericType<CheckStatusBackendWidget>() {});
    schemas.put("CohortBackendWidget", new GenericType<CohortBackendWidget>() {});
    schemas.put("DistributionBackendWidget", new GenericType<DistributionBackendWidget>() {});
    schemas.put("EmbeddedAppBackendWidget", new GenericType<EmbeddedAppBackendWidget>() {});
    schemas.put("EventStream", new GenericType<EventStream>() {});
    schemas.put("EventTimelineBackendWidget", new GenericType<EventTimelineBackendWidget>() {});
    schemas.put("FreeTextBackendWidget", new GenericType<FreeTextBackendWidget>() {});
    schemas.put("FunnelBackendWidget", new GenericType<FunnelBackendWidget>() {});
    schemas.put("GeomapBackendWidget", new GenericType<GeomapBackendWidget>() {});
    schemas.put("GroupBackendWidget", new GenericType<GroupBackendWidget>() {});
    schemas.put("HeatgridBackendWidget", new GenericType<HeatgridBackendWidget>() {});
    schemas.put("HeatmapBackendWidget", new GenericType<HeatmapBackendWidget>() {});
    schemas.put("HostmapBackendWidget", new GenericType<HostmapBackendWidget>() {});
    schemas.put("IframeBackendWidget", new GenericType<IframeBackendWidget>() {});
    schemas.put("ImageBackendWidget", new GenericType<ImageBackendWidget>() {});
    schemas.put("JourneyMapBackendWidget", new GenericType<JourneyMapBackendWidget>() {});
    schemas.put("ListStreamBackendWidget", new GenericType<ListStreamBackendWidget>() {});
    schemas.put("LogStream", new GenericType<LogStream>() {});
    schemas.put("ManageStatusBackendWidget", new GenericType<ManageStatusBackendWidget>() {});
    schemas.put("NoteBackendWidget", new GenericType<NoteBackendWidget>() {});
    schemas.put("PointPlotBackendWidget", new GenericType<PointPlotBackendWidget>() {});
    schemas.put("PowerpackBackendWidget", new GenericType<PowerpackBackendWidget>() {});
    schemas.put("QueryTableBackendWidget", new GenericType<QueryTableBackendWidget>() {});
    schemas.put("QueryValueBackendWidget", new GenericType<QueryValueBackendWidget>() {});
    schemas.put("RetentionCurveBackendWidget", new GenericType<RetentionCurveBackendWidget>() {});
    schemas.put("RunWorkflowBackendWidget", new GenericType<RunWorkflowBackendWidget>() {});
    schemas.put("SankeyBackendWidget", new GenericType<SankeyBackendWidget>() {});
    schemas.put("ScatterplotBackendWidget", new GenericType<ScatterplotBackendWidget>() {});
    schemas.put("ServiceMapBackendWidget", new GenericType<ServiceMapBackendWidget>() {});
    schemas.put("SloBackendWidget", new GenericType<SloBackendWidget>() {});
    schemas.put("SloListBackendWidget", new GenericType<SloListBackendWidget>() {});
    schemas.put("SplitGroupBackendWidget", new GenericType<SplitGroupBackendWidget>() {});
    schemas.put("SunburstBackendWidget", new GenericType<SunburstBackendWidget>() {});
    schemas.put("TimeseriesBackendWidget", new GenericType<TimeseriesBackendWidget>() {});
    schemas.put("ToplistBackendWidget", new GenericType<ToplistBackendWidget>() {});
    schemas.put("TopologyMapBackendWidget", new GenericType<TopologyMapBackendWidget>() {});
    schemas.put("ServiceSummaryBackendWidget", new GenericType<ServiceSummaryBackendWidget>() {});
    schemas.put("TreemapBackendWidget", new GenericType<TreemapBackendWidget>() {});
    schemas.put("WildcardBackendWidget", new GenericType<WildcardBackendWidget>() {});
    JSON.registerDescendants(DashboardBackendWidget.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DashboardBackendWidget.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AlertGraphBackendWidget, AlertValueBackendWidget,
   * BarChartBackendWidget, ChangeBackendWidget, CheckStatusBackendWidget, CohortBackendWidget,
   * DistributionBackendWidget, EmbeddedAppBackendWidget, EventStream, EventTimelineBackendWidget,
   * FreeTextBackendWidget, FunnelBackendWidget, GeomapBackendWidget, GroupBackendWidget,
   * HeatgridBackendWidget, HeatmapBackendWidget, HostmapBackendWidget, IframeBackendWidget,
   * ImageBackendWidget, JourneyMapBackendWidget, ListStreamBackendWidget, LogStream,
   * ManageStatusBackendWidget, NoteBackendWidget, PointPlotBackendWidget, PowerpackBackendWidget,
   * QueryTableBackendWidget, QueryValueBackendWidget, RetentionCurveBackendWidget,
   * RunWorkflowBackendWidget, SankeyBackendWidget, ScatterplotBackendWidget,
   * ServiceMapBackendWidget, SloBackendWidget, SloListBackendWidget, SplitGroupBackendWidget,
   * SunburstBackendWidget, TimeseriesBackendWidget, ToplistBackendWidget, TopologyMapBackendWidget,
   * ServiceSummaryBackendWidget, TreemapBackendWidget, WildcardBackendWidget
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AlertGraphBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AlertValueBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(BarChartBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ChangeBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CheckStatusBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CohortBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DistributionBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EmbeddedAppBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventStream.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventTimelineBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FreeTextBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FunnelBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GeomapBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GroupBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatgridBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatmapBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HostmapBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IframeBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ImageBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(JourneyMapBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ListStreamBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogStream.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ManageStatusBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NoteBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PointPlotBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PowerpackBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryTableBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryValueBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RetentionCurveBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RunWorkflowBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SankeyBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScatterplotBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ServiceMapBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SloBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SloListBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SplitGroupBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SunburstBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ToplistBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TopologyMapBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ServiceSummaryBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TreemapBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(WildcardBackendWidget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AlertGraphBackendWidget, AlertValueBackendWidget,"
            + " BarChartBackendWidget, ChangeBackendWidget, CheckStatusBackendWidget,"
            + " CohortBackendWidget, DistributionBackendWidget, EmbeddedAppBackendWidget,"
            + " EventStream, EventTimelineBackendWidget, FreeTextBackendWidget,"
            + " FunnelBackendWidget, GeomapBackendWidget, GroupBackendWidget,"
            + " HeatgridBackendWidget, HeatmapBackendWidget, HostmapBackendWidget,"
            + " IframeBackendWidget, ImageBackendWidget, JourneyMapBackendWidget,"
            + " ListStreamBackendWidget, LogStream, ManageStatusBackendWidget, NoteBackendWidget,"
            + " PointPlotBackendWidget, PowerpackBackendWidget, QueryTableBackendWidget,"
            + " QueryValueBackendWidget, RetentionCurveBackendWidget, RunWorkflowBackendWidget,"
            + " SankeyBackendWidget, ScatterplotBackendWidget, ServiceMapBackendWidget,"
            + " SloBackendWidget, SloListBackendWidget, SplitGroupBackendWidget,"
            + " SunburstBackendWidget, TimeseriesBackendWidget, ToplistBackendWidget,"
            + " TopologyMapBackendWidget, ServiceSummaryBackendWidget, TreemapBackendWidget,"
            + " WildcardBackendWidget");
  }

  /**
   * Get the actual instance, which can be the following: AlertGraphBackendWidget,
   * AlertValueBackendWidget, BarChartBackendWidget, ChangeBackendWidget, CheckStatusBackendWidget,
   * CohortBackendWidget, DistributionBackendWidget, EmbeddedAppBackendWidget, EventStream,
   * EventTimelineBackendWidget, FreeTextBackendWidget, FunnelBackendWidget, GeomapBackendWidget,
   * GroupBackendWidget, HeatgridBackendWidget, HeatmapBackendWidget, HostmapBackendWidget,
   * IframeBackendWidget, ImageBackendWidget, JourneyMapBackendWidget, ListStreamBackendWidget,
   * LogStream, ManageStatusBackendWidget, NoteBackendWidget, PointPlotBackendWidget,
   * PowerpackBackendWidget, QueryTableBackendWidget, QueryValueBackendWidget,
   * RetentionCurveBackendWidget, RunWorkflowBackendWidget, SankeyBackendWidget,
   * ScatterplotBackendWidget, ServiceMapBackendWidget, SloBackendWidget, SloListBackendWidget,
   * SplitGroupBackendWidget, SunburstBackendWidget, TimeseriesBackendWidget, ToplistBackendWidget,
   * TopologyMapBackendWidget, ServiceSummaryBackendWidget, TreemapBackendWidget,
   * WildcardBackendWidget
   *
   * @return The actual instance (AlertGraphBackendWidget, AlertValueBackendWidget,
   *     BarChartBackendWidget, ChangeBackendWidget, CheckStatusBackendWidget, CohortBackendWidget,
   *     DistributionBackendWidget, EmbeddedAppBackendWidget, EventStream,
   *     EventTimelineBackendWidget, FreeTextBackendWidget, FunnelBackendWidget,
   *     GeomapBackendWidget, GroupBackendWidget, HeatgridBackendWidget, HeatmapBackendWidget,
   *     HostmapBackendWidget, IframeBackendWidget, ImageBackendWidget, JourneyMapBackendWidget,
   *     ListStreamBackendWidget, LogStream, ManageStatusBackendWidget, NoteBackendWidget,
   *     PointPlotBackendWidget, PowerpackBackendWidget, QueryTableBackendWidget,
   *     QueryValueBackendWidget, RetentionCurveBackendWidget, RunWorkflowBackendWidget,
   *     SankeyBackendWidget, ScatterplotBackendWidget, ServiceMapBackendWidget, SloBackendWidget,
   *     SloListBackendWidget, SplitGroupBackendWidget, SunburstBackendWidget,
   *     TimeseriesBackendWidget, ToplistBackendWidget, TopologyMapBackendWidget,
   *     ServiceSummaryBackendWidget, TreemapBackendWidget, WildcardBackendWidget)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AlertGraphBackendWidget`. If the actual instance is not
   * `AlertGraphBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AlertGraphBackendWidget`
   * @throws ClassCastException if the instance is not `AlertGraphBackendWidget`
   */
  public AlertGraphBackendWidget getAlertGraphBackendWidget() throws ClassCastException {
    return (AlertGraphBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AlertValueBackendWidget`. If the actual instance is not
   * `AlertValueBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AlertValueBackendWidget`
   * @throws ClassCastException if the instance is not `AlertValueBackendWidget`
   */
  public AlertValueBackendWidget getAlertValueBackendWidget() throws ClassCastException {
    return (AlertValueBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendWidget`. If the actual instance is not
   * `BarChartBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `BarChartBackendWidget`
   * @throws ClassCastException if the instance is not `BarChartBackendWidget`
   */
  public BarChartBackendWidget getBarChartBackendWidget() throws ClassCastException {
    return (BarChartBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeBackendWidget`. If the actual instance is not
   * `ChangeBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeBackendWidget`
   * @throws ClassCastException if the instance is not `ChangeBackendWidget`
   */
  public ChangeBackendWidget getChangeBackendWidget() throws ClassCastException {
    return (ChangeBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CheckStatusBackendWidget`. If the actual instance is not
   * `CheckStatusBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CheckStatusBackendWidget`
   * @throws ClassCastException if the instance is not `CheckStatusBackendWidget`
   */
  public CheckStatusBackendWidget getCheckStatusBackendWidget() throws ClassCastException {
    return (CheckStatusBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CohortBackendWidget`. If the actual instance is not
   * `CohortBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CohortBackendWidget`
   * @throws ClassCastException if the instance is not `CohortBackendWidget`
   */
  public CohortBackendWidget getCohortBackendWidget() throws ClassCastException {
    return (CohortBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendWidget`. If the actual instance is not
   * `DistributionBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DistributionBackendWidget`
   * @throws ClassCastException if the instance is not `DistributionBackendWidget`
   */
  public DistributionBackendWidget getDistributionBackendWidget() throws ClassCastException {
    return (DistributionBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EmbeddedAppBackendWidget`. If the actual instance is not
   * `EmbeddedAppBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EmbeddedAppBackendWidget`
   * @throws ClassCastException if the instance is not `EmbeddedAppBackendWidget`
   */
  public EmbeddedAppBackendWidget getEmbeddedAppBackendWidget() throws ClassCastException {
    return (EmbeddedAppBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventStream`. If the actual instance is not `EventStream`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `EventStream`
   * @throws ClassCastException if the instance is not `EventStream`
   */
  public EventStream getEventStream() throws ClassCastException {
    return (EventStream) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventTimelineBackendWidget`. If the actual instance is not
   * `EventTimelineBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventTimelineBackendWidget`
   * @throws ClassCastException if the instance is not `EventTimelineBackendWidget`
   */
  public EventTimelineBackendWidget getEventTimelineBackendWidget() throws ClassCastException {
    return (EventTimelineBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FreeTextBackendWidget`. If the actual instance is not
   * `FreeTextBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FreeTextBackendWidget`
   * @throws ClassCastException if the instance is not `FreeTextBackendWidget`
   */
  public FreeTextBackendWidget getFreeTextBackendWidget() throws ClassCastException {
    return (FreeTextBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FunnelBackendWidget`. If the actual instance is not
   * `FunnelBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FunnelBackendWidget`
   * @throws ClassCastException if the instance is not `FunnelBackendWidget`
   */
  public FunnelBackendWidget getFunnelBackendWidget() throws ClassCastException {
    return (FunnelBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendWidget`. If the actual instance is not
   * `GeomapBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GeomapBackendWidget`
   * @throws ClassCastException if the instance is not `GeomapBackendWidget`
   */
  public GeomapBackendWidget getGeomapBackendWidget() throws ClassCastException {
    return (GeomapBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GroupBackendWidget`. If the actual instance is not
   * `GroupBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GroupBackendWidget`
   * @throws ClassCastException if the instance is not `GroupBackendWidget`
   */
  public GroupBackendWidget getGroupBackendWidget() throws ClassCastException {
    return (GroupBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridBackendWidget`. If the actual instance is not
   * `HeatgridBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridBackendWidget`
   * @throws ClassCastException if the instance is not `HeatgridBackendWidget`
   */
  public HeatgridBackendWidget getHeatgridBackendWidget() throws ClassCastException {
    return (HeatgridBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatmapBackendWidget`. If the actual instance is not
   * `HeatmapBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatmapBackendWidget`
   * @throws ClassCastException if the instance is not `HeatmapBackendWidget`
   */
  public HeatmapBackendWidget getHeatmapBackendWidget() throws ClassCastException {
    return (HeatmapBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HostmapBackendWidget`. If the actual instance is not
   * `HostmapBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HostmapBackendWidget`
   * @throws ClassCastException if the instance is not `HostmapBackendWidget`
   */
  public HostmapBackendWidget getHostmapBackendWidget() throws ClassCastException {
    return (HostmapBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IframeBackendWidget`. If the actual instance is not
   * `IframeBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IframeBackendWidget`
   * @throws ClassCastException if the instance is not `IframeBackendWidget`
   */
  public IframeBackendWidget getIframeBackendWidget() throws ClassCastException {
    return (IframeBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ImageBackendWidget`. If the actual instance is not
   * `ImageBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ImageBackendWidget`
   * @throws ClassCastException if the instance is not `ImageBackendWidget`
   */
  public ImageBackendWidget getImageBackendWidget() throws ClassCastException {
    return (ImageBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `JourneyMapBackendWidget`. If the actual instance is not
   * `JourneyMapBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `JourneyMapBackendWidget`
   * @throws ClassCastException if the instance is not `JourneyMapBackendWidget`
   */
  public JourneyMapBackendWidget getJourneyMapBackendWidget() throws ClassCastException {
    return (JourneyMapBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ListStreamBackendWidget`. If the actual instance is not
   * `ListStreamBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ListStreamBackendWidget`
   * @throws ClassCastException if the instance is not `ListStreamBackendWidget`
   */
  public ListStreamBackendWidget getListStreamBackendWidget() throws ClassCastException {
    return (ListStreamBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogStream`. If the actual instance is not `LogStream`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `LogStream`
   * @throws ClassCastException if the instance is not `LogStream`
   */
  public LogStream getLogStream() throws ClassCastException {
    return (LogStream) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ManageStatusBackendWidget`. If the actual instance is not
   * `ManageStatusBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ManageStatusBackendWidget`
   * @throws ClassCastException if the instance is not `ManageStatusBackendWidget`
   */
  public ManageStatusBackendWidget getManageStatusBackendWidget() throws ClassCastException {
    return (ManageStatusBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NoteBackendWidget`. If the actual instance is not
   * `NoteBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NoteBackendWidget`
   * @throws ClassCastException if the instance is not `NoteBackendWidget`
   */
  public NoteBackendWidget getNoteBackendWidget() throws ClassCastException {
    return (NoteBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PointPlotBackendWidget`. If the actual instance is not
   * `PointPlotBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PointPlotBackendWidget`
   * @throws ClassCastException if the instance is not `PointPlotBackendWidget`
   */
  public PointPlotBackendWidget getPointPlotBackendWidget() throws ClassCastException {
    return (PointPlotBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PowerpackBackendWidget`. If the actual instance is not
   * `PowerpackBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PowerpackBackendWidget`
   * @throws ClassCastException if the instance is not `PowerpackBackendWidget`
   */
  public PowerpackBackendWidget getPowerpackBackendWidget() throws ClassCastException {
    return (PowerpackBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendWidget`. If the actual instance is not
   * `QueryTableBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryTableBackendWidget`
   * @throws ClassCastException if the instance is not `QueryTableBackendWidget`
   */
  public QueryTableBackendWidget getQueryTableBackendWidget() throws ClassCastException {
    return (QueryTableBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendWidget`. If the actual instance is not
   * `QueryValueBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryValueBackendWidget`
   * @throws ClassCastException if the instance is not `QueryValueBackendWidget`
   */
  public QueryValueBackendWidget getQueryValueBackendWidget() throws ClassCastException {
    return (QueryValueBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RetentionCurveBackendWidget`. If the actual instance is not
   * `RetentionCurveBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RetentionCurveBackendWidget`
   * @throws ClassCastException if the instance is not `RetentionCurveBackendWidget`
   */
  public RetentionCurveBackendWidget getRetentionCurveBackendWidget() throws ClassCastException {
    return (RetentionCurveBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RunWorkflowBackendWidget`. If the actual instance is not
   * `RunWorkflowBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RunWorkflowBackendWidget`
   * @throws ClassCastException if the instance is not `RunWorkflowBackendWidget`
   */
  public RunWorkflowBackendWidget getRunWorkflowBackendWidget() throws ClassCastException {
    return (RunWorkflowBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SankeyBackendWidget`. If the actual instance is not
   * `SankeyBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SankeyBackendWidget`
   * @throws ClassCastException if the instance is not `SankeyBackendWidget`
   */
  public SankeyBackendWidget getSankeyBackendWidget() throws ClassCastException {
    return (SankeyBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendWidget`. If the actual instance is not
   * `ScatterplotBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendWidget`
   * @throws ClassCastException if the instance is not `ScatterplotBackendWidget`
   */
  public ScatterplotBackendWidget getScatterplotBackendWidget() throws ClassCastException {
    return (ScatterplotBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceMapBackendWidget`. If the actual instance is not
   * `ServiceMapBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceMapBackendWidget`
   * @throws ClassCastException if the instance is not `ServiceMapBackendWidget`
   */
  public ServiceMapBackendWidget getServiceMapBackendWidget() throws ClassCastException {
    return (ServiceMapBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SloBackendWidget`. If the actual instance is not
   * `SloBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SloBackendWidget`
   * @throws ClassCastException if the instance is not `SloBackendWidget`
   */
  public SloBackendWidget getSloBackendWidget() throws ClassCastException {
    return (SloBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SloListBackendWidget`. If the actual instance is not
   * `SloListBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SloListBackendWidget`
   * @throws ClassCastException if the instance is not `SloListBackendWidget`
   */
  public SloListBackendWidget getSloListBackendWidget() throws ClassCastException {
    return (SloListBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SplitGroupBackendWidget`. If the actual instance is not
   * `SplitGroupBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SplitGroupBackendWidget`
   * @throws ClassCastException if the instance is not `SplitGroupBackendWidget`
   */
  public SplitGroupBackendWidget getSplitGroupBackendWidget() throws ClassCastException {
    return (SplitGroupBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstBackendWidget`. If the actual instance is not
   * `SunburstBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SunburstBackendWidget`
   * @throws ClassCastException if the instance is not `SunburstBackendWidget`
   */
  public SunburstBackendWidget getSunburstBackendWidget() throws ClassCastException {
    return (SunburstBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesBackendWidget`. If the actual instance is not
   * `TimeseriesBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesBackendWidget`
   * @throws ClassCastException if the instance is not `TimeseriesBackendWidget`
   */
  public TimeseriesBackendWidget getTimeseriesBackendWidget() throws ClassCastException {
    return (TimeseriesBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendWidget`. If the actual instance is not
   * `ToplistBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistBackendWidget`
   * @throws ClassCastException if the instance is not `ToplistBackendWidget`
   */
  public ToplistBackendWidget getToplistBackendWidget() throws ClassCastException {
    return (ToplistBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TopologyMapBackendWidget`. If the actual instance is not
   * `TopologyMapBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TopologyMapBackendWidget`
   * @throws ClassCastException if the instance is not `TopologyMapBackendWidget`
   */
  public TopologyMapBackendWidget getTopologyMapBackendWidget() throws ClassCastException {
    return (TopologyMapBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceSummaryBackendWidget`. If the actual instance is not
   * `ServiceSummaryBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceSummaryBackendWidget`
   * @throws ClassCastException if the instance is not `ServiceSummaryBackendWidget`
   */
  public ServiceSummaryBackendWidget getServiceSummaryBackendWidget() throws ClassCastException {
    return (ServiceSummaryBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendWidget`. If the actual instance is not
   * `TreemapBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreemapBackendWidget`
   * @throws ClassCastException if the instance is not `TreemapBackendWidget`
   */
  public TreemapBackendWidget getTreemapBackendWidget() throws ClassCastException {
    return (TreemapBackendWidget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WildcardBackendWidget`. If the actual instance is not
   * `WildcardBackendWidget`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WildcardBackendWidget`
   * @throws ClassCastException if the instance is not `WildcardBackendWidget`
   */
  public WildcardBackendWidget getWildcardBackendWidget() throws ClassCastException {
    return (WildcardBackendWidget) super.getActualInstance();
  }
}
