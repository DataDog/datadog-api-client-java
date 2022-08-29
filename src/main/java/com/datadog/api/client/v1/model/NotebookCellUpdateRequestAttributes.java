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
        NotebookCellUpdateRequestAttributes.NotebookCellUpdateRequestAttributesDeserializer.class)
@JsonSerialize(
    using = NotebookCellUpdateRequestAttributes.NotebookCellUpdateRequestAttributesSerializer.class)
public class NotebookCellUpdateRequestAttributes extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(NotebookCellUpdateRequestAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class NotebookCellUpdateRequestAttributesSerializer
      extends StdSerializer<NotebookCellUpdateRequestAttributes> {
    public NotebookCellUpdateRequestAttributesSerializer(
        Class<NotebookCellUpdateRequestAttributes> t) {
      super(t);
    }

    public NotebookCellUpdateRequestAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotebookCellUpdateRequestAttributes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class NotebookCellUpdateRequestAttributesDeserializer
      extends StdDeserializer<NotebookCellUpdateRequestAttributes> {
    public NotebookCellUpdateRequestAttributesDeserializer() {
      this(NotebookCellUpdateRequestAttributes.class);
    }

    public NotebookCellUpdateRequestAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public NotebookCellUpdateRequestAttributes deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize NotebookMarkdownCellAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookMarkdownCellAttributes.class.equals(Integer.class)
            || NotebookMarkdownCellAttributes.class.equals(Long.class)
            || NotebookMarkdownCellAttributes.class.equals(Float.class)
            || NotebookMarkdownCellAttributes.class.equals(Double.class)
            || NotebookMarkdownCellAttributes.class.equals(Boolean.class)
            || NotebookMarkdownCellAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookMarkdownCellAttributes.class.equals(Integer.class)
                        || NotebookMarkdownCellAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookMarkdownCellAttributes.class.equals(Float.class)
                        || NotebookMarkdownCellAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookMarkdownCellAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookMarkdownCellAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookMarkdownCellAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookMarkdownCellAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookMarkdownCellAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'NotebookMarkdownCellAttributes'", e);
      }

      // deserialize NotebookTimeseriesCellAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookTimeseriesCellAttributes.class.equals(Integer.class)
            || NotebookTimeseriesCellAttributes.class.equals(Long.class)
            || NotebookTimeseriesCellAttributes.class.equals(Float.class)
            || NotebookTimeseriesCellAttributes.class.equals(Double.class)
            || NotebookTimeseriesCellAttributes.class.equals(Boolean.class)
            || NotebookTimeseriesCellAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookTimeseriesCellAttributes.class.equals(Integer.class)
                        || NotebookTimeseriesCellAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookTimeseriesCellAttributes.class.equals(Float.class)
                        || NotebookTimeseriesCellAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookTimeseriesCellAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookTimeseriesCellAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookTimeseriesCellAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookTimeseriesCellAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookTimeseriesCellAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'NotebookTimeseriesCellAttributes'", e);
      }

      // deserialize NotebookToplistCellAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookToplistCellAttributes.class.equals(Integer.class)
            || NotebookToplistCellAttributes.class.equals(Long.class)
            || NotebookToplistCellAttributes.class.equals(Float.class)
            || NotebookToplistCellAttributes.class.equals(Double.class)
            || NotebookToplistCellAttributes.class.equals(Boolean.class)
            || NotebookToplistCellAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookToplistCellAttributes.class.equals(Integer.class)
                        || NotebookToplistCellAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookToplistCellAttributes.class.equals(Float.class)
                        || NotebookToplistCellAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookToplistCellAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookToplistCellAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookToplistCellAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookToplistCellAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookToplistCellAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NotebookToplistCellAttributes'", e);
      }

      // deserialize NotebookHeatMapCellAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookHeatMapCellAttributes.class.equals(Integer.class)
            || NotebookHeatMapCellAttributes.class.equals(Long.class)
            || NotebookHeatMapCellAttributes.class.equals(Float.class)
            || NotebookHeatMapCellAttributes.class.equals(Double.class)
            || NotebookHeatMapCellAttributes.class.equals(Boolean.class)
            || NotebookHeatMapCellAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookHeatMapCellAttributes.class.equals(Integer.class)
                        || NotebookHeatMapCellAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookHeatMapCellAttributes.class.equals(Float.class)
                        || NotebookHeatMapCellAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookHeatMapCellAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookHeatMapCellAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookHeatMapCellAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookHeatMapCellAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookHeatMapCellAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NotebookHeatMapCellAttributes'", e);
      }

      // deserialize NotebookDistributionCellAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookDistributionCellAttributes.class.equals(Integer.class)
            || NotebookDistributionCellAttributes.class.equals(Long.class)
            || NotebookDistributionCellAttributes.class.equals(Float.class)
            || NotebookDistributionCellAttributes.class.equals(Double.class)
            || NotebookDistributionCellAttributes.class.equals(Boolean.class)
            || NotebookDistributionCellAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookDistributionCellAttributes.class.equals(Integer.class)
                        || NotebookDistributionCellAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookDistributionCellAttributes.class.equals(Float.class)
                        || NotebookDistributionCellAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookDistributionCellAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookDistributionCellAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookDistributionCellAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookDistributionCellAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookDistributionCellAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'NotebookDistributionCellAttributes'",
            e);
      }

      // deserialize NotebookLogStreamCellAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NotebookLogStreamCellAttributes.class.equals(Integer.class)
            || NotebookLogStreamCellAttributes.class.equals(Long.class)
            || NotebookLogStreamCellAttributes.class.equals(Float.class)
            || NotebookLogStreamCellAttributes.class.equals(Double.class)
            || NotebookLogStreamCellAttributes.class.equals(Boolean.class)
            || NotebookLogStreamCellAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NotebookLogStreamCellAttributes.class.equals(Integer.class)
                        || NotebookLogStreamCellAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NotebookLogStreamCellAttributes.class.equals(Float.class)
                        || NotebookLogStreamCellAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NotebookLogStreamCellAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NotebookLogStreamCellAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NotebookLogStreamCellAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NotebookLogStreamCellAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NotebookLogStreamCellAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'NotebookLogStreamCellAttributes'", e);
      }

      NotebookCellUpdateRequestAttributes ret = new NotebookCellUpdateRequestAttributes();
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
    public NotebookCellUpdateRequestAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "NotebookCellUpdateRequestAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public NotebookCellUpdateRequestAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public NotebookCellUpdateRequestAttributes(NotebookMarkdownCellAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotebookCellUpdateRequestAttributes(NotebookTimeseriesCellAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotebookCellUpdateRequestAttributes(NotebookToplistCellAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotebookCellUpdateRequestAttributes(NotebookHeatMapCellAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotebookCellUpdateRequestAttributes(NotebookDistributionCellAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public NotebookCellUpdateRequestAttributes(NotebookLogStreamCellAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "NotebookMarkdownCellAttributes", new GenericType<NotebookMarkdownCellAttributes>() {});
    schemas.put(
        "NotebookTimeseriesCellAttributes", new GenericType<NotebookTimeseriesCellAttributes>() {});
    schemas.put(
        "NotebookToplistCellAttributes", new GenericType<NotebookToplistCellAttributes>() {});
    schemas.put(
        "NotebookHeatMapCellAttributes", new GenericType<NotebookHeatMapCellAttributes>() {});
    schemas.put(
        "NotebookDistributionCellAttributes",
        new GenericType<NotebookDistributionCellAttributes>() {});
    schemas.put(
        "NotebookLogStreamCellAttributes", new GenericType<NotebookLogStreamCellAttributes>() {});
    JSON.registerDescendants(
        NotebookCellUpdateRequestAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return NotebookCellUpdateRequestAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: NotebookMarkdownCellAttributes,
   * NotebookTimeseriesCellAttributes, NotebookToplistCellAttributes, NotebookHeatMapCellAttributes,
   * NotebookDistributionCellAttributes, NotebookLogStreamCellAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        NotebookMarkdownCellAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        NotebookTimeseriesCellAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NotebookToplistCellAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NotebookHeatMapCellAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        NotebookDistributionCellAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        NotebookLogStreamCellAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be NotebookMarkdownCellAttributes,"
            + " NotebookTimeseriesCellAttributes, NotebookToplistCellAttributes,"
            + " NotebookHeatMapCellAttributes, NotebookDistributionCellAttributes,"
            + " NotebookLogStreamCellAttributes");
  }

  /**
   * Get the actual instance, which can be the following: NotebookMarkdownCellAttributes,
   * NotebookTimeseriesCellAttributes, NotebookToplistCellAttributes, NotebookHeatMapCellAttributes,
   * NotebookDistributionCellAttributes, NotebookLogStreamCellAttributes
   *
   * @return The actual instance (NotebookMarkdownCellAttributes, NotebookTimeseriesCellAttributes,
   *     NotebookToplistCellAttributes, NotebookHeatMapCellAttributes,
   *     NotebookDistributionCellAttributes, NotebookLogStreamCellAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookMarkdownCellAttributes`. If the actual instance is not
   * `NotebookMarkdownCellAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookMarkdownCellAttributes`
   * @throws ClassCastException if the instance is not `NotebookMarkdownCellAttributes`
   */
  public NotebookMarkdownCellAttributes getNotebookMarkdownCellAttributes()
      throws ClassCastException {
    return (NotebookMarkdownCellAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookTimeseriesCellAttributes`. If the actual instance is not
   * `NotebookTimeseriesCellAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookTimeseriesCellAttributes`
   * @throws ClassCastException if the instance is not `NotebookTimeseriesCellAttributes`
   */
  public NotebookTimeseriesCellAttributes getNotebookTimeseriesCellAttributes()
      throws ClassCastException {
    return (NotebookTimeseriesCellAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookToplistCellAttributes`. If the actual instance is not
   * `NotebookToplistCellAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookToplistCellAttributes`
   * @throws ClassCastException if the instance is not `NotebookToplistCellAttributes`
   */
  public NotebookToplistCellAttributes getNotebookToplistCellAttributes()
      throws ClassCastException {
    return (NotebookToplistCellAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookHeatMapCellAttributes`. If the actual instance is not
   * `NotebookHeatMapCellAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookHeatMapCellAttributes`
   * @throws ClassCastException if the instance is not `NotebookHeatMapCellAttributes`
   */
  public NotebookHeatMapCellAttributes getNotebookHeatMapCellAttributes()
      throws ClassCastException {
    return (NotebookHeatMapCellAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookDistributionCellAttributes`. If the actual instance is not
   * `NotebookDistributionCellAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookDistributionCellAttributes`
   * @throws ClassCastException if the instance is not `NotebookDistributionCellAttributes`
   */
  public NotebookDistributionCellAttributes getNotebookDistributionCellAttributes()
      throws ClassCastException {
    return (NotebookDistributionCellAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NotebookLogStreamCellAttributes`. If the actual instance is not
   * `NotebookLogStreamCellAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NotebookLogStreamCellAttributes`
   * @throws ClassCastException if the instance is not `NotebookLogStreamCellAttributes`
   */
  public NotebookLogStreamCellAttributes getNotebookLogStreamCellAttributes()
      throws ClassCastException {
    return (NotebookLogStreamCellAttributes) super.getActualInstance();
  }
}
