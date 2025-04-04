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
@JsonDeserialize(using = PipelineConfigDestination.PipelineConfigDestinationDeserializer.class)
@JsonSerialize(using = PipelineConfigDestination.PipelineConfigDestinationSerializer.class)
public class PipelineConfigDestination extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(PipelineConfigDestination.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class PipelineConfigDestinationSerializer
      extends StdSerializer<PipelineConfigDestination> {
    public PipelineConfigDestinationSerializer(Class<PipelineConfigDestination> t) {
      super(t);
    }

    public PipelineConfigDestinationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineConfigDestination value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class PipelineConfigDestinationDeserializer
      extends StdDeserializer<PipelineConfigDestination> {
    public PipelineConfigDestinationDeserializer() {
      this(PipelineConfigDestination.class);
    }

    public PipelineConfigDestinationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public PipelineConfigDestination deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize PipelineDatadogLogsDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PipelineDatadogLogsDestination.class.equals(Integer.class)
            || PipelineDatadogLogsDestination.class.equals(Long.class)
            || PipelineDatadogLogsDestination.class.equals(Float.class)
            || PipelineDatadogLogsDestination.class.equals(Double.class)
            || PipelineDatadogLogsDestination.class.equals(Boolean.class)
            || PipelineDatadogLogsDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PipelineDatadogLogsDestination.class.equals(Integer.class)
                        || PipelineDatadogLogsDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PipelineDatadogLogsDestination.class.equals(Float.class)
                        || PipelineDatadogLogsDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PipelineDatadogLogsDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PipelineDatadogLogsDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PipelineDatadogLogsDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PipelineDatadogLogsDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PipelineDatadogLogsDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'PipelineDatadogLogsDestination'", e);
      }

      PipelineConfigDestination ret = new PipelineConfigDestination();
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
    public PipelineConfigDestination getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "PipelineConfigDestination cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public PipelineConfigDestination() {
    super("oneOf", Boolean.FALSE);
  }

  public PipelineConfigDestination(PipelineDatadogLogsDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "PipelineDatadogLogsDestination", new GenericType<PipelineDatadogLogsDestination>() {});
    JSON.registerDescendants(PipelineConfigDestination.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return PipelineConfigDestination.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: PipelineDatadogLogsDestination
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        PipelineDatadogLogsDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be PipelineDatadogLogsDestination");
  }

  /**
   * Get the actual instance, which can be the following: PipelineDatadogLogsDestination
   *
   * @return The actual instance (PipelineDatadogLogsDestination)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `PipelineDatadogLogsDestination`. If the actual instance is not
   * `PipelineDatadogLogsDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PipelineDatadogLogsDestination`
   * @throws ClassCastException if the instance is not `PipelineDatadogLogsDestination`
   */
  public PipelineDatadogLogsDestination getPipelineDatadogLogsDestination()
      throws ClassCastException {
    return (PipelineDatadogLogsDestination) super.getActualInstance();
  }
}
