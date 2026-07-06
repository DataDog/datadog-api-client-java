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
        NotebookTemplateVariableAvailableValuesQuery
            .NotebookTemplateVariableAvailableValuesQueryDeserializer.class)
@JsonSerialize(
    using =
        NotebookTemplateVariableAvailableValuesQuery
            .NotebookTemplateVariableAvailableValuesQuerySerializer.class)
public class NotebookTemplateVariableAvailableValuesQuery extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(NotebookTemplateVariableAvailableValuesQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class NotebookTemplateVariableAvailableValuesQuerySerializer
      extends StdSerializer<NotebookTemplateVariableAvailableValuesQuery> {
    public NotebookTemplateVariableAvailableValuesQuerySerializer(
        Class<NotebookTemplateVariableAvailableValuesQuery> t) {
      super(t);
    }

    public NotebookTemplateVariableAvailableValuesQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotebookTemplateVariableAvailableValuesQuery value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class NotebookTemplateVariableAvailableValuesQueryDeserializer
      extends StdDeserializer<NotebookTemplateVariableAvailableValuesQuery> {
    public NotebookTemplateVariableAvailableValuesQueryDeserializer() {
      this(NotebookTemplateVariableAvailableValuesQuery.class);
    }

    public NotebookTemplateVariableAvailableValuesQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public NotebookTemplateVariableAvailableValuesQuery deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize NotebookTemplateVariableAvailableValuesQueryLogRumSpans
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(Integer.class)
            || NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(Long.class)
            || NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(Float.class)
            || NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(Double.class)
            || NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(Boolean.class)
            || NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(
                            Integer.class)
                        || NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(Float.class)
                        || NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookTemplateVariableAvailableValuesQueryLogRumSpans) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'NotebookTemplateVariableAvailableValuesQueryLogRumSpans'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'NotebookTemplateVariableAvailableValuesQueryLogRumSpans'",
            e);
      }

      // deserialize NotebookTemplateVariableAvailableValuesQueryMetrics
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Integer.class)
            || NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Long.class)
            || NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Float.class)
            || NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Double.class)
            || NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Boolean.class)
            || NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Integer.class)
                        || NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Float.class)
                        || NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookTemplateVariableAvailableValuesQueryMetrics.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(NotebookTemplateVariableAvailableValuesQueryMetrics.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookTemplateVariableAvailableValuesQueryMetrics) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'NotebookTemplateVariableAvailableValuesQueryMetrics'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'NotebookTemplateVariableAvailableValuesQueryMetrics'",
            e);
      }

      NotebookTemplateVariableAvailableValuesQuery ret =
          new NotebookTemplateVariableAvailableValuesQuery();
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
    public NotebookTemplateVariableAvailableValuesQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "NotebookTemplateVariableAvailableValuesQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public NotebookTemplateVariableAvailableValuesQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public NotebookTemplateVariableAvailableValuesQuery(
      NotebookTemplateVariableAvailableValuesQueryLogRumSpans o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotebookTemplateVariableAvailableValuesQuery(
      NotebookTemplateVariableAvailableValuesQueryMetrics o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "NotebookTemplateVariableAvailableValuesQueryLogRumSpans",
        new GenericType<NotebookTemplateVariableAvailableValuesQueryLogRumSpans>() {});
    schemas.put(
        "NotebookTemplateVariableAvailableValuesQueryMetrics",
        new GenericType<NotebookTemplateVariableAvailableValuesQueryMetrics>() {});
    JSON.registerDescendants(
        NotebookTemplateVariableAvailableValuesQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return NotebookTemplateVariableAvailableValuesQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: NotebookTemplateVariableAvailableValuesQueryLogRumSpans,
   * NotebookTemplateVariableAvailableValuesQueryMetrics
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        NotebookTemplateVariableAvailableValuesQueryLogRumSpans.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        NotebookTemplateVariableAvailableValuesQueryMetrics.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be NotebookTemplateVariableAvailableValuesQueryLogRumSpans,"
            + " NotebookTemplateVariableAvailableValuesQueryMetrics");
  }

  /**
   * Get the actual instance, which can be the following:
   * NotebookTemplateVariableAvailableValuesQueryLogRumSpans,
   * NotebookTemplateVariableAvailableValuesQueryMetrics
   *
   * @return The actual instance (NotebookTemplateVariableAvailableValuesQueryLogRumSpans,
   *     NotebookTemplateVariableAvailableValuesQueryMetrics)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookTemplateVariableAvailableValuesQueryLogRumSpans`. If the
   * actual instance is not `NotebookTemplateVariableAvailableValuesQueryLogRumSpans`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookTemplateVariableAvailableValuesQueryLogRumSpans`
   * @throws ClassCastException if the instance is not
   *     `NotebookTemplateVariableAvailableValuesQueryLogRumSpans`
   */
  public NotebookTemplateVariableAvailableValuesQueryLogRumSpans
      getNotebookTemplateVariableAvailableValuesQueryLogRumSpans() throws ClassCastException {
    return (NotebookTemplateVariableAvailableValuesQueryLogRumSpans) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookTemplateVariableAvailableValuesQueryMetrics`. If the actual
   * instance is not `NotebookTemplateVariableAvailableValuesQueryMetrics`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `NotebookTemplateVariableAvailableValuesQueryMetrics`
   * @throws ClassCastException if the instance is not
   *     `NotebookTemplateVariableAvailableValuesQueryMetrics`
   */
  public NotebookTemplateVariableAvailableValuesQueryMetrics
      getNotebookTemplateVariableAvailableValuesQueryMetrics() throws ClassCastException {
    return (NotebookTemplateVariableAvailableValuesQueryMetrics) super.getActualInstance();
  }
}
