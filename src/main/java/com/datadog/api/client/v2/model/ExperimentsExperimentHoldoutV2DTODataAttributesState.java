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

/**
 * Lifecycle phase of the holdout. PENDING holdouts have not started including experiments.
 * INCLUDING holdouts are adding experiments. WAITING_FOR_ANALYSIS holdouts have stopped including
 * experiments but have not started analysis. ANALYSING holdouts are in their analysis window.
 * COMPLETE applies only to EXTERNAL holdouts that have ended their analysis window but are not
 * archived.
 */
@JsonSerialize(
    using =
        ExperimentsExperimentHoldoutV2DTODataAttributesState
            .ExperimentsExperimentHoldoutV2DTODataAttributesStateSerializer.class)
public class ExperimentsExperimentHoldoutV2DTODataAttributesState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "PENDING", "INCLUDING", "WAITING_FOR_ANALYSIS", "ANALYSING", "COMPLETE", "UNKNOWN"));

  public static final ExperimentsExperimentHoldoutV2DTODataAttributesState PENDING =
      new ExperimentsExperimentHoldoutV2DTODataAttributesState("PENDING");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesState INCLUDING =
      new ExperimentsExperimentHoldoutV2DTODataAttributesState("INCLUDING");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesState WAITING_FOR_ANALYSIS =
      new ExperimentsExperimentHoldoutV2DTODataAttributesState("WAITING_FOR_ANALYSIS");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesState ANALYSING =
      new ExperimentsExperimentHoldoutV2DTODataAttributesState("ANALYSING");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesState COMPLETE =
      new ExperimentsExperimentHoldoutV2DTODataAttributesState("COMPLETE");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesState UNKNOWN =
      new ExperimentsExperimentHoldoutV2DTODataAttributesState("UNKNOWN");

  ExperimentsExperimentHoldoutV2DTODataAttributesState(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentHoldoutV2DTODataAttributesStateSerializer
      extends StdSerializer<ExperimentsExperimentHoldoutV2DTODataAttributesState> {
    public ExperimentsExperimentHoldoutV2DTODataAttributesStateSerializer(
        Class<ExperimentsExperimentHoldoutV2DTODataAttributesState> t) {
      super(t);
    }

    public ExperimentsExperimentHoldoutV2DTODataAttributesStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentHoldoutV2DTODataAttributesState value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentHoldoutV2DTODataAttributesState fromValue(String value) {
    return new ExperimentsExperimentHoldoutV2DTODataAttributesState(value);
  }
}
