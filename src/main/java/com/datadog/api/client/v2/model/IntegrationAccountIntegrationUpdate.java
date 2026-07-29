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
        IntegrationAccountIntegrationUpdate.IntegrationAccountIntegrationUpdateDeserializer.class)
@JsonSerialize(
    using = IntegrationAccountIntegrationUpdate.IntegrationAccountIntegrationUpdateSerializer.class)
public class IntegrationAccountIntegrationUpdate extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(IntegrationAccountIntegrationUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IntegrationAccountIntegrationUpdateSerializer
      extends StdSerializer<IntegrationAccountIntegrationUpdate> {
    public IntegrationAccountIntegrationUpdateSerializer(
        Class<IntegrationAccountIntegrationUpdate> t) {
      super(t);
    }

    public IntegrationAccountIntegrationUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IntegrationAccountIntegrationUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IntegrationAccountIntegrationUpdateDeserializer
      extends StdDeserializer<IntegrationAccountIntegrationUpdate> {
    public IntegrationAccountIntegrationUpdateDeserializer() {
      this(IntegrationAccountIntegrationUpdate.class);
    }

    public IntegrationAccountIntegrationUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IntegrationAccountIntegrationUpdate deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TwilioIntegrationUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TwilioIntegrationUpdate.class.equals(Integer.class)
            || TwilioIntegrationUpdate.class.equals(Long.class)
            || TwilioIntegrationUpdate.class.equals(Float.class)
            || TwilioIntegrationUpdate.class.equals(Double.class)
            || TwilioIntegrationUpdate.class.equals(Boolean.class)
            || TwilioIntegrationUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TwilioIntegrationUpdate.class.equals(Integer.class)
                        || TwilioIntegrationUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TwilioIntegrationUpdate.class.equals(Float.class)
                        || TwilioIntegrationUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TwilioIntegrationUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TwilioIntegrationUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TwilioIntegrationUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TwilioIntegrationUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TwilioIntegrationUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TwilioIntegrationUpdate'", e);
      }

      // deserialize ElasticCloudIntegrationUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ElasticCloudIntegrationUpdate.class.equals(Integer.class)
            || ElasticCloudIntegrationUpdate.class.equals(Long.class)
            || ElasticCloudIntegrationUpdate.class.equals(Float.class)
            || ElasticCloudIntegrationUpdate.class.equals(Double.class)
            || ElasticCloudIntegrationUpdate.class.equals(Boolean.class)
            || ElasticCloudIntegrationUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ElasticCloudIntegrationUpdate.class.equals(Integer.class)
                        || ElasticCloudIntegrationUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ElasticCloudIntegrationUpdate.class.equals(Float.class)
                        || ElasticCloudIntegrationUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ElasticCloudIntegrationUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ElasticCloudIntegrationUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ElasticCloudIntegrationUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ElasticCloudIntegrationUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ElasticCloudIntegrationUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ElasticCloudIntegrationUpdate'", e);
      }

      IntegrationAccountIntegrationUpdate ret = new IntegrationAccountIntegrationUpdate();
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
    public IntegrationAccountIntegrationUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "IntegrationAccountIntegrationUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IntegrationAccountIntegrationUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public IntegrationAccountIntegrationUpdate(TwilioIntegrationUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IntegrationAccountIntegrationUpdate(ElasticCloudIntegrationUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TwilioIntegrationUpdate", new GenericType<TwilioIntegrationUpdate>() {});
    schemas.put(
        "ElasticCloudIntegrationUpdate", new GenericType<ElasticCloudIntegrationUpdate>() {});
    JSON.registerDescendants(
        IntegrationAccountIntegrationUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IntegrationAccountIntegrationUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TwilioIntegrationUpdate, ElasticCloudIntegrationUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TwilioIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ElasticCloudIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TwilioIntegrationUpdate, ElasticCloudIntegrationUpdate");
  }

  /**
   * Get the actual instance, which can be the following: TwilioIntegrationUpdate,
   * ElasticCloudIntegrationUpdate
   *
   * @return The actual instance (TwilioIntegrationUpdate, ElasticCloudIntegrationUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TwilioIntegrationUpdate`. If the actual instance is not
   * `TwilioIntegrationUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TwilioIntegrationUpdate`
   * @throws ClassCastException if the instance is not `TwilioIntegrationUpdate`
   */
  public TwilioIntegrationUpdate getTwilioIntegrationUpdate() throws ClassCastException {
    return (TwilioIntegrationUpdate) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ElasticCloudIntegrationUpdate`. If the actual instance is not
   * `ElasticCloudIntegrationUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ElasticCloudIntegrationUpdate`
   * @throws ClassCastException if the instance is not `ElasticCloudIntegrationUpdate`
   */
  public ElasticCloudIntegrationUpdate getElasticCloudIntegrationUpdate()
      throws ClassCastException {
    return (ElasticCloudIntegrationUpdate) super.getActualInstance();
  }
}
