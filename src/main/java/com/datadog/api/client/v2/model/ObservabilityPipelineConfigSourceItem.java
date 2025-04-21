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

      // deserialize ObservabilityPipelineSplunkTcpSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSplunkTcpSource.class.equals(Integer.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Long.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Float.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Double.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(Boolean.class)
            || ObservabilityPipelineSplunkTcpSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSplunkTcpSource.class.equals(Integer.class)
                        || ObservabilityPipelineSplunkTcpSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSplunkTcpSource.class.equals(Float.class)
                        || ObservabilityPipelineSplunkTcpSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSplunkTcpSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSplunkTcpSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSplunkTcpSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSplunkTcpSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSplunkTcpSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSplunkTcpSource'",
            e);
      }

      // deserialize ObservabilityPipelineSplunkHecSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSplunkHecSource.class.equals(Integer.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Long.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Float.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Double.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(Boolean.class)
            || ObservabilityPipelineSplunkHecSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSplunkHecSource.class.equals(Integer.class)
                        || ObservabilityPipelineSplunkHecSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSplunkHecSource.class.equals(Float.class)
                        || ObservabilityPipelineSplunkHecSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSplunkHecSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSplunkHecSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineSplunkHecSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSplunkHecSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineSplunkHecSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineSplunkHecSource'",
            e);
      }

      // deserialize ObservabilityPipelineAmazonS3Source
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonS3Source.class.equals(Integer.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Long.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Float.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Double.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonS3Source.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3Source.class.equals(Integer.class)
                        || ObservabilityPipelineAmazonS3Source.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonS3Source.class.equals(Float.class)
                        || ObservabilityPipelineAmazonS3Source.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3Source.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonS3Source.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineAmazonS3Source.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonS3Source) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineAmazonS3Source'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAmazonS3Source'",
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

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSplunkTcpSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineSplunkHecSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineAmazonS3Source o) {
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
        "ObservabilityPipelineSplunkTcpSource",
        new GenericType<ObservabilityPipelineSplunkTcpSource>() {});
    schemas.put(
        "ObservabilityPipelineSplunkHecSource",
        new GenericType<ObservabilityPipelineSplunkHecSource>() {});
    schemas.put(
        "ObservabilityPipelineAmazonS3Source",
        new GenericType<ObservabilityPipelineAmazonS3Source>() {});
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
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,
   * ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source
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
        ObservabilityPipelineSplunkTcpSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSplunkHecSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineAmazonS3Source.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineKafkaSource,"
            + " ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,"
            + " ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineKafkaSource,
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,
   * ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source
   *
   * @return The actual instance (ObservabilityPipelineKafkaSource,
   *     ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineSplunkTcpSource,
   *     ObservabilityPipelineSplunkHecSource, ObservabilityPipelineAmazonS3Source)
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
   * Get the actual instance of `ObservabilityPipelineSplunkTcpSource`. If the actual instance is
   * not `ObservabilityPipelineSplunkTcpSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSplunkTcpSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSplunkTcpSource`
   */
  public ObservabilityPipelineSplunkTcpSource getObservabilityPipelineSplunkTcpSource()
      throws ClassCastException {
    return (ObservabilityPipelineSplunkTcpSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSplunkHecSource`. If the actual instance is
   * not `ObservabilityPipelineSplunkHecSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSplunkHecSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineSplunkHecSource`
   */
  public ObservabilityPipelineSplunkHecSource getObservabilityPipelineSplunkHecSource()
      throws ClassCastException {
    return (ObservabilityPipelineSplunkHecSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineAmazonS3Source`. If the actual instance is not
   * `ObservabilityPipelineAmazonS3Source`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonS3Source`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineAmazonS3Source`
   */
  public ObservabilityPipelineAmazonS3Source getObservabilityPipelineAmazonS3Source()
      throws ClassCastException {
    return (ObservabilityPipelineAmazonS3Source) super.getActualInstance();
  }
}
