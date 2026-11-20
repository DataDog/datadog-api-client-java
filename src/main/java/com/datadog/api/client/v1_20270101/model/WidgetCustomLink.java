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
@JsonDeserialize(using = WidgetCustomLink.WidgetCustomLinkDeserializer.class)
@JsonSerialize(using = WidgetCustomLink.WidgetCustomLinkSerializer.class)
public class WidgetCustomLink extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(WidgetCustomLink.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class WidgetCustomLinkSerializer extends StdSerializer<WidgetCustomLink> {
    public WidgetCustomLinkSerializer(Class<WidgetCustomLink> t) {
      super(t);
    }

    public WidgetCustomLinkSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetCustomLink value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class WidgetCustomLinkDeserializer extends StdDeserializer<WidgetCustomLink> {
    public WidgetCustomLinkDeserializer() {
      this(WidgetCustomLink.class);
    }

    public WidgetCustomLinkDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public WidgetCustomLink deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ContextMenuLink
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ContextMenuLink.class.equals(Integer.class)
            || ContextMenuLink.class.equals(Long.class)
            || ContextMenuLink.class.equals(Float.class)
            || ContextMenuLink.class.equals(Double.class)
            || ContextMenuLink.class.equals(Boolean.class)
            || ContextMenuLink.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ContextMenuLink.class.equals(Integer.class)
                        || ContextMenuLink.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ContextMenuLink.class.equals(Float.class)
                        || ContextMenuLink.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ContextMenuLink.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ContextMenuLink.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ContextMenuLink.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ContextMenuLink) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ContextMenuLink'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ContextMenuLink'", e);
      }

      // deserialize UserDefinedLink
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (UserDefinedLink.class.equals(Integer.class)
            || UserDefinedLink.class.equals(Long.class)
            || UserDefinedLink.class.equals(Float.class)
            || UserDefinedLink.class.equals(Double.class)
            || UserDefinedLink.class.equals(Boolean.class)
            || UserDefinedLink.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((UserDefinedLink.class.equals(Integer.class)
                        || UserDefinedLink.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((UserDefinedLink.class.equals(Float.class)
                        || UserDefinedLink.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (UserDefinedLink.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (UserDefinedLink.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(UserDefinedLink.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((UserDefinedLink) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'UserDefinedLink'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'UserDefinedLink'", e);
      }

      WidgetCustomLink ret = new WidgetCustomLink();
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
    public WidgetCustomLink getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "WidgetCustomLink cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public WidgetCustomLink() {
    super("oneOf", Boolean.FALSE);
  }

  public WidgetCustomLink(ContextMenuLink o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public WidgetCustomLink(UserDefinedLink o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ContextMenuLink", new GenericType<ContextMenuLink>() {});
    schemas.put("UserDefinedLink", new GenericType<UserDefinedLink>() {});
    JSON.registerDescendants(WidgetCustomLink.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return WidgetCustomLink.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ContextMenuLink, UserDefinedLink
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ContextMenuLink.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(UserDefinedLink.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException("Invalid instance type. Must be ContextMenuLink, UserDefinedLink");
  }

  /**
   * Get the actual instance, which can be the following: ContextMenuLink, UserDefinedLink
   *
   * @return The actual instance (ContextMenuLink, UserDefinedLink)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ContextMenuLink`. If the actual instance is not `ContextMenuLink`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ContextMenuLink`
   * @throws ClassCastException if the instance is not `ContextMenuLink`
   */
  public ContextMenuLink getContextMenuLink() throws ClassCastException {
    return (ContextMenuLink) super.getActualInstance();
  }

  /**
   * Get the actual instance of `UserDefinedLink`. If the actual instance is not `UserDefinedLink`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `UserDefinedLink`
   * @throws ClassCastException if the instance is not `UserDefinedLink`
   */
  public UserDefinedLink getUserDefinedLink() throws ClassCastException {
    return (UserDefinedLink) super.getActualInstance();
  }
}
