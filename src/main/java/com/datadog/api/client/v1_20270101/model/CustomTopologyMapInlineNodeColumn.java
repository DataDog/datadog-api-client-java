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
@JsonDeserialize(
    using = CustomTopologyMapInlineNodeColumn.CustomTopologyMapInlineNodeColumnDeserializer.class)
@JsonSerialize(
    using = CustomTopologyMapInlineNodeColumn.CustomTopologyMapInlineNodeColumnSerializer.class)
public class CustomTopologyMapInlineNodeColumn extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CustomTopologyMapInlineNodeColumn.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CustomTopologyMapInlineNodeColumnSerializer
      extends StdSerializer<CustomTopologyMapInlineNodeColumn> {
    public CustomTopologyMapInlineNodeColumnSerializer(Class<CustomTopologyMapInlineNodeColumn> t) {
      super(t);
    }

    public CustomTopologyMapInlineNodeColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomTopologyMapInlineNodeColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CustomTopologyMapInlineNodeColumnDeserializer
      extends StdDeserializer<CustomTopologyMapInlineNodeColumn> {
    public CustomTopologyMapInlineNodeColumnDeserializer() {
      this(CustomTopologyMapInlineNodeColumn.class);
    }

    public CustomTopologyMapInlineNodeColumnDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CustomTopologyMapInlineNodeColumn deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CustomTopologyMapInlineNodeIdColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomTopologyMapInlineNodeIdColumn.class.equals(Integer.class)
            || CustomTopologyMapInlineNodeIdColumn.class.equals(Long.class)
            || CustomTopologyMapInlineNodeIdColumn.class.equals(Float.class)
            || CustomTopologyMapInlineNodeIdColumn.class.equals(Double.class)
            || CustomTopologyMapInlineNodeIdColumn.class.equals(Boolean.class)
            || CustomTopologyMapInlineNodeIdColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomTopologyMapInlineNodeIdColumn.class.equals(Integer.class)
                        || CustomTopologyMapInlineNodeIdColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomTopologyMapInlineNodeIdColumn.class.equals(Float.class)
                        || CustomTopologyMapInlineNodeIdColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomTopologyMapInlineNodeIdColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomTopologyMapInlineNodeIdColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CustomTopologyMapInlineNodeIdColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomTopologyMapInlineNodeIdColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CustomTopologyMapInlineNodeIdColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CustomTopologyMapInlineNodeIdColumn'",
            e);
      }

      // deserialize CustomTopologyMapInlineNodeStringColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomTopologyMapInlineNodeStringColumn.class.equals(Integer.class)
            || CustomTopologyMapInlineNodeStringColumn.class.equals(Long.class)
            || CustomTopologyMapInlineNodeStringColumn.class.equals(Float.class)
            || CustomTopologyMapInlineNodeStringColumn.class.equals(Double.class)
            || CustomTopologyMapInlineNodeStringColumn.class.equals(Boolean.class)
            || CustomTopologyMapInlineNodeStringColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomTopologyMapInlineNodeStringColumn.class.equals(Integer.class)
                        || CustomTopologyMapInlineNodeStringColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomTopologyMapInlineNodeStringColumn.class.equals(Float.class)
                        || CustomTopologyMapInlineNodeStringColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomTopologyMapInlineNodeStringColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomTopologyMapInlineNodeStringColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomTopologyMapInlineNodeStringColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomTopologyMapInlineNodeStringColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'CustomTopologyMapInlineNodeStringColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CustomTopologyMapInlineNodeStringColumn'",
            e);
      }

      // deserialize CustomTopologyMapInlineNodeValueColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomTopologyMapInlineNodeValueColumn.class.equals(Integer.class)
            || CustomTopologyMapInlineNodeValueColumn.class.equals(Long.class)
            || CustomTopologyMapInlineNodeValueColumn.class.equals(Float.class)
            || CustomTopologyMapInlineNodeValueColumn.class.equals(Double.class)
            || CustomTopologyMapInlineNodeValueColumn.class.equals(Boolean.class)
            || CustomTopologyMapInlineNodeValueColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomTopologyMapInlineNodeValueColumn.class.equals(Integer.class)
                        || CustomTopologyMapInlineNodeValueColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomTopologyMapInlineNodeValueColumn.class.equals(Float.class)
                        || CustomTopologyMapInlineNodeValueColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomTopologyMapInlineNodeValueColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomTopologyMapInlineNodeValueColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomTopologyMapInlineNodeValueColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomTopologyMapInlineNodeValueColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'CustomTopologyMapInlineNodeValueColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CustomTopologyMapInlineNodeValueColumn'",
            e);
      }

      CustomTopologyMapInlineNodeColumn ret = new CustomTopologyMapInlineNodeColumn();
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
    public CustomTopologyMapInlineNodeColumn getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CustomTopologyMapInlineNodeColumn cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CustomTopologyMapInlineNodeColumn() {
    super("oneOf", Boolean.FALSE);
  }

  public CustomTopologyMapInlineNodeColumn(CustomTopologyMapInlineNodeIdColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomTopologyMapInlineNodeColumn(CustomTopologyMapInlineNodeStringColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomTopologyMapInlineNodeColumn(CustomTopologyMapInlineNodeValueColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CustomTopologyMapInlineNodeIdColumn",
        new GenericType<CustomTopologyMapInlineNodeIdColumn>() {});
    schemas.put(
        "CustomTopologyMapInlineNodeStringColumn",
        new GenericType<CustomTopologyMapInlineNodeStringColumn>() {});
    schemas.put(
        "CustomTopologyMapInlineNodeValueColumn",
        new GenericType<CustomTopologyMapInlineNodeValueColumn>() {});
    JSON.registerDescendants(
        CustomTopologyMapInlineNodeColumn.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CustomTopologyMapInlineNodeColumn.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CustomTopologyMapInlineNodeIdColumn,
   * CustomTopologyMapInlineNodeStringColumn, CustomTopologyMapInlineNodeValueColumn
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CustomTopologyMapInlineNodeIdColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CustomTopologyMapInlineNodeStringColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CustomTopologyMapInlineNodeValueColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CustomTopologyMapInlineNodeIdColumn,"
            + " CustomTopologyMapInlineNodeStringColumn, CustomTopologyMapInlineNodeValueColumn");
  }

  /**
   * Get the actual instance, which can be the following: CustomTopologyMapInlineNodeIdColumn,
   * CustomTopologyMapInlineNodeStringColumn, CustomTopologyMapInlineNodeValueColumn
   *
   * @return The actual instance (CustomTopologyMapInlineNodeIdColumn,
   *     CustomTopologyMapInlineNodeStringColumn, CustomTopologyMapInlineNodeValueColumn)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomTopologyMapInlineNodeIdColumn`. If the actual instance is not
   * `CustomTopologyMapInlineNodeIdColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CustomTopologyMapInlineNodeIdColumn`
   * @throws ClassCastException if the instance is not `CustomTopologyMapInlineNodeIdColumn`
   */
  public CustomTopologyMapInlineNodeIdColumn getCustomTopologyMapInlineNodeIdColumn()
      throws ClassCastException {
    return (CustomTopologyMapInlineNodeIdColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomTopologyMapInlineNodeStringColumn`. If the actual instance is
   * not `CustomTopologyMapInlineNodeStringColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CustomTopologyMapInlineNodeStringColumn`
   * @throws ClassCastException if the instance is not `CustomTopologyMapInlineNodeStringColumn`
   */
  public CustomTopologyMapInlineNodeStringColumn getCustomTopologyMapInlineNodeStringColumn()
      throws ClassCastException {
    return (CustomTopologyMapInlineNodeStringColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomTopologyMapInlineNodeValueColumn`. If the actual instance is
   * not `CustomTopologyMapInlineNodeValueColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CustomTopologyMapInlineNodeValueColumn`
   * @throws ClassCastException if the instance is not `CustomTopologyMapInlineNodeValueColumn`
   */
  public CustomTopologyMapInlineNodeValueColumn getCustomTopologyMapInlineNodeValueColumn()
      throws ClassCastException {
    return (CustomTopologyMapInlineNodeValueColumn) super.getActualInstance();
  }
}
