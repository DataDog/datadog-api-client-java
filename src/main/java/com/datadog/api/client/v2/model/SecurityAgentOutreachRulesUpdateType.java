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

/** Type of an outreach policy rules update request. */
@JsonSerialize(
    using =
        SecurityAgentOutreachRulesUpdateType.SecurityAgentOutreachRulesUpdateTypeSerializer.class)
public class SecurityAgentOutreachRulesUpdateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("outreach_policy_rules_update"));

  public static final SecurityAgentOutreachRulesUpdateType OUTREACH_POLICY_RULES_UPDATE =
      new SecurityAgentOutreachRulesUpdateType("outreach_policy_rules_update");

  SecurityAgentOutreachRulesUpdateType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentOutreachRulesUpdateTypeSerializer
      extends StdSerializer<SecurityAgentOutreachRulesUpdateType> {
    public SecurityAgentOutreachRulesUpdateTypeSerializer(
        Class<SecurityAgentOutreachRulesUpdateType> t) {
      super(t);
    }

    public SecurityAgentOutreachRulesUpdateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentOutreachRulesUpdateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentOutreachRulesUpdateType fromValue(String value) {
    return new SecurityAgentOutreachRulesUpdateType(value);
  }
}
