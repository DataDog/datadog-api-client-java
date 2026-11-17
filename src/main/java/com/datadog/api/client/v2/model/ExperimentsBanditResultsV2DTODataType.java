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

/** Bandit results resource type. */
@JsonSerialize(
    using =
        ExperimentsBanditResultsV2DTODataType.ExperimentsBanditResultsV2DTODataTypeSerializer.class)
public class ExperimentsBanditResultsV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bandit-results"));

  public static final ExperimentsBanditResultsV2DTODataType BANDIT_RESULTS =
      new ExperimentsBanditResultsV2DTODataType("bandit-results");

  ExperimentsBanditResultsV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditResultsV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsBanditResultsV2DTODataType> {
    public ExperimentsBanditResultsV2DTODataTypeSerializer(
        Class<ExperimentsBanditResultsV2DTODataType> t) {
      super(t);
    }

    public ExperimentsBanditResultsV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditResultsV2DTODataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditResultsV2DTODataType fromValue(String value) {
    return new ExperimentsBanditResultsV2DTODataType(value);
  }
}
