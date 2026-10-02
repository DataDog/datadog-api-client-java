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

/** Experiment metric groups resource type. */
@JsonSerialize(
    using =
        ExperimentsPatchExperimentMetricGroupV2RequestDataType
            .ExperimentsPatchExperimentMetricGroupV2RequestDataTypeSerializer.class)
public class ExperimentsPatchExperimentMetricGroupV2RequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiment-metric-groups"));

  public static final ExperimentsPatchExperimentMetricGroupV2RequestDataType
      EXPERIMENT_METRIC_GROUPS =
          new ExperimentsPatchExperimentMetricGroupV2RequestDataType("experiment-metric-groups");

  ExperimentsPatchExperimentMetricGroupV2RequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsPatchExperimentMetricGroupV2RequestDataTypeSerializer
      extends StdSerializer<ExperimentsPatchExperimentMetricGroupV2RequestDataType> {
    public ExperimentsPatchExperimentMetricGroupV2RequestDataTypeSerializer(
        Class<ExperimentsPatchExperimentMetricGroupV2RequestDataType> t) {
      super(t);
    }

    public ExperimentsPatchExperimentMetricGroupV2RequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsPatchExperimentMetricGroupV2RequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsPatchExperimentMetricGroupV2RequestDataType fromValue(String value) {
    return new ExperimentsPatchExperimentMetricGroupV2RequestDataType(value);
  }
}
