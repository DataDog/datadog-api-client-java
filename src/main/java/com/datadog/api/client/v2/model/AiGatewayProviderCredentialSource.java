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
 * Whose credential the gateway sends to the provider. <code>integration_account</code> sends the
 * integration account's credential. <code>subscription</code> forwards each caller's own
 * subscription sign-in (<code>ChatGPT</code> for <code>openai</code>, <code>claude.ai</code> for
 * <code>anthropic</code>) and needs no integration account.
 */
@JsonSerialize(
    using = AiGatewayProviderCredentialSource.AiGatewayProviderCredentialSourceSerializer.class)
public class AiGatewayProviderCredentialSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("integration_account", "subscription"));

  public static final AiGatewayProviderCredentialSource INTEGRATION_ACCOUNT =
      new AiGatewayProviderCredentialSource("integration_account");
  public static final AiGatewayProviderCredentialSource SUBSCRIPTION =
      new AiGatewayProviderCredentialSource("subscription");

  AiGatewayProviderCredentialSource(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayProviderCredentialSourceSerializer
      extends StdSerializer<AiGatewayProviderCredentialSource> {
    public AiGatewayProviderCredentialSourceSerializer(Class<AiGatewayProviderCredentialSource> t) {
      super(t);
    }

    public AiGatewayProviderCredentialSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayProviderCredentialSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayProviderCredentialSource fromValue(String value) {
    return new AiGatewayProviderCredentialSource(value);
  }
}
