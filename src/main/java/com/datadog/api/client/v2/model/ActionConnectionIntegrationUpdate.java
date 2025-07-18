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
    using = ActionConnectionIntegrationUpdate.ActionConnectionIntegrationUpdateDeserializer.class)
@JsonSerialize(
    using = ActionConnectionIntegrationUpdate.ActionConnectionIntegrationUpdateSerializer.class)
public class ActionConnectionIntegrationUpdate extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(ActionConnectionIntegrationUpdate.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ActionConnectionIntegrationUpdateSerializer
      extends StdSerializer<ActionConnectionIntegrationUpdate> {
    public ActionConnectionIntegrationUpdateSerializer(Class<ActionConnectionIntegrationUpdate> t) {
      super(t);
    }

    public ActionConnectionIntegrationUpdateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ActionConnectionIntegrationUpdate value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ActionConnectionIntegrationUpdateDeserializer
      extends StdDeserializer<ActionConnectionIntegrationUpdate> {
    public ActionConnectionIntegrationUpdateDeserializer() {
      this(ActionConnectionIntegrationUpdate.class);
    }

    public ActionConnectionIntegrationUpdateDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ActionConnectionIntegrationUpdate deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AWSIntegrationUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSIntegrationUpdate.class.equals(Integer.class)
            || AWSIntegrationUpdate.class.equals(Long.class)
            || AWSIntegrationUpdate.class.equals(Float.class)
            || AWSIntegrationUpdate.class.equals(Double.class)
            || AWSIntegrationUpdate.class.equals(Boolean.class)
            || AWSIntegrationUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSIntegrationUpdate.class.equals(Integer.class)
                        || AWSIntegrationUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSIntegrationUpdate.class.equals(Float.class)
                        || AWSIntegrationUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSIntegrationUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSIntegrationUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSIntegrationUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSIntegrationUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSIntegrationUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AWSIntegrationUpdate'", e);
      }

      // deserialize DatadogIntegrationUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatadogIntegrationUpdate.class.equals(Integer.class)
            || DatadogIntegrationUpdate.class.equals(Long.class)
            || DatadogIntegrationUpdate.class.equals(Float.class)
            || DatadogIntegrationUpdate.class.equals(Double.class)
            || DatadogIntegrationUpdate.class.equals(Boolean.class)
            || DatadogIntegrationUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatadogIntegrationUpdate.class.equals(Integer.class)
                        || DatadogIntegrationUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatadogIntegrationUpdate.class.equals(Float.class)
                        || DatadogIntegrationUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatadogIntegrationUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatadogIntegrationUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DatadogIntegrationUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatadogIntegrationUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DatadogIntegrationUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DatadogIntegrationUpdate'", e);
      }

      // deserialize HTTPIntegrationUpdate
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HTTPIntegrationUpdate.class.equals(Integer.class)
            || HTTPIntegrationUpdate.class.equals(Long.class)
            || HTTPIntegrationUpdate.class.equals(Float.class)
            || HTTPIntegrationUpdate.class.equals(Double.class)
            || HTTPIntegrationUpdate.class.equals(Boolean.class)
            || HTTPIntegrationUpdate.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HTTPIntegrationUpdate.class.equals(Integer.class)
                        || HTTPIntegrationUpdate.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HTTPIntegrationUpdate.class.equals(Float.class)
                        || HTTPIntegrationUpdate.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HTTPIntegrationUpdate.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HTTPIntegrationUpdate.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HTTPIntegrationUpdate.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HTTPIntegrationUpdate) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HTTPIntegrationUpdate'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HTTPIntegrationUpdate'", e);
      }

      ActionConnectionIntegrationUpdate ret = new ActionConnectionIntegrationUpdate();
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
    public ActionConnectionIntegrationUpdate getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ActionConnectionIntegrationUpdate cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ActionConnectionIntegrationUpdate() {
    super("oneOf", Boolean.FALSE);
  }

  public ActionConnectionIntegrationUpdate(AWSIntegrationUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ActionConnectionIntegrationUpdate(DatadogIntegrationUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ActionConnectionIntegrationUpdate(HTTPIntegrationUpdate o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AWSIntegrationUpdate", new GenericType<AWSIntegrationUpdate>() {});
    schemas.put("DatadogIntegrationUpdate", new GenericType<DatadogIntegrationUpdate>() {});
    schemas.put("HTTPIntegrationUpdate", new GenericType<HTTPIntegrationUpdate>() {});
    JSON.registerDescendants(
        ActionConnectionIntegrationUpdate.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ActionConnectionIntegrationUpdate.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AWSIntegrationUpdate, DatadogIntegrationUpdate,
   * HTTPIntegrationUpdate
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AWSIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DatadogIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HTTPIntegrationUpdate.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AWSIntegrationUpdate, DatadogIntegrationUpdate,"
            + " HTTPIntegrationUpdate");
  }

  /**
   * Get the actual instance, which can be the following: AWSIntegrationUpdate,
   * DatadogIntegrationUpdate, HTTPIntegrationUpdate
   *
   * @return The actual instance (AWSIntegrationUpdate, DatadogIntegrationUpdate,
   *     HTTPIntegrationUpdate)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSIntegrationUpdate`. If the actual instance is not
   * `AWSIntegrationUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSIntegrationUpdate`
   * @throws ClassCastException if the instance is not `AWSIntegrationUpdate`
   */
  public AWSIntegrationUpdate getAWSIntegrationUpdate() throws ClassCastException {
    return (AWSIntegrationUpdate) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatadogIntegrationUpdate`. If the actual instance is not
   * `DatadogIntegrationUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DatadogIntegrationUpdate`
   * @throws ClassCastException if the instance is not `DatadogIntegrationUpdate`
   */
  public DatadogIntegrationUpdate getDatadogIntegrationUpdate() throws ClassCastException {
    return (DatadogIntegrationUpdate) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HTTPIntegrationUpdate`. If the actual instance is not
   * `HTTPIntegrationUpdate`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HTTPIntegrationUpdate`
   * @throws ClassCastException if the instance is not `HTTPIntegrationUpdate`
   */
  public HTTPIntegrationUpdate getHTTPIntegrationUpdate() throws ClassCastException {
    return (HTTPIntegrationUpdate) super.getActualInstance();
  }
}
