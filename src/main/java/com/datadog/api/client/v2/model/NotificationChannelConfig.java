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
@JsonDeserialize(using = NotificationChannelConfig.NotificationChannelConfigDeserializer.class)
@JsonSerialize(using = NotificationChannelConfig.NotificationChannelConfigSerializer.class)
public class NotificationChannelConfig extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(NotificationChannelConfig.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class NotificationChannelConfigSerializer
      extends StdSerializer<NotificationChannelConfig> {
    public NotificationChannelConfigSerializer(Class<NotificationChannelConfig> t) {
      super(t);
    }

    public NotificationChannelConfigSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotificationChannelConfig value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class NotificationChannelConfigDeserializer
      extends StdDeserializer<NotificationChannelConfig> {
    public NotificationChannelConfigDeserializer() {
      this(NotificationChannelConfig.class);
    }

    public NotificationChannelConfigDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public NotificationChannelConfig deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize NotificationChannelPhoneConfig
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotificationChannelPhoneConfig.class.equals(Integer.class)
            || NotificationChannelPhoneConfig.class.equals(Long.class)
            || NotificationChannelPhoneConfig.class.equals(Float.class)
            || NotificationChannelPhoneConfig.class.equals(Double.class)
            || NotificationChannelPhoneConfig.class.equals(Boolean.class)
            || NotificationChannelPhoneConfig.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotificationChannelPhoneConfig.class.equals(Integer.class)
                        || NotificationChannelPhoneConfig.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotificationChannelPhoneConfig.class.equals(Float.class)
                        || NotificationChannelPhoneConfig.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotificationChannelPhoneConfig.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotificationChannelPhoneConfig.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotificationChannelPhoneConfig.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotificationChannelPhoneConfig) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotificationChannelPhoneConfig'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'NotificationChannelPhoneConfig'", e);
      }

      // deserialize NotificationChannelEmailConfig
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotificationChannelEmailConfig.class.equals(Integer.class)
            || NotificationChannelEmailConfig.class.equals(Long.class)
            || NotificationChannelEmailConfig.class.equals(Float.class)
            || NotificationChannelEmailConfig.class.equals(Double.class)
            || NotificationChannelEmailConfig.class.equals(Boolean.class)
            || NotificationChannelEmailConfig.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotificationChannelEmailConfig.class.equals(Integer.class)
                        || NotificationChannelEmailConfig.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotificationChannelEmailConfig.class.equals(Float.class)
                        || NotificationChannelEmailConfig.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotificationChannelEmailConfig.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotificationChannelEmailConfig.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotificationChannelEmailConfig.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotificationChannelEmailConfig) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotificationChannelEmailConfig'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'NotificationChannelEmailConfig'", e);
      }

      // deserialize NotificationChannelPushConfig
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotificationChannelPushConfig.class.equals(Integer.class)
            || NotificationChannelPushConfig.class.equals(Long.class)
            || NotificationChannelPushConfig.class.equals(Float.class)
            || NotificationChannelPushConfig.class.equals(Double.class)
            || NotificationChannelPushConfig.class.equals(Boolean.class)
            || NotificationChannelPushConfig.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotificationChannelPushConfig.class.equals(Integer.class)
                        || NotificationChannelPushConfig.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotificationChannelPushConfig.class.equals(Float.class)
                        || NotificationChannelPushConfig.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotificationChannelPushConfig.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotificationChannelPushConfig.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotificationChannelPushConfig.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotificationChannelPushConfig) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotificationChannelPushConfig'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NotificationChannelPushConfig'", e);
      }

      NotificationChannelConfig ret = new NotificationChannelConfig();
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
    public NotificationChannelConfig getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "NotificationChannelConfig cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public NotificationChannelConfig() {
    super("oneOf", Boolean.FALSE);
  }

  public NotificationChannelConfig(NotificationChannelPhoneConfig o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotificationChannelConfig(NotificationChannelEmailConfig o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotificationChannelConfig(NotificationChannelPushConfig o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "NotificationChannelPhoneConfig", new GenericType<NotificationChannelPhoneConfig>() {});
    schemas.put(
        "NotificationChannelEmailConfig", new GenericType<NotificationChannelEmailConfig>() {});
    schemas.put(
        "NotificationChannelPushConfig", new GenericType<NotificationChannelPushConfig>() {});
    JSON.registerDescendants(NotificationChannelConfig.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return NotificationChannelConfig.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: NotificationChannelPhoneConfig,
   * NotificationChannelEmailConfig, NotificationChannelPushConfig
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        NotificationChannelPhoneConfig.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        NotificationChannelEmailConfig.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NotificationChannelPushConfig.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be NotificationChannelPhoneConfig,"
            + " NotificationChannelEmailConfig, NotificationChannelPushConfig");
  }

  /**
   * Get the actual instance, which can be the following: NotificationChannelPhoneConfig,
   * NotificationChannelEmailConfig, NotificationChannelPushConfig
   *
   * @return The actual instance (NotificationChannelPhoneConfig, NotificationChannelEmailConfig,
   *     NotificationChannelPushConfig)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotificationChannelPhoneConfig`. If the actual instance is not
   * `NotificationChannelPhoneConfig`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotificationChannelPhoneConfig`
   * @throws ClassCastException if the instance is not `NotificationChannelPhoneConfig`
   */
  public NotificationChannelPhoneConfig getNotificationChannelPhoneConfig()
      throws ClassCastException {
    return (NotificationChannelPhoneConfig) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotificationChannelEmailConfig`. If the actual instance is not
   * `NotificationChannelEmailConfig`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotificationChannelEmailConfig`
   * @throws ClassCastException if the instance is not `NotificationChannelEmailConfig`
   */
  public NotificationChannelEmailConfig getNotificationChannelEmailConfig()
      throws ClassCastException {
    return (NotificationChannelEmailConfig) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotificationChannelPushConfig`. If the actual instance is not
   * `NotificationChannelPushConfig`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotificationChannelPushConfig`
   * @throws ClassCastException if the instance is not `NotificationChannelPushConfig`
   */
  public NotificationChannelPushConfig getNotificationChannelPushConfig()
      throws ClassCastException {
    return (NotificationChannelPushConfig) super.getActualInstance();
  }
}
