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

/** Known provider implementation. */
@JsonSerialize(using = AiGatewayKnownProvider.AiGatewayKnownProviderSerializer.class)
public class AiGatewayKnownProvider extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "custom",
              "anthropic",
              "openai",
              "azure_openai",
              "bedrock",
              "gemini",
              "baseten",
              "fireworks",
              "together",
              "typesafe",
              "azure_foundry"));

  public static final AiGatewayKnownProvider CUSTOM = new AiGatewayKnownProvider("custom");
  public static final AiGatewayKnownProvider ANTHROPIC = new AiGatewayKnownProvider("anthropic");
  public static final AiGatewayKnownProvider OPENAI = new AiGatewayKnownProvider("openai");
  public static final AiGatewayKnownProvider AZURE_OPENAI =
      new AiGatewayKnownProvider("azure_openai");
  public static final AiGatewayKnownProvider BEDROCK = new AiGatewayKnownProvider("bedrock");
  public static final AiGatewayKnownProvider GEMINI = new AiGatewayKnownProvider("gemini");
  public static final AiGatewayKnownProvider BASETEN = new AiGatewayKnownProvider("baseten");
  public static final AiGatewayKnownProvider FIREWORKS = new AiGatewayKnownProvider("fireworks");
  public static final AiGatewayKnownProvider TOGETHER = new AiGatewayKnownProvider("together");
  public static final AiGatewayKnownProvider TYPESAFE = new AiGatewayKnownProvider("typesafe");
  public static final AiGatewayKnownProvider AZURE_FOUNDRY =
      new AiGatewayKnownProvider("azure_foundry");

  AiGatewayKnownProvider(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayKnownProviderSerializer
      extends StdSerializer<AiGatewayKnownProvider> {
    public AiGatewayKnownProviderSerializer(Class<AiGatewayKnownProvider> t) {
      super(t);
    }

    public AiGatewayKnownProviderSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayKnownProvider value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayKnownProvider fromValue(String value) {
    return new AiGatewayKnownProvider(value);
  }
}
