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
        ObservabilityPipelineAmazonS3DestinationCompression
            .ObservabilityPipelineAmazonS3DestinationCompressionDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineAmazonS3DestinationCompression
            .ObservabilityPipelineAmazonS3DestinationCompressionSerializer.class)
public class ObservabilityPipelineAmazonS3DestinationCompression extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineAmazonS3DestinationCompression.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineAmazonS3DestinationCompressionSerializer
      extends StdSerializer<ObservabilityPipelineAmazonS3DestinationCompression> {
    public ObservabilityPipelineAmazonS3DestinationCompressionSerializer(
        Class<ObservabilityPipelineAmazonS3DestinationCompression> t) {
      super(t);
    }

    public ObservabilityPipelineAmazonS3DestinationCompressionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAmazonS3DestinationCompression value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineAmazonS3DestinationCompressionDeserializer
      extends StdDeserializer<ObservabilityPipelineAmazonS3DestinationCompression> {
    public ObservabilityPipelineAmazonS3DestinationCompressionDeserializer() {
      this(ObservabilityPipelineAmazonS3DestinationCompression.class);
    }

    public ObservabilityPipelineAmazonS3DestinationCompressionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineAmazonS3DestinationCompression deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineAmazonS3DestinationCompressionZstd
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(Integer.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(Long.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(Float.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(Double.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(
                            Integer.class)
                        || ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(Float.class)
                        || ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3DestinationCompressionZstd.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAmazonS3DestinationCompressionZstd.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonS3DestinationCompressionZstd) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAmazonS3DestinationCompressionZstd'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAmazonS3DestinationCompressionZstd'",
            e);
      }

      // deserialize ObservabilityPipelineAmazonS3DestinationCompressionGzip
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(Integer.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(Long.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(Float.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(Double.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(
                            Integer.class)
                        || ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(Float.class)
                        || ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3DestinationCompressionGzip.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAmazonS3DestinationCompressionGzip.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonS3DestinationCompressionGzip) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineAmazonS3DestinationCompressionGzip'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineAmazonS3DestinationCompressionGzip'",
            e);
      }

      ObservabilityPipelineAmazonS3DestinationCompression ret =
          new ObservabilityPipelineAmazonS3DestinationCompression();
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
    public ObservabilityPipelineAmazonS3DestinationCompression getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineAmazonS3DestinationCompression cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineAmazonS3DestinationCompression() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineAmazonS3DestinationCompression(
      ObservabilityPipelineAmazonS3DestinationCompressionZstd o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineAmazonS3DestinationCompression(
      ObservabilityPipelineAmazonS3DestinationCompressionGzip o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineAmazonS3DestinationCompressionZstd",
        new GenericType<ObservabilityPipelineAmazonS3DestinationCompressionZstd>() {});
    schemas.put(
        "ObservabilityPipelineAmazonS3DestinationCompressionGzip",
        new GenericType<ObservabilityPipelineAmazonS3DestinationCompressionGzip>() {});
    JSON.registerDescendants(
        ObservabilityPipelineAmazonS3DestinationCompression.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineAmazonS3DestinationCompression.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineAmazonS3DestinationCompressionZstd,
   * ObservabilityPipelineAmazonS3DestinationCompressionGzip
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonS3DestinationCompressionZstd.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonS3DestinationCompressionGzip.class,
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
        "Invalid instance type. Must be ObservabilityPipelineAmazonS3DestinationCompressionZstd,"
            + " ObservabilityPipelineAmazonS3DestinationCompressionGzip");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineAmazonS3DestinationCompressionZstd,
   * ObservabilityPipelineAmazonS3DestinationCompressionGzip
   *
   * @return The actual instance (ObservabilityPipelineAmazonS3DestinationCompressionZstd,
   *     ObservabilityPipelineAmazonS3DestinationCompressionGzip)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonS3DestinationCompressionZstd`. If the
   * actual instance is not `ObservabilityPipelineAmazonS3DestinationCompressionZstd`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonS3DestinationCompressionZstd`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAmazonS3DestinationCompressionZstd`
   */
  public ObservabilityPipelineAmazonS3DestinationCompressionZstd
      getObservabilityPipelineAmazonS3DestinationCompressionZstd() throws ClassCastException {
    return (ObservabilityPipelineAmazonS3DestinationCompressionZstd) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonS3DestinationCompressionGzip`. If the
   * actual instance is not `ObservabilityPipelineAmazonS3DestinationCompressionGzip`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonS3DestinationCompressionGzip`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAmazonS3DestinationCompressionGzip`
   */
  public ObservabilityPipelineAmazonS3DestinationCompressionGzip
      getObservabilityPipelineAmazonS3DestinationCompressionGzip() throws ClassCastException {
    return (ObservabilityPipelineAmazonS3DestinationCompressionGzip) super.getActualInstance();
  }
}
