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

/** Indicates that the resource is of type <code>schedule_target</code>. */
@JsonSerialize(using = ConfiguredScheduleTargetType.ConfiguredScheduleTargetTypeSerializer.class)
public class ConfiguredScheduleTargetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("schedule_target"));

  public static final ConfiguredScheduleTargetType SCHEDULE_TARGET =
      new ConfiguredScheduleTargetType("schedule_target");

  ConfiguredScheduleTargetType(String value) {
    super(value, allowedValues);
  }

  public static class ConfiguredScheduleTargetTypeSerializer
      extends StdSerializer<ConfiguredScheduleTargetType> {
    public ConfiguredScheduleTargetTypeSerializer(Class<ConfiguredScheduleTargetType> t) {
      super(t);
    }

    public ConfiguredScheduleTargetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ConfiguredScheduleTargetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ConfiguredScheduleTargetType fromValue(String value) {
    return new ConfiguredScheduleTargetType(value);
  }
}
