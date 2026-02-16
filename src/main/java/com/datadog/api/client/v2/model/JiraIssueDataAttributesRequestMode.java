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

/** Mode for creating the Jira issue. Can be "single" or "multiple". */
@JsonSerialize(
    using = JiraIssueDataAttributesRequestMode.JiraIssueDataAttributesRequestModeSerializer.class)
public class JiraIssueDataAttributesRequestMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("single", "multiple"));

  public static final JiraIssueDataAttributesRequestMode SINGLE =
      new JiraIssueDataAttributesRequestMode("single");
  public static final JiraIssueDataAttributesRequestMode MULTIPLE =
      new JiraIssueDataAttributesRequestMode("multiple");

  JiraIssueDataAttributesRequestMode(String value) {
    super(value, allowedValues);
  }

  public static class JiraIssueDataAttributesRequestModeSerializer
      extends StdSerializer<JiraIssueDataAttributesRequestMode> {
    public JiraIssueDataAttributesRequestModeSerializer(
        Class<JiraIssueDataAttributesRequestMode> t) {
      super(t);
    }

    public JiraIssueDataAttributesRequestModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        JiraIssueDataAttributesRequestMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JiraIssueDataAttributesRequestMode fromValue(String value) {
    return new JiraIssueDataAttributesRequestMode(value);
  }
}
