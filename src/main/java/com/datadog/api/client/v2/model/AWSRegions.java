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
@JsonDeserialize(using = AWSRegions.AWSRegionsDeserializer.class)
@JsonSerialize(using = AWSRegions.AWSRegionsSerializer.class)
public class AWSRegions extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AWSRegions.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AWSRegionsSerializer extends StdSerializer<AWSRegions> {
    public AWSRegionsSerializer(Class<AWSRegions> t) {
      super(t);
    }

    public AWSRegionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(AWSRegions value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AWSRegionsDeserializer extends StdDeserializer<AWSRegions> {
    public AWSRegionsDeserializer() {
      this(AWSRegions.class);
    }

    public AWSRegionsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AWSRegions deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AWSRegionsIncludeAll
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSRegionsIncludeAll.class.equals(Integer.class)
            || AWSRegionsIncludeAll.class.equals(Long.class)
            || AWSRegionsIncludeAll.class.equals(Float.class)
            || AWSRegionsIncludeAll.class.equals(Double.class)
            || AWSRegionsIncludeAll.class.equals(Boolean.class)
            || AWSRegionsIncludeAll.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSRegionsIncludeAll.class.equals(Integer.class)
                        || AWSRegionsIncludeAll.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSRegionsIncludeAll.class.equals(Float.class)
                        || AWSRegionsIncludeAll.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSRegionsIncludeAll.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSRegionsIncludeAll.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSRegionsIncludeAll.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSRegionsIncludeAll) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSRegionsIncludeAll'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AWSRegionsIncludeAll'", e);
      }

      // deserialize AWSRegionsIncludeOnly
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSRegionsIncludeOnly.class.equals(Integer.class)
            || AWSRegionsIncludeOnly.class.equals(Long.class)
            || AWSRegionsIncludeOnly.class.equals(Float.class)
            || AWSRegionsIncludeOnly.class.equals(Double.class)
            || AWSRegionsIncludeOnly.class.equals(Boolean.class)
            || AWSRegionsIncludeOnly.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSRegionsIncludeOnly.class.equals(Integer.class)
                        || AWSRegionsIncludeOnly.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSRegionsIncludeOnly.class.equals(Float.class)
                        || AWSRegionsIncludeOnly.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSRegionsIncludeOnly.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSRegionsIncludeOnly.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSRegionsIncludeOnly.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSRegionsIncludeOnly) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSRegionsIncludeOnly'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AWSRegionsIncludeOnly'", e);
      }

      AWSRegions ret = new AWSRegions();
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
    public AWSRegions getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "AWSRegions cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AWSRegions() {
    super("oneOf", Boolean.FALSE);
  }

  public AWSRegions(AWSRegionsIncludeAll o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AWSRegions(AWSRegionsIncludeOnly o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AWSRegionsIncludeAll", new GenericType<AWSRegionsIncludeAll>() {});
    schemas.put("AWSRegionsIncludeOnly", new GenericType<AWSRegionsIncludeOnly>() {});
    JSON.registerDescendants(AWSRegions.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AWSRegions.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AWSRegionsIncludeAll, AWSRegionsIncludeOnly
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AWSRegionsIncludeAll.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AWSRegionsIncludeOnly.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AWSRegionsIncludeAll, AWSRegionsIncludeOnly");
  }

  /**
   * Get the actual instance, which can be the following: AWSRegionsIncludeAll,
   * AWSRegionsIncludeOnly
   *
   * @return The actual instance (AWSRegionsIncludeAll, AWSRegionsIncludeOnly)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSRegionsIncludeAll`. If the actual instance is not
   * `AWSRegionsIncludeAll`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSRegionsIncludeAll`
   * @throws ClassCastException if the instance is not `AWSRegionsIncludeAll`
   */
  public AWSRegionsIncludeAll getAWSRegionsIncludeAll() throws ClassCastException {
    return (AWSRegionsIncludeAll) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSRegionsIncludeOnly`. If the actual instance is not
   * `AWSRegionsIncludeOnly`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSRegionsIncludeOnly`
   * @throws ClassCastException if the instance is not `AWSRegionsIncludeOnly`
   */
  public AWSRegionsIncludeOnly getAWSRegionsIncludeOnly() throws ClassCastException {
    return (AWSRegionsIncludeOnly) super.getActualInstance();
  }
}
