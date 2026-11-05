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
    using = AiGatewayModelPricingRequestConfig.AiGatewayModelPricingRequestConfigDeserializer.class)
@JsonSerialize(
    using = AiGatewayModelPricingRequestConfig.AiGatewayModelPricingRequestConfigSerializer.class)
public class AiGatewayModelPricingRequestConfig extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(AiGatewayModelPricingRequestConfig.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AiGatewayModelPricingRequestConfigSerializer
      extends StdSerializer<AiGatewayModelPricingRequestConfig> {
    public AiGatewayModelPricingRequestConfigSerializer(
        Class<AiGatewayModelPricingRequestConfig> t) {
      super(t);
    }

    public AiGatewayModelPricingRequestConfigSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelPricingRequestConfig value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AiGatewayModelPricingRequestConfigDeserializer
      extends StdDeserializer<AiGatewayModelPricingRequestConfig> {
    public AiGatewayModelPricingRequestConfigDeserializer() {
      this(AiGatewayModelPricingRequestConfig.class);
    }

    public AiGatewayModelPricingRequestConfigDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AiGatewayModelPricingRequestConfig deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AiGatewayModelPricingCustomRequestConfig
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AiGatewayModelPricingCustomRequestConfig.class.equals(Integer.class)
            || AiGatewayModelPricingCustomRequestConfig.class.equals(Long.class)
            || AiGatewayModelPricingCustomRequestConfig.class.equals(Float.class)
            || AiGatewayModelPricingCustomRequestConfig.class.equals(Double.class)
            || AiGatewayModelPricingCustomRequestConfig.class.equals(Boolean.class)
            || AiGatewayModelPricingCustomRequestConfig.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AiGatewayModelPricingCustomRequestConfig.class.equals(Integer.class)
                        || AiGatewayModelPricingCustomRequestConfig.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AiGatewayModelPricingCustomRequestConfig.class.equals(Float.class)
                        || AiGatewayModelPricingCustomRequestConfig.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AiGatewayModelPricingCustomRequestConfig.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AiGatewayModelPricingCustomRequestConfig.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(AiGatewayModelPricingCustomRequestConfig.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AiGatewayModelPricingCustomRequestConfig) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'AiGatewayModelPricingCustomRequestConfig'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'AiGatewayModelPricingCustomRequestConfig'",
            e);
      }

      // deserialize AiGatewayModelPricingCatalogRequestConfig
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AiGatewayModelPricingCatalogRequestConfig.class.equals(Integer.class)
            || AiGatewayModelPricingCatalogRequestConfig.class.equals(Long.class)
            || AiGatewayModelPricingCatalogRequestConfig.class.equals(Float.class)
            || AiGatewayModelPricingCatalogRequestConfig.class.equals(Double.class)
            || AiGatewayModelPricingCatalogRequestConfig.class.equals(Boolean.class)
            || AiGatewayModelPricingCatalogRequestConfig.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AiGatewayModelPricingCatalogRequestConfig.class.equals(Integer.class)
                        || AiGatewayModelPricingCatalogRequestConfig.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AiGatewayModelPricingCatalogRequestConfig.class.equals(Float.class)
                        || AiGatewayModelPricingCatalogRequestConfig.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AiGatewayModelPricingCatalogRequestConfig.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AiGatewayModelPricingCatalogRequestConfig.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(AiGatewayModelPricingCatalogRequestConfig.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AiGatewayModelPricingCatalogRequestConfig) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'AiGatewayModelPricingCatalogRequestConfig'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'AiGatewayModelPricingCatalogRequestConfig'",
            e);
      }

      AiGatewayModelPricingRequestConfig ret = new AiGatewayModelPricingRequestConfig();
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
    public AiGatewayModelPricingRequestConfig getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "AiGatewayModelPricingRequestConfig cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AiGatewayModelPricingRequestConfig() {
    super("oneOf", Boolean.FALSE);
  }

  public AiGatewayModelPricingRequestConfig(AiGatewayModelPricingCustomRequestConfig o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AiGatewayModelPricingRequestConfig(AiGatewayModelPricingCatalogRequestConfig o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "AiGatewayModelPricingCustomRequestConfig",
        new GenericType<AiGatewayModelPricingCustomRequestConfig>() {});
    schemas.put(
        "AiGatewayModelPricingCatalogRequestConfig",
        new GenericType<AiGatewayModelPricingCatalogRequestConfig>() {});
    JSON.registerDescendants(
        AiGatewayModelPricingRequestConfig.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AiGatewayModelPricingRequestConfig.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AiGatewayModelPricingCustomRequestConfig,
   * AiGatewayModelPricingCatalogRequestConfig
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        AiGatewayModelPricingCustomRequestConfig.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        AiGatewayModelPricingCatalogRequestConfig.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AiGatewayModelPricingCustomRequestConfig,"
            + " AiGatewayModelPricingCatalogRequestConfig");
  }

  /**
   * Get the actual instance, which can be the following: AiGatewayModelPricingCustomRequestConfig,
   * AiGatewayModelPricingCatalogRequestConfig
   *
   * @return The actual instance (AiGatewayModelPricingCustomRequestConfig,
   *     AiGatewayModelPricingCatalogRequestConfig)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AiGatewayModelPricingCustomRequestConfig`. If the actual instance
   * is not `AiGatewayModelPricingCustomRequestConfig`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AiGatewayModelPricingCustomRequestConfig`
   * @throws ClassCastException if the instance is not `AiGatewayModelPricingCustomRequestConfig`
   */
  public AiGatewayModelPricingCustomRequestConfig getAiGatewayModelPricingCustomRequestConfig()
      throws ClassCastException {
    return (AiGatewayModelPricingCustomRequestConfig) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AiGatewayModelPricingCatalogRequestConfig`. If the actual instance
   * is not `AiGatewayModelPricingCatalogRequestConfig`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AiGatewayModelPricingCatalogRequestConfig`
   * @throws ClassCastException if the instance is not `AiGatewayModelPricingCatalogRequestConfig`
   */
  public AiGatewayModelPricingCatalogRequestConfig getAiGatewayModelPricingCatalogRequestConfig()
      throws ClassCastException {
    return (AiGatewayModelPricingCatalogRequestConfig) super.getActualInstance();
  }
}
