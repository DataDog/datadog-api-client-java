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

/** The size of the graph. */
@JsonSerialize(using = NotebookGraphSize.NotebookGraphSizeSerializer.class)
public class NotebookGraphSize {

  public static final NotebookGraphSize EXTRA_SMALL = new NotebookGraphSize("xs");
  public static final NotebookGraphSize SMALL = new NotebookGraphSize("s");
  public static final NotebookGraphSize MEDIUM = new NotebookGraphSize("m");
  public static final NotebookGraphSize LARGE = new NotebookGraphSize("l");
  public static final NotebookGraphSize EXTRA_LARGE = new NotebookGraphSize("xl");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("xs", "s", "m", "l", "xl"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  NotebookGraphSize(String value) {
    this.value = value;
  }

  public static class NotebookGraphSizeSerializer extends StdSerializer<NotebookGraphSize> {
    public NotebookGraphSizeSerializer(Class<NotebookGraphSize> t) {
      super(t);
    }

    public NotebookGraphSizeSerializer() {
      this(null);
    }

    @Override
    public void serialize(NotebookGraphSize value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this NotebookGraphSize object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((NotebookGraphSize) o).value);
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
  public static NotebookGraphSize fromValue(String value) {
    return new NotebookGraphSize(value);
  }
}
