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
@JsonDeserialize(
    using =
        FormulaUserJourneyQuery20270101Search.FormulaUserJourneyQuery20270101SearchDeserializer
            .class)
@JsonSerialize(
    using =
        FormulaUserJourneyQuery20270101Search.FormulaUserJourneyQuery20270101SearchSerializer.class)
public class FormulaUserJourneyQuery20270101Search extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(FormulaUserJourneyQuery20270101Search.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class FormulaUserJourneyQuery20270101SearchSerializer
      extends StdSerializer<FormulaUserJourneyQuery20270101Search> {
    public FormulaUserJourneyQuery20270101SearchSerializer(
        Class<FormulaUserJourneyQuery20270101Search> t) {
      super(t);
    }

    public FormulaUserJourneyQuery20270101SearchSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaUserJourneyQuery20270101Search value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class FormulaUserJourneyQuery20270101SearchDeserializer
      extends StdDeserializer<FormulaUserJourneyQuery20270101Search> {
    public FormulaUserJourneyQuery20270101SearchDeserializer() {
      this(FormulaUserJourneyQuery20270101Search.class);
    }

    public FormulaUserJourneyQuery20270101SearchDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public FormulaUserJourneyQuery20270101Search deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LegacyUserJourneySearch
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LegacyUserJourneySearch.class.equals(Integer.class)
            || LegacyUserJourneySearch.class.equals(Long.class)
            || LegacyUserJourneySearch.class.equals(Float.class)
            || LegacyUserJourneySearch.class.equals(Double.class)
            || LegacyUserJourneySearch.class.equals(Boolean.class)
            || LegacyUserJourneySearch.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LegacyUserJourneySearch.class.equals(Integer.class)
                        || LegacyUserJourneySearch.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LegacyUserJourneySearch.class.equals(Float.class)
                        || LegacyUserJourneySearch.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LegacyUserJourneySearch.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LegacyUserJourneySearch.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LegacyUserJourneySearch.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LegacyUserJourneySearch) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LegacyUserJourneySearch'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LegacyUserJourneySearch'", e);
      }

      // deserialize UserJourneySearch
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (UserJourneySearch.class.equals(Integer.class)
            || UserJourneySearch.class.equals(Long.class)
            || UserJourneySearch.class.equals(Float.class)
            || UserJourneySearch.class.equals(Double.class)
            || UserJourneySearch.class.equals(Boolean.class)
            || UserJourneySearch.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((UserJourneySearch.class.equals(Integer.class)
                        || UserJourneySearch.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((UserJourneySearch.class.equals(Float.class)
                        || UserJourneySearch.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (UserJourneySearch.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (UserJourneySearch.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(UserJourneySearch.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((UserJourneySearch) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'UserJourneySearch'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'UserJourneySearch'", e);
      }

      FormulaUserJourneyQuery20270101Search ret = new FormulaUserJourneyQuery20270101Search();
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
    public FormulaUserJourneyQuery20270101Search getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "FormulaUserJourneyQuery20270101Search cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public FormulaUserJourneyQuery20270101Search() {
    super("oneOf", Boolean.FALSE);
  }

  public FormulaUserJourneyQuery20270101Search(LegacyUserJourneySearch o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaUserJourneyQuery20270101Search(UserJourneySearch o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("LegacyUserJourneySearch", new GenericType<LegacyUserJourneySearch>() {});
    schemas.put("UserJourneySearch", new GenericType<UserJourneySearch>() {});
    JSON.registerDescendants(
        FormulaUserJourneyQuery20270101Search.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return FormulaUserJourneyQuery20270101Search.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LegacyUserJourneySearch, UserJourneySearch
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(LegacyUserJourneySearch.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(UserJourneySearch.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be LegacyUserJourneySearch, UserJourneySearch");
  }

  /**
   * Get the actual instance, which can be the following: LegacyUserJourneySearch, UserJourneySearch
   *
   * @return The actual instance (LegacyUserJourneySearch, UserJourneySearch)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LegacyUserJourneySearch`. If the actual instance is not
   * `LegacyUserJourneySearch`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LegacyUserJourneySearch`
   * @throws ClassCastException if the instance is not `LegacyUserJourneySearch`
   */
  public LegacyUserJourneySearch getLegacyUserJourneySearch() throws ClassCastException {
    return (LegacyUserJourneySearch) super.getActualInstance();
  }

  /**
   * Get the actual instance of `UserJourneySearch`. If the actual instance is not
   * `UserJourneySearch`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `UserJourneySearch`
   * @throws ClassCastException if the instance is not `UserJourneySearch`
   */
  public UserJourneySearch getUserJourneySearch() throws ClassCastException {
    return (UserJourneySearch) super.getActualInstance();
  }
}
