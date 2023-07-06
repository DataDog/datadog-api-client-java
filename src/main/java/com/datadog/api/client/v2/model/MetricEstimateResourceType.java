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

/** The metric estimate resource type. */
@JsonSerialize(using = MetricEstimateResourceType.MetricEstimateResourceTypeSerializer.class)
public class MetricEstimateResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metric_cardinality_estimate"));

  public static final MetricEstimateResourceType METRIC_CARDINALITY_ESTIMATE =
      new MetricEstimateResourceType("metric_cardinality_estimate");

  MetricEstimateResourceType(String value) {
    super(value, allowedValues);
  }

  public static class MetricEstimateResourceTypeSerializer
      extends StdSerializer<MetricEstimateResourceType> {
    public MetricEstimateResourceTypeSerializer(Class<MetricEstimateResourceType> t) {
      super(t);
    }

    public MetricEstimateResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricEstimateResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricEstimateResourceType fromValue(String value) {
    return new MetricEstimateResourceType(value);
  }
}
