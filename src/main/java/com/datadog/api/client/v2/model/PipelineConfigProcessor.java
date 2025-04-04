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
@JsonDeserialize(using = PipelineConfigProcessor.PipelineConfigProcessorDeserializer.class)
@JsonSerialize(using = PipelineConfigProcessor.PipelineConfigProcessorSerializer.class)
public class PipelineConfigProcessor extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(PipelineConfigProcessor.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class PipelineConfigProcessorSerializer
      extends StdSerializer<PipelineConfigProcessor> {
    public PipelineConfigProcessorSerializer(Class<PipelineConfigProcessor> t) {
      super(t);
    }

    public PipelineConfigProcessorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineConfigProcessor value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class PipelineConfigProcessorDeserializer
      extends StdDeserializer<PipelineConfigProcessor> {
    public PipelineConfigProcessorDeserializer() {
      this(PipelineConfigProcessor.class);
    }

    public PipelineConfigProcessorDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public PipelineConfigProcessor deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize PipelineFilterProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineFilterProcessor.class.equals(Integer.class)
            || PipelineFilterProcessor.class.equals(Long.class)
            || PipelineFilterProcessor.class.equals(Float.class)
            || PipelineFilterProcessor.class.equals(Double.class)
            || PipelineFilterProcessor.class.equals(Boolean.class)
            || PipelineFilterProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineFilterProcessor.class.equals(Integer.class)
                        || PipelineFilterProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineFilterProcessor.class.equals(Float.class)
                        || PipelineFilterProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineFilterProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineFilterProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineFilterProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineFilterProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineFilterProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PipelineFilterProcessor'", e);
      }

      // deserialize ParseJSONProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ParseJSONProcessor.class.equals(Integer.class)
            || ParseJSONProcessor.class.equals(Long.class)
            || ParseJSONProcessor.class.equals(Float.class)
            || ParseJSONProcessor.class.equals(Double.class)
            || ParseJSONProcessor.class.equals(Boolean.class)
            || ParseJSONProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ParseJSONProcessor.class.equals(Integer.class)
                        || ParseJSONProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ParseJSONProcessor.class.equals(Float.class)
                        || ParseJSONProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ParseJSONProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ParseJSONProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ParseJSONProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ParseJSONProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ParseJSONProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ParseJSONProcessor'", e);
      }

      // deserialize PipelineQuotaProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineQuotaProcessor.class.equals(Integer.class)
            || PipelineQuotaProcessor.class.equals(Long.class)
            || PipelineQuotaProcessor.class.equals(Float.class)
            || PipelineQuotaProcessor.class.equals(Double.class)
            || PipelineQuotaProcessor.class.equals(Boolean.class)
            || PipelineQuotaProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineQuotaProcessor.class.equals(Integer.class)
                        || PipelineQuotaProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineQuotaProcessor.class.equals(Float.class)
                        || PipelineQuotaProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineQuotaProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineQuotaProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineQuotaProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineQuotaProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineQuotaProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PipelineQuotaProcessor'", e);
      }

      // deserialize PipelineAddFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineAddFieldsProcessor.class.equals(Integer.class)
            || PipelineAddFieldsProcessor.class.equals(Long.class)
            || PipelineAddFieldsProcessor.class.equals(Float.class)
            || PipelineAddFieldsProcessor.class.equals(Double.class)
            || PipelineAddFieldsProcessor.class.equals(Boolean.class)
            || PipelineAddFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineAddFieldsProcessor.class.equals(Integer.class)
                        || PipelineAddFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineAddFieldsProcessor.class.equals(Float.class)
                        || PipelineAddFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineAddFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineAddFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineAddFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineAddFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineAddFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PipelineAddFieldsProcessor'", e);
      }

      // deserialize PipelineRemoveFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineRemoveFieldsProcessor.class.equals(Integer.class)
            || PipelineRemoveFieldsProcessor.class.equals(Long.class)
            || PipelineRemoveFieldsProcessor.class.equals(Float.class)
            || PipelineRemoveFieldsProcessor.class.equals(Double.class)
            || PipelineRemoveFieldsProcessor.class.equals(Boolean.class)
            || PipelineRemoveFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineRemoveFieldsProcessor.class.equals(Integer.class)
                        || PipelineRemoveFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineRemoveFieldsProcessor.class.equals(Float.class)
                        || PipelineRemoveFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineRemoveFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineRemoveFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineRemoveFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineRemoveFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineRemoveFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PipelineRemoveFieldsProcessor'", e);
      }

      // deserialize PipelineRenameFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineRenameFieldsProcessor.class.equals(Integer.class)
            || PipelineRenameFieldsProcessor.class.equals(Long.class)
            || PipelineRenameFieldsProcessor.class.equals(Float.class)
            || PipelineRenameFieldsProcessor.class.equals(Double.class)
            || PipelineRenameFieldsProcessor.class.equals(Boolean.class)
            || PipelineRenameFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineRenameFieldsProcessor.class.equals(Integer.class)
                        || PipelineRenameFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineRenameFieldsProcessor.class.equals(Float.class)
                        || PipelineRenameFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineRenameFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineRenameFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineRenameFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineRenameFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineRenameFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PipelineRenameFieldsProcessor'", e);
      }

      PipelineConfigProcessor ret = new PipelineConfigProcessor();
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
    public PipelineConfigProcessor getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "PipelineConfigProcessor cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public PipelineConfigProcessor() {
    super("oneOf", Boolean.FALSE);
  }

  public PipelineConfigProcessor(PipelineFilterProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineConfigProcessor(ParseJSONProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineConfigProcessor(PipelineQuotaProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineConfigProcessor(PipelineAddFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineConfigProcessor(PipelineRemoveFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineConfigProcessor(PipelineRenameFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("PipelineFilterProcessor", new GenericType<PipelineFilterProcessor>() {});
    schemas.put("ParseJSONProcessor", new GenericType<ParseJSONProcessor>() {});
    schemas.put("PipelineQuotaProcessor", new GenericType<PipelineQuotaProcessor>() {});
    schemas.put("PipelineAddFieldsProcessor", new GenericType<PipelineAddFieldsProcessor>() {});
    schemas.put(
        "PipelineRemoveFieldsProcessor", new GenericType<PipelineRemoveFieldsProcessor>() {});
    schemas.put(
        "PipelineRenameFieldsProcessor", new GenericType<PipelineRenameFieldsProcessor>() {});
    JSON.registerDescendants(PipelineConfigProcessor.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return PipelineConfigProcessor.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: PipelineFilterProcessor, ParseJSONProcessor,
   * PipelineQuotaProcessor, PipelineAddFieldsProcessor, PipelineRemoveFieldsProcessor,
   * PipelineRenameFieldsProcessor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(PipelineFilterProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ParseJSONProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PipelineQuotaProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PipelineAddFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PipelineRemoveFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PipelineRenameFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be PipelineFilterProcessor, ParseJSONProcessor,"
            + " PipelineQuotaProcessor, PipelineAddFieldsProcessor, PipelineRemoveFieldsProcessor,"
            + " PipelineRenameFieldsProcessor");
  }

  /**
   * Get the actual instance, which can be the following: PipelineFilterProcessor,
   * ParseJSONProcessor, PipelineQuotaProcessor, PipelineAddFieldsProcessor,
   * PipelineRemoveFieldsProcessor, PipelineRenameFieldsProcessor
   *
   * @return The actual instance (PipelineFilterProcessor, ParseJSONProcessor,
   *     PipelineQuotaProcessor, PipelineAddFieldsProcessor, PipelineRemoveFieldsProcessor,
   *     PipelineRenameFieldsProcessor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineFilterProcessor`. If the actual instance is not
   * `PipelineFilterProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineFilterProcessor`
   * @throws ClassCastException if the instance is not `PipelineFilterProcessor`
   */
  public PipelineFilterProcessor getPipelineFilterProcessor() throws ClassCastException {
    return (PipelineFilterProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ParseJSONProcessor`. If the actual instance is not
   * `ParseJSONProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ParseJSONProcessor`
   * @throws ClassCastException if the instance is not `ParseJSONProcessor`
   */
  public ParseJSONProcessor getParseJSONProcessor() throws ClassCastException {
    return (ParseJSONProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineQuotaProcessor`. If the actual instance is not
   * `PipelineQuotaProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineQuotaProcessor`
   * @throws ClassCastException if the instance is not `PipelineQuotaProcessor`
   */
  public PipelineQuotaProcessor getPipelineQuotaProcessor() throws ClassCastException {
    return (PipelineQuotaProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineAddFieldsProcessor`. If the actual instance is not
   * `PipelineAddFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineAddFieldsProcessor`
   * @throws ClassCastException if the instance is not `PipelineAddFieldsProcessor`
   */
  public PipelineAddFieldsProcessor getPipelineAddFieldsProcessor() throws ClassCastException {
    return (PipelineAddFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineRemoveFieldsProcessor`. If the actual instance is not
   * `PipelineRemoveFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineRemoveFieldsProcessor`
   * @throws ClassCastException if the instance is not `PipelineRemoveFieldsProcessor`
   */
  public PipelineRemoveFieldsProcessor getPipelineRemoveFieldsProcessor()
      throws ClassCastException {
    return (PipelineRemoveFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineRenameFieldsProcessor`. If the actual instance is not
   * `PipelineRenameFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineRenameFieldsProcessor`
   * @throws ClassCastException if the instance is not `PipelineRenameFieldsProcessor`
   */
  public PipelineRenameFieldsProcessor getPipelineRenameFieldsProcessor()
      throws ClassCastException {
    return (PipelineRenameFieldsProcessor) super.getActualInstance();
  }
}
