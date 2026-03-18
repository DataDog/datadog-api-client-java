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

/** Metrics data source. */
@JsonSerialize(
    using = GuidedTableMetricsQueryDataSource.GuidedTableMetricsQueryDataSourceSerializer.class)
public class GuidedTableMetricsQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metrics", "cloud_cost"));

  public static final GuidedTableMetricsQueryDataSource METRICS =
      new GuidedTableMetricsQueryDataSource("metrics");
  public static final GuidedTableMetricsQueryDataSource CLOUD_COST =
      new GuidedTableMetricsQueryDataSource("cloud_cost");

  GuidedTableMetricsQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class GuidedTableMetricsQueryDataSourceSerializer
      extends StdSerializer<GuidedTableMetricsQueryDataSource> {
    public GuidedTableMetricsQueryDataSourceSerializer(Class<GuidedTableMetricsQueryDataSource> t) {
      super(t);
    }

    public GuidedTableMetricsQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTableMetricsQueryDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuidedTableMetricsQueryDataSource fromValue(String value) {
    return new GuidedTableMetricsQueryDataSource(value);
  }
}
