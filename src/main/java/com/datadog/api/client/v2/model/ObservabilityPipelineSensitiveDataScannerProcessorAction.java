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
        ObservabilityPipelineSensitiveDataScannerProcessorAction
            .ObservabilityPipelineSensitiveDataScannerProcessorActionDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorAction
            .ObservabilityPipelineSensitiveDataScannerProcessorActionSerializer.class)
public class ObservabilityPipelineSensitiveDataScannerProcessorAction
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineSensitiveDataScannerProcessorAction.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineSensitiveDataScannerProcessorActionSerializer
      extends StdSerializer<ObservabilityPipelineSensitiveDataScannerProcessorAction> {
    public ObservabilityPipelineSensitiveDataScannerProcessorActionSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorAction> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineSensitiveDataScannerProcessorActionDeserializer
      extends StdDeserializer<ObservabilityPipelineSensitiveDataScannerProcessorAction> {
    public ObservabilityPipelineSensitiveDataScannerProcessorActionDeserializer() {
      this(ObservabilityPipelineSensitiveDataScannerProcessorAction.class);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorActionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineSensitiveDataScannerProcessorAction deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorActionRedact
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                            Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorActionRedact) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorActionRedact'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorActionRedact'",
            e);
      }

      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorActionHash
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                            Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorActionHash) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorActionHash'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorActionHash'",
            e);
      }

      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class
                            .equals(Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
                            .class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class
                            .equals(Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
                            .class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact) tmp)
              .unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact'",
            e);
      }

      ObservabilityPipelineSensitiveDataScannerProcessorAction ret =
          new ObservabilityPipelineSensitiveDataScannerProcessorAction();
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
    public ObservabilityPipelineSensitiveDataScannerProcessorAction getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ObservabilityPipelineSensitiveDataScannerProcessorAction cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineSensitiveDataScannerProcessorAction() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorAction(
      ObservabilityPipelineSensitiveDataScannerProcessorActionRedact o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorAction(
      ObservabilityPipelineSensitiveDataScannerProcessorActionHash o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorAction(
      ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorActionRedact",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessorActionRedact>() {});
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorActionHash",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessorActionHash>() {});
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact",
        new GenericType<
            ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact>() {});
    JSON.registerDescendants(
        ObservabilityPipelineSensitiveDataScannerProcessorAction.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineSensitiveDataScannerProcessorAction.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * ObservabilityPipelineSensitiveDataScannerProcessorActionRedact,
   * ObservabilityPipelineSensitiveDataScannerProcessorActionHash,
   * ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorActionRedact.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorActionHash.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact.class,
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
        "Invalid instance type. Must be"
            + " ObservabilityPipelineSensitiveDataScannerProcessorActionRedact,"
            + " ObservabilityPipelineSensitiveDataScannerProcessorActionHash,"
            + " ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineSensitiveDataScannerProcessorActionRedact,
   * ObservabilityPipelineSensitiveDataScannerProcessorActionHash,
   * ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
   *
   * @return The actual instance (ObservabilityPipelineSensitiveDataScannerProcessorActionRedact,
   *     ObservabilityPipelineSensitiveDataScannerProcessorActionHash,
   *     ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorActionRedact`. If
   * the actual instance is not `ObservabilityPipelineSensitiveDataScannerProcessorActionRedact`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorActionRedact`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorActionRedact`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorActionRedact
      getObservabilityPipelineSensitiveDataScannerProcessorActionRedact()
          throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorActionRedact)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorActionHash`. If
   * the actual instance is not `ObservabilityPipelineSensitiveDataScannerProcessorActionHash`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorActionHash`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorActionHash`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorActionHash
      getObservabilityPipelineSensitiveDataScannerProcessorActionHash() throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorActionHash) super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact`. If the actual instance
   * is not `ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact
      getObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact()
          throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorActionPartialRedact)
        super.getActualInstance();
  }
}
