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
import java.util.UUID;
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

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The type of aggregation that can be performed on events-based queries.</p>
 */
@JsonSerialize(using = EventsAggregation.EventsAggregationSerializer.class)
public class EventsAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("count", "cardinality", "pc75", "pc90", "pc95", "pc98", "pc99", "sum", "min", "max", "avg"));

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


  EventsAggregation(String value) {
    super(value, allowedValues);
  }

  public static class EventsAggregationSerializer extends StdSerializer<EventsAggregation> {
      public EventsAggregationSerializer(Class<EventsAggregation> t) {
          super(t);
      }

      public EventsAggregationSerializer() {
          this(null);
      }

      @Override
      public void serialize(EventsAggregation value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static EventsAggregation fromValue(String value) {
    return new EventsAggregation(value);
  }
}
