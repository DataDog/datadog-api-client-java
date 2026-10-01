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
        ObservabilityPipelineMetricEnrichmentTableLookupSource
            .ObservabilityPipelineMetricEnrichmentTableLookupSourceDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineMetricEnrichmentTableLookupSource
            .ObservabilityPipelineMetricEnrichmentTableLookupSourceSerializer.class)
public class ObservabilityPipelineMetricEnrichmentTableLookupSource extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineMetricEnrichmentTableLookupSource.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineMetricEnrichmentTableLookupSourceSerializer
      extends StdSerializer<ObservabilityPipelineMetricEnrichmentTableLookupSource> {
    public ObservabilityPipelineMetricEnrichmentTableLookupSourceSerializer(
        Class<ObservabilityPipelineMetricEnrichmentTableLookupSource> t) {
      super(t);
    }

    public ObservabilityPipelineMetricEnrichmentTableLookupSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineMetricEnrichmentTableLookupSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineMetricEnrichmentTableLookupSourceDeserializer
      extends StdDeserializer<ObservabilityPipelineMetricEnrichmentTableLookupSource> {
    public ObservabilityPipelineMetricEnrichmentTableLookupSourceDeserializer() {
      this(ObservabilityPipelineMetricEnrichmentTableLookupSource.class);
    }

    public ObservabilityPipelineMetricEnrichmentTableLookupSourceDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineMetricEnrichmentTableLookupSource deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineMetricEnrichmentTableMetricNameLookup
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(Integer.class)
            || ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(Long.class)
            || ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(Float.class)
            || ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(Double.class)
            || ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                Boolean.class)
            || ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                            Integer.class)
                        || ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                            Float.class)
                        || ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineMetricEnrichmentTableMetricNameLookup) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineMetricEnrichmentTableMetricNameLookup'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineMetricEnrichmentTableMetricNameLookup'",
            e);
      }

      // deserialize ObservabilityPipelineMetricEnrichmentTableTagLookup
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Integer.class)
            || ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Long.class)
            || ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Float.class)
            || ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Double.class)
            || ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Boolean.class)
            || ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Integer.class)
                        || ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Float.class)
                        || ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineMetricEnrichmentTableTagLookup.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineMetricEnrichmentTableTagLookup.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineMetricEnrichmentTableTagLookup) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineMetricEnrichmentTableTagLookup'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineMetricEnrichmentTableTagLookup'",
            e);
      }

      ObservabilityPipelineMetricEnrichmentTableLookupSource ret =
          new ObservabilityPipelineMetricEnrichmentTableLookupSource();
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
    public ObservabilityPipelineMetricEnrichmentTableLookupSource getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ObservabilityPipelineMetricEnrichmentTableLookupSource cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineMetricEnrichmentTableLookupSource() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineMetricEnrichmentTableLookupSource(
      ObservabilityPipelineMetricEnrichmentTableMetricNameLookup o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineMetricEnrichmentTableLookupSource(
      ObservabilityPipelineMetricEnrichmentTableTagLookup o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineMetricEnrichmentTableMetricNameLookup",
        new GenericType<ObservabilityPipelineMetricEnrichmentTableMetricNameLookup>() {});
    schemas.put(
        "ObservabilityPipelineMetricEnrichmentTableTagLookup",
        new GenericType<ObservabilityPipelineMetricEnrichmentTableTagLookup>() {});
    JSON.registerDescendants(
        ObservabilityPipelineMetricEnrichmentTableLookupSource.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineMetricEnrichmentTableLookupSource.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineMetricEnrichmentTableMetricNameLookup,
   * ObservabilityPipelineMetricEnrichmentTableTagLookup
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineMetricEnrichmentTableMetricNameLookup.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineMetricEnrichmentTableTagLookup.class,
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
        "Invalid instance type. Must be ObservabilityPipelineMetricEnrichmentTableMetricNameLookup,"
            + " ObservabilityPipelineMetricEnrichmentTableTagLookup");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineMetricEnrichmentTableMetricNameLookup,
   * ObservabilityPipelineMetricEnrichmentTableTagLookup
   *
   * @return The actual instance (ObservabilityPipelineMetricEnrichmentTableMetricNameLookup,
   *     ObservabilityPipelineMetricEnrichmentTableTagLookup)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineMetricEnrichmentTableMetricNameLookup`. If the
   * actual instance is not `ObservabilityPipelineMetricEnrichmentTableMetricNameLookup`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineMetricEnrichmentTableMetricNameLookup`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineMetricEnrichmentTableMetricNameLookup`
   */
  public ObservabilityPipelineMetricEnrichmentTableMetricNameLookup
      getObservabilityPipelineMetricEnrichmentTableMetricNameLookup() throws ClassCastException {
    return (ObservabilityPipelineMetricEnrichmentTableMetricNameLookup) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineMetricEnrichmentTableTagLookup`. If the actual
   * instance is not `ObservabilityPipelineMetricEnrichmentTableTagLookup`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineMetricEnrichmentTableTagLookup`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineMetricEnrichmentTableTagLookup`
   */
  public ObservabilityPipelineMetricEnrichmentTableTagLookup
      getObservabilityPipelineMetricEnrichmentTableTagLookup() throws ClassCastException {
    return (ObservabilityPipelineMetricEnrichmentTableTagLookup) super.getActualInstance();
  }
}
