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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using =
        EventPatternStreamQuery20270101Sort.EventPatternStreamQuery20270101SortDeserializer.class)
@JsonSerialize(
    using = EventPatternStreamQuery20270101Sort.EventPatternStreamQuery20270101SortSerializer.class)
public class EventPatternStreamQuery20270101Sort extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(EventPatternStreamQuery20270101Sort.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class EventPatternStreamQuery20270101SortSerializer
      extends StdSerializer<EventPatternStreamQuery20270101Sort> {
    public EventPatternStreamQuery20270101SortSerializer(
        Class<EventPatternStreamQuery20270101Sort> t) {
      super(t);
    }

    public EventPatternStreamQuery20270101SortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventPatternStreamQuery20270101Sort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class EventPatternStreamQuery20270101SortDeserializer
      extends StdDeserializer<EventPatternStreamQuery20270101Sort> {
    public EventPatternStreamQuery20270101SortDeserializer() {
      this(EventPatternStreamQuery20270101Sort.class);
    }

    public EventPatternStreamQuery20270101SortDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public EventPatternStreamQuery20270101Sort deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      Object deserializedUnparsed = null;
      int matchUnparsed = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ListStreamSort
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ListStreamSort.class.equals(Integer.class)
            || ListStreamSort.class.equals(Long.class)
            || ListStreamSort.class.equals(Float.class)
            || ListStreamSort.class.equals(Double.class)
            || ListStreamSort.class.equals(Boolean.class)
            || ListStreamSort.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ListStreamSort.class.equals(Integer.class)
                        || ListStreamSort.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ListStreamSort.class.equals(Float.class)
                        || ListStreamSort.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ListStreamSort.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ListStreamSort.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ListStreamSort.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ListStreamSort) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ListStreamSort'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ListStreamSort'", e);
      }

      // deserialize List<ListStreamSort>
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
                  .readValueAs(new TypeReference<List<ListStreamSort>>() {});
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          // keep the matched list, but propagate 'unparsed' from any invalid item
          boolean itemsUnparsed = false;
          for (ListStreamSort item : (List<ListStreamSort>) tmp) {
            itemsUnparsed |= item.unparsed;
          }
          if (itemsUnparsed) {
            deserializedUnparsed = tmp;
            matchUnparsed++;
          } else {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'List<ListStreamSort>'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'List<ListStreamSort>'", e);
      }

      EventPatternStreamQuery20270101Sort ret = new EventPatternStreamQuery20270101Sort();
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
    public EventPatternStreamQuery20270101Sort getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "EventPatternStreamQuery20270101Sort cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public EventPatternStreamQuery20270101Sort() {
    super("oneOf", Boolean.FALSE);
  }

  public EventPatternStreamQuery20270101Sort(ListStreamSort o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventPatternStreamQuery20270101Sort(List<ListStreamSort> o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ListStreamSort", new GenericType<ListStreamSort>() {});
    schemas.put("List<ListStreamSort>", new GenericType<List<ListStreamSort>>() {});
    JSON.registerDescendants(
        EventPatternStreamQuery20270101Sort.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return EventPatternStreamQuery20270101Sort.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ListStreamSort, List&lt;ListStreamSort&gt;
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ListStreamSort.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(List.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ListStreamSort, List<ListStreamSort>");
  }

  /**
   * Get the actual instance, which can be the following: ListStreamSort, List&lt;ListStreamSort&gt;
   *
   * @return The actual instance (ListStreamSort, List&lt;ListStreamSort&gt;)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ListStreamSort`. If the actual instance is not `ListStreamSort`,
   * the ClassCastException will be thrown.
   *
   * @return The actual instance of `ListStreamSort`
   * @throws ClassCastException if the instance is not `ListStreamSort`
   */
  public ListStreamSort getListStreamSort() throws ClassCastException {
    return (ListStreamSort) super.getActualInstance();
  }

  /**
   * Get the actual instance of `List&lt;ListStreamSort&gt;`. If the actual instance is not
   * `List&lt;ListStreamSort&gt;`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `List&lt;ListStreamSort&gt;`
   * @throws ClassCastException if the instance is not `List&lt;ListStreamSort&gt;`
   */
  public List<ListStreamSort> getList() throws ClassCastException {
    return (List<ListStreamSort>) super.getActualInstance();
  }
}
