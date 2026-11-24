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
 * The kind of affected resource. The meaning of <code>resource_id</code> depends on this: hostname
 * for <code>host</code>, DaemonSet UID for <code>deployment</code> (node Agent), cluster UUID for
 * <code>cluster</code>, hostname of the host running the Cluster Agent for <code>cluster_agent
 * </code>, or OpenTelemetry collector ID for <code>otel</code>.
 */
@JsonSerialize(using = AgentHealthIssueResourceKind.AgentHealthIssueResourceKindSerializer.class)
public class AgentHealthIssueResourceKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("host", "deployment", "cluster", "cluster_agent", "otel"));

  public static final AgentHealthIssueResourceKind HOST = new AgentHealthIssueResourceKind("host");
  public static final AgentHealthIssueResourceKind DEPLOYMENT =
      new AgentHealthIssueResourceKind("deployment");
  public static final AgentHealthIssueResourceKind CLUSTER =
      new AgentHealthIssueResourceKind("cluster");
  public static final AgentHealthIssueResourceKind CLUSTER_AGENT =
      new AgentHealthIssueResourceKind("cluster_agent");
  public static final AgentHealthIssueResourceKind OTEL = new AgentHealthIssueResourceKind("otel");

  AgentHealthIssueResourceKind(String value) {
    super(value, allowedValues);
  }

  public static class AgentHealthIssueResourceKindSerializer
      extends StdSerializer<AgentHealthIssueResourceKind> {
    public AgentHealthIssueResourceKindSerializer(Class<AgentHealthIssueResourceKind> t) {
      super(t);
    }

    public AgentHealthIssueResourceKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AgentHealthIssueResourceKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AgentHealthIssueResourceKind fromValue(String value) {
    return new AgentHealthIssueResourceKind(value);
  }
}
