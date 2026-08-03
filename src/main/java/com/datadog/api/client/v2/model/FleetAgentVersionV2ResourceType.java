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

/** The type of the agent version resource. */
@JsonSerialize(
    using = FleetAgentVersionV2ResourceType.FleetAgentVersionV2ResourceTypeSerializer.class)
public class FleetAgentVersionV2ResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("agent_version"));

  public static final FleetAgentVersionV2ResourceType AGENT_VERSION =
      new FleetAgentVersionV2ResourceType("agent_version");

  FleetAgentVersionV2ResourceType(String value) {
    super(value, allowedValues);
  }

  public static class FleetAgentVersionV2ResourceTypeSerializer
      extends StdSerializer<FleetAgentVersionV2ResourceType> {
    public FleetAgentVersionV2ResourceTypeSerializer(Class<FleetAgentVersionV2ResourceType> t) {
      super(t);
    }

    public FleetAgentVersionV2ResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetAgentVersionV2ResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetAgentVersionV2ResourceType fromValue(String value) {
    return new FleetAgentVersionV2ResourceType(value);
  }
}
