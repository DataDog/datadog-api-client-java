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
    using = ObservabilityPipelineBufferOptions.ObservabilityPipelineBufferOptionsDeserializer.class)
@JsonSerialize(
    using = ObservabilityPipelineBufferOptions.ObservabilityPipelineBufferOptionsSerializer.class)
public class ObservabilityPipelineBufferOptions extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineBufferOptions.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineBufferOptionsSerializer
      extends StdSerializer<ObservabilityPipelineBufferOptions> {
    public ObservabilityPipelineBufferOptionsSerializer(
        Class<ObservabilityPipelineBufferOptions> t) {
      super(t);
    }

    public ObservabilityPipelineBufferOptionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineBufferOptions value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineBufferOptionsDeserializer
      extends StdDeserializer<ObservabilityPipelineBufferOptions> {
    public ObservabilityPipelineBufferOptionsDeserializer() {
      this(ObservabilityPipelineBufferOptions.class);
    }

    public ObservabilityPipelineBufferOptionsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineBufferOptions deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineDiskBufferOptions
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineDiskBufferOptions.class.equals(Integer.class)
            || ObservabilityPipelineDiskBufferOptions.class.equals(Long.class)
            || ObservabilityPipelineDiskBufferOptions.class.equals(Float.class)
            || ObservabilityPipelineDiskBufferOptions.class.equals(Double.class)
            || ObservabilityPipelineDiskBufferOptions.class.equals(Boolean.class)
            || ObservabilityPipelineDiskBufferOptions.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineDiskBufferOptions.class.equals(Integer.class)
                        || ObservabilityPipelineDiskBufferOptions.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineDiskBufferOptions.class.equals(Float.class)
                        || ObservabilityPipelineDiskBufferOptions.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineDiskBufferOptions.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineDiskBufferOptions.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineDiskBufferOptions.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineDiskBufferOptions) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineDiskBufferOptions'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineDiskBufferOptions'",
            e);
      }

      // deserialize ObservabilityPipelineMemoryBufferOptions
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineMemoryBufferOptions.class.equals(Integer.class)
            || ObservabilityPipelineMemoryBufferOptions.class.equals(Long.class)
            || ObservabilityPipelineMemoryBufferOptions.class.equals(Float.class)
            || ObservabilityPipelineMemoryBufferOptions.class.equals(Double.class)
            || ObservabilityPipelineMemoryBufferOptions.class.equals(Boolean.class)
            || ObservabilityPipelineMemoryBufferOptions.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineMemoryBufferOptions.class.equals(Integer.class)
                        || ObservabilityPipelineMemoryBufferOptions.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineMemoryBufferOptions.class.equals(Float.class)
                        || ObservabilityPipelineMemoryBufferOptions.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineMemoryBufferOptions.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineMemoryBufferOptions.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineMemoryBufferOptions.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineMemoryBufferOptions) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineMemoryBufferOptions'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineMemoryBufferOptions'",
            e);
      }

      // deserialize ObservabilityPipelineMemoryBufferSizeOptions
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Integer.class)
            || ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Long.class)
            || ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Float.class)
            || ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Double.class)
            || ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Boolean.class)
            || ObservabilityPipelineMemoryBufferSizeOptions.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Integer.class)
                        || ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Float.class)
                        || ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineMemoryBufferSizeOptions.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineMemoryBufferSizeOptions.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineMemoryBufferSizeOptions.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineMemoryBufferSizeOptions) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineMemoryBufferSizeOptions'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineMemoryBufferSizeOptions'",
            e);
      }

      ObservabilityPipelineBufferOptions ret = new ObservabilityPipelineBufferOptions();
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
    public ObservabilityPipelineBufferOptions getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineBufferOptions cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineBufferOptions() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineBufferOptions(ObservabilityPipelineDiskBufferOptions o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineBufferOptions(ObservabilityPipelineMemoryBufferOptions o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineBufferOptions(ObservabilityPipelineMemoryBufferSizeOptions o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineDiskBufferOptions",
        new GenericType<ObservabilityPipelineDiskBufferOptions>() {});
    schemas.put(
        "ObservabilityPipelineMemoryBufferOptions",
        new GenericType<ObservabilityPipelineMemoryBufferOptions>() {});
    schemas.put(
        "ObservabilityPipelineMemoryBufferSizeOptions",
        new GenericType<ObservabilityPipelineMemoryBufferSizeOptions>() {});
    JSON.registerDescendants(
        ObservabilityPipelineBufferOptions.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineBufferOptions.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineDiskBufferOptions,
   * ObservabilityPipelineMemoryBufferOptions, ObservabilityPipelineMemoryBufferSizeOptions
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineDiskBufferOptions.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineMemoryBufferOptions.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineMemoryBufferSizeOptions.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineDiskBufferOptions,"
            + " ObservabilityPipelineMemoryBufferOptions,"
            + " ObservabilityPipelineMemoryBufferSizeOptions");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineDiskBufferOptions,
   * ObservabilityPipelineMemoryBufferOptions, ObservabilityPipelineMemoryBufferSizeOptions
   *
   * @return The actual instance (ObservabilityPipelineDiskBufferOptions,
   *     ObservabilityPipelineMemoryBufferOptions, ObservabilityPipelineMemoryBufferSizeOptions)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineDiskBufferOptions`. If the actual instance is
   * not `ObservabilityPipelineDiskBufferOptions`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineDiskBufferOptions`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineDiskBufferOptions`
   */
  public ObservabilityPipelineDiskBufferOptions getObservabilityPipelineDiskBufferOptions()
      throws ClassCastException {
    return (ObservabilityPipelineDiskBufferOptions) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineMemoryBufferOptions`. If the actual instance
   * is not `ObservabilityPipelineMemoryBufferOptions`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineMemoryBufferOptions`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineMemoryBufferOptions`
   */
  public ObservabilityPipelineMemoryBufferOptions getObservabilityPipelineMemoryBufferOptions()
      throws ClassCastException {
    return (ObservabilityPipelineMemoryBufferOptions) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineMemoryBufferSizeOptions`. If the actual
   * instance is not `ObservabilityPipelineMemoryBufferSizeOptions`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineMemoryBufferSizeOptions`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineMemoryBufferSizeOptions`
   */
  public ObservabilityPipelineMemoryBufferSizeOptions
      getObservabilityPipelineMemoryBufferSizeOptions() throws ClassCastException {
    return (ObservabilityPipelineMemoryBufferSizeOptions) super.getActualInstance();
  }
}
