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
@JsonDeserialize(using = TopologyMapInlineNodeColumn.TopologyMapInlineNodeColumnDeserializer.class)
@JsonSerialize(using = TopologyMapInlineNodeColumn.TopologyMapInlineNodeColumnSerializer.class)
public class TopologyMapInlineNodeColumn extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TopologyMapInlineNodeColumn.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TopologyMapInlineNodeColumnSerializer
      extends StdSerializer<TopologyMapInlineNodeColumn> {
    public TopologyMapInlineNodeColumnSerializer(Class<TopologyMapInlineNodeColumn> t) {
      super(t);
    }

    public TopologyMapInlineNodeColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyMapInlineNodeColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TopologyMapInlineNodeColumnDeserializer
      extends StdDeserializer<TopologyMapInlineNodeColumn> {
    public TopologyMapInlineNodeColumnDeserializer() {
      this(TopologyMapInlineNodeColumn.class);
    }

    public TopologyMapInlineNodeColumnDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TopologyMapInlineNodeColumn deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TopologyMapInlineNodeIdColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TopologyMapInlineNodeIdColumn.class.equals(Integer.class)
            || TopologyMapInlineNodeIdColumn.class.equals(Long.class)
            || TopologyMapInlineNodeIdColumn.class.equals(Float.class)
            || TopologyMapInlineNodeIdColumn.class.equals(Double.class)
            || TopologyMapInlineNodeIdColumn.class.equals(Boolean.class)
            || TopologyMapInlineNodeIdColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TopologyMapInlineNodeIdColumn.class.equals(Integer.class)
                        || TopologyMapInlineNodeIdColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TopologyMapInlineNodeIdColumn.class.equals(Float.class)
                        || TopologyMapInlineNodeIdColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TopologyMapInlineNodeIdColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TopologyMapInlineNodeIdColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TopologyMapInlineNodeIdColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TopologyMapInlineNodeIdColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TopologyMapInlineNodeIdColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TopologyMapInlineNodeIdColumn'", e);
      }

      // deserialize TopologyMapInlineNodeStringColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TopologyMapInlineNodeStringColumn.class.equals(Integer.class)
            || TopologyMapInlineNodeStringColumn.class.equals(Long.class)
            || TopologyMapInlineNodeStringColumn.class.equals(Float.class)
            || TopologyMapInlineNodeStringColumn.class.equals(Double.class)
            || TopologyMapInlineNodeStringColumn.class.equals(Boolean.class)
            || TopologyMapInlineNodeStringColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TopologyMapInlineNodeStringColumn.class.equals(Integer.class)
                        || TopologyMapInlineNodeStringColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TopologyMapInlineNodeStringColumn.class.equals(Float.class)
                        || TopologyMapInlineNodeStringColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TopologyMapInlineNodeStringColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TopologyMapInlineNodeStringColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TopologyMapInlineNodeStringColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TopologyMapInlineNodeStringColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TopologyMapInlineNodeStringColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TopologyMapInlineNodeStringColumn'", e);
      }

      // deserialize TopologyMapInlineNodeValueColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TopologyMapInlineNodeValueColumn.class.equals(Integer.class)
            || TopologyMapInlineNodeValueColumn.class.equals(Long.class)
            || TopologyMapInlineNodeValueColumn.class.equals(Float.class)
            || TopologyMapInlineNodeValueColumn.class.equals(Double.class)
            || TopologyMapInlineNodeValueColumn.class.equals(Boolean.class)
            || TopologyMapInlineNodeValueColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TopologyMapInlineNodeValueColumn.class.equals(Integer.class)
                        || TopologyMapInlineNodeValueColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TopologyMapInlineNodeValueColumn.class.equals(Float.class)
                        || TopologyMapInlineNodeValueColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TopologyMapInlineNodeValueColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TopologyMapInlineNodeValueColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TopologyMapInlineNodeValueColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TopologyMapInlineNodeValueColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TopologyMapInlineNodeValueColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TopologyMapInlineNodeValueColumn'", e);
      }

      TopologyMapInlineNodeColumn ret = new TopologyMapInlineNodeColumn();
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
    public TopologyMapInlineNodeColumn getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TopologyMapInlineNodeColumn cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TopologyMapInlineNodeColumn() {
    super("oneOf", Boolean.FALSE);
  }

  public TopologyMapInlineNodeColumn(TopologyMapInlineNodeIdColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TopologyMapInlineNodeColumn(TopologyMapInlineNodeStringColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TopologyMapInlineNodeColumn(TopologyMapInlineNodeValueColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TopologyMapInlineNodeIdColumn", new GenericType<TopologyMapInlineNodeIdColumn>() {});
    schemas.put(
        "TopologyMapInlineNodeStringColumn",
        new GenericType<TopologyMapInlineNodeStringColumn>() {});
    schemas.put(
        "TopologyMapInlineNodeValueColumn", new GenericType<TopologyMapInlineNodeValueColumn>() {});
    JSON.registerDescendants(
        TopologyMapInlineNodeColumn.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TopologyMapInlineNodeColumn.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TopologyMapInlineNodeIdColumn,
   * TopologyMapInlineNodeStringColumn, TopologyMapInlineNodeValueColumn
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TopologyMapInlineNodeIdColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TopologyMapInlineNodeStringColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TopologyMapInlineNodeValueColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TopologyMapInlineNodeIdColumn,"
            + " TopologyMapInlineNodeStringColumn, TopologyMapInlineNodeValueColumn");
  }

  /**
   * Get the actual instance, which can be the following: TopologyMapInlineNodeIdColumn,
   * TopologyMapInlineNodeStringColumn, TopologyMapInlineNodeValueColumn
   *
   * @return The actual instance (TopologyMapInlineNodeIdColumn, TopologyMapInlineNodeStringColumn,
   *     TopologyMapInlineNodeValueColumn)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TopologyMapInlineNodeIdColumn`. If the actual instance is not
   * `TopologyMapInlineNodeIdColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TopologyMapInlineNodeIdColumn`
   * @throws ClassCastException if the instance is not `TopologyMapInlineNodeIdColumn`
   */
  public TopologyMapInlineNodeIdColumn getTopologyMapInlineNodeIdColumn()
      throws ClassCastException {
    return (TopologyMapInlineNodeIdColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TopologyMapInlineNodeStringColumn`. If the actual instance is not
   * `TopologyMapInlineNodeStringColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TopologyMapInlineNodeStringColumn`
   * @throws ClassCastException if the instance is not `TopologyMapInlineNodeStringColumn`
   */
  public TopologyMapInlineNodeStringColumn getTopologyMapInlineNodeStringColumn()
      throws ClassCastException {
    return (TopologyMapInlineNodeStringColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TopologyMapInlineNodeValueColumn`. If the actual instance is not
   * `TopologyMapInlineNodeValueColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TopologyMapInlineNodeValueColumn`
   * @throws ClassCastException if the instance is not `TopologyMapInlineNodeValueColumn`
   */
  public TopologyMapInlineNodeValueColumn getTopologyMapInlineNodeValueColumn()
      throws ClassCastException {
    return (TopologyMapInlineNodeValueColumn) super.getActualInstance();
  }
}
