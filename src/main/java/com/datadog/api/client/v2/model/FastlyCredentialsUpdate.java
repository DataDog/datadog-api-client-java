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
@JsonDeserialize(using = FastlyCredentialsUpdate.FastlyCredentialsUpdateDeserializer.class)
@JsonSerialize(using = FastlyCredentialsUpdate.FastlyCredentialsUpdateSerializer.class)
public class FastlyCredentialsUpdate extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(FastlyCredentialsUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class FastlyCredentialsUpdateSerializer
      extends StdSerializer<FastlyCredentialsUpdate> {
    public FastlyCredentialsUpdateSerializer(Class<FastlyCredentialsUpdate> t) {
      super(t);
    }

    public FastlyCredentialsUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FastlyCredentialsUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class FastlyCredentialsUpdateDeserializer
      extends StdDeserializer<FastlyCredentialsUpdate> {
    public FastlyCredentialsUpdateDeserializer() {
      this(FastlyCredentialsUpdate.class);
    }

    public FastlyCredentialsUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public FastlyCredentialsUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FastlyAPIKeyUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FastlyAPIKeyUpdate.class.equals(Integer.class)
            || FastlyAPIKeyUpdate.class.equals(Long.class)
            || FastlyAPIKeyUpdate.class.equals(Float.class)
            || FastlyAPIKeyUpdate.class.equals(Double.class)
            || FastlyAPIKeyUpdate.class.equals(Boolean.class)
            || FastlyAPIKeyUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FastlyAPIKeyUpdate.class.equals(Integer.class)
                        || FastlyAPIKeyUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FastlyAPIKeyUpdate.class.equals(Float.class)
                        || FastlyAPIKeyUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FastlyAPIKeyUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FastlyAPIKeyUpdate.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FastlyAPIKeyUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FastlyAPIKeyUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FastlyAPIKeyUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FastlyAPIKeyUpdate'", e);
      }

      FastlyCredentialsUpdate ret = new FastlyCredentialsUpdate();
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
    public FastlyCredentialsUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "FastlyCredentialsUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public FastlyCredentialsUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public FastlyCredentialsUpdate(FastlyAPIKeyUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FastlyAPIKeyUpdate", new GenericType<FastlyAPIKeyUpdate>() {});
    JSON.registerDescendants(FastlyCredentialsUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return FastlyCredentialsUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FastlyAPIKeyUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(FastlyAPIKeyUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be FastlyAPIKeyUpdate");
  }

  /**
   * Get the actual instance, which can be the following: FastlyAPIKeyUpdate
   *
   * @return The actual instance (FastlyAPIKeyUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FastlyAPIKeyUpdate`. If the actual instance is not
   * `FastlyAPIKeyUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FastlyAPIKeyUpdate`
   * @throws ClassCastException if the instance is not `FastlyAPIKeyUpdate`
   */
  public FastlyAPIKeyUpdate getFastlyAPIKeyUpdate() throws ClassCastException {
    return (FastlyAPIKeyUpdate) super.getActualInstance();
  }
}
