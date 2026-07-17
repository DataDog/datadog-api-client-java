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
        SecurityMonitoringIntegrationConfigCreateAttributes
            .SecurityMonitoringIntegrationConfigCreateAttributesDeserializer.class)
@JsonSerialize(
    using =
        SecurityMonitoringIntegrationConfigCreateAttributes
            .SecurityMonitoringIntegrationConfigCreateAttributesSerializer.class)
public class SecurityMonitoringIntegrationConfigCreateAttributes extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SecurityMonitoringIntegrationConfigCreateAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SecurityMonitoringIntegrationConfigCreateAttributesSerializer
      extends StdSerializer<SecurityMonitoringIntegrationConfigCreateAttributes> {
    public SecurityMonitoringIntegrationConfigCreateAttributesSerializer(
        Class<SecurityMonitoringIntegrationConfigCreateAttributes> t) {
      super(t);
    }

    public SecurityMonitoringIntegrationConfigCreateAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringIntegrationConfigCreateAttributes value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SecurityMonitoringIntegrationConfigCreateAttributesDeserializer
      extends StdDeserializer<SecurityMonitoringIntegrationConfigCreateAttributes> {
    public SecurityMonitoringIntegrationConfigCreateAttributesDeserializer() {
      this(SecurityMonitoringIntegrationConfigCreateAttributes.class);
    }

    public SecurityMonitoringIntegrationConfigCreateAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SecurityMonitoringIntegrationConfigCreateAttributes deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringOktaIntegrationConfigCreateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(Integer.class)
            || SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(Long.class)
            || SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(Float.class)
            || SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(Double.class)
            || SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(Boolean.class)
            || SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(Float.class)
                        || SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringOktaIntegrationConfigCreateAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringOktaIntegrationConfigCreateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringOktaIntegrationConfigCreateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringOktaIntegrationConfigCreateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringOktaIntegrationConfigCreateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringEntraIdIntegrationConfigCreateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(Integer.class)
            || SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(Long.class)
            || SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(Float.class)
            || SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(Double.class)
            || SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringEntraIdIntegrationConfigCreateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringEntraIdIntegrationConfigCreateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringEntraIdIntegrationConfigCreateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes'",
            e);
      }

      SecurityMonitoringIntegrationConfigCreateAttributes ret =
          new SecurityMonitoringIntegrationConfigCreateAttributes();
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
    public SecurityMonitoringIntegrationConfigCreateAttributes getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SecurityMonitoringIntegrationConfigCreateAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SecurityMonitoringIntegrationConfigCreateAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public SecurityMonitoringIntegrationConfigCreateAttributes(
      SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigCreateAttributes(
      SecurityMonitoringOktaIntegrationConfigCreateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigCreateAttributes(
      SecurityMonitoringEntraIdIntegrationConfigCreateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigCreateAttributes(
      SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigCreateAttributes(
      SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes",
        new GenericType<SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes>() {});
    schemas.put(
        "SecurityMonitoringOktaIntegrationConfigCreateAttributes",
        new GenericType<SecurityMonitoringOktaIntegrationConfigCreateAttributes>() {});
    schemas.put(
        "SecurityMonitoringEntraIdIntegrationConfigCreateAttributes",
        new GenericType<SecurityMonitoringEntraIdIntegrationConfigCreateAttributes>() {});
    schemas.put(
        "SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes",
        new GenericType<SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes>() {});
    schemas.put(
        "SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes",
        new GenericType<SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes>() {});
    JSON.registerDescendants(
        SecurityMonitoringIntegrationConfigCreateAttributes.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SecurityMonitoringIntegrationConfigCreateAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes,
   * SecurityMonitoringOktaIntegrationConfigCreateAttributes,
   * SecurityMonitoringEntraIdIntegrationConfigCreateAttributes,
   * SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes,
   * SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringOktaIntegrationConfigCreateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringEntraIdIntegrationConfigCreateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be"
            + " SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes,"
            + " SecurityMonitoringOktaIntegrationConfigCreateAttributes,"
            + " SecurityMonitoringEntraIdIntegrationConfigCreateAttributes,"
            + " SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes,"
            + " SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes");
  }

  /**
   * Get the actual instance, which can be the following:
   * SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes,
   * SecurityMonitoringOktaIntegrationConfigCreateAttributes,
   * SecurityMonitoringEntraIdIntegrationConfigCreateAttributes,
   * SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes,
   * SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes
   *
   * @return The actual instance
   *     (SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes,
   *     SecurityMonitoringOktaIntegrationConfigCreateAttributes,
   *     SecurityMonitoringEntraIdIntegrationConfigCreateAttributes,
   *     SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes,
   *     SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes`. If the actual instance is
   * not `SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes`
   */
  public SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes
      getSecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringOktaIntegrationConfigCreateAttributes`. If the
   * actual instance is not `SecurityMonitoringOktaIntegrationConfigCreateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringOktaIntegrationConfigCreateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringOktaIntegrationConfigCreateAttributes`
   */
  public SecurityMonitoringOktaIntegrationConfigCreateAttributes
      getSecurityMonitoringOktaIntegrationConfigCreateAttributes() throws ClassCastException {
    return (SecurityMonitoringOktaIntegrationConfigCreateAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringEntraIdIntegrationConfigCreateAttributes`. If the
   * actual instance is not `SecurityMonitoringEntraIdIntegrationConfigCreateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringEntraIdIntegrationConfigCreateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringEntraIdIntegrationConfigCreateAttributes`
   */
  public SecurityMonitoringEntraIdIntegrationConfigCreateAttributes
      getSecurityMonitoringEntraIdIntegrationConfigCreateAttributes() throws ClassCastException {
    return (SecurityMonitoringEntraIdIntegrationConfigCreateAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes`. If
   * the actual instance is not `SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes`
   */
  public SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes
      getSecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringCrowdStrikeIntegrationConfigCreateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes`. If
   * the actual instance is not `SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes`
   */
  public SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes
      getSecurityMonitoringSentinelOneIntegrationConfigCreateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringSentinelOneIntegrationConfigCreateAttributes)
        super.getActualInstance();
  }
}
