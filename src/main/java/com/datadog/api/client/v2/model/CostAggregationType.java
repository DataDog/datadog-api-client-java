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

/**
 * Controls how costs are aggregated when using <code>start_date</code>. The <code>cumulative</code>
 * option returns month-to-date running totals.
 */
@JsonSerialize(using = CostAggregationType.CostAggregationTypeSerializer.class)
public class CostAggregationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("cumulative"));

  public static final CostAggregationType CUMULATIVE = new CostAggregationType("cumulative");

  CostAggregationType(String value) {
    super(value, allowedValues);
  }

  public static class CostAggregationTypeSerializer extends StdSerializer<CostAggregationType> {
    public CostAggregationTypeSerializer(Class<CostAggregationType> t) {
      super(t);
    }

    public CostAggregationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostAggregationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostAggregationType fromValue(String value) {
    return new CostAggregationType(value);
  }
}
