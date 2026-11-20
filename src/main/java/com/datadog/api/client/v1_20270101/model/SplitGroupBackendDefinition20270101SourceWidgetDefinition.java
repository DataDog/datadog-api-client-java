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
      // deserialize BarChartBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendDefinition.class.equals(Integer.class)
            || BarChartBackendDefinition.class.equals(Long.class)
            || BarChartBackendDefinition.class.equals(Float.class)
            || BarChartBackendDefinition.class.equals(Double.class)
            || BarChartBackendDefinition.class.equals(Boolean.class)
            || BarChartBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendDefinition.class.equals(Integer.class)
                        || BarChartBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendDefinition.class.equals(Float.class)
                        || BarChartBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(BarChartBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'BarChartBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'BarChartBackendDefinition'", e);
      }

      // deserialize ChangeBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeBackendDefinition.class.equals(Integer.class)
            || ChangeBackendDefinition.class.equals(Long.class)
            || ChangeBackendDefinition.class.equals(Float.class)
            || ChangeBackendDefinition.class.equals(Double.class)
            || ChangeBackendDefinition.class.equals(Boolean.class)
            || ChangeBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeBackendDefinition.class.equals(Integer.class)
                        || ChangeBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeBackendDefinition.class.equals(Float.class)
                        || ChangeBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ChangeBackendDefinition'", e);
      }

      // deserialize DistributionBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendDefinition.class.equals(Integer.class)
            || DistributionBackendDefinition.class.equals(Long.class)
            || DistributionBackendDefinition.class.equals(Float.class)
            || DistributionBackendDefinition.class.equals(Double.class)
            || DistributionBackendDefinition.class.equals(Boolean.class)
            || DistributionBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendDefinition.class.equals(Integer.class)
                        || DistributionBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendDefinition.class.equals(Float.class)
                        || DistributionBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DistributionBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DistributionBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DistributionBackendDefinition'", e);
      }

      // deserialize GeomapBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendDefinition.class.equals(Integer.class)
            || GeomapBackendDefinition.class.equals(Long.class)
            || GeomapBackendDefinition.class.equals(Float.class)
            || GeomapBackendDefinition.class.equals(Double.class)
            || GeomapBackendDefinition.class.equals(Boolean.class)
            || GeomapBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendDefinition.class.equals(Integer.class)
                        || GeomapBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendDefinition.class.equals(Float.class)
                        || GeomapBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GeomapBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GeomapBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GeomapBackendDefinition'", e);
      }

      // deserialize HeatgridDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatgridDefinition.class.equals(Integer.class)
            || HeatgridDefinition.class.equals(Long.class)
            || HeatgridDefinition.class.equals(Float.class)
            || HeatgridDefinition.class.equals(Double.class)
            || HeatgridDefinition.class.equals(Boolean.class)
            || HeatgridDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatgridDefinition.class.equals(Integer.class)
                        || HeatgridDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatgridDefinition.class.equals(Float.class)
                        || HeatgridDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatgridDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatgridDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatgridDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatgridDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatgridDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HeatgridDefinition'", e);
      }

      // deserialize QueryTableBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableBackendDefinition.class.equals(Integer.class)
            || QueryTableBackendDefinition.class.equals(Long.class)
            || QueryTableBackendDefinition.class.equals(Float.class)
            || QueryTableBackendDefinition.class.equals(Double.class)
            || QueryTableBackendDefinition.class.equals(Boolean.class)
            || QueryTableBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableBackendDefinition.class.equals(Integer.class)
                        || QueryTableBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableBackendDefinition.class.equals(Float.class)
                        || QueryTableBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryTableBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryTableBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryTableBackendDefinition'", e);
      }

      // deserialize QueryValueBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueBackendDefinition.class.equals(Integer.class)
            || QueryValueBackendDefinition.class.equals(Long.class)
            || QueryValueBackendDefinition.class.equals(Float.class)
            || QueryValueBackendDefinition.class.equals(Double.class)
            || QueryValueBackendDefinition.class.equals(Boolean.class)
            || QueryValueBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueBackendDefinition.class.equals(Integer.class)
                        || QueryValueBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueBackendDefinition.class.equals(Float.class)
                        || QueryValueBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryValueBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryValueBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryValueBackendDefinition'", e);
      }

      // deserialize ScatterplotBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendDefinition.class.equals(Integer.class)
            || ScatterplotBackendDefinition.class.equals(Long.class)
            || ScatterplotBackendDefinition.class.equals(Float.class)
            || ScatterplotBackendDefinition.class.equals(Double.class)
            || ScatterplotBackendDefinition.class.equals(Boolean.class)
            || ScatterplotBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendDefinition.class.equals(Integer.class)
                        || ScatterplotBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendDefinition.class.equals(Float.class)
                        || ScatterplotBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScatterplotBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScatterplotBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScatterplotBackendDefinition'", e);
      }

      // deserialize SunburstBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstBackendDefinition.class.equals(Integer.class)
            || SunburstBackendDefinition.class.equals(Long.class)
            || SunburstBackendDefinition.class.equals(Float.class)
            || SunburstBackendDefinition.class.equals(Double.class)
            || SunburstBackendDefinition.class.equals(Boolean.class)
            || SunburstBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstBackendDefinition.class.equals(Integer.class)
                        || SunburstBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstBackendDefinition.class.equals(Float.class)
                        || SunburstBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SunburstBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SunburstBackendDefinition'", e);
      }

      // deserialize TimeseriesWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesWidgetDefinition.class.equals(Integer.class)
            || TimeseriesWidgetDefinition.class.equals(Long.class)
            || TimeseriesWidgetDefinition.class.equals(Float.class)
            || TimeseriesWidgetDefinition.class.equals(Double.class)
            || TimeseriesWidgetDefinition.class.equals(Boolean.class)
            || TimeseriesWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesWidgetDefinition.class.equals(Integer.class)
                        || TimeseriesWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesWidgetDefinition.class.equals(Float.class)
                        || TimeseriesWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesWidgetDefinition'", e);
      }

      // deserialize ToplistBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendDefinition.class.equals(Integer.class)
            || ToplistBackendDefinition.class.equals(Long.class)
            || ToplistBackendDefinition.class.equals(Float.class)
            || ToplistBackendDefinition.class.equals(Double.class)
            || ToplistBackendDefinition.class.equals(Boolean.class)
            || ToplistBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendDefinition.class.equals(Integer.class)
                        || ToplistBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendDefinition.class.equals(Float.class)
                        || ToplistBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ToplistBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ToplistBackendDefinition'", e);
      }

      // deserialize TreemapBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendDefinition.class.equals(Integer.class)
            || TreemapBackendDefinition.class.equals(Long.class)
            || TreemapBackendDefinition.class.equals(Float.class)
            || TreemapBackendDefinition.class.equals(Double.class)
            || TreemapBackendDefinition.class.equals(Boolean.class)
            || TreemapBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendDefinition.class.equals(Integer.class)
                        || TreemapBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendDefinition.class.equals(Float.class)
                        || TreemapBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreemapBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreemapBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TreemapBackendDefinition'", e);
      }

      // deserialize WildcardBackendDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WildcardBackendDefinition.class.equals(Integer.class)
            || WildcardBackendDefinition.class.equals(Long.class)
            || WildcardBackendDefinition.class.equals(Float.class)
            || WildcardBackendDefinition.class.equals(Double.class)
            || WildcardBackendDefinition.class.equals(Boolean.class)
            || WildcardBackendDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WildcardBackendDefinition.class.equals(Integer.class)
                        || WildcardBackendDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WildcardBackendDefinition.class.equals(Float.class)
                        || WildcardBackendDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WildcardBackendDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WildcardBackendDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WildcardBackendDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WildcardBackendDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WildcardBackendDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WildcardBackendDefinition'", e);
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

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(BarChartBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(ChangeBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(
      DistributionBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(GeomapBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(HeatgridDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(QueryTableBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(QueryValueBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(ScatterplotBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(SunburstBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(TimeseriesWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(ToplistBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(TreemapBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGroupBackendDefinition20270101SourceWidgetDefinition(WildcardBackendDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("BarChartBackendDefinition", new GenericType<BarChartBackendDefinition>() {});
    schemas.put("ChangeBackendDefinition", new GenericType<ChangeBackendDefinition>() {});
    schemas.put(
        "DistributionBackendDefinition", new GenericType<DistributionBackendDefinition>() {});
    schemas.put("GeomapBackendDefinition", new GenericType<GeomapBackendDefinition>() {});
    schemas.put("HeatgridDefinition", new GenericType<HeatgridDefinition>() {});
    schemas.put("QueryTableBackendDefinition", new GenericType<QueryTableBackendDefinition>() {});
    schemas.put("QueryValueBackendDefinition", new GenericType<QueryValueBackendDefinition>() {});
    schemas.put("ScatterplotBackendDefinition", new GenericType<ScatterplotBackendDefinition>() {});
    schemas.put("SunburstBackendDefinition", new GenericType<SunburstBackendDefinition>() {});
    schemas.put("TimeseriesWidgetDefinition", new GenericType<TimeseriesWidgetDefinition>() {});
    schemas.put("ToplistBackendDefinition", new GenericType<ToplistBackendDefinition>() {});
    schemas.put("TreemapBackendDefinition", new GenericType<TreemapBackendDefinition>() {});
    schemas.put("WildcardBackendDefinition", new GenericType<WildcardBackendDefinition>() {});
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
   * against the oneOf child schemas: BarChartBackendDefinition, ChangeBackendDefinition,
   * DistributionBackendDefinition, GeomapBackendDefinition, HeatgridDefinition,
   * QueryTableBackendDefinition, QueryValueBackendDefinition, ScatterplotBackendDefinition,
   * SunburstBackendDefinition, TimeseriesWidgetDefinition, ToplistBackendDefinition,
   * TreemapBackendDefinition, WildcardBackendDefinition
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(BarChartBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ChangeBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DistributionBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GeomapBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HeatgridDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryTableBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryValueBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScatterplotBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SunburstBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ToplistBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TreemapBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(WildcardBackendDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be BarChartBackendDefinition, ChangeBackendDefinition,"
            + " DistributionBackendDefinition, GeomapBackendDefinition, HeatgridDefinition,"
            + " QueryTableBackendDefinition, QueryValueBackendDefinition,"
            + " ScatterplotBackendDefinition, SunburstBackendDefinition,"
            + " TimeseriesWidgetDefinition, ToplistBackendDefinition, TreemapBackendDefinition,"
            + " WildcardBackendDefinition");
  }

  /**
   * Get the actual instance, which can be the following: BarChartBackendDefinition,
   * ChangeBackendDefinition, DistributionBackendDefinition, GeomapBackendDefinition,
   * HeatgridDefinition, QueryTableBackendDefinition, QueryValueBackendDefinition,
   * ScatterplotBackendDefinition, SunburstBackendDefinition, TimeseriesWidgetDefinition,
   * ToplistBackendDefinition, TreemapBackendDefinition, WildcardBackendDefinition
   *
   * @return The actual instance (BarChartBackendDefinition, ChangeBackendDefinition,
   *     DistributionBackendDefinition, GeomapBackendDefinition, HeatgridDefinition,
   *     QueryTableBackendDefinition, QueryValueBackendDefinition, ScatterplotBackendDefinition,
   *     SunburstBackendDefinition, TimeseriesWidgetDefinition, ToplistBackendDefinition,
   *     TreemapBackendDefinition, WildcardBackendDefinition)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendDefinition`. If the actual instance is not
   * `BarChartBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `BarChartBackendDefinition`
   * @throws ClassCastException if the instance is not `BarChartBackendDefinition`
   */
  public BarChartBackendDefinition getBarChartBackendDefinition() throws ClassCastException {
    return (BarChartBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeBackendDefinition`. If the actual instance is not
   * `ChangeBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeBackendDefinition`
   * @throws ClassCastException if the instance is not `ChangeBackendDefinition`
   */
  public ChangeBackendDefinition getChangeBackendDefinition() throws ClassCastException {
    return (ChangeBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendDefinition`. If the actual instance is not
   * `DistributionBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DistributionBackendDefinition`
   * @throws ClassCastException if the instance is not `DistributionBackendDefinition`
   */
  public DistributionBackendDefinition getDistributionBackendDefinition()
      throws ClassCastException {
    return (DistributionBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendDefinition`. If the actual instance is not
   * `GeomapBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GeomapBackendDefinition`
   * @throws ClassCastException if the instance is not `GeomapBackendDefinition`
   */
  public GeomapBackendDefinition getGeomapBackendDefinition() throws ClassCastException {
    return (GeomapBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatgridDefinition`. If the actual instance is not
   * `HeatgridDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatgridDefinition`
   * @throws ClassCastException if the instance is not `HeatgridDefinition`
   */
  public HeatgridDefinition getHeatgridDefinition() throws ClassCastException {
    return (HeatgridDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableBackendDefinition`. If the actual instance is not
   * `QueryTableBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryTableBackendDefinition`
   * @throws ClassCastException if the instance is not `QueryTableBackendDefinition`
   */
  public QueryTableBackendDefinition getQueryTableBackendDefinition() throws ClassCastException {
    return (QueryTableBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueBackendDefinition`. If the actual instance is not
   * `QueryValueBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryValueBackendDefinition`
   * @throws ClassCastException if the instance is not `QueryValueBackendDefinition`
   */
  public QueryValueBackendDefinition getQueryValueBackendDefinition() throws ClassCastException {
    return (QueryValueBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendDefinition`. If the actual instance is not
   * `ScatterplotBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendDefinition`
   * @throws ClassCastException if the instance is not `ScatterplotBackendDefinition`
   */
  public ScatterplotBackendDefinition getScatterplotBackendDefinition() throws ClassCastException {
    return (ScatterplotBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstBackendDefinition`. If the actual instance is not
   * `SunburstBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SunburstBackendDefinition`
   * @throws ClassCastException if the instance is not `SunburstBackendDefinition`
   */
  public SunburstBackendDefinition getSunburstBackendDefinition() throws ClassCastException {
    return (SunburstBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesWidgetDefinition`. If the actual instance is not
   * `TimeseriesWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesWidgetDefinition`
   * @throws ClassCastException if the instance is not `TimeseriesWidgetDefinition`
   */
  public TimeseriesWidgetDefinition getTimeseriesWidgetDefinition() throws ClassCastException {
    return (TimeseriesWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendDefinition`. If the actual instance is not
   * `ToplistBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistBackendDefinition`
   * @throws ClassCastException if the instance is not `ToplistBackendDefinition`
   */
  public ToplistBackendDefinition getToplistBackendDefinition() throws ClassCastException {
    return (ToplistBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendDefinition`. If the actual instance is not
   * `TreemapBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreemapBackendDefinition`
   * @throws ClassCastException if the instance is not `TreemapBackendDefinition`
   */
  public TreemapBackendDefinition getTreemapBackendDefinition() throws ClassCastException {
    return (TreemapBackendDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WildcardBackendDefinition`. If the actual instance is not
   * `WildcardBackendDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WildcardBackendDefinition`
   * @throws ClassCastException if the instance is not `WildcardBackendDefinition`
   */
  public WildcardBackendDefinition getWildcardBackendDefinition() throws ClassCastException {
    return (WildcardBackendDefinition) super.getActualInstance();
  }
}
