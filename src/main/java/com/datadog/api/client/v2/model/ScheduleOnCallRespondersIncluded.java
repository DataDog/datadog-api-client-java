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
    using = ScheduleOnCallRespondersIncluded.ScheduleOnCallRespondersIncludedDeserializer.class)
@JsonSerialize(
    using = ScheduleOnCallRespondersIncluded.ScheduleOnCallRespondersIncludedSerializer.class)
public class ScheduleOnCallRespondersIncluded extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ScheduleOnCallRespondersIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ScheduleOnCallRespondersIncludedSerializer
      extends StdSerializer<ScheduleOnCallRespondersIncluded> {
    public ScheduleOnCallRespondersIncludedSerializer(Class<ScheduleOnCallRespondersIncluded> t) {
      super(t);
    }

    public ScheduleOnCallRespondersIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleOnCallRespondersIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ScheduleOnCallRespondersIncludedDeserializer
      extends StdDeserializer<ScheduleOnCallRespondersIncluded> {
    public ScheduleOnCallRespondersIncludedDeserializer() {
      this(ScheduleOnCallRespondersIncluded.class);
    }

    public ScheduleOnCallRespondersIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ScheduleOnCallRespondersIncluded deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ScheduleOnCallResponderData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScheduleOnCallResponderData.class.equals(Integer.class)
            || ScheduleOnCallResponderData.class.equals(Long.class)
            || ScheduleOnCallResponderData.class.equals(Float.class)
            || ScheduleOnCallResponderData.class.equals(Double.class)
            || ScheduleOnCallResponderData.class.equals(Boolean.class)
            || ScheduleOnCallResponderData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScheduleOnCallResponderData.class.equals(Integer.class)
                        || ScheduleOnCallResponderData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScheduleOnCallResponderData.class.equals(Float.class)
                        || ScheduleOnCallResponderData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScheduleOnCallResponderData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScheduleOnCallResponderData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScheduleOnCallResponderData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScheduleOnCallResponderData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScheduleOnCallResponderData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScheduleOnCallResponderData'", e);
      }

      // deserialize ShiftData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ShiftData.class.equals(Integer.class)
            || ShiftData.class.equals(Long.class)
            || ShiftData.class.equals(Float.class)
            || ShiftData.class.equals(Double.class)
            || ShiftData.class.equals(Boolean.class)
            || ShiftData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ShiftData.class.equals(Integer.class) || ShiftData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ShiftData.class.equals(Float.class) || ShiftData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ShiftData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ShiftData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ShiftData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ShiftData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ShiftData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ShiftData'", e);
      }

      // deserialize ScheduleData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScheduleData.class.equals(Integer.class)
            || ScheduleData.class.equals(Long.class)
            || ScheduleData.class.equals(Float.class)
            || ScheduleData.class.equals(Double.class)
            || ScheduleData.class.equals(Boolean.class)
            || ScheduleData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScheduleData.class.equals(Integer.class) || ScheduleData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScheduleData.class.equals(Float.class) || ScheduleData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScheduleData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScheduleData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScheduleData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScheduleData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScheduleData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScheduleData'", e);
      }

      // deserialize User
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (User.class.equals(Integer.class)
            || User.class.equals(Long.class)
            || User.class.equals(Float.class)
            || User.class.equals(Double.class)
            || User.class.equals(Boolean.class)
            || User.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((User.class.equals(Integer.class) || User.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((User.class.equals(Float.class) || User.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (User.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (User.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(User.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((User) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'User'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'User'", e);
      }

      ScheduleOnCallRespondersIncluded ret = new ScheduleOnCallRespondersIncluded();
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
    public ScheduleOnCallRespondersIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ScheduleOnCallRespondersIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ScheduleOnCallRespondersIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public ScheduleOnCallRespondersIncluded(ScheduleOnCallResponderData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScheduleOnCallRespondersIncluded(ShiftData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScheduleOnCallRespondersIncluded(ScheduleData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScheduleOnCallRespondersIncluded(User o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ScheduleOnCallResponderData", new GenericType<ScheduleOnCallResponderData>() {});
    schemas.put("ShiftData", new GenericType<ShiftData>() {});
    schemas.put("ScheduleData", new GenericType<ScheduleData>() {});
    schemas.put("User", new GenericType<User>() {});
    JSON.registerDescendants(
        ScheduleOnCallRespondersIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ScheduleOnCallRespondersIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ScheduleOnCallResponderData, ShiftData, ScheduleData, User
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ScheduleOnCallResponderData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ShiftData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScheduleData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(User.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ScheduleOnCallResponderData, ShiftData, ScheduleData,"
            + " User");
  }

  /**
   * Get the actual instance, which can be the following: ScheduleOnCallResponderData, ShiftData,
   * ScheduleData, User
   *
   * @return The actual instance (ScheduleOnCallResponderData, ShiftData, ScheduleData, User)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScheduleOnCallResponderData`. If the actual instance is not
   * `ScheduleOnCallResponderData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScheduleOnCallResponderData`
   * @throws ClassCastException if the instance is not `ScheduleOnCallResponderData`
   */
  public ScheduleOnCallResponderData getScheduleOnCallResponderData() throws ClassCastException {
    return (ScheduleOnCallResponderData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ShiftData`. If the actual instance is not `ShiftData`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ShiftData`
   * @throws ClassCastException if the instance is not `ShiftData`
   */
  public ShiftData getShiftData() throws ClassCastException {
    return (ShiftData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScheduleData`. If the actual instance is not `ScheduleData`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ScheduleData`
   * @throws ClassCastException if the instance is not `ScheduleData`
   */
  public ScheduleData getScheduleData() throws ClassCastException {
    return (ScheduleData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `User`. If the actual instance is not `User`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `User`
   * @throws ClassCastException if the instance is not `User`
   */
  public User getUser() throws ClassCastException {
    return (User) super.getActualInstance();
  }
}
