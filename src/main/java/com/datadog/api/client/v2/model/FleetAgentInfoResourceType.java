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

/** The type of Agent info resource. */
@JsonSerialize(using = FleetAgentInfoResourceType.FleetAgentInfoResourceTypeSerializer.class)
public class FleetAgentInfoResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("datadog_agent_key"));

  public static final FleetAgentInfoResourceType DATADOG_AGENT_KEY =
      new FleetAgentInfoResourceType("datadog_agent_key");

  FleetAgentInfoResourceType(String value) {
    super(value, allowedValues);
  }

  public static class FleetAgentInfoResourceTypeSerializer
      extends StdSerializer<FleetAgentInfoResourceType> {
    public FleetAgentInfoResourceTypeSerializer(Class<FleetAgentInfoResourceType> t) {
      super(t);
    }

    public FleetAgentInfoResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetAgentInfoResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetAgentInfoResourceType fromValue(String value) {
    return new FleetAgentInfoResourceType(value);
  }
}
