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

/** Display mode for grouped funnel results. */
@JsonSerialize(using = FunnelGroupedDisplay.FunnelGroupedDisplaySerializer.class)
public class FunnelGroupedDisplay extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("stacked", "side_by_side"));

  public static final FunnelGroupedDisplay STACKED = new FunnelGroupedDisplay("stacked");
  public static final FunnelGroupedDisplay SIDE_BY_SIDE = new FunnelGroupedDisplay("side_by_side");

  FunnelGroupedDisplay(String value) {
    super(value, allowedValues);
  }

  public static class FunnelGroupedDisplaySerializer extends StdSerializer<FunnelGroupedDisplay> {
    public FunnelGroupedDisplaySerializer(Class<FunnelGroupedDisplay> t) {
      super(t);
    }

    public FunnelGroupedDisplaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FunnelGroupedDisplay value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FunnelGroupedDisplay fromValue(String value) {
    return new FunnelGroupedDisplay(value);
  }
}
