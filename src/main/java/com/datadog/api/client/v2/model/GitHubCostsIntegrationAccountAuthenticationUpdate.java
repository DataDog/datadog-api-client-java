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
        GitHubCostsIntegrationAccountAuthenticationUpdate
            .GitHubCostsIntegrationAccountAuthenticationUpdateDeserializer.class)
@JsonSerialize(
    using =
        GitHubCostsIntegrationAccountAuthenticationUpdate
            .GitHubCostsIntegrationAccountAuthenticationUpdateSerializer.class)
public class GitHubCostsIntegrationAccountAuthenticationUpdate extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(GitHubCostsIntegrationAccountAuthenticationUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GitHubCostsIntegrationAccountAuthenticationUpdateSerializer
      extends StdSerializer<GitHubCostsIntegrationAccountAuthenticationUpdate> {
    public GitHubCostsIntegrationAccountAuthenticationUpdateSerializer(
        Class<GitHubCostsIntegrationAccountAuthenticationUpdate> t) {
      super(t);
    }

    public GitHubCostsIntegrationAccountAuthenticationUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GitHubCostsIntegrationAccountAuthenticationUpdate value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GitHubCostsIntegrationAccountAuthenticationUpdateDeserializer
      extends StdDeserializer<GitHubCostsIntegrationAccountAuthenticationUpdate> {
    public GitHubCostsIntegrationAccountAuthenticationUpdateDeserializer() {
      this(GitHubCostsIntegrationAccountAuthenticationUpdate.class);
    }

    public GitHubCostsIntegrationAccountAuthenticationUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GitHubCostsIntegrationAccountAuthenticationUpdate deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GitHubCostsIntegrationAccountBearerTokenAuthUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Integer.class)
            || GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Long.class)
            || GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Float.class)
            || GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Double.class)
            || GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Boolean.class)
            || GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Integer.class)
                        || GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Float.class)
                        || GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GitHubCostsIntegrationAccountBearerTokenAuthUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GitHubCostsIntegrationAccountBearerTokenAuthUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GitHubCostsIntegrationAccountBearerTokenAuthUpdate'",
            e);
      }

      GitHubCostsIntegrationAccountAuthenticationUpdate ret =
          new GitHubCostsIntegrationAccountAuthenticationUpdate();
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
    public GitHubCostsIntegrationAccountAuthenticationUpdate getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "GitHubCostsIntegrationAccountAuthenticationUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GitHubCostsIntegrationAccountAuthenticationUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public GitHubCostsIntegrationAccountAuthenticationUpdate(
      GitHubCostsIntegrationAccountBearerTokenAuthUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "GitHubCostsIntegrationAccountBearerTokenAuthUpdate",
        new GenericType<GitHubCostsIntegrationAccountBearerTokenAuthUpdate>() {});
    JSON.registerDescendants(
        GitHubCostsIntegrationAccountAuthenticationUpdate.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GitHubCostsIntegrationAccountAuthenticationUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GitHubCostsIntegrationAccountBearerTokenAuthUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        GitHubCostsIntegrationAccountBearerTokenAuthUpdate.class,
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
        "Invalid instance type. Must be GitHubCostsIntegrationAccountBearerTokenAuthUpdate");
  }

  /**
   * Get the actual instance, which can be the following:
   * GitHubCostsIntegrationAccountBearerTokenAuthUpdate
   *
   * @return The actual instance (GitHubCostsIntegrationAccountBearerTokenAuthUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GitHubCostsIntegrationAccountBearerTokenAuthUpdate`. If the actual
   * instance is not `GitHubCostsIntegrationAccountBearerTokenAuthUpdate`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GitHubCostsIntegrationAccountBearerTokenAuthUpdate`
   * @throws ClassCastException if the instance is not
   *     `GitHubCostsIntegrationAccountBearerTokenAuthUpdate`
   */
  public GitHubCostsIntegrationAccountBearerTokenAuthUpdate
      getGitHubCostsIntegrationAccountBearerTokenAuthUpdate() throws ClassCastException {
    return (GitHubCostsIntegrationAccountBearerTokenAuthUpdate) super.getActualInstance();
  }
}
