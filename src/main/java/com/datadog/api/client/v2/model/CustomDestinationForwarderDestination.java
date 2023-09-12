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
        CustomDestinationForwarderDestination.CustomDestinationForwarderDestinationDeserializer
            .class)
@JsonSerialize(
    using =
        CustomDestinationForwarderDestination.CustomDestinationForwarderDestinationSerializer.class)
public class CustomDestinationForwarderDestination extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CustomDestinationForwarderDestination.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CustomDestinationForwarderDestinationSerializer
      extends StdSerializer<CustomDestinationForwarderDestination> {
    public CustomDestinationForwarderDestinationSerializer(
        Class<CustomDestinationForwarderDestination> t) {
      super(t);
    }

    public CustomDestinationForwarderDestinationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationForwarderDestination value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CustomDestinationForwarderDestinationDeserializer
      extends StdDeserializer<CustomDestinationForwarderDestination> {
    public CustomDestinationForwarderDestinationDeserializer() {
      this(CustomDestinationForwarderDestination.class);
    }

    public CustomDestinationForwarderDestinationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CustomDestinationForwarderDestination deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize HttpDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HttpDestination.class.equals(Integer.class)
            || HttpDestination.class.equals(Long.class)
            || HttpDestination.class.equals(Float.class)
            || HttpDestination.class.equals(Double.class)
            || HttpDestination.class.equals(Boolean.class)
            || HttpDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HttpDestination.class.equals(Integer.class)
                        || HttpDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HttpDestination.class.equals(Float.class)
                        || HttpDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HttpDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HttpDestination.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HttpDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HttpDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HttpDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HttpDestination'", e);
      }

      // deserialize ElasticsearchDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ElasticsearchDestination.class.equals(Integer.class)
            || ElasticsearchDestination.class.equals(Long.class)
            || ElasticsearchDestination.class.equals(Float.class)
            || ElasticsearchDestination.class.equals(Double.class)
            || ElasticsearchDestination.class.equals(Boolean.class)
            || ElasticsearchDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ElasticsearchDestination.class.equals(Integer.class)
                        || ElasticsearchDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ElasticsearchDestination.class.equals(Float.class)
                        || ElasticsearchDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ElasticsearchDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ElasticsearchDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ElasticsearchDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ElasticsearchDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ElasticsearchDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ElasticsearchDestination'", e);
      }

      // deserialize SplunkHecDestination
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SplunkHecDestination.class.equals(Integer.class)
            || SplunkHecDestination.class.equals(Long.class)
            || SplunkHecDestination.class.equals(Float.class)
            || SplunkHecDestination.class.equals(Double.class)
            || SplunkHecDestination.class.equals(Boolean.class)
            || SplunkHecDestination.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SplunkHecDestination.class.equals(Integer.class)
                        || SplunkHecDestination.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SplunkHecDestination.class.equals(Float.class)
                        || SplunkHecDestination.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SplunkHecDestination.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SplunkHecDestination.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SplunkHecDestination.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SplunkHecDestination) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SplunkHecDestination'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SplunkHecDestination'", e);
      }

      CustomDestinationForwarderDestination ret = new CustomDestinationForwarderDestination();
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
    public CustomDestinationForwarderDestination getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CustomDestinationForwarderDestination cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CustomDestinationForwarderDestination() {
    super("oneOf", Boolean.FALSE);
  }

  public CustomDestinationForwarderDestination(HttpDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationForwarderDestination(ElasticsearchDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CustomDestinationForwarderDestination(SplunkHecDestination o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("HttpDestination", new GenericType<HttpDestination>() {});
    schemas.put("ElasticsearchDestination", new GenericType<ElasticsearchDestination>() {});
    schemas.put("SplunkHecDestination", new GenericType<SplunkHecDestination>() {});
    JSON.registerDescendants(
        CustomDestinationForwarderDestination.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CustomDestinationForwarderDestination.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: HttpDestination, ElasticsearchDestination,
   * SplunkHecDestination
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(HttpDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ElasticsearchDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SplunkHecDestination.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be HttpDestination, ElasticsearchDestination,"
            + " SplunkHecDestination");
  }

  /**
   * Get the actual instance, which can be the following: HttpDestination, ElasticsearchDestination,
   * SplunkHecDestination
   *
   * @return The actual instance (HttpDestination, ElasticsearchDestination, SplunkHecDestination)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `HttpDestination`. If the actual instance is not `HttpDestination`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `HttpDestination`
   * @throws ClassCastException if the instance is not `HttpDestination`
   */
  public HttpDestination getHttpDestination() throws ClassCastException {
    return (HttpDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ElasticsearchDestination`. If the actual instance is not
   * `ElasticsearchDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ElasticsearchDestination`
   * @throws ClassCastException if the instance is not `ElasticsearchDestination`
   */
  public ElasticsearchDestination getElasticsearchDestination() throws ClassCastException {
    return (ElasticsearchDestination) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SplunkHecDestination`. If the actual instance is not
   * `SplunkHecDestination`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SplunkHecDestination`
   * @throws ClassCastException if the instance is not `SplunkHecDestination`
   */
  public SplunkHecDestination getSplunkHecDestination() throws ClassCastException {
    return (SplunkHecDestination) super.getActualInstance();
  }
}
