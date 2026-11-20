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
        ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800
            .ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800Serializer.class)
public class ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("none"));

  public static final ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800 NONE =
      new ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800("none");

  ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800(String value) {
    super(value, allowedValues);
  }

  public static class ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800Serializer
      extends StdSerializer<ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800> {
    public ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800Serializer(
        Class<ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800> t) {
      super(t);
    }

    public ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800 fromValue(String value) {
    return new ScatterPlotLegendTypeAnyOfAnyOfItemType4451196800(value);
  }
}
