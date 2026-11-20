/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using =
        FormulaDetectionRulesQuery20270101GroupBy
            .FormulaDetectionRulesQuery20270101GroupByDeserializer.class)
@JsonSerialize(
    using =
        FormulaDetectionRulesQuery20270101GroupBy
            .FormulaDetectionRulesQuery20270101GroupBySerializer.class)
public class FormulaDetectionRulesQuery20270101GroupBy extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(FormulaDetectionRulesQuery20270101GroupBy.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class FormulaDetectionRulesQuery20270101GroupBySerializer
      extends StdSerializer<FormulaDetectionRulesQuery20270101GroupBy> {
    public FormulaDetectionRulesQuery20270101GroupBySerializer(
        Class<FormulaDetectionRulesQuery20270101GroupBy> t) {
      super(t);
    }

    public FormulaDetectionRulesQuery20270101GroupBySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaDetectionRulesQuery20270101GroupBy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class FormulaDetectionRulesQuery20270101GroupByDeserializer
      extends StdDeserializer<FormulaDetectionRulesQuery20270101GroupBy> {
    public FormulaDetectionRulesQuery20270101GroupByDeserializer() {
      this(FormulaDetectionRulesQuery20270101GroupBy.class);
    }

    public FormulaDetectionRulesQuery20270101GroupByDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public FormulaDetectionRulesQuery20270101GroupBy deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      Object deserializedUnparsed = null;
      int matchUnparsed = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize List<FormulaAndFunctionEventQueryGroupBy_20270101>
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (List.class.equals(Integer.class)
            || List.class.equals(Long.class)
            || List.class.equals(Float.class)
            || List.class.equals(Double.class)
            || List.class.equals(Boolean.class)
            || List.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((List.class.equals(Integer.class) || List.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((List.class.equals(Float.class) || List.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (List.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |= (List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(
                      new TypeReference<List<FormulaAndFunctionEventQueryGroupBy_20270101>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          // keep the matched list, but propagate 'unparsed' from any invalid item
          boolean itemsUnparsed = false;
          for (FormulaAndFunctionEventQueryGroupBy_20270101 item :
              (List<FormulaAndFunctionEventQueryGroupBy_20270101>) tmp) {
            itemsUnparsed |= item.unparsed;
          }
          if (itemsUnparsed) {
            deserializedUnparsed = tmp;
            matchUnparsed++;
          } else {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'List<FormulaAndFunctionEventQueryGroupBy_20270101>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'List<FormulaAndFunctionEventQueryGroupBy_20270101>'",
            e);
      }

      // deserialize FormulaAndFunctionEventQueryGroupByFields_20270101
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Integer.class)
            || FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Long.class)
            || FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Float.class)
            || FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Double.class)
            || FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Boolean.class)
            || FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Integer.class)
                        || FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Float.class)
                        || FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FormulaAndFunctionEventQueryGroupByFields_20270101.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(FormulaAndFunctionEventQueryGroupByFields_20270101.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FormulaAndFunctionEventQueryGroupByFields_20270101) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'FormulaAndFunctionEventQueryGroupByFields_20270101'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'FormulaAndFunctionEventQueryGroupByFields_20270101'",
            e);
      }

      FormulaDetectionRulesQuery20270101GroupBy ret =
          new FormulaDetectionRulesQuery20270101GroupBy();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else if (match == 0 && matchUnparsed == 1) {
        ret.setActualInstance(deserializedUnparsed);
        ret.unparsed = true;
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
    public FormulaDetectionRulesQuery20270101GroupBy getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "FormulaDetectionRulesQuery20270101GroupBy cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public FormulaDetectionRulesQuery20270101GroupBy() {
    super("oneOf", Boolean.FALSE);
  }

  public FormulaDetectionRulesQuery20270101GroupBy(
      List<FormulaAndFunctionEventQueryGroupBy_20270101> o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public FormulaDetectionRulesQuery20270101GroupBy(
      FormulaAndFunctionEventQueryGroupByFields_20270101 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "List<FormulaAndFunctionEventQueryGroupBy_20270101>",
        new GenericType<List<FormulaAndFunctionEventQueryGroupBy_20270101>>() {});
    schemas.put(
        "FormulaAndFunctionEventQueryGroupByFields_20270101",
        new GenericType<FormulaAndFunctionEventQueryGroupByFields_20270101>() {});
    JSON.registerDescendants(
        FormulaDetectionRulesQuery20270101GroupBy.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return FormulaDetectionRulesQuery20270101GroupBy.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: List&lt;FormulaAndFunctionEventQueryGroupBy_20270101&gt;,
   * FormulaAndFunctionEventQueryGroupByFields_20270101
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        FormulaAndFunctionEventQueryGroupByFields_20270101.class,
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
        "Invalid instance type. Must be List<FormulaAndFunctionEventQueryGroupBy_20270101>,"
            + " FormulaAndFunctionEventQueryGroupByFields_20270101");
  }

  /**
   * Get the actual instance, which can be the following:
   * List&lt;FormulaAndFunctionEventQueryGroupBy_20270101&gt;,
   * FormulaAndFunctionEventQueryGroupByFields_20270101
   *
   * @return The actual instance (List&lt;FormulaAndFunctionEventQueryGroupBy_20270101&gt;,
   *     FormulaAndFunctionEventQueryGroupByFields_20270101)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;FormulaAndFunctionEventQueryGroupBy_20270101&gt;`. If the
   * actual instance is not `List&lt;FormulaAndFunctionEventQueryGroupBy_20270101&gt;`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `List&lt;FormulaAndFunctionEventQueryGroupBy_20270101&gt;`
   * @throws ClassCastException if the instance is not
   *     `List&lt;FormulaAndFunctionEventQueryGroupBy_20270101&gt;`
   */
  public List<FormulaAndFunctionEventQueryGroupBy_20270101> getList() throws ClassCastException {
    return (List<FormulaAndFunctionEventQueryGroupBy_20270101>) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FormulaAndFunctionEventQueryGroupByFields_20270101`. If the actual
   * instance is not `FormulaAndFunctionEventQueryGroupByFields_20270101`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `FormulaAndFunctionEventQueryGroupByFields_20270101`
   * @throws ClassCastException if the instance is not
   *     `FormulaAndFunctionEventQueryGroupByFields_20270101`
   */
  public FormulaAndFunctionEventQueryGroupByFields_20270101
      getFormulaAndFunctionEventQueryGroupByFields_20270101() throws ClassCastException {
    return (FormulaAndFunctionEventQueryGroupByFields_20270101) super.getActualInstance();
  }
}
