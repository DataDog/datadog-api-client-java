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

/** Data source for cost queries. */
@JsonSerialize(
    using =
        MonitorFormulaAndFunctionCostDataSource.MonitorFormulaAndFunctionCostDataSourceSerializer
            .class)
public class MonitorFormulaAndFunctionCostDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metrics", "cloud_cost", "datadog_usage"));

  public static final MonitorFormulaAndFunctionCostDataSource METRICS =
      new MonitorFormulaAndFunctionCostDataSource("metrics");
  public static final MonitorFormulaAndFunctionCostDataSource CLOUD_COST =
      new MonitorFormulaAndFunctionCostDataSource("cloud_cost");
  public static final MonitorFormulaAndFunctionCostDataSource DATADOG_USAGE =
      new MonitorFormulaAndFunctionCostDataSource("datadog_usage");

  MonitorFormulaAndFunctionCostDataSource(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionCostDataSourceSerializer
      extends StdSerializer<MonitorFormulaAndFunctionCostDataSource> {
    public MonitorFormulaAndFunctionCostDataSourceSerializer(
        Class<MonitorFormulaAndFunctionCostDataSource> t) {
      super(t);
    }

    public MonitorFormulaAndFunctionCostDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorFormulaAndFunctionCostDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionCostDataSource fromValue(String value) {
    return new MonitorFormulaAndFunctionCostDataSource(value);
  }
}
