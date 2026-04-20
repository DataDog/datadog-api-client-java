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

/** Scope at which to evaluate spans. */
@JsonSerialize(
    using = LLMObsCustomEvalConfigEvalScope.LLMObsCustomEvalConfigEvalScopeSerializer.class)
public class LLMObsCustomEvalConfigEvalScope extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("span", "trace", "session"));

  public static final LLMObsCustomEvalConfigEvalScope SPAN =
      new LLMObsCustomEvalConfigEvalScope("span");
  public static final LLMObsCustomEvalConfigEvalScope TRACE =
      new LLMObsCustomEvalConfigEvalScope("trace");
  public static final LLMObsCustomEvalConfigEvalScope SESSION =
      new LLMObsCustomEvalConfigEvalScope("session");

  LLMObsCustomEvalConfigEvalScope(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsCustomEvalConfigEvalScopeSerializer
      extends StdSerializer<LLMObsCustomEvalConfigEvalScope> {
    public LLMObsCustomEvalConfigEvalScopeSerializer(Class<LLMObsCustomEvalConfigEvalScope> t) {
      super(t);
    }

    public LLMObsCustomEvalConfigEvalScopeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsCustomEvalConfigEvalScope value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsCustomEvalConfigEvalScope fromValue(String value) {
    return new LLMObsCustomEvalConfigEvalScope(value);
  }
}
