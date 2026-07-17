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
        SecurityMonitoringIntegrationConfigUpdateAttributes
            .SecurityMonitoringIntegrationConfigUpdateAttributesDeserializer.class)
@JsonSerialize(
    using =
        SecurityMonitoringIntegrationConfigUpdateAttributes
            .SecurityMonitoringIntegrationConfigUpdateAttributesSerializer.class)
public class SecurityMonitoringIntegrationConfigUpdateAttributes extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SecurityMonitoringIntegrationConfigUpdateAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SecurityMonitoringIntegrationConfigUpdateAttributesSerializer
      extends StdSerializer<SecurityMonitoringIntegrationConfigUpdateAttributes> {
    public SecurityMonitoringIntegrationConfigUpdateAttributesSerializer(
        Class<SecurityMonitoringIntegrationConfigUpdateAttributes> t) {
      super(t);
    }

    public SecurityMonitoringIntegrationConfigUpdateAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringIntegrationConfigUpdateAttributes value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SecurityMonitoringIntegrationConfigUpdateAttributesDeserializer
      extends StdDeserializer<SecurityMonitoringIntegrationConfigUpdateAttributes> {
    public SecurityMonitoringIntegrationConfigUpdateAttributesDeserializer() {
      this(SecurityMonitoringIntegrationConfigUpdateAttributes.class);
    }

    public SecurityMonitoringIntegrationConfigUpdateAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SecurityMonitoringIntegrationConfigUpdateAttributes deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringOktaIntegrationConfigUpdateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(Integer.class)
            || SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(Long.class)
            || SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(Float.class)
            || SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(Double.class)
            || SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(Boolean.class)
            || SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(Float.class)
                        || SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringOktaIntegrationConfigUpdateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringOktaIntegrationConfigUpdateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringOktaIntegrationConfigUpdateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(Integer.class)
            || SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(Long.class)
            || SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(Float.class)
            || SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(Double.class)
            || SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes'",
            e);
      }

      SecurityMonitoringIntegrationConfigUpdateAttributes ret =
          new SecurityMonitoringIntegrationConfigUpdateAttributes();
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
    public SecurityMonitoringIntegrationConfigUpdateAttributes getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SecurityMonitoringIntegrationConfigUpdateAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SecurityMonitoringIntegrationConfigUpdateAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public SecurityMonitoringIntegrationConfigUpdateAttributes(
      SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigUpdateAttributes(
      SecurityMonitoringOktaIntegrationConfigUpdateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigUpdateAttributes(
      SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigUpdateAttributes(
      SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationConfigUpdateAttributes(
      SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes",
        new GenericType<SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes>() {});
    schemas.put(
        "SecurityMonitoringOktaIntegrationConfigUpdateAttributes",
        new GenericType<SecurityMonitoringOktaIntegrationConfigUpdateAttributes>() {});
    schemas.put(
        "SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes",
        new GenericType<SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes>() {});
    schemas.put(
        "SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes",
        new GenericType<SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes>() {});
    schemas.put(
        "SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes",
        new GenericType<SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes>() {});
    JSON.registerDescendants(
        SecurityMonitoringIntegrationConfigUpdateAttributes.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SecurityMonitoringIntegrationConfigUpdateAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes,
   * SecurityMonitoringOktaIntegrationConfigUpdateAttributes,
   * SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes,
   * SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes,
   * SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringOktaIntegrationConfigUpdateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes.class,
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
            + " SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes,"
            + " SecurityMonitoringOktaIntegrationConfigUpdateAttributes,"
            + " SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes,"
            + " SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes,"
            + " SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes");
  }

  /**
   * Get the actual instance, which can be the following:
   * SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes,
   * SecurityMonitoringOktaIntegrationConfigUpdateAttributes,
   * SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes,
   * SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes,
   * SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes
   *
   * @return The actual instance
   *     (SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes,
   *     SecurityMonitoringOktaIntegrationConfigUpdateAttributes,
   *     SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes,
   *     SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes,
   *     SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes`. If the actual instance is
   * not `SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes`
   */
  public SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes
      getSecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringGoogleWorkspaceIntegrationConfigUpdateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringOktaIntegrationConfigUpdateAttributes`. If the
   * actual instance is not `SecurityMonitoringOktaIntegrationConfigUpdateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringOktaIntegrationConfigUpdateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringOktaIntegrationConfigUpdateAttributes`
   */
  public SecurityMonitoringOktaIntegrationConfigUpdateAttributes
      getSecurityMonitoringOktaIntegrationConfigUpdateAttributes() throws ClassCastException {
    return (SecurityMonitoringOktaIntegrationConfigUpdateAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes`. If the
   * actual instance is not `SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes`
   */
  public SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes
      getSecurityMonitoringEntraIdIntegrationConfigUpdateAttributes() throws ClassCastException {
    return (SecurityMonitoringEntraIdIntegrationConfigUpdateAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes`. If
   * the actual instance is not `SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes`
   */
  public SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes
      getSecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringCrowdStrikeIntegrationConfigUpdateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes`. If
   * the actual instance is not `SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes`
   */
  public SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes
      getSecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringSentinelOneIntegrationConfigUpdateAttributes)
        super.getActualInstance();
  }
}
