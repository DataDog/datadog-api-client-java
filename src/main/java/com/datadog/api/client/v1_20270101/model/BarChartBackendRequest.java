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
@JsonDeserialize(using = BarChartBackendRequest.BarChartBackendRequestDeserializer.class)
@JsonSerialize(using = BarChartBackendRequest.BarChartBackendRequestSerializer.class)
public class BarChartBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(BarChartBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class BarChartBackendRequestSerializer
      extends StdSerializer<BarChartBackendRequest> {
    public BarChartBackendRequestSerializer(Class<BarChartBackendRequest> t) {
      super(t);
    }

    public BarChartBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class BarChartBackendRequestDeserializer
      extends StdDeserializer<BarChartBackendRequest> {
    public BarChartBackendRequestDeserializer() {
      this(BarChartBackendRequest.class);
    }

    public BarChartBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public BarChartBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize BarChartBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendRequest20270101OneOf.class.equals(Integer.class)
            || BarChartBackendRequest20270101OneOf.class.equals(Long.class)
            || BarChartBackendRequest20270101OneOf.class.equals(Float.class)
            || BarChartBackendRequest20270101OneOf.class.equals(Double.class)
            || BarChartBackendRequest20270101OneOf.class.equals(Boolean.class)
            || BarChartBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf.class.equals(Integer.class)
                        || BarChartBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf.class.equals(Float.class)
                        || BarChartBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(BarChartBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'BarChartBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'BarChartBackendRequest20270101OneOf'",
            e);
      }

      // deserialize BarChartBackendRequest20270101OneOf4454434112
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendRequest20270101OneOf4454434112.class.equals(Integer.class)
            || BarChartBackendRequest20270101OneOf4454434112.class.equals(Long.class)
            || BarChartBackendRequest20270101OneOf4454434112.class.equals(Float.class)
            || BarChartBackendRequest20270101OneOf4454434112.class.equals(Double.class)
            || BarChartBackendRequest20270101OneOf4454434112.class.equals(Boolean.class)
            || BarChartBackendRequest20270101OneOf4454434112.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454434112.class.equals(Integer.class)
                        || BarChartBackendRequest20270101OneOf4454434112.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454434112.class.equals(Float.class)
                        || BarChartBackendRequest20270101OneOf4454434112.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454434112.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454434112.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(BarChartBackendRequest20270101OneOf4454434112.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendRequest20270101OneOf4454434112) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'BarChartBackendRequest20270101OneOf4454434112'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'BarChartBackendRequest20270101OneOf4454434112'",
            e);
      }

      // deserialize BarChartBackendRequest20270101OneOf4454435552
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendRequest20270101OneOf4454435552.class.equals(Integer.class)
            || BarChartBackendRequest20270101OneOf4454435552.class.equals(Long.class)
            || BarChartBackendRequest20270101OneOf4454435552.class.equals(Float.class)
            || BarChartBackendRequest20270101OneOf4454435552.class.equals(Double.class)
            || BarChartBackendRequest20270101OneOf4454435552.class.equals(Boolean.class)
            || BarChartBackendRequest20270101OneOf4454435552.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454435552.class.equals(Integer.class)
                        || BarChartBackendRequest20270101OneOf4454435552.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454435552.class.equals(Float.class)
                        || BarChartBackendRequest20270101OneOf4454435552.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454435552.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454435552.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(BarChartBackendRequest20270101OneOf4454435552.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendRequest20270101OneOf4454435552) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'BarChartBackendRequest20270101OneOf4454435552'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'BarChartBackendRequest20270101OneOf4454435552'",
            e);
      }

      // deserialize BarChartBackendRequest20270101OneOf4454436672
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendRequest20270101OneOf4454436672.class.equals(Integer.class)
            || BarChartBackendRequest20270101OneOf4454436672.class.equals(Long.class)
            || BarChartBackendRequest20270101OneOf4454436672.class.equals(Float.class)
            || BarChartBackendRequest20270101OneOf4454436672.class.equals(Double.class)
            || BarChartBackendRequest20270101OneOf4454436672.class.equals(Boolean.class)
            || BarChartBackendRequest20270101OneOf4454436672.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454436672.class.equals(Integer.class)
                        || BarChartBackendRequest20270101OneOf4454436672.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454436672.class.equals(Float.class)
                        || BarChartBackendRequest20270101OneOf4454436672.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454436672.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454436672.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(BarChartBackendRequest20270101OneOf4454436672.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendRequest20270101OneOf4454436672) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'BarChartBackendRequest20270101OneOf4454436672'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'BarChartBackendRequest20270101OneOf4454436672'",
            e);
      }

      // deserialize BarChartBackendRequest20270101OneOf4454438272
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (BarChartBackendRequest20270101OneOf4454438272.class.equals(Integer.class)
            || BarChartBackendRequest20270101OneOf4454438272.class.equals(Long.class)
            || BarChartBackendRequest20270101OneOf4454438272.class.equals(Float.class)
            || BarChartBackendRequest20270101OneOf4454438272.class.equals(Double.class)
            || BarChartBackendRequest20270101OneOf4454438272.class.equals(Boolean.class)
            || BarChartBackendRequest20270101OneOf4454438272.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454438272.class.equals(Integer.class)
                        || BarChartBackendRequest20270101OneOf4454438272.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((BarChartBackendRequest20270101OneOf4454438272.class.equals(Float.class)
                        || BarChartBackendRequest20270101OneOf4454438272.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454438272.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (BarChartBackendRequest20270101OneOf4454438272.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(BarChartBackendRequest20270101OneOf4454438272.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((BarChartBackendRequest20270101OneOf4454438272) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'BarChartBackendRequest20270101OneOf4454438272'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'BarChartBackendRequest20270101OneOf4454438272'",
            e);
      }

      BarChartBackendRequest ret = new BarChartBackendRequest();
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
    public BarChartBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "BarChartBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public BarChartBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public BarChartBackendRequest(BarChartBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public BarChartBackendRequest(BarChartBackendRequest20270101OneOf4454434112 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public BarChartBackendRequest(BarChartBackendRequest20270101OneOf4454435552 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public BarChartBackendRequest(BarChartBackendRequest20270101OneOf4454436672 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public BarChartBackendRequest(BarChartBackendRequest20270101OneOf4454438272 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "BarChartBackendRequest20270101OneOf",
        new GenericType<BarChartBackendRequest20270101OneOf>() {});
    schemas.put(
        "BarChartBackendRequest20270101OneOf4454434112",
        new GenericType<BarChartBackendRequest20270101OneOf4454434112>() {});
    schemas.put(
        "BarChartBackendRequest20270101OneOf4454435552",
        new GenericType<BarChartBackendRequest20270101OneOf4454435552>() {});
    schemas.put(
        "BarChartBackendRequest20270101OneOf4454436672",
        new GenericType<BarChartBackendRequest20270101OneOf4454436672>() {});
    schemas.put(
        "BarChartBackendRequest20270101OneOf4454438272",
        new GenericType<BarChartBackendRequest20270101OneOf4454438272>() {});
    JSON.registerDescendants(BarChartBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return BarChartBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: BarChartBackendRequest20270101OneOf,
   * BarChartBackendRequest20270101OneOf4454434112, BarChartBackendRequest20270101OneOf4454435552,
   * BarChartBackendRequest20270101OneOf4454436672, BarChartBackendRequest20270101OneOf4454438272
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        BarChartBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        BarChartBackendRequest20270101OneOf4454434112.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        BarChartBackendRequest20270101OneOf4454435552.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        BarChartBackendRequest20270101OneOf4454436672.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        BarChartBackendRequest20270101OneOf4454438272.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be BarChartBackendRequest20270101OneOf,"
            + " BarChartBackendRequest20270101OneOf4454434112,"
            + " BarChartBackendRequest20270101OneOf4454435552,"
            + " BarChartBackendRequest20270101OneOf4454436672,"
            + " BarChartBackendRequest20270101OneOf4454438272");
  }

  /**
   * Get the actual instance, which can be the following: BarChartBackendRequest20270101OneOf,
   * BarChartBackendRequest20270101OneOf4454434112, BarChartBackendRequest20270101OneOf4454435552,
   * BarChartBackendRequest20270101OneOf4454436672, BarChartBackendRequest20270101OneOf4454438272
   *
   * @return The actual instance (BarChartBackendRequest20270101OneOf,
   *     BarChartBackendRequest20270101OneOf4454434112,
   *     BarChartBackendRequest20270101OneOf4454435552,
   *     BarChartBackendRequest20270101OneOf4454436672,
   *     BarChartBackendRequest20270101OneOf4454438272)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendRequest20270101OneOf`. If the actual instance is not
   * `BarChartBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `BarChartBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `BarChartBackendRequest20270101OneOf`
   */
  public BarChartBackendRequest20270101OneOf getBarChartBackendRequest20270101OneOf()
      throws ClassCastException {
    return (BarChartBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendRequest20270101OneOf4454434112`. If the actual
   * instance is not `BarChartBackendRequest20270101OneOf4454434112`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `BarChartBackendRequest20270101OneOf4454434112`
   * @throws ClassCastException if the instance is not
   *     `BarChartBackendRequest20270101OneOf4454434112`
   */
  public BarChartBackendRequest20270101OneOf4454434112
      getBarChartBackendRequest20270101OneOf4454434112() throws ClassCastException {
    return (BarChartBackendRequest20270101OneOf4454434112) super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendRequest20270101OneOf4454435552`. If the actual
   * instance is not `BarChartBackendRequest20270101OneOf4454435552`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `BarChartBackendRequest20270101OneOf4454435552`
   * @throws ClassCastException if the instance is not
   *     `BarChartBackendRequest20270101OneOf4454435552`
   */
  public BarChartBackendRequest20270101OneOf4454435552
      getBarChartBackendRequest20270101OneOf4454435552() throws ClassCastException {
    return (BarChartBackendRequest20270101OneOf4454435552) super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendRequest20270101OneOf4454436672`. If the actual
   * instance is not `BarChartBackendRequest20270101OneOf4454436672`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `BarChartBackendRequest20270101OneOf4454436672`
   * @throws ClassCastException if the instance is not
   *     `BarChartBackendRequest20270101OneOf4454436672`
   */
  public BarChartBackendRequest20270101OneOf4454436672
      getBarChartBackendRequest20270101OneOf4454436672() throws ClassCastException {
    return (BarChartBackendRequest20270101OneOf4454436672) super.getActualInstance();
  }

  /**
   * Get the actual instance of `BarChartBackendRequest20270101OneOf4454438272`. If the actual
   * instance is not `BarChartBackendRequest20270101OneOf4454438272`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `BarChartBackendRequest20270101OneOf4454438272`
   * @throws ClassCastException if the instance is not
   *     `BarChartBackendRequest20270101OneOf4454438272`
   */
  public BarChartBackendRequest20270101OneOf4454438272
      getBarChartBackendRequest20270101OneOf4454438272() throws ClassCastException {
    return (BarChartBackendRequest20270101OneOf4454438272) super.getActualInstance();
  }
}
