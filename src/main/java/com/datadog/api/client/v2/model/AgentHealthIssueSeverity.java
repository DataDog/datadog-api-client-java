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

/** The severity of the issue. */
@JsonSerialize(using = AgentHealthIssueSeverity.AgentHealthIssueSeveritySerializer.class)
public class AgentHealthIssueSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("low", "medium", "high", "unknown"));

  public static final AgentHealthIssueSeverity LOW = new AgentHealthIssueSeverity("low");
  public static final AgentHealthIssueSeverity MEDIUM = new AgentHealthIssueSeverity("medium");
  public static final AgentHealthIssueSeverity HIGH = new AgentHealthIssueSeverity("high");
  public static final AgentHealthIssueSeverity UNKNOWN = new AgentHealthIssueSeverity("unknown");

  AgentHealthIssueSeverity(String value) {
    super(value, allowedValues);
  }

  public static class AgentHealthIssueSeveritySerializer
      extends StdSerializer<AgentHealthIssueSeverity> {
    public AgentHealthIssueSeveritySerializer(Class<AgentHealthIssueSeverity> t) {
      super(t);
    }

    public AgentHealthIssueSeveritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AgentHealthIssueSeverity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AgentHealthIssueSeverity fromValue(String value) {
    return new AgentHealthIssueSeverity(value);
  }
}
