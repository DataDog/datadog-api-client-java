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

/** Data capture overrides resource type. */
@JsonSerialize(
    using =
        AiGatewayCaptureCreateRequestDataType.AiGatewayCaptureCreateRequestDataTypeSerializer.class)
public class AiGatewayCaptureCreateRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("data-capture-overrides"));

  public static final AiGatewayCaptureCreateRequestDataType DATA_CAPTURE_OVERRIDES =
      new AiGatewayCaptureCreateRequestDataType("data-capture-overrides");

  AiGatewayCaptureCreateRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureCreateRequestDataTypeSerializer
      extends StdSerializer<AiGatewayCaptureCreateRequestDataType> {
    public AiGatewayCaptureCreateRequestDataTypeSerializer(
        Class<AiGatewayCaptureCreateRequestDataType> t) {
      super(t);
    }

    public AiGatewayCaptureCreateRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureCreateRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureCreateRequestDataType fromValue(String value) {
    return new AiGatewayCaptureCreateRequestDataType(value);
  }
}
