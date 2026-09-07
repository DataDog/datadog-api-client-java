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
 * Represents the resource type for a schedule's grouped on-call responders across the previous,
 * current, and next positions.
 */
@JsonSerialize(
    using = ScheduleOnCallRespondersDataType.ScheduleOnCallRespondersDataTypeSerializer.class)
public class ScheduleOnCallRespondersDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("schedule_oncall_responders"));

  public static final ScheduleOnCallRespondersDataType SCHEDULE_ONCALL_RESPONDERS =
      new ScheduleOnCallRespondersDataType("schedule_oncall_responders");

  ScheduleOnCallRespondersDataType(String value) {
    super(value, allowedValues);
  }

  public static class ScheduleOnCallRespondersDataTypeSerializer
      extends StdSerializer<ScheduleOnCallRespondersDataType> {
    public ScheduleOnCallRespondersDataTypeSerializer(Class<ScheduleOnCallRespondersDataType> t) {
      super(t);
    }

    public ScheduleOnCallRespondersDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleOnCallRespondersDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleOnCallRespondersDataType fromValue(String value) {
    return new ScheduleOnCallRespondersDataType(value);
  }
}
