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

/** Dimension to group scores by. */
@JsonSerialize(using = ScorecardScoresAggregation.ScorecardScoresAggregationSerializer.class)
public class ScorecardScoresAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("by-entity", "by-rule", "by-scorecard", "by-team", "by-kind"));

  public static final ScorecardScoresAggregation BY_ENTITY =
      new ScorecardScoresAggregation("by-entity");
  public static final ScorecardScoresAggregation BY_RULE =
      new ScorecardScoresAggregation("by-rule");
  public static final ScorecardScoresAggregation BY_SCORECARD =
      new ScorecardScoresAggregation("by-scorecard");
  public static final ScorecardScoresAggregation BY_TEAM =
      new ScorecardScoresAggregation("by-team");
  public static final ScorecardScoresAggregation BY_KIND =
      new ScorecardScoresAggregation("by-kind");

  ScorecardScoresAggregation(String value) {
    super(value, allowedValues);
  }

  public static class ScorecardScoresAggregationSerializer
      extends StdSerializer<ScorecardScoresAggregation> {
    public ScorecardScoresAggregationSerializer(Class<ScorecardScoresAggregation> t) {
      super(t);
    }

    public ScorecardScoresAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScorecardScoresAggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScorecardScoresAggregation fromValue(String value) {
    return new ScorecardScoresAggregation(value);
  }
}
