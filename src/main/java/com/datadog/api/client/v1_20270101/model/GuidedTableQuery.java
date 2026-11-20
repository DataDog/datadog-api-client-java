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
@JsonDeserialize(using = GuidedTableQuery.GuidedTableQueryDeserializer.class)
@JsonSerialize(using = GuidedTableQuery.GuidedTableQuerySerializer.class)
public class GuidedTableQuery extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GuidedTableQuery.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GuidedTableQuerySerializer extends StdSerializer<GuidedTableQuery> {
    public GuidedTableQuerySerializer(Class<GuidedTableQuery> t) {
      super(t);
    }

    public GuidedTableQuerySerializer() {
      this(null);
    }

    @Override
    public void serialize(GuidedTableQuery value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GuidedTableQueryDeserializer extends StdDeserializer<GuidedTableQuery> {
    public GuidedTableQueryDeserializer() {
      this(GuidedTableQuery.class);
    }

    public GuidedTableQueryDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GuidedTableQuery deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize MetricsLikeQueryFragmentMetrics
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricsLikeQueryFragmentMetrics.class.equals(Integer.class)
            || MetricsLikeQueryFragmentMetrics.class.equals(Long.class)
            || MetricsLikeQueryFragmentMetrics.class.equals(Float.class)
            || MetricsLikeQueryFragmentMetrics.class.equals(Double.class)
            || MetricsLikeQueryFragmentMetrics.class.equals(Boolean.class)
            || MetricsLikeQueryFragmentMetrics.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricsLikeQueryFragmentMetrics.class.equals(Integer.class)
                        || MetricsLikeQueryFragmentMetrics.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricsLikeQueryFragmentMetrics.class.equals(Float.class)
                        || MetricsLikeQueryFragmentMetrics.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricsLikeQueryFragmentMetrics.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricsLikeQueryFragmentMetrics.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricsLikeQueryFragmentMetrics.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricsLikeQueryFragmentMetrics) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricsLikeQueryFragmentMetrics'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'MetricsLikeQueryFragmentMetrics'", e);
      }

