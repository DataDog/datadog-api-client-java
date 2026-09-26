/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = MetricCustomAggregations.MetricCustomAggregationsDeserializer.class)
@JsonSerialize(using = MetricCustomAggregations.MetricCustomAggregationsSerializer.class)
public class MetricCustomAggregations extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(MetricCustomAggregations.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class MetricCustomAggregationsSerializer
      extends StdSerializer<MetricCustomAggregations> {
    public MetricCustomAggregationsSerializer(Class<MetricCustomAggregations> t) {
      super(t);
    }

    public MetricCustomAggregationsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricCustomAggregations value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class MetricCustomAggregationsDeserializer
      extends StdDeserializer<MetricCustomAggregations> {
    public MetricCustomAggregationsDeserializer() {
      this(MetricCustomAggregations.class);
    }

    public MetricCustomAggregationsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public MetricCustomAggregations deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      Object deserializedUnparsed = null;
      int matchUnparsed = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize List<MetricCustomAggregation>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (List.class.equals(Integer.class)
            || List.class.equals(Long.class)
            || List.class.equals(Float.class)
            || List.class.equals(Double.class)
            || List.class.equals(Boolean.class)
            || List.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((List.class.equals(Integer.class) || List.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((List.class.equals(Float.class) || List.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (List.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(new TypeReference<List<MetricCustomAggregation>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          // keep the matched list, but propagate 'unparsed' from any invalid item
          boolean itemsUnparsed = false;
          for (MetricCustomAggregation item : (List<MetricCustomAggregation>) tmp) {
            itemsUnparsed |= item.unparsed;
          }
          if (itemsUnparsed) {
            deserializedUnparsed = tmp;
            matchUnparsed++;
          } else {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'List<MetricCustomAggregation>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'List<MetricCustomAggregation>'", e);
      }

      // deserialize List<MetricAvailableAggrFunctions>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (List.class.equals(Integer.class)
            || List.class.equals(Long.class)
            || List.class.equals(Float.class)
            || List.class.equals(Double.class)
            || List.class.equals(Boolean.class)
            || List.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((List.class.equals(Integer.class) || List.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((List.class.equals(Float.class) || List.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (List.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(new TypeReference<List<MetricAvailableAggrFunctions>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'List<MetricAvailableAggrFunctions>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'List<MetricAvailableAggrFunctions>'",
            e);
      }

      MetricCustomAggregations ret = new MetricCustomAggregations();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else if (match == 0 && matchUnparsed == 1) {
        ret.setActualInstance(deserializedUnparsed);
        ret.unparsed = true;
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
    public MetricCustomAggregations getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "MetricCustomAggregations cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public MetricCustomAggregations() {
    super("oneOf", Boolean.FALSE);
  }

  public static MetricCustomAggregations fromMetricCustomAggregationList(
      List<MetricCustomAggregation> o) {
    MetricCustomAggregations instance = new MetricCustomAggregations();
    instance.setActualInstance(o);
    return instance;
  }

  public static MetricCustomAggregations fromMetricAvailableAggrFunctionsList(
      List<MetricAvailableAggrFunctions> o) {
    MetricCustomAggregations instance = new MetricCustomAggregations();
    instance.setActualInstance(o);
    return instance;
  }

  static {
    schemas.put(
        "List<MetricCustomAggregation>", new GenericType<List<MetricCustomAggregation>>() {});
    schemas.put(
        "List<MetricAvailableAggrFunctions>",
        new GenericType<List<MetricAvailableAggrFunctions>>() {});
    JSON.registerDescendants(MetricCustomAggregations.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return MetricCustomAggregations.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: List&lt;MetricCustomAggregation&gt;,
   * List&lt;MetricAvailableAggrFunctions&gt;
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be List<MetricCustomAggregation>,"
            + " List<MetricAvailableAggrFunctions>");
  }

  /**
   * Get the actual instance, which can be the following: List&lt;MetricCustomAggregation&gt;,
   * List&lt;MetricAvailableAggrFunctions&gt;
   *
   * @return The actual instance (List&lt;MetricCustomAggregation&gt;,
   *     List&lt;MetricAvailableAggrFunctions&gt;)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;MetricCustomAggregation&gt;`. If the actual instance is not
   * `List&lt;MetricCustomAggregation&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `List&lt;MetricCustomAggregation&gt;`
   * @throws ClassCastException if the instance is not `List&lt;MetricCustomAggregation&gt;`
   */
  public List<MetricCustomAggregation> getMetricCustomAggregationList() throws ClassCastException {
    return (List<MetricCustomAggregation>) super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;MetricAvailableAggrFunctions&gt;`. If the actual instance
   * is not `List&lt;MetricAvailableAggrFunctions&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `List&lt;MetricAvailableAggrFunctions&gt;`
   * @throws ClassCastException if the instance is not `List&lt;MetricAvailableAggrFunctions&gt;`
   */
  public List<MetricAvailableAggrFunctions> getMetricAvailableAggrFunctionsList()
      throws ClassCastException {
    return (List<MetricAvailableAggrFunctions>) super.getActualInstance();
  }
}
