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
        SensitiveDataScannerTargetRuleAttributes
            .SensitiveDataScannerTargetRuleAttributesDeserializer.class)
@JsonSerialize(
    using =
        SensitiveDataScannerTargetRuleAttributes.SensitiveDataScannerTargetRuleAttributesSerializer
            .class)
public class SensitiveDataScannerTargetRuleAttributes extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(SensitiveDataScannerTargetRuleAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SensitiveDataScannerTargetRuleAttributesSerializer
      extends StdSerializer<SensitiveDataScannerTargetRuleAttributes> {
    public SensitiveDataScannerTargetRuleAttributesSerializer(
        Class<SensitiveDataScannerTargetRuleAttributes> t) {
      super(t);
    }

    public SensitiveDataScannerTargetRuleAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerTargetRuleAttributes value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SensitiveDataScannerTargetRuleAttributesDeserializer
      extends StdDeserializer<SensitiveDataScannerTargetRuleAttributes> {
    public SensitiveDataScannerTargetRuleAttributesDeserializer() {
      this(SensitiveDataScannerTargetRuleAttributes.class);
    }

    public SensitiveDataScannerTargetRuleAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SensitiveDataScannerTargetRuleAttributes deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SensitiveDataScannerCustomRegexRuleAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Integer.class)
            || SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Long.class)
            || SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Float.class)
            || SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Double.class)
            || SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Boolean.class)
            || SensitiveDataScannerCustomRegexRuleAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Integer.class)
                        || SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Float.class)
                        || SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SensitiveDataScannerCustomRegexRuleAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SensitiveDataScannerCustomRegexRuleAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SensitiveDataScannerCustomRegexRuleAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SensitiveDataScannerCustomRegexRuleAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SensitiveDataScannerCustomRegexRuleAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SensitiveDataScannerCustomRegexRuleAttributes'",
            e);
      }

      // deserialize SensitiveDataScannerStandardRegexRuleAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Integer.class)
            || SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Long.class)
            || SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Float.class)
            || SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Double.class)
            || SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Boolean.class)
            || SensitiveDataScannerStandardRegexRuleAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Integer.class)
                        || SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Float.class)
                        || SensitiveDataScannerStandardRegexRuleAttributes.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SensitiveDataScannerStandardRegexRuleAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SensitiveDataScannerStandardRegexRuleAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SensitiveDataScannerStandardRegexRuleAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SensitiveDataScannerStandardRegexRuleAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SensitiveDataScannerStandardRegexRuleAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SensitiveDataScannerStandardRegexRuleAttributes'",
            e);
      }

      // deserialize SensitiveDataScannerMachineLearningRuleAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Integer.class)
            || SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Long.class)
            || SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Float.class)
            || SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Double.class)
            || SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Boolean.class)
            || SensitiveDataScannerMachineLearningRuleAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Integer.class)
                        || SensitiveDataScannerMachineLearningRuleAttributes.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Float.class)
                        || SensitiveDataScannerMachineLearningRuleAttributes.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SensitiveDataScannerMachineLearningRuleAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SensitiveDataScannerMachineLearningRuleAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SensitiveDataScannerMachineLearningRuleAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SensitiveDataScannerMachineLearningRuleAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'SensitiveDataScannerMachineLearningRuleAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SensitiveDataScannerMachineLearningRuleAttributes'",
            e);
      }

      SensitiveDataScannerTargetRuleAttributes ret = new SensitiveDataScannerTargetRuleAttributes();
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
    public SensitiveDataScannerTargetRuleAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "SensitiveDataScannerTargetRuleAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SensitiveDataScannerTargetRuleAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public SensitiveDataScannerTargetRuleAttributes(SensitiveDataScannerCustomRegexRuleAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SensitiveDataScannerTargetRuleAttributes(
      SensitiveDataScannerStandardRegexRuleAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SensitiveDataScannerTargetRuleAttributes(
      SensitiveDataScannerMachineLearningRuleAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SensitiveDataScannerCustomRegexRuleAttributes",
        new GenericType<SensitiveDataScannerCustomRegexRuleAttributes>() {});
    schemas.put(
        "SensitiveDataScannerStandardRegexRuleAttributes",
        new GenericType<SensitiveDataScannerStandardRegexRuleAttributes>() {});
    schemas.put(
        "SensitiveDataScannerMachineLearningRuleAttributes",
        new GenericType<SensitiveDataScannerMachineLearningRuleAttributes>() {});
    JSON.registerDescendants(
        SensitiveDataScannerTargetRuleAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SensitiveDataScannerTargetRuleAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SensitiveDataScannerCustomRegexRuleAttributes,
   * SensitiveDataScannerStandardRegexRuleAttributes,
   * SensitiveDataScannerMachineLearningRuleAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SensitiveDataScannerCustomRegexRuleAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SensitiveDataScannerStandardRegexRuleAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SensitiveDataScannerMachineLearningRuleAttributes.class,
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
        "Invalid instance type. Must be SensitiveDataScannerCustomRegexRuleAttributes,"
            + " SensitiveDataScannerStandardRegexRuleAttributes,"
            + " SensitiveDataScannerMachineLearningRuleAttributes");
  }

  /**
   * Get the actual instance, which can be the following:
   * SensitiveDataScannerCustomRegexRuleAttributes, SensitiveDataScannerStandardRegexRuleAttributes,
   * SensitiveDataScannerMachineLearningRuleAttributes
   *
   * @return The actual instance (SensitiveDataScannerCustomRegexRuleAttributes,
   *     SensitiveDataScannerStandardRegexRuleAttributes,
   *     SensitiveDataScannerMachineLearningRuleAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SensitiveDataScannerCustomRegexRuleAttributes`. If the actual
   * instance is not `SensitiveDataScannerCustomRegexRuleAttributes`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `SensitiveDataScannerCustomRegexRuleAttributes`
   * @throws ClassCastException if the instance is not
   *     `SensitiveDataScannerCustomRegexRuleAttributes`
   */
  public SensitiveDataScannerCustomRegexRuleAttributes
      getSensitiveDataScannerCustomRegexRuleAttributes() throws ClassCastException {
    return (SensitiveDataScannerCustomRegexRuleAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SensitiveDataScannerStandardRegexRuleAttributes`. If the actual
   * instance is not `SensitiveDataScannerStandardRegexRuleAttributes`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `SensitiveDataScannerStandardRegexRuleAttributes`
   * @throws ClassCastException if the instance is not
   *     `SensitiveDataScannerStandardRegexRuleAttributes`
   */
  public SensitiveDataScannerStandardRegexRuleAttributes
      getSensitiveDataScannerStandardRegexRuleAttributes() throws ClassCastException {
    return (SensitiveDataScannerStandardRegexRuleAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SensitiveDataScannerMachineLearningRuleAttributes`. If the actual
   * instance is not `SensitiveDataScannerMachineLearningRuleAttributes`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `SensitiveDataScannerMachineLearningRuleAttributes`
   * @throws ClassCastException if the instance is not
   *     `SensitiveDataScannerMachineLearningRuleAttributes`
   */
  public SensitiveDataScannerMachineLearningRuleAttributes
      getSensitiveDataScannerMachineLearningRuleAttributes() throws ClassCastException {
    return (SensitiveDataScannerMachineLearningRuleAttributes) super.getActualInstance();
  }
}
