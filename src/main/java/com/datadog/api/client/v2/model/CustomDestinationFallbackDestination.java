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
        CustomDestinationFallbackDestination.CustomDestinationFallbackDestinationDeserializer.class)
@JsonSerialize(
    using =
        CustomDestinationFallbackDestination.CustomDestinationFallbackDestinationSerializer.class)
public class CustomDestinationFallbackDestination extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CustomDestinationFallbackDestination.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CustomDestinationFallbackDestinationSerializer
      extends StdSerializer<CustomDestinationFallbackDestination> {
    public CustomDestinationFallbackDestinationSerializer(
        Class<CustomDestinationFallbackDestination> t) {
      super(t);
    }

    public CustomDestinationFallbackDestinationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationFallbackDestination value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CustomDestinationFallbackDestinationDeserializer
      extends StdDeserializer<CustomDestinationFallbackDestination> {
    public CustomDestinationFallbackDestinationDeserializer() {
      this(CustomDestinationFallbackDestination.class);
    }

    public CustomDestinationFallbackDestinationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CustomDestinationFallbackDestination deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AzureFallbackDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AzureFallbackDestination.class.equals(Integer.class)
            || AzureFallbackDestination.class.equals(Long.class)
            || AzureFallbackDestination.class.equals(Float.class)
            || AzureFallbackDestination.class.equals(Double.class)
            || AzureFallbackDestination.class.equals(Boolean.class)
            || AzureFallbackDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AzureFallbackDestination.class.equals(Integer.class)
                        || AzureFallbackDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AzureFallbackDestination.class.equals(Float.class)
                        || AzureFallbackDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AzureFallbackDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AzureFallbackDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AzureFallbackDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AzureFallbackDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AzureFallbackDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AzureFallbackDestination'", e);
      }

      // deserialize GCSFallbackDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GCSFallbackDestination.class.equals(Integer.class)
            || GCSFallbackDestination.class.equals(Long.class)
            || GCSFallbackDestination.class.equals(Float.class)
            || GCSFallbackDestination.class.equals(Double.class)
            || GCSFallbackDestination.class.equals(Boolean.class)
            || GCSFallbackDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GCSFallbackDestination.class.equals(Integer.class)
                        || GCSFallbackDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GCSFallbackDestination.class.equals(Float.class)
                        || GCSFallbackDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GCSFallbackDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GCSFallbackDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GCSFallbackDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GCSFallbackDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GCSFallbackDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GCSFallbackDestination'", e);
      }

      // deserialize S3FallbackDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (S3FallbackDestination.class.equals(Integer.class)
            || S3FallbackDestination.class.equals(Long.class)
            || S3FallbackDestination.class.equals(Float.class)
            || S3FallbackDestination.class.equals(Double.class)
            || S3FallbackDestination.class.equals(Boolean.class)
            || S3FallbackDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((S3FallbackDestination.class.equals(Integer.class)
                        || S3FallbackDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((S3FallbackDestination.class.equals(Float.class)
                        || S3FallbackDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (S3FallbackDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (S3FallbackDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(S3FallbackDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((S3FallbackDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'S3FallbackDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'S3FallbackDestination'", e);
      }

      CustomDestinationFallbackDestination ret = new CustomDestinationFallbackDestination();
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
    public CustomDestinationFallbackDestination getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CustomDestinationFallbackDestination cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CustomDestinationFallbackDestination() {
    super("oneOf", Boolean.FALSE);
  }

  public CustomDestinationFallbackDestination(AzureFallbackDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationFallbackDestination(GCSFallbackDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationFallbackDestination(S3FallbackDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AzureFallbackDestination", new GenericType<AzureFallbackDestination>() {});
    schemas.put("GCSFallbackDestination", new GenericType<GCSFallbackDestination>() {});
    schemas.put("S3FallbackDestination", new GenericType<S3FallbackDestination>() {});
    JSON.registerDescendants(
        CustomDestinationFallbackDestination.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CustomDestinationFallbackDestination.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AzureFallbackDestination, GCSFallbackDestination,
   * S3FallbackDestination
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AzureFallbackDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GCSFallbackDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(S3FallbackDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AzureFallbackDestination, GCSFallbackDestination,"
            + " S3FallbackDestination");
  }

  /**
   * Get the actual instance, which can be the following: AzureFallbackDestination,
   * GCSFallbackDestination, S3FallbackDestination
   *
   * @return The actual instance (AzureFallbackDestination, GCSFallbackDestination,
   *     S3FallbackDestination)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AzureFallbackDestination`. If the actual instance is not
   * `AzureFallbackDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AzureFallbackDestination`
   * @throws ClassCastException if the instance is not `AzureFallbackDestination`
   */
  public AzureFallbackDestination getAzureFallbackDestination() throws ClassCastException {
    return (AzureFallbackDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GCSFallbackDestination`. If the actual instance is not
   * `GCSFallbackDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GCSFallbackDestination`
   * @throws ClassCastException if the instance is not `GCSFallbackDestination`
   */
  public GCSFallbackDestination getGCSFallbackDestination() throws ClassCastException {
    return (GCSFallbackDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `S3FallbackDestination`. If the actual instance is not
   * `S3FallbackDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `S3FallbackDestination`
   * @throws ClassCastException if the instance is not `S3FallbackDestination`
   */
  public S3FallbackDestination getS3FallbackDestination() throws ClassCastException {
    return (S3FallbackDestination) super.getActualInstance();
  }
}
