/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
 * State that will trigger a monitor notification when the <code>notify_end_types</code> action
 * occurs.
 */
@JsonSerialize(
    using =
        DowntimeAttributeNotifyEndStateTypes.DowntimeAttributeNotifyEndStateTypesSerializer.class)
public class DowntimeAttributeNotifyEndStateTypes {

  public static final DowntimeAttributeNotifyEndStateTypes ALERT =
      new DowntimeAttributeNotifyEndStateTypes("alert");
  public static final DowntimeAttributeNotifyEndStateTypes NO_DATA =
      new DowntimeAttributeNotifyEndStateTypes("no data");
  public static final DowntimeAttributeNotifyEndStateTypes WARN =
      new DowntimeAttributeNotifyEndStateTypes("warn");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alert", "no data", "warn"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DowntimeAttributeNotifyEndStateTypes(String value) {
    this.value = value;
  }

  public static class DowntimeAttributeNotifyEndStateTypesSerializer
      extends StdSerializer<DowntimeAttributeNotifyEndStateTypes> {
    public DowntimeAttributeNotifyEndStateTypesSerializer(
        Class<DowntimeAttributeNotifyEndStateTypes> t) {
      super(t);
    }

    public DowntimeAttributeNotifyEndStateTypesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeAttributeNotifyEndStateTypes value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DowntimeAttributeNotifyEndStateTypes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DowntimeAttributeNotifyEndStateTypes) o).value);
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
  public static DowntimeAttributeNotifyEndStateTypes fromValue(String value) {
    return new DowntimeAttributeNotifyEndStateTypes(value);
  }
}
