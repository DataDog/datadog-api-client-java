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
@JsonDeserialize(using = CIAppPipelineEventPipeline.CIAppPipelineEventPipelineDeserializer.class)
@JsonSerialize(using = CIAppPipelineEventPipeline.CIAppPipelineEventPipelineSerializer.class)
public class CIAppPipelineEventPipeline extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CIAppPipelineEventPipeline.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CIAppPipelineEventPipelineSerializer
      extends StdSerializer<CIAppPipelineEventPipeline> {
    public CIAppPipelineEventPipelineSerializer(Class<CIAppPipelineEventPipeline> t) {
      super(t);
    }

    public CIAppPipelineEventPipelineSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppPipelineEventPipeline value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CIAppPipelineEventPipelineDeserializer
      extends StdDeserializer<CIAppPipelineEventPipeline> {
    public CIAppPipelineEventPipelineDeserializer() {
      this(CIAppPipelineEventPipeline.class);
    }

    public CIAppPipelineEventPipelineDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CIAppPipelineEventPipeline deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CIAppPipelineEventFinishedPipeline
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppPipelineEventFinishedPipeline.class.equals(Integer.class)
            || CIAppPipelineEventFinishedPipeline.class.equals(Long.class)
            || CIAppPipelineEventFinishedPipeline.class.equals(Float.class)
            || CIAppPipelineEventFinishedPipeline.class.equals(Double.class)
            || CIAppPipelineEventFinishedPipeline.class.equals(Boolean.class)
            || CIAppPipelineEventFinishedPipeline.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppPipelineEventFinishedPipeline.class.equals(Integer.class)
                        || CIAppPipelineEventFinishedPipeline.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppPipelineEventFinishedPipeline.class.equals(Float.class)
                        || CIAppPipelineEventFinishedPipeline.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppPipelineEventFinishedPipeline.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppPipelineEventFinishedPipeline.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CIAppPipelineEventFinishedPipeline.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppPipelineEventFinishedPipeline) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CIAppPipelineEventFinishedPipeline'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CIAppPipelineEventFinishedPipeline'",
            e);
      }

      // deserialize CIAppPipelineEventInProgressPipeline
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppPipelineEventInProgressPipeline.class.equals(Integer.class)
            || CIAppPipelineEventInProgressPipeline.class.equals(Long.class)
            || CIAppPipelineEventInProgressPipeline.class.equals(Float.class)
            || CIAppPipelineEventInProgressPipeline.class.equals(Double.class)
            || CIAppPipelineEventInProgressPipeline.class.equals(Boolean.class)
            || CIAppPipelineEventInProgressPipeline.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppPipelineEventInProgressPipeline.class.equals(Integer.class)
                        || CIAppPipelineEventInProgressPipeline.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppPipelineEventInProgressPipeline.class.equals(Float.class)
                        || CIAppPipelineEventInProgressPipeline.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppPipelineEventInProgressPipeline.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppPipelineEventInProgressPipeline.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(CIAppPipelineEventInProgressPipeline.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppPipelineEventInProgressPipeline) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CIAppPipelineEventInProgressPipeline'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CIAppPipelineEventInProgressPipeline'",
            e);
      }

      CIAppPipelineEventPipeline ret = new CIAppPipelineEventPipeline();
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
    public CIAppPipelineEventPipeline getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CIAppPipelineEventPipeline cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CIAppPipelineEventPipeline() {
    super("oneOf", Boolean.FALSE);
  }

  public CIAppPipelineEventPipeline(CIAppPipelineEventFinishedPipeline o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CIAppPipelineEventPipeline(CIAppPipelineEventInProgressPipeline o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CIAppPipelineEventFinishedPipeline",
        new GenericType<CIAppPipelineEventFinishedPipeline>() {});
    schemas.put(
        "CIAppPipelineEventInProgressPipeline",
        new GenericType<CIAppPipelineEventInProgressPipeline>() {});
    JSON.registerDescendants(
        CIAppPipelineEventPipeline.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CIAppPipelineEventPipeline.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CIAppPipelineEventFinishedPipeline,
   * CIAppPipelineEventInProgressPipeline
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CIAppPipelineEventFinishedPipeline.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CIAppPipelineEventInProgressPipeline.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CIAppPipelineEventFinishedPipeline,"
            + " CIAppPipelineEventInProgressPipeline");
  }

  /**
   * Get the actual instance, which can be the following: CIAppPipelineEventFinishedPipeline,
   * CIAppPipelineEventInProgressPipeline
   *
   * @return The actual instance (CIAppPipelineEventFinishedPipeline,
   *     CIAppPipelineEventInProgressPipeline)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppPipelineEventFinishedPipeline`. If the actual instance is not
   * `CIAppPipelineEventFinishedPipeline`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CIAppPipelineEventFinishedPipeline`
   * @throws ClassCastException if the instance is not `CIAppPipelineEventFinishedPipeline`
   */
  public CIAppPipelineEventFinishedPipeline getCIAppPipelineEventFinishedPipeline()
      throws ClassCastException {
    return (CIAppPipelineEventFinishedPipeline) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppPipelineEventInProgressPipeline`. If the actual instance is
   * not `CIAppPipelineEventInProgressPipeline`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CIAppPipelineEventInProgressPipeline`
   * @throws ClassCastException if the instance is not `CIAppPipelineEventInProgressPipeline`
   */
  public CIAppPipelineEventInProgressPipeline getCIAppPipelineEventInProgressPipeline()
      throws ClassCastException {
    return (CIAppPipelineEventInProgressPipeline) super.getActualInstance();
  }
}
