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

/** The source of the anonymous assignee. */
@JsonSerialize(
    using = IncidentTodoAnonymousAssigneeSource.IncidentTodoAnonymousAssigneeSourceSerializer.class)
public class IncidentTodoAnonymousAssigneeSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("slack", "microsoft_teams"));

  public static final IncidentTodoAnonymousAssigneeSource SLACK =
      new IncidentTodoAnonymousAssigneeSource("slack");
  public static final IncidentTodoAnonymousAssigneeSource MICROSOFT_TEAMS =
      new IncidentTodoAnonymousAssigneeSource("microsoft_teams");

  IncidentTodoAnonymousAssigneeSource(String value) {
    super(value, allowedValues);
  }

  public static class IncidentTodoAnonymousAssigneeSourceSerializer
      extends StdSerializer<IncidentTodoAnonymousAssigneeSource> {
    public IncidentTodoAnonymousAssigneeSourceSerializer(
        Class<IncidentTodoAnonymousAssigneeSource> t) {
      super(t);
    }

    public IncidentTodoAnonymousAssigneeSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentTodoAnonymousAssigneeSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentTodoAnonymousAssigneeSource fromValue(String value) {
    return new IncidentTodoAnonymousAssigneeSource(value);
  }
}
