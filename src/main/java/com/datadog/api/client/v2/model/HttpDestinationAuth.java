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
@JsonDeserialize(using = HttpDestinationAuth.HttpDestinationAuthDeserializer.class)
@JsonSerialize(using = HttpDestinationAuth.HttpDestinationAuthSerializer.class)
public class HttpDestinationAuth extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(HttpDestinationAuth.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HttpDestinationAuthSerializer extends StdSerializer<HttpDestinationAuth> {
    public HttpDestinationAuthSerializer(Class<HttpDestinationAuth> t) {
      super(t);
    }

    public HttpDestinationAuthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HttpDestinationAuth value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HttpDestinationAuthDeserializer extends StdDeserializer<HttpDestinationAuth> {
    public HttpDestinationAuthDeserializer() {
      this(HttpDestinationAuth.class);
    }

    public HttpDestinationAuthDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HttpDestinationAuth deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize HttpDestinationBasicAuth
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HttpDestinationBasicAuth.class.equals(Integer.class)
            || HttpDestinationBasicAuth.class.equals(Long.class)
            || HttpDestinationBasicAuth.class.equals(Float.class)
            || HttpDestinationBasicAuth.class.equals(Double.class)
            || HttpDestinationBasicAuth.class.equals(Boolean.class)
            || HttpDestinationBasicAuth.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HttpDestinationBasicAuth.class.equals(Integer.class)
                        || HttpDestinationBasicAuth.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HttpDestinationBasicAuth.class.equals(Float.class)
                        || HttpDestinationBasicAuth.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HttpDestinationBasicAuth.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HttpDestinationBasicAuth.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HttpDestinationBasicAuth.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HttpDestinationBasicAuth) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HttpDestinationBasicAuth'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HttpDestinationBasicAuth'", e);
      }

      // deserialize HttpDestinationCustomHeaderAuth
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HttpDestinationCustomHeaderAuth.class.equals(Integer.class)
            || HttpDestinationCustomHeaderAuth.class.equals(Long.class)
            || HttpDestinationCustomHeaderAuth.class.equals(Float.class)
            || HttpDestinationCustomHeaderAuth.class.equals(Double.class)
            || HttpDestinationCustomHeaderAuth.class.equals(Boolean.class)
            || HttpDestinationCustomHeaderAuth.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HttpDestinationCustomHeaderAuth.class.equals(Integer.class)
                        || HttpDestinationCustomHeaderAuth.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HttpDestinationCustomHeaderAuth.class.equals(Float.class)
                        || HttpDestinationCustomHeaderAuth.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HttpDestinationCustomHeaderAuth.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HttpDestinationCustomHeaderAuth.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HttpDestinationCustomHeaderAuth.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HttpDestinationCustomHeaderAuth) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HttpDestinationCustomHeaderAuth'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'HttpDestinationCustomHeaderAuth'", e);
      }

      HttpDestinationAuth ret = new HttpDestinationAuth();
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
    public HttpDestinationAuth getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "HttpDestinationAuth cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HttpDestinationAuth() {
    super("oneOf", Boolean.FALSE);
  }

  public HttpDestinationAuth(HttpDestinationBasicAuth o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HttpDestinationAuth(HttpDestinationCustomHeaderAuth o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("HttpDestinationBasicAuth", new GenericType<HttpDestinationBasicAuth>() {});
    schemas.put(
        "HttpDestinationCustomHeaderAuth", new GenericType<HttpDestinationCustomHeaderAuth>() {});
    JSON.registerDescendants(HttpDestinationAuth.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HttpDestinationAuth.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HttpDestinationBasicAuth, HttpDestinationCustomHeaderAuth
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(HttpDestinationBasicAuth.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HttpDestinationCustomHeaderAuth.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HttpDestinationBasicAuth, HttpDestinationCustomHeaderAuth");
  }

  /**
   * Get the actual instance, which can be the following: HttpDestinationBasicAuth,
   * HttpDestinationCustomHeaderAuth
   *
   * @return The actual instance (HttpDestinationBasicAuth, HttpDestinationCustomHeaderAuth)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HttpDestinationBasicAuth`. If the actual instance is not
   * `HttpDestinationBasicAuth`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HttpDestinationBasicAuth`
   * @throws ClassCastException if the instance is not `HttpDestinationBasicAuth`
   */
  public HttpDestinationBasicAuth getHttpDestinationBasicAuth() throws ClassCastException {
    return (HttpDestinationBasicAuth) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HttpDestinationCustomHeaderAuth`. If the actual instance is not
   * `HttpDestinationCustomHeaderAuth`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HttpDestinationCustomHeaderAuth`
   * @throws ClassCastException if the instance is not `HttpDestinationCustomHeaderAuth`
   */
  public HttpDestinationCustomHeaderAuth getHttpDestinationCustomHeaderAuth()
      throws ClassCastException {
    return (HttpDestinationCustomHeaderAuth) super.getActualInstance();
  }
}
