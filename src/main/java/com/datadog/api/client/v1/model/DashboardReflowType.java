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
 * Reflow type for a <strong>new dashboard layout</strong> dashboard. Set this only when layout type
 * is 'ordered'. If set to 'fixed', the dashboard expects all widgets to have a layout, and if it's
 * set to 'auto', widgets should not have layouts.
 */
@JsonSerialize(using = DashboardReflowType.DashboardReflowTypeSerializer.class)
public class DashboardReflowType {

  public static final DashboardReflowType AUTO = new DashboardReflowType("auto");
  public static final DashboardReflowType FIXED = new DashboardReflowType("fixed");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "fixed"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  DashboardReflowType(String value) {
    this.value = value;
  }

  public static class DashboardReflowTypeSerializer extends StdSerializer<DashboardReflowType> {
    public DashboardReflowTypeSerializer(Class<DashboardReflowType> t) {
      super(t);
    }

    public DashboardReflowTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardReflowType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this DashboardReflowType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((DashboardReflowType) o).value);
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
  public static DashboardReflowType fromValue(String value) {
    return new DashboardReflowType(value);
  }
}
