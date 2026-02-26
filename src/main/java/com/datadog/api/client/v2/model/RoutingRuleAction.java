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
@JsonDeserialize(using = RoutingRuleAction.RoutingRuleActionDeserializer.class)
@JsonSerialize(using = RoutingRuleAction.RoutingRuleActionSerializer.class)
public class RoutingRuleAction extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(RoutingRuleAction.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class RoutingRuleActionSerializer extends StdSerializer<RoutingRuleAction> {
    public RoutingRuleActionSerializer(Class<RoutingRuleAction> t) {
      super(t);
    }

    public RoutingRuleActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(RoutingRuleAction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class RoutingRuleActionDeserializer extends StdDeserializer<RoutingRuleAction> {
    public RoutingRuleActionDeserializer() {
      this(RoutingRuleAction.class);
    }

    public RoutingRuleActionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public RoutingRuleAction deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SendSlackMessageAction
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SendSlackMessageAction.class.equals(Integer.class)
            || SendSlackMessageAction.class.equals(Long.class)
            || SendSlackMessageAction.class.equals(Float.class)
            || SendSlackMessageAction.class.equals(Double.class)
            || SendSlackMessageAction.class.equals(Boolean.class)
            || SendSlackMessageAction.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SendSlackMessageAction.class.equals(Integer.class)
                        || SendSlackMessageAction.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SendSlackMessageAction.class.equals(Float.class)
                        || SendSlackMessageAction.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SendSlackMessageAction.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SendSlackMessageAction.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SendSlackMessageAction.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SendSlackMessageAction) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SendSlackMessageAction'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SendSlackMessageAction'", e);
      }

      // deserialize SendTeamsMessageAction
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SendTeamsMessageAction.class.equals(Integer.class)
            || SendTeamsMessageAction.class.equals(Long.class)
            || SendTeamsMessageAction.class.equals(Float.class)
            || SendTeamsMessageAction.class.equals(Double.class)
            || SendTeamsMessageAction.class.equals(Boolean.class)
            || SendTeamsMessageAction.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SendTeamsMessageAction.class.equals(Integer.class)
                        || SendTeamsMessageAction.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SendTeamsMessageAction.class.equals(Float.class)
                        || SendTeamsMessageAction.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SendTeamsMessageAction.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SendTeamsMessageAction.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SendTeamsMessageAction.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SendTeamsMessageAction) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SendTeamsMessageAction'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SendTeamsMessageAction'", e);
      }

      RoutingRuleAction ret = new RoutingRuleAction();
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
    public RoutingRuleAction getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "RoutingRuleAction cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public RoutingRuleAction() {
    super("oneOf", Boolean.FALSE);
  }

  public RoutingRuleAction(SendSlackMessageAction o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public RoutingRuleAction(SendTeamsMessageAction o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("SendSlackMessageAction", new GenericType<SendSlackMessageAction>() {});
    schemas.put("SendTeamsMessageAction", new GenericType<SendTeamsMessageAction>() {});
    JSON.registerDescendants(RoutingRuleAction.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return RoutingRuleAction.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SendSlackMessageAction, SendTeamsMessageAction
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(SendSlackMessageAction.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SendTeamsMessageAction.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SendSlackMessageAction, SendTeamsMessageAction");
  }

  /**
   * Get the actual instance, which can be the following: SendSlackMessageAction,
   * SendTeamsMessageAction
   *
   * @return The actual instance (SendSlackMessageAction, SendTeamsMessageAction)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SendSlackMessageAction`. If the actual instance is not
   * `SendSlackMessageAction`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SendSlackMessageAction`
   * @throws ClassCastException if the instance is not `SendSlackMessageAction`
   */
  public SendSlackMessageAction getSendSlackMessageAction() throws ClassCastException {
    return (SendSlackMessageAction) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SendTeamsMessageAction`. If the actual instance is not
   * `SendTeamsMessageAction`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SendTeamsMessageAction`
   * @throws ClassCastException if the instance is not `SendTeamsMessageAction`
   */
  public SendTeamsMessageAction getSendTeamsMessageAction() throws ClassCastException {
    return (SendTeamsMessageAction) super.getActualInstance();
  }
}
