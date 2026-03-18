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
 * Color palette used by threshold-based conditional formatting and text formatting rules in a
 * guided table.
 */
@JsonSerialize(using = GuidedTableThresholdPalette.GuidedTableThresholdPaletteSerializer.class)
public class GuidedTableThresholdPalette extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "white_on_red",
              "black_on_light_red",
              "white_on_green",
              "black_on_light_green",
              "white_on_yellow",
              "black_on_light_yellow",
              "white_on_gray",
              "green_on_white",
              "yellow_on_white",
              "red_on_white",
              "gray_on_white",
              "red",
              "green",
              "orange",
              "gray",
              "custom_bg",
              "custom_text",
              "custom_image"));

  public static final GuidedTableThresholdPalette WHITE_ON_RED =
      new GuidedTableThresholdPalette("white_on_red");
  public static final GuidedTableThresholdPalette BLACK_ON_LIGHT_RED =
      new GuidedTableThresholdPalette("black_on_light_red");
  public static final GuidedTableThresholdPalette WHITE_ON_GREEN =
      new GuidedTableThresholdPalette("white_on_green");
  public static final GuidedTableThresholdPalette BLACK_ON_LIGHT_GREEN =
      new GuidedTableThresholdPalette("black_on_light_green");
  public static final GuidedTableThresholdPalette WHITE_ON_YELLOW =
      new GuidedTableThresholdPalette("white_on_yellow");
  public static final GuidedTableThresholdPalette BLACK_ON_LIGHT_YELLOW =
      new GuidedTableThresholdPalette("black_on_light_yellow");
  public static final GuidedTableThresholdPalette WHITE_ON_GRAY =
      new GuidedTableThresholdPalette("white_on_gray");
  public static final GuidedTableThresholdPalette GREEN_ON_WHITE =
      new GuidedTableThresholdPalette("green_on_white");
  public static final GuidedTableThresholdPalette YELLOW_ON_WHITE =
      new GuidedTableThresholdPalette("yellow_on_white");
  public static final GuidedTableThresholdPalette RED_ON_WHITE =
      new GuidedTableThresholdPalette("red_on_white");
  public static final GuidedTableThresholdPalette GRAY_ON_WHITE =
      new GuidedTableThresholdPalette("gray_on_white");
  public static final GuidedTableThresholdPalette RED = new GuidedTableThresholdPalette("red");
  public static final GuidedTableThresholdPalette GREEN = new GuidedTableThresholdPalette("green");
  public static final GuidedTableThresholdPalette ORANGE =
      new GuidedTableThresholdPalette("orange");
  public static final GuidedTableThresholdPalette GRAY = new GuidedTableThresholdPalette("gray");
  public static final GuidedTableThresholdPalette CUSTOM_BG =
      new GuidedTableThresholdPalette("custom_bg");
  public static final GuidedTableThresholdPalette CUSTOM_TEXT =
      new GuidedTableThresholdPalette("custom_text");
  public static final GuidedTableThresholdPalette CUSTOM_IMAGE =
      new GuidedTableThresholdPalette("custom_image");

  GuidedTableThresholdPalette(String value) {
    super(value, allowedValues);
  }

  public static class GuidedTableThresholdPaletteSerializer
      extends StdSerializer<GuidedTableThresholdPalette> {
    public GuidedTableThresholdPaletteSerializer(Class<GuidedTableThresholdPalette> t) {
      super(t);
    }

    public GuidedTableThresholdPaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTableThresholdPalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuidedTableThresholdPalette fromValue(String value) {
    return new GuidedTableThresholdPalette(value);
  }
}
