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

/** Schedules resource type. */
@JsonSerialize(using = ScheduleCreateRequestDataType.ScheduleCreateRequestDataTypeSerializer.class)
public class ScheduleCreateRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("schedules"));

  public static final ScheduleCreateRequestDataType SCHEDULES =
      new ScheduleCreateRequestDataType("schedules");

  ScheduleCreateRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ScheduleCreateRequestDataTypeSerializer
      extends StdSerializer<ScheduleCreateRequestDataType> {
    public ScheduleCreateRequestDataTypeSerializer(Class<ScheduleCreateRequestDataType> t) {
      super(t);
    }

    public ScheduleCreateRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleCreateRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleCreateRequestDataType fromValue(String value) {
    return new ScheduleCreateRequestDataType(value);
  }
}
