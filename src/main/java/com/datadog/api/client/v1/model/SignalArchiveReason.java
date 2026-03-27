/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Reason why a signal has been archived. */
@JsonSerialize(using = SignalArchiveReason.SignalArchiveReasonSerializer.class)
public class SignalArchiveReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "none",
              "false_positive",
              "testing_or_maintenance",
              "investigated_case_opened",
              "true_positive_benign",
              "true_positive_malicious",
              "other"));

  public static final SignalArchiveReason NONE = new SignalArchiveReason("none");
  public static final SignalArchiveReason FALSE_POSITIVE =
      new SignalArchiveReason("false_positive");
  public static final SignalArchiveReason TESTING_OR_MAINTENANCE =
      new SignalArchiveReason("testing_or_maintenance");
  public static final SignalArchiveReason INVESTIGATED_CASE_OPENED =
      new SignalArchiveReason("investigated_case_opened");
  public static final SignalArchiveReason TRUE_POSITIVE_BENIGN =
      new SignalArchiveReason("true_positive_benign");
  public static final SignalArchiveReason TRUE_POSITIVE_MALICIOUS =
      new SignalArchiveReason("true_positive_malicious");
  public static final SignalArchiveReason OTHER = new SignalArchiveReason("other");

  SignalArchiveReason(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static SignalArchiveReason fromValue(String value) {
    return new SignalArchiveReason(value);
  }
}
