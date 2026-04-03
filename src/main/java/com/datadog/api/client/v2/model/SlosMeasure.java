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

/** The SLO measurement to retrieve. */
@JsonSerialize(using = SlosMeasure.SlosMeasureSerializer.class)
public class SlosMeasure extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "good_events",
              "bad_events",
              "slo_status",
              "error_budget_remaining",
              "error_budget_remaining_history",
              "error_budget_burndown",
              "burn_rate",
              "slo_status_history",
              "good_minutes",
              "bad_minutes"));

  public static final SlosMeasure GOOD_EVENTS = new SlosMeasure("good_events");
  public static final SlosMeasure BAD_EVENTS = new SlosMeasure("bad_events");
  public static final SlosMeasure SLO_STATUS = new SlosMeasure("slo_status");
  public static final SlosMeasure ERROR_BUDGET_REMAINING =
      new SlosMeasure("error_budget_remaining");
  public static final SlosMeasure ERROR_BUDGET_REMAINING_HISTORY =
      new SlosMeasure("error_budget_remaining_history");
  public static final SlosMeasure ERROR_BUDGET_BURNDOWN = new SlosMeasure("error_budget_burndown");
  public static final SlosMeasure BURN_RATE = new SlosMeasure("burn_rate");
  public static final SlosMeasure SLO_STATUS_HISTORY = new SlosMeasure("slo_status_history");
  public static final SlosMeasure GOOD_MINUTES = new SlosMeasure("good_minutes");
  public static final SlosMeasure BAD_MINUTES = new SlosMeasure("bad_minutes");

  SlosMeasure(String value) {
    super(value, allowedValues);
  }

  public static class SlosMeasureSerializer extends StdSerializer<SlosMeasure> {
    public SlosMeasureSerializer(Class<SlosMeasure> t) {
      super(t);
    }

    public SlosMeasureSerializer() {
      this(null);
    }

    @Override
    public void serialize(SlosMeasure value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SlosMeasure fromValue(String value) {
    return new SlosMeasure(value);
  }
}
