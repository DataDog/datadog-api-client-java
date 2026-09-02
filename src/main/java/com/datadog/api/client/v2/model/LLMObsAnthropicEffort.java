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

/** The effort level for Anthropic inference. */
@JsonSerialize(using = LLMObsAnthropicEffort.LLMObsAnthropicEffortSerializer.class)
public class LLMObsAnthropicEffort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("low", "medium", "high", "max"));

  public static final LLMObsAnthropicEffort LOW = new LLMObsAnthropicEffort("low");
  public static final LLMObsAnthropicEffort MEDIUM = new LLMObsAnthropicEffort("medium");
  public static final LLMObsAnthropicEffort HIGH = new LLMObsAnthropicEffort("high");
  public static final LLMObsAnthropicEffort MAX = new LLMObsAnthropicEffort("max");

  LLMObsAnthropicEffort(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsAnthropicEffortSerializer extends StdSerializer<LLMObsAnthropicEffort> {
    public LLMObsAnthropicEffortSerializer(Class<LLMObsAnthropicEffort> t) {
      super(t);
    }

    public LLMObsAnthropicEffortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsAnthropicEffort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsAnthropicEffort fromValue(String value) {
    return new LLMObsAnthropicEffort(value);
  }
}
