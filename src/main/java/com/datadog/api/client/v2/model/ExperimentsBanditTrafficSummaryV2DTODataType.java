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

/** Bandit traffic summary resource type. */
@JsonSerialize(
    using =
        ExperimentsBanditTrafficSummaryV2DTODataType
            .ExperimentsBanditTrafficSummaryV2DTODataTypeSerializer.class)
public class ExperimentsBanditTrafficSummaryV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bandit-traffic-summary"));

  public static final ExperimentsBanditTrafficSummaryV2DTODataType BANDIT_TRAFFIC_SUMMARY =
      new ExperimentsBanditTrafficSummaryV2DTODataType("bandit-traffic-summary");

  ExperimentsBanditTrafficSummaryV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditTrafficSummaryV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsBanditTrafficSummaryV2DTODataType> {
    public ExperimentsBanditTrafficSummaryV2DTODataTypeSerializer(
        Class<ExperimentsBanditTrafficSummaryV2DTODataType> t) {
      super(t);
    }

    public ExperimentsBanditTrafficSummaryV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditTrafficSummaryV2DTODataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditTrafficSummaryV2DTODataType fromValue(String value) {
    return new ExperimentsBanditTrafficSummaryV2DTODataType(value);
  }
}
