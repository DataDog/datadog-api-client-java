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
@JsonDeserialize(using = UpsertCatalogKindRequest.UpsertCatalogKindRequestDeserializer.class)
@JsonSerialize(using = UpsertCatalogKindRequest.UpsertCatalogKindRequestSerializer.class)
public class UpsertCatalogKindRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(UpsertCatalogKindRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class UpsertCatalogKindRequestSerializer
      extends StdSerializer<UpsertCatalogKindRequest> {
    public UpsertCatalogKindRequestSerializer(Class<UpsertCatalogKindRequest> t) {
      super(t);
    }

    public UpsertCatalogKindRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UpsertCatalogKindRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class UpsertCatalogKindRequestDeserializer
      extends StdDeserializer<UpsertCatalogKindRequest> {
    public UpsertCatalogKindRequestDeserializer() {
      this(UpsertCatalogKindRequest.class);
    }

    public UpsertCatalogKindRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public UpsertCatalogKindRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize KindObj
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (KindObj.class.equals(Integer.class)
            || KindObj.class.equals(Long.class)
            || KindObj.class.equals(Float.class)
            || KindObj.class.equals(Double.class)
            || KindObj.class.equals(Boolean.class)
            || KindObj.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((KindObj.class.equals(Integer.class) || KindObj.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((KindObj.class.equals(Float.class) || KindObj.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (KindObj.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (KindObj.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(KindObj.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((KindObj) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'KindObj'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'KindObj'", e);
      }

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

      UpsertCatalogKindRequest ret = new UpsertCatalogKindRequest();
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
    public UpsertCatalogKindRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "UpsertCatalogKindRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public UpsertCatalogKindRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public UpsertCatalogKindRequest(KindObj o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public UpsertCatalogKindRequest(String o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("KindObj", new GenericType<KindObj>() {});
    schemas.put("String", new GenericType<String>() {});
    JSON.registerDescendants(UpsertCatalogKindRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return UpsertCatalogKindRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: KindObj, String
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(KindObj.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be KindObj, String");
  }

  /**
   * Get the actual instance, which can be the following: KindObj, String
   *
   * @return The actual instance (KindObj, String)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `KindObj`. If the actual instance is not `KindObj`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `KindObj`
   * @throws ClassCastException if the instance is not `KindObj`
   */
  public KindObj getKindObj() throws ClassCastException {
    return (KindObj) super.getActualInstance();
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
}
