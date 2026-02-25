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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using = RelationshipObjectOutputData.RelationshipObjectOutputDataDeserializer.class)
@JsonSerialize(using = RelationshipObjectOutputData.RelationshipObjectOutputDataSerializer.class)
public class RelationshipObjectOutputData extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(RelationshipObjectOutputData.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class RelationshipObjectOutputDataSerializer
      extends StdSerializer<RelationshipObjectOutputData> {
    public RelationshipObjectOutputDataSerializer(Class<RelationshipObjectOutputData> t) {
      super(t);
    }

    public RelationshipObjectOutputDataSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RelationshipObjectOutputData value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class RelationshipObjectOutputDataDeserializer
      extends StdDeserializer<RelationshipObjectOutputData> {
    public RelationshipObjectOutputDataDeserializer() {
      this(RelationshipObjectOutputData.class);
    }

    public RelationshipObjectOutputDataDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public RelationshipObjectOutputData deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ResourceIdentifierObject
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ResourceIdentifierObject.class.equals(Integer.class)
            || ResourceIdentifierObject.class.equals(Long.class)
            || ResourceIdentifierObject.class.equals(Float.class)
            || ResourceIdentifierObject.class.equals(Double.class)
            || ResourceIdentifierObject.class.equals(Boolean.class)
            || ResourceIdentifierObject.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ResourceIdentifierObject.class.equals(Integer.class)
                        || ResourceIdentifierObject.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ResourceIdentifierObject.class.equals(Float.class)
                        || ResourceIdentifierObject.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ResourceIdentifierObject.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ResourceIdentifierObject.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ResourceIdentifierObject.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ResourceIdentifierObject) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ResourceIdentifierObject'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ResourceIdentifierObject'", e);
      }

      // deserialize List<ResourceIdentifierObject>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (List.class.equals(Integer.class)
            || List.class.equals(Long.class)
            || List.class.equals(Float.class)
            || List.class.equals(Double.class)
            || List.class.equals(Boolean.class)
            || List.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((List.class.equals(Integer.class) || List.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((List.class.equals(Float.class) || List.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (List.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(new TypeReference<List<ResourceIdentifierObject>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'List<ResourceIdentifierObject>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'List<ResourceIdentifierObject>'", e);
      }

      RelationshipObjectOutputData ret = new RelationshipObjectOutputData();
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
    public RelationshipObjectOutputData getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      return null;
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public RelationshipObjectOutputData() {
    super("oneOf", Boolean.TRUE);
  }

  public RelationshipObjectOutputData(ResourceIdentifierObject o) {
    super("oneOf", Boolean.TRUE);
    setActualInstance(o);
  }

  public RelationshipObjectOutputData(List<ResourceIdentifierObject> o) {
    super("oneOf", Boolean.TRUE);
    setActualInstance(o);
  }

  static {
    schemas.put("ResourceIdentifierObject", new GenericType<ResourceIdentifierObject>() {});
    schemas.put(
        "List<ResourceIdentifierObject>", new GenericType<List<ResourceIdentifierObject>>() {});
    JSON.registerDescendants(
        RelationshipObjectOutputData.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return RelationshipObjectOutputData.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ResourceIdentifierObject, List&lt;ResourceIdentifierObject&gt;
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (instance == null) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(ResourceIdentifierObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ResourceIdentifierObject, List<ResourceIdentifierObject>");
  }

  /**
   * Get the actual instance, which can be the following: ResourceIdentifierObject,
   * List&lt;ResourceIdentifierObject&gt;
   *
   * @return The actual instance (ResourceIdentifierObject, List&lt;ResourceIdentifierObject&gt;)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ResourceIdentifierObject`. If the actual instance is not
   * `ResourceIdentifierObject`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ResourceIdentifierObject`
   * @throws ClassCastException if the instance is not `ResourceIdentifierObject`
   */
  public ResourceIdentifierObject getResourceIdentifierObject() throws ClassCastException {
    return (ResourceIdentifierObject) super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;ResourceIdentifierObject&gt;`. If the actual instance is
   * not `List&lt;ResourceIdentifierObject&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `List&lt;ResourceIdentifierObject&gt;`
   * @throws ClassCastException if the instance is not `List&lt;ResourceIdentifierObject&gt;`
   */
  public List<ResourceIdentifierObject> getList() throws ClassCastException {
    return (List<ResourceIdentifierObject>) super.getActualInstance();
  }
}
