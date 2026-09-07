/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Aggregation methods for metric queries.</p>
 */
@JsonSerialize(using = MonitorFormulaAndFunctionCostAggregator.MonitorFormulaAndFunctionCostAggregatorSerializer.class)
public class MonitorFormulaAndFunctionCostAggregator extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("avg", "sum", "max", "min", "last", "area", "l2norm", "percentile", "stddev"));

  public static final MonitorFormulaAndFunctionCostAggregator AVG = new MonitorFormulaAndFunctionCostAggregator("avg");
  public static final MonitorFormulaAndFunctionCostAggregator SUM = new MonitorFormulaAndFunctionCostAggregator("sum");
  public static final MonitorFormulaAndFunctionCostAggregator MAX = new MonitorFormulaAndFunctionCostAggregator("max");
  public static final MonitorFormulaAndFunctionCostAggregator MIN = new MonitorFormulaAndFunctionCostAggregator("min");
  public static final MonitorFormulaAndFunctionCostAggregator LAST = new MonitorFormulaAndFunctionCostAggregator("last");
  public static final MonitorFormulaAndFunctionCostAggregator AREA = new MonitorFormulaAndFunctionCostAggregator("area");
  public static final MonitorFormulaAndFunctionCostAggregator L2NORM = new MonitorFormulaAndFunctionCostAggregator("l2norm");
  public static final MonitorFormulaAndFunctionCostAggregator PERCENTILE = new MonitorFormulaAndFunctionCostAggregator("percentile");
  public static final MonitorFormulaAndFunctionCostAggregator STDDEV = new MonitorFormulaAndFunctionCostAggregator("stddev");


  MonitorFormulaAndFunctionCostAggregator(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionCostAggregatorSerializer extends StdSerializer<MonitorFormulaAndFunctionCostAggregator> {
      public MonitorFormulaAndFunctionCostAggregatorSerializer(Class<MonitorFormulaAndFunctionCostAggregator> t) {
          super(t);
      }

      public MonitorFormulaAndFunctionCostAggregatorSerializer() {
          this(null);
      }

      @Override
      public void serialize(MonitorFormulaAndFunctionCostAggregator value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionCostAggregator fromValue(String value) {
    return new MonitorFormulaAndFunctionCostAggregator(value);
  }
}
