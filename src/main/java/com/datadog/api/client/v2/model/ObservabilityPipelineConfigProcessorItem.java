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
        ObservabilityPipelineConfigProcessorItem
            .ObservabilityPipelineConfigProcessorItemDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineConfigProcessorItem.ObservabilityPipelineConfigProcessorItemSerializer
            .class)
public class ObservabilityPipelineConfigProcessorItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineConfigProcessorItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineConfigProcessorItemSerializer
      extends StdSerializer<ObservabilityPipelineConfigProcessorItem> {
    public ObservabilityPipelineConfigProcessorItemSerializer(
        Class<ObservabilityPipelineConfigProcessorItem> t) {
      super(t);
    }

    public ObservabilityPipelineConfigProcessorItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineConfigProcessorItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineConfigProcessorItemDeserializer
      extends StdDeserializer<ObservabilityPipelineConfigProcessorItem> {
    public ObservabilityPipelineConfigProcessorItemDeserializer() {
      this(ObservabilityPipelineConfigProcessorItem.class);
    }

    public ObservabilityPipelineConfigProcessorItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineConfigProcessorItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineFilterProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineFilterProcessor.class.equals(Integer.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Long.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Float.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Double.class)
            || ObservabilityPipelineFilterProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineFilterProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineFilterProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineFilterProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineFilterProcessor.class.equals(Float.class)
                        || ObservabilityPipelineFilterProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineFilterProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineFilterProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineFilterProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineFilterProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineFilterProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineFilterProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineParseJSONProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineParseJSONProcessor.class.equals(Integer.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Long.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Float.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Double.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineParseJSONProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineParseJSONProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineParseJSONProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineParseJSONProcessor.class.equals(Float.class)
                        || ObservabilityPipelineParseJSONProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineParseJSONProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineParseJSONProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineParseJSONProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineParseJSONProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineParseJSONProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineParseJSONProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineQuotaProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineQuotaProcessor.class.equals(Integer.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Long.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Float.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Double.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineQuotaProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineQuotaProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineQuotaProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineQuotaProcessor.class.equals(Float.class)
                        || ObservabilityPipelineQuotaProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineQuotaProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineQuotaProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineQuotaProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineQuotaProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineQuotaProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineQuotaProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineAddFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAddFieldsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Long.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Float.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Double.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineAddFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAddFieldsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineAddFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAddFieldsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineAddFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAddFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAddFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAddFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAddFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineAddFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAddFieldsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineRemoveFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineRemoveFieldsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Long.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Float.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Double.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineRemoveFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineRemoveFieldsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineRemoveFieldsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineRemoveFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineRemoveFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineRemoveFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineRemoveFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineRemoveFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineRemoveFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineRemoveFieldsProcessor'",
            e);
      }

      // deserialize ObservabilityPipelineRenameFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineRenameFieldsProcessor.class.equals(Integer.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Long.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Float.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Double.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(Boolean.class)
            || ObservabilityPipelineRenameFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineRenameFieldsProcessor.class.equals(Integer.class)
                        || ObservabilityPipelineRenameFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineRenameFieldsProcessor.class.equals(Float.class)
                        || ObservabilityPipelineRenameFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineRenameFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineRenameFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineRenameFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineRenameFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineRenameFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineRenameFieldsProcessor'",
            e);
      }

      ObservabilityPipelineConfigProcessorItem ret = new ObservabilityPipelineConfigProcessorItem();
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
    public ObservabilityPipelineConfigProcessorItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineConfigProcessorItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineConfigProcessorItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineFilterProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineParseJSONProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineQuotaProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineAddFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineRemoveFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigProcessorItem(ObservabilityPipelineRenameFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineFilterProcessor",
        new GenericType<ObservabilityPipelineFilterProcessor>() {});
    schemas.put(
        "ObservabilityPipelineParseJSONProcessor",
        new GenericType<ObservabilityPipelineParseJSONProcessor>() {});
    schemas.put(
        "ObservabilityPipelineQuotaProcessor",
        new GenericType<ObservabilityPipelineQuotaProcessor>() {});
    schemas.put(
        "ObservabilityPipelineAddFieldsProcessor",
        new GenericType<ObservabilityPipelineAddFieldsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineRemoveFieldsProcessor",
        new GenericType<ObservabilityPipelineRemoveFieldsProcessor>() {});
    schemas.put(
        "ObservabilityPipelineRenameFieldsProcessor",
        new GenericType<ObservabilityPipelineRenameFieldsProcessor>() {});
    JSON.registerDescendants(
        ObservabilityPipelineConfigProcessorItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineConfigProcessorItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineFilterProcessor,
   * ObservabilityPipelineParseJSONProcessor, ObservabilityPipelineQuotaProcessor,
   * ObservabilityPipelineAddFieldsProcessor, ObservabilityPipelineRemoveFieldsProcessor,
   * ObservabilityPipelineRenameFieldsProcessor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineFilterProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineParseJSONProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineQuotaProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAddFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRemoveFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRenameFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineFilterProcessor,"
            + " ObservabilityPipelineParseJSONProcessor, ObservabilityPipelineQuotaProcessor,"
            + " ObservabilityPipelineAddFieldsProcessor,"
            + " ObservabilityPipelineRemoveFieldsProcessor,"
            + " ObservabilityPipelineRenameFieldsProcessor");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineFilterProcessor,
   * ObservabilityPipelineParseJSONProcessor, ObservabilityPipelineQuotaProcessor,
   * ObservabilityPipelineAddFieldsProcessor, ObservabilityPipelineRemoveFieldsProcessor,
   * ObservabilityPipelineRenameFieldsProcessor
   *
   * @return The actual instance (ObservabilityPipelineFilterProcessor,
   *     ObservabilityPipelineParseJSONProcessor, ObservabilityPipelineQuotaProcessor,
   *     ObservabilityPipelineAddFieldsProcessor, ObservabilityPipelineRemoveFieldsProcessor,
   *     ObservabilityPipelineRenameFieldsProcessor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineFilterProcessor`. If the actual instance is
   * not `ObservabilityPipelineFilterProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineFilterProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineFilterProcessor`
   */
  public ObservabilityPipelineFilterProcessor getObservabilityPipelineFilterProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineFilterProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineParseJSONProcessor`. If the actual instance is
   * not `ObservabilityPipelineParseJSONProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineParseJSONProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineParseJSONProcessor`
   */
  public ObservabilityPipelineParseJSONProcessor getObservabilityPipelineParseJSONProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineParseJSONProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineQuotaProcessor`. If the actual instance is not
   * `ObservabilityPipelineQuotaProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineQuotaProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineQuotaProcessor`
   */
  public ObservabilityPipelineQuotaProcessor getObservabilityPipelineQuotaProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineQuotaProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAddFieldsProcessor`. If the actual instance is
   * not `ObservabilityPipelineAddFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAddFieldsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineAddFieldsProcessor`
   */
  public ObservabilityPipelineAddFieldsProcessor getObservabilityPipelineAddFieldsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineAddFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineRemoveFieldsProcessor`. If the actual instance
   * is not `ObservabilityPipelineRemoveFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineRemoveFieldsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineRemoveFieldsProcessor`
   */
  public ObservabilityPipelineRemoveFieldsProcessor getObservabilityPipelineRemoveFieldsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineRemoveFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineRenameFieldsProcessor`. If the actual instance
   * is not `ObservabilityPipelineRenameFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineRenameFieldsProcessor`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineRenameFieldsProcessor`
   */
  public ObservabilityPipelineRenameFieldsProcessor getObservabilityPipelineRenameFieldsProcessor()
      throws ClassCastException {
    return (ObservabilityPipelineRenameFieldsProcessor) super.getActualInstance();
  }
}
