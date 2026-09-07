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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = TimeseriesQuery.TimeseriesQueryDeserializer.class)
@JsonSerialize(using = TimeseriesQuery.TimeseriesQuerySerializer.class)
public class TimeseriesQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TimeseriesQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TimeseriesQuerySerializer extends StdSerializer<TimeseriesQuery> {
    public TimeseriesQuerySerializer(Class<TimeseriesQuery> t) {
      super(t);
    }

    public TimeseriesQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(TimeseriesQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TimeseriesQueryDeserializer extends StdDeserializer<TimeseriesQuery> {
    public TimeseriesQueryDeserializer() {
      this(TimeseriesQuery.class);
    }

    public TimeseriesQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TimeseriesQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize MetricsTimeseriesQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricsTimeseriesQuery.class.equals(Integer.class)
            || MetricsTimeseriesQuery.class.equals(Long.class)
            || MetricsTimeseriesQuery.class.equals(Float.class)
            || MetricsTimeseriesQuery.class.equals(Double.class)
            || MetricsTimeseriesQuery.class.equals(Boolean.class)
            || MetricsTimeseriesQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricsTimeseriesQuery.class.equals(Integer.class)
                        || MetricsTimeseriesQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricsTimeseriesQuery.class.equals(Float.class)
                        || MetricsTimeseriesQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricsTimeseriesQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricsTimeseriesQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricsTimeseriesQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricsTimeseriesQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricsTimeseriesQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricsTimeseriesQuery'", e);
      }

      // deserialize EventsTimeseriesQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsTimeseriesQuery.class.equals(Integer.class)
            || EventsTimeseriesQuery.class.equals(Long.class)
            || EventsTimeseriesQuery.class.equals(Float.class)
            || EventsTimeseriesQuery.class.equals(Double.class)
            || EventsTimeseriesQuery.class.equals(Boolean.class)
            || EventsTimeseriesQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsTimeseriesQuery.class.equals(Integer.class)
                        || EventsTimeseriesQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsTimeseriesQuery.class.equals(Float.class)
                        || EventsTimeseriesQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsTimeseriesQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsTimeseriesQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventsTimeseriesQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsTimeseriesQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventsTimeseriesQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventsTimeseriesQuery'", e);
      }

