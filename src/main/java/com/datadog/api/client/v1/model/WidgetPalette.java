/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Color palette to apply.</p>
 */
@JsonSerialize(using = WidgetPalette.WidgetPaletteSerializer.class)
public class WidgetPalette extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("blue", "custom_bg", "custom_image", "custom_text", "gray_on_white", "grey", "green", "orange", "red", "red_on_white", "white_on_gray", "white_on_green", "green_on_white", "white_on_red", "white_on_yellow", "yellow_on_white", "black_on_light_yellow", "black_on_light_green", "black_on_light_red"));

  public static final WidgetPalette BLUE = new WidgetPalette("blue");
  public static final WidgetPalette CUSTOM_BACKGROUND = new WidgetPalette("custom_bg");
  public static final WidgetPalette CUSTOM_IMAGE = new WidgetPalette("custom_image");
  public static final WidgetPalette CUSTOM_TEXT = new WidgetPalette("custom_text");
  public static final WidgetPalette GRAY_ON_WHITE = new WidgetPalette("gray_on_white");
  public static final WidgetPalette GREY = new WidgetPalette("grey");
  public static final WidgetPalette GREEN = new WidgetPalette("green");
  public static final WidgetPalette ORANGE = new WidgetPalette("orange");
  public static final WidgetPalette RED = new WidgetPalette("red");
  public static final WidgetPalette RED_ON_WHITE = new WidgetPalette("red_on_white");
  public static final WidgetPalette WHITE_ON_GRAY = new WidgetPalette("white_on_gray");
  public static final WidgetPalette WHITE_ON_GREEN = new WidgetPalette("white_on_green");
  public static final WidgetPalette GREEN_ON_WHITE = new WidgetPalette("green_on_white");
  public static final WidgetPalette WHITE_ON_RED = new WidgetPalette("white_on_red");
  public static final WidgetPalette WHITE_ON_YELLOW = new WidgetPalette("white_on_yellow");
  public static final WidgetPalette YELLOW_ON_WHITE = new WidgetPalette("yellow_on_white");
  public static final WidgetPalette BLACK_ON_LIGHT_YELLOW = new WidgetPalette("black_on_light_yellow");
  public static final WidgetPalette BLACK_ON_LIGHT_GREEN = new WidgetPalette("black_on_light_green");
  public static final WidgetPalette BLACK_ON_LIGHT_RED = new WidgetPalette("black_on_light_red");


  WidgetPalette(String value) {
    super(value, allowedValues);
  }

  public static class WidgetPaletteSerializer extends StdSerializer<WidgetPalette> {
      public WidgetPaletteSerializer(Class<WidgetPalette> t) {
          super(t);
      }

      public WidgetPaletteSerializer() {
          this(null);
      }

      @Override
      public void serialize(WidgetPalette value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static WidgetPalette fromValue(String value) {
    return new WidgetPalette(value);
  }
}
