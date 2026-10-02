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

/** Conclude experiment request resource type. */
@JsonSerialize(
    using =
        ExperimentsConcludeExperimentV2RequestDataType
            .ExperimentsConcludeExperimentV2RequestDataTypeSerializer.class)
public class ExperimentsConcludeExperimentV2RequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("conclude-experiment-request"));

  public static final ExperimentsConcludeExperimentV2RequestDataType CONCLUDE_EXPERIMENT_REQUEST =
      new ExperimentsConcludeExperimentV2RequestDataType("conclude-experiment-request");

  ExperimentsConcludeExperimentV2RequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsConcludeExperimentV2RequestDataTypeSerializer
      extends StdSerializer<ExperimentsConcludeExperimentV2RequestDataType> {
    public ExperimentsConcludeExperimentV2RequestDataTypeSerializer(
        Class<ExperimentsConcludeExperimentV2RequestDataType> t) {
      super(t);
    }

    public ExperimentsConcludeExperimentV2RequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsConcludeExperimentV2RequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsConcludeExperimentV2RequestDataType fromValue(String value) {
    return new ExperimentsConcludeExperimentV2RequestDataType(value);
  }
}
