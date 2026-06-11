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
      // deserialize LogsAttributeRemapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsAttributeRemapper.class.equals(Integer.class)
            || LogsAttributeRemapper.class.equals(Long.class)
            || LogsAttributeRemapper.class.equals(Float.class)
            || LogsAttributeRemapper.class.equals(Double.class)
            || LogsAttributeRemapper.class.equals(Boolean.class)
            || LogsAttributeRemapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsAttributeRemapper.class.equals(Integer.class)
                        || LogsAttributeRemapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsAttributeRemapper.class.equals(Float.class)
                        || LogsAttributeRemapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsAttributeRemapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsAttributeRemapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsAttributeRemapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsAttributeRemapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsAttributeRemapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsAttributeRemapper'", e);
      }

      // deserialize LogsStringBuilderProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsStringBuilderProcessor.class.equals(Integer.class)
            || LogsStringBuilderProcessor.class.equals(Long.class)
            || LogsStringBuilderProcessor.class.equals(Float.class)
            || LogsStringBuilderProcessor.class.equals(Double.class)
            || LogsStringBuilderProcessor.class.equals(Boolean.class)
            || LogsStringBuilderProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsStringBuilderProcessor.class.equals(Integer.class)
                        || LogsStringBuilderProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsStringBuilderProcessor.class.equals(Float.class)
                        || LogsStringBuilderProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsStringBuilderProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsStringBuilderProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsStringBuilderProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsStringBuilderProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsStringBuilderProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsStringBuilderProcessor'", e);
      }

      // deserialize LogsArithmeticProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArithmeticProcessor.class.equals(Integer.class)
            || LogsArithmeticProcessor.class.equals(Long.class)
            || LogsArithmeticProcessor.class.equals(Float.class)
            || LogsArithmeticProcessor.class.equals(Double.class)
            || LogsArithmeticProcessor.class.equals(Boolean.class)
            || LogsArithmeticProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArithmeticProcessor.class.equals(Integer.class)
                        || LogsArithmeticProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArithmeticProcessor.class.equals(Float.class)
                        || LogsArithmeticProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArithmeticProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArithmeticProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsArithmeticProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsArithmeticProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsArithmeticProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsArithmeticProcessor'", e);
      }

      // deserialize LogsCategoryProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsCategoryProcessor.class.equals(Integer.class)
            || LogsCategoryProcessor.class.equals(Long.class)
            || LogsCategoryProcessor.class.equals(Float.class)
            || LogsCategoryProcessor.class.equals(Double.class)
            || LogsCategoryProcessor.class.equals(Boolean.class)
            || LogsCategoryProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsCategoryProcessor.class.equals(Integer.class)
                        || LogsCategoryProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsCategoryProcessor.class.equals(Float.class)
                        || LogsCategoryProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsCategoryProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsCategoryProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsCategoryProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsCategoryProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsCategoryProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsCategoryProcessor'", e);
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

  public LogsArrayMapSubProcessor(LogsAttributeRemapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayMapSubProcessor(LogsStringBuilderProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayMapSubProcessor(LogsArithmeticProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LogsArrayMapSubProcessor(LogsCategoryProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("LogsAttributeRemapper", new GenericType<LogsAttributeRemapper>() {});
    schemas.put("LogsStringBuilderProcessor", new GenericType<LogsStringBuilderProcessor>() {});
    schemas.put("LogsArithmeticProcessor", new GenericType<LogsArithmeticProcessor>() {});
    schemas.put("LogsCategoryProcessor", new GenericType<LogsCategoryProcessor>() {});
    JSON.registerDescendants(LogsArrayMapSubProcessor.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LogsArrayMapSubProcessor.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LogsAttributeRemapper, LogsStringBuilderProcessor,
   * LogsArithmeticProcessor, LogsCategoryProcessor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(LogsAttributeRemapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogsStringBuilderProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogsArithmeticProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogsCategoryProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LogsAttributeRemapper, LogsStringBuilderProcessor,"
            + " LogsArithmeticProcessor, LogsCategoryProcessor");
  }

  /**
   * Get the actual instance, which can be the following: LogsAttributeRemapper,
   * LogsStringBuilderProcessor, LogsArithmeticProcessor, LogsCategoryProcessor
   *
   * @return The actual instance (LogsAttributeRemapper, LogsStringBuilderProcessor,
   *     LogsArithmeticProcessor, LogsCategoryProcessor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsAttributeRemapper`. If the actual instance is not
   * `LogsAttributeRemapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsAttributeRemapper`
   * @throws ClassCastException if the instance is not `LogsAttributeRemapper`
   */
  public LogsAttributeRemapper getLogsAttributeRemapper() throws ClassCastException {
    return (LogsAttributeRemapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsStringBuilderProcessor`. If the actual instance is not
   * `LogsStringBuilderProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsStringBuilderProcessor`
   * @throws ClassCastException if the instance is not `LogsStringBuilderProcessor`
   */
  public LogsStringBuilderProcessor getLogsStringBuilderProcessor() throws ClassCastException {
    return (LogsStringBuilderProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArithmeticProcessor`. If the actual instance is not
   * `LogsArithmeticProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArithmeticProcessor`
   * @throws ClassCastException if the instance is not `LogsArithmeticProcessor`
   */
  public LogsArithmeticProcessor getLogsArithmeticProcessor() throws ClassCastException {
    return (LogsArithmeticProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsCategoryProcessor`. If the actual instance is not
   * `LogsCategoryProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsCategoryProcessor`
   * @throws ClassCastException if the instance is not `LogsCategoryProcessor`
   */
  public LogsCategoryProcessor getLogsCategoryProcessor() throws ClassCastException {
    return (LogsCategoryProcessor) super.getActualInstance();
  }
}
