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
@JsonDeserialize(using = DowntimeMonitorIdentifier.DowntimeMonitorIdentifierDeserializer.class)
@JsonSerialize(using = DowntimeMonitorIdentifier.DowntimeMonitorIdentifierSerializer.class)
public class DowntimeMonitorIdentifier extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(DowntimeMonitorIdentifier.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DowntimeMonitorIdentifierSerializer
      extends StdSerializer<DowntimeMonitorIdentifier> {
    public DowntimeMonitorIdentifierSerializer(Class<DowntimeMonitorIdentifier> t) {
      super(t);
    }

    public DowntimeMonitorIdentifierSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeMonitorIdentifier value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DowntimeMonitorIdentifierDeserializer
      extends StdDeserializer<DowntimeMonitorIdentifier> {
    public DowntimeMonitorIdentifierDeserializer() {
      this(DowntimeMonitorIdentifier.class);
    }

    public DowntimeMonitorIdentifierDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DowntimeMonitorIdentifier deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DowntimeMonitorIdentifierId
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeMonitorIdentifierId.class.equals(Integer.class)
            || DowntimeMonitorIdentifierId.class.equals(Long.class)
            || DowntimeMonitorIdentifierId.class.equals(Float.class)
            || DowntimeMonitorIdentifierId.class.equals(Double.class)
            || DowntimeMonitorIdentifierId.class.equals(Boolean.class)
            || DowntimeMonitorIdentifierId.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeMonitorIdentifierId.class.equals(Integer.class)
                        || DowntimeMonitorIdentifierId.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeMonitorIdentifierId.class.equals(Float.class)
                        || DowntimeMonitorIdentifierId.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeMonitorIdentifierId.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeMonitorIdentifierId.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DowntimeMonitorIdentifierId.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeMonitorIdentifierId) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DowntimeMonitorIdentifierId'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DowntimeMonitorIdentifierId'", e);
      }

      // deserialize DowntimeMonitorIdentifierTags
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DowntimeMonitorIdentifierTags.class.equals(Integer.class)
            || DowntimeMonitorIdentifierTags.class.equals(Long.class)
            || DowntimeMonitorIdentifierTags.class.equals(Float.class)
            || DowntimeMonitorIdentifierTags.class.equals(Double.class)
            || DowntimeMonitorIdentifierTags.class.equals(Boolean.class)
            || DowntimeMonitorIdentifierTags.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DowntimeMonitorIdentifierTags.class.equals(Integer.class)
                        || DowntimeMonitorIdentifierTags.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DowntimeMonitorIdentifierTags.class.equals(Float.class)
                        || DowntimeMonitorIdentifierTags.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DowntimeMonitorIdentifierTags.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DowntimeMonitorIdentifierTags.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DowntimeMonitorIdentifierTags.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DowntimeMonitorIdentifierTags) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DowntimeMonitorIdentifierTags'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DowntimeMonitorIdentifierTags'", e);
      }

      DowntimeMonitorIdentifier ret = new DowntimeMonitorIdentifier();
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
    public DowntimeMonitorIdentifier getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "DowntimeMonitorIdentifier cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DowntimeMonitorIdentifier() {
    super("oneOf", Boolean.FALSE);
  }

  public DowntimeMonitorIdentifier(DowntimeMonitorIdentifierId o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DowntimeMonitorIdentifier(DowntimeMonitorIdentifierTags o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("DowntimeMonitorIdentifierId", new GenericType<DowntimeMonitorIdentifierId>() {});
    schemas.put(
        "DowntimeMonitorIdentifierTags", new GenericType<DowntimeMonitorIdentifierTags>() {});
    JSON.registerDescendants(DowntimeMonitorIdentifier.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DowntimeMonitorIdentifier.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DowntimeMonitorIdentifierId, DowntimeMonitorIdentifierTags
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(DowntimeMonitorIdentifierId.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DowntimeMonitorIdentifierTags.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DowntimeMonitorIdentifierId,"
            + " DowntimeMonitorIdentifierTags");
  }

  /**
   * Get the actual instance, which can be the following: DowntimeMonitorIdentifierId,
   * DowntimeMonitorIdentifierTags
   *
   * @return The actual instance (DowntimeMonitorIdentifierId, DowntimeMonitorIdentifierTags)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeMonitorIdentifierId`. If the actual instance is not
   * `DowntimeMonitorIdentifierId`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DowntimeMonitorIdentifierId`
   * @throws ClassCastException if the instance is not `DowntimeMonitorIdentifierId`
   */
  public DowntimeMonitorIdentifierId getDowntimeMonitorIdentifierId() throws ClassCastException {
    return (DowntimeMonitorIdentifierId) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DowntimeMonitorIdentifierTags`. If the actual instance is not
   * `DowntimeMonitorIdentifierTags`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DowntimeMonitorIdentifierTags`
   * @throws ClassCastException if the instance is not `DowntimeMonitorIdentifierTags`
   */
  public DowntimeMonitorIdentifierTags getDowntimeMonitorIdentifierTags()
      throws ClassCastException {
    return (DowntimeMonitorIdentifierTags) super.getActualInstance();
  }
}
