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

/** Finding category for an anomaly without a displayable influential tag. */
@JsonSerialize(
    using =
        TimeseriesAnomalyInvestigationAnomalyFindingType
            .TimeseriesAnomalyInvestigationAnomalyFindingTypeSerializer.class)
public class TimeseriesAnomalyInvestigationAnomalyFindingType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("anomaly"));

  public static final TimeseriesAnomalyInvestigationAnomalyFindingType ANOMALY =
      new TimeseriesAnomalyInvestigationAnomalyFindingType("anomaly");

  TimeseriesAnomalyInvestigationAnomalyFindingType(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesAnomalyInvestigationAnomalyFindingTypeSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationAnomalyFindingType> {
    public TimeseriesAnomalyInvestigationAnomalyFindingTypeSerializer(
        Class<TimeseriesAnomalyInvestigationAnomalyFindingType> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationAnomalyFindingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationAnomalyFindingType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesAnomalyInvestigationAnomalyFindingType fromValue(String value) {
    return new TimeseriesAnomalyInvestigationAnomalyFindingType(value);
  }
}
