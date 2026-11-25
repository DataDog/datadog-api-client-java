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
@JsonDeserialize(
    using =
        ImageBackendDefinition20270101Sizing.ImageBackendDefinition20270101SizingDeserializer.class)
@JsonSerialize(
    using =
        ImageBackendDefinition20270101Sizing.ImageBackendDefinition20270101SizingSerializer.class)
public class ImageBackendDefinition20270101Sizing extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ImageBackendDefinition20270101Sizing.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ImageBackendDefinition20270101SizingSerializer
      extends StdSerializer<ImageBackendDefinition20270101Sizing> {
    public ImageBackendDefinition20270101SizingSerializer(
        Class<ImageBackendDefinition20270101Sizing> t) {
      super(t);
    }

    public ImageBackendDefinition20270101SizingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ImageBackendDefinition20270101Sizing value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ImageBackendDefinition20270101SizingDeserializer
      extends StdDeserializer<ImageBackendDefinition20270101Sizing> {
    public ImageBackendDefinition20270101SizingDeserializer() {
      this(ImageBackendDefinition20270101Sizing.class);
    }

    public ImageBackendDefinition20270101SizingDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ImageBackendDefinition20270101Sizing deserialize(
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

      // deserialize ImageSizing_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ImageSizing_20270101.class.equals(Integer.class)
            || ImageSizing_20270101.class.equals(Long.class)
            || ImageSizing_20270101.class.equals(Float.class)
            || ImageSizing_20270101.class.equals(Double.class)
            || ImageSizing_20270101.class.equals(Boolean.class)
            || ImageSizing_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ImageSizing_20270101.class.equals(Integer.class)
                        || ImageSizing_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ImageSizing_20270101.class.equals(Float.class)
                        || ImageSizing_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ImageSizing_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ImageSizing_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ImageSizing_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'ImageSizing_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ImageSizing_20270101'", e);
      }

      ImageBackendDefinition20270101Sizing ret = new ImageBackendDefinition20270101Sizing();
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
    public ImageBackendDefinition20270101Sizing getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ImageBackendDefinition20270101Sizing cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ImageBackendDefinition20270101Sizing() {
    super("oneOf", Boolean.FALSE);
  }

  public ImageBackendDefinition20270101Sizing(Double o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ImageBackendDefinition20270101Sizing(ImageSizing_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("Double", new GenericType<Double>() {});
    schemas.put("ImageSizing_20270101", new GenericType<ImageSizing_20270101>() {});
    JSON.registerDescendants(
        ImageBackendDefinition20270101Sizing.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ImageBackendDefinition20270101Sizing.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: Double, ImageSizing_20270101
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
    if (JSON.isInstanceOf(ImageSizing_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be Double, ImageSizing_20270101");
  }

  /**
   * Get the actual instance, which can be the following: Double, ImageSizing_20270101
   *
   * @return The actual instance (Double, ImageSizing_20270101)
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
   * Get the actual instance of `ImageSizing_20270101`. If the actual instance is not
   * `ImageSizing_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ImageSizing_20270101`
   * @throws ClassCastException if the instance is not `ImageSizing_20270101`
   */
  public ImageSizing_20270101 getImageSizing_20270101() throws ClassCastException {
    return (ImageSizing_20270101) super.getActualInstance();
  }
}
