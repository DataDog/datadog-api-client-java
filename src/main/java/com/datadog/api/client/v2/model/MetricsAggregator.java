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

/** The type of aggregation that can be performed on metrics queries. */
@JsonSerialize(using = MetricsAggregator.MetricsAggregatorSerializer.class)
public class MetricsAggregator {

  public static final MetricsAggregator AVG = new MetricsAggregator("avg");
  public static final MetricsAggregator MIN = new MetricsAggregator("min");
  public static final MetricsAggregator MAX = new MetricsAggregator("max");
  public static final MetricsAggregator SUM = new MetricsAggregator("sum");
  public static final MetricsAggregator LAST = new MetricsAggregator("last");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "min", "max", "sum", "last"));

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
    public void serialize(MetricsAggregator value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this MetricsAggregator object is equal to o. */
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
