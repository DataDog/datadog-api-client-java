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

/** Outcome of optional influential-tag enrichment. */
@JsonSerialize(
    using =
        TimeseriesAnomalyInvestigationTagAnalysisStatus
            .TimeseriesAnomalyInvestigationTagAnalysisStatusSerializer.class)
public class TimeseriesAnomalyInvestigationTagAnalysisStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("complete", "unsupported", "failed"));

  public static final TimeseriesAnomalyInvestigationTagAnalysisStatus COMPLETE =
      new TimeseriesAnomalyInvestigationTagAnalysisStatus("complete");
  public static final TimeseriesAnomalyInvestigationTagAnalysisStatus UNSUPPORTED =
      new TimeseriesAnomalyInvestigationTagAnalysisStatus("unsupported");
  public static final TimeseriesAnomalyInvestigationTagAnalysisStatus FAILED =
      new TimeseriesAnomalyInvestigationTagAnalysisStatus("failed");

  TimeseriesAnomalyInvestigationTagAnalysisStatus(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesAnomalyInvestigationTagAnalysisStatusSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationTagAnalysisStatus> {
    public TimeseriesAnomalyInvestigationTagAnalysisStatusSerializer(
        Class<TimeseriesAnomalyInvestigationTagAnalysisStatus> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationTagAnalysisStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationTagAnalysisStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesAnomalyInvestigationTagAnalysisStatus fromValue(String value) {
    return new TimeseriesAnomalyInvestigationTagAnalysisStatus(value);
  }
}
