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
@JsonDeserialize(using = TableColumnComparison.TableColumnComparisonDeserializer.class)
@JsonSerialize(using = TableColumnComparison.TableColumnComparisonSerializer.class)
public class TableColumnComparison extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TableColumnComparison.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TableColumnComparisonSerializer extends StdSerializer<TableColumnComparison> {
    public TableColumnComparisonSerializer(Class<TableColumnComparison> t) {
      super(t);
    }

    public TableColumnComparisonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TableColumnComparison value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TableColumnComparisonDeserializer
      extends StdDeserializer<TableColumnComparison> {
    public TableColumnComparisonDeserializer() {
      this(TableColumnComparison.class);
    }

    public TableColumnComparisonDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TableColumnComparison deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TableColumnComparisonWithSelf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableColumnComparisonWithSelf.class.equals(Integer.class)
            || TableColumnComparisonWithSelf.class.equals(Long.class)
            || TableColumnComparisonWithSelf.class.equals(Float.class)
            || TableColumnComparisonWithSelf.class.equals(Double.class)
            || TableColumnComparisonWithSelf.class.equals(Boolean.class)
            || TableColumnComparisonWithSelf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableColumnComparisonWithSelf.class.equals(Integer.class)
                        || TableColumnComparisonWithSelf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableColumnComparisonWithSelf.class.equals(Float.class)
                        || TableColumnComparisonWithSelf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableColumnComparisonWithSelf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableColumnComparisonWithSelf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TableColumnComparisonWithSelf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableColumnComparisonWithSelf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TableColumnComparisonWithSelf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TableColumnComparisonWithSelf'", e);
      }

