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

/** A time aggregation for use in query. */
@JsonSerialize(using = MetricCustomTimeAggregation.MetricCustomTimeAggregationSerializer.class)
public class MetricCustomTimeAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "count", "max", "min", "sum"));

  public static final MetricCustomTimeAggregation AVG = new MetricCustomTimeAggregation("avg");
  public static final MetricCustomTimeAggregation COUNT = new MetricCustomTimeAggregation("count");
  public static final MetricCustomTimeAggregation MAX = new MetricCustomTimeAggregation("max");
  public static final MetricCustomTimeAggregation MIN = new MetricCustomTimeAggregation("min");
  public static final MetricCustomTimeAggregation SUM = new MetricCustomTimeAggregation("sum");

  MetricCustomTimeAggregation(String value) {
    super(value, allowedValues);
  }

  public static class MetricCustomTimeAggregationSerializer
      extends StdSerializer<MetricCustomTimeAggregation> {
    public MetricCustomTimeAggregationSerializer(Class<MetricCustomTimeAggregation> t) {
      super(t);
    }

    public MetricCustomTimeAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricCustomTimeAggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricCustomTimeAggregation fromValue(String value) {
    return new MetricCustomTimeAggregation(value);
  }
}
