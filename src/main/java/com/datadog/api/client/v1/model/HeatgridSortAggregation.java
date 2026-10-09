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

/** Aggregation used to order rows over the displayed time range. */
@JsonSerialize(using = HeatgridSortAggregation.HeatgridSortAggregationSerializer.class)
public class HeatgridSortAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "min", "max", "sum"));

  public static final HeatgridSortAggregation AVG = new HeatgridSortAggregation("avg");
  public static final HeatgridSortAggregation MIN = new HeatgridSortAggregation("min");
  public static final HeatgridSortAggregation MAX = new HeatgridSortAggregation("max");
  public static final HeatgridSortAggregation SUM = new HeatgridSortAggregation("sum");

  HeatgridSortAggregation(String value) {
    super(value, allowedValues);
  }

  public static class HeatgridSortAggregationSerializer
      extends StdSerializer<HeatgridSortAggregation> {
    public HeatgridSortAggregationSerializer(Class<HeatgridSortAggregation> t) {
      super(t);
    }

    public HeatgridSortAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HeatgridSortAggregation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HeatgridSortAggregation fromValue(String value) {
    return new HeatgridSortAggregation(value);
  }
}
