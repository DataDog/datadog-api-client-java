/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JSON;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(
    using = IncidentResponseIncludedItem.IncidentResponseIncludedItemDeserializer.class)
@JsonSerialize(using = IncidentResponseIncludedItem.IncidentResponseIncludedItemSerializer.class)
public class IncidentResponseIncludedItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IncidentResponseIncludedItem.class.getName());

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
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize User
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (User.class.equals(Integer.class)
            || User.class.equals(Long.class)
            || User.class.equals(Float.class)
            || User.class.equals(Double.class)
            || User.class.equals(Boolean.class)
            || User.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((User.class.equals(Integer.class) || User.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((User.class.equals(Float.class) || User.class.equals(Double.class))
                    && token == JsonToken.VALUE_NUMBER_FLOAT);
            attemptParsing |=
                (User.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (User.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          deserialized = tree.traverse(jp.getCodec()).readValueAs(User.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          match++;
          log.log(Level.FINER, "Input data matches schema 'User'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'User'", e);
      }

      if (match == 1) {
        IncidentResponseIncludedItem ret = new IncidentResponseIncludedItem();
        ret.setActualInstance(deserialized);
        return ret;
      }
      throw new IOException(
          String.format(
              "Failed deserialization for IncidentResponseIncludedItem: %d classes match result,"
                  + " expected 1",
              match));
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

  public IncidentResponseIncludedItem(User o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("User", new GenericType<User>() {});
    JSON.registerDescendants(
        IncidentResponseIncludedItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IncidentResponseIncludedItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: User
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(User.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    throw new RuntimeException("Invalid instance type. Must be User");
  }

  /**
   * Get the actual instance, which can be the following: User
   *
   * @return The actual instance (User)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `User`. If the actual instanct is not `User`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `User`
   * @throws ClassCastException if the instance is not `User`
   */
  public User getUser() throws ClassCastException {
    return (User) super.getActualInstance();
  }
}
