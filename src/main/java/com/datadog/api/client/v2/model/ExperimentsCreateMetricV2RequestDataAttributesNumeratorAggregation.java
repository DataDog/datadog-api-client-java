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
    using =
        ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation
            .ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationDeserializer.class)
@JsonSerialize(
    using =
        ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation
            .ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationSerializer.class)
public class ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(
          ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationSerializer
      extends StdSerializer<ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation> {
    public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationSerializer(
        Class<ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation> t) {
      super(t);
    }

    public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationDeserializer
      extends StdDeserializer<ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation> {
    public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationDeserializer() {
      this(ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation.class);
    }

    public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregationDeserializer(
        Class<?> vc) {
      super(vc);
    }

    @Override
    public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ExperimentsWarehouseMetricAggregationInput
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsWarehouseMetricAggregationInput.class.equals(Integer.class)
            || ExperimentsWarehouseMetricAggregationInput.class.equals(Long.class)
            || ExperimentsWarehouseMetricAggregationInput.class.equals(Float.class)
            || ExperimentsWarehouseMetricAggregationInput.class.equals(Double.class)
            || ExperimentsWarehouseMetricAggregationInput.class.equals(Boolean.class)
            || ExperimentsWarehouseMetricAggregationInput.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsWarehouseMetricAggregationInput.class.equals(Integer.class)
                        || ExperimentsWarehouseMetricAggregationInput.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsWarehouseMetricAggregationInput.class.equals(Float.class)
                        || ExperimentsWarehouseMetricAggregationInput.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsWarehouseMetricAggregationInput.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsWarehouseMetricAggregationInput.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ExperimentsWarehouseMetricAggregationInput.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsWarehouseMetricAggregationInput) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ExperimentsWarehouseMetricAggregationInput'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ExperimentsWarehouseMetricAggregationInput'",
            e);
      }

      // deserialize ExperimentsDatadogMetricAggregationInput
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsDatadogMetricAggregationInput.class.equals(Integer.class)
            || ExperimentsDatadogMetricAggregationInput.class.equals(Long.class)
            || ExperimentsDatadogMetricAggregationInput.class.equals(Float.class)
            || ExperimentsDatadogMetricAggregationInput.class.equals(Double.class)
            || ExperimentsDatadogMetricAggregationInput.class.equals(Boolean.class)
            || ExperimentsDatadogMetricAggregationInput.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsDatadogMetricAggregationInput.class.equals(Integer.class)
                        || ExperimentsDatadogMetricAggregationInput.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsDatadogMetricAggregationInput.class.equals(Float.class)
                        || ExperimentsDatadogMetricAggregationInput.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsDatadogMetricAggregationInput.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsDatadogMetricAggregationInput.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ExperimentsDatadogMetricAggregationInput.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsDatadogMetricAggregationInput) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ExperimentsDatadogMetricAggregationInput'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ExperimentsDatadogMetricAggregationInput'",
            e);
      }

      ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation ret =
          new ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation();
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
    public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation() {
    super("oneOf", Boolean.FALSE);
  }

  public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation(
      ExperimentsWarehouseMetricAggregationInput o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation(
      ExperimentsDatadogMetricAggregationInput o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ExperimentsWarehouseMetricAggregationInput",
        new GenericType<ExperimentsWarehouseMetricAggregationInput>() {});
    schemas.put(
        "ExperimentsDatadogMetricAggregationInput",
        new GenericType<ExperimentsDatadogMetricAggregationInput>() {});
    JSON.registerDescendants(
        ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ExperimentsWarehouseMetricAggregationInput,
   * ExperimentsDatadogMetricAggregationInput
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ExperimentsWarehouseMetricAggregationInput.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ExperimentsDatadogMetricAggregationInput.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ExperimentsWarehouseMetricAggregationInput,"
            + " ExperimentsDatadogMetricAggregationInput");
  }

  /**
   * Get the actual instance, which can be the following:
   * ExperimentsWarehouseMetricAggregationInput, ExperimentsDatadogMetricAggregationInput
   *
   * @return The actual instance (ExperimentsWarehouseMetricAggregationInput,
   *     ExperimentsDatadogMetricAggregationInput)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsWarehouseMetricAggregationInput`. If the actual instance
   * is not `ExperimentsWarehouseMetricAggregationInput`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsWarehouseMetricAggregationInput`
   * @throws ClassCastException if the instance is not `ExperimentsWarehouseMetricAggregationInput`
   */
  public ExperimentsWarehouseMetricAggregationInput getExperimentsWarehouseMetricAggregationInput()
      throws ClassCastException {
    return (ExperimentsWarehouseMetricAggregationInput) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsDatadogMetricAggregationInput`. If the actual instance
   * is not `ExperimentsDatadogMetricAggregationInput`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsDatadogMetricAggregationInput`
   * @throws ClassCastException if the instance is not `ExperimentsDatadogMetricAggregationInput`
   */
  public ExperimentsDatadogMetricAggregationInput getExperimentsDatadogMetricAggregationInput()
      throws ClassCastException {
    return (ExperimentsDatadogMetricAggregationInput) super.getActualInstance();
  }
}
