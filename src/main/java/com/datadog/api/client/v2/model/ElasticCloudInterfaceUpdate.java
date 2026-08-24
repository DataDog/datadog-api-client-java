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
@JsonDeserialize(using = ElasticCloudInterfaceUpdate.ElasticCloudInterfaceUpdateDeserializer.class)
@JsonSerialize(using = ElasticCloudInterfaceUpdate.ElasticCloudInterfaceUpdateSerializer.class)
public class ElasticCloudInterfaceUpdate extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ElasticCloudInterfaceUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ElasticCloudInterfaceUpdateSerializer
      extends StdSerializer<ElasticCloudInterfaceUpdate> {
    public ElasticCloudInterfaceUpdateSerializer(Class<ElasticCloudInterfaceUpdate> t) {
      super(t);
    }

    public ElasticCloudInterfaceUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticCloudInterfaceUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ElasticCloudInterfaceUpdateDeserializer
      extends StdDeserializer<ElasticCloudInterfaceUpdate> {
    public ElasticCloudInterfaceUpdateDeserializer() {
      this(ElasticCloudInterfaceUpdate.class);
    }

    public ElasticCloudInterfaceUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ElasticCloudInterfaceUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ElasticCloudMonitoringInterfaceUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ElasticCloudMonitoringInterfaceUpdate.class.equals(Integer.class)
            || ElasticCloudMonitoringInterfaceUpdate.class.equals(Long.class)
            || ElasticCloudMonitoringInterfaceUpdate.class.equals(Float.class)
            || ElasticCloudMonitoringInterfaceUpdate.class.equals(Double.class)
            || ElasticCloudMonitoringInterfaceUpdate.class.equals(Boolean.class)
            || ElasticCloudMonitoringInterfaceUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ElasticCloudMonitoringInterfaceUpdate.class.equals(Integer.class)
                        || ElasticCloudMonitoringInterfaceUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ElasticCloudMonitoringInterfaceUpdate.class.equals(Float.class)
                        || ElasticCloudMonitoringInterfaceUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ElasticCloudMonitoringInterfaceUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ElasticCloudMonitoringInterfaceUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(ElasticCloudMonitoringInterfaceUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ElasticCloudMonitoringInterfaceUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ElasticCloudMonitoringInterfaceUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ElasticCloudMonitoringInterfaceUpdate'",
            e);
      }

      // deserialize ElasticCloudCcmInterfaceUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ElasticCloudCcmInterfaceUpdate.class.equals(Integer.class)
            || ElasticCloudCcmInterfaceUpdate.class.equals(Long.class)
            || ElasticCloudCcmInterfaceUpdate.class.equals(Float.class)
            || ElasticCloudCcmInterfaceUpdate.class.equals(Double.class)
            || ElasticCloudCcmInterfaceUpdate.class.equals(Boolean.class)
            || ElasticCloudCcmInterfaceUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ElasticCloudCcmInterfaceUpdate.class.equals(Integer.class)
                        || ElasticCloudCcmInterfaceUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ElasticCloudCcmInterfaceUpdate.class.equals(Float.class)
                        || ElasticCloudCcmInterfaceUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ElasticCloudCcmInterfaceUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ElasticCloudCcmInterfaceUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ElasticCloudCcmInterfaceUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ElasticCloudCcmInterfaceUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ElasticCloudCcmInterfaceUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ElasticCloudCcmInterfaceUpdate'", e);
      }

      ElasticCloudInterfaceUpdate ret = new ElasticCloudInterfaceUpdate();
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
    public ElasticCloudInterfaceUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ElasticCloudInterfaceUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ElasticCloudInterfaceUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public ElasticCloudInterfaceUpdate(ElasticCloudMonitoringInterfaceUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ElasticCloudInterfaceUpdate(ElasticCloudCcmInterfaceUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ElasticCloudMonitoringInterfaceUpdate",
        new GenericType<ElasticCloudMonitoringInterfaceUpdate>() {});
    schemas.put(
        "ElasticCloudCcmInterfaceUpdate", new GenericType<ElasticCloudCcmInterfaceUpdate>() {});
    JSON.registerDescendants(
        ElasticCloudInterfaceUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ElasticCloudInterfaceUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ElasticCloudMonitoringInterfaceUpdate,
   * ElasticCloudCcmInterfaceUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ElasticCloudMonitoringInterfaceUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ElasticCloudCcmInterfaceUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ElasticCloudMonitoringInterfaceUpdate,"
            + " ElasticCloudCcmInterfaceUpdate");
  }

  /**
   * Get the actual instance, which can be the following: ElasticCloudMonitoringInterfaceUpdate,
   * ElasticCloudCcmInterfaceUpdate
   *
   * @return The actual instance (ElasticCloudMonitoringInterfaceUpdate,
   *     ElasticCloudCcmInterfaceUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ElasticCloudMonitoringInterfaceUpdate`. If the actual instance is
   * not `ElasticCloudMonitoringInterfaceUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ElasticCloudMonitoringInterfaceUpdate`
   * @throws ClassCastException if the instance is not `ElasticCloudMonitoringInterfaceUpdate`
   */
  public ElasticCloudMonitoringInterfaceUpdate getElasticCloudMonitoringInterfaceUpdate()
      throws ClassCastException {
    return (ElasticCloudMonitoringInterfaceUpdate) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ElasticCloudCcmInterfaceUpdate`. If the actual instance is not
   * `ElasticCloudCcmInterfaceUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ElasticCloudCcmInterfaceUpdate`
   * @throws ClassCastException if the instance is not `ElasticCloudCcmInterfaceUpdate`
   */
  public ElasticCloudCcmInterfaceUpdate getElasticCloudCcmInterfaceUpdate()
      throws ClassCastException {
    return (ElasticCloudCcmInterfaceUpdate) super.getActualInstance();
  }
}
