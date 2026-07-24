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

/** A single aggregation function used to query a metric. */
@JsonSerialize(using = MetricAvailableAggrFunctions.MetricAvailableAggrFunctionsSerializer.class)
public class MetricAvailableAggrFunctions extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "min", "max", "sum", "count", "stddev", "pxx"));

  public static final MetricAvailableAggrFunctions AVG = new MetricAvailableAggrFunctions("avg");
  public static final MetricAvailableAggrFunctions MIN = new MetricAvailableAggrFunctions("min");
  public static final MetricAvailableAggrFunctions MAX = new MetricAvailableAggrFunctions("max");
  public static final MetricAvailableAggrFunctions SUM = new MetricAvailableAggrFunctions("sum");
  public static final MetricAvailableAggrFunctions COUNT =
      new MetricAvailableAggrFunctions("count");
  public static final MetricAvailableAggrFunctions STDDEV =
      new MetricAvailableAggrFunctions("stddev");
  public static final MetricAvailableAggrFunctions PXX = new MetricAvailableAggrFunctions("pxx");

  MetricAvailableAggrFunctions(String value) {
    super(value, allowedValues);
  }

  public static class MetricAvailableAggrFunctionsSerializer
      extends StdSerializer<MetricAvailableAggrFunctions> {
    public MetricAvailableAggrFunctionsSerializer(Class<MetricAvailableAggrFunctions> t) {
      super(t);
    }

    public MetricAvailableAggrFunctionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricAvailableAggrFunctions value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricAvailableAggrFunctions fromValue(String value) {
    return new MetricAvailableAggrFunctions(value);
  }
}
