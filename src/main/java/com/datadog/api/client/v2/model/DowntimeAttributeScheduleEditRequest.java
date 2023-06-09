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
        DowntimeAttributeScheduleEditRequest.DowntimeAttributeScheduleEditRequestDeserializer.class)
@JsonSerialize(
    using =
        DowntimeAttributeScheduleEditRequest.DowntimeAttributeScheduleEditRequestSerializer.class)
public class DowntimeAttributeScheduleEditRequest extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DowntimeAttributeScheduleEditRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DowntimeAttributeScheduleEditRequestSerializer
      extends StdSerializer<DowntimeAttributeScheduleEditRequest> {
    public DowntimeAttributeScheduleEditRequestSerializer(
        Class<DowntimeAttributeScheduleEditRequest> t) {
      super(t);
    }

    public DowntimeAttributeScheduleEditRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeAttributeScheduleEditRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DowntimeAttributeScheduleEditRequestDeserializer
      extends StdDeserializer<DowntimeAttributeScheduleEditRequest> {
    public DowntimeAttributeScheduleEditRequestDeserializer() {
      this(DowntimeAttributeScheduleEditRequest.class);
    }

    public DowntimeAttributeScheduleEditRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DowntimeAttributeScheduleEditRequest deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DowntimeAttributeScheduleRecurrencesEditRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Integer.class)
            || DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Long.class)
            || DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Float.class)
            || DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Double.class)
            || DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Boolean.class)
            || DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Integer.class)
                        || DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Float.class)
                        || DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeAttributeScheduleRecurrencesEditRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DowntimeAttributeScheduleRecurrencesEditRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeAttributeScheduleRecurrencesEditRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DowntimeAttributeScheduleRecurrencesEditRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DowntimeAttributeScheduleRecurrencesEditRequest'",
            e);
      }

      // deserialize DowntimeAttributeScheduleOneTimeCreateEditRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Integer.class)
            || DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Long.class)
            || DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Float.class)
            || DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Double.class)
            || DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Boolean.class)
            || DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Integer.class)
                        || DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Float.class)
                        || DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeAttributeScheduleOneTimeCreateEditRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DowntimeAttributeScheduleOneTimeCreateEditRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeAttributeScheduleOneTimeCreateEditRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DowntimeAttributeScheduleOneTimeCreateEditRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DowntimeAttributeScheduleOneTimeCreateEditRequest'",
            e);
      }

      DowntimeAttributeScheduleEditRequest ret = new DowntimeAttributeScheduleEditRequest();
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
    public DowntimeAttributeScheduleEditRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DowntimeAttributeScheduleEditRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DowntimeAttributeScheduleEditRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public DowntimeAttributeScheduleEditRequest(DowntimeAttributeScheduleRecurrencesEditRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DowntimeAttributeScheduleEditRequest(DowntimeAttributeScheduleOneTimeCreateEditRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DowntimeAttributeScheduleRecurrencesEditRequest",
        new GenericType<DowntimeAttributeScheduleRecurrencesEditRequest>() {});
    schemas.put(
        "DowntimeAttributeScheduleOneTimeCreateEditRequest",
        new GenericType<DowntimeAttributeScheduleOneTimeCreateEditRequest>() {});
    JSON.registerDescendants(
        DowntimeAttributeScheduleEditRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DowntimeAttributeScheduleEditRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DowntimeAttributeScheduleRecurrencesEditRequest,
   * DowntimeAttributeScheduleOneTimeCreateEditRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DowntimeAttributeScheduleRecurrencesEditRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DowntimeAttributeScheduleOneTimeCreateEditRequest.class,
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
        "Invalid instance type. Must be DowntimeAttributeScheduleRecurrencesEditRequest,"
            + " DowntimeAttributeScheduleOneTimeCreateEditRequest");
  }

  /**
   * Get the actual instance, which can be the following:
   * DowntimeAttributeScheduleRecurrencesEditRequest,
   * DowntimeAttributeScheduleOneTimeCreateEditRequest
   *
   * @return The actual instance (DowntimeAttributeScheduleRecurrencesEditRequest,
   *     DowntimeAttributeScheduleOneTimeCreateEditRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeAttributeScheduleRecurrencesEditRequest`. If the actual
   * instance is not `DowntimeAttributeScheduleRecurrencesEditRequest`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `DowntimeAttributeScheduleRecurrencesEditRequest`
   * @throws ClassCastException if the instance is not
   *     `DowntimeAttributeScheduleRecurrencesEditRequest`
   */
  public DowntimeAttributeScheduleRecurrencesEditRequest
      getDowntimeAttributeScheduleRecurrencesEditRequest() throws ClassCastException {
    return (DowntimeAttributeScheduleRecurrencesEditRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeAttributeScheduleOneTimeCreateEditRequest`. If the actual
   * instance is not `DowntimeAttributeScheduleOneTimeCreateEditRequest`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DowntimeAttributeScheduleOneTimeCreateEditRequest`
   * @throws ClassCastException if the instance is not
   *     `DowntimeAttributeScheduleOneTimeCreateEditRequest`
   */
  public DowntimeAttributeScheduleOneTimeCreateEditRequest
      getDowntimeAttributeScheduleOneTimeCreateEditRequest() throws ClassCastException {
    return (DowntimeAttributeScheduleOneTimeCreateEditRequest) super.getActualInstance();
  }
}
