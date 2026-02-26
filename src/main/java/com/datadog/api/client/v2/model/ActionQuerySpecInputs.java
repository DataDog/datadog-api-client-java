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
@JsonDeserialize(using = ActionQuerySpecInputs.ActionQuerySpecInputsDeserializer.class)
@JsonSerialize(using = ActionQuerySpecInputs.ActionQuerySpecInputsSerializer.class)
public class ActionQuerySpecInputs extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ActionQuerySpecInputs.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ActionQuerySpecInputsSerializer extends StdSerializer<ActionQuerySpecInputs> {
    public ActionQuerySpecInputsSerializer(Class<ActionQuerySpecInputs> t) {
      super(t);
    }

    public ActionQuerySpecInputsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ActionQuerySpecInputs value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ActionQuerySpecInputsDeserializer
      extends StdDeserializer<ActionQuerySpecInputs> {
    public ActionQuerySpecInputsDeserializer() {
      this(ActionQuerySpecInputs.class);
    }

    public ActionQuerySpecInputsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ActionQuerySpecInputs deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize String
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (String.class.equals(Integer.class)
            || String.class.equals(Long.class)
            || String.class.equals(Float.class)
            || String.class.equals(Double.class)
            || String.class.equals(Boolean.class)
            || String.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((String.class.equals(Integer.class) || String.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((String.class.equals(Float.class) || String.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (String.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (String.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(String.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'String'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'String'", e);
      }

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

      ActionQuerySpecInputs ret = new ActionQuerySpecInputs();
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
    public ActionQuerySpecInputs getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ActionQuerySpecInputs cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ActionQuerySpecInputs() {
    super("oneOf", Boolean.FALSE);
  }

  public ActionQuerySpecInputs(String o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ActionQuerySpecInputs(Map<String, Object> o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("String", new GenericType<String>() {});
    schemas.put("Map<String, Object>", new GenericType<Map<String, Object>>() {});
    JSON.registerDescendants(ActionQuerySpecInputs.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ActionQuerySpecInputs.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: String, Map&lt;String, Object&gt;
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Map.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be String, Map<String, Object>");
  }

  /**
   * Get the actual instance, which can be the following: String, Map&lt;String, Object&gt;
   *
   * @return The actual instance (String, Map&lt;String, Object&gt;)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `String`. If the actual instance is not `String`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `String`
   * @throws ClassCastException if the instance is not `String`
   */
  public String getString() throws ClassCastException {
    return (String) super.getActualInstance();
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
}
