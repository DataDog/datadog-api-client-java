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
@JsonDeserialize(
    using = ScatterplotBackendTableRequest.ScatterplotBackendTableRequestDeserializer.class)
@JsonSerialize(
    using = ScatterplotBackendTableRequest.ScatterplotBackendTableRequestSerializer.class)
public class ScatterplotBackendTableRequest extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ScatterplotBackendTableRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ScatterplotBackendTableRequestSerializer
      extends StdSerializer<ScatterplotBackendTableRequest> {
    public ScatterplotBackendTableRequestSerializer(Class<ScatterplotBackendTableRequest> t) {
      super(t);
    }

    public ScatterplotBackendTableRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotBackendTableRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ScatterplotBackendTableRequestDeserializer
      extends StdDeserializer<ScatterplotBackendTableRequest> {
    public ScatterplotBackendTableRequestDeserializer() {
      this(ScatterplotBackendTableRequest.class);
    }

    public ScatterplotBackendTableRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ScatterplotBackendTableRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ScatterplotBackendTableRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendTableRequest20270101OneOf.class.equals(Integer.class)
            || ScatterplotBackendTableRequest20270101OneOf.class.equals(Long.class)
            || ScatterplotBackendTableRequest20270101OneOf.class.equals(Float.class)
            || ScatterplotBackendTableRequest20270101OneOf.class.equals(Double.class)
            || ScatterplotBackendTableRequest20270101OneOf.class.equals(Boolean.class)
            || ScatterplotBackendTableRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf.class.equals(Integer.class)
                        || ScatterplotBackendTableRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf.class.equals(Float.class)
                        || ScatterplotBackendTableRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ScatterplotBackendTableRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendTableRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ScatterplotBackendTableRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ScatterplotBackendTableRequest20270101OneOf'",
            e);
      }

      // deserialize ScatterplotBackendTableRequest20270101OneOf4461521920
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Integer.class)
            || ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Long.class)
            || ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Float.class)
            || ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Double.class)
            || ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Boolean.class)
            || ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Integer.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Float.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461521920.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ScatterplotBackendTableRequest20270101OneOf4461521920.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendTableRequest20270101OneOf4461521920) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ScatterplotBackendTableRequest20270101OneOf4461521920'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ScatterplotBackendTableRequest20270101OneOf4461521920'",
            e);
      }

      // deserialize ScatterplotBackendTableRequest20270101OneOf4461523200
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Integer.class)
            || ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Long.class)
            || ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Float.class)
            || ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Double.class)
            || ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Boolean.class)
            || ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Integer.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Float.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461523200.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ScatterplotBackendTableRequest20270101OneOf4461523200.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendTableRequest20270101OneOf4461523200) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ScatterplotBackendTableRequest20270101OneOf4461523200'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ScatterplotBackendTableRequest20270101OneOf4461523200'",
            e);
      }

      // deserialize ScatterplotBackendTableRequest20270101OneOf4461524480
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Integer.class)
            || ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Long.class)
            || ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Float.class)
            || ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Double.class)
            || ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Boolean.class)
            || ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Integer.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Float.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461524480.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ScatterplotBackendTableRequest20270101OneOf4461524480.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendTableRequest20270101OneOf4461524480) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ScatterplotBackendTableRequest20270101OneOf4461524480'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ScatterplotBackendTableRequest20270101OneOf4461524480'",
            e);
      }

      // deserialize ScatterplotBackendTableRequest20270101OneOf4461525600
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Integer.class)
            || ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Long.class)
            || ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Float.class)
            || ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Double.class)
            || ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Boolean.class)
            || ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Integer.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Float.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461525600.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ScatterplotBackendTableRequest20270101OneOf4461525600.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendTableRequest20270101OneOf4461525600) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ScatterplotBackendTableRequest20270101OneOf4461525600'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ScatterplotBackendTableRequest20270101OneOf4461525600'",
            e);
      }

      // deserialize ScatterplotBackendTableRequest20270101OneOf4461756480
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Integer.class)
            || ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Long.class)
            || ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Float.class)
            || ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Double.class)
            || ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Boolean.class)
            || ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Integer.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Float.class)
                        || ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotBackendTableRequest20270101OneOf4461756480.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ScatterplotBackendTableRequest20270101OneOf4461756480.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotBackendTableRequest20270101OneOf4461756480) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ScatterplotBackendTableRequest20270101OneOf4461756480'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ScatterplotBackendTableRequest20270101OneOf4461756480'",
            e);
      }

      ScatterplotBackendTableRequest ret = new ScatterplotBackendTableRequest();
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
    public ScatterplotBackendTableRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ScatterplotBackendTableRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ScatterplotBackendTableRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public ScatterplotBackendTableRequest(ScatterplotBackendTableRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScatterplotBackendTableRequest(ScatterplotBackendTableRequest20270101OneOf4461521920 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScatterplotBackendTableRequest(ScatterplotBackendTableRequest20270101OneOf4461523200 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScatterplotBackendTableRequest(ScatterplotBackendTableRequest20270101OneOf4461524480 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScatterplotBackendTableRequest(ScatterplotBackendTableRequest20270101OneOf4461525600 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScatterplotBackendTableRequest(ScatterplotBackendTableRequest20270101OneOf4461756480 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ScatterplotBackendTableRequest20270101OneOf",
        new GenericType<ScatterplotBackendTableRequest20270101OneOf>() {});
    schemas.put(
        "ScatterplotBackendTableRequest20270101OneOf4461521920",
        new GenericType<ScatterplotBackendTableRequest20270101OneOf4461521920>() {});
    schemas.put(
        "ScatterplotBackendTableRequest20270101OneOf4461523200",
        new GenericType<ScatterplotBackendTableRequest20270101OneOf4461523200>() {});
    schemas.put(
        "ScatterplotBackendTableRequest20270101OneOf4461524480",
        new GenericType<ScatterplotBackendTableRequest20270101OneOf4461524480>() {});
    schemas.put(
        "ScatterplotBackendTableRequest20270101OneOf4461525600",
        new GenericType<ScatterplotBackendTableRequest20270101OneOf4461525600>() {});
    schemas.put(
        "ScatterplotBackendTableRequest20270101OneOf4461756480",
        new GenericType<ScatterplotBackendTableRequest20270101OneOf4461756480>() {});
    JSON.registerDescendants(
        ScatterplotBackendTableRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ScatterplotBackendTableRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ScatterplotBackendTableRequest20270101OneOf,
   * ScatterplotBackendTableRequest20270101OneOf4461521920,
   * ScatterplotBackendTableRequest20270101OneOf4461523200,
   * ScatterplotBackendTableRequest20270101OneOf4461524480,
   * ScatterplotBackendTableRequest20270101OneOf4461525600,
   * ScatterplotBackendTableRequest20270101OneOf4461756480
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ScatterplotBackendTableRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ScatterplotBackendTableRequest20270101OneOf4461521920.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ScatterplotBackendTableRequest20270101OneOf4461523200.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ScatterplotBackendTableRequest20270101OneOf4461524480.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ScatterplotBackendTableRequest20270101OneOf4461525600.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ScatterplotBackendTableRequest20270101OneOf4461756480.class,
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
        "Invalid instance type. Must be ScatterplotBackendTableRequest20270101OneOf,"
            + " ScatterplotBackendTableRequest20270101OneOf4461521920,"
            + " ScatterplotBackendTableRequest20270101OneOf4461523200,"
            + " ScatterplotBackendTableRequest20270101OneOf4461524480,"
            + " ScatterplotBackendTableRequest20270101OneOf4461525600,"
            + " ScatterplotBackendTableRequest20270101OneOf4461756480");
  }

  /**
   * Get the actual instance, which can be the following:
   * ScatterplotBackendTableRequest20270101OneOf,
   * ScatterplotBackendTableRequest20270101OneOf4461521920,
   * ScatterplotBackendTableRequest20270101OneOf4461523200,
   * ScatterplotBackendTableRequest20270101OneOf4461524480,
   * ScatterplotBackendTableRequest20270101OneOf4461525600,
   * ScatterplotBackendTableRequest20270101OneOf4461756480
   *
   * @return The actual instance (ScatterplotBackendTableRequest20270101OneOf,
   *     ScatterplotBackendTableRequest20270101OneOf4461521920,
   *     ScatterplotBackendTableRequest20270101OneOf4461523200,
   *     ScatterplotBackendTableRequest20270101OneOf4461524480,
   *     ScatterplotBackendTableRequest20270101OneOf4461525600,
   *     ScatterplotBackendTableRequest20270101OneOf4461756480)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendTableRequest20270101OneOf`. If the actual
   * instance is not `ScatterplotBackendTableRequest20270101OneOf`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ScatterplotBackendTableRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `ScatterplotBackendTableRequest20270101OneOf`
   */
  public ScatterplotBackendTableRequest20270101OneOf
      getScatterplotBackendTableRequest20270101OneOf() throws ClassCastException {
    return (ScatterplotBackendTableRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendTableRequest20270101OneOf4461521920`. If the
   * actual instance is not `ScatterplotBackendTableRequest20270101OneOf4461521920`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendTableRequest20270101OneOf4461521920`
   * @throws ClassCastException if the instance is not
   *     `ScatterplotBackendTableRequest20270101OneOf4461521920`
   */
  public ScatterplotBackendTableRequest20270101OneOf4461521920
      getScatterplotBackendTableRequest20270101OneOf4461521920() throws ClassCastException {
    return (ScatterplotBackendTableRequest20270101OneOf4461521920) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendTableRequest20270101OneOf4461523200`. If the
   * actual instance is not `ScatterplotBackendTableRequest20270101OneOf4461523200`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendTableRequest20270101OneOf4461523200`
   * @throws ClassCastException if the instance is not
   *     `ScatterplotBackendTableRequest20270101OneOf4461523200`
   */
  public ScatterplotBackendTableRequest20270101OneOf4461523200
      getScatterplotBackendTableRequest20270101OneOf4461523200() throws ClassCastException {
    return (ScatterplotBackendTableRequest20270101OneOf4461523200) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendTableRequest20270101OneOf4461524480`. If the
   * actual instance is not `ScatterplotBackendTableRequest20270101OneOf4461524480`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendTableRequest20270101OneOf4461524480`
   * @throws ClassCastException if the instance is not
   *     `ScatterplotBackendTableRequest20270101OneOf4461524480`
   */
  public ScatterplotBackendTableRequest20270101OneOf4461524480
      getScatterplotBackendTableRequest20270101OneOf4461524480() throws ClassCastException {
    return (ScatterplotBackendTableRequest20270101OneOf4461524480) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendTableRequest20270101OneOf4461525600`. If the
   * actual instance is not `ScatterplotBackendTableRequest20270101OneOf4461525600`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendTableRequest20270101OneOf4461525600`
   * @throws ClassCastException if the instance is not
   *     `ScatterplotBackendTableRequest20270101OneOf4461525600`
   */
  public ScatterplotBackendTableRequest20270101OneOf4461525600
      getScatterplotBackendTableRequest20270101OneOf4461525600() throws ClassCastException {
    return (ScatterplotBackendTableRequest20270101OneOf4461525600) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotBackendTableRequest20270101OneOf4461756480`. If the
   * actual instance is not `ScatterplotBackendTableRequest20270101OneOf4461756480`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotBackendTableRequest20270101OneOf4461756480`
   * @throws ClassCastException if the instance is not
   *     `ScatterplotBackendTableRequest20270101OneOf4461756480`
   */
  public ScatterplotBackendTableRequest20270101OneOf4461756480
      getScatterplotBackendTableRequest20270101OneOf4461756480() throws ClassCastException {
    return (ScatterplotBackendTableRequest20270101OneOf4461756480) super.getActualInstance();
  }
}
