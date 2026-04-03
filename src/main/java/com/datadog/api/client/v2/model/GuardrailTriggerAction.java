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

/** Action to perform when a guardrail threshold is triggered. */
@JsonSerialize(using = GuardrailTriggerAction.GuardrailTriggerActionSerializer.class)
public class GuardrailTriggerAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("PAUSE", "ABORT"));

  public static final GuardrailTriggerAction PAUSE = new GuardrailTriggerAction("PAUSE");
  public static final GuardrailTriggerAction ABORT = new GuardrailTriggerAction("ABORT");

  GuardrailTriggerAction(String value) {
    super(value, allowedValues);
  }

  public static class GuardrailTriggerActionSerializer
      extends StdSerializer<GuardrailTriggerAction> {
    public GuardrailTriggerActionSerializer(Class<GuardrailTriggerAction> t) {
      super(t);
    }

    public GuardrailTriggerActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuardrailTriggerAction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuardrailTriggerAction fromValue(String value) {
    return new GuardrailTriggerAction(value);
  }
}
