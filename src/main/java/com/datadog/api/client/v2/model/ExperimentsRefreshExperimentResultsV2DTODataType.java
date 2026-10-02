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

/** Experiment results refresh resource type. */
@JsonSerialize(
    using =
        ExperimentsRefreshExperimentResultsV2DTODataType
            .ExperimentsRefreshExperimentResultsV2DTODataTypeSerializer.class)
public class ExperimentsRefreshExperimentResultsV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiment-results-refresh"));

  public static final ExperimentsRefreshExperimentResultsV2DTODataType EXPERIMENT_RESULTS_REFRESH =
      new ExperimentsRefreshExperimentResultsV2DTODataType("experiment-results-refresh");

  ExperimentsRefreshExperimentResultsV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsRefreshExperimentResultsV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsRefreshExperimentResultsV2DTODataType> {
    public ExperimentsRefreshExperimentResultsV2DTODataTypeSerializer(
        Class<ExperimentsRefreshExperimentResultsV2DTODataType> t) {
      super(t);
    }

    public ExperimentsRefreshExperimentResultsV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsRefreshExperimentResultsV2DTODataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsRefreshExperimentResultsV2DTODataType fromValue(String value) {
    return new ExperimentsRefreshExperimentResultsV2DTODataType(value);
  }
}
