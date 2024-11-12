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
@JsonDeserialize(using = AWSAuthConfig.AWSAuthConfigDeserializer.class)
@JsonSerialize(using = AWSAuthConfig.AWSAuthConfigSerializer.class)
public class AWSAuthConfig extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AWSAuthConfig.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AWSAuthConfigSerializer extends StdSerializer<AWSAuthConfig> {
    public AWSAuthConfigSerializer(Class<AWSAuthConfig> t) {
      super(t);
    }

    public AWSAuthConfigSerializer() {
      this(null);
    }

    @Override
    public void serialize(AWSAuthConfig value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AWSAuthConfigDeserializer extends StdDeserializer<AWSAuthConfig> {
    public AWSAuthConfigDeserializer() {
      this(AWSAuthConfig.class);
    }

    public AWSAuthConfigDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AWSAuthConfig deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AWSAuthConfigKeys
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSAuthConfigKeys.class.equals(Integer.class)
            || AWSAuthConfigKeys.class.equals(Long.class)
            || AWSAuthConfigKeys.class.equals(Float.class)
            || AWSAuthConfigKeys.class.equals(Double.class)
            || AWSAuthConfigKeys.class.equals(Boolean.class)
            || AWSAuthConfigKeys.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSAuthConfigKeys.class.equals(Integer.class)
                        || AWSAuthConfigKeys.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSAuthConfigKeys.class.equals(Float.class)
                        || AWSAuthConfigKeys.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSAuthConfigKeys.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSAuthConfigKeys.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSAuthConfigKeys.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSAuthConfigKeys) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSAuthConfigKeys'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AWSAuthConfigKeys'", e);
      }

      // deserialize AWSAuthConfigRole
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSAuthConfigRole.class.equals(Integer.class)
            || AWSAuthConfigRole.class.equals(Long.class)
            || AWSAuthConfigRole.class.equals(Float.class)
            || AWSAuthConfigRole.class.equals(Double.class)
            || AWSAuthConfigRole.class.equals(Boolean.class)
            || AWSAuthConfigRole.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSAuthConfigRole.class.equals(Integer.class)
                        || AWSAuthConfigRole.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSAuthConfigRole.class.equals(Float.class)
                        || AWSAuthConfigRole.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSAuthConfigRole.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSAuthConfigRole.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSAuthConfigRole.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSAuthConfigRole) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSAuthConfigRole'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AWSAuthConfigRole'", e);
      }

      AWSAuthConfig ret = new AWSAuthConfig();
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
    public AWSAuthConfig getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "AWSAuthConfig cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AWSAuthConfig() {
    super("oneOf", Boolean.FALSE);
  }

  public AWSAuthConfig(AWSAuthConfigKeys o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AWSAuthConfig(AWSAuthConfigRole o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AWSAuthConfigKeys", new GenericType<AWSAuthConfigKeys>() {});
    schemas.put("AWSAuthConfigRole", new GenericType<AWSAuthConfigRole>() {});
    JSON.registerDescendants(AWSAuthConfig.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AWSAuthConfig.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AWSAuthConfigKeys, AWSAuthConfigRole
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AWSAuthConfigKeys.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AWSAuthConfigRole.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AWSAuthConfigKeys, AWSAuthConfigRole");
  }

  /**
   * Get the actual instance, which can be the following: AWSAuthConfigKeys, AWSAuthConfigRole
   *
   * @return The actual instance (AWSAuthConfigKeys, AWSAuthConfigRole)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSAuthConfigKeys`. If the actual instance is not
   * `AWSAuthConfigKeys`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSAuthConfigKeys`
   * @throws ClassCastException if the instance is not `AWSAuthConfigKeys`
   */
  public AWSAuthConfigKeys getAWSAuthConfigKeys() throws ClassCastException {
    return (AWSAuthConfigKeys) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSAuthConfigRole`. If the actual instance is not
   * `AWSAuthConfigRole`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSAuthConfigRole`
   * @throws ClassCastException if the instance is not `AWSAuthConfigRole`
   */
  public AWSAuthConfigRole getAWSAuthConfigRole() throws ClassCastException {
    return (AWSAuthConfigRole) super.getActualInstance();
  }
}
