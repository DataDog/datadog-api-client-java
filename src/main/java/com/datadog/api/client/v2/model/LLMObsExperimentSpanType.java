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

/** Resource type for a span item in an experiment spans response. */
@JsonSerialize(using = LLMObsExperimentSpanType.LLMObsExperimentSpanTypeSerializer.class)
public class LLMObsExperimentSpanType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiments"));

  public static final LLMObsExperimentSpanType EXPERIMENTS_SPAN =
      new LLMObsExperimentSpanType("experiments");

  LLMObsExperimentSpanType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsExperimentSpanTypeSerializer
      extends StdSerializer<LLMObsExperimentSpanType> {
    public LLMObsExperimentSpanTypeSerializer(Class<LLMObsExperimentSpanType> t) {
      super(t);
    }

    public LLMObsExperimentSpanTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsExperimentSpanType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsExperimentSpanType fromValue(String value) {
    return new LLMObsExperimentSpanType(value);
  }
}
