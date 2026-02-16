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
 * JSON:API type for commit coverage summary request. The value must always be <code>
 * ci_app_coverage_commit_summary_request</code>.
 */
@JsonSerialize(
    using = CommitCoverageSummaryRequestType.CommitCoverageSummaryRequestTypeSerializer.class)
public class CommitCoverageSummaryRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ci_app_coverage_commit_summary_request"));

  public static final CommitCoverageSummaryRequestType CI_APP_COVERAGE_COMMIT_SUMMARY_REQUEST =
      new CommitCoverageSummaryRequestType("ci_app_coverage_commit_summary_request");

  CommitCoverageSummaryRequestType(String value) {
    super(value, allowedValues);
  }

  public static class CommitCoverageSummaryRequestTypeSerializer
      extends StdSerializer<CommitCoverageSummaryRequestType> {
    public CommitCoverageSummaryRequestTypeSerializer(Class<CommitCoverageSummaryRequestType> t) {
      super(t);
    }

    public CommitCoverageSummaryRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitCoverageSummaryRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CommitCoverageSummaryRequestType fromValue(String value) {
    return new CommitCoverageSummaryRequestType(value);
  }
}
