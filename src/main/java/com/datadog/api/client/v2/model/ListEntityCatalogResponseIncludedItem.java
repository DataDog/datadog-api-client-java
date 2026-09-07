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
@JsonDeserialize(
    using =
        ListEntityCatalogResponseIncludedItem.ListEntityCatalogResponseIncludedItemDeserializer
            .class)
@JsonSerialize(
    using =
        ListEntityCatalogResponseIncludedItem.ListEntityCatalogResponseIncludedItemSerializer.class)
public class ListEntityCatalogResponseIncludedItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ListEntityCatalogResponseIncludedItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ListEntityCatalogResponseIncludedItemSerializer
      extends StdSerializer<ListEntityCatalogResponseIncludedItem> {
    public ListEntityCatalogResponseIncludedItemSerializer(
        Class<ListEntityCatalogResponseIncludedItem> t) {
      super(t);
    }

    public ListEntityCatalogResponseIncludedItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListEntityCatalogResponseIncludedItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ListEntityCatalogResponseIncludedItemDeserializer
      extends StdDeserializer<ListEntityCatalogResponseIncludedItem> {
    public ListEntityCatalogResponseIncludedItemDeserializer() {
      this(ListEntityCatalogResponseIncludedItem.class);
    }

    public ListEntityCatalogResponseIncludedItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ListEntityCatalogResponseIncludedItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize EntityResponseIncludedSchema
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityResponseIncludedSchema.class.equals(Integer.class)
            || EntityResponseIncludedSchema.class.equals(Long.class)
            || EntityResponseIncludedSchema.class.equals(Float.class)
            || EntityResponseIncludedSchema.class.equals(Double.class)
            || EntityResponseIncludedSchema.class.equals(Boolean.class)
            || EntityResponseIncludedSchema.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityResponseIncludedSchema.class.equals(Integer.class)
                        || EntityResponseIncludedSchema.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityResponseIncludedSchema.class.equals(Float.class)
                        || EntityResponseIncludedSchema.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityResponseIncludedSchema.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityResponseIncludedSchema.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityResponseIncludedSchema.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityResponseIncludedSchema) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityResponseIncludedSchema'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EntityResponseIncludedSchema'", e);
      }

      // deserialize EntityResponseIncludedRawSchema
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityResponseIncludedRawSchema.class.equals(Integer.class)
            || EntityResponseIncludedRawSchema.class.equals(Long.class)
            || EntityResponseIncludedRawSchema.class.equals(Float.class)
            || EntityResponseIncludedRawSchema.class.equals(Double.class)
            || EntityResponseIncludedRawSchema.class.equals(Boolean.class)
            || EntityResponseIncludedRawSchema.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityResponseIncludedRawSchema.class.equals(Integer.class)
                        || EntityResponseIncludedRawSchema.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityResponseIncludedRawSchema.class.equals(Float.class)
                        || EntityResponseIncludedRawSchema.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityResponseIncludedRawSchema.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityResponseIncludedRawSchema.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityResponseIncludedRawSchema.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityResponseIncludedRawSchema) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityResponseIncludedRawSchema'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'EntityResponseIncludedRawSchema'", e);
      }

      // deserialize EntityResponseIncludedRelatedEntity
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityResponseIncludedRelatedEntity.class.equals(Integer.class)
            || EntityResponseIncludedRelatedEntity.class.equals(Long.class)
            || EntityResponseIncludedRelatedEntity.class.equals(Float.class)
            || EntityResponseIncludedRelatedEntity.class.equals(Double.class)
            || EntityResponseIncludedRelatedEntity.class.equals(Boolean.class)
            || EntityResponseIncludedRelatedEntity.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityResponseIncludedRelatedEntity.class.equals(Integer.class)
                        || EntityResponseIncludedRelatedEntity.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityResponseIncludedRelatedEntity.class.equals(Float.class)
                        || EntityResponseIncludedRelatedEntity.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityResponseIncludedRelatedEntity.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityResponseIncludedRelatedEntity.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityResponseIncludedRelatedEntity.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityResponseIncludedRelatedEntity) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityResponseIncludedRelatedEntity'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'EntityResponseIncludedRelatedEntity'",
            e);
      }

      // deserialize EntityResponseIncludedOncall
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityResponseIncludedOncall.class.equals(Integer.class)
            || EntityResponseIncludedOncall.class.equals(Long.class)
            || EntityResponseIncludedOncall.class.equals(Float.class)
            || EntityResponseIncludedOncall.class.equals(Double.class)
            || EntityResponseIncludedOncall.class.equals(Boolean.class)
            || EntityResponseIncludedOncall.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityResponseIncludedOncall.class.equals(Integer.class)
                        || EntityResponseIncludedOncall.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityResponseIncludedOncall.class.equals(Float.class)
                        || EntityResponseIncludedOncall.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityResponseIncludedOncall.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityResponseIncludedOncall.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityResponseIncludedOncall.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityResponseIncludedOncall) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityResponseIncludedOncall'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EntityResponseIncludedOncall'", e);
      }

      // deserialize EntityResponseIncludedIncident
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EntityResponseIncludedIncident.class.equals(Integer.class)
            || EntityResponseIncludedIncident.class.equals(Long.class)
            || EntityResponseIncludedIncident.class.equals(Float.class)
            || EntityResponseIncludedIncident.class.equals(Double.class)
            || EntityResponseIncludedIncident.class.equals(Boolean.class)
            || EntityResponseIncludedIncident.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EntityResponseIncludedIncident.class.equals(Integer.class)
                        || EntityResponseIncludedIncident.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EntityResponseIncludedIncident.class.equals(Float.class)
                        || EntityResponseIncludedIncident.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EntityResponseIncludedIncident.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EntityResponseIncludedIncident.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EntityResponseIncludedIncident.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EntityResponseIncludedIncident) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EntityResponseIncludedIncident'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'EntityResponseIncludedIncident'", e);
      }

      ListEntityCatalogResponseIncludedItem ret = new ListEntityCatalogResponseIncludedItem();
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
    public ListEntityCatalogResponseIncludedItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ListEntityCatalogResponseIncludedItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ListEntityCatalogResponseIncludedItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ListEntityCatalogResponseIncludedItem(EntityResponseIncludedSchema o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListEntityCatalogResponseIncludedItem(EntityResponseIncludedRawSchema o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListEntityCatalogResponseIncludedItem(EntityResponseIncludedRelatedEntity o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListEntityCatalogResponseIncludedItem(EntityResponseIncludedOncall o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListEntityCatalogResponseIncludedItem(EntityResponseIncludedIncident o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("EntityResponseIncludedSchema", new GenericType<EntityResponseIncludedSchema>() {});
    schemas.put(
        "EntityResponseIncludedRawSchema", new GenericType<EntityResponseIncludedRawSchema>() {});
    schemas.put(
        "EntityResponseIncludedRelatedEntity",
        new GenericType<EntityResponseIncludedRelatedEntity>() {});
    schemas.put("EntityResponseIncludedOncall", new GenericType<EntityResponseIncludedOncall>() {});
    schemas.put(
        "EntityResponseIncludedIncident", new GenericType<EntityResponseIncludedIncident>() {});
    JSON.registerDescendants(
        ListEntityCatalogResponseIncludedItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ListEntityCatalogResponseIncludedItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: EntityResponseIncludedSchema, EntityResponseIncludedRawSchema,
   * EntityResponseIncludedRelatedEntity, EntityResponseIncludedOncall,
   * EntityResponseIncludedIncident
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(EntityResponseIncludedSchema.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EntityResponseIncludedRawSchema.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EntityResponseIncludedRelatedEntity.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EntityResponseIncludedOncall.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EntityResponseIncludedIncident.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be EntityResponseIncludedSchema,"
            + " EntityResponseIncludedRawSchema, EntityResponseIncludedRelatedEntity,"
            + " EntityResponseIncludedOncall, EntityResponseIncludedIncident");
  }

  /**
   * Get the actual instance, which can be the following: EntityResponseIncludedSchema,
   * EntityResponseIncludedRawSchema, EntityResponseIncludedRelatedEntity,
   * EntityResponseIncludedOncall, EntityResponseIncludedIncident
   *
   * @return The actual instance (EntityResponseIncludedSchema, EntityResponseIncludedRawSchema,
   *     EntityResponseIncludedRelatedEntity, EntityResponseIncludedOncall,
   *     EntityResponseIncludedIncident)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityResponseIncludedSchema`. If the actual instance is not
   * `EntityResponseIncludedSchema`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityResponseIncludedSchema`
   * @throws ClassCastException if the instance is not `EntityResponseIncludedSchema`
   */
  public EntityResponseIncludedSchema getEntityResponseIncludedSchema() throws ClassCastException {
    return (EntityResponseIncludedSchema) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityResponseIncludedRawSchema`. If the actual instance is not
   * `EntityResponseIncludedRawSchema`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityResponseIncludedRawSchema`
   * @throws ClassCastException if the instance is not `EntityResponseIncludedRawSchema`
   */
  public EntityResponseIncludedRawSchema getEntityResponseIncludedRawSchema()
      throws ClassCastException {
    return (EntityResponseIncludedRawSchema) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityResponseIncludedRelatedEntity`. If the actual instance is not
   * `EntityResponseIncludedRelatedEntity`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityResponseIncludedRelatedEntity`
   * @throws ClassCastException if the instance is not `EntityResponseIncludedRelatedEntity`
   */
  public EntityResponseIncludedRelatedEntity getEntityResponseIncludedRelatedEntity()
      throws ClassCastException {
    return (EntityResponseIncludedRelatedEntity) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityResponseIncludedOncall`. If the actual instance is not
   * `EntityResponseIncludedOncall`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityResponseIncludedOncall`
   * @throws ClassCastException if the instance is not `EntityResponseIncludedOncall`
   */
  public EntityResponseIncludedOncall getEntityResponseIncludedOncall() throws ClassCastException {
    return (EntityResponseIncludedOncall) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EntityResponseIncludedIncident`. If the actual instance is not
   * `EntityResponseIncludedIncident`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EntityResponseIncludedIncident`
   * @throws ClassCastException if the instance is not `EntityResponseIncludedIncident`
   */
  public EntityResponseIncludedIncident getEntityResponseIncludedIncident()
      throws ClassCastException {
    return (EntityResponseIncludedIncident) super.getActualInstance();
  }
}
