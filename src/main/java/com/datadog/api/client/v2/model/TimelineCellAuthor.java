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
@JsonDeserialize(using = TimelineCellAuthor.TimelineCellAuthorDeserializer.class)
@JsonSerialize(using = TimelineCellAuthor.TimelineCellAuthorSerializer.class)
public class TimelineCellAuthor extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TimelineCellAuthor.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TimelineCellAuthorSerializer extends StdSerializer<TimelineCellAuthor> {
    public TimelineCellAuthorSerializer(Class<TimelineCellAuthor> t) {
      super(t);
    }

    public TimelineCellAuthorSerializer() {
      this(null);
    }

    @Override
    public void serialize(TimelineCellAuthor value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TimelineCellAuthorDeserializer extends StdDeserializer<TimelineCellAuthor> {
    public TimelineCellAuthorDeserializer() {
      this(TimelineCellAuthor.class);
    }

    public TimelineCellAuthorDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TimelineCellAuthor deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TimelineCellAuthorUser
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimelineCellAuthorUser.class.equals(Integer.class)
            || TimelineCellAuthorUser.class.equals(Long.class)
            || TimelineCellAuthorUser.class.equals(Float.class)
            || TimelineCellAuthorUser.class.equals(Double.class)
            || TimelineCellAuthorUser.class.equals(Boolean.class)
            || TimelineCellAuthorUser.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimelineCellAuthorUser.class.equals(Integer.class)
                        || TimelineCellAuthorUser.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimelineCellAuthorUser.class.equals(Float.class)
                        || TimelineCellAuthorUser.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimelineCellAuthorUser.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimelineCellAuthorUser.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimelineCellAuthorUser.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimelineCellAuthorUser) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimelineCellAuthorUser'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimelineCellAuthorUser'", e);
      }

      TimelineCellAuthor ret = new TimelineCellAuthor();
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
    public TimelineCellAuthor getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TimelineCellAuthor cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TimelineCellAuthor() {
    super("oneOf", Boolean.FALSE);
  }

  public TimelineCellAuthor(TimelineCellAuthorUser o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TimelineCellAuthorUser", new GenericType<TimelineCellAuthorUser>() {});
    JSON.registerDescendants(TimelineCellAuthor.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TimelineCellAuthor.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TimelineCellAuthorUser
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TimelineCellAuthorUser.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be TimelineCellAuthorUser");
  }

  /**
   * Get the actual instance, which can be the following: TimelineCellAuthorUser
   *
   * @return The actual instance (TimelineCellAuthorUser)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimelineCellAuthorUser`. If the actual instance is not
   * `TimelineCellAuthorUser`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimelineCellAuthorUser`
   * @throws ClassCastException if the instance is not `TimelineCellAuthorUser`
   */
  public TimelineCellAuthorUser getTimelineCellAuthorUser() throws ClassCastException {
    return (TimelineCellAuthorUser) super.getActualInstance();
  }
}
