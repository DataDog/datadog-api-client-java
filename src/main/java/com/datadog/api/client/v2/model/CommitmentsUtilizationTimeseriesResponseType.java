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

/** Type of the timeseries utilization response resource. */
@JsonSerialize(
    using =
        CommitmentsUtilizationTimeseriesResponseType
            .CommitmentsUtilizationTimeseriesResponseTypeSerializer.class)
public class CommitmentsUtilizationTimeseriesResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("utilization_timeseries_response"));

  public static final CommitmentsUtilizationTimeseriesResponseType UTILIZATION_TIMESERIES_RESPONSE =
      new CommitmentsUtilizationTimeseriesResponseType("utilization_timeseries_response");

  CommitmentsUtilizationTimeseriesResponseType(String value) {
    super(value, allowedValues);
  }

  public static class CommitmentsUtilizationTimeseriesResponseTypeSerializer
      extends StdSerializer<CommitmentsUtilizationTimeseriesResponseType> {
    public CommitmentsUtilizationTimeseriesResponseTypeSerializer(
        Class<CommitmentsUtilizationTimeseriesResponseType> t) {
      super(t);
    }

    public CommitmentsUtilizationTimeseriesResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitmentsUtilizationTimeseriesResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CommitmentsUtilizationTimeseriesResponseType fromValue(String value) {
    return new CommitmentsUtilizationTimeseriesResponseType(value);
  }
}
