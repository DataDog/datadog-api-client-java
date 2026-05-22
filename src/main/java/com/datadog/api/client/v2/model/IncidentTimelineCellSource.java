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

/** The source of a timeline cell. */
@JsonSerialize(using = IncidentTimelineCellSource.IncidentTimelineCellSourceSerializer.class)
public class IncidentTimelineCellSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("slack", "microsoft_teams", "datadog", "api"));

  public static final IncidentTimelineCellSource SLACK = new IncidentTimelineCellSource("slack");
  public static final IncidentTimelineCellSource MICROSOFT_TEAMS =
      new IncidentTimelineCellSource("microsoft_teams");
  public static final IncidentTimelineCellSource DATADOG =
      new IncidentTimelineCellSource("datadog");
  public static final IncidentTimelineCellSource API = new IncidentTimelineCellSource("api");

  IncidentTimelineCellSource(String value) {
    super(value, allowedValues);
  }

  public static class IncidentTimelineCellSourceSerializer
      extends StdSerializer<IncidentTimelineCellSource> {
    public IncidentTimelineCellSourceSerializer(Class<IncidentTimelineCellSource> t) {
      super(t);
    }

    public IncidentTimelineCellSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentTimelineCellSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentTimelineCellSource fromValue(String value) {
    return new IncidentTimelineCellSource(value);
  }
}
