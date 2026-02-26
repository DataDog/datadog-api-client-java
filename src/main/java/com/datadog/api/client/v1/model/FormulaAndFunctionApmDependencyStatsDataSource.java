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

/** Data source for APM dependency stats queries. */
@JsonSerialize(
    using =
        FormulaAndFunctionApmDependencyStatsDataSource
            .FormulaAndFunctionApmDependencyStatsDataSourceSerializer.class)
public class FormulaAndFunctionApmDependencyStatsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("apm_dependency_stats"));

  public static final FormulaAndFunctionApmDependencyStatsDataSource APM_DEPENDENCY_STATS =
      new FormulaAndFunctionApmDependencyStatsDataSource("apm_dependency_stats");

  FormulaAndFunctionApmDependencyStatsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionApmDependencyStatsDataSourceSerializer
      extends StdSerializer<FormulaAndFunctionApmDependencyStatsDataSource> {
    public FormulaAndFunctionApmDependencyStatsDataSourceSerializer(
        Class<FormulaAndFunctionApmDependencyStatsDataSource> t) {
      super(t);
    }

    public FormulaAndFunctionApmDependencyStatsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionApmDependencyStatsDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormulaAndFunctionApmDependencyStatsDataSource fromValue(String value) {
    return new FormulaAndFunctionApmDependencyStatsDataSource(value);
  }
}
