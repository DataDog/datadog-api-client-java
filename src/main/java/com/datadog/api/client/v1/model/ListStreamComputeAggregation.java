/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Aggregation value. */
@JsonSerialize(using = ListStreamComputeAggregation.ListStreamComputeAggregationSerializer.class)
public class ListStreamComputeAggregation {

  public static final ListStreamComputeAggregation COUNT =
      new ListStreamComputeAggregation("count");
  public static final ListStreamComputeAggregation CARDINALITY =
      new ListStreamComputeAggregation("cardinality");
  public static final ListStreamComputeAggregation MEDIAN =
      new ListStreamComputeAggregation("median");
  public static final ListStreamComputeAggregation PC75 = new ListStreamComputeAggregation("pc75");
  public static final ListStreamComputeAggregation PC90 = new ListStreamComputeAggregation("pc90");
  public static final ListStreamComputeAggregation PC95 = new ListStreamComputeAggregation("pc95");
  public static final ListStreamComputeAggregation PC98 = new ListStreamComputeAggregation("pc98");
  public static final ListStreamComputeAggregation PC99 = new ListStreamComputeAggregation("pc99");
  public static final ListStreamComputeAggregation SUM = new ListStreamComputeAggregation("sum");
  public static final ListStreamComputeAggregation MIN = new ListStreamComputeAggregation("min");
  public static final ListStreamComputeAggregation MAX = new ListStreamComputeAggregation("max");
  public static final ListStreamComputeAggregation AVG = new ListStreamComputeAggregation("avg");
  public static final ListStreamComputeAggregation EARLIEST =
      new ListStreamComputeAggregation("earliest");
  public static final ListStreamComputeAggregation LATEST =
      new ListStreamComputeAggregation("latest");
  public static final ListStreamComputeAggregation MOST_FREQUENT =
      new ListStreamComputeAggregation("most_frequent");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "count",
              "cardinality",
              "median",
              "pc75",
              "pc90",
              "pc95",
              "pc98",
              "pc99",
              "sum",
              "min",
              "max",
              "avg",
              "earliest",
              "latest",
              "most_frequent"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ListStreamComputeAggregation(String value) {
    this.value = value;
  }

  public static class ListStreamComputeAggregationSerializer
      extends StdSerializer<ListStreamComputeAggregation> {
    public ListStreamComputeAggregationSerializer(Class<ListStreamComputeAggregation> t) {
      super(t);
    }

    public ListStreamComputeAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListStreamComputeAggregation value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ListStreamComputeAggregation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ListStreamComputeAggregation) o).value);
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
  public static ListStreamComputeAggregation fromValue(String value) {
    return new ListStreamComputeAggregation(value);
  }
}
