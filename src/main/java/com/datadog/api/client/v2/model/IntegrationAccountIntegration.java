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
    using = IntegrationAccountIntegration.IntegrationAccountIntegrationDeserializer.class)
@JsonSerialize(using = IntegrationAccountIntegration.IntegrationAccountIntegrationSerializer.class)
public class IntegrationAccountIntegration extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IntegrationAccountIntegration.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IntegrationAccountIntegrationSerializer
      extends StdSerializer<IntegrationAccountIntegration> {
    public IntegrationAccountIntegrationSerializer(Class<IntegrationAccountIntegration> t) {
      super(t);
    }

    public IntegrationAccountIntegrationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IntegrationAccountIntegration value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IntegrationAccountIntegrationDeserializer
      extends StdDeserializer<IntegrationAccountIntegration> {
    public IntegrationAccountIntegrationDeserializer() {
      this(IntegrationAccountIntegration.class);
    }

    public IntegrationAccountIntegrationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IntegrationAccountIntegration deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TwilioIntegration
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TwilioIntegration.class.equals(Integer.class)
            || TwilioIntegration.class.equals(Long.class)
            || TwilioIntegration.class.equals(Float.class)
            || TwilioIntegration.class.equals(Double.class)
            || TwilioIntegration.class.equals(Boolean.class)
            || TwilioIntegration.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TwilioIntegration.class.equals(Integer.class)
                        || TwilioIntegration.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TwilioIntegration.class.equals(Float.class)
                        || TwilioIntegration.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TwilioIntegration.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TwilioIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TwilioIntegration.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TwilioIntegration) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TwilioIntegration'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TwilioIntegration'", e);
      }

      // deserialize ElasticCloudIntegration
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ElasticCloudIntegration.class.equals(Integer.class)
            || ElasticCloudIntegration.class.equals(Long.class)
            || ElasticCloudIntegration.class.equals(Float.class)
            || ElasticCloudIntegration.class.equals(Double.class)
            || ElasticCloudIntegration.class.equals(Boolean.class)
            || ElasticCloudIntegration.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ElasticCloudIntegration.class.equals(Integer.class)
                        || ElasticCloudIntegration.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ElasticCloudIntegration.class.equals(Float.class)
                        || ElasticCloudIntegration.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ElasticCloudIntegration.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ElasticCloudIntegration.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ElasticCloudIntegration.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ElasticCloudIntegration) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ElasticCloudIntegration'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ElasticCloudIntegration'", e);
      }

      IntegrationAccountIntegration ret = new IntegrationAccountIntegration();
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
    public IntegrationAccountIntegration getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "IntegrationAccountIntegration cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IntegrationAccountIntegration() {
    super("oneOf", Boolean.FALSE);
  }

  public IntegrationAccountIntegration(TwilioIntegration o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IntegrationAccountIntegration(ElasticCloudIntegration o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TwilioIntegration", new GenericType<TwilioIntegration>() {});
    schemas.put("ElasticCloudIntegration", new GenericType<ElasticCloudIntegration>() {});
    JSON.registerDescendants(
        IntegrationAccountIntegration.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IntegrationAccountIntegration.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TwilioIntegration, ElasticCloudIntegration
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TwilioIntegration.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ElasticCloudIntegration.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TwilioIntegration, ElasticCloudIntegration");
  }

  /**
   * Get the actual instance, which can be the following: TwilioIntegration, ElasticCloudIntegration
   *
   * @return The actual instance (TwilioIntegration, ElasticCloudIntegration)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TwilioIntegration`. If the actual instance is not
   * `TwilioIntegration`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TwilioIntegration`
   * @throws ClassCastException if the instance is not `TwilioIntegration`
   */
  public TwilioIntegration getTwilioIntegration() throws ClassCastException {
    return (TwilioIntegration) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ElasticCloudIntegration`. If the actual instance is not
   * `ElasticCloudIntegration`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ElasticCloudIntegration`
   * @throws ClassCastException if the instance is not `ElasticCloudIntegration`
   */
  public ElasticCloudIntegration getElasticCloudIntegration() throws ClassCastException {
    return (ElasticCloudIntegration) super.getActualInstance();
  }
}
