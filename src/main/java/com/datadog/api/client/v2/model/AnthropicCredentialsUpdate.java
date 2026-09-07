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
@JsonDeserialize(using = AnthropicCredentialsUpdate.AnthropicCredentialsUpdateDeserializer.class)
@JsonSerialize(using = AnthropicCredentialsUpdate.AnthropicCredentialsUpdateSerializer.class)
public class AnthropicCredentialsUpdate extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AnthropicCredentialsUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AnthropicCredentialsUpdateSerializer
      extends StdSerializer<AnthropicCredentialsUpdate> {
    public AnthropicCredentialsUpdateSerializer(Class<AnthropicCredentialsUpdate> t) {
      super(t);
    }

    public AnthropicCredentialsUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AnthropicCredentialsUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AnthropicCredentialsUpdateDeserializer
      extends StdDeserializer<AnthropicCredentialsUpdate> {
    public AnthropicCredentialsUpdateDeserializer() {
      this(AnthropicCredentialsUpdate.class);
    }

    public AnthropicCredentialsUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AnthropicCredentialsUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AnthropicAPIKeyUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AnthropicAPIKeyUpdate.class.equals(Integer.class)
            || AnthropicAPIKeyUpdate.class.equals(Long.class)
            || AnthropicAPIKeyUpdate.class.equals(Float.class)
            || AnthropicAPIKeyUpdate.class.equals(Double.class)
            || AnthropicAPIKeyUpdate.class.equals(Boolean.class)
            || AnthropicAPIKeyUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AnthropicAPIKeyUpdate.class.equals(Integer.class)
                        || AnthropicAPIKeyUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AnthropicAPIKeyUpdate.class.equals(Float.class)
                        || AnthropicAPIKeyUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AnthropicAPIKeyUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AnthropicAPIKeyUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AnthropicAPIKeyUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AnthropicAPIKeyUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AnthropicAPIKeyUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AnthropicAPIKeyUpdate'", e);
      }

      AnthropicCredentialsUpdate ret = new AnthropicCredentialsUpdate();
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
    public AnthropicCredentialsUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "AnthropicCredentialsUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AnthropicCredentialsUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public AnthropicCredentialsUpdate(AnthropicAPIKeyUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AnthropicAPIKeyUpdate", new GenericType<AnthropicAPIKeyUpdate>() {});
    JSON.registerDescendants(
        AnthropicCredentialsUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AnthropicCredentialsUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AnthropicAPIKeyUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AnthropicAPIKeyUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be AnthropicAPIKeyUpdate");
  }

  /**
   * Get the actual instance, which can be the following: AnthropicAPIKeyUpdate
   *
   * @return The actual instance (AnthropicAPIKeyUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AnthropicAPIKeyUpdate`. If the actual instance is not
   * `AnthropicAPIKeyUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AnthropicAPIKeyUpdate`
   * @throws ClassCastException if the instance is not `AnthropicAPIKeyUpdate`
   */
  public AnthropicAPIKeyUpdate getAnthropicAPIKeyUpdate() throws ClassCastException {
    return (AnthropicAPIKeyUpdate) super.getActualInstance();
  }
}
