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
@JsonDeserialize(using = EscalationPolicyIncluded.EscalationPolicyIncludedDeserializer.class)
@JsonSerialize(using = EscalationPolicyIncluded.EscalationPolicyIncludedSerializer.class)
public class EscalationPolicyIncluded extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(EscalationPolicyIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class EscalationPolicyIncludedSerializer
      extends StdSerializer<EscalationPolicyIncluded> {
    public EscalationPolicyIncludedSerializer(Class<EscalationPolicyIncluded> t) {
      super(t);
    }

    public EscalationPolicyIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EscalationPolicyIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class EscalationPolicyIncludedDeserializer
      extends StdDeserializer<EscalationPolicyIncluded> {
    public EscalationPolicyIncludedDeserializer() {
      this(EscalationPolicyIncluded.class);
    }

    public EscalationPolicyIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public EscalationPolicyIncluded deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TeamReference
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TeamReference.class.equals(Integer.class)
            || TeamReference.class.equals(Long.class)
            || TeamReference.class.equals(Float.class)
            || TeamReference.class.equals(Double.class)
            || TeamReference.class.equals(Boolean.class)
            || TeamReference.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TeamReference.class.equals(Integer.class)
                        || TeamReference.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TeamReference.class.equals(Float.class)
                        || TeamReference.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TeamReference.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TeamReference.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TeamReference.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TeamReference) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TeamReference'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TeamReference'", e);
      }

      // deserialize EscalationPolicyStep
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EscalationPolicyStep.class.equals(Integer.class)
            || EscalationPolicyStep.class.equals(Long.class)
            || EscalationPolicyStep.class.equals(Float.class)
            || EscalationPolicyStep.class.equals(Double.class)
            || EscalationPolicyStep.class.equals(Boolean.class)
            || EscalationPolicyStep.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EscalationPolicyStep.class.equals(Integer.class)
                        || EscalationPolicyStep.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EscalationPolicyStep.class.equals(Float.class)
                        || EscalationPolicyStep.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EscalationPolicyStep.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EscalationPolicyStep.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EscalationPolicyStep.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EscalationPolicyStep) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EscalationPolicyStep'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EscalationPolicyStep'", e);
      }

      // deserialize UserTarget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (UserTarget.class.equals(Integer.class)
            || UserTarget.class.equals(Long.class)
            || UserTarget.class.equals(Float.class)
            || UserTarget.class.equals(Double.class)
            || UserTarget.class.equals(Boolean.class)
            || UserTarget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((UserTarget.class.equals(Integer.class) || UserTarget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((UserTarget.class.equals(Float.class) || UserTarget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (UserTarget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (UserTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(UserTarget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((UserTarget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'UserTarget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'UserTarget'", e);
      }

      // deserialize ScheduleTarget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScheduleTarget.class.equals(Integer.class)
            || ScheduleTarget.class.equals(Long.class)
            || ScheduleTarget.class.equals(Float.class)
            || ScheduleTarget.class.equals(Double.class)
            || ScheduleTarget.class.equals(Boolean.class)
            || ScheduleTarget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScheduleTarget.class.equals(Integer.class)
                        || ScheduleTarget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScheduleTarget.class.equals(Float.class)
                        || ScheduleTarget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScheduleTarget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScheduleTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScheduleTarget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScheduleTarget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScheduleTarget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScheduleTarget'", e);
      }

      // deserialize TeamTarget
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TeamTarget.class.equals(Integer.class)
            || TeamTarget.class.equals(Long.class)
            || TeamTarget.class.equals(Float.class)
            || TeamTarget.class.equals(Double.class)
            || TeamTarget.class.equals(Boolean.class)
            || TeamTarget.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TeamTarget.class.equals(Integer.class) || TeamTarget.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TeamTarget.class.equals(Float.class) || TeamTarget.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TeamTarget.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TeamTarget.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TeamTarget.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TeamTarget) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TeamTarget'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TeamTarget'", e);
      }

      EscalationPolicyIncluded ret = new EscalationPolicyIncluded();
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
    public EscalationPolicyIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "EscalationPolicyIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public EscalationPolicyIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public EscalationPolicyIncluded(TeamReference o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EscalationPolicyIncluded(EscalationPolicyStep o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EscalationPolicyIncluded(UserTarget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EscalationPolicyIncluded(ScheduleTarget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EscalationPolicyIncluded(TeamTarget o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TeamReference", new GenericType<TeamReference>() {});
    schemas.put("EscalationPolicyStep", new GenericType<EscalationPolicyStep>() {});
    schemas.put("UserTarget", new GenericType<UserTarget>() {});
    schemas.put("ScheduleTarget", new GenericType<ScheduleTarget>() {});
    schemas.put("TeamTarget", new GenericType<TeamTarget>() {});
    JSON.registerDescendants(EscalationPolicyIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return EscalationPolicyIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TeamReference, EscalationPolicyStep, UserTarget,
   * ScheduleTarget, TeamTarget
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TeamReference.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EscalationPolicyStep.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(UserTarget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScheduleTarget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TeamTarget.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TeamReference, EscalationPolicyStep, UserTarget,"
            + " ScheduleTarget, TeamTarget");
  }

  /**
   * Get the actual instance, which can be the following: TeamReference, EscalationPolicyStep,
   * UserTarget, ScheduleTarget, TeamTarget
   *
   * @return The actual instance (TeamReference, EscalationPolicyStep, UserTarget, ScheduleTarget,
   *     TeamTarget)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TeamReference`. If the actual instance is not `TeamReference`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `TeamReference`
   * @throws ClassCastException if the instance is not `TeamReference`
   */
  public TeamReference getTeamReference() throws ClassCastException {
    return (TeamReference) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EscalationPolicyStep`. If the actual instance is not
   * `EscalationPolicyStep`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EscalationPolicyStep`
   * @throws ClassCastException if the instance is not `EscalationPolicyStep`
   */
  public EscalationPolicyStep getEscalationPolicyStep() throws ClassCastException {
    return (EscalationPolicyStep) super.getActualInstance();
  }

  /**
   * Get the actual instance of `UserTarget`. If the actual instance is not `UserTarget`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `UserTarget`
   * @throws ClassCastException if the instance is not `UserTarget`
   */
  public UserTarget getUserTarget() throws ClassCastException {
    return (UserTarget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScheduleTarget`. If the actual instance is not `ScheduleTarget`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScheduleTarget`
   * @throws ClassCastException if the instance is not `ScheduleTarget`
   */
  public ScheduleTarget getScheduleTarget() throws ClassCastException {
    return (ScheduleTarget) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TeamTarget`. If the actual instance is not `TeamTarget`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `TeamTarget`
   * @throws ClassCastException if the instance is not `TeamTarget`
   */
  public TeamTarget getTeamTarget() throws ClassCastException {
    return (TeamTarget) super.getActualInstance();
  }
}
