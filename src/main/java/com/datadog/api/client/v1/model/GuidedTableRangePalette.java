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

/** Color palette used by range-based conditional formatting rules. */
@JsonSerialize(using = GuidedTableRangePalette.GuidedTableRangePaletteSerializer.class)
public class GuidedTableRangePalette extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "transparent_to_green",
              "transparent_to_orange",
              "transparent_to_red",
              "transparent_to_blue",
              "red_transparent_green",
              "red_transparent_blue",
              "vivid_transparent_to_green",
              "vivid_transparent_to_orange",
              "vivid_transparent_to_red",
              "vivid_transparent_to_blue",
              "vivid_red_transparent_green",
              "vivid_red_transparent_blue"));

  public static final GuidedTableRangePalette TRANSPARENT_TO_GREEN =
      new GuidedTableRangePalette("transparent_to_green");
  public static final GuidedTableRangePalette TRANSPARENT_TO_ORANGE =
      new GuidedTableRangePalette("transparent_to_orange");
  public static final GuidedTableRangePalette TRANSPARENT_TO_RED =
      new GuidedTableRangePalette("transparent_to_red");
  public static final GuidedTableRangePalette TRANSPARENT_TO_BLUE =
      new GuidedTableRangePalette("transparent_to_blue");
  public static final GuidedTableRangePalette RED_TRANSPARENT_GREEN =
      new GuidedTableRangePalette("red_transparent_green");
  public static final GuidedTableRangePalette RED_TRANSPARENT_BLUE =
      new GuidedTableRangePalette("red_transparent_blue");
  public static final GuidedTableRangePalette VIVID_TRANSPARENT_TO_GREEN =
      new GuidedTableRangePalette("vivid_transparent_to_green");
  public static final GuidedTableRangePalette VIVID_TRANSPARENT_TO_ORANGE =
      new GuidedTableRangePalette("vivid_transparent_to_orange");
  public static final GuidedTableRangePalette VIVID_TRANSPARENT_TO_RED =
      new GuidedTableRangePalette("vivid_transparent_to_red");
  public static final GuidedTableRangePalette VIVID_TRANSPARENT_TO_BLUE =
      new GuidedTableRangePalette("vivid_transparent_to_blue");
  public static final GuidedTableRangePalette VIVID_RED_TRANSPARENT_GREEN =
      new GuidedTableRangePalette("vivid_red_transparent_green");
  public static final GuidedTableRangePalette VIVID_RED_TRANSPARENT_BLUE =
      new GuidedTableRangePalette("vivid_red_transparent_blue");

  GuidedTableRangePalette(String value) {
    super(value, allowedValues);
  }

  public static class GuidedTableRangePaletteSerializer
      extends StdSerializer<GuidedTableRangePalette> {
    public GuidedTableRangePaletteSerializer(Class<GuidedTableRangePalette> t) {
      super(t);
    }

    public GuidedTableRangePaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTableRangePalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuidedTableRangePalette fromValue(String value) {
    return new GuidedTableRangePalette(value);
  }
}
