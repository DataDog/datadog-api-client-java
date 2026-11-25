/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184
            .BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184Serializer.class)
public class BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184 SCALAR =
      new BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184("scalar");

  BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184(String value) {
    super(value, allowedValues);
  }

  public static class BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184Serializer
      extends StdSerializer<BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184> {
    public BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184Serializer(
        Class<BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184> t) {
      super(t);
    }

    public BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184 fromValue(
      String value) {
    return new BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443921184(value);
  }
}
