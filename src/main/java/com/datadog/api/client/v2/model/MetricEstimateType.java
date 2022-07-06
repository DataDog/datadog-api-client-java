/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Estimate type based on the queried configuration. By default, <code>count_or_gauge</code> is
 * returned. <code>distribution</code> is returned for distribution metrics without percentiles
 * enabled. Lastly, <code>percentile</code> is returned if <code>filter[pct]=true</code> is queried
 * with a distribution metric.
 */
@JsonSerialize(using = MetricEstimateType.MetricEstimateTypeSerializer.class)
public class MetricEstimateType {

  public static final MetricEstimateType COUNT_OR_GAUGE = new MetricEstimateType("count_or_gauge");
  public static final MetricEstimateType DISTRIBUTION = new MetricEstimateType("distribution");
  public static final MetricEstimateType PERCENTILE = new MetricEstimateType("percentile");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("count_or_gauge", "distribution", "percentile"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  MetricEstimateType(String value) {
    this.value = value;
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

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this MetricEstimateType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((MetricEstimateType) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MetricEstimateType fromValue(String value) {
    return new MetricEstimateType(value);
  }
}
