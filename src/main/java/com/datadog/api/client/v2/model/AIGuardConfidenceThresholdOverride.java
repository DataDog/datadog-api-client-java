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
    using = AIGuardConfidenceThresholdOverride.AIGuardConfidenceThresholdOverrideDeserializer.class)
@JsonSerialize(
    using = AIGuardConfidenceThresholdOverride.AIGuardConfidenceThresholdOverrideSerializer.class)
public class AIGuardConfidenceThresholdOverride extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(AIGuardConfidenceThresholdOverride.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AIGuardConfidenceThresholdOverrideSerializer
      extends StdSerializer<AIGuardConfidenceThresholdOverride> {
    public AIGuardConfidenceThresholdOverrideSerializer(
        Class<AIGuardConfidenceThresholdOverride> t) {
      super(t);
    }

    public AIGuardConfidenceThresholdOverrideSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AIGuardConfidenceThresholdOverride value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AIGuardConfidenceThresholdOverrideDeserializer
      extends StdDeserializer<AIGuardConfidenceThresholdOverride> {
    public AIGuardConfidenceThresholdOverrideDeserializer() {
      this(AIGuardConfidenceThresholdOverride.class);
    }

    public AIGuardConfidenceThresholdOverrideDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AIGuardConfidenceThresholdOverride deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize Double
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Double.class.equals(Integer.class)
            || Double.class.equals(Long.class)
            || Double.class.equals(Float.class)
            || Double.class.equals(Double.class)
            || Double.class.equals(Boolean.class)
            || Double.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Double.class.equals(Integer.class) || Double.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Double.class.equals(Float.class) || Double.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Double.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (Double.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Double.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'Double'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Double'", e);
      }

      // deserialize AIGuardConfidenceThreshold
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AIGuardConfidenceThreshold.class.equals(Integer.class)
            || AIGuardConfidenceThreshold.class.equals(Long.class)
            || AIGuardConfidenceThreshold.class.equals(Float.class)
            || AIGuardConfidenceThreshold.class.equals(Double.class)
            || AIGuardConfidenceThreshold.class.equals(Boolean.class)
            || AIGuardConfidenceThreshold.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AIGuardConfidenceThreshold.class.equals(Integer.class)
                        || AIGuardConfidenceThreshold.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AIGuardConfidenceThreshold.class.equals(Float.class)
                        || AIGuardConfidenceThreshold.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AIGuardConfidenceThreshold.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AIGuardConfidenceThreshold.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AIGuardConfidenceThreshold.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AIGuardConfidenceThreshold) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AIGuardConfidenceThreshold'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AIGuardConfidenceThreshold'", e);
      }

      AIGuardConfidenceThresholdOverride ret = new AIGuardConfidenceThresholdOverride();
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
    public AIGuardConfidenceThresholdOverride getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "AIGuardConfidenceThresholdOverride cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AIGuardConfidenceThresholdOverride() {
    super("oneOf", Boolean.FALSE);
  }

  public AIGuardConfidenceThresholdOverride(Double o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AIGuardConfidenceThresholdOverride(AIGuardConfidenceThreshold o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("Double", new GenericType<Double>() {});
    schemas.put("AIGuardConfidenceThreshold", new GenericType<AIGuardConfidenceThreshold>() {});
    JSON.registerDescendants(
        AIGuardConfidenceThresholdOverride.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AIGuardConfidenceThresholdOverride.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: Double, AIGuardConfidenceThreshold
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(Double.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AIGuardConfidenceThreshold.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be Double, AIGuardConfidenceThreshold");
  }

  /**
   * Get the actual instance, which can be the following: Double, AIGuardConfidenceThreshold
   *
   * @return The actual instance (Double, AIGuardConfidenceThreshold)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `Double`. If the actual instance is not `Double`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Double`
   * @throws ClassCastException if the instance is not `Double`
   */
  public Double getDouble() throws ClassCastException {
    return (Double) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AIGuardConfidenceThreshold`. If the actual instance is not
   * `AIGuardConfidenceThreshold`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AIGuardConfidenceThreshold`
   * @throws ClassCastException if the instance is not `AIGuardConfidenceThreshold`
   */
  public AIGuardConfidenceThreshold getAIGuardConfidenceThreshold() throws ClassCastException {
    return (AIGuardConfidenceThreshold) super.getActualInstance();
  }
}
