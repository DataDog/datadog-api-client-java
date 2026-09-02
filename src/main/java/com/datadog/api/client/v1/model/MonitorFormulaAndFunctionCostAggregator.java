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

/** Aggregation methods for metric queries. */
@JsonSerialize(
    using =
        MonitorFormulaAndFunctionCostAggregator.MonitorFormulaAndFunctionCostAggregatorSerializer
            .class)
public class MonitorFormulaAndFunctionCostAggregator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "avg", "sum", "max", "min", "last", "area", "l2norm", "percentile", "stddev"));

  public static final MonitorFormulaAndFunctionCostAggregator AVG =
      new MonitorFormulaAndFunctionCostAggregator("avg");
  public static final MonitorFormulaAndFunctionCostAggregator SUM =
      new MonitorFormulaAndFunctionCostAggregator("sum");
  public static final MonitorFormulaAndFunctionCostAggregator MAX =
      new MonitorFormulaAndFunctionCostAggregator("max");
  public static final MonitorFormulaAndFunctionCostAggregator MIN =
      new MonitorFormulaAndFunctionCostAggregator("min");
  public static final MonitorFormulaAndFunctionCostAggregator LAST =
      new MonitorFormulaAndFunctionCostAggregator("last");
  public static final MonitorFormulaAndFunctionCostAggregator AREA =
      new MonitorFormulaAndFunctionCostAggregator("area");
  public static final MonitorFormulaAndFunctionCostAggregator L2NORM =
      new MonitorFormulaAndFunctionCostAggregator("l2norm");
  public static final MonitorFormulaAndFunctionCostAggregator PERCENTILE =
      new MonitorFormulaAndFunctionCostAggregator("percentile");
  public static final MonitorFormulaAndFunctionCostAggregator STDDEV =
      new MonitorFormulaAndFunctionCostAggregator("stddev");

  MonitorFormulaAndFunctionCostAggregator(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionCostAggregatorSerializer
      extends StdSerializer<MonitorFormulaAndFunctionCostAggregator> {
    public MonitorFormulaAndFunctionCostAggregatorSerializer(
        Class<MonitorFormulaAndFunctionCostAggregator> t) {
      super(t);
    }

    public MonitorFormulaAndFunctionCostAggregatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorFormulaAndFunctionCostAggregator value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionCostAggregator fromValue(String value) {
    return new MonitorFormulaAndFunctionCostAggregator(value);
  }
}
