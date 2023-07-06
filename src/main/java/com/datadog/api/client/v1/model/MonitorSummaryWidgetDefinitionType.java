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

/** Type of the monitor summary widget. */
@JsonSerialize(
    using = MonitorSummaryWidgetDefinitionType.MonitorSummaryWidgetDefinitionTypeSerializer.class)
public class MonitorSummaryWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("manage_status"));

  public static final MonitorSummaryWidgetDefinitionType MANAGE_STATUS =
      new MonitorSummaryWidgetDefinitionType("manage_status");

  MonitorSummaryWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class MonitorSummaryWidgetDefinitionTypeSerializer
      extends StdSerializer<MonitorSummaryWidgetDefinitionType> {
    public MonitorSummaryWidgetDefinitionTypeSerializer(
        Class<MonitorSummaryWidgetDefinitionType> t) {
      super(t);
    }

    public MonitorSummaryWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorSummaryWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorSummaryWidgetDefinitionType fromValue(String value) {
    return new MonitorSummaryWidgetDefinitionType(value);
  }
}
