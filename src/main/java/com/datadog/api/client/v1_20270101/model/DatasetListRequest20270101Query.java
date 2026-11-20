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
    using = DatasetListRequest20270101Query.DatasetListRequest20270101QueryDeserializer.class)
@JsonSerialize(
    using = DatasetListRequest20270101Query.DatasetListRequest20270101QuerySerializer.class)
public class DatasetListRequest20270101Query extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DatasetListRequest20270101Query.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DatasetListRequest20270101QuerySerializer
      extends StdSerializer<DatasetListRequest20270101Query> {
    public DatasetListRequest20270101QuerySerializer(Class<DatasetListRequest20270101Query> t) {
      super(t);
    }

    public DatasetListRequest20270101QuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatasetListRequest20270101Query value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DatasetListRequest20270101QueryDeserializer
      extends StdDeserializer<DatasetListRequest20270101Query> {
    public DatasetListRequest20270101QueryDeserializer() {
      this(DatasetListRequest20270101Query.class);
    }

    public DatasetListRequest20270101QueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DatasetListRequest20270101Query deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DatasetListQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatasetListQuery.class.equals(Integer.class)
            || DatasetListQuery.class.equals(Long.class)
            || DatasetListQuery.class.equals(Float.class)
            || DatasetListQuery.class.equals(Double.class)
            || DatasetListQuery.class.equals(Boolean.class)
            || DatasetListQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatasetListQuery.class.equals(Integer.class)
                        || DatasetListQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatasetListQuery.class.equals(Float.class)
                        || DatasetListQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatasetListQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatasetListQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DatasetListQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatasetListQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DatasetListQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DatasetListQuery'", e);
      }

      // deserialize RelationalDataQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RelationalDataQuery.class.equals(Integer.class)
            || RelationalDataQuery.class.equals(Long.class)
            || RelationalDataQuery.class.equals(Float.class)
            || RelationalDataQuery.class.equals(Double.class)
            || RelationalDataQuery.class.equals(Boolean.class)
            || RelationalDataQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RelationalDataQuery.class.equals(Integer.class)
                        || RelationalDataQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RelationalDataQuery.class.equals(Float.class)
                        || RelationalDataQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RelationalDataQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RelationalDataQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RelationalDataQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RelationalDataQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RelationalDataQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RelationalDataQuery'", e);
      }

      DatasetListRequest20270101Query ret = new DatasetListRequest20270101Query();
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
    public DatasetListRequest20270101Query getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DatasetListRequest20270101Query cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DatasetListRequest20270101Query() {
    super("oneOf", Boolean.FALSE);
  }

  public DatasetListRequest20270101Query(DatasetListQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatasetListRequest20270101Query(RelationalDataQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("DatasetListQuery", new GenericType<DatasetListQuery>() {});
    schemas.put("RelationalDataQuery", new GenericType<RelationalDataQuery>() {});
    JSON.registerDescendants(
        DatasetListRequest20270101Query.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DatasetListRequest20270101Query.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DatasetListQuery, RelationalDataQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(DatasetListQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RelationalDataQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DatasetListQuery, RelationalDataQuery");
  }

  /**
   * Get the actual instance, which can be the following: DatasetListQuery, RelationalDataQuery
   *
   * @return The actual instance (DatasetListQuery, RelationalDataQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatasetListQuery`. If the actual instance is not
   * `DatasetListQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DatasetListQuery`
   * @throws ClassCastException if the instance is not `DatasetListQuery`
   */
  public DatasetListQuery getDatasetListQuery() throws ClassCastException {
    return (DatasetListQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RelationalDataQuery`. If the actual instance is not
   * `RelationalDataQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RelationalDataQuery`
   * @throws ClassCastException if the instance is not `RelationalDataQuery`
   */
  public RelationalDataQuery getRelationalDataQuery() throws ClassCastException {
    return (RelationalDataQuery) super.getActualInstance();
  }
}
