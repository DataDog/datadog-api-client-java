/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Color used to render the annotation in the UI. */
@JsonSerialize(using = AnnotationColor.AnnotationColorSerializer.class)
public class AnnotationColor extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gray", "blue", "purple", "green", "yellow", "red"));

  public static final AnnotationColor GRAY = new AnnotationColor("gray");
  public static final AnnotationColor BLUE = new AnnotationColor("blue");
  public static final AnnotationColor PURPLE = new AnnotationColor("purple");
  public static final AnnotationColor GREEN = new AnnotationColor("green");
  public static final AnnotationColor YELLOW = new AnnotationColor("yellow");
  public static final AnnotationColor RED = new AnnotationColor("red");

  AnnotationColor(String value) {
    super(value, allowedValues);
  }

  public static class AnnotationColorSerializer extends StdSerializer<AnnotationColor> {
    public AnnotationColorSerializer(Class<AnnotationColor> t) {
      super(t);
    }

    public AnnotationColorSerializer() {
      this(null);
    }

    @Override
    public void serialize(AnnotationColor value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AnnotationColor fromValue(String value) {
    return new AnnotationColor(value);
  }
}
