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

/** The reason why this finding is muted. */
@JsonSerialize(using = FindingMuteReason.FindingMuteReasonSerializer.class)
public class FindingMuteReason {

  public static final FindingMuteReason ACCEPTED_RISK = new FindingMuteReason("ACCEPTED_RISK");
  public static final FindingMuteReason PENDING_FIX = new FindingMuteReason("PENDING_FIX");
  public static final FindingMuteReason FALSE_POSITIVE = new FindingMuteReason("FALSE_POSITIVE");
  public static final FindingMuteReason OTHER = new FindingMuteReason("OTHER");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ACCEPTED_RISK", "PENDING_FIX", "FALSE_POSITIVE", "OTHER"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  FindingMuteReason(String value) {
    this.value = value;
  }

  public static class FindingMuteReasonSerializer extends StdSerializer<FindingMuteReason> {
    public FindingMuteReasonSerializer(Class<FindingMuteReason> t) {
      super(t);
    }

    public FindingMuteReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(FindingMuteReason value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this FindingMuteReason object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((FindingMuteReason) o).value);
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
  public static FindingMuteReason fromValue(String value) {
    return new FindingMuteReason(value);
  }
}
