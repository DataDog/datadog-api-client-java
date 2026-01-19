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

/** Type identifier for Jira issue template resources */
@JsonSerialize(using = JiraIssueTemplateType.JiraIssueTemplateTypeSerializer.class)
public class JiraIssueTemplateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("jira-issue-template"));

  public static final JiraIssueTemplateType JIRA_ISSUE_TEMPLATE =
      new JiraIssueTemplateType("jira-issue-template");

  JiraIssueTemplateType(String value) {
    super(value, allowedValues);
  }

  public static class JiraIssueTemplateTypeSerializer extends StdSerializer<JiraIssueTemplateType> {
    public JiraIssueTemplateTypeSerializer(Class<JiraIssueTemplateType> t) {
      super(t);
    }

    public JiraIssueTemplateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        JiraIssueTemplateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JiraIssueTemplateType fromValue(String value) {
    return new JiraIssueTemplateType(value);
  }
}
