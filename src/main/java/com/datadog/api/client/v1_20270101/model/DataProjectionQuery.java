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
@JsonDeserialize(using = DataProjectionQuery.DataProjectionQueryDeserializer.class)
@JsonSerialize(using = DataProjectionQuery.DataProjectionQuerySerializer.class)
public class DataProjectionQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(DataProjectionQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DataProjectionQuerySerializer extends StdSerializer<DataProjectionQuery> {
    public DataProjectionQuerySerializer(Class<DataProjectionQuery> t) {
      super(t);
    }

    public DataProjectionQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DataProjectionQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DataProjectionQueryDeserializer extends StdDeserializer<DataProjectionQuery> {
    public DataProjectionQueryDeserializer() {
      this(DataProjectionQuery.class);
    }

    public DataProjectionQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DataProjectionQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AggregateAugmentedQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AggregateAugmentedQuery.class.equals(Integer.class)
            || AggregateAugmentedQuery.class.equals(Long.class)
            || AggregateAugmentedQuery.class.equals(Float.class)
            || AggregateAugmentedQuery.class.equals(Double.class)
            || AggregateAugmentedQuery.class.equals(Boolean.class)
            || AggregateAugmentedQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AggregateAugmentedQuery.class.equals(Integer.class)
                        || AggregateAugmentedQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AggregateAugmentedQuery.class.equals(Float.class)
                        || AggregateAugmentedQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AggregateAugmentedQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AggregateAugmentedQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AggregateAugmentedQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AggregateAugmentedQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AggregateAugmentedQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AggregateAugmentedQuery'", e);
      }

      // deserialize EventsPlatformDataProjectionQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsPlatformDataProjectionQueryDefinition.class.equals(Integer.class)
            || EventsPlatformDataProjectionQueryDefinition.class.equals(Long.class)
            || EventsPlatformDataProjectionQueryDefinition.class.equals(Float.class)
            || EventsPlatformDataProjectionQueryDefinition.class.equals(Double.class)
            || EventsPlatformDataProjectionQueryDefinition.class.equals(Boolean.class)
            || EventsPlatformDataProjectionQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsPlatformDataProjectionQueryDefinition.class.equals(Integer.class)
                        || EventsPlatformDataProjectionQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsPlatformDataProjectionQueryDefinition.class.equals(Float.class)
                        || EventsPlatformDataProjectionQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsPlatformDataProjectionQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsPlatformDataProjectionQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(EventsPlatformDataProjectionQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsPlatformDataProjectionQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'EventsPlatformDataProjectionQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'EventsPlatformDataProjectionQueryDefinition'",
            e);
      }

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

      DataProjectionQuery ret = new DataProjectionQuery();
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
    public DataProjectionQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "DataProjectionQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DataProjectionQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public DataProjectionQuery(AggregateAugmentedQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DataProjectionQuery(EventsPlatformDataProjectionQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DataProjectionQuery(DatasetListQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AggregateAugmentedQuery", new GenericType<AggregateAugmentedQuery>() {});
    schemas.put(
        "EventsPlatformDataProjectionQueryDefinition",
        new GenericType<EventsPlatformDataProjectionQueryDefinition>() {});
    schemas.put("DatasetListQuery", new GenericType<DatasetListQuery>() {});
    JSON.registerDescendants(DataProjectionQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DataProjectionQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AggregateAugmentedQuery,
   * EventsPlatformDataProjectionQueryDefinition, DatasetListQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AggregateAugmentedQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        EventsPlatformDataProjectionQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DatasetListQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AggregateAugmentedQuery,"
            + " EventsPlatformDataProjectionQueryDefinition, DatasetListQuery");
  }

  /**
   * Get the actual instance, which can be the following: AggregateAugmentedQuery,
   * EventsPlatformDataProjectionQueryDefinition, DatasetListQuery
   *
   * @return The actual instance (AggregateAugmentedQuery,
   *     EventsPlatformDataProjectionQueryDefinition, DatasetListQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AggregateAugmentedQuery`. If the actual instance is not
   * `AggregateAugmentedQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AggregateAugmentedQuery`
   * @throws ClassCastException if the instance is not `AggregateAugmentedQuery`
   */
  public AggregateAugmentedQuery getAggregateAugmentedQuery() throws ClassCastException {
    return (AggregateAugmentedQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsPlatformDataProjectionQueryDefinition`. If the actual
   * instance is not `EventsPlatformDataProjectionQueryDefinition`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `EventsPlatformDataProjectionQueryDefinition`
   * @throws ClassCastException if the instance is not `EventsPlatformDataProjectionQueryDefinition`
   */
  public EventsPlatformDataProjectionQueryDefinition
      getEventsPlatformDataProjectionQueryDefinition() throws ClassCastException {
    return (EventsPlatformDataProjectionQueryDefinition) super.getActualInstance();
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
}
