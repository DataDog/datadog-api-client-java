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
@JsonDeserialize(using = ServiceDefinitionV2Contact.ServiceDefinitionV2ContactDeserializer.class)
@JsonSerialize(using = ServiceDefinitionV2Contact.ServiceDefinitionV2ContactSerializer.class)
public class ServiceDefinitionV2Contact extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ServiceDefinitionV2Contact.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ServiceDefinitionV2ContactSerializer
      extends StdSerializer<ServiceDefinitionV2Contact> {
    public ServiceDefinitionV2ContactSerializer(Class<ServiceDefinitionV2Contact> t) {
      super(t);
    }

    public ServiceDefinitionV2ContactSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceDefinitionV2Contact value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ServiceDefinitionV2ContactDeserializer
      extends StdDeserializer<ServiceDefinitionV2Contact> {
    public ServiceDefinitionV2ContactDeserializer() {
      this(ServiceDefinitionV2Contact.class);
    }

    public ServiceDefinitionV2ContactDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ServiceDefinitionV2Contact deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ServiceDefinitionV2Email
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceDefinitionV2Email.class.equals(Integer.class)
            || ServiceDefinitionV2Email.class.equals(Long.class)
            || ServiceDefinitionV2Email.class.equals(Float.class)
            || ServiceDefinitionV2Email.class.equals(Double.class)
            || ServiceDefinitionV2Email.class.equals(Boolean.class)
            || ServiceDefinitionV2Email.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceDefinitionV2Email.class.equals(Integer.class)
                        || ServiceDefinitionV2Email.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceDefinitionV2Email.class.equals(Float.class)
                        || ServiceDefinitionV2Email.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceDefinitionV2Email.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceDefinitionV2Email.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2Email.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceDefinitionV2Email) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2Email'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2Email'", e);
      }

      // deserialize ServiceDefinitionV2Slack
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ServiceDefinitionV2Slack.class.equals(Integer.class)
            || ServiceDefinitionV2Slack.class.equals(Long.class)
            || ServiceDefinitionV2Slack.class.equals(Float.class)
            || ServiceDefinitionV2Slack.class.equals(Double.class)
            || ServiceDefinitionV2Slack.class.equals(Boolean.class)
            || ServiceDefinitionV2Slack.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ServiceDefinitionV2Slack.class.equals(Integer.class)
                        || ServiceDefinitionV2Slack.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ServiceDefinitionV2Slack.class.equals(Float.class)
                        || ServiceDefinitionV2Slack.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ServiceDefinitionV2Slack.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ServiceDefinitionV2Slack.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ServiceDefinitionV2Slack.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ServiceDefinitionV2Slack) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ServiceDefinitionV2Slack'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ServiceDefinitionV2Slack'", e);
      }

      ServiceDefinitionV2Contact ret = new ServiceDefinitionV2Contact();
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
    public ServiceDefinitionV2Contact getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ServiceDefinitionV2Contact cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ServiceDefinitionV2Contact() {
    super("oneOf", Boolean.FALSE);
  }

  public ServiceDefinitionV2Contact(ServiceDefinitionV2Email o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ServiceDefinitionV2Contact(ServiceDefinitionV2Slack o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ServiceDefinitionV2Email", new GenericType<ServiceDefinitionV2Email>() {});
    schemas.put("ServiceDefinitionV2Slack", new GenericType<ServiceDefinitionV2Slack>() {});
    JSON.registerDescendants(
        ServiceDefinitionV2Contact.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ServiceDefinitionV2Contact.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ServiceDefinitionV2Email, ServiceDefinitionV2Slack
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ServiceDefinitionV2Email.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ServiceDefinitionV2Slack.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ServiceDefinitionV2Email, ServiceDefinitionV2Slack");
  }

  /**
   * Get the actual instance, which can be the following: ServiceDefinitionV2Email,
   * ServiceDefinitionV2Slack
   *
   * @return The actual instance (ServiceDefinitionV2Email, ServiceDefinitionV2Slack)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceDefinitionV2Email`. If the actual instance is not
   * `ServiceDefinitionV2Email`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceDefinitionV2Email`
   * @throws ClassCastException if the instance is not `ServiceDefinitionV2Email`
   */
  public ServiceDefinitionV2Email getServiceDefinitionV2Email() throws ClassCastException {
    return (ServiceDefinitionV2Email) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ServiceDefinitionV2Slack`. If the actual instance is not
   * `ServiceDefinitionV2Slack`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ServiceDefinitionV2Slack`
   * @throws ClassCastException if the instance is not `ServiceDefinitionV2Slack`
   */
  public ServiceDefinitionV2Slack getServiceDefinitionV2Slack() throws ClassCastException {
    return (ServiceDefinitionV2Slack) super.getActualInstance();
  }
}
