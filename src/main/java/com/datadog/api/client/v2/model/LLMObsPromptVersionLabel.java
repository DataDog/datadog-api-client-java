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

/** A label attached to an LLM Observability prompt version. */
@JsonSerialize(using = LLMObsPromptVersionLabel.LLMObsPromptVersionLabelSerializer.class)
public class LLMObsPromptVersionLabel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("production", "development"));

  public static final LLMObsPromptVersionLabel PRODUCTION =
      new LLMObsPromptVersionLabel("production");
  public static final LLMObsPromptVersionLabel DEVELOPMENT =
      new LLMObsPromptVersionLabel("development");

  LLMObsPromptVersionLabel(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsPromptVersionLabelSerializer
      extends StdSerializer<LLMObsPromptVersionLabel> {
    public LLMObsPromptVersionLabelSerializer(Class<LLMObsPromptVersionLabel> t) {
      super(t);
    }

    public LLMObsPromptVersionLabelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsPromptVersionLabel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsPromptVersionLabel fromValue(String value) {
    return new LLMObsPromptVersionLabel(value);
  }
}
