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

/** Current stage in the experiment lifecycle. */
@JsonSerialize(
    using =
        ExperimentsExperimentV2DTODataAttributesStatus
            .ExperimentsExperimentV2DTODataAttributesStatusSerializer.class)
public class ExperimentsExperimentV2DTODataAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "DRAFT",
              "SCHEDULED",
              "IN_PROGRESS",
              "READY_FOR_DECISION",
              "DECISION_MADE",
              "CANCELLED",
              "UNKNOWN"));

  public static final ExperimentsExperimentV2DTODataAttributesStatus DRAFT =
      new ExperimentsExperimentV2DTODataAttributesStatus("DRAFT");
  public static final ExperimentsExperimentV2DTODataAttributesStatus SCHEDULED =
      new ExperimentsExperimentV2DTODataAttributesStatus("SCHEDULED");
  public static final ExperimentsExperimentV2DTODataAttributesStatus IN_PROGRESS =
      new ExperimentsExperimentV2DTODataAttributesStatus("IN_PROGRESS");
  public static final ExperimentsExperimentV2DTODataAttributesStatus READY_FOR_DECISION =
      new ExperimentsExperimentV2DTODataAttributesStatus("READY_FOR_DECISION");
  public static final ExperimentsExperimentV2DTODataAttributesStatus DECISION_MADE =
      new ExperimentsExperimentV2DTODataAttributesStatus("DECISION_MADE");
  public static final ExperimentsExperimentV2DTODataAttributesStatus CANCELLED =
      new ExperimentsExperimentV2DTODataAttributesStatus("CANCELLED");
  public static final ExperimentsExperimentV2DTODataAttributesStatus UNKNOWN =
      new ExperimentsExperimentV2DTODataAttributesStatus("UNKNOWN");

  ExperimentsExperimentV2DTODataAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentV2DTODataAttributesStatusSerializer
      extends StdSerializer<ExperimentsExperimentV2DTODataAttributesStatus> {
    public ExperimentsExperimentV2DTODataAttributesStatusSerializer(
        Class<ExperimentsExperimentV2DTODataAttributesStatus> t) {
      super(t);
    }

    public ExperimentsExperimentV2DTODataAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentV2DTODataAttributesStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentV2DTODataAttributesStatus fromValue(String value) {
    return new ExperimentsExperimentV2DTODataAttributesStatus(value);
  }
}
