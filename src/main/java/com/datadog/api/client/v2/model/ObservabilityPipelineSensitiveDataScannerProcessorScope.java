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
        ObservabilityPipelineSensitiveDataScannerProcessorScope
            .ObservabilityPipelineSensitiveDataScannerProcessorScopeDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineSensitiveDataScannerProcessorScope
            .ObservabilityPipelineSensitiveDataScannerProcessorScopeSerializer.class)
public class ObservabilityPipelineSensitiveDataScannerProcessorScope extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineSensitiveDataScannerProcessorScope.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineSensitiveDataScannerProcessorScopeSerializer
      extends StdSerializer<ObservabilityPipelineSensitiveDataScannerProcessorScope> {
    public ObservabilityPipelineSensitiveDataScannerProcessorScopeSerializer(
        Class<ObservabilityPipelineSensitiveDataScannerProcessorScope> t) {
      super(t);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorScopeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSensitiveDataScannerProcessorScope value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineSensitiveDataScannerProcessorScopeDeserializer
      extends StdDeserializer<ObservabilityPipelineSensitiveDataScannerProcessorScope> {
    public ObservabilityPipelineSensitiveDataScannerProcessorScopeDeserializer() {
      this(ObservabilityPipelineSensitiveDataScannerProcessorScope.class);
    }

    public ObservabilityPipelineSensitiveDataScannerProcessorScopeDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineSensitiveDataScannerProcessorScope deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                            Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude'",
            e);
      }

      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                            Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude'",
            e);
      }

      // deserialize ObservabilityPipelineSensitiveDataScannerProcessorScopeAll
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(Integer.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(Long.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(Float.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(Double.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                Boolean.class)
            || ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                            Integer.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                            Float.class)
                        || ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineSensitiveDataScannerProcessorScopeAll) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineSensitiveDataScannerProcessorScopeAll'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineSensitiveDataScannerProcessorScopeAll'",
            e);
      }

      ObservabilityPipelineSensitiveDataScannerProcessorScope ret =
          new ObservabilityPipelineSensitiveDataScannerProcessorScope();
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
    public ObservabilityPipelineSensitiveDataScannerProcessorScope getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ObservabilityPipelineSensitiveDataScannerProcessorScope cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineSensitiveDataScannerProcessorScope() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorScope(
      ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorScope(
      ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorScope(
      ObservabilityPipelineSensitiveDataScannerProcessorScopeAll o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude>() {});
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude>() {});
    schemas.put(
        "ObservabilityPipelineSensitiveDataScannerProcessorScopeAll",
        new GenericType<ObservabilityPipelineSensitiveDataScannerProcessorScopeAll>() {});
    JSON.registerDescendants(
        ObservabilityPipelineSensitiveDataScannerProcessorScope.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineSensitiveDataScannerProcessorScope.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude,
   * ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude,
   * ObservabilityPipelineSensitiveDataScannerProcessorScopeAll
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineSensitiveDataScannerProcessorScopeAll.class,
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
        "Invalid instance type. Must be"
            + " ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude,"
            + " ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude,"
            + " ObservabilityPipelineSensitiveDataScannerProcessorScopeAll");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude,
   * ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude,
   * ObservabilityPipelineSensitiveDataScannerProcessorScopeAll
   *
   * @return The actual instance (ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude,
   *     ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude,
   *     ObservabilityPipelineSensitiveDataScannerProcessorScopeAll)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude`. If
   * the actual instance is not `ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude
      getObservabilityPipelineSensitiveDataScannerProcessorScopeInclude()
          throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorScopeInclude)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude`. If
   * the actual instance is not `ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude
      getObservabilityPipelineSensitiveDataScannerProcessorScopeExclude()
          throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorScopeExclude)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorScopeAll`. If the
   * actual instance is not `ObservabilityPipelineSensitiveDataScannerProcessorScopeAll`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineSensitiveDataScannerProcessorScopeAll`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineSensitiveDataScannerProcessorScopeAll`
   */
  public ObservabilityPipelineSensitiveDataScannerProcessorScopeAll
      getObservabilityPipelineSensitiveDataScannerProcessorScopeAll() throws ClassCastException {
    return (ObservabilityPipelineSensitiveDataScannerProcessorScopeAll) super.getActualInstance();
  }
}
