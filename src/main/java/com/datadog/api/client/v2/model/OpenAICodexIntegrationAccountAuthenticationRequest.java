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
        OpenAICodexIntegrationAccountAuthenticationRequest
            .OpenAICodexIntegrationAccountAuthenticationRequestDeserializer.class)
@JsonSerialize(
    using =
        OpenAICodexIntegrationAccountAuthenticationRequest
            .OpenAICodexIntegrationAccountAuthenticationRequestSerializer.class)
public class OpenAICodexIntegrationAccountAuthenticationRequest extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(OpenAICodexIntegrationAccountAuthenticationRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class OpenAICodexIntegrationAccountAuthenticationRequestSerializer
      extends StdSerializer<OpenAICodexIntegrationAccountAuthenticationRequest> {
    public OpenAICodexIntegrationAccountAuthenticationRequestSerializer(
        Class<OpenAICodexIntegrationAccountAuthenticationRequest> t) {
      super(t);
    }

    public OpenAICodexIntegrationAccountAuthenticationRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OpenAICodexIntegrationAccountAuthenticationRequest value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class OpenAICodexIntegrationAccountAuthenticationRequestDeserializer
      extends StdDeserializer<OpenAICodexIntegrationAccountAuthenticationRequest> {
    public OpenAICodexIntegrationAccountAuthenticationRequestDeserializer() {
      this(OpenAICodexIntegrationAccountAuthenticationRequest.class);
    }

    public OpenAICodexIntegrationAccountAuthenticationRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public OpenAICodexIntegrationAccountAuthenticationRequest deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize OpenAICodexIntegrationAccountBearerTokenAuthRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Integer.class)
            || OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Long.class)
            || OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Float.class)
            || OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Double.class)
            || OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Boolean.class)
            || OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Integer.class)
                        || OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Float.class)
                        || OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (OpenAICodexIntegrationAccountBearerTokenAuthRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(OpenAICodexIntegrationAccountBearerTokenAuthRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((OpenAICodexIntegrationAccountBearerTokenAuthRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'OpenAICodexIntegrationAccountBearerTokenAuthRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'OpenAICodexIntegrationAccountBearerTokenAuthRequest'",
            e);
      }

      OpenAICodexIntegrationAccountAuthenticationRequest ret =
          new OpenAICodexIntegrationAccountAuthenticationRequest();
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
    public OpenAICodexIntegrationAccountAuthenticationRequest getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "OpenAICodexIntegrationAccountAuthenticationRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public OpenAICodexIntegrationAccountAuthenticationRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public OpenAICodexIntegrationAccountAuthenticationRequest(
      OpenAICodexIntegrationAccountBearerTokenAuthRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "OpenAICodexIntegrationAccountBearerTokenAuthRequest",
        new GenericType<OpenAICodexIntegrationAccountBearerTokenAuthRequest>() {});
    JSON.registerDescendants(
        OpenAICodexIntegrationAccountAuthenticationRequest.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return OpenAICodexIntegrationAccountAuthenticationRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: OpenAICodexIntegrationAccountBearerTokenAuthRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        OpenAICodexIntegrationAccountBearerTokenAuthRequest.class,
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
        "Invalid instance type. Must be OpenAICodexIntegrationAccountBearerTokenAuthRequest");
  }

  /**
   * Get the actual instance, which can be the following:
   * OpenAICodexIntegrationAccountBearerTokenAuthRequest
   *
   * @return The actual instance (OpenAICodexIntegrationAccountBearerTokenAuthRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `OpenAICodexIntegrationAccountBearerTokenAuthRequest`. If the actual
   * instance is not `OpenAICodexIntegrationAccountBearerTokenAuthRequest`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `OpenAICodexIntegrationAccountBearerTokenAuthRequest`
   * @throws ClassCastException if the instance is not
   *     `OpenAICodexIntegrationAccountBearerTokenAuthRequest`
   */
  public OpenAICodexIntegrationAccountBearerTokenAuthRequest
      getOpenAICodexIntegrationAccountBearerTokenAuthRequest() throws ClassCastException {
    return (OpenAICodexIntegrationAccountBearerTokenAuthRequest) super.getActualInstance();
  }
}
