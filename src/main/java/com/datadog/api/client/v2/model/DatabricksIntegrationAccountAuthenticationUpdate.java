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
        DatabricksIntegrationAccountAuthenticationUpdate
            .DatabricksIntegrationAccountAuthenticationUpdateDeserializer.class)
@JsonSerialize(
    using =
        DatabricksIntegrationAccountAuthenticationUpdate
            .DatabricksIntegrationAccountAuthenticationUpdateSerializer.class)
public class DatabricksIntegrationAccountAuthenticationUpdate extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DatabricksIntegrationAccountAuthenticationUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DatabricksIntegrationAccountAuthenticationUpdateSerializer
      extends StdSerializer<DatabricksIntegrationAccountAuthenticationUpdate> {
    public DatabricksIntegrationAccountAuthenticationUpdateSerializer(
        Class<DatabricksIntegrationAccountAuthenticationUpdate> t) {
      super(t);
    }

    public DatabricksIntegrationAccountAuthenticationUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatabricksIntegrationAccountAuthenticationUpdate value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DatabricksIntegrationAccountAuthenticationUpdateDeserializer
      extends StdDeserializer<DatabricksIntegrationAccountAuthenticationUpdate> {
    public DatabricksIntegrationAccountAuthenticationUpdateDeserializer() {
      this(DatabricksIntegrationAccountAuthenticationUpdate.class);
    }

    public DatabricksIntegrationAccountAuthenticationUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DatabricksIntegrationAccountAuthenticationUpdate deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DatabricksIntegrationAccountOAuthAuthUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Integer.class)
            || DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Long.class)
            || DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Float.class)
            || DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Double.class)
            || DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Boolean.class)
            || DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Integer.class)
                        || DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Float.class)
                        || DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabricksIntegrationAccountOAuthAuthUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DatabricksIntegrationAccountOAuthAuthUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabricksIntegrationAccountOAuthAuthUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DatabricksIntegrationAccountOAuthAuthUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DatabricksIntegrationAccountOAuthAuthUpdate'",
            e);
      }

      // deserialize DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(Integer.class)
            || DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(Long.class)
            || DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(Float.class)
            || DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(Double.class)
            || DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(Boolean.class)
            || DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(
                            Integer.class)
                        || DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(
                            Float.class)
                        || DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate'",
            e);
      }

      // deserialize DatabricksIntegrationAccountBearerTokenAuthUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Integer.class)
            || DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Long.class)
            || DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Float.class)
            || DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Double.class)
            || DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Boolean.class)
            || DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Integer.class)
                        || DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Float.class)
                        || DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabricksIntegrationAccountBearerTokenAuthUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DatabricksIntegrationAccountBearerTokenAuthUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabricksIntegrationAccountBearerTokenAuthUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DatabricksIntegrationAccountBearerTokenAuthUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DatabricksIntegrationAccountBearerTokenAuthUpdate'",
            e);
      }

      DatabricksIntegrationAccountAuthenticationUpdate ret =
          new DatabricksIntegrationAccountAuthenticationUpdate();
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
    public DatabricksIntegrationAccountAuthenticationUpdate getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DatabricksIntegrationAccountAuthenticationUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DatabricksIntegrationAccountAuthenticationUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public DatabricksIntegrationAccountAuthenticationUpdate(
      DatabricksIntegrationAccountOAuthAuthUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatabricksIntegrationAccountAuthenticationUpdate(
      DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatabricksIntegrationAccountAuthenticationUpdate(
      DatabricksIntegrationAccountBearerTokenAuthUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DatabricksIntegrationAccountOAuthAuthUpdate",
        new GenericType<DatabricksIntegrationAccountOAuthAuthUpdate>() {});
    schemas.put(
        "DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate",
        new GenericType<DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate>() {});
    schemas.put(
        "DatabricksIntegrationAccountBearerTokenAuthUpdate",
        new GenericType<DatabricksIntegrationAccountBearerTokenAuthUpdate>() {});
    JSON.registerDescendants(
        DatabricksIntegrationAccountAuthenticationUpdate.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DatabricksIntegrationAccountAuthenticationUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DatabricksIntegrationAccountOAuthAuthUpdate,
   * DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate,
   * DatabricksIntegrationAccountBearerTokenAuthUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DatabricksIntegrationAccountOAuthAuthUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DatabricksIntegrationAccountBearerTokenAuthUpdate.class,
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
        "Invalid instance type. Must be DatabricksIntegrationAccountOAuthAuthUpdate,"
            + " DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate,"
            + " DatabricksIntegrationAccountBearerTokenAuthUpdate");
  }

  /**
   * Get the actual instance, which can be the following:
   * DatabricksIntegrationAccountOAuthAuthUpdate,
   * DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate,
   * DatabricksIntegrationAccountBearerTokenAuthUpdate
   *
   * @return The actual instance (DatabricksIntegrationAccountOAuthAuthUpdate,
   *     DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate,
   *     DatabricksIntegrationAccountBearerTokenAuthUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabricksIntegrationAccountOAuthAuthUpdate`. If the actual
   * instance is not `DatabricksIntegrationAccountOAuthAuthUpdate`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `DatabricksIntegrationAccountOAuthAuthUpdate`
   * @throws ClassCastException if the instance is not `DatabricksIntegrationAccountOAuthAuthUpdate`
   */
  public DatabricksIntegrationAccountOAuthAuthUpdate
      getDatabricksIntegrationAccountOAuthAuthUpdate() throws ClassCastException {
    return (DatabricksIntegrationAccountOAuthAuthUpdate) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate`. If the
   * actual instance is not `DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate`
   * @throws ClassCastException if the instance is not
   *     `DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate`
   */
  public DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate
      getDatabricksIntegrationAccountPrivateActionRunnerAuthUpdate() throws ClassCastException {
    return (DatabricksIntegrationAccountPrivateActionRunnerAuthUpdate) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabricksIntegrationAccountBearerTokenAuthUpdate`. If the actual
   * instance is not `DatabricksIntegrationAccountBearerTokenAuthUpdate`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DatabricksIntegrationAccountBearerTokenAuthUpdate`
   * @throws ClassCastException if the instance is not
   *     `DatabricksIntegrationAccountBearerTokenAuthUpdate`
   */
  public DatabricksIntegrationAccountBearerTokenAuthUpdate
      getDatabricksIntegrationAccountBearerTokenAuthUpdate() throws ClassCastException {
    return (DatabricksIntegrationAccountBearerTokenAuthUpdate) super.getActualInstance();
  }
}
