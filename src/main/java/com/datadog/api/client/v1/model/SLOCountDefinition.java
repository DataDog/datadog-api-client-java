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
@JsonDeserialize(using = SLOCountDefinition.SLOCountDefinitionDeserializer.class)
@JsonSerialize(using = SLOCountDefinition.SLOCountDefinitionSerializer.class)
public class SLOCountDefinition extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SLOCountDefinition.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SLOCountDefinitionSerializer extends StdSerializer<SLOCountDefinition> {
    public SLOCountDefinitionSerializer(Class<SLOCountDefinition> t) {
      super(t);
    }

    public SLOCountDefinitionSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOCountDefinition value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SLOCountDefinitionDeserializer extends StdDeserializer<SLOCountDefinition> {
    public SLOCountDefinitionDeserializer() {
      this(SLOCountDefinition.class);
    }

    public SLOCountDefinitionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SLOCountDefinition deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize SLOCountDefinitionWithTotalEventsFormula
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SLOCountDefinitionWithTotalEventsFormula.class.equals(Integer.class)
            || SLOCountDefinitionWithTotalEventsFormula.class.equals(Long.class)
            || SLOCountDefinitionWithTotalEventsFormula.class.equals(Float.class)
            || SLOCountDefinitionWithTotalEventsFormula.class.equals(Double.class)
            || SLOCountDefinitionWithTotalEventsFormula.class.equals(Boolean.class)
            || SLOCountDefinitionWithTotalEventsFormula.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SLOCountDefinitionWithTotalEventsFormula.class.equals(Integer.class)
                        || SLOCountDefinitionWithTotalEventsFormula.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SLOCountDefinitionWithTotalEventsFormula.class.equals(Float.class)
                        || SLOCountDefinitionWithTotalEventsFormula.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SLOCountDefinitionWithTotalEventsFormula.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SLOCountDefinitionWithTotalEventsFormula.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SLOCountDefinitionWithTotalEventsFormula.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SLOCountDefinitionWithTotalEventsFormula) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'SLOCountDefinitionWithTotalEventsFormula'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SLOCountDefinitionWithTotalEventsFormula'",
            e);
      }

      // deserialize SLOCountDefinitionWithBadEventsFormula
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SLOCountDefinitionWithBadEventsFormula.class.equals(Integer.class)
            || SLOCountDefinitionWithBadEventsFormula.class.equals(Long.class)
            || SLOCountDefinitionWithBadEventsFormula.class.equals(Float.class)
            || SLOCountDefinitionWithBadEventsFormula.class.equals(Double.class)
            || SLOCountDefinitionWithBadEventsFormula.class.equals(Boolean.class)
            || SLOCountDefinitionWithBadEventsFormula.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SLOCountDefinitionWithBadEventsFormula.class.equals(Integer.class)
                        || SLOCountDefinitionWithBadEventsFormula.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SLOCountDefinitionWithBadEventsFormula.class.equals(Float.class)
                        || SLOCountDefinitionWithBadEventsFormula.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SLOCountDefinitionWithBadEventsFormula.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SLOCountDefinitionWithBadEventsFormula.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(SLOCountDefinitionWithBadEventsFormula.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SLOCountDefinitionWithBadEventsFormula) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'SLOCountDefinitionWithBadEventsFormula'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SLOCountDefinitionWithBadEventsFormula'",
            e);
      }

      SLOCountDefinition ret = new SLOCountDefinition();
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
    public SLOCountDefinition getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SLOCountDefinition cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SLOCountDefinition() {
    super("oneOf", Boolean.FALSE);
  }

  public SLOCountDefinition(SLOCountDefinitionWithTotalEventsFormula o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SLOCountDefinition(SLOCountDefinitionWithBadEventsFormula o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "SLOCountDefinitionWithTotalEventsFormula",
        new GenericType<SLOCountDefinitionWithTotalEventsFormula>() {});
    schemas.put(
        "SLOCountDefinitionWithBadEventsFormula",
        new GenericType<SLOCountDefinitionWithBadEventsFormula>() {});
    JSON.registerDescendants(SLOCountDefinition.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SLOCountDefinition.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: SLOCountDefinitionWithTotalEventsFormula,
   * SLOCountDefinitionWithBadEventsFormula
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        SLOCountDefinitionWithTotalEventsFormula.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SLOCountDefinitionWithBadEventsFormula.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be SLOCountDefinitionWithTotalEventsFormula,"
            + " SLOCountDefinitionWithBadEventsFormula");
  }

  /**
   * Get the actual instance, which can be the following: SLOCountDefinitionWithTotalEventsFormula,
   * SLOCountDefinitionWithBadEventsFormula
   *
   * @return The actual instance (SLOCountDefinitionWithTotalEventsFormula,
   *     SLOCountDefinitionWithBadEventsFormula)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SLOCountDefinitionWithTotalEventsFormula`. If the actual instance
   * is not `SLOCountDefinitionWithTotalEventsFormula`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SLOCountDefinitionWithTotalEventsFormula`
   * @throws ClassCastException if the instance is not `SLOCountDefinitionWithTotalEventsFormula`
   */
  public SLOCountDefinitionWithTotalEventsFormula getSLOCountDefinitionWithTotalEventsFormula()
      throws ClassCastException {
    return (SLOCountDefinitionWithTotalEventsFormula) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SLOCountDefinitionWithBadEventsFormula`. If the actual instance is
   * not `SLOCountDefinitionWithBadEventsFormula`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SLOCountDefinitionWithBadEventsFormula`
   * @throws ClassCastException if the instance is not `SLOCountDefinitionWithBadEventsFormula`
   */
  public SLOCountDefinitionWithBadEventsFormula getSLOCountDefinitionWithBadEventsFormula()
      throws ClassCastException {
    return (SLOCountDefinitionWithBadEventsFormula) super.getActualInstance();
  }
}
