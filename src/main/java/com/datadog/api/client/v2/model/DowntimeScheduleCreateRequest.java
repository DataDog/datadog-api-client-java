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
    using = DowntimeScheduleCreateRequest.DowntimeScheduleCreateRequestDeserializer.class)
@JsonSerialize(using = DowntimeScheduleCreateRequest.DowntimeScheduleCreateRequestSerializer.class)
public class DowntimeScheduleCreateRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(DowntimeScheduleCreateRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DowntimeScheduleCreateRequestSerializer
      extends StdSerializer<DowntimeScheduleCreateRequest> {
    public DowntimeScheduleCreateRequestSerializer(Class<DowntimeScheduleCreateRequest> t) {
      super(t);
    }

    public DowntimeScheduleCreateRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeScheduleCreateRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DowntimeScheduleCreateRequestDeserializer
      extends StdDeserializer<DowntimeScheduleCreateRequest> {
    public DowntimeScheduleCreateRequestDeserializer() {
      this(DowntimeScheduleCreateRequest.class);
    }

    public DowntimeScheduleCreateRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DowntimeScheduleCreateRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DowntimeScheduleRecurrencesCreateRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeScheduleRecurrencesCreateRequest.class.equals(Integer.class)
            || DowntimeScheduleRecurrencesCreateRequest.class.equals(Long.class)
            || DowntimeScheduleRecurrencesCreateRequest.class.equals(Float.class)
            || DowntimeScheduleRecurrencesCreateRequest.class.equals(Double.class)
            || DowntimeScheduleRecurrencesCreateRequest.class.equals(Boolean.class)
            || DowntimeScheduleRecurrencesCreateRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeScheduleRecurrencesCreateRequest.class.equals(Integer.class)
                        || DowntimeScheduleRecurrencesCreateRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeScheduleRecurrencesCreateRequest.class.equals(Float.class)
                        || DowntimeScheduleRecurrencesCreateRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeScheduleRecurrencesCreateRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeScheduleRecurrencesCreateRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DowntimeScheduleRecurrencesCreateRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeScheduleRecurrencesCreateRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'DowntimeScheduleRecurrencesCreateRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DowntimeScheduleRecurrencesCreateRequest'",
            e);
      }

      // deserialize DowntimeScheduleOneTimeCreateUpdateRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Integer.class)
            || DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Long.class)
            || DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Float.class)
            || DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Double.class)
            || DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Boolean.class)
            || DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Integer.class)
                        || DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Float.class)
                        || DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeScheduleOneTimeCreateUpdateRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DowntimeScheduleOneTimeCreateUpdateRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeScheduleOneTimeCreateUpdateRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DowntimeScheduleOneTimeCreateUpdateRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DowntimeScheduleOneTimeCreateUpdateRequest'",
            e);
      }

      DowntimeScheduleCreateRequest ret = new DowntimeScheduleCreateRequest();
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
    public DowntimeScheduleCreateRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DowntimeScheduleCreateRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DowntimeScheduleCreateRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public DowntimeScheduleCreateRequest(DowntimeScheduleRecurrencesCreateRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DowntimeScheduleCreateRequest(DowntimeScheduleOneTimeCreateUpdateRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DowntimeScheduleRecurrencesCreateRequest",
        new GenericType<DowntimeScheduleRecurrencesCreateRequest>() {});
    schemas.put(
        "DowntimeScheduleOneTimeCreateUpdateRequest",
        new GenericType<DowntimeScheduleOneTimeCreateUpdateRequest>() {});
    JSON.registerDescendants(
        DowntimeScheduleCreateRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DowntimeScheduleCreateRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DowntimeScheduleRecurrencesCreateRequest,
   * DowntimeScheduleOneTimeCreateUpdateRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DowntimeScheduleRecurrencesCreateRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DowntimeScheduleOneTimeCreateUpdateRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DowntimeScheduleRecurrencesCreateRequest,"
            + " DowntimeScheduleOneTimeCreateUpdateRequest");
  }

  /**
   * Get the actual instance, which can be the following: DowntimeScheduleRecurrencesCreateRequest,
   * DowntimeScheduleOneTimeCreateUpdateRequest
   *
   * @return The actual instance (DowntimeScheduleRecurrencesCreateRequest,
   *     DowntimeScheduleOneTimeCreateUpdateRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeScheduleRecurrencesCreateRequest`. If the actual instance
   * is not `DowntimeScheduleRecurrencesCreateRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DowntimeScheduleRecurrencesCreateRequest`
   * @throws ClassCastException if the instance is not `DowntimeScheduleRecurrencesCreateRequest`
   */
  public DowntimeScheduleRecurrencesCreateRequest getDowntimeScheduleRecurrencesCreateRequest()
      throws ClassCastException {
    return (DowntimeScheduleRecurrencesCreateRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeScheduleOneTimeCreateUpdateRequest`. If the actual instance
   * is not `DowntimeScheduleOneTimeCreateUpdateRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DowntimeScheduleOneTimeCreateUpdateRequest`
   * @throws ClassCastException if the instance is not `DowntimeScheduleOneTimeCreateUpdateRequest`
   */
  public DowntimeScheduleOneTimeCreateUpdateRequest getDowntimeScheduleOneTimeCreateUpdateRequest()
      throws ClassCastException {
    return (DowntimeScheduleOneTimeCreateUpdateRequest) super.getActualInstance();
  }
}
