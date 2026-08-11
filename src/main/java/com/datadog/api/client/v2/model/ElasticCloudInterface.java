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
@JsonDeserialize(using = ElasticCloudInterface.ElasticCloudInterfaceDeserializer.class)
@JsonSerialize(using = ElasticCloudInterface.ElasticCloudInterfaceSerializer.class)
public class ElasticCloudInterface extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ElasticCloudInterface.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ElasticCloudInterfaceSerializer extends StdSerializer<ElasticCloudInterface> {
    public ElasticCloudInterfaceSerializer(Class<ElasticCloudInterface> t) {
      super(t);
    }

    public ElasticCloudInterfaceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticCloudInterface value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ElasticCloudInterfaceDeserializer
      extends StdDeserializer<ElasticCloudInterface> {
    public ElasticCloudInterfaceDeserializer() {
      this(ElasticCloudInterface.class);
    }

    public ElasticCloudInterfaceDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ElasticCloudInterface deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ElasticCloudMonitoringInterface
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ElasticCloudMonitoringInterface.class.equals(Integer.class)
            || ElasticCloudMonitoringInterface.class.equals(Long.class)
            || ElasticCloudMonitoringInterface.class.equals(Float.class)
            || ElasticCloudMonitoringInterface.class.equals(Double.class)
            || ElasticCloudMonitoringInterface.class.equals(Boolean.class)
            || ElasticCloudMonitoringInterface.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ElasticCloudMonitoringInterface.class.equals(Integer.class)
                        || ElasticCloudMonitoringInterface.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ElasticCloudMonitoringInterface.class.equals(Float.class)
                        || ElasticCloudMonitoringInterface.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ElasticCloudMonitoringInterface.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ElasticCloudMonitoringInterface.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ElasticCloudMonitoringInterface.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ElasticCloudMonitoringInterface) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ElasticCloudMonitoringInterface'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ElasticCloudMonitoringInterface'", e);
      }

      // deserialize ElasticCloudCcmInterface
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ElasticCloudCcmInterface.class.equals(Integer.class)
            || ElasticCloudCcmInterface.class.equals(Long.class)
            || ElasticCloudCcmInterface.class.equals(Float.class)
            || ElasticCloudCcmInterface.class.equals(Double.class)
            || ElasticCloudCcmInterface.class.equals(Boolean.class)
            || ElasticCloudCcmInterface.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ElasticCloudCcmInterface.class.equals(Integer.class)
                        || ElasticCloudCcmInterface.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ElasticCloudCcmInterface.class.equals(Float.class)
                        || ElasticCloudCcmInterface.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ElasticCloudCcmInterface.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ElasticCloudCcmInterface.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ElasticCloudCcmInterface.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ElasticCloudCcmInterface) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ElasticCloudCcmInterface'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ElasticCloudCcmInterface'", e);
      }

      ElasticCloudInterface ret = new ElasticCloudInterface();
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
    public ElasticCloudInterface getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ElasticCloudInterface cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ElasticCloudInterface() {
    super("oneOf", Boolean.FALSE);
  }

  public ElasticCloudInterface(ElasticCloudMonitoringInterface o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ElasticCloudInterface(ElasticCloudCcmInterface o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ElasticCloudMonitoringInterface", new GenericType<ElasticCloudMonitoringInterface>() {});
    schemas.put("ElasticCloudCcmInterface", new GenericType<ElasticCloudCcmInterface>() {});
    JSON.registerDescendants(ElasticCloudInterface.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ElasticCloudInterface.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ElasticCloudMonitoringInterface, ElasticCloudCcmInterface
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ElasticCloudMonitoringInterface.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ElasticCloudCcmInterface.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ElasticCloudMonitoringInterface, ElasticCloudCcmInterface");
  }

  /**
   * Get the actual instance, which can be the following: ElasticCloudMonitoringInterface,
   * ElasticCloudCcmInterface
   *
   * @return The actual instance (ElasticCloudMonitoringInterface, ElasticCloudCcmInterface)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ElasticCloudMonitoringInterface`. If the actual instance is not
   * `ElasticCloudMonitoringInterface`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ElasticCloudMonitoringInterface`
   * @throws ClassCastException if the instance is not `ElasticCloudMonitoringInterface`
   */
  public ElasticCloudMonitoringInterface getElasticCloudMonitoringInterface()
      throws ClassCastException {
    return (ElasticCloudMonitoringInterface) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ElasticCloudCcmInterface`. If the actual instance is not
   * `ElasticCloudCcmInterface`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ElasticCloudCcmInterface`
   * @throws ClassCastException if the instance is not `ElasticCloudCcmInterface`
   */
  public ElasticCloudCcmInterface getElasticCloudCcmInterface() throws ClassCastException {
    return (ElasticCloudCcmInterface) super.getActualInstance();
  }
}
