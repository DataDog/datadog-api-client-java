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
    using = SplitGraphSourceWidgetDefinition.SplitGraphSourceWidgetDefinitionDeserializer.class)
@JsonSerialize(
    using = SplitGraphSourceWidgetDefinition.SplitGraphSourceWidgetDefinitionSerializer.class)
public class SplitGraphSourceWidgetDefinition extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SplitGraphSourceWidgetDefinition.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SplitGraphSourceWidgetDefinitionSerializer
      extends StdSerializer<SplitGraphSourceWidgetDefinition> {
    public SplitGraphSourceWidgetDefinitionSerializer(Class<SplitGraphSourceWidgetDefinition> t) {
      super(t);
    }

    public SplitGraphSourceWidgetDefinitionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SplitGraphSourceWidgetDefinition value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SplitGraphSourceWidgetDefinitionDeserializer
      extends StdDeserializer<SplitGraphSourceWidgetDefinition> {
    public SplitGraphSourceWidgetDefinitionDeserializer() {
      this(SplitGraphSourceWidgetDefinition.class);
    }

    public SplitGraphSourceWidgetDefinitionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SplitGraphSourceWidgetDefinition deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize BarChartWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartWidgetDefinition.class.equals(Integer.class)
            || BarChartWidgetDefinition.class.equals(Long.class)
            || BarChartWidgetDefinition.class.equals(Float.class)
            || BarChartWidgetDefinition.class.equals(Double.class)
            || BarChartWidgetDefinition.class.equals(Boolean.class)
            || BarChartWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartWidgetDefinition.class.equals(Integer.class)
                        || BarChartWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartWidgetDefinition.class.equals(Float.class)
                        || BarChartWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(BarChartWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'BarChartWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'BarChartWidgetDefinition'", e);
      }

      // deserialize ChangeWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeWidgetDefinition.class.equals(Integer.class)
            || ChangeWidgetDefinition.class.equals(Long.class)
            || ChangeWidgetDefinition.class.equals(Float.class)
            || ChangeWidgetDefinition.class.equals(Double.class)
            || ChangeWidgetDefinition.class.equals(Boolean.class)
            || ChangeWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeWidgetDefinition.class.equals(Integer.class)
                        || ChangeWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeWidgetDefinition.class.equals(Float.class)
                        || ChangeWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ChangeWidgetDefinition'", e);
      }

      // deserialize GeomapWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapWidgetDefinition.class.equals(Integer.class)
            || GeomapWidgetDefinition.class.equals(Long.class)
            || GeomapWidgetDefinition.class.equals(Float.class)
            || GeomapWidgetDefinition.class.equals(Double.class)
            || GeomapWidgetDefinition.class.equals(Boolean.class)
            || GeomapWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapWidgetDefinition.class.equals(Integer.class)
                        || GeomapWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapWidgetDefinition.class.equals(Float.class)
                        || GeomapWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GeomapWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GeomapWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GeomapWidgetDefinition'", e);
      }

      // deserialize QueryValueWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueWidgetDefinition.class.equals(Integer.class)
            || QueryValueWidgetDefinition.class.equals(Long.class)
            || QueryValueWidgetDefinition.class.equals(Float.class)
            || QueryValueWidgetDefinition.class.equals(Double.class)
            || QueryValueWidgetDefinition.class.equals(Boolean.class)
            || QueryValueWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueWidgetDefinition.class.equals(Integer.class)
                        || QueryValueWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueWidgetDefinition.class.equals(Float.class)
                        || QueryValueWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryValueWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryValueWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryValueWidgetDefinition'", e);
      }

      // deserialize ScatterPlotWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterPlotWidgetDefinition.class.equals(Integer.class)
            || ScatterPlotWidgetDefinition.class.equals(Long.class)
            || ScatterPlotWidgetDefinition.class.equals(Float.class)
            || ScatterPlotWidgetDefinition.class.equals(Double.class)
            || ScatterPlotWidgetDefinition.class.equals(Boolean.class)
            || ScatterPlotWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterPlotWidgetDefinition.class.equals(Integer.class)
                        || ScatterPlotWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterPlotWidgetDefinition.class.equals(Float.class)
                        || ScatterPlotWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterPlotWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterPlotWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScatterPlotWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterPlotWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScatterPlotWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScatterPlotWidgetDefinition'", e);
      }

      // deserialize SunburstWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SunburstWidgetDefinition.class.equals(Integer.class)
            || SunburstWidgetDefinition.class.equals(Long.class)
            || SunburstWidgetDefinition.class.equals(Float.class)
            || SunburstWidgetDefinition.class.equals(Double.class)
            || SunburstWidgetDefinition.class.equals(Boolean.class)
            || SunburstWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SunburstWidgetDefinition.class.equals(Integer.class)
                        || SunburstWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SunburstWidgetDefinition.class.equals(Float.class)
                        || SunburstWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SunburstWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SunburstWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SunburstWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SunburstWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SunburstWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SunburstWidgetDefinition'", e);
      }

      // deserialize TableWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableWidgetDefinition.class.equals(Integer.class)
            || TableWidgetDefinition.class.equals(Long.class)
            || TableWidgetDefinition.class.equals(Float.class)
            || TableWidgetDefinition.class.equals(Double.class)
            || TableWidgetDefinition.class.equals(Boolean.class)
            || TableWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableWidgetDefinition.class.equals(Integer.class)
                        || TableWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableWidgetDefinition.class.equals(Float.class)
                        || TableWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TableWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TableWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TableWidgetDefinition'", e);
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

      // deserialize ToplistWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistWidgetDefinition.class.equals(Integer.class)
            || ToplistWidgetDefinition.class.equals(Long.class)
            || ToplistWidgetDefinition.class.equals(Float.class)
            || ToplistWidgetDefinition.class.equals(Double.class)
            || ToplistWidgetDefinition.class.equals(Boolean.class)
            || ToplistWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistWidgetDefinition.class.equals(Integer.class)
                        || ToplistWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistWidgetDefinition.class.equals(Float.class)
                        || ToplistWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ToplistWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ToplistWidgetDefinition'", e);
      }

      // deserialize TreeMapWidgetDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreeMapWidgetDefinition.class.equals(Integer.class)
            || TreeMapWidgetDefinition.class.equals(Long.class)
            || TreeMapWidgetDefinition.class.equals(Float.class)
            || TreeMapWidgetDefinition.class.equals(Double.class)
            || TreeMapWidgetDefinition.class.equals(Boolean.class)
            || TreeMapWidgetDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreeMapWidgetDefinition.class.equals(Integer.class)
                        || TreeMapWidgetDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreeMapWidgetDefinition.class.equals(Float.class)
                        || TreeMapWidgetDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreeMapWidgetDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreeMapWidgetDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreeMapWidgetDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreeMapWidgetDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreeMapWidgetDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TreeMapWidgetDefinition'", e);
      }

      SplitGraphSourceWidgetDefinition ret = new SplitGraphSourceWidgetDefinition();
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
    public SplitGraphSourceWidgetDefinition getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SplitGraphSourceWidgetDefinition cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SplitGraphSourceWidgetDefinition() {
    super("oneOf", Boolean.FALSE);
  }

  public SplitGraphSourceWidgetDefinition(BarChartWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(ChangeWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(GeomapWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(QueryValueWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(ScatterPlotWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(SunburstWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(TableWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(TimeseriesWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(ToplistWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SplitGraphSourceWidgetDefinition(TreeMapWidgetDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("BarChartWidgetDefinition", new GenericType<BarChartWidgetDefinition>() {});
    schemas.put("ChangeWidgetDefinition", new GenericType<ChangeWidgetDefinition>() {});
    schemas.put("GeomapWidgetDefinition", new GenericType<GeomapWidgetDefinition>() {});
    schemas.put("QueryValueWidgetDefinition", new GenericType<QueryValueWidgetDefinition>() {});
    schemas.put("ScatterPlotWidgetDefinition", new GenericType<ScatterPlotWidgetDefinition>() {});
    schemas.put("SunburstWidgetDefinition", new GenericType<SunburstWidgetDefinition>() {});
    schemas.put("TableWidgetDefinition", new GenericType<TableWidgetDefinition>() {});
    schemas.put("TimeseriesWidgetDefinition", new GenericType<TimeseriesWidgetDefinition>() {});
    schemas.put("ToplistWidgetDefinition", new GenericType<ToplistWidgetDefinition>() {});
    schemas.put("TreeMapWidgetDefinition", new GenericType<TreeMapWidgetDefinition>() {});
    JSON.registerDescendants(
        SplitGraphSourceWidgetDefinition.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SplitGraphSourceWidgetDefinition.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: BarChartWidgetDefinition, ChangeWidgetDefinition,
   * GeomapWidgetDefinition, QueryValueWidgetDefinition, ScatterPlotWidgetDefinition,
   * SunburstWidgetDefinition, TableWidgetDefinition, TimeseriesWidgetDefinition,
   * ToplistWidgetDefinition, TreeMapWidgetDefinition
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(BarChartWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ChangeWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GeomapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryValueWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScatterPlotWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SunburstWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TableWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ToplistWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TreeMapWidgetDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be BarChartWidgetDefinition, ChangeWidgetDefinition,"
            + " GeomapWidgetDefinition, QueryValueWidgetDefinition, ScatterPlotWidgetDefinition,"
            + " SunburstWidgetDefinition, TableWidgetDefinition, TimeseriesWidgetDefinition,"
            + " ToplistWidgetDefinition, TreeMapWidgetDefinition");
  }

  /**
   * Get the actual instance, which can be the following: BarChartWidgetDefinition,
   * ChangeWidgetDefinition, GeomapWidgetDefinition, QueryValueWidgetDefinition,
   * ScatterPlotWidgetDefinition, SunburstWidgetDefinition, TableWidgetDefinition,
   * TimeseriesWidgetDefinition, ToplistWidgetDefinition, TreeMapWidgetDefinition
   *
   * @return The actual instance (BarChartWidgetDefinition, ChangeWidgetDefinition,
   *     GeomapWidgetDefinition, QueryValueWidgetDefinition, ScatterPlotWidgetDefinition,
   *     SunburstWidgetDefinition, TableWidgetDefinition, TimeseriesWidgetDefinition,
   *     ToplistWidgetDefinition, TreeMapWidgetDefinition)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartWidgetDefinition`. If the actual instance is not
   * `BarChartWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `BarChartWidgetDefinition`
   * @throws ClassCastException if the instance is not `BarChartWidgetDefinition`
   */
  public BarChartWidgetDefinition getBarChartWidgetDefinition() throws ClassCastException {
    return (BarChartWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeWidgetDefinition`. If the actual instance is not
   * `ChangeWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeWidgetDefinition`
   * @throws ClassCastException if the instance is not `ChangeWidgetDefinition`
   */
  public ChangeWidgetDefinition getChangeWidgetDefinition() throws ClassCastException {
    return (ChangeWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapWidgetDefinition`. If the actual instance is not
   * `GeomapWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GeomapWidgetDefinition`
   * @throws ClassCastException if the instance is not `GeomapWidgetDefinition`
   */
  public GeomapWidgetDefinition getGeomapWidgetDefinition() throws ClassCastException {
    return (GeomapWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueWidgetDefinition`. If the actual instance is not
   * `QueryValueWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryValueWidgetDefinition`
   * @throws ClassCastException if the instance is not `QueryValueWidgetDefinition`
   */
  public QueryValueWidgetDefinition getQueryValueWidgetDefinition() throws ClassCastException {
    return (QueryValueWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterPlotWidgetDefinition`. If the actual instance is not
   * `ScatterPlotWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterPlotWidgetDefinition`
   * @throws ClassCastException if the instance is not `ScatterPlotWidgetDefinition`
   */
  public ScatterPlotWidgetDefinition getScatterPlotWidgetDefinition() throws ClassCastException {
    return (ScatterPlotWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SunburstWidgetDefinition`. If the actual instance is not
   * `SunburstWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SunburstWidgetDefinition`
   * @throws ClassCastException if the instance is not `SunburstWidgetDefinition`
   */
  public SunburstWidgetDefinition getSunburstWidgetDefinition() throws ClassCastException {
    return (SunburstWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableWidgetDefinition`. If the actual instance is not
   * `TableWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TableWidgetDefinition`
   * @throws ClassCastException if the instance is not `TableWidgetDefinition`
   */
  public TableWidgetDefinition getTableWidgetDefinition() throws ClassCastException {
    return (TableWidgetDefinition) super.getActualInstance();
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
   * Get the actual instance of `ToplistWidgetDefinition`. If the actual instance is not
   * `ToplistWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistWidgetDefinition`
   * @throws ClassCastException if the instance is not `ToplistWidgetDefinition`
   */
  public ToplistWidgetDefinition getToplistWidgetDefinition() throws ClassCastException {
    return (ToplistWidgetDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreeMapWidgetDefinition`. If the actual instance is not
   * `TreeMapWidgetDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreeMapWidgetDefinition`
   * @throws ClassCastException if the instance is not `TreeMapWidgetDefinition`
   */
  public TreeMapWidgetDefinition getTreeMapWidgetDefinition() throws ClassCastException {
    return (TreeMapWidgetDefinition) super.getActualInstance();
  }
}
