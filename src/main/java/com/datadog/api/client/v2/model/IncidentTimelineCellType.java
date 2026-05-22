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

/** The type of a timeline cell. */
@JsonSerialize(using = IncidentTimelineCellType.IncidentTimelineCellTypeSerializer.class)
public class IncidentTimelineCellType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "markdown",
              "incident_status_change",
              "timestamp_change",
              "meeting_summary",
              "meeting_chat",
              "role_assignment_change",
              "postmortem_change"));

  public static final IncidentTimelineCellType MARKDOWN = new IncidentTimelineCellType("markdown");
  public static final IncidentTimelineCellType INCIDENT_STATUS_CHANGE =
      new IncidentTimelineCellType("incident_status_change");
  public static final IncidentTimelineCellType TIMESTAMP_CHANGE =
      new IncidentTimelineCellType("timestamp_change");
  public static final IncidentTimelineCellType MEETING_SUMMARY =
      new IncidentTimelineCellType("meeting_summary");
  public static final IncidentTimelineCellType MEETING_CHAT =
      new IncidentTimelineCellType("meeting_chat");
  public static final IncidentTimelineCellType ROLE_ASSIGNMENT_CHANGE =
      new IncidentTimelineCellType("role_assignment_change");
  public static final IncidentTimelineCellType POSTMORTEM_CHANGE =
      new IncidentTimelineCellType("postmortem_change");

  IncidentTimelineCellType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentTimelineCellTypeSerializer
      extends StdSerializer<IncidentTimelineCellType> {
    public IncidentTimelineCellTypeSerializer(Class<IncidentTimelineCellType> t) {
      super(t);
    }

    public IncidentTimelineCellTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentTimelineCellType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentTimelineCellType fromValue(String value) {
    return new IncidentTimelineCellType(value);
  }
}
