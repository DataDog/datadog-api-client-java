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

/** Why the arm's estimate and interval are unavailable. Absent when they are available. */
@JsonSerialize(
    using =
        ExperimentsBanditPosteriorUnavailableReason
            .ExperimentsBanditPosteriorUnavailableReasonSerializer.class)
public class ExperimentsBanditPosteriorUnavailableReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("no_data", "insufficient_data", "zero_variance"));

  public static final ExperimentsBanditPosteriorUnavailableReason NO_DATA =
      new ExperimentsBanditPosteriorUnavailableReason("no_data");
  public static final ExperimentsBanditPosteriorUnavailableReason INSUFFICIENT_DATA =
      new ExperimentsBanditPosteriorUnavailableReason("insufficient_data");
  public static final ExperimentsBanditPosteriorUnavailableReason ZERO_VARIANCE =
      new ExperimentsBanditPosteriorUnavailableReason("zero_variance");

  ExperimentsBanditPosteriorUnavailableReason(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditPosteriorUnavailableReasonSerializer
      extends StdSerializer<ExperimentsBanditPosteriorUnavailableReason> {
    public ExperimentsBanditPosteriorUnavailableReasonSerializer(
        Class<ExperimentsBanditPosteriorUnavailableReason> t) {
      super(t);
    }

    public ExperimentsBanditPosteriorUnavailableReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditPosteriorUnavailableReason value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditPosteriorUnavailableReason fromValue(String value) {
    return new ExperimentsBanditPosteriorUnavailableReason(value);
  }
}
