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

/** Performance metric used to filter view instances by threshold. */
@JsonSerialize(
    using =
        AggregatedWaterfallPerformanceCriteriaMetric
            .AggregatedWaterfallPerformanceCriteriaMetricSerializer.class)
public class AggregatedWaterfallPerformanceCriteriaMetric extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "loading_time",
              "largest_contentful_paint",
              "first_contentful_paint",
              "interaction_to_next_paint"));

  public static final AggregatedWaterfallPerformanceCriteriaMetric LOADING_TIME =
      new AggregatedWaterfallPerformanceCriteriaMetric("loading_time");
  public static final AggregatedWaterfallPerformanceCriteriaMetric LARGEST_CONTENTFUL_PAINT =
      new AggregatedWaterfallPerformanceCriteriaMetric("largest_contentful_paint");
  public static final AggregatedWaterfallPerformanceCriteriaMetric FIRST_CONTENTFUL_PAINT =
      new AggregatedWaterfallPerformanceCriteriaMetric("first_contentful_paint");
  public static final AggregatedWaterfallPerformanceCriteriaMetric INTERACTION_TO_NEXT_PAINT =
      new AggregatedWaterfallPerformanceCriteriaMetric("interaction_to_next_paint");

  AggregatedWaterfallPerformanceCriteriaMetric(String value) {
    super(value, allowedValues);
  }

  public static class AggregatedWaterfallPerformanceCriteriaMetricSerializer
      extends StdSerializer<AggregatedWaterfallPerformanceCriteriaMetric> {
    public AggregatedWaterfallPerformanceCriteriaMetricSerializer(
        Class<AggregatedWaterfallPerformanceCriteriaMetric> t) {
      super(t);
    }

    public AggregatedWaterfallPerformanceCriteriaMetricSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AggregatedWaterfallPerformanceCriteriaMetric value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AggregatedWaterfallPerformanceCriteriaMetric fromValue(String value) {
    return new AggregatedWaterfallPerformanceCriteriaMetric(value);
  }
}
