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

/** Experiment diagnostics resource type. */
@JsonSerialize(
    using =
        ExperimentsExperimentDiagnosticsV2DTODataType
            .ExperimentsExperimentDiagnosticsV2DTODataTypeSerializer.class)
public class ExperimentsExperimentDiagnosticsV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiment-diagnostics"));

  public static final ExperimentsExperimentDiagnosticsV2DTODataType EXPERIMENT_DIAGNOSTICS =
      new ExperimentsExperimentDiagnosticsV2DTODataType("experiment-diagnostics");

  ExperimentsExperimentDiagnosticsV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentDiagnosticsV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsExperimentDiagnosticsV2DTODataType> {
    public ExperimentsExperimentDiagnosticsV2DTODataTypeSerializer(
        Class<ExperimentsExperimentDiagnosticsV2DTODataType> t) {
      super(t);
    }

    public ExperimentsExperimentDiagnosticsV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentDiagnosticsV2DTODataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentDiagnosticsV2DTODataType fromValue(String value) {
    return new ExperimentsExperimentDiagnosticsV2DTODataType(value);
  }
}
