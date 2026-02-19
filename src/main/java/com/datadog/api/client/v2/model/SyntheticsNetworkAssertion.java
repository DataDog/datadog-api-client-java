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
@JsonDeserialize(using = SyntheticsNetworkAssertion.SyntheticsNetworkAssertionDeserializer.class)
@JsonSerialize(using = SyntheticsNetworkAssertion.SyntheticsNetworkAssertionSerializer.class)
public class SyntheticsNetworkAssertion extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SyntheticsNetworkAssertion.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SyntheticsNetworkAssertionSerializer
      extends StdSerializer<SyntheticsNetworkAssertion> {
    public SyntheticsNetworkAssertionSerializer(Class<SyntheticsNetworkAssertion> t) {
      super(t);
    }

    public SyntheticsNetworkAssertionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsNetworkAssertion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SyntheticsNetworkAssertionDeserializer
      extends StdDeserializer<SyntheticsNetworkAssertion> {
    public SyntheticsNetworkAssertionDeserializer() {
      this(SyntheticsNetworkAssertion.class);
    }

    public SyntheticsNetworkAssertionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SyntheticsNetworkAssertion deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SyntheticsNetworkAssertionLatency
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsNetworkAssertionLatency.class.equals(Integer.class)
            || SyntheticsNetworkAssertionLatency.class.equals(Long.class)
            || SyntheticsNetworkAssertionLatency.class.equals(Float.class)
            || SyntheticsNetworkAssertionLatency.class.equals(Double.class)
            || SyntheticsNetworkAssertionLatency.class.equals(Boolean.class)
            || SyntheticsNetworkAssertionLatency.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsNetworkAssertionLatency.class.equals(Integer.class)
                        || SyntheticsNetworkAssertionLatency.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsNetworkAssertionLatency.class.equals(Float.class)
                        || SyntheticsNetworkAssertionLatency.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsNetworkAssertionLatency.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsNetworkAssertionLatency.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsNetworkAssertionLatency.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsNetworkAssertionLatency) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsNetworkAssertionLatency'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'SyntheticsNetworkAssertionLatency'", e);
      }

      // deserialize SyntheticsNetworkAssertionMultiNetworkHop
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Integer.class)
            || SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Long.class)
            || SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Float.class)
            || SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Double.class)
            || SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Boolean.class)
            || SyntheticsNetworkAssertionMultiNetworkHop.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Integer.class)
                        || SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Float.class)
                        || SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsNetworkAssertionMultiNetworkHop.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsNetworkAssertionMultiNetworkHop.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SyntheticsNetworkAssertionMultiNetworkHop.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsNetworkAssertionMultiNetworkHop) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'SyntheticsNetworkAssertionMultiNetworkHop'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SyntheticsNetworkAssertionMultiNetworkHop'",
            e);
      }

      // deserialize SyntheticsNetworkAssertionPacketLossPercentage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Integer.class)
            || SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Long.class)
            || SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Float.class)
            || SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Double.class)
            || SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Boolean.class)
            || SyntheticsNetworkAssertionPacketLossPercentage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Integer.class)
                        || SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Float.class)
                        || SyntheticsNetworkAssertionPacketLossPercentage.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsNetworkAssertionPacketLossPercentage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsNetworkAssertionPacketLossPercentage.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SyntheticsNetworkAssertionPacketLossPercentage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsNetworkAssertionPacketLossPercentage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SyntheticsNetworkAssertionPacketLossPercentage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SyntheticsNetworkAssertionPacketLossPercentage'",
            e);
      }

      // deserialize SyntheticsNetworkAssertionJitter
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SyntheticsNetworkAssertionJitter.class.equals(Integer.class)
            || SyntheticsNetworkAssertionJitter.class.equals(Long.class)
            || SyntheticsNetworkAssertionJitter.class.equals(Float.class)
            || SyntheticsNetworkAssertionJitter.class.equals(Double.class)
            || SyntheticsNetworkAssertionJitter.class.equals(Boolean.class)
            || SyntheticsNetworkAssertionJitter.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SyntheticsNetworkAssertionJitter.class.equals(Integer.class)
                        || SyntheticsNetworkAssertionJitter.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SyntheticsNetworkAssertionJitter.class.equals(Float.class)
                        || SyntheticsNetworkAssertionJitter.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SyntheticsNetworkAssertionJitter.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SyntheticsNetworkAssertionJitter.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SyntheticsNetworkAssertionJitter.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SyntheticsNetworkAssertionJitter) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SyntheticsNetworkAssertionJitter'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'SyntheticsNetworkAssertionJitter'", e);
      }

      SyntheticsNetworkAssertion ret = new SyntheticsNetworkAssertion();
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
    public SyntheticsNetworkAssertion getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SyntheticsNetworkAssertion cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SyntheticsNetworkAssertion() {
    super("oneOf", Boolean.FALSE);
  }

  public SyntheticsNetworkAssertion(SyntheticsNetworkAssertionLatency o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsNetworkAssertion(SyntheticsNetworkAssertionMultiNetworkHop o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsNetworkAssertion(SyntheticsNetworkAssertionPacketLossPercentage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SyntheticsNetworkAssertion(SyntheticsNetworkAssertionJitter o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SyntheticsNetworkAssertionLatency",
        new GenericType<SyntheticsNetworkAssertionLatency>() {});
    schemas.put(
        "SyntheticsNetworkAssertionMultiNetworkHop",
        new GenericType<SyntheticsNetworkAssertionMultiNetworkHop>() {});
    schemas.put(
        "SyntheticsNetworkAssertionPacketLossPercentage",
        new GenericType<SyntheticsNetworkAssertionPacketLossPercentage>() {});
    schemas.put(
        "SyntheticsNetworkAssertionJitter", new GenericType<SyntheticsNetworkAssertionJitter>() {});
    JSON.registerDescendants(
        SyntheticsNetworkAssertion.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SyntheticsNetworkAssertion.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SyntheticsNetworkAssertionLatency,
   * SyntheticsNetworkAssertionMultiNetworkHop, SyntheticsNetworkAssertionPacketLossPercentage,
   * SyntheticsNetworkAssertionJitter
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SyntheticsNetworkAssertionLatency.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SyntheticsNetworkAssertionMultiNetworkHop.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SyntheticsNetworkAssertionPacketLossPercentage.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SyntheticsNetworkAssertionJitter.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SyntheticsNetworkAssertionLatency,"
            + " SyntheticsNetworkAssertionMultiNetworkHop,"
            + " SyntheticsNetworkAssertionPacketLossPercentage, SyntheticsNetworkAssertionJitter");
  }

  /**
   * Get the actual instance, which can be the following: SyntheticsNetworkAssertionLatency,
   * SyntheticsNetworkAssertionMultiNetworkHop, SyntheticsNetworkAssertionPacketLossPercentage,
   * SyntheticsNetworkAssertionJitter
   *
   * @return The actual instance (SyntheticsNetworkAssertionLatency,
   *     SyntheticsNetworkAssertionMultiNetworkHop, SyntheticsNetworkAssertionPacketLossPercentage,
   *     SyntheticsNetworkAssertionJitter)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsNetworkAssertionLatency`. If the actual instance is not
   * `SyntheticsNetworkAssertionLatency`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsNetworkAssertionLatency`
   * @throws ClassCastException if the instance is not `SyntheticsNetworkAssertionLatency`
   */
  public SyntheticsNetworkAssertionLatency getSyntheticsNetworkAssertionLatency()
      throws ClassCastException {
    return (SyntheticsNetworkAssertionLatency) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsNetworkAssertionMultiNetworkHop`. If the actual instance
   * is not `SyntheticsNetworkAssertionMultiNetworkHop`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsNetworkAssertionMultiNetworkHop`
   * @throws ClassCastException if the instance is not `SyntheticsNetworkAssertionMultiNetworkHop`
   */
  public SyntheticsNetworkAssertionMultiNetworkHop getSyntheticsNetworkAssertionMultiNetworkHop()
      throws ClassCastException {
    return (SyntheticsNetworkAssertionMultiNetworkHop) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsNetworkAssertionPacketLossPercentage`. If the actual
   * instance is not `SyntheticsNetworkAssertionPacketLossPercentage`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `SyntheticsNetworkAssertionPacketLossPercentage`
   * @throws ClassCastException if the instance is not
   *     `SyntheticsNetworkAssertionPacketLossPercentage`
   */
  public SyntheticsNetworkAssertionPacketLossPercentage
      getSyntheticsNetworkAssertionPacketLossPercentage() throws ClassCastException {
    return (SyntheticsNetworkAssertionPacketLossPercentage) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SyntheticsNetworkAssertionJitter`. If the actual instance is not
   * `SyntheticsNetworkAssertionJitter`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SyntheticsNetworkAssertionJitter`
   * @throws ClassCastException if the instance is not `SyntheticsNetworkAssertionJitter`
   */
  public SyntheticsNetworkAssertionJitter getSyntheticsNetworkAssertionJitter()
      throws ClassCastException {
    return (SyntheticsNetworkAssertionJitter) super.getActualInstance();
  }
}
