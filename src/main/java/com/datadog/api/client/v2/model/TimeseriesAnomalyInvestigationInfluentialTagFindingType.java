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

/** Finding category for an influential tag. */
@JsonSerialize(
    using =
        TimeseriesAnomalyInvestigationInfluentialTagFindingType
            .TimeseriesAnomalyInvestigationInfluentialTagFindingTypeSerializer.class)
public class TimeseriesAnomalyInvestigationInfluentialTagFindingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("influential_tag"));

  public static final TimeseriesAnomalyInvestigationInfluentialTagFindingType INFLUENTIAL_TAG =
      new TimeseriesAnomalyInvestigationInfluentialTagFindingType("influential_tag");

  TimeseriesAnomalyInvestigationInfluentialTagFindingType(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesAnomalyInvestigationInfluentialTagFindingTypeSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationInfluentialTagFindingType> {
    public TimeseriesAnomalyInvestigationInfluentialTagFindingTypeSerializer(
        Class<TimeseriesAnomalyInvestigationInfluentialTagFindingType> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationInfluentialTagFindingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationInfluentialTagFindingType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesAnomalyInvestigationInfluentialTagFindingType fromValue(String value) {
    return new TimeseriesAnomalyInvestigationInfluentialTagFindingType(value);
  }
}
