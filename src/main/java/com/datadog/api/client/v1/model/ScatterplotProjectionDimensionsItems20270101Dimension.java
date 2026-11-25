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
        ScatterplotProjectionDimensionsItems20270101Dimension
            .ScatterplotProjectionDimensionsItems20270101DimensionDeserializer.class)
@JsonSerialize(
    using =
        ScatterplotProjectionDimensionsItems20270101Dimension
            .ScatterplotProjectionDimensionsItems20270101DimensionSerializer.class)
public class ScatterplotProjectionDimensionsItems20270101Dimension extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ScatterplotProjectionDimensionsItems20270101Dimension.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ScatterplotProjectionDimensionsItems20270101DimensionSerializer
      extends StdSerializer<ScatterplotProjectionDimensionsItems20270101Dimension> {
    public ScatterplotProjectionDimensionsItems20270101DimensionSerializer(
        Class<ScatterplotProjectionDimensionsItems20270101Dimension> t) {
      super(t);
    }

    public ScatterplotProjectionDimensionsItems20270101DimensionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotProjectionDimensionsItems20270101Dimension value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ScatterplotProjectionDimensionsItems20270101DimensionDeserializer
      extends StdDeserializer<ScatterplotProjectionDimensionsItems20270101Dimension> {
    public ScatterplotProjectionDimensionsItems20270101DimensionDeserializer() {
      this(ScatterplotProjectionDimensionsItems20270101Dimension.class);
    }

    public ScatterplotProjectionDimensionsItems20270101DimensionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ScatterplotProjectionDimensionsItems20270101Dimension deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DashboardInlineSchema32_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardInlineSchema32_20270101.class.equals(Integer.class)
            || DashboardInlineSchema32_20270101.class.equals(Long.class)
            || DashboardInlineSchema32_20270101.class.equals(Float.class)
            || DashboardInlineSchema32_20270101.class.equals(Double.class)
            || DashboardInlineSchema32_20270101.class.equals(Boolean.class)
            || DashboardInlineSchema32_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardInlineSchema32_20270101.class.equals(Integer.class)
                        || DashboardInlineSchema32_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardInlineSchema32_20270101.class.equals(Float.class)
                        || DashboardInlineSchema32_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardInlineSchema32_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardInlineSchema32_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardInlineSchema32_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'DashboardInlineSchema32_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'DashboardInlineSchema32_20270101'", e);
      }

      // deserialize ScatterPlotDimension_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterPlotDimension_20270101.class.equals(Integer.class)
            || ScatterPlotDimension_20270101.class.equals(Long.class)
            || ScatterPlotDimension_20270101.class.equals(Float.class)
            || ScatterPlotDimension_20270101.class.equals(Double.class)
            || ScatterPlotDimension_20270101.class.equals(Boolean.class)
            || ScatterPlotDimension_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterPlotDimension_20270101.class.equals(Integer.class)
                        || ScatterPlotDimension_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterPlotDimension_20270101.class.equals(Float.class)
                        || ScatterPlotDimension_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterPlotDimension_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterPlotDimension_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScatterPlotDimension_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'ScatterPlotDimension_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScatterPlotDimension_20270101'", e);
      }

      ScatterplotProjectionDimensionsItems20270101Dimension ret =
          new ScatterplotProjectionDimensionsItems20270101Dimension();
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
    public ScatterplotProjectionDimensionsItems20270101Dimension getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ScatterplotProjectionDimensionsItems20270101Dimension cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ScatterplotProjectionDimensionsItems20270101Dimension() {
    super("oneOf", Boolean.FALSE);
  }

  public ScatterplotProjectionDimensionsItems20270101Dimension(DashboardInlineSchema32_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScatterplotProjectionDimensionsItems20270101Dimension(ScatterPlotDimension_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DashboardInlineSchema32_20270101", new GenericType<DashboardInlineSchema32_20270101>() {});
    schemas.put(
        "ScatterPlotDimension_20270101", new GenericType<ScatterPlotDimension_20270101>() {});
    JSON.registerDescendants(
        ScatterplotProjectionDimensionsItems20270101Dimension.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ScatterplotProjectionDimensionsItems20270101Dimension.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DashboardInlineSchema32_20270101,
   * ScatterPlotDimension_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DashboardInlineSchema32_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScatterPlotDimension_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DashboardInlineSchema32_20270101,"
            + " ScatterPlotDimension_20270101");
  }

  /**
   * Get the actual instance, which can be the following: DashboardInlineSchema32_20270101,
   * ScatterPlotDimension_20270101
   *
   * @return The actual instance (DashboardInlineSchema32_20270101, ScatterPlotDimension_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardInlineSchema32_20270101`. If the actual instance is not
   * `DashboardInlineSchema32_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardInlineSchema32_20270101`
   * @throws ClassCastException if the instance is not `DashboardInlineSchema32_20270101`
   */
  public DashboardInlineSchema32_20270101 getDashboardInlineSchema32_20270101()
      throws ClassCastException {
    return (DashboardInlineSchema32_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterPlotDimension_20270101`. If the actual instance is not
   * `ScatterPlotDimension_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterPlotDimension_20270101`
   * @throws ClassCastException if the instance is not `ScatterPlotDimension_20270101`
   */
  public ScatterPlotDimension_20270101 getScatterPlotDimension_20270101()
      throws ClassCastException {
    return (ScatterPlotDimension_20270101) super.getActualInstance();
  }
}
