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

/** Kind of diagnostic check performed. */
@JsonSerialize(
    using =
        ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
            .ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsTypeSerializer
            .class)
public class ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "EXPERIMENT_HAS_ASSIGNMENTS",
              "METRIC_HAS_DATA",
              "ASSIGNMENT_IMBALANCE",
              "METRIC_WINSORIZE_ZERO",
              "PRE_EXPERIMENT_IMBALANCE",
              "MIXED_ASSIGNMENTS",
              "DIMENSIONAL_ASSIGNMENT_IMBALANCE",
              "FLAG_HAS_EVALUATIONS",
              "IMPLAUSIBLE_PRIOR",
              "DIMENSIONAL_DEGRADATION",
              "PIPELINE_STATUS",
              "MAPPED_ANALYSIS_CONFIGURATION",
              "MAPPED_ANALYSIS_COVERAGE",
              "MAPPED_ANALYSIS_COLLISIONS",
              "MAPPED_ANALYSIS_FANOUT",
              "MAPPED_ANALYSIS_CHANGE"));

  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      EXPERIMENT_HAS_ASSIGNMENTS =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "EXPERIMENT_HAS_ASSIGNMENTS");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      METRIC_HAS_DATA =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "METRIC_HAS_DATA");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      ASSIGNMENT_IMBALANCE =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "ASSIGNMENT_IMBALANCE");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      METRIC_WINSORIZE_ZERO =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "METRIC_WINSORIZE_ZERO");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      PRE_EXPERIMENT_IMBALANCE =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "PRE_EXPERIMENT_IMBALANCE");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      MIXED_ASSIGNMENTS =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "MIXED_ASSIGNMENTS");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      DIMENSIONAL_ASSIGNMENT_IMBALANCE =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "DIMENSIONAL_ASSIGNMENT_IMBALANCE");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      FLAG_HAS_EVALUATIONS =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "FLAG_HAS_EVALUATIONS");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      IMPLAUSIBLE_PRIOR =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "IMPLAUSIBLE_PRIOR");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      DIMENSIONAL_DEGRADATION =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "DIMENSIONAL_DEGRADATION");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      PIPELINE_STATUS =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "PIPELINE_STATUS");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      MAPPED_ANALYSIS_CONFIGURATION =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "MAPPED_ANALYSIS_CONFIGURATION");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      MAPPED_ANALYSIS_COVERAGE =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "MAPPED_ANALYSIS_COVERAGE");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      MAPPED_ANALYSIS_COLLISIONS =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "MAPPED_ANALYSIS_COLLISIONS");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      MAPPED_ANALYSIS_FANOUT =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "MAPPED_ANALYSIS_FANOUT");
  public static final ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType
      MAPPED_ANALYSIS_CHANGE =
          new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(
              "MAPPED_ANALYSIS_CHANGE");

  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsTypeSerializer
      extends StdSerializer<
          ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType> {
    public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsTypeSerializer(
        Class<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType> t) {
      super(t);
    }

    public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType fromValue(
      String value) {
    return new ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType(value);
  }
}
