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
@JsonDeserialize(using = GitlabCredentialsUpdate.GitlabCredentialsUpdateDeserializer.class)
@JsonSerialize(using = GitlabCredentialsUpdate.GitlabCredentialsUpdateSerializer.class)
public class GitlabCredentialsUpdate extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GitlabCredentialsUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GitlabCredentialsUpdateSerializer
      extends StdSerializer<GitlabCredentialsUpdate> {
    public GitlabCredentialsUpdateSerializer(Class<GitlabCredentialsUpdate> t) {
      super(t);
    }

    public GitlabCredentialsUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GitlabCredentialsUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GitlabCredentialsUpdateDeserializer
      extends StdDeserializer<GitlabCredentialsUpdate> {
    public GitlabCredentialsUpdateDeserializer() {
      this(GitlabCredentialsUpdate.class);
    }

    public GitlabCredentialsUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GitlabCredentialsUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GitlabAPIKeyUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GitlabAPIKeyUpdate.class.equals(Integer.class)
            || GitlabAPIKeyUpdate.class.equals(Long.class)
            || GitlabAPIKeyUpdate.class.equals(Float.class)
            || GitlabAPIKeyUpdate.class.equals(Double.class)
            || GitlabAPIKeyUpdate.class.equals(Boolean.class)
            || GitlabAPIKeyUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GitlabAPIKeyUpdate.class.equals(Integer.class)
                        || GitlabAPIKeyUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GitlabAPIKeyUpdate.class.equals(Float.class)
                        || GitlabAPIKeyUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GitlabAPIKeyUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GitlabAPIKeyUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GitlabAPIKeyUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GitlabAPIKeyUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GitlabAPIKeyUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GitlabAPIKeyUpdate'", e);
      }

      GitlabCredentialsUpdate ret = new GitlabCredentialsUpdate();
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
    public GitlabCredentialsUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GitlabCredentialsUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GitlabCredentialsUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public GitlabCredentialsUpdate(GitlabAPIKeyUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("GitlabAPIKeyUpdate", new GenericType<GitlabAPIKeyUpdate>() {});
    JSON.registerDescendants(GitlabCredentialsUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GitlabCredentialsUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GitlabAPIKeyUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(GitlabAPIKeyUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be GitlabAPIKeyUpdate");
  }

  /**
   * Get the actual instance, which can be the following: GitlabAPIKeyUpdate
   *
   * @return The actual instance (GitlabAPIKeyUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GitlabAPIKeyUpdate`. If the actual instance is not
   * `GitlabAPIKeyUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GitlabAPIKeyUpdate`
   * @throws ClassCastException if the instance is not `GitlabAPIKeyUpdate`
   */
  public GitlabAPIKeyUpdate getGitlabAPIKeyUpdate() throws ClassCastException {
    return (GitlabAPIKeyUpdate) super.getActualInstance();
  }
}
