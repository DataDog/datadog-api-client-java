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
@JsonSerialize(using = HostmapStylePalette.HostmapStylePaletteSerializer.class)
public class HostmapStylePalette extends ModelEnum<String> {

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
              "dd20"));

  public static final HostmapStylePalette SUCCESS = new HostmapStylePalette("success");
  public static final HostmapStylePalette RED = new HostmapStylePalette("red");
  public static final HostmapStylePalette GREEN = new HostmapStylePalette("green");
  public static final HostmapStylePalette ORANGE = new HostmapStylePalette("orange");
  public static final HostmapStylePalette GRAY = new HostmapStylePalette("gray");
  public static final HostmapStylePalette DOG_CLASSIC = new HostmapStylePalette("dog_classic");
  public static final HostmapStylePalette DOG_CLASSIC_AREA =
      new HostmapStylePalette("dog_classic_area");
  public static final HostmapStylePalette DOG_CLASSIC_LINE =
      new HostmapStylePalette("dog_classic_line");
  public static final HostmapStylePalette DOG_CLASSIC_BARS =
      new HostmapStylePalette("dog_classic_bars");
  public static final HostmapStylePalette DOG_HIGHLIGHT = new HostmapStylePalette("dog_highlight");
  public static final HostmapStylePalette MONITOR_STATE = new HostmapStylePalette("monitor_state");
  public static final HostmapStylePalette YELLOW_TO_GREEN =
      new HostmapStylePalette("yellow_to_green");
  public static final HostmapStylePalette GREEN_TO_ORANGE =
      new HostmapStylePalette("green_to_orange");
  public static final HostmapStylePalette HOSTMAP_BLUES = new HostmapStylePalette("hostmap_blues");
  public static final HostmapStylePalette HOSTMAP_GREEN_RED =
      new HostmapStylePalette("hostmap_green_red");
  public static final HostmapStylePalette HOSTMAP_GREEN_ORANGE_RED =
      new HostmapStylePalette("hostmap_green_orange_red");
  public static final HostmapStylePalette HOSTMAP_BLUE_RED =
      new HostmapStylePalette("hostmap_blue_red");
  public static final HostmapStylePalette DARK_GREY = new HostmapStylePalette("dark_grey");
  public static final HostmapStylePalette PRIDE = new HostmapStylePalette("pride");
  public static final HostmapStylePalette GNBU = new HostmapStylePalette("GnBu");
  public static final HostmapStylePalette YLORRD = new HostmapStylePalette("YlOrRd");
  public static final HostmapStylePalette PURPLES = new HostmapStylePalette("Purples");
  public static final HostmapStylePalette BLUES = new HostmapStylePalette("Blues");
  public static final HostmapStylePalette ORANGES = new HostmapStylePalette("Oranges");
  public static final HostmapStylePalette REDS = new HostmapStylePalette("Reds");
  public static final HostmapStylePalette GREENS = new HostmapStylePalette("Greens");
  public static final HostmapStylePalette GREYS = new HostmapStylePalette("Greys");
  public static final HostmapStylePalette STATUS_ERRORS = new HostmapStylePalette("status_errors");
  public static final HostmapStylePalette STATUS_WARNINGS =
      new HostmapStylePalette("status_warnings");
  public static final HostmapStylePalette STATUS_SUCCESSES =
      new HostmapStylePalette("status_successes");
  public static final HostmapStylePalette PLASMA = new HostmapStylePalette("Plasma");
  public static final HostmapStylePalette VIRIDIS = new HostmapStylePalette("Viridis");
  public static final HostmapStylePalette DOGCAT = new HostmapStylePalette("dogcat");
  public static final HostmapStylePalette DATADOG16 = new HostmapStylePalette("datadog16");
  public static final HostmapStylePalette PA_CLASSIC_LINE =
      new HostmapStylePalette("pa_classic_line");
  public static final HostmapStylePalette PA_CLASSIC_AREA =
      new HostmapStylePalette("pa_classic_area");
  public static final HostmapStylePalette PA_CLASSIC_BARS =
      new HostmapStylePalette("pa_classic_bars");
  public static final HostmapStylePalette PA_DATADOG16 = new HostmapStylePalette("pa_datadog16");
  public static final HostmapStylePalette CLASSIC = new HostmapStylePalette("classic");
  public static final HostmapStylePalette COOL_HM = new HostmapStylePalette("Cool_hm");
  public static final HostmapStylePalette WARM_HM = new HostmapStylePalette("Warm_hm");
  public static final HostmapStylePalette YELLOW___GREEN =
      new HostmapStylePalette("Yellow / Green");
  public static final HostmapStylePalette GREEN___ORANGE =
      new HostmapStylePalette("Green / Orange");
  public static final HostmapStylePalette GREEN___RED = new HostmapStylePalette("Green / Red");
  public static final HostmapStylePalette GREEN___ORANGE___RED =
      new HostmapStylePalette("Green / Orange / Red");
  public static final HostmapStylePalette BLUE___RED = new HostmapStylePalette("Blue / Red");
  public static final HostmapStylePalette GOOD___BAD = new HostmapStylePalette("Good - bad");
  public static final HostmapStylePalette COOL = new HostmapStylePalette("cool");
  public static final HostmapStylePalette OCEAN = new HostmapStylePalette("ocean");
  public static final HostmapStylePalette WARM = new HostmapStylePalette("warm");
  public static final HostmapStylePalette FIRE = new HostmapStylePalette("fire");
  public static final HostmapStylePalette WARN = new HostmapStylePalette("warn");
  public static final HostmapStylePalette PURPLE = new HostmapStylePalette("purple");
  public static final HostmapStylePalette GREY = new HostmapStylePalette("grey");
  public static final HostmapStylePalette BLUE = new HostmapStylePalette("blue");
  public static final HostmapStylePalette DD20 = new HostmapStylePalette("dd20");

  HostmapStylePalette(String value) {
    super(value, allowedValues);
  }

  public static class HostmapStylePaletteSerializer extends StdSerializer<HostmapStylePalette> {
    public HostmapStylePaletteSerializer(Class<HostmapStylePalette> t) {
      super(t);
    }

    public HostmapStylePaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostmapStylePalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostmapStylePalette fromValue(String value) {
    return new HostmapStylePalette(value);
  }
}
