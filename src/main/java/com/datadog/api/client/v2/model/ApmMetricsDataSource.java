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

/** A data source for APM metrics queries. */
@JsonSerialize(using = ApmMetricsDataSource.ApmMetricsDataSourceSerializer.class)
public class ApmMetricsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("apm_metrics"));

  public static final ApmMetricsDataSource APM_METRICS = new ApmMetricsDataSource("apm_metrics");

  ApmMetricsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class ApmMetricsDataSourceSerializer extends StdSerializer<ApmMetricsDataSource> {
    public ApmMetricsDataSourceSerializer(Class<ApmMetricsDataSource> t) {
      super(t);
    }

    public ApmMetricsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApmMetricsDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmMetricsDataSource fromValue(String value) {
    return new ApmMetricsDataSource(value);
  }
}
