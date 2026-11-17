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

/**
 * Whose credential the gateway sends to the provider. Defaults to <code>integration_account</code>,
 * which sends the integration account's credential. <code>subscription</code> forwards each
 * caller's own subscription sign-in (<code>ChatGPT</code> for <code>openai</code>, <code>claude.ai
 * </code> for <code>anthropic</code>) and needs no integration account; it is available only to
 * organizations with subscription providers enabled. A subscription provider's models are optional:
 * callers can use any model their subscription includes, and a model you add sets its pricing.
 * Immutable.
 */
@JsonSerialize(
    using =
        AiGatewayProviderCreateCredentialSource.AiGatewayProviderCreateCredentialSourceSerializer
            .class)
public class AiGatewayProviderCreateCredentialSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("integration_account", "subscription"));

  public static final AiGatewayProviderCreateCredentialSource INTEGRATION_ACCOUNT =
      new AiGatewayProviderCreateCredentialSource("integration_account");
  public static final AiGatewayProviderCreateCredentialSource SUBSCRIPTION =
      new AiGatewayProviderCreateCredentialSource("subscription");

  AiGatewayProviderCreateCredentialSource(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayProviderCreateCredentialSourceSerializer
      extends StdSerializer<AiGatewayProviderCreateCredentialSource> {
    public AiGatewayProviderCreateCredentialSourceSerializer(
        Class<AiGatewayProviderCreateCredentialSource> t) {
      super(t);
    }

    public AiGatewayProviderCreateCredentialSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayProviderCreateCredentialSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayProviderCreateCredentialSource fromValue(String value) {
    return new AiGatewayProviderCreateCredentialSource(value);
  }
}
