/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = APMIssueStreamQueryDataSource.APMIssueStreamQueryDataSourceSerializer.class)
public class APMIssueStreamQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("apm_issue_stream"));

  public static final APMIssueStreamQueryDataSource APM_ISSUE_STREAM =
      new APMIssueStreamQueryDataSource("apm_issue_stream");

  APMIssueStreamQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class APMIssueStreamQueryDataSourceSerializer
      extends StdSerializer<APMIssueStreamQueryDataSource> {
    public APMIssueStreamQueryDataSourceSerializer(Class<APMIssueStreamQueryDataSource> t) {
      super(t);
    }

    public APMIssueStreamQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        APMIssueStreamQueryDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static APMIssueStreamQueryDataSource fromValue(String value) {
    return new APMIssueStreamQueryDataSource(value);
  }
}
