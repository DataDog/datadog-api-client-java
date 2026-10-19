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

/** The Agent Health issue resource type. */
@JsonSerialize(using = AgentHealthHostIssuesType.AgentHealthHostIssuesTypeSerializer.class)
public class AgentHealthHostIssuesType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("agent_health_issues"));

  public static final AgentHealthHostIssuesType AGENT_HEALTH_ISSUES =
      new AgentHealthHostIssuesType("agent_health_issues");

  AgentHealthHostIssuesType(String value) {
    super(value, allowedValues);
  }

  public static class AgentHealthHostIssuesTypeSerializer
      extends StdSerializer<AgentHealthHostIssuesType> {
    public AgentHealthHostIssuesTypeSerializer(Class<AgentHealthHostIssuesType> t) {
      super(t);
    }

    public AgentHealthHostIssuesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AgentHealthHostIssuesType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AgentHealthHostIssuesType fromValue(String value) {
    return new AgentHealthHostIssuesType(value);
  }
}
