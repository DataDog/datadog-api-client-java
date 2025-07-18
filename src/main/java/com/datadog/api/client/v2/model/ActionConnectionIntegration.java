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
@JsonDeserialize(using = ActionConnectionIntegration.ActionConnectionIntegrationDeserializer.class)
@JsonSerialize(using = ActionConnectionIntegration.ActionConnectionIntegrationSerializer.class)
public class ActionConnectionIntegration extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ActionConnectionIntegration.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ActionConnectionIntegrationSerializer
      extends StdSerializer<ActionConnectionIntegration> {
    public ActionConnectionIntegrationSerializer(Class<ActionConnectionIntegration> t) {
      super(t);
    }

    public ActionConnectionIntegrationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ActionConnectionIntegration value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ActionConnectionIntegrationDeserializer
      extends StdDeserializer<ActionConnectionIntegration> {
    public ActionConnectionIntegrationDeserializer() {
      this(ActionConnectionIntegration.class);
    }

    public ActionConnectionIntegrationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ActionConnectionIntegration deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AWSIntegration
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AWSIntegration.class.equals(Integer.class)
            || AWSIntegration.class.equals(Long.class)
            || AWSIntegration.class.equals(Float.class)
            || AWSIntegration.class.equals(Double.class)
            || AWSIntegration.class.equals(Boolean.class)
            || AWSIntegration.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AWSIntegration.class.equals(Integer.class)
                        || AWSIntegration.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AWSIntegration.class.equals(Float.class)
                        || AWSIntegration.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AWSIntegration.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AWSIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AWSIntegration.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AWSIntegration) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AWSIntegration'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AWSIntegration'", e);
      }

      // deserialize DatadogIntegration
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatadogIntegration.class.equals(Integer.class)
            || DatadogIntegration.class.equals(Long.class)
            || DatadogIntegration.class.equals(Float.class)
            || DatadogIntegration.class.equals(Double.class)
            || DatadogIntegration.class.equals(Boolean.class)
            || DatadogIntegration.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatadogIntegration.class.equals(Integer.class)
                        || DatadogIntegration.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatadogIntegration.class.equals(Float.class)
                        || DatadogIntegration.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatadogIntegration.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatadogIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DatadogIntegration.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatadogIntegration) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DatadogIntegration'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DatadogIntegration'", e);
      }

      // deserialize HTTPIntegration
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HTTPIntegration.class.equals(Integer.class)
            || HTTPIntegration.class.equals(Long.class)
            || HTTPIntegration.class.equals(Float.class)
            || HTTPIntegration.class.equals(Double.class)
            || HTTPIntegration.class.equals(Boolean.class)
            || HTTPIntegration.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HTTPIntegration.class.equals(Integer.class)
                        || HTTPIntegration.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HTTPIntegration.class.equals(Float.class)
                        || HTTPIntegration.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HTTPIntegration.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HTTPIntegration.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HTTPIntegration.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HTTPIntegration) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HTTPIntegration'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HTTPIntegration'", e);
      }

      ActionConnectionIntegration ret = new ActionConnectionIntegration();
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
    public ActionConnectionIntegration getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "ActionConnectionIntegration cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ActionConnectionIntegration() {
    super("oneOf", Boolean.FALSE);
  }

  public ActionConnectionIntegration(AWSIntegration o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ActionConnectionIntegration(DatadogIntegration o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ActionConnectionIntegration(HTTPIntegration o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AWSIntegration", new GenericType<AWSIntegration>() {});
    schemas.put("DatadogIntegration", new GenericType<DatadogIntegration>() {});
    schemas.put("HTTPIntegration", new GenericType<HTTPIntegration>() {});
    JSON.registerDescendants(
        ActionConnectionIntegration.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ActionConnectionIntegration.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AWSIntegration, DatadogIntegration, HTTPIntegration
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AWSIntegration.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DatadogIntegration.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HTTPIntegration.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AWSIntegration, DatadogIntegration, HTTPIntegration");
  }

  /**
   * Get the actual instance, which can be the following: AWSIntegration, DatadogIntegration,
   * HTTPIntegration
   *
   * @return The actual instance (AWSIntegration, DatadogIntegration, HTTPIntegration)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AWSIntegration`. If the actual instance is not `AWSIntegration`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `AWSIntegration`
   * @throws ClassCastException if the instance is not `AWSIntegration`
   */
  public AWSIntegration getAWSIntegration() throws ClassCastException {
    return (AWSIntegration) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatadogIntegration`. If the actual instance is not
   * `DatadogIntegration`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DatadogIntegration`
   * @throws ClassCastException if the instance is not `DatadogIntegration`
   */
  public DatadogIntegration getDatadogIntegration() throws ClassCastException {
    return (DatadogIntegration) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HTTPIntegration`. If the actual instance is not `HTTPIntegration`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `HTTPIntegration`
   * @throws ClassCastException if the instance is not `HTTPIntegration`
   */
  public HTTPIntegration getHTTPIntegration() throws ClassCastException {
    return (HTTPIntegration) super.getActualInstance();
  }
}
