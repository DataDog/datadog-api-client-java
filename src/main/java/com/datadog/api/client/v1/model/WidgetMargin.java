/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Size of the margins around the image. <strong>Note</strong>: <code>small</code> and <code>large
 * </code> values are deprecated.
 */
@JsonSerialize(using = WidgetMargin.WidgetMarginSerializer.class)
public class WidgetMargin {

  public static final WidgetMargin SM = new WidgetMargin("sm");
  public static final WidgetMargin MD = new WidgetMargin("md");
  public static final WidgetMargin LG = new WidgetMargin("lg");
  public static final WidgetMargin SMALL = new WidgetMargin("small");
  public static final WidgetMargin LARGE = new WidgetMargin("large");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sm", "md", "lg", "small", "large"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetMargin(String value) {
    this.value = value;
  }

  public static class WidgetMarginSerializer extends StdSerializer<WidgetMargin> {
    public WidgetMarginSerializer(Class<WidgetMargin> t) {
      super(t);
    }

    public WidgetMarginSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetMargin value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this WidgetMargin object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetMargin) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WidgetMargin fromValue(String value) {
    return new WidgetMargin(value);
  }
}
