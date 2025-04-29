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
        ObservabilityPipelineOcsfMapperProcessorMappingMapping
            .ObservabilityPipelineOcsfMapperProcessorMappingMappingDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineOcsfMapperProcessorMappingMapping
            .ObservabilityPipelineOcsfMapperProcessorMappingMappingSerializer.class)
public class ObservabilityPipelineOcsfMapperProcessorMappingMapping extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineOcsfMapperProcessorMappingMapping.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineOcsfMapperProcessorMappingMappingSerializer
      extends StdSerializer<ObservabilityPipelineOcsfMapperProcessorMappingMapping> {
    public ObservabilityPipelineOcsfMapperProcessorMappingMappingSerializer(
        Class<ObservabilityPipelineOcsfMapperProcessorMappingMapping> t) {
      super(t);
    }

    public ObservabilityPipelineOcsfMapperProcessorMappingMappingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineOcsfMapperProcessorMappingMapping value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineOcsfMapperProcessorMappingMappingDeserializer
      extends StdDeserializer<ObservabilityPipelineOcsfMapperProcessorMappingMapping> {
    public ObservabilityPipelineOcsfMapperProcessorMappingMappingDeserializer() {
      this(ObservabilityPipelineOcsfMapperProcessorMappingMapping.class);
    }

    public ObservabilityPipelineOcsfMapperProcessorMappingMappingDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineOcsfMapperProcessorMappingMapping deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineOcsfMappingLibrary
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineOcsfMappingLibrary.class.equals(Integer.class)
            || ObservabilityPipelineOcsfMappingLibrary.class.equals(Long.class)
            || ObservabilityPipelineOcsfMappingLibrary.class.equals(Float.class)
            || ObservabilityPipelineOcsfMappingLibrary.class.equals(Double.class)
            || ObservabilityPipelineOcsfMappingLibrary.class.equals(Boolean.class)
            || ObservabilityPipelineOcsfMappingLibrary.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineOcsfMappingLibrary.class.equals(Integer.class)
                        || ObservabilityPipelineOcsfMappingLibrary.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineOcsfMappingLibrary.class.equals(Float.class)
                        || ObservabilityPipelineOcsfMappingLibrary.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineOcsfMappingLibrary.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineOcsfMappingLibrary.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineOcsfMappingLibrary.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineOcsfMappingLibrary'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineOcsfMappingLibrary'",
            e);
      }

      ObservabilityPipelineOcsfMapperProcessorMappingMapping ret =
          new ObservabilityPipelineOcsfMapperProcessorMappingMapping();
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
    public ObservabilityPipelineOcsfMapperProcessorMappingMapping getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ObservabilityPipelineOcsfMapperProcessorMappingMapping cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineOcsfMapperProcessorMappingMapping() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineOcsfMapperProcessorMappingMapping(
      ObservabilityPipelineOcsfMappingLibrary o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineOcsfMappingLibrary",
        new GenericType<ObservabilityPipelineOcsfMappingLibrary>() {});
    JSON.registerDescendants(
        ObservabilityPipelineOcsfMapperProcessorMappingMapping.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineOcsfMapperProcessorMappingMapping.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineOcsfMappingLibrary
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineOcsfMappingLibrary.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineOcsfMappingLibrary");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineOcsfMappingLibrary
   *
   * @return The actual instance (ObservabilityPipelineOcsfMappingLibrary)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineOcsfMappingLibrary`. If the actual instance is
   * not `ObservabilityPipelineOcsfMappingLibrary`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineOcsfMappingLibrary`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineOcsfMappingLibrary`
   */
  public ObservabilityPipelineOcsfMappingLibrary getObservabilityPipelineOcsfMappingLibrary()
      throws ClassCastException {
    return (ObservabilityPipelineOcsfMappingLibrary) super.getActualInstance();
  }
}
