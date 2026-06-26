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
 * The new state to set for the detection. Set to <code>exception</code> to acknowledge the
 * detection and exclude it from active counts, or <code>active</code> to reopen it.
 */
@JsonSerialize(
    using =
        GovernanceControlDetectionUpdateState.GovernanceControlDetectionUpdateStateSerializer.class)
public class GovernanceControlDetectionUpdateState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("exception", "active"));

  public static final GovernanceControlDetectionUpdateState EXCEPTION =
      new GovernanceControlDetectionUpdateState("exception");
  public static final GovernanceControlDetectionUpdateState ACTIVE =
      new GovernanceControlDetectionUpdateState("active");

  GovernanceControlDetectionUpdateState(String value) {
    super(value, allowedValues);
  }

  public static class GovernanceControlDetectionUpdateStateSerializer
      extends StdSerializer<GovernanceControlDetectionUpdateState> {
    public GovernanceControlDetectionUpdateStateSerializer(
        Class<GovernanceControlDetectionUpdateState> t) {
      super(t);
    }

    public GovernanceControlDetectionUpdateStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GovernanceControlDetectionUpdateState value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GovernanceControlDetectionUpdateState fromValue(String value) {
    return new GovernanceControlDetectionUpdateState(value);
  }
}
