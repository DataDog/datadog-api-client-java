/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

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

/** Size to use to display an event. */
@JsonSerialize(using = WidgetEventSize.WidgetEventSizeSerializer.class)
public class WidgetEventSize {

  public static final WidgetEventSize SMALL = new WidgetEventSize("s");
  public static final WidgetEventSize LARGE = new WidgetEventSize("l");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("s", "l"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetEventSize(String value) {
    this.value = value;
  }

  public static class WidgetEventSizeSerializer extends StdSerializer<WidgetEventSize> {
    public WidgetEventSizeSerializer(Class<WidgetEventSize> t) {
      super(t);
    }

    public WidgetEventSizeSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetEventSize value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this WidgetEventSize object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetEventSize) o).value);
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
  public static WidgetEventSize fromValue(String value) {
    return new WidgetEventSize(value);
  }
}
