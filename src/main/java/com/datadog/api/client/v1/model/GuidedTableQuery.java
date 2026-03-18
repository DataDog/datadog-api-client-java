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
@JsonDeserialize(using = GuidedTableQuery.GuidedTableQueryDeserializer.class)
@JsonSerialize(using = GuidedTableQuery.GuidedTableQuerySerializer.class)
public class GuidedTableQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GuidedTableQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GuidedTableQuerySerializer extends StdSerializer<GuidedTableQuery> {
    public GuidedTableQuerySerializer(Class<GuidedTableQuery> t) {
      super(t);
    }

    public GuidedTableQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(GuidedTableQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GuidedTableQueryDeserializer extends StdDeserializer<GuidedTableQuery> {
    public GuidedTableQueryDeserializer() {
      this(GuidedTableQuery.class);
    }

    public GuidedTableQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GuidedTableQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GuidedTableMetricsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GuidedTableMetricsQuery.class.equals(Integer.class)
            || GuidedTableMetricsQuery.class.equals(Long.class)
            || GuidedTableMetricsQuery.class.equals(Float.class)
            || GuidedTableMetricsQuery.class.equals(Double.class)
            || GuidedTableMetricsQuery.class.equals(Boolean.class)
            || GuidedTableMetricsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GuidedTableMetricsQuery.class.equals(Integer.class)
                        || GuidedTableMetricsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GuidedTableMetricsQuery.class.equals(Float.class)
                        || GuidedTableMetricsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GuidedTableMetricsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GuidedTableMetricsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GuidedTableMetricsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GuidedTableMetricsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GuidedTableMetricsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GuidedTableMetricsQuery'", e);
      }

      // deserialize GuidedTableEventsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GuidedTableEventsQuery.class.equals(Integer.class)
            || GuidedTableEventsQuery.class.equals(Long.class)
            || GuidedTableEventsQuery.class.equals(Float.class)
            || GuidedTableEventsQuery.class.equals(Double.class)
            || GuidedTableEventsQuery.class.equals(Boolean.class)
            || GuidedTableEventsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GuidedTableEventsQuery.class.equals(Integer.class)
                        || GuidedTableEventsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GuidedTableEventsQuery.class.equals(Float.class)
                        || GuidedTableEventsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GuidedTableEventsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GuidedTableEventsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GuidedTableEventsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GuidedTableEventsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GuidedTableEventsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GuidedTableEventsQuery'", e);
      }

      GuidedTableQuery ret = new GuidedTableQuery();
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
    public GuidedTableQuery getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GuidedTableQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GuidedTableQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public GuidedTableQuery(GuidedTableMetricsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableQuery(GuidedTableEventsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("GuidedTableMetricsQuery", new GenericType<GuidedTableMetricsQuery>() {});
    schemas.put("GuidedTableEventsQuery", new GenericType<GuidedTableEventsQuery>() {});
    JSON.registerDescendants(GuidedTableQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GuidedTableQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GuidedTableMetricsQuery, GuidedTableEventsQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(GuidedTableMetricsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GuidedTableEventsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be GuidedTableMetricsQuery, GuidedTableEventsQuery");
  }

  /**
   * Get the actual instance, which can be the following: GuidedTableMetricsQuery,
   * GuidedTableEventsQuery
   *
   * @return The actual instance (GuidedTableMetricsQuery, GuidedTableEventsQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GuidedTableMetricsQuery`. If the actual instance is not
   * `GuidedTableMetricsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GuidedTableMetricsQuery`
   * @throws ClassCastException if the instance is not `GuidedTableMetricsQuery`
   */
  public GuidedTableMetricsQuery getGuidedTableMetricsQuery() throws ClassCastException {
    return (GuidedTableMetricsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GuidedTableEventsQuery`. If the actual instance is not
   * `GuidedTableEventsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GuidedTableEventsQuery`
   * @throws ClassCastException if the instance is not `GuidedTableEventsQuery`
   */
  public GuidedTableEventsQuery getGuidedTableEventsQuery() throws ClassCastException {
    return (GuidedTableEventsQuery) super.getActualInstance();
  }
}
