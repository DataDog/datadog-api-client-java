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
@JsonDeserialize(
    using = DatasetSort20270101Aggregation.DatasetSort20270101AggregationDeserializer.class)
@JsonSerialize(
    using = DatasetSort20270101Aggregation.DatasetSort20270101AggregationSerializer.class)
public class DatasetSort20270101Aggregation extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DatasetSort20270101Aggregation.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DatasetSort20270101AggregationSerializer
      extends StdSerializer<DatasetSort20270101Aggregation> {
    public DatasetSort20270101AggregationSerializer(Class<DatasetSort20270101Aggregation> t) {
      super(t);
    }

    public DatasetSort20270101AggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatasetSort20270101Aggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DatasetSort20270101AggregationDeserializer
      extends StdDeserializer<DatasetSort20270101Aggregation> {
    public DatasetSort20270101AggregationDeserializer() {
      this(DatasetSort20270101Aggregation.class);
    }

    public DatasetSort20270101AggregationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DatasetSort20270101Aggregation deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DashboardInlineSchema10_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardInlineSchema10_20270101.class.equals(Integer.class)
            || DashboardInlineSchema10_20270101.class.equals(Long.class)
            || DashboardInlineSchema10_20270101.class.equals(Float.class)
            || DashboardInlineSchema10_20270101.class.equals(Double.class)
            || DashboardInlineSchema10_20270101.class.equals(Boolean.class)
            || DashboardInlineSchema10_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardInlineSchema10_20270101.class.equals(Integer.class)
                        || DashboardInlineSchema10_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardInlineSchema10_20270101.class.equals(Float.class)
                        || DashboardInlineSchema10_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardInlineSchema10_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardInlineSchema10_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardInlineSchema10_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'DashboardInlineSchema10_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'DashboardInlineSchema10_20270101'", e);
      }

      // deserialize EventsAggregator_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsAggregator_20270101.class.equals(Integer.class)
            || EventsAggregator_20270101.class.equals(Long.class)
            || EventsAggregator_20270101.class.equals(Float.class)
            || EventsAggregator_20270101.class.equals(Double.class)
            || EventsAggregator_20270101.class.equals(Boolean.class)
            || EventsAggregator_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsAggregator_20270101.class.equals(Integer.class)
                        || EventsAggregator_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsAggregator_20270101.class.equals(Float.class)
                        || EventsAggregator_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsAggregator_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsAggregator_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventsAggregator_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsAggregator_20270101) tmp).unparsed
              && !(((EventsAggregator_20270101) tmp).getActualInstance()
                  instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventsAggregator_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventsAggregator_20270101'", e);
      }

      DatasetSort20270101Aggregation ret = new DatasetSort20270101Aggregation();
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
    public DatasetSort20270101Aggregation getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DatasetSort20270101Aggregation cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DatasetSort20270101Aggregation() {
    super("oneOf", Boolean.FALSE);
  }

  public DatasetSort20270101Aggregation(DashboardInlineSchema10_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatasetSort20270101Aggregation(EventsAggregator_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DashboardInlineSchema10_20270101", new GenericType<DashboardInlineSchema10_20270101>() {});
    schemas.put("EventsAggregator_20270101", new GenericType<EventsAggregator_20270101>() {});
    JSON.registerDescendants(
        DatasetSort20270101Aggregation.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DatasetSort20270101Aggregation.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DashboardInlineSchema10_20270101, EventsAggregator_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DashboardInlineSchema10_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventsAggregator_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DashboardInlineSchema10_20270101,"
            + " EventsAggregator_20270101");
  }

  /**
   * Get the actual instance, which can be the following: DashboardInlineSchema10_20270101,
   * EventsAggregator_20270101
   *
   * @return The actual instance (DashboardInlineSchema10_20270101, EventsAggregator_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardInlineSchema10_20270101`. If the actual instance is not
   * `DashboardInlineSchema10_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardInlineSchema10_20270101`
   * @throws ClassCastException if the instance is not `DashboardInlineSchema10_20270101`
   */
  public DashboardInlineSchema10_20270101 getDashboardInlineSchema10_20270101()
      throws ClassCastException {
    return (DashboardInlineSchema10_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsAggregator_20270101`. If the actual instance is not
   * `EventsAggregator_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventsAggregator_20270101`
   * @throws ClassCastException if the instance is not `EventsAggregator_20270101`
   */
  public EventsAggregator_20270101 getEventsAggregator_20270101() throws ClassCastException {
    return (EventsAggregator_20270101) super.getActualInstance();
  }
}
