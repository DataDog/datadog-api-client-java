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
    using = DowntimeAttributeScheduleResponse.DowntimeAttributeScheduleResponseDeserializer.class)
@JsonSerialize(
    using = DowntimeAttributeScheduleResponse.DowntimeAttributeScheduleResponseSerializer.class)
public class DowntimeAttributeScheduleResponse extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DowntimeAttributeScheduleResponse.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DowntimeAttributeScheduleResponseSerializer
      extends StdSerializer<DowntimeAttributeScheduleResponse> {
    public DowntimeAttributeScheduleResponseSerializer(Class<DowntimeAttributeScheduleResponse> t) {
      super(t);
    }

    public DowntimeAttributeScheduleResponseSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeAttributeScheduleResponse value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DowntimeAttributeScheduleResponseDeserializer
      extends StdDeserializer<DowntimeAttributeScheduleResponse> {
    public DowntimeAttributeScheduleResponseDeserializer() {
      this(DowntimeAttributeScheduleResponse.class);
    }

    public DowntimeAttributeScheduleResponseDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DowntimeAttributeScheduleResponse deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DowntimeAttributeScheduleRecurrencesResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeAttributeScheduleRecurrencesResponse.class.equals(Integer.class)
            || DowntimeAttributeScheduleRecurrencesResponse.class.equals(Long.class)
            || DowntimeAttributeScheduleRecurrencesResponse.class.equals(Float.class)
            || DowntimeAttributeScheduleRecurrencesResponse.class.equals(Double.class)
            || DowntimeAttributeScheduleRecurrencesResponse.class.equals(Boolean.class)
            || DowntimeAttributeScheduleRecurrencesResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeAttributeScheduleRecurrencesResponse.class.equals(Integer.class)
                        || DowntimeAttributeScheduleRecurrencesResponse.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeAttributeScheduleRecurrencesResponse.class.equals(Float.class)
                        || DowntimeAttributeScheduleRecurrencesResponse.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeAttributeScheduleRecurrencesResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeAttributeScheduleRecurrencesResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DowntimeAttributeScheduleRecurrencesResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeAttributeScheduleRecurrencesResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DowntimeAttributeScheduleRecurrencesResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DowntimeAttributeScheduleRecurrencesResponse'",
            e);
      }

      // deserialize DowntimeAttributeScheduleOneTimeResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeAttributeScheduleOneTimeResponse.class.equals(Integer.class)
            || DowntimeAttributeScheduleOneTimeResponse.class.equals(Long.class)
            || DowntimeAttributeScheduleOneTimeResponse.class.equals(Float.class)
            || DowntimeAttributeScheduleOneTimeResponse.class.equals(Double.class)
            || DowntimeAttributeScheduleOneTimeResponse.class.equals(Boolean.class)
            || DowntimeAttributeScheduleOneTimeResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeAttributeScheduleOneTimeResponse.class.equals(Integer.class)
                        || DowntimeAttributeScheduleOneTimeResponse.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeAttributeScheduleOneTimeResponse.class.equals(Float.class)
                        || DowntimeAttributeScheduleOneTimeResponse.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeAttributeScheduleOneTimeResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeAttributeScheduleOneTimeResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DowntimeAttributeScheduleOneTimeResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeAttributeScheduleOneTimeResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'DowntimeAttributeScheduleOneTimeResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DowntimeAttributeScheduleOneTimeResponse'",
            e);
      }

      DowntimeAttributeScheduleResponse ret = new DowntimeAttributeScheduleResponse();
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
    public DowntimeAttributeScheduleResponse getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DowntimeAttributeScheduleResponse cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DowntimeAttributeScheduleResponse() {
    super("oneOf", Boolean.FALSE);
  }

  public DowntimeAttributeScheduleResponse(DowntimeAttributeScheduleRecurrencesResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DowntimeAttributeScheduleResponse(DowntimeAttributeScheduleOneTimeResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DowntimeAttributeScheduleRecurrencesResponse",
        new GenericType<DowntimeAttributeScheduleRecurrencesResponse>() {});
    schemas.put(
        "DowntimeAttributeScheduleOneTimeResponse",
        new GenericType<DowntimeAttributeScheduleOneTimeResponse>() {});
    JSON.registerDescendants(
        DowntimeAttributeScheduleResponse.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DowntimeAttributeScheduleResponse.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DowntimeAttributeScheduleRecurrencesResponse,
   * DowntimeAttributeScheduleOneTimeResponse
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DowntimeAttributeScheduleRecurrencesResponse.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DowntimeAttributeScheduleOneTimeResponse.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DowntimeAttributeScheduleRecurrencesResponse,"
            + " DowntimeAttributeScheduleOneTimeResponse");
  }

  /**
   * Get the actual instance, which can be the following:
   * DowntimeAttributeScheduleRecurrencesResponse, DowntimeAttributeScheduleOneTimeResponse
   *
   * @return The actual instance (DowntimeAttributeScheduleRecurrencesResponse,
   *     DowntimeAttributeScheduleOneTimeResponse)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeAttributeScheduleRecurrencesResponse`. If the actual
   * instance is not `DowntimeAttributeScheduleRecurrencesResponse`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `DowntimeAttributeScheduleRecurrencesResponse`
   * @throws ClassCastException if the instance is not
   *     `DowntimeAttributeScheduleRecurrencesResponse`
   */
  public DowntimeAttributeScheduleRecurrencesResponse
      getDowntimeAttributeScheduleRecurrencesResponse() throws ClassCastException {
    return (DowntimeAttributeScheduleRecurrencesResponse) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeAttributeScheduleOneTimeResponse`. If the actual instance
   * is not `DowntimeAttributeScheduleOneTimeResponse`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DowntimeAttributeScheduleOneTimeResponse`
   * @throws ClassCastException if the instance is not `DowntimeAttributeScheduleOneTimeResponse`
   */
  public DowntimeAttributeScheduleOneTimeResponse getDowntimeAttributeScheduleOneTimeResponse()
      throws ClassCastException {
    return (DowntimeAttributeScheduleOneTimeResponse) super.getActualInstance();
  }
}
