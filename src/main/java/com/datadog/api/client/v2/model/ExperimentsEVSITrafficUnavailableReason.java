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
 * Recorded traffic forecast unavailability reason. Per-analysis reasons are reported separately.
 */
@JsonSerialize(
    using =
        ExperimentsEVSITrafficUnavailableReason.ExperimentsEVSITrafficUnavailableReasonSerializer
            .class)
public class ExperimentsEVSITrafficUnavailableReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "traffic_unavailable",
              "insufficient_complete_days",
              "no_total_exposures",
              "no_lookback_exposures",
              "invalid_traffic"));

  public static final ExperimentsEVSITrafficUnavailableReason TRAFFIC_UNAVAILABLE =
      new ExperimentsEVSITrafficUnavailableReason("traffic_unavailable");
  public static final ExperimentsEVSITrafficUnavailableReason INSUFFICIENT_COMPLETE_DAYS =
      new ExperimentsEVSITrafficUnavailableReason("insufficient_complete_days");
  public static final ExperimentsEVSITrafficUnavailableReason NO_TOTAL_EXPOSURES =
      new ExperimentsEVSITrafficUnavailableReason("no_total_exposures");
  public static final ExperimentsEVSITrafficUnavailableReason NO_LOOKBACK_EXPOSURES =
      new ExperimentsEVSITrafficUnavailableReason("no_lookback_exposures");
  public static final ExperimentsEVSITrafficUnavailableReason INVALID_TRAFFIC =
      new ExperimentsEVSITrafficUnavailableReason("invalid_traffic");

  ExperimentsEVSITrafficUnavailableReason(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsEVSITrafficUnavailableReasonSerializer
      extends StdSerializer<ExperimentsEVSITrafficUnavailableReason> {
    public ExperimentsEVSITrafficUnavailableReasonSerializer(
        Class<ExperimentsEVSITrafficUnavailableReason> t) {
      super(t);
    }

    public ExperimentsEVSITrafficUnavailableReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsEVSITrafficUnavailableReason value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsEVSITrafficUnavailableReason fromValue(String value) {
    return new ExperimentsEVSITrafficUnavailableReason(value);
  }
}
