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
    using = ExperimentsWarehouseFilterInput.ExperimentsWarehouseFilterInputDeserializer.class)
@JsonSerialize(
    using = ExperimentsWarehouseFilterInput.ExperimentsWarehouseFilterInputSerializer.class)
public class ExperimentsWarehouseFilterInput extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ExperimentsWarehouseFilterInput.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ExperimentsWarehouseFilterInputSerializer
      extends StdSerializer<ExperimentsWarehouseFilterInput> {
    public ExperimentsWarehouseFilterInputSerializer(Class<ExperimentsWarehouseFilterInput> t) {
      super(t);
    }

    public ExperimentsWarehouseFilterInputSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsWarehouseFilterInput value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ExperimentsWarehouseFilterInputDeserializer
      extends StdDeserializer<ExperimentsWarehouseFilterInput> {
    public ExperimentsWarehouseFilterInputDeserializer() {
      this(ExperimentsWarehouseFilterInput.class);
    }

    public ExperimentsWarehouseFilterInputDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ExperimentsWarehouseFilterInput deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ExperimentsPropertyFilterInput
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsPropertyFilterInput.class.equals(Integer.class)
            || ExperimentsPropertyFilterInput.class.equals(Long.class)
            || ExperimentsPropertyFilterInput.class.equals(Float.class)
            || ExperimentsPropertyFilterInput.class.equals(Double.class)
            || ExperimentsPropertyFilterInput.class.equals(Boolean.class)
            || ExperimentsPropertyFilterInput.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsPropertyFilterInput.class.equals(Integer.class)
                        || ExperimentsPropertyFilterInput.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsPropertyFilterInput.class.equals(Float.class)
                        || ExperimentsPropertyFilterInput.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsPropertyFilterInput.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsPropertyFilterInput.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ExperimentsPropertyFilterInput.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsPropertyFilterInput) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ExperimentsPropertyFilterInput'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ExperimentsPropertyFilterInput'", e);
      }

      // deserialize ExperimentsPropertyNullFilterInput
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsPropertyNullFilterInput.class.equals(Integer.class)
            || ExperimentsPropertyNullFilterInput.class.equals(Long.class)
            || ExperimentsPropertyNullFilterInput.class.equals(Float.class)
            || ExperimentsPropertyNullFilterInput.class.equals(Double.class)
            || ExperimentsPropertyNullFilterInput.class.equals(Boolean.class)
            || ExperimentsPropertyNullFilterInput.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsPropertyNullFilterInput.class.equals(Integer.class)
                        || ExperimentsPropertyNullFilterInput.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsPropertyNullFilterInput.class.equals(Float.class)
                        || ExperimentsPropertyNullFilterInput.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsPropertyNullFilterInput.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsPropertyNullFilterInput.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ExperimentsPropertyNullFilterInput.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsPropertyNullFilterInput) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ExperimentsPropertyNullFilterInput'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ExperimentsPropertyNullFilterInput'",
            e);
      }

      // deserialize ExperimentsMeasureComparisonFilterInput
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsMeasureComparisonFilterInput.class.equals(Integer.class)
            || ExperimentsMeasureComparisonFilterInput.class.equals(Long.class)
            || ExperimentsMeasureComparisonFilterInput.class.equals(Float.class)
            || ExperimentsMeasureComparisonFilterInput.class.equals(Double.class)
            || ExperimentsMeasureComparisonFilterInput.class.equals(Boolean.class)
            || ExperimentsMeasureComparisonFilterInput.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsMeasureComparisonFilterInput.class.equals(Integer.class)
                        || ExperimentsMeasureComparisonFilterInput.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsMeasureComparisonFilterInput.class.equals(Float.class)
                        || ExperimentsMeasureComparisonFilterInput.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsMeasureComparisonFilterInput.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsMeasureComparisonFilterInput.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ExperimentsMeasureComparisonFilterInput.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsMeasureComparisonFilterInput) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ExperimentsMeasureComparisonFilterInput'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ExperimentsMeasureComparisonFilterInput'",
            e);
      }

      // deserialize ExperimentsMeasureRangeFilterInput
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsMeasureRangeFilterInput.class.equals(Integer.class)
            || ExperimentsMeasureRangeFilterInput.class.equals(Long.class)
            || ExperimentsMeasureRangeFilterInput.class.equals(Float.class)
            || ExperimentsMeasureRangeFilterInput.class.equals(Double.class)
            || ExperimentsMeasureRangeFilterInput.class.equals(Boolean.class)
            || ExperimentsMeasureRangeFilterInput.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsMeasureRangeFilterInput.class.equals(Integer.class)
                        || ExperimentsMeasureRangeFilterInput.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsMeasureRangeFilterInput.class.equals(Float.class)
                        || ExperimentsMeasureRangeFilterInput.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsMeasureRangeFilterInput.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsMeasureRangeFilterInput.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ExperimentsMeasureRangeFilterInput.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsMeasureRangeFilterInput) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ExperimentsMeasureRangeFilterInput'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ExperimentsMeasureRangeFilterInput'",
            e);
      }

      // deserialize ExperimentsMeasureNullFilterInput
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsMeasureNullFilterInput.class.equals(Integer.class)
            || ExperimentsMeasureNullFilterInput.class.equals(Long.class)
            || ExperimentsMeasureNullFilterInput.class.equals(Float.class)
            || ExperimentsMeasureNullFilterInput.class.equals(Double.class)
            || ExperimentsMeasureNullFilterInput.class.equals(Boolean.class)
            || ExperimentsMeasureNullFilterInput.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsMeasureNullFilterInput.class.equals(Integer.class)
                        || ExperimentsMeasureNullFilterInput.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsMeasureNullFilterInput.class.equals(Float.class)
                        || ExperimentsMeasureNullFilterInput.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsMeasureNullFilterInput.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsMeasureNullFilterInput.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ExperimentsMeasureNullFilterInput.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsMeasureNullFilterInput) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ExperimentsMeasureNullFilterInput'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ExperimentsMeasureNullFilterInput'", e);
      }

      ExperimentsWarehouseFilterInput ret = new ExperimentsWarehouseFilterInput();
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
    public ExperimentsWarehouseFilterInput getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ExperimentsWarehouseFilterInput cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ExperimentsWarehouseFilterInput() {
    super("oneOf", Boolean.FALSE);
  }

  public ExperimentsWarehouseFilterInput(ExperimentsPropertyFilterInput o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ExperimentsWarehouseFilterInput(ExperimentsPropertyNullFilterInput o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ExperimentsWarehouseFilterInput(ExperimentsMeasureComparisonFilterInput o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ExperimentsWarehouseFilterInput(ExperimentsMeasureRangeFilterInput o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ExperimentsWarehouseFilterInput(ExperimentsMeasureNullFilterInput o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ExperimentsPropertyFilterInput", new GenericType<ExperimentsPropertyFilterInput>() {});
    schemas.put(
        "ExperimentsPropertyNullFilterInput",
        new GenericType<ExperimentsPropertyNullFilterInput>() {});
    schemas.put(
        "ExperimentsMeasureComparisonFilterInput",
        new GenericType<ExperimentsMeasureComparisonFilterInput>() {});
    schemas.put(
        "ExperimentsMeasureRangeFilterInput",
        new GenericType<ExperimentsMeasureRangeFilterInput>() {});
    schemas.put(
        "ExperimentsMeasureNullFilterInput",
        new GenericType<ExperimentsMeasureNullFilterInput>() {});
    JSON.registerDescendants(
        ExperimentsWarehouseFilterInput.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ExperimentsWarehouseFilterInput.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ExperimentsPropertyFilterInput,
   * ExperimentsPropertyNullFilterInput, ExperimentsMeasureComparisonFilterInput,
   * ExperimentsMeasureRangeFilterInput, ExperimentsMeasureNullFilterInput
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ExperimentsPropertyFilterInput.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ExperimentsPropertyNullFilterInput.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ExperimentsMeasureComparisonFilterInput.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ExperimentsMeasureRangeFilterInput.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ExperimentsMeasureNullFilterInput.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ExperimentsPropertyFilterInput,"
            + " ExperimentsPropertyNullFilterInput, ExperimentsMeasureComparisonFilterInput,"
            + " ExperimentsMeasureRangeFilterInput, ExperimentsMeasureNullFilterInput");
  }

  /**
   * Get the actual instance, which can be the following: ExperimentsPropertyFilterInput,
   * ExperimentsPropertyNullFilterInput, ExperimentsMeasureComparisonFilterInput,
   * ExperimentsMeasureRangeFilterInput, ExperimentsMeasureNullFilterInput
   *
   * @return The actual instance (ExperimentsPropertyFilterInput,
   *     ExperimentsPropertyNullFilterInput, ExperimentsMeasureComparisonFilterInput,
   *     ExperimentsMeasureRangeFilterInput, ExperimentsMeasureNullFilterInput)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsPropertyFilterInput`. If the actual instance is not
   * `ExperimentsPropertyFilterInput`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsPropertyFilterInput`
   * @throws ClassCastException if the instance is not `ExperimentsPropertyFilterInput`
   */
  public ExperimentsPropertyFilterInput getExperimentsPropertyFilterInput()
      throws ClassCastException {
    return (ExperimentsPropertyFilterInput) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsPropertyNullFilterInput`. If the actual instance is not
   * `ExperimentsPropertyNullFilterInput`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsPropertyNullFilterInput`
   * @throws ClassCastException if the instance is not `ExperimentsPropertyNullFilterInput`
   */
  public ExperimentsPropertyNullFilterInput getExperimentsPropertyNullFilterInput()
      throws ClassCastException {
    return (ExperimentsPropertyNullFilterInput) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsMeasureComparisonFilterInput`. If the actual instance is
   * not `ExperimentsMeasureComparisonFilterInput`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsMeasureComparisonFilterInput`
   * @throws ClassCastException if the instance is not `ExperimentsMeasureComparisonFilterInput`
   */
  public ExperimentsMeasureComparisonFilterInput getExperimentsMeasureComparisonFilterInput()
      throws ClassCastException {
    return (ExperimentsMeasureComparisonFilterInput) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsMeasureRangeFilterInput`. If the actual instance is not
   * `ExperimentsMeasureRangeFilterInput`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsMeasureRangeFilterInput`
   * @throws ClassCastException if the instance is not `ExperimentsMeasureRangeFilterInput`
   */
  public ExperimentsMeasureRangeFilterInput getExperimentsMeasureRangeFilterInput()
      throws ClassCastException {
    return (ExperimentsMeasureRangeFilterInput) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsMeasureNullFilterInput`. If the actual instance is not
   * `ExperimentsMeasureNullFilterInput`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsMeasureNullFilterInput`
   * @throws ClassCastException if the instance is not `ExperimentsMeasureNullFilterInput`
   */
  public ExperimentsMeasureNullFilterInput getExperimentsMeasureNullFilterInput()
      throws ClassCastException {
    return (ExperimentsMeasureNullFilterInput) super.getActualInstance();
  }
}
