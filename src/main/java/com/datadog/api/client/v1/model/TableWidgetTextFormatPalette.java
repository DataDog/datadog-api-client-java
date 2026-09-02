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

/** Color-on-color palette to highlight replaced text. */
@JsonSerialize(using = TableWidgetTextFormatPalette.TableWidgetTextFormatPaletteSerializer.class)
public class TableWidgetTextFormatPalette extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "white_on_red",
              "white_on_yellow",
              "white_on_green",
              "black_on_light_red",
              "black_on_light_yellow",
              "black_on_light_green",
              "red_on_white",
              "yellow_on_white",
              "green_on_white",
              "custom_bg",
              "custom_text"));

  public static final TableWidgetTextFormatPalette WHITE_ON_RED =
      new TableWidgetTextFormatPalette("white_on_red");
  public static final TableWidgetTextFormatPalette WHITE_ON_YELLOW =
      new TableWidgetTextFormatPalette("white_on_yellow");
  public static final TableWidgetTextFormatPalette WHITE_ON_GREEN =
      new TableWidgetTextFormatPalette("white_on_green");
  public static final TableWidgetTextFormatPalette BLACK_ON_LIGHT_RED =
      new TableWidgetTextFormatPalette("black_on_light_red");
  public static final TableWidgetTextFormatPalette BLACK_ON_LIGHT_YELLOW =
      new TableWidgetTextFormatPalette("black_on_light_yellow");
  public static final TableWidgetTextFormatPalette BLACK_ON_LIGHT_GREEN =
      new TableWidgetTextFormatPalette("black_on_light_green");
  public static final TableWidgetTextFormatPalette RED_ON_WHITE =
      new TableWidgetTextFormatPalette("red_on_white");
  public static final TableWidgetTextFormatPalette YELLOW_ON_WHITE =
      new TableWidgetTextFormatPalette("yellow_on_white");
  public static final TableWidgetTextFormatPalette GREEN_ON_WHITE =
      new TableWidgetTextFormatPalette("green_on_white");
  public static final TableWidgetTextFormatPalette CUSTOM_BG =
      new TableWidgetTextFormatPalette("custom_bg");
  public static final TableWidgetTextFormatPalette CUSTOM_TEXT =
      new TableWidgetTextFormatPalette("custom_text");

  TableWidgetTextFormatPalette(String value) {
    super(value, allowedValues);
  }

  public static class TableWidgetTextFormatPaletteSerializer
      extends StdSerializer<TableWidgetTextFormatPalette> {
    public TableWidgetTextFormatPaletteSerializer(Class<TableWidgetTextFormatPalette> t) {
      super(t);
    }

    public TableWidgetTextFormatPaletteSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TableWidgetTextFormatPalette value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TableWidgetTextFormatPalette fromValue(String value) {
    return new TableWidgetTextFormatPalette(value);
  }
}
