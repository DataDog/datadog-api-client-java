/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The type of aggregation that can be performed on metrics queries.</p>
 */
@JsonSerialize(using = MetricsAggregator.MetricsAggregatorSerializer.class)
public class MetricsAggregator {

  public static final MetricsAggregator AVG = new MetricsAggregator("avg");
  public static final MetricsAggregator MIN = new MetricsAggregator("min");
  public static final MetricsAggregator MAX = new MetricsAggregator("max");
  public static final MetricsAggregator SUM = new MetricsAggregator("sum");
  public static final MetricsAggregator LAST = new MetricsAggregator("last");
  public static final MetricsAggregator PERCENTILE = new MetricsAggregator("percentile");
  public static final MetricsAggregator MEAN = new MetricsAggregator("mean");
  public static final MetricsAggregator L2NORM = new MetricsAggregator("l2norm");
  public static final MetricsAggregator AREA = new MetricsAggregator("area");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("avg", "min", "max", "sum", "last", "percentile", "mean", "l2norm", "area"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  MetricsAggregator(String value) {
    this.value = value;
  }

  public static class MetricsAggregatorSerializer extends StdSerializer<MetricsAggregator> {
      public MetricsAggregatorSerializer(Class<MetricsAggregator> t) {
          super(t);
      }

      public MetricsAggregatorSerializer() {
          this(null);
      }

      @Override
      public void serialize(MetricsAggregator value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
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

  /**
   * Return true if this MetricsAggregator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((MetricsAggregator) o).value);
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
  public static MetricsAggregator fromValue(String value) {
    return new MetricsAggregator(value);
  }
}
