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
@JsonDeserialize(using = GeomapBackendPointsRequest.GeomapBackendPointsRequestDeserializer.class)
@JsonSerialize(using = GeomapBackendPointsRequest.GeomapBackendPointsRequestSerializer.class)
public class GeomapBackendPointsRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GeomapBackendPointsRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GeomapBackendPointsRequestSerializer
      extends StdSerializer<GeomapBackendPointsRequest> {
    public GeomapBackendPointsRequestSerializer(Class<GeomapBackendPointsRequest> t) {
      super(t);
    }

    public GeomapBackendPointsRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeomapBackendPointsRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GeomapBackendPointsRequestDeserializer
      extends StdDeserializer<GeomapBackendPointsRequest> {
    public GeomapBackendPointsRequestDeserializer() {
      this(GeomapBackendPointsRequest.class);
    }

    public GeomapBackendPointsRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GeomapBackendPointsRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GeomapBackendPointsRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendPointsRequest20270101OneOf.class.equals(Integer.class)
            || GeomapBackendPointsRequest20270101OneOf.class.equals(Long.class)
            || GeomapBackendPointsRequest20270101OneOf.class.equals(Float.class)
            || GeomapBackendPointsRequest20270101OneOf.class.equals(Double.class)
            || GeomapBackendPointsRequest20270101OneOf.class.equals(Boolean.class)
            || GeomapBackendPointsRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf.class.equals(Integer.class)
                        || GeomapBackendPointsRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf.class.equals(Float.class)
                        || GeomapBackendPointsRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendPointsRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendPointsRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'GeomapBackendPointsRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendPointsRequest20270101OneOf'",
            e);
      }

      // deserialize GeomapBackendPointsRequest20270101OneOf4457225472
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Integer.class)
            || GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Long.class)
            || GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Float.class)
            || GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Double.class)
            || GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Boolean.class)
            || GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Integer.class)
                        || GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Float.class)
                        || GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457225472.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendPointsRequest20270101OneOf4457225472.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendPointsRequest20270101OneOf4457225472) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendPointsRequest20270101OneOf4457225472'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendPointsRequest20270101OneOf4457225472'",
            e);
      }

      // deserialize GeomapBackendPointsRequest20270101OneOf4457227232
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Integer.class)
            || GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Long.class)
            || GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Float.class)
            || GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Double.class)
            || GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Boolean.class)
            || GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Integer.class)
                        || GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Float.class)
                        || GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457227232.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendPointsRequest20270101OneOf4457227232.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendPointsRequest20270101OneOf4457227232) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendPointsRequest20270101OneOf4457227232'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendPointsRequest20270101OneOf4457227232'",
            e);
      }

      // deserialize GeomapBackendPointsRequest20270101OneOf4457228992
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Integer.class)
            || GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Long.class)
            || GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Float.class)
            || GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Double.class)
            || GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Boolean.class)
            || GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Integer.class)
                        || GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Float.class)
                        || GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457228992.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendPointsRequest20270101OneOf4457228992.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendPointsRequest20270101OneOf4457228992) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendPointsRequest20270101OneOf4457228992'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendPointsRequest20270101OneOf4457228992'",
            e);
      }

      // deserialize GeomapBackendPointsRequest20270101OneOf4457230272
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Integer.class)
            || GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Long.class)
            || GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Float.class)
            || GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Double.class)
            || GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Boolean.class)
            || GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Integer.class)
                        || GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Float.class)
                        || GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendPointsRequest20270101OneOf4457230272.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendPointsRequest20270101OneOf4457230272.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendPointsRequest20270101OneOf4457230272) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendPointsRequest20270101OneOf4457230272'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendPointsRequest20270101OneOf4457230272'",
            e);
      }

      GeomapBackendPointsRequest ret = new GeomapBackendPointsRequest();
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
    public GeomapBackendPointsRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GeomapBackendPointsRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GeomapBackendPointsRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public GeomapBackendPointsRequest(GeomapBackendPointsRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendPointsRequest(GeomapBackendPointsRequest20270101OneOf4457225472 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendPointsRequest(GeomapBackendPointsRequest20270101OneOf4457227232 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendPointsRequest(GeomapBackendPointsRequest20270101OneOf4457228992 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendPointsRequest(GeomapBackendPointsRequest20270101OneOf4457230272 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "GeomapBackendPointsRequest20270101OneOf",
        new GenericType<GeomapBackendPointsRequest20270101OneOf>() {});
    schemas.put(
        "GeomapBackendPointsRequest20270101OneOf4457225472",
        new GenericType<GeomapBackendPointsRequest20270101OneOf4457225472>() {});
    schemas.put(
        "GeomapBackendPointsRequest20270101OneOf4457227232",
        new GenericType<GeomapBackendPointsRequest20270101OneOf4457227232>() {});
    schemas.put(
        "GeomapBackendPointsRequest20270101OneOf4457228992",
        new GenericType<GeomapBackendPointsRequest20270101OneOf4457228992>() {});
    schemas.put(
        "GeomapBackendPointsRequest20270101OneOf4457230272",
        new GenericType<GeomapBackendPointsRequest20270101OneOf4457230272>() {});
    JSON.registerDescendants(
        GeomapBackendPointsRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GeomapBackendPointsRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GeomapBackendPointsRequest20270101OneOf,
   * GeomapBackendPointsRequest20270101OneOf4457225472,
   * GeomapBackendPointsRequest20270101OneOf4457227232,
   * GeomapBackendPointsRequest20270101OneOf4457228992,
   * GeomapBackendPointsRequest20270101OneOf4457230272
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        GeomapBackendPointsRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendPointsRequest20270101OneOf4457225472.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendPointsRequest20270101OneOf4457227232.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendPointsRequest20270101OneOf4457228992.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendPointsRequest20270101OneOf4457230272.class,
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
        "Invalid instance type. Must be GeomapBackendPointsRequest20270101OneOf,"
            + " GeomapBackendPointsRequest20270101OneOf4457225472,"
            + " GeomapBackendPointsRequest20270101OneOf4457227232,"
            + " GeomapBackendPointsRequest20270101OneOf4457228992,"
            + " GeomapBackendPointsRequest20270101OneOf4457230272");
  }

  /**
   * Get the actual instance, which can be the following: GeomapBackendPointsRequest20270101OneOf,
   * GeomapBackendPointsRequest20270101OneOf4457225472,
   * GeomapBackendPointsRequest20270101OneOf4457227232,
   * GeomapBackendPointsRequest20270101OneOf4457228992,
   * GeomapBackendPointsRequest20270101OneOf4457230272
   *
   * @return The actual instance (GeomapBackendPointsRequest20270101OneOf,
   *     GeomapBackendPointsRequest20270101OneOf4457225472,
   *     GeomapBackendPointsRequest20270101OneOf4457227232,
   *     GeomapBackendPointsRequest20270101OneOf4457228992,
   *     GeomapBackendPointsRequest20270101OneOf4457230272)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendPointsRequest20270101OneOf`. If the actual instance is
   * not `GeomapBackendPointsRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GeomapBackendPointsRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `GeomapBackendPointsRequest20270101OneOf`
   */
  public GeomapBackendPointsRequest20270101OneOf getGeomapBackendPointsRequest20270101OneOf()
      throws ClassCastException {
    return (GeomapBackendPointsRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendPointsRequest20270101OneOf4457225472`. If the actual
   * instance is not `GeomapBackendPointsRequest20270101OneOf4457225472`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendPointsRequest20270101OneOf4457225472`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendPointsRequest20270101OneOf4457225472`
   */
  public GeomapBackendPointsRequest20270101OneOf4457225472
      getGeomapBackendPointsRequest20270101OneOf4457225472() throws ClassCastException {
    return (GeomapBackendPointsRequest20270101OneOf4457225472) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendPointsRequest20270101OneOf4457227232`. If the actual
   * instance is not `GeomapBackendPointsRequest20270101OneOf4457227232`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendPointsRequest20270101OneOf4457227232`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendPointsRequest20270101OneOf4457227232`
   */
  public GeomapBackendPointsRequest20270101OneOf4457227232
      getGeomapBackendPointsRequest20270101OneOf4457227232() throws ClassCastException {
    return (GeomapBackendPointsRequest20270101OneOf4457227232) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendPointsRequest20270101OneOf4457228992`. If the actual
   * instance is not `GeomapBackendPointsRequest20270101OneOf4457228992`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendPointsRequest20270101OneOf4457228992`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendPointsRequest20270101OneOf4457228992`
   */
  public GeomapBackendPointsRequest20270101OneOf4457228992
      getGeomapBackendPointsRequest20270101OneOf4457228992() throws ClassCastException {
    return (GeomapBackendPointsRequest20270101OneOf4457228992) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendPointsRequest20270101OneOf4457230272`. If the actual
   * instance is not `GeomapBackendPointsRequest20270101OneOf4457230272`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendPointsRequest20270101OneOf4457230272`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendPointsRequest20270101OneOf4457230272`
   */
  public GeomapBackendPointsRequest20270101OneOf4457230272
      getGeomapBackendPointsRequest20270101OneOf4457230272() throws ClassCastException {
    return (GeomapBackendPointsRequest20270101OneOf4457230272) super.getActualInstance();
  }
}
