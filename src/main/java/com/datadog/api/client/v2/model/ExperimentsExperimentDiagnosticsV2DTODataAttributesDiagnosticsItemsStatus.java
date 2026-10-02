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

/** Outcome of an individual diagnostic check. */
@JsonSerialize(
    using =
        ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus
            .ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatusSerializer
            .class)
public class ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("PASS", "FAIL", "WARN", "ERROR", "SKIPPED"));

  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus
      PASS = new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus("PASS");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus
      FAIL = new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus("FAIL");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus
      WARN = new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus("WARN");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus
      ERROR =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus("ERROR");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus
      SKIPPED =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus("SKIPPED");

  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus(String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatusSerializer
      extends StdSerializer<
          ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus> {
    public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatusSerializer(
        Class<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus> t) {
      super(t);
    }

    public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus fromValue(
      String value) {
    return new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus(value);
  }
}
