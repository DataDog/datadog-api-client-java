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
@JsonDeserialize(using = UserResponseIncludedItem.UserResponseIncludedItemDeserializer.class)
@JsonSerialize(using = UserResponseIncludedItem.UserResponseIncludedItemSerializer.class)
public class UserResponseIncludedItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(UserResponseIncludedItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class UserResponseIncludedItemSerializer
      extends StdSerializer<UserResponseIncludedItem> {
    public UserResponseIncludedItemSerializer(Class<UserResponseIncludedItem> t) {
      super(t);
    }

    public UserResponseIncludedItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UserResponseIncludedItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class UserResponseIncludedItemDeserializer
      extends StdDeserializer<UserResponseIncludedItem> {
    public UserResponseIncludedItemDeserializer() {
      this(UserResponseIncludedItem.class);
    }

    public UserResponseIncludedItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public UserResponseIncludedItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize Organization
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Organization.class.equals(Integer.class)
            || Organization.class.equals(Long.class)
            || Organization.class.equals(Float.class)
            || Organization.class.equals(Double.class)
            || Organization.class.equals(Boolean.class)
            || Organization.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Organization.class.equals(Integer.class) || Organization.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Organization.class.equals(Float.class) || Organization.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Organization.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (Organization.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Organization.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((Organization) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'Organization'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Organization'", e);
      }

      // deserialize Permission
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Permission.class.equals(Integer.class)
            || Permission.class.equals(Long.class)
            || Permission.class.equals(Float.class)
            || Permission.class.equals(Double.class)
            || Permission.class.equals(Boolean.class)
            || Permission.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Permission.class.equals(Integer.class) || Permission.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Permission.class.equals(Float.class) || Permission.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Permission.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (Permission.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Permission.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((Permission) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'Permission'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Permission'", e);
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

      UserResponseIncludedItem ret = new UserResponseIncludedItem();
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
    public UserResponseIncludedItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "UserResponseIncludedItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public UserResponseIncludedItem() {
    super("oneOf", Boolean.FALSE);
  }

  public UserResponseIncludedItem(Organization o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public UserResponseIncludedItem(Permission o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public UserResponseIncludedItem(Role o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("Organization", new GenericType<Organization>() {});
    schemas.put("Permission", new GenericType<Permission>() {});
    schemas.put("Role", new GenericType<Role>() {});
    JSON.registerDescendants(UserResponseIncludedItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return UserResponseIncludedItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: Organization, Permission, Role
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(Organization.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Permission.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Role.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be Organization, Permission, Role");
  }

  /**
   * Get the actual instance, which can be the following: Organization, Permission, Role
   *
   * @return The actual instance (Organization, Permission, Role)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `Organization`. If the actual instance is not `Organization`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Organization`
   * @throws ClassCastException if the instance is not `Organization`
   */
  public Organization getOrganization() throws ClassCastException {
    return (Organization) super.getActualInstance();
  }

  /**
   * Get the actual instance of `Permission`. If the actual instance is not `Permission`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Permission`
   * @throws ClassCastException if the instance is not `Permission`
   */
  public Permission getPermission() throws ClassCastException {
    return (Permission) super.getActualInstance();
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
}
