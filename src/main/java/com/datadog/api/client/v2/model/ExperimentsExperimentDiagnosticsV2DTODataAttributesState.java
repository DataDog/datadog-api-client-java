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

/** Current state of the diagnostic evaluation. */
@JsonSerialize(
    using =
        ExperimentsExperimentDiagnosticsV2DTODataAttributesState
            .ExperimentsExperimentDiagnosticsV2DTODataAttributesStateSerializer.class)
public class ExperimentsExperimentDiagnosticsV2DTODataAttributesState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("NOT_STARTED", "RUNNING", "COMPLETED", "FAILED"));

  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesState NOT_STARTED =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesState("NOT_STARTED");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesState RUNNING =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesState("RUNNING");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesState COMPLETED =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesState("COMPLETED");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesState FAILED =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesState("FAILED");

  ExperimentsExperimentDiagnosticsV2DTODataAttributesState(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentDiagnosticsV2DTODataAttributesStateSerializer
      extends StdSerializer<ExperimentsExperimentDiagnosticsV2DTODataAttributesState> {
    public ExperimentsExperimentDiagnosticsV2DTODataAttributesStateSerializer(
        Class<ExperimentsExperimentDiagnosticsV2DTODataAttributesState> t) {
      super(t);
    }

    public ExperimentsExperimentDiagnosticsV2DTODataAttributesStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentDiagnosticsV2DTODataAttributesState value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentDiagnosticsV2DTODataAttributesState fromValue(String value) {
    return new ExperimentsExperimentDiagnosticsV2DTODataAttributesState(value);
  }
}
