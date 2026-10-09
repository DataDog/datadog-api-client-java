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

/** Display groups as flat rows. */
@JsonSerialize(using = HeatgridNestingDisplay.HeatgridNestingDisplaySerializer.class)
public class HeatgridNestingDisplay extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("flat"));

  public static final HeatgridNestingDisplay FLAT = new HeatgridNestingDisplay("flat");

  HeatgridNestingDisplay(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridNestingDisplaySerializer
      extends StdSerializer<HeatgridNestingDisplay> {
    public HeatgridNestingDisplaySerializer(Class<HeatgridNestingDisplay> t) {
      super(t);
    }

    public HeatgridNestingDisplaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridNestingDisplay value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridNestingDisplay fromValue(String value) {
    return new HeatgridNestingDisplay(value);
  }
}
