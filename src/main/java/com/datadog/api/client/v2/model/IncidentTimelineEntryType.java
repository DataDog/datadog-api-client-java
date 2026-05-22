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

/** Incident timeline entry resource type. */
@JsonSerialize(using = IncidentTimelineEntryType.IncidentTimelineEntryTypeSerializer.class)
public class IncidentTimelineEntryType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_timeline_cells"));

  public static final IncidentTimelineEntryType INCIDENT_TIMELINE_CELLS =
      new IncidentTimelineEntryType("incident_timeline_cells");

  IncidentTimelineEntryType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentTimelineEntryTypeSerializer
      extends StdSerializer<IncidentTimelineEntryType> {
    public IncidentTimelineEntryTypeSerializer(Class<IncidentTimelineEntryType> t) {
      super(t);
    }

    public IncidentTimelineEntryTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentTimelineEntryType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentTimelineEntryType fromValue(String value) {
    return new IncidentTimelineEntryType(value);
  }
}
