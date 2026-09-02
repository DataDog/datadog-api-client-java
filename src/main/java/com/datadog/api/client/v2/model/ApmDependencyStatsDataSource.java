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

/** A data source for APM dependency statistics queries. */
@JsonSerialize(using = ApmDependencyStatsDataSource.ApmDependencyStatsDataSourceSerializer.class)
public class ApmDependencyStatsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("apm_dependency_stats"));

  public static final ApmDependencyStatsDataSource APM_DEPENDENCY_STATS =
      new ApmDependencyStatsDataSource("apm_dependency_stats");

  ApmDependencyStatsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class ApmDependencyStatsDataSourceSerializer
      extends StdSerializer<ApmDependencyStatsDataSource> {
    public ApmDependencyStatsDataSourceSerializer(Class<ApmDependencyStatsDataSource> t) {
      super(t);
    }

    public ApmDependencyStatsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApmDependencyStatsDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmDependencyStatsDataSource fromValue(String value) {
    return new ApmDependencyStatsDataSource(value);
  }
}
