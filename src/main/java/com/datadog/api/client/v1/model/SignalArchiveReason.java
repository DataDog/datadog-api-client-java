/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Reason why a signal has been archived. */
@JsonSerialize(using = SignalArchiveReason.SignalArchiveReasonSerializer.class)
public class SignalArchiveReason {

  public static final SignalArchiveReason NONE = new SignalArchiveReason("none");
  public static final SignalArchiveReason FALSE_POSITIVE =
      new SignalArchiveReason("false_positive");
  public static final SignalArchiveReason TESTING_OR_MAINTENANCE =
      new SignalArchiveReason("testing_or_maintenance");
  public static final SignalArchiveReason INVESTIGATED_CASE_OPENED =
      new SignalArchiveReason("investigated_case_opened");
  public static final SignalArchiveReason OTHER = new SignalArchiveReason("other");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "none",
              "false_positive",
              "testing_or_maintenance",
              "investigated_case_opened",
              "other"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SignalArchiveReason(String value) {
    this.value = value;
  }

  public static class SignalArchiveReasonSerializer extends StdSerializer<SignalArchiveReason> {
    public SignalArchiveReasonSerializer(Class<SignalArchiveReason> t) {
      super(t);
    }

    public SignalArchiveReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SignalArchiveReason value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this SignalArchiveReason object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SignalArchiveReason) o).value);
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
  public static SignalArchiveReason fromValue(String value) {
    return new SignalArchiveReason(value);
  }
}
