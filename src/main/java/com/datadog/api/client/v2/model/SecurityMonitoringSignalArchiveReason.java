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

/** Reason a signal is archived. */
@JsonSerialize(
    using =
        SecurityMonitoringSignalArchiveReason.SecurityMonitoringSignalArchiveReasonSerializer.class)
public class SecurityMonitoringSignalArchiveReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "none",
              "false_positive",
              "testing_or_maintenance",
              "investigated_case_opened",
              "other"));

  public static final SecurityMonitoringSignalArchiveReason NONE =
      new SecurityMonitoringSignalArchiveReason("none");
  public static final SecurityMonitoringSignalArchiveReason FALSE_POSITIVE =
      new SecurityMonitoringSignalArchiveReason("false_positive");
  public static final SecurityMonitoringSignalArchiveReason TESTING_OR_MAINTENANCE =
      new SecurityMonitoringSignalArchiveReason("testing_or_maintenance");
  public static final SecurityMonitoringSignalArchiveReason INVESTIGATED_CASE_OPENED =
      new SecurityMonitoringSignalArchiveReason("investigated_case_opened");
  public static final SecurityMonitoringSignalArchiveReason OTHER =
      new SecurityMonitoringSignalArchiveReason("other");

  SecurityMonitoringSignalArchiveReason(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSignalArchiveReasonSerializer
      extends StdSerializer<SecurityMonitoringSignalArchiveReason> {
    public SecurityMonitoringSignalArchiveReasonSerializer(
        Class<SecurityMonitoringSignalArchiveReason> t) {
      super(t);
    }

    public SecurityMonitoringSignalArchiveReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalArchiveReason value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalArchiveReason fromValue(String value) {
    return new SecurityMonitoringSignalArchiveReason(value);
  }
}
