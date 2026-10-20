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
@JsonDeserialize(using = DemInferredJourneyItem.DemInferredJourneyItemDeserializer.class)
@JsonSerialize(using = DemInferredJourneyItem.DemInferredJourneyItemSerializer.class)
public class DemInferredJourneyItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(DemInferredJourneyItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DemInferredJourneyItemSerializer
      extends StdSerializer<DemInferredJourneyItem> {
    public DemInferredJourneyItemSerializer(Class<DemInferredJourneyItem> t) {
      super(t);
    }

    public DemInferredJourneyItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DemInferredJourneyItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DemInferredJourneyItemDeserializer
      extends StdDeserializer<DemInferredJourneyItem> {
    public DemInferredJourneyItemDeserializer() {
      this(DemInferredJourneyItem.class);
    }

    public DemInferredJourneyItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DemInferredJourneyItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DemInferredJourneyCandidateData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DemInferredJourneyCandidateData.class.equals(Integer.class)
            || DemInferredJourneyCandidateData.class.equals(Long.class)
            || DemInferredJourneyCandidateData.class.equals(Float.class)
            || DemInferredJourneyCandidateData.class.equals(Double.class)
            || DemInferredJourneyCandidateData.class.equals(Boolean.class)
            || DemInferredJourneyCandidateData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DemInferredJourneyCandidateData.class.equals(Integer.class)
                        || DemInferredJourneyCandidateData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DemInferredJourneyCandidateData.class.equals(Float.class)
                        || DemInferredJourneyCandidateData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DemInferredJourneyCandidateData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DemInferredJourneyCandidateData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DemInferredJourneyCandidateData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DemInferredJourneyCandidateData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DemInferredJourneyCandidateData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'DemInferredJourneyCandidateData'", e);
      }

      // deserialize DemInferredJourneyIgnoredData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DemInferredJourneyIgnoredData.class.equals(Integer.class)
            || DemInferredJourneyIgnoredData.class.equals(Long.class)
            || DemInferredJourneyIgnoredData.class.equals(Float.class)
            || DemInferredJourneyIgnoredData.class.equals(Double.class)
            || DemInferredJourneyIgnoredData.class.equals(Boolean.class)
            || DemInferredJourneyIgnoredData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DemInferredJourneyIgnoredData.class.equals(Integer.class)
                        || DemInferredJourneyIgnoredData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DemInferredJourneyIgnoredData.class.equals(Float.class)
                        || DemInferredJourneyIgnoredData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DemInferredJourneyIgnoredData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DemInferredJourneyIgnoredData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DemInferredJourneyIgnoredData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DemInferredJourneyIgnoredData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DemInferredJourneyIgnoredData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DemInferredJourneyIgnoredData'", e);
      }

      DemInferredJourneyItem ret = new DemInferredJourneyItem();
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
    public DemInferredJourneyItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "DemInferredJourneyItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DemInferredJourneyItem() {
    super("oneOf", Boolean.FALSE);
  }

  public DemInferredJourneyItem(DemInferredJourneyCandidateData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DemInferredJourneyItem(DemInferredJourneyIgnoredData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DemInferredJourneyCandidateData", new GenericType<DemInferredJourneyCandidateData>() {});
    schemas.put(
        "DemInferredJourneyIgnoredData", new GenericType<DemInferredJourneyIgnoredData>() {});
    JSON.registerDescendants(DemInferredJourneyItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DemInferredJourneyItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DemInferredJourneyCandidateData, DemInferredJourneyIgnoredData
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DemInferredJourneyCandidateData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DemInferredJourneyIgnoredData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DemInferredJourneyCandidateData,"
            + " DemInferredJourneyIgnoredData");
  }

  /**
   * Get the actual instance, which can be the following: DemInferredJourneyCandidateData,
   * DemInferredJourneyIgnoredData
   *
   * @return The actual instance (DemInferredJourneyCandidateData, DemInferredJourneyIgnoredData)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DemInferredJourneyCandidateData`. If the actual instance is not
   * `DemInferredJourneyCandidateData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DemInferredJourneyCandidateData`
   * @throws ClassCastException if the instance is not `DemInferredJourneyCandidateData`
   */
  public DemInferredJourneyCandidateData getDemInferredJourneyCandidateData()
      throws ClassCastException {
    return (DemInferredJourneyCandidateData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DemInferredJourneyIgnoredData`. If the actual instance is not
   * `DemInferredJourneyIgnoredData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DemInferredJourneyIgnoredData`
   * @throws ClassCastException if the instance is not `DemInferredJourneyIgnoredData`
   */
  public DemInferredJourneyIgnoredData getDemInferredJourneyIgnoredData()
      throws ClassCastException {
    return (DemInferredJourneyIgnoredData) super.getActualInstance();
  }
}
