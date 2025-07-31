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
@JsonDeserialize(using = CloudflareCredentials.CloudflareCredentialsDeserializer.class)
@JsonSerialize(using = CloudflareCredentials.CloudflareCredentialsSerializer.class)
public class CloudflareCredentials extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CloudflareCredentials.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CloudflareCredentialsSerializer extends StdSerializer<CloudflareCredentials> {
    public CloudflareCredentialsSerializer(Class<CloudflareCredentials> t) {
      super(t);
    }

    public CloudflareCredentialsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CloudflareCredentials value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CloudflareCredentialsDeserializer
      extends StdDeserializer<CloudflareCredentials> {
    public CloudflareCredentialsDeserializer() {
      this(CloudflareCredentials.class);
    }

    public CloudflareCredentialsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CloudflareCredentials deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CloudflareAPIToken
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CloudflareAPIToken.class.equals(Integer.class)
            || CloudflareAPIToken.class.equals(Long.class)
            || CloudflareAPIToken.class.equals(Float.class)
            || CloudflareAPIToken.class.equals(Double.class)
            || CloudflareAPIToken.class.equals(Boolean.class)
            || CloudflareAPIToken.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CloudflareAPIToken.class.equals(Integer.class)
                        || CloudflareAPIToken.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CloudflareAPIToken.class.equals(Float.class)
                        || CloudflareAPIToken.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CloudflareAPIToken.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CloudflareAPIToken.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CloudflareAPIToken.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CloudflareAPIToken) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CloudflareAPIToken'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CloudflareAPIToken'", e);
      }

      // deserialize CloudflareGlobalAPIToken
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CloudflareGlobalAPIToken.class.equals(Integer.class)
            || CloudflareGlobalAPIToken.class.equals(Long.class)
            || CloudflareGlobalAPIToken.class.equals(Float.class)
            || CloudflareGlobalAPIToken.class.equals(Double.class)
            || CloudflareGlobalAPIToken.class.equals(Boolean.class)
            || CloudflareGlobalAPIToken.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CloudflareGlobalAPIToken.class.equals(Integer.class)
                        || CloudflareGlobalAPIToken.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CloudflareGlobalAPIToken.class.equals(Float.class)
                        || CloudflareGlobalAPIToken.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CloudflareGlobalAPIToken.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CloudflareGlobalAPIToken.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CloudflareGlobalAPIToken.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CloudflareGlobalAPIToken) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CloudflareGlobalAPIToken'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CloudflareGlobalAPIToken'", e);
      }

      CloudflareCredentials ret = new CloudflareCredentials();
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
    public CloudflareCredentials getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CloudflareCredentials cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CloudflareCredentials() {
    super("oneOf", Boolean.FALSE);
  }

  public CloudflareCredentials(CloudflareAPIToken o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CloudflareCredentials(CloudflareGlobalAPIToken o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("CloudflareAPIToken", new GenericType<CloudflareAPIToken>() {});
    schemas.put("CloudflareGlobalAPIToken", new GenericType<CloudflareGlobalAPIToken>() {});
    JSON.registerDescendants(CloudflareCredentials.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CloudflareCredentials.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CloudflareAPIToken, CloudflareGlobalAPIToken
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CloudflareAPIToken.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CloudflareGlobalAPIToken.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CloudflareAPIToken, CloudflareGlobalAPIToken");
  }

  /**
   * Get the actual instance, which can be the following: CloudflareAPIToken,
   * CloudflareGlobalAPIToken
   *
   * @return The actual instance (CloudflareAPIToken, CloudflareGlobalAPIToken)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CloudflareAPIToken`. If the actual instance is not
   * `CloudflareAPIToken`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CloudflareAPIToken`
   * @throws ClassCastException if the instance is not `CloudflareAPIToken`
   */
  public CloudflareAPIToken getCloudflareAPIToken() throws ClassCastException {
    return (CloudflareAPIToken) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CloudflareGlobalAPIToken`. If the actual instance is not
   * `CloudflareGlobalAPIToken`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CloudflareGlobalAPIToken`
   * @throws ClassCastException if the instance is not `CloudflareGlobalAPIToken`
   */
  public CloudflareGlobalAPIToken getCloudflareGlobalAPIToken() throws ClassCastException {
    return (CloudflareGlobalAPIToken) super.getActualInstance();
  }
}
