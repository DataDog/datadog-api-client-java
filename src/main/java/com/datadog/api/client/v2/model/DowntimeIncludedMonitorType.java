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

/** Monitor resource type. */
@JsonSerialize(using = DowntimeIncludedMonitorType.DowntimeIncludedMonitorTypeSerializer.class)
public class DowntimeIncludedMonitorType {

  public static final DowntimeIncludedMonitorType MONITORS =
      new DowntimeIncludedMonitorType("monitors");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("monitors"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DowntimeIncludedMonitorType(String value) {
    this.value = value;
  }

  public static class DowntimeIncludedMonitorTypeSerializer
      extends StdSerializer<DowntimeIncludedMonitorType> {
    public DowntimeIncludedMonitorTypeSerializer(Class<DowntimeIncludedMonitorType> t) {
      super(t);
    }

    public DowntimeIncludedMonitorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeIncludedMonitorType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DowntimeIncludedMonitorType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DowntimeIncludedMonitorType) o).value);
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
  public static DowntimeIncludedMonitorType fromValue(String value) {
    return new DowntimeIncludedMonitorType(value);
  }
}
