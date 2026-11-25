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
@JsonSerialize(using = ImageSizing.ImageSizingSerializer.class)
public class ImageSizing extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("none", "center", "fill", "contain", "cover", "scale-down", "zoom", "fit"));

  public static final ImageSizing NONE = new ImageSizing("none");
  public static final ImageSizing CENTER = new ImageSizing("center");
  public static final ImageSizing FILL = new ImageSizing("fill");
  public static final ImageSizing CONTAIN = new ImageSizing("contain");
  public static final ImageSizing COVER = new ImageSizing("cover");
  public static final ImageSizing SCALE_DOWN = new ImageSizing("scale-down");
  public static final ImageSizing ZOOM = new ImageSizing("zoom");
  public static final ImageSizing FIT = new ImageSizing("fit");

  ImageSizing(String value) {
    super(value, allowedValues);
  }

  public static class ImageSizingSerializer extends StdSerializer<ImageSizing> {
    public ImageSizingSerializer(Class<ImageSizing> t) {
      super(t);
    }

    public ImageSizingSerializer() {
      this(null);
    }

    @Override
    public void serialize(ImageSizing value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ImageSizing fromValue(String value) {
    return new ImageSizing(value);
  }
}
