/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
@JsonDeserialize(using = SyntheticsBasicAuth.SyntheticsBasicAuthDeserializer.class)
@JsonSerialize(using = SyntheticsBasicAuth.SyntheticsBasicAuthSerializer.class)
public class SyntheticsBasicAuth extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SyntheticsBasicAuth.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SyntheticsBasicAuthSerializer extends StdSerializer<SyntheticsBasicAuth> {
    public SyntheticsBasicAuthSerializer(Class<SyntheticsBasicAuth> t) {
      super(t);
    }

    public SyntheticsBasicAuthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBasicAuth value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SyntheticsBasicAuthDeserializer extends StdDeserializer<SyntheticsBasicAuth> {
    public SyntheticsBasicAuthDeserializer() {
      this(SyntheticsBasicAuth.class);
    }

    public SyntheticsBasicAuthDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SyntheticsBasicAuth deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SyntheticsBasicAuthWeb
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsBasicAuthWeb.class.equals(Integer.class)
            || SyntheticsBasicAuthWeb.class.equals(Long.class)
            || SyntheticsBasicAuthWeb.class.equals(Float.class)
            || SyntheticsBasicAuthWeb.class.equals(Double.class)
            || SyntheticsBasicAuthWeb.class.equals(Boolean.class)
            || SyntheticsBasicAuthWeb.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsBasicAuthWeb.class.equals(Integer.class)
                        || SyntheticsBasicAuthWeb.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsBasicAuthWeb.class.equals(Float.class)
                        || SyntheticsBasicAuthWeb.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsBasicAuthWeb.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsBasicAuthWeb.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsBasicAuthWeb.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsBasicAuthWeb) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsBasicAuthWeb'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsBasicAuthWeb'", e);
      }

      // deserialize SyntheticsBasicAuthSigv4
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsBasicAuthSigv4.class.equals(Integer.class)
            || SyntheticsBasicAuthSigv4.class.equals(Long.class)
            || SyntheticsBasicAuthSigv4.class.equals(Float.class)
            || SyntheticsBasicAuthSigv4.class.equals(Double.class)
            || SyntheticsBasicAuthSigv4.class.equals(Boolean.class)
            || SyntheticsBasicAuthSigv4.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsBasicAuthSigv4.class.equals(Integer.class)
                        || SyntheticsBasicAuthSigv4.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsBasicAuthSigv4.class.equals(Float.class)
                        || SyntheticsBasicAuthSigv4.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsBasicAuthSigv4.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsBasicAuthSigv4.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsBasicAuthSigv4.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsBasicAuthSigv4) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsBasicAuthSigv4'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsBasicAuthSigv4'", e);
      }

      // deserialize SyntheticsBasicAuthNTLM
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsBasicAuthNTLM.class.equals(Integer.class)
            || SyntheticsBasicAuthNTLM.class.equals(Long.class)
            || SyntheticsBasicAuthNTLM.class.equals(Float.class)
            || SyntheticsBasicAuthNTLM.class.equals(Double.class)
            || SyntheticsBasicAuthNTLM.class.equals(Boolean.class)
            || SyntheticsBasicAuthNTLM.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsBasicAuthNTLM.class.equals(Integer.class)
                        || SyntheticsBasicAuthNTLM.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsBasicAuthNTLM.class.equals(Float.class)
                        || SyntheticsBasicAuthNTLM.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsBasicAuthNTLM.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsBasicAuthNTLM.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsBasicAuthNTLM.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsBasicAuthNTLM) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsBasicAuthNTLM'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsBasicAuthNTLM'", e);
      }

      // deserialize SyntheticsBasicAuthDigest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsBasicAuthDigest.class.equals(Integer.class)
            || SyntheticsBasicAuthDigest.class.equals(Long.class)
            || SyntheticsBasicAuthDigest.class.equals(Float.class)
            || SyntheticsBasicAuthDigest.class.equals(Double.class)
            || SyntheticsBasicAuthDigest.class.equals(Boolean.class)
            || SyntheticsBasicAuthDigest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsBasicAuthDigest.class.equals(Integer.class)
                        || SyntheticsBasicAuthDigest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsBasicAuthDigest.class.equals(Float.class)
                        || SyntheticsBasicAuthDigest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsBasicAuthDigest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsBasicAuthDigest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsBasicAuthDigest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsBasicAuthDigest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsBasicAuthDigest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsBasicAuthDigest'", e);
      }

      // deserialize SyntheticsBasicAuthOauthClient
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsBasicAuthOauthClient.class.equals(Integer.class)
            || SyntheticsBasicAuthOauthClient.class.equals(Long.class)
            || SyntheticsBasicAuthOauthClient.class.equals(Float.class)
            || SyntheticsBasicAuthOauthClient.class.equals(Double.class)
            || SyntheticsBasicAuthOauthClient.class.equals(Boolean.class)
            || SyntheticsBasicAuthOauthClient.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsBasicAuthOauthClient.class.equals(Integer.class)
                        || SyntheticsBasicAuthOauthClient.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsBasicAuthOauthClient.class.equals(Float.class)
                        || SyntheticsBasicAuthOauthClient.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsBasicAuthOauthClient.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsBasicAuthOauthClient.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsBasicAuthOauthClient.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsBasicAuthOauthClient) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsBasicAuthOauthClient'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'SyntheticsBasicAuthOauthClient'", e);
      }

      // deserialize SyntheticsBasicAuthOauthROP
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsBasicAuthOauthROP.class.equals(Integer.class)
            || SyntheticsBasicAuthOauthROP.class.equals(Long.class)
            || SyntheticsBasicAuthOauthROP.class.equals(Float.class)
            || SyntheticsBasicAuthOauthROP.class.equals(Double.class)
            || SyntheticsBasicAuthOauthROP.class.equals(Boolean.class)
            || SyntheticsBasicAuthOauthROP.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsBasicAuthOauthROP.class.equals(Integer.class)
                        || SyntheticsBasicAuthOauthROP.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsBasicAuthOauthROP.class.equals(Float.class)
                        || SyntheticsBasicAuthOauthROP.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsBasicAuthOauthROP.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsBasicAuthOauthROP.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsBasicAuthOauthROP.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsBasicAuthOauthROP) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsBasicAuthOauthROP'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsBasicAuthOauthROP'", e);
      }

      SyntheticsBasicAuth ret = new SyntheticsBasicAuth();
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
    public SyntheticsBasicAuth getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SyntheticsBasicAuth cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SyntheticsBasicAuth() {
    super("oneOf", Boolean.FALSE);
  }

  public SyntheticsBasicAuth(SyntheticsBasicAuthWeb o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsBasicAuth(SyntheticsBasicAuthSigv4 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsBasicAuth(SyntheticsBasicAuthNTLM o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsBasicAuth(SyntheticsBasicAuthDigest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsBasicAuth(SyntheticsBasicAuthOauthClient o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsBasicAuth(SyntheticsBasicAuthOauthROP o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("SyntheticsBasicAuthWeb", new GenericType<SyntheticsBasicAuthWeb>() {});
    schemas.put("SyntheticsBasicAuthSigv4", new GenericType<SyntheticsBasicAuthSigv4>() {});
    schemas.put("SyntheticsBasicAuthNTLM", new GenericType<SyntheticsBasicAuthNTLM>() {});
    schemas.put("SyntheticsBasicAuthDigest", new GenericType<SyntheticsBasicAuthDigest>() {});
    schemas.put(
        "SyntheticsBasicAuthOauthClient", new GenericType<SyntheticsBasicAuthOauthClient>() {});
    schemas.put("SyntheticsBasicAuthOauthROP", new GenericType<SyntheticsBasicAuthOauthROP>() {});
    JSON.registerDescendants(SyntheticsBasicAuth.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SyntheticsBasicAuth.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SyntheticsBasicAuthWeb, SyntheticsBasicAuthSigv4,
   * SyntheticsBasicAuthNTLM, SyntheticsBasicAuthDigest, SyntheticsBasicAuthOauthClient,
   * SyntheticsBasicAuthOauthROP
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(SyntheticsBasicAuthWeb.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SyntheticsBasicAuthSigv4.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SyntheticsBasicAuthNTLM.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SyntheticsBasicAuthDigest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SyntheticsBasicAuthOauthClient.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SyntheticsBasicAuthOauthROP.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SyntheticsBasicAuthWeb, SyntheticsBasicAuthSigv4,"
            + " SyntheticsBasicAuthNTLM, SyntheticsBasicAuthDigest, SyntheticsBasicAuthOauthClient,"
            + " SyntheticsBasicAuthOauthROP");
  }

  /**
   * Get the actual instance, which can be the following: SyntheticsBasicAuthWeb,
   * SyntheticsBasicAuthSigv4, SyntheticsBasicAuthNTLM, SyntheticsBasicAuthDigest,
   * SyntheticsBasicAuthOauthClient, SyntheticsBasicAuthOauthROP
   *
   * @return The actual instance (SyntheticsBasicAuthWeb, SyntheticsBasicAuthSigv4,
   *     SyntheticsBasicAuthNTLM, SyntheticsBasicAuthDigest, SyntheticsBasicAuthOauthClient,
   *     SyntheticsBasicAuthOauthROP)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsBasicAuthWeb`. If the actual instance is not
   * `SyntheticsBasicAuthWeb`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsBasicAuthWeb`
   * @throws ClassCastException if the instance is not `SyntheticsBasicAuthWeb`
   */
  public SyntheticsBasicAuthWeb getSyntheticsBasicAuthWeb() throws ClassCastException {
    return (SyntheticsBasicAuthWeb) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsBasicAuthSigv4`. If the actual instance is not
   * `SyntheticsBasicAuthSigv4`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsBasicAuthSigv4`
   * @throws ClassCastException if the instance is not `SyntheticsBasicAuthSigv4`
   */
  public SyntheticsBasicAuthSigv4 getSyntheticsBasicAuthSigv4() throws ClassCastException {
    return (SyntheticsBasicAuthSigv4) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsBasicAuthNTLM`. If the actual instance is not
   * `SyntheticsBasicAuthNTLM`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsBasicAuthNTLM`
   * @throws ClassCastException if the instance is not `SyntheticsBasicAuthNTLM`
   */
  public SyntheticsBasicAuthNTLM getSyntheticsBasicAuthNTLM() throws ClassCastException {
    return (SyntheticsBasicAuthNTLM) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsBasicAuthDigest`. If the actual instance is not
   * `SyntheticsBasicAuthDigest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsBasicAuthDigest`
   * @throws ClassCastException if the instance is not `SyntheticsBasicAuthDigest`
   */
  public SyntheticsBasicAuthDigest getSyntheticsBasicAuthDigest() throws ClassCastException {
    return (SyntheticsBasicAuthDigest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsBasicAuthOauthClient`. If the actual instance is not
   * `SyntheticsBasicAuthOauthClient`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsBasicAuthOauthClient`
   * @throws ClassCastException if the instance is not `SyntheticsBasicAuthOauthClient`
   */
  public SyntheticsBasicAuthOauthClient getSyntheticsBasicAuthOauthClient()
      throws ClassCastException {
    return (SyntheticsBasicAuthOauthClient) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsBasicAuthOauthROP`. If the actual instance is not
   * `SyntheticsBasicAuthOauthROP`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsBasicAuthOauthROP`
   * @throws ClassCastException if the instance is not `SyntheticsBasicAuthOauthROP`
   */
  public SyntheticsBasicAuthOauthROP getSyntheticsBasicAuthOauthROP() throws ClassCastException {
    return (SyntheticsBasicAuthOauthROP) super.getActualInstance();
  }
}
