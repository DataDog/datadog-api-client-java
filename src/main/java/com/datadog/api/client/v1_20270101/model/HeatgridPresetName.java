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
@JsonSerialize(using = HeatgridPresetName.HeatgridPresetNameSerializer.class)
public class HeatgridPresetName extends ModelEnum<String> {

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
              "pa_datadog16",
              "classic"));

  public static final HeatgridPresetName DOG_CLASSIC = new HeatgridPresetName("dog_classic");
  public static final HeatgridPresetName DOG_CLASSIC_AREA =
      new HeatgridPresetName("dog_classic_area");
  public static final HeatgridPresetName DOG_CLASSIC_LINE =
      new HeatgridPresetName("dog_classic_line");
  public static final HeatgridPresetName DOG_CLASSIC_BARS =
      new HeatgridPresetName("dog_classic_bars");
  public static final HeatgridPresetName DOG_HIGHLIGHT = new HeatgridPresetName("dog_highlight");
  public static final HeatgridPresetName MONITOR_STATE = new HeatgridPresetName("monitor_state");
  public static final HeatgridPresetName YELLOW_TO_GREEN =
      new HeatgridPresetName("yellow_to_green");
  public static final HeatgridPresetName GREEN_TO_ORANGE =
      new HeatgridPresetName("green_to_orange");
  public static final HeatgridPresetName HOSTMAP_BLUES = new HeatgridPresetName("hostmap_blues");
  public static final HeatgridPresetName HOSTMAP_GREEN_RED =
      new HeatgridPresetName("hostmap_green_red");
  public static final HeatgridPresetName HOSTMAP_GREEN_ORANGE_RED =
      new HeatgridPresetName("hostmap_green_orange_red");
  public static final HeatgridPresetName HOSTMAP_BLUE_RED =
      new HeatgridPresetName("hostmap_blue_red");
  public static final HeatgridPresetName DARK_GREY = new HeatgridPresetName("dark_grey");
  public static final HeatgridPresetName PRIDE = new HeatgridPresetName("pride");
  public static final HeatgridPresetName GNBU = new HeatgridPresetName("GnBu");
  public static final HeatgridPresetName YLORRD = new HeatgridPresetName("YlOrRd");
  public static final HeatgridPresetName PURPLES = new HeatgridPresetName("Purples");
  public static final HeatgridPresetName BLUES = new HeatgridPresetName("Blues");
  public static final HeatgridPresetName ORANGES = new HeatgridPresetName("Oranges");
  public static final HeatgridPresetName REDS = new HeatgridPresetName("Reds");
  public static final HeatgridPresetName GREENS = new HeatgridPresetName("Greens");
  public static final HeatgridPresetName GREYS = new HeatgridPresetName("Greys");
  public static final HeatgridPresetName STATUS_ERRORS = new HeatgridPresetName("status_errors");
  public static final HeatgridPresetName STATUS_WARNINGS =
      new HeatgridPresetName("status_warnings");
  public static final HeatgridPresetName STATUS_SUCCESSES =
      new HeatgridPresetName("status_successes");
  public static final HeatgridPresetName PLASMA = new HeatgridPresetName("Plasma");
  public static final HeatgridPresetName VIRIDIS = new HeatgridPresetName("Viridis");
  public static final HeatgridPresetName DOGCAT = new HeatgridPresetName("dogcat");
  public static final HeatgridPresetName DATADOG16 = new HeatgridPresetName("datadog16");
  public static final HeatgridPresetName PA_CLASSIC_LINE =
      new HeatgridPresetName("pa_classic_line");
  public static final HeatgridPresetName PA_CLASSIC_AREA =
      new HeatgridPresetName("pa_classic_area");
  public static final HeatgridPresetName PA_CLASSIC_BARS =
      new HeatgridPresetName("pa_classic_bars");
  public static final HeatgridPresetName PA_DATADOG16 = new HeatgridPresetName("pa_datadog16");
  public static final HeatgridPresetName CLASSIC = new HeatgridPresetName("classic");

  HeatgridPresetName(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridPresetNameSerializer extends StdSerializer<HeatgridPresetName> {
    public HeatgridPresetNameSerializer(Class<HeatgridPresetName> t) {
      super(t);
    }

    public HeatgridPresetNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(HeatgridPresetName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridPresetName fromValue(String value) {
    return new HeatgridPresetName(value);
  }
}
