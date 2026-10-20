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

/** Agent type associated with the resource. */
@JsonSerialize(using = AgentHealthAgentType.AgentHealthAgentTypeSerializer.class)
public class AgentHealthAgentType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("node", "cluster"));

  public static final AgentHealthAgentType NODE = new AgentHealthAgentType("node");
  public static final AgentHealthAgentType CLUSTER = new AgentHealthAgentType("cluster");

  AgentHealthAgentType(String value) {
    super(value, allowedValues);
  }

  public static class AgentHealthAgentTypeSerializer extends StdSerializer<AgentHealthAgentType> {
    public AgentHealthAgentTypeSerializer(Class<AgentHealthAgentType> t) {
      super(t);
    }

    public AgentHealthAgentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AgentHealthAgentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AgentHealthAgentType fromValue(String value) {
    return new AgentHealthAgentType(value);
  }
}