      // deserialize ApmResourceStatsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ApmResourceStatsQuery.class.equals(Integer.class)
            || ApmResourceStatsQuery.class.equals(Long.class)
            || ApmResourceStatsQuery.class.equals(Float.class)
            || ApmResourceStatsQuery.class.equals(Double.class)
            || ApmResourceStatsQuery.class.equals(Boolean.class)
            || ApmResourceStatsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ApmResourceStatsQuery.class.equals(Integer.class)
                        || ApmResourceStatsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ApmResourceStatsQuery.class.equals(Float.class)
                        || ApmResourceStatsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ApmResourceStatsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ApmResourceStatsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ApmResourceStatsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ApmResourceStatsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ApmResourceStatsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ApmResourceStatsQuery'", e);
      }

      // deserialize ApmMetricsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ApmMetricsQuery.class.equals(Integer.class)
            || ApmMetricsQuery.class.equals(Long.class)
            || ApmMetricsQuery.class.equals(Float.class)
            || ApmMetricsQuery.class.equals(Double.class)
            || ApmMetricsQuery.class.equals(Boolean.class)
            || ApmMetricsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ApmMetricsQuery.class.equals(Integer.class)
                        || ApmMetricsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ApmMetricsQuery.class.equals(Float.class)
                        || ApmMetricsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ApmMetricsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ApmMetricsQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ApmMetricsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ApmMetricsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ApmMetricsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ApmMetricsQuery'", e);
      }

      // deserialize ApmDependencyStatsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ApmDependencyStatsQuery.class.equals(Integer.class)
            || ApmDependencyStatsQuery.class.equals(Long.class)
            || ApmDependencyStatsQuery.class.equals(Float.class)
            || ApmDependencyStatsQuery.class.equals(Double.class)
            || ApmDependencyStatsQuery.class.equals(Boolean.class)
            || ApmDependencyStatsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ApmDependencyStatsQuery.class.equals(Integer.class)
                        || ApmDependencyStatsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ApmDependencyStatsQuery.class.equals(Float.class)
                        || ApmDependencyStatsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ApmDependencyStatsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ApmDependencyStatsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ApmDependencyStatsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ApmDependencyStatsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ApmDependencyStatsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ApmDependencyStatsQuery'", e);
      }

      // deserialize SloQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SloQuery.class.equals(Integer.class)
            || SloQuery.class.equals(Long.class)
            || SloQuery.class.equals(Float.class)
            || SloQuery.class.equals(Double.class)
            || SloQuery.class.equals(Boolean.class)
            || SloQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SloQuery.class.equals(Integer.class) || SloQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SloQuery.class.equals(Float.class) || SloQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SloQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SloQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SloQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SloQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SloQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SloQuery'", e);
      }

      // deserialize ProcessTimeseriesQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ProcessTimeseriesQuery.class.equals(Integer.class)
            || ProcessTimeseriesQuery.class.equals(Long.class)
            || ProcessTimeseriesQuery.class.equals(Float.class)
            || ProcessTimeseriesQuery.class.equals(Double.class)
            || ProcessTimeseriesQuery.class.equals(Boolean.class)
            || ProcessTimeseriesQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ProcessTimeseriesQuery.class.equals(Integer.class)
                        || ProcessTimeseriesQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ProcessTimeseriesQuery.class.equals(Float.class)
                        || ProcessTimeseriesQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ProcessTimeseriesQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ProcessTimeseriesQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ProcessTimeseriesQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ProcessTimeseriesQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ProcessTimeseriesQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ProcessTimeseriesQuery'", e);
      }

      // deserialize ContainerTimeseriesQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ContainerTimeseriesQuery.class.equals(Integer.class)
            || ContainerTimeseriesQuery.class.equals(Long.class)
            || ContainerTimeseriesQuery.class.equals(Float.class)
            || ContainerTimeseriesQuery.class.equals(Double.class)
            || ContainerTimeseriesQuery.class.equals(Boolean.class)
            || ContainerTimeseriesQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ContainerTimeseriesQuery.class.equals(Integer.class)
                        || ContainerTimeseriesQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ContainerTimeseriesQuery.class.equals(Float.class)
                        || ContainerTimeseriesQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ContainerTimeseriesQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ContainerTimeseriesQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ContainerTimeseriesQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ContainerTimeseriesQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ContainerTimeseriesQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ContainerTimeseriesQuery'", e);
      }

      TimeseriesQuery ret = new TimeseriesQuery();
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
    public TimeseriesQuery getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TimeseriesQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TimeseriesQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public TimeseriesQuery(MetricsTimeseriesQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesQuery(EventsTimeseriesQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesQuery(ApmResourceStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesQuery(ApmMetricsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesQuery(ApmDependencyStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesQuery(SloQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesQuery(ProcessTimeseriesQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TimeseriesQuery(ContainerTimeseriesQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("MetricsTimeseriesQuery", new GenericType<MetricsTimeseriesQuery>() {});
    schemas.put("EventsTimeseriesQuery", new GenericType<EventsTimeseriesQuery>() {});
    schemas.put("ApmResourceStatsQuery", new GenericType<ApmResourceStatsQuery>() {});
    schemas.put("ApmMetricsQuery", new GenericType<ApmMetricsQuery>() {});
    schemas.put("ApmDependencyStatsQuery", new GenericType<ApmDependencyStatsQuery>() {});
    schemas.put("SloQuery", new GenericType<SloQuery>() {});
    schemas.put("ProcessTimeseriesQuery", new GenericType<ProcessTimeseriesQuery>() {});
    schemas.put("ContainerTimeseriesQuery", new GenericType<ContainerTimeseriesQuery>() {});
    JSON.registerDescendants(TimeseriesQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TimeseriesQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: MetricsTimeseriesQuery, EventsTimeseriesQuery,
   * ApmResourceStatsQuery, ApmMetricsQuery, ApmDependencyStatsQuery, SloQuery,
   * ProcessTimeseriesQuery, ContainerTimeseriesQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(MetricsTimeseriesQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventsTimeseriesQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ApmResourceStatsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ApmMetricsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ApmDependencyStatsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SloQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ProcessTimeseriesQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ContainerTimeseriesQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be MetricsTimeseriesQuery, EventsTimeseriesQuery,"
            + " ApmResourceStatsQuery, ApmMetricsQuery, ApmDependencyStatsQuery, SloQuery,"
            + " ProcessTimeseriesQuery, ContainerTimeseriesQuery");
  }

  /**
   * Get the actual instance, which can be the following: MetricsTimeseriesQuery,
   * EventsTimeseriesQuery, ApmResourceStatsQuery, ApmMetricsQuery, ApmDependencyStatsQuery,
   * SloQuery, ProcessTimeseriesQuery, ContainerTimeseriesQuery
   *
   * @return The actual instance (MetricsTimeseriesQuery, EventsTimeseriesQuery,
   *     ApmResourceStatsQuery, ApmMetricsQuery, ApmDependencyStatsQuery, SloQuery,
   *     ProcessTimeseriesQuery, ContainerTimeseriesQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricsTimeseriesQuery`. If the actual instance is not
   * `MetricsTimeseriesQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricsTimeseriesQuery`
   * @throws ClassCastException if the instance is not `MetricsTimeseriesQuery`
   */
  public MetricsTimeseriesQuery getMetricsTimeseriesQuery() throws ClassCastException {
    return (MetricsTimeseriesQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsTimeseriesQuery`. If the actual instance is not
   * `EventsTimeseriesQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventsTimeseriesQuery`
   * @throws ClassCastException if the instance is not `EventsTimeseriesQuery`
   */
  public EventsTimeseriesQuery getEventsTimeseriesQuery() throws ClassCastException {
    return (EventsTimeseriesQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ApmResourceStatsQuery`. If the actual instance is not
   * `ApmResourceStatsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ApmResourceStatsQuery`
   * @throws ClassCastException if the instance is not `ApmResourceStatsQuery`
   */
  public ApmResourceStatsQuery getApmResourceStatsQuery() throws ClassCastException {
    return (ApmResourceStatsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ApmMetricsQuery`. If the actual instance is not `ApmMetricsQuery`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ApmMetricsQuery`
   * @throws ClassCastException if the instance is not `ApmMetricsQuery`
   */
  public ApmMetricsQuery getApmMetricsQuery() throws ClassCastException {
    return (ApmMetricsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ApmDependencyStatsQuery`. If the actual instance is not
   * `ApmDependencyStatsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ApmDependencyStatsQuery`
   * @throws ClassCastException if the instance is not `ApmDependencyStatsQuery`
   */
  public ApmDependencyStatsQuery getApmDependencyStatsQuery() throws ClassCastException {
    return (ApmDependencyStatsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SloQuery`. If the actual instance is not `SloQuery`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `SloQuery`
   * @throws ClassCastException if the instance is not `SloQuery`
   */
  public SloQuery getSloQuery() throws ClassCastException {
    return (SloQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ProcessTimeseriesQuery`. If the actual instance is not
   * `ProcessTimeseriesQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ProcessTimeseriesQuery`
   * @throws ClassCastException if the instance is not `ProcessTimeseriesQuery`
   */
  public ProcessTimeseriesQuery getProcessTimeseriesQuery() throws ClassCastException {
    return (ProcessTimeseriesQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ContainerTimeseriesQuery`. If the actual instance is not
   * `ContainerTimeseriesQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ContainerTimeseriesQuery`
   * @throws ClassCastException if the instance is not `ContainerTimeseriesQuery`
   */
  public ContainerTimeseriesQuery getContainerTimeseriesQuery() throws ClassCastException {
    return (ContainerTimeseriesQuery) super.getActualInstance();
  }
}
