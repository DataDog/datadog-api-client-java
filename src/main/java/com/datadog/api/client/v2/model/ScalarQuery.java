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
@JsonDeserialize(using = ScalarQuery.ScalarQueryDeserializer.class)
@JsonSerialize(using = ScalarQuery.ScalarQuerySerializer.class)
public class ScalarQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ScalarQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ScalarQuerySerializer extends StdSerializer<ScalarQuery> {
    public ScalarQuerySerializer(Class<ScalarQuery> t) {
      super(t);
    }

    public ScalarQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(ScalarQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ScalarQueryDeserializer extends StdDeserializer<ScalarQuery> {
    public ScalarQueryDeserializer() {
      this(ScalarQuery.class);
    }

    public ScalarQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ScalarQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize MetricsScalarQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricsScalarQuery.class.equals(Integer.class)
            || MetricsScalarQuery.class.equals(Long.class)
            || MetricsScalarQuery.class.equals(Float.class)
            || MetricsScalarQuery.class.equals(Double.class)
            || MetricsScalarQuery.class.equals(Boolean.class)
            || MetricsScalarQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricsScalarQuery.class.equals(Integer.class)
                        || MetricsScalarQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricsScalarQuery.class.equals(Float.class)
                        || MetricsScalarQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricsScalarQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricsScalarQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricsScalarQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricsScalarQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricsScalarQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricsScalarQuery'", e);
      }

      // deserialize EventsScalarQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsScalarQuery.class.equals(Integer.class)
            || EventsScalarQuery.class.equals(Long.class)
            || EventsScalarQuery.class.equals(Float.class)
            || EventsScalarQuery.class.equals(Double.class)
            || EventsScalarQuery.class.equals(Boolean.class)
            || EventsScalarQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsScalarQuery.class.equals(Integer.class)
                        || EventsScalarQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsScalarQuery.class.equals(Float.class)
                        || EventsScalarQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsScalarQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsScalarQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventsScalarQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsScalarQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventsScalarQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventsScalarQuery'", e);
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

      // deserialize ProcessScalarQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ProcessScalarQuery.class.equals(Integer.class)
            || ProcessScalarQuery.class.equals(Long.class)
            || ProcessScalarQuery.class.equals(Float.class)
            || ProcessScalarQuery.class.equals(Double.class)
            || ProcessScalarQuery.class.equals(Boolean.class)
            || ProcessScalarQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ProcessScalarQuery.class.equals(Integer.class)
                        || ProcessScalarQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ProcessScalarQuery.class.equals(Float.class)
                        || ProcessScalarQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ProcessScalarQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ProcessScalarQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ProcessScalarQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ProcessScalarQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ProcessScalarQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ProcessScalarQuery'", e);
      }

      // deserialize ContainerScalarQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ContainerScalarQuery.class.equals(Integer.class)
            || ContainerScalarQuery.class.equals(Long.class)
            || ContainerScalarQuery.class.equals(Float.class)
            || ContainerScalarQuery.class.equals(Double.class)
            || ContainerScalarQuery.class.equals(Boolean.class)
            || ContainerScalarQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ContainerScalarQuery.class.equals(Integer.class)
                        || ContainerScalarQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ContainerScalarQuery.class.equals(Float.class)
                        || ContainerScalarQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ContainerScalarQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ContainerScalarQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ContainerScalarQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ContainerScalarQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ContainerScalarQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ContainerScalarQuery'", e);
      }

      ScalarQuery ret = new ScalarQuery();
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
    public ScalarQuery getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ScalarQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ScalarQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public ScalarQuery(MetricsScalarQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarQuery(EventsScalarQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarQuery(ApmResourceStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarQuery(ApmMetricsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarQuery(ApmDependencyStatsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarQuery(SloQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarQuery(ProcessScalarQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarQuery(ContainerScalarQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("MetricsScalarQuery", new GenericType<MetricsScalarQuery>() {});
    schemas.put("EventsScalarQuery", new GenericType<EventsScalarQuery>() {});
    schemas.put("ApmResourceStatsQuery", new GenericType<ApmResourceStatsQuery>() {});
    schemas.put("ApmMetricsQuery", new GenericType<ApmMetricsQuery>() {});
    schemas.put("ApmDependencyStatsQuery", new GenericType<ApmDependencyStatsQuery>() {});
    schemas.put("SloQuery", new GenericType<SloQuery>() {});
    schemas.put("ProcessScalarQuery", new GenericType<ProcessScalarQuery>() {});
    schemas.put("ContainerScalarQuery", new GenericType<ContainerScalarQuery>() {});
    JSON.registerDescendants(ScalarQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ScalarQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: MetricsScalarQuery, EventsScalarQuery, ApmResourceStatsQuery,
   * ApmMetricsQuery, ApmDependencyStatsQuery, SloQuery, ProcessScalarQuery, ContainerScalarQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(MetricsScalarQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventsScalarQuery.class, instance, new HashSet<Class<?>>())) {
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
    if (JSON.isInstanceOf(ProcessScalarQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ContainerScalarQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be MetricsScalarQuery, EventsScalarQuery,"
            + " ApmResourceStatsQuery, ApmMetricsQuery, ApmDependencyStatsQuery, SloQuery,"
            + " ProcessScalarQuery, ContainerScalarQuery");
  }

  /**
   * Get the actual instance, which can be the following: MetricsScalarQuery, EventsScalarQuery,
   * ApmResourceStatsQuery, ApmMetricsQuery, ApmDependencyStatsQuery, SloQuery, ProcessScalarQuery,
   * ContainerScalarQuery
   *
   * @return The actual instance (MetricsScalarQuery, EventsScalarQuery, ApmResourceStatsQuery,
   *     ApmMetricsQuery, ApmDependencyStatsQuery, SloQuery, ProcessScalarQuery,
   *     ContainerScalarQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricsScalarQuery`. If the actual instance is not
   * `MetricsScalarQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricsScalarQuery`
   * @throws ClassCastException if the instance is not `MetricsScalarQuery`
   */
  public MetricsScalarQuery getMetricsScalarQuery() throws ClassCastException {
    return (MetricsScalarQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsScalarQuery`. If the actual instance is not
   * `EventsScalarQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventsScalarQuery`
   * @throws ClassCastException if the instance is not `EventsScalarQuery`
   */
  public EventsScalarQuery getEventsScalarQuery() throws ClassCastException {
    return (EventsScalarQuery) super.getActualInstance();
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
   * Get the actual instance of `ProcessScalarQuery`. If the actual instance is not
   * `ProcessScalarQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ProcessScalarQuery`
   * @throws ClassCastException if the instance is not `ProcessScalarQuery`
   */
  public ProcessScalarQuery getProcessScalarQuery() throws ClassCastException {
    return (ProcessScalarQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ContainerScalarQuery`. If the actual instance is not
   * `ContainerScalarQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ContainerScalarQuery`
   * @throws ClassCastException if the instance is not `ContainerScalarQuery`
   */
  public ContainerScalarQuery getContainerScalarQuery() throws ClassCastException {
    return (ContainerScalarQuery) super.getActualInstance();
  }
}
