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

/** The type of aggregation that can be performed on metrics-based queries. */
@JsonSerialize(using = MetricsAggregator.MetricsAggregatorSerializer.class)
public class MetricsAggregator extends ModelEnum<String> {

  public static final MetricsAggregator AVG = new MetricsAggregator("avg");
  public static final MetricsAggregator MIN = new MetricsAggregator("min");
  public static final MetricsAggregator MAX = new MetricsAggregator("max");
  public static final MetricsAggregator SUM = new MetricsAggregator("sum");
  public static final MetricsAggregator LAST = new MetricsAggregator("last");
  public static final MetricsAggregator PERCENTILE = new MetricsAggregator("percentile");
  public static final MetricsAggregator MEAN = new MetricsAggregator("mean");
  public static final MetricsAggregator L2NORM = new MetricsAggregator("l2norm");
  public static final MetricsAggregator AREA = new MetricsAggregator("area");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "avg", "min", "max", "sum", "last", "percentile", "mean", "l2norm", "area"));

  MetricsAggregator(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class MetricsAggregatorSerializer extends StdSerializer<MetricsAggregator> {
    public MetricsAggregatorSerializer(Class<MetricsAggregator> t) {
      super(t);
    }

    public MetricsAggregatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(MetricsAggregator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricsAggregator fromValue(String value) {
    return new MetricsAggregator(value);
  }
}
