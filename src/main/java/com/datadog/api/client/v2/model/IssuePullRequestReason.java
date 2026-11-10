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
 * Why the pull request is linked to the issue. <code>fix</code> means the pull request fixes the
 * issue, and <code>trigger</code> means the pull request introduced the issue.
 */
@JsonSerialize(using = IssuePullRequestReason.IssuePullRequestReasonSerializer.class)
public class IssuePullRequestReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("unknown", "fix", "trigger"));

  public static final IssuePullRequestReason UNKNOWN = new IssuePullRequestReason("unknown");
  public static final IssuePullRequestReason FIX = new IssuePullRequestReason("fix");
  public static final IssuePullRequestReason TRIGGER = new IssuePullRequestReason("trigger");

  IssuePullRequestReason(String value) {
    super(value, allowedValues);
  }

  public static class IssuePullRequestReasonSerializer
      extends StdSerializer<IssuePullRequestReason> {
    public IssuePullRequestReasonSerializer(Class<IssuePullRequestReason> t) {
      super(t);
    }

    public IssuePullRequestReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssuePullRequestReason value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssuePullRequestReason fromValue(String value) {
    return new IssuePullRequestReason(value);
  }
}
