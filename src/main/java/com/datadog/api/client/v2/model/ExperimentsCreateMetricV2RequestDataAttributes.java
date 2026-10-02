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
        ExperimentsCreateMetricV2RequestDataAttributes
            .ExperimentsCreateMetricV2RequestDataAttributesDeserializer.class)
@JsonSerialize(
    using =
        ExperimentsCreateMetricV2RequestDataAttributes
            .ExperimentsCreateMetricV2RequestDataAttributesSerializer.class)
public class ExperimentsCreateMetricV2RequestDataAttributes extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ExperimentsCreateMetricV2RequestDataAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ExperimentsCreateMetricV2RequestDataAttributesSerializer
      extends StdSerializer<ExperimentsCreateMetricV2RequestDataAttributes> {
    public ExperimentsCreateMetricV2RequestDataAttributesSerializer(
        Class<ExperimentsCreateMetricV2RequestDataAttributes> t) {
      super(t);
    }

    public ExperimentsCreateMetricV2RequestDataAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsCreateMetricV2RequestDataAttributes value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ExperimentsCreateMetricV2RequestDataAttributesDeserializer
      extends StdDeserializer<ExperimentsCreateMetricV2RequestDataAttributes> {
    public ExperimentsCreateMetricV2RequestDataAttributesDeserializer() {
      this(ExperimentsCreateMetricV2RequestDataAttributes.class);
    }

    public ExperimentsCreateMetricV2RequestDataAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ExperimentsCreateMetricV2RequestDataAttributes deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ExperimentsCreateMetricNumeratorAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsCreateMetricNumeratorAttributes.class.equals(Integer.class)
            || ExperimentsCreateMetricNumeratorAttributes.class.equals(Long.class)
            || ExperimentsCreateMetricNumeratorAttributes.class.equals(Float.class)
            || ExperimentsCreateMetricNumeratorAttributes.class.equals(Double.class)
            || ExperimentsCreateMetricNumeratorAttributes.class.equals(Boolean.class)
            || ExperimentsCreateMetricNumeratorAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsCreateMetricNumeratorAttributes.class.equals(Integer.class)
                        || ExperimentsCreateMetricNumeratorAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsCreateMetricNumeratorAttributes.class.equals(Float.class)
                        || ExperimentsCreateMetricNumeratorAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsCreateMetricNumeratorAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsCreateMetricNumeratorAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ExperimentsCreateMetricNumeratorAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsCreateMetricNumeratorAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ExperimentsCreateMetricNumeratorAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ExperimentsCreateMetricNumeratorAttributes'",
            e);
      }

      // deserialize ExperimentsCreateMetricPercentileAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ExperimentsCreateMetricPercentileAttributes.class.equals(Integer.class)
            || ExperimentsCreateMetricPercentileAttributes.class.equals(Long.class)
            || ExperimentsCreateMetricPercentileAttributes.class.equals(Float.class)
            || ExperimentsCreateMetricPercentileAttributes.class.equals(Double.class)
            || ExperimentsCreateMetricPercentileAttributes.class.equals(Boolean.class)
            || ExperimentsCreateMetricPercentileAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ExperimentsCreateMetricPercentileAttributes.class.equals(Integer.class)
                        || ExperimentsCreateMetricPercentileAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ExperimentsCreateMetricPercentileAttributes.class.equals(Float.class)
                        || ExperimentsCreateMetricPercentileAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ExperimentsCreateMetricPercentileAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ExperimentsCreateMetricPercentileAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ExperimentsCreateMetricPercentileAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ExperimentsCreateMetricPercentileAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ExperimentsCreateMetricPercentileAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ExperimentsCreateMetricPercentileAttributes'",
            e);
      }

      ExperimentsCreateMetricV2RequestDataAttributes ret =
          new ExperimentsCreateMetricV2RequestDataAttributes();
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
    public ExperimentsCreateMetricV2RequestDataAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ExperimentsCreateMetricV2RequestDataAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ExperimentsCreateMetricV2RequestDataAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public ExperimentsCreateMetricV2RequestDataAttributes(
      ExperimentsCreateMetricNumeratorAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ExperimentsCreateMetricV2RequestDataAttributes(
      ExperimentsCreateMetricPercentileAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ExperimentsCreateMetricNumeratorAttributes",
        new GenericType<ExperimentsCreateMetricNumeratorAttributes>() {});
    schemas.put(
        "ExperimentsCreateMetricPercentileAttributes",
        new GenericType<ExperimentsCreateMetricPercentileAttributes>() {});
    JSON.registerDescendants(
        ExperimentsCreateMetricV2RequestDataAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ExperimentsCreateMetricV2RequestDataAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ExperimentsCreateMetricNumeratorAttributes,
   * ExperimentsCreateMetricPercentileAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ExperimentsCreateMetricNumeratorAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ExperimentsCreateMetricPercentileAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ExperimentsCreateMetricNumeratorAttributes,"
            + " ExperimentsCreateMetricPercentileAttributes");
  }

  /**
   * Get the actual instance, which can be the following:
   * ExperimentsCreateMetricNumeratorAttributes, ExperimentsCreateMetricPercentileAttributes
   *
   * @return The actual instance (ExperimentsCreateMetricNumeratorAttributes,
   *     ExperimentsCreateMetricPercentileAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsCreateMetricNumeratorAttributes`. If the actual instance
   * is not `ExperimentsCreateMetricNumeratorAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ExperimentsCreateMetricNumeratorAttributes`
   * @throws ClassCastException if the instance is not `ExperimentsCreateMetricNumeratorAttributes`
   */
  public ExperimentsCreateMetricNumeratorAttributes getExperimentsCreateMetricNumeratorAttributes()
      throws ClassCastException {
    return (ExperimentsCreateMetricNumeratorAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ExperimentsCreateMetricPercentileAttributes`. If the actual
   * instance is not `ExperimentsCreateMetricPercentileAttributes`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ExperimentsCreateMetricPercentileAttributes`
   * @throws ClassCastException if the instance is not `ExperimentsCreateMetricPercentileAttributes`
   */
  public ExperimentsCreateMetricPercentileAttributes
      getExperimentsCreateMetricPercentileAttributes() throws ClassCastException {
    return (ExperimentsCreateMetricPercentileAttributes) super.getActualInstance();
  }
}
