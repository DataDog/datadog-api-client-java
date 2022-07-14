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
    using = MetricsAndMetricTagConfigurations.MetricsAndMetricTagConfigurationsDeserializer.class)
@JsonSerialize(
    using = MetricsAndMetricTagConfigurations.MetricsAndMetricTagConfigurationsSerializer.class)
public class MetricsAndMetricTagConfigurations extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(MetricsAndMetricTagConfigurations.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class MetricsAndMetricTagConfigurationsSerializer
      extends StdSerializer<MetricsAndMetricTagConfigurations> {
    public MetricsAndMetricTagConfigurationsSerializer(Class<MetricsAndMetricTagConfigurations> t) {
      super(t);
    }

    public MetricsAndMetricTagConfigurationsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricsAndMetricTagConfigurations value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class MetricsAndMetricTagConfigurationsDeserializer
      extends StdDeserializer<MetricsAndMetricTagConfigurations> {
    public MetricsAndMetricTagConfigurationsDeserializer() {
      this(MetricsAndMetricTagConfigurations.class);
    }

    public MetricsAndMetricTagConfigurationsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public MetricsAndMetricTagConfigurations deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize Metric
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Metric.class.equals(Integer.class)
            || Metric.class.equals(Long.class)
            || Metric.class.equals(Float.class)
            || Metric.class.equals(Double.class)
            || Metric.class.equals(Boolean.class)
            || Metric.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Metric.class.equals(Integer.class) || Metric.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Metric.class.equals(Float.class) || Metric.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Metric.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (Metric.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Metric.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((Metric) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'Metric'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Metric'", e);
      }

      // deserialize MetricTagConfiguration
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricTagConfiguration.class.equals(Integer.class)
            || MetricTagConfiguration.class.equals(Long.class)
            || MetricTagConfiguration.class.equals(Float.class)
            || MetricTagConfiguration.class.equals(Double.class)
            || MetricTagConfiguration.class.equals(Boolean.class)
            || MetricTagConfiguration.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricTagConfiguration.class.equals(Integer.class)
                        || MetricTagConfiguration.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricTagConfiguration.class.equals(Float.class)
                        || MetricTagConfiguration.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricTagConfiguration.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricTagConfiguration.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricTagConfiguration.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricTagConfiguration) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricTagConfiguration'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricTagConfiguration'", e);
      }

      MetricsAndMetricTagConfigurations ret = new MetricsAndMetricTagConfigurations();
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
    public MetricsAndMetricTagConfigurations getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "MetricsAndMetricTagConfigurations cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public MetricsAndMetricTagConfigurations() {
    super("oneOf", Boolean.FALSE);
  }

  public MetricsAndMetricTagConfigurations(Metric o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public MetricsAndMetricTagConfigurations(MetricTagConfiguration o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("Metric", new GenericType<Metric>() {});
    schemas.put("MetricTagConfiguration", new GenericType<MetricTagConfiguration>() {});
    JSON.registerDescendants(
        MetricsAndMetricTagConfigurations.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return MetricsAndMetricTagConfigurations.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: Metric, MetricTagConfiguration
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(Metric.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MetricTagConfiguration.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be Metric, MetricTagConfiguration");
  }

  /**
   * Get the actual instance, which can be the following: Metric, MetricTagConfiguration
   *
   * @return The actual instance (Metric, MetricTagConfiguration)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `Metric`. If the actual instance is not `Metric`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Metric`
   * @throws ClassCastException if the instance is not `Metric`
   */
  public Metric getMetric() throws ClassCastException {
    return (Metric) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricTagConfiguration`. If the actual instance is not
   * `MetricTagConfiguration`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricTagConfiguration`
   * @throws ClassCastException if the instance is not `MetricTagConfiguration`
   */
  public MetricTagConfiguration getMetricTagConfiguration() throws ClassCastException {
    return (MetricTagConfiguration) super.getActualInstance();
  }
}
