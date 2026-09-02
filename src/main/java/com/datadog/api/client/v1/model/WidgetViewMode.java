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

/** Define how you want the SLO to be displayed. */
@JsonSerialize(using = WidgetViewMode.WidgetViewModeSerializer.class)
public class WidgetViewMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("overall", "component", "both"));

  public static final WidgetViewMode OVERALL = new WidgetViewMode("overall");
  public static final WidgetViewMode COMPONENT = new WidgetViewMode("component");
  public static final WidgetViewMode BOTH = new WidgetViewMode("both");

  WidgetViewMode(String value) {
    super(value, allowedValues);
  }

  public static class WidgetViewModeSerializer extends StdSerializer<WidgetViewMode> {
    public WidgetViewModeSerializer(Class<WidgetViewMode> t) {
      super(t);
    }

    public WidgetViewModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetViewMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetViewMode fromValue(String value) {
    return new WidgetViewMode(value);
  }
}
