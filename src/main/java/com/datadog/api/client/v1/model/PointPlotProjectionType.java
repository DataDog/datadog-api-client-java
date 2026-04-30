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

/** Type of the projection. */
@JsonSerialize(using = PointPlotProjectionType.PointPlotProjectionTypeSerializer.class)
public class PointPlotProjectionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("point_plot"));

  public static final PointPlotProjectionType POINT_PLOT =
      new PointPlotProjectionType("point_plot");

  PointPlotProjectionType(String value) {
    super(value, allowedValues);
  }

  public static class PointPlotProjectionTypeSerializer
      extends StdSerializer<PointPlotProjectionType> {
    public PointPlotProjectionTypeSerializer(Class<PointPlotProjectionType> t) {
      super(t);
    }

    public PointPlotProjectionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PointPlotProjectionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PointPlotProjectionType fromValue(String value) {
    return new PointPlotProjectionType(value);
  }
}
