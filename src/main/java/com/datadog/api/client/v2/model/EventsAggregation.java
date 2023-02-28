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

/** The type of aggregation that can be performed on events-based queries. */
@JsonSerialize(using = EventsAggregation.EventsAggregationSerializer.class)
public class EventsAggregation {

  public static final EventsAggregation COUNT = new EventsAggregation("count");
  public static final EventsAggregation CARDINALITY = new EventsAggregation("cardinality");
  public static final EventsAggregation PC75 = new EventsAggregation("pc75");
  public static final EventsAggregation PC90 = new EventsAggregation("pc90");
  public static final EventsAggregation PC95 = new EventsAggregation("pc95");
  public static final EventsAggregation PC98 = new EventsAggregation("pc98");
  public static final EventsAggregation PC99 = new EventsAggregation("pc99");
  public static final EventsAggregation SUM = new EventsAggregation("sum");
  public static final EventsAggregation MIN = new EventsAggregation("min");
  public static final EventsAggregation MAX = new EventsAggregation("max");
  public static final EventsAggregation AVG = new EventsAggregation("avg");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "count",
              "cardinality",
              "pc75",
              "pc90",
              "pc95",
              "pc98",
              "pc99",
              "sum",
              "min",
              "max",
              "avg"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  EventsAggregation(String value) {
    this.value = value;
  }

  public static class EventsAggregationSerializer extends StdSerializer<EventsAggregation> {
    public EventsAggregationSerializer(Class<EventsAggregation> t) {
      super(t);
    }

    public EventsAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(EventsAggregation value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this EventsAggregation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((EventsAggregation) o).value);
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
  public static EventsAggregation fromValue(String value) {
    return new EventsAggregation(value);
  }
}
