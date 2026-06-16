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
@JsonDeserialize(using = SourcemapItem.SourcemapItemDeserializer.class)
@JsonSerialize(using = SourcemapItem.SourcemapItemSerializer.class)
public class SourcemapItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(SourcemapItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class SourcemapItemSerializer extends StdSerializer<SourcemapItem> {
    public SourcemapItemSerializer(Class<SourcemapItem> t) {
      super(t);
    }

    public SourcemapItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(SourcemapItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class SourcemapItemDeserializer extends StdDeserializer<SourcemapItem> {
    public SourcemapItemDeserializer() {
      this(SourcemapItem.class);
    }

    public SourcemapItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SourcemapItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize JSSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (JSSourcemapData.class.equals(Integer.class)
            || JSSourcemapData.class.equals(Long.class)
            || JSSourcemapData.class.equals(Float.class)
            || JSSourcemapData.class.equals(Double.class)
            || JSSourcemapData.class.equals(Boolean.class)
            || JSSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((JSSourcemapData.class.equals(Integer.class)
                        || JSSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((JSSourcemapData.class.equals(Float.class)
                        || JSSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (JSSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (JSSourcemapData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(JSSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((JSSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'JSSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'JSSourcemapData'", e);
      }

      // deserialize ReactNativeSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ReactNativeSourcemapData.class.equals(Integer.class)
            || ReactNativeSourcemapData.class.equals(Long.class)
            || ReactNativeSourcemapData.class.equals(Float.class)
            || ReactNativeSourcemapData.class.equals(Double.class)
            || ReactNativeSourcemapData.class.equals(Boolean.class)
            || ReactNativeSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ReactNativeSourcemapData.class.equals(Integer.class)
                        || ReactNativeSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ReactNativeSourcemapData.class.equals(Float.class)
                        || ReactNativeSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ReactNativeSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ReactNativeSourcemapData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ReactNativeSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ReactNativeSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ReactNativeSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ReactNativeSourcemapData'", e);
      }

      // deserialize IOSSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IOSSourcemapData.class.equals(Integer.class)
            || IOSSourcemapData.class.equals(Long.class)
            || IOSSourcemapData.class.equals(Float.class)
            || IOSSourcemapData.class.equals(Double.class)
            || IOSSourcemapData.class.equals(Boolean.class)
            || IOSSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IOSSourcemapData.class.equals(Integer.class)
                        || IOSSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IOSSourcemapData.class.equals(Float.class)
                        || IOSSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IOSSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IOSSourcemapData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IOSSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IOSSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IOSSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IOSSourcemapData'", e);
      }

      // deserialize JVMSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (JVMSourcemapData.class.equals(Integer.class)
            || JVMSourcemapData.class.equals(Long.class)
            || JVMSourcemapData.class.equals(Float.class)
            || JVMSourcemapData.class.equals(Double.class)
            || JVMSourcemapData.class.equals(Boolean.class)
            || JVMSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((JVMSourcemapData.class.equals(Integer.class)
                        || JVMSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((JVMSourcemapData.class.equals(Float.class)
                        || JVMSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (JVMSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (JVMSourcemapData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(JVMSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((JVMSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'JVMSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'JVMSourcemapData'", e);
      }

      // deserialize FlutterSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FlutterSourcemapData.class.equals(Integer.class)
            || FlutterSourcemapData.class.equals(Long.class)
            || FlutterSourcemapData.class.equals(Float.class)
            || FlutterSourcemapData.class.equals(Double.class)
            || FlutterSourcemapData.class.equals(Boolean.class)
            || FlutterSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FlutterSourcemapData.class.equals(Integer.class)
                        || FlutterSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FlutterSourcemapData.class.equals(Float.class)
                        || FlutterSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FlutterSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FlutterSourcemapData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FlutterSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FlutterSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FlutterSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FlutterSourcemapData'", e);
      }

      // deserialize ELFSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ELFSourcemapData.class.equals(Integer.class)
            || ELFSourcemapData.class.equals(Long.class)
            || ELFSourcemapData.class.equals(Float.class)
            || ELFSourcemapData.class.equals(Double.class)
            || ELFSourcemapData.class.equals(Boolean.class)
            || ELFSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ELFSourcemapData.class.equals(Integer.class)
                        || ELFSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ELFSourcemapData.class.equals(Float.class)
                        || ELFSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ELFSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ELFSourcemapData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ELFSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ELFSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ELFSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ELFSourcemapData'", e);
      }

      // deserialize NDKSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (NDKSourcemapData.class.equals(Integer.class)
            || NDKSourcemapData.class.equals(Long.class)
            || NDKSourcemapData.class.equals(Float.class)
            || NDKSourcemapData.class.equals(Double.class)
            || NDKSourcemapData.class.equals(Boolean.class)
            || NDKSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((NDKSourcemapData.class.equals(Integer.class)
                        || NDKSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((NDKSourcemapData.class.equals(Float.class)
                        || NDKSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (NDKSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (NDKSourcemapData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(NDKSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((NDKSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'NDKSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'NDKSourcemapData'", e);
      }

      // deserialize IL2CPPSourcemapData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IL2CPPSourcemapData.class.equals(Integer.class)
            || IL2CPPSourcemapData.class.equals(Long.class)
            || IL2CPPSourcemapData.class.equals(Float.class)
            || IL2CPPSourcemapData.class.equals(Double.class)
            || IL2CPPSourcemapData.class.equals(Boolean.class)
            || IL2CPPSourcemapData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IL2CPPSourcemapData.class.equals(Integer.class)
                        || IL2CPPSourcemapData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IL2CPPSourcemapData.class.equals(Float.class)
                        || IL2CPPSourcemapData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IL2CPPSourcemapData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IL2CPPSourcemapData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IL2CPPSourcemapData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IL2CPPSourcemapData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IL2CPPSourcemapData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IL2CPPSourcemapData'", e);
      }

      SourcemapItem ret = new SourcemapItem();
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
    public SourcemapItem getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SourcemapItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public SourcemapItem() {
    super("oneOf", Boolean.FALSE);
  }

  public SourcemapItem(JSSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SourcemapItem(ReactNativeSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SourcemapItem(IOSSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SourcemapItem(JVMSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SourcemapItem(FlutterSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SourcemapItem(ELFSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SourcemapItem(NDKSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public SourcemapItem(IL2CPPSourcemapData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("JSSourcemapData", new GenericType<JSSourcemapData>() {});
    schemas.put("ReactNativeSourcemapData", new GenericType<ReactNativeSourcemapData>() {});
    schemas.put("IOSSourcemapData", new GenericType<IOSSourcemapData>() {});
    schemas.put("JVMSourcemapData", new GenericType<JVMSourcemapData>() {});
    schemas.put("FlutterSourcemapData", new GenericType<FlutterSourcemapData>() {});
    schemas.put("ELFSourcemapData", new GenericType<ELFSourcemapData>() {});
    schemas.put("NDKSourcemapData", new GenericType<NDKSourcemapData>() {});
    schemas.put("IL2CPPSourcemapData", new GenericType<IL2CPPSourcemapData>() {});
    JSON.registerDescendants(SourcemapItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return SourcemapItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: JSSourcemapData, ReactNativeSourcemapData, IOSSourcemapData,
   * JVMSourcemapData, FlutterSourcemapData, ELFSourcemapData, NDKSourcemapData, IL2CPPSourcemapData
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(JSSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ReactNativeSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IOSSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(JVMSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FlutterSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ELFSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(NDKSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IL2CPPSourcemapData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be JSSourcemapData, ReactNativeSourcemapData,"
            + " IOSSourcemapData, JVMSourcemapData, FlutterSourcemapData, ELFSourcemapData,"
            + " NDKSourcemapData, IL2CPPSourcemapData");
  }

  /**
   * Get the actual instance, which can be the following: JSSourcemapData, ReactNativeSourcemapData,
   * IOSSourcemapData, JVMSourcemapData, FlutterSourcemapData, ELFSourcemapData, NDKSourcemapData,
   * IL2CPPSourcemapData
   *
   * @return The actual instance (JSSourcemapData, ReactNativeSourcemapData, IOSSourcemapData,
   *     JVMSourcemapData, FlutterSourcemapData, ELFSourcemapData, NDKSourcemapData,
   *     IL2CPPSourcemapData)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `JSSourcemapData`. If the actual instance is not `JSSourcemapData`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `JSSourcemapData`
   * @throws ClassCastException if the instance is not `JSSourcemapData`
   */
  public JSSourcemapData getJSSourcemapData() throws ClassCastException {
    return (JSSourcemapData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ReactNativeSourcemapData`. If the actual instance is not
   * `ReactNativeSourcemapData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ReactNativeSourcemapData`
   * @throws ClassCastException if the instance is not `ReactNativeSourcemapData`
   */
  public ReactNativeSourcemapData getReactNativeSourcemapData() throws ClassCastException {
    return (ReactNativeSourcemapData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IOSSourcemapData`. If the actual instance is not
   * `IOSSourcemapData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IOSSourcemapData`
   * @throws ClassCastException if the instance is not `IOSSourcemapData`
   */
  public IOSSourcemapData getIOSSourcemapData() throws ClassCastException {
    return (IOSSourcemapData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `JVMSourcemapData`. If the actual instance is not
   * `JVMSourcemapData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `JVMSourcemapData`
   * @throws ClassCastException if the instance is not `JVMSourcemapData`
   */
  public JVMSourcemapData getJVMSourcemapData() throws ClassCastException {
    return (JVMSourcemapData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FlutterSourcemapData`. If the actual instance is not
   * `FlutterSourcemapData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `FlutterSourcemapData`
   * @throws ClassCastException if the instance is not `FlutterSourcemapData`
   */
  public FlutterSourcemapData getFlutterSourcemapData() throws ClassCastException {
    return (FlutterSourcemapData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ELFSourcemapData`. If the actual instance is not
   * `ELFSourcemapData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ELFSourcemapData`
   * @throws ClassCastException if the instance is not `ELFSourcemapData`
   */
  public ELFSourcemapData getELFSourcemapData() throws ClassCastException {
    return (ELFSourcemapData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `NDKSourcemapData`. If the actual instance is not
   * `NDKSourcemapData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `NDKSourcemapData`
   * @throws ClassCastException if the instance is not `NDKSourcemapData`
   */
  public NDKSourcemapData getNDKSourcemapData() throws ClassCastException {
    return (NDKSourcemapData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IL2CPPSourcemapData`. If the actual instance is not
   * `IL2CPPSourcemapData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IL2CPPSourcemapData`
   * @throws ClassCastException if the instance is not `IL2CPPSourcemapData`
   */
  public IL2CPPSourcemapData getIL2CPPSourcemapData() throws ClassCastException {
    return (IL2CPPSourcemapData) super.getActualInstance();
  }
}
