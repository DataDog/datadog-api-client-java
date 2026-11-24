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

/** Operation supported by a custom provider. */
@JsonSerialize(
    using =
        AiGatewayCustomProviderSupportedOperation
            .AiGatewayCustomProviderSupportedOperationSerializer.class)
public class AiGatewayCustomProviderSupportedOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "OPENAI_CHAT_COMPLETIONS", "OPENAI_RESPONSES", "ANTHROPIC_MESSAGES", "SYSTEM_ONE"));

  public static final AiGatewayCustomProviderSupportedOperation OPENAI_CHAT_COMPLETIONS =
      new AiGatewayCustomProviderSupportedOperation("OPENAI_CHAT_COMPLETIONS");
  public static final AiGatewayCustomProviderSupportedOperation OPENAI_RESPONSES =
      new AiGatewayCustomProviderSupportedOperation("OPENAI_RESPONSES");
  public static final AiGatewayCustomProviderSupportedOperation ANTHROPIC_MESSAGES =
      new AiGatewayCustomProviderSupportedOperation("ANTHROPIC_MESSAGES");
  public static final AiGatewayCustomProviderSupportedOperation SYSTEM_ONE =
      new AiGatewayCustomProviderSupportedOperation("SYSTEM_ONE");

  AiGatewayCustomProviderSupportedOperation(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCustomProviderSupportedOperationSerializer
      extends StdSerializer<AiGatewayCustomProviderSupportedOperation> {
    public AiGatewayCustomProviderSupportedOperationSerializer(
        Class<AiGatewayCustomProviderSupportedOperation> t) {
      super(t);
    }

    public AiGatewayCustomProviderSupportedOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCustomProviderSupportedOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCustomProviderSupportedOperation fromValue(String value) {
    return new AiGatewayCustomProviderSupportedOperation(value);
  }
}
