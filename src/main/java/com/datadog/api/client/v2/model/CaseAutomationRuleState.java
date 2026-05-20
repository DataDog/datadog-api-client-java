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
 * Whether the automation rule is active. Enabled rules trigger on matching case events; disabled
 * rules are inactive but preserve their configuration.
 */
@JsonSerialize(using = CaseAutomationRuleState.CaseAutomationRuleStateSerializer.class)
public class CaseAutomationRuleState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ENABLED", "DISABLED"));

  public static final CaseAutomationRuleState ENABLED = new CaseAutomationRuleState("ENABLED");
  public static final CaseAutomationRuleState DISABLED = new CaseAutomationRuleState("DISABLED");

  CaseAutomationRuleState(String value) {
    super(value, allowedValues);
  }

  public static class CaseAutomationRuleStateSerializer
      extends StdSerializer<CaseAutomationRuleState> {
    public CaseAutomationRuleStateSerializer(Class<CaseAutomationRuleState> t) {
      super(t);
    }

    public CaseAutomationRuleStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CaseAutomationRuleState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseAutomationRuleState fromValue(String value) {
    return new CaseAutomationRuleState(value);
  }
}
