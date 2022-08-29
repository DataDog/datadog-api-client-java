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

/** Type of display to use for the request. */
@JsonSerialize(using = WidgetDisplayType.WidgetDisplayTypeSerializer.class)
public class WidgetDisplayType {

  public static final WidgetDisplayType AREA = new WidgetDisplayType("area");
  public static final WidgetDisplayType BARS = new WidgetDisplayType("bars");
  public static final WidgetDisplayType LINE = new WidgetDisplayType("line");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("area", "bars", "line"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetDisplayType(String value) {
    this.value = value;
  }

  public static class WidgetDisplayTypeSerializer extends StdSerializer<WidgetDisplayType> {
    public WidgetDisplayTypeSerializer(Class<WidgetDisplayType> t) {
      super(t);
    }

    public WidgetDisplayTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetDisplayType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this WidgetDisplayType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetDisplayType) o).value);
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
  public static WidgetDisplayType fromValue(String value) {
    return new WidgetDisplayType(value);
  }
}
