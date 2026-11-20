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
        HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848
            .HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848Serializer.class)
public class HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("discrete"));

  public static final HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848 DISCRETE =
      new HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848("discrete");

  HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848Serializer
      extends StdSerializer<HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848> {
    public HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848Serializer(
        Class<HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848> t) {
      super(t);
    }

    public HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848 fromValue(String value) {
    return new HeatgridDiscreteConfigAnyOfAnyOfItemMode4447618848(value);
  }
}
