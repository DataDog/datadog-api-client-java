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
 * How Datadog serves a MANAGED holdout. GLOBAL holdouts apply to every eligible experiment of a
 * subject type. SELECTIVE holdouts apply only to the experiments attached to them. Null for
 * EXTERNAL holdouts.
 */
@JsonSerialize(
    using =
        ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType
            .ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutTypeSerializer.class)
public class ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("GLOBAL", "SELECTIVE", "UNKNOWN"));

  public static final ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType GLOBAL =
      new ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType("GLOBAL");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType SELECTIVE =
      new ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType("SELECTIVE");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType UNKNOWN =
      new ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType("UNKNOWN");

  ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutTypeSerializer
      extends StdSerializer<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType> {
    public ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutTypeSerializer(
        Class<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType> t) {
      super(t);
    }

    public ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType fromValue(String value) {
    return new ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType(value);
  }
}
