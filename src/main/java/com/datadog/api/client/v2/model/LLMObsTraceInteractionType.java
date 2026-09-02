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

/** Type of an upstream-entity interaction. */
@JsonSerialize(using = LLMObsTraceInteractionType.LLMObsTraceInteractionTypeSerializer.class)
public class LLMObsTraceInteractionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("trace", "experiment_trace", "session"));

  public static final LLMObsTraceInteractionType TRACE = new LLMObsTraceInteractionType("trace");
  public static final LLMObsTraceInteractionType EXPERIMENT_TRACE =
      new LLMObsTraceInteractionType("experiment_trace");
  public static final LLMObsTraceInteractionType SESSION =
      new LLMObsTraceInteractionType("session");

  LLMObsTraceInteractionType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsTraceInteractionTypeSerializer
      extends StdSerializer<LLMObsTraceInteractionType> {
    public LLMObsTraceInteractionTypeSerializer(Class<LLMObsTraceInteractionType> t) {
      super(t);
    }

    public LLMObsTraceInteractionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsTraceInteractionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsTraceInteractionType fromValue(String value) {
    return new LLMObsTraceInteractionType(value);
  }
}
