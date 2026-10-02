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

/** Analysis plans resource type. */
@JsonSerialize(
    using =
        ExperimentsAnalysisPlanWriteV2RequestDataType
            .ExperimentsAnalysisPlanWriteV2RequestDataTypeSerializer.class)
public class ExperimentsAnalysisPlanWriteV2RequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("analysis-plans"));

  public static final ExperimentsAnalysisPlanWriteV2RequestDataType ANALYSIS_PLANS =
      new ExperimentsAnalysisPlanWriteV2RequestDataType("analysis-plans");

  ExperimentsAnalysisPlanWriteV2RequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsAnalysisPlanWriteV2RequestDataTypeSerializer
      extends StdSerializer<ExperimentsAnalysisPlanWriteV2RequestDataType> {
    public ExperimentsAnalysisPlanWriteV2RequestDataTypeSerializer(
        Class<ExperimentsAnalysisPlanWriteV2RequestDataType> t) {
      super(t);
    }

    public ExperimentsAnalysisPlanWriteV2RequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsAnalysisPlanWriteV2RequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsAnalysisPlanWriteV2RequestDataType fromValue(String value) {
    return new ExperimentsAnalysisPlanWriteV2RequestDataType(value);
  }
}
