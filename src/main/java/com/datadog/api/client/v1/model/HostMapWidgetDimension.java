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

/** Visual dimension driven by a formula in the infrastructure host map widget. */
@JsonSerialize(using = HostMapWidgetDimension.HostMapWidgetDimensionSerializer.class)
public class HostMapWidgetDimension extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("node", "fill", "size"));

  public static final HostMapWidgetDimension NODE = new HostMapWidgetDimension("node");
  public static final HostMapWidgetDimension FILL = new HostMapWidgetDimension("fill");
  public static final HostMapWidgetDimension SIZE = new HostMapWidgetDimension("size");

  HostMapWidgetDimension(String value) {
    super(value, allowedValues);
  }

  public static class HostMapWidgetDimensionSerializer
      extends StdSerializer<HostMapWidgetDimension> {
    public HostMapWidgetDimensionSerializer(Class<HostMapWidgetDimension> t) {
      super(t);
    }

    public HostMapWidgetDimensionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostMapWidgetDimension value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostMapWidgetDimension fromValue(String value) {
    return new HostMapWidgetDimension(value);
  }
}
