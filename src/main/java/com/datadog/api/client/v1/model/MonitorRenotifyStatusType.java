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

/** The different statuses for which renotification is supported. */
@JsonSerialize(using = MonitorRenotifyStatusType.MonitorRenotifyStatusTypeSerializer.class)
public class MonitorRenotifyStatusType {

  public static final MonitorRenotifyStatusType ALERT = new MonitorRenotifyStatusType("alert");
  public static final MonitorRenotifyStatusType WARN = new MonitorRenotifyStatusType("warn");
  public static final MonitorRenotifyStatusType NO_DATA = new MonitorRenotifyStatusType("no data");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alert", "warn", "no data"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  MonitorRenotifyStatusType(String value) {
    this.value = value;
  }

  public static class MonitorRenotifyStatusTypeSerializer
      extends StdSerializer<MonitorRenotifyStatusType> {
    public MonitorRenotifyStatusTypeSerializer(Class<MonitorRenotifyStatusType> t) {
      super(t);
    }

    public MonitorRenotifyStatusTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorRenotifyStatusType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this MonitorRenotifyStatusType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((MonitorRenotifyStatusType) o).value);
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
  public static MonitorRenotifyStatusType fromValue(String value) {
    return new MonitorRenotifyStatusType(value);
  }
}
