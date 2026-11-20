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
@JsonDeserialize(using = ListCompositeQuery.ListCompositeQueryDeserializer.class)
@JsonSerialize(using = ListCompositeQuery.ListCompositeQuerySerializer.class)
public class ListCompositeQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ListCompositeQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ListCompositeQuerySerializer extends StdSerializer<ListCompositeQuery> {
    public ListCompositeQuerySerializer(Class<ListCompositeQuery> t) {
      super(t);
    }

    public ListCompositeQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(ListCompositeQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ListCompositeQueryDeserializer extends StdDeserializer<ListCompositeQuery> {
    public ListCompositeQueryDeserializer() {
      this(ListCompositeQuery.class);
    }

    public ListCompositeQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ListCompositeQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ListFilteredQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ListFilteredQuery.class.equals(Integer.class)
            || ListFilteredQuery.class.equals(Long.class)
            || ListFilteredQuery.class.equals(Float.class)
            || ListFilteredQuery.class.equals(Double.class)
            || ListFilteredQuery.class.equals(Boolean.class)
            || ListFilteredQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ListFilteredQuery.class.equals(Integer.class)
                        || ListFilteredQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ListFilteredQuery.class.equals(Float.class)
                        || ListFilteredQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ListFilteredQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ListFilteredQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ListFilteredQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ListFilteredQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ListFilteredQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ListFilteredQuery'", e);
      }

      // deserialize ListAugmentedQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ListAugmentedQuery.class.equals(Integer.class)
            || ListAugmentedQuery.class.equals(Long.class)
            || ListAugmentedQuery.class.equals(Float.class)
            || ListAugmentedQuery.class.equals(Double.class)
            || ListAugmentedQuery.class.equals(Boolean.class)
            || ListAugmentedQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ListAugmentedQuery.class.equals(Integer.class)
                        || ListAugmentedQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ListAugmentedQuery.class.equals(Float.class)
                        || ListAugmentedQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ListAugmentedQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ListAugmentedQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ListAugmentedQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ListAugmentedQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ListAugmentedQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ListAugmentedQuery'", e);
      }

      // deserialize ListSegmentQuery
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ListSegmentQuery.class.equals(Integer.class)
            || ListSegmentQuery.class.equals(Long.class)
            || ListSegmentQuery.class.equals(Float.class)
            || ListSegmentQuery.class.equals(Double.class)
            || ListSegmentQuery.class.equals(Boolean.class)
            || ListSegmentQuery.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ListSegmentQuery.class.equals(Integer.class)
                        || ListSegmentQuery.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ListSegmentQuery.class.equals(Float.class)
                        || ListSegmentQuery.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ListSegmentQuery.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ListSegmentQuery.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ListSegmentQuery.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ListSegmentQuery) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ListSegmentQuery'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ListSegmentQuery'", e);
      }

      ListCompositeQuery ret = new ListCompositeQuery();
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
    public ListCompositeQuery getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ListCompositeQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ListCompositeQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public ListCompositeQuery(ListFilteredQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListCompositeQuery(ListAugmentedQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListCompositeQuery(ListSegmentQuery o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ListFilteredQuery", new GenericType<ListFilteredQuery>() {});
    schemas.put("ListAugmentedQuery", new GenericType<ListAugmentedQuery>() {});
    schemas.put("ListSegmentQuery", new GenericType<ListSegmentQuery>() {});
    JSON.registerDescendants(ListCompositeQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ListCompositeQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ListFilteredQuery, ListAugmentedQuery, ListSegmentQuery
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ListFilteredQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ListAugmentedQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ListSegmentQuery.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ListFilteredQuery, ListAugmentedQuery, ListSegmentQuery");
  }

  /**
   * Get the actual instance, which can be the following: ListFilteredQuery, ListAugmentedQuery,
   * ListSegmentQuery
   *
   * @return The actual instance (ListFilteredQuery, ListAugmentedQuery, ListSegmentQuery)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ListFilteredQuery`. If the actual instance is not
   * `ListFilteredQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ListFilteredQuery`
   * @throws ClassCastException if the instance is not `ListFilteredQuery`
   */
  public ListFilteredQuery getListFilteredQuery() throws ClassCastException {
    return (ListFilteredQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ListAugmentedQuery`. If the actual instance is not
   * `ListAugmentedQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ListAugmentedQuery`
   * @throws ClassCastException if the instance is not `ListAugmentedQuery`
   */
  public ListAugmentedQuery getListAugmentedQuery() throws ClassCastException {
    return (ListAugmentedQuery) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ListSegmentQuery`. If the actual instance is not
   * `ListSegmentQuery`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ListSegmentQuery`
   * @throws ClassCastException if the instance is not `ListSegmentQuery`
   */
  public ListSegmentQuery getListSegmentQuery() throws ClassCastException {
    return (ListSegmentQuery) super.getActualInstance();
  }
}
