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
@JsonDeserialize(using = AuthNMappingIncluded.AuthNMappingIncludedDeserializer.class)
@JsonSerialize(using = AuthNMappingIncluded.AuthNMappingIncludedSerializer.class)
public class AuthNMappingIncluded extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AuthNMappingIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AuthNMappingIncludedSerializer extends StdSerializer<AuthNMappingIncluded> {
    public AuthNMappingIncludedSerializer(Class<AuthNMappingIncluded> t) {
      super(t);
    }

    public AuthNMappingIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AuthNMappingIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AuthNMappingIncludedDeserializer
      extends StdDeserializer<AuthNMappingIncluded> {
    public AuthNMappingIncludedDeserializer() {
      this(AuthNMappingIncluded.class);
    }

    public AuthNMappingIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AuthNMappingIncluded deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SAMLAssertionAttribute
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SAMLAssertionAttribute.class.equals(Integer.class)
            || SAMLAssertionAttribute.class.equals(Long.class)
            || SAMLAssertionAttribute.class.equals(Float.class)
            || SAMLAssertionAttribute.class.equals(Double.class)
            || SAMLAssertionAttribute.class.equals(Boolean.class)
            || SAMLAssertionAttribute.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SAMLAssertionAttribute.class.equals(Integer.class)
                        || SAMLAssertionAttribute.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SAMLAssertionAttribute.class.equals(Float.class)
                        || SAMLAssertionAttribute.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SAMLAssertionAttribute.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SAMLAssertionAttribute.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SAMLAssertionAttribute.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SAMLAssertionAttribute) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SAMLAssertionAttribute'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SAMLAssertionAttribute'", e);
      }

      // deserialize Role
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Role.class.equals(Integer.class)
            || Role.class.equals(Long.class)
            || Role.class.equals(Float.class)
            || Role.class.equals(Double.class)
            || Role.class.equals(Boolean.class)
            || Role.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Role.class.equals(Integer.class) || Role.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Role.class.equals(Float.class) || Role.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Role.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (Role.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Role.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((Role) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'Role'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Role'", e);
      }

      // deserialize AuthNMappingTeam
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AuthNMappingTeam.class.equals(Integer.class)
            || AuthNMappingTeam.class.equals(Long.class)
            || AuthNMappingTeam.class.equals(Float.class)
            || AuthNMappingTeam.class.equals(Double.class)
            || AuthNMappingTeam.class.equals(Boolean.class)
            || AuthNMappingTeam.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AuthNMappingTeam.class.equals(Integer.class)
                        || AuthNMappingTeam.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AuthNMappingTeam.class.equals(Float.class)
                        || AuthNMappingTeam.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AuthNMappingTeam.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AuthNMappingTeam.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AuthNMappingTeam.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AuthNMappingTeam) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AuthNMappingTeam'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AuthNMappingTeam'", e);
      }

      AuthNMappingIncluded ret = new AuthNMappingIncluded();
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
    public AuthNMappingIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "AuthNMappingIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AuthNMappingIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public AuthNMappingIncluded(SAMLAssertionAttribute o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AuthNMappingIncluded(Role o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AuthNMappingIncluded(AuthNMappingTeam o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("SAMLAssertionAttribute", new GenericType<SAMLAssertionAttribute>() {});
    schemas.put("Role", new GenericType<Role>() {});
    schemas.put("AuthNMappingTeam", new GenericType<AuthNMappingTeam>() {});
    JSON.registerDescendants(AuthNMappingIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AuthNMappingIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SAMLAssertionAttribute, Role, AuthNMappingTeam
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(SAMLAssertionAttribute.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Role.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AuthNMappingTeam.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SAMLAssertionAttribute, Role, AuthNMappingTeam");
  }

  /**
   * Get the actual instance, which can be the following: SAMLAssertionAttribute, Role,
   * AuthNMappingTeam
   *
   * @return The actual instance (SAMLAssertionAttribute, Role, AuthNMappingTeam)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SAMLAssertionAttribute`. If the actual instance is not
   * `SAMLAssertionAttribute`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SAMLAssertionAttribute`
   * @throws ClassCastException if the instance is not `SAMLAssertionAttribute`
   */
  public SAMLAssertionAttribute getSAMLAssertionAttribute() throws ClassCastException {
    return (SAMLAssertionAttribute) super.getActualInstance();
  }

  /**
   * Get the actual instance of `Role`. If the actual instance is not `Role`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `Role`
   * @throws ClassCastException if the instance is not `Role`
   */
  public Role getRole() throws ClassCastException {
    return (Role) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AuthNMappingTeam`. If the actual instance is not
   * `AuthNMappingTeam`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AuthNMappingTeam`
   * @throws ClassCastException if the instance is not `AuthNMappingTeam`
   */
  public AuthNMappingTeam getAuthNMappingTeam() throws ClassCastException {
    return (AuthNMappingTeam) super.getActualInstance();
  }
}
