/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
    using = TableWidgetDefinitionrequestsItem.TableWidgetDefinitionrequestsItemDeserializer.class)
@JsonSerialize(
    using = TableWidgetDefinitionrequestsItem.TableWidgetDefinitionrequestsItemSerializer.class)
public class TableWidgetDefinitionrequestsItem extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(TableWidgetDefinitionrequestsItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TableWidgetDefinitionrequestsItemSerializer
      extends StdSerializer<TableWidgetDefinitionrequestsItem> {
    public TableWidgetDefinitionrequestsItemSerializer(Class<TableWidgetDefinitionrequestsItem> t) {
      super(t);
    }

    public TableWidgetDefinitionrequestsItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TableWidgetDefinitionrequestsItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TableWidgetDefinitionrequestsItemDeserializer
      extends StdDeserializer<TableWidgetDefinitionrequestsItem> {
    public TableWidgetDefinitionrequestsItemDeserializer() {
      this(TableWidgetDefinitionrequestsItem.class);
    }

    public TableWidgetDefinitionrequestsItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TableWidgetDefinitionrequestsItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TableWidgetRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableWidgetRequest.class.equals(Integer.class)
            || TableWidgetRequest.class.equals(Long.class)
            || TableWidgetRequest.class.equals(Float.class)
            || TableWidgetRequest.class.equals(Double.class)
            || TableWidgetRequest.class.equals(Boolean.class)
            || TableWidgetRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableWidgetRequest.class.equals(Integer.class)
                        || TableWidgetRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableWidgetRequest.class.equals(Float.class)
                        || TableWidgetRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableWidgetRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableWidgetRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TableWidgetRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableWidgetRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TableWidgetRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TableWidgetRequest'", e);
      }

      // deserialize GuidedTableRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GuidedTableRequest.class.equals(Integer.class)
            || GuidedTableRequest.class.equals(Long.class)
            || GuidedTableRequest.class.equals(Float.class)
            || GuidedTableRequest.class.equals(Double.class)
            || GuidedTableRequest.class.equals(Boolean.class)
            || GuidedTableRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GuidedTableRequest.class.equals(Integer.class)
                        || GuidedTableRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GuidedTableRequest.class.equals(Float.class)
                        || GuidedTableRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GuidedTableRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GuidedTableRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GuidedTableRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GuidedTableRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GuidedTableRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GuidedTableRequest'", e);
      }

      TableWidgetDefinitionrequestsItem ret = new TableWidgetDefinitionrequestsItem();
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
    public TableWidgetDefinitionrequestsItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TableWidgetDefinitionrequestsItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TableWidgetDefinitionrequestsItem() {
    super("oneOf", Boolean.FALSE);
  }

  public TableWidgetDefinitionrequestsItem(TableWidgetRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableWidgetDefinitionrequestsItem(GuidedTableRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("TableWidgetRequest", new GenericType<TableWidgetRequest>() {});
    schemas.put("GuidedTableRequest", new GenericType<GuidedTableRequest>() {});
    JSON.registerDescendants(
        TableWidgetDefinitionrequestsItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TableWidgetDefinitionrequestsItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TableWidgetRequest, GuidedTableRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(TableWidgetRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GuidedTableRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TableWidgetRequest, GuidedTableRequest");
  }

  /**
   * Get the actual instance, which can be the following: TableWidgetRequest, GuidedTableRequest
   *
   * @return The actual instance (TableWidgetRequest, GuidedTableRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableWidgetRequest`. If the actual instance is not
   * `TableWidgetRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TableWidgetRequest`
   * @throws ClassCastException if the instance is not `TableWidgetRequest`
   */
  public TableWidgetRequest getTableWidgetRequest() throws ClassCastException {
    return (TableWidgetRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GuidedTableRequest`. If the actual instance is not
   * `GuidedTableRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GuidedTableRequest`
   * @throws ClassCastException if the instance is not `GuidedTableRequest`
   */
  public GuidedTableRequest getGuidedTableRequest() throws ClassCastException {
    return (GuidedTableRequest) super.getActualInstance();
  }
}
