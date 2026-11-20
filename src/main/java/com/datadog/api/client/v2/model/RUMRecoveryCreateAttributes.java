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
@JsonDeserialize(using = RUMRecoveryCreateAttributes.RUMRecoveryCreateAttributesDeserializer.class)
@JsonSerialize(using = RUMRecoveryCreateAttributes.RUMRecoveryCreateAttributesSerializer.class)
public class RUMRecoveryCreateAttributes extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(RUMRecoveryCreateAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class RUMRecoveryCreateAttributesSerializer
      extends StdSerializer<RUMRecoveryCreateAttributes> {
    public RUMRecoveryCreateAttributesSerializer(Class<RUMRecoveryCreateAttributes> t) {
      super(t);
    }

    public RUMRecoveryCreateAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRecoveryCreateAttributes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class RUMRecoveryCreateAttributesDeserializer
      extends StdDeserializer<RUMRecoveryCreateAttributes> {
    public RUMRecoveryCreateAttributesDeserializer() {
      this(RUMRecoveryCreateAttributes.class);
    }

    public RUMRecoveryCreateAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public RUMRecoveryCreateAttributes deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize RUMRecoverySessionsCreateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RUMRecoverySessionsCreateAttributes.class.equals(Integer.class)
            || RUMRecoverySessionsCreateAttributes.class.equals(Long.class)
            || RUMRecoverySessionsCreateAttributes.class.equals(Float.class)
            || RUMRecoverySessionsCreateAttributes.class.equals(Double.class)
            || RUMRecoverySessionsCreateAttributes.class.equals(Boolean.class)
            || RUMRecoverySessionsCreateAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RUMRecoverySessionsCreateAttributes.class.equals(Integer.class)
                        || RUMRecoverySessionsCreateAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RUMRecoverySessionsCreateAttributes.class.equals(Float.class)
                        || RUMRecoverySessionsCreateAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RUMRecoverySessionsCreateAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RUMRecoverySessionsCreateAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RUMRecoverySessionsCreateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RUMRecoverySessionsCreateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RUMRecoverySessionsCreateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'RUMRecoverySessionsCreateAttributes'",
            e);
      }

      // deserialize RUMRecoveryBatchCreateAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RUMRecoveryBatchCreateAttributes.class.equals(Integer.class)
            || RUMRecoveryBatchCreateAttributes.class.equals(Long.class)
            || RUMRecoveryBatchCreateAttributes.class.equals(Float.class)
            || RUMRecoveryBatchCreateAttributes.class.equals(Double.class)
            || RUMRecoveryBatchCreateAttributes.class.equals(Boolean.class)
            || RUMRecoveryBatchCreateAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RUMRecoveryBatchCreateAttributes.class.equals(Integer.class)
                        || RUMRecoveryBatchCreateAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RUMRecoveryBatchCreateAttributes.class.equals(Float.class)
                        || RUMRecoveryBatchCreateAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RUMRecoveryBatchCreateAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RUMRecoveryBatchCreateAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RUMRecoveryBatchCreateAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RUMRecoveryBatchCreateAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RUMRecoveryBatchCreateAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'RUMRecoveryBatchCreateAttributes'", e);
      }

      RUMRecoveryCreateAttributes ret = new RUMRecoveryCreateAttributes();
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
    public RUMRecoveryCreateAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "RUMRecoveryCreateAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public RUMRecoveryCreateAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public RUMRecoveryCreateAttributes(RUMRecoverySessionsCreateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public RUMRecoveryCreateAttributes(RUMRecoveryBatchCreateAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "RUMRecoverySessionsCreateAttributes",
        new GenericType<RUMRecoverySessionsCreateAttributes>() {});
    schemas.put(
        "RUMRecoveryBatchCreateAttributes", new GenericType<RUMRecoveryBatchCreateAttributes>() {});
    JSON.registerDescendants(
        RUMRecoveryCreateAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return RUMRecoveryCreateAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: RUMRecoverySessionsCreateAttributes,
   * RUMRecoveryBatchCreateAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        RUMRecoverySessionsCreateAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        RUMRecoveryBatchCreateAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be RUMRecoverySessionsCreateAttributes,"
            + " RUMRecoveryBatchCreateAttributes");
  }

  /**
   * Get the actual instance, which can be the following: RUMRecoverySessionsCreateAttributes,
   * RUMRecoveryBatchCreateAttributes
   *
   * @return The actual instance (RUMRecoverySessionsCreateAttributes,
   *     RUMRecoveryBatchCreateAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `RUMRecoverySessionsCreateAttributes`. If the actual instance is not
   * `RUMRecoverySessionsCreateAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RUMRecoverySessionsCreateAttributes`
   * @throws ClassCastException if the instance is not `RUMRecoverySessionsCreateAttributes`
   */
  public RUMRecoverySessionsCreateAttributes getRUMRecoverySessionsCreateAttributes()
      throws ClassCastException {
    return (RUMRecoverySessionsCreateAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RUMRecoveryBatchCreateAttributes`. If the actual instance is not
   * `RUMRecoveryBatchCreateAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RUMRecoveryBatchCreateAttributes`
   * @throws ClassCastException if the instance is not `RUMRecoveryBatchCreateAttributes`
   */
  public RUMRecoveryBatchCreateAttributes getRUMRecoveryBatchCreateAttributes()
      throws ClassCastException {
    return (RUMRecoveryBatchCreateAttributes) super.getActualInstance();
  }
}
