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

/** Whether to show the legend inline or let it be automatically generated. */
@JsonSerialize(
    using =
        SunburstWidgetLegendInlineAutomaticType.SunburstWidgetLegendInlineAutomaticTypeSerializer
            .class)
public class SunburstWidgetLegendInlineAutomaticType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("inline", "automatic"));

  public static final SunburstWidgetLegendInlineAutomaticType INLINE =
      new SunburstWidgetLegendInlineAutomaticType("inline");
  public static final SunburstWidgetLegendInlineAutomaticType AUTOMATIC =
      new SunburstWidgetLegendInlineAutomaticType("automatic");

  SunburstWidgetLegendInlineAutomaticType(String value) {
    super(value, allowedValues);
  }

  public static class SunburstWidgetLegendInlineAutomaticTypeSerializer
      extends StdSerializer<SunburstWidgetLegendInlineAutomaticType> {
    public SunburstWidgetLegendInlineAutomaticTypeSerializer(
        Class<SunburstWidgetLegendInlineAutomaticType> t) {
      super(t);
    }

    public SunburstWidgetLegendInlineAutomaticTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SunburstWidgetLegendInlineAutomaticType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SunburstWidgetLegendInlineAutomaticType fromValue(String value) {
    return new SunburstWidgetLegendInlineAutomaticType(value);
  }
}
