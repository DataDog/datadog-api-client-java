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
@JsonDeserialize(using = WidgetSortOrderBy.WidgetSortOrderByDeserializer.class)
@JsonSerialize(using = WidgetSortOrderBy.WidgetSortOrderBySerializer.class)
public class WidgetSortOrderBy extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(WidgetSortOrderBy.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class WidgetSortOrderBySerializer extends StdSerializer<WidgetSortOrderBy> {
    public WidgetSortOrderBySerializer(Class<WidgetSortOrderBy> t) {
      super(t);
    }

    public WidgetSortOrderBySerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetSortOrderBy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class WidgetSortOrderByDeserializer extends StdDeserializer<WidgetSortOrderBy> {
    public WidgetSortOrderByDeserializer() {
      this(WidgetSortOrderBy.class);
    }

    public WidgetSortOrderByDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public WidgetSortOrderBy deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize WidgetFormulaSort
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetFormulaSort.class.equals(Integer.class)
            || WidgetFormulaSort.class.equals(Long.class)
            || WidgetFormulaSort.class.equals(Float.class)
            || WidgetFormulaSort.class.equals(Double.class)
            || WidgetFormulaSort.class.equals(Boolean.class)
            || WidgetFormulaSort.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetFormulaSort.class.equals(Integer.class)
                        || WidgetFormulaSort.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetFormulaSort.class.equals(Float.class)
                        || WidgetFormulaSort.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetFormulaSort.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetFormulaSort.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetFormulaSort.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetFormulaSort) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetFormulaSort'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WidgetFormulaSort'", e);
      }

      // deserialize WidgetGroupSort
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WidgetGroupSort.class.equals(Integer.class)
            || WidgetGroupSort.class.equals(Long.class)
            || WidgetGroupSort.class.equals(Float.class)
            || WidgetGroupSort.class.equals(Double.class)
            || WidgetGroupSort.class.equals(Boolean.class)
            || WidgetGroupSort.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WidgetGroupSort.class.equals(Integer.class)
                        || WidgetGroupSort.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WidgetGroupSort.class.equals(Float.class)
                        || WidgetGroupSort.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WidgetGroupSort.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WidgetGroupSort.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WidgetGroupSort.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WidgetGroupSort) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WidgetGroupSort'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WidgetGroupSort'", e);
      }

      WidgetSortOrderBy ret = new WidgetSortOrderBy();
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
    public WidgetSortOrderBy getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "WidgetSortOrderBy cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public WidgetSortOrderBy() {
    super("oneOf", Boolean.FALSE);
  }

  public WidgetSortOrderBy(WidgetFormulaSort o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetSortOrderBy(WidgetGroupSort o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("WidgetFormulaSort", new GenericType<WidgetFormulaSort>() {});
    schemas.put("WidgetGroupSort", new GenericType<WidgetGroupSort>() {});
    JSON.registerDescendants(WidgetSortOrderBy.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return WidgetSortOrderBy.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: WidgetFormulaSort, WidgetGroupSort
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(WidgetFormulaSort.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(WidgetGroupSort.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be WidgetFormulaSort, WidgetGroupSort");
  }

  /**
   * Get the actual instance, which can be the following: WidgetFormulaSort, WidgetGroupSort
   *
   * @return The actual instance (WidgetFormulaSort, WidgetGroupSort)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetFormulaSort`. If the actual instance is not
   * `WidgetFormulaSort`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetFormulaSort`
   * @throws ClassCastException if the instance is not `WidgetFormulaSort`
   */
  public WidgetFormulaSort getWidgetFormulaSort() throws ClassCastException {
    return (WidgetFormulaSort) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WidgetGroupSort`. If the actual instance is not `WidgetGroupSort`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `WidgetGroupSort`
   * @throws ClassCastException if the instance is not `WidgetGroupSort`
   */
  public WidgetGroupSort getWidgetGroupSort() throws ClassCastException {
    return (WidgetGroupSort) super.getActualInstance();
  }
}
