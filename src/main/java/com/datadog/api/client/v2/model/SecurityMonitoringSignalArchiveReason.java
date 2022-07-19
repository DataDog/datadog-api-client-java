/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Reason a signal is archived. */
@JsonSerialize(
    using =
        SecurityMonitoringSignalArchiveReason.SecurityMonitoringSignalArchiveReasonSerializer.class)
public class SecurityMonitoringSignalArchiveReason {

  public static final SecurityMonitoringSignalArchiveReason NONE =
      new SecurityMonitoringSignalArchiveReason("none");
  public static final SecurityMonitoringSignalArchiveReason FALSE_POSITIVE =
      new SecurityMonitoringSignalArchiveReason("false_positive");
  public static final SecurityMonitoringSignalArchiveReason TESTING_OR_MAINTENANCE =
      new SecurityMonitoringSignalArchiveReason("testing_or_maintenance");
  public static final SecurityMonitoringSignalArchiveReason OTHER =
      new SecurityMonitoringSignalArchiveReason("other");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("none", "false_positive", "testing_or_maintenance", "other"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SecurityMonitoringSignalArchiveReason(String value) {
    this.value = value;
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

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SecurityMonitoringSignalArchiveReason object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SecurityMonitoringSignalArchiveReason) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SecurityMonitoringSignalArchiveReason fromValue(String value) {
    return new SecurityMonitoringSignalArchiveReason(value);
  }
}
