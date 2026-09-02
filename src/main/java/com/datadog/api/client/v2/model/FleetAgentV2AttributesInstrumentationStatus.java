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

/** The single-step instrumentation status of the Agent. */
@JsonSerialize(
    using =
        FleetAgentV2AttributesInstrumentationStatus
            .FleetAgentV2AttributesInstrumentationStatusSerializer.class)
public class FleetAgentV2AttributesInstrumentationStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("success", "failure"));

  public static final FleetAgentV2AttributesInstrumentationStatus SUCCESS =
      new FleetAgentV2AttributesInstrumentationStatus("success");
  public static final FleetAgentV2AttributesInstrumentationStatus FAILURE =
      new FleetAgentV2AttributesInstrumentationStatus("failure");

  FleetAgentV2AttributesInstrumentationStatus(String value) {
    super(value, allowedValues);
  }

  public static class FleetAgentV2AttributesInstrumentationStatusSerializer
      extends StdSerializer<FleetAgentV2AttributesInstrumentationStatus> {
    public FleetAgentV2AttributesInstrumentationStatusSerializer(
        Class<FleetAgentV2AttributesInstrumentationStatus> t) {
      super(t);
    }

    public FleetAgentV2AttributesInstrumentationStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetAgentV2AttributesInstrumentationStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetAgentV2AttributesInstrumentationStatus fromValue(String value) {
    return new FleetAgentV2AttributesInstrumentationStatus(value);
  }
}
