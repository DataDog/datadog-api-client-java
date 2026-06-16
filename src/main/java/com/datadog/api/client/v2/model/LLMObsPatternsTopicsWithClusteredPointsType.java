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

/** Resource type of an LLM Observability patterns topics-with-clustered-points response. */
@JsonSerialize(
    using =
        LLMObsPatternsTopicsWithClusteredPointsType
            .LLMObsPatternsTopicsWithClusteredPointsTypeSerializer.class)
public class LLMObsPatternsTopicsWithClusteredPointsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("get_topics_with_cluster_points_response"));

  public static final LLMObsPatternsTopicsWithClusteredPointsType
      GET_TOPICS_WITH_CLUSTER_POINTS_RESPONSE =
          new LLMObsPatternsTopicsWithClusteredPointsType(
              "get_topics_with_cluster_points_response");

  LLMObsPatternsTopicsWithClusteredPointsType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsPatternsTopicsWithClusteredPointsTypeSerializer
      extends StdSerializer<LLMObsPatternsTopicsWithClusteredPointsType> {
    public LLMObsPatternsTopicsWithClusteredPointsTypeSerializer(
        Class<LLMObsPatternsTopicsWithClusteredPointsType> t) {
      super(t);
    }

    public LLMObsPatternsTopicsWithClusteredPointsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsPatternsTopicsWithClusteredPointsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsPatternsTopicsWithClusteredPointsType fromValue(String value) {
    return new LLMObsPatternsTopicsWithClusteredPointsType(value);
  }
}
