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
 * Represents the resource type for a single position's (previous, current, or next) group of
 * on-call responder shifts.
 */
@JsonSerialize(
    using = ScheduleOnCallResponderDataType.ScheduleOnCallResponderDataTypeSerializer.class)
public class ScheduleOnCallResponderDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("schedule_oncall_responder"));

  public static final ScheduleOnCallResponderDataType SCHEDULE_ONCALL_RESPONDER =
      new ScheduleOnCallResponderDataType("schedule_oncall_responder");

  ScheduleOnCallResponderDataType(String value) {
    super(value, allowedValues);
  }

  public static class ScheduleOnCallResponderDataTypeSerializer
      extends StdSerializer<ScheduleOnCallResponderDataType> {
    public ScheduleOnCallResponderDataTypeSerializer(Class<ScheduleOnCallResponderDataType> t) {
      super(t);
    }

    public ScheduleOnCallResponderDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleOnCallResponderDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleOnCallResponderDataType fromValue(String value) {
    return new ScheduleOnCallResponderDataType(value);
  }
}
