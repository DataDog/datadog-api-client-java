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
        ObservabilityPipelineHttpServerSourceValidTokenPathToToken
            .ObservabilityPipelineHttpServerSourceValidTokenPathToTokenDeserializer.class)
@JsonSerialize(
    using =
        ObservabilityPipelineHttpServerSourceValidTokenPathToToken
            .ObservabilityPipelineHttpServerSourceValidTokenPathToTokenSerializer.class)
public class ObservabilityPipelineHttpServerSourceValidTokenPathToToken
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineHttpServerSourceValidTokenPathToToken.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineHttpServerSourceValidTokenPathToTokenSerializer
      extends StdSerializer<ObservabilityPipelineHttpServerSourceValidTokenPathToToken> {
    public ObservabilityPipelineHttpServerSourceValidTokenPathToTokenSerializer(
        Class<ObservabilityPipelineHttpServerSourceValidTokenPathToToken> t) {
      super(t);
    }

    public ObservabilityPipelineHttpServerSourceValidTokenPathToTokenSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineHttpServerSourceValidTokenPathToToken value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineHttpServerSourceValidTokenPathToTokenDeserializer
      extends StdDeserializer<ObservabilityPipelineHttpServerSourceValidTokenPathToToken> {
    public ObservabilityPipelineHttpServerSourceValidTokenPathToTokenDeserializer() {
      this(ObservabilityPipelineHttpServerSourceValidTokenPathToToken.class);
    }

    public ObservabilityPipelineHttpServerSourceValidTokenPathToTokenDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineHttpServerSourceValidTokenPathToToken deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                Integer.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                Long.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                Float.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                Double.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                Boolean.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                            Integer.class)
                        || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                            Float.class)
                        || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation'",
            e);
      }

      // deserialize ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                Integer.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                Long.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                Float.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                Double.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                Boolean.class)
            || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                            Integer.class)
                        || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                            Float.class)
                        || ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader'",
            e);
      }

      ObservabilityPipelineHttpServerSourceValidTokenPathToToken ret =
          new ObservabilityPipelineHttpServerSourceValidTokenPathToToken();
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
    public ObservabilityPipelineHttpServerSourceValidTokenPathToToken getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "ObservabilityPipelineHttpServerSourceValidTokenPathToToken cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineHttpServerSourceValidTokenPathToToken() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineHttpServerSourceValidTokenPathToToken(
      ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineHttpServerSourceValidTokenPathToToken(
      ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation",
        new GenericType<ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation>() {});
    schemas.put(
        "ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader",
        new GenericType<ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader>() {});
    JSON.registerDescendants(
        ObservabilityPipelineHttpServerSourceValidTokenPathToToken.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineHttpServerSourceValidTokenPathToToken.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation,
   * ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader.class,
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
            + " ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation,"
            + " ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation,
   * ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader
   *
   * @return The actual instance
   *     (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation,
   *     ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of
   * `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation`. If the actual instance is
   * not `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation`
   */
  public ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation
      getObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation()
          throws ClassCastException {
    return (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenLocation)
        super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader`.
   * If the actual instance is not
   * `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of
   *     `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader`
   */
  public ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader
      getObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader()
          throws ClassCastException {
    return (ObservabilityPipelineHttpServerSourceValidTokenPathToTokenHeader)
        super.getActualInstance();
  }
}
