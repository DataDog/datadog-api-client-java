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
@JsonSerialize(using = TreemapRequestStylePalette.TreemapRequestStylePaletteSerializer.class)
public class TreemapRequestStylePalette extends ModelEnum<String> {

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

  public static final TreemapRequestStylePalette SUCCESS =
      new TreemapRequestStylePalette("success");
  public static final TreemapRequestStylePalette RED = new TreemapRequestStylePalette("red");
  public static final TreemapRequestStylePalette GREEN = new TreemapRequestStylePalette("green");
  public static final TreemapRequestStylePalette ORANGE = new TreemapRequestStylePalette("orange");
  public static final TreemapRequestStylePalette GRAY = new TreemapRequestStylePalette("gray");
  public static final TreemapRequestStylePalette DOG_CLASSIC =
      new TreemapRequestStylePalette("dog_classic");
  public static final TreemapRequestStylePalette DOG_CLASSIC_AREA =
      new TreemapRequestStylePalette("dog_classic_area");
  public static final TreemapRequestStylePalette DOG_CLASSIC_LINE =
      new TreemapRequestStylePalette("dog_classic_line");
  public static final TreemapRequestStylePalette DOG_CLASSIC_BARS =
      new TreemapRequestStylePalette("dog_classic_bars");
  public static final TreemapRequestStylePalette DOG_HIGHLIGHT =
      new TreemapRequestStylePalette("dog_highlight");
  public static final TreemapRequestStylePalette MONITOR_STATE =
      new TreemapRequestStylePalette("monitor_state");
  public static final TreemapRequestStylePalette YELLOW_TO_GREEN =
      new TreemapRequestStylePalette("yellow_to_green");
  public static final TreemapRequestStylePalette GREEN_TO_ORANGE =
      new TreemapRequestStylePalette("green_to_orange");
  public static final TreemapRequestStylePalette HOSTMAP_BLUES =
      new TreemapRequestStylePalette("hostmap_blues");
  public static final TreemapRequestStylePalette HOSTMAP_GREEN_RED =
      new TreemapRequestStylePalette("hostmap_green_red");
  public static final TreemapRequestStylePalette HOSTMAP_GREEN_ORANGE_RED =
      new TreemapRequestStylePalette("hostmap_green_orange_red");
  public static final TreemapRequestStylePalette HOSTMAP_BLUE_RED =
      new TreemapRequestStylePalette("hostmap_blue_red");
  public static final TreemapRequestStylePalette DARK_GREY =
      new TreemapRequestStylePalette("dark_grey");
  public static final TreemapRequestStylePalette PRIDE = new TreemapRequestStylePalette("pride");
  public static final TreemapRequestStylePalette GNBU = new TreemapRequestStylePalette("GnBu");
  public static final TreemapRequestStylePalette YLORRD = new TreemapRequestStylePalette("YlOrRd");
  public static final TreemapRequestStylePalette PURPLES =
      new TreemapRequestStylePalette("Purples");
  public static final TreemapRequestStylePalette BLUES = new TreemapRequestStylePalette("Blues");
  public static final TreemapRequestStylePalette ORANGES =
      new TreemapRequestStylePalette("Oranges");
  public static final TreemapRequestStylePalette REDS = new TreemapRequestStylePalette("Reds");
  public static final TreemapRequestStylePalette GREENS = new TreemapRequestStylePalette("Greens");
  public static final TreemapRequestStylePalette GREYS = new TreemapRequestStylePalette("Greys");
  public static final TreemapRequestStylePalette STATUS_ERRORS =
      new TreemapRequestStylePalette("status_errors");
  public static final TreemapRequestStylePalette STATUS_WARNINGS =
      new TreemapRequestStylePalette("status_warnings");
  public static final TreemapRequestStylePalette STATUS_SUCCESSES =
      new TreemapRequestStylePalette("status_successes");
  public static final TreemapRequestStylePalette PLASMA = new TreemapRequestStylePalette("Plasma");
  public static final TreemapRequestStylePalette VIRIDIS =
      new TreemapRequestStylePalette("Viridis");
  public static final TreemapRequestStylePalette DOGCAT = new TreemapRequestStylePalette("dogcat");
  public static final TreemapRequestStylePalette DATADOG16 =
      new TreemapRequestStylePalette("datadog16");
  public static final TreemapRequestStylePalette PA_CLASSIC_LINE =
      new TreemapRequestStylePalette("pa_classic_line");
  public static final TreemapRequestStylePalette PA_CLASSIC_AREA =
      new TreemapRequestStylePalette("pa_classic_area");
  public static final TreemapRequestStylePalette PA_CLASSIC_BARS =
      new TreemapRequestStylePalette("pa_classic_bars");
  public static final TreemapRequestStylePalette PA_DATADOG16 =
      new TreemapRequestStylePalette("pa_datadog16");
  public static final TreemapRequestStylePalette CLASSIC =
      new TreemapRequestStylePalette("classic");
  public static final TreemapRequestStylePalette COOL_HM =
      new TreemapRequestStylePalette("Cool_hm");
  public static final TreemapRequestStylePalette WARM_HM =
      new TreemapRequestStylePalette("Warm_hm");
  public static final TreemapRequestStylePalette YELLOW___GREEN =
      new TreemapRequestStylePalette("Yellow / Green");
  public static final TreemapRequestStylePalette GREEN___ORANGE =
      new TreemapRequestStylePalette("Green / Orange");
  public static final TreemapRequestStylePalette GREEN___RED =
      new TreemapRequestStylePalette("Green / Red");
  public static final TreemapRequestStylePalette GREEN___ORANGE___RED =
      new TreemapRequestStylePalette("Green / Orange / Red");
  public static final TreemapRequestStylePalette BLUE___RED =
      new TreemapRequestStylePalette("Blue / Red");
  public static final TreemapRequestStylePalette GOOD___BAD =
      new TreemapRequestStylePalette("Good - bad");
  public static final TreemapRequestStylePalette COOL = new TreemapRequestStylePalette("cool");
  public static final TreemapRequestStylePalette OCEAN = new TreemapRequestStylePalette("ocean");
  public static final TreemapRequestStylePalette WARM = new TreemapRequestStylePalette("warm");
  public static final TreemapRequestStylePalette FIRE = new TreemapRequestStylePalette("fire");
  public static final TreemapRequestStylePalette WARN = new TreemapRequestStylePalette("warn");
  public static final TreemapRequestStylePalette PURPLE = new TreemapRequestStylePalette("purple");
  public static final TreemapRequestStylePalette GREY = new TreemapRequestStylePalette("grey");
  public static final TreemapRequestStylePalette BLUE = new TreemapRequestStylePalette("blue");
  public static final TreemapRequestStylePalette DD20 = new TreemapRequestStylePalette("dd20");
  public static final TreemapRequestStylePalette SEMANTIC =
      new TreemapRequestStylePalette("semantic");

  TreemapRequestStylePalette(String value) {
    super(value, allowedValues);
  }

  public static class TreemapRequestStylePaletteSerializer
      extends StdSerializer<TreemapRequestStylePalette> {
    public TreemapRequestStylePaletteSerializer(Class<TreemapRequestStylePalette> t) {
      super(t);
    }

    public TreemapRequestStylePaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TreemapRequestStylePalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TreemapRequestStylePalette fromValue(String value) {
    return new TreemapRequestStylePalette(value);
  }
}
