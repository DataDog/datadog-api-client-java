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
@JsonDeserialize(using = GuidedTableColumn.GuidedTableColumnDeserializer.class)
@JsonSerialize(using = GuidedTableColumn.GuidedTableColumnSerializer.class)
public class GuidedTableColumn extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GuidedTableColumn.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GuidedTableColumnSerializer extends StdSerializer<GuidedTableColumn> {
    public GuidedTableColumnSerializer(Class<GuidedTableColumn> t) {
      super(t);
    }

    public GuidedTableColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(GuidedTableColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GuidedTableColumnDeserializer extends StdDeserializer<GuidedTableColumn> {
    public GuidedTableColumnDeserializer() {
      this(GuidedTableColumn.class);
    }

    public GuidedTableColumnDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GuidedTableColumn deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GuidedTableComputeColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GuidedTableComputeColumn.class.equals(Integer.class)
            || GuidedTableComputeColumn.class.equals(Long.class)
            || GuidedTableComputeColumn.class.equals(Float.class)
            || GuidedTableComputeColumn.class.equals(Double.class)
            || GuidedTableComputeColumn.class.equals(Boolean.class)
            || GuidedTableComputeColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GuidedTableComputeColumn.class.equals(Integer.class)
                        || GuidedTableComputeColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GuidedTableComputeColumn.class.equals(Float.class)
                        || GuidedTableComputeColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GuidedTableComputeColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GuidedTableComputeColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GuidedTableComputeColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GuidedTableComputeColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GuidedTableComputeColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GuidedTableComputeColumn'", e);
      }

      // deserialize GuidedTablePresetColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GuidedTablePresetColumn.class.equals(Integer.class)
            || GuidedTablePresetColumn.class.equals(Long.class)
            || GuidedTablePresetColumn.class.equals(Float.class)
            || GuidedTablePresetColumn.class.equals(Double.class)
            || GuidedTablePresetColumn.class.equals(Boolean.class)
            || GuidedTablePresetColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GuidedTablePresetColumn.class.equals(Integer.class)
                        || GuidedTablePresetColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GuidedTablePresetColumn.class.equals(Float.class)
                        || GuidedTablePresetColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GuidedTablePresetColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GuidedTablePresetColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GuidedTablePresetColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GuidedTablePresetColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GuidedTablePresetColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GuidedTablePresetColumn'", e);
      }

      // deserialize GuidedTableFormulaColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GuidedTableFormulaColumn.class.equals(Integer.class)
            || GuidedTableFormulaColumn.class.equals(Long.class)
            || GuidedTableFormulaColumn.class.equals(Float.class)
            || GuidedTableFormulaColumn.class.equals(Double.class)
            || GuidedTableFormulaColumn.class.equals(Boolean.class)
            || GuidedTableFormulaColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GuidedTableFormulaColumn.class.equals(Integer.class)
                        || GuidedTableFormulaColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GuidedTableFormulaColumn.class.equals(Float.class)
                        || GuidedTableFormulaColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GuidedTableFormulaColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GuidedTableFormulaColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GuidedTableFormulaColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GuidedTableFormulaColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GuidedTableFormulaColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GuidedTableFormulaColumn'", e);
      }

      GuidedTableColumn ret = new GuidedTableColumn();
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
    public GuidedTableColumn getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GuidedTableColumn cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GuidedTableColumn() {
    super("oneOf", Boolean.FALSE);
  }

  public GuidedTableColumn(GuidedTableComputeColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableColumn(GuidedTablePresetColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableColumn(GuidedTableFormulaColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("GuidedTableComputeColumn", new GenericType<GuidedTableComputeColumn>() {});
    schemas.put("GuidedTablePresetColumn", new GenericType<GuidedTablePresetColumn>() {});
    schemas.put("GuidedTableFormulaColumn", new GenericType<GuidedTableFormulaColumn>() {});
    JSON.registerDescendants(GuidedTableColumn.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GuidedTableColumn.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GuidedTableComputeColumn, GuidedTablePresetColumn,
   * GuidedTableFormulaColumn
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(GuidedTableComputeColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GuidedTablePresetColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GuidedTableFormulaColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be GuidedTableComputeColumn, GuidedTablePresetColumn,"
            + " GuidedTableFormulaColumn");
  }

  /**
   * Get the actual instance, which can be the following: GuidedTableComputeColumn,
   * GuidedTablePresetColumn, GuidedTableFormulaColumn
   *
   * @return The actual instance (GuidedTableComputeColumn, GuidedTablePresetColumn,
   *     GuidedTableFormulaColumn)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GuidedTableComputeColumn`. If the actual instance is not
   * `GuidedTableComputeColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GuidedTableComputeColumn`
   * @throws ClassCastException if the instance is not `GuidedTableComputeColumn`
   */
  public GuidedTableComputeColumn getGuidedTableComputeColumn() throws ClassCastException {
    return (GuidedTableComputeColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GuidedTablePresetColumn`. If the actual instance is not
   * `GuidedTablePresetColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GuidedTablePresetColumn`
   * @throws ClassCastException if the instance is not `GuidedTablePresetColumn`
   */
  public GuidedTablePresetColumn getGuidedTablePresetColumn() throws ClassCastException {
    return (GuidedTablePresetColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GuidedTableFormulaColumn`. If the actual instance is not
   * `GuidedTableFormulaColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GuidedTableFormulaColumn`
   * @throws ClassCastException if the instance is not `GuidedTableFormulaColumn`
   */
  public GuidedTableFormulaColumn getGuidedTableFormulaColumn() throws ClassCastException {
    return (GuidedTableFormulaColumn) super.getActualInstance();
  }
}
