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
        TreeDataProjectionTreemapDimensionsItemsDimension
            .TreeDataProjectionTreemapDimensionsItemsDimensionSerializer.class)
public class TreeDataProjectionTreemapDimensionsItemsDimension extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("group", "value"));

  public static final TreeDataProjectionTreemapDimensionsItemsDimension GROUP =
      new TreeDataProjectionTreemapDimensionsItemsDimension("group");
  public static final TreeDataProjectionTreemapDimensionsItemsDimension VALUE =
      new TreeDataProjectionTreemapDimensionsItemsDimension("value");

  TreeDataProjectionTreemapDimensionsItemsDimension(String value) {
    super(value, allowedValues);
  }

  public static class TreeDataProjectionTreemapDimensionsItemsDimensionSerializer
      extends StdSerializer<TreeDataProjectionTreemapDimensionsItemsDimension> {
    public TreeDataProjectionTreemapDimensionsItemsDimensionSerializer(
        Class<TreeDataProjectionTreemapDimensionsItemsDimension> t) {
      super(t);
    }

    public TreeDataProjectionTreemapDimensionsItemsDimensionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TreeDataProjectionTreemapDimensionsItemsDimension value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TreeDataProjectionTreemapDimensionsItemsDimension fromValue(String value) {
    return new TreeDataProjectionTreemapDimensionsItemsDimension(value);
  }
}
