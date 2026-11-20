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
        BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544
            .BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544Serializer.class)
public class BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("flat"));

  public static final BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544 FLAT =
      new BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544("flat");

  BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544(String value) {
    super(value, allowedValues);
  }

  public static class BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544Serializer
      extends StdSerializer<BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544> {
    public BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544Serializer(
        Class<BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544> t) {
      super(t);
    }

    public BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544 fromValue(
      String value) {
    return new BarChartBackendDefinitionStyleDisplayAnyOfAnyOfItemType4443916544(value);
  }
}
