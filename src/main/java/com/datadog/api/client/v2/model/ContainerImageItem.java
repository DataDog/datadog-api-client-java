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
@JsonDeserialize(using = ContainerImageItem.ContainerImageItemDeserializer.class)
@JsonSerialize(using = ContainerImageItem.ContainerImageItemSerializer.class)
public class ContainerImageItem extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ContainerImageItem.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ContainerImageItemSerializer extends StdSerializer<ContainerImageItem> {
    public ContainerImageItemSerializer(Class<ContainerImageItem> t) {
      super(t);
    }

    public ContainerImageItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(ContainerImageItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ContainerImageItemDeserializer extends StdDeserializer<ContainerImageItem> {
    public ContainerImageItemDeserializer() {
      this(ContainerImageItem.class);
    }

    public ContainerImageItemDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ContainerImageItem deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ContainerImage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ContainerImage.class.equals(Integer.class)
            || ContainerImage.class.equals(Long.class)
            || ContainerImage.class.equals(Float.class)
            || ContainerImage.class.equals(Double.class)
            || ContainerImage.class.equals(Boolean.class)
            || ContainerImage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ContainerImage.class.equals(Integer.class)
                        || ContainerImage.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ContainerImage.class.equals(Float.class)
                        || ContainerImage.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ContainerImage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ContainerImage.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ContainerImage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ContainerImage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ContainerImage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ContainerImage'", e);
      }

      // deserialize ContainerImageGroup
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ContainerImageGroup.class.equals(Integer.class)
            || ContainerImageGroup.class.equals(Long.class)
            || ContainerImageGroup.class.equals(Float.class)
            || ContainerImageGroup.class.equals(Double.class)
            || ContainerImageGroup.class.equals(Boolean.class)
            || ContainerImageGroup.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ContainerImageGroup.class.equals(Integer.class)
                        || ContainerImageGroup.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ContainerImageGroup.class.equals(Float.class)
                        || ContainerImageGroup.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ContainerImageGroup.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ContainerImageGroup.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ContainerImageGroup.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ContainerImageGroup) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ContainerImageGroup'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ContainerImageGroup'", e);
      }

      ContainerImageItem ret = new ContainerImageItem();
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
    public ContainerImageItem getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ContainerImageItem cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ContainerImageItem() {
    super("oneOf", Boolean.FALSE);
  }

  public ContainerImageItem(ContainerImage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ContainerImageItem(ContainerImageGroup o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ContainerImage", new GenericType<ContainerImage>() {});
    schemas.put("ContainerImageGroup", new GenericType<ContainerImageGroup>() {});
    JSON.registerDescendants(ContainerImageItem.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ContainerImageItem.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ContainerImage, ContainerImageGroup
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ContainerImage.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ContainerImageGroup.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ContainerImage, ContainerImageGroup");
  }

  /**
   * Get the actual instance, which can be the following: ContainerImage, ContainerImageGroup
   *
   * @return The actual instance (ContainerImage, ContainerImageGroup)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ContainerImage`. If the actual instance is not `ContainerImage`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ContainerImage`
   * @throws ClassCastException if the instance is not `ContainerImage`
   */
  public ContainerImage getContainerImage() throws ClassCastException {
    return (ContainerImage) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ContainerImageGroup`. If the actual instance is not
   * `ContainerImageGroup`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ContainerImageGroup`
   * @throws ClassCastException if the instance is not `ContainerImageGroup`
   */
  public ContainerImageGroup getContainerImageGroup() throws ClassCastException {
    return (ContainerImageGroup) super.getActualInstance();
  }
}
