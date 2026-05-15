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
        LLMObsAnnotationQueueInteractionItem.LLMObsAnnotationQueueInteractionItemDeserializer.class)
@JsonSerialize(
    using =
        LLMObsAnnotationQueueInteractionItem.LLMObsAnnotationQueueInteractionItemSerializer.class)
public class LLMObsAnnotationQueueInteractionItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(LLMObsAnnotationQueueInteractionItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class LLMObsAnnotationQueueInteractionItemSerializer
      extends StdSerializer<LLMObsAnnotationQueueInteractionItem> {
    public LLMObsAnnotationQueueInteractionItemSerializer(
        Class<LLMObsAnnotationQueueInteractionItem> t) {
      super(t);
    }

    public LLMObsAnnotationQueueInteractionItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsAnnotationQueueInteractionItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class LLMObsAnnotationQueueInteractionItemDeserializer
      extends StdDeserializer<LLMObsAnnotationQueueInteractionItem> {
    public LLMObsAnnotationQueueInteractionItemDeserializer() {
      this(LLMObsAnnotationQueueInteractionItem.class);
    }

    public LLMObsAnnotationQueueInteractionItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public LLMObsAnnotationQueueInteractionItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LLMObsTraceInteractionItem
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LLMObsTraceInteractionItem.class.equals(Integer.class)
            || LLMObsTraceInteractionItem.class.equals(Long.class)
            || LLMObsTraceInteractionItem.class.equals(Float.class)
            || LLMObsTraceInteractionItem.class.equals(Double.class)
            || LLMObsTraceInteractionItem.class.equals(Boolean.class)
            || LLMObsTraceInteractionItem.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LLMObsTraceInteractionItem.class.equals(Integer.class)
                        || LLMObsTraceInteractionItem.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LLMObsTraceInteractionItem.class.equals(Float.class)
                        || LLMObsTraceInteractionItem.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LLMObsTraceInteractionItem.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LLMObsTraceInteractionItem.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LLMObsTraceInteractionItem.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LLMObsTraceInteractionItem) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LLMObsTraceInteractionItem'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LLMObsTraceInteractionItem'", e);
      }

      // deserialize LLMObsDisplayBlockInteractionItem
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LLMObsDisplayBlockInteractionItem.class.equals(Integer.class)
            || LLMObsDisplayBlockInteractionItem.class.equals(Long.class)
            || LLMObsDisplayBlockInteractionItem.class.equals(Float.class)
            || LLMObsDisplayBlockInteractionItem.class.equals(Double.class)
            || LLMObsDisplayBlockInteractionItem.class.equals(Boolean.class)
            || LLMObsDisplayBlockInteractionItem.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LLMObsDisplayBlockInteractionItem.class.equals(Integer.class)
                        || LLMObsDisplayBlockInteractionItem.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LLMObsDisplayBlockInteractionItem.class.equals(Float.class)
                        || LLMObsDisplayBlockInteractionItem.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LLMObsDisplayBlockInteractionItem.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LLMObsDisplayBlockInteractionItem.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LLMObsDisplayBlockInteractionItem.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LLMObsDisplayBlockInteractionItem) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LLMObsDisplayBlockInteractionItem'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'LLMObsDisplayBlockInteractionItem'", e);
      }

      LLMObsAnnotationQueueInteractionItem ret = new LLMObsAnnotationQueueInteractionItem();
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
    public LLMObsAnnotationQueueInteractionItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "LLMObsAnnotationQueueInteractionItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public LLMObsAnnotationQueueInteractionItem() {
    super("oneOf", Boolean.FALSE);
  }

  public LLMObsAnnotationQueueInteractionItem(LLMObsTraceInteractionItem o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LLMObsAnnotationQueueInteractionItem(LLMObsDisplayBlockInteractionItem o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("LLMObsTraceInteractionItem", new GenericType<LLMObsTraceInteractionItem>() {});
    schemas.put(
        "LLMObsDisplayBlockInteractionItem",
        new GenericType<LLMObsDisplayBlockInteractionItem>() {});
    JSON.registerDescendants(
        LLMObsAnnotationQueueInteractionItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LLMObsAnnotationQueueInteractionItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LLMObsTraceInteractionItem, LLMObsDisplayBlockInteractionItem
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(LLMObsTraceInteractionItem.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        LLMObsDisplayBlockInteractionItem.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LLMObsTraceInteractionItem,"
            + " LLMObsDisplayBlockInteractionItem");
  }

  /**
   * Get the actual instance, which can be the following: LLMObsTraceInteractionItem,
   * LLMObsDisplayBlockInteractionItem
   *
   * @return The actual instance (LLMObsTraceInteractionItem, LLMObsDisplayBlockInteractionItem)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LLMObsTraceInteractionItem`. If the actual instance is not
   * `LLMObsTraceInteractionItem`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LLMObsTraceInteractionItem`
   * @throws ClassCastException if the instance is not `LLMObsTraceInteractionItem`
   */
  public LLMObsTraceInteractionItem getLLMObsTraceInteractionItem() throws ClassCastException {
    return (LLMObsTraceInteractionItem) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LLMObsDisplayBlockInteractionItem`. If the actual instance is not
   * `LLMObsDisplayBlockInteractionItem`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LLMObsDisplayBlockInteractionItem`
   * @throws ClassCastException if the instance is not `LLMObsDisplayBlockInteractionItem`
   */
  public LLMObsDisplayBlockInteractionItem getLLMObsDisplayBlockInteractionItem()
      throws ClassCastException {
    return (LLMObsDisplayBlockInteractionItem) super.getActualInstance();
  }
}
