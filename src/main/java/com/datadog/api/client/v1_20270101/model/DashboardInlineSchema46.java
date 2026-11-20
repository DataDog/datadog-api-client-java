/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = DashboardInlineSchema46.DashboardInlineSchema46Serializer.class)
public class DashboardInlineSchema46 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "burn_rate", "error_budget_burndown", "error_budget_remaining", "slo_status"));

  public static final DashboardInlineSchema46 BURN_RATE = new DashboardInlineSchema46("burn_rate");
  public static final DashboardInlineSchema46 ERROR_BUDGET_BURNDOWN =
      new DashboardInlineSchema46("error_budget_burndown");
  public static final DashboardInlineSchema46 ERROR_BUDGET_REMAINING =
      new DashboardInlineSchema46("error_budget_remaining");
  public static final DashboardInlineSchema46 SLO_STATUS =
      new DashboardInlineSchema46("slo_status");

  DashboardInlineSchema46(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema46Serializer
      extends StdSerializer<DashboardInlineSchema46> {
    public DashboardInlineSchema46Serializer(Class<DashboardInlineSchema46> t) {
      super(t);
    }

    public DashboardInlineSchema46Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema46 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema46 fromValue(String value) {
    return new DashboardInlineSchema46(value);
  }
}
