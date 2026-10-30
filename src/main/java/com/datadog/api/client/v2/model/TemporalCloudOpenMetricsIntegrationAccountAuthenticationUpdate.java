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
        TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate
            .TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateDeserializer.class)
@JsonSerialize(
    using =
        TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate
            .TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateSerializer.class)
public class TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate
    extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(
          TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateSerializer
      extends StdSerializer<TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate> {
    public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateSerializer(
        Class<TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate> t) {
      super(t);
    }

    public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateDeserializer
      extends StdDeserializer<TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate> {
    public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateDeserializer() {
      this(TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate.class);
    }

    public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                Integer.class)
            || TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                Long.class)
            || TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                Float.class)
            || TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                Double.class)
            || TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                Boolean.class)
            || TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Integer.class)
                        || TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                            Float.class)
                        || TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate'",
            e);
      }

      TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate ret =
          new TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate();
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
    public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(),
          "TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate(
      TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate",
        new GenericType<TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate>() {});
    JSON.registerDescendants(
        TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TemporalCloudOpenMetricsIntegrationAccountAuthenticationUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas:
   * TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate.class,
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
            + " TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate");
  }

  /**
   * Get the actual instance, which can be the following:
   * TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate
   *
   * @return The actual instance (TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate`.
   * If the actual instance is not
   * `TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of
   *     `TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate`
   * @throws ClassCastException if the instance is not
   *     `TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate`
   */
  public TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate
      getTemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate()
          throws ClassCastException {
    return (TemporalCloudOpenMetricsIntegrationAccountBearerTokenAuthUpdate)
        super.getActualInstance();
  }
}
