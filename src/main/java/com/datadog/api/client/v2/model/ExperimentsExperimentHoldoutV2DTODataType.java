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

/** Experiment holdout resource type. */
@JsonSerialize(
    using =
        ExperimentsExperimentHoldoutV2DTODataType
            .ExperimentsExperimentHoldoutV2DTODataTypeSerializer.class)
public class ExperimentsExperimentHoldoutV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiment-holdouts"));

  public static final ExperimentsExperimentHoldoutV2DTODataType EXPERIMENT_HOLDOUTS =
      new ExperimentsExperimentHoldoutV2DTODataType("experiment-holdouts");

  ExperimentsExperimentHoldoutV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentHoldoutV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsExperimentHoldoutV2DTODataType> {
    public ExperimentsExperimentHoldoutV2DTODataTypeSerializer(
        Class<ExperimentsExperimentHoldoutV2DTODataType> t) {
      super(t);
    }

    public ExperimentsExperimentHoldoutV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentHoldoutV2DTODataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentHoldoutV2DTODataType fromValue(String value) {
    return new ExperimentsExperimentHoldoutV2DTODataType(value);
  }
}
