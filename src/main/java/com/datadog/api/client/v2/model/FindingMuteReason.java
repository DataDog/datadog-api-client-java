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

/** The reason why this finding is muted or unmuted. */
@JsonSerialize(using = FindingMuteReason.FindingMuteReasonSerializer.class)
public class FindingMuteReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "PENDING_FIX",
              "FALSE_POSITIVE",
              "ACCEPTED_RISK",
              "NO_PENDING_FIX",
              "HUMAN_ERROR",
              "NO_LONGER_ACCEPTED_RISK",
              "OTHER"));

  public static final FindingMuteReason PENDING_FIX = new FindingMuteReason("PENDING_FIX");
  public static final FindingMuteReason FALSE_POSITIVE = new FindingMuteReason("FALSE_POSITIVE");
  public static final FindingMuteReason ACCEPTED_RISK = new FindingMuteReason("ACCEPTED_RISK");
  public static final FindingMuteReason NO_PENDING_FIX = new FindingMuteReason("NO_PENDING_FIX");
  public static final FindingMuteReason HUMAN_ERROR = new FindingMuteReason("HUMAN_ERROR");
  public static final FindingMuteReason NO_LONGER_ACCEPTED_RISK =
      new FindingMuteReason("NO_LONGER_ACCEPTED_RISK");
  public static final FindingMuteReason OTHER = new FindingMuteReason("OTHER");

  FindingMuteReason(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static FindingMuteReason fromValue(String value) {
    return new FindingMuteReason(value);
  }
}
