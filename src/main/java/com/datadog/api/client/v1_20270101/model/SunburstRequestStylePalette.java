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
@JsonSerialize(using = SunburstRequestStylePalette.SunburstRequestStylePaletteSerializer.class)
public class SunburstRequestStylePalette extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "success",
              "red",
              "green",
              "orange",
              "gray",
              "dog_classic",
              "dog_classic_area",
              "dog_classic_line",
              "dog_classic_bars",
              "dog_highlight",
              "monitor_state",
              "yellow_to_green",
              "green_to_orange",
              "hostmap_blues",
              "hostmap_green_red",
              "hostmap_green_orange_red",
              "hostmap_blue_red",
              "dark_grey",
              "pride",
              "GnBu",
              "YlOrRd",
              "Purples",
              "Blues",
              "Oranges",
              "Reds",
              "Greens",
              "Greys",
              "status_errors",
              "status_warnings",
              "status_successes",
              "Plasma",
              "Viridis",
              "dogcat",
              "datadog16",
              "pa_classic_line",
              "pa_classic_area",
              "pa_classic_bars",
              "pa_datadog16",
              "classic",
              "Cool_hm",
              "Warm_hm",
              "Yellow / Green",
              "Green / Orange",
              "Green / Red",
              "Green / Orange / Red",
              "Blue / Red",
              "Good - bad",
              "cool",
              "ocean",
              "warm",
              "fire",
              "warn",
              "purple",
              "grey",
              "blue",
              "dd20",
              "semantic"));

  public static final SunburstRequestStylePalette SUCCESS =
      new SunburstRequestStylePalette("success");
  public static final SunburstRequestStylePalette RED = new SunburstRequestStylePalette("red");
  public static final SunburstRequestStylePalette GREEN = new SunburstRequestStylePalette("green");
  public static final SunburstRequestStylePalette ORANGE =
      new SunburstRequestStylePalette("orange");
  public static final SunburstRequestStylePalette GRAY = new SunburstRequestStylePalette("gray");
  public static final SunburstRequestStylePalette DOG_CLASSIC =
      new SunburstRequestStylePalette("dog_classic");
  public static final SunburstRequestStylePalette DOG_CLASSIC_AREA =
      new SunburstRequestStylePalette("dog_classic_area");
  public static final SunburstRequestStylePalette DOG_CLASSIC_LINE =
      new SunburstRequestStylePalette("dog_classic_line");
  public static final SunburstRequestStylePalette DOG_CLASSIC_BARS =
      new SunburstRequestStylePalette("dog_classic_bars");
  public static final SunburstRequestStylePalette DOG_HIGHLIGHT =
      new SunburstRequestStylePalette("dog_highlight");
  public static final SunburstRequestStylePalette MONITOR_STATE =
      new SunburstRequestStylePalette("monitor_state");
  public static final SunburstRequestStylePalette YELLOW_TO_GREEN =
      new SunburstRequestStylePalette("yellow_to_green");
  public static final SunburstRequestStylePalette GREEN_TO_ORANGE =
      new SunburstRequestStylePalette("green_to_orange");
  public static final SunburstRequestStylePalette HOSTMAP_BLUES =
      new SunburstRequestStylePalette("hostmap_blues");
  public static final SunburstRequestStylePalette HOSTMAP_GREEN_RED =
      new SunburstRequestStylePalette("hostmap_green_red");
  public static final SunburstRequestStylePalette HOSTMAP_GREEN_ORANGE_RED =
      new SunburstRequestStylePalette("hostmap_green_orange_red");
  public static final SunburstRequestStylePalette HOSTMAP_BLUE_RED =
      new SunburstRequestStylePalette("hostmap_blue_red");
  public static final SunburstRequestStylePalette DARK_GREY =
      new SunburstRequestStylePalette("dark_grey");
  public static final SunburstRequestStylePalette PRIDE = new SunburstRequestStylePalette("pride");
  public static final SunburstRequestStylePalette GNBU = new SunburstRequestStylePalette("GnBu");
  public static final SunburstRequestStylePalette YLORRD =
      new SunburstRequestStylePalette("YlOrRd");
  public static final SunburstRequestStylePalette PURPLES =
      new SunburstRequestStylePalette("Purples");
  public static final SunburstRequestStylePalette BLUES = new SunburstRequestStylePalette("Blues");
  public static final SunburstRequestStylePalette ORANGES =
      new SunburstRequestStylePalette("Oranges");
  public static final SunburstRequestStylePalette REDS = new SunburstRequestStylePalette("Reds");
  public static final SunburstRequestStylePalette GREENS =
      new SunburstRequestStylePalette("Greens");
  public static final SunburstRequestStylePalette GREYS = new SunburstRequestStylePalette("Greys");
  public static final SunburstRequestStylePalette STATUS_ERRORS =
      new SunburstRequestStylePalette("status_errors");
  public static final SunburstRequestStylePalette STATUS_WARNINGS =
      new SunburstRequestStylePalette("status_warnings");
  public static final SunburstRequestStylePalette STATUS_SUCCESSES =
      new SunburstRequestStylePalette("status_successes");
  public static final SunburstRequestStylePalette PLASMA =
      new SunburstRequestStylePalette("Plasma");
  public static final SunburstRequestStylePalette VIRIDIS =
      new SunburstRequestStylePalette("Viridis");
  public static final SunburstRequestStylePalette DOGCAT =
      new SunburstRequestStylePalette("dogcat");
  public static final SunburstRequestStylePalette DATADOG16 =
      new SunburstRequestStylePalette("datadog16");
  public static final SunburstRequestStylePalette PA_CLASSIC_LINE =
      new SunburstRequestStylePalette("pa_classic_line");
  public static final SunburstRequestStylePalette PA_CLASSIC_AREA =
      new SunburstRequestStylePalette("pa_classic_area");
  public static final SunburstRequestStylePalette PA_CLASSIC_BARS =
      new SunburstRequestStylePalette("pa_classic_bars");
  public static final SunburstRequestStylePalette PA_DATADOG16 =
      new SunburstRequestStylePalette("pa_datadog16");
  public static final SunburstRequestStylePalette CLASSIC =
      new SunburstRequestStylePalette("classic");
  public static final SunburstRequestStylePalette COOL_HM =
      new SunburstRequestStylePalette("Cool_hm");
  public static final SunburstRequestStylePalette WARM_HM =
      new SunburstRequestStylePalette("Warm_hm");
  public static final SunburstRequestStylePalette YELLOW___GREEN =
      new SunburstRequestStylePalette("Yellow / Green");
  public static final SunburstRequestStylePalette GREEN___ORANGE =
      new SunburstRequestStylePalette("Green / Orange");
  public static final SunburstRequestStylePalette GREEN___RED =
      new SunburstRequestStylePalette("Green / Red");
  public static final SunburstRequestStylePalette GREEN___ORANGE___RED =
      new SunburstRequestStylePalette("Green / Orange / Red");
  public static final SunburstRequestStylePalette BLUE___RED =
      new SunburstRequestStylePalette("Blue / Red");
  public static final SunburstRequestStylePalette GOOD___BAD =
      new SunburstRequestStylePalette("Good - bad");
  public static final SunburstRequestStylePalette COOL = new SunburstRequestStylePalette("cool");
  public static final SunburstRequestStylePalette OCEAN = new SunburstRequestStylePalette("ocean");
  public static final SunburstRequestStylePalette WARM = new SunburstRequestStylePalette("warm");
  public static final SunburstRequestStylePalette FIRE = new SunburstRequestStylePalette("fire");
  public static final SunburstRequestStylePalette WARN = new SunburstRequestStylePalette("warn");
  public static final SunburstRequestStylePalette PURPLE =
      new SunburstRequestStylePalette("purple");
  public static final SunburstRequestStylePalette GREY = new SunburstRequestStylePalette("grey");
  public static final SunburstRequestStylePalette BLUE = new SunburstRequestStylePalette("blue");
  public static final SunburstRequestStylePalette DD20 = new SunburstRequestStylePalette("dd20");
  public static final SunburstRequestStylePalette SEMANTIC =
      new SunburstRequestStylePalette("semantic");

  SunburstRequestStylePalette(String value) {
    super(value, allowedValues);
  }

  public static class SunburstRequestStylePaletteSerializer
      extends StdSerializer<SunburstRequestStylePalette> {
    public SunburstRequestStylePaletteSerializer(Class<SunburstRequestStylePalette> t) {
      super(t);
    }

    public SunburstRequestStylePaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SunburstRequestStylePalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SunburstRequestStylePalette fromValue(String value) {
    return new SunburstRequestStylePalette(value);
  }
}
