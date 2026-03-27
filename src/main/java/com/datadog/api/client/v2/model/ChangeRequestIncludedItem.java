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
@JsonDeserialize(using = ChangeRequestIncludedItem.ChangeRequestIncludedItemDeserializer.class)
@JsonSerialize(using = ChangeRequestIncludedItem.ChangeRequestIncludedItemSerializer.class)
public class ChangeRequestIncludedItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ChangeRequestIncludedItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ChangeRequestIncludedItemSerializer
      extends StdSerializer<ChangeRequestIncludedItem> {
    public ChangeRequestIncludedItemSerializer(Class<ChangeRequestIncludedItem> t) {
      super(t);
    }

    public ChangeRequestIncludedItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeRequestIncludedItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ChangeRequestIncludedItemDeserializer
      extends StdDeserializer<ChangeRequestIncludedItem> {
    public ChangeRequestIncludedItemDeserializer() {
      this(ChangeRequestIncludedItem.class);
    }

    public ChangeRequestIncludedItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ChangeRequestIncludedItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ChangeRequestIncludedUser
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeRequestIncludedUser.class.equals(Integer.class)
            || ChangeRequestIncludedUser.class.equals(Long.class)
            || ChangeRequestIncludedUser.class.equals(Float.class)
            || ChangeRequestIncludedUser.class.equals(Double.class)
            || ChangeRequestIncludedUser.class.equals(Boolean.class)
            || ChangeRequestIncludedUser.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeRequestIncludedUser.class.equals(Integer.class)
                        || ChangeRequestIncludedUser.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeRequestIncludedUser.class.equals(Float.class)
                        || ChangeRequestIncludedUser.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeRequestIncludedUser.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeRequestIncludedUser.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeRequestIncludedUser.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeRequestIncludedUser) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeRequestIncludedUser'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ChangeRequestIncludedUser'", e);
      }

      // deserialize ChangeRequestIncludedDecision
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeRequestIncludedDecision.class.equals(Integer.class)
            || ChangeRequestIncludedDecision.class.equals(Long.class)
            || ChangeRequestIncludedDecision.class.equals(Float.class)
            || ChangeRequestIncludedDecision.class.equals(Double.class)
            || ChangeRequestIncludedDecision.class.equals(Boolean.class)
            || ChangeRequestIncludedDecision.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeRequestIncludedDecision.class.equals(Integer.class)
                        || ChangeRequestIncludedDecision.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeRequestIncludedDecision.class.equals(Float.class)
                        || ChangeRequestIncludedDecision.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeRequestIncludedDecision.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeRequestIncludedDecision.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeRequestIncludedDecision.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeRequestIncludedDecision) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeRequestIncludedDecision'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ChangeRequestIncludedDecision'", e);
      }

      ChangeRequestIncludedItem ret = new ChangeRequestIncludedItem();
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
    public ChangeRequestIncludedItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ChangeRequestIncludedItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ChangeRequestIncludedItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ChangeRequestIncludedItem(ChangeRequestIncludedUser o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ChangeRequestIncludedItem(ChangeRequestIncludedDecision o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ChangeRequestIncludedUser", new GenericType<ChangeRequestIncludedUser>() {});
    schemas.put(
        "ChangeRequestIncludedDecision", new GenericType<ChangeRequestIncludedDecision>() {});
    JSON.registerDescendants(ChangeRequestIncludedItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ChangeRequestIncludedItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ChangeRequestIncludedUser, ChangeRequestIncludedDecision
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ChangeRequestIncludedUser.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ChangeRequestIncludedDecision.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ChangeRequestIncludedUser, ChangeRequestIncludedDecision");
  }

  /**
   * Get the actual instance, which can be the following: ChangeRequestIncludedUser,
   * ChangeRequestIncludedDecision
   *
   * @return The actual instance (ChangeRequestIncludedUser, ChangeRequestIncludedDecision)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeRequestIncludedUser`. If the actual instance is not
   * `ChangeRequestIncludedUser`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeRequestIncludedUser`
   * @throws ClassCastException if the instance is not `ChangeRequestIncludedUser`
   */
  public ChangeRequestIncludedUser getChangeRequestIncludedUser() throws ClassCastException {
    return (ChangeRequestIncludedUser) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeRequestIncludedDecision`. If the actual instance is not
   * `ChangeRequestIncludedDecision`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeRequestIncludedDecision`
   * @throws ClassCastException if the instance is not `ChangeRequestIncludedDecision`
   */
  public ChangeRequestIncludedDecision getChangeRequestIncludedDecision()
      throws ClassCastException {
    return (ChangeRequestIncludedDecision) super.getActualInstance();
  }
}
