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
@JsonDeserialize(using = ReferenceTableColumn.ReferenceTableColumnDeserializer.class)
@JsonSerialize(using = ReferenceTableColumn.ReferenceTableColumnSerializer.class)
public class ReferenceTableColumn extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ReferenceTableColumn.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ReferenceTableColumnSerializer extends StdSerializer<ReferenceTableColumn> {
    public ReferenceTableColumnSerializer(Class<ReferenceTableColumn> t) {
      super(t);
    }

    public ReferenceTableColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReferenceTableColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ReferenceTableColumnDeserializer
      extends StdDeserializer<ReferenceTableColumn> {
    public ReferenceTableColumnDeserializer() {
      this(ReferenceTableColumn.class);
    }

    public ReferenceTableColumnDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ReferenceTableColumn deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize StringReferenceTableColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StringReferenceTableColumn.class.equals(Integer.class)
            || StringReferenceTableColumn.class.equals(Long.class)
            || StringReferenceTableColumn.class.equals(Float.class)
            || StringReferenceTableColumn.class.equals(Double.class)
            || StringReferenceTableColumn.class.equals(Boolean.class)
            || StringReferenceTableColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StringReferenceTableColumn.class.equals(Integer.class)
                        || StringReferenceTableColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StringReferenceTableColumn.class.equals(Float.class)
                        || StringReferenceTableColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StringReferenceTableColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StringReferenceTableColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StringReferenceTableColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StringReferenceTableColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StringReferenceTableColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StringReferenceTableColumn'", e);
      }

      // deserialize NumberReferenceTableColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NumberReferenceTableColumn.class.equals(Integer.class)
            || NumberReferenceTableColumn.class.equals(Long.class)
            || NumberReferenceTableColumn.class.equals(Float.class)
            || NumberReferenceTableColumn.class.equals(Double.class)
            || NumberReferenceTableColumn.class.equals(Boolean.class)
            || NumberReferenceTableColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NumberReferenceTableColumn.class.equals(Integer.class)
                        || NumberReferenceTableColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NumberReferenceTableColumn.class.equals(Float.class)
                        || NumberReferenceTableColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NumberReferenceTableColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NumberReferenceTableColumn.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NumberReferenceTableColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NumberReferenceTableColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NumberReferenceTableColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NumberReferenceTableColumn'", e);
      }

      ReferenceTableColumn ret = new ReferenceTableColumn();
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
    public ReferenceTableColumn getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ReferenceTableColumn cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ReferenceTableColumn() {
    super("oneOf", Boolean.FALSE);
  }

  public ReferenceTableColumn(StringReferenceTableColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ReferenceTableColumn(NumberReferenceTableColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("StringReferenceTableColumn", new GenericType<StringReferenceTableColumn>() {});
    schemas.put("NumberReferenceTableColumn", new GenericType<NumberReferenceTableColumn>() {});
    JSON.registerDescendants(ReferenceTableColumn.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ReferenceTableColumn.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: StringReferenceTableColumn, NumberReferenceTableColumn
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(StringReferenceTableColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NumberReferenceTableColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be StringReferenceTableColumn, NumberReferenceTableColumn");
  }

  /**
   * Get the actual instance, which can be the following: StringReferenceTableColumn,
   * NumberReferenceTableColumn
   *
   * @return The actual instance (StringReferenceTableColumn, NumberReferenceTableColumn)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `StringReferenceTableColumn`. If the actual instance is not
   * `StringReferenceTableColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StringReferenceTableColumn`
   * @throws ClassCastException if the instance is not `StringReferenceTableColumn`
   */
  public StringReferenceTableColumn getStringReferenceTableColumn() throws ClassCastException {
    return (StringReferenceTableColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NumberReferenceTableColumn`. If the actual instance is not
   * `NumberReferenceTableColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NumberReferenceTableColumn`
   * @throws ClassCastException if the instance is not `NumberReferenceTableColumn`
   */
  public NumberReferenceTableColumn getNumberReferenceTableColumn() throws ClassCastException {
    return (NumberReferenceTableColumn) super.getActualInstance();
  }
}
