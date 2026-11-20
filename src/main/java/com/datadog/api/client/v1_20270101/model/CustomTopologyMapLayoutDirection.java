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
    using = CustomTopologyMapLayoutDirection.CustomTopologyMapLayoutDirectionSerializer.class)
public class CustomTopologyMapLayoutDirection extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("top-to-bottom", "bottom-to-top", "left-to-right", "right-to-left"));

  public static final CustomTopologyMapLayoutDirection TOP_TO_BOTTOM =
      new CustomTopologyMapLayoutDirection("top-to-bottom");
  public static final CustomTopologyMapLayoutDirection BOTTOM_TO_TOP =
      new CustomTopologyMapLayoutDirection("bottom-to-top");
  public static final CustomTopologyMapLayoutDirection LEFT_TO_RIGHT =
      new CustomTopologyMapLayoutDirection("left-to-right");
  public static final CustomTopologyMapLayoutDirection RIGHT_TO_LEFT =
      new CustomTopologyMapLayoutDirection("right-to-left");

  CustomTopologyMapLayoutDirection(String value) {
    super(value, allowedValues);
  }

  public static class CustomTopologyMapLayoutDirectionSerializer
      extends StdSerializer<CustomTopologyMapLayoutDirection> {
    public CustomTopologyMapLayoutDirectionSerializer(Class<CustomTopologyMapLayoutDirection> t) {
      super(t);
    }

    public CustomTopologyMapLayoutDirectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomTopologyMapLayoutDirection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomTopologyMapLayoutDirection fromValue(String value) {
    return new CustomTopologyMapLayoutDirection(value);
  }
}
