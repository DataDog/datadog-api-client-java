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

/** The reason why the findings are muted or unmuted. */
@JsonSerialize(using = MuteFindingsReason.MuteFindingsReasonSerializer.class)
public class MuteFindingsReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "PENDING_FIX",
              "FALSE_POSITIVE",
              "OTHER",
              "NO_FIX",
              "DUPLICATE",
              "RISK_ACCEPTED",
              "NO_PENDING_FIX",
              "HUMAN_ERROR",
              "NO_LONGER_ACCEPTED_RISK"));

  public static final MuteFindingsReason PENDING_FIX = new MuteFindingsReason("PENDING_FIX");
  public static final MuteFindingsReason FALSE_POSITIVE = new MuteFindingsReason("FALSE_POSITIVE");
  public static final MuteFindingsReason OTHER = new MuteFindingsReason("OTHER");
  public static final MuteFindingsReason NO_FIX = new MuteFindingsReason("NO_FIX");
  public static final MuteFindingsReason DUPLICATE = new MuteFindingsReason("DUPLICATE");
  public static final MuteFindingsReason RISK_ACCEPTED = new MuteFindingsReason("RISK_ACCEPTED");
  public static final MuteFindingsReason NO_PENDING_FIX = new MuteFindingsReason("NO_PENDING_FIX");
  public static final MuteFindingsReason HUMAN_ERROR = new MuteFindingsReason("HUMAN_ERROR");
  public static final MuteFindingsReason NO_LONGER_ACCEPTED_RISK =
      new MuteFindingsReason("NO_LONGER_ACCEPTED_RISK");

  MuteFindingsReason(String value) {
    super(value, allowedValues);
  }

  public static class MuteFindingsReasonSerializer extends StdSerializer<MuteFindingsReason> {
    public MuteFindingsReasonSerializer(Class<MuteFindingsReason> t) {
      super(t);
    }

    public MuteFindingsReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(MuteFindingsReason value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MuteFindingsReason fromValue(String value) {
    return new MuteFindingsReason(value);
  }
}
