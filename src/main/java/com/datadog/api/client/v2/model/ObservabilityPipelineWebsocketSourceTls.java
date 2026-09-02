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
        ObservabilityPipelineWebsocketSourceTls.ObservabilityPipelineWebsocketSourceTlsDeserializer
            .class)
@JsonSerialize(
    using =
        ObservabilityPipelineWebsocketSourceTls.ObservabilityPipelineWebsocketSourceTlsSerializer
            .class)
public class ObservabilityPipelineWebsocketSourceTls extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ObservabilityPipelineWebsocketSourceTls.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ObservabilityPipelineWebsocketSourceTlsSerializer
      extends StdSerializer<ObservabilityPipelineWebsocketSourceTls> {
    public ObservabilityPipelineWebsocketSourceTlsSerializer(
        Class<ObservabilityPipelineWebsocketSourceTls> t) {
      super(t);
    }

    public ObservabilityPipelineWebsocketSourceTlsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineWebsocketSourceTls value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ObservabilityPipelineWebsocketSourceTlsDeserializer
      extends StdDeserializer<ObservabilityPipelineWebsocketSourceTls> {
    public ObservabilityPipelineWebsocketSourceTlsDeserializer() {
      this(ObservabilityPipelineWebsocketSourceTls.class);
    }

    public ObservabilityPipelineWebsocketSourceTlsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ObservabilityPipelineWebsocketSourceTls deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ObservabilityPipelineWebsocketSourceTlsEnabled
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Integer.class)
            || ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Long.class)
            || ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Float.class)
            || ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Double.class)
            || ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Boolean.class)
            || ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Integer.class)
                        || ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Float.class)
                        || ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineWebsocketSourceTlsEnabled.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineWebsocketSourceTlsEnabled.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineWebsocketSourceTlsEnabled) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineWebsocketSourceTlsEnabled'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ObservabilityPipelineWebsocketSourceTlsEnabled'",
            e);
      }

      // deserialize ObservabilityPipelineWebsocketSourceTlsWithClientCert
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Integer.class)
            || ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Long.class)
            || ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Float.class)
            || ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Double.class)
            || ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Boolean.class)
            || ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Integer.class)
                        || ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Float.class)
                        || ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ObservabilityPipelineWebsocketSourceTlsWithClientCert.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ObservabilityPipelineWebsocketSourceTlsWithClientCert.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ObservabilityPipelineWebsocketSourceTlsWithClientCert) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ObservabilityPipelineWebsocketSourceTlsWithClientCert'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'ObservabilityPipelineWebsocketSourceTlsWithClientCert'",
            e);
      }

      ObservabilityPipelineWebsocketSourceTls ret = new ObservabilityPipelineWebsocketSourceTls();
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
    public ObservabilityPipelineWebsocketSourceTls getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ObservabilityPipelineWebsocketSourceTls cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ObservabilityPipelineWebsocketSourceTls() {
    super("oneOf", Boolean.FALSE);
  }

  public ObservabilityPipelineWebsocketSourceTls(ObservabilityPipelineWebsocketSourceTlsEnabled o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ObservabilityPipelineWebsocketSourceTls(
      ObservabilityPipelineWebsocketSourceTlsWithClientCert o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ObservabilityPipelineWebsocketSourceTlsEnabled",
        new GenericType<ObservabilityPipelineWebsocketSourceTlsEnabled>() {});
    schemas.put(
        "ObservabilityPipelineWebsocketSourceTlsWithClientCert",
        new GenericType<ObservabilityPipelineWebsocketSourceTlsWithClientCert>() {});
    JSON.registerDescendants(
        ObservabilityPipelineWebsocketSourceTls.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ObservabilityPipelineWebsocketSourceTls.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ObservabilityPipelineWebsocketSourceTlsEnabled,
   * ObservabilityPipelineWebsocketSourceTlsWithClientCert
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ObservabilityPipelineWebsocketSourceTlsEnabled.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ObservabilityPipelineWebsocketSourceTlsWithClientCert.class,
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
        "Invalid instance type. Must be ObservabilityPipelineWebsocketSourceTlsEnabled,"
            + " ObservabilityPipelineWebsocketSourceTlsWithClientCert");
  }

  /**
   * Get the actual instance, which can be the following:
   * ObservabilityPipelineWebsocketSourceTlsEnabled,
   * ObservabilityPipelineWebsocketSourceTlsWithClientCert
   *
   * @return The actual instance (ObservabilityPipelineWebsocketSourceTlsEnabled,
   *     ObservabilityPipelineWebsocketSourceTlsWithClientCert)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineWebsocketSourceTlsEnabled`. If the actual
   * instance is not `ObservabilityPipelineWebsocketSourceTlsEnabled`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineWebsocketSourceTlsEnabled`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineWebsocketSourceTlsEnabled`
   */
  public ObservabilityPipelineWebsocketSourceTlsEnabled
      getObservabilityPipelineWebsocketSourceTlsEnabled() throws ClassCastException {
    return (ObservabilityPipelineWebsocketSourceTlsEnabled) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ObservabilityPipelineWebsocketSourceTlsWithClientCert`. If the
   * actual instance is not `ObservabilityPipelineWebsocketSourceTlsWithClientCert`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `ObservabilityPipelineWebsocketSourceTlsWithClientCert`
   * @throws ClassCastException if the instance is not
   *     `ObservabilityPipelineWebsocketSourceTlsWithClientCert`
   */
  public ObservabilityPipelineWebsocketSourceTlsWithClientCert
      getObservabilityPipelineWebsocketSourceTlsWithClientCert() throws ClassCastException {
    return (ObservabilityPipelineWebsocketSourceTlsWithClientCert) super.getActualInstance();
  }
}
