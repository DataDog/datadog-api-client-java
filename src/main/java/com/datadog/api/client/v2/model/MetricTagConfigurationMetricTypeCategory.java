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

/** The metric's type category. */
@JsonSerialize(
    using =
        MetricTagConfigurationMetricTypeCategory.MetricTagConfigurationMetricTypeCategorySerializer
            .class)
public class MetricTagConfigurationMetricTypeCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("non_distribution", "distribution"));

  public static final MetricTagConfigurationMetricTypeCategory NON_DISTRIBUTION =
      new MetricTagConfigurationMetricTypeCategory("non_distribution");
  public static final MetricTagConfigurationMetricTypeCategory DISTRIBUTION =
      new MetricTagConfigurationMetricTypeCategory("distribution");

  MetricTagConfigurationMetricTypeCategory(String value) {
    super(value, allowedValues);
  }

  public static class MetricTagConfigurationMetricTypeCategorySerializer
      extends StdSerializer<MetricTagConfigurationMetricTypeCategory> {
    public MetricTagConfigurationMetricTypeCategorySerializer(
        Class<MetricTagConfigurationMetricTypeCategory> t) {
      super(t);
    }

    public MetricTagConfigurationMetricTypeCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricTagConfigurationMetricTypeCategory value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricTagConfigurationMetricTypeCategory fromValue(String value) {
    return new MetricTagConfigurationMetricTypeCategory(value);
  }
}
