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

/** Source from which to query items to display in the stream. */
@JsonSerialize(using = ListStreamSource.ListStreamSourceSerializer.class)
public class ListStreamSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "logs_stream",
              "audit_stream",
              "ci_pipeline_stream",
              "ci_test_stream",
              "rum_issue_stream",
              "apm_issue_stream",
              "trace_stream",
              "logs_issue_stream",
              "logs_pattern_stream",
              "logs_transaction_stream",
              "event_stream",
              "rum_stream",
              "llm_observability_stream"));

  public static final ListStreamSource LOGS_STREAM = new ListStreamSource("logs_stream");
  public static final ListStreamSource AUDIT_STREAM = new ListStreamSource("audit_stream");
  public static final ListStreamSource CI_PIPELINE_STREAM =
      new ListStreamSource("ci_pipeline_stream");
  public static final ListStreamSource CI_TEST_STREAM = new ListStreamSource("ci_test_stream");
  public static final ListStreamSource RUM_ISSUE_STREAM = new ListStreamSource("rum_issue_stream");
  public static final ListStreamSource APM_ISSUE_STREAM = new ListStreamSource("apm_issue_stream");
  public static final ListStreamSource TRACE_STREAM = new ListStreamSource("trace_stream");
  public static final ListStreamSource LOGS_ISSUE_STREAM =
      new ListStreamSource("logs_issue_stream");
  public static final ListStreamSource LOGS_PATTERN_STREAM =
      new ListStreamSource("logs_pattern_stream");
  public static final ListStreamSource LOGS_TRANSACTION_STREAM =
      new ListStreamSource("logs_transaction_stream");
  public static final ListStreamSource EVENT_STREAM = new ListStreamSource("event_stream");
  public static final ListStreamSource RUM_STREAM = new ListStreamSource("rum_stream");
  public static final ListStreamSource LLM_OBSERVABILITY_STREAM =
      new ListStreamSource("llm_observability_stream");

  ListStreamSource(String value) {
    super(value, allowedValues);
  }

  public static class ListStreamSourceSerializer extends StdSerializer<ListStreamSource> {
    public ListStreamSourceSerializer(Class<ListStreamSource> t) {
      super(t);
    }

    public ListStreamSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(ListStreamSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListStreamSource fromValue(String value) {
    return new ListStreamSource(value);
  }
}
