/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
 * The legend display type for timeseries widgets. A value of <code>none</code> hides the legend
 * entirely; omitting the field lets the frontend choose automatically.
 */
@JsonSerialize(
    using = CreateSnapshotTimeseriesLegendType.CreateSnapshotTimeseriesLegendTypeSerializer.class)
public class CreateSnapshotTimeseriesLegendType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("compact", "expanded", "none"));

  public static final CreateSnapshotTimeseriesLegendType COMPACT =
      new CreateSnapshotTimeseriesLegendType("compact");
  public static final CreateSnapshotTimeseriesLegendType EXPANDED =
      new CreateSnapshotTimeseriesLegendType("expanded");
  public static final CreateSnapshotTimeseriesLegendType NONE =
      new CreateSnapshotTimeseriesLegendType("none");

  CreateSnapshotTimeseriesLegendType(String value) {
    super(value, allowedValues);
  }

  public static class CreateSnapshotTimeseriesLegendTypeSerializer
      extends StdSerializer<CreateSnapshotTimeseriesLegendType> {
    public CreateSnapshotTimeseriesLegendTypeSerializer(
        Class<CreateSnapshotTimeseriesLegendType> t) {
      super(t);
    }

    public CreateSnapshotTimeseriesLegendTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateSnapshotTimeseriesLegendType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateSnapshotTimeseriesLegendType fromValue(String value) {
    return new CreateSnapshotTimeseriesLegendType(value);
  }
}
