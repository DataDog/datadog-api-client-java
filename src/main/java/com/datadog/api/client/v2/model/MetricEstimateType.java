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
 * Estimate type based on the queried configuration. <code>count_or_gauge</code> is returned by
 * default, and <code>distribution</code> is returned for distribution metrics. The <code>
 * filter[pct]</code> query parameter has no effect on this value.
 */
@JsonSerialize(using = MetricEstimateType.MetricEstimateTypeSerializer.class)
public class MetricEstimateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("count_or_gauge", "distribution", "percentile"));

  public static final MetricEstimateType COUNT_OR_GAUGE = new MetricEstimateType("count_or_gauge");
  public static final MetricEstimateType DISTRIBUTION = new MetricEstimateType("distribution");
  public static final MetricEstimateType PERCENTILE = new MetricEstimateType("percentile");

  MetricEstimateType(String value) {
    super(value, allowedValues);
  }

  public static class MetricEstimateTypeSerializer extends StdSerializer<MetricEstimateType> {
    public MetricEstimateTypeSerializer(Class<MetricEstimateType> t) {
      super(t);
    }

    public MetricEstimateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MetricEstimateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricEstimateType fromValue(String value) {
    return new MetricEstimateType(value);
  }
}
