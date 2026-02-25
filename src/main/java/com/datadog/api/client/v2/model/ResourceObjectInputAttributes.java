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
@JsonDeserialize(
    using = ResourceObjectInputAttributes.ResourceObjectInputAttributesDeserializer.class)
@JsonSerialize(using = ResourceObjectInputAttributes.ResourceObjectInputAttributesSerializer.class)
public class ResourceObjectInputAttributes extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ResourceObjectInputAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ResourceObjectInputAttributesSerializer
      extends StdSerializer<ResourceObjectInputAttributes> {
    public ResourceObjectInputAttributesSerializer(Class<ResourceObjectInputAttributes> t) {
      super(t);
    }

    public ResourceObjectInputAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ResourceObjectInputAttributes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ResourceObjectInputAttributesDeserializer
      extends StdDeserializer<ResourceObjectInputAttributes> {
    public ResourceObjectInputAttributesDeserializer() {
      this(ResourceObjectInputAttributes.class);
    }

    public ResourceObjectInputAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ResourceObjectInputAttributes deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize Map<String, Object>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Map.class.equals(Integer.class)
            || Map.class.equals(Long.class)
            || Map.class.equals(Float.class)
            || Map.class.equals(Double.class)
            || Map.class.equals(Boolean.class)
            || Map.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Map.class.equals(Integer.class) || Map.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Map.class.equals(Float.class) || Map.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Map.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (Map.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'Map<String, Object>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Map<String, Object>'", e);
      }

      // deserialize JSONAPIAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (JSONAPIAttributes.class.equals(Integer.class)
            || JSONAPIAttributes.class.equals(Long.class)
            || JSONAPIAttributes.class.equals(Float.class)
            || JSONAPIAttributes.class.equals(Double.class)
            || JSONAPIAttributes.class.equals(Boolean.class)
            || JSONAPIAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((JSONAPIAttributes.class.equals(Integer.class)
                        || JSONAPIAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((JSONAPIAttributes.class.equals(Float.class)
                        || JSONAPIAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (JSONAPIAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (JSONAPIAttributes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(JSONAPIAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((JSONAPIAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'JSONAPIAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'JSONAPIAttributes'", e);
      }

      ResourceObjectInputAttributes ret = new ResourceObjectInputAttributes();
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
    public ResourceObjectInputAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      return null;
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ResourceObjectInputAttributes() {
    super("oneOf", Boolean.TRUE);
  }

  public ResourceObjectInputAttributes(Map<String, Object> o) {
    super("oneOf", Boolean.TRUE);
    setActualInstance(o);
  }

  public ResourceObjectInputAttributes(JSONAPIAttributes o) {
    super("oneOf", Boolean.TRUE);
    setActualInstance(o);
  }

  static {
    schemas.put("Map<String, Object>", new GenericType<Map<String, Object>>() {});
    schemas.put("JSONAPIAttributes", new GenericType<JSONAPIAttributes>() {});
    JSON.registerDescendants(
        ResourceObjectInputAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ResourceObjectInputAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: Map&lt;String, Object&gt;, JSONAPIAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (instance == null) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(Map.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(JSONAPIAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be Map<String, Object>, JSONAPIAttributes");
  }

  /**
   * Get the actual instance, which can be the following: Map&lt;String, Object&gt;,
   * JSONAPIAttributes
   *
   * @return The actual instance (Map&lt;String, Object&gt;, JSONAPIAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `Map&lt;String, Object&gt;`. If the actual instance is not
   * `Map&lt;String, Object&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `Map&lt;String, Object&gt;`
   * @throws ClassCastException if the instance is not `Map&lt;String, Object&gt;`
   */
  public Map<String, Object> getMap() throws ClassCastException {
    return (Map<String, Object>) super.getActualInstance();
  }

  /**
   * Get the actual instance of `JSONAPIAttributes`. If the actual instance is not
   * `JSONAPIAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `JSONAPIAttributes`
   * @throws ClassCastException if the instance is not `JSONAPIAttributes`
   */
  public JSONAPIAttributes getJSONAPIAttributes() throws ClassCastException {
    return (JSONAPIAttributes) super.getActualInstance();
  }
}
