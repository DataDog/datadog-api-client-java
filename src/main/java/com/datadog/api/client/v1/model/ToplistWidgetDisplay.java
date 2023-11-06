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
@JsonDeserialize(using = ToplistWidgetDisplay.ToplistWidgetDisplayDeserializer.class)
@JsonSerialize(using = ToplistWidgetDisplay.ToplistWidgetDisplaySerializer.class)
public class ToplistWidgetDisplay extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ToplistWidgetDisplay.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ToplistWidgetDisplaySerializer extends StdSerializer<ToplistWidgetDisplay> {
    public ToplistWidgetDisplaySerializer(Class<ToplistWidgetDisplay> t) {
      super(t);
    }

    public ToplistWidgetDisplaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistWidgetDisplay value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ToplistWidgetDisplayDeserializer
      extends StdDeserializer<ToplistWidgetDisplay> {
    public ToplistWidgetDisplayDeserializer() {
      this(ToplistWidgetDisplay.class);
    }

    public ToplistWidgetDisplayDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ToplistWidgetDisplay deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ToplistWidgetStacked
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistWidgetStacked.class.equals(Integer.class)
            || ToplistWidgetStacked.class.equals(Long.class)
            || ToplistWidgetStacked.class.equals(Float.class)
            || ToplistWidgetStacked.class.equals(Double.class)
            || ToplistWidgetStacked.class.equals(Boolean.class)
            || ToplistWidgetStacked.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistWidgetStacked.class.equals(Integer.class)
                        || ToplistWidgetStacked.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistWidgetStacked.class.equals(Float.class)
                        || ToplistWidgetStacked.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistWidgetStacked.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistWidgetStacked.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistWidgetStacked.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistWidgetStacked) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ToplistWidgetStacked'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ToplistWidgetStacked'", e);
      }

      // deserialize ToplistWidgetFlat
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistWidgetFlat.class.equals(Integer.class)
            || ToplistWidgetFlat.class.equals(Long.class)
            || ToplistWidgetFlat.class.equals(Float.class)
            || ToplistWidgetFlat.class.equals(Double.class)
            || ToplistWidgetFlat.class.equals(Boolean.class)
            || ToplistWidgetFlat.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistWidgetFlat.class.equals(Integer.class)
                        || ToplistWidgetFlat.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistWidgetFlat.class.equals(Float.class)
                        || ToplistWidgetFlat.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistWidgetFlat.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistWidgetFlat.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistWidgetFlat.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistWidgetFlat) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ToplistWidgetFlat'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ToplistWidgetFlat'", e);
      }

      ToplistWidgetDisplay ret = new ToplistWidgetDisplay();
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
    public ToplistWidgetDisplay getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ToplistWidgetDisplay cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ToplistWidgetDisplay() {
    super("oneOf", Boolean.FALSE);
  }

  public ToplistWidgetDisplay(ToplistWidgetStacked o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistWidgetDisplay(ToplistWidgetFlat o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ToplistWidgetStacked", new GenericType<ToplistWidgetStacked>() {});
    schemas.put("ToplistWidgetFlat", new GenericType<ToplistWidgetFlat>() {});
    JSON.registerDescendants(ToplistWidgetDisplay.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ToplistWidgetDisplay.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ToplistWidgetStacked, ToplistWidgetFlat
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ToplistWidgetStacked.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ToplistWidgetFlat.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ToplistWidgetStacked, ToplistWidgetFlat");
  }

  /**
   * Get the actual instance, which can be the following: ToplistWidgetStacked, ToplistWidgetFlat
   *
   * @return The actual instance (ToplistWidgetStacked, ToplistWidgetFlat)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistWidgetStacked`. If the actual instance is not
   * `ToplistWidgetStacked`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistWidgetStacked`
   * @throws ClassCastException if the instance is not `ToplistWidgetStacked`
   */
  public ToplistWidgetStacked getToplistWidgetStacked() throws ClassCastException {
    return (ToplistWidgetStacked) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistWidgetFlat`. If the actual instance is not
   * `ToplistWidgetFlat`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistWidgetFlat`
   * @throws ClassCastException if the instance is not `ToplistWidgetFlat`
   */
  public ToplistWidgetFlat getToplistWidgetFlat() throws ClassCastException {
    return (ToplistWidgetFlat) super.getActualInstance();
  }
}
