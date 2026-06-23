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
@JsonDeserialize(using = LogsArrayMapSubProcessor.LogsArrayMapSubProcessorDeserializer.class)
@JsonSerialize(using = LogsArrayMapSubProcessor.LogsArrayMapSubProcessorSerializer.class)
public class LogsArrayMapSubProcessor extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(LogsArrayMapSubProcessor.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class LogsArrayMapSubProcessorSerializer
      extends StdSerializer<LogsArrayMapSubProcessor> {
    public LogsArrayMapSubProcessorSerializer(Class<LogsArrayMapSubProcessor> t) {
      super(t);
    }

    public LogsArrayMapSubProcessorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArrayMapSubProcessor value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class LogsArrayMapSubProcessorDeserializer
      extends StdDeserializer<LogsArrayMapSubProcessor> {
    public LogsArrayMapSubProcessorDeserializer() {
      this(LogsArrayMapSubProcessor.class);
    }

    public LogsArrayMapSubProcessorDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public LogsArrayMapSubProcessor deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LogsArrayMapAttributeRemapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArrayMapAttributeRemapper.class.equals(Integer.class)
            || LogsArrayMapAttributeRemapper.class.equals(Long.class)
            || LogsArrayMapAttributeRemapper.class.equals(Float.class)
            || LogsArrayMapAttributeRemapper.class.equals(Double.class)
            || LogsArrayMapAttributeRemapper.class.equals(Boolean.class)
            || LogsArrayMapAttributeRemapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArrayMapAttributeRemapper.class.equals(Integer.class)
                        || LogsArrayMapAttributeRemapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArrayMapAttributeRemapper.class.equals(Float.class)
                        || LogsArrayMapAttributeRemapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArrayMapAttributeRemapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArrayMapAttributeRemapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArrayMapAttributeRemapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArrayMapAttributeRemapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArrayMapAttributeRemapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsArrayMapAttributeRemapper'", e);
      }

      // deserialize LogsArrayMapArithmeticSubProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArrayMapArithmeticSubProcessor.class.equals(Integer.class)
            || LogsArrayMapArithmeticSubProcessor.class.equals(Long.class)
            || LogsArrayMapArithmeticSubProcessor.class.equals(Float.class)
            || LogsArrayMapArithmeticSubProcessor.class.equals(Double.class)
            || LogsArrayMapArithmeticSubProcessor.class.equals(Boolean.class)
            || LogsArrayMapArithmeticSubProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArrayMapArithmeticSubProcessor.class.equals(Integer.class)
                        || LogsArrayMapArithmeticSubProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArrayMapArithmeticSubProcessor.class.equals(Float.class)
                        || LogsArrayMapArithmeticSubProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArrayMapArithmeticSubProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArrayMapArithmeticSubProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArrayMapArithmeticSubProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArrayMapArithmeticSubProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArrayMapArithmeticSubProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'LogsArrayMapArithmeticSubProcessor'",
            e);
      }

      // deserialize LogsArrayMapStringBuilderSubProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArrayMapStringBuilderSubProcessor.class.equals(Integer.class)
            || LogsArrayMapStringBuilderSubProcessor.class.equals(Long.class)
            || LogsArrayMapStringBuilderSubProcessor.class.equals(Float.class)
            || LogsArrayMapStringBuilderSubProcessor.class.equals(Double.class)
            || LogsArrayMapStringBuilderSubProcessor.class.equals(Boolean.class)
            || LogsArrayMapStringBuilderSubProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArrayMapStringBuilderSubProcessor.class.equals(Integer.class)
                        || LogsArrayMapStringBuilderSubProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArrayMapStringBuilderSubProcessor.class.equals(Float.class)
                        || LogsArrayMapStringBuilderSubProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArrayMapStringBuilderSubProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArrayMapStringBuilderSubProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(LogsArrayMapStringBuilderSubProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArrayMapStringBuilderSubProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArrayMapStringBuilderSubProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'LogsArrayMapStringBuilderSubProcessor'",
            e);
      }

      // deserialize LogsArrayMapCategorySubProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArrayMapCategorySubProcessor.class.equals(Integer.class)
            || LogsArrayMapCategorySubProcessor.class.equals(Long.class)
            || LogsArrayMapCategorySubProcessor.class.equals(Float.class)
            || LogsArrayMapCategorySubProcessor.class.equals(Double.class)
            || LogsArrayMapCategorySubProcessor.class.equals(Boolean.class)
            || LogsArrayMapCategorySubProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArrayMapCategorySubProcessor.class.equals(Integer.class)
                        || LogsArrayMapCategorySubProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArrayMapCategorySubProcessor.class.equals(Float.class)
                        || LogsArrayMapCategorySubProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArrayMapCategorySubProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArrayMapCategorySubProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArrayMapCategorySubProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArrayMapCategorySubProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArrayMapCategorySubProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'LogsArrayMapCategorySubProcessor'", e);
      }

      LogsArrayMapSubProcessor ret = new LogsArrayMapSubProcessor();
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
    public LogsArrayMapSubProcessor getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "LogsArrayMapSubProcessor cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public LogsArrayMapSubProcessor() {
    super("oneOf", Boolean.FALSE);
  }

  public LogsArrayMapSubProcessor(LogsArrayMapAttributeRemapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayMapSubProcessor(LogsArrayMapArithmeticSubProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayMapSubProcessor(LogsArrayMapStringBuilderSubProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayMapSubProcessor(LogsArrayMapCategorySubProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "LogsArrayMapAttributeRemapper", new GenericType<LogsArrayMapAttributeRemapper>() {});
    schemas.put(
        "LogsArrayMapArithmeticSubProcessor",
        new GenericType<LogsArrayMapArithmeticSubProcessor>() {});
    schemas.put(
        "LogsArrayMapStringBuilderSubProcessor",
        new GenericType<LogsArrayMapStringBuilderSubProcessor>() {});
    schemas.put(
        "LogsArrayMapCategorySubProcessor", new GenericType<LogsArrayMapCategorySubProcessor>() {});
    JSON.registerDescendants(LogsArrayMapSubProcessor.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LogsArrayMapSubProcessor.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LogsArrayMapAttributeRemapper,
   * LogsArrayMapArithmeticSubProcessor, LogsArrayMapStringBuilderSubProcessor,
   * LogsArrayMapCategorySubProcessor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(LogsArrayMapAttributeRemapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        LogsArrayMapArithmeticSubProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        LogsArrayMapStringBuilderSubProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        LogsArrayMapCategorySubProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LogsArrayMapAttributeRemapper,"
            + " LogsArrayMapArithmeticSubProcessor, LogsArrayMapStringBuilderSubProcessor,"
            + " LogsArrayMapCategorySubProcessor");
  }

  /**
   * Get the actual instance, which can be the following: LogsArrayMapAttributeRemapper,
   * LogsArrayMapArithmeticSubProcessor, LogsArrayMapStringBuilderSubProcessor,
   * LogsArrayMapCategorySubProcessor
   *
   * @return The actual instance (LogsArrayMapAttributeRemapper, LogsArrayMapArithmeticSubProcessor,
   *     LogsArrayMapStringBuilderSubProcessor, LogsArrayMapCategorySubProcessor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArrayMapAttributeRemapper`. If the actual instance is not
   * `LogsArrayMapAttributeRemapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArrayMapAttributeRemapper`
   * @throws ClassCastException if the instance is not `LogsArrayMapAttributeRemapper`
   */
  public LogsArrayMapAttributeRemapper getLogsArrayMapAttributeRemapper()
      throws ClassCastException {
    return (LogsArrayMapAttributeRemapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArrayMapArithmeticSubProcessor`. If the actual instance is not
   * `LogsArrayMapArithmeticSubProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArrayMapArithmeticSubProcessor`
   * @throws ClassCastException if the instance is not `LogsArrayMapArithmeticSubProcessor`
   */
  public LogsArrayMapArithmeticSubProcessor getLogsArrayMapArithmeticSubProcessor()
      throws ClassCastException {
    return (LogsArrayMapArithmeticSubProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArrayMapStringBuilderSubProcessor`. If the actual instance is
   * not `LogsArrayMapStringBuilderSubProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArrayMapStringBuilderSubProcessor`
   * @throws ClassCastException if the instance is not `LogsArrayMapStringBuilderSubProcessor`
   */
  public LogsArrayMapStringBuilderSubProcessor getLogsArrayMapStringBuilderSubProcessor()
      throws ClassCastException {
    return (LogsArrayMapStringBuilderSubProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArrayMapCategorySubProcessor`. If the actual instance is not
   * `LogsArrayMapCategorySubProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArrayMapCategorySubProcessor`
   * @throws ClassCastException if the instance is not `LogsArrayMapCategorySubProcessor`
   */
  public LogsArrayMapCategorySubProcessor getLogsArrayMapCategorySubProcessor()
      throws ClassCastException {
    return (LogsArrayMapCategorySubProcessor) super.getActualInstance();
  }
}
