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
@JsonDeserialize(using = AllListRequestVariants.AllListRequestVariantsDeserializer.class)
@JsonSerialize(using = AllListRequestVariants.AllListRequestVariantsSerializer.class)
public class AllListRequestVariants extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(AllListRequestVariants.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class AllListRequestVariantsSerializer
      extends StdSerializer<AllListRequestVariants> {
    public AllListRequestVariantsSerializer(Class<AllListRequestVariants> t) {
      super(t);
    }

    public AllListRequestVariantsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AllListRequestVariants value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class AllListRequestVariantsDeserializer
      extends StdDeserializer<AllListRequestVariants> {
    public AllListRequestVariantsDeserializer() {
      this(AllListRequestVariants.class);
    }

    public AllListRequestVariantsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public AllListRequestVariants deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ListStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ListStreamRequest.class.equals(Integer.class)
            || ListStreamRequest.class.equals(Long.class)
            || ListStreamRequest.class.equals(Float.class)
            || ListStreamRequest.class.equals(Double.class)
            || ListStreamRequest.class.equals(Boolean.class)
            || ListStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ListStreamRequest.class.equals(Integer.class)
                        || ListStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ListStreamRequest.class.equals(Float.class)
                        || ListStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ListStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ListStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ListStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ListStreamRequest) tmp).unparsed
              && !(((ListStreamRequest) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ListStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ListStreamRequest'", e);
      }

      // deserialize CompositeStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CompositeStreamRequest.class.equals(Integer.class)
            || CompositeStreamRequest.class.equals(Long.class)
            || CompositeStreamRequest.class.equals(Float.class)
            || CompositeStreamRequest.class.equals(Double.class)
            || CompositeStreamRequest.class.equals(Boolean.class)
            || CompositeStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CompositeStreamRequest.class.equals(Integer.class)
                        || CompositeStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CompositeStreamRequest.class.equals(Float.class)
                        || CompositeStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CompositeStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CompositeStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CompositeStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CompositeStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CompositeStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CompositeStreamRequest'", e);
      }

      // deserialize DatasetListRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatasetListRequest.class.equals(Integer.class)
            || DatasetListRequest.class.equals(Long.class)
            || DatasetListRequest.class.equals(Float.class)
            || DatasetListRequest.class.equals(Double.class)
            || DatasetListRequest.class.equals(Boolean.class)
            || DatasetListRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatasetListRequest.class.equals(Integer.class)
                        || DatasetListRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatasetListRequest.class.equals(Float.class)
                        || DatasetListRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatasetListRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatasetListRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DatasetListRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatasetListRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DatasetListRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DatasetListRequest'", e);
      }

      // deserialize InfrastructureListRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (InfrastructureListRequest.class.equals(Integer.class)
            || InfrastructureListRequest.class.equals(Long.class)
            || InfrastructureListRequest.class.equals(Float.class)
            || InfrastructureListRequest.class.equals(Double.class)
            || InfrastructureListRequest.class.equals(Boolean.class)
            || InfrastructureListRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((InfrastructureListRequest.class.equals(Integer.class)
                        || InfrastructureListRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((InfrastructureListRequest.class.equals(Float.class)
                        || InfrastructureListRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (InfrastructureListRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (InfrastructureListRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(InfrastructureListRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((InfrastructureListRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'InfrastructureListRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'InfrastructureListRequest'", e);
      }

      AllListRequestVariants ret = new AllListRequestVariants();
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
    public AllListRequestVariants getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "AllListRequestVariants cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public AllListRequestVariants() {
    super("oneOf", Boolean.FALSE);
  }

  public AllListRequestVariants(ListStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AllListRequestVariants(CompositeStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AllListRequestVariants(DatasetListRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public AllListRequestVariants(InfrastructureListRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ListStreamRequest", new GenericType<ListStreamRequest>() {});
    schemas.put("CompositeStreamRequest", new GenericType<CompositeStreamRequest>() {});
    schemas.put("DatasetListRequest", new GenericType<DatasetListRequest>() {});
    schemas.put("InfrastructureListRequest", new GenericType<InfrastructureListRequest>() {});
    JSON.registerDescendants(AllListRequestVariants.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return AllListRequestVariants.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ListStreamRequest, CompositeStreamRequest, DatasetListRequest,
   * InfrastructureListRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ListStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CompositeStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DatasetListRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(InfrastructureListRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ListStreamRequest, CompositeStreamRequest,"
            + " DatasetListRequest, InfrastructureListRequest");
  }

  /**
   * Get the actual instance, which can be the following: ListStreamRequest, CompositeStreamRequest,
   * DatasetListRequest, InfrastructureListRequest
   *
   * @return The actual instance (ListStreamRequest, CompositeStreamRequest, DatasetListRequest,
   *     InfrastructureListRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ListStreamRequest`. If the actual instance is not
   * `ListStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ListStreamRequest`
   * @throws ClassCastException if the instance is not `ListStreamRequest`
   */
  public ListStreamRequest getListStreamRequest() throws ClassCastException {
    return (ListStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CompositeStreamRequest`. If the actual instance is not
   * `CompositeStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CompositeStreamRequest`
   * @throws ClassCastException if the instance is not `CompositeStreamRequest`
   */
  public CompositeStreamRequest getCompositeStreamRequest() throws ClassCastException {
    return (CompositeStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatasetListRequest`. If the actual instance is not
   * `DatasetListRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DatasetListRequest`
   * @throws ClassCastException if the instance is not `DatasetListRequest`
   */
  public DatasetListRequest getDatasetListRequest() throws ClassCastException {
    return (DatasetListRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `InfrastructureListRequest`. If the actual instance is not
   * `InfrastructureListRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `InfrastructureListRequest`
   * @throws ClassCastException if the instance is not `InfrastructureListRequest`
   */
  public InfrastructureListRequest getInfrastructureListRequest() throws ClassCastException {
    return (InfrastructureListRequest) super.getActualInstance();
  }
}
