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
@JsonDeserialize(using = CompositeSourceSubQuery.CompositeSourceSubQueryDeserializer.class)
@JsonSerialize(using = CompositeSourceSubQuery.CompositeSourceSubQuerySerializer.class)
public class CompositeSourceSubQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CompositeSourceSubQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CompositeSourceSubQuerySerializer
      extends StdSerializer<CompositeSourceSubQuery> {
    public CompositeSourceSubQuerySerializer(Class<CompositeSourceSubQuery> t) {
      super(t);
    }

    public CompositeSourceSubQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CompositeSourceSubQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CompositeSourceSubQueryDeserializer
      extends StdDeserializer<CompositeSourceSubQuery> {
    public CompositeSourceSubQueryDeserializer() {
      this(CompositeSourceSubQuery.class);
    }

    public CompositeSourceSubQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CompositeSourceSubQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CompositeEventsPlatformSubQueryDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CompositeEventsPlatformSubQueryDefinition.class.equals(Integer.class)
            || CompositeEventsPlatformSubQueryDefinition.class.equals(Long.class)
            || CompositeEventsPlatformSubQueryDefinition.class.equals(Float.class)
            || CompositeEventsPlatformSubQueryDefinition.class.equals(Double.class)
            || CompositeEventsPlatformSubQueryDefinition.class.equals(Boolean.class)
            || CompositeEventsPlatformSubQueryDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CompositeEventsPlatformSubQueryDefinition.class.equals(Integer.class)
                        || CompositeEventsPlatformSubQueryDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CompositeEventsPlatformSubQueryDefinition.class.equals(Float.class)
                        || CompositeEventsPlatformSubQueryDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CompositeEventsPlatformSubQueryDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CompositeEventsPlatformSubQueryDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CompositeEventsPlatformSubQueryDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CompositeEventsPlatformSubQueryDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'CompositeEventsPlatformSubQueryDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CompositeEventsPlatformSubQueryDefinition'",
            e);
      }

      // deserialize CompositeReferentialDataQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CompositeReferentialDataQuery.class.equals(Integer.class)
            || CompositeReferentialDataQuery.class.equals(Long.class)
            || CompositeReferentialDataQuery.class.equals(Float.class)
            || CompositeReferentialDataQuery.class.equals(Double.class)
            || CompositeReferentialDataQuery.class.equals(Boolean.class)
            || CompositeReferentialDataQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CompositeReferentialDataQuery.class.equals(Integer.class)
                        || CompositeReferentialDataQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CompositeReferentialDataQuery.class.equals(Float.class)
                        || CompositeReferentialDataQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CompositeReferentialDataQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CompositeReferentialDataQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CompositeReferentialDataQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CompositeReferentialDataQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CompositeReferentialDataQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CompositeReferentialDataQuery'", e);
      }

      // deserialize CompositeAudienceFiltersQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CompositeAudienceFiltersQuery.class.equals(Integer.class)
            || CompositeAudienceFiltersQuery.class.equals(Long.class)
            || CompositeAudienceFiltersQuery.class.equals(Float.class)
            || CompositeAudienceFiltersQuery.class.equals(Double.class)
            || CompositeAudienceFiltersQuery.class.equals(Boolean.class)
            || CompositeAudienceFiltersQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CompositeAudienceFiltersQuery.class.equals(Integer.class)
                        || CompositeAudienceFiltersQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CompositeAudienceFiltersQuery.class.equals(Float.class)
                        || CompositeAudienceFiltersQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CompositeAudienceFiltersQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CompositeAudienceFiltersQuery.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CompositeAudienceFiltersQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CompositeAudienceFiltersQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CompositeAudienceFiltersQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CompositeAudienceFiltersQuery'", e);
      }

      CompositeSourceSubQuery ret = new CompositeSourceSubQuery();
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
    public CompositeSourceSubQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CompositeSourceSubQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CompositeSourceSubQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public CompositeSourceSubQuery(CompositeEventsPlatformSubQueryDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CompositeSourceSubQuery(CompositeReferentialDataQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CompositeSourceSubQuery(CompositeAudienceFiltersQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CompositeEventsPlatformSubQueryDefinition",
        new GenericType<CompositeEventsPlatformSubQueryDefinition>() {});
    schemas.put(
        "CompositeReferentialDataQuery", new GenericType<CompositeReferentialDataQuery>() {});
    schemas.put(
        "CompositeAudienceFiltersQuery", new GenericType<CompositeAudienceFiltersQuery>() {});
    JSON.registerDescendants(CompositeSourceSubQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CompositeSourceSubQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CompositeEventsPlatformSubQueryDefinition,
   * CompositeReferentialDataQuery, CompositeAudienceFiltersQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CompositeEventsPlatformSubQueryDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CompositeReferentialDataQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CompositeAudienceFiltersQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CompositeEventsPlatformSubQueryDefinition,"
            + " CompositeReferentialDataQuery, CompositeAudienceFiltersQuery");
  }

  /**
   * Get the actual instance, which can be the following: CompositeEventsPlatformSubQueryDefinition,
   * CompositeReferentialDataQuery, CompositeAudienceFiltersQuery
   *
   * @return The actual instance (CompositeEventsPlatformSubQueryDefinition,
   *     CompositeReferentialDataQuery, CompositeAudienceFiltersQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CompositeEventsPlatformSubQueryDefinition`. If the actual instance
   * is not `CompositeEventsPlatformSubQueryDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CompositeEventsPlatformSubQueryDefinition`
   * @throws ClassCastException if the instance is not `CompositeEventsPlatformSubQueryDefinition`
   */
  public CompositeEventsPlatformSubQueryDefinition getCompositeEventsPlatformSubQueryDefinition()
      throws ClassCastException {
    return (CompositeEventsPlatformSubQueryDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CompositeReferentialDataQuery`. If the actual instance is not
   * `CompositeReferentialDataQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CompositeReferentialDataQuery`
   * @throws ClassCastException if the instance is not `CompositeReferentialDataQuery`
   */
  public CompositeReferentialDataQuery getCompositeReferentialDataQuery()
      throws ClassCastException {
    return (CompositeReferentialDataQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CompositeAudienceFiltersQuery`. If the actual instance is not
   * `CompositeAudienceFiltersQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CompositeAudienceFiltersQuery`
   * @throws ClassCastException if the instance is not `CompositeAudienceFiltersQuery`
   */
  public CompositeAudienceFiltersQuery getCompositeAudienceFiltersQuery()
      throws ClassCastException {
    return (CompositeAudienceFiltersQuery) super.getActualInstance();
  }
}
