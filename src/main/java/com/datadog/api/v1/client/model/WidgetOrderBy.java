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

/** What to order by. */
@JsonSerialize(using = WidgetOrderBy.WidgetOrderBySerializer.class)
public class WidgetOrderBy {

  public static final WidgetOrderBy CHANGE = new WidgetOrderBy("change");
  public static final WidgetOrderBy NAME = new WidgetOrderBy("name");
  public static final WidgetOrderBy PRESENT = new WidgetOrderBy("present");
  public static final WidgetOrderBy PAST = new WidgetOrderBy("past");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("change", "name", "present", "past"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetOrderBy(String value) {
    this.value = value;
  }

  public static class WidgetOrderBySerializer extends StdSerializer<WidgetOrderBy> {
    public WidgetOrderBySerializer(Class<WidgetOrderBy> t) {
      super(t);
    }

    public WidgetOrderBySerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetOrderBy value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this WidgetOrderBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetOrderBy) o).value);
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
  public static WidgetOrderBy fromValue(String value) {
    return new WidgetOrderBy(value);
  }
}
