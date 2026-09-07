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

/** Jira issues resource type. */
@JsonSerialize(using = JiraIssuesDataType.JiraIssuesDataTypeSerializer.class)
public class JiraIssuesDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("jira_issues"));

  public static final JiraIssuesDataType JIRA_ISSUES = new JiraIssuesDataType("jira_issues");

  JiraIssuesDataType(String value) {
    super(value, allowedValues);
  }

  public static class JiraIssuesDataTypeSerializer extends StdSerializer<JiraIssuesDataType> {
    public JiraIssuesDataTypeSerializer(Class<JiraIssuesDataType> t) {
      super(t);
    }

    public JiraIssuesDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(JiraIssuesDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JiraIssuesDataType fromValue(String value) {
    return new JiraIssuesDataType(value);
  }
}
