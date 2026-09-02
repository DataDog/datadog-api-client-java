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
@JsonDeserialize(using = MetricAssetResponseIncluded.MetricAssetResponseIncludedDeserializer.class)
@JsonSerialize(using = MetricAssetResponseIncluded.MetricAssetResponseIncludedSerializer.class)
public class MetricAssetResponseIncluded extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(MetricAssetResponseIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class MetricAssetResponseIncludedSerializer
      extends StdSerializer<MetricAssetResponseIncluded> {
    public MetricAssetResponseIncludedSerializer(Class<MetricAssetResponseIncluded> t) {
      super(t);
    }

    public MetricAssetResponseIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricAssetResponseIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class MetricAssetResponseIncludedDeserializer
      extends StdDeserializer<MetricAssetResponseIncluded> {
    public MetricAssetResponseIncludedDeserializer() {
      this(MetricAssetResponseIncluded.class);
    }

    public MetricAssetResponseIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public MetricAssetResponseIncluded deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize MetricDashboardAsset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricDashboardAsset.class.equals(Integer.class)
            || MetricDashboardAsset.class.equals(Long.class)
            || MetricDashboardAsset.class.equals(Float.class)
            || MetricDashboardAsset.class.equals(Double.class)
            || MetricDashboardAsset.class.equals(Boolean.class)
            || MetricDashboardAsset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricDashboardAsset.class.equals(Integer.class)
                        || MetricDashboardAsset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricDashboardAsset.class.equals(Float.class)
                        || MetricDashboardAsset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricDashboardAsset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricDashboardAsset.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricDashboardAsset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricDashboardAsset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricDashboardAsset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricDashboardAsset'", e);
      }

      // deserialize MetricMonitorAsset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricMonitorAsset.class.equals(Integer.class)
            || MetricMonitorAsset.class.equals(Long.class)
            || MetricMonitorAsset.class.equals(Float.class)
            || MetricMonitorAsset.class.equals(Double.class)
            || MetricMonitorAsset.class.equals(Boolean.class)
            || MetricMonitorAsset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricMonitorAsset.class.equals(Integer.class)
                        || MetricMonitorAsset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricMonitorAsset.class.equals(Float.class)
                        || MetricMonitorAsset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricMonitorAsset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricMonitorAsset.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricMonitorAsset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricMonitorAsset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricMonitorAsset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricMonitorAsset'", e);
      }

      // deserialize MetricNotebookAsset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricNotebookAsset.class.equals(Integer.class)
            || MetricNotebookAsset.class.equals(Long.class)
            || MetricNotebookAsset.class.equals(Float.class)
            || MetricNotebookAsset.class.equals(Double.class)
            || MetricNotebookAsset.class.equals(Boolean.class)
            || MetricNotebookAsset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricNotebookAsset.class.equals(Integer.class)
                        || MetricNotebookAsset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricNotebookAsset.class.equals(Float.class)
                        || MetricNotebookAsset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricNotebookAsset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricNotebookAsset.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricNotebookAsset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricNotebookAsset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricNotebookAsset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricNotebookAsset'", e);
      }

      // deserialize MetricSLOAsset
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricSLOAsset.class.equals(Integer.class)
            || MetricSLOAsset.class.equals(Long.class)
            || MetricSLOAsset.class.equals(Float.class)
            || MetricSLOAsset.class.equals(Double.class)
            || MetricSLOAsset.class.equals(Boolean.class)
            || MetricSLOAsset.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricSLOAsset.class.equals(Integer.class)
                        || MetricSLOAsset.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricSLOAsset.class.equals(Float.class)
                        || MetricSLOAsset.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricSLOAsset.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricSLOAsset.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricSLOAsset.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricSLOAsset) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricSLOAsset'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricSLOAsset'", e);
      }

      MetricAssetResponseIncluded ret = new MetricAssetResponseIncluded();
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
    public MetricAssetResponseIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "MetricAssetResponseIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public MetricAssetResponseIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public MetricAssetResponseIncluded(MetricDashboardAsset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public MetricAssetResponseIncluded(MetricMonitorAsset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public MetricAssetResponseIncluded(MetricNotebookAsset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public MetricAssetResponseIncluded(MetricSLOAsset o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("MetricDashboardAsset", new GenericType<MetricDashboardAsset>() {});
    schemas.put("MetricMonitorAsset", new GenericType<MetricMonitorAsset>() {});
    schemas.put("MetricNotebookAsset", new GenericType<MetricNotebookAsset>() {});
    schemas.put("MetricSLOAsset", new GenericType<MetricSLOAsset>() {});
    JSON.registerDescendants(
        MetricAssetResponseIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return MetricAssetResponseIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: MetricDashboardAsset, MetricMonitorAsset, MetricNotebookAsset,
   * MetricSLOAsset
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(MetricDashboardAsset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MetricMonitorAsset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MetricNotebookAsset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MetricSLOAsset.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be MetricDashboardAsset, MetricMonitorAsset,"
            + " MetricNotebookAsset, MetricSLOAsset");
  }

  /**
   * Get the actual instance, which can be the following: MetricDashboardAsset, MetricMonitorAsset,
   * MetricNotebookAsset, MetricSLOAsset
   *
   * @return The actual instance (MetricDashboardAsset, MetricMonitorAsset, MetricNotebookAsset,
   *     MetricSLOAsset)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricDashboardAsset`. If the actual instance is not
   * `MetricDashboardAsset`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricDashboardAsset`
   * @throws ClassCastException if the instance is not `MetricDashboardAsset`
   */
  public MetricDashboardAsset getMetricDashboardAsset() throws ClassCastException {
    return (MetricDashboardAsset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricMonitorAsset`. If the actual instance is not
   * `MetricMonitorAsset`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricMonitorAsset`
   * @throws ClassCastException if the instance is not `MetricMonitorAsset`
   */
  public MetricMonitorAsset getMetricMonitorAsset() throws ClassCastException {
    return (MetricMonitorAsset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricNotebookAsset`. If the actual instance is not
   * `MetricNotebookAsset`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricNotebookAsset`
   * @throws ClassCastException if the instance is not `MetricNotebookAsset`
   */
  public MetricNotebookAsset getMetricNotebookAsset() throws ClassCastException {
    return (MetricNotebookAsset) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricSLOAsset`. If the actual instance is not `MetricSLOAsset`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricSLOAsset`
   * @throws ClassCastException if the instance is not `MetricSLOAsset`
   */
  public MetricSLOAsset getMetricSLOAsset() throws ClassCastException {
    return (MetricSLOAsset) super.getActualInstance();
  }
}
