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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using =
        CIAppCreatePipelineEventRequestDataSingleOrArray
            .CIAppCreatePipelineEventRequestDataSingleOrArrayDeserializer.class)
@JsonSerialize(
    using =
        CIAppCreatePipelineEventRequestDataSingleOrArray
            .CIAppCreatePipelineEventRequestDataSingleOrArraySerializer.class)
public class CIAppCreatePipelineEventRequestDataSingleOrArray extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CIAppCreatePipelineEventRequestDataSingleOrArray.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CIAppCreatePipelineEventRequestDataSingleOrArraySerializer
      extends StdSerializer<CIAppCreatePipelineEventRequestDataSingleOrArray> {
    public CIAppCreatePipelineEventRequestDataSingleOrArraySerializer(
        Class<CIAppCreatePipelineEventRequestDataSingleOrArray> t) {
      super(t);
    }

    public CIAppCreatePipelineEventRequestDataSingleOrArraySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppCreatePipelineEventRequestDataSingleOrArray value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CIAppCreatePipelineEventRequestDataSingleOrArrayDeserializer
      extends StdDeserializer<CIAppCreatePipelineEventRequestDataSingleOrArray> {
    public CIAppCreatePipelineEventRequestDataSingleOrArrayDeserializer() {
      this(CIAppCreatePipelineEventRequestDataSingleOrArray.class);
    }

    public CIAppCreatePipelineEventRequestDataSingleOrArrayDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CIAppCreatePipelineEventRequestDataSingleOrArray deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CIAppCreatePipelineEventRequestData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CIAppCreatePipelineEventRequestData.class.equals(Integer.class)
            || CIAppCreatePipelineEventRequestData.class.equals(Long.class)
            || CIAppCreatePipelineEventRequestData.class.equals(Float.class)
            || CIAppCreatePipelineEventRequestData.class.equals(Double.class)
            || CIAppCreatePipelineEventRequestData.class.equals(Boolean.class)
            || CIAppCreatePipelineEventRequestData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CIAppCreatePipelineEventRequestData.class.equals(Integer.class)
                        || CIAppCreatePipelineEventRequestData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CIAppCreatePipelineEventRequestData.class.equals(Float.class)
                        || CIAppCreatePipelineEventRequestData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CIAppCreatePipelineEventRequestData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CIAppCreatePipelineEventRequestData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CIAppCreatePipelineEventRequestData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CIAppCreatePipelineEventRequestData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CIAppCreatePipelineEventRequestData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CIAppCreatePipelineEventRequestData'",
            e);
      }

      // deserialize List<CIAppCreatePipelineEventRequestData>
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
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(new TypeReference<List<CIAppCreatePipelineEventRequestData>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(
              Level.FINER, "Input data matches schema 'List<CIAppCreatePipelineEventRequestData>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'List<CIAppCreatePipelineEventRequestData>'",
            e);
      }

      CIAppCreatePipelineEventRequestDataSingleOrArray ret =
          new CIAppCreatePipelineEventRequestDataSingleOrArray();
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
    public CIAppCreatePipelineEventRequestDataSingleOrArray getNullValue(
        DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CIAppCreatePipelineEventRequestDataSingleOrArray cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CIAppCreatePipelineEventRequestDataSingleOrArray() {
    super("oneOf", Boolean.FALSE);
  }

  public CIAppCreatePipelineEventRequestDataSingleOrArray(CIAppCreatePipelineEventRequestData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CIAppCreatePipelineEventRequestDataSingleOrArray(
      List<CIAppCreatePipelineEventRequestData> o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CIAppCreatePipelineEventRequestData",
        new GenericType<CIAppCreatePipelineEventRequestData>() {});
    schemas.put(
        "List<CIAppCreatePipelineEventRequestData>",
        new GenericType<List<CIAppCreatePipelineEventRequestData>>() {});
    JSON.registerDescendants(
        CIAppCreatePipelineEventRequestDataSingleOrArray.class,
        Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CIAppCreatePipelineEventRequestDataSingleOrArray.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CIAppCreatePipelineEventRequestData,
   * List&lt;CIAppCreatePipelineEventRequestData&gt;
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CIAppCreatePipelineEventRequestData.class, instance, new HashSet<Class<?>>())) {
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
    throw new RuntimeException(
        "Invalid instance type. Must be CIAppCreatePipelineEventRequestData,"
            + " List<CIAppCreatePipelineEventRequestData>");
  }

  /**
   * Get the actual instance, which can be the following: CIAppCreatePipelineEventRequestData,
   * List&lt;CIAppCreatePipelineEventRequestData&gt;
   *
   * @return The actual instance (CIAppCreatePipelineEventRequestData,
   *     List&lt;CIAppCreatePipelineEventRequestData&gt;)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CIAppCreatePipelineEventRequestData`. If the actual instance is not
   * `CIAppCreatePipelineEventRequestData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CIAppCreatePipelineEventRequestData`
   * @throws ClassCastException if the instance is not `CIAppCreatePipelineEventRequestData`
   */
  public CIAppCreatePipelineEventRequestData getCIAppCreatePipelineEventRequestData()
      throws ClassCastException {
    return (CIAppCreatePipelineEventRequestData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;CIAppCreatePipelineEventRequestData&gt;`. If the actual
   * instance is not `List&lt;CIAppCreatePipelineEventRequestData&gt;`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `List&lt;CIAppCreatePipelineEventRequestData&gt;`
   * @throws ClassCastException if the instance is not
   *     `List&lt;CIAppCreatePipelineEventRequestData&gt;`
   */
  public List<CIAppCreatePipelineEventRequestData> getList() throws ClassCastException {
    return (List<CIAppCreatePipelineEventRequestData>) super.getActualInstance();
  }
}
