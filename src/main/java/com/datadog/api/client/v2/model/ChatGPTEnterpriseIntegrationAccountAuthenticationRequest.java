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
        ChatGPTEnterpriseIntegrationAccountAuthenticationRequest
            .ChatGPTEnterpriseIntegrationAccountAuthenticationRequestDeserializer.class)
@JsonSerialize(
    using =
        ChatGPTEnterpriseIntegrationAccountAuthenticationRequest
            .ChatGPTEnterpriseIntegrationAccountAuthenticationRequestSerializer.class)
public class ChatGPTEnterpriseIntegrationAccountAuthenticationRequest
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ChatGPTEnterpriseIntegrationAccountAuthenticationRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ChatGPTEnterpriseIntegrationAccountAuthenticationRequestSerializer
      extends StdSerializer<ChatGPTEnterpriseIntegrationAccountAuthenticationRequest> {
    public ChatGPTEnterpriseIntegrationAccountAuthenticationRequestSerializer(
        Class<ChatGPTEnterpriseIntegrationAccountAuthenticationRequest> t) {
      super(t);
    }

    public ChatGPTEnterpriseIntegrationAccountAuthenticationRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChatGPTEnterpriseIntegrationAccountAuthenticationRequest value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ChatGPTEnterpriseIntegrationAccountAuthenticationRequestDeserializer
      extends StdDeserializer<ChatGPTEnterpriseIntegrationAccountAuthenticationRequest> {
    public ChatGPTEnterpriseIntegrationAccountAuthenticationRequestDeserializer() {
      this(ChatGPTEnterpriseIntegrationAccountAuthenticationRequest.class);
    }

    public ChatGPTEnterpriseIntegrationAccountAuthenticationRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ChatGPTEnterpriseIntegrationAccountAuthenticationRequest deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(Integer.class)
            || ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(Long.class)
            || ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(Float.class)
            || ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(Double.class)
            || ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(Boolean.class)
            || ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(
                            Integer.class)
                        || ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(
                            Float.class)
                        || ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest'",
            e);
      }

      ChatGPTEnterpriseIntegrationAccountAuthenticationRequest ret =
          new ChatGPTEnterpriseIntegrationAccountAuthenticationRequest();
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
    public ChatGPTEnterpriseIntegrationAccountAuthenticationRequest getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ChatGPTEnterpriseIntegrationAccountAuthenticationRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ChatGPTEnterpriseIntegrationAccountAuthenticationRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public ChatGPTEnterpriseIntegrationAccountAuthenticationRequest(
      ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest",
        new GenericType<ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest>() {});
    JSON.registerDescendants(
        ChatGPTEnterpriseIntegrationAccountAuthenticationRequest.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ChatGPTEnterpriseIntegrationAccountAuthenticationRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest.class,
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
        "Invalid instance type. Must be ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest");
  }

  /**
   * Get the actual instance, which can be the following:
   * ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest
   *
   * @return The actual instance (ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest`. If the
   * actual instance is not `ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest`
   * @throws ClassCastException if the instance is not
   *     `ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest`
   */
  public ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest
      getChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest() throws ClassCastException {
    return (ChatGPTEnterpriseIntegrationAccountBearerTokenAuthRequest) super.getActualInstance();
  }
}
