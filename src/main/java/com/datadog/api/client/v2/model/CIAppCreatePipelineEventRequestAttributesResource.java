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
        CIAppCreatePipelineEventRequestAttributesResource
            .CIAppCreatePipelineEventRequestAttributesResourceDeserializer.class)
@JsonSerialize(
    using =
        CIAppCreatePipelineEventRequestAttributesResource
            .CIAppCreatePipelineEventRequestAttributesResourceSerializer.class)
public class CIAppCreatePipelineEventRequestAttributesResource extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CIAppCreatePipelineEventRequestAttributesResource.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CIAppCreatePipelineEventRequestAttributesResourceSerializer
      extends StdSerializer<CIAppCreatePipelineEventRequestAttributesResource> {
    public CIAppCreatePipelineEventRequestAttributesResourceSerializer(
        Class<CIAppCreatePipelineEventRequestAttributesResource> t) {
      super(t);
    }

    public CIAppCreatePipelineEventRequestAttributesResourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppCreatePipelineEventRequestAttributesResource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CIAppCreatePipelineEventRequestAttributesResourceDeserializer
      extends StdDeserializer<CIAppCreatePipelineEventRequestAttributesResource> {
    public CIAppCreatePipelineEventRequestAttributesResourceDeserializer() {
      this(CIAppCreatePipelineEventRequestAttributesResource.class);
    }

    public CIAppCreatePipelineEventRequestAttributesResourceDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CIAppCreatePipelineEventRequestAttributesResource deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CIAppPipelineEventPipeline
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppPipelineEventPipeline.class.equals(Integer.class)
            || CIAppPipelineEventPipeline.class.equals(Long.class)
            || CIAppPipelineEventPipeline.class.equals(Float.class)
            || CIAppPipelineEventPipeline.class.equals(Double.class)
            || CIAppPipelineEventPipeline.class.equals(Boolean.class)
            || CIAppPipelineEventPipeline.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppPipelineEventPipeline.class.equals(Integer.class)
                        || CIAppPipelineEventPipeline.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppPipelineEventPipeline.class.equals(Float.class)
                        || CIAppPipelineEventPipeline.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppPipelineEventPipeline.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppPipelineEventPipeline.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CIAppPipelineEventPipeline.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppPipelineEventPipeline) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CIAppPipelineEventPipeline'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CIAppPipelineEventPipeline'", e);
      }

      // deserialize CIAppPipelineEventStage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppPipelineEventStage.class.equals(Integer.class)
            || CIAppPipelineEventStage.class.equals(Long.class)
            || CIAppPipelineEventStage.class.equals(Float.class)
            || CIAppPipelineEventStage.class.equals(Double.class)
            || CIAppPipelineEventStage.class.equals(Boolean.class)
            || CIAppPipelineEventStage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppPipelineEventStage.class.equals(Integer.class)
                        || CIAppPipelineEventStage.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppPipelineEventStage.class.equals(Float.class)
                        || CIAppPipelineEventStage.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppPipelineEventStage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppPipelineEventStage.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CIAppPipelineEventStage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppPipelineEventStage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CIAppPipelineEventStage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CIAppPipelineEventStage'", e);
      }

      // deserialize CIAppPipelineEventJob
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppPipelineEventJob.class.equals(Integer.class)
            || CIAppPipelineEventJob.class.equals(Long.class)
            || CIAppPipelineEventJob.class.equals(Float.class)
            || CIAppPipelineEventJob.class.equals(Double.class)
            || CIAppPipelineEventJob.class.equals(Boolean.class)
            || CIAppPipelineEventJob.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppPipelineEventJob.class.equals(Integer.class)
                        || CIAppPipelineEventJob.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppPipelineEventJob.class.equals(Float.class)
                        || CIAppPipelineEventJob.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppPipelineEventJob.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppPipelineEventJob.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CIAppPipelineEventJob.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppPipelineEventJob) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CIAppPipelineEventJob'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CIAppPipelineEventJob'", e);
      }

      // deserialize CIAppPipelineEventStep
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppPipelineEventStep.class.equals(Integer.class)
            || CIAppPipelineEventStep.class.equals(Long.class)
            || CIAppPipelineEventStep.class.equals(Float.class)
            || CIAppPipelineEventStep.class.equals(Double.class)
            || CIAppPipelineEventStep.class.equals(Boolean.class)
            || CIAppPipelineEventStep.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppPipelineEventStep.class.equals(Integer.class)
                        || CIAppPipelineEventStep.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppPipelineEventStep.class.equals(Float.class)
                        || CIAppPipelineEventStep.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppPipelineEventStep.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppPipelineEventStep.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CIAppPipelineEventStep.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppPipelineEventStep) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CIAppPipelineEventStep'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CIAppPipelineEventStep'", e);
      }

      CIAppCreatePipelineEventRequestAttributesResource ret =
          new CIAppCreatePipelineEventRequestAttributesResource();
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
    public CIAppCreatePipelineEventRequestAttributesResource getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CIAppCreatePipelineEventRequestAttributesResource cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CIAppCreatePipelineEventRequestAttributesResource() {
    super("oneOf", Boolean.FALSE);
  }

  public CIAppCreatePipelineEventRequestAttributesResource(CIAppPipelineEventPipeline o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CIAppCreatePipelineEventRequestAttributesResource(CIAppPipelineEventStage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CIAppCreatePipelineEventRequestAttributesResource(CIAppPipelineEventJob o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CIAppCreatePipelineEventRequestAttributesResource(CIAppPipelineEventStep o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("CIAppPipelineEventPipeline", new GenericType<CIAppPipelineEventPipeline>() {});
    schemas.put("CIAppPipelineEventStage", new GenericType<CIAppPipelineEventStage>() {});
    schemas.put("CIAppPipelineEventJob", new GenericType<CIAppPipelineEventJob>() {});
    schemas.put("CIAppPipelineEventStep", new GenericType<CIAppPipelineEventStep>() {});
    JSON.registerDescendants(
        CIAppCreatePipelineEventRequestAttributesResource.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CIAppCreatePipelineEventRequestAttributesResource.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CIAppPipelineEventPipeline, CIAppPipelineEventStage,
   * CIAppPipelineEventJob, CIAppPipelineEventStep
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CIAppPipelineEventPipeline.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CIAppPipelineEventStage.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CIAppPipelineEventJob.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CIAppPipelineEventStep.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CIAppPipelineEventPipeline, CIAppPipelineEventStage,"
            + " CIAppPipelineEventJob, CIAppPipelineEventStep");
  }

  /**
   * Get the actual instance, which can be the following: CIAppPipelineEventPipeline,
   * CIAppPipelineEventStage, CIAppPipelineEventJob, CIAppPipelineEventStep
   *
   * @return The actual instance (CIAppPipelineEventPipeline, CIAppPipelineEventStage,
   *     CIAppPipelineEventJob, CIAppPipelineEventStep)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppPipelineEventPipeline`. If the actual instance is not
   * `CIAppPipelineEventPipeline`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CIAppPipelineEventPipeline`
   * @throws ClassCastException if the instance is not `CIAppPipelineEventPipeline`
   */
  public CIAppPipelineEventPipeline getCIAppPipelineEventPipeline() throws ClassCastException {
    return (CIAppPipelineEventPipeline) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppPipelineEventStage`. If the actual instance is not
   * `CIAppPipelineEventStage`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CIAppPipelineEventStage`
   * @throws ClassCastException if the instance is not `CIAppPipelineEventStage`
   */
  public CIAppPipelineEventStage getCIAppPipelineEventStage() throws ClassCastException {
    return (CIAppPipelineEventStage) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppPipelineEventJob`. If the actual instance is not
   * `CIAppPipelineEventJob`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CIAppPipelineEventJob`
   * @throws ClassCastException if the instance is not `CIAppPipelineEventJob`
   */
  public CIAppPipelineEventJob getCIAppPipelineEventJob() throws ClassCastException {
    return (CIAppPipelineEventJob) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppPipelineEventStep`. If the actual instance is not
   * `CIAppPipelineEventStep`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CIAppPipelineEventStep`
   * @throws ClassCastException if the instance is not `CIAppPipelineEventStep`
   */
  public CIAppPipelineEventStep getCIAppPipelineEventStep() throws ClassCastException {
    return (CIAppPipelineEventStep) super.getActualInstance();
  }
}
