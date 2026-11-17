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
 * Recorded reason this analysis has no EVSI estimate. Omitted when unrecorded; absence does not
 * establish availability for historical or imported results. Controls and non-Bayesian analyses
 * omit this field.
 */
@JsonSerialize(
    using = ExperimentsEVSIUnavailableReason.ExperimentsEVSIUnavailableReasonSerializer.class)
public class ExperimentsEVSIUnavailableReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "traffic_unavailable",
              "insufficient_complete_days",
              "no_total_exposures",
              "no_lookback_exposures",
              "invalid_traffic",
              "invalid_standard_error",
              "computation_failed",
              "analysis_unavailable"));

  public static final ExperimentsEVSIUnavailableReason TRAFFIC_UNAVAILABLE =
      new ExperimentsEVSIUnavailableReason("traffic_unavailable");
  public static final ExperimentsEVSIUnavailableReason INSUFFICIENT_COMPLETE_DAYS =
      new ExperimentsEVSIUnavailableReason("insufficient_complete_days");
  public static final ExperimentsEVSIUnavailableReason NO_TOTAL_EXPOSURES =
      new ExperimentsEVSIUnavailableReason("no_total_exposures");
  public static final ExperimentsEVSIUnavailableReason NO_LOOKBACK_EXPOSURES =
      new ExperimentsEVSIUnavailableReason("no_lookback_exposures");
  public static final ExperimentsEVSIUnavailableReason INVALID_TRAFFIC =
      new ExperimentsEVSIUnavailableReason("invalid_traffic");
  public static final ExperimentsEVSIUnavailableReason INVALID_STANDARD_ERROR =
      new ExperimentsEVSIUnavailableReason("invalid_standard_error");
  public static final ExperimentsEVSIUnavailableReason COMPUTATION_FAILED =
      new ExperimentsEVSIUnavailableReason("computation_failed");
  public static final ExperimentsEVSIUnavailableReason ANALYSIS_UNAVAILABLE =
      new ExperimentsEVSIUnavailableReason("analysis_unavailable");

  ExperimentsEVSIUnavailableReason(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsEVSIUnavailableReasonSerializer
      extends StdSerializer<ExperimentsEVSIUnavailableReason> {
    public ExperimentsEVSIUnavailableReasonSerializer(Class<ExperimentsEVSIUnavailableReason> t) {
      super(t);
    }

    public ExperimentsEVSIUnavailableReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsEVSIUnavailableReason value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsEVSIUnavailableReason fromValue(String value) {
    return new ExperimentsEVSIUnavailableReason(value);
  }
}
