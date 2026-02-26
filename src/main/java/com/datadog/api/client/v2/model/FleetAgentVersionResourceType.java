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

/** The type of Agent version resource. */
@JsonSerialize(using = FleetAgentVersionResourceType.FleetAgentVersionResourceTypeSerializer.class)
public class FleetAgentVersionResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("agent_version"));

  public static final FleetAgentVersionResourceType AGENT_VERSION =
      new FleetAgentVersionResourceType("agent_version");

  FleetAgentVersionResourceType(String value) {
    super(value, allowedValues);
  }

  public static class FleetAgentVersionResourceTypeSerializer
      extends StdSerializer<FleetAgentVersionResourceType> {
    public FleetAgentVersionResourceTypeSerializer(Class<FleetAgentVersionResourceType> t) {
      super(t);
    }

    public FleetAgentVersionResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetAgentVersionResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetAgentVersionResourceType fromValue(String value) {
    return new FleetAgentVersionResourceType(value);
  }
}
