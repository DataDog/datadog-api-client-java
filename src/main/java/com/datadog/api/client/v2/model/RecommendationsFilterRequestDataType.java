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

/** Legacy JSON:API resource type required by the cost recommendations search decoder. */
@JsonSerialize(
    using =
        RecommendationsFilterRequestDataType.RecommendationsFilterRequestDataTypeSerializer.class)
public class RecommendationsFilterRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("recommendations_filter"));

  public static final RecommendationsFilterRequestDataType RECOMMENDATIONS_FILTER =
      new RecommendationsFilterRequestDataType("recommendations_filter");

  RecommendationsFilterRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class RecommendationsFilterRequestDataTypeSerializer
      extends StdSerializer<RecommendationsFilterRequestDataType> {
    public RecommendationsFilterRequestDataTypeSerializer(
        Class<RecommendationsFilterRequestDataType> t) {
      super(t);
    }

    public RecommendationsFilterRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RecommendationsFilterRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RecommendationsFilterRequestDataType fromValue(String value) {
    return new RecommendationsFilterRequestDataType(value);
  }
}