      // deserialize MetricsLikeQueryFragmentCloudCost
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MetricsLikeQueryFragmentCloudCost.class.equals(Integer.class)
            || MetricsLikeQueryFragmentCloudCost.class.equals(Long.class)
            || MetricsLikeQueryFragmentCloudCost.class.equals(Float.class)
            || MetricsLikeQueryFragmentCloudCost.class.equals(Double.class)
            || MetricsLikeQueryFragmentCloudCost.class.equals(Boolean.class)
            || MetricsLikeQueryFragmentCloudCost.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MetricsLikeQueryFragmentCloudCost.class.equals(Integer.class)
                        || MetricsLikeQueryFragmentCloudCost.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MetricsLikeQueryFragmentCloudCost.class.equals(Float.class)
                        || MetricsLikeQueryFragmentCloudCost.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MetricsLikeQueryFragmentCloudCost.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MetricsLikeQueryFragmentCloudCost.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MetricsLikeQueryFragmentCloudCost.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MetricsLikeQueryFragmentCloudCost) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MetricsLikeQueryFragmentCloudCost'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'MetricsLikeQueryFragmentCloudCost'", e);
      }

      // deserialize EventsQueryFragmentDefinition
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsQueryFragmentDefinition.class.equals(Integer.class)
            || EventsQueryFragmentDefinition.class.equals(Long.class)
            || EventsQueryFragmentDefinition.class.equals(Float.class)
            || EventsQueryFragmentDefinition.class.equals(Double.class)
            || EventsQueryFragmentDefinition.class.equals(Boolean.class)
            || EventsQueryFragmentDefinition.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsQueryFragmentDefinition.class.equals(Integer.class)
                        || EventsQueryFragmentDefinition.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsQueryFragmentDefinition.class.equals(Float.class)
                        || EventsQueryFragmentDefinition.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsQueryFragmentDefinition.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsQueryFragmentDefinition.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventsQueryFragmentDefinition.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsQueryFragmentDefinition) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventsQueryFragmentDefinition'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventsQueryFragmentDefinition'", e);
      }

      // deserialize ReferentialQueryFragmentReferenceTable
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ReferentialQueryFragmentReferenceTable.class.equals(Integer.class)
            || ReferentialQueryFragmentReferenceTable.class.equals(Long.class)
            || ReferentialQueryFragmentReferenceTable.class.equals(Float.class)
            || ReferentialQueryFragmentReferenceTable.class.equals(Double.class)
            || ReferentialQueryFragmentReferenceTable.class.equals(Boolean.class)
            || ReferentialQueryFragmentReferenceTable.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ReferentialQueryFragmentReferenceTable.class.equals(Integer.class)
                        || ReferentialQueryFragmentReferenceTable.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ReferentialQueryFragmentReferenceTable.class.equals(Float.class)
                        || ReferentialQueryFragmentReferenceTable.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ReferentialQueryFragmentReferenceTable.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ReferentialQueryFragmentReferenceTable.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ReferentialQueryFragmentReferenceTable.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ReferentialQueryFragmentReferenceTable) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ReferentialQueryFragmentReferenceTable'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ReferentialQueryFragmentReferenceTable'",
            e);
      }

      // deserialize ReferentialQueryFragmentManagedResource
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ReferentialQueryFragmentManagedResource.class.equals(Integer.class)
            || ReferentialQueryFragmentManagedResource.class.equals(Long.class)
            || ReferentialQueryFragmentManagedResource.class.equals(Float.class)
            || ReferentialQueryFragmentManagedResource.class.equals(Double.class)
            || ReferentialQueryFragmentManagedResource.class.equals(Boolean.class)
            || ReferentialQueryFragmentManagedResource.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ReferentialQueryFragmentManagedResource.class.equals(Integer.class)
                        || ReferentialQueryFragmentManagedResource.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ReferentialQueryFragmentManagedResource.class.equals(Float.class)
                        || ReferentialQueryFragmentManagedResource.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ReferentialQueryFragmentManagedResource.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ReferentialQueryFragmentManagedResource.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ReferentialQueryFragmentManagedResource.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ReferentialQueryFragmentManagedResource) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'ReferentialQueryFragmentManagedResource'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ReferentialQueryFragmentManagedResource'",
            e);
      }

      // deserialize PublishedAnalysisQueryFragment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (PublishedAnalysisQueryFragment.class.equals(Integer.class)
            || PublishedAnalysisQueryFragment.class.equals(Long.class)
            || PublishedAnalysisQueryFragment.class.equals(Float.class)
            || PublishedAnalysisQueryFragment.class.equals(Double.class)
            || PublishedAnalysisQueryFragment.class.equals(Boolean.class)
            || PublishedAnalysisQueryFragment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((PublishedAnalysisQueryFragment.class.equals(Integer.class)
                        || PublishedAnalysisQueryFragment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((PublishedAnalysisQueryFragment.class.equals(Float.class)
                        || PublishedAnalysisQueryFragment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (PublishedAnalysisQueryFragment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (PublishedAnalysisQueryFragment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(PublishedAnalysisQueryFragment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((PublishedAnalysisQueryFragment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'PublishedAnalysisQueryFragment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'PublishedAnalysisQueryFragment'", e);
      }

      // deserialize ApmMetricsQueryFragment
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ApmMetricsQueryFragment.class.equals(Integer.class)
            || ApmMetricsQueryFragment.class.equals(Long.class)
            || ApmMetricsQueryFragment.class.equals(Float.class)
            || ApmMetricsQueryFragment.class.equals(Double.class)
            || ApmMetricsQueryFragment.class.equals(Boolean.class)
            || ApmMetricsQueryFragment.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ApmMetricsQueryFragment.class.equals(Integer.class)
                        || ApmMetricsQueryFragment.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ApmMetricsQueryFragment.class.equals(Float.class)
                        || ApmMetricsQueryFragment.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ApmMetricsQueryFragment.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ApmMetricsQueryFragment.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ApmMetricsQueryFragment.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ApmMetricsQueryFragment) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ApmMetricsQueryFragment'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ApmMetricsQueryFragment'", e);
      }

      GuidedTableQuery ret = new GuidedTableQuery();
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
    public GuidedTableQuery getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GuidedTableQuery cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GuidedTableQuery() {
    super("oneOf", Boolean.FALSE);
  }

  public GuidedTableQuery(MetricsLikeQueryFragmentMetrics o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableQuery(MetricsLikeQueryFragmentCloudCost o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableQuery(EventsQueryFragmentDefinition o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableQuery(ReferentialQueryFragmentReferenceTable o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableQuery(ReferentialQueryFragmentManagedResource o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableQuery(PublishedAnalysisQueryFragment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GuidedTableQuery(ApmMetricsQueryFragment o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "MetricsLikeQueryFragmentMetrics", new GenericType<MetricsLikeQueryFragmentMetrics>() {});
    schemas.put(
        "MetricsLikeQueryFragmentCloudCost",
        new GenericType<MetricsLikeQueryFragmentCloudCost>() {});
    schemas.put(
        "EventsQueryFragmentDefinition", new GenericType<EventsQueryFragmentDefinition>() {});
    schemas.put(
        "ReferentialQueryFragmentReferenceTable",
        new GenericType<ReferentialQueryFragmentReferenceTable>() {});
    schemas.put(
        "ReferentialQueryFragmentManagedResource",
        new GenericType<ReferentialQueryFragmentManagedResource>() {});
    schemas.put(
        "PublishedAnalysisQueryFragment", new GenericType<PublishedAnalysisQueryFragment>() {});
    schemas.put("ApmMetricsQueryFragment", new GenericType<ApmMetricsQueryFragment>() {});
    JSON.registerDescendants(GuidedTableQuery.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GuidedTableQuery.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: MetricsLikeQueryFragmentMetrics,
   * MetricsLikeQueryFragmentCloudCost, EventsQueryFragmentDefinition,
   * ReferentialQueryFragmentReferenceTable, ReferentialQueryFragmentManagedResource,
   * PublishedAnalysisQueryFragment, ApmMetricsQueryFragment
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        MetricsLikeQueryFragmentMetrics.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        MetricsLikeQueryFragmentCloudCost.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventsQueryFragmentDefinition.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ReferentialQueryFragmentReferenceTable.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ReferentialQueryFragmentManagedResource.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        PublishedAnalysisQueryFragment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ApmMetricsQueryFragment.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be MetricsLikeQueryFragmentMetrics,"
            + " MetricsLikeQueryFragmentCloudCost, EventsQueryFragmentDefinition,"
            + " ReferentialQueryFragmentReferenceTable, ReferentialQueryFragmentManagedResource,"
            + " PublishedAnalysisQueryFragment, ApmMetricsQueryFragment");
  }

  /**
   * Get the actual instance, which can be the following: MetricsLikeQueryFragmentMetrics,
   * MetricsLikeQueryFragmentCloudCost, EventsQueryFragmentDefinition,
   * ReferentialQueryFragmentReferenceTable, ReferentialQueryFragmentManagedResource,
   * PublishedAnalysisQueryFragment, ApmMetricsQueryFragment
   *
   * @return The actual instance (MetricsLikeQueryFragmentMetrics,
   *     MetricsLikeQueryFragmentCloudCost, EventsQueryFragmentDefinition,
   *     ReferentialQueryFragmentReferenceTable, ReferentialQueryFragmentManagedResource,
   *     PublishedAnalysisQueryFragment, ApmMetricsQueryFragment)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricsLikeQueryFragmentMetrics`. If the actual instance is not
   * `MetricsLikeQueryFragmentMetrics`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricsLikeQueryFragmentMetrics`
   * @throws ClassCastException if the instance is not `MetricsLikeQueryFragmentMetrics`
   */
  public MetricsLikeQueryFragmentMetrics getMetricsLikeQueryFragmentMetrics()
      throws ClassCastException {
    return (MetricsLikeQueryFragmentMetrics) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MetricsLikeQueryFragmentCloudCost`. If the actual instance is not
   * `MetricsLikeQueryFragmentCloudCost`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MetricsLikeQueryFragmentCloudCost`
   * @throws ClassCastException if the instance is not `MetricsLikeQueryFragmentCloudCost`
   */
  public MetricsLikeQueryFragmentCloudCost getMetricsLikeQueryFragmentCloudCost()
      throws ClassCastException {
    return (MetricsLikeQueryFragmentCloudCost) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsQueryFragmentDefinition`. If the actual instance is not
   * `EventsQueryFragmentDefinition`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventsQueryFragmentDefinition`
   * @throws ClassCastException if the instance is not `EventsQueryFragmentDefinition`
   */
  public EventsQueryFragmentDefinition getEventsQueryFragmentDefinition()
      throws ClassCastException {
    return (EventsQueryFragmentDefinition) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ReferentialQueryFragmentReferenceTable`. If the actual instance is
   * not `ReferentialQueryFragmentReferenceTable`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ReferentialQueryFragmentReferenceTable`
   * @throws ClassCastException if the instance is not `ReferentialQueryFragmentReferenceTable`
   */
  public ReferentialQueryFragmentReferenceTable getReferentialQueryFragmentReferenceTable()
      throws ClassCastException {
    return (ReferentialQueryFragmentReferenceTable) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ReferentialQueryFragmentManagedResource`. If the actual instance is
   * not `ReferentialQueryFragmentManagedResource`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ReferentialQueryFragmentManagedResource`
   * @throws ClassCastException if the instance is not `ReferentialQueryFragmentManagedResource`
   */
  public ReferentialQueryFragmentManagedResource getReferentialQueryFragmentManagedResource()
      throws ClassCastException {
    return (ReferentialQueryFragmentManagedResource) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PublishedAnalysisQueryFragment`. If the actual instance is not
   * `PublishedAnalysisQueryFragment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PublishedAnalysisQueryFragment`
   * @throws ClassCastException if the instance is not `PublishedAnalysisQueryFragment`
   */
  public PublishedAnalysisQueryFragment getPublishedAnalysisQueryFragment()
      throws ClassCastException {
    return (PublishedAnalysisQueryFragment) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ApmMetricsQueryFragment`. If the actual instance is not
   * `ApmMetricsQueryFragment`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ApmMetricsQueryFragment`
   * @throws ClassCastException if the instance is not `ApmMetricsQueryFragment`
   */
  public ApmMetricsQueryFragment getApmMetricsQueryFragment() throws ClassCastException {
    return (ApmMetricsQueryFragment) super.getActualInstance();
  }
}
