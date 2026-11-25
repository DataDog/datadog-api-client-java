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
@JsonDeserialize(using = TableColumn.TableColumnDeserializer.class)
@JsonSerialize(using = TableColumn.TableColumnSerializer.class)
public class TableColumn extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TableColumn.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TableColumnSerializer extends StdSerializer<TableColumn> {
    public TableColumnSerializer(Class<TableColumn> t) {
      super(t);
    }

    public TableColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(TableColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TableColumnDeserializer extends StdDeserializer<TableColumn> {
    public TableColumnDeserializer() {
      this(TableColumn.class);
    }

    public TableColumnDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TableColumn deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ComputeTableColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ComputeTableColumn.class.equals(Integer.class)
            || ComputeTableColumn.class.equals(Long.class)
            || ComputeTableColumn.class.equals(Float.class)
            || ComputeTableColumn.class.equals(Double.class)
            || ComputeTableColumn.class.equals(Boolean.class)
            || ComputeTableColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ComputeTableColumn.class.equals(Integer.class)
                        || ComputeTableColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ComputeTableColumn.class.equals(Float.class)
                        || ComputeTableColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ComputeTableColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ComputeTableColumn.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ComputeTableColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ComputeTableColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ComputeTableColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ComputeTableColumn'", e);
      }

      // deserialize PresetPeriodTableColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PresetPeriodTableColumn.class.equals(Integer.class)
            || PresetPeriodTableColumn.class.equals(Long.class)
            || PresetPeriodTableColumn.class.equals(Float.class)
            || PresetPeriodTableColumn.class.equals(Double.class)
            || PresetPeriodTableColumn.class.equals(Boolean.class)
            || PresetPeriodTableColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PresetPeriodTableColumn.class.equals(Integer.class)
                        || PresetPeriodTableColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PresetPeriodTableColumn.class.equals(Float.class)
                        || PresetPeriodTableColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PresetPeriodTableColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PresetPeriodTableColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PresetPeriodTableColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PresetPeriodTableColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PresetPeriodTableColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PresetPeriodTableColumn'", e);
      }

      // deserialize FormulaTableColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaTableColumn.class.equals(Integer.class)
            || FormulaTableColumn.class.equals(Long.class)
            || FormulaTableColumn.class.equals(Float.class)
            || FormulaTableColumn.class.equals(Double.class)
            || FormulaTableColumn.class.equals(Boolean.class)
            || FormulaTableColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaTableColumn.class.equals(Integer.class)
                        || FormulaTableColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaTableColumn.class.equals(Float.class)
                        || FormulaTableColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaTableColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaTableColumn.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaTableColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaTableColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaTableColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaTableColumn'", e);
      }

      // deserialize ReferenceTableColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ReferenceTableColumn.class.equals(Integer.class)
            || ReferenceTableColumn.class.equals(Long.class)
            || ReferenceTableColumn.class.equals(Float.class)
            || ReferenceTableColumn.class.equals(Double.class)
            || ReferenceTableColumn.class.equals(Boolean.class)
            || ReferenceTableColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ReferenceTableColumn.class.equals(Integer.class)
                        || ReferenceTableColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ReferenceTableColumn.class.equals(Float.class)
                        || ReferenceTableColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ReferenceTableColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ReferenceTableColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ReferenceTableColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ReferenceTableColumn) tmp).unparsed
              && !(((ReferenceTableColumn) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ReferenceTableColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ReferenceTableColumn'", e);
      }

      TableColumn ret = new TableColumn();
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
    public TableColumn getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TableColumn cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TableColumn() {
    super("oneOf", Boolean.FALSE);
  }

  public TableColumn(ComputeTableColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumn(PresetPeriodTableColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumn(FormulaTableColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumn(ReferenceTableColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ComputeTableColumn", new GenericType<ComputeTableColumn>() {});
    schemas.put("PresetPeriodTableColumn", new GenericType<PresetPeriodTableColumn>() {});
    schemas.put("FormulaTableColumn", new GenericType<FormulaTableColumn>() {});
    schemas.put("ReferenceTableColumn", new GenericType<ReferenceTableColumn>() {});
    JSON.registerDescendants(TableColumn.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TableColumn.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ComputeTableColumn, PresetPeriodTableColumn,
   * FormulaTableColumn, ReferenceTableColumn
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ComputeTableColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PresetPeriodTableColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaTableColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ReferenceTableColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ComputeTableColumn, PresetPeriodTableColumn,"
            + " FormulaTableColumn, ReferenceTableColumn");
  }

  /**
   * Get the actual instance, which can be the following: ComputeTableColumn,
   * PresetPeriodTableColumn, FormulaTableColumn, ReferenceTableColumn
   *
   * @return The actual instance (ComputeTableColumn, PresetPeriodTableColumn, FormulaTableColumn,
   *     ReferenceTableColumn)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ComputeTableColumn`. If the actual instance is not
   * `ComputeTableColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ComputeTableColumn`
   * @throws ClassCastException if the instance is not `ComputeTableColumn`
   */
  public ComputeTableColumn getComputeTableColumn() throws ClassCastException {
    return (ComputeTableColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PresetPeriodTableColumn`. If the actual instance is not
   * `PresetPeriodTableColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PresetPeriodTableColumn`
   * @throws ClassCastException if the instance is not `PresetPeriodTableColumn`
   */
  public PresetPeriodTableColumn getPresetPeriodTableColumn() throws ClassCastException {
    return (PresetPeriodTableColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaTableColumn`. If the actual instance is not
   * `FormulaTableColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaTableColumn`
   * @throws ClassCastException if the instance is not `FormulaTableColumn`
   */
  public FormulaTableColumn getFormulaTableColumn() throws ClassCastException {
    return (FormulaTableColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ReferenceTableColumn`. If the actual instance is not
   * `ReferenceTableColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ReferenceTableColumn`
   * @throws ClassCastException if the instance is not `ReferenceTableColumn`
   */
  public ReferenceTableColumn getReferenceTableColumn() throws ClassCastException {
    return (ReferenceTableColumn) super.getActualInstance();
  }
}
