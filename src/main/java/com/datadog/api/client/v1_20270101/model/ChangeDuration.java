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
@JsonDeserialize(using = ChangeDuration.ChangeDurationDeserializer.class)
@JsonSerialize(using = ChangeDuration.ChangeDurationSerializer.class)
public class ChangeDuration extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ChangeDuration.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ChangeDurationSerializer extends StdSerializer<ChangeDuration> {
    public ChangeDurationSerializer(Class<ChangeDuration> t) {
      super(t);
    }

    public ChangeDurationSerializer() {
      this(null);
    }

    @Override
    public void serialize(ChangeDuration value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ChangeDurationDeserializer extends StdDeserializer<ChangeDuration> {
    public ChangeDurationDeserializer() {
      this(ChangeDuration.class);
    }

    public ChangeDurationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ChangeDuration deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ChangeDuration20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeDuration20270101OneOf.class.equals(Integer.class)
            || ChangeDuration20270101OneOf.class.equals(Long.class)
            || ChangeDuration20270101OneOf.class.equals(Float.class)
            || ChangeDuration20270101OneOf.class.equals(Double.class)
            || ChangeDuration20270101OneOf.class.equals(Boolean.class)
            || ChangeDuration20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeDuration20270101OneOf.class.equals(Integer.class)
                        || ChangeDuration20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeDuration20270101OneOf.class.equals(Float.class)
                        || ChangeDuration20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeDuration20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeDuration20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeDuration20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeDuration20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeDuration20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ChangeDuration20270101OneOf'", e);
      }

      // deserialize ChangeDuration20270101OneOf4454627136
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeDuration20270101OneOf4454627136.class.equals(Integer.class)
            || ChangeDuration20270101OneOf4454627136.class.equals(Long.class)
            || ChangeDuration20270101OneOf4454627136.class.equals(Float.class)
            || ChangeDuration20270101OneOf4454627136.class.equals(Double.class)
            || ChangeDuration20270101OneOf4454627136.class.equals(Boolean.class)
            || ChangeDuration20270101OneOf4454627136.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeDuration20270101OneOf4454627136.class.equals(Integer.class)
                        || ChangeDuration20270101OneOf4454627136.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeDuration20270101OneOf4454627136.class.equals(Float.class)
                        || ChangeDuration20270101OneOf4454627136.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeDuration20270101OneOf4454627136.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeDuration20270101OneOf4454627136.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ChangeDuration20270101OneOf4454627136.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeDuration20270101OneOf4454627136) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeDuration20270101OneOf4454627136'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ChangeDuration20270101OneOf4454627136'",
            e);
      }

      ChangeDuration ret = new ChangeDuration();
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
    public ChangeDuration getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ChangeDuration cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ChangeDuration() {
    super("oneOf", Boolean.FALSE);
  }

  public ChangeDuration(ChangeDuration20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ChangeDuration(ChangeDuration20270101OneOf4454627136 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ChangeDuration20270101OneOf", new GenericType<ChangeDuration20270101OneOf>() {});
    schemas.put(
        "ChangeDuration20270101OneOf4454627136",
        new GenericType<ChangeDuration20270101OneOf4454627136>() {});
    JSON.registerDescendants(ChangeDuration.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ChangeDuration.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ChangeDuration20270101OneOf,
   * ChangeDuration20270101OneOf4454627136
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ChangeDuration20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ChangeDuration20270101OneOf4454627136.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ChangeDuration20270101OneOf,"
            + " ChangeDuration20270101OneOf4454627136");
  }

  /**
   * Get the actual instance, which can be the following: ChangeDuration20270101OneOf,
   * ChangeDuration20270101OneOf4454627136
   *
   * @return The actual instance (ChangeDuration20270101OneOf,
   *     ChangeDuration20270101OneOf4454627136)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeDuration20270101OneOf`. If the actual instance is not
   * `ChangeDuration20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeDuration20270101OneOf`
   * @throws ClassCastException if the instance is not `ChangeDuration20270101OneOf`
   */
  public ChangeDuration20270101OneOf getChangeDuration20270101OneOf() throws ClassCastException {
    return (ChangeDuration20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeDuration20270101OneOf4454627136`. If the actual instance is
   * not `ChangeDuration20270101OneOf4454627136`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeDuration20270101OneOf4454627136`
   * @throws ClassCastException if the instance is not `ChangeDuration20270101OneOf4454627136`
   */
  public ChangeDuration20270101OneOf4454627136 getChangeDuration20270101OneOf4454627136()
      throws ClassCastException {
    return (ChangeDuration20270101OneOf4454627136) super.getActualInstance();
  }
}
