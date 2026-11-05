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

/** Data capture configurations resource type. */
@JsonSerialize(
    using =
        AiGatewayCaptureConfigurationResponseDataType
            .AiGatewayCaptureConfigurationResponseDataTypeSerializer.class)
public class AiGatewayCaptureConfigurationResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("data-capture-configurations"));

  public static final AiGatewayCaptureConfigurationResponseDataType DATA_CAPTURE_CONFIGURATIONS =
      new AiGatewayCaptureConfigurationResponseDataType("data-capture-configurations");

  AiGatewayCaptureConfigurationResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureConfigurationResponseDataTypeSerializer
      extends StdSerializer<AiGatewayCaptureConfigurationResponseDataType> {
    public AiGatewayCaptureConfigurationResponseDataTypeSerializer(
        Class<AiGatewayCaptureConfigurationResponseDataType> t) {
      super(t);
    }

    public AiGatewayCaptureConfigurationResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureConfigurationResponseDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureConfigurationResponseDataType fromValue(String value) {
    return new AiGatewayCaptureConfigurationResponseDataType(value);
  }
}
