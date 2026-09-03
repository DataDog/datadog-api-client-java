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

      // deserialize IntegrationAccountPrivateActionRunnerAuthRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Integer.class)
            || IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Long.class)
            || IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Float.class)
            || IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Double.class)
            || IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Boolean.class)
            || IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Integer.class)
                        || IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Float.class)
                        || IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IntegrationAccountPrivateActionRunnerAuthRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(IntegrationAccountPrivateActionRunnerAuthRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IntegrationAccountPrivateActionRunnerAuthRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'IntegrationAccountPrivateActionRunnerAuthRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'IntegrationAccountPrivateActionRunnerAuthRequest'",
            e);
      }

      // deserialize DatabricksIntegrationAccountPatAuthUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabricksIntegrationAccountPatAuthUpdate.class.equals(Integer.class)
            || DatabricksIntegrationAccountPatAuthUpdate.class.equals(Long.class)
            || DatabricksIntegrationAccountPatAuthUpdate.class.equals(Float.class)
            || DatabricksIntegrationAccountPatAuthUpdate.class.equals(Double.class)
            || DatabricksIntegrationAccountPatAuthUpdate.class.equals(Boolean.class)
            || DatabricksIntegrationAccountPatAuthUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabricksIntegrationAccountPatAuthUpdate.class.equals(Integer.class)
                        || DatabricksIntegrationAccountPatAuthUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabricksIntegrationAccountPatAuthUpdate.class.equals(Float.class)
                        || DatabricksIntegrationAccountPatAuthUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabricksIntegrationAccountPatAuthUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabricksIntegrationAccountPatAuthUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DatabricksIntegrationAccountPatAuthUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabricksIntegrationAccountPatAuthUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'DatabricksIntegrationAccountPatAuthUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DatabricksIntegrationAccountPatAuthUpdate'",
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
      IntegrationAccountPrivateActionRunnerAuthRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatabricksIntegrationAccountAuthenticationUpdate(
      DatabricksIntegrationAccountPatAuthUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DatabricksIntegrationAccountOAuthAuthUpdate",
        new GenericType<DatabricksIntegrationAccountOAuthAuthUpdate>() {});
    schemas.put(
        "IntegrationAccountPrivateActionRunnerAuthRequest",
        new GenericType<IntegrationAccountPrivateActionRunnerAuthRequest>() {});
    schemas.put(
        "DatabricksIntegrationAccountPatAuthUpdate",
        new GenericType<DatabricksIntegrationAccountPatAuthUpdate>() {});
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
   * IntegrationAccountPrivateActionRunnerAuthRequest, DatabricksIntegrationAccountPatAuthUpdate
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
        IntegrationAccountPrivateActionRunnerAuthRequest.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DatabricksIntegrationAccountPatAuthUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DatabricksIntegrationAccountOAuthAuthUpdate,"
            + " IntegrationAccountPrivateActionRunnerAuthRequest,"
            + " DatabricksIntegrationAccountPatAuthUpdate");
  }

  /**
   * Get the actual instance, which can be the following:
   * DatabricksIntegrationAccountOAuthAuthUpdate, IntegrationAccountPrivateActionRunnerAuthRequest,
   * DatabricksIntegrationAccountPatAuthUpdate
   *
   * @return The actual instance (DatabricksIntegrationAccountOAuthAuthUpdate,
   *     IntegrationAccountPrivateActionRunnerAuthRequest,
   *     DatabricksIntegrationAccountPatAuthUpdate)
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
   * Get the actual instance of `IntegrationAccountPrivateActionRunnerAuthRequest`. If the actual
   * instance is not `IntegrationAccountPrivateActionRunnerAuthRequest`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `IntegrationAccountPrivateActionRunnerAuthRequest`
   * @throws ClassCastException if the instance is not
   *     `IntegrationAccountPrivateActionRunnerAuthRequest`
   */
  public IntegrationAccountPrivateActionRunnerAuthRequest
      getIntegrationAccountPrivateActionRunnerAuthRequest() throws ClassCastException {
    return (IntegrationAccountPrivateActionRunnerAuthRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabricksIntegrationAccountPatAuthUpdate`. If the actual instance
   * is not `DatabricksIntegrationAccountPatAuthUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DatabricksIntegrationAccountPatAuthUpdate`
   * @throws ClassCastException if the instance is not `DatabricksIntegrationAccountPatAuthUpdate`
   */
  public DatabricksIntegrationAccountPatAuthUpdate getDatabricksIntegrationAccountPatAuthUpdate()
      throws ClassCastException {
    return (DatabricksIntegrationAccountPatAuthUpdate) super.getActualInstance();
  }
}
