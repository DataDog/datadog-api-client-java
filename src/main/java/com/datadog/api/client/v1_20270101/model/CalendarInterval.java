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
@JsonDeserialize(using = CalendarInterval.CalendarIntervalDeserializer.class)
@JsonSerialize(using = CalendarInterval.CalendarIntervalSerializer.class)
public class CalendarInterval extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CalendarInterval.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CalendarIntervalSerializer extends StdSerializer<CalendarInterval> {
    public CalendarIntervalSerializer(Class<CalendarInterval> t) {
      super(t);
    }

    public CalendarIntervalSerializer() {
      this(null);
    }

    @Override
    public void serialize(CalendarInterval value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CalendarIntervalDeserializer extends StdDeserializer<CalendarInterval> {
    public CalendarIntervalDeserializer() {
      this(CalendarInterval.class);
    }

    public CalendarIntervalDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CalendarInterval deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CalendarIntervalDay
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CalendarIntervalDay.class.equals(Integer.class)
            || CalendarIntervalDay.class.equals(Long.class)
            || CalendarIntervalDay.class.equals(Float.class)
            || CalendarIntervalDay.class.equals(Double.class)
            || CalendarIntervalDay.class.equals(Boolean.class)
            || CalendarIntervalDay.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CalendarIntervalDay.class.equals(Integer.class)
                        || CalendarIntervalDay.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CalendarIntervalDay.class.equals(Float.class)
                        || CalendarIntervalDay.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CalendarIntervalDay.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CalendarIntervalDay.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CalendarIntervalDay.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CalendarIntervalDay) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CalendarIntervalDay'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CalendarIntervalDay'", e);
      }

      // deserialize CalendarIntervalWeek
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CalendarIntervalWeek.class.equals(Integer.class)
            || CalendarIntervalWeek.class.equals(Long.class)
            || CalendarIntervalWeek.class.equals(Float.class)
            || CalendarIntervalWeek.class.equals(Double.class)
            || CalendarIntervalWeek.class.equals(Boolean.class)
            || CalendarIntervalWeek.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CalendarIntervalWeek.class.equals(Integer.class)
                        || CalendarIntervalWeek.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CalendarIntervalWeek.class.equals(Float.class)
                        || CalendarIntervalWeek.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CalendarIntervalWeek.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CalendarIntervalWeek.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CalendarIntervalWeek.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CalendarIntervalWeek) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CalendarIntervalWeek'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CalendarIntervalWeek'", e);
      }

      // deserialize CalendarIntervalMonth
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CalendarIntervalMonth.class.equals(Integer.class)
            || CalendarIntervalMonth.class.equals(Long.class)
            || CalendarIntervalMonth.class.equals(Float.class)
            || CalendarIntervalMonth.class.equals(Double.class)
            || CalendarIntervalMonth.class.equals(Boolean.class)
            || CalendarIntervalMonth.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CalendarIntervalMonth.class.equals(Integer.class)
                        || CalendarIntervalMonth.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CalendarIntervalMonth.class.equals(Float.class)
                        || CalendarIntervalMonth.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CalendarIntervalMonth.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CalendarIntervalMonth.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CalendarIntervalMonth.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CalendarIntervalMonth) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CalendarIntervalMonth'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CalendarIntervalMonth'", e);
      }

      // deserialize CalendarIntervalYear
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CalendarIntervalYear.class.equals(Integer.class)
            || CalendarIntervalYear.class.equals(Long.class)
            || CalendarIntervalYear.class.equals(Float.class)
            || CalendarIntervalYear.class.equals(Double.class)
            || CalendarIntervalYear.class.equals(Boolean.class)
            || CalendarIntervalYear.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CalendarIntervalYear.class.equals(Integer.class)
                        || CalendarIntervalYear.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CalendarIntervalYear.class.equals(Float.class)
                        || CalendarIntervalYear.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CalendarIntervalYear.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CalendarIntervalYear.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CalendarIntervalYear.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CalendarIntervalYear) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CalendarIntervalYear'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CalendarIntervalYear'", e);
      }

      CalendarInterval ret = new CalendarInterval();
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
    public CalendarInterval getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CalendarInterval cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CalendarInterval() {
    super("oneOf", Boolean.FALSE);
  }

  public CalendarInterval(CalendarIntervalDay o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CalendarInterval(CalendarIntervalWeek o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CalendarInterval(CalendarIntervalMonth o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CalendarInterval(CalendarIntervalYear o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("CalendarIntervalDay", new GenericType<CalendarIntervalDay>() {});
    schemas.put("CalendarIntervalWeek", new GenericType<CalendarIntervalWeek>() {});
    schemas.put("CalendarIntervalMonth", new GenericType<CalendarIntervalMonth>() {});
    schemas.put("CalendarIntervalYear", new GenericType<CalendarIntervalYear>() {});
    JSON.registerDescendants(CalendarInterval.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CalendarInterval.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CalendarIntervalDay, CalendarIntervalWeek,
   * CalendarIntervalMonth, CalendarIntervalYear
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CalendarIntervalDay.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CalendarIntervalWeek.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CalendarIntervalMonth.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CalendarIntervalYear.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CalendarIntervalDay, CalendarIntervalWeek,"
            + " CalendarIntervalMonth, CalendarIntervalYear");
  }

  /**
   * Get the actual instance, which can be the following: CalendarIntervalDay, CalendarIntervalWeek,
   * CalendarIntervalMonth, CalendarIntervalYear
   *
   * @return The actual instance (CalendarIntervalDay, CalendarIntervalWeek, CalendarIntervalMonth,
   *     CalendarIntervalYear)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CalendarIntervalDay`. If the actual instance is not
   * `CalendarIntervalDay`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CalendarIntervalDay`
   * @throws ClassCastException if the instance is not `CalendarIntervalDay`
   */
  public CalendarIntervalDay getCalendarIntervalDay() throws ClassCastException {
    return (CalendarIntervalDay) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CalendarIntervalWeek`. If the actual instance is not
   * `CalendarIntervalWeek`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CalendarIntervalWeek`
   * @throws ClassCastException if the instance is not `CalendarIntervalWeek`
   */
  public CalendarIntervalWeek getCalendarIntervalWeek() throws ClassCastException {
    return (CalendarIntervalWeek) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CalendarIntervalMonth`. If the actual instance is not
   * `CalendarIntervalMonth`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CalendarIntervalMonth`
   * @throws ClassCastException if the instance is not `CalendarIntervalMonth`
   */
  public CalendarIntervalMonth getCalendarIntervalMonth() throws ClassCastException {
    return (CalendarIntervalMonth) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CalendarIntervalYear`. If the actual instance is not
   * `CalendarIntervalYear`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CalendarIntervalYear`
   * @throws ClassCastException if the instance is not `CalendarIntervalYear`
   */
  public CalendarIntervalYear getCalendarIntervalYear() throws ClassCastException {
    return (CalendarIntervalYear) super.getActualInstance();
  }
}
