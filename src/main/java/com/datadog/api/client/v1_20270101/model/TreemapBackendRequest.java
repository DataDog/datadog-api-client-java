/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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
@JsonDeserialize(using = TreemapBackendRequest.TreemapBackendRequestDeserializer.class)
@JsonSerialize(using = TreemapBackendRequest.TreemapBackendRequestSerializer.class)
public class TreemapBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TreemapBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TreemapBackendRequestSerializer extends StdSerializer<TreemapBackendRequest> {
    public TreemapBackendRequestSerializer(Class<TreemapBackendRequest> t) {
      super(t);
    }

    public TreemapBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TreemapBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TreemapBackendRequestDeserializer
      extends StdDeserializer<TreemapBackendRequest> {
    public TreemapBackendRequestDeserializer() {
      this(TreemapBackendRequest.class);
    }

    public TreemapBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TreemapBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TreemapBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendRequest20270101OneOf.class.equals(Integer.class)
            || TreemapBackendRequest20270101OneOf.class.equals(Long.class)
            || TreemapBackendRequest20270101OneOf.class.equals(Float.class)
            || TreemapBackendRequest20270101OneOf.class.equals(Double.class)
            || TreemapBackendRequest20270101OneOf.class.equals(Boolean.class)
            || TreemapBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf.class.equals(Integer.class)
                        || TreemapBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf.class.equals(Float.class)
                        || TreemapBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreemapBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreemapBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TreemapBackendRequest20270101OneOf'",
            e);
      }

      // deserialize TreemapBackendRequest20270101OneOf4463750144
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendRequest20270101OneOf4463750144.class.equals(Integer.class)
            || TreemapBackendRequest20270101OneOf4463750144.class.equals(Long.class)
            || TreemapBackendRequest20270101OneOf4463750144.class.equals(Float.class)
            || TreemapBackendRequest20270101OneOf4463750144.class.equals(Double.class)
            || TreemapBackendRequest20270101OneOf4463750144.class.equals(Boolean.class)
            || TreemapBackendRequest20270101OneOf4463750144.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463750144.class.equals(Integer.class)
                        || TreemapBackendRequest20270101OneOf4463750144.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463750144.class.equals(Float.class)
                        || TreemapBackendRequest20270101OneOf4463750144.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463750144.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463750144.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TreemapBackendRequest20270101OneOf4463750144.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendRequest20270101OneOf4463750144) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TreemapBackendRequest20270101OneOf4463750144'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TreemapBackendRequest20270101OneOf4463750144'",
            e);
      }

      // deserialize TreemapBackendRequest20270101OneOf4463751424
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendRequest20270101OneOf4463751424.class.equals(Integer.class)
            || TreemapBackendRequest20270101OneOf4463751424.class.equals(Long.class)
            || TreemapBackendRequest20270101OneOf4463751424.class.equals(Float.class)
            || TreemapBackendRequest20270101OneOf4463751424.class.equals(Double.class)
            || TreemapBackendRequest20270101OneOf4463751424.class.equals(Boolean.class)
            || TreemapBackendRequest20270101OneOf4463751424.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463751424.class.equals(Integer.class)
                        || TreemapBackendRequest20270101OneOf4463751424.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463751424.class.equals(Float.class)
                        || TreemapBackendRequest20270101OneOf4463751424.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463751424.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463751424.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TreemapBackendRequest20270101OneOf4463751424.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendRequest20270101OneOf4463751424) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TreemapBackendRequest20270101OneOf4463751424'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TreemapBackendRequest20270101OneOf4463751424'",
            e);
      }

      // deserialize TreemapBackendRequest20270101OneOf4463752384
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendRequest20270101OneOf4463752384.class.equals(Integer.class)
            || TreemapBackendRequest20270101OneOf4463752384.class.equals(Long.class)
            || TreemapBackendRequest20270101OneOf4463752384.class.equals(Float.class)
            || TreemapBackendRequest20270101OneOf4463752384.class.equals(Double.class)
            || TreemapBackendRequest20270101OneOf4463752384.class.equals(Boolean.class)
            || TreemapBackendRequest20270101OneOf4463752384.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463752384.class.equals(Integer.class)
                        || TreemapBackendRequest20270101OneOf4463752384.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463752384.class.equals(Float.class)
                        || TreemapBackendRequest20270101OneOf4463752384.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463752384.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463752384.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TreemapBackendRequest20270101OneOf4463752384.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendRequest20270101OneOf4463752384) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TreemapBackendRequest20270101OneOf4463752384'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TreemapBackendRequest20270101OneOf4463752384'",
            e);
      }

      // deserialize TreemapBackendRequest20270101OneOf4463753824
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreemapBackendRequest20270101OneOf4463753824.class.equals(Integer.class)
            || TreemapBackendRequest20270101OneOf4463753824.class.equals(Long.class)
            || TreemapBackendRequest20270101OneOf4463753824.class.equals(Float.class)
            || TreemapBackendRequest20270101OneOf4463753824.class.equals(Double.class)
            || TreemapBackendRequest20270101OneOf4463753824.class.equals(Boolean.class)
            || TreemapBackendRequest20270101OneOf4463753824.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463753824.class.equals(Integer.class)
                        || TreemapBackendRequest20270101OneOf4463753824.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreemapBackendRequest20270101OneOf4463753824.class.equals(Float.class)
                        || TreemapBackendRequest20270101OneOf4463753824.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463753824.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreemapBackendRequest20270101OneOf4463753824.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TreemapBackendRequest20270101OneOf4463753824.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreemapBackendRequest20270101OneOf4463753824) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TreemapBackendRequest20270101OneOf4463753824'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TreemapBackendRequest20270101OneOf4463753824'",
            e);
      }

      TreemapBackendRequest ret = new TreemapBackendRequest();
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
    public TreemapBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TreemapBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TreemapBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public TreemapBackendRequest(TreemapBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TreemapBackendRequest(TreemapBackendRequest20270101OneOf4463750144 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TreemapBackendRequest(TreemapBackendRequest20270101OneOf4463751424 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TreemapBackendRequest(TreemapBackendRequest20270101OneOf4463752384 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TreemapBackendRequest(TreemapBackendRequest20270101OneOf4463753824 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TreemapBackendRequest20270101OneOf",
        new GenericType<TreemapBackendRequest20270101OneOf>() {});
    schemas.put(
        "TreemapBackendRequest20270101OneOf4463750144",
        new GenericType<TreemapBackendRequest20270101OneOf4463750144>() {});
    schemas.put(
        "TreemapBackendRequest20270101OneOf4463751424",
        new GenericType<TreemapBackendRequest20270101OneOf4463751424>() {});
    schemas.put(
        "TreemapBackendRequest20270101OneOf4463752384",
        new GenericType<TreemapBackendRequest20270101OneOf4463752384>() {});
    schemas.put(
        "TreemapBackendRequest20270101OneOf4463753824",
        new GenericType<TreemapBackendRequest20270101OneOf4463753824>() {});
    JSON.registerDescendants(TreemapBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TreemapBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TreemapBackendRequest20270101OneOf,
   * TreemapBackendRequest20270101OneOf4463750144, TreemapBackendRequest20270101OneOf4463751424,
   * TreemapBackendRequest20270101OneOf4463752384, TreemapBackendRequest20270101OneOf4463753824
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TreemapBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TreemapBackendRequest20270101OneOf4463750144.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TreemapBackendRequest20270101OneOf4463751424.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TreemapBackendRequest20270101OneOf4463752384.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TreemapBackendRequest20270101OneOf4463753824.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TreemapBackendRequest20270101OneOf,"
            + " TreemapBackendRequest20270101OneOf4463750144,"
            + " TreemapBackendRequest20270101OneOf4463751424,"
            + " TreemapBackendRequest20270101OneOf4463752384,"
            + " TreemapBackendRequest20270101OneOf4463753824");
  }

  /**
   * Get the actual instance, which can be the following: TreemapBackendRequest20270101OneOf,
   * TreemapBackendRequest20270101OneOf4463750144, TreemapBackendRequest20270101OneOf4463751424,
   * TreemapBackendRequest20270101OneOf4463752384, TreemapBackendRequest20270101OneOf4463753824
   *
   * @return The actual instance (TreemapBackendRequest20270101OneOf,
   *     TreemapBackendRequest20270101OneOf4463750144, TreemapBackendRequest20270101OneOf4463751424,
   *     TreemapBackendRequest20270101OneOf4463752384, TreemapBackendRequest20270101OneOf4463753824)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendRequest20270101OneOf`. If the actual instance is not
   * `TreemapBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreemapBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `TreemapBackendRequest20270101OneOf`
   */
  public TreemapBackendRequest20270101OneOf getTreemapBackendRequest20270101OneOf()
      throws ClassCastException {
    return (TreemapBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendRequest20270101OneOf4463750144`. If the actual
   * instance is not `TreemapBackendRequest20270101OneOf4463750144`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TreemapBackendRequest20270101OneOf4463750144`
   * @throws ClassCastException if the instance is not
   *     `TreemapBackendRequest20270101OneOf4463750144`
   */
  public TreemapBackendRequest20270101OneOf4463750144
      getTreemapBackendRequest20270101OneOf4463750144() throws ClassCastException {
    return (TreemapBackendRequest20270101OneOf4463750144) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendRequest20270101OneOf4463751424`. If the actual
   * instance is not `TreemapBackendRequest20270101OneOf4463751424`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TreemapBackendRequest20270101OneOf4463751424`
   * @throws ClassCastException if the instance is not
   *     `TreemapBackendRequest20270101OneOf4463751424`
   */
  public TreemapBackendRequest20270101OneOf4463751424
      getTreemapBackendRequest20270101OneOf4463751424() throws ClassCastException {
    return (TreemapBackendRequest20270101OneOf4463751424) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendRequest20270101OneOf4463752384`. If the actual
   * instance is not `TreemapBackendRequest20270101OneOf4463752384`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TreemapBackendRequest20270101OneOf4463752384`
   * @throws ClassCastException if the instance is not
   *     `TreemapBackendRequest20270101OneOf4463752384`
   */
  public TreemapBackendRequest20270101OneOf4463752384
      getTreemapBackendRequest20270101OneOf4463752384() throws ClassCastException {
    return (TreemapBackendRequest20270101OneOf4463752384) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreemapBackendRequest20270101OneOf4463753824`. If the actual
   * instance is not `TreemapBackendRequest20270101OneOf4463753824`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TreemapBackendRequest20270101OneOf4463753824`
   * @throws ClassCastException if the instance is not
   *     `TreemapBackendRequest20270101OneOf4463753824`
   */
  public TreemapBackendRequest20270101OneOf4463753824
      getTreemapBackendRequest20270101OneOf4463753824() throws ClassCastException {
    return (TreemapBackendRequest20270101OneOf4463753824) super.getActualInstance();
  }
}
