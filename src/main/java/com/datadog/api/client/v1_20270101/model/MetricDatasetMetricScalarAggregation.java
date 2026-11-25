/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        MetricDatasetMetricScalarAggregation.MetricDatasetMetricScalarAggregationSerializer.class)
public class MetricDatasetMetricScalarAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sum", "min", "max", "avg"));

  public static final MetricDatasetMetricScalarAggregation SUM =
      new MetricDatasetMetricScalarAggregation("sum");
  public static final MetricDatasetMetricScalarAggregation MIN =
      new MetricDatasetMetricScalarAggregation("min");
  public static final MetricDatasetMetricScalarAggregation MAX =
      new MetricDatasetMetricScalarAggregation("max");
  public static final MetricDatasetMetricScalarAggregation AVG =
      new MetricDatasetMetricScalarAggregation("avg");

  MetricDatasetMetricScalarAggregation(String value) {
    super(value, allowedValues);
  }

  public static class MetricDatasetMetricScalarAggregationSerializer
      extends StdSerializer<MetricDatasetMetricScalarAggregation> {
    public MetricDatasetMetricScalarAggregationSerializer(
        Class<MetricDatasetMetricScalarAggregation> t) {
      super(t);
    }

    public MetricDatasetMetricScalarAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricDatasetMetricScalarAggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricDatasetMetricScalarAggregation fromValue(String value) {
    return new MetricDatasetMetricScalarAggregation(value);
  }
}
