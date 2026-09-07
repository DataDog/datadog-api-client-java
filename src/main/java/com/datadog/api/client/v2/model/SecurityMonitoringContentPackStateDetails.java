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
    using =
        SecurityMonitoringContentPackStateDetails
            .SecurityMonitoringContentPackStateDetailsDeserializer.class)
@JsonSerialize(
    using =
        SecurityMonitoringContentPackStateDetails
            .SecurityMonitoringContentPackStateDetailsSerializer.class)
public class SecurityMonitoringContentPackStateDetails extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SecurityMonitoringContentPackStateDetails.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SecurityMonitoringContentPackStateDetailsSerializer
      extends StdSerializer<SecurityMonitoringContentPackStateDetails> {
    public SecurityMonitoringContentPackStateDetailsSerializer(
        Class<SecurityMonitoringContentPackStateDetails> t) {
      super(t);
    }

    public SecurityMonitoringContentPackStateDetailsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringContentPackStateDetails value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SecurityMonitoringContentPackStateDetailsDeserializer
      extends StdDeserializer<SecurityMonitoringContentPackStateDetails> {
    public SecurityMonitoringContentPackStateDetailsDeserializer() {
      this(SecurityMonitoringContentPackStateDetails.class);
    }

    public SecurityMonitoringContentPackStateDetailsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SecurityMonitoringContentPackStateDetails deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SecurityMonitoringContentPackLogsDetails
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringContentPackLogsDetails.class.equals(Integer.class)
            || SecurityMonitoringContentPackLogsDetails.class.equals(Long.class)
            || SecurityMonitoringContentPackLogsDetails.class.equals(Float.class)
            || SecurityMonitoringContentPackLogsDetails.class.equals(Double.class)
            || SecurityMonitoringContentPackLogsDetails.class.equals(Boolean.class)
            || SecurityMonitoringContentPackLogsDetails.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringContentPackLogsDetails.class.equals(Integer.class)
                        || SecurityMonitoringContentPackLogsDetails.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringContentPackLogsDetails.class.equals(Float.class)
                        || SecurityMonitoringContentPackLogsDetails.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringContentPackLogsDetails.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringContentPackLogsDetails.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringContentPackLogsDetails.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringContentPackLogsDetails) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'SecurityMonitoringContentPackLogsDetails'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringContentPackLogsDetails'",
            e);
      }

      // deserialize SecurityMonitoringContentPackThreatIntelDetails
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringContentPackThreatIntelDetails.class.equals(Integer.class)
            || SecurityMonitoringContentPackThreatIntelDetails.class.equals(Long.class)
            || SecurityMonitoringContentPackThreatIntelDetails.class.equals(Float.class)
            || SecurityMonitoringContentPackThreatIntelDetails.class.equals(Double.class)
            || SecurityMonitoringContentPackThreatIntelDetails.class.equals(Boolean.class)
            || SecurityMonitoringContentPackThreatIntelDetails.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringContentPackThreatIntelDetails.class.equals(Integer.class)
                        || SecurityMonitoringContentPackThreatIntelDetails.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringContentPackThreatIntelDetails.class.equals(Float.class)
                        || SecurityMonitoringContentPackThreatIntelDetails.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringContentPackThreatIntelDetails.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringContentPackThreatIntelDetails.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringContentPackThreatIntelDetails.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringContentPackThreatIntelDetails) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SecurityMonitoringContentPackThreatIntelDetails'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringContentPackThreatIntelDetails'",
            e);
      }

      // deserialize SecurityMonitoringContentPackEntityDetails
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringContentPackEntityDetails.class.equals(Integer.class)
            || SecurityMonitoringContentPackEntityDetails.class.equals(Long.class)
            || SecurityMonitoringContentPackEntityDetails.class.equals(Float.class)
            || SecurityMonitoringContentPackEntityDetails.class.equals(Double.class)
            || SecurityMonitoringContentPackEntityDetails.class.equals(Boolean.class)
            || SecurityMonitoringContentPackEntityDetails.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringContentPackEntityDetails.class.equals(Integer.class)
                        || SecurityMonitoringContentPackEntityDetails.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringContentPackEntityDetails.class.equals(Float.class)
                        || SecurityMonitoringContentPackEntityDetails.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringContentPackEntityDetails.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringContentPackEntityDetails.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringContentPackEntityDetails.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringContentPackEntityDetails) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SecurityMonitoringContentPackEntityDetails'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringContentPackEntityDetails'",
            e);
      }

      // deserialize SecurityMonitoringContentPackAuditDetails
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringContentPackAuditDetails.class.equals(Integer.class)
            || SecurityMonitoringContentPackAuditDetails.class.equals(Long.class)
            || SecurityMonitoringContentPackAuditDetails.class.equals(Float.class)
            || SecurityMonitoringContentPackAuditDetails.class.equals(Double.class)
            || SecurityMonitoringContentPackAuditDetails.class.equals(Boolean.class)
            || SecurityMonitoringContentPackAuditDetails.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringContentPackAuditDetails.class.equals(Integer.class)
                        || SecurityMonitoringContentPackAuditDetails.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringContentPackAuditDetails.class.equals(Float.class)
                        || SecurityMonitoringContentPackAuditDetails.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringContentPackAuditDetails.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringContentPackAuditDetails.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringContentPackAuditDetails.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringContentPackAuditDetails) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'SecurityMonitoringContentPackAuditDetails'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringContentPackAuditDetails'",
            e);
      }

      // deserialize SecurityMonitoringContentPackAppSecDetails
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringContentPackAppSecDetails.class.equals(Integer.class)
            || SecurityMonitoringContentPackAppSecDetails.class.equals(Long.class)
            || SecurityMonitoringContentPackAppSecDetails.class.equals(Float.class)
            || SecurityMonitoringContentPackAppSecDetails.class.equals(Double.class)
            || SecurityMonitoringContentPackAppSecDetails.class.equals(Boolean.class)
            || SecurityMonitoringContentPackAppSecDetails.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringContentPackAppSecDetails.class.equals(Integer.class)
                        || SecurityMonitoringContentPackAppSecDetails.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringContentPackAppSecDetails.class.equals(Float.class)
                        || SecurityMonitoringContentPackAppSecDetails.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringContentPackAppSecDetails.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringContentPackAppSecDetails.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringContentPackAppSecDetails.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringContentPackAppSecDetails) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SecurityMonitoringContentPackAppSecDetails'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringContentPackAppSecDetails'",
            e);
      }

      // deserialize SecurityMonitoringContentPackVulnerabilityDetails
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Integer.class)
            || SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Long.class)
            || SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Float.class)
            || SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Double.class)
            || SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Boolean.class)
            || SecurityMonitoringContentPackVulnerabilityDetails.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Integer.class)
                        || SecurityMonitoringContentPackVulnerabilityDetails.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Float.class)
                        || SecurityMonitoringContentPackVulnerabilityDetails.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringContentPackVulnerabilityDetails.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringContentPackVulnerabilityDetails.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringContentPackVulnerabilityDetails.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringContentPackVulnerabilityDetails) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SecurityMonitoringContentPackVulnerabilityDetails'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringContentPackVulnerabilityDetails'",
            e);
      }

      // deserialize SecurityMonitoringContentPackOnboardingDetails
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityMonitoringContentPackOnboardingDetails.class.equals(Integer.class)
            || SecurityMonitoringContentPackOnboardingDetails.class.equals(Long.class)
            || SecurityMonitoringContentPackOnboardingDetails.class.equals(Float.class)
            || SecurityMonitoringContentPackOnboardingDetails.class.equals(Double.class)
            || SecurityMonitoringContentPackOnboardingDetails.class.equals(Boolean.class)
            || SecurityMonitoringContentPackOnboardingDetails.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityMonitoringContentPackOnboardingDetails.class.equals(Integer.class)
                        || SecurityMonitoringContentPackOnboardingDetails.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityMonitoringContentPackOnboardingDetails.class.equals(Float.class)
                        || SecurityMonitoringContentPackOnboardingDetails.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityMonitoringContentPackOnboardingDetails.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityMonitoringContentPackOnboardingDetails.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SecurityMonitoringContentPackOnboardingDetails.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityMonitoringContentPackOnboardingDetails) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SecurityMonitoringContentPackOnboardingDetails'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityMonitoringContentPackOnboardingDetails'",
            e);
      }

      SecurityMonitoringContentPackStateDetails ret =
          new SecurityMonitoringContentPackStateDetails();
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
    public SecurityMonitoringContentPackStateDetails getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SecurityMonitoringContentPackStateDetails cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SecurityMonitoringContentPackStateDetails() {
    super("oneOf", Boolean.FALSE);
  }

  public SecurityMonitoringContentPackStateDetails(SecurityMonitoringContentPackLogsDetails o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringContentPackStateDetails(
      SecurityMonitoringContentPackThreatIntelDetails o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringContentPackStateDetails(SecurityMonitoringContentPackEntityDetails o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringContentPackStateDetails(SecurityMonitoringContentPackAuditDetails o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringContentPackStateDetails(SecurityMonitoringContentPackAppSecDetails o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringContentPackStateDetails(
      SecurityMonitoringContentPackVulnerabilityDetails o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SecurityMonitoringContentPackStateDetails(
      SecurityMonitoringContentPackOnboardingDetails o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SecurityMonitoringContentPackLogsDetails",
        new GenericType<SecurityMonitoringContentPackLogsDetails>() {});
    schemas.put(
        "SecurityMonitoringContentPackThreatIntelDetails",
        new GenericType<SecurityMonitoringContentPackThreatIntelDetails>() {});
    schemas.put(
        "SecurityMonitoringContentPackEntityDetails",
        new GenericType<SecurityMonitoringContentPackEntityDetails>() {});
    schemas.put(
        "SecurityMonitoringContentPackAuditDetails",
        new GenericType<SecurityMonitoringContentPackAuditDetails>() {});
    schemas.put(
        "SecurityMonitoringContentPackAppSecDetails",
        new GenericType<SecurityMonitoringContentPackAppSecDetails>() {});
    schemas.put(
        "SecurityMonitoringContentPackVulnerabilityDetails",
        new GenericType<SecurityMonitoringContentPackVulnerabilityDetails>() {});
    schemas.put(
        "SecurityMonitoringContentPackOnboardingDetails",
        new GenericType<SecurityMonitoringContentPackOnboardingDetails>() {});
    JSON.registerDescendants(
        SecurityMonitoringContentPackStateDetails.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SecurityMonitoringContentPackStateDetails.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SecurityMonitoringContentPackLogsDetails,
   * SecurityMonitoringContentPackThreatIntelDetails, SecurityMonitoringContentPackEntityDetails,
   * SecurityMonitoringContentPackAuditDetails, SecurityMonitoringContentPackAppSecDetails,
   * SecurityMonitoringContentPackVulnerabilityDetails,
   * SecurityMonitoringContentPackOnboardingDetails
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SecurityMonitoringContentPackLogsDetails.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringContentPackThreatIntelDetails.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringContentPackEntityDetails.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringContentPackAuditDetails.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringContentPackAppSecDetails.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringContentPackVulnerabilityDetails.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityMonitoringContentPackOnboardingDetails.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SecurityMonitoringContentPackLogsDetails,"
            + " SecurityMonitoringContentPackThreatIntelDetails,"
            + " SecurityMonitoringContentPackEntityDetails,"
            + " SecurityMonitoringContentPackAuditDetails,"
            + " SecurityMonitoringContentPackAppSecDetails,"
            + " SecurityMonitoringContentPackVulnerabilityDetails,"
            + " SecurityMonitoringContentPackOnboardingDetails");
  }

  /**
   * Get the actual instance, which can be the following: SecurityMonitoringContentPackLogsDetails,
   * SecurityMonitoringContentPackThreatIntelDetails, SecurityMonitoringContentPackEntityDetails,
   * SecurityMonitoringContentPackAuditDetails, SecurityMonitoringContentPackAppSecDetails,
   * SecurityMonitoringContentPackVulnerabilityDetails,
   * SecurityMonitoringContentPackOnboardingDetails
   *
   * @return The actual instance (SecurityMonitoringContentPackLogsDetails,
   *     SecurityMonitoringContentPackThreatIntelDetails,
   *     SecurityMonitoringContentPackEntityDetails, SecurityMonitoringContentPackAuditDetails,
   *     SecurityMonitoringContentPackAppSecDetails,
   *     SecurityMonitoringContentPackVulnerabilityDetails,
   *     SecurityMonitoringContentPackOnboardingDetails)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringContentPackLogsDetails`. If the actual instance
   * is not `SecurityMonitoringContentPackLogsDetails`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringContentPackLogsDetails`
   * @throws ClassCastException if the instance is not `SecurityMonitoringContentPackLogsDetails`
   */
  public SecurityMonitoringContentPackLogsDetails getSecurityMonitoringContentPackLogsDetails()
      throws ClassCastException {
    return (SecurityMonitoringContentPackLogsDetails) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringContentPackThreatIntelDetails`. If the actual
   * instance is not `SecurityMonitoringContentPackThreatIntelDetails`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `SecurityMonitoringContentPackThreatIntelDetails`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringContentPackThreatIntelDetails`
   */
  public SecurityMonitoringContentPackThreatIntelDetails
      getSecurityMonitoringContentPackThreatIntelDetails() throws ClassCastException {
    return (SecurityMonitoringContentPackThreatIntelDetails) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringContentPackEntityDetails`. If the actual instance
   * is not `SecurityMonitoringContentPackEntityDetails`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringContentPackEntityDetails`
   * @throws ClassCastException if the instance is not `SecurityMonitoringContentPackEntityDetails`
   */
  public SecurityMonitoringContentPackEntityDetails getSecurityMonitoringContentPackEntityDetails()
      throws ClassCastException {
    return (SecurityMonitoringContentPackEntityDetails) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringContentPackAuditDetails`. If the actual instance
   * is not `SecurityMonitoringContentPackAuditDetails`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringContentPackAuditDetails`
   * @throws ClassCastException if the instance is not `SecurityMonitoringContentPackAuditDetails`
   */
  public SecurityMonitoringContentPackAuditDetails getSecurityMonitoringContentPackAuditDetails()
      throws ClassCastException {
    return (SecurityMonitoringContentPackAuditDetails) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringContentPackAppSecDetails`. If the actual instance
   * is not `SecurityMonitoringContentPackAppSecDetails`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringContentPackAppSecDetails`
   * @throws ClassCastException if the instance is not `SecurityMonitoringContentPackAppSecDetails`
   */
  public SecurityMonitoringContentPackAppSecDetails getSecurityMonitoringContentPackAppSecDetails()
      throws ClassCastException {
    return (SecurityMonitoringContentPackAppSecDetails) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringContentPackVulnerabilityDetails`. If the actual
   * instance is not `SecurityMonitoringContentPackVulnerabilityDetails`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `SecurityMonitoringContentPackVulnerabilityDetails`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringContentPackVulnerabilityDetails`
   */
  public SecurityMonitoringContentPackVulnerabilityDetails
      getSecurityMonitoringContentPackVulnerabilityDetails() throws ClassCastException {
    return (SecurityMonitoringContentPackVulnerabilityDetails) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityMonitoringContentPackOnboardingDetails`. If the actual
   * instance is not `SecurityMonitoringContentPackOnboardingDetails`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `SecurityMonitoringContentPackOnboardingDetails`
   * @throws ClassCastException if the instance is not
   *     `SecurityMonitoringContentPackOnboardingDetails`
   */
  public SecurityMonitoringContentPackOnboardingDetails
      getSecurityMonitoringContentPackOnboardingDetails() throws ClassCastException {
    return (SecurityMonitoringContentPackOnboardingDetails) super.getActualInstance();
  }
}
