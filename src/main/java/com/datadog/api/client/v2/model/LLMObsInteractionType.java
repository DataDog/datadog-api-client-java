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

/** Type of interaction in an annotation queue. */
@JsonSerialize(using = LLMObsInteractionType.LLMObsInteractionTypeSerializer.class)
public class LLMObsInteractionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("trace", "experiment_trace"));

  public static final LLMObsInteractionType TRACE = new LLMObsInteractionType("trace");
  public static final LLMObsInteractionType EXPERIMENT_TRACE =
      new LLMObsInteractionType("experiment_trace");

  LLMObsInteractionType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsInteractionTypeSerializer extends StdSerializer<LLMObsInteractionType> {
    public LLMObsInteractionTypeSerializer(Class<LLMObsInteractionType> t) {
      super(t);
    }

    public LLMObsInteractionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsInteractionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsInteractionType fromValue(String value) {
    return new LLMObsInteractionType(value);
  }
}
