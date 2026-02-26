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
@JsonDeserialize(using = LogsArrayProcessorOperation.LogsArrayProcessorOperationDeserializer.class)
@JsonSerialize(using = LogsArrayProcessorOperation.LogsArrayProcessorOperationSerializer.class)
public class LogsArrayProcessorOperation extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(LogsArrayProcessorOperation.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class LogsArrayProcessorOperationSerializer
      extends StdSerializer<LogsArrayProcessorOperation> {
    public LogsArrayProcessorOperationSerializer(Class<LogsArrayProcessorOperation> t) {
      super(t);
    }

    public LogsArrayProcessorOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArrayProcessorOperation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class LogsArrayProcessorOperationDeserializer
      extends StdDeserializer<LogsArrayProcessorOperation> {
    public LogsArrayProcessorOperationDeserializer() {
      this(LogsArrayProcessorOperation.class);
    }

    public LogsArrayProcessorOperationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public LogsArrayProcessorOperation deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LogsArrayProcessorOperationAppend
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArrayProcessorOperationAppend.class.equals(Integer.class)
            || LogsArrayProcessorOperationAppend.class.equals(Long.class)
            || LogsArrayProcessorOperationAppend.class.equals(Float.class)
            || LogsArrayProcessorOperationAppend.class.equals(Double.class)
            || LogsArrayProcessorOperationAppend.class.equals(Boolean.class)
            || LogsArrayProcessorOperationAppend.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArrayProcessorOperationAppend.class.equals(Integer.class)
                        || LogsArrayProcessorOperationAppend.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArrayProcessorOperationAppend.class.equals(Float.class)
                        || LogsArrayProcessorOperationAppend.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArrayProcessorOperationAppend.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArrayProcessorOperationAppend.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArrayProcessorOperationAppend.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArrayProcessorOperationAppend) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArrayProcessorOperationAppend'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'LogsArrayProcessorOperationAppend'", e);
      }

      // deserialize LogsArrayProcessorOperationLength
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArrayProcessorOperationLength.class.equals(Integer.class)
            || LogsArrayProcessorOperationLength.class.equals(Long.class)
            || LogsArrayProcessorOperationLength.class.equals(Float.class)
            || LogsArrayProcessorOperationLength.class.equals(Double.class)
            || LogsArrayProcessorOperationLength.class.equals(Boolean.class)
            || LogsArrayProcessorOperationLength.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArrayProcessorOperationLength.class.equals(Integer.class)
                        || LogsArrayProcessorOperationLength.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArrayProcessorOperationLength.class.equals(Float.class)
                        || LogsArrayProcessorOperationLength.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArrayProcessorOperationLength.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArrayProcessorOperationLength.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArrayProcessorOperationLength.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArrayProcessorOperationLength) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArrayProcessorOperationLength'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'LogsArrayProcessorOperationLength'", e);
      }

      // deserialize LogsArrayProcessorOperationSelect
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArrayProcessorOperationSelect.class.equals(Integer.class)
            || LogsArrayProcessorOperationSelect.class.equals(Long.class)
            || LogsArrayProcessorOperationSelect.class.equals(Float.class)
            || LogsArrayProcessorOperationSelect.class.equals(Double.class)
            || LogsArrayProcessorOperationSelect.class.equals(Boolean.class)
            || LogsArrayProcessorOperationSelect.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArrayProcessorOperationSelect.class.equals(Integer.class)
                        || LogsArrayProcessorOperationSelect.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArrayProcessorOperationSelect.class.equals(Float.class)
                        || LogsArrayProcessorOperationSelect.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArrayProcessorOperationSelect.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArrayProcessorOperationSelect.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArrayProcessorOperationSelect.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArrayProcessorOperationSelect) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArrayProcessorOperationSelect'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'LogsArrayProcessorOperationSelect'", e);
      }

      LogsArrayProcessorOperation ret = new LogsArrayProcessorOperation();
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
    public LogsArrayProcessorOperation getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "LogsArrayProcessorOperation cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public LogsArrayProcessorOperation() {
    super("oneOf", Boolean.FALSE);
  }

  public LogsArrayProcessorOperation(LogsArrayProcessorOperationAppend o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayProcessorOperation(LogsArrayProcessorOperationLength o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayProcessorOperation(LogsArrayProcessorOperationSelect o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "LogsArrayProcessorOperationAppend",
        new GenericType<LogsArrayProcessorOperationAppend>() {});
    schemas.put(
        "LogsArrayProcessorOperationLength",
        new GenericType<LogsArrayProcessorOperationLength>() {});
    schemas.put(
        "LogsArrayProcessorOperationSelect",
        new GenericType<LogsArrayProcessorOperationSelect>() {});
    JSON.registerDescendants(
        LogsArrayProcessorOperation.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LogsArrayProcessorOperation.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LogsArrayProcessorOperationAppend,
   * LogsArrayProcessorOperationLength, LogsArrayProcessorOperationSelect
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        LogsArrayProcessorOperationAppend.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        LogsArrayProcessorOperationLength.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        LogsArrayProcessorOperationSelect.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LogsArrayProcessorOperationAppend,"
            + " LogsArrayProcessorOperationLength, LogsArrayProcessorOperationSelect");
  }

  /**
   * Get the actual instance, which can be the following: LogsArrayProcessorOperationAppend,
   * LogsArrayProcessorOperationLength, LogsArrayProcessorOperationSelect
   *
   * @return The actual instance (LogsArrayProcessorOperationAppend,
   *     LogsArrayProcessorOperationLength, LogsArrayProcessorOperationSelect)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArrayProcessorOperationAppend`. If the actual instance is not
   * `LogsArrayProcessorOperationAppend`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArrayProcessorOperationAppend`
   * @throws ClassCastException if the instance is not `LogsArrayProcessorOperationAppend`
   */
  public LogsArrayProcessorOperationAppend getLogsArrayProcessorOperationAppend()
      throws ClassCastException {
    return (LogsArrayProcessorOperationAppend) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArrayProcessorOperationLength`. If the actual instance is not
   * `LogsArrayProcessorOperationLength`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArrayProcessorOperationLength`
   * @throws ClassCastException if the instance is not `LogsArrayProcessorOperationLength`
   */
  public LogsArrayProcessorOperationLength getLogsArrayProcessorOperationLength()
      throws ClassCastException {
    return (LogsArrayProcessorOperationLength) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArrayProcessorOperationSelect`. If the actual instance is not
   * `LogsArrayProcessorOperationSelect`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArrayProcessorOperationSelect`
   * @throws ClassCastException if the instance is not `LogsArrayProcessorOperationSelect`
   */
  public LogsArrayProcessorOperationSelect getLogsArrayProcessorOperationSelect()
      throws ClassCastException {
    return (LogsArrayProcessorOperationSelect) super.getActualInstance();
  }
}
