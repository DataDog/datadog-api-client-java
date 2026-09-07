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

/** The policy that triggered this status change. */
@JsonSerialize(using = FlakyTestHistoryPolicyId.FlakyTestHistoryPolicyIdSerializer.class)
public class FlakyTestHistoryPolicyId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "ftm_policy.manual",
              "ftm_policy.fixed",
              "ftm_policy.disable.failure_rate",
              "ftm_policy.disable.branch_flake",
              "ftm_policy.disable.days_active",
              "ftm_policy.quarantine.failure_rate",
              "ftm_policy.quarantine.branch_flake",
              "ftm_policy.quarantine.days_active",
              "unknown"));

  public static final FlakyTestHistoryPolicyId MANUAL =
      new FlakyTestHistoryPolicyId("ftm_policy.manual");
  public static final FlakyTestHistoryPolicyId FIXED =
      new FlakyTestHistoryPolicyId("ftm_policy.fixed");
  public static final FlakyTestHistoryPolicyId DISABLE_FAILURE_RATE =
      new FlakyTestHistoryPolicyId("ftm_policy.disable.failure_rate");
  public static final FlakyTestHistoryPolicyId DISABLE_BRANCH_FLAKE =
      new FlakyTestHistoryPolicyId("ftm_policy.disable.branch_flake");
  public static final FlakyTestHistoryPolicyId DISABLE_DAYS_ACTIVE =
      new FlakyTestHistoryPolicyId("ftm_policy.disable.days_active");
  public static final FlakyTestHistoryPolicyId QUARANTINE_FAILURE_RATE =
      new FlakyTestHistoryPolicyId("ftm_policy.quarantine.failure_rate");
  public static final FlakyTestHistoryPolicyId QUARANTINE_BRANCH_FLAKE =
      new FlakyTestHistoryPolicyId("ftm_policy.quarantine.branch_flake");
  public static final FlakyTestHistoryPolicyId QUARANTINE_DAYS_ACTIVE =
      new FlakyTestHistoryPolicyId("ftm_policy.quarantine.days_active");
  public static final FlakyTestHistoryPolicyId UNKNOWN = new FlakyTestHistoryPolicyId("unknown");

  FlakyTestHistoryPolicyId(String value) {
    super(value, allowedValues);
  }

  public static class FlakyTestHistoryPolicyIdSerializer
      extends StdSerializer<FlakyTestHistoryPolicyId> {
    public FlakyTestHistoryPolicyIdSerializer(Class<FlakyTestHistoryPolicyId> t) {
      super(t);
    }

    public FlakyTestHistoryPolicyIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FlakyTestHistoryPolicyId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlakyTestHistoryPolicyId fromValue(String value) {
    return new FlakyTestHistoryPolicyId(value);
  }
}
