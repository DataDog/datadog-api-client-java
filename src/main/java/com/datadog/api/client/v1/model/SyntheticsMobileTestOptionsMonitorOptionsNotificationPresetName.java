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

/**
 * The definition of <code>SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName</code>
 * object.
 */
@JsonSerialize(
    using =
        SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName
            .SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetNameSerializer.class)
public class SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("show_all", "hide_all", "hide_query", "hide_handles"));

  public static final SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName SHOW_ALL =
      new SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName("show_all");
  public static final SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName HIDE_ALL =
      new SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName("hide_all");
  public static final SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName HIDE_QUERY =
      new SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName("hide_query");
  public static final SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName HIDE_HANDLES =
      new SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName("hide_handles");

  SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetNameSerializer
      extends StdSerializer<SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName> {
    public SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetNameSerializer(
        Class<SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName> t) {
      super(t);
    }

    public SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName fromValue(
      String value) {
    return new SyntheticsMobileTestOptionsMonitorOptionsNotificationPresetName(value);
  }
}
