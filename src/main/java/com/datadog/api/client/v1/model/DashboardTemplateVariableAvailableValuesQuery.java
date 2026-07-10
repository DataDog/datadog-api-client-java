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
    using =
        DashboardTemplateVariableAvailableValuesQuery
            .DashboardTemplateVariableAvailableValuesQueryDeserializer.class)
@JsonSerialize(
    using =
        DashboardTemplateVariableAvailableValuesQuery
            .DashboardTemplateVariableAvailableValuesQuerySerializer.class)
public class DashboardTemplateVariableAvailableValuesQuery extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DashboardTemplateVariableAvailableValuesQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DashboardTemplateVariableAvailableValuesQuerySerializer
      extends StdSerializer<DashboardTemplateVariableAvailableValuesQuery> {
    public DashboardTemplateVariableAvailableValuesQuerySerializer(
        Class<DashboardTemplateVariableAvailableValuesQuery> t) {
      super(t);
    }

    public DashboardTemplateVariableAvailableValuesQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardTemplateVariableAvailableValuesQuery value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DashboardTemplateVariableAvailableValuesQueryDeserializer
      extends StdDeserializer<DashboardTemplateVariableAvailableValuesQuery> {
    public DashboardTemplateVariableAvailableValuesQueryDeserializer() {
      this(DashboardTemplateVariableAvailableValuesQuery.class);
    }

    public DashboardTemplateVariableAvailableValuesQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DashboardTemplateVariableAvailableValuesQuery deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DashboardAvailableValuesEventsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardAvailableValuesEventsQuery.class.equals(Integer.class)
            || DashboardAvailableValuesEventsQuery.class.equals(Long.class)
            || DashboardAvailableValuesEventsQuery.class.equals(Float.class)
            || DashboardAvailableValuesEventsQuery.class.equals(Double.class)
            || DashboardAvailableValuesEventsQuery.class.equals(Boolean.class)
            || DashboardAvailableValuesEventsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardAvailableValuesEventsQuery.class.equals(Integer.class)
                        || DashboardAvailableValuesEventsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardAvailableValuesEventsQuery.class.equals(Float.class)
                        || DashboardAvailableValuesEventsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardAvailableValuesEventsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardAvailableValuesEventsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardAvailableValuesEventsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DashboardAvailableValuesEventsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DashboardAvailableValuesEventsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DashboardAvailableValuesEventsQuery'",
            e);
      }

      // deserialize DashboardAvailableValuesMetricsQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardAvailableValuesMetricsQuery.class.equals(Integer.class)
            || DashboardAvailableValuesMetricsQuery.class.equals(Long.class)
            || DashboardAvailableValuesMetricsQuery.class.equals(Float.class)
            || DashboardAvailableValuesMetricsQuery.class.equals(Double.class)
            || DashboardAvailableValuesMetricsQuery.class.equals(Boolean.class)
            || DashboardAvailableValuesMetricsQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardAvailableValuesMetricsQuery.class.equals(Integer.class)
                        || DashboardAvailableValuesMetricsQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardAvailableValuesMetricsQuery.class.equals(Float.class)
                        || DashboardAvailableValuesMetricsQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardAvailableValuesMetricsQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardAvailableValuesMetricsQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(DashboardAvailableValuesMetricsQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DashboardAvailableValuesMetricsQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DashboardAvailableValuesMetricsQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DashboardAvailableValuesMetricsQuery'",
            e);
      }

      DashboardTemplateVariableAvailableValuesQuery ret =
          new DashboardTemplateVariableAvailableValuesQuery();
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
    public DashboardTemplateVariableAvailableValuesQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DashboardTemplateVariableAvailableValuesQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DashboardTemplateVariableAvailableValuesQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public DashboardTemplateVariableAvailableValuesQuery(DashboardAvailableValuesEventsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardTemplateVariableAvailableValuesQuery(DashboardAvailableValuesMetricsQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DashboardAvailableValuesEventsQuery",
        new GenericType<DashboardAvailableValuesEventsQuery>() {});
    schemas.put(
        "DashboardAvailableValuesMetricsQuery",
        new GenericType<DashboardAvailableValuesMetricsQuery>() {});
    JSON.registerDescendants(
        DashboardTemplateVariableAvailableValuesQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DashboardTemplateVariableAvailableValuesQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DashboardAvailableValuesEventsQuery,
   * DashboardAvailableValuesMetricsQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DashboardAvailableValuesEventsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DashboardAvailableValuesMetricsQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DashboardAvailableValuesEventsQuery,"
            + " DashboardAvailableValuesMetricsQuery");
  }

  /**
   * Get the actual instance, which can be the following: DashboardAvailableValuesEventsQuery,
   * DashboardAvailableValuesMetricsQuery
   *
   * @return The actual instance (DashboardAvailableValuesEventsQuery,
   *     DashboardAvailableValuesMetricsQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardAvailableValuesEventsQuery`. If the actual instance is not
   * `DashboardAvailableValuesEventsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardAvailableValuesEventsQuery`
   * @throws ClassCastException if the instance is not `DashboardAvailableValuesEventsQuery`
   */
  public DashboardAvailableValuesEventsQuery getDashboardAvailableValuesEventsQuery()
      throws ClassCastException {
    return (DashboardAvailableValuesEventsQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardAvailableValuesMetricsQuery`. If the actual instance is
   * not `DashboardAvailableValuesMetricsQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardAvailableValuesMetricsQuery`
   * @throws ClassCastException if the instance is not `DashboardAvailableValuesMetricsQuery`
   */
  public DashboardAvailableValuesMetricsQuery getDashboardAvailableValuesMetricsQuery()
      throws ClassCastException {
    return (DashboardAvailableValuesMetricsQuery) super.getActualInstance();
  }
}
