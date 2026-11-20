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
@JsonDeserialize(using = QueryTableDateFormat.QueryTableDateFormatDeserializer.class)
@JsonSerialize(using = QueryTableDateFormat.QueryTableDateFormatSerializer.class)
public class QueryTableDateFormat extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(QueryTableDateFormat.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class QueryTableDateFormatSerializer extends StdSerializer<QueryTableDateFormat> {
    public QueryTableDateFormatSerializer(Class<QueryTableDateFormat> t) {
      super(t);
    }

    public QueryTableDateFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableDateFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class QueryTableDateFormatDeserializer
      extends StdDeserializer<QueryTableDateFormat> {
    public QueryTableDateFormatDeserializer() {
      this(QueryTableDateFormat.class);
    }

    public QueryTableDateFormatDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public QueryTableDateFormat deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize QueryTableDatePattern
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableDatePattern.class.equals(Integer.class)
            || QueryTableDatePattern.class.equals(Long.class)
            || QueryTableDatePattern.class.equals(Float.class)
            || QueryTableDatePattern.class.equals(Double.class)
            || QueryTableDatePattern.class.equals(Boolean.class)
            || QueryTableDatePattern.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableDatePattern.class.equals(Integer.class)
                        || QueryTableDatePattern.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableDatePattern.class.equals(Float.class)
                        || QueryTableDatePattern.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableDatePattern.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableDatePattern.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryTableDatePattern.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'QueryTableDatePattern'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryTableDatePattern'", e);
      }

      // deserialize QueryTableTimestampFormat
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableTimestampFormat.class.equals(Integer.class)
            || QueryTableTimestampFormat.class.equals(Long.class)
            || QueryTableTimestampFormat.class.equals(Float.class)
            || QueryTableTimestampFormat.class.equals(Double.class)
            || QueryTableTimestampFormat.class.equals(Boolean.class)
            || QueryTableTimestampFormat.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableTimestampFormat.class.equals(Integer.class)
                        || QueryTableTimestampFormat.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableTimestampFormat.class.equals(Float.class)
                        || QueryTableTimestampFormat.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableTimestampFormat.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableTimestampFormat.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryTableTimestampFormat.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          deserialized = tmp;
          match++;

          log.log(Level.FINER, "Input data matches schema 'QueryTableTimestampFormat'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryTableTimestampFormat'", e);
      }

      QueryTableDateFormat ret = new QueryTableDateFormat();
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
    public QueryTableDateFormat getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "QueryTableDateFormat cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public QueryTableDateFormat() {
    super("oneOf", Boolean.FALSE);
  }

  public QueryTableDateFormat(QueryTableDatePattern o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public QueryTableDateFormat(QueryTableTimestampFormat o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("QueryTableDatePattern", new GenericType<QueryTableDatePattern>() {});
    schemas.put("QueryTableTimestampFormat", new GenericType<QueryTableTimestampFormat>() {});
    JSON.registerDescendants(QueryTableDateFormat.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return QueryTableDateFormat.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: QueryTableDatePattern, QueryTableTimestampFormat
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(QueryTableDatePattern.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryTableTimestampFormat.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be QueryTableDatePattern, QueryTableTimestampFormat");
  }

  /**
   * Get the actual instance, which can be the following: QueryTableDatePattern,
   * QueryTableTimestampFormat
   *
   * @return The actual instance (QueryTableDatePattern, QueryTableTimestampFormat)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableDatePattern`. If the actual instance is not
   * `QueryTableDatePattern`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryTableDatePattern`
   * @throws ClassCastException if the instance is not `QueryTableDatePattern`
   */
  public QueryTableDatePattern getQueryTableDatePattern() throws ClassCastException {
    return (QueryTableDatePattern) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableTimestampFormat`. If the actual instance is not
   * `QueryTableTimestampFormat`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryTableTimestampFormat`
   * @throws ClassCastException if the instance is not `QueryTableTimestampFormat`
   */
  public QueryTableTimestampFormat getQueryTableTimestampFormat() throws ClassCastException {
    return (QueryTableTimestampFormat) super.getActualInstance();
  }
}
