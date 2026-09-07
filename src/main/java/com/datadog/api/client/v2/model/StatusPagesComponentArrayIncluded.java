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
    using = StatusPagesComponentArrayIncluded.StatusPagesComponentArrayIncludedDeserializer.class)
@JsonSerialize(
    using = StatusPagesComponentArrayIncluded.StatusPagesComponentArrayIncludedSerializer.class)
public class StatusPagesComponentArrayIncluded extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(StatusPagesComponentArrayIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class StatusPagesComponentArrayIncludedSerializer
      extends StdSerializer<StatusPagesComponentArrayIncluded> {
    public StatusPagesComponentArrayIncludedSerializer(Class<StatusPagesComponentArrayIncluded> t) {
      super(t);
    }

    public StatusPagesComponentArrayIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StatusPagesComponentArrayIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class StatusPagesComponentArrayIncludedDeserializer
      extends StdDeserializer<StatusPagesComponentArrayIncluded> {
    public StatusPagesComponentArrayIncludedDeserializer() {
      this(StatusPagesComponentArrayIncluded.class);
    }

    public StatusPagesComponentArrayIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public StatusPagesComponentArrayIncluded deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize StatusPagesUser
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StatusPagesUser.class.equals(Integer.class)
            || StatusPagesUser.class.equals(Long.class)
            || StatusPagesUser.class.equals(Float.class)
            || StatusPagesUser.class.equals(Double.class)
            || StatusPagesUser.class.equals(Boolean.class)
            || StatusPagesUser.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StatusPagesUser.class.equals(Integer.class)
                        || StatusPagesUser.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StatusPagesUser.class.equals(Float.class)
                        || StatusPagesUser.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StatusPagesUser.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StatusPagesUser.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StatusPagesUser.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StatusPagesUser) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StatusPagesUser'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StatusPagesUser'", e);
      }

      // deserialize StatusPageAsIncluded
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StatusPageAsIncluded.class.equals(Integer.class)
            || StatusPageAsIncluded.class.equals(Long.class)
            || StatusPageAsIncluded.class.equals(Float.class)
            || StatusPageAsIncluded.class.equals(Double.class)
            || StatusPageAsIncluded.class.equals(Boolean.class)
            || StatusPageAsIncluded.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StatusPageAsIncluded.class.equals(Integer.class)
                        || StatusPageAsIncluded.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StatusPageAsIncluded.class.equals(Float.class)
                        || StatusPageAsIncluded.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StatusPageAsIncluded.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StatusPageAsIncluded.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StatusPageAsIncluded.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StatusPageAsIncluded) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StatusPageAsIncluded'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StatusPageAsIncluded'", e);
      }

      // deserialize StatusPagesComponentGroup
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (StatusPagesComponentGroup.class.equals(Integer.class)
            || StatusPagesComponentGroup.class.equals(Long.class)
            || StatusPagesComponentGroup.class.equals(Float.class)
            || StatusPagesComponentGroup.class.equals(Double.class)
            || StatusPagesComponentGroup.class.equals(Boolean.class)
            || StatusPagesComponentGroup.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((StatusPagesComponentGroup.class.equals(Integer.class)
                        || StatusPagesComponentGroup.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((StatusPagesComponentGroup.class.equals(Float.class)
                        || StatusPagesComponentGroup.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (StatusPagesComponentGroup.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (StatusPagesComponentGroup.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(StatusPagesComponentGroup.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((StatusPagesComponentGroup) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'StatusPagesComponentGroup'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'StatusPagesComponentGroup'", e);
      }

      StatusPagesComponentArrayIncluded ret = new StatusPagesComponentArrayIncluded();
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
    public StatusPagesComponentArrayIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "StatusPagesComponentArrayIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public StatusPagesComponentArrayIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public StatusPagesComponentArrayIncluded(StatusPagesUser o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StatusPagesComponentArrayIncluded(StatusPageAsIncluded o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public StatusPagesComponentArrayIncluded(StatusPagesComponentGroup o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("StatusPagesUser", new GenericType<StatusPagesUser>() {});
    schemas.put("StatusPageAsIncluded", new GenericType<StatusPageAsIncluded>() {});
    schemas.put("StatusPagesComponentGroup", new GenericType<StatusPagesComponentGroup>() {});
    JSON.registerDescendants(
        StatusPagesComponentArrayIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return StatusPagesComponentArrayIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: StatusPagesUser, StatusPageAsIncluded,
   * StatusPagesComponentGroup
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(StatusPagesUser.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StatusPageAsIncluded.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(StatusPagesComponentGroup.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be StatusPagesUser, StatusPageAsIncluded,"
            + " StatusPagesComponentGroup");
  }

  /**
   * Get the actual instance, which can be the following: StatusPagesUser, StatusPageAsIncluded,
   * StatusPagesComponentGroup
   *
   * @return The actual instance (StatusPagesUser, StatusPageAsIncluded, StatusPagesComponentGroup)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `StatusPagesUser`. If the actual instance is not `StatusPagesUser`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `StatusPagesUser`
   * @throws ClassCastException if the instance is not `StatusPagesUser`
   */
  public StatusPagesUser getStatusPagesUser() throws ClassCastException {
    return (StatusPagesUser) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StatusPageAsIncluded`. If the actual instance is not
   * `StatusPageAsIncluded`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StatusPageAsIncluded`
   * @throws ClassCastException if the instance is not `StatusPageAsIncluded`
   */
  public StatusPageAsIncluded getStatusPageAsIncluded() throws ClassCastException {
    return (StatusPageAsIncluded) super.getActualInstance();
  }

  /**
   * Get the actual instance of `StatusPagesComponentGroup`. If the actual instance is not
   * `StatusPagesComponentGroup`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `StatusPagesComponentGroup`
   * @throws ClassCastException if the instance is not `StatusPagesComponentGroup`
   */
  public StatusPagesComponentGroup getStatusPagesComponentGroup() throws ClassCastException {
    return (StatusPagesComponentGroup) super.getActualInstance();
  }
}
