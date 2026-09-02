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
@JsonDeserialize(using = TopologyMapWidgetDefinition.TopologyMapWidgetDefinitionDeserializer.class)
@JsonSerialize(using = TopologyMapWidgetDefinition.TopologyMapWidgetDefinitionSerializer.class)
public class TopologyMapWidgetDefinition extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TopologyMapWidgetDefinition.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TopologyMapWidgetDefinitionSerializer
      extends StdSerializer<TopologyMapWidgetDefinition> {
    public TopologyMapWidgetDefinitionSerializer(Class<TopologyMapWidgetDefinition> t) {
      super(t);
    }

    public TopologyMapWidgetDefinitionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyMapWidgetDefinition value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TopologyMapWidgetDefinitionDeserializer
      extends StdDeserializer<TopologyMapWidgetDefinition> {
    public TopologyMapWidgetDefinitionDeserializer() {
      this(TopologyMapWidgetDefinition.class);
    }

    public TopologyMapWidgetDefinitionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TopologyMapWidgetDefinition deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TopologyMapWidgetDefinitionDataStreams
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TopologyMapWidgetDefinitionDataStreams.class.equals(Integer.class)
            || TopologyMapWidgetDefinitionDataStreams.class.equals(Long.class)
            || TopologyMapWidgetDefinitionDataStreams.class.equals(Float.class)
            || TopologyMapWidgetDefinitionDataStreams.class.equals(Double.class)
            || TopologyMapWidgetDefinitionDataStreams.class.equals(Boolean.class)
            || TopologyMapWidgetDefinitionDataStreams.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TopologyMapWidgetDefinitionDataStreams.class.equals(Integer.class)
                        || TopologyMapWidgetDefinitionDataStreams.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TopologyMapWidgetDefinitionDataStreams.class.equals(Float.class)
                        || TopologyMapWidgetDefinitionDataStreams.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TopologyMapWidgetDefinitionDataStreams.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TopologyMapWidgetDefinitionDataStreams.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TopologyMapWidgetDefinitionDataStreams.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TopologyMapWidgetDefinitionDataStreams) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'TopologyMapWidgetDefinitionDataStreams'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TopologyMapWidgetDefinitionDataStreams'",
            e);
      }

      // deserialize TopologyMapWidgetDefinitionServiceMap
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TopologyMapWidgetDefinitionServiceMap.class.equals(Integer.class)
            || TopologyMapWidgetDefinitionServiceMap.class.equals(Long.class)
            || TopologyMapWidgetDefinitionServiceMap.class.equals(Float.class)
            || TopologyMapWidgetDefinitionServiceMap.class.equals(Double.class)
            || TopologyMapWidgetDefinitionServiceMap.class.equals(Boolean.class)
            || TopologyMapWidgetDefinitionServiceMap.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TopologyMapWidgetDefinitionServiceMap.class.equals(Integer.class)
                        || TopologyMapWidgetDefinitionServiceMap.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TopologyMapWidgetDefinitionServiceMap.class.equals(Float.class)
                        || TopologyMapWidgetDefinitionServiceMap.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TopologyMapWidgetDefinitionServiceMap.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TopologyMapWidgetDefinitionServiceMap.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(TopologyMapWidgetDefinitionServiceMap.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TopologyMapWidgetDefinitionServiceMap) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TopologyMapWidgetDefinitionServiceMap'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TopologyMapWidgetDefinitionServiceMap'",
            e);
      }

      TopologyMapWidgetDefinition ret = new TopologyMapWidgetDefinition();
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
    public TopologyMapWidgetDefinition getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TopologyMapWidgetDefinition cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TopologyMapWidgetDefinition() {
    super("oneOf", Boolean.FALSE);
  }

  public TopologyMapWidgetDefinition(TopologyMapWidgetDefinitionDataStreams o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TopologyMapWidgetDefinition(TopologyMapWidgetDefinitionServiceMap o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TopologyMapWidgetDefinitionDataStreams",
        new GenericType<TopologyMapWidgetDefinitionDataStreams>() {});
    schemas.put(
        "TopologyMapWidgetDefinitionServiceMap",
        new GenericType<TopologyMapWidgetDefinitionServiceMap>() {});
    JSON.registerDescendants(
        TopologyMapWidgetDefinition.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TopologyMapWidgetDefinition.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TopologyMapWidgetDefinitionDataStreams,
   * TopologyMapWidgetDefinitionServiceMap
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TopologyMapWidgetDefinitionDataStreams.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TopologyMapWidgetDefinitionServiceMap.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TopologyMapWidgetDefinitionDataStreams,"
            + " TopologyMapWidgetDefinitionServiceMap");
  }

  /**
   * Get the actual instance, which can be the following: TopologyMapWidgetDefinitionDataStreams,
   * TopologyMapWidgetDefinitionServiceMap
   *
   * @return The actual instance (TopologyMapWidgetDefinitionDataStreams,
   *     TopologyMapWidgetDefinitionServiceMap)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TopologyMapWidgetDefinitionDataStreams`. If the actual instance is
   * not `TopologyMapWidgetDefinitionDataStreams`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TopologyMapWidgetDefinitionDataStreams`
   * @throws ClassCastException if the instance is not `TopologyMapWidgetDefinitionDataStreams`
   */
  public TopologyMapWidgetDefinitionDataStreams getTopologyMapWidgetDefinitionDataStreams()
      throws ClassCastException {
    return (TopologyMapWidgetDefinitionDataStreams) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TopologyMapWidgetDefinitionServiceMap`. If the actual instance is
   * not `TopologyMapWidgetDefinitionServiceMap`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TopologyMapWidgetDefinitionServiceMap`
   * @throws ClassCastException if the instance is not `TopologyMapWidgetDefinitionServiceMap`
   */
  public TopologyMapWidgetDefinitionServiceMap getTopologyMapWidgetDefinitionServiceMap()
      throws ClassCastException {
    return (TopologyMapWidgetDefinitionServiceMap) super.getActualInstance();
  }
}
