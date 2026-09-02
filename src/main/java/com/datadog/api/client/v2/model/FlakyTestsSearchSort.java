/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Parameter for sorting flaky test results. The default sort is by ascending Fully Qualified Name (FQN). The FQN is the concatenation of the test module, suite, and name.</p>
 */
@JsonSerialize(using = FlakyTestsSearchSort.FlakyTestsSearchSortSerializer.class)
public class FlakyTestsSearchSort extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("fqn", "-fqn", "first_flaked", "-first_flaked", "last_flaked", "-last_flaked", "failure_rate", "-failure_rate", "pipelines_failed", "-pipelines_failed", "pipelines_duration_lost", "-pipelines_duration_lost"));

  public static final FlakyTestsSearchSort FQN_ASCENDING = new FlakyTestsSearchSort("fqn");
  public static final FlakyTestsSearchSort FQN_DESCENDING = new FlakyTestsSearchSort("-fqn");
  public static final FlakyTestsSearchSort FIRST_FLAKED_ASCENDING = new FlakyTestsSearchSort("first_flaked");
  public static final FlakyTestsSearchSort FIRST_FLAKED_DESCENDING = new FlakyTestsSearchSort("-first_flaked");
  public static final FlakyTestsSearchSort LAST_FLAKED_ASCENDING = new FlakyTestsSearchSort("last_flaked");
  public static final FlakyTestsSearchSort LAST_FLAKED_DESCENDING = new FlakyTestsSearchSort("-last_flaked");
  public static final FlakyTestsSearchSort FAILURE_RATE_ASCENDING = new FlakyTestsSearchSort("failure_rate");
  public static final FlakyTestsSearchSort FAILURE_RATE_DESCENDING = new FlakyTestsSearchSort("-failure_rate");
  public static final FlakyTestsSearchSort PIPELINES_FAILED_ASCENDING = new FlakyTestsSearchSort("pipelines_failed");
  public static final FlakyTestsSearchSort PIPELINES_FAILED_DESCENDING = new FlakyTestsSearchSort("-pipelines_failed");
  public static final FlakyTestsSearchSort PIPELINES_DURATION_LOST_ASCENDING = new FlakyTestsSearchSort("pipelines_duration_lost");
  public static final FlakyTestsSearchSort PIPELINES_DURATION_LOST_DESCENDING = new FlakyTestsSearchSort("-pipelines_duration_lost");


  FlakyTestsSearchSort(String value) {
    super(value, allowedValues);
  }

  public static class FlakyTestsSearchSortSerializer extends StdSerializer<FlakyTestsSearchSort> {
      public FlakyTestsSearchSortSerializer(Class<FlakyTestsSearchSort> t) {
          super(t);
      }

      public FlakyTestsSearchSortSerializer() {
          this(null);
      }

      @Override
      public void serialize(FlakyTestsSearchSort value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static FlakyTestsSearchSort fromValue(String value) {
    return new FlakyTestsSearchSort(value);
  }
}
