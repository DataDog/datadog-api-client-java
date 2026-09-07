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
    using = LLMObsAnnotatedInteractionItem.LLMObsAnnotatedInteractionItemDeserializer.class)
@JsonSerialize(
    using = LLMObsAnnotatedInteractionItem.LLMObsAnnotatedInteractionItemSerializer.class)
public class LLMObsAnnotatedInteractionItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(LLMObsAnnotatedInteractionItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class LLMObsAnnotatedInteractionItemSerializer
      extends StdSerializer<LLMObsAnnotatedInteractionItem> {
    public LLMObsAnnotatedInteractionItemSerializer(Class<LLMObsAnnotatedInteractionItem> t) {
      super(t);
    }

    public LLMObsAnnotatedInteractionItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsAnnotatedInteractionItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class LLMObsAnnotatedInteractionItemDeserializer
      extends StdDeserializer<LLMObsAnnotatedInteractionItem> {
    public LLMObsAnnotatedInteractionItemDeserializer() {
      this(LLMObsAnnotatedInteractionItem.class);
    }

    public LLMObsAnnotatedInteractionItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public LLMObsAnnotatedInteractionItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LLMObsTraceAnnotatedInteractionItem
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LLMObsTraceAnnotatedInteractionItem.class.equals(Integer.class)
            || LLMObsTraceAnnotatedInteractionItem.class.equals(Long.class)
            || LLMObsTraceAnnotatedInteractionItem.class.equals(Float.class)
            || LLMObsTraceAnnotatedInteractionItem.class.equals(Double.class)
            || LLMObsTraceAnnotatedInteractionItem.class.equals(Boolean.class)
            || LLMObsTraceAnnotatedInteractionItem.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LLMObsTraceAnnotatedInteractionItem.class.equals(Integer.class)
                        || LLMObsTraceAnnotatedInteractionItem.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LLMObsTraceAnnotatedInteractionItem.class.equals(Float.class)
                        || LLMObsTraceAnnotatedInteractionItem.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LLMObsTraceAnnotatedInteractionItem.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LLMObsTraceAnnotatedInteractionItem.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LLMObsTraceAnnotatedInteractionItem.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LLMObsTraceAnnotatedInteractionItem) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LLMObsTraceAnnotatedInteractionItem'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'LLMObsTraceAnnotatedInteractionItem'",
            e);
      }

      // deserialize LLMObsDisplayBlockAnnotatedInteractionItem
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Integer.class)
            || LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Long.class)
            || LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Float.class)
            || LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Double.class)
            || LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Boolean.class)
            || LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Integer.class)
                        || LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Float.class)
                        || LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LLMObsDisplayBlockAnnotatedInteractionItem.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(LLMObsDisplayBlockAnnotatedInteractionItem.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LLMObsDisplayBlockAnnotatedInteractionItem) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'LLMObsDisplayBlockAnnotatedInteractionItem'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'LLMObsDisplayBlockAnnotatedInteractionItem'",
            e);
      }

      LLMObsAnnotatedInteractionItem ret = new LLMObsAnnotatedInteractionItem();
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
    public LLMObsAnnotatedInteractionItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "LLMObsAnnotatedInteractionItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public LLMObsAnnotatedInteractionItem() {
    super("oneOf", Boolean.FALSE);
  }

  public LLMObsAnnotatedInteractionItem(LLMObsTraceAnnotatedInteractionItem o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LLMObsAnnotatedInteractionItem(LLMObsDisplayBlockAnnotatedInteractionItem o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "LLMObsTraceAnnotatedInteractionItem",
        new GenericType<LLMObsTraceAnnotatedInteractionItem>() {});
    schemas.put(
        "LLMObsDisplayBlockAnnotatedInteractionItem",
        new GenericType<LLMObsDisplayBlockAnnotatedInteractionItem>() {});
    JSON.registerDescendants(
        LLMObsAnnotatedInteractionItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LLMObsAnnotatedInteractionItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LLMObsTraceAnnotatedInteractionItem,
   * LLMObsDisplayBlockAnnotatedInteractionItem
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        LLMObsTraceAnnotatedInteractionItem.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        LLMObsDisplayBlockAnnotatedInteractionItem.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LLMObsTraceAnnotatedInteractionItem,"
            + " LLMObsDisplayBlockAnnotatedInteractionItem");
  }

  /**
   * Get the actual instance, which can be the following: LLMObsTraceAnnotatedInteractionItem,
   * LLMObsDisplayBlockAnnotatedInteractionItem
   *
   * @return The actual instance (LLMObsTraceAnnotatedInteractionItem,
   *     LLMObsDisplayBlockAnnotatedInteractionItem)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LLMObsTraceAnnotatedInteractionItem`. If the actual instance is not
   * `LLMObsTraceAnnotatedInteractionItem`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LLMObsTraceAnnotatedInteractionItem`
   * @throws ClassCastException if the instance is not `LLMObsTraceAnnotatedInteractionItem`
   */
  public LLMObsTraceAnnotatedInteractionItem getLLMObsTraceAnnotatedInteractionItem()
      throws ClassCastException {
    return (LLMObsTraceAnnotatedInteractionItem) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LLMObsDisplayBlockAnnotatedInteractionItem`. If the actual instance
   * is not `LLMObsDisplayBlockAnnotatedInteractionItem`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LLMObsDisplayBlockAnnotatedInteractionItem`
   * @throws ClassCastException if the instance is not `LLMObsDisplayBlockAnnotatedInteractionItem`
   */
  public LLMObsDisplayBlockAnnotatedInteractionItem getLLMObsDisplayBlockAnnotatedInteractionItem()
      throws ClassCastException {
    return (LLMObsDisplayBlockAnnotatedInteractionItem) super.getActualInstance();
  }
}
