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
@JsonDeserialize(using = ScalarFormulaOrderBy.ScalarFormulaOrderByDeserializer.class)
@JsonSerialize(using = ScalarFormulaOrderBy.ScalarFormulaOrderBySerializer.class)
public class ScalarFormulaOrderBy extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ScalarFormulaOrderBy.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ScalarFormulaOrderBySerializer extends StdSerializer<ScalarFormulaOrderBy> {
    public ScalarFormulaOrderBySerializer(Class<ScalarFormulaOrderBy> t) {
      super(t);
    }

    public ScalarFormulaOrderBySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScalarFormulaOrderBy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ScalarFormulaOrderByDeserializer
      extends StdDeserializer<ScalarFormulaOrderBy> {
    public ScalarFormulaOrderByDeserializer() {
      this(ScalarFormulaOrderBy.class);
    }

    public ScalarFormulaOrderByDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ScalarFormulaOrderBy deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FormulaOrderByGroup
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaOrderByGroup.class.equals(Integer.class)
            || FormulaOrderByGroup.class.equals(Long.class)
            || FormulaOrderByGroup.class.equals(Float.class)
            || FormulaOrderByGroup.class.equals(Double.class)
            || FormulaOrderByGroup.class.equals(Boolean.class)
            || FormulaOrderByGroup.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaOrderByGroup.class.equals(Integer.class)
                        || FormulaOrderByGroup.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaOrderByGroup.class.equals(Float.class)
                        || FormulaOrderByGroup.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaOrderByGroup.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaOrderByGroup.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaOrderByGroup.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaOrderByGroup) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaOrderByGroup'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaOrderByGroup'", e);
      }

      // deserialize FormulaOrderByFormulaIndex
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaOrderByFormulaIndex.class.equals(Integer.class)
            || FormulaOrderByFormulaIndex.class.equals(Long.class)
            || FormulaOrderByFormulaIndex.class.equals(Float.class)
            || FormulaOrderByFormulaIndex.class.equals(Double.class)
            || FormulaOrderByFormulaIndex.class.equals(Boolean.class)
            || FormulaOrderByFormulaIndex.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaOrderByFormulaIndex.class.equals(Integer.class)
                        || FormulaOrderByFormulaIndex.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaOrderByFormulaIndex.class.equals(Float.class)
                        || FormulaOrderByFormulaIndex.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaOrderByFormulaIndex.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaOrderByFormulaIndex.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FormulaOrderByFormulaIndex.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaOrderByFormulaIndex) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FormulaOrderByFormulaIndex'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FormulaOrderByFormulaIndex'", e);
      }

      ScalarFormulaOrderBy ret = new ScalarFormulaOrderBy();
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
    public ScalarFormulaOrderBy getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ScalarFormulaOrderBy cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ScalarFormulaOrderBy() {
    super("oneOf", Boolean.FALSE);
  }

  public ScalarFormulaOrderBy(FormulaOrderByGroup o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarFormulaOrderBy(FormulaOrderByFormulaIndex o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FormulaOrderByGroup", new GenericType<FormulaOrderByGroup>() {});
    schemas.put("FormulaOrderByFormulaIndex", new GenericType<FormulaOrderByFormulaIndex>() {});
    JSON.registerDescendants(ScalarFormulaOrderBy.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ScalarFormulaOrderBy.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FormulaOrderByGroup, FormulaOrderByFormulaIndex
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(FormulaOrderByGroup.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FormulaOrderByFormulaIndex.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FormulaOrderByGroup, FormulaOrderByFormulaIndex");
  }

  /**
   * Get the actual instance, which can be the following: FormulaOrderByGroup,
   * FormulaOrderByFormulaIndex
   *
   * @return The actual instance (FormulaOrderByGroup, FormulaOrderByFormulaIndex)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaOrderByGroup`. If the actual instance is not
   * `FormulaOrderByGroup`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaOrderByGroup`
   * @throws ClassCastException if the instance is not `FormulaOrderByGroup`
   */
  public FormulaOrderByGroup getFormulaOrderByGroup() throws ClassCastException {
    return (FormulaOrderByGroup) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaOrderByFormulaIndex`. If the actual instance is not
   * `FormulaOrderByFormulaIndex`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FormulaOrderByFormulaIndex`
   * @throws ClassCastException if the instance is not `FormulaOrderByFormulaIndex`
   */
  public FormulaOrderByFormulaIndex getFormulaOrderByFormulaIndex() throws ClassCastException {
    return (FormulaOrderByFormulaIndex) super.getActualInstance();
  }
}
