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

/** The type of the resource. The value should always be <code>agent_rule</code>. */
@JsonSerialize(
    using = CloudWorkloadSecurityAgentRuleType.CloudWorkloadSecurityAgentRuleTypeSerializer.class)
public class CloudWorkloadSecurityAgentRuleType extends ModelEnum<String> {

  public static final CloudWorkloadSecurityAgentRuleType AGENT_RULE =
      new CloudWorkloadSecurityAgentRuleType("agent_rule");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("agent_rule"));

  CloudWorkloadSecurityAgentRuleType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class CloudWorkloadSecurityAgentRuleTypeSerializer
      extends StdSerializer<CloudWorkloadSecurityAgentRuleType> {
    public CloudWorkloadSecurityAgentRuleTypeSerializer(
        Class<CloudWorkloadSecurityAgentRuleType> t) {
      super(t);
    }

    public CloudWorkloadSecurityAgentRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CloudWorkloadSecurityAgentRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CloudWorkloadSecurityAgentRuleType fromValue(String value) {
    return new CloudWorkloadSecurityAgentRuleType(value);
  }
}
