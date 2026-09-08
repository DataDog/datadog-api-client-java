/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
        TimeseriesAnomalyInvestigationFinding.TimeseriesAnomalyInvestigationFindingDeserializer
            .class)
@JsonSerialize(
    using =
        TimeseriesAnomalyInvestigationFinding.TimeseriesAnomalyInvestigationFindingSerializer.class)
public class TimeseriesAnomalyInvestigationFinding extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(TimeseriesAnomalyInvestigationFinding.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TimeseriesAnomalyInvestigationFindingSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationFinding> {
    public TimeseriesAnomalyInvestigationFindingSerializer(
        Class<TimeseriesAnomalyInvestigationFinding> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationFindingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationFinding value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TimeseriesAnomalyInvestigationFindingDeserializer
      extends StdDeserializer<TimeseriesAnomalyInvestigationFinding> {
    public TimeseriesAnomalyInvestigationFindingDeserializer() {
      this(TimeseriesAnomalyInvestigationFinding.class);
    }

    public TimeseriesAnomalyInvestigationFindingDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TimeseriesAnomalyInvestigationFinding deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TimeseriesAnomalyInvestigationInfluentialTagFinding
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Integer.class)
            || TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Long.class)
            || TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Float.class)
            || TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Double.class)
            || TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Boolean.class)
            || TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Integer.class)
                        || TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Float.class)
                        || TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesAnomalyInvestigationInfluentialTagFinding.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TimeseriesAnomalyInvestigationInfluentialTagFinding.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesAnomalyInvestigationInfluentialTagFinding) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TimeseriesAnomalyInvestigationInfluentialTagFinding'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'TimeseriesAnomalyInvestigationInfluentialTagFinding'",
            e);
      }

      // deserialize TimeseriesAnomalyInvestigationAnomalyFinding
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Integer.class)
            || TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Long.class)
            || TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Float.class)
            || TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Double.class)
            || TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Boolean.class)
            || TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Integer.class)
                        || TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Float.class)
                        || TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesAnomalyInvestigationAnomalyFinding.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TimeseriesAnomalyInvestigationAnomalyFinding.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesAnomalyInvestigationAnomalyFinding) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TimeseriesAnomalyInvestigationAnomalyFinding'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TimeseriesAnomalyInvestigationAnomalyFinding'",
            e);
      }

      TimeseriesAnomalyInvestigationFinding ret = new TimeseriesAnomalyInvestigationFinding();
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
    public TimeseriesAnomalyInvestigationFinding getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TimeseriesAnomalyInvestigationFinding cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TimeseriesAnomalyInvestigationFinding() {
    super("oneOf", Boolean.FALSE);
  }

  public TimeseriesAnomalyInvestigationFinding(
      TimeseriesAnomalyInvestigationInfluentialTagFinding o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesAnomalyInvestigationFinding(TimeseriesAnomalyInvestigationAnomalyFinding o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TimeseriesAnomalyInvestigationInfluentialTagFinding",
        new GenericType<TimeseriesAnomalyInvestigationInfluentialTagFinding>() {});
    schemas.put(
        "TimeseriesAnomalyInvestigationAnomalyFinding",
        new GenericType<TimeseriesAnomalyInvestigationAnomalyFinding>() {});
    JSON.registerDescendants(
        TimeseriesAnomalyInvestigationFinding.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TimeseriesAnomalyInvestigationFinding.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TimeseriesAnomalyInvestigationInfluentialTagFinding,
   * TimeseriesAnomalyInvestigationAnomalyFinding
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TimeseriesAnomalyInvestigationInfluentialTagFinding.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TimeseriesAnomalyInvestigationAnomalyFinding.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TimeseriesAnomalyInvestigationInfluentialTagFinding,"
            + " TimeseriesAnomalyInvestigationAnomalyFinding");
  }

  /**
   * Get the actual instance, which can be the following:
   * TimeseriesAnomalyInvestigationInfluentialTagFinding,
   * TimeseriesAnomalyInvestigationAnomalyFinding
   *
   * @return The actual instance (TimeseriesAnomalyInvestigationInfluentialTagFinding,
   *     TimeseriesAnomalyInvestigationAnomalyFinding)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesAnomalyInvestigationInfluentialTagFinding`. If the actual
   * instance is not `TimeseriesAnomalyInvestigationInfluentialTagFinding`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `TimeseriesAnomalyInvestigationInfluentialTagFinding`
   * @throws ClassCastException if the instance is not
   *     `TimeseriesAnomalyInvestigationInfluentialTagFinding`
   */
  public TimeseriesAnomalyInvestigationInfluentialTagFinding
      getTimeseriesAnomalyInvestigationInfluentialTagFinding() throws ClassCastException {
    return (TimeseriesAnomalyInvestigationInfluentialTagFinding) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesAnomalyInvestigationAnomalyFinding`. If the actual
   * instance is not `TimeseriesAnomalyInvestigationAnomalyFinding`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TimeseriesAnomalyInvestigationAnomalyFinding`
   * @throws ClassCastException if the instance is not
   *     `TimeseriesAnomalyInvestigationAnomalyFinding`
   */
  public TimeseriesAnomalyInvestigationAnomalyFinding
      getTimeseriesAnomalyInvestigationAnomalyFinding() throws ClassCastException {
    return (TimeseriesAnomalyInvestigationAnomalyFinding) super.getActualInstance();
  }
}
