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
@JsonDeserialize(using = PipelineConfigSource.PipelineConfigSourceDeserializer.class)
@JsonSerialize(using = PipelineConfigSource.PipelineConfigSourceSerializer.class)
public class PipelineConfigSource extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(PipelineConfigSource.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class PipelineConfigSourceSerializer extends StdSerializer<PipelineConfigSource> {
    public PipelineConfigSourceSerializer(Class<PipelineConfigSource> t) {
      super(t);
    }

    public PipelineConfigSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineConfigSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class PipelineConfigSourceDeserializer
      extends StdDeserializer<PipelineConfigSource> {
    public PipelineConfigSourceDeserializer() {
      this(PipelineConfigSource.class);
    }

    public PipelineConfigSourceDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public PipelineConfigSource deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize PipelineKafkaSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineKafkaSource.class.equals(Integer.class)
            || PipelineKafkaSource.class.equals(Long.class)
            || PipelineKafkaSource.class.equals(Float.class)
            || PipelineKafkaSource.class.equals(Double.class)
            || PipelineKafkaSource.class.equals(Boolean.class)
            || PipelineKafkaSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineKafkaSource.class.equals(Integer.class)
                        || PipelineKafkaSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineKafkaSource.class.equals(Float.class)
                        || PipelineKafkaSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineKafkaSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineKafkaSource.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineKafkaSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineKafkaSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineKafkaSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PipelineKafkaSource'", e);
      }

      // deserialize PipelineDatadogAgentSource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineDatadogAgentSource.class.equals(Integer.class)
            || PipelineDatadogAgentSource.class.equals(Long.class)
            || PipelineDatadogAgentSource.class.equals(Float.class)
            || PipelineDatadogAgentSource.class.equals(Double.class)
            || PipelineDatadogAgentSource.class.equals(Boolean.class)
            || PipelineDatadogAgentSource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineDatadogAgentSource.class.equals(Integer.class)
                        || PipelineDatadogAgentSource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineDatadogAgentSource.class.equals(Float.class)
                        || PipelineDatadogAgentSource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineDatadogAgentSource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineDatadogAgentSource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineDatadogAgentSource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineDatadogAgentSource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineDatadogAgentSource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'PipelineDatadogAgentSource'", e);
      }

      PipelineConfigSource ret = new PipelineConfigSource();
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
    public PipelineConfigSource getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "PipelineConfigSource cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public PipelineConfigSource() {
    super("oneOf", Boolean.FALSE);
  }

  public PipelineConfigSource(PipelineKafkaSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PipelineConfigSource(PipelineDatadogAgentSource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("PipelineKafkaSource", new GenericType<PipelineKafkaSource>() {});
    schemas.put("PipelineDatadogAgentSource", new GenericType<PipelineDatadogAgentSource>() {});
    JSON.registerDescendants(PipelineConfigSource.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return PipelineConfigSource.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: PipelineKafkaSource, PipelineDatadogAgentSource
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(PipelineKafkaSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(PipelineDatadogAgentSource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be PipelineKafkaSource, PipelineDatadogAgentSource");
  }

  /**
   * Get the actual instance, which can be the following: PipelineKafkaSource,
   * PipelineDatadogAgentSource
   *
   * @return The actual instance (PipelineKafkaSource, PipelineDatadogAgentSource)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineKafkaSource`. If the actual instance is not
   * `PipelineKafkaSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineKafkaSource`
   * @throws ClassCastException if the instance is not `PipelineKafkaSource`
   */
  public PipelineKafkaSource getPipelineKafkaSource() throws ClassCastException {
    return (PipelineKafkaSource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineDatadogAgentSource`. If the actual instance is not
   * `PipelineDatadogAgentSource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineDatadogAgentSource`
   * @throws ClassCastException if the instance is not `PipelineDatadogAgentSource`
   */
  public PipelineDatadogAgentSource getPipelineDatadogAgentSource() throws ClassCastException {
    return (PipelineDatadogAgentSource) super.getActualInstance();
  }
}
