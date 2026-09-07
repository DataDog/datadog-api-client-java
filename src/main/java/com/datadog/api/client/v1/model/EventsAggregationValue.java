/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Standard aggregation types for events-based queries. */
@JsonSerialize(using = EventsAggregationValue.EventsAggregationValueSerializer.class)
public class EventsAggregationValue extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "avg",
              "cardinality",
              "count",
              "delta",
              "earliest",
              "latest",
              "max",
              "median",
              "min",
              "most_frequent",
              "sum"));

  public static final EventsAggregationValue AVG = new EventsAggregationValue("avg");
  public static final EventsAggregationValue CARDINALITY =
      new EventsAggregationValue("cardinality");
  public static final EventsAggregationValue COUNT = new EventsAggregationValue("count");
  public static final EventsAggregationValue DELTA = new EventsAggregationValue("delta");
  public static final EventsAggregationValue EARLIEST = new EventsAggregationValue("earliest");
  public static final EventsAggregationValue LATEST = new EventsAggregationValue("latest");
  public static final EventsAggregationValue MAX = new EventsAggregationValue("max");
  public static final EventsAggregationValue MEDIAN = new EventsAggregationValue("median");
  public static final EventsAggregationValue MIN = new EventsAggregationValue("min");
  public static final EventsAggregationValue MOST_FREQUENT =
      new EventsAggregationValue("most_frequent");
  public static final EventsAggregationValue SUM = new EventsAggregationValue("sum");

  EventsAggregationValue(String value) {
    super(value, allowedValues);
  }

  public static class EventsAggregationValueSerializer
      extends StdSerializer<EventsAggregationValue> {
    public EventsAggregationValueSerializer(Class<EventsAggregationValue> t) {
      super(t);
    }

    public EventsAggregationValueSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventsAggregationValue value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EventsAggregationValue fromValue(String value) {
    return new EventsAggregationValue(value);
  }
}
