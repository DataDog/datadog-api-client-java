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
        TableResultV2DataAttributesFileMetadata.TableResultV2DataAttributesFileMetadataDeserializer
            .class)
@JsonSerialize(
    using =
        TableResultV2DataAttributesFileMetadata.TableResultV2DataAttributesFileMetadataSerializer
            .class)
public class TableResultV2DataAttributesFileMetadata extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(TableResultV2DataAttributesFileMetadata.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TableResultV2DataAttributesFileMetadataSerializer
      extends StdSerializer<TableResultV2DataAttributesFileMetadata> {
    public TableResultV2DataAttributesFileMetadataSerializer(
        Class<TableResultV2DataAttributesFileMetadata> t) {
      super(t);
    }

    public TableResultV2DataAttributesFileMetadataSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TableResultV2DataAttributesFileMetadata value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TableResultV2DataAttributesFileMetadataDeserializer
      extends StdDeserializer<TableResultV2DataAttributesFileMetadata> {
    public TableResultV2DataAttributesFileMetadataDeserializer() {
      this(TableResultV2DataAttributesFileMetadata.class);
    }

    public TableResultV2DataAttributesFileMetadataDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TableResultV2DataAttributesFileMetadata deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize TableResultV2DataAttributesFileMetadataCloudStorage
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Integer.class)
            || TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Long.class)
            || TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Float.class)
            || TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Double.class)
            || TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Boolean.class)
            || TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Integer.class)
                        || TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Float.class)
                        || TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableResultV2DataAttributesFileMetadataCloudStorage.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TableResultV2DataAttributesFileMetadataCloudStorage.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableResultV2DataAttributesFileMetadataCloudStorage) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TableResultV2DataAttributesFileMetadataCloudStorage'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema"
                + " 'TableResultV2DataAttributesFileMetadataCloudStorage'",
            e);
      }

      // deserialize TableResultV2DataAttributesFileMetadataLocalFile
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Integer.class)
            || TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Long.class)
            || TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Float.class)
            || TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Double.class)
            || TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Boolean.class)
            || TableResultV2DataAttributesFileMetadataLocalFile.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Integer.class)
                        || TableResultV2DataAttributesFileMetadataLocalFile.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Float.class)
                        || TableResultV2DataAttributesFileMetadataLocalFile.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TableResultV2DataAttributesFileMetadataLocalFile.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TableResultV2DataAttributesFileMetadataLocalFile.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(TableResultV2DataAttributesFileMetadataLocalFile.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TableResultV2DataAttributesFileMetadataLocalFile) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'TableResultV2DataAttributesFileMetadataLocalFile'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'TableResultV2DataAttributesFileMetadataLocalFile'",
            e);
      }

      TableResultV2DataAttributesFileMetadata ret = new TableResultV2DataAttributesFileMetadata();
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
    public TableResultV2DataAttributesFileMetadata getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "TableResultV2DataAttributesFileMetadata cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TableResultV2DataAttributesFileMetadata() {
    super("oneOf", Boolean.FALSE);
  }

  public TableResultV2DataAttributesFileMetadata(
      TableResultV2DataAttributesFileMetadataCloudStorage o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TableResultV2DataAttributesFileMetadata(
      TableResultV2DataAttributesFileMetadataLocalFile o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "TableResultV2DataAttributesFileMetadataCloudStorage",
        new GenericType<TableResultV2DataAttributesFileMetadataCloudStorage>() {});
    schemas.put(
        "TableResultV2DataAttributesFileMetadataLocalFile",
        new GenericType<TableResultV2DataAttributesFileMetadataLocalFile>() {});
    JSON.registerDescendants(
        TableResultV2DataAttributesFileMetadata.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TableResultV2DataAttributesFileMetadata.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: TableResultV2DataAttributesFileMetadataCloudStorage,
   * TableResultV2DataAttributesFileMetadataLocalFile
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        TableResultV2DataAttributesFileMetadataCloudStorage.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        TableResultV2DataAttributesFileMetadataLocalFile.class,
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
        "Invalid instance type. Must be TableResultV2DataAttributesFileMetadataCloudStorage,"
            + " TableResultV2DataAttributesFileMetadataLocalFile");
  }

  /**
   * Get the actual instance, which can be the following:
   * TableResultV2DataAttributesFileMetadataCloudStorage,
   * TableResultV2DataAttributesFileMetadataLocalFile
   *
   * @return The actual instance (TableResultV2DataAttributesFileMetadataCloudStorage,
   *     TableResultV2DataAttributesFileMetadataLocalFile)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableResultV2DataAttributesFileMetadataCloudStorage`. If the actual
   * instance is not `TableResultV2DataAttributesFileMetadataCloudStorage`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `TableResultV2DataAttributesFileMetadataCloudStorage`
   * @throws ClassCastException if the instance is not
   *     `TableResultV2DataAttributesFileMetadataCloudStorage`
   */
  public TableResultV2DataAttributesFileMetadataCloudStorage
      getTableResultV2DataAttributesFileMetadataCloudStorage() throws ClassCastException {
    return (TableResultV2DataAttributesFileMetadataCloudStorage) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TableResultV2DataAttributesFileMetadataLocalFile`. If the actual
   * instance is not `TableResultV2DataAttributesFileMetadataLocalFile`, the ClassCastException will
   * be thrown.
   *
   * @return The actual instance of `TableResultV2DataAttributesFileMetadataLocalFile`
   * @throws ClassCastException if the instance is not
   *     `TableResultV2DataAttributesFileMetadataLocalFile`
   */
  public TableResultV2DataAttributesFileMetadataLocalFile
      getTableResultV2DataAttributesFileMetadataLocalFile() throws ClassCastException {
    return (TableResultV2DataAttributesFileMetadataLocalFile) super.getActualInstance();
  }
}
