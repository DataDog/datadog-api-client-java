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
@JsonDeserialize(
    using = ObservabilityPipelineMetricValue.ObservabilityPipelineMetricValueDeserializer.class)
@JsonSerialize(
    using = ObservabilityPipelineMetricValue.ObservabilityPipelineMetricValueSerializer.class)
public class ObservabilityPipelineMetricValue extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineMetricValue.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineMetricValueSerializer
      extends StdSerializer<ObservabilityPipelineMetricValue> {
    public ObservabilityPipelineMetricValueSerializer(Class<ObservabilityPipelineMetricValue> t) {
      super(t);
    }

    public ObservabilityPipelineMetricValueSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineMetricValue value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineMetricValueDeserializer
      extends StdDeserializer<ObservabilityPipelineMetricValue> {
    public ObservabilityPipelineMetricValueDeserializer() {
      this(ObservabilityPipelineMetricValue.class);
    }

    public ObservabilityPipelineMetricValueDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineMetricValue deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineGeneratedMetricIncrementByOne
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Integer.class)
            || ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Long.class)
            || ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Float.class)
            || ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Double.class)
            || ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Boolean.class)
            || ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Integer.class)
                        || ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Float.class)
                        || ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGeneratedMetricIncrementByOne.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGeneratedMetricIncrementByOne.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGeneratedMetricIncrementByOne) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineGeneratedMetricIncrementByOne'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineGeneratedMetricIncrementByOne'",
            e);
      }

      // deserialize ObservabilityPipelineGeneratedMetricIncrementByField
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Integer.class)
            || ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Long.class)
            || ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Float.class)
            || ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Double.class)
            || ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Boolean.class)
            || ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Integer.class)
                        || ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Float.class)
                        || ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGeneratedMetricIncrementByField.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGeneratedMetricIncrementByField.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGeneratedMetricIncrementByField) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineGeneratedMetricIncrementByField'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineGeneratedMetricIncrementByField'",
            e);
      }

      ObservabilityPipelineMetricValue ret = new ObservabilityPipelineMetricValue();
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
    public ObservabilityPipelineMetricValue getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineMetricValue cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineMetricValue() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineMetricValue(ObservabilityPipelineGeneratedMetricIncrementByOne o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineMetricValue(ObservabilityPipelineGeneratedMetricIncrementByField o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineGeneratedMetricIncrementByOne",
        new GenericType<ObservabilityPipelineGeneratedMetricIncrementByOne>() {});
    schemas.put(
        "ObservabilityPipelineGeneratedMetricIncrementByField",
        new GenericType<ObservabilityPipelineGeneratedMetricIncrementByField>() {});
    JSON.registerDescendants(
        ObservabilityPipelineMetricValue.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineMetricValue.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineGeneratedMetricIncrementByOne,
   * ObservabilityPipelineGeneratedMetricIncrementByField
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineGeneratedMetricIncrementByOne.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineGeneratedMetricIncrementByField.class,
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
        "Invalid instance type. Must be ObservabilityPipelineGeneratedMetricIncrementByOne,"
            + " ObservabilityPipelineGeneratedMetricIncrementByField");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineGeneratedMetricIncrementByOne,
   * ObservabilityPipelineGeneratedMetricIncrementByField
   *
   * @return The actual instance (ObservabilityPipelineGeneratedMetricIncrementByOne,
   *     ObservabilityPipelineGeneratedMetricIncrementByField)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGeneratedMetricIncrementByOne`. If the actual
   * instance is not `ObservabilityPipelineGeneratedMetricIncrementByOne`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGeneratedMetricIncrementByOne`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineGeneratedMetricIncrementByOne`
   */
  public ObservabilityPipelineGeneratedMetricIncrementByOne
      getObservabilityPipelineGeneratedMetricIncrementByOne() throws ClassCastException {
    return (ObservabilityPipelineGeneratedMetricIncrementByOne) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGeneratedMetricIncrementByField`. If the
   * actual instance is not `ObservabilityPipelineGeneratedMetricIncrementByField`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGeneratedMetricIncrementByField`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineGeneratedMetricIncrementByField`
   */
  public ObservabilityPipelineGeneratedMetricIncrementByField
      getObservabilityPipelineGeneratedMetricIncrementByField() throws ClassCastException {
    return (ObservabilityPipelineGeneratedMetricIncrementByField) super.getActualInstance();
  }
}
