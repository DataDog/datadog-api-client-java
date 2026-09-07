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
 * JSON:API resource type for Spark Pod Autosizing recommendations. Identifies the Recommendation
 * resource returned by SPA.
 */
@JsonSerialize(using = RecommendationType.RecommendationTypeSerializer.class)
public class RecommendationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("recommendation"));

  public static final RecommendationType RECOMMENDATION = new RecommendationType("recommendation");

  RecommendationType(String value) {
    super(value, allowedValues);
  }

  public static class RecommendationTypeSerializer extends StdSerializer<RecommendationType> {
    public RecommendationTypeSerializer(Class<RecommendationType> t) {
      super(t);
    }

    public RecommendationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RecommendationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RecommendationType fromValue(String value) {
    return new RecommendationType(value);
  }
}
