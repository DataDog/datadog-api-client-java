/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The name of the preset for the notification for the monitor. */
@JsonSerialize(
    using =
        SyntheticsTestOptionsMonitorOptionsNotificationPresetName
            .SyntheticsTestOptionsMonitorOptionsNotificationPresetNameSerializer.class)
public class SyntheticsTestOptionsMonitorOptionsNotificationPresetName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("show_all", "hide_all", "hide_query", "hide_handles"));

  public static final SyntheticsTestOptionsMonitorOptionsNotificationPresetName SHOW_ALL =
      new SyntheticsTestOptionsMonitorOptionsNotificationPresetName("show_all");
  public static final SyntheticsTestOptionsMonitorOptionsNotificationPresetName HIDE_ALL =
      new SyntheticsTestOptionsMonitorOptionsNotificationPresetName("hide_all");
  public static final SyntheticsTestOptionsMonitorOptionsNotificationPresetName HIDE_QUERY =
      new SyntheticsTestOptionsMonitorOptionsNotificationPresetName("hide_query");
  public static final SyntheticsTestOptionsMonitorOptionsNotificationPresetName HIDE_HANDLES =
      new SyntheticsTestOptionsMonitorOptionsNotificationPresetName("hide_handles");

  SyntheticsTestOptionsMonitorOptionsNotificationPresetName(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestOptionsMonitorOptionsNotificationPresetNameSerializer
      extends StdSerializer<SyntheticsTestOptionsMonitorOptionsNotificationPresetName> {
    public SyntheticsTestOptionsMonitorOptionsNotificationPresetNameSerializer(
        Class<SyntheticsTestOptionsMonitorOptionsNotificationPresetName> t) {
      super(t);
    }

    public SyntheticsTestOptionsMonitorOptionsNotificationPresetNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestOptionsMonitorOptionsNotificationPresetName value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestOptionsMonitorOptionsNotificationPresetName fromValue(String value) {
    return new SyntheticsTestOptionsMonitorOptionsNotificationPresetName(value);
  }
}
