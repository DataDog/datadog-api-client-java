/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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
@JsonDeserialize(using = ComputationScope.ComputationScopeDeserializer.class)
@JsonSerialize(using = ComputationScope.ComputationScopeSerializer.class)
public class ComputationScope extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ComputationScope.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ComputationScopeSerializer extends StdSerializer<ComputationScope> {
    public ComputationScopeSerializer(Class<ComputationScope> t) {
      super(t);
    }

    public ComputationScopeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ComputationScope value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ComputationScopeDeserializer extends StdDeserializer<ComputationScope> {
    public ComputationScopeDeserializer() {
      this(ComputationScope.class);
    }

    public ComputationScopeDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ComputationScope deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CohortScope
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CohortScope.class.equals(Integer.class)
            || CohortScope.class.equals(Long.class)
            || CohortScope.class.equals(Float.class)
            || CohortScope.class.equals(Double.class)
            || CohortScope.class.equals(Boolean.class)
            || CohortScope.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CohortScope.class.equals(Integer.class) || CohortScope.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CohortScope.class.equals(Float.class) || CohortScope.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CohortScope.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CohortScope.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CohortScope.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CohortScope) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CohortScope'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CohortScope'", e);
      }

      // deserialize ReturnPeriodScope
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ReturnPeriodScope.class.equals(Integer.class)
            || ReturnPeriodScope.class.equals(Long.class)
            || ReturnPeriodScope.class.equals(Float.class)
            || ReturnPeriodScope.class.equals(Double.class)
            || ReturnPeriodScope.class.equals(Boolean.class)
            || ReturnPeriodScope.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ReturnPeriodScope.class.equals(Integer.class)
                        || ReturnPeriodScope.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ReturnPeriodScope.class.equals(Float.class)
                        || ReturnPeriodScope.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ReturnPeriodScope.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ReturnPeriodScope.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ReturnPeriodScope.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ReturnPeriodScope) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ReturnPeriodScope'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ReturnPeriodScope'", e);
      }

      // deserialize CellScope
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CellScope.class.equals(Integer.class)
            || CellScope.class.equals(Long.class)
            || CellScope.class.equals(Float.class)
            || CellScope.class.equals(Double.class)
            || CellScope.class.equals(Boolean.class)
            || CellScope.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CellScope.class.equals(Integer.class) || CellScope.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CellScope.class.equals(Float.class) || CellScope.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CellScope.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CellScope.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CellScope.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CellScope) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CellScope'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CellScope'", e);
      }

      ComputationScope ret = new ComputationScope();
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
    public ComputationScope getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ComputationScope cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ComputationScope() {
    super("oneOf", Boolean.FALSE);
  }

  public ComputationScope(CohortScope o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ComputationScope(ReturnPeriodScope o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ComputationScope(CellScope o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("CohortScope", new GenericType<CohortScope>() {});
    schemas.put("ReturnPeriodScope", new GenericType<ReturnPeriodScope>() {});
    schemas.put("CellScope", new GenericType<CellScope>() {});
    JSON.registerDescendants(ComputationScope.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ComputationScope.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CohortScope, ReturnPeriodScope, CellScope
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CohortScope.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ReturnPeriodScope.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CellScope.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CohortScope, ReturnPeriodScope, CellScope");
  }

  /**
   * Get the actual instance, which can be the following: CohortScope, ReturnPeriodScope, CellScope
   *
   * @return The actual instance (CohortScope, ReturnPeriodScope, CellScope)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CohortScope`. If the actual instance is not `CohortScope`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `CohortScope`
   * @throws ClassCastException if the instance is not `CohortScope`
   */
  public CohortScope getCohortScope() throws ClassCastException {
    return (CohortScope) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ReturnPeriodScope`. If the actual instance is not
   * `ReturnPeriodScope`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ReturnPeriodScope`
   * @throws ClassCastException if the instance is not `ReturnPeriodScope`
   */
  public ReturnPeriodScope getReturnPeriodScope() throws ClassCastException {
    return (ReturnPeriodScope) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CellScope`. If the actual instance is not `CellScope`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `CellScope`
   * @throws ClassCastException if the instance is not `CellScope`
   */
  public CellScope getCellScope() throws ClassCastException {
    return (CellScope) super.getActualInstance();
  }
}
