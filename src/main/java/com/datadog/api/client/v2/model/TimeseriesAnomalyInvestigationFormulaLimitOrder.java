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

/** Sort order used when applying a formula series limit. */
@JsonSerialize(
    using =
        TimeseriesAnomalyInvestigationFormulaLimitOrder
            .TimeseriesAnomalyInvestigationFormulaLimitOrderSerializer.class)
public class TimeseriesAnomalyInvestigationFormulaLimitOrder extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("asc", "desc"));

  public static final TimeseriesAnomalyInvestigationFormulaLimitOrder ASC =
      new TimeseriesAnomalyInvestigationFormulaLimitOrder("asc");
  public static final TimeseriesAnomalyInvestigationFormulaLimitOrder DESC =
      new TimeseriesAnomalyInvestigationFormulaLimitOrder("desc");

  TimeseriesAnomalyInvestigationFormulaLimitOrder(String value) {
    super(value, allowedValues);
  }

  public static class TimeseriesAnomalyInvestigationFormulaLimitOrderSerializer
      extends StdSerializer<TimeseriesAnomalyInvestigationFormulaLimitOrder> {
    public TimeseriesAnomalyInvestigationFormulaLimitOrderSerializer(
        Class<TimeseriesAnomalyInvestigationFormulaLimitOrder> t) {
      super(t);
    }

    public TimeseriesAnomalyInvestigationFormulaLimitOrderSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TimeseriesAnomalyInvestigationFormulaLimitOrder value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimeseriesAnomalyInvestigationFormulaLimitOrder fromValue(String value) {
    return new TimeseriesAnomalyInvestigationFormulaLimitOrder(value);
  }
}
