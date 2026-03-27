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

/** Data source for metrics queries. */
@JsonSerialize(
    using =
        MonitorFormulaAndFunctionMetricsDataSource
            .MonitorFormulaAndFunctionMetricsDataSourceSerializer.class)
public class MonitorFormulaAndFunctionMetricsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metrics", "cloud_cost", "datadog_usage"));

  public static final MonitorFormulaAndFunctionMetricsDataSource METRICS =
      new MonitorFormulaAndFunctionMetricsDataSource("metrics");
  public static final MonitorFormulaAndFunctionMetricsDataSource CLOUD_COST =
      new MonitorFormulaAndFunctionMetricsDataSource("cloud_cost");
  public static final MonitorFormulaAndFunctionMetricsDataSource DATADOG_USAGE =
      new MonitorFormulaAndFunctionMetricsDataSource("datadog_usage");

  MonitorFormulaAndFunctionMetricsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionMetricsDataSourceSerializer
      extends StdSerializer<MonitorFormulaAndFunctionMetricsDataSource> {
    public MonitorFormulaAndFunctionMetricsDataSourceSerializer(
        Class<MonitorFormulaAndFunctionMetricsDataSource> t) {
      super(t);
    }

    public MonitorFormulaAndFunctionMetricsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorFormulaAndFunctionMetricsDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionMetricsDataSource fromValue(String value) {
    return new MonitorFormulaAndFunctionMetricsDataSource(value);
  }
}
