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
@JsonDeserialize(using = LegacyLiveSpan.LegacyLiveSpanDeserializer.class)
@JsonSerialize(using = LegacyLiveSpan.LegacyLiveSpanSerializer.class)
public class LegacyLiveSpan extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(LegacyLiveSpan.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class LegacyLiveSpanSerializer extends StdSerializer<LegacyLiveSpan> {
    public LegacyLiveSpanSerializer(Class<LegacyLiveSpan> t) {
      super(t);
    }

    public LegacyLiveSpanSerializer() {
      this(null);
    }

    @Override
    public void serialize(LegacyLiveSpan value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class LegacyLiveSpanDeserializer extends StdDeserializer<LegacyLiveSpan> {
    public LegacyLiveSpanDeserializer() {
      this(LegacyLiveSpan.class);
    }

    public LegacyLiveSpanDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public LegacyLiveSpan deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TimeSpan
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeSpan.class.equals(Integer.class)
            || TimeSpan.class.equals(Long.class)
            || TimeSpan.class.equals(Float.class)
            || TimeSpan.class.equals(Double.class)
            || TimeSpan.class.equals(Boolean.class)
            || TimeSpan.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeSpan.class.equals(Integer.class) || TimeSpan.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeSpan.class.equals(Float.class) || TimeSpan.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeSpan.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeSpan.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeSpan.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'TimeSpan'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeSpan'", e);
      }

      // deserialize DashboardInlineSchema43
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardInlineSchema43.class.equals(Integer.class)
            || DashboardInlineSchema43.class.equals(Long.class)
            || DashboardInlineSchema43.class.equals(Float.class)
            || DashboardInlineSchema43.class.equals(Double.class)
            || DashboardInlineSchema43.class.equals(Boolean.class)
            || DashboardInlineSchema43.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardInlineSchema43.class.equals(Integer.class)
                        || DashboardInlineSchema43.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardInlineSchema43.class.equals(Float.class)
                        || DashboardInlineSchema43.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardInlineSchema43.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardInlineSchema43.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardInlineSchema43.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'DashboardInlineSchema43'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardInlineSchema43'", e);
      }

      LegacyLiveSpan ret = new LegacyLiveSpan();
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
    public LegacyLiveSpan getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "LegacyLiveSpan cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public LegacyLiveSpan() {
    super("oneOf", Boolean.FALSE);
  }

  public LegacyLiveSpan(TimeSpan o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public LegacyLiveSpan(DashboardInlineSchema43 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TimeSpan", new GenericType<TimeSpan>() {});
    schemas.put("DashboardInlineSchema43", new GenericType<DashboardInlineSchema43>() {});
    JSON.registerDescendants(LegacyLiveSpan.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LegacyLiveSpan.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TimeSpan, DashboardInlineSchema43
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TimeSpan.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DashboardInlineSchema43.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be TimeSpan, DashboardInlineSchema43");
  }

  /**
   * Get the actual instance, which can be the following: TimeSpan, DashboardInlineSchema43
   *
   * @return The actual instance (TimeSpan, DashboardInlineSchema43)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeSpan`. If the actual instance is not `TimeSpan`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeSpan`
   * @throws ClassCastException if the instance is not `TimeSpan`
   */
  public TimeSpan getTimeSpan() throws ClassCastException {
    return (TimeSpan) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardInlineSchema43`. If the actual instance is not
   * `DashboardInlineSchema43`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardInlineSchema43`
   * @throws ClassCastException if the instance is not `DashboardInlineSchema43`
   */
  public DashboardInlineSchema43 getDashboardInlineSchema43() throws ClassCastException {
    return (DashboardInlineSchema43) super.getActualInstance();
  }
}
