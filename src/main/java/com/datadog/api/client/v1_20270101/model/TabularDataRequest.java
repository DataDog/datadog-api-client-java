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
@JsonDeserialize(using = TabularDataRequest.TabularDataRequestDeserializer.class)
@JsonSerialize(using = TabularDataRequest.TabularDataRequestSerializer.class)
public class TabularDataRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TabularDataRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TabularDataRequestSerializer extends StdSerializer<TabularDataRequest> {
    public TabularDataRequestSerializer(Class<TabularDataRequest> t) {
      super(t);
    }

    public TabularDataRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(TabularDataRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TabularDataRequestDeserializer extends StdDeserializer<TabularDataRequest> {
    public TabularDataRequestDeserializer() {
      this(TabularDataRequest.class);
    }

    public TabularDataRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TabularDataRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize AllListRequestVariants
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AllListRequestVariants.class.equals(Integer.class)
            || AllListRequestVariants.class.equals(Long.class)
            || AllListRequestVariants.class.equals(Float.class)
            || AllListRequestVariants.class.equals(Double.class)
            || AllListRequestVariants.class.equals(Boolean.class)
            || AllListRequestVariants.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AllListRequestVariants.class.equals(Integer.class)
                        || AllListRequestVariants.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AllListRequestVariants.class.equals(Float.class)
                        || AllListRequestVariants.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AllListRequestVariants.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AllListRequestVariants.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AllListRequestVariants.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AllListRequestVariants) tmp).unparsed
              && !(((AllListRequestVariants) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AllListRequestVariants'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AllListRequestVariants'", e);
      }

      // deserialize TabularAdvancedQueryRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TabularAdvancedQueryRequest.class.equals(Integer.class)
            || TabularAdvancedQueryRequest.class.equals(Long.class)
            || TabularAdvancedQueryRequest.class.equals(Float.class)
            || TabularAdvancedQueryRequest.class.equals(Double.class)
            || TabularAdvancedQueryRequest.class.equals(Boolean.class)
            || TabularAdvancedQueryRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TabularAdvancedQueryRequest.class.equals(Integer.class)
                        || TabularAdvancedQueryRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TabularAdvancedQueryRequest.class.equals(Float.class)
                        || TabularAdvancedQueryRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TabularAdvancedQueryRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TabularAdvancedQueryRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TabularAdvancedQueryRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TabularAdvancedQueryRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TabularAdvancedQueryRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TabularAdvancedQueryRequest'", e);
      }

