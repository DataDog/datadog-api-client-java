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
@JsonDeserialize(using = EntityV3.EntityV3Deserializer.class)
@JsonSerialize(using = EntityV3.EntityV3Serializer.class)
public class EntityV3 extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(EntityV3.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class EntityV3Serializer extends StdSerializer<EntityV3> {
    public EntityV3Serializer(Class<EntityV3> t) {
      super(t);
    }

    public EntityV3Serializer() {
      this(null);
    }

    @Override
    public void serialize(EntityV3 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class EntityV3Deserializer extends StdDeserializer<EntityV3> {
    public EntityV3Deserializer() {
      this(EntityV3.class);
    }

    public EntityV3Deserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public EntityV3 deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize EntityV3Service
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityV3Service.class.equals(Integer.class)
            || EntityV3Service.class.equals(Long.class)
            || EntityV3Service.class.equals(Float.class)
            || EntityV3Service.class.equals(Double.class)
            || EntityV3Service.class.equals(Boolean.class)
            || EntityV3Service.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityV3Service.class.equals(Integer.class)
                        || EntityV3Service.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityV3Service.class.equals(Float.class)
                        || EntityV3Service.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityV3Service.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityV3Service.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityV3Service.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityV3Service) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityV3Service'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EntityV3Service'", e);
      }

      // deserialize EntityV3Datastore
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityV3Datastore.class.equals(Integer.class)
            || EntityV3Datastore.class.equals(Long.class)
            || EntityV3Datastore.class.equals(Float.class)
            || EntityV3Datastore.class.equals(Double.class)
            || EntityV3Datastore.class.equals(Boolean.class)
            || EntityV3Datastore.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityV3Datastore.class.equals(Integer.class)
                        || EntityV3Datastore.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityV3Datastore.class.equals(Float.class)
                        || EntityV3Datastore.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityV3Datastore.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityV3Datastore.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityV3Datastore.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityV3Datastore) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityV3Datastore'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EntityV3Datastore'", e);
      }

      // deserialize EntityV3Queue
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityV3Queue.class.equals(Integer.class)
            || EntityV3Queue.class.equals(Long.class)
            || EntityV3Queue.class.equals(Float.class)
            || EntityV3Queue.class.equals(Double.class)
            || EntityV3Queue.class.equals(Boolean.class)
            || EntityV3Queue.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityV3Queue.class.equals(Integer.class)
                        || EntityV3Queue.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityV3Queue.class.equals(Float.class)
                        || EntityV3Queue.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityV3Queue.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityV3Queue.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityV3Queue.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityV3Queue) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityV3Queue'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EntityV3Queue'", e);
      }

      // deserialize EntityV3System
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityV3System.class.equals(Integer.class)
            || EntityV3System.class.equals(Long.class)
            || EntityV3System.class.equals(Float.class)
            || EntityV3System.class.equals(Double.class)
            || EntityV3System.class.equals(Boolean.class)
            || EntityV3System.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityV3System.class.equals(Integer.class)
                        || EntityV3System.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityV3System.class.equals(Float.class)
                        || EntityV3System.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityV3System.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityV3System.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityV3System.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityV3System) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityV3System'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EntityV3System'", e);
      }

      EntityV3 ret = new EntityV3();
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
    public EntityV3 getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "EntityV3 cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public EntityV3() {
    super("oneOf", Boolean.FALSE);
  }

  public EntityV3(EntityV3Service o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EntityV3(EntityV3Datastore o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EntityV3(EntityV3Queue o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EntityV3(EntityV3System o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("EntityV3Service", new GenericType<EntityV3Service>() {});
    schemas.put("EntityV3Datastore", new GenericType<EntityV3Datastore>() {});
    schemas.put("EntityV3Queue", new GenericType<EntityV3Queue>() {});
    schemas.put("EntityV3System", new GenericType<EntityV3System>() {});
    JSON.registerDescendants(EntityV3.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return EntityV3.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: EntityV3Service, EntityV3Datastore, EntityV3Queue,
   * EntityV3System
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(EntityV3Service.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EntityV3Datastore.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EntityV3Queue.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EntityV3System.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be EntityV3Service, EntityV3Datastore, EntityV3Queue,"
            + " EntityV3System");
  }

  /**
   * Get the actual instance, which can be the following: EntityV3Service, EntityV3Datastore,
   * EntityV3Queue, EntityV3System
   *
   * @return The actual instance (EntityV3Service, EntityV3Datastore, EntityV3Queue, EntityV3System)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityV3Service`. If the actual instance is not `EntityV3Service`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityV3Service`
   * @throws ClassCastException if the instance is not `EntityV3Service`
   */
  public EntityV3Service getEntityV3Service() throws ClassCastException {
    return (EntityV3Service) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityV3Datastore`. If the actual instance is not
   * `EntityV3Datastore`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityV3Datastore`
   * @throws ClassCastException if the instance is not `EntityV3Datastore`
   */
  public EntityV3Datastore getEntityV3Datastore() throws ClassCastException {
    return (EntityV3Datastore) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityV3Queue`. If the actual instance is not `EntityV3Queue`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityV3Queue`
   * @throws ClassCastException if the instance is not `EntityV3Queue`
   */
  public EntityV3Queue getEntityV3Queue() throws ClassCastException {
    return (EntityV3Queue) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityV3System`. If the actual instance is not `EntityV3System`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityV3System`
   * @throws ClassCastException if the instance is not `EntityV3System`
   */
  public EntityV3System getEntityV3System() throws ClassCastException {
    return (EntityV3System) super.getActualInstance();
  }
}
