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

/** Pull request status for a linked code session. */
@JsonSerialize(using = RemediationPullRequestStatus.RemediationPullRequestStatusSerializer.class)
public class RemediationPullRequestStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("open", "closed", "merged"));

  public static final RemediationPullRequestStatus OPEN = new RemediationPullRequestStatus("open");
  public static final RemediationPullRequestStatus CLOSED =
      new RemediationPullRequestStatus("closed");
  public static final RemediationPullRequestStatus MERGED =
      new RemediationPullRequestStatus("merged");

  RemediationPullRequestStatus(String value) {
    super(value, allowedValues);
  }

  public static class RemediationPullRequestStatusSerializer
      extends StdSerializer<RemediationPullRequestStatus> {
    public RemediationPullRequestStatusSerializer(Class<RemediationPullRequestStatus> t) {
      super(t);
    }

    public RemediationPullRequestStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationPullRequestStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationPullRequestStatus fromValue(String value) {
    return new RemediationPullRequestStatus(value);
  }
}
