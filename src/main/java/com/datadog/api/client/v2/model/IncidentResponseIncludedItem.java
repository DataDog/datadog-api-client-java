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
    using = IncidentResponseIncludedItem.IncidentResponseIncludedItemDeserializer.class)
@JsonSerialize(using = IncidentResponseIncludedItem.IncidentResponseIncludedItemSerializer.class)
public class IncidentResponseIncludedItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IncidentResponseIncludedItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IncidentResponseIncludedItemSerializer
      extends StdSerializer<IncidentResponseIncludedItem> {
    public IncidentResponseIncludedItemSerializer(Class<IncidentResponseIncludedItem> t) {
      super(t);
    }

    public IncidentResponseIncludedItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentResponseIncludedItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IncidentResponseIncludedItemDeserializer
      extends StdDeserializer<IncidentResponseIncludedItem> {
    public IncidentResponseIncludedItemDeserializer() {
      this(IncidentResponseIncludedItem.class);
    }

    public IncidentResponseIncludedItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IncidentResponseIncludedItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize IncidentUserData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentUserData.class.equals(Integer.class)
            || IncidentUserData.class.equals(Long.class)
            || IncidentUserData.class.equals(Float.class)
            || IncidentUserData.class.equals(Double.class)
            || IncidentUserData.class.equals(Boolean.class)
            || IncidentUserData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentUserData.class.equals(Integer.class)
                        || IncidentUserData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentUserData.class.equals(Float.class)
                        || IncidentUserData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentUserData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentUserData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentUserData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentUserData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentUserData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IncidentUserData'", e);
      }

      // deserialize IncidentAttachmentData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentAttachmentData.class.equals(Integer.class)
            || IncidentAttachmentData.class.equals(Long.class)
            || IncidentAttachmentData.class.equals(Float.class)
            || IncidentAttachmentData.class.equals(Double.class)
            || IncidentAttachmentData.class.equals(Boolean.class)
            || IncidentAttachmentData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentAttachmentData.class.equals(Integer.class)
                        || IncidentAttachmentData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentAttachmentData.class.equals(Float.class)
                        || IncidentAttachmentData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentAttachmentData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentAttachmentData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentAttachmentData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentAttachmentData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentAttachmentData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IncidentAttachmentData'", e);
      }

      IncidentResponseIncludedItem ret = new IncidentResponseIncludedItem();
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
    public IncidentResponseIncludedItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "IncidentResponseIncludedItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IncidentResponseIncludedItem() {
    super("oneOf", Boolean.FALSE);
  }

  public IncidentResponseIncludedItem(IncidentUserData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IncidentResponseIncludedItem(IncidentAttachmentData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("IncidentUserData", new GenericType<IncidentUserData>() {});
    schemas.put("IncidentAttachmentData", new GenericType<IncidentAttachmentData>() {});
    JSON.registerDescendants(
        IncidentResponseIncludedItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IncidentResponseIncludedItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: IncidentUserData, IncidentAttachmentData
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(IncidentUserData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IncidentAttachmentData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be IncidentUserData, IncidentAttachmentData");
  }

  /**
   * Get the actual instance, which can be the following: IncidentUserData, IncidentAttachmentData
   *
   * @return The actual instance (IncidentUserData, IncidentAttachmentData)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentUserData`. If the actual instance is not
   * `IncidentUserData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentUserData`
   * @throws ClassCastException if the instance is not `IncidentUserData`
   */
  public IncidentUserData getIncidentUserData() throws ClassCastException {
    return (IncidentUserData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentAttachmentData`. If the actual instance is not
   * `IncidentAttachmentData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentAttachmentData`
   * @throws ClassCastException if the instance is not `IncidentAttachmentData`
   */
  public IncidentAttachmentData getIncidentAttachmentData() throws ClassCastException {
    return (IncidentAttachmentData) super.getActualInstance();
  }
}
