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
@JsonDeserialize(using = CircleCICredentialsUpdate.CircleCICredentialsUpdateDeserializer.class)
@JsonSerialize(using = CircleCICredentialsUpdate.CircleCICredentialsUpdateSerializer.class)
public class CircleCICredentialsUpdate extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(CircleCICredentialsUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CircleCICredentialsUpdateSerializer
      extends StdSerializer<CircleCICredentialsUpdate> {
    public CircleCICredentialsUpdateSerializer(Class<CircleCICredentialsUpdate> t) {
      super(t);
    }

    public CircleCICredentialsUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CircleCICredentialsUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CircleCICredentialsUpdateDeserializer
      extends StdDeserializer<CircleCICredentialsUpdate> {
    public CircleCICredentialsUpdateDeserializer() {
      this(CircleCICredentialsUpdate.class);
    }

    public CircleCICredentialsUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CircleCICredentialsUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CircleCIAPIKeyUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CircleCIAPIKeyUpdate.class.equals(Integer.class)
            || CircleCIAPIKeyUpdate.class.equals(Long.class)
            || CircleCIAPIKeyUpdate.class.equals(Float.class)
            || CircleCIAPIKeyUpdate.class.equals(Double.class)
            || CircleCIAPIKeyUpdate.class.equals(Boolean.class)
            || CircleCIAPIKeyUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CircleCIAPIKeyUpdate.class.equals(Integer.class)
                        || CircleCIAPIKeyUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CircleCIAPIKeyUpdate.class.equals(Float.class)
                        || CircleCIAPIKeyUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CircleCIAPIKeyUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CircleCIAPIKeyUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CircleCIAPIKeyUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CircleCIAPIKeyUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CircleCIAPIKeyUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CircleCIAPIKeyUpdate'", e);
      }

      CircleCICredentialsUpdate ret = new CircleCICredentialsUpdate();
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
    public CircleCICredentialsUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "CircleCICredentialsUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CircleCICredentialsUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public CircleCICredentialsUpdate(CircleCIAPIKeyUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("CircleCIAPIKeyUpdate", new GenericType<CircleCIAPIKeyUpdate>() {});
    JSON.registerDescendants(CircleCICredentialsUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CircleCICredentialsUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CircleCIAPIKeyUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CircleCIAPIKeyUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be CircleCIAPIKeyUpdate");
  }

  /**
   * Get the actual instance, which can be the following: CircleCIAPIKeyUpdate
   *
   * @return The actual instance (CircleCIAPIKeyUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CircleCIAPIKeyUpdate`. If the actual instance is not
   * `CircleCIAPIKeyUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CircleCIAPIKeyUpdate`
   * @throws ClassCastException if the instance is not `CircleCIAPIKeyUpdate`
   */
  public CircleCIAPIKeyUpdate getCircleCIAPIKeyUpdate() throws ClassCastException {
    return (CircleCIAPIKeyUpdate) super.getActualInstance();
  }
}
