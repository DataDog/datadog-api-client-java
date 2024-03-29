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
@JsonDeserialize(
    using =
        CustomDestinationResponseHttpDestinationAuth
            .CustomDestinationResponseHttpDestinationAuthDeserializer.class)
@JsonSerialize(
    using =
        CustomDestinationResponseHttpDestinationAuth
            .CustomDestinationResponseHttpDestinationAuthSerializer.class)
public class CustomDestinationResponseHttpDestinationAuth extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CustomDestinationResponseHttpDestinationAuth.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CustomDestinationResponseHttpDestinationAuthSerializer
      extends StdSerializer<CustomDestinationResponseHttpDestinationAuth> {
    public CustomDestinationResponseHttpDestinationAuthSerializer(
        Class<CustomDestinationResponseHttpDestinationAuth> t) {
      super(t);
    }

    public CustomDestinationResponseHttpDestinationAuthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationResponseHttpDestinationAuth value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CustomDestinationResponseHttpDestinationAuthDeserializer
      extends StdDeserializer<CustomDestinationResponseHttpDestinationAuth> {
    public CustomDestinationResponseHttpDestinationAuthDeserializer() {
      this(CustomDestinationResponseHttpDestinationAuth.class);
    }

    public CustomDestinationResponseHttpDestinationAuthDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CustomDestinationResponseHttpDestinationAuth deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CustomDestinationResponseHttpDestinationAuthBasic
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Integer.class)
            || CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Long.class)
            || CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Float.class)
            || CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Double.class)
            || CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Boolean.class)
            || CustomDestinationResponseHttpDestinationAuthBasic.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Integer.class)
                        || CustomDestinationResponseHttpDestinationAuthBasic.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Float.class)
                        || CustomDestinationResponseHttpDestinationAuthBasic.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomDestinationResponseHttpDestinationAuthBasic.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomDestinationResponseHttpDestinationAuthBasic.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomDestinationResponseHttpDestinationAuthBasic.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomDestinationResponseHttpDestinationAuthBasic) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'CustomDestinationResponseHttpDestinationAuthBasic'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CustomDestinationResponseHttpDestinationAuthBasic'",
            e);
      }

      // deserialize CustomDestinationResponseHttpDestinationAuthCustomHeader
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(Integer.class)
            || CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(Long.class)
            || CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(Float.class)
            || CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(Double.class)
            || CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(Boolean.class)
            || CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(
                            Integer.class)
                        || CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(Float.class)
                        || CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomDestinationResponseHttpDestinationAuthCustomHeader.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomDestinationResponseHttpDestinationAuthCustomHeader.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomDestinationResponseHttpDestinationAuthCustomHeader) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'CustomDestinationResponseHttpDestinationAuthCustomHeader'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'CustomDestinationResponseHttpDestinationAuthCustomHeader'",
            e);
      }

      CustomDestinationResponseHttpDestinationAuth ret =
          new CustomDestinationResponseHttpDestinationAuth();
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
    public CustomDestinationResponseHttpDestinationAuth getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CustomDestinationResponseHttpDestinationAuth cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CustomDestinationResponseHttpDestinationAuth() {
    super("oneOf", Boolean.FALSE);
  }

  public CustomDestinationResponseHttpDestinationAuth(
      CustomDestinationResponseHttpDestinationAuthBasic o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationResponseHttpDestinationAuth(
      CustomDestinationResponseHttpDestinationAuthCustomHeader o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CustomDestinationResponseHttpDestinationAuthBasic",
        new GenericType<CustomDestinationResponseHttpDestinationAuthBasic>() {});
    schemas.put(
        "CustomDestinationResponseHttpDestinationAuthCustomHeader",
        new GenericType<CustomDestinationResponseHttpDestinationAuthCustomHeader>() {});
    JSON.registerDescendants(
        CustomDestinationResponseHttpDestinationAuth.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CustomDestinationResponseHttpDestinationAuth.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CustomDestinationResponseHttpDestinationAuthBasic,
   * CustomDestinationResponseHttpDestinationAuthCustomHeader
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CustomDestinationResponseHttpDestinationAuthBasic.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CustomDestinationResponseHttpDestinationAuthCustomHeader.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CustomDestinationResponseHttpDestinationAuthBasic,"
            + " CustomDestinationResponseHttpDestinationAuthCustomHeader");
  }

  /**
   * Get the actual instance, which can be the following:
   * CustomDestinationResponseHttpDestinationAuthBasic,
   * CustomDestinationResponseHttpDestinationAuthCustomHeader
   *
   * @return The actual instance (CustomDestinationResponseHttpDestinationAuthBasic,
   *     CustomDestinationResponseHttpDestinationAuthCustomHeader)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomDestinationResponseHttpDestinationAuthBasic`. If the actual
   * instance is not `CustomDestinationResponseHttpDestinationAuthBasic`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `CustomDestinationResponseHttpDestinationAuthBasic`
   * @throws ClassCastException if the instance is not
   *     `CustomDestinationResponseHttpDestinationAuthBasic`
   */
  public CustomDestinationResponseHttpDestinationAuthBasic
      getCustomDestinationResponseHttpDestinationAuthBasic() throws ClassCastException {
    return (CustomDestinationResponseHttpDestinationAuthBasic) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomDestinationResponseHttpDestinationAuthCustomHeader`. If the
   * actual instance is not `CustomDestinationResponseHttpDestinationAuthCustomHeader`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `CustomDestinationResponseHttpDestinationAuthCustomHeader`
   * @throws ClassCastException if the instance is not
   *     `CustomDestinationResponseHttpDestinationAuthCustomHeader`
   */
  public CustomDestinationResponseHttpDestinationAuthCustomHeader
      getCustomDestinationResponseHttpDestinationAuthCustomHeader() throws ClassCastException {
    return (CustomDestinationResponseHttpDestinationAuthCustomHeader) super.getActualInstance();
  }
}
