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
    using = DeploymentRulesOptionsResponse.DeploymentRulesOptionsResponseDeserializer.class)
@JsonSerialize(
    using = DeploymentRulesOptionsResponse.DeploymentRulesOptionsResponseSerializer.class)
public class DeploymentRulesOptionsResponse extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DeploymentRulesOptionsResponse.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DeploymentRulesOptionsResponseSerializer
      extends StdSerializer<DeploymentRulesOptionsResponse> {
    public DeploymentRulesOptionsResponseSerializer(Class<DeploymentRulesOptionsResponse> t) {
      super(t);
    }

    public DeploymentRulesOptionsResponseSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeploymentRulesOptionsResponse value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DeploymentRulesOptionsResponseDeserializer
      extends StdDeserializer<DeploymentRulesOptionsResponse> {
    public DeploymentRulesOptionsResponseDeserializer() {
      this(DeploymentRulesOptionsResponse.class);
    }

    public DeploymentRulesOptionsResponseDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DeploymentRulesOptionsResponse deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DeploymentRuleOptionsFaultyDeploymentDetectionResponse
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Integer.class)
            || DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Long.class)
            || DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Float.class)
            || DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Double.class)
            || DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Boolean.class)
            || DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Integer.class)
                        || DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Float.class)
                        || DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DeploymentRuleOptionsFaultyDeploymentDetectionResponse) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DeploymentRuleOptionsFaultyDeploymentDetectionResponse'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'DeploymentRuleOptionsFaultyDeploymentDetectionResponse'",
            e);
      }

      // deserialize DeploymentRuleOptionsMonitor
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DeploymentRuleOptionsMonitor.class.equals(Integer.class)
            || DeploymentRuleOptionsMonitor.class.equals(Long.class)
            || DeploymentRuleOptionsMonitor.class.equals(Float.class)
            || DeploymentRuleOptionsMonitor.class.equals(Double.class)
            || DeploymentRuleOptionsMonitor.class.equals(Boolean.class)
            || DeploymentRuleOptionsMonitor.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DeploymentRuleOptionsMonitor.class.equals(Integer.class)
                        || DeploymentRuleOptionsMonitor.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DeploymentRuleOptionsMonitor.class.equals(Float.class)
                        || DeploymentRuleOptionsMonitor.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DeploymentRuleOptionsMonitor.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DeploymentRuleOptionsMonitor.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DeploymentRuleOptionsMonitor.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DeploymentRuleOptionsMonitor) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DeploymentRuleOptionsMonitor'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DeploymentRuleOptionsMonitor'", e);
      }

      DeploymentRulesOptionsResponse ret = new DeploymentRulesOptionsResponse();
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
    public DeploymentRulesOptionsResponse getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DeploymentRulesOptionsResponse cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DeploymentRulesOptionsResponse() {
    super("oneOf", Boolean.FALSE);
  }

  public DeploymentRulesOptionsResponse(DeploymentRuleOptionsFaultyDeploymentDetectionResponse o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DeploymentRulesOptionsResponse(DeploymentRuleOptionsMonitor o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DeploymentRuleOptionsFaultyDeploymentDetectionResponse",
        new GenericType<DeploymentRuleOptionsFaultyDeploymentDetectionResponse>() {});
    schemas.put("DeploymentRuleOptionsMonitor", new GenericType<DeploymentRuleOptionsMonitor>() {});
    JSON.registerDescendants(
        DeploymentRulesOptionsResponse.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DeploymentRulesOptionsResponse.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DeploymentRuleOptionsFaultyDeploymentDetectionResponse,
   * DeploymentRuleOptionsMonitor
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DeploymentRuleOptionsFaultyDeploymentDetectionResponse.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DeploymentRuleOptionsMonitor.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DeploymentRuleOptionsFaultyDeploymentDetectionResponse,"
            + " DeploymentRuleOptionsMonitor");
  }

  /**
   * Get the actual instance, which can be the following:
   * DeploymentRuleOptionsFaultyDeploymentDetectionResponse, DeploymentRuleOptionsMonitor
   *
   * @return The actual instance (DeploymentRuleOptionsFaultyDeploymentDetectionResponse,
   *     DeploymentRuleOptionsMonitor)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DeploymentRuleOptionsFaultyDeploymentDetectionResponse`. If the
   * actual instance is not `DeploymentRuleOptionsFaultyDeploymentDetectionResponse`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `DeploymentRuleOptionsFaultyDeploymentDetectionResponse`
   * @throws ClassCastException if the instance is not
   *     `DeploymentRuleOptionsFaultyDeploymentDetectionResponse`
   */
  public DeploymentRuleOptionsFaultyDeploymentDetectionResponse
      getDeploymentRuleOptionsFaultyDeploymentDetectionResponse() throws ClassCastException {
    return (DeploymentRuleOptionsFaultyDeploymentDetectionResponse) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DeploymentRuleOptionsMonitor`. If the actual instance is not
   * `DeploymentRuleOptionsMonitor`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DeploymentRuleOptionsMonitor`
   * @throws ClassCastException if the instance is not `DeploymentRuleOptionsMonitor`
   */
  public DeploymentRuleOptionsMonitor getDeploymentRuleOptionsMonitor() throws ClassCastException {
    return (DeploymentRuleOptionsMonitor) super.getActualInstance();
  }
}
