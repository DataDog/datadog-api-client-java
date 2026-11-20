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
        BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend
            .BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegendSerializer.class)
public class BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "inline", "automatic"));

  public static final BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend NONE =
      new BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend("none");
  public static final BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend INLINE =
      new BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend("inline");
  public static final BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend AUTOMATIC =
      new BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend("automatic");

  BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend(String value) {
    super(value, allowedValues);
  }

  public static class BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegendSerializer
      extends StdSerializer<BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend> {
    public BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegendSerializer(
        Class<BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend> t) {
      super(t);
    }

    public BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegendSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend fromValue(String value) {
    return new BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemLegend(value);
  }
}
