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

/** The task ID for an incident rule. */
@JsonSerialize(using = IncidentRuleTaskIDType.IncidentRuleTaskIDTypeSerializer.class)
public class IncidentRuleTaskIDType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "jira-create-issue-job",
              "notify-incident-handles-job",
              "servicenow-create-incident-job",
              "slack-create-channel-job",
              "zoom-create-meeting-job",
              "google-meet-create-meeting-job",
              "workflow-automation-job",
              "ms-teams-create-meeting-job",
              "google-chat-create-space-job",
              "zoom-suppress-summarization-job",
              "ms-teams-suppress-summarization-job",
              "google-meet-suppress-summarization-job"));

  public static final IncidentRuleTaskIDType JIRA_CREATE_ISSUE_JOB =
      new IncidentRuleTaskIDType("jira-create-issue-job");
  public static final IncidentRuleTaskIDType NOTIFY_INCIDENT_HANDLES_JOB =
      new IncidentRuleTaskIDType("notify-incident-handles-job");
  public static final IncidentRuleTaskIDType SERVICENOW_CREATE_INCIDENT_JOB =
      new IncidentRuleTaskIDType("servicenow-create-incident-job");
  public static final IncidentRuleTaskIDType SLACK_CREATE_CHANNEL_JOB =
      new IncidentRuleTaskIDType("slack-create-channel-job");
  public static final IncidentRuleTaskIDType ZOOM_CREATE_MEETING_JOB =
      new IncidentRuleTaskIDType("zoom-create-meeting-job");
  public static final IncidentRuleTaskIDType GOOGLE_MEET_CREATE_MEETING_JOB =
      new IncidentRuleTaskIDType("google-meet-create-meeting-job");
  public static final IncidentRuleTaskIDType WORKFLOW_AUTOMATION_JOB =
      new IncidentRuleTaskIDType("workflow-automation-job");
  public static final IncidentRuleTaskIDType MS_TEAMS_CREATE_MEETING_JOB =
      new IncidentRuleTaskIDType("ms-teams-create-meeting-job");
  public static final IncidentRuleTaskIDType GOOGLE_CHAT_CREATE_SPACE_JOB =
      new IncidentRuleTaskIDType("google-chat-create-space-job");
  public static final IncidentRuleTaskIDType ZOOM_SUPPRESS_SUMMARIZATION_JOB =
      new IncidentRuleTaskIDType("zoom-suppress-summarization-job");
  public static final IncidentRuleTaskIDType MS_TEAMS_SUPPRESS_SUMMARIZATION_JOB =
      new IncidentRuleTaskIDType("ms-teams-suppress-summarization-job");
  public static final IncidentRuleTaskIDType GOOGLE_MEET_SUPPRESS_SUMMARIZATION_JOB =
      new IncidentRuleTaskIDType("google-meet-suppress-summarization-job");

  IncidentRuleTaskIDType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentRuleTaskIDTypeSerializer
      extends StdSerializer<IncidentRuleTaskIDType> {
    public IncidentRuleTaskIDTypeSerializer(Class<IncidentRuleTaskIDType> t) {
      super(t);
    }

    public IncidentRuleTaskIDTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentRuleTaskIDType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentRuleTaskIDType fromValue(String value) {
    return new IncidentRuleTaskIDType(value);
  }
}
