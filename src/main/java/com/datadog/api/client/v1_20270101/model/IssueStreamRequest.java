/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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
@JsonDeserialize(using = IssueStreamRequest.IssueStreamRequestDeserializer.class)
@JsonSerialize(using = IssueStreamRequest.IssueStreamRequestSerializer.class)
public class IssueStreamRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IssueStreamRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IssueStreamRequestSerializer extends StdSerializer<IssueStreamRequest> {
    public IssueStreamRequestSerializer(Class<IssueStreamRequest> t) {
      super(t);
    }

    public IssueStreamRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssueStreamRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IssueStreamRequestDeserializer extends StdDeserializer<IssueStreamRequest> {
    public IssueStreamRequestDeserializer() {
      this(IssueStreamRequest.class);
    }

    public IssueStreamRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IssueStreamRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LegacyIssueStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LegacyIssueStreamRequest.class.equals(Integer.class)
            || LegacyIssueStreamRequest.class.equals(Long.class)
            || LegacyIssueStreamRequest.class.equals(Float.class)
            || LegacyIssueStreamRequest.class.equals(Double.class)
            || LegacyIssueStreamRequest.class.equals(Boolean.class)
            || LegacyIssueStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LegacyIssueStreamRequest.class.equals(Integer.class)
                        || LegacyIssueStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LegacyIssueStreamRequest.class.equals(Float.class)
                        || LegacyIssueStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LegacyIssueStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LegacyIssueStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LegacyIssueStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LegacyIssueStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LegacyIssueStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LegacyIssueStreamRequest'", e);
      }

      // deserialize UnifiedIssueStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (UnifiedIssueStreamRequest.class.equals(Integer.class)
            || UnifiedIssueStreamRequest.class.equals(Long.class)
            || UnifiedIssueStreamRequest.class.equals(Float.class)
            || UnifiedIssueStreamRequest.class.equals(Double.class)
            || UnifiedIssueStreamRequest.class.equals(Boolean.class)
            || UnifiedIssueStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((UnifiedIssueStreamRequest.class.equals(Integer.class)
                        || UnifiedIssueStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((UnifiedIssueStreamRequest.class.equals(Float.class)
                        || UnifiedIssueStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (UnifiedIssueStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (UnifiedIssueStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(UnifiedIssueStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((UnifiedIssueStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'UnifiedIssueStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'UnifiedIssueStreamRequest'", e);
      }

      IssueStreamRequest ret = new IssueStreamRequest();
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
    public IssueStreamRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "IssueStreamRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IssueStreamRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public IssueStreamRequest(LegacyIssueStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IssueStreamRequest(UnifiedIssueStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("LegacyIssueStreamRequest", new GenericType<LegacyIssueStreamRequest>() {});
    schemas.put("UnifiedIssueStreamRequest", new GenericType<UnifiedIssueStreamRequest>() {});
    JSON.registerDescendants(IssueStreamRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IssueStreamRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LegacyIssueStreamRequest, UnifiedIssueStreamRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(LegacyIssueStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(UnifiedIssueStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LegacyIssueStreamRequest, UnifiedIssueStreamRequest");
  }

  /**
   * Get the actual instance, which can be the following: LegacyIssueStreamRequest,
   * UnifiedIssueStreamRequest
   *
   * @return The actual instance (LegacyIssueStreamRequest, UnifiedIssueStreamRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LegacyIssueStreamRequest`. If the actual instance is not
   * `LegacyIssueStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LegacyIssueStreamRequest`
   * @throws ClassCastException if the instance is not `LegacyIssueStreamRequest`
   */
  public LegacyIssueStreamRequest getLegacyIssueStreamRequest() throws ClassCastException {
    return (LegacyIssueStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `UnifiedIssueStreamRequest`. If the actual instance is not
   * `UnifiedIssueStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `UnifiedIssueStreamRequest`
   * @throws ClassCastException if the instance is not `UnifiedIssueStreamRequest`
   */
  public UnifiedIssueStreamRequest getUnifiedIssueStreamRequest() throws ClassCastException {
    return (UnifiedIssueStreamRequest) super.getActualInstance();
  }
}
