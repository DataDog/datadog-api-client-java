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

/** Status of the span. */
@JsonSerialize(using = LLMObsExperimentSpanStatus.LLMObsExperimentSpanStatusSerializer.class)
public class LLMObsExperimentSpanStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ok", "error"));

  public static final LLMObsExperimentSpanStatus OK = new LLMObsExperimentSpanStatus("ok");
  public static final LLMObsExperimentSpanStatus ERROR = new LLMObsExperimentSpanStatus("error");

  LLMObsExperimentSpanStatus(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsExperimentSpanStatusSerializer
      extends StdSerializer<LLMObsExperimentSpanStatus> {
    public LLMObsExperimentSpanStatusSerializer(Class<LLMObsExperimentSpanStatus> t) {
      super(t);
    }

    public LLMObsExperimentSpanStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsExperimentSpanStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsExperimentSpanStatus fromValue(String value) {
    return new LLMObsExperimentSpanStatus(value);
  }
}
