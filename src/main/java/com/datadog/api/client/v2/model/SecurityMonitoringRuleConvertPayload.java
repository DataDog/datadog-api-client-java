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
        SecurityMonitoringRuleConvertPayload.SecurityMonitoringRuleConvertPayloadDeserializer.class)
@JsonSerialize(
    using =
        SecurityMonitoringRuleConvertPayload.SecurityMonitoringRuleConvertPayloadSerializer.class)
public class SecurityMonitoringRuleConvertPayload extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SecurityMonitoringRuleConvertPayload.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SecurityMonitoringRuleConvertPayloadSerializer
      extends StdSerializer<SecurityMonitoringRuleConvertPayload> {
    public SecurityMonitoringRuleConvertPayloadSerializer(
        Class<SecurityMonitoringRuleConvertPayload> t) {
      super(t);
    }

    public SecurityMonitoringRuleConvertPayloadSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleConvertPayload value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SecurityMonitoringRuleConvertPayloadDeserializer
      extends StdDeserializer<SecurityMonitoringRuleConvertPayload> {
    public SecurityMonitoringRuleConvertPayloadDeserializer() {
      this(SecurityMonitoringRuleConvertPayload.class);
    }

    public SecurityMonitoringRuleConvertPayloadDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SecurityMonitoringRuleConvertPayload deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SecurityMonitoringStandardRulePayload
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringStandardRulePayload.class.equals(Integer.class)
            || SecurityMonitoringStandardRulePayload.class.equals(Long.class)
            || SecurityMonitoringStandardRulePayload.class.equals(Float.class)
            || SecurityMonitoringStandardRulePayload.class.equals(Double.class)
            || SecurityMonitoringStandardRulePayload.class.equals(Boolean.class)
            || SecurityMonitoringStandardRulePayload.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringStandardRulePayload.class.equals(Integer.class)
                        || SecurityMonitoringStandardRulePayload.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringStandardRulePayload.class.equals(Float.class)
                        || SecurityMonitoringStandardRulePayload.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringStandardRulePayload.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringStandardRulePayload.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(SecurityMonitoringStandardRulePayload.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringStandardRulePayload) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SecurityMonitoringStandardRulePayload'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringStandardRulePayload'",
            e);
      }

      // deserialize SecurityMonitoringSignalRulePayload
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringSignalRulePayload.class.equals(Integer.class)
            || SecurityMonitoringSignalRulePayload.class.equals(Long.class)
            || SecurityMonitoringSignalRulePayload.class.equals(Float.class)
            || SecurityMonitoringSignalRulePayload.class.equals(Double.class)
            || SecurityMonitoringSignalRulePayload.class.equals(Boolean.class)
            || SecurityMonitoringSignalRulePayload.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringSignalRulePayload.class.equals(Integer.class)
                        || SecurityMonitoringSignalRulePayload.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringSignalRulePayload.class.equals(Float.class)
                        || SecurityMonitoringSignalRulePayload.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringSignalRulePayload.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringSignalRulePayload.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityMonitoringSignalRulePayload.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringSignalRulePayload) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SecurityMonitoringSignalRulePayload'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringSignalRulePayload'",
            e);
      }

      SecurityMonitoringRuleConvertPayload ret = new SecurityMonitoringRuleConvertPayload();
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
    public SecurityMonitoringRuleConvertPayload getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SecurityMonitoringRuleConvertPayload cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SecurityMonitoringRuleConvertPayload() {
    super("oneOf", Boolean.FALSE);
  }

  public SecurityMonitoringRuleConvertPayload(SecurityMonitoringStandardRulePayload o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringRuleConvertPayload(SecurityMonitoringSignalRulePayload o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SecurityMonitoringStandardRulePayload",
        new GenericType<SecurityMonitoringStandardRulePayload>() {});
    schemas.put(
        "SecurityMonitoringSignalRulePayload",
        new GenericType<SecurityMonitoringSignalRulePayload>() {});
    JSON.registerDescendants(
        SecurityMonitoringRuleConvertPayload.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SecurityMonitoringRuleConvertPayload.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SecurityMonitoringStandardRulePayload,
   * SecurityMonitoringSignalRulePayload
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SecurityMonitoringStandardRulePayload.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringSignalRulePayload.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SecurityMonitoringStandardRulePayload,"
            + " SecurityMonitoringSignalRulePayload");
  }

  /**
   * Get the actual instance, which can be the following: SecurityMonitoringStandardRulePayload,
   * SecurityMonitoringSignalRulePayload
   *
   * @return The actual instance (SecurityMonitoringStandardRulePayload,
   *     SecurityMonitoringSignalRulePayload)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringStandardRulePayload`. If the actual instance is
   * not `SecurityMonitoringStandardRulePayload`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringStandardRulePayload`
   * @throws ClassCastException if the instance is not `SecurityMonitoringStandardRulePayload`
   */
  public SecurityMonitoringStandardRulePayload getSecurityMonitoringStandardRulePayload()
      throws ClassCastException {
    return (SecurityMonitoringStandardRulePayload) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringSignalRulePayload`. If the actual instance is not
   * `SecurityMonitoringSignalRulePayload`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringSignalRulePayload`
   * @throws ClassCastException if the instance is not `SecurityMonitoringSignalRulePayload`
   */
  public SecurityMonitoringSignalRulePayload getSecurityMonitoringSignalRulePayload()
      throws ClassCastException {
    return (SecurityMonitoringSignalRulePayload) super.getActualInstance();
  }
}
