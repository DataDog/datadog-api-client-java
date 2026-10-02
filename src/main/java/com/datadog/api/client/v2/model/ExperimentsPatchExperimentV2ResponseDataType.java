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

/** Experiments resource type. */
@JsonSerialize(
    using =
        ExperimentsPatchExperimentV2ResponseDataType
            .ExperimentsPatchExperimentV2ResponseDataTypeSerializer.class)
public class ExperimentsPatchExperimentV2ResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiments"));

  public static final ExperimentsPatchExperimentV2ResponseDataType EXPERIMENTS =
      new ExperimentsPatchExperimentV2ResponseDataType("experiments");

  ExperimentsPatchExperimentV2ResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsPatchExperimentV2ResponseDataTypeSerializer
      extends StdSerializer<ExperimentsPatchExperimentV2ResponseDataType> {
    public ExperimentsPatchExperimentV2ResponseDataTypeSerializer(
        Class<ExperimentsPatchExperimentV2ResponseDataType> t) {
      super(t);
    }

    public ExperimentsPatchExperimentV2ResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsPatchExperimentV2ResponseDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsPatchExperimentV2ResponseDataType fromValue(String value) {
    return new ExperimentsPatchExperimentV2ResponseDataType(value);
  }
}
