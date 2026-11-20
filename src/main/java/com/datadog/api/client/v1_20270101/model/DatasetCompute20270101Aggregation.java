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
    using = DatasetCompute20270101Aggregation.DatasetCompute20270101AggregationDeserializer.class)
@JsonSerialize(
    using = DatasetCompute20270101Aggregation.DatasetCompute20270101AggregationSerializer.class)
public class DatasetCompute20270101Aggregation extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DatasetCompute20270101Aggregation.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DatasetCompute20270101AggregationSerializer
      extends StdSerializer<DatasetCompute20270101Aggregation> {
    public DatasetCompute20270101AggregationSerializer(Class<DatasetCompute20270101Aggregation> t) {
      super(t);
    }

    public DatasetCompute20270101AggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatasetCompute20270101Aggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DatasetCompute20270101AggregationDeserializer
      extends StdDeserializer<DatasetCompute20270101Aggregation> {
    public DatasetCompute20270101AggregationDeserializer() {
      this(DatasetCompute20270101Aggregation.class);
    }

    public DatasetCompute20270101AggregationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DatasetCompute20270101Aggregation deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DashboardInlineSchema11
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardInlineSchema11.class.equals(Integer.class)
            || DashboardInlineSchema11.class.equals(Long.class)
            || DashboardInlineSchema11.class.equals(Float.class)
            || DashboardInlineSchema11.class.equals(Double.class)
            || DashboardInlineSchema11.class.equals(Boolean.class)
            || DashboardInlineSchema11.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardInlineSchema11.class.equals(Integer.class)
                        || DashboardInlineSchema11.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardInlineSchema11.class.equals(Float.class)
                        || DashboardInlineSchema11.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardInlineSchema11.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardInlineSchema11.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardInlineSchema11.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'DashboardInlineSchema11'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardInlineSchema11'", e);
      }

      // deserialize EventsAggregator
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsAggregator.class.equals(Integer.class)
            || EventsAggregator.class.equals(Long.class)
            || EventsAggregator.class.equals(Float.class)
            || EventsAggregator.class.equals(Double.class)
            || EventsAggregator.class.equals(Boolean.class)
            || EventsAggregator.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsAggregator.class.equals(Integer.class)
                        || EventsAggregator.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsAggregator.class.equals(Float.class)
                        || EventsAggregator.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsAggregator.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsAggregator.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventsAggregator.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsAggregator) tmp).unparsed
              && !(((EventsAggregator) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventsAggregator'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventsAggregator'", e);
      }

      DatasetCompute20270101Aggregation ret = new DatasetCompute20270101Aggregation();
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
    public DatasetCompute20270101Aggregation getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DatasetCompute20270101Aggregation cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DatasetCompute20270101Aggregation() {
    super("oneOf", Boolean.FALSE);
  }

  public DatasetCompute20270101Aggregation(DashboardInlineSchema11 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DatasetCompute20270101Aggregation(EventsAggregator o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("DashboardInlineSchema11", new GenericType<DashboardInlineSchema11>() {});
    schemas.put("EventsAggregator", new GenericType<EventsAggregator>() {});
    JSON.registerDescendants(
        DatasetCompute20270101Aggregation.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DatasetCompute20270101Aggregation.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DashboardInlineSchema11, EventsAggregator
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(DashboardInlineSchema11.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventsAggregator.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DashboardInlineSchema11, EventsAggregator");
  }

  /**
   * Get the actual instance, which can be the following: DashboardInlineSchema11, EventsAggregator
   *
   * @return The actual instance (DashboardInlineSchema11, EventsAggregator)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardInlineSchema11`. If the actual instance is not
   * `DashboardInlineSchema11`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardInlineSchema11`
   * @throws ClassCastException if the instance is not `DashboardInlineSchema11`
   */
  public DashboardInlineSchema11 getDashboardInlineSchema11() throws ClassCastException {
    return (DashboardInlineSchema11) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsAggregator`. If the actual instance is not
   * `EventsAggregator`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventsAggregator`
   * @throws ClassCastException if the instance is not `EventsAggregator`
   */
  public EventsAggregator getEventsAggregator() throws ClassCastException {
    return (EventsAggregator) super.getActualInstance();
  }
}
