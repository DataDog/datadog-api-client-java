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
@JsonSerialize(using = DowntimeNotifyEndStateTypes.DowntimeNotifyEndStateTypesSerializer.class)
public class DowntimeNotifyEndStateTypes {

  public static final DowntimeNotifyEndStateTypes ALERT = new DowntimeNotifyEndStateTypes("alert");
  public static final DowntimeNotifyEndStateTypes NO_DATA =
      new DowntimeNotifyEndStateTypes("no data");
  public static final DowntimeNotifyEndStateTypes WARN = new DowntimeNotifyEndStateTypes("warn");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alert", "no data", "warn"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DowntimeNotifyEndStateTypes(String value) {
    this.value = value;
  }

  public static class DowntimeNotifyEndStateTypesSerializer
      extends StdSerializer<DowntimeNotifyEndStateTypes> {
    public DowntimeNotifyEndStateTypesSerializer(Class<DowntimeNotifyEndStateTypes> t) {
      super(t);
    }

    public DowntimeNotifyEndStateTypesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeNotifyEndStateTypes value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DowntimeNotifyEndStateTypes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DowntimeNotifyEndStateTypes) o).value);
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
  public static DowntimeNotifyEndStateTypes fromValue(String value) {
    return new DowntimeNotifyEndStateTypes(value);
  }
}