      // deserialize TableColumnComparisonWithOtherColumnDiffFrom
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Integer.class)
            || TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Long.class)
            || TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Float.class)
            || TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Double.class)
            || TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Boolean.class)
            || TableColumnComparisonWithOtherColumnDiffFrom.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Integer.class)
                        || TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Float.class)
                        || TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableColumnComparisonWithOtherColumnDiffFrom.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableColumnComparisonWithOtherColumnDiffFrom.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TableColumnComparisonWithOtherColumnDiffFrom.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableColumnComparisonWithOtherColumnDiffFrom) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TableColumnComparisonWithOtherColumnDiffFrom'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TableColumnComparisonWithOtherColumnDiffFrom'",
            e);
      }

      // deserialize TableColumnComparisonWithOtherColumnPercentOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableColumnComparisonWithOtherColumnPercentOf.class.equals(Integer.class)
            || TableColumnComparisonWithOtherColumnPercentOf.class.equals(Long.class)
            || TableColumnComparisonWithOtherColumnPercentOf.class.equals(Float.class)
            || TableColumnComparisonWithOtherColumnPercentOf.class.equals(Double.class)
            || TableColumnComparisonWithOtherColumnPercentOf.class.equals(Boolean.class)
            || TableColumnComparisonWithOtherColumnPercentOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableColumnComparisonWithOtherColumnPercentOf.class.equals(Integer.class)
                        || TableColumnComparisonWithOtherColumnPercentOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableColumnComparisonWithOtherColumnPercentOf.class.equals(Float.class)
                        || TableColumnComparisonWithOtherColumnPercentOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableColumnComparisonWithOtherColumnPercentOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableColumnComparisonWithOtherColumnPercentOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TableColumnComparisonWithOtherColumnPercentOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableColumnComparisonWithOtherColumnPercentOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TableColumnComparisonWithOtherColumnPercentOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TableColumnComparisonWithOtherColumnPercentOf'",
            e);
      }

      // deserialize TableColumnComparisonWithOtherColumnPercentDiffFrom
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Integer.class)
            || TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Long.class)
            || TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Float.class)
            || TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Double.class)
            || TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Boolean.class)
            || TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Integer.class)
                        || TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Float.class)
                        || TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableColumnComparisonWithOtherColumnPercentDiffFrom.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TableColumnComparisonWithOtherColumnPercentDiffFrom.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableColumnComparisonWithOtherColumnPercentDiffFrom) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TableColumnComparisonWithOtherColumnPercentDiffFrom'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'TableColumnComparisonWithOtherColumnPercentDiffFrom'",
            e);
      }

      TableColumnComparison ret = new TableColumnComparison();
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
    public TableColumnComparison getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TableColumnComparison cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TableColumnComparison() {
    super("oneOf", Boolean.FALSE);
  }

  public TableColumnComparison(TableColumnComparisonWithSelf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumnComparison(TableColumnComparisonWithOtherColumnDiffFrom o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumnComparison(TableColumnComparisonWithOtherColumnPercentOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumnComparison(TableColumnComparisonWithOtherColumnPercentDiffFrom o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TableColumnComparisonWithSelf", new GenericType<TableColumnComparisonWithSelf>() {});
    schemas.put(
        "TableColumnComparisonWithOtherColumnDiffFrom",
        new GenericType<TableColumnComparisonWithOtherColumnDiffFrom>() {});
    schemas.put(
        "TableColumnComparisonWithOtherColumnPercentOf",
        new GenericType<TableColumnComparisonWithOtherColumnPercentOf>() {});
    schemas.put(
        "TableColumnComparisonWithOtherColumnPercentDiffFrom",
        new GenericType<TableColumnComparisonWithOtherColumnPercentDiffFrom>() {});
    JSON.registerDescendants(TableColumnComparison.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TableColumnComparison.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TableColumnComparisonWithSelf,
   * TableColumnComparisonWithOtherColumnDiffFrom, TableColumnComparisonWithOtherColumnPercentOf,
   * TableColumnComparisonWithOtherColumnPercentDiffFrom
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TableColumnComparisonWithSelf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TableColumnComparisonWithOtherColumnDiffFrom.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TableColumnComparisonWithOtherColumnPercentOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TableColumnComparisonWithOtherColumnPercentDiffFrom.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TableColumnComparisonWithSelf,"
            + " TableColumnComparisonWithOtherColumnDiffFrom,"
            + " TableColumnComparisonWithOtherColumnPercentOf,"
            + " TableColumnComparisonWithOtherColumnPercentDiffFrom");
  }

  /**
   * Get the actual instance, which can be the following: TableColumnComparisonWithSelf,
   * TableColumnComparisonWithOtherColumnDiffFrom, TableColumnComparisonWithOtherColumnPercentOf,
   * TableColumnComparisonWithOtherColumnPercentDiffFrom
   *
   * @return The actual instance (TableColumnComparisonWithSelf,
   *     TableColumnComparisonWithOtherColumnDiffFrom,
   *     TableColumnComparisonWithOtherColumnPercentOf,
   *     TableColumnComparisonWithOtherColumnPercentDiffFrom)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableColumnComparisonWithSelf`. If the actual instance is not
   * `TableColumnComparisonWithSelf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TableColumnComparisonWithSelf`
   * @throws ClassCastException if the instance is not `TableColumnComparisonWithSelf`
   */
  public TableColumnComparisonWithSelf getTableColumnComparisonWithSelf()
      throws ClassCastException {
    return (TableColumnComparisonWithSelf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableColumnComparisonWithOtherColumnDiffFrom`. If the actual
   * instance is not `TableColumnComparisonWithOtherColumnDiffFrom`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TableColumnComparisonWithOtherColumnDiffFrom`
   * @throws ClassCastException if the instance is not
   *     `TableColumnComparisonWithOtherColumnDiffFrom`
   */
  public TableColumnComparisonWithOtherColumnDiffFrom
      getTableColumnComparisonWithOtherColumnDiffFrom() throws ClassCastException {
    return (TableColumnComparisonWithOtherColumnDiffFrom) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableColumnComparisonWithOtherColumnPercentOf`. If the actual
   * instance is not `TableColumnComparisonWithOtherColumnPercentOf`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `TableColumnComparisonWithOtherColumnPercentOf`
   * @throws ClassCastException if the instance is not
   *     `TableColumnComparisonWithOtherColumnPercentOf`
   */
  public TableColumnComparisonWithOtherColumnPercentOf
      getTableColumnComparisonWithOtherColumnPercentOf() throws ClassCastException {
    return (TableColumnComparisonWithOtherColumnPercentOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableColumnComparisonWithOtherColumnPercentDiffFrom`. If the actual
   * instance is not `TableColumnComparisonWithOtherColumnPercentDiffFrom`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `TableColumnComparisonWithOtherColumnPercentDiffFrom`
   * @throws ClassCastException if the instance is not
   *     `TableColumnComparisonWithOtherColumnPercentDiffFrom`
   */
  public TableColumnComparisonWithOtherColumnPercentDiffFrom
      getTableColumnComparisonWithOtherColumnPercentDiffFrom() throws ClassCastException {
    return (TableColumnComparisonWithOtherColumnPercentDiffFrom) super.getActualInstance();
  }
}
