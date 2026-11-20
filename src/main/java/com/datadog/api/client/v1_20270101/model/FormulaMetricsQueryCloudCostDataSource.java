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
@JsonSerialize(
    using =
        FormulaMetricsQueryCloudCostDataSource.FormulaMetricsQueryCloudCostDataSourceSerializer
            .class)
public class FormulaMetricsQueryCloudCostDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("cloud_cost"));

  public static final FormulaMetricsQueryCloudCostDataSource CLOUD_COST =
      new FormulaMetricsQueryCloudCostDataSource("cloud_cost");

  FormulaMetricsQueryCloudCostDataSource(String value) {
    super(value, allowedValues);
  }

  public static class FormulaMetricsQueryCloudCostDataSourceSerializer
      extends StdSerializer<FormulaMetricsQueryCloudCostDataSource> {
    public FormulaMetricsQueryCloudCostDataSourceSerializer(
        Class<FormulaMetricsQueryCloudCostDataSource> t) {
      super(t);
    }

    public FormulaMetricsQueryCloudCostDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaMetricsQueryCloudCostDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaMetricsQueryCloudCostDataSource fromValue(String value) {
    return new FormulaMetricsQueryCloudCostDataSource(value);
  }
}
