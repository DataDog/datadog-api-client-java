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
        RetentionSearchCohortCriteriaTimeInterval20270101Value
            .RetentionSearchCohortCriteriaTimeInterval20270101ValueDeserializer.class)
@JsonSerialize(
    using =
        RetentionSearchCohortCriteriaTimeInterval20270101Value
            .RetentionSearchCohortCriteriaTimeInterval20270101ValueSerializer.class)
public class RetentionSearchCohortCriteriaTimeInterval20270101Value extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(RetentionSearchCohortCriteriaTimeInterval20270101Value.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class RetentionSearchCohortCriteriaTimeInterval20270101ValueSerializer
      extends StdSerializer<RetentionSearchCohortCriteriaTimeInterval20270101Value> {
    public RetentionSearchCohortCriteriaTimeInterval20270101ValueSerializer(
        Class<RetentionSearchCohortCriteriaTimeInterval20270101Value> t) {
      super(t);
    }

    public RetentionSearchCohortCriteriaTimeInterval20270101ValueSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionSearchCohortCriteriaTimeInterval20270101Value value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class RetentionSearchCohortCriteriaTimeInterval20270101ValueDeserializer
      extends StdDeserializer<RetentionSearchCohortCriteriaTimeInterval20270101Value> {
    public RetentionSearchCohortCriteriaTimeInterval20270101ValueDeserializer() {
      this(RetentionSearchCohortCriteriaTimeInterval20270101Value.class);
    }

    public RetentionSearchCohortCriteriaTimeInterval20270101ValueDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public RetentionSearchCohortCriteriaTimeInterval20270101Value deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CalendarIntervalDay_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CalendarIntervalDay_20270101.class.equals(Integer.class)
            || CalendarIntervalDay_20270101.class.equals(Long.class)
            || CalendarIntervalDay_20270101.class.equals(Float.class)
            || CalendarIntervalDay_20270101.class.equals(Double.class)
            || CalendarIntervalDay_20270101.class.equals(Boolean.class)
            || CalendarIntervalDay_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CalendarIntervalDay_20270101.class.equals(Integer.class)
                        || CalendarIntervalDay_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CalendarIntervalDay_20270101.class.equals(Float.class)
                        || CalendarIntervalDay_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CalendarIntervalDay_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CalendarIntervalDay_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CalendarIntervalDay_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CalendarIntervalDay_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CalendarIntervalDay_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CalendarIntervalDay_20270101'", e);
      }

      // deserialize CalendarIntervalWeek_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CalendarIntervalWeek_20270101.class.equals(Integer.class)
            || CalendarIntervalWeek_20270101.class.equals(Long.class)
            || CalendarIntervalWeek_20270101.class.equals(Float.class)
            || CalendarIntervalWeek_20270101.class.equals(Double.class)
            || CalendarIntervalWeek_20270101.class.equals(Boolean.class)
            || CalendarIntervalWeek_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CalendarIntervalWeek_20270101.class.equals(Integer.class)
                        || CalendarIntervalWeek_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CalendarIntervalWeek_20270101.class.equals(Float.class)
                        || CalendarIntervalWeek_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CalendarIntervalWeek_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CalendarIntervalWeek_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CalendarIntervalWeek_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CalendarIntervalWeek_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CalendarIntervalWeek_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CalendarIntervalWeek_20270101'", e);
      }

      // deserialize CalendarIntervalMonth_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CalendarIntervalMonth_20270101.class.equals(Integer.class)
            || CalendarIntervalMonth_20270101.class.equals(Long.class)
            || CalendarIntervalMonth_20270101.class.equals(Float.class)
            || CalendarIntervalMonth_20270101.class.equals(Double.class)
            || CalendarIntervalMonth_20270101.class.equals(Boolean.class)
            || CalendarIntervalMonth_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CalendarIntervalMonth_20270101.class.equals(Integer.class)
                        || CalendarIntervalMonth_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CalendarIntervalMonth_20270101.class.equals(Float.class)
                        || CalendarIntervalMonth_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CalendarIntervalMonth_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CalendarIntervalMonth_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CalendarIntervalMonth_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CalendarIntervalMonth_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CalendarIntervalMonth_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'CalendarIntervalMonth_20270101'", e);
      }

      RetentionSearchCohortCriteriaTimeInterval20270101Value ret =
          new RetentionSearchCohortCriteriaTimeInterval20270101Value();
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
    public RetentionSearchCohortCriteriaTimeInterval20270101Value getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "RetentionSearchCohortCriteriaTimeInterval20270101Value cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public RetentionSearchCohortCriteriaTimeInterval20270101Value() {
    super("oneOf", Boolean.FALSE);
  }

  public RetentionSearchCohortCriteriaTimeInterval20270101Value(CalendarIntervalDay_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public RetentionSearchCohortCriteriaTimeInterval20270101Value(CalendarIntervalWeek_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public RetentionSearchCohortCriteriaTimeInterval20270101Value(CalendarIntervalMonth_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("CalendarIntervalDay_20270101", new GenericType<CalendarIntervalDay_20270101>() {});
    schemas.put(
        "CalendarIntervalWeek_20270101", new GenericType<CalendarIntervalWeek_20270101>() {});
    schemas.put(
        "CalendarIntervalMonth_20270101", new GenericType<CalendarIntervalMonth_20270101>() {});
    JSON.registerDescendants(
        RetentionSearchCohortCriteriaTimeInterval20270101Value.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return RetentionSearchCohortCriteriaTimeInterval20270101Value.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CalendarIntervalDay_20270101, CalendarIntervalWeek_20270101,
   * CalendarIntervalMonth_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CalendarIntervalDay_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CalendarIntervalWeek_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CalendarIntervalMonth_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CalendarIntervalDay_20270101,"
            + " CalendarIntervalWeek_20270101, CalendarIntervalMonth_20270101");
  }

  /**
   * Get the actual instance, which can be the following: CalendarIntervalDay_20270101,
   * CalendarIntervalWeek_20270101, CalendarIntervalMonth_20270101
   *
   * @return The actual instance (CalendarIntervalDay_20270101, CalendarIntervalWeek_20270101,
   *     CalendarIntervalMonth_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CalendarIntervalDay_20270101`. If the actual instance is not
   * `CalendarIntervalDay_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CalendarIntervalDay_20270101`
   * @throws ClassCastException if the instance is not `CalendarIntervalDay_20270101`
   */
  public CalendarIntervalDay_20270101 getCalendarIntervalDay_20270101() throws ClassCastException {
    return (CalendarIntervalDay_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CalendarIntervalWeek_20270101`. If the actual instance is not
   * `CalendarIntervalWeek_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CalendarIntervalWeek_20270101`
   * @throws ClassCastException if the instance is not `CalendarIntervalWeek_20270101`
   */
  public CalendarIntervalWeek_20270101 getCalendarIntervalWeek_20270101()
      throws ClassCastException {
    return (CalendarIntervalWeek_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CalendarIntervalMonth_20270101`. If the actual instance is not
   * `CalendarIntervalMonth_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CalendarIntervalMonth_20270101`
   * @throws ClassCastException if the instance is not `CalendarIntervalMonth_20270101`
   */
  public CalendarIntervalMonth_20270101 getCalendarIntervalMonth_20270101()
      throws ClassCastException {
    return (CalendarIntervalMonth_20270101) super.getActualInstance();
  }
}
