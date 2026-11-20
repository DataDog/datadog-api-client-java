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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using = CohortDefinition20270101Requests.CohortDefinition20270101RequestsDeserializer.class)
@JsonSerialize(
    using = CohortDefinition20270101Requests.CohortDefinition20270101RequestsSerializer.class)
public class CohortDefinition20270101Requests extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CohortDefinition20270101Requests.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CohortDefinition20270101RequestsSerializer
      extends StdSerializer<CohortDefinition20270101Requests> {
    public CohortDefinition20270101RequestsSerializer(Class<CohortDefinition20270101Requests> t) {
      super(t);
    }

    public CohortDefinition20270101RequestsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CohortDefinition20270101Requests value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CohortDefinition20270101RequestsDeserializer
      extends StdDeserializer<CohortDefinition20270101Requests> {
    public CohortDefinition20270101RequestsDeserializer() {
      this(CohortDefinition20270101Requests.class);
    }

    public CohortDefinition20270101RequestsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CohortDefinition20270101Requests deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize List<Object>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (List.class.equals(Integer.class)
            || List.class.equals(Long.class)
            || List.class.equals(Float.class)
            || List.class.equals(Double.class)
            || List.class.equals(Boolean.class)
            || List.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((List.class.equals(Integer.class) || List.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((List.class.equals(Float.class) || List.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (List.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<List<Object>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'List<Object>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'List<Object>'", e);
      }

      // deserialize List<Object>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (List.class.equals(Integer.class)
            || List.class.equals(Long.class)
            || List.class.equals(Float.class)
            || List.class.equals(Double.class)
            || List.class.equals(Boolean.class)
            || List.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((List.class.equals(Integer.class) || List.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((List.class.equals(Float.class) || List.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (List.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<List<Object>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'List<Object>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'List<Object>'", e);
      }

      CohortDefinition20270101Requests ret = new CohortDefinition20270101Requests();
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
    public CohortDefinition20270101Requests getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CohortDefinition20270101Requests cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CohortDefinition20270101Requests() {
    super("oneOf", Boolean.FALSE);
  }

  public static CohortDefinition20270101Requests fromObjectList(List<Object> o) {
    CohortDefinition20270101Requests instance = new CohortDefinition20270101Requests();
    instance.setActualInstance(o);
    return instance;
  }

  public static CohortDefinition20270101Requests fromObjectList(List<Object> o) {
    CohortDefinition20270101Requests instance = new CohortDefinition20270101Requests();
    instance.setActualInstance(o);
    return instance;
  }

  static {
    schemas.put("List<Object>", new GenericType<List<Object>>() {});
    schemas.put("List<Object>", new GenericType<List<Object>>() {});
    JSON.registerDescendants(
        CohortDefinition20270101Requests.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CohortDefinition20270101Requests.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: List&lt;Object&gt;, List&lt;Object&gt;
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be List<Object>, List<Object>");
  }

  /**
   * Get the actual instance, which can be the following: List&lt;Object&gt;, List&lt;Object&gt;
   *
   * @return The actual instance (List&lt;Object&gt;, List&lt;Object&gt;)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;Object&gt;`. If the actual instance is not
   * `List&lt;Object&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `List&lt;Object&gt;`
   * @throws ClassCastException if the instance is not `List&lt;Object&gt;`
   */
  public List<Object> getObjectList() throws ClassCastException {
    return (List<Object>) super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;Object&gt;`. If the actual instance is not
   * `List&lt;Object&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `List&lt;Object&gt;`
   * @throws ClassCastException if the instance is not `List&lt;Object&gt;`
   */
  public List<Object> getObjectList() throws ClassCastException {
    return (List<Object>) super.getActualInstance();
  }
}
