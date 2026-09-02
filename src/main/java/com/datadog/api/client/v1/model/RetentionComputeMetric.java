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

/** Metric for retention compute. */
@JsonSerialize(using = RetentionComputeMetric.RetentionComputeMetricSerializer.class)
public class RetentionComputeMetric extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("__dd.retention", "__dd.retention_rate"));

  public static final RetentionComputeMetric RETENTION =
      new RetentionComputeMetric("__dd.retention");
  public static final RetentionComputeMetric RETENTION_RATE =
      new RetentionComputeMetric("__dd.retention_rate");

  RetentionComputeMetric(String value) {
    super(value, allowedValues);
  }

  public static class RetentionComputeMetricSerializer
      extends StdSerializer<RetentionComputeMetric> {
    public RetentionComputeMetricSerializer(Class<RetentionComputeMetric> t) {
      super(t);
    }

    public RetentionComputeMetricSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionComputeMetric value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetentionComputeMetric fromValue(String value) {
    return new RetentionComputeMetric(value);
  }
}
