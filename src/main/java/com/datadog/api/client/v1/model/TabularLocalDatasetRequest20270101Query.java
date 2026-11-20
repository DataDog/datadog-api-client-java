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
    using =
        TabularLocalDatasetRequest20270101Query.TabularLocalDatasetRequest20270101QueryDeserializer
            .class)
@JsonSerialize(
    using =
        TabularLocalDatasetRequest20270101Query.TabularLocalDatasetRequest20270101QuerySerializer
            .class)
public class TabularLocalDatasetRequest20270101Query extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(TabularLocalDatasetRequest20270101Query.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TabularLocalDatasetRequest20270101QuerySerializer
      extends StdSerializer<TabularLocalDatasetRequest20270101Query> {
    public TabularLocalDatasetRequest20270101QuerySerializer(
        Class<TabularLocalDatasetRequest20270101Query> t) {
      super(t);
    }

    public TabularLocalDatasetRequest20270101QuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TabularLocalDatasetRequest20270101Query value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TabularLocalDatasetRequest20270101QueryDeserializer
      extends StdDeserializer<TabularLocalDatasetRequest20270101Query> {
    public TabularLocalDatasetRequest20270101QueryDeserializer() {
      this(TabularLocalDatasetRequest20270101Query.class);
    }

    public TabularLocalDatasetRequest20270101QueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TabularLocalDatasetRequest20270101Query deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize StructuredAnalysisQuery_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StructuredAnalysisQuery_20270101.class.equals(Integer.class)
            || StructuredAnalysisQuery_20270101.class.equals(Long.class)
            || StructuredAnalysisQuery_20270101.class.equals(Float.class)
            || StructuredAnalysisQuery_20270101.class.equals(Double.class)
            || StructuredAnalysisQuery_20270101.class.equals(Boolean.class)
            || StructuredAnalysisQuery_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StructuredAnalysisQuery_20270101.class.equals(Integer.class)
                        || StructuredAnalysisQuery_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StructuredAnalysisQuery_20270101.class.equals(Float.class)
                        || StructuredAnalysisQuery_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StructuredAnalysisQuery_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StructuredAnalysisQuery_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StructuredAnalysisQuery_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StructuredAnalysisQuery_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StructuredAnalysisQuery_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'StructuredAnalysisQuery_20270101'", e);
      }

      // deserialize SampledAnalysisQuery_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SampledAnalysisQuery_20270101.class.equals(Integer.class)
            || SampledAnalysisQuery_20270101.class.equals(Long.class)
            || SampledAnalysisQuery_20270101.class.equals(Float.class)
            || SampledAnalysisQuery_20270101.class.equals(Double.class)
            || SampledAnalysisQuery_20270101.class.equals(Boolean.class)
            || SampledAnalysisQuery_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SampledAnalysisQuery_20270101.class.equals(Integer.class)
                        || SampledAnalysisQuery_20270101.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SampledAnalysisQuery_20270101.class.equals(Float.class)
                        || SampledAnalysisQuery_20270101.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SampledAnalysisQuery_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SampledAnalysisQuery_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SampledAnalysisQuery_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SampledAnalysisQuery_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SampledAnalysisQuery_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SampledAnalysisQuery_20270101'", e);
      }

      TabularLocalDatasetRequest20270101Query ret = new TabularLocalDatasetRequest20270101Query();
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
    public TabularLocalDatasetRequest20270101Query getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TabularLocalDatasetRequest20270101Query cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TabularLocalDatasetRequest20270101Query() {
    super("oneOf", Boolean.FALSE);
  }

  public TabularLocalDatasetRequest20270101Query(StructuredAnalysisQuery_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularLocalDatasetRequest20270101Query(SampledAnalysisQuery_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "StructuredAnalysisQuery_20270101", new GenericType<StructuredAnalysisQuery_20270101>() {});
    schemas.put(
        "SampledAnalysisQuery_20270101", new GenericType<SampledAnalysisQuery_20270101>() {});
    JSON.registerDescendants(
        TabularLocalDatasetRequest20270101Query.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TabularLocalDatasetRequest20270101Query.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: StructuredAnalysisQuery_20270101,
   * SampledAnalysisQuery_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        StructuredAnalysisQuery_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SampledAnalysisQuery_20270101.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be StructuredAnalysisQuery_20270101,"
            + " SampledAnalysisQuery_20270101");
  }

  /**
   * Get the actual instance, which can be the following: StructuredAnalysisQuery_20270101,
   * SampledAnalysisQuery_20270101
   *
   * @return The actual instance (StructuredAnalysisQuery_20270101, SampledAnalysisQuery_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `StructuredAnalysisQuery_20270101`. If the actual instance is not
   * `StructuredAnalysisQuery_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StructuredAnalysisQuery_20270101`
   * @throws ClassCastException if the instance is not `StructuredAnalysisQuery_20270101`
   */
  public StructuredAnalysisQuery_20270101 getStructuredAnalysisQuery_20270101()
      throws ClassCastException {
    return (StructuredAnalysisQuery_20270101) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SampledAnalysisQuery_20270101`. If the actual instance is not
   * `SampledAnalysisQuery_20270101`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SampledAnalysisQuery_20270101`
   * @throws ClassCastException if the instance is not `SampledAnalysisQuery_20270101`
   */
  public SampledAnalysisQuery_20270101 getSampledAnalysisQuery_20270101()
      throws ClassCastException {
    return (SampledAnalysisQuery_20270101) super.getActualInstance();
  }
}
