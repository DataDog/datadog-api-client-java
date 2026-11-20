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
@JsonDeserialize(using = WildcardTileDefRequest.WildcardTileDefRequestDeserializer.class)
@JsonSerialize(using = WildcardTileDefRequest.WildcardTileDefRequestSerializer.class)
public class WildcardTileDefRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(WildcardTileDefRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class WildcardTileDefRequestSerializer
      extends StdSerializer<WildcardTileDefRequest> {
    public WildcardTileDefRequestSerializer(Class<WildcardTileDefRequest> t) {
      super(t);
    }

    public WildcardTileDefRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WildcardTileDefRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class WildcardTileDefRequestDeserializer
      extends StdDeserializer<WildcardTileDefRequest> {
    public WildcardTileDefRequestDeserializer() {
      this(WildcardTileDefRequest.class);
    }

    public WildcardTileDefRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public WildcardTileDefRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TabularDataRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TabularDataRequest.class.equals(Integer.class)
            || TabularDataRequest.class.equals(Long.class)
            || TabularDataRequest.class.equals(Float.class)
            || TabularDataRequest.class.equals(Double.class)
            || TabularDataRequest.class.equals(Boolean.class)
            || TabularDataRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TabularDataRequest.class.equals(Integer.class)
                        || TabularDataRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TabularDataRequest.class.equals(Float.class)
                        || TabularDataRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TabularDataRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TabularDataRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TabularDataRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TabularDataRequest) tmp).unparsed
              && !(((TabularDataRequest) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TabularDataRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TabularDataRequest'", e);
      }

      // deserialize DeprecatedWildcardTileDefRequests
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DeprecatedWildcardTileDefRequests.class.equals(Integer.class)
            || DeprecatedWildcardTileDefRequests.class.equals(Long.class)
            || DeprecatedWildcardTileDefRequests.class.equals(Float.class)
            || DeprecatedWildcardTileDefRequests.class.equals(Double.class)
            || DeprecatedWildcardTileDefRequests.class.equals(Boolean.class)
            || DeprecatedWildcardTileDefRequests.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DeprecatedWildcardTileDefRequests.class.equals(Integer.class)
                        || DeprecatedWildcardTileDefRequests.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DeprecatedWildcardTileDefRequests.class.equals(Float.class)
                        || DeprecatedWildcardTileDefRequests.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DeprecatedWildcardTileDefRequests.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DeprecatedWildcardTileDefRequests.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DeprecatedWildcardTileDefRequests.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DeprecatedWildcardTileDefRequests) tmp).unparsed
              && !(((DeprecatedWildcardTileDefRequests) tmp).getActualInstance()
                  instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DeprecatedWildcardTileDefRequests'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'DeprecatedWildcardTileDefRequests'", e);
      }

      WildcardTileDefRequest ret = new WildcardTileDefRequest();
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
    public WildcardTileDefRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "WildcardTileDefRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public WildcardTileDefRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public WildcardTileDefRequest(TabularDataRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WildcardTileDefRequest(DeprecatedWildcardTileDefRequests o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TabularDataRequest", new GenericType<TabularDataRequest>() {});
    schemas.put(
        "DeprecatedWildcardTileDefRequests",
        new GenericType<DeprecatedWildcardTileDefRequests>() {});
    JSON.registerDescendants(WildcardTileDefRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return WildcardTileDefRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TabularDataRequest, DeprecatedWildcardTileDefRequests
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TabularDataRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DeprecatedWildcardTileDefRequests.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TabularDataRequest, DeprecatedWildcardTileDefRequests");
  }

  /**
   * Get the actual instance, which can be the following: TabularDataRequest,
   * DeprecatedWildcardTileDefRequests
   *
   * @return The actual instance (TabularDataRequest, DeprecatedWildcardTileDefRequests)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TabularDataRequest`. If the actual instance is not
   * `TabularDataRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TabularDataRequest`
   * @throws ClassCastException if the instance is not `TabularDataRequest`
   */
  public TabularDataRequest getTabularDataRequest() throws ClassCastException {
    return (TabularDataRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DeprecatedWildcardTileDefRequests`. If the actual instance is not
   * `DeprecatedWildcardTileDefRequests`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DeprecatedWildcardTileDefRequests`
   * @throws ClassCastException if the instance is not `DeprecatedWildcardTileDefRequests`
   */
  public DeprecatedWildcardTileDefRequests getDeprecatedWildcardTileDefRequests()
      throws ClassCastException {
    return (DeprecatedWildcardTileDefRequests) super.getActualInstance();
  }
}
