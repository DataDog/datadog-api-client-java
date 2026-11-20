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
@JsonSerialize(using = GeomapStylePalette.GeomapStylePaletteSerializer.class)
public class GeomapStylePalette extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
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
              "pa_datadog16"));

  public static final GeomapStylePalette DOG_CLASSIC = new GeomapStylePalette("dog_classic");
  public static final GeomapStylePalette DOG_CLASSIC_AREA =
      new GeomapStylePalette("dog_classic_area");
  public static final GeomapStylePalette DOG_CLASSIC_LINE =
      new GeomapStylePalette("dog_classic_line");
  public static final GeomapStylePalette DOG_CLASSIC_BARS =
      new GeomapStylePalette("dog_classic_bars");
  public static final GeomapStylePalette DOG_HIGHLIGHT = new GeomapStylePalette("dog_highlight");
  public static final GeomapStylePalette MONITOR_STATE = new GeomapStylePalette("monitor_state");
  public static final GeomapStylePalette YELLOW_TO_GREEN =
      new GeomapStylePalette("yellow_to_green");
  public static final GeomapStylePalette GREEN_TO_ORANGE =
      new GeomapStylePalette("green_to_orange");
  public static final GeomapStylePalette HOSTMAP_BLUES = new GeomapStylePalette("hostmap_blues");
  public static final GeomapStylePalette HOSTMAP_GREEN_RED =
      new GeomapStylePalette("hostmap_green_red");
  public static final GeomapStylePalette HOSTMAP_GREEN_ORANGE_RED =
      new GeomapStylePalette("hostmap_green_orange_red");
  public static final GeomapStylePalette HOSTMAP_BLUE_RED =
      new GeomapStylePalette("hostmap_blue_red");
  public static final GeomapStylePalette DARK_GREY = new GeomapStylePalette("dark_grey");
  public static final GeomapStylePalette PRIDE = new GeomapStylePalette("pride");
  public static final GeomapStylePalette GNBU = new GeomapStylePalette("GnBu");
  public static final GeomapStylePalette YLORRD = new GeomapStylePalette("YlOrRd");
  public static final GeomapStylePalette PURPLES = new GeomapStylePalette("Purples");
  public static final GeomapStylePalette BLUES = new GeomapStylePalette("Blues");
  public static final GeomapStylePalette ORANGES = new GeomapStylePalette("Oranges");
  public static final GeomapStylePalette REDS = new GeomapStylePalette("Reds");
  public static final GeomapStylePalette GREENS = new GeomapStylePalette("Greens");
  public static final GeomapStylePalette GREYS = new GeomapStylePalette("Greys");
  public static final GeomapStylePalette STATUS_ERRORS = new GeomapStylePalette("status_errors");
  public static final GeomapStylePalette STATUS_WARNINGS =
      new GeomapStylePalette("status_warnings");
  public static final GeomapStylePalette STATUS_SUCCESSES =
      new GeomapStylePalette("status_successes");
  public static final GeomapStylePalette PLASMA = new GeomapStylePalette("Plasma");
  public static final GeomapStylePalette VIRIDIS = new GeomapStylePalette("Viridis");
  public static final GeomapStylePalette DOGCAT = new GeomapStylePalette("dogcat");
  public static final GeomapStylePalette DATADOG16 = new GeomapStylePalette("datadog16");
  public static final GeomapStylePalette PA_CLASSIC_LINE =
      new GeomapStylePalette("pa_classic_line");
  public static final GeomapStylePalette PA_CLASSIC_AREA =
      new GeomapStylePalette("pa_classic_area");
  public static final GeomapStylePalette PA_CLASSIC_BARS =
      new GeomapStylePalette("pa_classic_bars");
  public static final GeomapStylePalette PA_DATADOG16 = new GeomapStylePalette("pa_datadog16");

  GeomapStylePalette(String value) {
    super(value, allowedValues);
  }

  public static class GeomapStylePaletteSerializer extends StdSerializer<GeomapStylePalette> {
    public GeomapStylePaletteSerializer(Class<GeomapStylePalette> t) {
      super(t);
    }

    public GeomapStylePaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(GeomapStylePalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeomapStylePalette fromValue(String value) {
    return new GeomapStylePalette(value);
  }
}
