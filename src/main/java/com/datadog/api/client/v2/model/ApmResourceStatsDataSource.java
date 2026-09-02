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

/** A data source for APM resource statistics queries. */
@JsonSerialize(using = ApmResourceStatsDataSource.ApmResourceStatsDataSourceSerializer.class)
public class ApmResourceStatsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("apm_resource_stats"));

  public static final ApmResourceStatsDataSource APM_RESOURCE_STATS =
      new ApmResourceStatsDataSource("apm_resource_stats");

  ApmResourceStatsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class ApmResourceStatsDataSourceSerializer
      extends StdSerializer<ApmResourceStatsDataSource> {
    public ApmResourceStatsDataSourceSerializer(Class<ApmResourceStatsDataSource> t) {
      super(t);
    }

    public ApmResourceStatsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApmResourceStatsDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApmResourceStatsDataSource fromValue(String value) {
    return new ApmResourceStatsDataSource(value);
  }
}
