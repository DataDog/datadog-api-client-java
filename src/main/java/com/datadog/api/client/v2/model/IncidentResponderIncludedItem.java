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
    using = IncidentResponderIncludedItem.IncidentResponderIncludedItemDeserializer.class)
@JsonSerialize(using = IncidentResponderIncludedItem.IncidentResponderIncludedItemSerializer.class)
public class IncidentResponderIncludedItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IncidentResponderIncludedItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IncidentResponderIncludedItemSerializer
      extends StdSerializer<IncidentResponderIncludedItem> {
    public IncidentResponderIncludedItemSerializer(Class<IncidentResponderIncludedItem> t) {
      super(t);
    }

    public IncidentResponderIncludedItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentResponderIncludedItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IncidentResponderIncludedItemDeserializer
      extends StdDeserializer<IncidentResponderIncludedItem> {
    public IncidentResponderIncludedItemDeserializer() {
      this(IncidentResponderIncludedItem.class);
    }

    public IncidentResponderIncludedItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IncidentResponderIncludedItem deserialize(JsonParser jp, DeserializationContext ctxt)
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

      // deserialize IncidentRoleAssignmentDataResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentRoleAssignmentDataResponse.class.equals(Integer.class)
            || IncidentRoleAssignmentDataResponse.class.equals(Long.class)
            || IncidentRoleAssignmentDataResponse.class.equals(Float.class)
            || IncidentRoleAssignmentDataResponse.class.equals(Double.class)
            || IncidentRoleAssignmentDataResponse.class.equals(Boolean.class)
            || IncidentRoleAssignmentDataResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentRoleAssignmentDataResponse.class.equals(Integer.class)
                        || IncidentRoleAssignmentDataResponse.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentRoleAssignmentDataResponse.class.equals(Float.class)
                        || IncidentRoleAssignmentDataResponse.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentRoleAssignmentDataResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentRoleAssignmentDataResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentRoleAssignmentDataResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentRoleAssignmentDataResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentRoleAssignmentDataResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'IncidentRoleAssignmentDataResponse'",
            e);
      }

      IncidentResponderIncludedItem ret = new IncidentResponderIncludedItem();
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
    public IncidentResponderIncludedItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "IncidentResponderIncludedItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IncidentResponderIncludedItem() {
    super("oneOf", Boolean.FALSE);
  }

  public IncidentResponderIncludedItem(IncidentUserData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IncidentResponderIncludedItem(IncidentRoleAssignmentDataResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("IncidentUserData", new GenericType<IncidentUserData>() {});
    schemas.put(
        "IncidentRoleAssignmentDataResponse",
        new GenericType<IncidentRoleAssignmentDataResponse>() {});
    JSON.registerDescendants(
        IncidentResponderIncludedItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IncidentResponderIncludedItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: IncidentUserData, IncidentRoleAssignmentDataResponse
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
    if (JSON.isInstanceOf(
        IncidentRoleAssignmentDataResponse.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be IncidentUserData, IncidentRoleAssignmentDataResponse");
  }

  /**
   * Get the actual instance, which can be the following: IncidentUserData,
   * IncidentRoleAssignmentDataResponse
   *
   * @return The actual instance (IncidentUserData, IncidentRoleAssignmentDataResponse)
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
   * Get the actual instance of `IncidentRoleAssignmentDataResponse`. If the actual instance is not
   * `IncidentRoleAssignmentDataResponse`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentRoleAssignmentDataResponse`
   * @throws ClassCastException if the instance is not `IncidentRoleAssignmentDataResponse`
   */
  public IncidentRoleAssignmentDataResponse getIncidentRoleAssignmentDataResponse()
      throws ClassCastException {
    return (IncidentRoleAssignmentDataResponse) super.getActualInstance();
  }
}
