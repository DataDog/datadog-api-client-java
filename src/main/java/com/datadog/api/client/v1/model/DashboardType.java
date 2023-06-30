/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The type of the associated private dashboard. */
@JsonSerialize(using = DashboardType.DashboardTypeSerializer.class)
public class DashboardType extends ModelEnum<String> {

  public static final DashboardType CUSTOM_TIMEBOARD = new DashboardType("custom_timeboard");
  public static final DashboardType CUSTOM_SCREENBOARD = new DashboardType("custom_screenboard");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom_timeboard", "custom_screenboard"));

  DashboardType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class DashboardTypeSerializer extends StdSerializer<DashboardType> {
    public DashboardTypeSerializer(Class<DashboardType> t) {
      super(t);
    }

    public DashboardTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DashboardType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardType fromValue(String value) {
    return new DashboardType(value);
  }
}
