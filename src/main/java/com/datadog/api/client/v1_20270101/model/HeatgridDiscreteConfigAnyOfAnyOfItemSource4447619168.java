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
        HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168
            .HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168Serializer.class)
public class HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("preset"));

  public static final HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168 PRESET =
      new HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168("preset");

  HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168Serializer
      extends StdSerializer<HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168> {
    public HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168Serializer(
        Class<HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168> t) {
      super(t);
    }

    public HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168 fromValue(String value) {
    return new HeatgridDiscreteConfigAnyOfAnyOfItemSource4447619168(value);
  }
}
