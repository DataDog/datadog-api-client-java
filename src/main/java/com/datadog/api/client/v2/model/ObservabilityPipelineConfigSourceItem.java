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

      // deserialize ObservabilityPipelineAmazonDataFirehoseSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Integer.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Long.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Float.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Double.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Boolean.class)
            || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Integer.class)
                        || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Float.class)
                        || ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineAmazonDataFirehoseSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineAmazonDataFirehoseSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineAmazonDataFirehoseSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineAmazonDataFirehoseSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineAmazonDataFirehoseSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineAmazonDataFirehoseSource'",
            e);
      }

      // deserialize ObservabilityPipelineGooglePubSubSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineGooglePubSubSource.class.equals(Integer.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Long.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Float.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Double.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(Boolean.class)
            || ObservabilityPipelineGooglePubSubSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineGooglePubSubSource.class.equals(Integer.class)
                        || ObservabilityPipelineGooglePubSubSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineGooglePubSubSource.class.equals(Float.class)
                        || ObservabilityPipelineGooglePubSubSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineGooglePubSubSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineGooglePubSubSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineGooglePubSubSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineGooglePubSubSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ObservabilityPipelineGooglePubSubSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineGooglePubSubSource'",
            e);
      }

      // deserialize ObservabilityPipelineHttpClientSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineHttpClientSource.class.equals(Integer.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Long.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Float.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Double.class)
            || ObservabilityPipelineHttpClientSource.class.equals(Boolean.class)
            || ObservabilityPipelineHttpClientSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineHttpClientSource.class.equals(Integer.class)
                        || ObservabilityPipelineHttpClientSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineHttpClientSource.class.equals(Float.class)
                        || ObservabilityPipelineHttpClientSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineHttpClientSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineHttpClientSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineHttpClientSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineHttpClientSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineHttpClientSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineHttpClientSource'",
            e);
      }

      // deserialize ObservabilityPipelineLogstashSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineLogstashSource.class.equals(Integer.class)
            || ObservabilityPipelineLogstashSource.class.equals(Long.class)
            || ObservabilityPipelineLogstashSource.class.equals(Float.class)
            || ObservabilityPipelineLogstashSource.class.equals(Double.class)
            || ObservabilityPipelineLogstashSource.class.equals(Boolean.class)
            || ObservabilityPipelineLogstashSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineLogstashSource.class.equals(Integer.class)
                        || ObservabilityPipelineLogstashSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineLogstashSource.class.equals(Float.class)
                        || ObservabilityPipelineLogstashSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineLogstashSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineLogstashSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ObservabilityPipelineLogstashSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineLogstashSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ObservabilityPipelineLogstashSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineLogstashSource'",
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

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineAmazonDataFirehoseSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineGooglePubSubSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineHttpClientSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineConfigSourceItem(ObservabilityPipelineLogstashSource o) {
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
        "ObservabilityPipelineAmazonDataFirehoseSource",
        new GenericType<ObservabilityPipelineAmazonDataFirehoseSource>() {});
    schemas.put(
        "ObservabilityPipelineGooglePubSubSource",
        new GenericType<ObservabilityPipelineGooglePubSubSource>() {});
    schemas.put(
        "ObservabilityPipelineHttpClientSource",
        new GenericType<ObservabilityPipelineHttpClientSource>() {});
    schemas.put(
        "ObservabilityPipelineLogstashSource",
        new GenericType<ObservabilityPipelineLogstashSource>() {});
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
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineAmazonDataFirehoseSource,
   * ObservabilityPipelineGooglePubSubSource, ObservabilityPipelineHttpClientSource,
   * ObservabilityPipelineLogstashSource
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
        ObservabilityPipelineAmazonDataFirehoseSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineGooglePubSubSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineHttpClientSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineLogstashSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ObservabilityPipelineKafkaSource,"
            + " ObservabilityPipelineDatadogAgentSource,"
            + " ObservabilityPipelineAmazonDataFirehoseSource,"
            + " ObservabilityPipelineGooglePubSubSource, ObservabilityPipelineHttpClientSource,"
            + " ObservabilityPipelineLogstashSource");
  }

  /**
   * Get the actual instance, which can be the following: ObservabilityPipelineKafkaSource,
   * ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineAmazonDataFirehoseSource,
   * ObservabilityPipelineGooglePubSubSource, ObservabilityPipelineHttpClientSource,
   * ObservabilityPipelineLogstashSource
   *
   * @return The actual instance (ObservabilityPipelineKafkaSource,
   *     ObservabilityPipelineDatadogAgentSource, ObservabilityPipelineAmazonDataFirehoseSource,
   *     ObservabilityPipelineGooglePubSubSource, ObservabilityPipelineHttpClientSource,
   *     ObservabilityPipelineLogstashSource)
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
   * Get the actual instance of `ObservabilityPipelineAmazonDataFirehoseSource`. If the actual
   * instance is not `ObservabilityPipelineAmazonDataFirehoseSource`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ObservabilityPipelineAmazonDataFirehoseSource`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineAmazonDataFirehoseSource`
   */
  public ObservabilityPipelineAmazonDataFirehoseSource
      getObservabilityPipelineAmazonDataFirehoseSource() throws ClassCastException {
    return (ObservabilityPipelineAmazonDataFirehoseSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineGooglePubSubSource`. If the actual instance is
   * not `ObservabilityPipelineGooglePubSubSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineGooglePubSubSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineGooglePubSubSource`
   */
  public ObservabilityPipelineGooglePubSubSource getObservabilityPipelineGooglePubSubSource()
      throws ClassCastException {
    return (ObservabilityPipelineGooglePubSubSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineHttpClientSource`. If the actual instance is
   * not `ObservabilityPipelineHttpClientSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineHttpClientSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineHttpClientSource`
   */
  public ObservabilityPipelineHttpClientSource getObservabilityPipelineHttpClientSource()
      throws ClassCastException {
    return (ObservabilityPipelineHttpClientSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineLogstashSource`. If the actual instance is not
   * `ObservabilityPipelineLogstashSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineLogstashSource`
   * @throws ClassCastException if the instance is not `ObservabilityPipelineLogstashSource`
   */
  public ObservabilityPipelineLogstashSource getObservabilityPipelineLogstashSource()
      throws ClassCastException {
    return (ObservabilityPipelineLogstashSource) super.getActualInstance();
  }
}
