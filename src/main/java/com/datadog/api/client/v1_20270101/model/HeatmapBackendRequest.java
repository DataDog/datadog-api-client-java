/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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
@JsonDeserialize(using = HeatmapBackendRequest.HeatmapBackendRequestDeserializer.class)
@JsonSerialize(using = HeatmapBackendRequest.HeatmapBackendRequestSerializer.class)
public class HeatmapBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(HeatmapBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HeatmapBackendRequestSerializer extends StdSerializer<HeatmapBackendRequest> {
    public HeatmapBackendRequestSerializer(Class<HeatmapBackendRequest> t) {
      super(t);
    }

    public HeatmapBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatmapBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HeatmapBackendRequestDeserializer
      extends StdDeserializer<HeatmapBackendRequest> {
    public HeatmapBackendRequestDeserializer() {
      this(HeatmapBackendRequest.class);
    }

    public HeatmapBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HeatmapBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize HeatmapBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatmapBackendRequest20270101OneOf.class.equals(Integer.class)
            || HeatmapBackendRequest20270101OneOf.class.equals(Long.class)
            || HeatmapBackendRequest20270101OneOf.class.equals(Float.class)
            || HeatmapBackendRequest20270101OneOf.class.equals(Double.class)
            || HeatmapBackendRequest20270101OneOf.class.equals(Boolean.class)
            || HeatmapBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf.class.equals(Integer.class)
                        || HeatmapBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf.class.equals(Float.class)
                        || HeatmapBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HeatmapBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatmapBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HeatmapBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HeatmapBackendRequest20270101OneOf'",
            e);
      }

      // deserialize HeatmapBackendRequest20270101OneOf4458138496
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatmapBackendRequest20270101OneOf4458138496.class.equals(Integer.class)
            || HeatmapBackendRequest20270101OneOf4458138496.class.equals(Long.class)
            || HeatmapBackendRequest20270101OneOf4458138496.class.equals(Float.class)
            || HeatmapBackendRequest20270101OneOf4458138496.class.equals(Double.class)
            || HeatmapBackendRequest20270101OneOf4458138496.class.equals(Boolean.class)
            || HeatmapBackendRequest20270101OneOf4458138496.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf4458138496.class.equals(Integer.class)
                        || HeatmapBackendRequest20270101OneOf4458138496.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf4458138496.class.equals(Float.class)
                        || HeatmapBackendRequest20270101OneOf4458138496.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf4458138496.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf4458138496.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(HeatmapBackendRequest20270101OneOf4458138496.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatmapBackendRequest20270101OneOf4458138496) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'HeatmapBackendRequest20270101OneOf4458138496'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HeatmapBackendRequest20270101OneOf4458138496'",
            e);
      }

      // deserialize HeatmapBackendRequest20270101OneOf4458139936
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatmapBackendRequest20270101OneOf4458139936.class.equals(Integer.class)
            || HeatmapBackendRequest20270101OneOf4458139936.class.equals(Long.class)
            || HeatmapBackendRequest20270101OneOf4458139936.class.equals(Float.class)
            || HeatmapBackendRequest20270101OneOf4458139936.class.equals(Double.class)
            || HeatmapBackendRequest20270101OneOf4458139936.class.equals(Boolean.class)
            || HeatmapBackendRequest20270101OneOf4458139936.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf4458139936.class.equals(Integer.class)
                        || HeatmapBackendRequest20270101OneOf4458139936.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf4458139936.class.equals(Float.class)
                        || HeatmapBackendRequest20270101OneOf4458139936.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf4458139936.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf4458139936.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(HeatmapBackendRequest20270101OneOf4458139936.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatmapBackendRequest20270101OneOf4458139936) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'HeatmapBackendRequest20270101OneOf4458139936'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HeatmapBackendRequest20270101OneOf4458139936'",
            e);
      }

      // deserialize HeatmapBackendRequest20270101OneOf4458140576
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HeatmapBackendRequest20270101OneOf4458140576.class.equals(Integer.class)
            || HeatmapBackendRequest20270101OneOf4458140576.class.equals(Long.class)
            || HeatmapBackendRequest20270101OneOf4458140576.class.equals(Float.class)
            || HeatmapBackendRequest20270101OneOf4458140576.class.equals(Double.class)
            || HeatmapBackendRequest20270101OneOf4458140576.class.equals(Boolean.class)
            || HeatmapBackendRequest20270101OneOf4458140576.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf4458140576.class.equals(Integer.class)
                        || HeatmapBackendRequest20270101OneOf4458140576.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HeatmapBackendRequest20270101OneOf4458140576.class.equals(Float.class)
                        || HeatmapBackendRequest20270101OneOf4458140576.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf4458140576.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HeatmapBackendRequest20270101OneOf4458140576.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(HeatmapBackendRequest20270101OneOf4458140576.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HeatmapBackendRequest20270101OneOf4458140576) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'HeatmapBackendRequest20270101OneOf4458140576'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HeatmapBackendRequest20270101OneOf4458140576'",
            e);
      }

      HeatmapBackendRequest ret = new HeatmapBackendRequest();
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
    public HeatmapBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "HeatmapBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HeatmapBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public HeatmapBackendRequest(HeatmapBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatmapBackendRequest(HeatmapBackendRequest20270101OneOf4458138496 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatmapBackendRequest(HeatmapBackendRequest20270101OneOf4458139936 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HeatmapBackendRequest(HeatmapBackendRequest20270101OneOf4458140576 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "HeatmapBackendRequest20270101OneOf",
        new GenericType<HeatmapBackendRequest20270101OneOf>() {});
    schemas.put(
        "HeatmapBackendRequest20270101OneOf4458138496",
        new GenericType<HeatmapBackendRequest20270101OneOf4458138496>() {});
    schemas.put(
        "HeatmapBackendRequest20270101OneOf4458139936",
        new GenericType<HeatmapBackendRequest20270101OneOf4458139936>() {});
    schemas.put(
        "HeatmapBackendRequest20270101OneOf4458140576",
        new GenericType<HeatmapBackendRequest20270101OneOf4458140576>() {});
    JSON.registerDescendants(HeatmapBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HeatmapBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HeatmapBackendRequest20270101OneOf,
   * HeatmapBackendRequest20270101OneOf4458138496, HeatmapBackendRequest20270101OneOf4458139936,
   * HeatmapBackendRequest20270101OneOf4458140576
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        HeatmapBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HeatmapBackendRequest20270101OneOf4458138496.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HeatmapBackendRequest20270101OneOf4458139936.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HeatmapBackendRequest20270101OneOf4458140576.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HeatmapBackendRequest20270101OneOf,"
            + " HeatmapBackendRequest20270101OneOf4458138496,"
            + " HeatmapBackendRequest20270101OneOf4458139936,"
            + " HeatmapBackendRequest20270101OneOf4458140576");
  }

  /**
   * Get the actual instance, which can be the following: HeatmapBackendRequest20270101OneOf,
   * HeatmapBackendRequest20270101OneOf4458138496, HeatmapBackendRequest20270101OneOf4458139936,
   * HeatmapBackendRequest20270101OneOf4458140576
   *
   * @return The actual instance (HeatmapBackendRequest20270101OneOf,
   *     HeatmapBackendRequest20270101OneOf4458138496, HeatmapBackendRequest20270101OneOf4458139936,
   *     HeatmapBackendRequest20270101OneOf4458140576)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatmapBackendRequest20270101OneOf`. If the actual instance is not
   * `HeatmapBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HeatmapBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `HeatmapBackendRequest20270101OneOf`
   */
  public HeatmapBackendRequest20270101OneOf getHeatmapBackendRequest20270101OneOf()
      throws ClassCastException {
    return (HeatmapBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatmapBackendRequest20270101OneOf4458138496`. If the actual
   * instance is not `HeatmapBackendRequest20270101OneOf4458138496`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `HeatmapBackendRequest20270101OneOf4458138496`
   * @throws ClassCastException if the instance is not
   *     `HeatmapBackendRequest20270101OneOf4458138496`
   */
  public HeatmapBackendRequest20270101OneOf4458138496
      getHeatmapBackendRequest20270101OneOf4458138496() throws ClassCastException {
    return (HeatmapBackendRequest20270101OneOf4458138496) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatmapBackendRequest20270101OneOf4458139936`. If the actual
   * instance is not `HeatmapBackendRequest20270101OneOf4458139936`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `HeatmapBackendRequest20270101OneOf4458139936`
   * @throws ClassCastException if the instance is not
   *     `HeatmapBackendRequest20270101OneOf4458139936`
   */
  public HeatmapBackendRequest20270101OneOf4458139936
      getHeatmapBackendRequest20270101OneOf4458139936() throws ClassCastException {
    return (HeatmapBackendRequest20270101OneOf4458139936) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HeatmapBackendRequest20270101OneOf4458140576`. If the actual
   * instance is not `HeatmapBackendRequest20270101OneOf4458140576`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `HeatmapBackendRequest20270101OneOf4458140576`
   * @throws ClassCastException if the instance is not
   *     `HeatmapBackendRequest20270101OneOf4458140576`
   */
  public HeatmapBackendRequest20270101OneOf4458140576
      getHeatmapBackendRequest20270101OneOf4458140576() throws ClassCastException {
    return (HeatmapBackendRequest20270101OneOf4458140576) super.getActualInstance();
  }
}
