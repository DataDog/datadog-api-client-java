/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
        HostmapBackendDefinition20270101Requests
            .HostmapBackendDefinition20270101RequestsDeserializer.class)
@JsonSerialize(
    using =
        HostmapBackendDefinition20270101Requests.HostmapBackendDefinition20270101RequestsSerializer
            .class)
public class HostmapBackendDefinition20270101Requests extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(HostmapBackendDefinition20270101Requests.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HostmapBackendDefinition20270101RequestsSerializer
      extends StdSerializer<HostmapBackendDefinition20270101Requests> {
    public HostmapBackendDefinition20270101RequestsSerializer(
        Class<HostmapBackendDefinition20270101Requests> t) {
      super(t);
    }

    public HostmapBackendDefinition20270101RequestsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostmapBackendDefinition20270101Requests value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HostmapBackendDefinition20270101RequestsDeserializer
      extends StdDeserializer<HostmapBackendDefinition20270101Requests> {
    public HostmapBackendDefinition20270101RequestsDeserializer() {
      this(HostmapBackendDefinition20270101Requests.class);
    }

    public HostmapBackendDefinition20270101RequestsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HostmapBackendDefinition20270101Requests deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize MetricHostmapRequests_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricHostmapRequests_20270101.class.equals(Integer.class)
            || MetricHostmapRequests_20270101.class.equals(Long.class)
            || MetricHostmapRequests_20270101.class.equals(Float.class)
            || MetricHostmapRequests_20270101.class.equals(Double.class)
            || MetricHostmapRequests_20270101.class.equals(Boolean.class)
            || MetricHostmapRequests_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricHostmapRequests_20270101.class.equals(Integer.class)
                        || MetricHostmapRequests_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricHostmapRequests_20270101.class.equals(Float.class)
                        || MetricHostmapRequests_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricHostmapRequests_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricHostmapRequests_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricHostmapRequests_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricHostmapRequests_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricHostmapRequests_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'MetricHostmapRequests_20270101'", e);
      }

      // deserialize HostmapInfrastructureRequest_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HostmapInfrastructureRequest_20270101.class.equals(Integer.class)
            || HostmapInfrastructureRequest_20270101.class.equals(Long.class)
            || HostmapInfrastructureRequest_20270101.class.equals(Float.class)
            || HostmapInfrastructureRequest_20270101.class.equals(Double.class)
            || HostmapInfrastructureRequest_20270101.class.equals(Boolean.class)
            || HostmapInfrastructureRequest_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HostmapInfrastructureRequest_20270101.class.equals(Integer.class)
                        || HostmapInfrastructureRequest_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HostmapInfrastructureRequest_20270101.class.equals(Float.class)
                        || HostmapInfrastructureRequest_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HostmapInfrastructureRequest_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HostmapInfrastructureRequest_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(HostmapInfrastructureRequest_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HostmapInfrastructureRequest_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HostmapInfrastructureRequest_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HostmapInfrastructureRequest_20270101'",
            e);
      }

      // deserialize HostmapDataProjectionRequest_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HostmapDataProjectionRequest_20270101.class.equals(Integer.class)
            || HostmapDataProjectionRequest_20270101.class.equals(Long.class)
            || HostmapDataProjectionRequest_20270101.class.equals(Float.class)
            || HostmapDataProjectionRequest_20270101.class.equals(Double.class)
            || HostmapDataProjectionRequest_20270101.class.equals(Boolean.class)
            || HostmapDataProjectionRequest_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HostmapDataProjectionRequest_20270101.class.equals(Integer.class)
                        || HostmapDataProjectionRequest_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HostmapDataProjectionRequest_20270101.class.equals(Float.class)
                        || HostmapDataProjectionRequest_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HostmapDataProjectionRequest_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HostmapDataProjectionRequest_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(HostmapDataProjectionRequest_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HostmapDataProjectionRequest_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HostmapDataProjectionRequest_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'HostmapDataProjectionRequest_20270101'",
            e);
      }

      HostmapBackendDefinition20270101Requests ret = new HostmapBackendDefinition20270101Requests();
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
    public HostmapBackendDefinition20270101Requests getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "HostmapBackendDefinition20270101Requests cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HostmapBackendDefinition20270101Requests() {
    super("oneOf", Boolean.FALSE);
  }

  public HostmapBackendDefinition20270101Requests(MetricHostmapRequests_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HostmapBackendDefinition20270101Requests(HostmapInfrastructureRequest_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HostmapBackendDefinition20270101Requests(HostmapDataProjectionRequest_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "MetricHostmapRequests_20270101", new GenericType<MetricHostmapRequests_20270101>() {});
    schemas.put(
        "HostmapInfrastructureRequest_20270101",
        new GenericType<HostmapInfrastructureRequest_20270101>() {});
    schemas.put(
        "HostmapDataProjectionRequest_20270101",
        new GenericType<HostmapDataProjectionRequest_20270101>() {});
    JSON.registerDescendants(
        HostmapBackendDefinition20270101Requests.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HostmapBackendDefinition20270101Requests.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: MetricHostmapRequests_20270101,
   * HostmapInfrastructureRequest_20270101, HostmapDataProjectionRequest_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        MetricHostmapRequests_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HostmapInfrastructureRequest_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        HostmapDataProjectionRequest_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be MetricHostmapRequests_20270101,"
            + " HostmapInfrastructureRequest_20270101, HostmapDataProjectionRequest_20270101");
  }

  /**
   * Get the actual instance, which can be the following: MetricHostmapRequests_20270101,
   * HostmapInfrastructureRequest_20270101, HostmapDataProjectionRequest_20270101
   *
   * @return The actual instance (MetricHostmapRequests_20270101,
   *     HostmapInfrastructureRequest_20270101, HostmapDataProjectionRequest_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricHostmapRequests_20270101`. If the actual instance is not
   * `MetricHostmapRequests_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricHostmapRequests_20270101`
   * @throws ClassCastException if the instance is not `MetricHostmapRequests_20270101`
   */
  public MetricHostmapRequests_20270101 getMetricHostmapRequests_20270101()
      throws ClassCastException {
    return (MetricHostmapRequests_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HostmapInfrastructureRequest_20270101`. If the actual instance is
   * not `HostmapInfrastructureRequest_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HostmapInfrastructureRequest_20270101`
   * @throws ClassCastException if the instance is not `HostmapInfrastructureRequest_20270101`
   */
  public HostmapInfrastructureRequest_20270101 getHostmapInfrastructureRequest_20270101()
      throws ClassCastException {
    return (HostmapInfrastructureRequest_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HostmapDataProjectionRequest_20270101`. If the actual instance is
   * not `HostmapDataProjectionRequest_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HostmapDataProjectionRequest_20270101`
   * @throws ClassCastException if the instance is not `HostmapDataProjectionRequest_20270101`
   */
  public HostmapDataProjectionRequest_20270101 getHostmapDataProjectionRequest_20270101()
      throws ClassCastException {
    return (HostmapDataProjectionRequest_20270101) super.getActualInstance();
  }
}
