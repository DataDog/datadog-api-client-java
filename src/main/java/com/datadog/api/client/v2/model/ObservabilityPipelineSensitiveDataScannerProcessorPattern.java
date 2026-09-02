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
        ObservabilityPipelineSensitiveDataScannerProcessorPattern
            .ObservabilityPipelineSensitiveDataScannerProcessorPatternDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorPattern
            .ObservabilityPipelineSensitiveDataScannerProcessorPatternSerializer.class)
public class ObservabilityPipelineSensitiveDataScannerProcessorPattern
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineSensitiveDataScannerProcessorPattern.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineSensitiveDataScannerProcessorPatternSerializer
      extends StdSerializer<ObservabilityPipelineSensitiveDataScannerProcessorPattern> {
    public ObservabilityPipelineSensitiveDataScannerProcessorPatternSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorPattern> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorPatternSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorPattern value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineSensitiveDataScannerProcessorPatternDeserializer
      extends StdDeserializer<ObservabilityPipelineSensitiveDataScannerProcessorPattern> {
    public ObservabilityPipelineSensitiveDataScannerProcessorPatternDeserializer() {
      this(ObservabilityPipelineSensitiveDataScannerProcessorPattern.class);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorPatternDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineSensitiveDataScannerProcessorPattern deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                            Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern'",
            e);
      }

      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                            Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern'",
            e);
      }

      ObservabilityPipelineSensitiveDataScannerProcessorPattern ret =
          new ObservabilityPipelineSensitiveDataScannerProcessorPattern();
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
    public ObservabilityPipelineSensitiveDataScannerProcessorPattern getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ObservabilityPipelineSensitiveDataScannerProcessorPattern cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineSensitiveDataScannerProcessorPattern() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorPattern(
      ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorPattern(
      ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern>() {});
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern>() {});
    JSON.registerDescendants(
        ObservabilityPipelineSensitiveDataScannerProcessorPattern.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineSensitiveDataScannerProcessorPattern.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern,
   * ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern.class,
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
            + " ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern,"
            + " ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern,
   * ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern
   *
   * @return The actual instance (ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern,
   *     ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern`.
   * If the actual instance is not
   * `ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern
      getObservabilityPipelineSensitiveDataScannerProcessorCustomPattern()
          throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorCustomPattern)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern`.
   * If the actual instance is not
   * `ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern
      getObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern()
          throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorLibraryPattern)
        super.getActualInstance();
  }
}
