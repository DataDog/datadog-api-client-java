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
@JsonDeserialize(using = SecurityMonitoringRuleQuery.SecurityMonitoringRuleQueryDeserializer.class)
@JsonSerialize(using = SecurityMonitoringRuleQuery.SecurityMonitoringRuleQuerySerializer.class)
public class SecurityMonitoringRuleQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SecurityMonitoringRuleQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SecurityMonitoringRuleQuerySerializer
      extends StdSerializer<SecurityMonitoringRuleQuery> {
    public SecurityMonitoringRuleQuerySerializer(Class<SecurityMonitoringRuleQuery> t) {
      super(t);
    }

    public SecurityMonitoringRuleQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SecurityMonitoringRuleQueryDeserializer
      extends StdDeserializer<SecurityMonitoringRuleQuery> {
    public SecurityMonitoringRuleQueryDeserializer() {
      this(SecurityMonitoringRuleQuery.class);
    }

    public SecurityMonitoringRuleQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SecurityMonitoringRuleQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SecurityMonitoringStandardRuleQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringStandardRuleQuery.class.equals(Integer.class)
            || SecurityMonitoringStandardRuleQuery.class.equals(Long.class)
            || SecurityMonitoringStandardRuleQuery.class.equals(Float.class)
            || SecurityMonitoringStandardRuleQuery.class.equals(Double.class)
            || SecurityMonitoringStandardRuleQuery.class.equals(Boolean.class)
            || SecurityMonitoringStandardRuleQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringStandardRuleQuery.class.equals(Integer.class)
                        || SecurityMonitoringStandardRuleQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringStandardRuleQuery.class.equals(Float.class)
                        || SecurityMonitoringStandardRuleQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringStandardRuleQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringStandardRuleQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityMonitoringStandardRuleQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringStandardRuleQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SecurityMonitoringStandardRuleQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringStandardRuleQuery'",
            e);
      }

      // deserialize SecurityMonitoringSignalRuleQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringSignalRuleQuery.class.equals(Integer.class)
            || SecurityMonitoringSignalRuleQuery.class.equals(Long.class)
            || SecurityMonitoringSignalRuleQuery.class.equals(Float.class)
            || SecurityMonitoringSignalRuleQuery.class.equals(Double.class)
            || SecurityMonitoringSignalRuleQuery.class.equals(Boolean.class)
            || SecurityMonitoringSignalRuleQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringSignalRuleQuery.class.equals(Integer.class)
                        || SecurityMonitoringSignalRuleQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringSignalRuleQuery.class.equals(Float.class)
                        || SecurityMonitoringSignalRuleQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringSignalRuleQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringSignalRuleQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityMonitoringSignalRuleQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringSignalRuleQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SecurityMonitoringSignalRuleQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'SecurityMonitoringSignalRuleQuery'", e);
      }

      SecurityMonitoringRuleQuery ret = new SecurityMonitoringRuleQuery();
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
    public SecurityMonitoringRuleQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SecurityMonitoringRuleQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SecurityMonitoringRuleQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public SecurityMonitoringRuleQuery(SecurityMonitoringStandardRuleQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringRuleQuery(SecurityMonitoringSignalRuleQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SecurityMonitoringStandardRuleQuery",
        new GenericType<SecurityMonitoringStandardRuleQuery>() {});
    schemas.put(
        "SecurityMonitoringSignalRuleQuery",
        new GenericType<SecurityMonitoringSignalRuleQuery>() {});
    JSON.registerDescendants(
        SecurityMonitoringRuleQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SecurityMonitoringRuleQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SecurityMonitoringStandardRuleQuery,
   * SecurityMonitoringSignalRuleQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SecurityMonitoringStandardRuleQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringSignalRuleQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SecurityMonitoringStandardRuleQuery,"
            + " SecurityMonitoringSignalRuleQuery");
  }

  /**
   * Get the actual instance, which can be the following: SecurityMonitoringStandardRuleQuery,
   * SecurityMonitoringSignalRuleQuery
   *
   * @return The actual instance (SecurityMonitoringStandardRuleQuery,
   *     SecurityMonitoringSignalRuleQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringStandardRuleQuery`. If the actual instance is not
   * `SecurityMonitoringStandardRuleQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringStandardRuleQuery`
   * @throws ClassCastException if the instance is not `SecurityMonitoringStandardRuleQuery`
   */
  public SecurityMonitoringStandardRuleQuery getSecurityMonitoringStandardRuleQuery()
      throws ClassCastException {
    return (SecurityMonitoringStandardRuleQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringSignalRuleQuery`. If the actual instance is not
   * `SecurityMonitoringSignalRuleQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringSignalRuleQuery`
   * @throws ClassCastException if the instance is not `SecurityMonitoringSignalRuleQuery`
   */
  public SecurityMonitoringSignalRuleQuery getSecurityMonitoringSignalRuleQuery()
      throws ClassCastException {
    return (SecurityMonitoringSignalRuleQuery) super.getActualInstance();
  }
}
