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

/** The type of the resource. The value should always be timeseries_response. */
@JsonSerialize(using = TimeseriesFormulaResponseType.TimeseriesFormulaResponseTypeSerializer.class)
public class TimeseriesFormulaResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timeseries_response"));

  public static final TimeseriesFormulaResponseType TIMESERIES_RESPONSE =
      new TimeseriesFormulaResponseType("timeseries_response");

  TimeseriesFormulaResponseType(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesFormulaResponseTypeSerializer
      extends StdSerializer<TimeseriesFormulaResponseType> {
    public TimeseriesFormulaResponseTypeSerializer(Class<TimeseriesFormulaResponseType> t) {
      super(t);
    }

    public TimeseriesFormulaResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesFormulaResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesFormulaResponseType fromValue(String value) {
    return new TimeseriesFormulaResponseType(value);
  }
}
