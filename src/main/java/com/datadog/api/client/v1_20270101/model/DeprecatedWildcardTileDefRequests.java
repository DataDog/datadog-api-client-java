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
@JsonDeserialize(
    using = DeprecatedWildcardTileDefRequests.DeprecatedWildcardTileDefRequestsDeserializer.class)
@JsonSerialize(
    using = DeprecatedWildcardTileDefRequests.DeprecatedWildcardTileDefRequestsSerializer.class)
public class DeprecatedWildcardTileDefRequests extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(DeprecatedWildcardTileDefRequests.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DeprecatedWildcardTileDefRequestsSerializer
      extends StdSerializer<DeprecatedWildcardTileDefRequests> {
    public DeprecatedWildcardTileDefRequestsSerializer(Class<DeprecatedWildcardTileDefRequests> t) {
      super(t);
    }

    public DeprecatedWildcardTileDefRequestsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DeprecatedWildcardTileDefRequests value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DeprecatedWildcardTileDefRequestsDeserializer
      extends StdDeserializer<DeprecatedWildcardTileDefRequests> {
    public DeprecatedWildcardTileDefRequestsDeserializer() {
      this(DeprecatedWildcardTileDefRequests.class);
    }

    public DeprecatedWildcardTileDefRequestsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DeprecatedWildcardTileDefRequests deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DDSQLTableRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DDSQLTableRequest.class.equals(Integer.class)
            || DDSQLTableRequest.class.equals(Long.class)
            || DDSQLTableRequest.class.equals(Float.class)
            || DDSQLTableRequest.class.equals(Double.class)
            || DDSQLTableRequest.class.equals(Boolean.class)
            || DDSQLTableRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DDSQLTableRequest.class.equals(Integer.class)
                        || DDSQLTableRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DDSQLTableRequest.class.equals(Float.class)
                        || DDSQLTableRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DDSQLTableRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DDSQLTableRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DDSQLTableRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DDSQLTableRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DDSQLTableRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DDSQLTableRequest'", e);
      }

      // deserialize DDSQLTimeseriesRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DDSQLTimeseriesRequest.class.equals(Integer.class)
            || DDSQLTimeseriesRequest.class.equals(Long.class)
            || DDSQLTimeseriesRequest.class.equals(Float.class)
            || DDSQLTimeseriesRequest.class.equals(Double.class)
            || DDSQLTimeseriesRequest.class.equals(Boolean.class)
            || DDSQLTimeseriesRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DDSQLTimeseriesRequest.class.equals(Integer.class)
                        || DDSQLTimeseriesRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DDSQLTimeseriesRequest.class.equals(Float.class)
                        || DDSQLTimeseriesRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DDSQLTimeseriesRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DDSQLTimeseriesRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DDSQLTimeseriesRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DDSQLTimeseriesRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DDSQLTimeseriesRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DDSQLTimeseriesRequest'", e);
      }

      DeprecatedWildcardTileDefRequests ret = new DeprecatedWildcardTileDefRequests();
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
    public DeprecatedWildcardTileDefRequests getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "DeprecatedWildcardTileDefRequests cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DeprecatedWildcardTileDefRequests() {
    super("oneOf", Boolean.FALSE);
  }

  public DeprecatedWildcardTileDefRequests(DDSQLTableRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DeprecatedWildcardTileDefRequests(DDSQLTimeseriesRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("DDSQLTableRequest", new GenericType<DDSQLTableRequest>() {});
    schemas.put("DDSQLTimeseriesRequest", new GenericType<DDSQLTimeseriesRequest>() {});
    JSON.registerDescendants(
        DeprecatedWildcardTileDefRequests.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DeprecatedWildcardTileDefRequests.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DDSQLTableRequest, DDSQLTimeseriesRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(DDSQLTableRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DDSQLTimeseriesRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DDSQLTableRequest, DDSQLTimeseriesRequest");
  }

  /**
   * Get the actual instance, which can be the following: DDSQLTableRequest, DDSQLTimeseriesRequest
   *
   * @return The actual instance (DDSQLTableRequest, DDSQLTimeseriesRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DDSQLTableRequest`. If the actual instance is not
   * `DDSQLTableRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DDSQLTableRequest`
   * @throws ClassCastException if the instance is not `DDSQLTableRequest`
   */
  public DDSQLTableRequest getDDSQLTableRequest() throws ClassCastException {
    return (DDSQLTableRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DDSQLTimeseriesRequest`. If the actual instance is not
   * `DDSQLTimeseriesRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DDSQLTimeseriesRequest`
   * @throws ClassCastException if the instance is not `DDSQLTimeseriesRequest`
   */
  public DDSQLTimeseriesRequest getDDSQLTimeseriesRequest() throws ClassCastException {
    return (DDSQLTimeseriesRequest) super.getActualInstance();
  }
}
