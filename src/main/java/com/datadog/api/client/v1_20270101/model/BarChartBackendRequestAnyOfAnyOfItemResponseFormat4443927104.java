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
        BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104
            .BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104Serializer.class)
public class BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104 SCALAR =
      new BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104("scalar");

  BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104(String value) {
    super(value, allowedValues);
  }

  public static class BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104Serializer
      extends StdSerializer<BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104> {
    public BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104Serializer(
        Class<BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104> t) {
      super(t);
    }

    public BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104 fromValue(
      String value) {
    return new BarChartBackendRequestAnyOfAnyOfItemResponseFormat4443927104(value);
  }
}
