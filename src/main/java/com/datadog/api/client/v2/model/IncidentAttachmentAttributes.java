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
    using = IncidentAttachmentAttributes.IncidentAttachmentAttributesDeserializer.class)
@JsonSerialize(using = IncidentAttachmentAttributes.IncidentAttachmentAttributesSerializer.class)
public class IncidentAttachmentAttributes extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(IncidentAttachmentAttributes.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class IncidentAttachmentAttributesSerializer
      extends StdSerializer<IncidentAttachmentAttributes> {
    public IncidentAttachmentAttributesSerializer(Class<IncidentAttachmentAttributes> t) {
      super(t);
    }

    public IncidentAttachmentAttributesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentAttachmentAttributes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class IncidentAttachmentAttributesDeserializer
      extends StdDeserializer<IncidentAttachmentAttributes> {
    public IncidentAttachmentAttributesDeserializer() {
      this(IncidentAttachmentAttributes.class);
    }

    public IncidentAttachmentAttributesDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IncidentAttachmentAttributes deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize IncidentAttachmentPostmortemAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentAttachmentPostmortemAttributes.class.equals(Integer.class)
            || IncidentAttachmentPostmortemAttributes.class.equals(Long.class)
            || IncidentAttachmentPostmortemAttributes.class.equals(Float.class)
            || IncidentAttachmentPostmortemAttributes.class.equals(Double.class)
            || IncidentAttachmentPostmortemAttributes.class.equals(Boolean.class)
            || IncidentAttachmentPostmortemAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentAttachmentPostmortemAttributes.class.equals(Integer.class)
                        || IncidentAttachmentPostmortemAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentAttachmentPostmortemAttributes.class.equals(Float.class)
                        || IncidentAttachmentPostmortemAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentAttachmentPostmortemAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentAttachmentPostmortemAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(IncidentAttachmentPostmortemAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentAttachmentPostmortemAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'IncidentAttachmentPostmortemAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'IncidentAttachmentPostmortemAttributes'",
            e);
      }

      // deserialize IncidentAttachmentLinkAttributes
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentAttachmentLinkAttributes.class.equals(Integer.class)
            || IncidentAttachmentLinkAttributes.class.equals(Long.class)
            || IncidentAttachmentLinkAttributes.class.equals(Float.class)
            || IncidentAttachmentLinkAttributes.class.equals(Double.class)
            || IncidentAttachmentLinkAttributes.class.equals(Boolean.class)
            || IncidentAttachmentLinkAttributes.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentAttachmentLinkAttributes.class.equals(Integer.class)
                        || IncidentAttachmentLinkAttributes.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentAttachmentLinkAttributes.class.equals(Float.class)
                        || IncidentAttachmentLinkAttributes.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentAttachmentLinkAttributes.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentAttachmentLinkAttributes.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentAttachmentLinkAttributes.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentAttachmentLinkAttributes) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentAttachmentLinkAttributes'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'IncidentAttachmentLinkAttributes'", e);
      }

      IncidentAttachmentAttributes ret = new IncidentAttachmentAttributes();
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
    public IncidentAttachmentAttributes getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "IncidentAttachmentAttributes cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public IncidentAttachmentAttributes() {
    super("oneOf", Boolean.FALSE);
  }

  public IncidentAttachmentAttributes(IncidentAttachmentPostmortemAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public IncidentAttachmentAttributes(IncidentAttachmentLinkAttributes o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "IncidentAttachmentPostmortemAttributes",
        new GenericType<IncidentAttachmentPostmortemAttributes>() {});
    schemas.put(
        "IncidentAttachmentLinkAttributes", new GenericType<IncidentAttachmentLinkAttributes>() {});
    JSON.registerDescendants(
        IncidentAttachmentAttributes.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return IncidentAttachmentAttributes.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: IncidentAttachmentPostmortemAttributes,
   * IncidentAttachmentLinkAttributes
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        IncidentAttachmentPostmortemAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        IncidentAttachmentLinkAttributes.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be IncidentAttachmentPostmortemAttributes,"
            + " IncidentAttachmentLinkAttributes");
  }

  /**
   * Get the actual instance, which can be the following: IncidentAttachmentPostmortemAttributes,
   * IncidentAttachmentLinkAttributes
   *
   * @return The actual instance (IncidentAttachmentPostmortemAttributes,
   *     IncidentAttachmentLinkAttributes)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentAttachmentPostmortemAttributes`. If the actual instance is
   * not `IncidentAttachmentPostmortemAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentAttachmentPostmortemAttributes`
   * @throws ClassCastException if the instance is not `IncidentAttachmentPostmortemAttributes`
   */
  public IncidentAttachmentPostmortemAttributes getIncidentAttachmentPostmortemAttributes()
      throws ClassCastException {
    return (IncidentAttachmentPostmortemAttributes) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentAttachmentLinkAttributes`. If the actual instance is not
   * `IncidentAttachmentLinkAttributes`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentAttachmentLinkAttributes`
   * @throws ClassCastException if the instance is not `IncidentAttachmentLinkAttributes`
   */
  public IncidentAttachmentLinkAttributes getIncidentAttachmentLinkAttributes()
      throws ClassCastException {
    return (IncidentAttachmentLinkAttributes) super.getActualInstance();
  }
}
