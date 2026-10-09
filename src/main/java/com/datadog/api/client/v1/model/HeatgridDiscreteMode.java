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

/** Use discrete color thresholds. */
@JsonSerialize(using = HeatgridDiscreteMode.HeatgridDiscreteModeSerializer.class)
public class HeatgridDiscreteMode extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("discrete"));

  public static final HeatgridDiscreteMode DISCRETE = new HeatgridDiscreteMode("discrete");

  HeatgridDiscreteMode(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridDiscreteModeSerializer extends StdSerializer<HeatgridDiscreteMode> {
    public HeatgridDiscreteModeSerializer(Class<HeatgridDiscreteMode> t) {
      super(t);
    }

    public HeatgridDiscreteModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridDiscreteMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridDiscreteMode fromValue(String value) {
    return new HeatgridDiscreteMode(value);
  }
}
