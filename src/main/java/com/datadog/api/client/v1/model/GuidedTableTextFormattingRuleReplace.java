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
    using =
        GuidedTableTextFormattingRuleReplace.GuidedTableTextFormattingRuleReplaceDeserializer.class)
@JsonSerialize(
    using =
        GuidedTableTextFormattingRuleReplace.GuidedTableTextFormattingRuleReplaceSerializer.class)
public class GuidedTableTextFormattingRuleReplace extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(GuidedTableTextFormattingRuleReplace.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GuidedTableTextFormattingRuleReplaceSerializer
      extends StdSerializer<GuidedTableTextFormattingRuleReplace> {
    public GuidedTableTextFormattingRuleReplaceSerializer(
        Class<GuidedTableTextFormattingRuleReplace> t) {
      super(t);
    }

    public GuidedTableTextFormattingRuleReplaceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTableTextFormattingRuleReplace value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GuidedTableTextFormattingRuleReplaceDeserializer
      extends StdDeserializer<GuidedTableTextFormattingRuleReplace> {
    public GuidedTableTextFormattingRuleReplaceDeserializer() {
      this(GuidedTableTextFormattingRuleReplace.class);
    }

    public GuidedTableTextFormattingRuleReplaceDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GuidedTableTextFormattingRuleReplace deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TableWidgetTextFormatReplaceAll
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableWidgetTextFormatReplaceAll.class.equals(Integer.class)
            || TableWidgetTextFormatReplaceAll.class.equals(Long.class)
            || TableWidgetTextFormatReplaceAll.class.equals(Float.class)
            || TableWidgetTextFormatReplaceAll.class.equals(Double.class)
            || TableWidgetTextFormatReplaceAll.class.equals(Boolean.class)
            || TableWidgetTextFormatReplaceAll.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableWidgetTextFormatReplaceAll.class.equals(Integer.class)
                        || TableWidgetTextFormatReplaceAll.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableWidgetTextFormatReplaceAll.class.equals(Float.class)
                        || TableWidgetTextFormatReplaceAll.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableWidgetTextFormatReplaceAll.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableWidgetTextFormatReplaceAll.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TableWidgetTextFormatReplaceAll.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableWidgetTextFormatReplaceAll) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TableWidgetTextFormatReplaceAll'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'TableWidgetTextFormatReplaceAll'", e);
      }

      // deserialize GuidedTableTextFormattingRuleReplaceOneOf4484404608
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Integer.class)
            || GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Long.class)
            || GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Float.class)
            || GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Double.class)
            || GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Boolean.class)
            || GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Integer.class)
                        || GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Float.class)
                        || GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GuidedTableTextFormattingRuleReplaceOneOf4484404608.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GuidedTableTextFormattingRuleReplaceOneOf4484404608.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GuidedTableTextFormattingRuleReplaceOneOf4484404608) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GuidedTableTextFormattingRuleReplaceOneOf4484404608'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'GuidedTableTextFormattingRuleReplaceOneOf4484404608'",
            e);
      }

      GuidedTableTextFormattingRuleReplace ret = new GuidedTableTextFormattingRuleReplace();
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
    public GuidedTableTextFormattingRuleReplace getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "GuidedTableTextFormattingRuleReplace cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GuidedTableTextFormattingRuleReplace() {
    super("oneOf", Boolean.FALSE);
  }

  public GuidedTableTextFormattingRuleReplace(TableWidgetTextFormatReplaceAll o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableTextFormattingRuleReplace(
      GuidedTableTextFormattingRuleReplaceOneOf4484404608 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TableWidgetTextFormatReplaceAll", new GenericType<TableWidgetTextFormatReplaceAll>() {});
    schemas.put(
        "GuidedTableTextFormattingRuleReplaceOneOf4484404608",
        new GenericType<GuidedTableTextFormattingRuleReplaceOneOf4484404608>() {});
    JSON.registerDescendants(
        GuidedTableTextFormattingRuleReplace.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GuidedTableTextFormattingRuleReplace.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TableWidgetTextFormatReplaceAll,
   * GuidedTableTextFormattingRuleReplaceOneOf4484404608
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TableWidgetTextFormatReplaceAll.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GuidedTableTextFormattingRuleReplaceOneOf4484404608.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be TableWidgetTextFormatReplaceAll,"
            + " GuidedTableTextFormattingRuleReplaceOneOf4484404608");
  }

  /**
   * Get the actual instance, which can be the following: TableWidgetTextFormatReplaceAll,
   * GuidedTableTextFormattingRuleReplaceOneOf4484404608
   *
   * @return The actual instance (TableWidgetTextFormatReplaceAll,
   *     GuidedTableTextFormattingRuleReplaceOneOf4484404608)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableWidgetTextFormatReplaceAll`. If the actual instance is not
   * `TableWidgetTextFormatReplaceAll`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TableWidgetTextFormatReplaceAll`
   * @throws ClassCastException if the instance is not `TableWidgetTextFormatReplaceAll`
   */
  public TableWidgetTextFormatReplaceAll getTableWidgetTextFormatReplaceAll()
      throws ClassCastException {
    return (TableWidgetTextFormatReplaceAll) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GuidedTableTextFormattingRuleReplaceOneOf4484404608`. If the actual
   * instance is not `GuidedTableTextFormattingRuleReplaceOneOf4484404608`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GuidedTableTextFormattingRuleReplaceOneOf4484404608`
   * @throws ClassCastException if the instance is not
   *     `GuidedTableTextFormattingRuleReplaceOneOf4484404608`
   */
  public GuidedTableTextFormattingRuleReplaceOneOf4484404608
      getGuidedTableTextFormattingRuleReplaceOneOf4484404608() throws ClassCastException {
    return (GuidedTableTextFormattingRuleReplaceOneOf4484404608) super.getActualInstance();
  }
}