      // deserialize TimeseriesFormulaRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TimeseriesFormulaRequest.class.equals(Integer.class)
            || TimeseriesFormulaRequest.class.equals(Long.class)
            || TimeseriesFormulaRequest.class.equals(Float.class)
            || TimeseriesFormulaRequest.class.equals(Double.class)
            || TimeseriesFormulaRequest.class.equals(Boolean.class)
            || TimeseriesFormulaRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TimeseriesFormulaRequest.class.equals(Integer.class)
                        || TimeseriesFormulaRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TimeseriesFormulaRequest.class.equals(Float.class)
                        || TimeseriesFormulaRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TimeseriesFormulaRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TimeseriesFormulaRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TimeseriesFormulaRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TimeseriesFormulaRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TimeseriesFormulaRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TimeseriesFormulaRequest'", e);
      }

      // deserialize ScalarFormulaRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScalarFormulaRequest.class.equals(Integer.class)
            || ScalarFormulaRequest.class.equals(Long.class)
            || ScalarFormulaRequest.class.equals(Float.class)
            || ScalarFormulaRequest.class.equals(Double.class)
            || ScalarFormulaRequest.class.equals(Boolean.class)
            || ScalarFormulaRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScalarFormulaRequest.class.equals(Integer.class)
                        || ScalarFormulaRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScalarFormulaRequest.class.equals(Float.class)
                        || ScalarFormulaRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScalarFormulaRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScalarFormulaRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScalarFormulaRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScalarFormulaRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScalarFormulaRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScalarFormulaRequest'", e);
      }

      // deserialize TabularLocalDatasetRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TabularLocalDatasetRequest.class.equals(Integer.class)
            || TabularLocalDatasetRequest.class.equals(Long.class)
            || TabularLocalDatasetRequest.class.equals(Float.class)
            || TabularLocalDatasetRequest.class.equals(Double.class)
            || TabularLocalDatasetRequest.class.equals(Boolean.class)
            || TabularLocalDatasetRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TabularLocalDatasetRequest.class.equals(Integer.class)
                        || TabularLocalDatasetRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TabularLocalDatasetRequest.class.equals(Float.class)
                        || TabularLocalDatasetRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TabularLocalDatasetRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TabularLocalDatasetRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TabularLocalDatasetRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TabularLocalDatasetRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TabularLocalDatasetRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TabularLocalDatasetRequest'", e);
      }

      // deserialize HistogramRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (HistogramRequest.class.equals(Integer.class)
            || HistogramRequest.class.equals(Long.class)
            || HistogramRequest.class.equals(Float.class)
            || HistogramRequest.class.equals(Double.class)
            || HistogramRequest.class.equals(Boolean.class)
            || HistogramRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((HistogramRequest.class.equals(Integer.class)
                        || HistogramRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((HistogramRequest.class.equals(Float.class)
                        || HistogramRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (HistogramRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (HistogramRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(HistogramRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((HistogramRequest) tmp).unparsed
              && !(((HistogramRequest) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'HistogramRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'HistogramRequest'", e);
      }

      TabularDataRequest ret = new TabularDataRequest();
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
    public TabularDataRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TabularDataRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TabularDataRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public TabularDataRequest(AllListRequestVariants o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularDataRequest(TabularAdvancedQueryRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularDataRequest(TimeseriesFormulaRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularDataRequest(ScalarFormulaRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularDataRequest(TabularLocalDatasetRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularDataRequest(HistogramRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("AllListRequestVariants", new GenericType<AllListRequestVariants>() {});
    schemas.put("TabularAdvancedQueryRequest", new GenericType<TabularAdvancedQueryRequest>() {});
    schemas.put("TimeseriesFormulaRequest", new GenericType<TimeseriesFormulaRequest>() {});
    schemas.put("ScalarFormulaRequest", new GenericType<ScalarFormulaRequest>() {});
    schemas.put("TabularLocalDatasetRequest", new GenericType<TabularLocalDatasetRequest>() {});
    schemas.put("HistogramRequest", new GenericType<HistogramRequest>() {});
    JSON.registerDescendants(TabularDataRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TabularDataRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: AllListRequestVariants, TabularAdvancedQueryRequest,
   * TimeseriesFormulaRequest, ScalarFormulaRequest, TabularLocalDatasetRequest, HistogramRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(AllListRequestVariants.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TabularAdvancedQueryRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TimeseriesFormulaRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScalarFormulaRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TabularLocalDatasetRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(HistogramRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be AllListRequestVariants, TabularAdvancedQueryRequest,"
            + " TimeseriesFormulaRequest, ScalarFormulaRequest, TabularLocalDatasetRequest,"
            + " HistogramRequest");
  }

  /**
   * Get the actual instance, which can be the following: AllListRequestVariants,
   * TabularAdvancedQueryRequest, TimeseriesFormulaRequest, ScalarFormulaRequest,
   * TabularLocalDatasetRequest, HistogramRequest
   *
   * @return The actual instance (AllListRequestVariants, TabularAdvancedQueryRequest,
   *     TimeseriesFormulaRequest, ScalarFormulaRequest, TabularLocalDatasetRequest,
   *     HistogramRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `AllListRequestVariants`. If the actual instance is not
   * `AllListRequestVariants`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AllListRequestVariants`
   * @throws ClassCastException if the instance is not `AllListRequestVariants`
   */
  public AllListRequestVariants getAllListRequestVariants() throws ClassCastException {
    return (AllListRequestVariants) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TabularAdvancedQueryRequest`. If the actual instance is not
   * `TabularAdvancedQueryRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TabularAdvancedQueryRequest`
   * @throws ClassCastException if the instance is not `TabularAdvancedQueryRequest`
   */
  public TabularAdvancedQueryRequest getTabularAdvancedQueryRequest() throws ClassCastException {
    return (TabularAdvancedQueryRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TimeseriesFormulaRequest`. If the actual instance is not
   * `TimeseriesFormulaRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TimeseriesFormulaRequest`
   * @throws ClassCastException if the instance is not `TimeseriesFormulaRequest`
   */
  public TimeseriesFormulaRequest getTimeseriesFormulaRequest() throws ClassCastException {
    return (TimeseriesFormulaRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScalarFormulaRequest`. If the actual instance is not
   * `ScalarFormulaRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScalarFormulaRequest`
   * @throws ClassCastException if the instance is not `ScalarFormulaRequest`
   */
  public ScalarFormulaRequest getScalarFormulaRequest() throws ClassCastException {
    return (ScalarFormulaRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TabularLocalDatasetRequest`. If the actual instance is not
   * `TabularLocalDatasetRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TabularLocalDatasetRequest`
   * @throws ClassCastException if the instance is not `TabularLocalDatasetRequest`
   */
  public TabularLocalDatasetRequest getTabularLocalDatasetRequest() throws ClassCastException {
    return (TabularLocalDatasetRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `HistogramRequest`. If the actual instance is not
   * `HistogramRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `HistogramRequest`
   * @throws ClassCastException if the instance is not `HistogramRequest`
   */
  public HistogramRequest getHistogramRequest() throws ClassCastException {
    return (HistogramRequest) super.getActualInstance();
  }
}
