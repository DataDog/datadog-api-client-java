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

/** Resource type for a timeseries anomaly investigation. */
@JsonSerialize(
    using = TimeseriesAnomalyInvestigationType.TimeseriesAnomalyInvestigationTypeSerializer.class)
public class TimeseriesAnomalyInvestigationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timeseries_anomaly_investigation"));

  public static final TimeseriesAnomalyInvestigationType TIMESERIES_ANOMALY_INVESTIGATION =
      new TimeseriesAnomalyInvestigationType("timeseries_anomaly_investigation");

  TimeseriesAnomalyInvestigationType(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesAnomalyInvestigationTypeSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationType> {
    public TimeseriesAnomalyInvestigationTypeSerializer(
        Class<TimeseriesAnomalyInvestigationType> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesAnomalyInvestigationType fromValue(String value) {
    return new TimeseriesAnomalyInvestigationType(value);
  }
}
