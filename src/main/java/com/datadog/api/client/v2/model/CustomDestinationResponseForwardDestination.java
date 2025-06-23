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
        CustomDestinationResponseForwardDestination
            .CustomDestinationResponseForwardDestinationDeserializer.class)
@JsonSerialize(
    using =
        CustomDestinationResponseForwardDestination
            .CustomDestinationResponseForwardDestinationSerializer.class)
public class CustomDestinationResponseForwardDestination extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CustomDestinationResponseForwardDestination.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CustomDestinationResponseForwardDestinationSerializer
      extends StdSerializer<CustomDestinationResponseForwardDestination> {
    public CustomDestinationResponseForwardDestinationSerializer(
        Class<CustomDestinationResponseForwardDestination> t) {
      super(t);
    }

    public CustomDestinationResponseForwardDestinationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationResponseForwardDestination value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CustomDestinationResponseForwardDestinationDeserializer
      extends StdDeserializer<CustomDestinationResponseForwardDestination> {
    public CustomDestinationResponseForwardDestinationDeserializer() {
      this(CustomDestinationResponseForwardDestination.class);
    }

    public CustomDestinationResponseForwardDestinationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CustomDestinationResponseForwardDestination deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CustomDestinationResponseForwardDestinationHttp
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomDestinationResponseForwardDestinationHttp.class.equals(Integer.class)
            || CustomDestinationResponseForwardDestinationHttp.class.equals(Long.class)
            || CustomDestinationResponseForwardDestinationHttp.class.equals(Float.class)
            || CustomDestinationResponseForwardDestinationHttp.class.equals(Double.class)
            || CustomDestinationResponseForwardDestinationHttp.class.equals(Boolean.class)
            || CustomDestinationResponseForwardDestinationHttp.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationHttp.class.equals(Integer.class)
                        || CustomDestinationResponseForwardDestinationHttp.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationHttp.class.equals(Float.class)
                        || CustomDestinationResponseForwardDestinationHttp.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationHttp.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationHttp.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomDestinationResponseForwardDestinationHttp.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomDestinationResponseForwardDestinationHttp) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'CustomDestinationResponseForwardDestinationHttp'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CustomDestinationResponseForwardDestinationHttp'",
            e);
      }

      // deserialize CustomDestinationResponseForwardDestinationSplunk
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomDestinationResponseForwardDestinationSplunk.class.equals(Integer.class)
            || CustomDestinationResponseForwardDestinationSplunk.class.equals(Long.class)
            || CustomDestinationResponseForwardDestinationSplunk.class.equals(Float.class)
            || CustomDestinationResponseForwardDestinationSplunk.class.equals(Double.class)
            || CustomDestinationResponseForwardDestinationSplunk.class.equals(Boolean.class)
            || CustomDestinationResponseForwardDestinationSplunk.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationSplunk.class.equals(Integer.class)
                        || CustomDestinationResponseForwardDestinationSplunk.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationSplunk.class.equals(Float.class)
                        || CustomDestinationResponseForwardDestinationSplunk.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationSplunk.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationSplunk.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomDestinationResponseForwardDestinationSplunk.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomDestinationResponseForwardDestinationSplunk) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'CustomDestinationResponseForwardDestinationSplunk'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'CustomDestinationResponseForwardDestinationSplunk'",
            e);
      }

      // deserialize CustomDestinationResponseForwardDestinationElasticsearch
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomDestinationResponseForwardDestinationElasticsearch.class.equals(Integer.class)
            || CustomDestinationResponseForwardDestinationElasticsearch.class.equals(Long.class)
            || CustomDestinationResponseForwardDestinationElasticsearch.class.equals(Float.class)
            || CustomDestinationResponseForwardDestinationElasticsearch.class.equals(Double.class)
            || CustomDestinationResponseForwardDestinationElasticsearch.class.equals(Boolean.class)
            || CustomDestinationResponseForwardDestinationElasticsearch.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationElasticsearch.class.equals(
                            Integer.class)
                        || CustomDestinationResponseForwardDestinationElasticsearch.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationElasticsearch.class.equals(Float.class)
                        || CustomDestinationResponseForwardDestinationElasticsearch.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationElasticsearch.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationElasticsearch.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomDestinationResponseForwardDestinationElasticsearch.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomDestinationResponseForwardDestinationElasticsearch) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'CustomDestinationResponseForwardDestinationElasticsearch'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'CustomDestinationResponseForwardDestinationElasticsearch'",
            e);
      }

      // deserialize CustomDestinationResponseForwardDestinationMicrosoftSentinel
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(Integer.class)
            || CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(Long.class)
            || CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                Float.class)
            || CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                Double.class)
            || CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                Boolean.class)
            || CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                            Integer.class)
                        || CustomDestinationResponseForwardDestinationMicrosoftSentinel.class
                            .equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                            Float.class)
                        || CustomDestinationResponseForwardDestinationMicrosoftSentinel.class
                            .equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                        Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CustomDestinationResponseForwardDestinationMicrosoftSentinel.class.equals(
                        String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(CustomDestinationResponseForwardDestinationMicrosoftSentinel.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CustomDestinationResponseForwardDestinationMicrosoftSentinel) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'CustomDestinationResponseForwardDestinationMicrosoftSentinel'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'CustomDestinationResponseForwardDestinationMicrosoftSentinel'",
            e);
      }

      CustomDestinationResponseForwardDestination ret =
          new CustomDestinationResponseForwardDestination();
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
    public CustomDestinationResponseForwardDestination getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CustomDestinationResponseForwardDestination cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CustomDestinationResponseForwardDestination() {
    super("oneOf", Boolean.FALSE);
  }

  public CustomDestinationResponseForwardDestination(
      CustomDestinationResponseForwardDestinationHttp o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationResponseForwardDestination(
      CustomDestinationResponseForwardDestinationSplunk o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationResponseForwardDestination(
      CustomDestinationResponseForwardDestinationElasticsearch o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationResponseForwardDestination(
      CustomDestinationResponseForwardDestinationMicrosoftSentinel o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "CustomDestinationResponseForwardDestinationHttp",
        new GenericType<CustomDestinationResponseForwardDestinationHttp>() {});
    schemas.put(
        "CustomDestinationResponseForwardDestinationSplunk",
        new GenericType<CustomDestinationResponseForwardDestinationSplunk>() {});
    schemas.put(
        "CustomDestinationResponseForwardDestinationElasticsearch",
        new GenericType<CustomDestinationResponseForwardDestinationElasticsearch>() {});
    schemas.put(
        "CustomDestinationResponseForwardDestinationMicrosoftSentinel",
        new GenericType<CustomDestinationResponseForwardDestinationMicrosoftSentinel>() {});
    JSON.registerDescendants(
        CustomDestinationResponseForwardDestination.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CustomDestinationResponseForwardDestination.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CustomDestinationResponseForwardDestinationHttp,
   * CustomDestinationResponseForwardDestinationSplunk,
   * CustomDestinationResponseForwardDestinationElasticsearch,
   * CustomDestinationResponseForwardDestinationMicrosoftSentinel
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        CustomDestinationResponseForwardDestinationHttp.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CustomDestinationResponseForwardDestinationSplunk.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CustomDestinationResponseForwardDestinationElasticsearch.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        CustomDestinationResponseForwardDestinationMicrosoftSentinel.class,
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
        "Invalid instance type. Must be CustomDestinationResponseForwardDestinationHttp,"
            + " CustomDestinationResponseForwardDestinationSplunk,"
            + " CustomDestinationResponseForwardDestinationElasticsearch,"
            + " CustomDestinationResponseForwardDestinationMicrosoftSentinel");
  }

  /**
   * Get the actual instance, which can be the following:
   * CustomDestinationResponseForwardDestinationHttp,
   * CustomDestinationResponseForwardDestinationSplunk,
   * CustomDestinationResponseForwardDestinationElasticsearch,
   * CustomDestinationResponseForwardDestinationMicrosoftSentinel
   *
   * @return The actual instance (CustomDestinationResponseForwardDestinationHttp,
   *     CustomDestinationResponseForwardDestinationSplunk,
   *     CustomDestinationResponseForwardDestinationElasticsearch,
   *     CustomDestinationResponseForwardDestinationMicrosoftSentinel)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomDestinationResponseForwardDestinationHttp`. If the actual
   * instance is not `CustomDestinationResponseForwardDestinationHttp`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `CustomDestinationResponseForwardDestinationHttp`
   * @throws ClassCastException if the instance is not
   *     `CustomDestinationResponseForwardDestinationHttp`
   */
  public CustomDestinationResponseForwardDestinationHttp
      getCustomDestinationResponseForwardDestinationHttp() throws ClassCastException {
    return (CustomDestinationResponseForwardDestinationHttp) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomDestinationResponseForwardDestinationSplunk`. If the actual
   * instance is not `CustomDestinationResponseForwardDestinationSplunk`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `CustomDestinationResponseForwardDestinationSplunk`
   * @throws ClassCastException if the instance is not
   *     `CustomDestinationResponseForwardDestinationSplunk`
   */
  public CustomDestinationResponseForwardDestinationSplunk
      getCustomDestinationResponseForwardDestinationSplunk() throws ClassCastException {
    return (CustomDestinationResponseForwardDestinationSplunk) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomDestinationResponseForwardDestinationElasticsearch`. If the
   * actual instance is not `CustomDestinationResponseForwardDestinationElasticsearch`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `CustomDestinationResponseForwardDestinationElasticsearch`
   * @throws ClassCastException if the instance is not
   *     `CustomDestinationResponseForwardDestinationElasticsearch`
   */
  public CustomDestinationResponseForwardDestinationElasticsearch
      getCustomDestinationResponseForwardDestinationElasticsearch() throws ClassCastException {
    return (CustomDestinationResponseForwardDestinationElasticsearch) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CustomDestinationResponseForwardDestinationMicrosoftSentinel`. If
   * the actual instance is not `CustomDestinationResponseForwardDestinationMicrosoftSentinel`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `CustomDestinationResponseForwardDestinationMicrosoftSentinel`
   * @throws ClassCastException if the instance is not
   *     `CustomDestinationResponseForwardDestinationMicrosoftSentinel`
   */
  public CustomDestinationResponseForwardDestinationMicrosoftSentinel
      getCustomDestinationResponseForwardDestinationMicrosoftSentinel() throws ClassCastException {
    return (CustomDestinationResponseForwardDestinationMicrosoftSentinel) super.getActualInstance();
  }
}
