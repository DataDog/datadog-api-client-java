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

/** Width of the label column. */
@JsonSerialize(using = HeatgridLabelColumnWidth.HeatgridLabelColumnWidthSerializer.class)
public class HeatgridLabelColumnWidth extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("xs", "s", "m", "l", "xl"));

  public static final HeatgridLabelColumnWidth XS = new HeatgridLabelColumnWidth("xs");
  public static final HeatgridLabelColumnWidth S = new HeatgridLabelColumnWidth("s");
  public static final HeatgridLabelColumnWidth M = new HeatgridLabelColumnWidth("m");
  public static final HeatgridLabelColumnWidth L = new HeatgridLabelColumnWidth("l");
  public static final HeatgridLabelColumnWidth XL = new HeatgridLabelColumnWidth("xl");

  HeatgridLabelColumnWidth(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridLabelColumnWidthSerializer
      extends StdSerializer<HeatgridLabelColumnWidth> {
    public HeatgridLabelColumnWidthSerializer(Class<HeatgridLabelColumnWidth> t) {
      super(t);
    }

    public HeatgridLabelColumnWidthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridLabelColumnWidth value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridLabelColumnWidth fromValue(String value) {
    return new HeatgridLabelColumnWidth(value);
  }
}
