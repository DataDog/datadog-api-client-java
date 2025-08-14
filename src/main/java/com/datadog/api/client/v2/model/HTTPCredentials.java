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
@JsonDeserialize(using = HTTPCredentials.HTTPCredentialsDeserializer.class)
@JsonSerialize(using = HTTPCredentials.HTTPCredentialsSerializer.class)
public class HTTPCredentials extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(HTTPCredentials.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HTTPCredentialsSerializer extends StdSerializer<HTTPCredentials> {
    public HTTPCredentialsSerializer(Class<HTTPCredentials> t) {
      super(t);
    }

    public HTTPCredentialsSerializer() {
      this(null);
    }

    @Override
    public void serialize(HTTPCredentials value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HTTPCredentialsDeserializer extends StdDeserializer<HTTPCredentials> {
    public HTTPCredentialsDeserializer() {
      this(HTTPCredentials.class);
    }

    public HTTPCredentialsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HTTPCredentials deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize HTTPTokenAuth
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HTTPTokenAuth.class.equals(Integer.class)
            || HTTPTokenAuth.class.equals(Long.class)
            || HTTPTokenAuth.class.equals(Float.class)
            || HTTPTokenAuth.class.equals(Double.class)
            || HTTPTokenAuth.class.equals(Boolean.class)
            || HTTPTokenAuth.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HTTPTokenAuth.class.equals(Integer.class)
                        || HTTPTokenAuth.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HTTPTokenAuth.class.equals(Float.class)
                        || HTTPTokenAuth.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HTTPTokenAuth.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HTTPTokenAuth.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HTTPTokenAuth.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HTTPTokenAuth) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HTTPTokenAuth'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HTTPTokenAuth'", e);
      }

      // deserialize HTTPBasicAuth
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HTTPBasicAuth.class.equals(Integer.class)
            || HTTPBasicAuth.class.equals(Long.class)
            || HTTPBasicAuth.class.equals(Float.class)
            || HTTPBasicAuth.class.equals(Double.class)
            || HTTPBasicAuth.class.equals(Boolean.class)
            || HTTPBasicAuth.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HTTPBasicAuth.class.equals(Integer.class)
                        || HTTPBasicAuth.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HTTPBasicAuth.class.equals(Float.class)
                        || HTTPBasicAuth.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HTTPBasicAuth.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HTTPBasicAuth.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HTTPBasicAuth.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HTTPBasicAuth) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HTTPBasicAuth'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HTTPBasicAuth'", e);
      }

      // deserialize HTTPMtlsAuth
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HTTPMtlsAuth.class.equals(Integer.class)
            || HTTPMtlsAuth.class.equals(Long.class)
            || HTTPMtlsAuth.class.equals(Float.class)
            || HTTPMtlsAuth.class.equals(Double.class)
            || HTTPMtlsAuth.class.equals(Boolean.class)
            || HTTPMtlsAuth.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HTTPMtlsAuth.class.equals(Integer.class) || HTTPMtlsAuth.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HTTPMtlsAuth.class.equals(Float.class) || HTTPMtlsAuth.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HTTPMtlsAuth.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HTTPMtlsAuth.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HTTPMtlsAuth.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HTTPMtlsAuth) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HTTPMtlsAuth'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HTTPMtlsAuth'", e);
      }

      HTTPCredentials ret = new HTTPCredentials();
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
    public HTTPCredentials getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "HTTPCredentials cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HTTPCredentials() {
    super("oneOf", Boolean.FALSE);
  }

  public HTTPCredentials(HTTPTokenAuth o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HTTPCredentials(HTTPBasicAuth o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HTTPCredentials(HTTPMtlsAuth o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("HTTPTokenAuth", new GenericType<HTTPTokenAuth>() {});
    schemas.put("HTTPBasicAuth", new GenericType<HTTPBasicAuth>() {});
    schemas.put("HTTPMtlsAuth", new GenericType<HTTPMtlsAuth>() {});
    JSON.registerDescendants(HTTPCredentials.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HTTPCredentials.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HTTPTokenAuth, HTTPBasicAuth, HTTPMtlsAuth
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(HTTPTokenAuth.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HTTPBasicAuth.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HTTPMtlsAuth.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HTTPTokenAuth, HTTPBasicAuth, HTTPMtlsAuth");
  }

  /**
   * Get the actual instance, which can be the following: HTTPTokenAuth, HTTPBasicAuth, HTTPMtlsAuth
   *
   * @return The actual instance (HTTPTokenAuth, HTTPBasicAuth, HTTPMtlsAuth)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HTTPTokenAuth`. If the actual instance is not `HTTPTokenAuth`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `HTTPTokenAuth`
   * @throws ClassCastException if the instance is not `HTTPTokenAuth`
   */
  public HTTPTokenAuth getHTTPTokenAuth() throws ClassCastException {
    return (HTTPTokenAuth) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HTTPBasicAuth`. If the actual instance is not `HTTPBasicAuth`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `HTTPBasicAuth`
   * @throws ClassCastException if the instance is not `HTTPBasicAuth`
   */
  public HTTPBasicAuth getHTTPBasicAuth() throws ClassCastException {
    return (HTTPBasicAuth) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HTTPMtlsAuth`. If the actual instance is not `HTTPMtlsAuth`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `HTTPMtlsAuth`
   * @throws ClassCastException if the instance is not `HTTPMtlsAuth`
   */
  public HTTPMtlsAuth getHTTPMtlsAuth() throws ClassCastException {
    return (HTTPMtlsAuth) super.getActualInstance();
  }
}
