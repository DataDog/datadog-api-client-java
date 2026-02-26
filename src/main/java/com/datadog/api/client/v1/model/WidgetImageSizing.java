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
   * <p>How to size the image on the widget. The values are based on the image <code>object-fit</code> CSS properties.
   * <strong>Note</strong>: <code>zoom</code>, <code>fit</code> and <code>center</code> values are deprecated.</p>
 */
@JsonSerialize(using = WidgetImageSizing.WidgetImageSizingSerializer.class)
public class WidgetImageSizing extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("fill", "contain", "cover", "none", "scale-down", "zoom", "fit", "center"));

  public static final WidgetImageSizing FILL = new WidgetImageSizing("fill");
  public static final WidgetImageSizing CONTAIN = new WidgetImageSizing("contain");
  public static final WidgetImageSizing COVER = new WidgetImageSizing("cover");
  public static final WidgetImageSizing NONE = new WidgetImageSizing("none");
  public static final WidgetImageSizing SCALEDOWN = new WidgetImageSizing("scale-down");
  public static final WidgetImageSizing ZOOM = new WidgetImageSizing("zoom");
  public static final WidgetImageSizing FIT = new WidgetImageSizing("fit");
  public static final WidgetImageSizing CENTER = new WidgetImageSizing("center");


  WidgetImageSizing(String value) {
    super(value, allowedValues);
  }

  public static class WidgetImageSizingSerializer extends StdSerializer<WidgetImageSizing> {
      public WidgetImageSizingSerializer(Class<WidgetImageSizing> t) {
          super(t);
      }

      public WidgetImageSizingSerializer() {
          this(null);
      }

      @Override
      public void serialize(WidgetImageSizing value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static WidgetImageSizing fromValue(String value) {
    return new WidgetImageSizing(value);
  }
}
