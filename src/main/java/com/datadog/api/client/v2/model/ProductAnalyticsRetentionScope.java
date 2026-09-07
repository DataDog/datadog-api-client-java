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
    using = ProductAnalyticsRetentionScope.ProductAnalyticsRetentionScopeDeserializer.class)
@JsonSerialize(
    using = ProductAnalyticsRetentionScope.ProductAnalyticsRetentionScopeSerializer.class)
public class ProductAnalyticsRetentionScope extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ProductAnalyticsRetentionScope.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ProductAnalyticsRetentionScopeSerializer
      extends StdSerializer<ProductAnalyticsRetentionScope> {
    public ProductAnalyticsRetentionScopeSerializer(Class<ProductAnalyticsRetentionScope> t) {
      super(t);
    }

    public ProductAnalyticsRetentionScopeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ProductAnalyticsRetentionScope value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ProductAnalyticsRetentionScopeDeserializer
      extends StdDeserializer<ProductAnalyticsRetentionScope> {
    public ProductAnalyticsRetentionScopeDeserializer() {
      this(ProductAnalyticsRetentionScope.class);
    }

    public ProductAnalyticsRetentionScopeDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ProductAnalyticsRetentionScope deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ProductAnalyticsRetentionCohortScope
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ProductAnalyticsRetentionCohortScope.class.equals(Integer.class)
            || ProductAnalyticsRetentionCohortScope.class.equals(Long.class)
            || ProductAnalyticsRetentionCohortScope.class.equals(Float.class)
            || ProductAnalyticsRetentionCohortScope.class.equals(Double.class)
            || ProductAnalyticsRetentionCohortScope.class.equals(Boolean.class)
            || ProductAnalyticsRetentionCohortScope.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ProductAnalyticsRetentionCohortScope.class.equals(Integer.class)
                        || ProductAnalyticsRetentionCohortScope.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ProductAnalyticsRetentionCohortScope.class.equals(Float.class)
                        || ProductAnalyticsRetentionCohortScope.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ProductAnalyticsRetentionCohortScope.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ProductAnalyticsRetentionCohortScope.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ProductAnalyticsRetentionCohortScope.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ProductAnalyticsRetentionCohortScope) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ProductAnalyticsRetentionCohortScope'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ProductAnalyticsRetentionCohortScope'",
            e);
      }

      // deserialize ProductAnalyticsRetentionReturnPeriodScope
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ProductAnalyticsRetentionReturnPeriodScope.class.equals(Integer.class)
            || ProductAnalyticsRetentionReturnPeriodScope.class.equals(Long.class)
            || ProductAnalyticsRetentionReturnPeriodScope.class.equals(Float.class)
            || ProductAnalyticsRetentionReturnPeriodScope.class.equals(Double.class)
            || ProductAnalyticsRetentionReturnPeriodScope.class.equals(Boolean.class)
            || ProductAnalyticsRetentionReturnPeriodScope.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ProductAnalyticsRetentionReturnPeriodScope.class.equals(Integer.class)
                        || ProductAnalyticsRetentionReturnPeriodScope.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ProductAnalyticsRetentionReturnPeriodScope.class.equals(Float.class)
                        || ProductAnalyticsRetentionReturnPeriodScope.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ProductAnalyticsRetentionReturnPeriodScope.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ProductAnalyticsRetentionReturnPeriodScope.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ProductAnalyticsRetentionReturnPeriodScope.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ProductAnalyticsRetentionReturnPeriodScope) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ProductAnalyticsRetentionReturnPeriodScope'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ProductAnalyticsRetentionReturnPeriodScope'",
            e);
      }

      // deserialize ProductAnalyticsRetentionCellScope
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ProductAnalyticsRetentionCellScope.class.equals(Integer.class)
            || ProductAnalyticsRetentionCellScope.class.equals(Long.class)
            || ProductAnalyticsRetentionCellScope.class.equals(Float.class)
            || ProductAnalyticsRetentionCellScope.class.equals(Double.class)
            || ProductAnalyticsRetentionCellScope.class.equals(Boolean.class)
            || ProductAnalyticsRetentionCellScope.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ProductAnalyticsRetentionCellScope.class.equals(Integer.class)
                        || ProductAnalyticsRetentionCellScope.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ProductAnalyticsRetentionCellScope.class.equals(Float.class)
                        || ProductAnalyticsRetentionCellScope.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ProductAnalyticsRetentionCellScope.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ProductAnalyticsRetentionCellScope.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ProductAnalyticsRetentionCellScope.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ProductAnalyticsRetentionCellScope) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ProductAnalyticsRetentionCellScope'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ProductAnalyticsRetentionCellScope'",
            e);
      }

      ProductAnalyticsRetentionScope ret = new ProductAnalyticsRetentionScope();
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
    public ProductAnalyticsRetentionScope getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ProductAnalyticsRetentionScope cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ProductAnalyticsRetentionScope() {
    super("oneOf", Boolean.FALSE);
  }

  public ProductAnalyticsRetentionScope(ProductAnalyticsRetentionCohortScope o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ProductAnalyticsRetentionScope(ProductAnalyticsRetentionReturnPeriodScope o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ProductAnalyticsRetentionScope(ProductAnalyticsRetentionCellScope o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ProductAnalyticsRetentionCohortScope",
        new GenericType<ProductAnalyticsRetentionCohortScope>() {});
    schemas.put(
        "ProductAnalyticsRetentionReturnPeriodScope",
        new GenericType<ProductAnalyticsRetentionReturnPeriodScope>() {});
    schemas.put(
        "ProductAnalyticsRetentionCellScope",
        new GenericType<ProductAnalyticsRetentionCellScope>() {});
    JSON.registerDescendants(
        ProductAnalyticsRetentionScope.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ProductAnalyticsRetentionScope.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ProductAnalyticsRetentionCohortScope,
   * ProductAnalyticsRetentionReturnPeriodScope, ProductAnalyticsRetentionCellScope
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ProductAnalyticsRetentionCohortScope.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ProductAnalyticsRetentionReturnPeriodScope.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ProductAnalyticsRetentionCellScope.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ProductAnalyticsRetentionCohortScope,"
            + " ProductAnalyticsRetentionReturnPeriodScope, ProductAnalyticsRetentionCellScope");
  }

  /**
   * Get the actual instance, which can be the following: ProductAnalyticsRetentionCohortScope,
   * ProductAnalyticsRetentionReturnPeriodScope, ProductAnalyticsRetentionCellScope
   *
   * @return The actual instance (ProductAnalyticsRetentionCohortScope,
   *     ProductAnalyticsRetentionReturnPeriodScope, ProductAnalyticsRetentionCellScope)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ProductAnalyticsRetentionCohortScope`. If the actual instance is
   * not `ProductAnalyticsRetentionCohortScope`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ProductAnalyticsRetentionCohortScope`
   * @throws ClassCastException if the instance is not `ProductAnalyticsRetentionCohortScope`
   */
  public ProductAnalyticsRetentionCohortScope getProductAnalyticsRetentionCohortScope()
      throws ClassCastException {
    return (ProductAnalyticsRetentionCohortScope) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ProductAnalyticsRetentionReturnPeriodScope`. If the actual instance
   * is not `ProductAnalyticsRetentionReturnPeriodScope`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ProductAnalyticsRetentionReturnPeriodScope`
   * @throws ClassCastException if the instance is not `ProductAnalyticsRetentionReturnPeriodScope`
   */
  public ProductAnalyticsRetentionReturnPeriodScope getProductAnalyticsRetentionReturnPeriodScope()
      throws ClassCastException {
    return (ProductAnalyticsRetentionReturnPeriodScope) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ProductAnalyticsRetentionCellScope`. If the actual instance is not
   * `ProductAnalyticsRetentionCellScope`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ProductAnalyticsRetentionCellScope`
   * @throws ClassCastException if the instance is not `ProductAnalyticsRetentionCellScope`
   */
  public ProductAnalyticsRetentionCellScope getProductAnalyticsRetentionCellScope()
      throws ClassCastException {
    return (ProductAnalyticsRetentionCellScope) super.getActualInstance();
  }
}
