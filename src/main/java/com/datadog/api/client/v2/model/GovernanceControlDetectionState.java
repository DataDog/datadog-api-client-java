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
 * The current state of the detection. Possible values are <code>active</code>, <code>exception
 * </code>, <code>mitigated</code>, <code>inactive</code>, <code>obsolete</code>, <code>
 * resolved_externally</code>, and <code>mitigation_in_progress</code>.
 */
@JsonSerialize(
    using = GovernanceControlDetectionState.GovernanceControlDetectionStateSerializer.class)
public class GovernanceControlDetectionState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "active",
              "exception",
              "mitigated",
              "inactive",
              "obsolete",
              "resolved_externally",
              "mitigation_in_progress"));

  public static final GovernanceControlDetectionState ACTIVE =
      new GovernanceControlDetectionState("active");
  public static final GovernanceControlDetectionState EXCEPTION =
      new GovernanceControlDetectionState("exception");
  public static final GovernanceControlDetectionState MITIGATED =
      new GovernanceControlDetectionState("mitigated");
  public static final GovernanceControlDetectionState INACTIVE =
      new GovernanceControlDetectionState("inactive");
  public static final GovernanceControlDetectionState OBSOLETE =
      new GovernanceControlDetectionState("obsolete");
  public static final GovernanceControlDetectionState RESOLVED_EXTERNALLY =
      new GovernanceControlDetectionState("resolved_externally");
  public static final GovernanceControlDetectionState MITIGATION_IN_PROGRESS =
      new GovernanceControlDetectionState("mitigation_in_progress");

  GovernanceControlDetectionState(String value) {
    super(value, allowedValues);
  }

  public static class GovernanceControlDetectionStateSerializer
      extends StdSerializer<GovernanceControlDetectionState> {
    public GovernanceControlDetectionStateSerializer(Class<GovernanceControlDetectionState> t) {
      super(t);
    }

    public GovernanceControlDetectionStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GovernanceControlDetectionState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GovernanceControlDetectionState fromValue(String value) {
    return new GovernanceControlDetectionState(value);
  }
}
