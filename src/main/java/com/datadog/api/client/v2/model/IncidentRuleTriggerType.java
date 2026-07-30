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

/** The trigger event for an incident rule. */
@JsonSerialize(using = IncidentRuleTriggerType.IncidentRuleTriggerTypeSerializer.class)
public class IncidentRuleTriggerType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "incident_saved_trigger", "incident_created_trigger", "incident_modified_trigger"));

  public static final IncidentRuleTriggerType INCIDENT_SAVED_TRIGGER =
      new IncidentRuleTriggerType("incident_saved_trigger");
  public static final IncidentRuleTriggerType INCIDENT_CREATED_TRIGGER =
      new IncidentRuleTriggerType("incident_created_trigger");
  public static final IncidentRuleTriggerType INCIDENT_MODIFIED_TRIGGER =
      new IncidentRuleTriggerType("incident_modified_trigger");

  IncidentRuleTriggerType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentRuleTriggerTypeSerializer
      extends StdSerializer<IncidentRuleTriggerType> {
    public IncidentRuleTriggerTypeSerializer(Class<IncidentRuleTriggerType> t) {
      super(t);
    }

    public IncidentRuleTriggerTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentRuleTriggerType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentRuleTriggerType fromValue(String value) {
    return new IncidentRuleTriggerType(value);
  }
}
