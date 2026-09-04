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

/** Kind of influence a tag has on a series. */
@JsonSerialize(
    using =
        TimeseriesAnomalyInvestigationInfluenceType
            .TimeseriesAnomalyInvestigationInfluenceTypeSerializer.class)
public class TimeseriesAnomalyInvestigationInfluenceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("shape", "value"));

  public static final TimeseriesAnomalyInvestigationInfluenceType SHAPE =
      new TimeseriesAnomalyInvestigationInfluenceType("shape");
  public static final TimeseriesAnomalyInvestigationInfluenceType VALUE =
      new TimeseriesAnomalyInvestigationInfluenceType("value");

  TimeseriesAnomalyInvestigationInfluenceType(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesAnomalyInvestigationInfluenceTypeSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationInfluenceType> {
    public TimeseriesAnomalyInvestigationInfluenceTypeSerializer(
        Class<TimeseriesAnomalyInvestigationInfluenceType> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationInfluenceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationInfluenceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesAnomalyInvestigationInfluenceType fromValue(String value) {
    return new TimeseriesAnomalyInvestigationInfluenceType(value);
  }
}
