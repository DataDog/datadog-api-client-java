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
        DatabricksIntegrationAccountAuthenticationRequest
            .DatabricksIntegrationAccountAuthenticationRequestDeserializer.class)
@JsonSerialize(
    using =
        DatabricksIntegrationAccountAuthenticationRequest
            .DatabricksIntegrationAccountAuthenticationRequestSerializer.class)
public class DatabricksIntegrationAccountAuthenticationRequest extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DatabricksIntegrationAccountAuthenticationRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DatabricksIntegrationAccountAuthenticationRequestSerializer
      extends StdSerializer<DatabricksIntegrationAccountAuthenticationRequest> {
    public DatabricksIntegrationAccountAuthenticationRequestSerializer(
        Class<DatabricksIntegrationAccountAuthenticationRequest> t) {
      super(t);
    }

    public DatabricksIntegrationAccountAuthenticationRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatabricksIntegrationAccountAuthenticationRequest value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DatabricksIntegrationAccountAuthenticationRequestDeserializer
      extends StdDeserializer<DatabricksIntegrationAccountAuthenticationRequest> {
    public DatabricksIntegrationAccountAuthenticationRequestDeserializer() {
      this(DatabricksIntegrationAccountAuthenticationRequest.class);
    }

    public DatabricksIntegrationAccountAuthenticationRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DatabricksIntegrationAccountAuthenticationRequest deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DatabricksIntegrationAccountOAuthAuthRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Integer.class)
            || DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Long.class)
            || DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Float.class)
            || DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Double.class)
            || DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Boolean.class)
            || DatabricksIntegrationAccountOAuthAuthRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Integer.class)
                        || DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Float.class)
                        || DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabricksIntegrationAccountOAuthAuthRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabricksIntegrationAccountOAuthAuthRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DatabricksIntegrationAccountOAuthAuthRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabricksIntegrationAccountOAuthAuthRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DatabricksIntegrationAccountOAuthAuthRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DatabricksIntegrationAccountOAuthAuthRequest'",
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

      DatabricksIntegrationAccountAuthenticationRequest ret =
          new DatabricksIntegrationAccountAuthenticationRequest();
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
    public DatabricksIntegrationAccountAuthenticationRequest getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DatabricksIntegrationAccountAuthenticationRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DatabricksIntegrationAccountAuthenticationRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public DatabricksIntegrationAccountAuthenticationRequest(
      DatabricksIntegrationAccountOAuthAuthRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatabricksIntegrationAccountAuthenticationRequest(
      IntegrationAccountPrivateActionRunnerAuthRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DatabricksIntegrationAccountOAuthAuthRequest",
        new GenericType<DatabricksIntegrationAccountOAuthAuthRequest>() {});
    schemas.put(
        "IntegrationAccountPrivateActionRunnerAuthRequest",
        new GenericType<IntegrationAccountPrivateActionRunnerAuthRequest>() {});
    JSON.registerDescendants(
        DatabricksIntegrationAccountAuthenticationRequest.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DatabricksIntegrationAccountAuthenticationRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DatabricksIntegrationAccountOAuthAuthRequest,
   * IntegrationAccountPrivateActionRunnerAuthRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DatabricksIntegrationAccountOAuthAuthRequest.class, instance, new HashSet<Class<?>>())) {
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

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DatabricksIntegrationAccountOAuthAuthRequest,"
            + " IntegrationAccountPrivateActionRunnerAuthRequest");
  }

  /**
   * Get the actual instance, which can be the following:
   * DatabricksIntegrationAccountOAuthAuthRequest, IntegrationAccountPrivateActionRunnerAuthRequest
   *
   * @return The actual instance (DatabricksIntegrationAccountOAuthAuthRequest,
   *     IntegrationAccountPrivateActionRunnerAuthRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabricksIntegrationAccountOAuthAuthRequest`. If the actual
   * instance is not `DatabricksIntegrationAccountOAuthAuthRequest`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `DatabricksIntegrationAccountOAuthAuthRequest`
   * @throws ClassCastException if the instance is not
   *     `DatabricksIntegrationAccountOAuthAuthRequest`
   */
  public DatabricksIntegrationAccountOAuthAuthRequest
      getDatabricksIntegrationAccountOAuthAuthRequest() throws ClassCastException {
    return (DatabricksIntegrationAccountOAuthAuthRequest) super.getActualInstance();
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
}
