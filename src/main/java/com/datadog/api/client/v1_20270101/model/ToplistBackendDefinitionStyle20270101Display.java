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
    using =
        ToplistBackendDefinitionStyle20270101Display
            .ToplistBackendDefinitionStyle20270101DisplayDeserializer.class)
@JsonSerialize(
    using =
        ToplistBackendDefinitionStyle20270101Display
            .ToplistBackendDefinitionStyle20270101DisplaySerializer.class)
public class ToplistBackendDefinitionStyle20270101Display extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ToplistBackendDefinitionStyle20270101Display.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ToplistBackendDefinitionStyle20270101DisplaySerializer
      extends StdSerializer<ToplistBackendDefinitionStyle20270101Display> {
    public ToplistBackendDefinitionStyle20270101DisplaySerializer(
        Class<ToplistBackendDefinitionStyle20270101Display> t) {
      super(t);
    }

    public ToplistBackendDefinitionStyle20270101DisplaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistBackendDefinitionStyle20270101Display value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ToplistBackendDefinitionStyle20270101DisplayDeserializer
      extends StdDeserializer<ToplistBackendDefinitionStyle20270101Display> {
    public ToplistBackendDefinitionStyle20270101DisplayDeserializer() {
      this(ToplistBackendDefinitionStyle20270101Display.class);
    }

    public ToplistBackendDefinitionStyle20270101DisplayDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ToplistBackendDefinitionStyle20270101Display deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ToplistBackendDefinitionStyle20270101DisplayOneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Integer.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Long.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Float.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Double.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Boolean.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Integer.class)
                        || ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Float.class)
                        || ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendDefinitionStyle20270101DisplayOneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendDefinitionStyle20270101DisplayOneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendDefinitionStyle20270101DisplayOneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendDefinitionStyle20270101DisplayOneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendDefinitionStyle20270101DisplayOneOf'",
            e);
      }

      // deserialize ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(Integer.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(Long.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(Float.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                Double.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                Boolean.class)
            || ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                            Integer.class)
                        || ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                            Float.class)
                        || ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744'",
            e);
      }

      ToplistBackendDefinitionStyle20270101Display ret =
          new ToplistBackendDefinitionStyle20270101Display();
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
    public ToplistBackendDefinitionStyle20270101Display getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ToplistBackendDefinitionStyle20270101Display cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ToplistBackendDefinitionStyle20270101Display() {
    super("oneOf", Boolean.FALSE);
  }

  public ToplistBackendDefinitionStyle20270101Display(
      ToplistBackendDefinitionStyle20270101DisplayOneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendDefinitionStyle20270101Display(
      ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ToplistBackendDefinitionStyle20270101DisplayOneOf",
        new GenericType<ToplistBackendDefinitionStyle20270101DisplayOneOf>() {});
    schemas.put(
        "ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744",
        new GenericType<ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744>() {});
    JSON.registerDescendants(
        ToplistBackendDefinitionStyle20270101Display.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ToplistBackendDefinitionStyle20270101Display.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ToplistBackendDefinitionStyle20270101DisplayOneOf,
   * ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ToplistBackendDefinitionStyle20270101DisplayOneOf.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.class,
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
        "Invalid instance type. Must be ToplistBackendDefinitionStyle20270101DisplayOneOf,"
            + " ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744");
  }

  /**
   * Get the actual instance, which can be the following:
   * ToplistBackendDefinitionStyle20270101DisplayOneOf,
   * ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744
   *
   * @return The actual instance (ToplistBackendDefinitionStyle20270101DisplayOneOf,
   *     ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendDefinitionStyle20270101DisplayOneOf`. If the actual
   * instance is not `ToplistBackendDefinitionStyle20270101DisplayOneOf`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `ToplistBackendDefinitionStyle20270101DisplayOneOf`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendDefinitionStyle20270101DisplayOneOf`
   */
  public ToplistBackendDefinitionStyle20270101DisplayOneOf
      getToplistBackendDefinitionStyle20270101DisplayOneOf() throws ClassCastException {
    return (ToplistBackendDefinitionStyle20270101DisplayOneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744`. If
   * the actual instance is not `ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744`
   */
  public ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744
      getToplistBackendDefinitionStyle20270101DisplayOneOf4453175744() throws ClassCastException {
    return (ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744) super.getActualInstance();
  }
}
