/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = ThresholdPalette.ThresholdPaletteSerializer.class)
public class ThresholdPalette extends ModelEnum<String> {

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
              "gray"));

  public static final ThresholdPalette WHITE_ON_RED = new ThresholdPalette("white_on_red");
  public static final ThresholdPalette BLACK_ON_LIGHT_RED =
      new ThresholdPalette("black_on_light_red");
  public static final ThresholdPalette WHITE_ON_GREEN = new ThresholdPalette("white_on_green");
  public static final ThresholdPalette BLACK_ON_LIGHT_GREEN =
      new ThresholdPalette("black_on_light_green");
  public static final ThresholdPalette WHITE_ON_YELLOW = new ThresholdPalette("white_on_yellow");
  public static final ThresholdPalette BLACK_ON_LIGHT_YELLOW =
      new ThresholdPalette("black_on_light_yellow");
  public static final ThresholdPalette WHITE_ON_GRAY = new ThresholdPalette("white_on_gray");
  public static final ThresholdPalette GREEN_ON_WHITE = new ThresholdPalette("green_on_white");
  public static final ThresholdPalette YELLOW_ON_WHITE = new ThresholdPalette("yellow_on_white");
  public static final ThresholdPalette RED_ON_WHITE = new ThresholdPalette("red_on_white");
  public static final ThresholdPalette GRAY_ON_WHITE = new ThresholdPalette("gray_on_white");
  public static final ThresholdPalette RED = new ThresholdPalette("red");
  public static final ThresholdPalette GREEN = new ThresholdPalette("green");
  public static final ThresholdPalette ORANGE = new ThresholdPalette("orange");
  public static final ThresholdPalette GRAY = new ThresholdPalette("gray");

  ThresholdPalette(String value) {
    super(value, allowedValues);
  }

  public static class ThresholdPaletteSerializer extends StdSerializer<ThresholdPalette> {
    public ThresholdPaletteSerializer(Class<ThresholdPalette> t) {
      super(t);
    }

    public ThresholdPaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(ThresholdPalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ThresholdPalette fromValue(String value) {
    return new ThresholdPalette(value);
  }
}
