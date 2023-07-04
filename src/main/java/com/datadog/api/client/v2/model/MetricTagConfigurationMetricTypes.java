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

/** The metric's type. */
@JsonSerialize(
    using = MetricTagConfigurationMetricTypes.MetricTagConfigurationMetricTypesSerializer.class)
public class MetricTagConfigurationMetricTypes extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gauge", "count", "rate", "distribution"));

  public static final MetricTagConfigurationMetricTypes GAUGE =
      new MetricTagConfigurationMetricTypes("gauge");
  public static final MetricTagConfigurationMetricTypes COUNT =
      new MetricTagConfigurationMetricTypes("count");
  public static final MetricTagConfigurationMetricTypes RATE =
      new MetricTagConfigurationMetricTypes("rate");
  public static final MetricTagConfigurationMetricTypes DISTRIBUTION =
      new MetricTagConfigurationMetricTypes("distribution");

  MetricTagConfigurationMetricTypes(String value) {
    super(value, allowedValues);
  }

  public static class MetricTagConfigurationMetricTypesSerializer
      extends StdSerializer<MetricTagConfigurationMetricTypes> {
    public MetricTagConfigurationMetricTypesSerializer(Class<MetricTagConfigurationMetricTypes> t) {
      super(t);
    }

    public MetricTagConfigurationMetricTypesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricTagConfigurationMetricTypes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricTagConfigurationMetricTypes fromValue(String value) {
    return new MetricTagConfigurationMetricTypes(value);
  }
}
