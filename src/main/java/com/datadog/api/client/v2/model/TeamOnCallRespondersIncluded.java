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
    using = TeamOnCallRespondersIncluded.TeamOnCallRespondersIncludedDeserializer.class)
@JsonSerialize(using = TeamOnCallRespondersIncluded.TeamOnCallRespondersIncludedSerializer.class)
public class TeamOnCallRespondersIncluded extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TeamOnCallRespondersIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TeamOnCallRespondersIncludedSerializer
      extends StdSerializer<TeamOnCallRespondersIncluded> {
    public TeamOnCallRespondersIncludedSerializer(Class<TeamOnCallRespondersIncluded> t) {
      super(t);
    }

    public TeamOnCallRespondersIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamOnCallRespondersIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TeamOnCallRespondersIncludedDeserializer
      extends StdDeserializer<TeamOnCallRespondersIncluded> {
    public TeamOnCallRespondersIncludedDeserializer() {
      this(TeamOnCallRespondersIncluded.class);
    }

    public TeamOnCallRespondersIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TeamOnCallRespondersIncluded deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize User
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (User.class.equals(Integer.class)
            || User.class.equals(Long.class)
            || User.class.equals(Float.class)
            || User.class.equals(Double.class)
            || User.class.equals(Boolean.class)
            || User.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((User.class.equals(Integer.class) || User.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((User.class.equals(Float.class) || User.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (User.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (User.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(User.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((User) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'User'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'User'", e);
      }

      // deserialize Escalation
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (Escalation.class.equals(Integer.class)
            || Escalation.class.equals(Long.class)
            || Escalation.class.equals(Float.class)
            || Escalation.class.equals(Double.class)
            || Escalation.class.equals(Boolean.class)
            || Escalation.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((Escalation.class.equals(Integer.class) || Escalation.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((Escalation.class.equals(Float.class) || Escalation.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (Escalation.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (Escalation.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(Escalation.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((Escalation) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'Escalation'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'Escalation'", e);
      }

      TeamOnCallRespondersIncluded ret = new TeamOnCallRespondersIncluded();
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
    public TeamOnCallRespondersIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TeamOnCallRespondersIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TeamOnCallRespondersIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public TeamOnCallRespondersIncluded(User o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TeamOnCallRespondersIncluded(Escalation o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("User", new GenericType<User>() {});
    schemas.put("Escalation", new GenericType<Escalation>() {});
    JSON.registerDescendants(
        TeamOnCallRespondersIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TeamOnCallRespondersIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: User, Escalation
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(User.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(Escalation.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be User, Escalation");
  }

  /**
   * Get the actual instance, which can be the following: User, Escalation
   *
   * @return The actual instance (User, Escalation)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `User`. If the actual instance is not `User`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `User`
   * @throws ClassCastException if the instance is not `User`
   */
  public User getUser() throws ClassCastException {
    return (User) super.getActualInstance();
  }

  /**
   * Get the actual instance of `Escalation`. If the actual instance is not `Escalation`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `Escalation`
   * @throws ClassCastException if the instance is not `Escalation`
   */
  public Escalation getEscalation() throws ClassCastException {
    return (Escalation) super.getActualInstance();
  }
}
