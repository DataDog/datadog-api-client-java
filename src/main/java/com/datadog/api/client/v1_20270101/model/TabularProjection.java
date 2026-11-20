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
@JsonDeserialize(using = TabularProjection.TabularProjectionDeserializer.class)
@JsonSerialize(using = TabularProjection.TabularProjectionSerializer.class)
public class TabularProjection extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(TabularProjection.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TabularProjectionSerializer extends StdSerializer<TabularProjection> {
    public TabularProjectionSerializer(Class<TabularProjection> t) {
      super(t);
    }

    public TabularProjectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(TabularProjection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TabularProjectionDeserializer extends StdDeserializer<TabularProjection> {
    public TabularProjectionDeserializer() {
      this(TabularProjection.class);
    }

    public TabularProjectionDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public TabularProjection deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ScatterplotProjection
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScatterplotProjection.class.equals(Integer.class)
            || ScatterplotProjection.class.equals(Long.class)
            || ScatterplotProjection.class.equals(Float.class)
            || ScatterplotProjection.class.equals(Double.class)
            || ScatterplotProjection.class.equals(Boolean.class)
            || ScatterplotProjection.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScatterplotProjection.class.equals(Integer.class)
                        || ScatterplotProjection.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScatterplotProjection.class.equals(Float.class)
                        || ScatterplotProjection.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScatterplotProjection.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScatterplotProjection.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScatterplotProjection.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScatterplotProjection) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScatterplotProjection'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScatterplotProjection'", e);
      }

      // deserialize TreeDataProjectionBarChart
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreeDataProjectionBarChart.class.equals(Integer.class)
            || TreeDataProjectionBarChart.class.equals(Long.class)
            || TreeDataProjectionBarChart.class.equals(Float.class)
            || TreeDataProjectionBarChart.class.equals(Double.class)
            || TreeDataProjectionBarChart.class.equals(Boolean.class)
            || TreeDataProjectionBarChart.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreeDataProjectionBarChart.class.equals(Integer.class)
                        || TreeDataProjectionBarChart.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreeDataProjectionBarChart.class.equals(Float.class)
                        || TreeDataProjectionBarChart.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreeDataProjectionBarChart.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreeDataProjectionBarChart.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreeDataProjectionBarChart.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreeDataProjectionBarChart) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreeDataProjectionBarChart'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TreeDataProjectionBarChart'", e);
      }

      // deserialize TreeDataProjectionSunburst
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreeDataProjectionSunburst.class.equals(Integer.class)
            || TreeDataProjectionSunburst.class.equals(Long.class)
            || TreeDataProjectionSunburst.class.equals(Float.class)
            || TreeDataProjectionSunburst.class.equals(Double.class)
            || TreeDataProjectionSunburst.class.equals(Boolean.class)
            || TreeDataProjectionSunburst.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreeDataProjectionSunburst.class.equals(Integer.class)
                        || TreeDataProjectionSunburst.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreeDataProjectionSunburst.class.equals(Float.class)
                        || TreeDataProjectionSunburst.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreeDataProjectionSunburst.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreeDataProjectionSunburst.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreeDataProjectionSunburst.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreeDataProjectionSunburst) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreeDataProjectionSunburst'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TreeDataProjectionSunburst'", e);
      }

      // deserialize TreeDataProjectionToplist
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreeDataProjectionToplist.class.equals(Integer.class)
            || TreeDataProjectionToplist.class.equals(Long.class)
            || TreeDataProjectionToplist.class.equals(Float.class)
            || TreeDataProjectionToplist.class.equals(Double.class)
            || TreeDataProjectionToplist.class.equals(Boolean.class)
            || TreeDataProjectionToplist.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreeDataProjectionToplist.class.equals(Integer.class)
                        || TreeDataProjectionToplist.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreeDataProjectionToplist.class.equals(Float.class)
                        || TreeDataProjectionToplist.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreeDataProjectionToplist.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreeDataProjectionToplist.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreeDataProjectionToplist.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreeDataProjectionToplist) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreeDataProjectionToplist'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TreeDataProjectionToplist'", e);
      }

      // deserialize TreeDataProjectionTreemap
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TreeDataProjectionTreemap.class.equals(Integer.class)
            || TreeDataProjectionTreemap.class.equals(Long.class)
            || TreeDataProjectionTreemap.class.equals(Float.class)
            || TreeDataProjectionTreemap.class.equals(Double.class)
            || TreeDataProjectionTreemap.class.equals(Boolean.class)
            || TreeDataProjectionTreemap.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TreeDataProjectionTreemap.class.equals(Integer.class)
                        || TreeDataProjectionTreemap.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TreeDataProjectionTreemap.class.equals(Float.class)
                        || TreeDataProjectionTreemap.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TreeDataProjectionTreemap.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TreeDataProjectionTreemap.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TreeDataProjectionTreemap.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TreeDataProjectionTreemap) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TreeDataProjectionTreemap'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TreeDataProjectionTreemap'", e);
      }

      // deserialize QueryValueProjection
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryValueProjection.class.equals(Integer.class)
            || QueryValueProjection.class.equals(Long.class)
            || QueryValueProjection.class.equals(Float.class)
            || QueryValueProjection.class.equals(Double.class)
            || QueryValueProjection.class.equals(Boolean.class)
            || QueryValueProjection.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryValueProjection.class.equals(Integer.class)
                        || QueryValueProjection.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryValueProjection.class.equals(Float.class)
                        || QueryValueProjection.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryValueProjection.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryValueProjection.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryValueProjection.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryValueProjection) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryValueProjection'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryValueProjection'", e);
      }

      // deserialize QueryTableProjection
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (QueryTableProjection.class.equals(Integer.class)
            || QueryTableProjection.class.equals(Long.class)
            || QueryTableProjection.class.equals(Float.class)
            || QueryTableProjection.class.equals(Double.class)
            || QueryTableProjection.class.equals(Boolean.class)
            || QueryTableProjection.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((QueryTableProjection.class.equals(Integer.class)
                        || QueryTableProjection.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((QueryTableProjection.class.equals(Float.class)
                        || QueryTableProjection.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (QueryTableProjection.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (QueryTableProjection.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(QueryTableProjection.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((QueryTableProjection) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'QueryTableProjection'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'QueryTableProjection'", e);
      }

      // deserialize RunChartProjection
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RunChartProjection.class.equals(Integer.class)
            || RunChartProjection.class.equals(Long.class)
            || RunChartProjection.class.equals(Float.class)
            || RunChartProjection.class.equals(Double.class)
            || RunChartProjection.class.equals(Boolean.class)
            || RunChartProjection.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RunChartProjection.class.equals(Integer.class)
                        || RunChartProjection.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RunChartProjection.class.equals(Float.class)
                        || RunChartProjection.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RunChartProjection.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RunChartProjection.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RunChartProjection.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RunChartProjection) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RunChartProjection'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RunChartProjection'", e);
      }

      TabularProjection ret = new TabularProjection();
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
    public TabularProjection getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "TabularProjection cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public TabularProjection() {
    super("oneOf", Boolean.FALSE);
  }

  public TabularProjection(ScatterplotProjection o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularProjection(TreeDataProjectionBarChart o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularProjection(TreeDataProjectionSunburst o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularProjection(TreeDataProjectionToplist o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularProjection(TreeDataProjectionTreemap o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularProjection(QueryValueProjection o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularProjection(QueryTableProjection o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public TabularProjection(RunChartProjection o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("ScatterplotProjection", new GenericType<ScatterplotProjection>() {});
    schemas.put("TreeDataProjectionBarChart", new GenericType<TreeDataProjectionBarChart>() {});
    schemas.put("TreeDataProjectionSunburst", new GenericType<TreeDataProjectionSunburst>() {});
    schemas.put("TreeDataProjectionToplist", new GenericType<TreeDataProjectionToplist>() {});
    schemas.put("TreeDataProjectionTreemap", new GenericType<TreeDataProjectionTreemap>() {});
    schemas.put("QueryValueProjection", new GenericType<QueryValueProjection>() {});
    schemas.put("QueryTableProjection", new GenericType<QueryTableProjection>() {});
    schemas.put("RunChartProjection", new GenericType<RunChartProjection>() {});
    JSON.registerDescendants(TabularProjection.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return TabularProjection.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ScatterplotProjection, TreeDataProjectionBarChart,
   * TreeDataProjectionSunburst, TreeDataProjectionToplist, TreeDataProjectionTreemap,
   * QueryValueProjection, QueryTableProjection, RunChartProjection
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(ScatterplotProjection.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TreeDataProjectionBarChart.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TreeDataProjectionSunburst.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TreeDataProjectionToplist.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TreeDataProjectionTreemap.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryValueProjection.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(QueryTableProjection.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RunChartProjection.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ScatterplotProjection, TreeDataProjectionBarChart,"
            + " TreeDataProjectionSunburst, TreeDataProjectionToplist, TreeDataProjectionTreemap,"
            + " QueryValueProjection, QueryTableProjection, RunChartProjection");
  }

  /**
   * Get the actual instance, which can be the following: ScatterplotProjection,
   * TreeDataProjectionBarChart, TreeDataProjectionSunburst, TreeDataProjectionToplist,
   * TreeDataProjectionTreemap, QueryValueProjection, QueryTableProjection, RunChartProjection
   *
   * @return The actual instance (ScatterplotProjection, TreeDataProjectionBarChart,
   *     TreeDataProjectionSunburst, TreeDataProjectionToplist, TreeDataProjectionTreemap,
   *     QueryValueProjection, QueryTableProjection, RunChartProjection)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScatterplotProjection`. If the actual instance is not
   * `ScatterplotProjection`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScatterplotProjection`
   * @throws ClassCastException if the instance is not `ScatterplotProjection`
   */
  public ScatterplotProjection getScatterplotProjection() throws ClassCastException {
    return (ScatterplotProjection) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreeDataProjectionBarChart`. If the actual instance is not
   * `TreeDataProjectionBarChart`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreeDataProjectionBarChart`
   * @throws ClassCastException if the instance is not `TreeDataProjectionBarChart`
   */
  public TreeDataProjectionBarChart getTreeDataProjectionBarChart() throws ClassCastException {
    return (TreeDataProjectionBarChart) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreeDataProjectionSunburst`. If the actual instance is not
   * `TreeDataProjectionSunburst`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreeDataProjectionSunburst`
   * @throws ClassCastException if the instance is not `TreeDataProjectionSunburst`
   */
  public TreeDataProjectionSunburst getTreeDataProjectionSunburst() throws ClassCastException {
    return (TreeDataProjectionSunburst) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreeDataProjectionToplist`. If the actual instance is not
   * `TreeDataProjectionToplist`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreeDataProjectionToplist`
   * @throws ClassCastException if the instance is not `TreeDataProjectionToplist`
   */
  public TreeDataProjectionToplist getTreeDataProjectionToplist() throws ClassCastException {
    return (TreeDataProjectionToplist) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TreeDataProjectionTreemap`. If the actual instance is not
   * `TreeDataProjectionTreemap`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TreeDataProjectionTreemap`
   * @throws ClassCastException if the instance is not `TreeDataProjectionTreemap`
   */
  public TreeDataProjectionTreemap getTreeDataProjectionTreemap() throws ClassCastException {
    return (TreeDataProjectionTreemap) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryValueProjection`. If the actual instance is not
   * `QueryValueProjection`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryValueProjection`
   * @throws ClassCastException if the instance is not `QueryValueProjection`
   */
  public QueryValueProjection getQueryValueProjection() throws ClassCastException {
    return (QueryValueProjection) super.getActualInstance();
  }

  /**
   * Get the actual instance of `QueryTableProjection`. If the actual instance is not
   * `QueryTableProjection`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `QueryTableProjection`
   * @throws ClassCastException if the instance is not `QueryTableProjection`
   */
  public QueryTableProjection getQueryTableProjection() throws ClassCastException {
    return (QueryTableProjection) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RunChartProjection`. If the actual instance is not
   * `RunChartProjection`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RunChartProjection`
   * @throws ClassCastException if the instance is not `RunChartProjection`
   */
  public RunChartProjection getRunChartProjection() throws ClassCastException {
    return (RunChartProjection) super.getActualInstance();
  }
}
