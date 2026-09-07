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
@JsonDeserialize(using = LogsArchiveIntegrationS3.LogsArchiveIntegrationS3Deserializer.class)
@JsonSerialize(using = LogsArchiveIntegrationS3.LogsArchiveIntegrationS3Serializer.class)
public class LogsArchiveIntegrationS3 extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(LogsArchiveIntegrationS3.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class LogsArchiveIntegrationS3Serializer
      extends StdSerializer<LogsArchiveIntegrationS3> {
    public LogsArchiveIntegrationS3Serializer(Class<LogsArchiveIntegrationS3> t) {
      super(t);
    }

    public LogsArchiveIntegrationS3Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArchiveIntegrationS3 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class LogsArchiveIntegrationS3Deserializer
      extends StdDeserializer<LogsArchiveIntegrationS3> {
    public LogsArchiveIntegrationS3Deserializer() {
      this(LogsArchiveIntegrationS3.class);
    }

    public LogsArchiveIntegrationS3Deserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public LogsArchiveIntegrationS3 deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LogsArchiveIntegrationS3AccessKey
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArchiveIntegrationS3AccessKey.class.equals(Integer.class)
            || LogsArchiveIntegrationS3AccessKey.class.equals(Long.class)
            || LogsArchiveIntegrationS3AccessKey.class.equals(Float.class)
            || LogsArchiveIntegrationS3AccessKey.class.equals(Double.class)
            || LogsArchiveIntegrationS3AccessKey.class.equals(Boolean.class)
            || LogsArchiveIntegrationS3AccessKey.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArchiveIntegrationS3AccessKey.class.equals(Integer.class)
                        || LogsArchiveIntegrationS3AccessKey.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArchiveIntegrationS3AccessKey.class.equals(Float.class)
                        || LogsArchiveIntegrationS3AccessKey.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArchiveIntegrationS3AccessKey.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArchiveIntegrationS3AccessKey.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArchiveIntegrationS3AccessKey.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArchiveIntegrationS3AccessKey) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArchiveIntegrationS3AccessKey'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'LogsArchiveIntegrationS3AccessKey'", e);
      }

      // deserialize LogsArchiveIntegrationS3Role
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArchiveIntegrationS3Role.class.equals(Integer.class)
            || LogsArchiveIntegrationS3Role.class.equals(Long.class)
            || LogsArchiveIntegrationS3Role.class.equals(Float.class)
            || LogsArchiveIntegrationS3Role.class.equals(Double.class)
            || LogsArchiveIntegrationS3Role.class.equals(Boolean.class)
            || LogsArchiveIntegrationS3Role.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArchiveIntegrationS3Role.class.equals(Integer.class)
                        || LogsArchiveIntegrationS3Role.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArchiveIntegrationS3Role.class.equals(Float.class)
                        || LogsArchiveIntegrationS3Role.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArchiveIntegrationS3Role.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArchiveIntegrationS3Role.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArchiveIntegrationS3Role.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArchiveIntegrationS3Role) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArchiveIntegrationS3Role'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsArchiveIntegrationS3Role'", e);
      }

      LogsArchiveIntegrationS3 ret = new LogsArchiveIntegrationS3();
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
    public LogsArchiveIntegrationS3 getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "LogsArchiveIntegrationS3 cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public LogsArchiveIntegrationS3() {
    super("oneOf", Boolean.FALSE);
  }

  public LogsArchiveIntegrationS3(LogsArchiveIntegrationS3AccessKey o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArchiveIntegrationS3(LogsArchiveIntegrationS3Role o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "LogsArchiveIntegrationS3AccessKey",
        new GenericType<LogsArchiveIntegrationS3AccessKey>() {});
    schemas.put("LogsArchiveIntegrationS3Role", new GenericType<LogsArchiveIntegrationS3Role>() {});
    JSON.registerDescendants(LogsArchiveIntegrationS3.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LogsArchiveIntegrationS3.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LogsArchiveIntegrationS3AccessKey,
   * LogsArchiveIntegrationS3Role
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        LogsArchiveIntegrationS3AccessKey.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogsArchiveIntegrationS3Role.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LogsArchiveIntegrationS3AccessKey,"
            + " LogsArchiveIntegrationS3Role");
  }

  /**
   * Get the actual instance, which can be the following: LogsArchiveIntegrationS3AccessKey,
   * LogsArchiveIntegrationS3Role
   *
   * @return The actual instance (LogsArchiveIntegrationS3AccessKey, LogsArchiveIntegrationS3Role)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArchiveIntegrationS3AccessKey`. If the actual instance is not
   * `LogsArchiveIntegrationS3AccessKey`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArchiveIntegrationS3AccessKey`
   * @throws ClassCastException if the instance is not `LogsArchiveIntegrationS3AccessKey`
   */
  public LogsArchiveIntegrationS3AccessKey getLogsArchiveIntegrationS3AccessKey()
      throws ClassCastException {
    return (LogsArchiveIntegrationS3AccessKey) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArchiveIntegrationS3Role`. If the actual instance is not
   * `LogsArchiveIntegrationS3Role`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArchiveIntegrationS3Role`
   * @throws ClassCastException if the instance is not `LogsArchiveIntegrationS3Role`
   */
  public LogsArchiveIntegrationS3Role getLogsArchiveIntegrationS3Role() throws ClassCastException {
    return (LogsArchiveIntegrationS3Role) super.getActualInstance();
  }
}
