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
@JsonDeserialize(using = AWSMetricNameFilters.AWSMetricNameFiltersDeserializer.class)
@JsonSerialize(using = AWSMetricNameFilters.AWSMetricNameFiltersSerializer.class)
public class AWSMetricNameFilters extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AWSMetricNameFilters.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AWSMetricNameFiltersSerializer extends StdSerializer<AWSMetricNameFilters> {
    public AWSMetricNameFiltersSerializer(Class<AWSMetricNameFilters> t) {
      super(t);
    }

    public AWSMetricNameFiltersSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AWSMetricNameFilters value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AWSMetricNameFiltersDeserializer
      extends StdDeserializer<AWSMetricNameFilters> {
    public AWSMetricNameFiltersDeserializer() {
      this(AWSMetricNameFilters.class);
    }

    public AWSMetricNameFiltersDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AWSMetricNameFilters deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AWSMetricNameFiltersIncludeOnly
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSMetricNameFiltersIncludeOnly.class.equals(Integer.class)
            || AWSMetricNameFiltersIncludeOnly.class.equals(Long.class)
            || AWSMetricNameFiltersIncludeOnly.class.equals(Float.class)
            || AWSMetricNameFiltersIncludeOnly.class.equals(Double.class)
            || AWSMetricNameFiltersIncludeOnly.class.equals(Boolean.class)
            || AWSMetricNameFiltersIncludeOnly.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSMetricNameFiltersIncludeOnly.class.equals(Integer.class)
                        || AWSMetricNameFiltersIncludeOnly.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSMetricNameFiltersIncludeOnly.class.equals(Float.class)
                        || AWSMetricNameFiltersIncludeOnly.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSMetricNameFiltersIncludeOnly.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSMetricNameFiltersIncludeOnly.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSMetricNameFiltersIncludeOnly.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSMetricNameFiltersIncludeOnly) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSMetricNameFiltersIncludeOnly'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'AWSMetricNameFiltersIncludeOnly'", e);
      }

      // deserialize AWSMetricNameFiltersExcludeOnly
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSMetricNameFiltersExcludeOnly.class.equals(Integer.class)
            || AWSMetricNameFiltersExcludeOnly.class.equals(Long.class)
            || AWSMetricNameFiltersExcludeOnly.class.equals(Float.class)
            || AWSMetricNameFiltersExcludeOnly.class.equals(Double.class)
            || AWSMetricNameFiltersExcludeOnly.class.equals(Boolean.class)
            || AWSMetricNameFiltersExcludeOnly.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSMetricNameFiltersExcludeOnly.class.equals(Integer.class)
                        || AWSMetricNameFiltersExcludeOnly.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSMetricNameFiltersExcludeOnly.class.equals(Float.class)
                        || AWSMetricNameFiltersExcludeOnly.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSMetricNameFiltersExcludeOnly.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSMetricNameFiltersExcludeOnly.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSMetricNameFiltersExcludeOnly.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSMetricNameFiltersExcludeOnly) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSMetricNameFiltersExcludeOnly'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'AWSMetricNameFiltersExcludeOnly'", e);
      }

      AWSMetricNameFilters ret = new AWSMetricNameFilters();
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
    public AWSMetricNameFilters getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "AWSMetricNameFilters cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AWSMetricNameFilters() {
    super("oneOf", Boolean.FALSE);
  }

  public AWSMetricNameFilters(AWSMetricNameFiltersIncludeOnly o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AWSMetricNameFilters(AWSMetricNameFiltersExcludeOnly o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "AWSMetricNameFiltersIncludeOnly", new GenericType<AWSMetricNameFiltersIncludeOnly>() {});
    schemas.put(
        "AWSMetricNameFiltersExcludeOnly", new GenericType<AWSMetricNameFiltersExcludeOnly>() {});
    JSON.registerDescendants(AWSMetricNameFilters.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AWSMetricNameFilters.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AWSMetricNameFiltersIncludeOnly,
   * AWSMetricNameFiltersExcludeOnly
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        AWSMetricNameFiltersIncludeOnly.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        AWSMetricNameFiltersExcludeOnly.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AWSMetricNameFiltersIncludeOnly,"
            + " AWSMetricNameFiltersExcludeOnly");
  }

  /**
   * Get the actual instance, which can be the following: AWSMetricNameFiltersIncludeOnly,
   * AWSMetricNameFiltersExcludeOnly
   *
   * @return The actual instance (AWSMetricNameFiltersIncludeOnly, AWSMetricNameFiltersExcludeOnly)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSMetricNameFiltersIncludeOnly`. If the actual instance is not
   * `AWSMetricNameFiltersIncludeOnly`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSMetricNameFiltersIncludeOnly`
   * @throws ClassCastException if the instance is not `AWSMetricNameFiltersIncludeOnly`
   */
  public AWSMetricNameFiltersIncludeOnly getAWSMetricNameFiltersIncludeOnly()
      throws ClassCastException {
    return (AWSMetricNameFiltersIncludeOnly) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSMetricNameFiltersExcludeOnly`. If the actual instance is not
   * `AWSMetricNameFiltersExcludeOnly`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSMetricNameFiltersExcludeOnly`
   * @throws ClassCastException if the instance is not `AWSMetricNameFiltersExcludeOnly`
   */
  public AWSMetricNameFiltersExcludeOnly getAWSMetricNameFiltersExcludeOnly()
      throws ClassCastException {
    return (AWSMetricNameFiltersExcludeOnly) super.getActualInstance();
  }
}
