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
@JsonDeserialize(using = FlatSortBy.FlatSortByDeserializer.class)
@JsonSerialize(using = FlatSortBy.FlatSortBySerializer.class)
public class FlatSortBy extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(FlatSortBy.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class FlatSortBySerializer extends StdSerializer<FlatSortBy> {
    public FlatSortBySerializer(Class<FlatSortBy> t) {
      super(t);
    }

    public FlatSortBySerializer() {
      this(null);
    }

    @Override
    public void serialize(FlatSortBy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class FlatSortByDeserializer extends StdDeserializer<FlatSortBy> {
    public FlatSortByDeserializer() {
      this(FlatSortBy.class);
    }

    public FlatSortByDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public FlatSortBy deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FlatSortBy20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FlatSortBy20270101OneOf.class.equals(Integer.class)
            || FlatSortBy20270101OneOf.class.equals(Long.class)
            || FlatSortBy20270101OneOf.class.equals(Float.class)
            || FlatSortBy20270101OneOf.class.equals(Double.class)
            || FlatSortBy20270101OneOf.class.equals(Boolean.class)
            || FlatSortBy20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FlatSortBy20270101OneOf.class.equals(Integer.class)
                        || FlatSortBy20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FlatSortBy20270101OneOf.class.equals(Float.class)
                        || FlatSortBy20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FlatSortBy20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FlatSortBy20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FlatSortBy20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FlatSortBy20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FlatSortBy20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FlatSortBy20270101OneOf'", e);
      }

      // deserialize FlatSortBy20270101OneOf4456386848
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FlatSortBy20270101OneOf4456386848.class.equals(Integer.class)
            || FlatSortBy20270101OneOf4456386848.class.equals(Long.class)
            || FlatSortBy20270101OneOf4456386848.class.equals(Float.class)
            || FlatSortBy20270101OneOf4456386848.class.equals(Double.class)
            || FlatSortBy20270101OneOf4456386848.class.equals(Boolean.class)
            || FlatSortBy20270101OneOf4456386848.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FlatSortBy20270101OneOf4456386848.class.equals(Integer.class)
                        || FlatSortBy20270101OneOf4456386848.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FlatSortBy20270101OneOf4456386848.class.equals(Float.class)
                        || FlatSortBy20270101OneOf4456386848.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FlatSortBy20270101OneOf4456386848.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FlatSortBy20270101OneOf4456386848.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FlatSortBy20270101OneOf4456386848.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FlatSortBy20270101OneOf4456386848) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FlatSortBy20270101OneOf4456386848'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'FlatSortBy20270101OneOf4456386848'", e);
      }

      FlatSortBy ret = new FlatSortBy();
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
    public FlatSortBy getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "FlatSortBy cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public FlatSortBy() {
    super("oneOf", Boolean.FALSE);
  }

  public FlatSortBy(FlatSortBy20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FlatSortBy(FlatSortBy20270101OneOf4456386848 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FlatSortBy20270101OneOf", new GenericType<FlatSortBy20270101OneOf>() {});
    schemas.put(
        "FlatSortBy20270101OneOf4456386848",
        new GenericType<FlatSortBy20270101OneOf4456386848>() {});
    JSON.registerDescendants(FlatSortBy.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return FlatSortBy.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FlatSortBy20270101OneOf, FlatSortBy20270101OneOf4456386848
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(FlatSortBy20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FlatSortBy20270101OneOf4456386848.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FlatSortBy20270101OneOf,"
            + " FlatSortBy20270101OneOf4456386848");
  }

  /**
   * Get the actual instance, which can be the following: FlatSortBy20270101OneOf,
   * FlatSortBy20270101OneOf4456386848
   *
   * @return The actual instance (FlatSortBy20270101OneOf, FlatSortBy20270101OneOf4456386848)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FlatSortBy20270101OneOf`. If the actual instance is not
   * `FlatSortBy20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FlatSortBy20270101OneOf`
   * @throws ClassCastException if the instance is not `FlatSortBy20270101OneOf`
   */
  public FlatSortBy20270101OneOf getFlatSortBy20270101OneOf() throws ClassCastException {
    return (FlatSortBy20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FlatSortBy20270101OneOf4456386848`. If the actual instance is not
   * `FlatSortBy20270101OneOf4456386848`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FlatSortBy20270101OneOf4456386848`
   * @throws ClassCastException if the instance is not `FlatSortBy20270101OneOf4456386848`
   */
  public FlatSortBy20270101OneOf4456386848 getFlatSortBy20270101OneOf4456386848()
      throws ClassCastException {
    return (FlatSortBy20270101OneOf4456386848) super.getActualInstance();
  }
}
