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
 * How the detection's current assignment was determined. Possible values are <code>auto_resolved
 * </code>, <code>manual</code>, <code>reassigned</code>, and <code>cleared</code>.
 */
@JsonSerialize(
    using =
        GovernanceControlDetectionAssignmentSource
            .GovernanceControlDetectionAssignmentSourceSerializer.class)
public class GovernanceControlDetectionAssignmentSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto_resolved", "manual", "reassigned", "cleared"));

  public static final GovernanceControlDetectionAssignmentSource AUTO_RESOLVED =
      new GovernanceControlDetectionAssignmentSource("auto_resolved");
  public static final GovernanceControlDetectionAssignmentSource MANUAL =
      new GovernanceControlDetectionAssignmentSource("manual");
  public static final GovernanceControlDetectionAssignmentSource REASSIGNED =
      new GovernanceControlDetectionAssignmentSource("reassigned");
  public static final GovernanceControlDetectionAssignmentSource CLEARED =
      new GovernanceControlDetectionAssignmentSource("cleared");

  GovernanceControlDetectionAssignmentSource(String value) {
    super(value, allowedValues);
  }

  public static class GovernanceControlDetectionAssignmentSourceSerializer
      extends StdSerializer<GovernanceControlDetectionAssignmentSource> {
    public GovernanceControlDetectionAssignmentSourceSerializer(
        Class<GovernanceControlDetectionAssignmentSource> t) {
      super(t);
    }

    public GovernanceControlDetectionAssignmentSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GovernanceControlDetectionAssignmentSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GovernanceControlDetectionAssignmentSource fromValue(String value) {
    return new GovernanceControlDetectionAssignmentSource(value);
  }
}
