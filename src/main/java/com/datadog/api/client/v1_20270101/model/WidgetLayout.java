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
@JsonDeserialize(using = WidgetLayout.WidgetLayoutDeserializer.class)
@JsonSerialize(using = WidgetLayout.WidgetLayoutSerializer.class)
public class WidgetLayout extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(WidgetLayout.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class WidgetLayoutSerializer extends StdSerializer<WidgetLayout> {
    public WidgetLayoutSerializer(Class<WidgetLayout> t) {
      super(t);
    }

    public WidgetLayoutSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetLayout value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class WidgetLayoutDeserializer extends StdDeserializer<WidgetLayout> {
    public WidgetLayoutDeserializer() {
      this(WidgetLayout.class);
    }

    public WidgetLayoutDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public WidgetLayout deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize FreeLayout
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FreeLayout.class.equals(Integer.class)
            || FreeLayout.class.equals(Long.class)
            || FreeLayout.class.equals(Float.class)
            || FreeLayout.class.equals(Double.class)
            || FreeLayout.class.equals(Boolean.class)
            || FreeLayout.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FreeLayout.class.equals(Integer.class) || FreeLayout.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FreeLayout.class.equals(Float.class) || FreeLayout.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FreeLayout.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FreeLayout.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FreeLayout.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FreeLayout) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FreeLayout'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FreeLayout'", e);
      }

      // deserialize MSLWidgetLayout
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MSLWidgetLayout.class.equals(Integer.class)
            || MSLWidgetLayout.class.equals(Long.class)
            || MSLWidgetLayout.class.equals(Float.class)
            || MSLWidgetLayout.class.equals(Double.class)
            || MSLWidgetLayout.class.equals(Boolean.class)
            || MSLWidgetLayout.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MSLWidgetLayout.class.equals(Integer.class)
                        || MSLWidgetLayout.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MSLWidgetLayout.class.equals(Float.class)
                        || MSLWidgetLayout.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MSLWidgetLayout.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MSLWidgetLayout.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MSLWidgetLayout.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MSLWidgetLayout) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MSLWidgetLayout'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MSLWidgetLayout'", e);
      }

      // deserialize MSLBackendWidgetLayout
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MSLBackendWidgetLayout.class.equals(Integer.class)
            || MSLBackendWidgetLayout.class.equals(Long.class)
            || MSLBackendWidgetLayout.class.equals(Float.class)
            || MSLBackendWidgetLayout.class.equals(Double.class)
            || MSLBackendWidgetLayout.class.equals(Boolean.class)
            || MSLBackendWidgetLayout.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MSLBackendWidgetLayout.class.equals(Integer.class)
                        || MSLBackendWidgetLayout.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MSLBackendWidgetLayout.class.equals(Float.class)
                        || MSLBackendWidgetLayout.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MSLBackendWidgetLayout.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MSLBackendWidgetLayout.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MSLBackendWidgetLayout.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MSLBackendWidgetLayout) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MSLBackendWidgetLayout'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MSLBackendWidgetLayout'", e);
      }

      WidgetLayout ret = new WidgetLayout();
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
    public WidgetLayout getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "WidgetLayout cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public WidgetLayout() {
    super("oneOf", Boolean.FALSE);
  }

  public WidgetLayout(FreeLayout o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetLayout(MSLWidgetLayout o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetLayout(MSLBackendWidgetLayout o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("FreeLayout", new GenericType<FreeLayout>() {});
    schemas.put("MSLWidgetLayout", new GenericType<MSLWidgetLayout>() {});
    schemas.put("MSLBackendWidgetLayout", new GenericType<MSLBackendWidgetLayout>() {});
    JSON.registerDescendants(WidgetLayout.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return WidgetLayout.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FreeLayout, MSLWidgetLayout, MSLBackendWidgetLayout
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(FreeLayout.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MSLWidgetLayout.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MSLBackendWidgetLayout.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be FreeLayout, MSLWidgetLayout, MSLBackendWidgetLayout");
  }

  /**
   * Get the actual instance, which can be the following: FreeLayout, MSLWidgetLayout,
   * MSLBackendWidgetLayout
   *
   * @return The actual instance (FreeLayout, MSLWidgetLayout, MSLBackendWidgetLayout)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `FreeLayout`. If the actual instance is not `FreeLayout`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `FreeLayout`
   * @throws ClassCastException if the instance is not `FreeLayout`
   */
  public FreeLayout getFreeLayout() throws ClassCastException {
    return (FreeLayout) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MSLWidgetLayout`. If the actual instance is not `MSLWidgetLayout`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `MSLWidgetLayout`
   * @throws ClassCastException if the instance is not `MSLWidgetLayout`
   */
  public MSLWidgetLayout getMSLWidgetLayout() throws ClassCastException {
    return (MSLWidgetLayout) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MSLBackendWidgetLayout`. If the actual instance is not
   * `MSLBackendWidgetLayout`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MSLBackendWidgetLayout`
   * @throws ClassCastException if the instance is not `MSLBackendWidgetLayout`
   */
  public MSLBackendWidgetLayout getMSLBackendWidgetLayout() throws ClassCastException {
    return (MSLBackendWidgetLayout) super.getActualInstance();
  }
}
