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
        ObservabilityPipelineConfigSourceItem.ObservabilityPipelineConfigSourceItemDeserializer
            .class)
@JsonSerialize(
    using =
        ObservabilityPipelineConfigSourceItem.ObservabilityPipelineConfigSourceItemSerializer.class)
public class ObservabilityPipelineConfigSourceItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineConfigSourceItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineConfigSourceItemSerializer
      extends StdSerializer<ObservabilityPipelineConfigSourceItem> {
    public ObservabilityPipelineConfigSourceItemSerializer(
        Class<ObservabilityPipelineConfigSourceItem> t) {
      super(t);
    }

    public ObservabilityPipelineConfigSourceItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineConfigSourceItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineConfigSourceItemDeserializer
      extends StdDeserializer<ObservabilityPipelineConfigSourceItem> {
    public ObservabilityPipelineConfigSourceItemDeserializer() {
      this(ObservabilityPipelineConfigSourceItem.class);
    }

    public ObservabilityPipelineConfigSourceItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineConfigSourceItem deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineKafkaSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineKafkaSource.class.equals(Integer.class)
            || ObservabilityPipelineKafkaSource.class.equals(Long.class)
            || ObservabilityPipelineKafkaSource.class.equals(Float.class)
            || ObservabilityPipelineKafkaSource.class.equals(Double.class)
            || ObservabilityPipelineKafkaSource.class.equals(Boolean.class)
            || ObservabilityPipelineKafkaSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineKafkaSource.class.equals(Integer.class)
                        || ObservabilityPipelineKafkaSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineKafkaSource.class.equals(Float.class)
                        || ObservabilityPipelineKafkaSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineKafkaSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineKafkaSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineKafkaSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineKafkaSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineKafkaSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ObservabilityPipelineKafkaSource'", e);
      }

      // deserialize ObservabilityPipelineDatadogAgentSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineDatadogAgentSource.class.equals(Integer.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Long.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Float.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Double.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(Boolean.class)
            || ObservabilityPipelineDatadogAgentSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineDatadogAgentSource.class.equals(Integer.class)
                        || ObservabilityPipelineDatadogAgentSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineDatadogAgentSource.class.equals(Float.class)
                        || ObservabilityPipelineDatadogAgentSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineDatadogAgentSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineDatadogAgentSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineDatadogAgentSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineDatadogAgentSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineDatadogAgentSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineDatadogAgentSource'",
            e);
      }

      // deserialize ObservabilityPipelineSumoLogicSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSumoLogicSource.class.equals(Integer.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Long.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Float.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Double.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(Boolean.class)
            || ObservabilityPipelineSumoLogicSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSumoLogicSource.class.equals(Integer.class)
                        || ObservabilityPipelineSumoLogicSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSumoLogicSource.class.equals(Float.class)
                        || ObservabilityPipelineSumoLogicSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSumoLogicSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSumoLogicSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSumoLogicSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSumoLogicSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSumoLogicSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSumoLogicSource'",
            e);
      }

      // deserialize ObservabilityPipelineRsyslogSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineRsyslogSource.class.equals(Integer.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Long.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Float.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Double.class)
            || ObservabilityPipelineRsyslogSource.class.equals(Boolean.class)
            || ObservabilityPipelineRsyslogSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineRsyslogSource.class.equals(Integer.class)
                        || ObservabilityPipelineRsyslogSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineRsyslogSource.class.equals(Float.class)
                        || ObservabilityPipelineRsyslogSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineRsyslogSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineRsyslogSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineRsyslogSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineRsyslogSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineRsyslogSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineRsyslogSource'",
            e);
      }

      // deserialize ObservabilityPipelineSyslogNgSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSyslogNgSource.class.equals(Integer.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Long.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Float.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Double.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(Boolean.class)
            || ObservabilityPipelineSyslogNgSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSyslogNgSource.class.equals(Integer.class)
                        || ObservabilityPipelineSyslogNgSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSyslogNgSource.class.equals(Float.class)
                        || ObservabilityPipelineSyslogNgSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSyslogNgSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSyslogNgSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSyslogNgSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSyslogNgSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSyslogNgSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSyslogNgSource'",
            e);
      }

      ObservabilityPipelineConfigSourceItem ret = new ObservabilityPipelineConfigSourceItem();
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
    public ObservabilityPipelineConfigSourceItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineConfigSourceItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineConfigSourceItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineKafkaSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineDatadogAgentSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSumoLogicSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineRsyslogSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSyslogNgSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineKafkaSource", new GenericType<ObservabilityPipelineKafkaSource>() {});
    schemas.put(
        "ObservabilityPipelineDatadogAgentSource",
        new GenericType<ObservabilityPipelineDatadogAgentSource>() {});
    schemas.put(
        "ObservabilityPipelineSumoLogicSource",
        new GenericType<ObservabilityPipelineSumoLogicSource>() {});
    schemas.put(
        "ObservabilityPipelineRsyslogSource",
        new GenericType<ObservabilityPipelineRsyslogSource>() {});
    schemas.put(
        "ObservabilityPipelineSyslogNgSource",
        new GenericType<ObservabilityPipelineSyslogNgSource>() {});
    JSON.registerDescendants(
        ObservabilityPipelineConfigSourceItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineConfigSourceItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineKafkaSource,
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSumoLogicSource,
   * ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineKafkaSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineDatadogAgentSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSumoLogicSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineRsyslogSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSyslogNgSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineKafkaSource,"
            + " ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSumoLogicSource,"
            + " ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineKafkaSource,
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSumoLogicSource,
   * ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource
   *
   * @return The actual instance (ObservabilityPipelineKafkaSource,
   *     ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSumoLogicSource,
   *     ObservabilityPipelineRsyslogSource, ObservabilityPipelineSyslogNgSource)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineKafkaSource`. If the actual instance is not
   * `ObservabilityPipelineKafkaSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineKafkaSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineKafkaSource`
   */
  public ObservabilityPipelineKafkaSource getObservabilityPipelineKafkaSource()
      throws ClassCastException {
    return (ObservabilityPipelineKafkaSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineDatadogAgentSource`. If the actual instance is
   * not `ObservabilityPipelineDatadogAgentSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineDatadogAgentSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineDatadogAgentSource`
   */
  public ObservabilityPipelineDatadogAgentSource getObservabilityPipelineDatadogAgentSource()
      throws ClassCastException {
    return (ObservabilityPipelineDatadogAgentSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSumoLogicSource`. If the actual instance is
   * not `ObservabilityPipelineSumoLogicSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSumoLogicSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSumoLogicSource`
   */
  public ObservabilityPipelineSumoLogicSource getObservabilityPipelineSumoLogicSource()
      throws ClassCastException {
    return (ObservabilityPipelineSumoLogicSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineRsyslogSource`. If the actual instance is not
   * `ObservabilityPipelineRsyslogSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineRsyslogSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineRsyslogSource`
   */
  public ObservabilityPipelineRsyslogSource getObservabilityPipelineRsyslogSource()
      throws ClassCastException {
    return (ObservabilityPipelineRsyslogSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSyslogNgSource`. If the actual instance is not
   * `ObservabilityPipelineSyslogNgSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSyslogNgSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSyslogNgSource`
   */
  public ObservabilityPipelineSyslogNgSource getObservabilityPipelineSyslogNgSource()
      throws ClassCastException {
    return (ObservabilityPipelineSyslogNgSource) super.getActualInstance();
  }
}
