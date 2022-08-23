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

/** Number of columns to display. */
@JsonSerialize(
    using = WidgetServiceSummaryDisplayFormat.WidgetServiceSummaryDisplayFormatSerializer.class)
public class WidgetServiceSummaryDisplayFormat {

  public static final WidgetServiceSummaryDisplayFormat ONE_COLUMN =
      new WidgetServiceSummaryDisplayFormat("one_column");
  public static final WidgetServiceSummaryDisplayFormat TWO_COLUMN =
      new WidgetServiceSummaryDisplayFormat("two_column");
  public static final WidgetServiceSummaryDisplayFormat THREE_COLUMN =
      new WidgetServiceSummaryDisplayFormat("three_column");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("one_column", "two_column", "three_column"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetServiceSummaryDisplayFormat(String value) {
    this.value = value;
  }

  public static class WidgetServiceSummaryDisplayFormatSerializer
      extends StdSerializer<WidgetServiceSummaryDisplayFormat> {
    public WidgetServiceSummaryDisplayFormatSerializer(Class<WidgetServiceSummaryDisplayFormat> t) {
      super(t);
    }

    public WidgetServiceSummaryDisplayFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WidgetServiceSummaryDisplayFormat value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this WidgetServiceSummaryDisplayFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetServiceSummaryDisplayFormat) o).value);
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
  public static WidgetServiceSummaryDisplayFormat fromValue(String value) {
    return new WidgetServiceSummaryDisplayFormat(value);
  }
}
