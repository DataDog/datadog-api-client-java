/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

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

/** Aggregator used for the request. */
@JsonSerialize(using = WidgetAggregator.WidgetAggregatorSerializer.class)
public class WidgetAggregator {

  public static final WidgetAggregator AVERAGE = new WidgetAggregator("avg");
  public static final WidgetAggregator LAST = new WidgetAggregator("last");
  public static final WidgetAggregator MAXIMUM = new WidgetAggregator("max");
  public static final WidgetAggregator MINIMUM = new WidgetAggregator("min");
  public static final WidgetAggregator SUM = new WidgetAggregator("sum");
  public static final WidgetAggregator PERCENTILE = new WidgetAggregator("percentile");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "last", "max", "min", "sum", "percentile"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetAggregator(String value) {
    this.value = value;
  }

  public static class WidgetAggregatorSerializer extends StdSerializer<WidgetAggregator> {
    public WidgetAggregatorSerializer(Class<WidgetAggregator> t) {
      super(t);
    }

    public WidgetAggregatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetAggregator value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this WidgetAggregator object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetAggregator) o).value);
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
  public static WidgetAggregator fromValue(String value) {
    return new WidgetAggregator(value);
  }
}
