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
    using =
        PatchTableRequestDataAttributesFileMetadata
            .PatchTableRequestDataAttributesFileMetadataDeserializer.class)
@JsonSerialize(
    using =
        PatchTableRequestDataAttributesFileMetadata
            .PatchTableRequestDataAttributesFileMetadataSerializer.class)
public class PatchTableRequestDataAttributesFileMetadata extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(PatchTableRequestDataAttributesFileMetadata.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class PatchTableRequestDataAttributesFileMetadataSerializer
      extends StdSerializer<PatchTableRequestDataAttributesFileMetadata> {
    public PatchTableRequestDataAttributesFileMetadataSerializer(
        Class<PatchTableRequestDataAttributesFileMetadata> t) {
      super(t);
    }

    public PatchTableRequestDataAttributesFileMetadataSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PatchTableRequestDataAttributesFileMetadata value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class PatchTableRequestDataAttributesFileMetadataDeserializer
      extends StdDeserializer<PatchTableRequestDataAttributesFileMetadata> {
    public PatchTableRequestDataAttributesFileMetadataDeserializer() {
      this(PatchTableRequestDataAttributesFileMetadata.class);
    }

    public PatchTableRequestDataAttributesFileMetadataDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public PatchTableRequestDataAttributesFileMetadata deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize PatchTableRequestDataAttributesFileMetadataCloudStorage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(Integer.class)
            || PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(Long.class)
            || PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(Float.class)
            || PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(Double.class)
            || PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(Boolean.class)
            || PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(
                            Integer.class)
                        || PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(Float.class)
                        || PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PatchTableRequestDataAttributesFileMetadataCloudStorage.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(PatchTableRequestDataAttributesFileMetadataCloudStorage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PatchTableRequestDataAttributesFileMetadataCloudStorage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema"
                  + " 'PatchTableRequestDataAttributesFileMetadataCloudStorage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'PatchTableRequestDataAttributesFileMetadataCloudStorage'",
            e);
      }

      // deserialize PatchTableRequestDataAttributesFileMetadataLocalFile
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Integer.class)
            || PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Long.class)
            || PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Float.class)
            || PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Double.class)
            || PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Boolean.class)
            || PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Integer.class)
                        || PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Float.class)
                        || PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PatchTableRequestDataAttributesFileMetadataLocalFile.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(PatchTableRequestDataAttributesFileMetadataLocalFile.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PatchTableRequestDataAttributesFileMetadataLocalFile) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'PatchTableRequestDataAttributesFileMetadataLocalFile'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'PatchTableRequestDataAttributesFileMetadataLocalFile'",
            e);
      }

      PatchTableRequestDataAttributesFileMetadata ret =
          new PatchTableRequestDataAttributesFileMetadata();
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
    public PatchTableRequestDataAttributesFileMetadata getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "PatchTableRequestDataAttributesFileMetadata cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public PatchTableRequestDataAttributesFileMetadata() {
    super("oneOf", Boolean.FALSE);
  }

  public PatchTableRequestDataAttributesFileMetadata(
      PatchTableRequestDataAttributesFileMetadataCloudStorage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public PatchTableRequestDataAttributesFileMetadata(
      PatchTableRequestDataAttributesFileMetadataLocalFile o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "PatchTableRequestDataAttributesFileMetadataCloudStorage",
        new GenericType<PatchTableRequestDataAttributesFileMetadataCloudStorage>() {});
    schemas.put(
        "PatchTableRequestDataAttributesFileMetadataLocalFile",
        new GenericType<PatchTableRequestDataAttributesFileMetadataLocalFile>() {});
    JSON.registerDescendants(
        PatchTableRequestDataAttributesFileMetadata.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return PatchTableRequestDataAttributesFileMetadata.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: PatchTableRequestDataAttributesFileMetadataCloudStorage,
   * PatchTableRequestDataAttributesFileMetadataLocalFile
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        PatchTableRequestDataAttributesFileMetadataCloudStorage.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        PatchTableRequestDataAttributesFileMetadataLocalFile.class,
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
        "Invalid instance type. Must be PatchTableRequestDataAttributesFileMetadataCloudStorage,"
            + " PatchTableRequestDataAttributesFileMetadataLocalFile");
  }

  /**
   * Get the actual instance, which can be the following:
   * PatchTableRequestDataAttributesFileMetadataCloudStorage,
   * PatchTableRequestDataAttributesFileMetadataLocalFile
   *
   * @return The actual instance (PatchTableRequestDataAttributesFileMetadataCloudStorage,
   *     PatchTableRequestDataAttributesFileMetadataLocalFile)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `PatchTableRequestDataAttributesFileMetadataCloudStorage`. If the
   * actual instance is not `PatchTableRequestDataAttributesFileMetadataCloudStorage`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `PatchTableRequestDataAttributesFileMetadataCloudStorage`
   * @throws ClassCastException if the instance is not
   *     `PatchTableRequestDataAttributesFileMetadataCloudStorage`
   */
  public PatchTableRequestDataAttributesFileMetadataCloudStorage
      getPatchTableRequestDataAttributesFileMetadataCloudStorage() throws ClassCastException {
    return (PatchTableRequestDataAttributesFileMetadataCloudStorage) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PatchTableRequestDataAttributesFileMetadataLocalFile`. If the
   * actual instance is not `PatchTableRequestDataAttributesFileMetadataLocalFile`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `PatchTableRequestDataAttributesFileMetadataLocalFile`
   * @throws ClassCastException if the instance is not
   *     `PatchTableRequestDataAttributesFileMetadataLocalFile`
   */
  public PatchTableRequestDataAttributesFileMetadataLocalFile
      getPatchTableRequestDataAttributesFileMetadataLocalFile() throws ClassCastException {
    return (PatchTableRequestDataAttributesFileMetadataLocalFile) super.getActualInstance();
  }
}
