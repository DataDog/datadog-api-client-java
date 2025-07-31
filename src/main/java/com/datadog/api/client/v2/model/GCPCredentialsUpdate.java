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
@JsonDeserialize(using = GCPCredentialsUpdate.GCPCredentialsUpdateDeserializer.class)
@JsonSerialize(using = GCPCredentialsUpdate.GCPCredentialsUpdateSerializer.class)
public class GCPCredentialsUpdate extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GCPCredentialsUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GCPCredentialsUpdateSerializer extends StdSerializer<GCPCredentialsUpdate> {
    public GCPCredentialsUpdateSerializer(Class<GCPCredentialsUpdate> t) {
      super(t);
    }

    public GCPCredentialsUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GCPCredentialsUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GCPCredentialsUpdateDeserializer
      extends StdDeserializer<GCPCredentialsUpdate> {
    public GCPCredentialsUpdateDeserializer() {
      this(GCPCredentialsUpdate.class);
    }

    public GCPCredentialsUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GCPCredentialsUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GCPServiceAccountUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GCPServiceAccountUpdate.class.equals(Integer.class)
            || GCPServiceAccountUpdate.class.equals(Long.class)
            || GCPServiceAccountUpdate.class.equals(Float.class)
            || GCPServiceAccountUpdate.class.equals(Double.class)
            || GCPServiceAccountUpdate.class.equals(Boolean.class)
            || GCPServiceAccountUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GCPServiceAccountUpdate.class.equals(Integer.class)
                        || GCPServiceAccountUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GCPServiceAccountUpdate.class.equals(Float.class)
                        || GCPServiceAccountUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GCPServiceAccountUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GCPServiceAccountUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GCPServiceAccountUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GCPServiceAccountUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GCPServiceAccountUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GCPServiceAccountUpdate'", e);
      }

      GCPCredentialsUpdate ret = new GCPCredentialsUpdate();
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
    public GCPCredentialsUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GCPCredentialsUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GCPCredentialsUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public GCPCredentialsUpdate(GCPServiceAccountUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("GCPServiceAccountUpdate", new GenericType<GCPServiceAccountUpdate>() {});
    JSON.registerDescendants(GCPCredentialsUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GCPCredentialsUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GCPServiceAccountUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(GCPServiceAccountUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be GCPServiceAccountUpdate");
  }

  /**
   * Get the actual instance, which can be the following: GCPServiceAccountUpdate
   *
   * @return The actual instance (GCPServiceAccountUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GCPServiceAccountUpdate`. If the actual instance is not
   * `GCPServiceAccountUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GCPServiceAccountUpdate`
   * @throws ClassCastException if the instance is not `GCPServiceAccountUpdate`
   */
  public GCPServiceAccountUpdate getGCPServiceAccountUpdate() throws ClassCastException {
    return (GCPServiceAccountUpdate) super.getActualInstance();
  }
}
