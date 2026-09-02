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
        SecurityMonitoringIntegrationCredentialsValidateAttributes
            .SecurityMonitoringIntegrationCredentialsValidateAttributesDeserializer.class)
@JsonSerialize(
    using =
        SecurityMonitoringIntegrationCredentialsValidateAttributes
            .SecurityMonitoringIntegrationCredentialsValidateAttributesSerializer.class)
public class SecurityMonitoringIntegrationCredentialsValidateAttributes
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SecurityMonitoringIntegrationCredentialsValidateAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SecurityMonitoringIntegrationCredentialsValidateAttributesSerializer
      extends StdSerializer<SecurityMonitoringIntegrationCredentialsValidateAttributes> {
    public SecurityMonitoringIntegrationCredentialsValidateAttributesSerializer(
        Class<SecurityMonitoringIntegrationCredentialsValidateAttributes> t) {
      super(t);
    }

    public SecurityMonitoringIntegrationCredentialsValidateAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringIntegrationCredentialsValidateAttributes value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SecurityMonitoringIntegrationCredentialsValidateAttributesDeserializer
      extends StdDeserializer<SecurityMonitoringIntegrationCredentialsValidateAttributes> {
    public SecurityMonitoringIntegrationCredentialsValidateAttributesDeserializer() {
      this(SecurityMonitoringIntegrationCredentialsValidateAttributes.class);
    }

    public SecurityMonitoringIntegrationCredentialsValidateAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SecurityMonitoringIntegrationCredentialsValidateAttributes deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                .equals(Long.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                .equals(Float.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                .equals(Double.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                .equals(Boolean.class)
            || SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                .equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                            .equals(Integer.class)
                        || SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                            .equals(Float.class)
                        || SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                        .equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class
                        .equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes
                          .class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringOktaIntegrationCredentialsValidateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringOktaIntegrationCredentialsValidateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringOktaIntegrationCredentialsValidateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringOktaIntegrationCredentialsValidateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                            Integer.class)
                        || SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                            Float.class)
                        || SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class
                            .equals(Integer.class)
                        || SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class
                            .equals(Float.class)
                        || SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes'",
            e);
      }

      // deserialize SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                Integer.class)
            || SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                Long.class)
            || SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                Float.class)
            || SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                Double.class)
            || SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                Boolean.class)
            || SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class
                            .equals(Integer.class)
                        || SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class
                            .equals(Float.class)
                        || SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes'",
            e);
      }

      SecurityMonitoringIntegrationCredentialsValidateAttributes ret =
          new SecurityMonitoringIntegrationCredentialsValidateAttributes();
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
    public SecurityMonitoringIntegrationCredentialsValidateAttributes getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "SecurityMonitoringIntegrationCredentialsValidateAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SecurityMonitoringIntegrationCredentialsValidateAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public SecurityMonitoringIntegrationCredentialsValidateAttributes(
      SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationCredentialsValidateAttributes(
      SecurityMonitoringOktaIntegrationCredentialsValidateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationCredentialsValidateAttributes(
      SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationCredentialsValidateAttributes(
      SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringIntegrationCredentialsValidateAttributes(
      SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes",
        new GenericType<
            SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes>() {});
    schemas.put(
        "SecurityMonitoringOktaIntegrationCredentialsValidateAttributes",
        new GenericType<SecurityMonitoringOktaIntegrationCredentialsValidateAttributes>() {});
    schemas.put(
        "SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes",
        new GenericType<SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes>() {});
    schemas.put(
        "SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes",
        new GenericType<
            SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes>() {});
    schemas.put(
        "SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes",
        new GenericType<
            SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes>() {});
    JSON.registerDescendants(
        SecurityMonitoringIntegrationCredentialsValidateAttributes.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SecurityMonitoringIntegrationCredentialsValidateAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringOktaIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringOktaIntegrationCredentialsValidateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes.class,
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
            + " SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes,"
            + " SecurityMonitoringOktaIntegrationCredentialsValidateAttributes,"
            + " SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes,"
            + " SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes,"
            + " SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes");
  }

  /**
   * Get the actual instance, which can be the following:
   * SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringOktaIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes,
   * SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes
   *
   * @return The actual instance
   *     (SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes,
   *     SecurityMonitoringOktaIntegrationCredentialsValidateAttributes,
   *     SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes,
   *     SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes,
   *     SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes`. If the actual
   * instance is not `SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes`
   */
  public SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes
      getSecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringOktaIntegrationCredentialsValidateAttributes`. If
   * the actual instance is not `SecurityMonitoringOktaIntegrationCredentialsValidateAttributes`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringOktaIntegrationCredentialsValidateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringOktaIntegrationCredentialsValidateAttributes`
   */
  public SecurityMonitoringOktaIntegrationCredentialsValidateAttributes
      getSecurityMonitoringOktaIntegrationCredentialsValidateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringOktaIntegrationCredentialsValidateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes`.
   * If the actual instance is not
   * `SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of
   *     `SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes`
   */
  public SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes
      getSecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringEntraIdIntegrationCredentialsValidateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes`. If the actual instance
   * is not `SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes`
   */
  public SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes
      getSecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringCrowdStrikeIntegrationCredentialsValidateAttributes)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes`. If the actual instance
   * is not `SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes`
   */
  public SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes
      getSecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes()
          throws ClassCastException {
    return (SecurityMonitoringSentinelOneIntegrationCredentialsValidateAttributes)
        super.getActualInstance();
  }
}
