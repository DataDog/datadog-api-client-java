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
   * <p>Aggregator for metrics queries.</p>
 */
@JsonSerialize(using = MonitorFormulaAndFunctionMetricsAggregator.MonitorFormulaAndFunctionMetricsAggregatorSerializer.class)
public class MonitorFormulaAndFunctionMetricsAggregator extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("avg", "min", "max", "sum", "last", "mean", "area", "l2norm", "percentile", "stddev", "count_unique"));

  public static final MonitorFormulaAndFunctionMetricsAggregator AVG = new MonitorFormulaAndFunctionMetricsAggregator("avg");
  public static final MonitorFormulaAndFunctionMetricsAggregator MIN = new MonitorFormulaAndFunctionMetricsAggregator("min");
  public static final MonitorFormulaAndFunctionMetricsAggregator MAX = new MonitorFormulaAndFunctionMetricsAggregator("max");
  public static final MonitorFormulaAndFunctionMetricsAggregator SUM = new MonitorFormulaAndFunctionMetricsAggregator("sum");
  public static final MonitorFormulaAndFunctionMetricsAggregator LAST = new MonitorFormulaAndFunctionMetricsAggregator("last");
  public static final MonitorFormulaAndFunctionMetricsAggregator MEAN = new MonitorFormulaAndFunctionMetricsAggregator("mean");
  public static final MonitorFormulaAndFunctionMetricsAggregator AREA = new MonitorFormulaAndFunctionMetricsAggregator("area");
  public static final MonitorFormulaAndFunctionMetricsAggregator L2NORM = new MonitorFormulaAndFunctionMetricsAggregator("l2norm");
  public static final MonitorFormulaAndFunctionMetricsAggregator PERCENTILE = new MonitorFormulaAndFunctionMetricsAggregator("percentile");
  public static final MonitorFormulaAndFunctionMetricsAggregator STDDEV = new MonitorFormulaAndFunctionMetricsAggregator("stddev");
  public static final MonitorFormulaAndFunctionMetricsAggregator COUNT_UNIQUE = new MonitorFormulaAndFunctionMetricsAggregator("count_unique");


  MonitorFormulaAndFunctionMetricsAggregator(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionMetricsAggregatorSerializer extends StdSerializer<MonitorFormulaAndFunctionMetricsAggregator> {
      public MonitorFormulaAndFunctionMetricsAggregatorSerializer(Class<MonitorFormulaAndFunctionMetricsAggregator> t) {
          super(t);
      }

      public MonitorFormulaAndFunctionMetricsAggregatorSerializer() {
          this(null);
      }

      @Override
      public void serialize(MonitorFormulaAndFunctionMetricsAggregator value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionMetricsAggregator fromValue(String value) {
    return new MonitorFormulaAndFunctionMetricsAggregator(value);
  }
}
