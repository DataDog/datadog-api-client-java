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
        OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate
            .OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateDeserializer.class)
@JsonSerialize(
    using =
        OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate
            .OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateSerializer.class)
public class OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateSerializer
      extends StdSerializer<OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate> {
    public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateSerializer(
        Class<OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate> t) {
      super(t);
    }

    public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateDeserializer
      extends StdDeserializer<OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate> {
    public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateDeserializer() {
      this(OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate.class);
    }

    public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(Integer.class)
            || OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(Long.class)
            || OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(Float.class)
            || OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                Double.class)
            || OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                Boolean.class)
            || OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Integer.class)
                        || OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Float.class)
                        || OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate'",
            e);
      }

      OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate ret =
          new OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate();
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
    public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate(
      OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate",
        new GenericType<OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate>() {});
    JSON.registerDescendants(
        OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate.class,
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
            + " OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate");
  }

  /**
   * Get the actual instance, which can be the following:
   * OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate
   *
   * @return The actual instance (OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate`. If
   * the actual instance is not `OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate`
   * @throws ClassCastException if the instance is not
   *     `OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate`
   */
  public OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate
      getOpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate() throws ClassCastException {
    return (OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate) super.getActualInstance();
  }
}
