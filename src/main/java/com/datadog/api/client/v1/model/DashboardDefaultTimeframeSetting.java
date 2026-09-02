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
    using = DashboardDefaultTimeframeSetting.DashboardDefaultTimeframeSettingDeserializer.class)
@JsonSerialize(
    using = DashboardDefaultTimeframeSetting.DashboardDefaultTimeframeSettingSerializer.class)
public class DashboardDefaultTimeframeSetting extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DashboardDefaultTimeframeSetting.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DashboardDefaultTimeframeSettingSerializer
      extends StdSerializer<DashboardDefaultTimeframeSetting> {
    public DashboardDefaultTimeframeSettingSerializer(Class<DashboardDefaultTimeframeSetting> t) {
      super(t);
    }

    public DashboardDefaultTimeframeSettingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardDefaultTimeframeSetting value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DashboardDefaultTimeframeSettingDeserializer
      extends StdDeserializer<DashboardDefaultTimeframeSetting> {
    public DashboardDefaultTimeframeSettingDeserializer() {
      this(DashboardDefaultTimeframeSetting.class);
    }

    public DashboardDefaultTimeframeSettingDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DashboardDefaultTimeframeSetting deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DashboardLiveTimeframe
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardLiveTimeframe.class.equals(Integer.class)
            || DashboardLiveTimeframe.class.equals(Long.class)
            || DashboardLiveTimeframe.class.equals(Float.class)
            || DashboardLiveTimeframe.class.equals(Double.class)
            || DashboardLiveTimeframe.class.equals(Boolean.class)
            || DashboardLiveTimeframe.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardLiveTimeframe.class.equals(Integer.class)
                        || DashboardLiveTimeframe.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardLiveTimeframe.class.equals(Float.class)
                        || DashboardLiveTimeframe.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardLiveTimeframe.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardLiveTimeframe.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardLiveTimeframe.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DashboardLiveTimeframe) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DashboardLiveTimeframe'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardLiveTimeframe'", e);
      }

      // deserialize DashboardFixedTimeframe
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardFixedTimeframe.class.equals(Integer.class)
            || DashboardFixedTimeframe.class.equals(Long.class)
            || DashboardFixedTimeframe.class.equals(Float.class)
            || DashboardFixedTimeframe.class.equals(Double.class)
            || DashboardFixedTimeframe.class.equals(Boolean.class)
            || DashboardFixedTimeframe.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardFixedTimeframe.class.equals(Integer.class)
                        || DashboardFixedTimeframe.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardFixedTimeframe.class.equals(Float.class)
                        || DashboardFixedTimeframe.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardFixedTimeframe.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardFixedTimeframe.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardFixedTimeframe.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DashboardFixedTimeframe) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DashboardFixedTimeframe'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardFixedTimeframe'", e);
      }

      DashboardDefaultTimeframeSetting ret = new DashboardDefaultTimeframeSetting();
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
    public DashboardDefaultTimeframeSetting getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DashboardDefaultTimeframeSetting cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DashboardDefaultTimeframeSetting() {
    super("oneOf", Boolean.FALSE);
  }

  public DashboardDefaultTimeframeSetting(DashboardLiveTimeframe o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DashboardDefaultTimeframeSetting(DashboardFixedTimeframe o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("DashboardLiveTimeframe", new GenericType<DashboardLiveTimeframe>() {});
    schemas.put("DashboardFixedTimeframe", new GenericType<DashboardFixedTimeframe>() {});
    JSON.registerDescendants(
        DashboardDefaultTimeframeSetting.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DashboardDefaultTimeframeSetting.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DashboardLiveTimeframe, DashboardFixedTimeframe
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(DashboardLiveTimeframe.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DashboardFixedTimeframe.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DashboardLiveTimeframe, DashboardFixedTimeframe");
  }

  /**
   * Get the actual instance, which can be the following: DashboardLiveTimeframe,
   * DashboardFixedTimeframe
   *
   * @return The actual instance (DashboardLiveTimeframe, DashboardFixedTimeframe)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardLiveTimeframe`. If the actual instance is not
   * `DashboardLiveTimeframe`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardLiveTimeframe`
   * @throws ClassCastException if the instance is not `DashboardLiveTimeframe`
   */
  public DashboardLiveTimeframe getDashboardLiveTimeframe() throws ClassCastException {
    return (DashboardLiveTimeframe) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardFixedTimeframe`. If the actual instance is not
   * `DashboardFixedTimeframe`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardFixedTimeframe`
   * @throws ClassCastException if the instance is not `DashboardFixedTimeframe`
   */
  public DashboardFixedTimeframe getDashboardFixedTimeframe() throws ClassCastException {
    return (DashboardFixedTimeframe) super.getActualInstance();
  }
}
