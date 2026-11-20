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
@JsonDeserialize(using = TableColumnFormat.TableColumnFormatDeserializer.class)
@JsonSerialize(using = TableColumnFormat.TableColumnFormatSerializer.class)
public class TableColumnFormat extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TableColumnFormat.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TableColumnFormatSerializer extends StdSerializer<TableColumnFormat> {
    public TableColumnFormatSerializer(Class<TableColumnFormat> t) {
      super(t);
    }

    public TableColumnFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(TableColumnFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TableColumnFormatDeserializer extends StdDeserializer<TableColumnFormat> {
    public TableColumnFormatDeserializer() {
      this(TableColumnFormat.class);
    }

    public TableColumnFormatDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TableColumnFormat deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize NumberBarTableColumnFormatNumber
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NumberBarTableColumnFormatNumber.class.equals(Integer.class)
            || NumberBarTableColumnFormatNumber.class.equals(Long.class)
            || NumberBarTableColumnFormatNumber.class.equals(Float.class)
            || NumberBarTableColumnFormatNumber.class.equals(Double.class)
            || NumberBarTableColumnFormatNumber.class.equals(Boolean.class)
            || NumberBarTableColumnFormatNumber.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NumberBarTableColumnFormatNumber.class.equals(Integer.class)
                        || NumberBarTableColumnFormatNumber.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NumberBarTableColumnFormatNumber.class.equals(Float.class)
                        || NumberBarTableColumnFormatNumber.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NumberBarTableColumnFormatNumber.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NumberBarTableColumnFormatNumber.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NumberBarTableColumnFormatNumber.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NumberBarTableColumnFormatNumber) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NumberBarTableColumnFormatNumber'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'NumberBarTableColumnFormatNumber'", e);
      }

      // deserialize NumberBarTableColumnFormatBar
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NumberBarTableColumnFormatBar.class.equals(Integer.class)
            || NumberBarTableColumnFormatBar.class.equals(Long.class)
            || NumberBarTableColumnFormatBar.class.equals(Float.class)
            || NumberBarTableColumnFormatBar.class.equals(Double.class)
            || NumberBarTableColumnFormatBar.class.equals(Boolean.class)
            || NumberBarTableColumnFormatBar.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NumberBarTableColumnFormatBar.class.equals(Integer.class)
                        || NumberBarTableColumnFormatBar.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NumberBarTableColumnFormatBar.class.equals(Float.class)
                        || NumberBarTableColumnFormatBar.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NumberBarTableColumnFormatBar.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NumberBarTableColumnFormatBar.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NumberBarTableColumnFormatBar.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NumberBarTableColumnFormatBar) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NumberBarTableColumnFormatBar'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NumberBarTableColumnFormatBar'", e);
      }

      // deserialize TrendTableColumnFormat
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TrendTableColumnFormat.class.equals(Integer.class)
            || TrendTableColumnFormat.class.equals(Long.class)
            || TrendTableColumnFormat.class.equals(Float.class)
            || TrendTableColumnFormat.class.equals(Double.class)
            || TrendTableColumnFormat.class.equals(Boolean.class)
            || TrendTableColumnFormat.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TrendTableColumnFormat.class.equals(Integer.class)
                        || TrendTableColumnFormat.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TrendTableColumnFormat.class.equals(Float.class)
                        || TrendTableColumnFormat.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TrendTableColumnFormat.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TrendTableColumnFormat.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TrendTableColumnFormat.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TrendTableColumnFormat) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TrendTableColumnFormat'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TrendTableColumnFormat'", e);
      }

      // deserialize StringTableColumnFormat
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StringTableColumnFormat.class.equals(Integer.class)
            || StringTableColumnFormat.class.equals(Long.class)
            || StringTableColumnFormat.class.equals(Float.class)
            || StringTableColumnFormat.class.equals(Double.class)
            || StringTableColumnFormat.class.equals(Boolean.class)
            || StringTableColumnFormat.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StringTableColumnFormat.class.equals(Integer.class)
                        || StringTableColumnFormat.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StringTableColumnFormat.class.equals(Float.class)
                        || StringTableColumnFormat.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StringTableColumnFormat.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StringTableColumnFormat.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StringTableColumnFormat.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StringTableColumnFormat) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StringTableColumnFormat'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StringTableColumnFormat'", e);
      }

      TableColumnFormat ret = new TableColumnFormat();
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
    public TableColumnFormat getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TableColumnFormat cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TableColumnFormat() {
    super("oneOf", Boolean.FALSE);
  }

  public TableColumnFormat(NumberBarTableColumnFormatNumber o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumnFormat(NumberBarTableColumnFormatBar o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumnFormat(TrendTableColumnFormat o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableColumnFormat(StringTableColumnFormat o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "NumberBarTableColumnFormatNumber", new GenericType<NumberBarTableColumnFormatNumber>() {});
    schemas.put(
        "NumberBarTableColumnFormatBar", new GenericType<NumberBarTableColumnFormatBar>() {});
    schemas.put("TrendTableColumnFormat", new GenericType<TrendTableColumnFormat>() {});
    schemas.put("StringTableColumnFormat", new GenericType<StringTableColumnFormat>() {});
    JSON.registerDescendants(TableColumnFormat.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TableColumnFormat.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: NumberBarTableColumnFormatNumber,
   * NumberBarTableColumnFormatBar, TrendTableColumnFormat, StringTableColumnFormat
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        NumberBarTableColumnFormatNumber.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NumberBarTableColumnFormatBar.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TrendTableColumnFormat.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StringTableColumnFormat.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be NumberBarTableColumnFormatNumber,"
            + " NumberBarTableColumnFormatBar, TrendTableColumnFormat, StringTableColumnFormat");
  }

  /**
   * Get the actual instance, which can be the following: NumberBarTableColumnFormatNumber,
   * NumberBarTableColumnFormatBar, TrendTableColumnFormat, StringTableColumnFormat
   *
   * @return The actual instance (NumberBarTableColumnFormatNumber, NumberBarTableColumnFormatBar,
   *     TrendTableColumnFormat, StringTableColumnFormat)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `NumberBarTableColumnFormatNumber`. If the actual instance is not
   * `NumberBarTableColumnFormatNumber`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NumberBarTableColumnFormatNumber`
   * @throws ClassCastException if the instance is not `NumberBarTableColumnFormatNumber`
   */
  public NumberBarTableColumnFormatNumber getNumberBarTableColumnFormatNumber()
      throws ClassCastException {
    return (NumberBarTableColumnFormatNumber) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NumberBarTableColumnFormatBar`. If the actual instance is not
   * `NumberBarTableColumnFormatBar`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NumberBarTableColumnFormatBar`
   * @throws ClassCastException if the instance is not `NumberBarTableColumnFormatBar`
   */
  public NumberBarTableColumnFormatBar getNumberBarTableColumnFormatBar()
      throws ClassCastException {
    return (NumberBarTableColumnFormatBar) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TrendTableColumnFormat`. If the actual instance is not
   * `TrendTableColumnFormat`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TrendTableColumnFormat`
   * @throws ClassCastException if the instance is not `TrendTableColumnFormat`
   */
  public TrendTableColumnFormat getTrendTableColumnFormat() throws ClassCastException {
    return (TrendTableColumnFormat) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StringTableColumnFormat`. If the actual instance is not
   * `StringTableColumnFormat`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StringTableColumnFormat`
   * @throws ClassCastException if the instance is not `StringTableColumnFormat`
   */
  public StringTableColumnFormat getStringTableColumnFormat() throws ClassCastException {
    return (StringTableColumnFormat) super.getActualInstance();
  }
}
