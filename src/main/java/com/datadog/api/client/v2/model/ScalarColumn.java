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
@JsonDeserialize(using = ScalarColumn.ScalarColumnDeserializer.class)
@JsonSerialize(using = ScalarColumn.ScalarColumnSerializer.class)
public class ScalarColumn extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ScalarColumn.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ScalarColumnSerializer extends StdSerializer<ScalarColumn> {
    public ScalarColumnSerializer(Class<ScalarColumn> t) {
      super(t);
    }

    public ScalarColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(ScalarColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ScalarColumnDeserializer extends StdDeserializer<ScalarColumn> {
    public ScalarColumnDeserializer() {
      this(ScalarColumn.class);
    }

    public ScalarColumnDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ScalarColumn deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GroupScalarColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GroupScalarColumn.class.equals(Integer.class)
            || GroupScalarColumn.class.equals(Long.class)
            || GroupScalarColumn.class.equals(Float.class)
            || GroupScalarColumn.class.equals(Double.class)
            || GroupScalarColumn.class.equals(Boolean.class)
            || GroupScalarColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GroupScalarColumn.class.equals(Integer.class)
                        || GroupScalarColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GroupScalarColumn.class.equals(Float.class)
                        || GroupScalarColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GroupScalarColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GroupScalarColumn.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GroupScalarColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GroupScalarColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GroupScalarColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GroupScalarColumn'", e);
      }

      // deserialize DataScalarColumn
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DataScalarColumn.class.equals(Integer.class)
            || DataScalarColumn.class.equals(Long.class)
            || DataScalarColumn.class.equals(Float.class)
            || DataScalarColumn.class.equals(Double.class)
            || DataScalarColumn.class.equals(Boolean.class)
            || DataScalarColumn.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DataScalarColumn.class.equals(Integer.class)
                        || DataScalarColumn.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DataScalarColumn.class.equals(Float.class)
                        || DataScalarColumn.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DataScalarColumn.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DataScalarColumn.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DataScalarColumn.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DataScalarColumn) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DataScalarColumn'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DataScalarColumn'", e);
      }

      ScalarColumn ret = new ScalarColumn();
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
    public ScalarColumn getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ScalarColumn cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ScalarColumn() {
    super("oneOf", Boolean.FALSE);
  }

  public ScalarColumn(GroupScalarColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ScalarColumn(DataScalarColumn o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("GroupScalarColumn", new GenericType<GroupScalarColumn>() {});
    schemas.put("DataScalarColumn", new GenericType<DataScalarColumn>() {});
    JSON.registerDescendants(ScalarColumn.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ScalarColumn.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GroupScalarColumn, DataScalarColumn
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(GroupScalarColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DataScalarColumn.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be GroupScalarColumn, DataScalarColumn");
  }

  /**
   * Get the actual instance, which can be the following: GroupScalarColumn, DataScalarColumn
   *
   * @return The actual instance (GroupScalarColumn, DataScalarColumn)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GroupScalarColumn`. If the actual instance is not
   * `GroupScalarColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GroupScalarColumn`
   * @throws ClassCastException if the instance is not `GroupScalarColumn`
   */
  public GroupScalarColumn getGroupScalarColumn() throws ClassCastException {
    return (GroupScalarColumn) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DataScalarColumn`. If the actual instance is not
   * `DataScalarColumn`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DataScalarColumn`
   * @throws ClassCastException if the instance is not `DataScalarColumn`
   */
  public DataScalarColumn getDataScalarColumn() throws ClassCastException {
    return (DataScalarColumn) super.getActualInstance();
  }
}
