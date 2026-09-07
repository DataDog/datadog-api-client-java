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
@JsonDeserialize(using = XRayServicesList.XRayServicesListDeserializer.class)
@JsonSerialize(using = XRayServicesList.XRayServicesListSerializer.class)
public class XRayServicesList extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(XRayServicesList.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class XRayServicesListSerializer extends StdSerializer<XRayServicesList> {
    public XRayServicesListSerializer(Class<XRayServicesList> t) {
      super(t);
    }

    public XRayServicesListSerializer() {
      this(null);
    }

    @Override
    public void serialize(XRayServicesList value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class XRayServicesListDeserializer extends StdDeserializer<XRayServicesList> {
    public XRayServicesListDeserializer() {
      this(XRayServicesList.class);
    }

    public XRayServicesListDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public XRayServicesList deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize XRayServicesIncludeAll
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (XRayServicesIncludeAll.class.equals(Integer.class)
            || XRayServicesIncludeAll.class.equals(Long.class)
            || XRayServicesIncludeAll.class.equals(Float.class)
            || XRayServicesIncludeAll.class.equals(Double.class)
            || XRayServicesIncludeAll.class.equals(Boolean.class)
            || XRayServicesIncludeAll.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((XRayServicesIncludeAll.class.equals(Integer.class)
                        || XRayServicesIncludeAll.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((XRayServicesIncludeAll.class.equals(Float.class)
                        || XRayServicesIncludeAll.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (XRayServicesIncludeAll.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (XRayServicesIncludeAll.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(XRayServicesIncludeAll.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((XRayServicesIncludeAll) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'XRayServicesIncludeAll'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'XRayServicesIncludeAll'", e);
      }

      // deserialize XRayServicesIncludeOnly
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (XRayServicesIncludeOnly.class.equals(Integer.class)
            || XRayServicesIncludeOnly.class.equals(Long.class)
            || XRayServicesIncludeOnly.class.equals(Float.class)
            || XRayServicesIncludeOnly.class.equals(Double.class)
            || XRayServicesIncludeOnly.class.equals(Boolean.class)
            || XRayServicesIncludeOnly.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((XRayServicesIncludeOnly.class.equals(Integer.class)
                        || XRayServicesIncludeOnly.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((XRayServicesIncludeOnly.class.equals(Float.class)
                        || XRayServicesIncludeOnly.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (XRayServicesIncludeOnly.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (XRayServicesIncludeOnly.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
            attemptParsing |= (token == JsonToken.VALUE_NULL);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(XRayServicesIncludeOnly.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((XRayServicesIncludeOnly) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'XRayServicesIncludeOnly'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'XRayServicesIncludeOnly'", e);
      }

      XRayServicesList ret = new XRayServicesList();
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
    public XRayServicesList getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "XRayServicesList cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public XRayServicesList() {
    super("oneOf", Boolean.FALSE);
  }

  public XRayServicesList(XRayServicesIncludeAll o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public XRayServicesList(XRayServicesIncludeOnly o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("XRayServicesIncludeAll", new GenericType<XRayServicesIncludeAll>() {});
    schemas.put("XRayServicesIncludeOnly", new GenericType<XRayServicesIncludeOnly>() {});
    JSON.registerDescendants(XRayServicesList.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return XRayServicesList.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: XRayServicesIncludeAll, XRayServicesIncludeOnly
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(XRayServicesIncludeAll.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(XRayServicesIncludeOnly.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be XRayServicesIncludeAll, XRayServicesIncludeOnly");
  }

  /**
   * Get the actual instance, which can be the following: XRayServicesIncludeAll,
   * XRayServicesIncludeOnly
   *
   * @return The actual instance (XRayServicesIncludeAll, XRayServicesIncludeOnly)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `XRayServicesIncludeAll`. If the actual instance is not
   * `XRayServicesIncludeAll`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `XRayServicesIncludeAll`
   * @throws ClassCastException if the instance is not `XRayServicesIncludeAll`
   */
  public XRayServicesIncludeAll getXRayServicesIncludeAll() throws ClassCastException {
    return (XRayServicesIncludeAll) super.getActualInstance();
  }

  /**
   * Get the actual instance of `XRayServicesIncludeOnly`. If the actual instance is not
   * `XRayServicesIncludeOnly`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `XRayServicesIncludeOnly`
   * @throws ClassCastException if the instance is not `XRayServicesIncludeOnly`
   */
  public XRayServicesIncludeOnly getXRayServicesIncludeOnly() throws ClassCastException {
    return (XRayServicesIncludeOnly) super.getActualInstance();
  }
}
