/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** SLO measures queries. */
@JsonSerialize(using = FormulaAndFunctionSLOMeasure.FormulaAndFunctionSLOMeasureSerializer.class)
public class FormulaAndFunctionSLOMeasure extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "good_events",
              "bad_events",
              "good_minutes",
              "bad_minutes",
              "slo_status",
              "error_budget_remaining",
              "burn_rate",
              "error_budget_burndown"));

  public static final FormulaAndFunctionSLOMeasure GOOD_EVENTS =
      new FormulaAndFunctionSLOMeasure("good_events");
  public static final FormulaAndFunctionSLOMeasure BAD_EVENTS =
      new FormulaAndFunctionSLOMeasure("bad_events");
  public static final FormulaAndFunctionSLOMeasure GOOD_MINUTES =
      new FormulaAndFunctionSLOMeasure("good_minutes");
  public static final FormulaAndFunctionSLOMeasure BAD_MINUTES =
      new FormulaAndFunctionSLOMeasure("bad_minutes");
  public static final FormulaAndFunctionSLOMeasure SLO_STATUS =
      new FormulaAndFunctionSLOMeasure("slo_status");
  public static final FormulaAndFunctionSLOMeasure ERROR_BUDGET_REMAINING =
      new FormulaAndFunctionSLOMeasure("error_budget_remaining");
  public static final FormulaAndFunctionSLOMeasure BURN_RATE =
      new FormulaAndFunctionSLOMeasure("burn_rate");
  public static final FormulaAndFunctionSLOMeasure ERROR_BUDGET_BURNDOWN =
      new FormulaAndFunctionSLOMeasure("error_budget_burndown");

  FormulaAndFunctionSLOMeasure(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionSLOMeasureSerializer
      extends StdSerializer<FormulaAndFunctionSLOMeasure> {
    public FormulaAndFunctionSLOMeasureSerializer(Class<FormulaAndFunctionSLOMeasure> t) {
      super(t);
    }

    public FormulaAndFunctionSLOMeasureSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionSLOMeasure value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionSLOMeasure fromValue(String value) {
    return new FormulaAndFunctionSLOMeasure(value);
  }
}
