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
        PipelineDataAttributesConfigprocessorsItem
            .PipelineDataAttributesConfigprocessorsItemDeserializer.class)
@JsonSerialize(
    using =
        PipelineDataAttributesConfigprocessorsItem
            .PipelineDataAttributesConfigprocessorsItemSerializer.class)
public class PipelineDataAttributesConfigprocessorsItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(PipelineDataAttributesConfigprocessorsItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class PipelineDataAttributesConfigprocessorsItemSerializer
      extends StdSerializer<PipelineDataAttributesConfigprocessorsItem> {
    public PipelineDataAttributesConfigprocessorsItemSerializer(
        Class<PipelineDataAttributesConfigprocessorsItem> t) {
      super(t);
    }

    public PipelineDataAttributesConfigprocessorsItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineDataAttributesConfigprocessorsItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class PipelineDataAttributesConfigprocessorsItemDeserializer
      extends StdDeserializer<PipelineDataAttributesConfigprocessorsItem> {
    public PipelineDataAttributesConfigprocessorsItemDeserializer() {
      this(PipelineDataAttributesConfigprocessorsItem.class);
    }

    public PipelineDataAttributesConfigprocessorsItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public PipelineDataAttributesConfigprocessorsItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FilterProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FilterProcessor.class.equals(Integer.class)
            || FilterProcessor.class.equals(Long.class)
            || FilterProcessor.class.equals(Float.class)
            || FilterProcessor.class.equals(Double.class)
            || FilterProcessor.class.equals(Boolean.class)
            || FilterProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FilterProcessor.class.equals(Integer.class)
                        || FilterProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FilterProcessor.class.equals(Float.class)
                        || FilterProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FilterProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FilterProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FilterProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FilterProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FilterProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FilterProcessor'", e);
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

      // deserialize QuotaProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QuotaProcessor.class.equals(Integer.class)
            || QuotaProcessor.class.equals(Long.class)
            || QuotaProcessor.class.equals(Float.class)
            || QuotaProcessor.class.equals(Double.class)
            || QuotaProcessor.class.equals(Boolean.class)
            || QuotaProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QuotaProcessor.class.equals(Integer.class)
                        || QuotaProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QuotaProcessor.class.equals(Float.class)
                        || QuotaProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QuotaProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QuotaProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QuotaProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QuotaProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QuotaProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QuotaProcessor'", e);
      }

      // deserialize AddFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AddFieldsProcessor.class.equals(Integer.class)
            || AddFieldsProcessor.class.equals(Long.class)
            || AddFieldsProcessor.class.equals(Float.class)
            || AddFieldsProcessor.class.equals(Double.class)
            || AddFieldsProcessor.class.equals(Boolean.class)
            || AddFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AddFieldsProcessor.class.equals(Integer.class)
                        || AddFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AddFieldsProcessor.class.equals(Float.class)
                        || AddFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AddFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AddFieldsProcessor.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AddFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AddFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AddFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AddFieldsProcessor'", e);
      }

      // deserialize RemoveFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RemoveFieldsProcessor.class.equals(Integer.class)
            || RemoveFieldsProcessor.class.equals(Long.class)
            || RemoveFieldsProcessor.class.equals(Float.class)
            || RemoveFieldsProcessor.class.equals(Double.class)
            || RemoveFieldsProcessor.class.equals(Boolean.class)
            || RemoveFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RemoveFieldsProcessor.class.equals(Integer.class)
                        || RemoveFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RemoveFieldsProcessor.class.equals(Float.class)
                        || RemoveFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RemoveFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RemoveFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RemoveFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RemoveFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RemoveFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RemoveFieldsProcessor'", e);
      }

      // deserialize RenameFieldsProcessor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RenameFieldsProcessor.class.equals(Integer.class)
            || RenameFieldsProcessor.class.equals(Long.class)
            || RenameFieldsProcessor.class.equals(Float.class)
            || RenameFieldsProcessor.class.equals(Double.class)
            || RenameFieldsProcessor.class.equals(Boolean.class)
            || RenameFieldsProcessor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RenameFieldsProcessor.class.equals(Integer.class)
                        || RenameFieldsProcessor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RenameFieldsProcessor.class.equals(Float.class)
                        || RenameFieldsProcessor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RenameFieldsProcessor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RenameFieldsProcessor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RenameFieldsProcessor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RenameFieldsProcessor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RenameFieldsProcessor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RenameFieldsProcessor'", e);
      }

      PipelineDataAttributesConfigprocessorsItem ret =
          new PipelineDataAttributesConfigprocessorsItem();
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
    public PipelineDataAttributesConfigprocessorsItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "PipelineDataAttributesConfigprocessorsItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public PipelineDataAttributesConfigprocessorsItem() {
    super("oneOf", Boolean.FALSE);
  }

  public PipelineDataAttributesConfigprocessorsItem(FilterProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineDataAttributesConfigprocessorsItem(ParseJSONProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineDataAttributesConfigprocessorsItem(QuotaProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineDataAttributesConfigprocessorsItem(AddFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineDataAttributesConfigprocessorsItem(RemoveFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineDataAttributesConfigprocessorsItem(RenameFieldsProcessor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FilterProcessor", new GenericType<FilterProcessor>() {});
    schemas.put("ParseJSONProcessor", new GenericType<ParseJSONProcessor>() {});
    schemas.put("QuotaProcessor", new GenericType<QuotaProcessor>() {});
    schemas.put("AddFieldsProcessor", new GenericType<AddFieldsProcessor>() {});
    schemas.put("RemoveFieldsProcessor", new GenericType<RemoveFieldsProcessor>() {});
    schemas.put("RenameFieldsProcessor", new GenericType<RenameFieldsProcessor>() {});
    JSON.registerDescendants(
        PipelineDataAttributesConfigprocessorsItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return PipelineDataAttributesConfigprocessorsItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FilterProcessor, ParseJSONProcessor, QuotaProcessor,
   * AddFieldsProcessor, RemoveFieldsProcessor, RenameFieldsProcessor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(FilterProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ParseJSONProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QuotaProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AddFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RemoveFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RenameFieldsProcessor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FilterProcessor, ParseJSONProcessor, QuotaProcessor,"
            + " AddFieldsProcessor, RemoveFieldsProcessor, RenameFieldsProcessor");
  }

  /**
   * Get the actual instance, which can be the following: FilterProcessor, ParseJSONProcessor,
   * QuotaProcessor, AddFieldsProcessor, RemoveFieldsProcessor, RenameFieldsProcessor
   *
   * @return The actual instance (FilterProcessor, ParseJSONProcessor, QuotaProcessor,
   *     AddFieldsProcessor, RemoveFieldsProcessor, RenameFieldsProcessor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FilterProcessor`. If the actual instance is not `FilterProcessor`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `FilterProcessor`
   * @throws ClassCastException if the instance is not `FilterProcessor`
   */
  public FilterProcessor getFilterProcessor() throws ClassCastException {
    return (FilterProcessor) super.getActualInstance();
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
   * Get the actual instance of `QuotaProcessor`. If the actual instance is not `QuotaProcessor`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `QuotaProcessor`
   * @throws ClassCastException if the instance is not `QuotaProcessor`
   */
  public QuotaProcessor getQuotaProcessor() throws ClassCastException {
    return (QuotaProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AddFieldsProcessor`. If the actual instance is not
   * `AddFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AddFieldsProcessor`
   * @throws ClassCastException if the instance is not `AddFieldsProcessor`
   */
  public AddFieldsProcessor getAddFieldsProcessor() throws ClassCastException {
    return (AddFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RemoveFieldsProcessor`. If the actual instance is not
   * `RemoveFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RemoveFieldsProcessor`
   * @throws ClassCastException if the instance is not `RemoveFieldsProcessor`
   */
  public RemoveFieldsProcessor getRemoveFieldsProcessor() throws ClassCastException {
    return (RemoveFieldsProcessor) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RenameFieldsProcessor`. If the actual instance is not
   * `RenameFieldsProcessor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RenameFieldsProcessor`
   * @throws ClassCastException if the instance is not `RenameFieldsProcessor`
   */
  public RenameFieldsProcessor getRenameFieldsProcessor() throws ClassCastException {
    return (RenameFieldsProcessor) super.getActualInstance();
  }
}
