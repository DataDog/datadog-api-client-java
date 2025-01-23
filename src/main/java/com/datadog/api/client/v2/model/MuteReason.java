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

/** Reason for muting a vulnerability */
@JsonSerialize(using = MuteReason.MuteReasonSerializer.class)
public class MuteReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "duplicate",
              "external_solution",
              "false_positive",
              "internal_solution",
              "no_fix_available",
              "other",
              "pending_fix",
              "risk_accepted"));

  public static final MuteReason DUPLICATE = new MuteReason("duplicate");
  public static final MuteReason EXTERNAL_SOLUTION = new MuteReason("external_solution");
  public static final MuteReason FALSE_POSITIVE = new MuteReason("false_positive");
  public static final MuteReason INTERNAL_SOLUTION = new MuteReason("internal_solution");
  public static final MuteReason NO_FIX_AVAILABLE = new MuteReason("no_fix_available");
  public static final MuteReason OTHER = new MuteReason("other");
  public static final MuteReason PENDING_FIX = new MuteReason("pending_fix");
  public static final MuteReason RISK_ACCEPTED = new MuteReason("risk_accepted");

  MuteReason(String value) {
    super(value, allowedValues);
  }

  public static class MuteReasonSerializer extends StdSerializer<MuteReason> {
    public MuteReasonSerializer(Class<MuteReason> t) {
      super(t);
    }

    public MuteReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(MuteReason value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MuteReason fromValue(String value) {
    return new MuteReason(value);
  }
}
