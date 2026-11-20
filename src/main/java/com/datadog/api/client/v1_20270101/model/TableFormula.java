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
@JsonDeserialize(using = TableFormula.TableFormulaDeserializer.class)
@JsonSerialize(using = TableFormula.TableFormulaSerializer.class)
public class TableFormula extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TableFormula.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TableFormulaSerializer extends StdSerializer<TableFormula> {
    public TableFormulaSerializer(Class<TableFormula> t) {
      super(t);
    }

    public TableFormulaSerializer() {
      this(null);
    }

    @Override
    public void serialize(TableFormula value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TableFormulaDeserializer extends StdDeserializer<TableFormula> {
    public TableFormulaDeserializer() {
      this(TableFormula.class);
    }

    public TableFormulaDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TableFormula deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TableFormula20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableFormula20270101OneOf.class.equals(Integer.class)
            || TableFormula20270101OneOf.class.equals(Long.class)
            || TableFormula20270101OneOf.class.equals(Float.class)
            || TableFormula20270101OneOf.class.equals(Double.class)
            || TableFormula20270101OneOf.class.equals(Boolean.class)
            || TableFormula20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableFormula20270101OneOf.class.equals(Integer.class)
                        || TableFormula20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableFormula20270101OneOf.class.equals(Float.class)
                        || TableFormula20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableFormula20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableFormula20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TableFormula20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableFormula20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TableFormula20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TableFormula20270101OneOf'", e);
      }

      // deserialize TableFormula20270101OneOf4462669760
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableFormula20270101OneOf4462669760.class.equals(Integer.class)
            || TableFormula20270101OneOf4462669760.class.equals(Long.class)
            || TableFormula20270101OneOf4462669760.class.equals(Float.class)
            || TableFormula20270101OneOf4462669760.class.equals(Double.class)
            || TableFormula20270101OneOf4462669760.class.equals(Boolean.class)
            || TableFormula20270101OneOf4462669760.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableFormula20270101OneOf4462669760.class.equals(Integer.class)
                        || TableFormula20270101OneOf4462669760.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableFormula20270101OneOf4462669760.class.equals(Float.class)
                        || TableFormula20270101OneOf4462669760.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableFormula20270101OneOf4462669760.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableFormula20270101OneOf4462669760.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TableFormula20270101OneOf4462669760.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableFormula20270101OneOf4462669760) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TableFormula20270101OneOf4462669760'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TableFormula20270101OneOf4462669760'",
            e);
      }

      TableFormula ret = new TableFormula();
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
    public TableFormula getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TableFormula cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TableFormula() {
    super("oneOf", Boolean.FALSE);
  }

  public TableFormula(TableFormula20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableFormula(TableFormula20270101OneOf4462669760 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TableFormula20270101OneOf", new GenericType<TableFormula20270101OneOf>() {});
    schemas.put(
        "TableFormula20270101OneOf4462669760",
        new GenericType<TableFormula20270101OneOf4462669760>() {});
    JSON.registerDescendants(TableFormula.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TableFormula.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TableFormula20270101OneOf, TableFormula20270101OneOf4462669760
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TableFormula20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TableFormula20270101OneOf4462669760.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TableFormula20270101OneOf,"
            + " TableFormula20270101OneOf4462669760");
  }

  /**
   * Get the actual instance, which can be the following: TableFormula20270101OneOf,
   * TableFormula20270101OneOf4462669760
   *
   * @return The actual instance (TableFormula20270101OneOf, TableFormula20270101OneOf4462669760)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableFormula20270101OneOf`. If the actual instance is not
   * `TableFormula20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TableFormula20270101OneOf`
   * @throws ClassCastException if the instance is not `TableFormula20270101OneOf`
   */
  public TableFormula20270101OneOf getTableFormula20270101OneOf() throws ClassCastException {
    return (TableFormula20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableFormula20270101OneOf4462669760`. If the actual instance is not
   * `TableFormula20270101OneOf4462669760`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TableFormula20270101OneOf4462669760`
   * @throws ClassCastException if the instance is not `TableFormula20270101OneOf4462669760`
   */
  public TableFormula20270101OneOf4462669760 getTableFormula20270101OneOf4462669760()
      throws ClassCastException {
    return (TableFormula20270101OneOf4462669760) super.getActualInstance();
  }
}
