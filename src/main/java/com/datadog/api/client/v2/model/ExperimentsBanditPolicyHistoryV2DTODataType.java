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

/** Bandit policy resource type. */
@JsonSerialize(
    using =
        ExperimentsBanditPolicyHistoryV2DTODataType
            .ExperimentsBanditPolicyHistoryV2DTODataTypeSerializer.class)
public class ExperimentsBanditPolicyHistoryV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bandit-policies"));

  public static final ExperimentsBanditPolicyHistoryV2DTODataType BANDIT_POLICIES =
      new ExperimentsBanditPolicyHistoryV2DTODataType("bandit-policies");

  ExperimentsBanditPolicyHistoryV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditPolicyHistoryV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsBanditPolicyHistoryV2DTODataType> {
    public ExperimentsBanditPolicyHistoryV2DTODataTypeSerializer(
        Class<ExperimentsBanditPolicyHistoryV2DTODataType> t) {
      super(t);
    }

    public ExperimentsBanditPolicyHistoryV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditPolicyHistoryV2DTODataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditPolicyHistoryV2DTODataType fromValue(String value) {
    return new ExperimentsBanditPolicyHistoryV2DTODataType(value);
  }
}
