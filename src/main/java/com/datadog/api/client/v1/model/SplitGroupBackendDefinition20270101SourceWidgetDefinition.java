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
    using =
        SplitGroupBackendDefinition20270101SourceWidgetDefinition
            .SplitGroupBackendDefinition20270101SourceWidgetDefinitionDeserializer.class)
@JsonSerialize(
    using =
        SplitGroupBackendDefinition20270101SourceWidgetDefinition
            .SplitGroupBackendDefinition20270101SourceWidgetDefinitionSerializer.class)
public class SplitGroupBackendDefinition20270101SourceWidgetDefinition
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SplitGroupBackendDefinition20270101SourceWidgetDefinition.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SplitGroupBackendDefinition20270101SourceWidgetDefinitionSerializer
      extends StdSerializer<SplitGroupBackendDefinition20270101SourceWidgetDefinition> {
    public SplitGroupBackendDefinition20270101SourceWidgetDefinitionSerializer(
        Class<SplitGroupBackendDefinition20270101SourceWidgetDefinition> t) {
      super(t);
    }

    public SplitGroupBackendDefinition20270101SourceWidgetDefinitionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SplitGroupBackendDefinition20270101SourceWidgetDefinition value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SplitGroupBackendDefinition20270101SourceWidgetDefinitionDeserializer
      extends StdDeserializer<SplitGroupBackendDefinition20270101SourceWidgetDefinition> {
    public SplitGroupBackendDefinition20270101SourceWidgetDefinitionDeserializer() {
      this(SplitGroupBackendDefinition20270101SourceWidgetDefinition.class);
    }

    public SplitGroupBackendDefinition20270101SourceWidgetDefinitionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SplitGroupBackendDefinition20270101SourceWidgetDefinition deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize BarChartBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendDefinition_20270101.class.equals(Integer.class)
            || BarChartBackendDefinition_20270101.class.equals(Long.class)
            || BarChartBackendDefinition_20270101.class.equals(Float.class)
            || BarChartBackendDefinition_20270101.class.equals(Double.class)
            || BarChartBackendDefinition_20270101.class.equals(Boolean.class)
            || BarChartBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendDefinition_20270101.class.equals(Integer.class)
                        || BarChartBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendDefinition_20270101.class.equals(Float.class)
                        || BarChartBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(BarChartBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'BarChartBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'BarChartBackendDefinition_20270101'",
            e);
      }

      // deserialize ChangeBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeBackendDefinition_20270101.class.equals(Integer.class)
            || ChangeBackendDefinition_20270101.class.equals(Long.class)
            || ChangeBackendDefinition_20270101.class.equals(Float.class)
            || ChangeBackendDefinition_20270101.class.equals(Double.class)
            || ChangeBackendDefinition_20270101.class.equals(Boolean.class)
            || ChangeBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeBackendDefinition_20270101.class.equals(Integer.class)
                        || ChangeBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeBackendDefinition_20270101.class.equals(Float.class)
                        || ChangeBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ChangeBackendDefinition_20270101'", e);
      }

      // deserialize DistributionBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendDefinition_20270101.class.equals(Integer.class)
            || DistributionBackendDefinition_20270101.class.equals(Long.class)
            || DistributionBackendDefinition_20270101.class.equals(Float.class)
            || DistributionBackendDefinition_20270101.class.equals(Double.class)
            || DistributionBackendDefinition_20270101.class.equals(Boolean.class)
            || DistributionBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendDefinition_20270101.class.equals(Integer.class)
                        || DistributionBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendDefinition_20270101.class.equals(Float.class)
                        || DistributionBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'DistributionBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendDefinition_20270101'",
            e);
      }

      // deserialize GeomapBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendDefinition_20270101.class.equals(Integer.class)
            || GeomapBackendDefinition_20270101.class.equals(Long.class)
            || GeomapBackendDefinition_20270101.class.equals(Float.class)
            || GeomapBackendDefinition_20270101.class.equals(Double.class)
            || GeomapBackendDefinition_20270101.class.equals(Boolean.class)
            || GeomapBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendDefinition_20270101.class.equals(Integer.class)
                        || GeomapBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendDefinition_20270101.class.equals(Float.class)
                        || GeomapBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GeomapBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GeomapBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'GeomapBackendDefinition_20270101'", e);
      }

      // deserialize HeatgridDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridDefinition_20270101.class.equals(Integer.class)
            || HeatgridDefinition_20270101.class.equals(Long.class)
            || HeatgridDefinition_20270101.class.equals(Float.class)
            || HeatgridDefinition_20270101.class.equals(Double.class)
            || HeatgridDefinition_20270101.class.equals(Boolean.class)
            || HeatgridDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridDefinition_20270101.class.equals(Integer.class)
                        || HeatgridDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridDefinition_20270101.class.equals(Float.class)
                        || HeatgridDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridDefinition_20270101'", e);
      }

      // deserialize QueryTableBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendDefinition_20270101.class.equals(Integer.class)
            || QueryTableBackendDefinition_20270101.class.equals(Long.class)
            || QueryTableBackendDefinition_20270101.class.equals(Float.class)
            || QueryTableBackendDefinition_20270101.class.equals(Double.class)
            || QueryTableBackendDefinition_20270101.class.equals(Boolean.class)
            || QueryTableBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendDefinition_20270101.class.equals(Integer.class)
                        || QueryTableBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendDefinition_20270101.class.equals(Float.class)
                        || QueryTableBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(QueryTableBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryTableBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryTableBackendDefinition_20270101'",
            e);
      }

      // deserialize QueryValueBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendDefinition_20270101.class.equals(Integer.class)
            || QueryValueBackendDefinition_20270101.class.equals(Long.class)
            || QueryValueBackendDefinition_20270101.class.equals(Float.class)
            || QueryValueBackendDefinition_20270101.class.equals(Double.class)
            || QueryValueBackendDefinition_20270101.class.equals(Boolean.class)
            || QueryValueBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendDefinition_20270101.class.equals(Integer.class)
                        || QueryValueBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendDefinition_20270101.class.equals(Float.class)
                        || QueryValueBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(QueryValueBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryValueBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'QueryValueBackendDefinition_20270101'",
            e);
      }

      // deserialize ScatterplotBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendDefinition_20270101.class.equals(Integer.class)
            || ScatterplotBackendDefinition_20270101.class.equals(Long.class)
            || ScatterplotBackendDefinition_20270101.class.equals(Float.class)
            || ScatterplotBackendDefinition_20270101.class.equals(Double.class)
            || ScatterplotBackendDefinition_20270101.class.equals(Boolean.class)
            || ScatterplotBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendDefinition_20270101.class.equals(Integer.class)
                        || ScatterplotBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendDefinition_20270101.class.equals(Float.class)
                        || ScatterplotBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ScatterplotBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScatterplotBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ScatterplotBackendDefinition_20270101'",
            e);
      }

      // deserialize SunburstBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstBackendDefinition_20270101.class.equals(Integer.class)
            || SunburstBackendDefinition_20270101.class.equals(Long.class)
            || SunburstBackendDefinition_20270101.class.equals(Float.class)
            || SunburstBackendDefinition_20270101.class.equals(Double.class)
            || SunburstBackendDefinition_20270101.class.equals(Boolean.class)
            || SunburstBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstBackendDefinition_20270101.class.equals(Integer.class)
                        || SunburstBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstBackendDefinition_20270101.class.equals(Float.class)
                        || SunburstBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SunburstBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SunburstBackendDefinition_20270101'",
            e);
      }

      // deserialize TimeseriesWidgetDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetDefinition_20270101.class.equals(Integer.class)
            || TimeseriesWidgetDefinition_20270101.class.equals(Long.class)
            || TimeseriesWidgetDefinition_20270101.class.equals(Float.class)
            || TimeseriesWidgetDefinition_20270101.class.equals(Double.class)
            || TimeseriesWidgetDefinition_20270101.class.equals(Boolean.class)
            || TimeseriesWidgetDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetDefinition_20270101.class.equals(Integer.class)
                        || TimeseriesWidgetDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetDefinition_20270101.class.equals(Float.class)
                        || TimeseriesWidgetDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesWidgetDefinition_20270101'",
            e);
      }

      // deserialize ToplistBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendDefinition_20270101.class.equals(Integer.class)
            || ToplistBackendDefinition_20270101.class.equals(Long.class)
            || ToplistBackendDefinition_20270101.class.equals(Float.class)
            || ToplistBackendDefinition_20270101.class.equals(Double.class)
            || ToplistBackendDefinition_20270101.class.equals(Boolean.class)
            || ToplistBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendDefinition_20270101.class.equals(Integer.class)
                        || ToplistBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendDefinition_20270101.class.equals(Float.class)
                        || ToplistBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ToplistBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ToplistBackendDefinition_20270101'", e);
      }

      // deserialize TreemapBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendDefinition_20270101.class.equals(Integer.class)
            || TreemapBackendDefinition_20270101.class.equals(Long.class)
            || TreemapBackendDefinition_20270101.class.equals(Float.class)
            || TreemapBackendDefinition_20270101.class.equals(Double.class)
            || TreemapBackendDefinition_20270101.class.equals(Boolean.class)
            || TreemapBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendDefinition_20270101.class.equals(Integer.class)
                        || TreemapBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendDefinition_20270101.class.equals(Float.class)
                        || TreemapBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreemapBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreemapBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TreemapBackendDefinition_20270101'", e);
      }

      // deserialize WildcardBackendDefinition_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WildcardBackendDefinition_20270101.class.equals(Integer.class)
            || WildcardBackendDefinition_20270101.class.equals(Long.class)
            || WildcardBackendDefinition_20270101.class.equals(Float.class)
            || WildcardBackendDefinition_20270101.class.equals(Double.class)
            || WildcardBackendDefinition_20270101.class.equals(Boolean.class)
            || WildcardBackendDefinition_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WildcardBackendDefinition_20270101.class.equals(Integer.class)
                        || WildcardBackendDefinition_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WildcardBackendDefinition_20270101.class.equals(Float.class)
                        || WildcardBackendDefinition_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WildcardBackendDefinition_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WildcardBackendDefinition_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WildcardBackendDefinition_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WildcardBackendDefinition_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WildcardBackendDefinition_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'WildcardBackendDefinition_20270101'",
            e);
      }

      SplitGroupBackendDefinition20270101SourceWidgetDefinition ret =
          new SplitGroupBackendDefinition20270101SourceWidgetDefinition();
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
    public SplitGroupBackendDefinition20270101SourceWidgetDefinition getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "SplitGroupBackendDefinition20270101SourceWidgetDefinition cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition() {
    super("oneOf", Boolean.FALSE);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      BarChartBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      ChangeBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      DistributionBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      GeomapBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(HeatgridDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      QueryTableBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      QueryValueBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      ScatterplotBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      SunburstBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      TimeseriesWidgetDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      ToplistBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      TreemapBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      WildcardBackendDefinition_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "BarChartBackendDefinition_20270101",
        new GenericType<BarChartBackendDefinition_20270101>() {});
    schemas.put(
        "ChangeBackendDefinition_20270101", new GenericType<ChangeBackendDefinition_20270101>() {});
    schemas.put(
        "DistributionBackendDefinition_20270101",
        new GenericType<DistributionBackendDefinition_20270101>() {});
    schemas.put(
        "GeomapBackendDefinition_20270101", new GenericType<GeomapBackendDefinition_20270101>() {});
    schemas.put("HeatgridDefinition_20270101", new GenericType<HeatgridDefinition_20270101>() {});
    schemas.put(
        "QueryTableBackendDefinition_20270101",
        new GenericType<QueryTableBackendDefinition_20270101>() {});
    schemas.put(
        "QueryValueBackendDefinition_20270101",
        new GenericType<QueryValueBackendDefinition_20270101>() {});
    schemas.put(
        "ScatterplotBackendDefinition_20270101",
        new GenericType<ScatterplotBackendDefinition_20270101>() {});
    schemas.put(
        "SunburstBackendDefinition_20270101",
        new GenericType<SunburstBackendDefinition_20270101>() {});
    schemas.put(
        "TimeseriesWidgetDefinition_20270101",
        new GenericType<TimeseriesWidgetDefinition_20270101>() {});
    schemas.put(
        "ToplistBackendDefinition_20270101",
        new GenericType<ToplistBackendDefinition_20270101>() {});
    schemas.put(
        "TreemapBackendDefinition_20270101",
        new GenericType<TreemapBackendDefinition_20270101>() {});
    schemas.put(
        "WildcardBackendDefinition_20270101",
        new GenericType<WildcardBackendDefinition_20270101>() {});
    JSON.registerDescendants(
        SplitGroupBackendDefinition20270101SourceWidgetDefinition.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SplitGroupBackendDefinition20270101SourceWidgetDefinition.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: BarChartBackendDefinition_20270101,
   * ChangeBackendDefinition_20270101, DistributionBackendDefinition_20270101,
   * GeomapBackendDefinition_20270101, HeatgridDefinition_20270101,
   * QueryTableBackendDefinition_20270101, QueryValueBackendDefinition_20270101,
   * ScatterplotBackendDefinition_20270101, SunburstBackendDefinition_20270101,
   * TimeseriesWidgetDefinition_20270101, ToplistBackendDefinition_20270101,
   * TreemapBackendDefinition_20270101, WildcardBackendDefinition_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        BarChartBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ChangeBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatgridDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryTableBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        QueryValueBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ScatterplotBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SunburstBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesWidgetDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TreemapBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        WildcardBackendDefinition_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be BarChartBackendDefinition_20270101,"
            + " ChangeBackendDefinition_20270101, DistributionBackendDefinition_20270101,"
            + " GeomapBackendDefinition_20270101, HeatgridDefinition_20270101,"
            + " QueryTableBackendDefinition_20270101, QueryValueBackendDefinition_20270101,"
            + " ScatterplotBackendDefinition_20270101, SunburstBackendDefinition_20270101,"
            + " TimeseriesWidgetDefinition_20270101, ToplistBackendDefinition_20270101,"
            + " TreemapBackendDefinition_20270101, WildcardBackendDefinition_20270101");
  }

  /**
   * Get the actual instance, which can be the following: BarChartBackendDefinition_20270101,
   * ChangeBackendDefinition_20270101, DistributionBackendDefinition_20270101,
   * GeomapBackendDefinition_20270101, HeatgridDefinition_20270101,
   * QueryTableBackendDefinition_20270101, QueryValueBackendDefinition_20270101,
   * ScatterplotBackendDefinition_20270101, SunburstBackendDefinition_20270101,
   * TimeseriesWidgetDefinition_20270101, ToplistBackendDefinition_20270101,
   * TreemapBackendDefinition_20270101, WildcardBackendDefinition_20270101
   *
   * @return The actual instance (BarChartBackendDefinition_20270101,
   *     ChangeBackendDefinition_20270101, DistributionBackendDefinition_20270101,
   *     GeomapBackendDefinition_20270101, HeatgridDefinition_20270101,
   *     QueryTableBackendDefinition_20270101, QueryValueBackendDefinition_20270101,
   *     ScatterplotBackendDefinition_20270101, SunburstBackendDefinition_20270101,
   *     TimeseriesWidgetDefinition_20270101, ToplistBackendDefinition_20270101,
   *     TreemapBackendDefinition_20270101, WildcardBackendDefinition_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendDefinition_20270101`. If the actual instance is not
   * `BarChartBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `BarChartBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `BarChartBackendDefinition_20270101`
   */
  public BarChartBackendDefinition_20270101 getBarChartBackendDefinition_20270101()
      throws ClassCastException {
    return (BarChartBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeBackendDefinition_20270101`. If the actual instance is not
   * `ChangeBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `ChangeBackendDefinition_20270101`
   */
  public ChangeBackendDefinition_20270101 getChangeBackendDefinition_20270101()
      throws ClassCastException {
    return (ChangeBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendDefinition_20270101`. If the actual instance is
   * not `DistributionBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DistributionBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `DistributionBackendDefinition_20270101`
   */
  public DistributionBackendDefinition_20270101 getDistributionBackendDefinition_20270101()
      throws ClassCastException {
    return (DistributionBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendDefinition_20270101`. If the actual instance is not
   * `GeomapBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GeomapBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `GeomapBackendDefinition_20270101`
   */
  public GeomapBackendDefinition_20270101 getGeomapBackendDefinition_20270101()
      throws ClassCastException {
    return (GeomapBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridDefinition_20270101`. If the actual instance is not
   * `HeatgridDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridDefinition_20270101`
   * @throws ClassCastException if the instance is not `HeatgridDefinition_20270101`
   */
  public HeatgridDefinition_20270101 getHeatgridDefinition_20270101() throws ClassCastException {
    return (HeatgridDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendDefinition_20270101`. If the actual instance is
   * not `QueryTableBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryTableBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `QueryTableBackendDefinition_20270101`
   */
  public QueryTableBackendDefinition_20270101 getQueryTableBackendDefinition_20270101()
      throws ClassCastException {
    return (QueryTableBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendDefinition_20270101`. If the actual instance is
   * not `QueryValueBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryValueBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `QueryValueBackendDefinition_20270101`
   */
  public QueryValueBackendDefinition_20270101 getQueryValueBackendDefinition_20270101()
      throws ClassCastException {
    return (QueryValueBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendDefinition_20270101`. If the actual instance is
   * not `ScatterplotBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `ScatterplotBackendDefinition_20270101`
   */
  public ScatterplotBackendDefinition_20270101 getScatterplotBackendDefinition_20270101()
      throws ClassCastException {
    return (ScatterplotBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstBackendDefinition_20270101`. If the actual instance is not
   * `SunburstBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SunburstBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `SunburstBackendDefinition_20270101`
   */
  public SunburstBackendDefinition_20270101 getSunburstBackendDefinition_20270101()
      throws ClassCastException {
    return (SunburstBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetDefinition_20270101`. If the actual instance is not
   * `TimeseriesWidgetDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetDefinition_20270101`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetDefinition_20270101`
   */
  public TimeseriesWidgetDefinition_20270101 getTimeseriesWidgetDefinition_20270101()
      throws ClassCastException {
    return (TimeseriesWidgetDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendDefinition_20270101`. If the actual instance is not
   * `ToplistBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `ToplistBackendDefinition_20270101`
   */
  public ToplistBackendDefinition_20270101 getToplistBackendDefinition_20270101()
      throws ClassCastException {
    return (ToplistBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendDefinition_20270101`. If the actual instance is not
   * `TreemapBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreemapBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `TreemapBackendDefinition_20270101`
   */
  public TreemapBackendDefinition_20270101 getTreemapBackendDefinition_20270101()
      throws ClassCastException {
    return (TreemapBackendDefinition_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WildcardBackendDefinition_20270101`. If the actual instance is not
   * `WildcardBackendDefinition_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WildcardBackendDefinition_20270101`
   * @throws ClassCastException if the instance is not `WildcardBackendDefinition_20270101`
   */
  public WildcardBackendDefinition_20270101 getWildcardBackendDefinition_20270101()
      throws ClassCastException {
    return (WildcardBackendDefinition_20270101) super.getActualInstance();
  }
}
