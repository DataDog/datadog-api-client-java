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
@JsonDeserialize(using = SyntheticsAPIStep.SyntheticsAPIStepDeserializer.class)
@JsonSerialize(using = SyntheticsAPIStep.SyntheticsAPIStepSerializer.class)
public class SyntheticsAPIStep extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SyntheticsAPIStep.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SyntheticsAPIStepSerializer extends StdSerializer<SyntheticsAPIStep> {
    public SyntheticsAPIStepSerializer(Class<SyntheticsAPIStep> t) {
      super(t);
    }

    public SyntheticsAPIStepSerializer() {
      this(null);
    }

    @Override
    public void serialize(SyntheticsAPIStep value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SyntheticsAPIStepDeserializer extends StdDeserializer<SyntheticsAPIStep> {
    public SyntheticsAPIStepDeserializer() {
      this(SyntheticsAPIStep.class);
    }

    public SyntheticsAPIStepDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SyntheticsAPIStep deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SyntheticsAPITestStep
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsAPITestStep.class.equals(Integer.class)
            || SyntheticsAPITestStep.class.equals(Long.class)
            || SyntheticsAPITestStep.class.equals(Float.class)
            || SyntheticsAPITestStep.class.equals(Double.class)
            || SyntheticsAPITestStep.class.equals(Boolean.class)
            || SyntheticsAPITestStep.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsAPITestStep.class.equals(Integer.class)
                        || SyntheticsAPITestStep.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsAPITestStep.class.equals(Float.class)
                        || SyntheticsAPITestStep.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsAPITestStep.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsAPITestStep.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAPITestStep.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsAPITestStep) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsAPITestStep'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsAPITestStep'", e);
      }

      // deserialize SyntheticsAPIWaitStep
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsAPIWaitStep.class.equals(Integer.class)
            || SyntheticsAPIWaitStep.class.equals(Long.class)
            || SyntheticsAPIWaitStep.class.equals(Float.class)
            || SyntheticsAPIWaitStep.class.equals(Double.class)
            || SyntheticsAPIWaitStep.class.equals(Boolean.class)
            || SyntheticsAPIWaitStep.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsAPIWaitStep.class.equals(Integer.class)
                        || SyntheticsAPIWaitStep.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsAPIWaitStep.class.equals(Float.class)
                        || SyntheticsAPIWaitStep.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsAPIWaitStep.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsAPIWaitStep.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAPIWaitStep.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsAPIWaitStep) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsAPIWaitStep'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsAPIWaitStep'", e);
      }

      // deserialize SyntheticsAPISubtestStep
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsAPISubtestStep.class.equals(Integer.class)
            || SyntheticsAPISubtestStep.class.equals(Long.class)
            || SyntheticsAPISubtestStep.class.equals(Float.class)
            || SyntheticsAPISubtestStep.class.equals(Double.class)
            || SyntheticsAPISubtestStep.class.equals(Boolean.class)
            || SyntheticsAPISubtestStep.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsAPISubtestStep.class.equals(Integer.class)
                        || SyntheticsAPISubtestStep.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsAPISubtestStep.class.equals(Float.class)
                        || SyntheticsAPISubtestStep.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsAPISubtestStep.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsAPISubtestStep.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsAPISubtestStep.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsAPISubtestStep) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsAPISubtestStep'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SyntheticsAPISubtestStep'", e);
      }

      SyntheticsAPIStep ret = new SyntheticsAPIStep();
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
    public SyntheticsAPIStep getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SyntheticsAPIStep cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SyntheticsAPIStep() {
    super("oneOf", Boolean.FALSE);
  }

  public SyntheticsAPIStep(SyntheticsAPITestStep o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsAPIStep(SyntheticsAPIWaitStep o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsAPIStep(SyntheticsAPISubtestStep o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("SyntheticsAPITestStep", new GenericType<SyntheticsAPITestStep>() {});
    schemas.put("SyntheticsAPIWaitStep", new GenericType<SyntheticsAPIWaitStep>() {});
    schemas.put("SyntheticsAPISubtestStep", new GenericType<SyntheticsAPISubtestStep>() {});
    JSON.registerDescendants(SyntheticsAPIStep.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SyntheticsAPIStep.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SyntheticsAPITestStep, SyntheticsAPIWaitStep,
   * SyntheticsAPISubtestStep
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(SyntheticsAPITestStep.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SyntheticsAPIWaitStep.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SyntheticsAPISubtestStep.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SyntheticsAPITestStep, SyntheticsAPIWaitStep,"
            + " SyntheticsAPISubtestStep");
  }

  /**
   * Get the actual instance, which can be the following: SyntheticsAPITestStep,
   * SyntheticsAPIWaitStep, SyntheticsAPISubtestStep
   *
   * @return The actual instance (SyntheticsAPITestStep, SyntheticsAPIWaitStep,
   *     SyntheticsAPISubtestStep)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsAPITestStep`. If the actual instance is not
   * `SyntheticsAPITestStep`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsAPITestStep`
   * @throws ClassCastException if the instance is not `SyntheticsAPITestStep`
   */
  public SyntheticsAPITestStep getSyntheticsAPITestStep() throws ClassCastException {
    return (SyntheticsAPITestStep) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsAPIWaitStep`. If the actual instance is not
   * `SyntheticsAPIWaitStep`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsAPIWaitStep`
   * @throws ClassCastException if the instance is not `SyntheticsAPIWaitStep`
   */
  public SyntheticsAPIWaitStep getSyntheticsAPIWaitStep() throws ClassCastException {
    return (SyntheticsAPIWaitStep) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsAPISubtestStep`. If the actual instance is not
   * `SyntheticsAPISubtestStep`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsAPISubtestStep`
   * @throws ClassCastException if the instance is not `SyntheticsAPISubtestStep`
   */
  public SyntheticsAPISubtestStep getSyntheticsAPISubtestStep() throws ClassCastException {
    return (SyntheticsAPISubtestStep) super.getActualInstance();
  }
}
