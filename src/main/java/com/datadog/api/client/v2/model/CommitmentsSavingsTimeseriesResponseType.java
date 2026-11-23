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

/** Type of the timeseries savings response resource. */
@JsonSerialize(
    using =
        CommitmentsSavingsTimeseriesResponseType.CommitmentsSavingsTimeseriesResponseTypeSerializer
            .class)
public class CommitmentsSavingsTimeseriesResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("savings_timeseries_response"));

  public static final CommitmentsSavingsTimeseriesResponseType SAVINGS_TIMESERIES_RESPONSE =
      new CommitmentsSavingsTimeseriesResponseType("savings_timeseries_response");

  CommitmentsSavingsTimeseriesResponseType(String value) {
    super(value, allowedValues);
  }

  public static class CommitmentsSavingsTimeseriesResponseTypeSerializer
      extends StdSerializer<CommitmentsSavingsTimeseriesResponseType> {
    public CommitmentsSavingsTimeseriesResponseTypeSerializer(
        Class<CommitmentsSavingsTimeseriesResponseType> t) {
      super(t);
    }

    public CommitmentsSavingsTimeseriesResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitmentsSavingsTimeseriesResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CommitmentsSavingsTimeseriesResponseType fromValue(String value) {
    return new CommitmentsSavingsTimeseriesResponseType(value);
  }
}
