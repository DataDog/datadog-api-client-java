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

/** Maximum reasoning level permitted by a model group. */
@JsonSerialize(using = AiGatewayMaxReasoningLevel.AiGatewayMaxReasoningLevelSerializer.class)
public class AiGatewayMaxReasoningLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("none", "minimal", "low", "medium", "high", "xhigh", "max"));

  public static final AiGatewayMaxReasoningLevel NONE = new AiGatewayMaxReasoningLevel("none");
  public static final AiGatewayMaxReasoningLevel MINIMAL =
      new AiGatewayMaxReasoningLevel("minimal");
  public static final AiGatewayMaxReasoningLevel LOW = new AiGatewayMaxReasoningLevel("low");
  public static final AiGatewayMaxReasoningLevel MEDIUM = new AiGatewayMaxReasoningLevel("medium");
  public static final AiGatewayMaxReasoningLevel HIGH = new AiGatewayMaxReasoningLevel("high");
  public static final AiGatewayMaxReasoningLevel XHIGH = new AiGatewayMaxReasoningLevel("xhigh");
  public static final AiGatewayMaxReasoningLevel MAX = new AiGatewayMaxReasoningLevel("max");

  AiGatewayMaxReasoningLevel(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayMaxReasoningLevelSerializer
      extends StdSerializer<AiGatewayMaxReasoningLevel> {
    public AiGatewayMaxReasoningLevelSerializer(Class<AiGatewayMaxReasoningLevel> t) {
      super(t);
    }

    public AiGatewayMaxReasoningLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayMaxReasoningLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayMaxReasoningLevel fromValue(String value) {
    return new AiGatewayMaxReasoningLevel(value);
  }
}
