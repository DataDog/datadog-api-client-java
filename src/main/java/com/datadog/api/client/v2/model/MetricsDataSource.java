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

/** A data source that is powered by the Metrics platform. */
@JsonSerialize(using = MetricsDataSource.MetricsDataSourceSerializer.class)
public class MetricsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metrics", "cloud_cost"));

  public static final MetricsDataSource METRICS = new MetricsDataSource("metrics");
  public static final MetricsDataSource CLOUD_COST = new MetricsDataSource("cloud_cost");

  MetricsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class MetricsDataSourceSerializer extends StdSerializer<MetricsDataSource> {
    public MetricsDataSourceSerializer(Class<MetricsDataSource> t) {
      super(t);
    }

    public MetricsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(MetricsDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricsDataSource fromValue(String value) {
    return new MetricsDataSource(value);
  }
}
