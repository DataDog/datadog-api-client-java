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
    using = PatchSavedFilterConflictResponse.PatchSavedFilterConflictResponseDeserializer.class)
@JsonSerialize(
    using = PatchSavedFilterConflictResponse.PatchSavedFilterConflictResponseSerializer.class)
public class PatchSavedFilterConflictResponse extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(PatchSavedFilterConflictResponse.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class PatchSavedFilterConflictResponseSerializer
      extends StdSerializer<PatchSavedFilterConflictResponse> {
    public PatchSavedFilterConflictResponseSerializer(Class<PatchSavedFilterConflictResponse> t) {
      super(t);
    }

    public PatchSavedFilterConflictResponseSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PatchSavedFilterConflictResponse value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class PatchSavedFilterConflictResponseDeserializer
      extends StdDeserializer<PatchSavedFilterConflictResponse> {
    public PatchSavedFilterConflictResponseDeserializer() {
      this(PatchSavedFilterConflictResponse.class);
    }

    public PatchSavedFilterConflictResponseDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public PatchSavedFilterConflictResponse deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SavedFilterJSONAPIErrorResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SavedFilterJSONAPIErrorResponse.class.equals(Integer.class)
            || SavedFilterJSONAPIErrorResponse.class.equals(Long.class)
            || SavedFilterJSONAPIErrorResponse.class.equals(Float.class)
            || SavedFilterJSONAPIErrorResponse.class.equals(Double.class)
            || SavedFilterJSONAPIErrorResponse.class.equals(Boolean.class)
            || SavedFilterJSONAPIErrorResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SavedFilterJSONAPIErrorResponse.class.equals(Integer.class)
                        || SavedFilterJSONAPIErrorResponse.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SavedFilterJSONAPIErrorResponse.class.equals(Float.class)
                        || SavedFilterJSONAPIErrorResponse.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SavedFilterJSONAPIErrorResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SavedFilterJSONAPIErrorResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SavedFilterJSONAPIErrorResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SavedFilterJSONAPIErrorResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SavedFilterJSONAPIErrorResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'SavedFilterJSONAPIErrorResponse'", e);
      }

      // deserialize SavedFilterApprovalConflictResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SavedFilterApprovalConflictResponse.class.equals(Integer.class)
            || SavedFilterApprovalConflictResponse.class.equals(Long.class)
            || SavedFilterApprovalConflictResponse.class.equals(Float.class)
            || SavedFilterApprovalConflictResponse.class.equals(Double.class)
            || SavedFilterApprovalConflictResponse.class.equals(Boolean.class)
            || SavedFilterApprovalConflictResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SavedFilterApprovalConflictResponse.class.equals(Integer.class)
                        || SavedFilterApprovalConflictResponse.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SavedFilterApprovalConflictResponse.class.equals(Float.class)
                        || SavedFilterApprovalConflictResponse.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SavedFilterApprovalConflictResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SavedFilterApprovalConflictResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SavedFilterApprovalConflictResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SavedFilterApprovalConflictResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SavedFilterApprovalConflictResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SavedFilterApprovalConflictResponse'",
            e);
      }

      PatchSavedFilterConflictResponse ret = new PatchSavedFilterConflictResponse();
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
    public PatchSavedFilterConflictResponse getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "PatchSavedFilterConflictResponse cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public PatchSavedFilterConflictResponse() {
    super("oneOf", Boolean.FALSE);
  }

  public PatchSavedFilterConflictResponse(SavedFilterJSONAPIErrorResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PatchSavedFilterConflictResponse(SavedFilterApprovalConflictResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SavedFilterJSONAPIErrorResponse", new GenericType<SavedFilterJSONAPIErrorResponse>() {});
    schemas.put(
        "SavedFilterApprovalConflictResponse",
        new GenericType<SavedFilterApprovalConflictResponse>() {});
    JSON.registerDescendants(
        PatchSavedFilterConflictResponse.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return PatchSavedFilterConflictResponse.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SavedFilterJSONAPIErrorResponse,
   * SavedFilterApprovalConflictResponse
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SavedFilterJSONAPIErrorResponse.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SavedFilterApprovalConflictResponse.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SavedFilterJSONAPIErrorResponse,"
            + " SavedFilterApprovalConflictResponse");
  }

  /**
   * Get the actual instance, which can be the following: SavedFilterJSONAPIErrorResponse,
   * SavedFilterApprovalConflictResponse
   *
   * @return The actual instance (SavedFilterJSONAPIErrorResponse,
   *     SavedFilterApprovalConflictResponse)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SavedFilterJSONAPIErrorResponse`. If the actual instance is not
   * `SavedFilterJSONAPIErrorResponse`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SavedFilterJSONAPIErrorResponse`
   * @throws ClassCastException if the instance is not `SavedFilterJSONAPIErrorResponse`
   */
  public SavedFilterJSONAPIErrorResponse getSavedFilterJSONAPIErrorResponse()
      throws ClassCastException {
    return (SavedFilterJSONAPIErrorResponse) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SavedFilterApprovalConflictResponse`. If the actual instance is not
   * `SavedFilterApprovalConflictResponse`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SavedFilterApprovalConflictResponse`
   * @throws ClassCastException if the instance is not `SavedFilterApprovalConflictResponse`
   */
  public SavedFilterApprovalConflictResponse getSavedFilterApprovalConflictResponse()
      throws ClassCastException {
    return (SavedFilterApprovalConflictResponse) super.getActualInstance();
  }
}
