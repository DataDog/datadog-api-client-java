/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Widget types that are allowed to be stored as individual records in the 'widget' PG table.
 *
 * <p>This is not a complete list of dashboards/notebooks widget types.
 */
@JsonSerialize(using = WidgetType.WidgetTypeSerializer.class)
public class WidgetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "bar_chart",
              "change",
              "cloud_cost_summary",
              "cohort",
              "funnel",
              "geomap",
              "list_stream",
              "query_table",
              "query_value",
              "retention_curve",
              "sankey",
              "sunburst",
              "timeseries",
              "toplist",
              "treemap"));

  public static final WidgetType BAR_CHART = new WidgetType("bar_chart");
  public static final WidgetType CHANGE = new WidgetType("change");
  public static final WidgetType CLOUD_COST_SUMMARY = new WidgetType("cloud_cost_summary");
  public static final WidgetType COHORT = new WidgetType("cohort");
  public static final WidgetType FUNNEL = new WidgetType("funnel");
  public static final WidgetType GEOMAP = new WidgetType("geomap");
  public static final WidgetType LIST_STREAM = new WidgetType("list_stream");
  public static final WidgetType QUERY_TABLE = new WidgetType("query_table");
  public static final WidgetType QUERY_VALUE = new WidgetType("query_value");
  public static final WidgetType RETENTION_CURVE = new WidgetType("retention_curve");
  public static final WidgetType SANKEY = new WidgetType("sankey");
  public static final WidgetType SUNBURST = new WidgetType("sunburst");
  public static final WidgetType TIMESERIES = new WidgetType("timeseries");
  public static final WidgetType TOPLIST = new WidgetType("toplist");
  public static final WidgetType TREEMAP = new WidgetType("treemap");

  WidgetType(String value) {
    super(value, allowedValues);
  }

  public static class WidgetTypeSerializer extends StdSerializer<WidgetType> {
    public WidgetTypeSerializer(Class<WidgetType> t) {
      super(t);
    }

    public WidgetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetType fromValue(String value) {
    return new WidgetType(value);
  }
}
