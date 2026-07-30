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

/** ServiceNow record prompt resource type. */
@JsonSerialize(
    using = IncidentServiceNowRecordPromptType.IncidentServiceNowRecordPromptTypeSerializer.class)
public class IncidentServiceNowRecordPromptType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_servicenow_record_prompt"));

  public static final IncidentServiceNowRecordPromptType INCIDENT_SERVICENOW_RECORD_PROMPT =
      new IncidentServiceNowRecordPromptType("incident_servicenow_record_prompt");

  IncidentServiceNowRecordPromptType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentServiceNowRecordPromptTypeSerializer
      extends StdSerializer<IncidentServiceNowRecordPromptType> {
    public IncidentServiceNowRecordPromptTypeSerializer(
        Class<IncidentServiceNowRecordPromptType> t) {
      super(t);
    }

    public IncidentServiceNowRecordPromptTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentServiceNowRecordPromptType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentServiceNowRecordPromptType fromValue(String value) {
    return new IncidentServiceNowRecordPromptType(value);
  }
}
