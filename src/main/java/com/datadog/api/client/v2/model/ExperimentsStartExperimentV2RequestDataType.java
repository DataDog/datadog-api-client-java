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

/** Start experiment request resource type. */
@JsonSerialize(
    using =
        ExperimentsStartExperimentV2RequestDataType
            .ExperimentsStartExperimentV2RequestDataTypeSerializer.class)
public class ExperimentsStartExperimentV2RequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("start-experiment-request"));

  public static final ExperimentsStartExperimentV2RequestDataType START_EXPERIMENT_REQUEST =
      new ExperimentsStartExperimentV2RequestDataType("start-experiment-request");

  ExperimentsStartExperimentV2RequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsStartExperimentV2RequestDataTypeSerializer
      extends StdSerializer<ExperimentsStartExperimentV2RequestDataType> {
    public ExperimentsStartExperimentV2RequestDataTypeSerializer(
        Class<ExperimentsStartExperimentV2RequestDataType> t) {
      super(t);
    }

    public ExperimentsStartExperimentV2RequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsStartExperimentV2RequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsStartExperimentV2RequestDataType fromValue(String value) {
    return new ExperimentsStartExperimentV2RequestDataType(value);
  }
}
