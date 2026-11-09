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
@JsonDeserialize(using = GithubCredentialsUpdate.GithubCredentialsUpdateDeserializer.class)
@JsonSerialize(using = GithubCredentialsUpdate.GithubCredentialsUpdateSerializer.class)
public class GithubCredentialsUpdate extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GithubCredentialsUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GithubCredentialsUpdateSerializer
      extends StdSerializer<GithubCredentialsUpdate> {
    public GithubCredentialsUpdateSerializer(Class<GithubCredentialsUpdate> t) {
      super(t);
    }

    public GithubCredentialsUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GithubCredentialsUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GithubCredentialsUpdateDeserializer
      extends StdDeserializer<GithubCredentialsUpdate> {
    public GithubCredentialsUpdateDeserializer() {
      this(GithubCredentialsUpdate.class);
    }

    public GithubCredentialsUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GithubCredentialsUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GithubAppUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GithubAppUpdate.class.equals(Integer.class)
            || GithubAppUpdate.class.equals(Long.class)
            || GithubAppUpdate.class.equals(Float.class)
            || GithubAppUpdate.class.equals(Double.class)
            || GithubAppUpdate.class.equals(Boolean.class)
            || GithubAppUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GithubAppUpdate.class.equals(Integer.class)
                        || GithubAppUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GithubAppUpdate.class.equals(Float.class)
                        || GithubAppUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GithubAppUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GithubAppUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GithubAppUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GithubAppUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GithubAppUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GithubAppUpdate'", e);
      }

      // deserialize GithubPersonalAccessTokenUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GithubPersonalAccessTokenUpdate.class.equals(Integer.class)
            || GithubPersonalAccessTokenUpdate.class.equals(Long.class)
            || GithubPersonalAccessTokenUpdate.class.equals(Float.class)
            || GithubPersonalAccessTokenUpdate.class.equals(Double.class)
            || GithubPersonalAccessTokenUpdate.class.equals(Boolean.class)
            || GithubPersonalAccessTokenUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GithubPersonalAccessTokenUpdate.class.equals(Integer.class)
                        || GithubPersonalAccessTokenUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GithubPersonalAccessTokenUpdate.class.equals(Float.class)
                        || GithubPersonalAccessTokenUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GithubPersonalAccessTokenUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GithubPersonalAccessTokenUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GithubPersonalAccessTokenUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GithubPersonalAccessTokenUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GithubPersonalAccessTokenUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'GithubPersonalAccessTokenUpdate'", e);
      }

      GithubCredentialsUpdate ret = new GithubCredentialsUpdate();
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
    public GithubCredentialsUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GithubCredentialsUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GithubCredentialsUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public GithubCredentialsUpdate(GithubAppUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GithubCredentialsUpdate(GithubPersonalAccessTokenUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("GithubAppUpdate", new GenericType<GithubAppUpdate>() {});
    schemas.put(
        "GithubPersonalAccessTokenUpdate", new GenericType<GithubPersonalAccessTokenUpdate>() {});
    JSON.registerDescendants(GithubCredentialsUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GithubCredentialsUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GithubAppUpdate, GithubPersonalAccessTokenUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(GithubAppUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GithubPersonalAccessTokenUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be GithubAppUpdate, GithubPersonalAccessTokenUpdate");
  }

  /**
   * Get the actual instance, which can be the following: GithubAppUpdate,
   * GithubPersonalAccessTokenUpdate
   *
   * @return The actual instance (GithubAppUpdate, GithubPersonalAccessTokenUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GithubAppUpdate`. If the actual instance is not `GithubAppUpdate`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `GithubAppUpdate`
   * @throws ClassCastException if the instance is not `GithubAppUpdate`
   */
  public GithubAppUpdate getGithubAppUpdate() throws ClassCastException {
    return (GithubAppUpdate) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GithubPersonalAccessTokenUpdate`. If the actual instance is not
   * `GithubPersonalAccessTokenUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GithubPersonalAccessTokenUpdate`
   * @throws ClassCastException if the instance is not `GithubPersonalAccessTokenUpdate`
   */
  public GithubPersonalAccessTokenUpdate getGithubPersonalAccessTokenUpdate()
      throws ClassCastException {
    return (GithubPersonalAccessTokenUpdate) super.getActualInstance();
  }
}
