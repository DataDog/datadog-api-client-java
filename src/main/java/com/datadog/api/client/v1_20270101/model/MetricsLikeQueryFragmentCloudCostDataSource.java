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
        MetricsLikeQueryFragmentCloudCostDataSource
            .MetricsLikeQueryFragmentCloudCostDataSourceSerializer.class)
public class MetricsLikeQueryFragmentCloudCostDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("cloud_cost"));

  public static final MetricsLikeQueryFragmentCloudCostDataSource CLOUD_COST =
      new MetricsLikeQueryFragmentCloudCostDataSource("cloud_cost");

  MetricsLikeQueryFragmentCloudCostDataSource(String value) {
    super(value, allowedValues);
  }

  public static class MetricsLikeQueryFragmentCloudCostDataSourceSerializer
      extends StdSerializer<MetricsLikeQueryFragmentCloudCostDataSource> {
    public MetricsLikeQueryFragmentCloudCostDataSourceSerializer(
        Class<MetricsLikeQueryFragmentCloudCostDataSource> t) {
      super(t);
    }

    public MetricsLikeQueryFragmentCloudCostDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricsLikeQueryFragmentCloudCostDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricsLikeQueryFragmentCloudCostDataSource fromValue(String value) {
    return new MetricsLikeQueryFragmentCloudCostDataSource(value);
  }
}
