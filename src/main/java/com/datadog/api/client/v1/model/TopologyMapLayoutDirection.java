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

/**
 * Direction of ranks. For example, <code>top-to-bottom</code> places first-rank nodes at the top
 * and last-rank nodes at the bottom.
 */
@JsonSerialize(using = TopologyMapLayoutDirection.TopologyMapLayoutDirectionSerializer.class)
public class TopologyMapLayoutDirection extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("top-to-bottom", "bottom-to-top", "left-to-right", "right-to-left"));

  public static final TopologyMapLayoutDirection TOP_TO_BOTTOM =
      new TopologyMapLayoutDirection("top-to-bottom");
  public static final TopologyMapLayoutDirection BOTTOM_TO_TOP =
      new TopologyMapLayoutDirection("bottom-to-top");
  public static final TopologyMapLayoutDirection LEFT_TO_RIGHT =
      new TopologyMapLayoutDirection("left-to-right");
  public static final TopologyMapLayoutDirection RIGHT_TO_LEFT =
      new TopologyMapLayoutDirection("right-to-left");

  TopologyMapLayoutDirection(String value) {
    super(value, allowedValues);
  }

  public static class TopologyMapLayoutDirectionSerializer
      extends StdSerializer<TopologyMapLayoutDirection> {
    public TopologyMapLayoutDirectionSerializer(Class<TopologyMapLayoutDirection> t) {
      super(t);
    }

    public TopologyMapLayoutDirectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyMapLayoutDirection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TopologyMapLayoutDirection fromValue(String value) {
    return new TopologyMapLayoutDirection(value);
  }
}
