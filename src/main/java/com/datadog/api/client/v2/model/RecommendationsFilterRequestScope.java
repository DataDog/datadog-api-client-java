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

/**
 * Recommendations scope. Defaults to <code>ccm</code>; use <code>experiment</code> for experimental
 * recommendations or <code>*</code> for both.
 */
@JsonSerialize(
    using = RecommendationsFilterRequestScope.RecommendationsFilterRequestScopeSerializer.class)
public class RecommendationsFilterRequestScope extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ccm", "experiment", "*"));

  public static final RecommendationsFilterRequestScope CCM =
      new RecommendationsFilterRequestScope("ccm");
  public static final RecommendationsFilterRequestScope EXPERIMENT =
      new RecommendationsFilterRequestScope("experiment");
  public static final RecommendationsFilterRequestScope ALL =
      new RecommendationsFilterRequestScope("*");

  RecommendationsFilterRequestScope(String value) {
    super(value, allowedValues);
  }

  public static class RecommendationsFilterRequestScopeSerializer
      extends StdSerializer<RecommendationsFilterRequestScope> {
    public RecommendationsFilterRequestScopeSerializer(Class<RecommendationsFilterRequestScope> t) {
      super(t);
    }

    public RecommendationsFilterRequestScopeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RecommendationsFilterRequestScope value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RecommendationsFilterRequestScope fromValue(String value) {
    return new RecommendationsFilterRequestScope(value);
  }
}
