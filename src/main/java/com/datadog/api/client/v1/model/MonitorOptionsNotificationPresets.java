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

/** Toggles the display of additional content sent in the monitor notification. */
@JsonSerialize(
    using = MonitorOptionsNotificationPresets.MonitorOptionsNotificationPresetsSerializer.class)
public class MonitorOptionsNotificationPresets extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("show_all", "hide_query", "hide_handles", "hide_all"));

  public static final MonitorOptionsNotificationPresets SHOW_ALL =
      new MonitorOptionsNotificationPresets("show_all");
  public static final MonitorOptionsNotificationPresets HIDE_QUERY =
      new MonitorOptionsNotificationPresets("hide_query");
  public static final MonitorOptionsNotificationPresets HIDE_HANDLES =
      new MonitorOptionsNotificationPresets("hide_handles");
  public static final MonitorOptionsNotificationPresets HIDE_ALL =
      new MonitorOptionsNotificationPresets("hide_all");

  MonitorOptionsNotificationPresets(String value) {
    super(value, allowedValues);
  }

  public static class MonitorOptionsNotificationPresetsSerializer
      extends StdSerializer<MonitorOptionsNotificationPresets> {
    public MonitorOptionsNotificationPresetsSerializer(Class<MonitorOptionsNotificationPresets> t) {
      super(t);
    }

    public MonitorOptionsNotificationPresetsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorOptionsNotificationPresets value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorOptionsNotificationPresets fromValue(String value) {
    return new MonitorOptionsNotificationPresets(value);
  }
}
