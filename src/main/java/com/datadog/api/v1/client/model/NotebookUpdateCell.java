/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
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
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = NotebookUpdateCell.NotebookUpdateCellDeserializer.class)
@JsonSerialize(using = NotebookUpdateCell.NotebookUpdateCellSerializer.class)
public class NotebookUpdateCell extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(NotebookUpdateCell.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class NotebookUpdateCellSerializer extends StdSerializer<NotebookUpdateCell> {
    public NotebookUpdateCellSerializer(Class<NotebookUpdateCell> t) {
      super(t);
    }

    public NotebookUpdateCellSerializer() {
      this(null);
    }

    @Override
    public void serialize(NotebookUpdateCell value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class NotebookUpdateCellDeserializer extends StdDeserializer<NotebookUpdateCell> {
    public NotebookUpdateCellDeserializer() {
      this(NotebookUpdateCell.class);
    }

    public NotebookUpdateCellDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public NotebookUpdateCell deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize NotebookCellCreateRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookCellCreateRequest.class.equals(Integer.class)
            || NotebookCellCreateRequest.class.equals(Long.class)
            || NotebookCellCreateRequest.class.equals(Float.class)
            || NotebookCellCreateRequest.class.equals(Double.class)
            || NotebookCellCreateRequest.class.equals(Boolean.class)
            || NotebookCellCreateRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookCellCreateRequest.class.equals(Integer.class)
                        || NotebookCellCreateRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookCellCreateRequest.class.equals(Float.class)
                        || NotebookCellCreateRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookCellCreateRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookCellCreateRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookCellCreateRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookCellCreateRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookCellCreateRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NotebookCellCreateRequest'", e);
      }

      // deserialize NotebookCellUpdateRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookCellUpdateRequest.class.equals(Integer.class)
            || NotebookCellUpdateRequest.class.equals(Long.class)
            || NotebookCellUpdateRequest.class.equals(Float.class)
            || NotebookCellUpdateRequest.class.equals(Double.class)
            || NotebookCellUpdateRequest.class.equals(Boolean.class)
            || NotebookCellUpdateRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookCellUpdateRequest.class.equals(Integer.class)
                        || NotebookCellUpdateRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookCellUpdateRequest.class.equals(Float.class)
                        || NotebookCellUpdateRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookCellUpdateRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookCellUpdateRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookCellUpdateRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookCellUpdateRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookCellUpdateRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NotebookCellUpdateRequest'", e);
      }

      NotebookUpdateCell ret = new NotebookUpdateCell();
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
    public NotebookUpdateCell getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "NotebookUpdateCell cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public NotebookUpdateCell() {
    super("oneOf", Boolean.FALSE);
  }

  public NotebookUpdateCell(NotebookCellCreateRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotebookUpdateCell(NotebookCellUpdateRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("NotebookCellCreateRequest", new GenericType<NotebookCellCreateRequest>() {});
    schemas.put("NotebookCellUpdateRequest", new GenericType<NotebookCellUpdateRequest>() {});
    JSON.registerDescendants(NotebookUpdateCell.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return NotebookUpdateCell.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: NotebookCellCreateRequest, NotebookCellUpdateRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(NotebookCellCreateRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NotebookCellUpdateRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be NotebookCellCreateRequest, NotebookCellUpdateRequest");
  }

  /**
   * Get the actual instance, which can be the following: NotebookCellCreateRequest,
   * NotebookCellUpdateRequest
   *
   * @return The actual instance (NotebookCellCreateRequest, NotebookCellUpdateRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookCellCreateRequest`. If the actual instance is not
   * `NotebookCellCreateRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookCellCreateRequest`
   * @throws ClassCastException if the instance is not `NotebookCellCreateRequest`
   */
  public NotebookCellCreateRequest getNotebookCellCreateRequest() throws ClassCastException {
    return (NotebookCellCreateRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookCellUpdateRequest`. If the actual instance is not
   * `NotebookCellUpdateRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookCellUpdateRequest`
   * @throws ClassCastException if the instance is not `NotebookCellUpdateRequest`
   */
  public NotebookCellUpdateRequest getNotebookCellUpdateRequest() throws ClassCastException {
    return (NotebookCellUpdateRequest) super.getActualInstance();
  }
}
