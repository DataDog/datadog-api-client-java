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
        DowntimeAttributeScheduleCreateRequest.DowntimeAttributeScheduleCreateRequestDeserializer
            .class)
@JsonSerialize(
    using =
        DowntimeAttributeScheduleCreateRequest.DowntimeAttributeScheduleCreateRequestSerializer
            .class)
public class DowntimeAttributeScheduleCreateRequest extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DowntimeAttributeScheduleCreateRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DowntimeAttributeScheduleCreateRequestSerializer
      extends StdSerializer<DowntimeAttributeScheduleCreateRequest> {
    public DowntimeAttributeScheduleCreateRequestSerializer(
        Class<DowntimeAttributeScheduleCreateRequest> t) {
      super(t);
    }

    public DowntimeAttributeScheduleCreateRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeAttributeScheduleCreateRequest value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DowntimeAttributeScheduleCreateRequestDeserializer
      extends StdDeserializer<DowntimeAttributeScheduleCreateRequest> {
    public DowntimeAttributeScheduleCreateRequestDeserializer() {
      this(DowntimeAttributeScheduleCreateRequest.class);
    }

    public DowntimeAttributeScheduleCreateRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DowntimeAttributeScheduleCreateRequest deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DowntimeAttributeScheduleRecurrencesCreateRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Integer.class)
            || DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Long.class)
            || DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Float.class)
            || DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Double.class)
            || DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Boolean.class)
            || DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Integer.class)
                        || DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Float.class)
                        || DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeAttributeScheduleRecurrencesCreateRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DowntimeAttributeScheduleRecurrencesCreateRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeAttributeScheduleRecurrencesCreateRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DowntimeAttributeScheduleRecurrencesCreateRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DowntimeAttributeScheduleRecurrencesCreateRequest'",
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

      DowntimeAttributeScheduleCreateRequest ret = new DowntimeAttributeScheduleCreateRequest();
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
    public DowntimeAttributeScheduleCreateRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DowntimeAttributeScheduleCreateRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DowntimeAttributeScheduleCreateRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public DowntimeAttributeScheduleCreateRequest(
      DowntimeAttributeScheduleRecurrencesCreateRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DowntimeAttributeScheduleCreateRequest(
      DowntimeAttributeScheduleOneTimeCreateEditRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DowntimeAttributeScheduleRecurrencesCreateRequest",
        new GenericType<DowntimeAttributeScheduleRecurrencesCreateRequest>() {});
    schemas.put(
        "DowntimeAttributeScheduleOneTimeCreateEditRequest",
        new GenericType<DowntimeAttributeScheduleOneTimeCreateEditRequest>() {});
    JSON.registerDescendants(
        DowntimeAttributeScheduleCreateRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DowntimeAttributeScheduleCreateRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DowntimeAttributeScheduleRecurrencesCreateRequest,
   * DowntimeAttributeScheduleOneTimeCreateEditRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DowntimeAttributeScheduleRecurrencesCreateRequest.class,
        instance,
        new HashSet<Class<?>>())) {
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
        "Invalid instance type. Must be DowntimeAttributeScheduleRecurrencesCreateRequest,"
            + " DowntimeAttributeScheduleOneTimeCreateEditRequest");
  }

  /**
   * Get the actual instance, which can be the following:
   * DowntimeAttributeScheduleRecurrencesCreateRequest,
   * DowntimeAttributeScheduleOneTimeCreateEditRequest
   *
   * @return The actual instance (DowntimeAttributeScheduleRecurrencesCreateRequest,
   *     DowntimeAttributeScheduleOneTimeCreateEditRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeAttributeScheduleRecurrencesCreateRequest`. If the actual
   * instance is not `DowntimeAttributeScheduleRecurrencesCreateRequest`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DowntimeAttributeScheduleRecurrencesCreateRequest`
   * @throws ClassCastException if the instance is not
   *     `DowntimeAttributeScheduleRecurrencesCreateRequest`
   */
  public DowntimeAttributeScheduleRecurrencesCreateRequest
      getDowntimeAttributeScheduleRecurrencesCreateRequest() throws ClassCastException {
    return (DowntimeAttributeScheduleRecurrencesCreateRequest) super.getActualInstance();
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
