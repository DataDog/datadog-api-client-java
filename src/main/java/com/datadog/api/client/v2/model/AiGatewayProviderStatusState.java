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
 * Whether the provider is working. <code>checking</code> means no observation has been recorded
 * yet, not that a check is running.
 */
@JsonSerialize(using = AiGatewayProviderStatusState.AiGatewayProviderStatusStateSerializer.class)
public class AiGatewayProviderStatusState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ok", "invalid", "checking"));

  public static final AiGatewayProviderStatusState OK = new AiGatewayProviderStatusState("ok");
  public static final AiGatewayProviderStatusState INVALID =
      new AiGatewayProviderStatusState("invalid");
  public static final AiGatewayProviderStatusState CHECKING =
      new AiGatewayProviderStatusState("checking");

  AiGatewayProviderStatusState(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayProviderStatusStateSerializer
      extends StdSerializer<AiGatewayProviderStatusState> {
    public AiGatewayProviderStatusStateSerializer(Class<AiGatewayProviderStatusState> t) {
      super(t);
    }

    public AiGatewayProviderStatusStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayProviderStatusState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayProviderStatusState fromValue(String value) {
    return new AiGatewayProviderStatusState(value);
  }
}
