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
 * Comma-separated list of additional data to include in the response. Allowed values are <code>
 * metric_volumes</code>.
 */
@JsonSerialize(using = MetricVolumesInclude.MetricVolumesIncludeSerializer.class)
public class MetricVolumesInclude extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metric_volumes", "generated_metric_attributes"));

  public static final MetricVolumesInclude METRIC_VOLUMES =
      new MetricVolumesInclude("metric_volumes");
  public static final MetricVolumesInclude GENERATED_METRIC_ATTRIBUTES =
      new MetricVolumesInclude("generated_metric_attributes");

  MetricVolumesInclude(String value) {
    super(value, allowedValues);
  }

  public static class MetricVolumesIncludeSerializer extends StdSerializer<MetricVolumesInclude> {
    public MetricVolumesIncludeSerializer(Class<MetricVolumesInclude> t) {
      super(t);
    }

    public MetricVolumesIncludeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricVolumesInclude value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricVolumesInclude fromValue(String value) {
    return new MetricVolumesInclude(value);
  }
}
