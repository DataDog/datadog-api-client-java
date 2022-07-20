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
@JsonDeserialize(using = IncidentFieldAttributes.IncidentFieldAttributesDeserializer.class)
@JsonSerialize(using = IncidentFieldAttributes.IncidentFieldAttributesSerializer.class)
public class IncidentFieldAttributes extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IncidentFieldAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IncidentFieldAttributesSerializer
      extends StdSerializer<IncidentFieldAttributes> {
    public IncidentFieldAttributesSerializer(Class<IncidentFieldAttributes> t) {
      super(t);
    }

    public IncidentFieldAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentFieldAttributes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IncidentFieldAttributesDeserializer
      extends StdDeserializer<IncidentFieldAttributes> {
    public IncidentFieldAttributesDeserializer() {
      this(IncidentFieldAttributes.class);
    }

    public IncidentFieldAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IncidentFieldAttributes deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize IncidentFieldAttributesSingleValue
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentFieldAttributesSingleValue.class.equals(Integer.class)
            || IncidentFieldAttributesSingleValue.class.equals(Long.class)
            || IncidentFieldAttributesSingleValue.class.equals(Float.class)
            || IncidentFieldAttributesSingleValue.class.equals(Double.class)
            || IncidentFieldAttributesSingleValue.class.equals(Boolean.class)
            || IncidentFieldAttributesSingleValue.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentFieldAttributesSingleValue.class.equals(Integer.class)
                        || IncidentFieldAttributesSingleValue.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentFieldAttributesSingleValue.class.equals(Float.class)
                        || IncidentFieldAttributesSingleValue.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentFieldAttributesSingleValue.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentFieldAttributesSingleValue.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentFieldAttributesSingleValue.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentFieldAttributesSingleValue) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentFieldAttributesSingleValue'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'IncidentFieldAttributesSingleValue'",
            e);
      }

      // deserialize IncidentFieldAttributesMultipleValue
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentFieldAttributesMultipleValue.class.equals(Integer.class)
            || IncidentFieldAttributesMultipleValue.class.equals(Long.class)
            || IncidentFieldAttributesMultipleValue.class.equals(Float.class)
            || IncidentFieldAttributesMultipleValue.class.equals(Double.class)
            || IncidentFieldAttributesMultipleValue.class.equals(Boolean.class)
            || IncidentFieldAttributesMultipleValue.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentFieldAttributesMultipleValue.class.equals(Integer.class)
                        || IncidentFieldAttributesMultipleValue.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentFieldAttributesMultipleValue.class.equals(Float.class)
                        || IncidentFieldAttributesMultipleValue.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentFieldAttributesMultipleValue.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentFieldAttributesMultipleValue.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(IncidentFieldAttributesMultipleValue.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentFieldAttributesMultipleValue) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentFieldAttributesMultipleValue'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'IncidentFieldAttributesMultipleValue'",
            e);
      }

      IncidentFieldAttributes ret = new IncidentFieldAttributes();
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
    public IncidentFieldAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "IncidentFieldAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IncidentFieldAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public IncidentFieldAttributes(IncidentFieldAttributesSingleValue o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IncidentFieldAttributes(IncidentFieldAttributesMultipleValue o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "IncidentFieldAttributesSingleValue",
        new GenericType<IncidentFieldAttributesSingleValue>() {});
    schemas.put(
        "IncidentFieldAttributesMultipleValue",
        new GenericType<IncidentFieldAttributesMultipleValue>() {});
    JSON.registerDescendants(IncidentFieldAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IncidentFieldAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: IncidentFieldAttributesSingleValue,
   * IncidentFieldAttributesMultipleValue
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        IncidentFieldAttributesSingleValue.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        IncidentFieldAttributesMultipleValue.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be IncidentFieldAttributesSingleValue,"
            + " IncidentFieldAttributesMultipleValue");
  }

  /**
   * Get the actual instance, which can be the following: IncidentFieldAttributesSingleValue,
   * IncidentFieldAttributesMultipleValue
   *
   * @return The actual instance (IncidentFieldAttributesSingleValue,
   *     IncidentFieldAttributesMultipleValue)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentFieldAttributesSingleValue`. If the actual instance is not
   * `IncidentFieldAttributesSingleValue`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentFieldAttributesSingleValue`
   * @throws ClassCastException if the instance is not `IncidentFieldAttributesSingleValue`
   */
  public IncidentFieldAttributesSingleValue getIncidentFieldAttributesSingleValue()
      throws ClassCastException {
    return (IncidentFieldAttributesSingleValue) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentFieldAttributesMultipleValue`. If the actual instance is
   * not `IncidentFieldAttributesMultipleValue`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentFieldAttributesMultipleValue`
   * @throws ClassCastException if the instance is not `IncidentFieldAttributesMultipleValue`
   */
  public IncidentFieldAttributesMultipleValue getIncidentFieldAttributesMultipleValue()
      throws ClassCastException {
    return (IncidentFieldAttributesMultipleValue) super.getActualInstance();
  }
}
