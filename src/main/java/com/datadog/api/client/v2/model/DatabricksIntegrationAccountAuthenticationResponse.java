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
        DatabricksIntegrationAccountAuthenticationResponse
            .DatabricksIntegrationAccountAuthenticationResponseDeserializer.class)
@JsonSerialize(
    using =
        DatabricksIntegrationAccountAuthenticationResponse
            .DatabricksIntegrationAccountAuthenticationResponseSerializer.class)
public class DatabricksIntegrationAccountAuthenticationResponse extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DatabricksIntegrationAccountAuthenticationResponse.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DatabricksIntegrationAccountAuthenticationResponseSerializer
      extends StdSerializer<DatabricksIntegrationAccountAuthenticationResponse> {
    public DatabricksIntegrationAccountAuthenticationResponseSerializer(
        Class<DatabricksIntegrationAccountAuthenticationResponse> t) {
      super(t);
    }

    public DatabricksIntegrationAccountAuthenticationResponseSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatabricksIntegrationAccountAuthenticationResponse value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DatabricksIntegrationAccountAuthenticationResponseDeserializer
      extends StdDeserializer<DatabricksIntegrationAccountAuthenticationResponse> {
    public DatabricksIntegrationAccountAuthenticationResponseDeserializer() {
      this(DatabricksIntegrationAccountAuthenticationResponse.class);
    }

    public DatabricksIntegrationAccountAuthenticationResponseDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DatabricksIntegrationAccountAuthenticationResponse deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DatabricksIntegrationAccountOAuthAuthResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Integer.class)
            || DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Long.class)
            || DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Float.class)
            || DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Double.class)
            || DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Boolean.class)
            || DatabricksIntegrationAccountOAuthAuthResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Integer.class)
                        || DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Float.class)
                        || DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabricksIntegrationAccountOAuthAuthResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabricksIntegrationAccountOAuthAuthResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DatabricksIntegrationAccountOAuthAuthResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabricksIntegrationAccountOAuthAuthResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DatabricksIntegrationAccountOAuthAuthResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DatabricksIntegrationAccountOAuthAuthResponse'",
            e);
      }

      // deserialize IntegrationAccountPrivateActionRunnerAuthResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Integer.class)
            || IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Long.class)
            || IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Float.class)
            || IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Double.class)
            || IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Boolean.class)
            || IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Integer.class)
                        || IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Float.class)
                        || IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IntegrationAccountPrivateActionRunnerAuthResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(IntegrationAccountPrivateActionRunnerAuthResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IntegrationAccountPrivateActionRunnerAuthResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'IntegrationAccountPrivateActionRunnerAuthResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'IntegrationAccountPrivateActionRunnerAuthResponse'",
            e);
      }

      // deserialize DatabricksIntegrationAccountPatAuthResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabricksIntegrationAccountPatAuthResponse.class.equals(Integer.class)
            || DatabricksIntegrationAccountPatAuthResponse.class.equals(Long.class)
            || DatabricksIntegrationAccountPatAuthResponse.class.equals(Float.class)
            || DatabricksIntegrationAccountPatAuthResponse.class.equals(Double.class)
            || DatabricksIntegrationAccountPatAuthResponse.class.equals(Boolean.class)
            || DatabricksIntegrationAccountPatAuthResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabricksIntegrationAccountPatAuthResponse.class.equals(Integer.class)
                        || DatabricksIntegrationAccountPatAuthResponse.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabricksIntegrationAccountPatAuthResponse.class.equals(Float.class)
                        || DatabricksIntegrationAccountPatAuthResponse.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabricksIntegrationAccountPatAuthResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabricksIntegrationAccountPatAuthResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DatabricksIntegrationAccountPatAuthResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabricksIntegrationAccountPatAuthResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DatabricksIntegrationAccountPatAuthResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DatabricksIntegrationAccountPatAuthResponse'",
            e);
      }

      DatabricksIntegrationAccountAuthenticationResponse ret =
          new DatabricksIntegrationAccountAuthenticationResponse();
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
    public DatabricksIntegrationAccountAuthenticationResponse getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DatabricksIntegrationAccountAuthenticationResponse cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DatabricksIntegrationAccountAuthenticationResponse() {
    super("oneOf", Boolean.FALSE);
  }

  public DatabricksIntegrationAccountAuthenticationResponse(
      DatabricksIntegrationAccountOAuthAuthResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatabricksIntegrationAccountAuthenticationResponse(
      IntegrationAccountPrivateActionRunnerAuthResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatabricksIntegrationAccountAuthenticationResponse(
      DatabricksIntegrationAccountPatAuthResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DatabricksIntegrationAccountOAuthAuthResponse",
        new GenericType<DatabricksIntegrationAccountOAuthAuthResponse>() {});
    schemas.put(
        "IntegrationAccountPrivateActionRunnerAuthResponse",
        new GenericType<IntegrationAccountPrivateActionRunnerAuthResponse>() {});
    schemas.put(
        "DatabricksIntegrationAccountPatAuthResponse",
        new GenericType<DatabricksIntegrationAccountPatAuthResponse>() {});
    JSON.registerDescendants(
        DatabricksIntegrationAccountAuthenticationResponse.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DatabricksIntegrationAccountAuthenticationResponse.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DatabricksIntegrationAccountOAuthAuthResponse,
   * IntegrationAccountPrivateActionRunnerAuthResponse, DatabricksIntegrationAccountPatAuthResponse
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DatabricksIntegrationAccountOAuthAuthResponse.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        IntegrationAccountPrivateActionRunnerAuthResponse.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DatabricksIntegrationAccountPatAuthResponse.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DatabricksIntegrationAccountOAuthAuthResponse,"
            + " IntegrationAccountPrivateActionRunnerAuthResponse,"
            + " DatabricksIntegrationAccountPatAuthResponse");
  }

  /**
   * Get the actual instance, which can be the following:
   * DatabricksIntegrationAccountOAuthAuthResponse,
   * IntegrationAccountPrivateActionRunnerAuthResponse, DatabricksIntegrationAccountPatAuthResponse
   *
   * @return The actual instance (DatabricksIntegrationAccountOAuthAuthResponse,
   *     IntegrationAccountPrivateActionRunnerAuthResponse,
   *     DatabricksIntegrationAccountPatAuthResponse)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabricksIntegrationAccountOAuthAuthResponse`. If the actual
   * instance is not `DatabricksIntegrationAccountOAuthAuthResponse`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `DatabricksIntegrationAccountOAuthAuthResponse`
   * @throws ClassCastException if the instance is not
   *     `DatabricksIntegrationAccountOAuthAuthResponse`
   */
  public DatabricksIntegrationAccountOAuthAuthResponse
      getDatabricksIntegrationAccountOAuthAuthResponse() throws ClassCastException {
    return (DatabricksIntegrationAccountOAuthAuthResponse) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IntegrationAccountPrivateActionRunnerAuthResponse`. If the actual
   * instance is not `IntegrationAccountPrivateActionRunnerAuthResponse`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `IntegrationAccountPrivateActionRunnerAuthResponse`
   * @throws ClassCastException if the instance is not
   *     `IntegrationAccountPrivateActionRunnerAuthResponse`
   */
  public IntegrationAccountPrivateActionRunnerAuthResponse
      getIntegrationAccountPrivateActionRunnerAuthResponse() throws ClassCastException {
    return (IntegrationAccountPrivateActionRunnerAuthResponse) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabricksIntegrationAccountPatAuthResponse`. If the actual
   * instance is not `DatabricksIntegrationAccountPatAuthResponse`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `DatabricksIntegrationAccountPatAuthResponse`
   * @throws ClassCastException if the instance is not `DatabricksIntegrationAccountPatAuthResponse`
   */
  public DatabricksIntegrationAccountPatAuthResponse
      getDatabricksIntegrationAccountPatAuthResponse() throws ClassCastException {
    return (DatabricksIntegrationAccountPatAuthResponse) super.getActualInstance();
  }
}
