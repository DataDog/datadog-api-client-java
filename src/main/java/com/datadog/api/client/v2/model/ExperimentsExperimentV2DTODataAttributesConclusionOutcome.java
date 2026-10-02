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

/** Recorded experiment outcome. */
@JsonSerialize(
    using =
        ExperimentsExperimentV2DTODataAttributesConclusionOutcome
            .ExperimentsExperimentV2DTODataAttributesConclusionOutcomeSerializer.class)
public class ExperimentsExperimentV2DTODataAttributesConclusionOutcome extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "POSITIVE", "NEGATIVE", "NEUTRAL", "INCONCLUSIVE", "MISCONFIGURED", "UNKNOWN"));

  public static final ExperimentsExperimentV2DTODataAttributesConclusionOutcome POSITIVE =
      new ExperimentsExperimentV2DTODataAttributesConclusionOutcome("POSITIVE");
  public static final ExperimentsExperimentV2DTODataAttributesConclusionOutcome NEGATIVE =
      new ExperimentsExperimentV2DTODataAttributesConclusionOutcome("NEGATIVE");
  public static final ExperimentsExperimentV2DTODataAttributesConclusionOutcome NEUTRAL =
      new ExperimentsExperimentV2DTODataAttributesConclusionOutcome("NEUTRAL");
  public static final ExperimentsExperimentV2DTODataAttributesConclusionOutcome INCONCLUSIVE =
      new ExperimentsExperimentV2DTODataAttributesConclusionOutcome("INCONCLUSIVE");
  public static final ExperimentsExperimentV2DTODataAttributesConclusionOutcome MISCONFIGURED =
      new ExperimentsExperimentV2DTODataAttributesConclusionOutcome("MISCONFIGURED");
  public static final ExperimentsExperimentV2DTODataAttributesConclusionOutcome UNKNOWN =
      new ExperimentsExperimentV2DTODataAttributesConclusionOutcome("UNKNOWN");

  ExperimentsExperimentV2DTODataAttributesConclusionOutcome(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentV2DTODataAttributesConclusionOutcomeSerializer
      extends StdSerializer<ExperimentsExperimentV2DTODataAttributesConclusionOutcome> {
    public ExperimentsExperimentV2DTODataAttributesConclusionOutcomeSerializer(
        Class<ExperimentsExperimentV2DTODataAttributesConclusionOutcome> t) {
      super(t);
    }

    public ExperimentsExperimentV2DTODataAttributesConclusionOutcomeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentV2DTODataAttributesConclusionOutcome value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentV2DTODataAttributesConclusionOutcome fromValue(String value) {
    return new ExperimentsExperimentV2DTODataAttributesConclusionOutcome(value);
  }
}
