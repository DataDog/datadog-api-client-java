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
    using = CIAppCreatePipelineEventRequest.CIAppCreatePipelineEventRequestDeserializer.class)
@JsonSerialize(
    using = CIAppCreatePipelineEventRequest.CIAppCreatePipelineEventRequestSerializer.class)
public class CIAppCreatePipelineEventRequest extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CIAppCreatePipelineEventRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CIAppCreatePipelineEventRequestSerializer
      extends StdSerializer<CIAppCreatePipelineEventRequest> {
    public CIAppCreatePipelineEventRequestSerializer(Class<CIAppCreatePipelineEventRequest> t) {
      super(t);
    }

    public CIAppCreatePipelineEventRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppCreatePipelineEventRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CIAppCreatePipelineEventRequestDeserializer
      extends StdDeserializer<CIAppCreatePipelineEventRequest> {
    public CIAppCreatePipelineEventRequestDeserializer() {
      this(CIAppCreatePipelineEventRequest.class);
    }

    public CIAppCreatePipelineEventRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CIAppCreatePipelineEventRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CIAppCreatePipelineEventRequestRootDataSingle
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Integer.class)
            || CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Long.class)
            || CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Float.class)
            || CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Double.class)
            || CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Boolean.class)
            || CIAppCreatePipelineEventRequestRootDataSingle.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Integer.class)
                        || CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Float.class)
                        || CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppCreatePipelineEventRequestRootDataSingle.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppCreatePipelineEventRequestRootDataSingle.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CIAppCreatePipelineEventRequestRootDataSingle.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppCreatePipelineEventRequestRootDataSingle) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'CIAppCreatePipelineEventRequestRootDataSingle'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CIAppCreatePipelineEventRequestRootDataSingle'",
            e);
      }

      // deserialize CIAppCreatePipelineEventRequestRootDataArray
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppCreatePipelineEventRequestRootDataArray.class.equals(Integer.class)
            || CIAppCreatePipelineEventRequestRootDataArray.class.equals(Long.class)
            || CIAppCreatePipelineEventRequestRootDataArray.class.equals(Float.class)
            || CIAppCreatePipelineEventRequestRootDataArray.class.equals(Double.class)
            || CIAppCreatePipelineEventRequestRootDataArray.class.equals(Boolean.class)
            || CIAppCreatePipelineEventRequestRootDataArray.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppCreatePipelineEventRequestRootDataArray.class.equals(Integer.class)
                        || CIAppCreatePipelineEventRequestRootDataArray.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppCreatePipelineEventRequestRootDataArray.class.equals(Float.class)
                        || CIAppCreatePipelineEventRequestRootDataArray.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppCreatePipelineEventRequestRootDataArray.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppCreatePipelineEventRequestRootDataArray.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CIAppCreatePipelineEventRequestRootDataArray.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppCreatePipelineEventRequestRootDataArray) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'CIAppCreatePipelineEventRequestRootDataArray'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CIAppCreatePipelineEventRequestRootDataArray'",
            e);
      }

      CIAppCreatePipelineEventRequest ret = new CIAppCreatePipelineEventRequest();
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
    public CIAppCreatePipelineEventRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CIAppCreatePipelineEventRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CIAppCreatePipelineEventRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public CIAppCreatePipelineEventRequest(CIAppCreatePipelineEventRequestRootDataSingle o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CIAppCreatePipelineEventRequest(CIAppCreatePipelineEventRequestRootDataArray o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CIAppCreatePipelineEventRequestRootDataSingle",
        new GenericType<CIAppCreatePipelineEventRequestRootDataSingle>() {});
    schemas.put(
        "CIAppCreatePipelineEventRequestRootDataArray",
        new GenericType<CIAppCreatePipelineEventRequestRootDataArray>() {});
    JSON.registerDescendants(
        CIAppCreatePipelineEventRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CIAppCreatePipelineEventRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CIAppCreatePipelineEventRequestRootDataSingle,
   * CIAppCreatePipelineEventRequestRootDataArray
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CIAppCreatePipelineEventRequestRootDataSingle.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CIAppCreatePipelineEventRequestRootDataArray.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CIAppCreatePipelineEventRequestRootDataSingle,"
            + " CIAppCreatePipelineEventRequestRootDataArray");
  }

  /**
   * Get the actual instance, which can be the following:
   * CIAppCreatePipelineEventRequestRootDataSingle, CIAppCreatePipelineEventRequestRootDataArray
   *
   * @return The actual instance (CIAppCreatePipelineEventRequestRootDataSingle,
   *     CIAppCreatePipelineEventRequestRootDataArray)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppCreatePipelineEventRequestRootDataSingle`. If the actual
   * instance is not `CIAppCreatePipelineEventRequestRootDataSingle`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `CIAppCreatePipelineEventRequestRootDataSingle`
   * @throws ClassCastException if the instance is not
   *     `CIAppCreatePipelineEventRequestRootDataSingle`
   */
  public CIAppCreatePipelineEventRequestRootDataSingle
      getCIAppCreatePipelineEventRequestRootDataSingle() throws ClassCastException {
    return (CIAppCreatePipelineEventRequestRootDataSingle) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppCreatePipelineEventRequestRootDataArray`. If the actual
   * instance is not `CIAppCreatePipelineEventRequestRootDataArray`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `CIAppCreatePipelineEventRequestRootDataArray`
   * @throws ClassCastException if the instance is not
   *     `CIAppCreatePipelineEventRequestRootDataArray`
   */
  public CIAppCreatePipelineEventRequestRootDataArray
      getCIAppCreatePipelineEventRequestRootDataArray() throws ClassCastException {
    return (CIAppCreatePipelineEventRequestRootDataArray) super.getActualInstance();
  }
}
