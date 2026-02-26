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
 * The status of the schedule. - <code>active</code>: The schedule is active and will create
 * deployments according to its recurrence rule. - <code>inactive</code>: The schedule is inactive
 * and will not create any deployments.
 */
@JsonSerialize(using = FleetScheduleStatus.FleetScheduleStatusSerializer.class)
public class FleetScheduleStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "inactive"));

  public static final FleetScheduleStatus ACTIVE = new FleetScheduleStatus("active");
  public static final FleetScheduleStatus INACTIVE = new FleetScheduleStatus("inactive");

  FleetScheduleStatus(String value) {
    super(value, allowedValues);
  }

  public static class FleetScheduleStatusSerializer extends StdSerializer<FleetScheduleStatus> {
    public FleetScheduleStatusSerializer(Class<FleetScheduleStatus> t) {
      super(t);
    }

    public FleetScheduleStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetScheduleStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetScheduleStatus fromValue(String value) {
    return new FleetScheduleStatus(value);
  }
}
