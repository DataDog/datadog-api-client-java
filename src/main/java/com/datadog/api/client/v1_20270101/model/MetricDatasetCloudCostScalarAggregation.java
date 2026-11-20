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
        MetricDatasetCloudCostScalarAggregation.MetricDatasetCloudCostScalarAggregationSerializer
            .class)
public class MetricDatasetCloudCostScalarAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sum", "min", "max", "avg"));

  public static final MetricDatasetCloudCostScalarAggregation SUM =
      new MetricDatasetCloudCostScalarAggregation("sum");
  public static final MetricDatasetCloudCostScalarAggregation MIN =
      new MetricDatasetCloudCostScalarAggregation("min");
  public static final MetricDatasetCloudCostScalarAggregation MAX =
      new MetricDatasetCloudCostScalarAggregation("max");
  public static final MetricDatasetCloudCostScalarAggregation AVG =
      new MetricDatasetCloudCostScalarAggregation("avg");

  MetricDatasetCloudCostScalarAggregation(String value) {
    super(value, allowedValues);
  }

  public static class MetricDatasetCloudCostScalarAggregationSerializer
      extends StdSerializer<MetricDatasetCloudCostScalarAggregation> {
    public MetricDatasetCloudCostScalarAggregationSerializer(
        Class<MetricDatasetCloudCostScalarAggregation> t) {
      super(t);
    }

    public MetricDatasetCloudCostScalarAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricDatasetCloudCostScalarAggregation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricDatasetCloudCostScalarAggregation fromValue(String value) {
    return new MetricDatasetCloudCostScalarAggregation(value);
  }
}
