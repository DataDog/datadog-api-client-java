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

/** Type of metric recorded for an LLM Observability experiment. */
@JsonSerialize(using = LLMObsMetricScoreType.LLMObsMetricScoreTypeSerializer.class)
public class LLMObsMetricScoreType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("score", "categorical", "boolean", "json"));

  public static final LLMObsMetricScoreType SCORE = new LLMObsMetricScoreType("score");
  public static final LLMObsMetricScoreType CATEGORICAL = new LLMObsMetricScoreType("categorical");
  public static final LLMObsMetricScoreType BOOLEAN = new LLMObsMetricScoreType("boolean");
  public static final LLMObsMetricScoreType JSON = new LLMObsMetricScoreType("json");

  LLMObsMetricScoreType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsMetricScoreTypeSerializer extends StdSerializer<LLMObsMetricScoreType> {
    public LLMObsMetricScoreTypeSerializer(Class<LLMObsMetricScoreType> t) {
      super(t);
    }

    public LLMObsMetricScoreTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsMetricScoreType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsMetricScoreType fromValue(String value) {
    return new LLMObsMetricScoreType(value);
  }
}
