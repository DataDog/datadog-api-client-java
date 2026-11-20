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
        HeatgridGradientConfigAnyOfAnyOfItemSource4447622208
            .HeatgridGradientConfigAnyOfAnyOfItemSource4447622208Serializer.class)
public class HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("preset"));

  public static final HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 PRESET =
      new HeatgridGradientConfigAnyOfAnyOfItemSource4447622208("preset");

  HeatgridGradientConfigAnyOfAnyOfItemSource4447622208(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridGradientConfigAnyOfAnyOfItemSource4447622208Serializer
      extends StdSerializer<HeatgridGradientConfigAnyOfAnyOfItemSource4447622208> {
    public HeatgridGradientConfigAnyOfAnyOfItemSource4447622208Serializer(
        Class<HeatgridGradientConfigAnyOfAnyOfItemSource4447622208> t) {
      super(t);
    }

    public HeatgridGradientConfigAnyOfAnyOfItemSource4447622208Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridGradientConfigAnyOfAnyOfItemSource4447622208 fromValue(String value) {
    return new HeatgridGradientConfigAnyOfAnyOfItemSource4447622208(value);
  }
}
