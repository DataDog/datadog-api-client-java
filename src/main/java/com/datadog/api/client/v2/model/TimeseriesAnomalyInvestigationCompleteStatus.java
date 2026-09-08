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

/** Status value indicating successful completion. */
@JsonSerialize(
    using =
        TimeseriesAnomalyInvestigationCompleteStatus
            .TimeseriesAnomalyInvestigationCompleteStatusSerializer.class)
public class TimeseriesAnomalyInvestigationCompleteStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("complete"));

  public static final TimeseriesAnomalyInvestigationCompleteStatus COMPLETE =
      new TimeseriesAnomalyInvestigationCompleteStatus("complete");

  TimeseriesAnomalyInvestigationCompleteStatus(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesAnomalyInvestigationCompleteStatusSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationCompleteStatus> {
    public TimeseriesAnomalyInvestigationCompleteStatusSerializer(
        Class<TimeseriesAnomalyInvestigationCompleteStatus> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationCompleteStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationCompleteStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesAnomalyInvestigationCompleteStatus fromValue(String value) {
    return new TimeseriesAnomalyInvestigationCompleteStatus(value);
  }
}
