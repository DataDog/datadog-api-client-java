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

/**
 * WAITING_FOR_FIRST_REFRESH until a refresh saves results. STATS_UNAVAILABLE when the latest saved
 * refresh has no complete probabilities of being optimal. ENDED once the bandit is stopped or
 * completed; its last estimates stay. Otherwise WARMUP or OPTIMIZING says which policy the bandit
 * serves. A paused bandit keeps its state.
 */
@JsonSerialize(using = ExperimentsBanditResultsState.ExperimentsBanditResultsStateSerializer.class)
public class ExperimentsBanditResultsState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "WAITING_FOR_FIRST_REFRESH", "WARMUP", "OPTIMIZING", "STATS_UNAVAILABLE", "ENDED"));

  public static final ExperimentsBanditResultsState WAITING_FOR_FIRST_REFRESH =
      new ExperimentsBanditResultsState("WAITING_FOR_FIRST_REFRESH");
  public static final ExperimentsBanditResultsState WARMUP =
      new ExperimentsBanditResultsState("WARMUP");
  public static final ExperimentsBanditResultsState OPTIMIZING =
      new ExperimentsBanditResultsState("OPTIMIZING");
  public static final ExperimentsBanditResultsState STATS_UNAVAILABLE =
      new ExperimentsBanditResultsState("STATS_UNAVAILABLE");
  public static final ExperimentsBanditResultsState ENDED =
      new ExperimentsBanditResultsState("ENDED");

  ExperimentsBanditResultsState(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditResultsStateSerializer
      extends StdSerializer<ExperimentsBanditResultsState> {
    public ExperimentsBanditResultsStateSerializer(Class<ExperimentsBanditResultsState> t) {
      super(t);
    }

    public ExperimentsBanditResultsStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditResultsState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditResultsState fromValue(String value) {
    return new ExperimentsBanditResultsState(value);
  }
}
