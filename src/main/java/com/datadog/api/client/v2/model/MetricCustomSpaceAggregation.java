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

/** A space aggregation for use in query. */
@JsonSerialize(using = MetricCustomSpaceAggregation.MetricCustomSpaceAggregationSerializer.class)
public class MetricCustomSpaceAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "max", "min", "sum"));

  public static final MetricCustomSpaceAggregation AVG = new MetricCustomSpaceAggregation("avg");
  public static final MetricCustomSpaceAggregation MAX = new MetricCustomSpaceAggregation("max");
  public static final MetricCustomSpaceAggregation MIN = new MetricCustomSpaceAggregation("min");
  public static final MetricCustomSpaceAggregation SUM = new MetricCustomSpaceAggregation("sum");

  MetricCustomSpaceAggregation(String value) {
    super(value, allowedValues);
  }

  public static class MetricCustomSpaceAggregationSerializer
      extends StdSerializer<MetricCustomSpaceAggregation> {
    public MetricCustomSpaceAggregationSerializer(Class<MetricCustomSpaceAggregation> t) {
      super(t);
    }

    public MetricCustomSpaceAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricCustomSpaceAggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricCustomSpaceAggregation fromValue(String value) {
    return new MetricCustomSpaceAggregation(value);
  }
}
