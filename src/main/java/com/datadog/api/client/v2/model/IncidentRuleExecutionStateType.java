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

/** Incident rule execution state resource type. */
@JsonSerialize(
    using = IncidentRuleExecutionStateType.IncidentRuleExecutionStateTypeSerializer.class)
public class IncidentRuleExecutionStateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_rule_execution_states"));

  public static final IncidentRuleExecutionStateType INCIDENT_RULE_EXECUTION_STATES =
      new IncidentRuleExecutionStateType("incident_rule_execution_states");

  IncidentRuleExecutionStateType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentRuleExecutionStateTypeSerializer
      extends StdSerializer<IncidentRuleExecutionStateType> {
    public IncidentRuleExecutionStateTypeSerializer(Class<IncidentRuleExecutionStateType> t) {
      super(t);
    }

    public IncidentRuleExecutionStateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentRuleExecutionStateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentRuleExecutionStateType fromValue(String value) {
    return new IncidentRuleExecutionStateType(value);
  }
}
