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

/**
 * The type of automated action to perform when the rule triggers. <code>execute_workflow</code>
 * runs a Datadog workflow; <code>assign_agent</code> assigns an AI agent to the case.
 */
@JsonSerialize(using = AutomationRuleActionType.AutomationRuleActionTypeSerializer.class)
public class AutomationRuleActionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("execute_workflow", "assign_agent"));

  public static final AutomationRuleActionType EXECUTE_WORKFLOW =
      new AutomationRuleActionType("execute_workflow");
  public static final AutomationRuleActionType ASSIGN_AGENT =
      new AutomationRuleActionType("assign_agent");

  AutomationRuleActionType(String value) {
    super(value, allowedValues);
  }

  public static class AutomationRuleActionTypeSerializer
      extends StdSerializer<AutomationRuleActionType> {
    public AutomationRuleActionTypeSerializer(Class<AutomationRuleActionType> t) {
      super(t);
    }

    public AutomationRuleActionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AutomationRuleActionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AutomationRuleActionType fromValue(String value) {
    return new AutomationRuleActionType(value);
  }
}
