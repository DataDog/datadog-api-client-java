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

/** Overall result of the experiment diagnostic checks. */
@JsonSerialize(
    using =
        ExperimentsExperimentDiagnosticsV2DTODataAttributesResult
            .ExperimentsExperimentDiagnosticsV2DTODataAttributesResultSerializer.class)
public class ExperimentsExperimentDiagnosticsV2DTODataAttributesResult extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("PASS", "FAIL", "WARN", "NO_DATA"));

  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesResult PASS =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesResult("PASS");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesResult FAIL =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesResult("FAIL");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesResult WARN =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesResult("WARN");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesResult NO_DATA =
      new ExperimentsExperimentDiagnosticsV2DTODataAttributesResult("NO_DATA");

  ExperimentsExperimentDiagnosticsV2DTODataAttributesResult(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentDiagnosticsV2DTODataAttributesResultSerializer
      extends StdSerializer<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult> {
    public ExperimentsExperimentDiagnosticsV2DTODataAttributesResultSerializer(
        Class<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult> t) {
      super(t);
    }

    public ExperimentsExperimentDiagnosticsV2DTODataAttributesResultSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentDiagnosticsV2DTODataAttributesResult value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentDiagnosticsV2DTODataAttributesResult fromValue(String value) {
    return new ExperimentsExperimentDiagnosticsV2DTODataAttributesResult(value);
  }
}
