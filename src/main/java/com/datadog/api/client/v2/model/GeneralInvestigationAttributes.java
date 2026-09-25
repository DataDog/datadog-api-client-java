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
    using = GeneralInvestigationAttributes.GeneralInvestigationAttributesDeserializer.class)
@JsonSerialize(
    using = GeneralInvestigationAttributes.GeneralInvestigationAttributesSerializer.class)
public class GeneralInvestigationAttributes extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(GeneralInvestigationAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GeneralInvestigationAttributesSerializer
      extends StdSerializer<GeneralInvestigationAttributes> {
    public GeneralInvestigationAttributesSerializer(Class<GeneralInvestigationAttributes> t) {
      super(t);
    }

    public GeneralInvestigationAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeneralInvestigationAttributes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GeneralInvestigationAttributesDeserializer
      extends StdDeserializer<GeneralInvestigationAttributes> {
    public GeneralInvestigationAttributesDeserializer() {
      this(GeneralInvestigationAttributes.class);
    }

    public GeneralInvestigationAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GeneralInvestigationAttributes deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GeneralInvestigationAttributesWithoutTimeBounds
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Integer.class)
            || GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Long.class)
            || GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Float.class)
            || GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Double.class)
            || GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Boolean.class)
            || GeneralInvestigationAttributesWithoutTimeBounds.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Integer.class)
                        || GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Float.class)
                        || GeneralInvestigationAttributesWithoutTimeBounds.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeneralInvestigationAttributesWithoutTimeBounds.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeneralInvestigationAttributesWithoutTimeBounds.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeneralInvestigationAttributesWithoutTimeBounds.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeneralInvestigationAttributesWithoutTimeBounds) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeneralInvestigationAttributesWithoutTimeBounds'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeneralInvestigationAttributesWithoutTimeBounds'",
            e);
      }

      // deserialize GeneralInvestigationAttributesWithTimeBounds
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeneralInvestigationAttributesWithTimeBounds.class.equals(Integer.class)
            || GeneralInvestigationAttributesWithTimeBounds.class.equals(Long.class)
            || GeneralInvestigationAttributesWithTimeBounds.class.equals(Float.class)
            || GeneralInvestigationAttributesWithTimeBounds.class.equals(Double.class)
            || GeneralInvestigationAttributesWithTimeBounds.class.equals(Boolean.class)
            || GeneralInvestigationAttributesWithTimeBounds.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeneralInvestigationAttributesWithTimeBounds.class.equals(Integer.class)
                        || GeneralInvestigationAttributesWithTimeBounds.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeneralInvestigationAttributesWithTimeBounds.class.equals(Float.class)
                        || GeneralInvestigationAttributesWithTimeBounds.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeneralInvestigationAttributesWithTimeBounds.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeneralInvestigationAttributesWithTimeBounds.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeneralInvestigationAttributesWithTimeBounds.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeneralInvestigationAttributesWithTimeBounds) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeneralInvestigationAttributesWithTimeBounds'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeneralInvestigationAttributesWithTimeBounds'",
            e);
      }

      GeneralInvestigationAttributes ret = new GeneralInvestigationAttributes();
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
    public GeneralInvestigationAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "GeneralInvestigationAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GeneralInvestigationAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public GeneralInvestigationAttributes(GeneralInvestigationAttributesWithoutTimeBounds o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeneralInvestigationAttributes(GeneralInvestigationAttributesWithTimeBounds o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "GeneralInvestigationAttributesWithoutTimeBounds",
        new GenericType<GeneralInvestigationAttributesWithoutTimeBounds>() {});
    schemas.put(
        "GeneralInvestigationAttributesWithTimeBounds",
        new GenericType<GeneralInvestigationAttributesWithTimeBounds>() {});
    JSON.registerDescendants(
        GeneralInvestigationAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GeneralInvestigationAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GeneralInvestigationAttributesWithoutTimeBounds,
   * GeneralInvestigationAttributesWithTimeBounds
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        GeneralInvestigationAttributesWithoutTimeBounds.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeneralInvestigationAttributesWithTimeBounds.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be GeneralInvestigationAttributesWithoutTimeBounds,"
            + " GeneralInvestigationAttributesWithTimeBounds");
  }

  /**
   * Get the actual instance, which can be the following:
   * GeneralInvestigationAttributesWithoutTimeBounds, GeneralInvestigationAttributesWithTimeBounds
   *
   * @return The actual instance (GeneralInvestigationAttributesWithoutTimeBounds,
   *     GeneralInvestigationAttributesWithTimeBounds)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeneralInvestigationAttributesWithoutTimeBounds`. If the actual
   * instance is not `GeneralInvestigationAttributesWithoutTimeBounds`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `GeneralInvestigationAttributesWithoutTimeBounds`
   * @throws ClassCastException if the instance is not
   *     `GeneralInvestigationAttributesWithoutTimeBounds`
   */
  public GeneralInvestigationAttributesWithoutTimeBounds
      getGeneralInvestigationAttributesWithoutTimeBounds() throws ClassCastException {
    return (GeneralInvestigationAttributesWithoutTimeBounds) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeneralInvestigationAttributesWithTimeBounds`. If the actual
   * instance is not `GeneralInvestigationAttributesWithTimeBounds`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `GeneralInvestigationAttributesWithTimeBounds`
   * @throws ClassCastException if the instance is not
   *     `GeneralInvestigationAttributesWithTimeBounds`
   */
  public GeneralInvestigationAttributesWithTimeBounds
      getGeneralInvestigationAttributesWithTimeBounds() throws ClassCastException {
    return (GeneralInvestigationAttributesWithTimeBounds) super.getActualInstance();
  }
}
