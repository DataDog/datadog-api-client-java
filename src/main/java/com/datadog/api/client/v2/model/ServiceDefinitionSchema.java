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
@JsonDeserialize(using = ServiceDefinitionSchema.ServiceDefinitionSchemaDeserializer.class)
@JsonSerialize(using = ServiceDefinitionSchema.ServiceDefinitionSchemaSerializer.class)
public class ServiceDefinitionSchema extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ServiceDefinitionSchema.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ServiceDefinitionSchemaSerializer
      extends StdSerializer<ServiceDefinitionSchema> {
    public ServiceDefinitionSchemaSerializer(Class<ServiceDefinitionSchema> t) {
      super(t);
    }

    public ServiceDefinitionSchemaSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionSchema value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ServiceDefinitionSchemaDeserializer
      extends StdDeserializer<ServiceDefinitionSchema> {
    public ServiceDefinitionSchemaDeserializer() {
      this(ServiceDefinitionSchema.class);
    }

    public ServiceDefinitionSchemaDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ServiceDefinitionSchema deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ServiceDefinitionV1
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceDefinitionV1.class.equals(Integer.class)
            || ServiceDefinitionV1.class.equals(Long.class)
            || ServiceDefinitionV1.class.equals(Float.class)
            || ServiceDefinitionV1.class.equals(Double.class)
            || ServiceDefinitionV1.class.equals(Boolean.class)
            || ServiceDefinitionV1.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceDefinitionV1.class.equals(Integer.class)
                        || ServiceDefinitionV1.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceDefinitionV1.class.equals(Float.class)
                        || ServiceDefinitionV1.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceDefinitionV1.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceDefinitionV1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV1.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceDefinitionV1) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV1'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV1'", e);
      }

      // deserialize ServiceDefinitionV2
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceDefinitionV2.class.equals(Integer.class)
            || ServiceDefinitionV2.class.equals(Long.class)
            || ServiceDefinitionV2.class.equals(Float.class)
            || ServiceDefinitionV2.class.equals(Double.class)
            || ServiceDefinitionV2.class.equals(Boolean.class)
            || ServiceDefinitionV2.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceDefinitionV2.class.equals(Integer.class)
                        || ServiceDefinitionV2.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceDefinitionV2.class.equals(Float.class)
                        || ServiceDefinitionV2.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceDefinitionV2.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceDefinitionV2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceDefinitionV2) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2'", e);
      }

      // deserialize ServiceDefinitionV2Dot1
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceDefinitionV2Dot1.class.equals(Integer.class)
            || ServiceDefinitionV2Dot1.class.equals(Long.class)
            || ServiceDefinitionV2Dot1.class.equals(Float.class)
            || ServiceDefinitionV2Dot1.class.equals(Double.class)
            || ServiceDefinitionV2Dot1.class.equals(Boolean.class)
            || ServiceDefinitionV2Dot1.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceDefinitionV2Dot1.class.equals(Integer.class)
                        || ServiceDefinitionV2Dot1.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceDefinitionV2Dot1.class.equals(Float.class)
                        || ServiceDefinitionV2Dot1.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceDefinitionV2Dot1.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceDefinitionV2Dot1.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2Dot1.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceDefinitionV2Dot1) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2Dot1'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2Dot1'", e);
      }

      // deserialize ServiceDefinitionV2Dot2
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceDefinitionV2Dot2.class.equals(Integer.class)
            || ServiceDefinitionV2Dot2.class.equals(Long.class)
            || ServiceDefinitionV2Dot2.class.equals(Float.class)
            || ServiceDefinitionV2Dot2.class.equals(Double.class)
            || ServiceDefinitionV2Dot2.class.equals(Boolean.class)
            || ServiceDefinitionV2Dot2.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceDefinitionV2Dot2.class.equals(Integer.class)
                        || ServiceDefinitionV2Dot2.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceDefinitionV2Dot2.class.equals(Float.class)
                        || ServiceDefinitionV2Dot2.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceDefinitionV2Dot2.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceDefinitionV2Dot2.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2Dot2.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceDefinitionV2Dot2) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2Dot2'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2Dot2'", e);
      }

      ServiceDefinitionSchema ret = new ServiceDefinitionSchema();
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
    public ServiceDefinitionSchema getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ServiceDefinitionSchema cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ServiceDefinitionSchema() {
    super("oneOf", Boolean.FALSE);
  }

  public ServiceDefinitionSchema(ServiceDefinitionV1 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ServiceDefinitionSchema(ServiceDefinitionV2 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ServiceDefinitionSchema(ServiceDefinitionV2Dot1 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ServiceDefinitionSchema(ServiceDefinitionV2Dot2 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ServiceDefinitionV1", new GenericType<ServiceDefinitionV1>() {});
    schemas.put("ServiceDefinitionV2", new GenericType<ServiceDefinitionV2>() {});
    schemas.put("ServiceDefinitionV2Dot1", new GenericType<ServiceDefinitionV2Dot1>() {});
    schemas.put("ServiceDefinitionV2Dot2", new GenericType<ServiceDefinitionV2Dot2>() {});
    JSON.registerDescendants(ServiceDefinitionSchema.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ServiceDefinitionSchema.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ServiceDefinitionV1, ServiceDefinitionV2,
   * ServiceDefinitionV2Dot1, ServiceDefinitionV2Dot2
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ServiceDefinitionV1.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ServiceDefinitionV2.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ServiceDefinitionV2Dot1.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ServiceDefinitionV2Dot2.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ServiceDefinitionV1, ServiceDefinitionV2,"
            + " ServiceDefinitionV2Dot1, ServiceDefinitionV2Dot2");
  }

  /**
   * Get the actual instance, which can be the following: ServiceDefinitionV1, ServiceDefinitionV2,
   * ServiceDefinitionV2Dot1, ServiceDefinitionV2Dot2
   *
   * @return The actual instance (ServiceDefinitionV1, ServiceDefinitionV2, ServiceDefinitionV2Dot1,
   *     ServiceDefinitionV2Dot2)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceDefinitionV1`. If the actual instance is not
   * `ServiceDefinitionV1`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceDefinitionV1`
   * @throws ClassCastException if the instance is not `ServiceDefinitionV1`
   */
  public ServiceDefinitionV1 getServiceDefinitionV1() throws ClassCastException {
    return (ServiceDefinitionV1) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceDefinitionV2`. If the actual instance is not
   * `ServiceDefinitionV2`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceDefinitionV2`
   * @throws ClassCastException if the instance is not `ServiceDefinitionV2`
   */
  public ServiceDefinitionV2 getServiceDefinitionV2() throws ClassCastException {
    return (ServiceDefinitionV2) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceDefinitionV2Dot1`. If the actual instance is not
   * `ServiceDefinitionV2Dot1`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceDefinitionV2Dot1`
   * @throws ClassCastException if the instance is not `ServiceDefinitionV2Dot1`
   */
  public ServiceDefinitionV2Dot1 getServiceDefinitionV2Dot1() throws ClassCastException {
    return (ServiceDefinitionV2Dot1) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceDefinitionV2Dot2`. If the actual instance is not
   * `ServiceDefinitionV2Dot2`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceDefinitionV2Dot2`
   * @throws ClassCastException if the instance is not `ServiceDefinitionV2Dot2`
   */
  public ServiceDefinitionV2Dot2 getServiceDefinitionV2Dot2() throws ClassCastException {
    return (ServiceDefinitionV2Dot2) super.getActualInstance();
  }
}
