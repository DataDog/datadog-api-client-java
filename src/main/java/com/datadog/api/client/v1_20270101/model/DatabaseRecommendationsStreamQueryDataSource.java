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
        DatabaseRecommendationsStreamQueryDataSource
            .DatabaseRecommendationsStreamQueryDataSourceSerializer.class)
public class DatabaseRecommendationsStreamQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("database_recommendations_stream"));

  public static final DatabaseRecommendationsStreamQueryDataSource DATABASE_RECOMMENDATIONS_STREAM =
      new DatabaseRecommendationsStreamQueryDataSource("database_recommendations_stream");

  DatabaseRecommendationsStreamQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class DatabaseRecommendationsStreamQueryDataSourceSerializer
      extends StdSerializer<DatabaseRecommendationsStreamQueryDataSource> {
    public DatabaseRecommendationsStreamQueryDataSourceSerializer(
        Class<DatabaseRecommendationsStreamQueryDataSource> t) {
      super(t);
    }

    public DatabaseRecommendationsStreamQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatabaseRecommendationsStreamQueryDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatabaseRecommendationsStreamQueryDataSource fromValue(String value) {
    return new DatabaseRecommendationsStreamQueryDataSource(value);
  }
}
