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
        SecurityMonitoringRuleCreatePayload.SecurityMonitoringRuleCreatePayloadDeserializer.class)
@JsonSerialize(
    using = SecurityMonitoringRuleCreatePayload.SecurityMonitoringRuleCreatePayloadSerializer.class)
public class SecurityMonitoringRuleCreatePayload extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SecurityMonitoringRuleCreatePayload.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SecurityMonitoringRuleCreatePayloadSerializer
      extends StdSerializer<SecurityMonitoringRuleCreatePayload> {
    public SecurityMonitoringRuleCreatePayloadSerializer(
        Class<SecurityMonitoringRuleCreatePayload> t) {
      super(t);
    }

    public SecurityMonitoringRuleCreatePayloadSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleCreatePayload value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SecurityMonitoringRuleCreatePayloadDeserializer
      extends StdDeserializer<SecurityMonitoringRuleCreatePayload> {
    public SecurityMonitoringRuleCreatePayloadDeserializer() {
      this(SecurityMonitoringRuleCreatePayload.class);
    }

    public SecurityMonitoringRuleCreatePayloadDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SecurityMonitoringRuleCreatePayload deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SecurityMonitoringStandardRuleCreatePayload
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringStandardRuleCreatePayload.class.equals(Integer.class)
            || SecurityMonitoringStandardRuleCreatePayload.class.equals(Long.class)
            || SecurityMonitoringStandardRuleCreatePayload.class.equals(Float.class)
            || SecurityMonitoringStandardRuleCreatePayload.class.equals(Double.class)
            || SecurityMonitoringStandardRuleCreatePayload.class.equals(Boolean.class)
            || SecurityMonitoringStandardRuleCreatePayload.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringStandardRuleCreatePayload.class.equals(Integer.class)
                        || SecurityMonitoringStandardRuleCreatePayload.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringStandardRuleCreatePayload.class.equals(Float.class)
                        || SecurityMonitoringStandardRuleCreatePayload.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringStandardRuleCreatePayload.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringStandardRuleCreatePayload.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringStandardRuleCreatePayload.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringStandardRuleCreatePayload) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SecurityMonitoringStandardRuleCreatePayload'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringStandardRuleCreatePayload'",
            e);
      }

      // deserialize SecurityMonitoringSignalRuleCreatePayload
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringSignalRuleCreatePayload.class.equals(Integer.class)
            || SecurityMonitoringSignalRuleCreatePayload.class.equals(Long.class)
            || SecurityMonitoringSignalRuleCreatePayload.class.equals(Float.class)
            || SecurityMonitoringSignalRuleCreatePayload.class.equals(Double.class)
            || SecurityMonitoringSignalRuleCreatePayload.class.equals(Boolean.class)
            || SecurityMonitoringSignalRuleCreatePayload.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringSignalRuleCreatePayload.class.equals(Integer.class)
                        || SecurityMonitoringSignalRuleCreatePayload.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringSignalRuleCreatePayload.class.equals(Float.class)
                        || SecurityMonitoringSignalRuleCreatePayload.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringSignalRuleCreatePayload.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringSignalRuleCreatePayload.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringSignalRuleCreatePayload.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringSignalRuleCreatePayload) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'SecurityMonitoringSignalRuleCreatePayload'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringSignalRuleCreatePayload'",
            e);
      }

      // deserialize CloudConfigurationRuleCreatePayload
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CloudConfigurationRuleCreatePayload.class.equals(Integer.class)
            || CloudConfigurationRuleCreatePayload.class.equals(Long.class)
            || CloudConfigurationRuleCreatePayload.class.equals(Float.class)
            || CloudConfigurationRuleCreatePayload.class.equals(Double.class)
            || CloudConfigurationRuleCreatePayload.class.equals(Boolean.class)
            || CloudConfigurationRuleCreatePayload.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CloudConfigurationRuleCreatePayload.class.equals(Integer.class)
                        || CloudConfigurationRuleCreatePayload.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CloudConfigurationRuleCreatePayload.class.equals(Float.class)
                        || CloudConfigurationRuleCreatePayload.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CloudConfigurationRuleCreatePayload.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CloudConfigurationRuleCreatePayload.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CloudConfigurationRuleCreatePayload.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CloudConfigurationRuleCreatePayload) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CloudConfigurationRuleCreatePayload'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CloudConfigurationRuleCreatePayload'",
            e);
      }

      SecurityMonitoringRuleCreatePayload ret = new SecurityMonitoringRuleCreatePayload();
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
    public SecurityMonitoringRuleCreatePayload getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SecurityMonitoringRuleCreatePayload cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SecurityMonitoringRuleCreatePayload() {
    super("oneOf", Boolean.FALSE);
  }

  public SecurityMonitoringRuleCreatePayload(SecurityMonitoringStandardRuleCreatePayload o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringRuleCreatePayload(SecurityMonitoringSignalRuleCreatePayload o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringRuleCreatePayload(CloudConfigurationRuleCreatePayload o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SecurityMonitoringStandardRuleCreatePayload",
        new GenericType<SecurityMonitoringStandardRuleCreatePayload>() {});
    schemas.put(
        "SecurityMonitoringSignalRuleCreatePayload",
        new GenericType<SecurityMonitoringSignalRuleCreatePayload>() {});
    schemas.put(
        "CloudConfigurationRuleCreatePayload",
        new GenericType<CloudConfigurationRuleCreatePayload>() {});
    JSON.registerDescendants(
        SecurityMonitoringRuleCreatePayload.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SecurityMonitoringRuleCreatePayload.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SecurityMonitoringStandardRuleCreatePayload,
   * SecurityMonitoringSignalRuleCreatePayload, CloudConfigurationRuleCreatePayload
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SecurityMonitoringStandardRuleCreatePayload.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringSignalRuleCreatePayload.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CloudConfigurationRuleCreatePayload.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SecurityMonitoringStandardRuleCreatePayload,"
            + " SecurityMonitoringSignalRuleCreatePayload, CloudConfigurationRuleCreatePayload");
  }

  /**
   * Get the actual instance, which can be the following:
   * SecurityMonitoringStandardRuleCreatePayload, SecurityMonitoringSignalRuleCreatePayload,
   * CloudConfigurationRuleCreatePayload
   *
   * @return The actual instance (SecurityMonitoringStandardRuleCreatePayload,
   *     SecurityMonitoringSignalRuleCreatePayload, CloudConfigurationRuleCreatePayload)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringStandardRuleCreatePayload`. If the actual
   * instance is not `SecurityMonitoringStandardRuleCreatePayload`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `SecurityMonitoringStandardRuleCreatePayload`
   * @throws ClassCastException if the instance is not `SecurityMonitoringStandardRuleCreatePayload`
   */
  public SecurityMonitoringStandardRuleCreatePayload
      getSecurityMonitoringStandardRuleCreatePayload() throws ClassCastException {
    return (SecurityMonitoringStandardRuleCreatePayload) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringSignalRuleCreatePayload`. If the actual instance
   * is not `SecurityMonitoringSignalRuleCreatePayload`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringSignalRuleCreatePayload`
   * @throws ClassCastException if the instance is not `SecurityMonitoringSignalRuleCreatePayload`
   */
  public SecurityMonitoringSignalRuleCreatePayload getSecurityMonitoringSignalRuleCreatePayload()
      throws ClassCastException {
    return (SecurityMonitoringSignalRuleCreatePayload) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CloudConfigurationRuleCreatePayload`. If the actual instance is not
   * `CloudConfigurationRuleCreatePayload`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CloudConfigurationRuleCreatePayload`
   * @throws ClassCastException if the instance is not `CloudConfigurationRuleCreatePayload`
   */
  public CloudConfigurationRuleCreatePayload getCloudConfigurationRuleCreatePayload()
      throws ClassCastException {
    return (CloudConfigurationRuleCreatePayload) super.getActualInstance();
  }
}
