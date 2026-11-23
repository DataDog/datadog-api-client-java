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

/** Type of the timeseries coverage response resource. */
@JsonSerialize(
    using =
        CommitmentsCoverageTimeseriesResponseType
            .CommitmentsCoverageTimeseriesResponseTypeSerializer.class)
public class CommitmentsCoverageTimeseriesResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("coverage_timeseries_response"));

  public static final CommitmentsCoverageTimeseriesResponseType COVERAGE_TIMESERIES_RESPONSE =
      new CommitmentsCoverageTimeseriesResponseType("coverage_timeseries_response");

  CommitmentsCoverageTimeseriesResponseType(String value) {
    super(value, allowedValues);
  }

  public static class CommitmentsCoverageTimeseriesResponseTypeSerializer
      extends StdSerializer<CommitmentsCoverageTimeseriesResponseType> {
    public CommitmentsCoverageTimeseriesResponseTypeSerializer(
        Class<CommitmentsCoverageTimeseriesResponseType> t) {
      super(t);
    }

    public CommitmentsCoverageTimeseriesResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitmentsCoverageTimeseriesResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CommitmentsCoverageTimeseriesResponseType fromValue(String value) {
    return new CommitmentsCoverageTimeseriesResponseType(value);
  }
}
