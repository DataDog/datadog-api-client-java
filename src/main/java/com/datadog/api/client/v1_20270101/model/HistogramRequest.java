/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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
@JsonDeserialize(using = HistogramRequest.HistogramRequestDeserializer.class)
@JsonSerialize(using = HistogramRequest.HistogramRequestSerializer.class)
public class HistogramRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(HistogramRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class HistogramRequestSerializer extends StdSerializer<HistogramRequest> {
    public HistogramRequestSerializer(Class<HistogramRequest> t) {
      super(t);
    }

    public HistogramRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(HistogramRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class HistogramRequestDeserializer extends StdDeserializer<HistogramRequest> {
    public HistogramRequestDeserializer() {
      this(HistogramRequest.class);
    }

    public HistogramRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public HistogramRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize MetricsHistogramRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricsHistogramRequest.class.equals(Integer.class)
            || MetricsHistogramRequest.class.equals(Long.class)
            || MetricsHistogramRequest.class.equals(Float.class)
            || MetricsHistogramRequest.class.equals(Double.class)
            || MetricsHistogramRequest.class.equals(Boolean.class)
            || MetricsHistogramRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricsHistogramRequest.class.equals(Integer.class)
                        || MetricsHistogramRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricsHistogramRequest.class.equals(Float.class)
                        || MetricsHistogramRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricsHistogramRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricsHistogramRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricsHistogramRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricsHistogramRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricsHistogramRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MetricsHistogramRequest'", e);
      }

      // deserialize ApmStatsHistogramRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ApmStatsHistogramRequest.class.equals(Integer.class)
            || ApmStatsHistogramRequest.class.equals(Long.class)
            || ApmStatsHistogramRequest.class.equals(Float.class)
            || ApmStatsHistogramRequest.class.equals(Double.class)
            || ApmStatsHistogramRequest.class.equals(Boolean.class)
            || ApmStatsHistogramRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ApmStatsHistogramRequest.class.equals(Integer.class)
                        || ApmStatsHistogramRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ApmStatsHistogramRequest.class.equals(Float.class)
                        || ApmStatsHistogramRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ApmStatsHistogramRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ApmStatsHistogramRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ApmStatsHistogramRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ApmStatsHistogramRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ApmStatsHistogramRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ApmStatsHistogramRequest'", e);
      }

      // deserialize ApmMetricsHistogramRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ApmMetricsHistogramRequest.class.equals(Integer.class)
            || ApmMetricsHistogramRequest.class.equals(Long.class)
            || ApmMetricsHistogramRequest.class.equals(Float.class)
            || ApmMetricsHistogramRequest.class.equals(Double.class)
            || ApmMetricsHistogramRequest.class.equals(Boolean.class)
            || ApmMetricsHistogramRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ApmMetricsHistogramRequest.class.equals(Integer.class)
                        || ApmMetricsHistogramRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ApmMetricsHistogramRequest.class.equals(Float.class)
                        || ApmMetricsHistogramRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ApmMetricsHistogramRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ApmMetricsHistogramRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ApmMetricsHistogramRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ApmMetricsHistogramRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ApmMetricsHistogramRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ApmMetricsHistogramRequest'", e);
      }

      // deserialize EventsHistogramRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsHistogramRequest.class.equals(Integer.class)
            || EventsHistogramRequest.class.equals(Long.class)
            || EventsHistogramRequest.class.equals(Float.class)
            || EventsHistogramRequest.class.equals(Double.class)
            || EventsHistogramRequest.class.equals(Boolean.class)
            || EventsHistogramRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsHistogramRequest.class.equals(Integer.class)
                        || EventsHistogramRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsHistogramRequest.class.equals(Float.class)
                        || EventsHistogramRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsHistogramRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsHistogramRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventsHistogramRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsHistogramRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventsHistogramRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventsHistogramRequest'", e);
      }

      HistogramRequest ret = new HistogramRequest();
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
    public HistogramRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "HistogramRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public HistogramRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public HistogramRequest(MetricsHistogramRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HistogramRequest(ApmStatsHistogramRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HistogramRequest(ApmMetricsHistogramRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public HistogramRequest(EventsHistogramRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("MetricsHistogramRequest", new GenericType<MetricsHistogramRequest>() {});
    schemas.put("ApmStatsHistogramRequest", new GenericType<ApmStatsHistogramRequest>() {});
    schemas.put("ApmMetricsHistogramRequest", new GenericType<ApmMetricsHistogramRequest>() {});
    schemas.put("EventsHistogramRequest", new GenericType<EventsHistogramRequest>() {});
    JSON.registerDescendants(HistogramRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return HistogramRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: MetricsHistogramRequest, ApmStatsHistogramRequest,
   * ApmMetricsHistogramRequest, EventsHistogramRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(MetricsHistogramRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ApmStatsHistogramRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ApmMetricsHistogramRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventsHistogramRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be MetricsHistogramRequest, ApmStatsHistogramRequest,"
            + " ApmMetricsHistogramRequest, EventsHistogramRequest");
  }

  /**
   * Get the actual instance, which can be the following: MetricsHistogramRequest,
   * ApmStatsHistogramRequest, ApmMetricsHistogramRequest, EventsHistogramRequest
   *
   * @return The actual instance (MetricsHistogramRequest, ApmStatsHistogramRequest,
   *     ApmMetricsHistogramRequest, EventsHistogramRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricsHistogramRequest`. If the actual instance is not
   * `MetricsHistogramRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricsHistogramRequest`
   * @throws ClassCastException if the instance is not `MetricsHistogramRequest`
   */
  public MetricsHistogramRequest getMetricsHistogramRequest() throws ClassCastException {
    return (MetricsHistogramRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ApmStatsHistogramRequest`. If the actual instance is not
   * `ApmStatsHistogramRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ApmStatsHistogramRequest`
   * @throws ClassCastException if the instance is not `ApmStatsHistogramRequest`
   */
  public ApmStatsHistogramRequest getApmStatsHistogramRequest() throws ClassCastException {
    return (ApmStatsHistogramRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ApmMetricsHistogramRequest`. If the actual instance is not
   * `ApmMetricsHistogramRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ApmMetricsHistogramRequest`
   * @throws ClassCastException if the instance is not `ApmMetricsHistogramRequest`
   */
  public ApmMetricsHistogramRequest getApmMetricsHistogramRequest() throws ClassCastException {
    return (ApmMetricsHistogramRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsHistogramRequest`. If the actual instance is not
   * `EventsHistogramRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventsHistogramRequest`
   * @throws ClassCastException if the instance is not `EventsHistogramRequest`
   */
  public EventsHistogramRequest getEventsHistogramRequest() throws ClassCastException {
    return (EventsHistogramRequest) super.getActualInstance();
  }
}
