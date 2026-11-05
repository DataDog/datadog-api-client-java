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
@JsonSerialize(
    using = AiGatewayNullableMaxReasoningLevel.AiGatewayNullableMaxReasoningLevelSerializer.class)
public class AiGatewayNullableMaxReasoningLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("none", "minimal", "low", "medium", "high", "xhigh", "max"));

  public static final AiGatewayNullableMaxReasoningLevel NONE =
      new AiGatewayNullableMaxReasoningLevel("none");
  public static final AiGatewayNullableMaxReasoningLevel MINIMAL =
      new AiGatewayNullableMaxReasoningLevel("minimal");
  public static final AiGatewayNullableMaxReasoningLevel LOW =
      new AiGatewayNullableMaxReasoningLevel("low");
  public static final AiGatewayNullableMaxReasoningLevel MEDIUM =
      new AiGatewayNullableMaxReasoningLevel("medium");
  public static final AiGatewayNullableMaxReasoningLevel HIGH =
      new AiGatewayNullableMaxReasoningLevel("high");
  public static final AiGatewayNullableMaxReasoningLevel XHIGH =
      new AiGatewayNullableMaxReasoningLevel("xhigh");
  public static final AiGatewayNullableMaxReasoningLevel MAX =
      new AiGatewayNullableMaxReasoningLevel("max");

  AiGatewayNullableMaxReasoningLevel(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayNullableMaxReasoningLevelSerializer
      extends StdSerializer<AiGatewayNullableMaxReasoningLevel> {
    public AiGatewayNullableMaxReasoningLevelSerializer(
        Class<AiGatewayNullableMaxReasoningLevel> t) {
      super(t);
    }

    public AiGatewayNullableMaxReasoningLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayNullableMaxReasoningLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayNullableMaxReasoningLevel fromValue(String value) {
    return new AiGatewayNullableMaxReasoningLevel(value);
  }
}
